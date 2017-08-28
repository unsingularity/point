/* 
 * Copyright (C) 2017 tttt
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package automat.screens;

import java.util.ArrayList;
import java.util.Observable;

public abstract class ScreenHandler extends Observable implements IScreen {
    
    protected boolean isActive;
    protected String locator;
    protected boolean isPopulated;
    protected boolean isDataValid = false;
    protected static ArrayList<ScreenHandler> listOfScreensThatAffectsThisHandler = new ArrayList<>();  
    protected static ArrayList<ScreenHandler> listOfScreensAffectedByThisHandler = new ArrayList<>();

    public abstract void populate();

    public ScreenHandler register(ScreenHandler screenAffected) {
        listOfScreensAffectedByThisHandler.add(screenAffected);
        return this;
    }

    public void setIsUpdated(boolean isUpdated) {
        // ScreenHandler.isUpdated = isUpdated;
    }

    protected void notifyAffectedScreens() {
        for (ScreenHandler screen : listOfScreensAffectedByThisHandler) {
            screen.update();
        }
    }

    @Override
    public void update(Observable o, Object arg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void update() {
        isDataValid = false;
    }

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
