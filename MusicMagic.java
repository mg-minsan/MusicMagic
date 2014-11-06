/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musicmagic;
import static java.lang.System.out;
import java.util.Scanner;
import musicmagic.Customer;
import musicmagic.Stock;
import musicmagic.Owner;
import java.util.*;




/**
 *
 * @author xikanglee
 */
public class MusicMagic {
    

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
    
        int respone = 0;
        MusicMagic musicMagic = new MusicMagic();
        musicMagic.setUp();
        
        while (respone != 5){
        Menu myMenu = new Menu();
        respone= myMenu.askMenu();
        Customer customer = new Customer();
        
        
            switch(respone){
                case 1:
                    customer.askCustomer();
                    Customer.customerList.add(customer);
                    break;
                case 2:
                    customer.showAllCustomers();
                    break;
                case 3:
                    customer.deleteCustomer();
                    break;
                    
                case 4:
                    System.exit(0);
            }
        }
    
      
    }
    
    public void setUp(){
        Customer customer1 = new Customer();
        customer1.userName = "Daenerys Targaryen";
        customer1.userAddress = "Duty street";
        customer1.postcode = "13212";
        customer1.userPhone = "094243241132";
        customer1.userEmail = "dragon@gmail.com";
        Customer.customerList.add(customer1);
        
        Customer customer2 = new Customer();
        customer2.userName = "Tyrion Lannister";
        customer2.userAddress = "City Mall street";
        customer2.postcode = "132";
        customer2.userPhone = "0942432322";
        customer2.userEmail = "cityHall@gmail.com";
        Customer.customerList.add(customer2);
        
       Customer customer3 = new Customer();
       customer3.userName = "Arya Stark";
       customer3.userAddress = "Hutown street";
       customer3.postcode = "132123";
       customer3.userPhone = "09232432322";
       customer3.userEmail = "hutown@gmail.com";
       Customer.customerList.add(customer3); 
        
        
    }
  


    }
