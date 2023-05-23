package com.dt.delivery

import utils.Time

case class Delivery(inputs: List[String] = List.empty[String]) {

  def calculateOrderNumbers(): List[Int] = {
    val orderNumbers = List.empty[Int]
    orderNumbers ::: List.range(1, inputs.length + 1)
  }

  def calculateDeliveryTime(orderNumbers: List[Int]): List[Double] = {
    val timeObject = Time()
    val packagingTime = timeObject.packaging
    val carryingTime = timeObject.carrying
    val postageTime = timeObject.posting

    val result = orderNumbers.map(order => (order * packagingTime) + (order * carryingTime) + postageTime)
    result
  }
}

object Main extends App {
  val test = Delivery(List("TShirt", "Trousers"))
  val testing_output = test.calculateDeliveryTime(test.calculateOrderNumbers())
  println(testing_output)
}
