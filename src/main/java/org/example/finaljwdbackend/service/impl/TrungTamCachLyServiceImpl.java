package org.example.finaljwdbackend.service.impl;

import org.example.finaljwdbackend.model.TrungTamCachLy;
import org.example.finaljwdbackend.repository.TrungTamCachLyRepository;
import org.example.finaljwdbackend.service.TrungTamCachLyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Ho Huy Dung - 1999/03/20
 *
 */
@Service
public class TrungTamCachLyServiceImpl implements TrungTamCachLyService {
    @Autowired
    private final TrungTamCachLyRepository trungTamCachLyRepository;

    public TrungTamCachLyServiceImpl(TrungTamCachLyRepository trungTamCachLyRepository) {
        this.trungTamCachLyRepository = trungTamCachLyRepository;
    }

    /**
     * Ho Huy Dung - 1999/03/20
     * @return
     */
    @Override
    public List<TrungTamCachLy> findAll() {
        return null;
    }

    /**
     * Ho Huy Dung - 1999/03/20
     * @param id
     * @return
     */
    @Override
    public TrungTamCachLy findById(String id) {
        return null;
    }

    /**
     * Ho Huy Dung - 1999/03/20
     * @param trungTamCachLy
     */
    @Override
    public void insert(TrungTamCachLy trungTamCachLy) {

    }

    /**
     * Ho Huy Dung - 1999/03/20
     * @param TrungTamCachLy
     * @param id
     */
    @Override
    public void update(TrungTamCachLy TrungTamCachLy, String id) {

    }

    /**
     * Ho Huy Dung - 1999/03/20
     * @param id
     */
    @Override
    public void delete(String id) {

    }
}
