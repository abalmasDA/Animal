import java.util.Objects;

/**
 * Використовуючи Intelij IDEA, створити проект, пакет.
 * Створити клас Animal з ім'ям String, int віком, хвостом Boolean.
 * У класі перевизначити метод toString, щоб висновок був наступним «Ім'я: Васька, вік: 45, хвіст: ні».
 * У класі Animal перевизначити методи equals & hashCode.
 */
public class Animal {
    private String name;
    private int age;
    private boolean tail;

    public Animal(String name, int age, boolean tail) {
        this.name = name;
        this.age = age;
        this.tail = tail;
    }

    public String checkTail(boolean tail) {
        if (tail == false) {
            return "ні";
        }
        return "так";
    }

    @Override
    public String toString() {
        return "«Ім'я: " + name + ", " + "вік: " + age + ", " + "хвіст: " + checkTail(tail) + "»";

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && tail == animal.tail && Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, tail);
    }
}
