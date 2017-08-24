package automat.screens.data;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tttt
 */
public class CustomerScreenData extends ScreenContents{

    protected String addressValue;
    protected String nameValue;
    protected String zipCodeValue;    

    public String getAddressValue() {
        return addressValue;
    }

    public void setAddressValue(String addressValue) {
        this.addressValue = addressValue;
    }

    public String getNameValue() {
        return nameValue;
    }

    public void setNameValue(String nameValue) {
        this.nameValue = nameValue;
    }

    public String getZipCodeValue() {
        return zipCodeValue;
    }

    public void setZipCodeValue(String zipCodeValue) {
        this.zipCodeValue = zipCodeValue;
    }

    @Override
    protected boolean isDataDeprecated() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void deprecateData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
