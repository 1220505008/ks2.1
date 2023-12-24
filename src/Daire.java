// Daire sınıfı
class Daire extends Konut implements Comparable<Daire> {
    private int apartmentNumber;//daire numarasını temsil eder
    private int floor;

    public Daire(String address, int apartmentNumber, int floor) {//daire yapıcı metodunu tanımladık
        super(address);
        this.apartmentNumber = apartmentNumber;
        this.floor = floor;
    }

    @Override
    public void displayInfo() {//daire bilgileri
        System.out.println("Daire: " + address + ", Numara: " + apartmentNumber + ", Kat: " + floor);
    }

    public int getApartmentNumber() {
        return apartmentNumber;
    }

    public int getFloor(){
        return floor;
    }

    @Override
    public int compareTo(Daire other) {//daire numaralarını karşılaştırma metodu
        if (this.floor == other.floor) {
            return Integer.compare(this.apartmentNumber, other.apartmentNumber);
        }
        return Integer.compare(this.floor, other.floor);
    }
}


