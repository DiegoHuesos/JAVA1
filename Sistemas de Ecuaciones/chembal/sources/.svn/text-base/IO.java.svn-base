

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

import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.URL;
import java.net.URLEncoder;
import javax.swing.JOptionPane;

public class IO
{

    public IO()
    {
    }

    public static void say(String s)
    {
        JOptionPane.showMessageDialog(null, s, "Chemical Equation Balancer", -1);
    }

    public static void say(Object s)
    {
        JOptionPane.showMessageDialog(null, s.toString(), "Chemical Equation Balancer", -1);
    }

    public static void sayError(Exception e)
    {
        Object options[] = {
            "Ok", "Details"
        };
        int n = JOptionPane.showOptionDialog(null, e.getMessage(), "Chemical Equation Balancer", 0, 0, null, options, options[0]);
        ByteArrayOutputStream b = new ByteArrayOutputStream();
        PrintStream p = new PrintStream(b);
        e.printStackTrace(p);
        p.flush();
        b.toString();
        if(n == 1)
            JOptionPane.showMessageDialog(null, b.toString(), "Chemical Equation Balancer", 0);
    }

    public static boolean confirm(String s)
    {
        return JOptionPane.showConfirmDialog(null, s, "Chemical Equation Balancer", 0) == 0;
    }
}
