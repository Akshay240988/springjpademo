package com.springjpa.springjpademo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
      private Integer id;
      private String name;

      @OneToMany(mappedBy = "department")
       private List<Employee> employeeList;

}
