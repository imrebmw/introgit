package composition;

public class TrainerMain {
    public static void main(String[] args) {
        Trainer trainer = new Trainer("Lakatos Alehandro", new Address("Hajduhadhaz", "Oncsa"));
        System.out.println(trainer.getName());
        System.out.println(trainer.getAddress().getCity() + " " + trainer.getAddress().getLine());
    }
}
