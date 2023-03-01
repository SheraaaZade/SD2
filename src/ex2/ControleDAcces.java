package ex2;

import java.util.HashMap;
import java.util.HashSet;

public class ControleDAcces {

    private HashMap<Badge, Employe> employes;
    private HashSet<Employe> present_batiment;

    public ControleDAcces() {
        employes = new HashMap<Badge, Employe>();
        present_batiment = new HashSet<Employe>();
    }

    // associe le badge � un employé
    public void donnerBadge(Badge b, Employe e) {
        employes.put(b, e);
    }

    // met � jour les employ�s pr�sents dans le batiment
    public void entrerBatiment(Badge b) {
        if (employes.containsKey(b)) {
            present_batiment.add(employes.get(b));
        }
    }

    // met � jour les employ�s pr�sents dans le batiment
    public void sortirBatiment(Badge b) {
        if (employes.containsKey(b))
            present_batiment.remove(employes.get(b));
    }

    // renvoie vrai si l'employ� est dans le batiment, faux sinon
    public boolean estDansBatiment(Employe e) {
        return present_batiment.contains(e);
    }

}
