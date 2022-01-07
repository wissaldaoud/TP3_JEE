package  test;
import java.util.List;

import metier.ImetierImp;
import metier.Produit;
public class TestMetier {
public static void main(String[] args) {
ImetierImp metier= new ImetierImp();
List<Produit> prods = metier.getProduitsParMotCle("HP");
for (Produit p : prods)
System.out.println(p.getNomProduit());
}
}
