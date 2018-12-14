

/****************************************************************************
 *     chembal: A Chemical Equation Balancer                                *
 *     Copyright (C) 2005-2010  Berkeley Churchill                          *
 *                                                                          *
 *    This program is free software: you can redistribute it and/or modify  *
 *    it under the terms of the GNU General Public License as published by  *
 *    the Free Software Foundation, either version 3 of the License, or     *
 *    (at your option) any later version.                                   *
 *                                                                          *
 *    This program is distributed in the hope that it will be useful,       *
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of        *
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the         *
 *    GNU General Public License for more details.                          *
 *                                                                          *
 *    You should have received a copy of the GNU General Public License     *
 *    along with this program.  If not, see <http://www.gnu.org/licenses/>. *
 ****************************************************************************/

package com.berkeleychurchill.chembal;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Main
{

    public static String balance(String s) throws InvalidUserInputException
    {
        s = s.replaceAll("=",":");
        s = s.replaceAll("-->",":");
        s = s.replaceAll("->",":");
        int solns[][];
        chEquation newEqu;

        newEqu = new chEquation(s);
        solns = newEqu.Balance();
        //this can throw an error
        //it's to be caught by an error hander
        //in the function that calls this

        String output = "";
        String answ[] = new String[solns[0].length];
        for(int i = 0; i < solns[0].length; i++)
        {
            answ[i] = "";
            for(int j = 0; j < solns.length; j++)
            {
                if(solns[j][i] <= 0)
                    continue;
                if(solns[j][i] != 1)
                    answ[i] = answ[i] + solns[j][i] + newEqu.getItem(j).getSymbol() + " + ";
                else
                    answ[i] = answ[i] + newEqu.getItem(j).getSymbol() + " + ";
            }

            answ[i] = answ[i].substring(0, answ[i].length() - 3);
            answ[i] = answ[i] + " --> ";    //will be made \u2192 later


            for(int j = 0; j < solns.length; j++)
            {
                if(solns[j][i] >= 0)
                    continue;
                if(solns[j][i] != -1)
                    answ[i] = answ[i] + solns[j][i] * -1 + newEqu.getItem(j).getSymbol() + " + ";
                else
                    answ[i] = answ[i] + newEqu.getItem(j).getSymbol() + " + ";
            }

            answ[i] = answ[i].substring(0, answ[i].length() - 3);
            output += answ[i];
            output += "\n";

        }
        return output.substring(0,output.length()-1);
    }

    public static void main(String[] args)
    {
        if(args.length != 1)
        {
            System.out.println("Usage: java -jar chembal <equation to balance>");
            System.out.println("Note that you will either need to put quotes around the equation, or do a lot of escaping");
            System.out.println("Example of proper equation syntax:");
            System.out.println("H2 + O2 = H2O");
            return;
        }

        String s = args[0];

        try{
            String output = balance(s);
            if(output != null)
                System.out.println(output);
        }catch(InvalidUserInputException e)
        {
            System.err.println(e.getMessage());
        }
        catch(Exception e)
        {
            System.err.println("An unexpected error occurred.");
            System.err.println("Please contact the developer, and provide the following information.");
            e.printStackTrace();
        }

    }
}
