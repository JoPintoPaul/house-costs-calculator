import scala.io.StdIn.readLine

object MortgageRepaymentCalculator {

  def calculate(amountRequired: BigDecimal): Unit = {
    println("What is the overall term of the mortgage in years?")
    val yearsTotal = readBigDecimal()

    println("What is the fixed term of the mortgage in years?")
    val yearsAtFixed = readBigDecimal()

    println("What is the fixed rate of the mortgage as percentage?")
    val percentageFixed = readBigDecimal()

    println("What is the variable rate of the mortgage as percentage?")
    val percentageVariable = readBigDecimal()

    println(s"Your repayments for the first $yearsAtFixed are ${calculateFixedRate(percentageFixed, amountRequired, yearsTotal)}")
  }

  private def calculateFixedRate(rate: BigDecimal, amount: BigDecimal, years: BigDecimal) = {
    val capital = amount / (12 * years)
    val interest = (amount * (rate / 100)) / 12
    capital + interest
  }

  private def readBigDecimal(): BigDecimal  = {
    readLine().toDoubleOption match {
      case Some(validDouble) =>
        BigDecimal(validDouble)
      case None =>
        println("Oh dear, that was not a valid number. Setting to zero.")
        BigDecimal(0)
    }
  }
}
