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
    Assertions.assertEquals(linkedList.size(), 3);

    Assertions.assertEquals(linkedList.get(0), 1);
    Assertions.assertEquals(linkedList.get(1), 2);
    Assertions.assertEquals(linkedList.get(2), 3);

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
    Assertions.assertEquals(linkedList.size(), 3);

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
    Assertions.assertEquals(iterator.next(), 1);
    Assertions.assertEquals(iterator.next(), 2);
    Assertions.assertEquals(iterator.next(), 3);
    assertFalse(iterator.hasNext());

  }

  @Test
  void toArray() {
    fillLinkedListWithIntegers();
    Object[] array = linkedList.toArray();
    Assertions.assertEquals(array[0], 1);
    Assertions.assertEquals(array[1], 2);
    Assertions.assertEquals(array[2], 3);

  }


  @Test
  void remove() { // removing by index
    fillLinkedListWithIntegers();
    linkedList.remove(0);
    Assertions.assertEquals(linkedList.get(0), 2);
    Assertions.assertEquals(linkedList.get(1), 3);
    linkedList.remove(0);
    Assertions.assertEquals(linkedList.get(0), 3);

  }
  @Test
  void removeObject() { // removing object
    fillLinkedListWithStrings();
    linkedListString.remove("First string");
    Assertions.assertEquals(linkedListString.get(0), "Second string");
    assertFalse(linkedListString.remove("No such string"));
  }

  @Test
  void addAll() { // Test without index
    ArrayList<Integer> arrayList = new ArrayList<>();
    arrayList.add(1);
    arrayList.add(2);
    linkedList.addAll(arrayList);
    Assertions.assertEquals(linkedList.get(0), 1);
    Assertions.assertEquals(linkedList.get(1), 2);

  }

  @Test
  void AddAllWithIndex() {
    fillLinkedListWithIntegers();
    ArrayList<Integer> arrayList = new ArrayList<>();
    arrayList.add(9);
    arrayList.add(10);
    linkedList.addAll(1, arrayList);
    Assertions.assertEquals(linkedList.get(0), 1);
    Assertions.assertEquals(linkedList.get(1), 9);
    Assertions.assertEquals(linkedList.get(2), 10);
    Assertions.assertEquals(linkedList.get(3), 2);
    Assertions.assertEquals(linkedList.get(4), 3);


  }

  @Test
  void clear() {
    fillLinkedListWithIntegers();
    Assertions.assertEquals(linkedList.size(), 3);
    linkedList.clear();
    Assertions.assertEquals(linkedList.size(), 0);

  }

  @Test
  void get() {
    fillLinkedListWithIntegers();
    Integer value = linkedList.get(0);
    Assertions.assertEquals(value, 1);

  }

  @Test
  void set() {
    fillLinkedListWithIntegers();
    linkedList.set(0,5);
    Assertions.assertEquals(linkedList.get(0), 5);

  }

  @Test
  void indexOf() {
    fillLinkedListWithStrings();
    Assertions.assertEquals(linkedListString.indexOf("Second string"), 1);
    Assertions.assertEquals(linkedListString.indexOf("Third string"), 2);
    Assertions.assertEquals(linkedListString.indexOf("No string"), -1);

  }

  @Test
  void lastIndexOf() {
    fillLinkedListWithRepeatedStrings();
    Assertions.assertEquals(linkedListString.lastIndexOf("Third string"), 5);
    Assertions.assertEquals(linkedListString.lastIndexOf("Second string"), 4);
    Assertions.assertEquals(linkedListString.lastIndexOf("No string"), -1);

  }


  @Test
  void subList() {
    fillLinkedListWithRepeatedStrings();
    List<String> list = linkedListString.subList(2,5);
    Assertions.assertEquals(list.size(), 4);
    Assertions.assertEquals(list.get(0), "Third string");
    Assertions.assertEquals(list.get(1), "Second string");

  }
}