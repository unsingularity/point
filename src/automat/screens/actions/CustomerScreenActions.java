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
package automat.screens.actions;

import automat.screens.CustomerScreen;

/**
 *
 * @author tttt
 */
public class CustomerScreenActions {

    private final static CustomerScreen screenHandler = CustomerScreen.getInstance();
    private static String actionDescription = "";

    public void enterScreen() {
        screenHandler.enter();
    }

    public static void closeScreen() {
        screenHandler.exit();
    }

    public static void changeDueDate(String dueToBeSet) throws TestActionException {
        try {
            actionDescription = "Change next due date value and click Ok";
            screenHandler.setdateOfNextDueTextBox("NEVER WANT TO PAY THIS");
            screenHandler.clickOnSetdateOfNextDueButton();
            screenHandler.verifyScreen();

        }catch(Exception e){
            throw new TestActionException(e.getMessage(), actionDescription);                        
        }
    }

}
