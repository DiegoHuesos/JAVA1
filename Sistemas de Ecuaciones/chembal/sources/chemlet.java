

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

public class chemlet extends Applet
    implements ActionListener
{

    public chemlet()
    {
        ok = new JButton("Balance");
        result = new JList();
    }

    @Override
    public void init()
    {
        setSize(600, 180);
        setLayout(new BoxLayout(this, 1));
        data.setAlignmentX(0.5F);
        add(data);
        ok.setAlignmentX(0.5F);
        add(ok);
        JScrollPane listScroller = new JScrollPane(result);
        listScroller.setPreferredSize(new Dimension(250, 120));
        add(listScroller);
    }

    @Override
    public void start()
    {
        ok.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e)
    {
        String s = "";
        String t = "";
        
        
        chEquation newEqu;
        try
        {
            s = data.getText();
            
            if(s.equals("SayVersion")){
                IO.say("Chembal Version 1.0");
                return;
            }          
            
            newEqu = new chEquation(s);
            int solns[][] = newEqu.Balance();
            String answ[] = new String[solns[0].length];
            for(int i = 0; i < solns[0].length; i++)
            {
                answ[i] = "<html>";
                for(int j = 0; j < solns.length; j++)
                {
                    if(solns[j][i] <= 0)
                        continue;
                    if(solns[j][i] != 1)
                        answ[i] = answ[i] + solns[j][i] + newEqu.getItem(j).getHTMLSymbol() + " + ";
                    else
                        answ[i] = answ[i] + newEqu.getItem(j).getHTMLSymbol() + " + ";
                }

                answ[i] = answ[i].substring(0, answ[i].length() - 3);
                answ[i] = answ[i] + " &rarr; ";    //will be made \u2192 later
                
                
                for(int j = 0; j < solns.length; j++)
                {
                    if(solns[j][i] >= 0)
                        continue;
                    if(solns[j][i] != -1)
                        answ[i] = answ[i] + solns[j][i] * -1 + newEqu.getItem(j).getHTMLSymbol() + " + ";
                    else
                        answ[i] = answ[i] + newEqu.getItem(j).getHTMLSymbol() + " + ";
                }

                t+= answ[i].substring(6, answ[i].length() - 3) + "<br>";
                answ[i] = answ[i].substring(0, answ[i].length() - 3);
                answ[i] = answ[i].replaceFirst("&rarr;","\u2192");
                
                
                answ[i] += "</html>";
            }

            result.setListData(answ);
     
            //IO.sendData(s,t);           //report data to server
            
        }
        catch(Exception e2)
        {
            IO.sayError(e2);
        }
    }

    JButton ok;
    public static JTextField data = new JTextField(40);
    JList result;

}
