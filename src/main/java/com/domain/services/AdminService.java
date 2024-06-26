package com.domain.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.domain.model.entities.Admin;
import com.domain.model.repos.AdminRepo;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class AdminService {

    @Autowired
    private AdminRepo adminRepo;

    public Admin save(Admin admin) {
        return adminRepo.save(admin);
    }

    public Admin findAdmin(Long id) {
        Optional<Admin> temp = adminRepo.findById(id);
        if (!temp.isPresent()) {
            return null;
        }
        return temp.get();
    }

    public Iterable<Admin> findAll() {
        return adminRepo.findAll();
    }

    public void removeOne(Long id) {
        adminRepo.deleteById(id);
    }

    public List<Admin> findByName(String name) {
        return adminRepo.findByNama(name);
    }

}
