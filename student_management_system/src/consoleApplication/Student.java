package consoleApplication;

public class Student {

    private int regno;
    private String name;

    public Student(int regno, String name) {
        this.regno = regno;
        this.name = name;
    }

    public int getRegno() {
        return regno;
    }

    public void setRegno(int regno) {
        this.regno = regno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "RegNo: " + regno + ", Name: " + name;
    }
}
