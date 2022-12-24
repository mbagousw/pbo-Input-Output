public class Penyewa {
    String nama_lengkap;
    String alamat;
    String no_hp;

    public void melihat(){
        System.out.println("");
    }

    public String getNama() {
        return nama_lengkap;
    }

    public void setNama(String nama) {
        this.nama_lengkap = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNo_hp() {
        return no_hp;
    }

    public void setNo_hp(String no_hp) {
        this.no_hp = no_hp;
    }
}