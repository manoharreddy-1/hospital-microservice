package com.example.hospitalapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hospitalapp.entity.HospitalEntity;
import com.example.hospitalapp.repository.HospitalRepository;

@Service
public class HospitalService {

    @Autowired
    private HospitalRepository hospitalRepository;

    public HospitalEntity saveHospital(HospitalEntity hospital) {
        return hospitalRepository.save(hospital);
    }

    public List<HospitalEntity> getAllHospitals() {
        return hospitalRepository.findAll();
    }

    public Optional<HospitalEntity> getHospitalById(int id) {
        return hospitalRepository.findById(id);
    }

    public void deleteHospital(int id) {
        hospitalRepository.deleteById(id);
    }
}