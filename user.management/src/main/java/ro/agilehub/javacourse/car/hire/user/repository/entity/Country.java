package ro.agilehub.javacourse.car.hire.user.repository.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "country")
@Data
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String isoCode;
}
