/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import controller.ManagerSolving;
import view.Menu;
/**
 *
 * @author huynh
 */
public class Main {
      public static void main(String[] args) {
        String title= "";
        String[] s= new String[] {"Calculate Superlative Equaiton","Calculate Quadratic Equation", "Exit"};
        Menu<String> menu= new ManagerSolving(title, s);
        menu.run();
    }
}
