package org.example;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LinkedListRealizationTest {

  LinkedListRealization<Integer> linkedList = new LinkedListRealization<>();
  LinkedListRealization<String> linkedListString = new LinkedListRealization<>();

  @Test
  void add() {
    fillLinkedListWithIntegers();
    Assertions.assertEquals(3, linkedList.size());

    Assertions.assertEquals(1, linkedList.get(0));
    Assertions.assertEquals(2, linkedList.get(1));
    Assertions.assertEquals(3, linkedList.get(2));

  }
  void fillLinkedListWithIntegers(){
    linkedList.add(1);
    linkedList.add(2);
    linkedList.add(3);
  }


  void fillLinkedListWithStrings(){
    linkedListString.add("First string");
    linkedListString.add("Second string");
    linkedListString.add("Third string");

  }
  void fillLinkedListWithRepeatedStrings(){
    linkedListString.add("First string");
    linkedListString.add("Second string");
    linkedListString.add("Third string");
    linkedListString.add("Second string");
    linkedListString.add("Second string");
    linkedListString.add("Third string");
    linkedListString.add("First string");


  }
  @Test
  void size() {
    fillLinkedListWithIntegers();
    Assertions.assertEquals(3, linkedList.size());

  }

  @Test
  void isEmpty() {
    assertTrue(linkedList.isEmpty());
    fillLinkedListWithIntegers();
    assertFalse(linkedList.isEmpty());
  }

  @Test
  void contains() {
    fillLinkedListWithIntegers();
    assertTrue(linkedList.contains(3));
    assertFalse(linkedList.contains(35));

  }

  @Test
  void iterator() {
    fillLinkedListWithIntegers();
    Iterator<Integer> iterator = linkedList.iterator();
    Assertions.assertEquals(1, iterator.next());
    Assertions.assertEquals(2, iterator.next());
    Assertions.assertEquals(3, iterator.next());
    assertFalse(iterator.hasNext());

  }

  @Test
  void toArray() {
    fillLinkedListWithIntegers();
    Object[] array = linkedList.toArray();
    Assertions.assertEquals(1, array[0]);
    Assertions.assertEquals(2, array[1]);
    Assertions.assertEquals(3, array[2]);

  }


  @Test
  void remove() { // removing by index
    fillLinkedListWithIntegers();
    linkedList.remove(0);
    Assertions.assertEquals(2, linkedList.get(0));
    Assertions.assertEquals(3, linkedList.get(1));
    linkedList.remove(0);
    Assertions.assertEquals(3, linkedList.get(0));

  }
  @Test
  void removeObject() { // removing object
    fillLinkedListWithStrings();
    linkedListString.remove("First string");
    Assertions.assertEquals("Second string", linkedListString.get(0));
    assertFalse(linkedListString.remove("No such string"));
  }

  @Test
  void addAll() { // Test without index
    ArrayList<Integer> arrayList = new ArrayList<>();
    arrayList.add(1);
    arrayList.add(2);
    linkedList.addAll(arrayList);
    Assertions.assertEquals(1, linkedList.get(0));
    Assertions.assertEquals(2, linkedList.get(1));

  }

  @Test
  void addAllWithIndex() {
    fillLinkedListWithIntegers();
    ArrayList<Integer> arrayList = new ArrayList<>();
    arrayList.add(9);
    arrayList.add(10);
    linkedList.addAll(1, arrayList);
    Assertions.assertEquals(1, linkedList.get(0));
    Assertions.assertEquals(9, linkedList.get(1));
    Assertions.assertEquals(10,linkedList.get(2));
    Assertions.assertEquals(2, linkedList.get(3));
    Assertions.assertEquals(3, linkedList.get(4));


  }

  @Test
  void clear() {
    fillLinkedListWithIntegers();
    Assertions.assertEquals(3, linkedList.size());
    linkedList.clear();
    Assertions.assertEquals(0, linkedList.size());

  }

  @Test
  void get() {
    fillLinkedListWithIntegers();
    Integer value = linkedList.get(0);
    Assertions.assertEquals(1, value);

  }

  @Test
  void set() {
    fillLinkedListWithIntegers();
    linkedList.set(0,5);
    Assertions.assertEquals(5, linkedList.get(0));

  }

  @Test
  void indexOf() {
    fillLinkedListWithStrings();
    Assertions.assertEquals(1, linkedListString.indexOf("Second string"));
    Assertions.assertEquals(2, linkedListString.indexOf("Third string"));
    Assertions.assertEquals(-1, linkedListString.indexOf("No string"));

  }

  @Test
  void lastIndexOf() {
    fillLinkedListWithRepeatedStrings();
    Assertions.assertEquals(5, linkedListString.lastIndexOf("Third string"));
    Assertions.assertEquals(4,linkedListString.lastIndexOf("Second string"));
    Assertions.assertEquals(-1, linkedListString.lastIndexOf("No string"));

  }


  @Test
  void subList() {
    fillLinkedListWithRepeatedStrings();
    List<String> list = linkedListString.subList(2,5);
    Assertions.assertEquals(4, list.size());
    Assertions.assertEquals( "Third string", list.get(0));
    Assertions.assertEquals( "Second string", list.get(1));

  }
}