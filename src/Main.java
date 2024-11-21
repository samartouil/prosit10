public class Main {
    public static void main(String[] args) {
        SocieteArrayList societe = new SocieteArrayList();

        Employe e1 = new Employe(1, "touil ", "samar", "Informatique", 5);
        Employe e2 = new Employe(2, "ranim", "ajlani", "Rh", 4);
        Employe e3 = new Employe(3, "dali", "charfeddine", "Finance", 3);

        societe.ajouterEmploye(e1);
        societe.ajouterEmploye(e2);
        societe.ajouterEmploye(e3);

        System.out.println("Liste des employés :");
        societe.displayEmploye();

        System.out.println("\nRecherche par nom (touil) : " + societe.rechercherEmploye("Touil"));

        System.out.println("\nTri par ID :");
        societe.trierEmployeParId();
        societe.displayEmploye();

        System.out.println("\nTri par département et grade :");
        societe.trierEmployeParNomDépartementEtGrade();
        societe.displayEmploye();
    }
}
