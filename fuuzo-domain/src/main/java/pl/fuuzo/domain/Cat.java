package pl.fuuzo.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="cats")
public class Cat {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cats_seq")
    @SequenceGenerator(name="cats_seq", sequenceName="cats_seq", allocationSize=1)
    private Long id;

    @Column(name="name", nullable=false)
    private String name;

    @Column(name="date_of_birth", nullable=false)
    private Date dateOfBirth;

    @Column(name="weight", nullable=false)
    private Float weight;

    @Column(name="guardian", nullable=false)
    private String guardian;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public String getGuardian() {
        return guardian;
    }

    public void setGuardian(String guardian) {
        this.guardian = guardian;
    }

}
