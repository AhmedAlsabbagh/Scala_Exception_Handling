import DemoBTrySuccessFailure.errorHandlingFunction

import scala.util.control.Exception.catching

object DemoCCatching {

  def main(args: Array[String]): Unit = {

    val catchExceptions = catching(classOf[ArithmeticException],classOf[ArrayIndexOutOfBoundsException]).withApply(e => println("Arithmetic Exception has occured " + e))
    //val catchExceptions = catching(classOf[ArithmeticException],classOf[ArrayIndexOutOfBoundsException]).withApply(e => errorHandlingFunction(e))
    // above line will call error HandlingFunction from DemoBTrySuccessFailure.scala

    val a = catchExceptions(10/0)

    if (a.!=()){
      println(a)
    }
  }

}
