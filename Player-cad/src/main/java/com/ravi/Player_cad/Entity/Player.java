package com.ravi.Player_cad.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table (name = "Cad_Player")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idPlayer;

    private String namePlayer;
    private int agePlayer;
    private String skillPlayer;
    private int overralPlayer;

    @ManyToOne
    @Column (name = "idClub")
    private Club club;

}
