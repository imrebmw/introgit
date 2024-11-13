package compositionlist;

import java.util.Arrays;
import java.util.List;

public class TrainerMain {
    public static void main(String[] args) {
        //List<String> names = Arrays.asList("Lakatos Béla", "Balogh Ronaldó", "Rézműves Józska");
        List<Names> Name = Arrays.asList(
                new Names ("Lakatos Béla"),
                new Names ("Balogh Ronaldó")
        );
        List<Address> cim = Arrays.asList(
                new Address("Hajduhadhaz", "Oncsa"),
                new Address("Téglás", "Sajt utca")
        );

        List<Job> work = Arrays.asList(
                new Job("Agrosprint", 2020),
                new Job("BMW", 2024)
        );
        Trainer trainer = new Trainer(Name,cim,work);
        for (int i = 0; i < trainer.getName().size();i++) {
            System.out.println(trainer.getName().get(i).getNevek());
            System.out.println(trainer.getCim().get(i).getCity() + " " + trainer.getCim().get(i).getLine());
            System.out.println(trainer.getJobs().get(i).getWorkplace() + " " + trainer.getJobs().get(i).getStyear());

        }
    }

}
