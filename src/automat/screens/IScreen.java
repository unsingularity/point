/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automat.screens;

/**
 *
 * @author tttt
 */
public interface IScreen {
      
    void enter();
    void exit();;    
    boolean verifyScreen();  
    boolean isUpdated();
   
}
