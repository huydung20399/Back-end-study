package org.example.finaljwdbackend.service;

import org.example.finaljwdbackend.model.PhongCachLy;

import java.util.List;

public interface PhongCachLyService {
    List<PhongCachLy> findAll();
    PhongCachLy findById(String id);
    void insert(PhongCachLy phongCachLy);
    void update(PhongCachLy phongCachLy, String id);
    void delete(String id);
}
