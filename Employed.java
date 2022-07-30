 class Employed {
     String name;
     double salary;
     double workHours;
     double hireYear;

     public Employed(String name, int salary, int workHours, int hireYear) {
         this.name = name;
         this.salary = salary;
         this.workHours = workHours;
         this.hireYear = hireYear;

     }

     public void total(Employed employed) {
         System.out.println("Staff Name : " + this.name);
         System.out.println("Previous Salary : " + this.salary);
         double tax = employed.tax();
         double bonus = employed.bonus();
         double raiseSalary = employed.raiseSalary();

         System.out.println("Total Salary : " + (this.salary - tax + bonus + raiseSalary));


     }

     public double tax() {
         if (this.salary < 1000.0) {
             System.out.println("*********");
             System.out.println("Since your salary is less than $1000, there is no tax.");
             return this.salary;
         } else if (this.salary > 1000) {
             System.out.println("********");
             System.out.println("Tax Withheld" + (this.salary * (3.0 / 100.0)));
             return this.salary * (3.0 / 100.0);

         } else {
             System.out.println("*******");
             System.out.println("The salary information you entered is invalid!");
             return 0.0;
         }


     }

     public double bonus() {
         if (this.workHours > 40.0) {
             double bonus = this.workHours - 40.0;
             System.out.println("---------------------------------------");
             System.out.println("Extra " + bonus + " for working hours " + bonus * 30.0 + " bonus paid");
             return bonus * 30.0;
         }

         return salary;
     }

     public double raiseSalary() {
         double raise = 2021.0 - this.hireYear;
         if (raise < 10) {
             System.out.println("---------------------------------------");
             System.out.println(this.name + " to the salary of the staff " + (this.salary * (5.0 / 100.0)) + "  raise has been made.");
             return this.salary * (5.0 / 100.0);
         } else if (raise > 9 && raise < 20) {
             System.out.println("---------------------------------------");
             System.out.println(this.name + " to the salary of the staff " + (this.salary * (10.0 / 100.0)) + " raise has been mader.");
             return this.salary * (10.0 / 100.0);
         } else {
             System.out.println("---------------------------------------");
             System.out.println(this.name + " to the salary of the staff " + (this.salary * (15.0 / 100.0)) + " raise has been made.");
             return this.salary * (15.0 / 100.0);
         }


     }

 }
