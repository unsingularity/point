
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
    
    protected String field1;
    protected String field2;
    protected String field3;    
   

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
    
     public String getField1() {
        return field1;
    }

    public void setField1(String field1) {
        this.field1 = field1;
    }

    public String getField2() {
        return field2;
    }

    public void setField2(String field2) {
        this.field2 = field2;
    }

    public String getField3() {
        return field3;
    }

    public void setField3(String field3) {
        this.field3 = field3;
    }
   

  
    
}
