/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package github2.pkg0;

import java.util.Scanner;

/**
 *
 * @author cjpar
 */
public class Github20 {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
            Scanner kb = new Scanner(System.in);
            boolean pstFrstLetter = false;
            char theChar;
        for(int y= 5; y>0; y--){
            pstFrstLetter=false;
            int letters=0;
            System.out.println("Enter a phrase for a wordcount:");
            String phrase = kb.nextLine();
            
            for(int x = 0; x < phrase.length();x++){
                theChar=phrase.charAt(x);
            if(!pstFrstLetter && Character.isLetter(theChar))
                pstFrstLetter=true;
            if(pstFrstLetter){
                if(x==phrase.length()-1 && Character.isLetter(phrase.charAt(phrase.length()-1)))
                    letters++;
                else if(!(Character.isLetter(theChar)))
                    letters++;
            }
            }
        System.out.println(letters + " Words Found. ");
        }               
        }  
}