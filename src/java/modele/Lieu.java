/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import java.util.ArrayList;

/**
 *
 * @author Zakina
 */
public class Lieu {
    private int id ;
    private String ville;
    private int nbBoxes;
    private String commentaires; 
    private ArrayList<Vente> LesVentes ;


public Lieu(){
}


public Lieu(int id, String ville,int nbBoxes,String commentaires) {
        this.id = id;
        this.ville = ville;
        this.nbBoxes = nbBoxes;
        this.commentaires = commentaires;
}
        
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public int getnbBoxes() {
        return nbBoxes;
    }

    public void setnbBoxes(int nbBoxes) {
        this.nbBoxes = nbBoxes;
    }
    
    public String getCommentaires() {
        return commentaires;
    }

    public void setCommentaires(String commentaires) {
        this.commentaires = commentaires;
    }
    
    
    public ArrayList<Vente> getlesVentes() {
        return LesVentes;
    }

    public void setlesVentes(ArrayList<Vente> lesVentes) {
        this.LesVentes = lesVentes;
    }
          
    public void addUneVente(Vente uneVente){
        if (LesVentes == null){
            LesVentes = new ArrayList<Vente>();
        }
        LesVentes.add(uneVente);
    }
    
}