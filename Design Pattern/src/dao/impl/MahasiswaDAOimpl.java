package dao.impl;

import dao.MahasiswaDAO;
import entity.Mahasiswa;

import java.util.ArrayList;
import java.util.List;

public class MahasiswaDAOimpl implements MahasiswaDAO{

    @Override
    public Mahasiswa save(Mahasiswa mahasiswa) {
        return mahasiswa;
    }

    @Override
    public Mahasiswa update(Mahasiswa mahasiswa) {
        return mahasiswa;
    }

    @Override
    public void delete(Mahasiswa mahasiswa) {

    }

    @Override
    public Mahasiswa findById(Integer id) {
        return new Mahasiswa();
    }

    @Override
    public List<Mahasiswa> findBy(Mahasiswa mahasiswa) {
        return new ArrayList<Mahasiswa>();
    }
}
