package com.ferragnez.party;


import java.util.Scanner;

public class CheckGuest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] listGuests = {
                "Dua Lipa",
                "Paris Hilton",
                "Manuel Agnelli",
                "J-AX",
                "Francesco Totti",
                "Ilary Blasi",
                "Bebe Vio",
                "Luis",
                "Pardis Zarei",
                "Martina Maccherone",
                "Rachel Zeilic"
        };

        System.out.println("Inserire nome invitato");
        String nameGuest = scanner.nextLine();

        for (int i = 0; i < listGuests.length; i++) {
            if(nameGuest.equals(listGuests[i])) {

            }
        }
        scanner.close();
    }

}