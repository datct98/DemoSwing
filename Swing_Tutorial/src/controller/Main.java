/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import model.User;
import view.LoginView;

/**
 *
 * @author ASUS
 */
public class Main {
    public static List<User> users;
    public static User user;
    static{
        users = new ArrayList<>();
        user = new User("quang","123");
        user.setRole("teacher");
        users.add(user);
}
    
    public static void main(String[] args) {
        
        
        
    }
}


