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

        boolean found = false;
        for (int i = 0; i < listGuests.length && !found; i++) {
            if(nameGuest.equals(listGuests[i])) {
                found = true;
            }
        }

        if (found) {
            System.out.println("Puoi Entrare!!!");
        } else {
            System.out.println("Mi dispiace non puoi entrare :(");
        }
        scanner.close();
    }

}