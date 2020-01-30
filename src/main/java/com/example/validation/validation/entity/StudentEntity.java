package com.example.validation.validation.entity;


import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "student")
public class StudentEntity {

    @Id
    @Column(name = "student_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int student_id;

    @Column(name = "student_name")
    @NotNull
    @Size(min = 2,max = 10,message = "length should be in between 2 and 10")
    String student_name;

    @NotEmpty(message = "email should not be empty")
    @Email(message = "Invalid email address")
    @Column(name = "email")
    String email;

    @Column(name = "mobile_number")
    @Size(max = 10,message = "digits should be 10")
    @NotEmpty(message = "Mobile number should not be empty")
    private
    String mobilenumber;

    @Column(name = "password")
    String password;

    public StudentEntity() {
    }

    public StudentEntity(String student_name, String email, String mobilenumber, String password) {
        this.student_name = student_name;
        this.email = email;
        this.mobilenumber = mobilenumber;
        this.password = password;
    }


    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobilenumber() {
        return mobilenumber;
    }

    public void setMobilenumber(String mobilenumber) {
        this.mobilenumber = mobilenumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
