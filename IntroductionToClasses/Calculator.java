/* This is a program to do basic math operations*/

public class Calculator {
  public Calculator() {
    
  }

  public int add(int a, int b) {
    return a + b;
  }

  public int substract(int a, int b) {
    return a - b;
  } 

  public int multiply(int a, int b) {
    return a*b;
  }

  public double divide(int a, int b) {
    return a/b;
  }

  public int modulo(int a, int b) {
    return a%b;
  }

  public static void main(String[] args) {
    Calculator myCalculator = new Calculator(); 
    System.out.println(myCalculator.add(5,7));
    System.out.println(myCalculator.substract(45,11));
    System.out.println(myCalculator.multiply(3,2));
  
  }
}
