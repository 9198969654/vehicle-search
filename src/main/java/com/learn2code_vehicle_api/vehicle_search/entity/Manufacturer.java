package com.learn2code_vehicle_api.vehicle_search.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "manufacturer")
public class Manufacturer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank(message = "* Manufacturer name is required")
    @Column(name = "manufacturer_name")
    private String manufacturerName;

    @Column(name = "country_of_origin")
    private String countryOfOrigin;


}























