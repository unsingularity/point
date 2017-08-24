package automat.screens;


import java.util.ArrayList;
import java.util.Observable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tttt
 */
public abstract class Screen implements java.util.Observer{
    protected static boolean isActive;
    protected static String locator;
    protected static boolean isPopulated;
    protected ArrayList<Screen> affectedByList;
    protected Object a;
    private Object b;  
  
   

    public static boolean isIsPopulated() {
        return isPopulated;
    }

    protected static void setIsPopulated(boolean isPopulated) {
        Screen.isPopulated = isPopulated;
    }
    
    protected abstract void populate();
    private static int accessCounter;
    
    public abstract void access ();

    public static boolean isIsActive() {
        return isActive;
    }

    protected static void setIsActive(boolean aIsActive) {
        isActive = aIsActive;
    }

    public static String getLocator() {
        return locator;
    }

    public static void setLocator(String aLocator) {
        locator = aLocator;
    }

    public static int getAccessCounter() {
        return accessCounter;
    }

    protected static void setAccessCounter(int aAccessCounter) {
        accessCounter = aAccessCounter;
    }   

    @Override
    public void update(Observable o, Object arg) {
       
    }
   

  
    
}
