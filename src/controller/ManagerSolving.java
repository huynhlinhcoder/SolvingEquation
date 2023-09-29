/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.SolvingEquation;
import view.Menu;

/**
 *
 * @author huynh
 */
public class ManagerSolving extends Menu<String>{
    
    SolvingEquation Abl= new SolvingEquation();
    
    public ManagerSolving(String title, String[] s){
        super(title, s);        
    }
    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                Abl.calculateEqution();
                break;
            case 2:
                Abl.calculateQuadraticEquation();
                break;
            case 3:
                System.exit(0);
            
        }
    }
    
}

