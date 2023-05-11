package com.boc.alexis.devoirs.exercice_1.sources;

import java.time.LocalDate;
import java.util.ArrayList;

public class Hotel {
    private String nom;
    private String adresse;
    private ArrayList<Chambre> chambres;

    public Hotel(String nom, String adresse, int i) {
        this.nom = nom;
        this.adresse = adresse;
        this.chambres = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public ArrayList<Chambre> getChambres() {
        return chambres;
    }

    public void ajouterChambre(Chambre chambre) {
        chambres.add(chambre);
    }

    public void enleverChambre(Chambre chambre) {
        chambres.remove(chambre);
    }

    public ArrayList<Chambre> trouverChambresDisponibles(TypeChambre typeChambre) {
        ArrayList<Chambre> chambresDisponibles = new ArrayList<>();
        for (Chambre chambre : chambres) {
            if (chambre.getTypeChambre() == typeChambre && chambre.isDisponible()) {
                chambresDisponibles.add(chambre);
            }
        }
        return chambresDisponibles;
    }

    public class CapaciteMaximaleChambreException extends Exception {

        public CapaciteMaximaleChambreException(String message) {
            super(message);
        }
    }

    public Reservation reserverChambre(TypeChambre typeChambre, LocalDate dateDebut, LocalDate dateFin, Client client, int nbPersonnes) throws CapaciteMaximaleChambreException {
        ArrayList<Chambre> chambresDisponibles = trouverChambresDisponibles(typeChambre);
        // Vérifier s'il y a des chambres disponibles
        if (chambresDisponibles.size() == 0) {
            System.out.println("Aucune chambre disponible pour le type demandé.");
            return null;
        }
        // Réserver la première chambre disponible
        Chambre chambreReservee = chambresDisponibles.get(0);
        chambreReservee.setDisponible(false);
        // Vérification de la capacité maximale de la chambre
        if (nbPersonnes > chambreReservee.getTypeChambre().getCapacite()) {
            throw new CapaciteMaximaleChambreException("La capacité maximale de la chambre " + chambreReservee.getNumeroChambre() + " est de " + chambreReservee.getTypeChambre().getCapacite() + " personnes.");
        }
        // Créer une nouvelle réservation
        Reservation reservation = new Reservation(chambreReservee, client, dateDebut, dateFin, nbPersonnes);
        return reservation;
    }



}
