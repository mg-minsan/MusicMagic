/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musicmagic;

import static java.lang.System.out;
import java.util.ArrayList;
import java.util.Scanner;



/**
 *
 * @author xikanglee
 */
public class Customer {
    static ArrayList<Customer> customerList = new ArrayList();
    public String userName;
    public String userAddress;
    public String postcode;
    public String userPhone;
    public String userEmail;
    final Scanner myScanner = new Scanner(System.in);
    // quetsion for customer 
    private String personalQuestion[] = {
    "What is your name ?",
    "What is your address ? ",
    "Your postcode ?",
    "What is your phone number ?",
    "What is your email ?"
    
};
    public void askCustomer(){
        
        out.println(personalQuestion[0]);
        this.userName = myScanner.next();
        out.println(personalQuestion[1]);
        this.userAddress = myScanner.next();
        this.postcode = validateNum(personalQuestion[2]);
        this.userPhone = validateNum(personalQuestion[3]);
        out.println(personalQuestion[4]);
        this.userEmail = myScanner.next();
    }
    
    public void showAllCustomers(){
                    int count = customerList.size();
                    for(int i = 0; i < count; i++){
                    Customer customerInfo = customerList.get(i);
                    out.println();
                    out.println(i + ".");
                    out.println(customerInfo.userName);
                    out.println(customerInfo.userAddress);
                    out.println(customerInfo.postcode);
                    out.println(customerInfo.userPhone);
                    out.println(customerInfo.userEmail);
                    out.println("/////////////////////////");
                }
                  
    }
    
    public void deleteCustomer(){
        int questionNum = customerList.size() + 1;
        String question = "Which one do you want to delete ?";
        this.showAllCustomers();
        
        while (questionNum > customerList.size()){
            questionNum = Integer.parseInt(this.validateNum(question));
        }
        //convert into intger
        customerList.remove(questionNum);
        
        
    }
    
    private boolean isInteger(String s){
        try{
            Integer.parseInt(s);
        }catch(NumberFormatException e){
            return false;
        }
        return true;
    }
    
    private String validateNum(String questionName){
        String validatedVal = "";
        out.println(questionName);
       validatedVal = myScanner.next();
        while( isInteger(validatedVal) == false){
          out.println(questionName);
          validatedVal = myScanner.next();
          }
        return validatedVal;
    }
    
}
