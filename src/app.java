/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author abg5406
 */
public class app
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        CourseName cn1,cn2,cn3,cn4,cn5,cn6;
        
        cn1 = new CourseName();
        cn2 = new CourseName("ds","111","n");
        cn3 = new CourseName("ist","1","honors");
        cn4 = new CourseName("abc","100","N");
        cn5 = new CourseName("SRA","20","");
        cn6 = new CourseName("Cyber","101","J");
        
        System.out.println(cn1.toString());
        System.out.println(cn2.toString());
        System.out.println(cn3.toString());
        System.out.println(cn4.toString());
        System.out.println(cn5.toString());
        System.out.println(cn6.toString());

    }
    
}
