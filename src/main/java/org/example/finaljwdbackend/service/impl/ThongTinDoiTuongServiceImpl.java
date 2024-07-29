package org.example.finaljwdbackend.service.impl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.example.finaljwdbackend.exception.api_exception.ApiRequestFoundException;
import org.example.finaljwdbackend.model.ThongTinDoiTuong;
import org.example.finaljwdbackend.repository.ThongTinDoiTuongRepository;
import org.example.finaljwdbackend.service.ThongTinDoiTuongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

/**
 * Ho Huy Dung - 1999/03/20
 * thong tin doi tuong Service
 */
@Service
public class ThongTinDoiTuongServiceImpl implements ThongTinDoiTuongService {
    @Autowired
    private final ThongTinDoiTuongRepository thongTinDoiTuongRepository;

    @PersistenceContext
    private EntityManager entityManager;

    /**
     * Ho Huy Dung - 1999/03/20
     * @param thongTinDoiTuongRepository
     * @throws ApiRequestFoundException if the subject with the given ID is not found.
     */
    public ThongTinDoiTuongServiceImpl(ThongTinDoiTuongRepository thongTinDoiTuongRepository) {
        this.thongTinDoiTuongRepository = thongTinDoiTuongRepository;
    }

    /**
     * Ho Huy Dung - 1999/03/20
     * select all
     */
    @Override
    public List<ThongTinDoiTuong> findAll() {
        return thongTinDoiTuongRepository.findAll();
    }

    /**
     * Ho Huy Dung - 1999/03/20
     * @param id
     */
    @Override
    public ThongTinDoiTuong findById(String id) {
        return null;
    }

    /**
     * Ho Huy Dung - 1999/03/20
     * @return
     */
    @Override
    public List<ThongTinDoiTuong> getAllByNgayKTCLTTAfterToDay() {
        return thongTinDoiTuongRepository.getAllByNgayKTCLTTAfterToDay();
    }

    /**
     * Ho Huy Dung - 1999/03/20
     * @param hoTen
     */
    @Override
    public List<ThongTinDoiTuong> getByCondition(String hoTen) {
        return thongTinDoiTuongRepository.findByHoTen(hoTen);
    }

    /**
     * Ho Huy Dung - 1999/03/20
     * @param thongTinDoiTuong
     */
    @Override
    public void insert(ThongTinDoiTuong thongTinDoiTuong) {
        thongTinDoiTuongRepository.save(thongTinDoiTuong);
    }

    /**
     * Ho Huy Dung - 1999/03/20
     *
     * @param maDT         The ID of the subject to be updated.
     * @param ngayPhatBenh The date of illness onset.
     * @param ngayKTCLTT   The date of completion of treatment and isolation.
     * @throws ApiRequestFoundException if the subject with the given ID is not found.
     */
    @Override
    public void update(String maDT, LocalDate ngayPhatBenh, LocalDate ngayKTCLTT) {
        Optional<ThongTinDoiTuong> optionalThongTinDoiTuong = thongTinDoiTuongRepository.findById(maDT);
        if (optionalThongTinDoiTuong.isPresent()) {
            ThongTinDoiTuong thongTinDoiTuong = optionalThongTinDoiTuong.get();
            thongTinDoiTuong.setNgayPhatBenh(ngayPhatBenh);
            thongTinDoiTuong.setNgayKTCLTT(ngayKTCLTT);
            thongTinDoiTuongRepository.save(thongTinDoiTuong);
        } else {
            throw new ApiRequestFoundException("Khong tim thay doi tuong voi id: " + maDT);
        }
    }

    /**
     * Ho Huy Dung - 1999/03/20
     * @param id
     */
    @Override
    public void delete(String id) {
    }
}
