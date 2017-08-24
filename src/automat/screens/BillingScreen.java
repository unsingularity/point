package automat.screens;

import automat.screens.data.BillingScreenData;
import automat.screens.data.ScreenContents;
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

    public void xuabps() {
        int i;
    }

}
