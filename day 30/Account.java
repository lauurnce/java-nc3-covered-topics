/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joysistvi.abstractionactivity.day28;

/**
 *
 * @author Admin
 */
public abstract class Account {
    
    public String accountNumber;
    public String accountHolder;
    public double balance;
    
    public abstract void displayAccountInfo();
}
