package app.ridic.warsaw

/**
 * LPG fuel estimate only; excludes platform fees, tax, maintenance and insurance.
 */
object FuelCalculator {
    fun costPerKm(consumptionLitresPer100Km: Double, pricePerLitrePln: Double): Double {
        require(consumptionLitresPer100Km >= 0.0)
        require(pricePerLitrePln >= 0.0)
        return consumptionLitresPer100Km * pricePerLitrePln / 100.0
    }

    fun estimatedAfterFuel(
        offerGrossPln: Double,
        totalDistanceKm: Double,
        consumptionLitresPer100Km: Double = 7.0,
        pricePerLitrePln: Double = 3.90
    ): Double {
        require(offerGrossPln >= 0.0)
        require(totalDistanceKm >= 0.0)
        return offerGrossPln - totalDistanceKm * costPerKm(
            consumptionLitresPer100Km, pricePerLitrePln
        )
    }
}
