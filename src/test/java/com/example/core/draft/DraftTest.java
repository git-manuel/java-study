package com.example.core.draft;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;

public class DraftTest {


    private List<Employee> employeeList = new ArrayList<>();
    private Comparator<Employee> compareByName = Comparator.comparing(Employee::getName);
    private Comparator<Employee> compareById = Comparator.comparing(Employee::getId);
    private Comparator<Employee> compareByPass = Comparator.comparing(Employee::getPassword);


    private String[] arrOne = {"x", "a", "b", "c"};


    Integer[][] arrTwo = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};


    @BeforeEach
    public void init() {

        employeeList.add(new Employee("stwart", 4l, "zxc"));
        employeeList.add(new Employee("nick", 1l, "1234"));
        employeeList.add(new Employee("Abrahan", 2l, "asd"));
        employeeList.add(new Employee("stwart", 3l, "abc"));
        employeeList.add(new Employee("stwart", 100l, "abc"));


    }

    @Test
    public void sortOneDimentionArray() {

        Arrays.sort(arrOne);

        for (String s :
                arrOne) {
            System.out.println(s);
        }
    }

    @Test
    public void sortOneDimentionArrayReverse() {

        Arrays.sort(arrOne, Comparator.reverseOrder());

        for (String s :
                arrOne) {
            System.out.println(s);
        }
    }


    @Test
    public void sortedTwoDimention() {

        Arrays.sort(arrTwo, Comparator.comparing((Integer[] a) -> a[0]));
        //reversed
        //  Arrays.sort(arrTwo, Comparator.comparing((Integer[] a) -> a[0]).reversed());

    }

    @Test
    public void sortList() {

    }

    @Test
    public void employeeWithIdGreaterThan1() {

        var list = employeeList.stream()
                .filter(e -> e.getId() > 1l)
                .collect(Collectors.toList());

        list.forEach(System.out::println);
    }

    @Test
    public void sortByNameDescIfEqualSortByIdCres() {

        Collections.sort(employeeList);

        employeeList.stream().sorted(compareByName);

        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }



    static class Employee implements Comparable<Employee> {

        @Override
        public int compareTo(Employee other) {

            if (!other.getName().equalsIgnoreCase(this.getName())) {

                return this.getName().compareTo(other.getName());
            } else {
                return this.getId().compareTo(other.getId());
            }
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "name='" + name + '\'' +
                    ", id=" + id +
                    ", password='" + password + '\'' +
                    '}';
        }

        public Employee(String name, Long id, String password) {
            this.name = name;
            this.id = id;
            this.password = password;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        private String name;
        private Long id;
        private String password;

    }


}
