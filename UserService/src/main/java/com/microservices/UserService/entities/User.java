package com.microservices.UserService.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "User")
public class User {

    @Id
    private String userId;

    @Column(name = "name")
    private String name;

    private String email;
    private String about;

    @Transient
    private List<Rating> ratings = new ArrayList<>();
}
