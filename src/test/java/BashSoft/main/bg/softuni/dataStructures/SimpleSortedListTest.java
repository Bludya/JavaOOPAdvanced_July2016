package BashSoft.main.bg.softuni.dataStructures;

import BashSoft.main.bg.softuni.contracts.SimpleOrderedBag;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by bludya on 8/7/16.
 * All rights reserved!
 */
public class SimpleSortedListTest {
    private SimpleOrderedBag<String> names;

    @Before
    public void setUp() {
        this.names = new SimpleSortedList<>(String.class);
    }

    @Test
    public void testEmptyCtor() {
        this.names = new SimpleSortedList<String>(String.class);
        Assert.assertEquals(16, this.names.capacity());
        Assert.assertEquals(0, this.names.size());
    }

    @Test
    public void testCtorWithinInitialCapacity() {
        this.names = new SimpleSortedList<String>(String.class, 16);
        Assert.assertEquals(16, this.names.capacity());
        Assert.assertEquals(0, this.names.size());
    }

    @Test
    public void testCtorWithinInitialComparer() {
        this.names = new SimpleSortedList<String>(
                String.class,
                String.CASE_INSENSITIVE_ORDER);
        Assert.assertEquals(16, this.names.capacity());
        Assert.assertEquals(0, this.names.size());
    }

    @Test
    public void testCtorWithinAllParams() {
        this.names = new SimpleSortedList<String>(
                String.class,
                String.CASE_INSENSITIVE_ORDER,
                30);
        Assert.assertEquals(30, this.names.capacity());
        Assert.assertEquals(0, this.names.size());
    }

    @Test
    public void testAddIncreasesSize() {
        this.names = new SimpleSortedList<>(String.class);
        this.names.add("Nasko");
        Assert.assertEquals(1, this.names.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddNullThrowsException() {
        this.names.add(null);
    }

    @Test
    public void testAddUnsortedDataIsHeldSorted() {

        this.names.addAll(Arrays.asList("Rosen", "Georgi", "Balkan"));

        //Arrange
        String expected = "Balkan,Georgi,Rosen";

        //Act
        String actual = this.names.joinWith(",");

        //Assert
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testAddingMoreThanInitialCapacity() {
        for (int i = 0; i < 17; i++) {
            this.names.add("name");
        }
        //Arrange
        int expectedSize = 17;
        int expectedCapacity = 16; //not 16

        //Act
        int actualSize = this.names.size();
        int actualCapacity = this.names.capacity();

        //Assert
        Assert.assertEquals(expectedSize, actualSize);
        Assert.assertNotEquals(expectedCapacity, actualCapacity);
    }

    @Test
    public void testAddingAllFromCollectionIncreasesSize() {
        List<String> list = new ArrayList<>();
        list.add("egaerg");
        list.add("egaerg");
        this.names.addAll(list);

        //Arrange
        int expectedSize = 2;
        //Act
        int actualSize = this.names.size();
        //Assert
        Assert.assertEquals(expectedSize, actualSize);

    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddingAllFromNullThrowsException() {
        names.addAll(null);
    }

    @Test
    public void testAddAllKeepsSorted() {
        List<String> list = new ArrayList<>();
        list.add("Valio");
        list.add("Anichka");
        list.add("Boiko");
        this.names.addAll(list);

        //Arrange
        String expected = "Anichka,Boiko,Valio";
        //Act
        String actual = "";
        for (String name : this.names) {
            actual += name + ",";
        }
        actual = actual.substring(0, actual.length() - 1);

        //Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemoveValidElementDecreasesSize() {
        this.names.add("Tedi");
        this.names.remove("Tedi");
        //Arrange
        int expected = 0;
        //Act
        int actual = this.names.size();
        //Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemoveValidElementRemovesSelectedOne() {
        this.names.add("Ivan");
        this.names.add("Nasko");
        this.names.remove("Ivan");

        //Arrange
        String expected = "Nasko";
        //Act
        String actual = "";
        for (String name : this.names) {
            actual += name + ",";
        }
        actual = actual.substring(0, actual.length() - 1);
        //Assert
        Assert.assertEquals(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemovingNullThrowsException() {
        this.names.remove(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testJoinWithNull() {
        this.names.add("Tedi");
        this.names.add("Valkata");
        this.names.joinWith(null);
    }

    @Test
    public void testJoinWorksFine() {
        this.names.addAll(Arrays.asList("Rosen", "Georgi", "Balkan"));

        //Arrange
        String expected = "Balkan,Georgi,Rosen";

        //Act
        String actual = this.names.joinWith(",");

        //Assert
        Assert.assertEquals(expected, actual);
    }

}