package dao;

import entity.Mahasiswa;

import java.util.List;

public interface MahasiswaDAO {
    Mahasiswa save(Mahasiswa mahasiswa);
    Mahasiswa update(Mahasiswa mahasiswa);
    void delete(Mahasiswa mahasiswa);

    Mahasiswa findById(Integer id);

//    List karena hasil dari findbyid berupa obj;
    List<Mahasiswa> findBy(Mahasiswa mahasiswa);
}
