/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author capta
 */
public class LawOfCosinesSolver {
    
    public static void main(String args[]) {
        
        double a = 18;
        double b = 19;
        double c = 16;
        //double angleA = 100;
        
        // Solve for side
        //double answer = Math.sqrt((b*b) + (c*c) - (2*b*c*Math.cos(angleA*(Math.PI/180))));
        // Solve for angle
        double answer = Math.acos(((a*a) - ((b*b)+(c*c))) / (-2*b*c));
        
        // Solve for side
        //System.out.println(answer);
        // Solve for angle
        System.out.println(answer*(180/Math.PI));
    }
    
}
