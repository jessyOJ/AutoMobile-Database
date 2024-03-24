package com.mycompany.AutoMobiles.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@NoArgsConstructor
@Getter
@Setter
@Table(name="AUTOMOBILES")
@Entity
public class AutomobileEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer ID;
    @Column(name="Automobile name")
    private String carName;
    private String model;
    private String color;
    private Double price;
    @Column(name="Year built")
    private Integer yearBuilt;
}
