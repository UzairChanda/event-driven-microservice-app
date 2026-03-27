package com.lcwu.user.nexus.UsersNexus.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "micro_users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "user_id")
    private  String userId;
    @Column(name = "first_name", length = 20)
    private  String firstName;
    @Column(name = "last_name", length = 20)
    private String lastName;
    @Column(name = "email_id", length = 40)
    private String emailId;
    @Column(name = "user_occupation", length = 20)
    private String occupation;
    @Column(name = "country",length = 20)
    private String country;

    @Transient
    private ArrayList<Ratings> ratings = new ArrayList<>();
}
