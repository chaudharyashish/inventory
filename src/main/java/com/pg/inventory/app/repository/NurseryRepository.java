package com.pg.inventory.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pg.inventory.app.model.Nursery;

public interface NurseryRepository extends JpaRepository<Nursery, Long> {

}
