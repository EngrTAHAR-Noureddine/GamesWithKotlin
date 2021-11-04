abstract class Compte(open val solde:Double, open val numero:String) {


    abstract fun calculerCommission() :Int
}