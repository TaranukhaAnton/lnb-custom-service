package com.igt.dao;

import com.igt.model.Voucher;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


/**
 * Spring Data  repository for the Voucher entity.
 */
@SuppressWarnings("unused")
@Repository
public interface VoucherRepository extends CrudRepository<Voucher, Long> {


    Page<Voucher> findAll(Pageable var1);

    Optional<Voucher> findById(Long id);
}
