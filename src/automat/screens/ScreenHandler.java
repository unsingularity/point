package automat.screens;


import java.util.ArrayList;

public abstract class ScreenHandler implements IScreen  {
    protected boolean isActive;
    protected String locator;
    protected boolean isPopulated;
    protected boolean isUpdated;
    protected ArrayList<ScreenHandler> affectedByList;
    protected ScreenHandler instance;
    
    protected ScreenHandler(){
       
    } 

    public boolean isIsUpdated() {
        return isUpdated;
    }

    public void setIsUpdated(boolean isUpdated) {
       // ScreenHandler.isUpdated = isUpdated;
    }
    

    
    public abstract void populate();

    public boolean isIsPopulated() {
        return isPopulated;
    }

    protected void setIsPopulated(boolean isPopulated) {
      //  ScreenHandler.isPopulated = isPopulated;
    }
    
    private static int accessCounter;    

    public boolean isIsActive() {
        return isActive;
    }

    protected void setIsActive(boolean aIsActive) {
        isActive = aIsActive;
    }

    public String getLocator() {
        return locator;
    }

    public void setLocator(String aLocator) {
        locator = aLocator;
    }

    public int getAccessCounter() {
        return accessCounter;
    }

    protected void setAccessCounter(int aAccessCounter) {
        accessCounter = aAccessCounter;
    }

   

  
    
}
