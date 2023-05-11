package com.boc.alexis.devoirs.exercice_1;

import com.boc.alexis.devoirs.exercice_1.sources.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Création d'un hôtel
        Hotel hotel = new Hotel("Hôtel de Paris", "1 Rue de Rivoli, 75001 Paris", 5);

        // Ajout de chambres à l'hôtel
        Chambre chambre1 = new Chambre(101, TypeChambre.SIMPLE, true);
        Chambre chambre2 = new Chambre(102, TypeChambre.DOUBLE, true);
        Chambre chambre3 = new Chambre(103, TypeChambre.SUITE, true);
        hotel.ajouterChambre(chambre1);
        hotel.ajouterChambre(chambre2);
        hotel.ajouterChambre(chambre3);

        // Réservation d'une chambre pour un client
        Client client1 = new Client("Dupont", "Jean", "jean_d@gmail.com","+33625430158", TypeClient.PARTICULIER);
        LocalDate dateDebut = LocalDate.of(2023, 6, 1);
        LocalDate dateFin = LocalDate.of(2023, 6, 4);
        // Réservation d'une chambre double avec une capacité de 3 personnes
        try {
            Reservation reservation1 = hotel.reserverChambre(TypeChambre.DOUBLE, LocalDate.now(), LocalDate.now().plusDays(1), client1, 2);
            System.out.println("Réservation effectuée :\n" + reservation1.toString());
        } catch (Hotel.CapaciteMaximaleChambreException e) {
            System.out.println("Erreur lors de la réservation : " + e.getMessage());
        }

        // Affichage des informations de la réservation
        //System.out.println("Réservation effectuée :");
        //System.out.println(reservation1.toString());
    }
}
