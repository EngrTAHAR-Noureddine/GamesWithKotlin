

var score = 0

fun guessWord(number:Int, listOFWords:List<String>){
    println("\nEntrez un mot de longueur $number  : ")
    var wordInput = readLine()!!
    wordInput = wordInput.lowercase()


    if(wordInput.length==number){
        val generateListWords : List<String>
        generateListWords = listOFWords.filter { it.length==number }.toMutableList()
        val word = generateListWords.random()
        if (wordInput == word) {
            score+=5
            println("Bravo !!!! Vous avez obtenu 5 points, le\n" +
                    "score total est : $score points")
        }else println("Echec !!!! le score total est : $score points")
    }
}

fun Exercise_One(){
    println("Exercice 01 : ")

    val listOFWords = listOf("hi", "Hello","home","cat","dog","a","door","do")
    val number = (1..4).random()
    println("Bonjour Monsieur")

    /*for (i in (1..3))*/
    guessWord(number,listOFWords)

}
fun Exercise_Two(){
    println("Exercice 02 : ")


    val listOfCompte = listOf(
        CompteEpargne(12.0,"Compte1"),
        CompteDevise(12.0,23.0,"Compte2"),
        CompteEpargneVIP(30.0,"Compte3"))

    var commissionTotal = 0
    for (item in listOfCompte){
        commissionTotal += item.calculerCommission()
    }
    println("La commission total est : $commissionTotal")


}

fun main(){
    Exercise_One()
    Exercise_Two()

}