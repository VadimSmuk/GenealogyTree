public class GenealogyTreePresenter {
    private final GenealogyTreeView view;
    GenealogyTree genealogyTree;

    public GenealogyTreePresenter(GenealogyTreeView view) {
        this.view = view;
        this.genealogyTree = new GenealogyTree();
    }

    public void addPerson(Person person) {
        genealogyTree.addPerson(person);
    }

    public void loadGenealogyTree(String filename) {
        this.genealogyTree = GenealogyTreeSerializer.loadFromFile(filename);
    }

    public void displaySortedData() {
        view.displaySortedByName(genealogyTree.getSortedByName());
        view.displaySortedByBirthDate(genealogyTree.getSortedByBirthDate());
    }
}
