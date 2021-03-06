package com.jobfull.jobFull.jobHunterProfile.model;

import com.jobfull.jobFull.userManagement.model.UserModel;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "education_details")
@Data
public class EducationDetail implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JoinColumn(name = "user_id", nullable = false)
    @ManyToOne
    private JobHunterModel jobHunter;

    private String certificateDegreeName;
    private String major;
    private String Issuer;
    private Date startingDate;
    private Date completionDate;



}
