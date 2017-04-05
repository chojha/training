package com.chandan.training

object VariablesDecl {
  def main(args: Array[String]){
    println("Declare variables and")
    var (myVar1, myVar2) = Pair("Chandan", 10)
    val myVal = 10
    //val myVal : String = "Ruchi"
    System.out.println(myVar1 + "\n" + myVar2 + "\n" + myVal)
}
}