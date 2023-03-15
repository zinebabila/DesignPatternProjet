package Singleton;

import Singleton.Serveur;

public class Main {
    public static void main(String[] args) {
        Serveur serveur= Serveur.getSeuleinstance();
        Serveur serveur1= Serveur.getSeuleinstance();
        serveur.setDonner("donner critique");
        System.out.println(serveur1.getDonner());
    }
}