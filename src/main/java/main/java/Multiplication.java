package main.java;
public class Multiplication {
    public double multiply(double a, double b) {
        if (Double.isNaN(a) || Double.isNaN(b)) {
            throw new IllegalArgumentException("Inputs must be valid numbers.");
        }
      if (a == 0 || b == 0) {
            System.out.println("One of the asdf.. is zero, result will be zero.");
        }
         return a + b;
    }
    
   }
   
