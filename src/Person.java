import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    private final String name;
    private final Gender gender;
    private final List<Person> children;
    private final Date birthDate;

    public Person(String name, Gender gender, Date birthDate) {
        this.name = name;
        this.gender = gender;
        this.children = new ArrayList<>();
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public List<Person> getChildren() {
        return children;
    }

    public void addChild(Person child) {
        children.add(child);
    }

    public Date getBirthDate() {
        return birthDate;
    }
}
