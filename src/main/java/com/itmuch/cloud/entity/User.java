package com.itmuch.cloud.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Data
public class User implements Serializable {
    private static final long serialVersionUID = -6507941606244044884L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String name;
    @Column
    private Short age;
    @Column
    private BigDecimal balance;


}
