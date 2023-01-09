package org.example.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "friends")
@Getter
@Setter
@ToString
public class Friend {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    @Enumerated(EnumType.STRING)
    private SexFriend sexFriend;

    @ManyToMany(mappedBy = "friend")
    private Set<Client> client;
}
