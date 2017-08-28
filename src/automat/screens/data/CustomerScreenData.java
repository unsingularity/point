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
public class CustomerScreenData extends ScreenContents {

    // protected boolean dataValidity = false; 
    protected String customerId;
    protected String customerStatus;
    protected String dateOfNextDue;
    protected String addressValue;
    protected String nameValue;
    protected String zipCodeValue;
    protected static boolean isDataValid = false;

    private static class InstanceHolder {

        private static final CustomerScreenData SINGLETON = new CustomerScreenData();
    }

    /*
    * low performance
     */
    public static CustomerScreenData getInstance() throws Exception {
        if (isDataValid) {
            return InstanceHolder.SINGLETON;
        } else {
            throw new Exception("Cannot assure data is valid");
        }
    }

    /*
    data validity not assured on this getter
    */
    public static CustomerScreenData getUnsecureInstance()  {
        return InstanceHolder.SINGLETON;
    }
    
    public void setToValid(){
        this.isDataValid = true;
    }

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

}
