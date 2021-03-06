package com.infoshare.academy.highfive.dto.view;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.infoshare.academy.highfive.domain.Role;

import java.time.LocalDate;

public class EmployeeView {

  private Long Id;

  @JsonProperty("first_name")
  private String firstName;

  private String surname;

  private String email;

  private String position;

  @JsonProperty("hire_date")
  @JsonFormat(pattern = "yyyy-MM-dd")
  private LocalDate hireDate;

  @JsonProperty("holiday_entitlement")
  private int holidayEntitlement;

  @JsonProperty("additional_entitlement")
  private int additionalEntitlement;

  @JsonProperty("team_id")
  private TeamView team;

  private Role role;

  private int year;
  private int month;
  private int day;

  public Long getId() {
    return Id;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getSurname() {
    return surname;
  }

  public LocalDate getHireDate() {
    return hireDate;
  }

  public int getHolidayEntitlement() {
    return holidayEntitlement;
  }

  public int getAdditionalEntitlement() {
    return additionalEntitlement;
  }

  public TeamView getTeam() {
    return team;
  }

  public Role getRole() {
    return role;
  }

  public void setId(Long id) { Id = id; }

  public void setFirstName(String firstName) { this.firstName = firstName; }

  public void setSurname(String surname) { this.surname = surname; }

  public void setHireDate(LocalDate hireDate) { this.hireDate = hireDate; }

  public void setHolidayEntitlement(int holidayEntitlement) { this.holidayEntitlement = holidayEntitlement; }

  public void setAdditionalEntitlement(int additionalEntitlement) { this.additionalEntitlement = additionalEntitlement; }

  public void setTeam(TeamView team) { this.team = team; }

  public void setRole(Role role) { this.role = role; }

  public String getPosition() { return position; }

  public void setPosition(String position) { this.position = position; }

  public String getEmail() { return email; }

  public void setEmail(String email) { this.email = email; }

  public int getYear() { return year; }

  public void setYear(int year) { this.year = year; }

  public int getMonth() { return month; }

  public void setMonth(int month) { this.month = month; }

  public int getDay() { return day; }

  public void setDay(int day) { this.day = day; }

}
