package automat.screens;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tttt
 */
public class FictionalScreenC extends ScreenHandler {

    private static class InstanceHolder {

        private static final FictionalScreenC onDemandInstance = new FictionalScreenC();
    }

    public static FictionalScreenC getInstance() {
        return InstanceHolder.onDemandInstance;
    }

    @Override
    public void populate() {

    }

    @Override
    public boolean verifyScreen() {
        return false;
    }

    protected void setStateToDeprecated() {

    }

    @Override
    public void enter() {

    }

    @Override
    public void exit() {

    }

    @Override
    public boolean isUpdated() {
        return false;
    }

}
