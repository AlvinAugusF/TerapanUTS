package Model;

public class NamaBarang {
    private String Nama;
    private Integer Harga;
    private Integer Banyak;
    private Integer Total;

    public NamaBarang(String Nama, Integer Harga, Integer Banyak, Integer Total){
        this.Nama = Nama;
        this.Harga = Harga;
        this.Banyak = Banyak;
        this.Total = (Harga * Banyak);

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
    public Integer getTotal(){
        return Total;
    }
}
