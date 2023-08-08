package Model;

public class NamaInventory {
    private String Nama;
    private Integer Harga;
    private Integer Banyak;

    public NamaInventory(String Nama, Integer Harga, Integer Banyak){
        this.Nama = Nama;
        this.Harga = Harga;
        this.Banyak = Banyak;

    }

    public String getNama() {
        return Nama;
    }

    public Integer getHarga() {
        return Harga;
    }

    public Integer getBanyak() {
        return Banyak;
    }

}
