package edzo;

public class Trainer {
    private String name;
    private int yearob;

    public Trainer(String name, int yearob) {
        this.name = name;
        this.yearob = yearob;
    }

    public String getName() {
        return name;
    }
    public String getNameandyearob() {
        return name + " " + yearob;
    }
    public void changeName (String newName) {
        name = newName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearob() {
        return yearob;
    }

    public void setYearob(int yearob) {
        this.yearob = yearob;
    }
}