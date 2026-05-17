package entity;

public class Bank {
    private String name;
    private String mfo;
    private String adres;

    public Bank() {
    }

    public Bank(String name, String mfo, String adres) {
        this.name = name;
        this.mfo = mfo;
        this.adres = adres;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMfo() {
        return mfo;
    }

    public void setMfo(String mfo) {
        this.mfo = mfo;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", mfo='" + mfo + '\'' +
                ", adres='" + adres + '\'' +
                '}';
    }
}
