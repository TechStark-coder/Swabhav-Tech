package com.monocept.basic;

public class ThisPointer {
  int x;

  // Constructor with a parameter
  public ThisPointer(int x) {
    this.x = x;
  }

  // Calling constructor
  public static void main(String[] args) {
    ThisPointer myObj = new ThisPointer(50);
    System.out.println("Value of x = " + myObj.x);
  }
}