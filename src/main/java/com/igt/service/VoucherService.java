package com.igt.service;


import com.igt.model.Voucher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

/**
 * Service Interface for managing Voucher.
 */
public interface VoucherService {

    /**
     * Save a voucher.
     *
     * @param voucher the entity to save
     * @return the persisted entity
     */
    Voucher save(Voucher voucher);

    /**
     * Get all the jobHistories.
     *
     * @param pageable the pagination information
     * @return the list of entities
     */
    Page<Voucher> findAll(Pageable pageable);


    /**
     * Get the "id" jobHistory.
     *
     * @param id the id of the entity
     * @return the entity
     */
    Optional<Voucher> findOne(Long id);

    /**
     * Delete the "id" jobHistory.
     *
     * @param id the id of the entity
     */
    void delete(Long id);
}
