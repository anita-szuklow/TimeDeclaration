package com.mycompany.timedeclaration;
import java.util.ArrayList;

public class Manager extends User
{
    public ArrayList<Employee> teamEmployeesArraylist;
        
    public Manager(String name, String surname, String username, String password, int usertype)
    {
        super(name, surname, username, password, usertype);
        teamEmployeesArraylist = new ArrayList<>();
    }
    
    public void addEmployee(String uName,String uSurname,String uUsername,String uPassword,int uCTime) 
    {
        Employee newEmployee = new Employee (uName,uSurname,uUsername,uPassword,uCTime,this.getUsername());
        teamEmployeesArraylist.add(newEmployee); 
        allEmployees.add(newEmployee);
        Database.exportDb();
    }
    
    public void setEmployee(int userIndex, String newName, String newSurname, String newPassword)
    {
        teamEmployeesArraylist.get(userIndex).setName(newName); 
        teamEmployeesArraylist.get(userIndex).setSurname(newSurname); 
        teamEmployeesArraylist.get(userIndex).setPassword(newPassword);
        Database.exportDb();
    }
}
