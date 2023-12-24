// Konut sınıfı (abstract)
abstract class Konut {
    protected String address;//adresi tanımladık

    public Konut(String address) {//konut yapıcı metodunu tanımladık
        this.address = address;
    }

    //bilgileri tutabileceğimiz ve diğer sınıflar içerisinde override edeceğimiz displayInfo sınıfını tanımladık
    public abstract void displayInfo();

    public String getAddress() {
        return address;
    }

}