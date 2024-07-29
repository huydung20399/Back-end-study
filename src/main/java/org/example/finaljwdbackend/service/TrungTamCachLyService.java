package org.example.finaljwdbackend.service;

import org.example.finaljwdbackend.model.TrungTamCachLy;
import java.util.List;

public interface TrungTamCachLyService {
    List<TrungTamCachLy> findAll();
    TrungTamCachLy findById(String id);
    void insert(TrungTamCachLy trungTamCachLy);
    void update(TrungTamCachLy TrungTamCachLy, String id);
    void delete(String id);
}
