/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import modele.Client;
import modele.Lieu;
import modele.Pays;
import modele.Vente;

/**
 *
 * @author sio2
 */
public class LieuTest {
    
    public static void main(String[] args) {
        
        Lieu unLieu = new Lieu(1, "lyon", 10, "bonne vente");
        unLieu.addUneVente(new Vente(1, "FRA", "FRANCE"));  
        
        for(int i = 0; i < unLieu.getlesVentes().size(); i++){
    //System.out.println(" " + unLieu.getCommentaires().get(i).getId());
        
        }}}
    
    

