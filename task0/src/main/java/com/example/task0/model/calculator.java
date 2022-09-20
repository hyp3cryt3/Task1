package com.example.task0.model;
public class calculator {

    private Double Number;

    private Double Percent;

    private Double Result;

    public double getNumber()
    {
        return Number;
    }
    public Double setNumber(Double Number)
    {
        this.Number = Number;
        return Number;
    }
    public double getPercent()
    {
        return Percent;
    }
    public double setPercent(Double Percent)
    {
        this.Percent = Percent;
        return Percent;
    }

    public Double calc(Double Number,Double Percent)
    {
        Result = (Number / 100) * Percent;
        return Result;
    }
}

