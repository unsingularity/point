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

package automat;

import automat.screens.BillingScreen;
import automat.*;
import automat.screens.CustomerScreen;
import automat.screens.actions.*;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tttt
 */
public class TestCase {
    
    public static void execute() throws Exception{
        
       //handler
        CustomerScreen customerScreenHandler = CustomerScreen.getInstance();
        
        //uses the handler to enter and check basic screen info to assure it was displayed as expected
        customerScreenHandler.enter();
        customerScreenHandler.verifyScreen();
        
        //change customer due date;
        CustomerScreenActions.changeDueDate("05-05-2147");    
        
    }
    
}
