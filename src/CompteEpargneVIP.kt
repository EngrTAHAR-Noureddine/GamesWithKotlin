class CompteEpargneVIP(override val solde: Double, override val numero: String)
        : CompteEpargne(solde,numero) {

    override fun calculerCommission():Int {
            return (0.2 * solde).toInt()
    }
}