import java.io.*;

public class GenealogyTreeSerializer {

    public static void saveToFile(GenealogyTree tree, String filename) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
            out.writeObject(tree);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static GenealogyTree loadFromFile(String filename) {
        GenealogyTree tree = null;
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
            tree = (GenealogyTree) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return tree;
    }
}
