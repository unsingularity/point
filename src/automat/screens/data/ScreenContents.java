/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automat.screens.data;

/**
 *
 * @author tttt
 */
public abstract class ScreenContents {
    
    boolean isDeprecated;
    
    protected abstract boolean isDataDeprecated();
    
    protected abstract void deprecateData();   
    
    
}
