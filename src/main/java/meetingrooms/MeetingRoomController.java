package meetingrooms;

import java.util.List;
import java.util.Scanner;

public class MeetingRoomController {

    private Office office = new Office(); //Office osztály metódusainak hívásához

    private Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        MeetingRoomController controller = new MeetingRoomController();
        controller.runMenu();

    }
    private void runMenu() {
        System.out.print("Adja meg a rögzítendő meeting room darabszámot: ");
        int meetingRooms = scanner.nextInt();
        scanner.nextLine(); //szám ut-n a sorvégi karakter is beolvasva legyen
        for (int i = 1;i <= meetingRooms; i++) {
            System.out.print(i +". meeting room neve: ");
            String name = scanner.nextLine();
            System.out.print(i +". meeting room szelessége: ");
            int width = scanner.nextInt();
            scanner.nextLine();
            System.out.print(i +". meeting room hossza: ");
            int length = scanner.nextInt();
            scanner.nextLine();
            office.addMeetingRoom(name, width, length);
        }
        printMenu();
        int menuItem = scanner.nextInt();
        scanner.nextLine();
        if (menuItem == 1) {
            printNames(office.getMeetingRooms());
        }
        if (menuItem == 2) {
            printNames(office.getMeetingRoomsInReverseOrder());
        }
        if (menuItem == 3) {
            System.out.println("1. Páratlan. 2. Páros.");
            int oddOrEven = scanner.nextInt();
            scanner.nextLine();
            printNames(office.getEverySecondMeetingRoom(oddOrEven));
        }
        if (menuItem == 4) {
            printMeetingRooms(office.getMeetingRooms());
        }
        if (menuItem == 5) {
            System.out.print("Adja meg a meeting room nevét: ");
            String name = scanner.nextLine();
            printMeetingRoom(office.getMeetingRoomWithGivenName(name));
        }
        if (menuItem == 6) {
            System.out.print("Adja meg a meeting room névrészletét: ");
            String namePart = scanner.nextLine();
            printMeetingRooms(office.getMeetingRoomsWithGivenNamePart(namePart));
        }
        if (menuItem == 7) {
            System.out.print("Adja meg a meeting room területét: ");
            int area = scanner.nextInt();
            scanner.nextLine();
            printMeetingRooms(office.getMeetingRoomsWithAreaLargerThan(area));
        }
        if (menuItem == 8) {
            System.out.println("Távesz Baktaló!");
        }
        if (menuItem <1 || menuItem > 8) {
            System.out.println("Nem érted, hogy 1-8 között add meg mit akarsz?");
            System.out.println();
            printMenu();
        }
    }

    private void printMenu() {
        System.out.println("1. Tárgyalók sorrendben\n" +
                "2. Tárgyalók visszafele sorrendben\n" +
                "3. Minden második tárgyaló\n" +
                "4. Tárgyaló területek\n" +
                "5. Keresés pontos név alapján\n" +
                "6. Keresés névtöredék alapján\n" +
                "7. Keresés terület alapján\n" +
                "8. Kilépés\n");
    }
    private void printNames(List<MeetingRoom> meetingRooms) {
        for (MeetingRoom meetingRoom : meetingRooms) {
            System.out.println(meetingRoom.getName());
        }
    }
    private void printMeetingRooms(List<MeetingRoom> meetingRooms) {
        for (MeetingRoom meetingRoom : meetingRooms) {
            printMeetingRoom(meetingRoom);
        }
    }
    private void printMeetingRoom(MeetingRoom meetingRoom) {
        System.out.println(
                "Név: " + meetingRoom.getName() + ", "
                        + "szélesség: " + meetingRoom.getWidth() + " m, "
                        + "hossz: " + meetingRoom.getLength() + " m, "
                        + "terület: " + meetingRoom.getArea() + " m2. "
        );
    }
}
