

class CompteDevise(val taux:Double, override val solde: Double, override val numero: String) :
    Compte(solde,numero) {

    override fun calculerCommission():Int {
        return (0.2 * solde * taux).toInt()
    }

}