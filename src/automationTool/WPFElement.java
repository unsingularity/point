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
package automationTool;

public class WPFElement {
    protected String locator;
    protected String text;
    protected MemoryAddressHook hook;    
    
    public WPFElement(String locator){
        this.locator = locator;
        hook = MemoryElementFinder.findElement(locator);
    }
    
    public void setText(String text){
        //fake actions to set text - should be performed by aut tool
        this.text = text;        
    } 
    
    public void click(){
        
    }

}
