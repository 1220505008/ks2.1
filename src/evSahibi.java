import java.util.ArrayList;
import java.util.List;

// evSahibi sınıfı
class evSahibi {
    private String evSahibiAdi;//ev sahibinin adını tutan değişken
    private String evSahibiSoyadi;//ev sahibi soyadını tutan değişken
    private Bina binayaSahip;//ev sahibinin sahip olduğu bina referansını tutan değişken
    private List<Daire> daireListesi;//daire listesi tanımladık


    public evSahibi(String evSahibiAdi, String evSahibiSoyadi, Bina binayaSahip) {//evSahibi yapıcı metodu
        this.evSahibiAdi = evSahibiAdi;
        this.evSahibiSoyadi = evSahibiSoyadi;
        this.binayaSahip = binayaSahip;
        this.daireListesi = new ArrayList<>();
    }

    public void displayInfo() {//ev sahibi bilgilerini ve sahip olduğu binanın bilgilerini ekrana yazdıran metot
        System.out.println("Ev Sahibi: " + evSahibiAdi + " " + evSahibiSoyadi);
            System.out.println("Ev Sahibinin Daireleri:");
            for (Daire daire : daireListesi) {
                daire.displayInfo();

        }

    }


    public void addApartment(Daire daire) {//ev sahibinin sahip olduğu binaya daire ekleme
        daireListesi.add(daire);
        System.out.println("Daire ev sahibinin listesine eklendi:" + daire.getAddress() + ", Numara:" + daire.getApartmentNumber() + ", Kat:" + daire.getFloor());
    }
}
