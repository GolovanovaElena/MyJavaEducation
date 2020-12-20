package com.mycompany.task2;

public class MyPolynomial {
    private double coeffs[];

    public MyPolynomial(double... coeffs) {
            this.coeffs = coeffs;

    }

    public int getDegree() {
        return (this.coeffs.length - 1);
    }

    public String toString() {
        String polynomial = "";
        if (this.coeffs.length == 1) {
            polynomial = polynomial + this.coeffs[0];
            return polynomial;
        }
        if (this.coeffs.length > 2) {
            polynomial = this.coeffs[coeffs.length - 1] + "x^" + (coeffs.length - 1) + "+";
            for (int i = this.coeffs.length - 2; i > 1; i--) {
                polynomial = polynomial + this.coeffs[i] + "x^" + (i - 1) + "+";
            }
        }
        polynomial = polynomial + this.coeffs[1] + "x" + "+" + this.coeffs[0];
        return polynomial;
    }

    public double evaluate (double x) {
        double result = 0;
        for (int i = 0; i < coeffs.length; i++)
            result = result + this.coeffs [i] * Math.pow (x, i);
        return result;
    }

    public MyPolynomial add(MyPolynomial right) {
        MyPolynomial result = new MyPolynomial(this.coeffs);
        for (int i=0; i<this.coeffs.length; i++)
            result.coeffs[i] = right.coeffs[i] + this.coeffs[i];
        return result;
 }

    public MyPolynomial multiply (MyPolynomial right) {
        double newCoeffs[] = new double [(this.coeffs.length+right.coeffs.length) -1];
        MyPolynomial result = new MyPolynomial(newCoeffs);
        for (int i = 0; i < this.coeffs.length; i++) {
            for ( int j = 0; j < right.coeffs.length; j++)
                result.coeffs[i+j] = result.coeffs[i+j] + this.coeffs[i] * right.coeffs[j];
        }
        return result;
    }

}
