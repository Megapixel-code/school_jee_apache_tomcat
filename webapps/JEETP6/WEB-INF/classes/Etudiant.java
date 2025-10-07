package fr.koor.webstore.business;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity @Table( name="etudiant" )

public class Etudiant {
   @Id @GeneratedValue( strategy=GenerationType.IDENTITY )
   private int Id_etudiant;
   private String Nom;
   private String Prenom;
   private double Age;

   public Etudiant() {
      this( "unknown", "unknown", 0 ); 
   }

   public Etudiant( String Nom, String Prenom, double Age ) {
      this.setNom( Nom );
      this.setPrenom( Prenom );
      this.setAge( Age );
   }

   public int getIdArticle() { return Id_etudiant; }

   public String getNom() { return Nom; }

   public void setNom(String Nom) { this.Nom = Nom; }

   public String getPrenom() { return Prenom; }

   public void setPrenom(String Prenom) { this.Prenom = Prenom; }

   public double getAge() { return Age; }

   public void setAge(double Age) { this.Age = Age; }

   @Override public String toString(){ 
      return "Article [Id_etudiant=" + Id_etudiant + ", Nom=" + Nom + ", Prenom=" 
         + Prenom + ", Age=" + Age + "]"; 
   }
}
