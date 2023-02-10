import java.util.Scanner;

class Employee
{
   private String emp_id, emp_name;
   private int year_of_birth;
   private double basic_salary, allowances, gross, tax_amount, net_salary;

   public void input()
   {
      Scanner myScanner = new Scanner(System.in);

      System.out.print("Enter the employee's employee ID: ");
      emp_id = myScanner.nextLine();
      System.out.print("Enter his/her name: ");
      emp_name = myScanner.nextLine();
      System.out.print("Enter his/her year of birth: ");
      year_of_birth = myScanner.nextInt();
      System.out.print("Enter his/her basic salary: ");
      basic_salary = myScanner.nextDouble();
      System.out.print("Enter his/her allowances: ");
      allowances = myScanner.nextDouble();
   }

   public void compute()
   {
      gross = basic_salary + allowances;

      if(gross >= 20000)
         tax_amount = 10.0 / 100 * gross;
      else
         tax_amount = 0;

      net_salary = gross - tax_amount;
   }

   public void output()
   {
      System.out.println("Employee ID: " + emp_id);
      System.out.println("Name: " + emp_name);
      System.out.println("Year of Birth: " + year_of_birth);
      System.out.println("Basic Salary: " + basic_salary);
      System.out.println("Allowances: " + allowances); 
      System.out.println("Gross Salary: " + gross);
      System.out.println("Tax Amount: " + tax_amount);
      System.out.println("Net Salary: " + net_salary);
   }
}



if (25 BMI > 18.5)
                    Status.setText("You are Healthy");
                else if (BMI > 24.5)
                    Status.setText("You are Overweight, check on your weight");
                else
                    Status.setText("You are underweight, check on feeding habits");

Button Net_Salary, BMI; 
EditText First_Name, Second_Name, Gender;
//
//
//        First_Name = findViewById(R.id.edtTxtFirstName);
//        Second_Name = findViewById(R.id.edtTxtSecondName);
//        Gender = findViewById(R.id.edtTxtGender);
//        Gender.getText();
        Net_Salary = findViewById(R.id.btnToNetSalary);
        BMI = findViewById(R.id.btnToBMI);
//        String Full_Name = First_Name.getText().toString() + " " + Second_Name.getText().toString();
        Net_Salary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent IntentNet = new Intent(getApplicationContext(), NetSalary_Calculator.class);
                startActivity(IntentNet);
            }
        });
 BMI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent IntentBMI = new Intent(getApplicationContext(), BMI_Calculator.class);
                startActivity(IntentBMI);
            }
        });