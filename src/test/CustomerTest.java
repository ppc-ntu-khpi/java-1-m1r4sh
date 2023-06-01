/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;
import domain.Customer;
/**
 *
 * @author pavlu
 */
public class CustomerTest {
    public static void main(String[] args){
        Customer customer = new Customer();
        customer.displayCustomerInfo();
        customer.setID(8);
        customer.setIsNew(true);
        customer.setTotal(1200.2F);
        customer.displayCustomerInfo();
    }
}
