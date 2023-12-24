public class Main {
    public static void main(String[] args) {
        // Nesne yaratma (<<create>>) ilişkileri
        Daire daire1 = new Daire("Hayat Apartmanı", 8,3);//bir daire nesnesi oluşturduk
        Daire daire2 = new Daire("Hayat Apartmanı", 9, 3);//yeni bir daire nesnesi oluşturduk
        Bina bina = new Bina("Hayat Apartmanı", 5);//bina nesnesi oluşturduk
        evSahibi evSahibi = new evSahibi("Ali", "Yılmaz", bina);//evSahibi nesnesini oluşturduk
        Kiraci kiraci = new Kiraci("Ayşe", "Can", evSahibi);//kiraci nesnesini oluşturduk


        bina.displayInfo();//bina bilgisi
        System.out.println("-----------------------------");
        evSahibi.addApartment(daire1);//ev sahibinin daire listesine daire1 ekledik
        System.out.println("-----------------------------");
        evSahibi.displayInfo();//ev sahibi bilgisi
        System.out.println("-----------------------------");
        kiraci.displayInfo();//kiracı bilgisi
        System.out.println("-----------------------------");
        evSahibi.addApartment(daire2);//ev sahibinin daire listesine daire2 ekledik
        System.out.println("-----------------------------");
        evSahibi.displayInfo();//ev sahibi bilgisi
        System.out.println("-----------------------------");
    }
}
