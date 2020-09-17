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
public class Courriel {
    private int id ;
    private String date;
    private String objet;
    private String corps; 
    private ArrayList<Vente> LesVentes ;
    private ArrayList<pieceJointe> LesPiecesJointes ;

public Courriel(){
}

    public void setLesPiecesJointes(ArrayList<pieceJointe> LesPiecesJointes) {
        this.LesPiecesJointes = LesPiecesJointes;
    }

    public ArrayList<pieceJointe> getLesPiecesJointes() {
        return LesPiecesJointes;
    }


    public Courriel(int id, String dateEnvoie, String objet, String corps, ArrayList<Vente> LesVentes) {
        this.id = id;
        this.date = date;
        this.objet = objet;
        this.corps = corps;
        this.LesVentes = LesVentes;
    }

    public int getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public String getObjet() {
        return objet;
    }

    public String getCorps() {
        return corps;
    }

    public ArrayList<Vente> getLesVentes() {
        return LesVentes;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setObjet(String objet) {
        this.objet = objet;
    }

    public void setCorps(String corps) {
        this.corps = corps;
    }

    
    
    public void setLesVentes(ArrayList<Vente> LesVentes) {
        this.LesVentes = LesVentes;
    }
    
    public void addlesVentes(Vente UneVentes){
        if (LesVentes == null){
            LesVentes = new ArrayList<Vente>();
        }
        LesVentes.add(UneVentes);
    }
    
    public void addlesPieceJointes(pieceJointe UnePieceJointe){
        if (LesPiecesJointes == null){
            LesPiecesJointes = new ArrayList<pieceJointe>();
        }
        LesPiecesJointes.add(UnePieceJointe);
    }

    public void setDateEnvoie(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

