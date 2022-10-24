package org.example;


import java.util.Comparator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class QuickSorterTest {

  LinkedListRealization<Integer> linkedList = new LinkedListRealization<>();
  Comparator<Integer> comparator;

  @BeforeEach
  void fillLinkedListWithIntegers() {
    linkedList.add(12);
    linkedList.add(1);
    linkedList.add(5);
    linkedList.add(5);
    linkedList.add(9);
    linkedList.add(4);
  }

  @Test
  void sort() {
    comparator = Integer::compareTo;
    QuickSorter<Integer> sorter = new QuickSorter<>();
    sorter.quicksort(linkedList, 0, linkedList.size() - 1, comparator);
    Assertions.assertEquals(1, linkedList.get(0));
    Assertions.assertEquals(4, linkedList.get(1));
    Assertions.assertEquals(5, linkedList.get(2));
    Assertions.assertEquals(5, linkedList.get(3));
    Assertions.assertEquals(9, linkedList.get(4));
    Assertions.assertEquals(12, linkedList.get(5));
  }
}