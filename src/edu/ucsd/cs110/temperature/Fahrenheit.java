package edu.ucsd.cs110.temperature;
public class Fahrenheit extends Temperature
{
    public Fahrenheit(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        float f  = this.getValue();
        float converted = (f-32)/(9.0f/5);
        Temperature temp = new Celsius(converted);

        return temp;
    }

    @Override
    public Temperature toFahrenheit() {

        return this;
    }

    public String toString()
    {
        return ""+this.getValue() + " F";
    }
}