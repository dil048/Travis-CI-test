package edu.ucsd.cs110.temperature;
public class Celsius extends Temperature
{
    public Celsius(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        return this;
    }

    @Override
    public Temperature toFahrenheit() {
        float converted = ((this.getValue()*1.8f)+(32));
        Temperature temp = new Celsius(converted);
        return temp;
    }

    public String toString()
    {
        return "" + this.getValue() +" C";
    }
}