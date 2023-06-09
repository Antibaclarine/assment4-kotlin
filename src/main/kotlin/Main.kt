import java.util.Random

fun main() {
pass("clarine")
multiple()
    var currentAccount=CurrentAccount(522522,"Mercy",4000.0)
    currentAccount.details()
    currentAccount.withdraw(500.0)
    currentAccount.deposit(500.0)
    var savingsAccount=SavingsAccount(22000,"Mary",3000.0,1000)
    savingsAccount.withdraw(400.0)
}
//Write and invoke one function that takes in a random string and returns the
//following values: first character, last character, length of the string and
//whether it begins with a vowel or not. (6pts)

fun random(word:String):Char {
    var vowel = "a,e,i,o,u,A,E,I,O,U"
    for (i in word) {
        if (word == word) {
            println(word.length)
        } else if (word <= word) {
            println(word.length - 1)
        }

//       if (i==vowel){
//return vowel
//       }

    }

}
//Create a function that takes in a password as a parameter. For a password to
//be valid it must meet the following conditions:
//1. Must be at least 8 characters long
//2. Must be at most 16 characters long
//3. Must not be “password”
//4. Must contain a digit
//Your function should determine whether the password provided is valid or not.
//The function returns true/false (7pts)
fun pass(password:String):Boolean{
    if (password.length==8 && password.length<=16 && password !="password"){
        return true
    }
    else{
        return false
    }
}
//Create a function that prints out multiples of 6 and 8 between 1 and 1000. For
//multiples of both 6 and 8 it should print out “Bingo!” (5pts)
fun multiple(){
    for (i in 1..1000){
        if (i%6==0 && i%8==0){
          println("Bingo!")
        }
    }
}
//4. Create a class CurrentAccount with the following attributes: account number,
//account name, balance. It has the following functions:
//a. deposit(amount: Double) - Increments the balance by the amount
//deposited
//b. withdraw(amount: Double) - Decrements the balance by the amount
//withdrawn
//c. details() - Prints out the account number and balance and name in
//this format: “Account number x with balance y is operated by z” (6pts)

open class CurrentAccount(var accountNumber:Int,var accountName:String,var balance:Double){
    fun deposit(amount:Double){
        var balance=0
        balance =+1
        println(balance)
    }
    open fun withdraw(amount: Double){
        var balance=0
        balance =-1
        println(balance)
    }
    fun details(){
        println("${accountNumber}  with  $balance  is operated by z")
    }
}
//Create another class SavingsAccount. It has the same functions and
//attributes as the current account except for one attribute, withdrawals: Int.
//Withdrawals is a counter variable that is used to keep track of how many
//withdrawals have been made from the account in a year. The only other
//difference is that the savings account withdraw() method first checks if the
//number of withdrawals is less than 4 for it to allow one to withdraw money
//from the account. It also increments the withdrawals attribute after a
//successful withdrawal (6pts)

class SavingsAccount( accountNumber:Int,accountName:String,balance:Double,var withdrawals:Int):CurrentAccount(accountNumber,accountName,balance){
    override fun withdraw(amount: Double) {
        withdraw(amount)
        if (amount<4){
            println(amount)
        }
    }
}