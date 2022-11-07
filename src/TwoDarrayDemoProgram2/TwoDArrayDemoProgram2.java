/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TwoDarrayDemoProgram2;

/**
 *
 * @author nayeem
 */
public class TwoDArrayDemoProgram2 {
    public static void main(String[] args)
    {
    int[][] MyArray= new int[3][3];
    MyArray[0][0]=1;
    MyArray[0][1]=2;
    MyArray[0][2]=3;
    
    MyArray[1][0]=5;
    MyArray[1][1]=6;
    MyArray[1][2]=7;
    
    MyArray[2][0]=8;
    MyArray[2][1]=9;
    MyArray[2][2]=5;
    
    //variable diclararion area
    int row,column;
   
    for(row=0;row<3;row++)
    {
    
        for(column=0;column<3;column++)
        {
        
        
        System.out.print(" "+MyArray[row][column]);
        
        
        }
        
        System.out.println();
    
    
    }
    
    
    }
    
}
