package Model;

public class Pembeli {
    private String nama;
    private String password;

    public String getNama(){return nama;}
    public String getPassword(){return password;}

    public void setNama(String n){nama = n;}
    public void setPassword(String n){password = n;}

    public String toString(){
        return nama+" "+password;
    }
}
