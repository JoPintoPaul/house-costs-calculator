object Main {
  def main(args: Array[String]): Unit = {
    println("Welcome to your housing costs calculator")

    val purchasePrice = HousePriceCalculator.calculatePurchasePrice()
    val salePrice = HousePriceCalculator.calculateSalePrice()

    val stampDuty = StampDutyCalculator.calculate(purchasePrice)
    val estateAgentSellingFee = EstateAgentFeeCalculator.calculate(salePrice)

//    val mortgageRequired

    println(s"Stamp duty is: £$stampDuty")
    println(s"Estate agent fee is: £$estateAgentSellingFee")
    println(s"You will need a mortgage of: £${purchasePrice - salePrice}")

    /* TODO
    Mortgage repayments - how many years? How many fixed? Fixed rate. Variable rate for remaining.
    Legal fees: £1500
    Mortgage adviser: £450
    Moving (from Bristol + Kingston): £1200
     */

  }
}


