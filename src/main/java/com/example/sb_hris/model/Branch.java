package com.example.sb_hris.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "tblBranch")
@Data
public class Branch {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long branchId;
    private String uuid;
    private String branchCode;
    private String branchName;
    private String address;
    private String status;
    private String publisher;
    private Date publishedDate;
    private Date modifiedDate;

    public Branch() {
        this.uuid = UUID.randomUUID().toString();
        this.status = "1";
        this.publisher = "ADMIN";
        this.publishedDate = new Date();
        this.modifiedDate = new Date();
    }
}
