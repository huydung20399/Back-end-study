package org.example.finaljwdbackend.repository;

import org.example.finaljwdbackend.model.TrungTamCachLy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrungTamCachLyRepository extends JpaRepository<TrungTamCachLy, String> {
}
