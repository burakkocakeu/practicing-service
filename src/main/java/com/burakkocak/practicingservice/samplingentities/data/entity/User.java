package com.burakkocak.practicingservice.samplingentities.data.entity;

import lombok.Data;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.UUID;

@Data
@Entity
@Table(name = "USER")
@EntityListeners(AuditingEntityListener.class)
public class User {

    @Id
    private UUID id;

    private String name;

    private String fullName;

    @Transient
    public String getFullName() {
        return name + " KOCAK";
    }

}
