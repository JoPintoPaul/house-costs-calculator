object StampDutyCalculator {

  def calculate(purchasePrice: BigDecimal): BigDecimal = {
    val atTwoPercent = 125000.0 * 0.02
    val atFivePercent = (purchasePrice - 250000) * 0.05
    atTwoPercent + atFivePercent
  }
}
