package automat.screens;


import java.util.ArrayList;

public abstract class ScreenHandler implements IScreen  {
    protected static boolean isActive;
    protected static String locator;
    protected static boolean isPopulated;
    protected static boolean isUpdated;
    protected ArrayList<ScreenHandler> affectedByList;
    protected ScreenHandler instance;

    public static boolean isIsUpdated() {
        return isUpdated;
    }

    public static void setIsUpdated(boolean isUpdated) {
        ScreenHandler.isUpdated = isUpdated;
    }
    
    protected ScreenHandler(){
       
    } 
    
    public abstract void populate();

    public static boolean isIsPopulated() {
        return isPopulated;
    }

    protected static void setIsPopulated(boolean isPopulated) {
        ScreenHandler.isPopulated = isPopulated;
    }
    
    private static int accessCounter;    

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

   

  
    
}
