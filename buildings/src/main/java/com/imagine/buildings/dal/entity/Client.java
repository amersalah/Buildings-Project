package com.imagine.buildings.dal.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "client")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(updatable = false)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(updatable = false)
    private String ssn;

    private Telephone telephone;

    private Set<Address> addresses;

    private String job;

    private Set<Unit> units;

}
