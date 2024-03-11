package com.pvxdv.supplier.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@Table(name = "categories")
@ToString
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank()
    @Size(min = 4, max = 30)
    @Column(name = "name", unique = true)
    private String name;
}
