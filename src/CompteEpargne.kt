open class CompteEpargne(override val solde: Double, override val numero: String)
    : Compte(solde,numero) {

    override fun calculerCommission():Int {
        return (0.1 * solde).toInt()
    }
}