/* 'package Xcode;' is code automatically injected if I create a 
java file within a folder that's in another folder. 
leaving this line of code brakes the program. 
I deleted it and ran fine, will find out more about this later
*/

public class Sample {
  private int num1;
  private int num2;

  // constructor. Order of the folling doesn't matter
  public Sample(int num1, int num2) {
    this.num1 = num1;
    this.num2 = num2;
  }

  // getters: no parameters here, this merely call it up
  public int getNum1() {
    return this.num1;
  }
  public int getNum2() {
    return this.num2;
  }

  // setters: set parameters here
  public void setNum1(int num1) {
    this.num1 = num1;
  }
  public void setNum2(int num2) {
    this.num2 = num2;
  }

} // class
