import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        GenealogyTreeView view = new GenealogyTreeConsoleView();
        GenealogyTreePresenter presenter = new GenealogyTreePresenter(view);

        // Создание персонажей
        Person father = new Person("John", Gender.MALE, new Date(80, 1, 15)); // Год 1980
        Person mother = new Person("Jane", Gender.FEMALE, new Date(82, 2, 20)); // Год 1982
        Person child = new Person("Anna", Gender.FEMALE, new Date(2005, 5, 25)); // Год 2005

        // Добавление персонажей в Presenter
        presenter.addPerson(father);
        presenter.addPerson(mother);
        father.addChild(child);
        mother.addChild(child);

        // Сохранение в файл
        GenealogyTreeSerializer.saveToFile(presenter.genealogyTree, "genealogy_tree.ser");

        // Загрузка из файла
        presenter.loadGenealogyTree("genealogy_tree.ser");

        // Отображение отсортированных данных с помощью Presenter
        presenter.displaySortedData();
    }
}

