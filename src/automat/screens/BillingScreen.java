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

import automat.screens.data.BillingScreenData;
import automat.screens.data.ScreenContents;
import automationTool.WPFButton;
import automationTool.WPFTextBox;
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
public class BillingScreen extends ScreenHandler implements IScreen{
    
    
    /**HANDLERS FOR ELEMENTS OF THIS SCREEN 
     */
    
    private WPFTextBox clientNameTextBox = new WPFTextBox("//WPFTextBox/[@name='name");
    private WPFTextBox totalDueTextBox = new WPFTextBox("//WPFTextBox/[@name='total']");
    private WPFButton totalAmountToPay = new WPFButton("//WPFButton");
    private WPFButton payBillButton = new WPFButton("//WPFButton");
    
    /**SINGLETON
     * 
     */
    private static class InstanceHolder {
        private static final BillingScreen SINGLETON = new BillingScreen();
    }
    
    public static BillingScreen getInstance() {
        return InstanceHolder.SINGLETON;
    }

    @Override
    public boolean verifyScreen() {
        return false;
    }

    public void setStateToDeprecated() {

    }

    @Override
    public void enter() {
        // 
    }

    @Override
    public void exit() {

    }

    @Override
    public void populate() {
        
    }

    @Override
    public boolean isUpdated() {
        return false;

    }

}
