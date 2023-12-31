package africa.semicolon.promiscuos.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Setter
@Getter
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;
    private LocalDate dateOfBirth;

    @OneToOne
    private Address address;

    @Enumerated(value = EnumType.STRING)
    private Gender gender;

    @Enumerated(value = EnumType.STRING)
    private  Role role;


    private String firstName;
    private  String lastName;

    @Column(unique = true,nullable = false)
    private  String email;

    @Column(unique = true)
    private  String phoneNumber;

    @Column(nullable = false)
    private  String password;

}
