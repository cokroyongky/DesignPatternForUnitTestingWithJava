package entity;

public class Mahasiswa {
    private Integer id;
    private String nim;
    private String nama;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public String toString() {
        return "Mahasiswa{"+
                "id=" + id+
                ", nim='" + nim+'\''+
                ", nama='" + nama+'\''+
                '}';
    }
}
