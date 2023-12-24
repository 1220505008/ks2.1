// Bina sınıfı
class Bina extends Konut {
    private int numberOfFloors;//kat sayısını tutan değişken tanımladık


    public Bina(String address, int numberOfFloors) {//bina yapıcı metodunu tanımladık
        super(address);
        this.numberOfFloors = numberOfFloors;

    }

    @Override
    public void displayInfo() {//bina bilgilerini yazdırma
        System.out.println("Bina: " + address + ", Kat Sayısı: " + numberOfFloors);
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }



}

