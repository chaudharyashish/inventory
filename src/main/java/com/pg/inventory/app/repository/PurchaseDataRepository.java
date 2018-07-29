package com.pg.inventory.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pg.inventory.app.model.PurchaseData;

public interface PurchaseDataRepository extends JpaRepository<PurchaseData, Long> {

}
