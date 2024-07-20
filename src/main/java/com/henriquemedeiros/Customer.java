package com.henriquemedeiros;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Customer {
    @Id
    @SequenceGenerator(
            name = "customer_id_sequence",
            sequenceName = "customer_id_sequence"
    )
    //Notations after browsing what it does(this details are not in the class):
    //SequenceGenerator defines a primary key generator that uses a database sequence. It has two attributes:
    //name(that's the name of the sequence generator) and sequenceName(The name of the database sequence,
    // in this case is also "customer_id_sequence")
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "customer_id_sequence"
    )
    //This annotations specifies how the primary key should be generated. It has two attributes:
    //-->strategy= The strategy to be used for generating the primary key, that is GenerationType.SEQUENCE that says that the
    //sequence should be generated using a database sequence;
    //-->generator= The name of the sequence generator to be used, which matches the name in the @SequenceGenerator
    //annotation ("customer_id_sequence").

    private Integer id;
    private String name;
    private Integer age;
    private String email;

    public Customer(Integer id, String name, Integer age, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public Customer(){}


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(id, customer.id) && Objects.equals(name, customer.name) && Objects.equals(age, customer.age) && Objects.equals(email, customer.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, email);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}
