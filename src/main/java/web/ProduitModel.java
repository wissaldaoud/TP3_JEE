package web;
import java.util.ArrayList;
import java.util.List;
import metier.Produit;
public class ProduitModel {
private String motCle;
List<Produit> produits = new ArrayList<>();
public String getMotCle() {
return motCle;
}
public void setMotCle(String motCle) {
this.motCle = motCle;
}
public List<Produit> getProduits() {
return produits;
}
public void setProduits(List<Produit> produits) {
this.produits = produits;
}
}