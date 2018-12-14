
import org.junit.*;
import junit.framework.*;
import java.util.*;

import com.berkeleychurchill.chembal.*;

public class MainTest extends TestCase {


    public MainTest(String name)
    {
        super(name);
    }

    /* ** This is a template for testing 
       that an equation gets balanced
       properly.


       public void testEquation()
       {
       String equation = "";
       String expected = "";
       String output = Main.balance(equation);
       assertEquals(expected,output);
       }

     */

    @org.junit.Test
        public void testEquation1() throws InvalidUserInputException
        {
            String equation = "H2 + O2 = H2O";
            String expected = "2H2 + O2 --> 2H2O";
            String output = Main.balance(equation);
            assertEquals(expected,output);
        }

    @org.junit.Test
        public void testEquation2() throws InvalidUserInputException
        {
            String equation = "(NH4)2MoO4 + Na3PO4 + NH4NO3 --> NH3 + NaNO3 + H2O + (NH4)3P(Mo3O10)4";
            String expected = "12(NH4)2MoO4 + Na3PO4 + 3NH4NO3 --> 24NH3 + 3NaNO3 + 12H2O + (NH4)3P(Mo3O10)4";
            String output = Main.balance(equation);
            assertEquals(expected,output);
        }

    @org.junit.Test
        public void testEquation3() throws InvalidUserInputException
        {
            String equation = "Cu + HNO3 = Cu(NO3)2 + NO + H2O";
            String expected = "3Cu + 8HNO3 --> 3Cu(NO3)2 + 2NO + 4H2O";
            String output = Main.balance(equation);
            assertEquals(expected,output);
        }


    @org.junit.Test
        public void testEquation4() throws InvalidUserInputException
        {
            String equation = "Cu + HNO3 = Cu(NO3)2 + NO + H2O + H2O2";
            String expected = "3Cu + 8HNO3 --> 3Cu(NO3)2 + 2NO + 4H2O" +
                "\nCu + 4HNO3 --> Cu(NO3)2 + 2NO + 2H2O2";
            String output = Main.balance(equation);
            assertEquals(expected,output);
        }

    @org.junit.Test
        public void testEquation5() throws InvalidUserInputException
        {
            String equation = "H2O + H^ + Cl^- + MnO4^- + Cl2 + Mn^2";
            String expected = "8H2O + 5Cl2 + 2Mn^2 --> 16H^ + 10Cl^- + 2MnO4^-";
            String output = Main.balance(equation);
            assertEquals(expected,output);
        }

    @org.junit.Test
        public void testEquation6() throws InvalidUserInputException
        {
            String equation = "Na2CO3 + HCl + FeCl3 --> NaCl + Fe2O3 + CO2 + H2O";
            String expected = "3Na2CO3 + 2FeCl3 --> 6NaCl + Fe2O3 + 3CO2"
                + "\n6HCl + Fe2O3 --> 2FeCl3 + 3H2O";
            String output = Main.balance(equation);
            assertEquals(expected,output);
        }

    @org.junit.Test
        public void testBadInput0() throws InvalidUserInputException
        {
            String equation = "2H2 + O2 = 2H2O";
            try{    
                String output = Main.balance(equation);
                fail("No exception thrown!");
            }catch(InvalidUserInputException e)
            {

            }

        }

    @org.junit.Test
        public void testBadInput1() throws InvalidUserInputException
        {
            String equation = "This is invalid input.";
            try{
                String output = Main.balance(equation);
                fail("No exception thrown!");
            }catch(InvalidUserInputException e)
            {

            }
        }

    @org.junit.Test
        public void testBadInput2() throws InvalidUserInputException
        {
            String equation = "H2 + O2v = H2O";
            try{
                String output = Main.balance(equation);
                fail("No exception thrown!");
            }catch(InvalidUserInputException e)
            {

            }
        }
    @org.junit.Test
        public void testBadInput3() throws InvalidUserInputException
        {
            String equation = "H2 + vO2 = H2O";
            try{
                String output = Main.balance(equation);
                fail("No exception thrown!");
            }catch(InvalidUserInputException e)
            {

            }
        }

    @org.junit.Test
        public void testBadInput4() throws InvalidUserInputException
        {
            String equation = "H2 + V2 = H2O";
            try{
                String output = Main.balance(equation);
                fail("No exception thrown!");
            }catch(InvalidUserInputException e)
            {

            }
        }

    @org.junit.Test
        public void testBadInput5() throws InvalidUserInputException
        {
            String equation = "H2 + o2 = H2O";
            try{
                String output = Main.balance(equation);
                fail("No exception thrown!");
            }catch(InvalidUserInputException e)
            {

            }
        }

    @org.junit.Test
        public void testBadInput6() throws InvalidUserInputException
        {
            String equation = "H-O2 = H + O";
            try{
                String output = Main.balance(equation);
                fail("No exception thrown!");
            }catch(InvalidUserInputException e)
            {

            }
        }

    @org.junit.Test
        public void testBadInput7() throws InvalidUserInputException
        {
            String equation = "HO-2 = H + O";
            try{
                String output = Main.balance(equation);
                fail("No exception thrown!");
            }catch(InvalidUserInputException e)
            {

            }
        }

    @org.junit.Test
        public void testBadInput8() throws InvalidUserInputException
        {
            String equation = "H(2)O = H + O";
            try{
                String output = Main.balance(equation);
                fail("No exception thrown!");
            }catch(InvalidUserInputException e)
            {

            }
        }

    @org.junit.Test
        public void testBadInput9() throws InvalidUserInputException
        {
            String equation = "H2.1O = H + O";
            try{
                String output = Main.balance(equation);
                fail("No exception thrown!");
            }catch(InvalidUserInputException e)
            {

            }
        }


}



