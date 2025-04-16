package com.mycompany.timedeclaration;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Database 
{
    public static void importManagers()
    {
        String line;
        try (BufferedReader br1 = new BufferedReader(new FileReader("data/managers.csv")))
        {
            while ((line = br1.readLine()) != null)
            {
                String[] data = line.split(",");
                String name = data[0];
                String surname = data[1];
                String username = data[2];
                String password = data[3];
                Manager manager = new Manager(name, surname, username, password, 2);
                Administrator.allManagers.add(manager);
            }
        } 
        catch (IOException e) { e.printStackTrace(); }
    }        

    public static void importEmployees()
    {
        String line;
        try (BufferedReader br = new BufferedReader(new FileReader("data/employees.csv")))
        {
            while ((line = br.readLine()) != null)
            {
                String[] data = line.split(",");
                String name = data[0];
                String surname = data[1];
                String username = data[2];
                String password = data[3];
                int contractTime = Integer.parseInt(data[4]);
                String teamPlacement = data[5];
                Employee employee = new Employee(name, surname, username, password, contractTime, teamPlacement);
                for (int i=0; i<Administrator.allManagers.size(); i++) if (teamPlacement.equalsIgnoreCase(Administrator.allManagers.get(i).getUsername())) Administrator.allManagers.get(i).teamEmployeesArraylist.add(employee);
                Administrator.allEmployees.add(employee);
                importTimesheets(employee);
            }
        } 
        catch (IOException e) { e.printStackTrace(); }        
    }

    public static void importTimesheets(Employee employee)
    {
        String line;
        try (BufferedReader br1 = new BufferedReader(new FileReader("data/timesheet.csv")))
        {
            while ((line = br1.readLine()) != null)
            {
                String[] data = line.split(",");
                String tUsername = data[0];
                boolean entered = Boolean.parseBoolean(data[8]);
                if (tUsername.equalsIgnoreCase(employee.getUsername()) && entered==true)
                {
                    int number = Integer.parseInt(data[1]);
                    number = number-1;
                    int declaredHours = Integer.parseInt(data[4]);
                    int declaredSickTime = Integer.parseInt(data[5]);
                    int declaredVacation = Integer.parseInt(data[6]);
                    boolean accepted = Boolean.parseBoolean(data[7]);
                    employee.addTimesheet(number, declaredHours, declaredSickTime, declaredVacation, accepted);
                }
            }
        } 
        catch (IOException e) { e.printStackTrace(); }
    }
    
    public static void exportEmployees()
    {
        try (PrintWriter writer = new PrintWriter(new FileWriter("data/employees.csv"))) 
        {
            for (Employee employee : Administrator.allEmployees) 
            {
                writer.println(
                  employee.getName() + "," +
                  employee.getSurname() + "," +
                  employee.getUsername() + "," +
                  employee.getPassword() + "," +
                  employee.getContractTime() + "," +
                  employee.getTeamPlacement()
                );
            }
        } 
        catch (IOException e) { e.printStackTrace(); }
    }
    
    public static void exportManagers()
    { 
        try (PrintWriter writer = new PrintWriter(new FileWriter("data/managers.csv"))) 
        {
            for (Manager manager : Administrator.allManagers) {
                writer.println(
                  manager.getName() + "," +
                  manager.getSurname() + "," +
                  manager.getUsername() + "," +
                  manager.getPassword()
                );
            }
        } 
        catch (IOException e) { e.printStackTrace(); }
    }
    
    public static void exportTimesheets()
    {
        try (PrintWriter writer = new PrintWriter(new FileWriter("data/timesheet.csv"))) 
        {
            for (Employee employee : Administrator.allEmployees) 
            {
                for (int i=0; i<14; i++)
                {
                      writer.println(
                        employee.getUsername() + "," +
                        employee.workTimeArraylist.workTimeByWeeks.get(i).getNumber()  + "," +
                        employee.workTimeArraylist.workTimeByWeeks.get(i).getDescription() + "," +
                        employee.getContractTime() + "," +
                        employee.workTimeArraylist.workTimeByWeeks.get(i).getDeclaredHours() + "," +
                        employee.workTimeArraylist.workTimeByWeeks.get(i).getDeclaredSickTime() + "," +
                        employee.workTimeArraylist.workTimeByWeeks.get(i).getDeclaredVacation() + "," +
                        employee.workTimeArraylist.workTimeByWeeks.get(i).getAccepted() + "," +
                        employee.workTimeArraylist.workTimeByWeeks.get(i).isEntered()
                      );
                }
            }
        } 
        catch (IOException e) { e.printStackTrace(); }
    }

    public static void importDb()
    {
        importManagers();
        importEmployees();
    }
    
    public static void exportDb()
    {
        exportManagers();
        exportEmployees();
        exportTimesheets();
    }

}
