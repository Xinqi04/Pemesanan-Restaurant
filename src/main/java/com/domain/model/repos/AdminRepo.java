package com.domain.model.repos;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

import com.domain.model.entities.Admin;

public interface AdminRepo extends CrudRepository<Admin, Long> {

    List<Admin> findByNama(String nama);
}
