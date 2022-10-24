package org.example;

import java.util.*;

public class LinkedListRealization<T> implements List<T> {

  private Node<T> head;


  private static class Node<T> {

    private T data; // Data that node holds
    private Node<T> nextNode; // Link to next node
    private Node<T> previousNode; // Link to previous node

    public Node(T data) {
      this.data = data;
      this.nextNode = null;
      this.previousNode = null;
    }

    /**
     * Returns value of a node
     *
     * @return value of type T
     */
    public T getValue() {
      return data;
    }

    /**
     * Sets node value
     *
     * @param value Value of type T
     */
    public void setValue(T value) {
      data = value;
    }

    public void setNextNode(Node<T> node) {
      node.previousNode = this;
      nextNode = node;
    }
  }

  private class MyIterator implements Iterator<T> {

    private int currentIndex = 0;

    @Override
    public boolean hasNext() {
      return currentIndex < size();
    }

    @Override
    public T next() {
      return get(currentIndex++);
    }
  }

  LinkedListRealization() {
    head = null;
  }

  @Override
  public int size() {
    if (head != null) {
      Node<T> currentNode = this.head;
      int count = 1;
      while (currentNode.nextNode != null) {
        currentNode = currentNode.nextNode;
        count++;
      }
      return count;
    } else {
      return 0;
    }
  }

  @Override
  public boolean isEmpty() {
    return size() == 0;
  }

  @Override
  public boolean contains(Object o) {
    if (!isEmpty()) {
      Iterator<T> iterator = iterator();
      while (iterator.hasNext()) {
        if (iterator.next().equals(o)) {
          return true;
        }
      }
    }
    return false;
  }

  @Override
  public Iterator<T> iterator() {
    return new MyIterator();
  }

  @Override
  public Object[] toArray() {
    Object[] array = new Object[size()];

    if (isEmpty()) {
      return array;
    }

    Iterator<T> iterator = iterator();
    int i = 0;
    while (iterator.hasNext()) {
      array[i] = iterator.next();
      i++;
    }

    return array;
  }

  @Override
  public <T1> T1[] toArray(T1[] a) {
    // not implemented
    return null;
  }

  @Override
  public boolean add(T data) {
    Node<T> newNode = new Node<>(data);

    if (!isEmpty()) { // if array is not empty
      Node<T> lastNode = getNode(size() - 1); // getting last node
      lastNode.setNextNode(newNode);
    } else { // if array is empty just adding newNode as a head
      this.head = newNode;
    }
    return true;
  }


  private boolean checkIndex(int index) {
    return index >= 0 && index < size();
  }

  /**
   * Returns Node at given index
   *
   * @param index Index of Node
   * @return Node of type T
   */
  private Node<T> getNode(int index) {
    Node<T> currentNode = this.head; // getting first node
    int currentIndex = 0;
    while (currentNode.nextNode != null) { // searching for the last node in array
      if (index == currentIndex) {
        return currentNode;
      }
      currentNode = currentNode.nextNode;
      currentIndex++;
    }
    return currentNode; // returns last node
  }


  @Override
  public T remove(int index) {
    if (checkIndex(index)) {
      if (size() == 1) {
        T value = head.getValue();
        clear();
        return value;
      }
      if (index == 0) {
        Node<T> node = getNode(index);
        T value = node.getValue();
        head = node.nextNode;
        return value;
      }
      Node<T> node = getNode(index);
      T value = node.getValue();
      Node<T> previousNode = node.previousNode;
      previousNode.setNextNode(node.nextNode);
      return value;
    } else {
      throw new IndexOutOfBoundsException();
    }
  }

  @Override
  public boolean remove(Object o) {
    if (!isEmpty()) {
      int index = indexOf(o);
      if (index != -1) {
        remove(index);
        return true;
      }
    }
    return false;
  }

  @Override
  public boolean containsAll(Collection<?> collection) {
    // Not implemented
    return false;
  }

  @Override
  public boolean addAll(Collection<? extends T> collection) {
    if (collection.isEmpty()) {
      return false;
    }
    for (T item : collection) {
      add(item);
    }
    return true;
  }

  @Override
  public boolean addAll(int index, Collection<? extends T> collection) {
    if (collection.isEmpty()) {
      return false;
    }
    if (checkIndex(index)) {
      for (T item : collection) {
        add(index, item);
        index++;
      }
      return true;
    } else {
      throw new IndexOutOfBoundsException();
    }
  }

  @Override
  public boolean removeAll(Collection<?> c) {
    // Not implemented
    return false;
  }

  @Override
  public boolean retainAll(Collection<?> c) {
    // Not implemented
    return false;
  }

  @Override
  public void clear() {
    head = null;
  }

  @Override
  public T get(int index) {
    if (checkIndex(index)) {
      Node<T> node = getNode(index);
      return node.getValue();
    } else {
      throw new IndexOutOfBoundsException();
    }
  }

  @Override
  public T set(int index, T element) {
    if (checkIndex(index)) {
      Node<T> node = getNode(index);
      node.setValue(element);
      return node.getValue();
    } else {
      throw new IndexOutOfBoundsException();
    }
  }

  @Override
  public void add(int index, T element) {
    if (checkIndex(index)) {
      Node<T> node = getNode(index);
      Node<T> newNode = new Node<>(element);
      Node<T> previousNode = node.previousNode;
      newNode.setNextNode(node);
      previousNode.setNextNode(newNode);
    } else {
      throw new IndexOutOfBoundsException();
    }
  }


  @Override
  public int indexOf(Object o) {
    Iterator<T> iterator = iterator();
    int index = 0;
    while (iterator.hasNext()) {
      if (iterator.next().equals(o)) {
        return index;
      }
      index++;
    }
    return -1;
  }

  @Override
  public int lastIndexOf(Object o) {
    Iterator<T> iterator = iterator();
    int i = 0;
    int lastIndex = 0;
    boolean found = false;
    while (iterator.hasNext()) {
      if (iterator.next().equals(o)) {
        found = true;
        lastIndex = i;
      }
      i++;
    }
    if (found) {
      return lastIndex;
    }
    return -1;
  }

  @Override
  public ListIterator<T> listIterator() {
    // Not implemented
    return null;
  }

  @Override
  public ListIterator<T> listIterator(int index) {
    // Not implemented
    return null;
  }

  @Override
  public List<T> subList(int from, int to) {
    if (from < 0 || to > size() ) {
      throw new IndexOutOfBoundsException();
    }
    if (from > to) {
      throw new IllegalArgumentException();
    }
    LinkedListRealization<T> list = new LinkedListRealization<>();
    for (int i = from; i <= to; i++) {
      list.add(get(i));
    }
    return list;
  }
}
