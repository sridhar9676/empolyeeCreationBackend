package net.testProject.empolyecreationbackend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.boot.jaxb.hbm.internal.GenerationTimingConverter;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "empolyees")
public class Empolyee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="email_id", nullable = false, unique = true)
    private String email;



    @CreationTimestamp
    @Column(name = "date_created")
    private LocalDateTime dateCreated;

    @Column(name="updatedDate")
    private String updatedDate;



    @Column(name = "status", columnDefinition = "CHAR(1) DEFAULT '1'")
    @ColumnDefault(value = "'1'")
    private String status;




}
