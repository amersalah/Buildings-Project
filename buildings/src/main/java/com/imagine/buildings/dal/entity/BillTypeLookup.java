package com.imagine.buildings.dal.entity;

import javax.persistence.*;

@Entity
@Table(name = "bill_type_lookup")
public class BillTypeLookup {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(updatable = false)
    private Long id;

    private String type;
}
