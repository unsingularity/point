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
