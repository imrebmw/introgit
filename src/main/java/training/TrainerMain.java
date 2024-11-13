package training;

import java.util.Scanner;

public class TrainerMain {
    public static void main(String[] args) {
        Trainer trainer = new Trainer();
        Scanner scanner = new Scanner(System.in);
        trainer.setName("Lakatos Bela");
        trainer.setYearob(1993);
        System.out.println(trainer.getName());
        System.out.println(trainer.getYearob());

        Trainer trainer2 = new Trainer();
        trainer2.setName("Balogh Jozska");
        trainer2.setYearob(2000);
        System.out.println(trainer2.getName());
        System.out.println(trainer2.getYearob());

        System.out.println(trainer2.getName());
        System.out.print("Adjal meg egy új nevet a 2-esnek: ");
        trainer2.changeName(scanner.nextLine());
        System.out.print("Adjal meg egy új születesi évet a 2-esnek: ");
        trainer2.setYearob(scanner.nextInt());
        System.out.println(trainer2.getNameandyearob());
        trainer2.setName("JAckDoe");
        System.out.println(trainer2.getName());

    }
}
