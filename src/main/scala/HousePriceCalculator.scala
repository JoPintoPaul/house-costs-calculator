import scala.io.StdIn.readLine

object HousePriceCalculator {

  def calculateSalePrice(): BigDecimal = {
    println("What is the sale price of the old house?")
    readPrice()
  }

  def calculatePurchasePrice(): BigDecimal = {
    println("What is the purchase price of the new house?")
    readPrice()
  }

  private def readPrice(): BigDecimal  = {
    readLine().toDoubleOption match {
      case Some(validPrice) =>
        BigDecimal(validPrice)
      case None =>
        println("Oh dear, that was not a valid number. Setting to zero.")
        BigDecimal(0)
    }
  }
}
