package org.example.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "clients")
@Getter
@Setter
@ToString
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String email;
    private Integer phone;
    private String about;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "licence_id", unique = true, nullable = false)
    private License license;

    @OneToMany(mappedBy = "client", fetch = FetchType.EAGER)
    private Set<Car> cars;

    @ManyToMany
    @JoinTable(
            name = "client_friend",
            joinColumns = {@JoinColumn(name = "client_id")},
            inverseJoinColumns = {@JoinColumn(name = "friend_id")}
    )
    private Set<Friend> friend;
}
