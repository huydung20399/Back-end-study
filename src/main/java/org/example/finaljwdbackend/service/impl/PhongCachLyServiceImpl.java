package org.example.finaljwdbackend.service.impl;

import org.example.finaljwdbackend.exception.api_exception.ApiRequestFoundException;
import org.example.finaljwdbackend.model.PhongCachLy;
import org.example.finaljwdbackend.repository.PhongCachLyRepository;
import org.example.finaljwdbackend.service.PhongCachLyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PhongCachLyServiceImpl implements PhongCachLyService {
    @Autowired
    private final PhongCachLyRepository phongCachLyRepository;

    public PhongCachLyServiceImpl(PhongCachLyRepository phongCachLyRepository) {
        this.phongCachLyRepository = phongCachLyRepository;
    }

    @Override
    public List<PhongCachLy> findAll() {
        return phongCachLyRepository.findAll();
    }

    /**
     * Ho Huy Dung - 1999/03/20
     * @param id
     * @return
     */
    @Override
    public PhongCachLy findById(String id) {
        Optional<PhongCachLy> optionalPhongCachLy = phongCachLyRepository.findById(id);
        if (optionalPhongCachLy.isPresent()) {
            return optionalPhongCachLy.get();
        } else {
            throw new ApiRequestFoundException("Khong ton tai phong cach ly trong he thong");
        }
    }

    /**
     * Ho Huy Dung - 1999/03/20
     * @param phongCachLy
     */
    @Override
    public void insert(PhongCachLy phongCachLy) {

    }

    /**
     * Ho Huy Dung - 1999/03/20
     * @param phongCachLy
     * @param id
     */
    @Override
    public void update(PhongCachLy phongCachLy, String id) {

    }

    /**
     * Ho Huy Dung - 1999/03/20
     * @param id
     */
    @Override
    public void delete(String id) {

    }
}
