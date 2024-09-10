package org.example;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Setter
@Getter
@Builder



@Entity //Esto se debe guardar en la bd
@Table
public class Domicilio implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  //Autoincremental
    private Long id;

    @Column(name = "nombre_calle")  //Se podrian omitir
    private String nombre_calle;

    @Column(name = "número")
    private int numero;


    @OneToOne(mappedBy="domicilio")
    //@JoinColumn(name="fk_domicilio")
    private Cliente cliente;

}