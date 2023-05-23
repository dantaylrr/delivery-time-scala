case class Delivery(lists: List[String] = List.empty[String]) {
  def calculate_delivery_time(input: List[String]): List[String] = {
    lists ::: input
  }
}

object Main extends App {
  val time = Delivery(List("Test1"))
  println(time)
}