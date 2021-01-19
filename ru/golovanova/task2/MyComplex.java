package ru.golovanova.task2;

public class MyComplex {
    private double real = 0.0;
    private double imag = 0.0;

    public MyComplex() {}

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return this.real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return this.imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue (double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    @Override
    public String toString() {
        return '{' + real + imag + "i" +
                '}';
    }

    public boolean isReal() {
        if (this.real != 0.0)
            return true;
        else return false;
    }

    public boolean isImaginary() {
        if (this.imag != 0.0)
            return true;
        else return false;
    }

    public boolean equals(double real, double imag) {
        if ((this.real == real) && (this.imag==imag))
            return true;
        else return false;
    }

    public boolean equals (MyComplex another) {
        if ((this.real == another.real) && (this.imag == another.imag))
            return true;
        else return false;
    }

    public double magnitude() {
        return Math.sqrt(Math.pow(this.real,2)+Math.pow(this.imag,2));
    }

    public double argument() {
        return Math.atan(Math.tan(this.imag/this.real));
    }

    public MyComplex add(MyComplex right) {
        this.real = this.real + right.real;
        this.imag = this.imag + right. imag;
        return this;
    }

    public MyComplex addNew(MyComplex right) {
        MyComplex newSum = new MyComplex();
        newSum.real = this.real + right.real;
        newSum.imag = this.imag + right. imag;
        return newSum;
    }

    public MyComplex substract(MyComplex right) {
        this.real = this.real - right.real;
        this.imag = this.imag - right. imag;
        return this;
    }

    public MyComplex substractNew(MyComplex right) {
        MyComplex newSubstract = new MyComplex();
        newSubstract.real = this.real - right.real;
        newSubstract.imag = this.imag - right. imag;
        return newSubstract;
    }

    public MyComplex multiply (MyComplex right) {
        this.real = this.real * right.real - this.imag * right.imag;
        this.imag = this.real * right.imag + this.imag * right.real;
        return this;
    }

     public MyComplex divide (MyComplex right) {
        this.real = (this.real * right.real + this.imag * right.imag) / (Math.pow(this.real,2) + Math.pow(this.imag,2));
        this.real = (this.real * right.imag - this.imag * right.real) / (Math.pow(this.real,2) + Math.pow(this.imag,2));
        return this;
     }

     public MyComplex conjugate() {
        this.imag = -this.imag;
        return this;
     }
}
