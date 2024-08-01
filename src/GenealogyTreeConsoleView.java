import java.util.List;

public class GenealogyTreeConsoleView implements GenealogyTreeView {
    @Override
    public void displaySortedByName(List<Person> people) {
        System.out.println("People sorted by name:");
        for (Person person : people) {
            System.out.println("Person: " + person.getName());
        }
    }

    @Override
    public void displaySortedByBirthDate(List<Person> people) {
        System.out.println("People sorted by birth date:");
        for (Person person : people) {
            System.out.println("Person: " + person.getName() + ", Birth date: " + person.getBirthDate());
        }
    }
}
