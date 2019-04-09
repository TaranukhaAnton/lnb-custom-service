package com.igt.controller;


import com.igt.controller.errors.BadRequestAlertException;
import com.igt.controller.util.HeaderUtil;
import com.igt.controller.util.PaginationUtil;
import com.igt.model.Voucher;
import com.igt.service.VoucherService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;

/**
 * REST controller for managing Voucher.
 */
@RestController
@RequestMapping("/api")
public class VoucherResource {

    private final Logger log = LoggerFactory.getLogger(VoucherResource.class);

    private static final String ENTITY_NAME = "jobHistory";

    private final VoucherService voucherService;

    public VoucherResource(VoucherService voucherService) {
        this.voucherService = voucherService;
    }

    /**
     * POST  /vouchers : Create a new voucher.
     *
     * @param voucher the voucher to create
     * @return the ResponseEntity with status 201 (Created) and with body the new voucher, or with status 400 (Bad Request) if the voucher has already an ID
     * @throws URISyntaxException if the Location URI syntax is incorrect
     */
    @PostMapping("/vouchers")
    public ResponseEntity<Voucher> createJobHistory(@RequestBody Voucher voucher) throws URISyntaxException {
        log.debug("REST request to save Voucher : {}", voucher);
        if (voucher.getId() != null) {
            throw new BadRequestAlertException("A new voucher cannot already have an ID", ENTITY_NAME, "idexists");
        }
        Voucher result = voucherService.save(voucher);
        return ResponseEntity.created(new URI("/api/vouchers/" + result.getId()))
                .headers(HeaderUtil.createEntityCreationAlert(ENTITY_NAME, result.getId().toString()))
                .body(result);
    }

    /**
     * PUT  /vouchers : Updates an existing voucher.
     *
     * @param voucher the voucher to update
     * @return the ResponseEntity with status 200 (OK) and with body the updated voucher,
     * or with status 400 (Bad Request) if the voucher is not valid,
     * or with status 500 (Internal Server Error) if the voucher couldn't be updated
     * @throws URISyntaxException if the Location URI syntax is incorrect
     */
    @PutMapping("/vouchers")
    public ResponseEntity<Voucher> updateJobHistory(@RequestBody Voucher voucher)  {
        log.debug("REST request to update Voucher : {}", voucher);
        if (voucher.getId() == null) {
            throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
        }
        Voucher result = voucherService.save(voucher);
        return ResponseEntity.ok()
                .headers(HeaderUtil.createEntityUpdateAlert(ENTITY_NAME, voucher.getId().toString()))
                .body(result);
    }

    /**
     * GET  /vouchers : get all the jobHistories.
     *
     * @param pageable the pagination information
     * @return the ResponseEntity with status 200 (OK) and the list of jobHistories in body
     */
    @GetMapping("/vouchers")
    public ResponseEntity<List<Voucher>> getAllJobHistories(Pageable pageable) {
        log.debug("REST request to get a page of JobHistories");
        Page<Voucher> page = voucherService.findAll(pageable);
        HttpHeaders headers = PaginationUtil.generatePaginationHttpHeaders(page, "/api/vouchers");
        return ResponseEntity.ok().headers(headers).body(page.getContent());
    }

    /**
     * GET  /vouchers/:id : get the "id" jobHistory.
     *
     * @param id the id of the jobHistory to retrieve
     * @return the ResponseEntity with status 200 (OK) and with body the jobHistory, or with status 404 (Not Found)
     */
    @GetMapping("/vouchers/{id}")
    public ResponseEntity<Voucher> getJobHistory(@PathVariable Long id) {
        log.debug("REST request to get Voucher : {}", id);
        Optional<Voucher> jobHistory = voucherService.findOne(id);

       return   jobHistory.map((response) -> {
            return ( ResponseEntity.ok()).body(response);
        }).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));


    }




    /**
     * DELETE  /vouchers/:id : delete the "id" jobHistory.
     *
     * @param id the id of the jobHistory to delete
     * @return the ResponseEntity with status 200 (OK)
     */
    @DeleteMapping("/vouchers/{id}")
    public ResponseEntity<Void> deleteJobHistory(@PathVariable Long id) {
        log.debug("REST request to delete Voucher : {}", id);
        voucherService.delete(id);
        return ResponseEntity.ok().headers(HeaderUtil.createEntityDeletionAlert(ENTITY_NAME, id.toString())).build();
    }
}
