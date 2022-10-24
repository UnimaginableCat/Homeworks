package org.example;

import java.util.Comparator;
import java.util.List;

public class QuickSorter<T> {

  public void quicksort(List<T> array, int startIndex, int endIndex, Comparator<T> comparator) {
    // need to check overlapping
    if (startIndex < endIndex) {

      int pivotIndex = partition(array, startIndex, endIndex, comparator);
      // sorting left array
      quicksort(array, startIndex, pivotIndex, comparator);
      // sorting right array
      quicksort(array, pivotIndex + 1, endIndex, comparator);
    }
  }

  private int partition(List<T> array, int startIndex, int endIndex, Comparator<T> comparator) {
    int pivotIndex = (startIndex + endIndex) / 2;
    T pivotValue = array.get(pivotIndex);
    startIndex--;
    endIndex++;

    while (true) {
      // incrementing until find currentValue that is higher than pivotValue
      int res = 0;
      do {
        startIndex++;
        T currentValue = array.get(startIndex);
        res = comparator.compare(currentValue, pivotValue);
      } while (res < 0);
      // Deincrementing until find currentValue that is smaller than pivotValue

      do {
        endIndex--;
        T currentValue = array.get(endIndex);

        res = comparator.compare(currentValue, pivotValue);
      } while (res > 0);

      if (startIndex >= endIndex) {
        return endIndex;
      }

      // swap values at the startIndex and endIndex
      T temp = array.get(startIndex);
      array.set(startIndex, array.get(endIndex));
      array.set(endIndex, temp);
    }
  }

}
