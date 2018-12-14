
import org.junit.*;
import junit.framework.*;
import java.util.*;

import com.berkeleychurchill.chembal.*;

public class ChemicalParserTest extends TestCase {

    HashCounter tally;


    class HashCounter
    {
        Hashtable<String,Integer> table;

        public HashCounter()
        {
            table = new Hashtable<String,Integer>();
        }

        public void add(String s, int count)
        {
            if(table.containsKey(s))
            {
                int current = table.get(s);
                table.put(s,current+count);
            }else
                table.put(s,count);
        }

        public boolean equals(HashCounter h)
        {
            if(!h.table.keySet().equals(table.keySet()))
            {
                return false;
            }

            for(String s : table.keySet())
                if(!table.get(s).equals(h.table.get(s)))
                    return false;
            
            return true;
        }

        public ChemicalParser.ElementCallback getHandler()
        {
            return new ChemicalParser.ElementCallback(){
                public void handleElement(String s, int n)
                {
                    add(s,n);
                }
            };
        }

        @Override
        public String toString()
        {
            String s = "";
            for(String t : table.keySet())
            {
                s += t + " : " + table.get(t) + "\n";
            }
            return s;
        }

    }

    public ChemicalParserTest(String name)
    {
        super(name);
    }


    @Before
        public void setUp()
        {
            tally = new HashCounter();
        }

    @org.junit.Test
    public void testParsing1() throws InvalidUserInputException
    {
        String species = "H2O";
        ChemicalParser.parseChemical(species,tally.getHandler());
        
        HashCounter mine = new HashCounter();
        mine.add("H",2);
        mine.add("O",1);

        assertTrue(mine.equals(tally));
    }

    @org.junit.Test
    public void testParsing2() throws InvalidUserInputException
    {
        String species = "(H2O)3(XY3)4H^-";
        ChemicalParser.parseChemical(species,tally.getHandler());
        
        HashCounter mine = new HashCounter();
        mine.add("H",7);
        mine.add("O",3);
        mine.add("X",4);
        mine.add("Y",12);
        mine.add("^",-1);

        assertTrue(mine.equals(tally));
    }

    @org.junit.Test
    public void testParsing3() throws InvalidUserInputException
    {
        String species = "(AB2(BA)3A)2BBAA";
        ChemicalParser.parseChemical(species,tally.getHandler());
        
        HashCounter mine = new HashCounter();
        mine.add("A",12);
        mine.add("B",12);

        assertTrue(mine.equals(tally));
    }

    @org.junit.Test 
    public void testParsing4() throws InvalidUserInputException
    {
        String species = "X17";
        ChemicalParser.parseChemical(species,tally.getHandler());
        
        HashCounter mine = new HashCounter();
        mine.add("X",17);

        assertTrue(mine.equals(tally));
    }

    @org.junit.Test
    public void testParsing5() throws InvalidUserInputException
    {
        String species = "(XX(X2)3X)5XX7(X11(X)13)X17(XX)19";
        ChemicalParser.parseChemical(species,tally.getHandler());
        
        HashCounter mine = new HashCounter();
        mine.add("X",132);

        assertTrue(mine.equals(tally));
    }


}


 
