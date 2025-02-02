package org.launchcode.techjobs.persistent.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Job extends AbstractEntity{
    @ManyToOne
    private Employer employer;

    @ManyToMany
    private List<Skill> skills = new ArrayList<>();
    public List<Skill> getSkills() {
        return skills;
    }
    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }

    public Job() {
    }

    public Job(Employer someEmployer, List<Skill> someSkills) {
        super();
        //this.employer = someEmployer;
        //this.skills = someSkills;
    }

    // Getters and setters.
    public Employer getEmployer(){
        return employer;
    }
    public void setEmployer(Employer employer) {
        this.employer = employer;
    }


}

