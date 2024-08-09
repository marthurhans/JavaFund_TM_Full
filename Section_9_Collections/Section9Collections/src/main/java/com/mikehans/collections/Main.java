package com.mikehans.collections;

import java.text.NumberFormat;
import java.util.*;
import java.util.regex.Matcher;

public class Main {

    private static Set<IEmployee> employees;
    private static Map<String, Integer> salaryMap;

    public static void main(String[] args) {
        System.out.println();

        String peopleText = """
            Flinstone, Fred, 1/1/1900, Programmer, {locpd=2000,yoe=10,iq=140}
            Flinstone, Fred, 1/1/1900, Programmer, {locpd=4000,yoe=10,iq=140}
            Flinstone, Fred, 1/1/1900, Programmer, {locpd=5000,yoe=10,iq=140}
            Flinstone, Fred, 1/1/1900, Programmer, {locpd=6000,yoe=10,iq=140}
            Flinstone, Fred, 1/1/1900, Programmer, {locpd=7000,yoe=10,iq=140}
            Flinstone, Fred, 1/1/1900, Programmer, {locpd=9000,yoe=10,iq=140}
            Flinstone, Fred, 1/1/1900, Programmerzzzzz, {locpd=10000,yoe=10,iq=140}
            Flinstone2, Fred2, 1/1/1900, Programmer, {locpd=1300,yoe=14,iq=100}
            Flinstone3, Fred3, 1/1/1900, Programmer, {locpd=2300,yoe=8,iq=105}
            Flinstone4, Fred4, 1/1/1900, Programmer, {locpd=1630,yoe=3,iq=115}
            Flinstone5, Fred5, 1/1/1900, Programmer, {locpd=5,yoe=10,iq=100}
            Rubble, Barney, 2/2/1905, Manager, {orgSize=300,dr=10}
            Rubble2, Barney2, 2/2/1905, Manager, {orgSize=100,dr=4}
            Rubble3, Barney3, 2/2/1905, Manager, {orgSize=200,dr=2}
            Rubble4, Barney4, 2/2/1905, Manager, {orgSize=500,dr=8}
            Rubble5, Barney5, 2/2/1905, Manager, {orgSize=175,dr=20}
            Flinstone, Wilma, 3/3/1910, Analyst, {projectCount=3}
            Flinstone2, Wilma2, 3/3/1910, Analyst, {projectCount=4}
            Flinstone3, Wilma3, 3/3/1910, Analyst, {projectCount=5}
            Flinstone4, Wilma4, 3/3/1910, Analyst, {projectCount=6}
            Flinstone5, Wilma5, 3/3/1910, Analyst, {projectCount=9}
            Rubble, Betty, 4/4/1915, CEO, {aveStockPrice=300}
            """;

        Matcher peopleMat = Employee.PEOPLE_PAT.matcher(peopleText);

        int totalSalaries = 0;
        IEmployee employee = null;
//        Set<IEmployee> employees = new HashSet<>();
        employees = new TreeSet<>((e1, e2) -> Integer.compare(e1.getSalary(), e2.getSalary()));
//        salaryMap = new HashMap<>();
//        salaryMap = new TreeMap<>();
        salaryMap = new LinkedHashMap<>();

        while (peopleMat.find()) {
            employee = Employee.createEmployee(peopleMat.group());
            Employee emp = (Employee) employee;
            boolean add = employees.add(employee);
            salaryMap.put(emp.firstName, emp.getSalary());
        }

//        IEmployee myEmp = employees.get(5);
//        System.out.println(myEmp.toString());
//        System.out.println(employees.contains(myEmp));
//
//        IEmployee employee1 = Employee.createEmployee("Flinstone5, Fred5, 1/1/1900, Programmer, {locpd=5,yoe=10,iq=100}");
//        System.out.println(employees.contains(employee1));
//        System.out.println(myEmp.equals(employee1));
//        System.out.println();
//
//
//        Collections.sort(employees, Comparator.reverseOrder());
//        employees.sort(new Comparator<IEmployee>() {
//            @Override
//            public int compare(IEmployee o1, IEmployee o2) {
//                if(o1 instanceof Employee emp1 && o2 instanceof Employee emp2) {
//                    int lnameResult = emp1.lastName.compareTo(emp2.lastName);
//                    return lnameResult != 0 ? lnameResult : Integer.compare(emp1.getSalary(), emp2.getSalary());
//                }
//                return 0;
//            }
//        });


//        IEmployee first = employees.get(0);
//        IEmployee second = employees.get(1);
//        IEmployee third = employees.get(2);
//        employees.remove(first);
        //better version below:
//        employees.remove(0);
//        employees.remove(1);
//        employees.remove(3);
//////
//        Object[] genericArray = employees.toArray();
//        IEmployee[] otherArray = employees.toArray(new IEmployee[0]);
//
//        List<IEmployee> subList = employees.subList(0,3);
//
//        employees.set(0, Employee.createEmployee("Rubble, Betty, 4/4/1915, CEO, {aveStockPrice=300}"));
//
//        IEmployee thirdObject = employees.get(2);
//        System.out.println(employees.indexOf(thirdObject));
//
//
//                            List<String> undesirables2 = new ArrayList<>();
//                            undesirables2.add("Wilma5");
//                            undesirables2.add("Barney4");
//                            undesirables2.add("Fred2");
//                            //THIS LIST IS MODIFYABLE
//                            //replaced by code below
//
//
//        List<String> undesirables3 = new ArrayList<>(List.of("Wilma5", "Barney4", "Fred2"));
//        System.out.println(undesirables3);
//        undesirables3.sort(Comparator.naturalOrder());
//        System.out.println(undesirables3);
//        System.out.println();
//            //THIS LIST IS UN-MODIFYABLE!
//
//        List<String> undesirables = new ArrayList<>(List.of("Wilma5", "Barney4", "Fred2"));
//
//        removeUndesireables(employees, undesirables);
//
//        List<String> newStrings = new ArrayList<>();
//        newStrings.addAll(undesirables);
//        System.out.println(newStrings.size());
//
        for (IEmployee worker : employees) {
            System.out.println(worker.toString());
            totalSalaries+= worker.getSalary();
        }

        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.printf("The total payout should be %s%n", currencyInstance.format(totalSalaries));
        System.out.println(employees.size());
        System.out.println(salaryMap.values());
        System.out.println(salaryMap.keySet());
        System.out.println(salaryMap.entrySet());
        for (Map.Entry<String, Integer> entry : salaryMap.entrySet()) {
            System.out.printf("Key = %s, Value = %s%n", entry.getKey(), entry.getValue());
        }

//        Weirdo larry = new Weirdo("David", "larry", LocalDate.of(1950,1,1));
//        System.out.println(larry.firstName());
//
//        Weirdo jake = new Weirdo("Snake", "Jake");
//        System.out.println(jake.sayHello());
    }

    //METHODS
    private static void removeUndesireables(List<IEmployee> employees, List<String> removalNames) {
        for (Iterator<IEmployee> it = employees.iterator(); it.hasNext();) {
            IEmployee worker = it.next();
            if (worker instanceof Employee) {
                Employee tmpWorker = (Employee) worker;
                if (removalNames.contains(tmpWorker.firstName)) {
                    it.remove();
                }
            }
        }
    }

    public int getSalary(String firstName) {
        return salaryMap.getOrDefault(firstName, -1);
//        return salaryMap.get(firstName).getSalary();
        //this gets an entire employee object
        //so as an example, it would look like this for Fred1:
        //return 'Object with Fred1 as firstName'.getSalary()
//        for(IEmployee employee: employees) {
//            Employee emp = (Employee) employee;
//            if (firstName.equals(emp.firstName)) {
//                return emp.getSalary();
//            }
//        }
//        return 0;jj
    }

//    public String getLastName(String firstName) {
//        return salaryMap.get(firstName).lastName;
//    }
}

