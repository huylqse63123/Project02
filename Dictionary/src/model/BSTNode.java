package model;

import java.util.LinkedList;

/**
 *
 * Author Lê Huy | cwalklhuy@gmail | 01659680538
 * StudentID: SE63123 | Class: SE1276
 */
class BSTNode {
  protected String key;
  LinkedList<String> list = new LinkedList<>();
  BSTNode left;
  BSTNode righ;
  
  public BSTNode(String key, String trans, BSTNode left, BSTNode righ) {
    this.key = key;
    list.add(trans);
    this.left = left;
    this.righ = righ;
  }
  
  public BSTNode(String word, String trans) {
    this(word, trans, null, null);
  }
  
  @Override
  public String toString() {
    String s = key + " : ";
    return list.stream()
               .map(t -> (list.indexOf(t) > 0 ? ", " : "") + t)
               .reduce(s, String::concat);
  }
}
