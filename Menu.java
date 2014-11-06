/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musicmagic;

import static java.lang.System.out;
import java.util.Scanner;
import musicmagic.Customer;


/**
 *
 * @author xikanglee
 */
public class Menu {
  
    
    // for asking people data
   
    private String menuQuestion[] = {
     "1. adding customers",
     "2. Show all customers",
     "3. deleting customers",
     "4. deleting customers"
     };
    
   
   
    
    
    public int askMenu(){
        int responeNum = 0;
        boolean dataValidate = false;
       for (String question : menuQuestion) {
           out.println(question);
         }
       
        while (dataValidate == false){
            try{
               Scanner MenuScanner = new Scanner(System.in);
               
               responeNum = MenuScanner.nextByte();
               if(responeNum <= menuQuestion.length ){
                   dataValidate = true;
               }else{
                 out.println("invalid command !Try again.");
                 dataValidate = false;
               }
            }catch(Exception e){
               out.println("invalid command !Try again.");
               dataValidate = false;
            }
        }
        
        return responeNum;
    }
    
    
    
    
    
}
