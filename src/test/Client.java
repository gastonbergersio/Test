/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author JV
 */
public class Client {
   
    private String nom;
    private String prenom;
    public Client(String n, String p){
        this.nom=n;
        this.prenom=p;
    }
    
    public String getNom(){
        return this.nom;
    }
    
      public String getPrenom(){
        return this.prenom;
    }
        public void setNom(String n){
         this.nom=n;
    }
}
