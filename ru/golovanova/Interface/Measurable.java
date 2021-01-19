package ru.golovanova.Interface;

public interface Measurable {
    public double getMeasure();
    public double average(Measurable[] objects);
    public Measurable largest(Measurable[] objects);
}
