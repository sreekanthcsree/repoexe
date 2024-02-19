package com.java8Features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeeStreamEx {

    public EmployeeStreamEx(int i, String jiyaBrein, int i1, String female, String hr, int i2, double v) {
    }

    public EmployeeStreamEx() {

    }

    public static void main(String[] args) {


        List<EmployeeStreamEx> list = Arrays.asList(new EmployeeStreamEx(),new EmployeeStreamEx(),new EmployeeStreamEx());

        List<EmployeeStreamEx> empList = new ArrayList<>();
        empList.add(new EmployeeStreamEx(101,"Jiya brein",32,"Female","HR",2011,25000.0));
    }

}
