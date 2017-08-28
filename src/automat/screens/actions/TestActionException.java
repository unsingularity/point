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

/**
 *
 * @author tttt
 */
public class TestActionException extends Exception {
    
    protected String failedActionDescription;
    
    public TestActionException(String msg){
        super(msg);
    }
    
    public TestActionException(String msg, String failedActionDescription){
       super(msg);
       this.failedActionDescription = "Failed to perform: " + failedActionDescription;         
    }

    
}
