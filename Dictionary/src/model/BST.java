package model;

import java.io.PrintWriter;
import java.util.Optional;

/**
 *
 * Author Lê Huy | cwalklhuy@gmail | 01659680538
 * StudentID: SE63123 | Class: SE1276
 */
class BST {
  protected BSTNode root = null;
  
  void insert(String word, String trans) {
    BSTNode p, t;
    String e = word.toLowerCase();
    for (p = null, t = root; t != null;) {
      p = t;
      String tt = t.key.toLowerCase();
      if (e.compareTo(tt) < 0) {
        t = t.left;
      } else if (e.compareTo(tt) > 0) {
        t = t.righ;
      } else {  // doubling
        t.list.add(trans);
        return;
      }
    }
    if (p == null) {
      root = new BSTNode(word, trans);
    } else if (word.compareTo(p.key) < 0) {
      p.left = new BSTNode(word, trans);
    } else {
      p.righ = new BSTNode(word, trans);
    }
  }
  
  public Optional<BSTNode> search(String eng) {
    BSTNode p = root;
    while (p != null) {
      if (eng.compareTo(p.key) == 0)
        return Optional.ofNullable(p);
      p = (eng.compareTo(p.key) < 0) ? p.left : p.righ;
    }
    return Optional.empty();
  }
  
  void  Preoder(BSTNode p, final PrintWriter pw) {
    if (p != null) {
      pw.println(p.toString());
      Preoder(p.left, pw);
      Preoder(p.righ, pw);
    }
  }
}
