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

import automat.screens.data.CustomerScreenData;
import automat.screens.data.ScreenContents;
import automationTool.WPFButton;
import automationTool.WPFTextBox;
import java.util.ArrayList;
import java.util.List;
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
public class CustomerScreen extends ScreenHandler implements IScreen {
    
    /*
    *screen data object - ought to be handled by this class only
    */
    private CustomerScreenData customerScreenData;
    
    /*
    screen dependency mapping
     */
    ArrayList<ScreenHandler> listOfScreensThatAffectsThisHandler = new ArrayList<ScreenHandler>() {
        {
            add(BillingScreen.getInstance());
        }
    };
    /*
    *screens affected by handles on this screen
     */
 /*
    screen elements representation
     */
    private final WPFTextBox customerIdTextBox = new WPFTextBox("//WPFTextBox/[@name='name");
    private final WPFTextBox customerNameTextBox = new WPFTextBox("//WPFTextBox/[@name='total']");
    private final WPFTextBox customerStatusTextBox = new WPFTextBox("//WPFTextBox/[@name='total']");
    private final WPFTextBox customerAddressTextBox = new WPFTextBox("//WPFTextBox/[@name='total']");

    private final WPFButton openBillingScreenButton = new WPFButton("//WPFButton");
    private final WPFButton exitButton = new WPFButton("//WPFButton");

    private final WPFTextBox dateOfNextDueTextBox = new WPFTextBox("//WPFTextBox");
    private final WPFButton setdateOfNextDueButton = new WPFButton("//WPFButton");

    /*
    screen secure controllers   
    *
     */
    public void clickOnSetdateOfNextDueButton() {
        setdateOfNextDueButton.click();
        notifyAffectedScreens();
    }

    public void setdateOfNextDueTextBox(String newText) {
        dateOfNextDueTextBox.setText(newText);
        notifyAffectedScreens();
    }

    public void setCustomerAddressTextBoxTo(String newText) {
        customerAddressTextBox.setText(newText);
        notifyAffectedScreens();
    }
    

    @Override
    public boolean isUpdated() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /*
    screen singleton
     */
    private static class InstanceHolder {

        private static final CustomerScreen SINGLETON = new CustomerScreen();
    }
    
    /*
    * low performance
    */
    public static CustomerScreen getInstance() {
        listOfScreensAffectedByThisHandler = new ArrayList<ScreenHandler>() {
            {
                add(BillingScreen.getInstance().register(InstanceHolder.SINGLETON));
                add(FictionalScreenA.getInstance().register(InstanceHolder.SINGLETON));
                add(FictionalScreenC.getInstance().register(InstanceHolder.SINGLETON));
            }
        };
        return InstanceHolder.SINGLETON;
    }

    //public void setValueOfdateOfNextDueTextBox()
    @Override
    public boolean verifyScreen() {
        return customerIdTextBox.getText().equals("someId");
    }

    protected static void setStateToDeprecated() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
    public void enter() {
       //do stuff to enter screen
       populate();
    }

    @Override
    public void exit() {
        
    }

    @Override
    public void populate() {
        customerScreenData = CustomerScreenData.getUnsecureInstance();
        customerScreenData.setAddressValue(customerAddressTextBox.getText());
        customerScreenData.setNameValue(customerNameTextBox.getText());
        customerScreenData.setToValid();
    }



}
