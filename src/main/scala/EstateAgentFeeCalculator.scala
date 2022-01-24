import scala.io.StdIn._

object EstateAgentFeeCalculator {
  def calculate(salePrice: BigDecimal): BigDecimal = {
    println("What is the estate agent percentage?")
    readLine().toDoubleOption match {
      case Some(validPercentage) => salePrice * BigDecimal(validPercentage / 100)
      case None =>
        println("Oh dear, that was not a valid number. Setting to zero.")
        BigDecimal(0)
    }
  }
}
