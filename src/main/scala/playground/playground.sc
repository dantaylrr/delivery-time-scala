/* Need to remember to declare values with val & explicit declaration of lists with List*/
val inputs = List("TShirt", "Trousers")

/* Python enumerate equivalent*/
for ((item, index) <- inputs.zipWithIndex) println(s"Index=${index} & Item=${item}.")

/* Lists in Scala should be immutable unlike Python, so we cannot add or modify them...
Instead we should add elements to a buffer & convert to a list at the end.
 */

import scala.collection.mutable.ListBuffer
var list_buf = new ListBuffer[String]()

/* We can now add elements to a buffer. */
list_buf += "Apple"
/* We can then create an immutable list out of our buffer. */
val list = list_buf.toList

println(list)