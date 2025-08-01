package com.example.sb_hris.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "tblDepartment")
@Data
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long departmentId;
    private String uuid;
    private String departmentCode;
    private String departmentName;
    private Long branchId;
    private String status;
    private String publisher;
    private Date publishedDate;
    private Date modifiedDate;

    public Department() {
        this.uuid = UUID.randomUUID().toString();
        this.status = "1";
        this.publisher = "ADMIN";
        this.publishedDate = new Date();
        this.modifiedDate = new Date();
    }
}
