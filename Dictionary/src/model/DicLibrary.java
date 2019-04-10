package model;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Optional;

/**
 *
 * Author Lê Huy | cwalklhuy@gmail | 01659680538 StudentID: SE63123 | Class:
 * SE1276
 */
public class DicLibrary {

  BST bstEng = new BST();
  BST bstVn = new BST();
  private static final String BASE_ENG = "EngVN.txt";
  private static final String BASE_VN = "VnEng.txt";

  public void insertLineEnVn(String line) {
    int i = line.indexOf(":");
    String word = line.substring(0, i).trim().toLowerCase();
    String trans = line.substring(i + 1).trim();
    String words[] = trans.split(", ");
    Arrays.stream(words).forEach(w -> bstEng.insert(word, w));
  }

  public void insertLineVnEn(String line) {
    int i = line.indexOf(":");
    String word = line.substring(0, i).trim().toLowerCase();
    String trans = line.substring(i + 1).trim();
    String words[] = trans.split(", ");
    Arrays.stream(words).forEach(w -> bstVn.insert(word, w));
  }

  public void loadFile() throws IOException {
    // Load từ điển Tiếng Anh
    Files.lines(Paths.get(BASE_ENG))
            .forEach(line -> insertLineEnVn(line));
    //Load từ điển Tiếng Việt
    Files.lines(Paths.get(BASE_VN))
            .forEach(line -> insertLineVnEn(line));
  }
  
  public void insertTree(String lang, String left, String right) {
    BST tree = lang.equals("EN") ? bstEng : bstVn;
    tree.insert(left, right);
  }
  
  public void saveFile() throws IOException {
    //Chép qua file EngVN.txt
    try(PrintWriter pwe = new PrintWriter(new FileWriter(BASE_ENG));
        PrintWriter pwv = new PrintWriter(new FileWriter(BASE_VN))) {
        bstEng.Preoder(bstEng.root, pwe);
        bstVn.Preoder(bstVn.root, pwv);
    }
  }

  public String search(String lang, String word) {
    BST tree = lang.equals("EN") ? bstEng : bstVn;
    Optional<BSTNode> node = tree.search(word);
    return node.isPresent() ? node.get().toString() : null;
  }
}
