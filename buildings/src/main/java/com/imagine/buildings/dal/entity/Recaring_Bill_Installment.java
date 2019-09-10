package com.imagine.buildings.dal.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "recaring_bill_installment")
public class Recaring_Bill_Installment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(updatable = false)
    private Long id;

    private Bill bill;

    private Date nextPayDate;

}
