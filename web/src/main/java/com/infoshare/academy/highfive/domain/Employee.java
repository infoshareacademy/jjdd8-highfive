package com.infoshare.academy.highfive.domain;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "surname", nullable = false)
    private String surname;

    @Column(name = "hire_date", nullable = false)
    private Date hireDate;

    @Column(name = "holiday_entitlement", nullable = false)
    private int holidayEntitlement;

    @Column(name = "additional_entitlement")
    private int additionalEntitlement;

    @Column(name = "login")
    private String login;

    @Column(name = "password")
    private String password;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "position")
    private String position;

    @JoinColumn
    @ManyToOne(fetch = FetchType.LAZY)
    @Column(name = "team_id", nullable = false)
    private Team teamId;

    @JoinColumn
    @Column(name = "role_id")
    private Role roleId;

    Employee() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public int getHolidayEntitlement() {
        return holidayEntitlement;
    }

    public void setHolidayEntitlement(int holidayEntitlement) {
        this.holidayEntitlement = holidayEntitlement;
    }

    public int getAdditionalEntitlement() {
        return additionalEntitlement;
    }

    public void setAdditionalEntitlement(int additionalEntitlement) {
        this.additionalEntitlement = additionalEntitlement;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Team getTeamId() {
        return teamId;
    }

    public void setTeamId(Team teamId) {
        this.teamId = teamId;
    }

    public Role getRoleId() {
        return roleId;
    }

    public void setRoleId(Role roleId) {
        this.roleId = roleId;
    }
}
