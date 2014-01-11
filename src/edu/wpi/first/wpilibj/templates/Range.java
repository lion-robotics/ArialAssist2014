/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates;

/**
 *
 * @author austin2
 */
public class Range
{

    double _min;
    double _max;

    public Range(double min, double max)
    {
        _min = min;
        _max = max;
    }

    public double min()
    {
        return _min;
    }

    public double max()
    {
        return _max;
    }

    public double range()
    {
        return _max - _min;
    }

    public double limit(double value)
    {
        if (value >= _max)
        {
            value = _max;
        } else if (value <= _min)
        {
            value = _min;
        }
        
        return value;
    }

    public double getRelativePos (double value)
    {
        return (value - _min) / range();        
    }
    
    /**
     * Takes decimal value from 0 to 1 and maps to range.
     *
     * @param perc
     */
    public double getValueRel(double perc)
    {
        return _max - (perc * range());
    }
}