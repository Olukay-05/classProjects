package tddClass;


import myList.ArrayList;
import myList.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class ArrayListTest {

    List guitarStrings;
    @BeforeEach
    public void setUp(){
        guitarStrings = new ArrayList();
    }

    @Test
    public void newListEmptyTest(){
        List guitarStrings = new ArrayList();
        assertTrue(guitarStrings.isEmpty());
    }

    @Test
    public void addItemListIsNotEmptyTest(){
        List guitarStrings = new ArrayList();
        guitarStrings.add("G-String");
        assertFalse(guitarStrings.isEmpty());
    }

    @Test
    public void addItemListIsNotEmptyTest_SizeIsOneTest(){
        List guitarStrings = new ArrayList();
        guitarStrings.add("G-String");
        assertFalse(guitarStrings.isEmpty());
        assertEquals(1, guitarStrings.size());
    }

    @Test
    public void addItemGetItemByIndexTest(){
        guitarStrings.add("A-String");
        String savedItem = guitarStrings.get(0);
        assertEquals("A-String",savedItem);
    }

    @Test
    public  void addXYGetXYTest(){
        guitarStrings.add("A-String");
        guitarStrings.add("G-String");
        assertEquals("A-String", guitarStrings.get(0));
        assertEquals("G-String",guitarStrings.get(1));
    }

    @Test
    public  void addXYRemoveYSizeIsOneTest(){
        guitarStrings.add("A-String");
        guitarStrings.add("G-String");
        guitarStrings.remove(1);
        assertEquals(1, guitarStrings.size());
        String deletedItem = guitarStrings.get(1);
        assertNull(deletedItem);
    }
}
