package com.imagine.buildings.dal.entity;

import javax.persistence.*;

@Entity
@Table(name = "pay_type_lookup")
public class PayTypeLookup {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(updatable = false)
    private Long id;

    private String type;
}
