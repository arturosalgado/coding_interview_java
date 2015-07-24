/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programminginterview;

/**
 *
 * @author arturo
 */
public class SquareRoot {
    
    static double sqrt(double val)
    {
        double precission = 0.001;
        double start = 0;
        double end = val;
        // check0, check 1 , check < 0 , check < 1, end = 1;
        while(end-start>precission)
        {
            double mid = (start+end)/2;
            double val2 = mid*mid;
            if (val2 == val) return mid;
            if (val2<val)
                start = mid;
            else
                end= mid;
        }
        return (start+end)/2;
    }        
    
}
