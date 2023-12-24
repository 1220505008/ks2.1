// Kiraci sınıfı
class Kiraci {
    private String kiraciAdi;//kiracının adını tutan değişken
    private String kiraciSoyadi;//kiracının soyadını tutan değişken
    private evSahibi evSahibi;//kiracının kiralık dairede oturduğu ev sahibi referansını tutan değişken

    public Kiraci(String kiraciAdi, String kiraciSoyadi, evSahibi evSahibi) {//kiraci yapıcı metodu
        this.kiraciAdi = kiraciAdi;
        this.kiraciSoyadi = kiraciSoyadi;
        this.evSahibi = evSahibi;
    }

    public void displayInfo() {//kiracı bilgilerini ve oturduğu ev sahibinin bilgilerini ekrana yazdıran metot
        System.out.println("Kiracı: " + kiraciAdi + " " + kiraciSoyadi);
        evSahibi.displayInfo();
    }
}
