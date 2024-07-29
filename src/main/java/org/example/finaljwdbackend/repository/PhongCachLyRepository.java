package org.example.finaljwdbackend.repository;

import org.example.finaljwdbackend.model.PhongCachLy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhongCachLyRepository extends JpaRepository<PhongCachLy, String> {
}
