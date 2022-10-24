package org.example;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Comparator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class QuickSorterTest {
  LinkedListRealization<Integer> linkedList = new LinkedListRealization<>();
  Comparator<Integer> comparator;


  void fillLinkedListWithIntegers(){
    linkedList.add(12);
    linkedList.add(1);
    linkedList.add(5);
    linkedList.add(5);
    linkedList.add(9);
    linkedList.add(4);
  }
  @Test
  void sort(){
    fillLinkedListWithIntegers();
    comparator = Integer::compareTo;
    QuickSorter<Integer> sorter = new QuickSorter<>();
    sorter.quicksort(linkedList, 0, linkedList.size() - 1, comparator);
    Assertions.assertEquals(linkedList.get(0), 1);
    Assertions.assertEquals(linkedList.get(1), 4);
    Assertions.assertEquals(linkedList.get(2), 5);
    Assertions.assertEquals(linkedList.get(3), 5);
    Assertions.assertEquals(linkedList.get(4), 9);
    Assertions.assertEquals(linkedList.get(5), 12);

  }
}