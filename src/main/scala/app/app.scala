package com.dt.delivery

import utils.Time

case class Delivery(inputs: List[String] = List.empty[String]) {

  def calculateOrderNumbers(): List[Int] = {
    val orderNumbers = List.empty[Int]
    orderNumbers ::: List.range(1, inputs.length + 1)
  }

  def calculateDeliveryTime(orderNumbers: List[Int]): List[Int] = {
    val timeObject = Time()
    val packagingTime = timeObject.packaging
    val carryingTime = timeObject.carrying
    val postageTime = timeObject.posting

    import math.ceil
    val result = orderNumbers.map(order => ((order * packagingTime) + (order * carryingTime) + postageTime).ceil.toInt)
    result
  }

  def returnDeliveryTimes(deliveryTimes: List[Int]): Unit = {
    for ((deliveryTime, index) <- deliveryTimes.zipWithIndex) {
      println(s"Item $index has delivery time of: $deliveryTime days")
    }
  }
}

object Main extends App {
  val deliveryClass = Delivery(List("TShirt", "Trousers"))
  val deliveryTimes = deliveryClass.calculateDeliveryTime(deliveryClass.calculateOrderNumbers())
  val printDeliveryTimes = deliveryClass.returnDeliveryTimes(deliveryTimes)
}
