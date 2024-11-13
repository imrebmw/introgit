package edzo;
// más helyekről, vagyis osztályok beimportálása / import localvariables.LocalVariablesMain;
public class TrainerMain {
    public static void main(String[] args) {
        Trainer trainer1 = new Trainer("Lakatos Bela", 1993);
        System.out.println(trainer1.getName());
        System.out.println(trainer1.getYearob());

        Trainer trainer2 = new Trainer("Balogh Jozska", 2000);
        System.out.println(trainer2.getName());
        System.out.println(trainer2.getYearob());
    }
}
