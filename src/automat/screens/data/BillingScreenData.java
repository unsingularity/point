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
public class BillingScreenData extends ScreenContents{

    protected String totalDueValue;
    protected String dueDateValue;
    protected String isPaidValue;    

    public String getTotalDueValue() {
        return totalDueValue;
    }

    public void setTotalDueValue(String totalDueValue) {
       // BillingScreenData.totalDueValue = totalDueValue;
    }

    public String getDueDateValue() {
        return dueDateValue;
    }

    public void setDueDateValue(String dueDateValue) {
      //  BillingScreenData.dueDateValue = dueDateValue;
    }

    public String getIsPaidValue() {
        return isPaidValue;
    }

    public void setIsPaidValue(String isPaidValue) {
      //  BillingScreenData.isPaidValue = isPaidValue;
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
