/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.randomnumbergusseer;
import java.util.Random;
import javax.swing.JOptionPane;
/**
 *
 * @author Student
 */
public class RandomNumberGusseer {

    public static void main(String[] args) {
      Random obj = new Random();
      
      int SecreteNumber = obj.nextInt (100)+1 ;
      int UserGuess =0;
      int Attemptes = 0;
      int Max =4 ;
      
      while (UserGuess != SecreteNumber && Attemptes < Max){ 
       UserGuess = Integer.parseInt(JOptionPane.showInputDialog("hi guess a number between 1 and 100,within :"
               +Attemptes+ " ,good luck"));
       
        Attemptes ++;
        if (UserGuess > SecreteNumber) {
        JOptionPane.showMessageDialog(null, "your guess is too high");
        }else if (UserGuess < SecreteNumber) {
        JOptionPane.showMessageDialog(null, "your guess is too low");
      }else{
            JOptionPane.showMessageDialog(null, "Congrats you won");
        }
      }
         if(UserGuess > Max ) {
         JOptionPane.showMessageDialog(null, "Max attemptes reached, the SecreteNumber was : "+SecreteNumber );
         }   
         
     
    }
}
