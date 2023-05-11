package com.boc.alexis.devoirs.exercice_1.sources;

import java.time.LocalDate;

public class Reservation {

    private Chambre chambre;
    private Client client;
    private LocalDate dateDebut;
    private LocalDate dateFin;
    private int nbPersonnes;

    public Reservation(Chambre chambre, Client client, LocalDate dateDebut, LocalDate dateFin, int nbPersonnes) {
        this.chambre = chambre;
        this.client = client;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.nbPersonnes = nbPersonnes;
    }

    public Chambre getChambre() {
        return chambre;
    }

    public void setChambre(Chambre chambre) {
        this.chambre = chambre;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public LocalDate getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(LocalDate dateDebut) {
        this.dateDebut = dateDebut;
    }

    public LocalDate getDateFin() {
        return dateFin;
    }

    public void setDateFin(LocalDate dateFin) {
        this.dateFin = dateFin;
    }

    public int getNbPersonnes() {
        return nbPersonnes;
    }

    public void setNbPersonnes(int nbPersonnes) {
        this.nbPersonnes = nbPersonnes;
    }

    public double calculerPrix() {
        int nbNuits = (int) (dateFin.toEpochDay() - dateDebut.toEpochDay());
        double prixNuit = chambre.getTypeChambre().getPrix();
        double prixTotal = nbNuits * prixNuit;
        if (nbPersonnes > chambre.getTypeChambre().getCapacite()) {
            double supplement = (nbPersonnes - chambre.getTypeChambre().getCapacite()) * 10;
            prixTotal += supplement;
        }
        return prixTotal;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "chambre=" + chambre.getNumeroChambre() +
                ", client=" + client.getNom() +
                ", dateDebut=" + dateDebut +
                ", dateFin=" + dateFin +
                ", nbPersonnes=" + nbPersonnes +
                '}';
    }

}

