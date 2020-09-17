/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import java.util.ArrayList;


/**
 *
 * @author sio2
 */
public class pieceJointe {
    private int id;
    private String nom;
    private String description;
    private ArrayList<Courriel> LesCourriels ;

    public pieceJointe(int id, String nom, String description, ArrayList<Courriel> LesCourriel) {
        this.id = id;
        this.nom = nom;
        this.description = description;
        this.LesCourriels = LesCourriel;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getDescription() {
        return description;
    }

    public ArrayList<Courriel> getLesCourriel() {
        return LesCourriels;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    
    public void setLesCourriel(ArrayList<Courriel> LesCourriel) {
        this.LesCourriels = LesCourriel;
    }
    
    public void addlesVentes(Courriel UnCourriel){
        if (LesCourriels == null){
            LesCourriels = new ArrayList<Courriel>();
        }
        LesCourriels.add(UnCourriel);
    }
    
    
    

    
}
