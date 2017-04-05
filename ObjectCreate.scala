package com.chandan.training

import sun.applet.Main

class ObjectCreate (val cx : Int, val cy : Int) {
   var x : Int = cx;
   var y : Int = cy;
   def moveVal(dx : Int, dy : Int){
       x = x + dx;
       y = y + dy;
       System.out.println("Value of x is " + x);
       System.out.println("Value of y is " + y);
   }   
}
object CreateObj{
  def main(args:Array[String]){
      val obj = new ObjectCreate(10,20);
      obj.moveVal(10,10);
  }
}
      