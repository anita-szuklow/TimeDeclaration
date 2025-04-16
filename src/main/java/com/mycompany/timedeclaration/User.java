package com.mycompany.timedeclaration;
import java.util.ArrayList;

public class User 
{
    public static ArrayList<Employee> allEmployees = new ArrayList<>();
    public static ArrayList<Manager> allManagers = new ArrayList<>();
    
    private String name;
    private String surname;
    private String username;
    private String password;
    public final int userType;
    public boolean loginAccepted = false;
    
    public User(String name, String surname, String username, String password, int userType)
    {
        this.name = name;
        this.surname = surname;
        this.username = username;
        this.password = password;
        this.userType = userType;
        this.loginAccepted = false;
    }
    
    public void changePassword(String passwordNew)
    {
        this.password = passwordNew;
        Database.exportDb();
    }
    
    public boolean validityCheck(String tryField) {
    // Sprawdzenie długości imienia
        if (tryField.length() >= 1 && tryField.length() <= 20) {
            if (Character.isUpperCase(tryField.charAt(0))) {
                if (tryField.substring(1).matches("[a-z]+")) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean usernameCheck(String usernameTry) {
        boolean unique = false;
        if (usernameTry.length() >= 1 && usernameTry.length() <= 15) {
            if (usernameTry.matches("[a-zA-Z0-9]+")) {
                unique = true;
                for (Employee employee : Employee.allEmployees)
                    if (usernameTry.equalsIgnoreCase(employee.getUsername())) unique = false;
                for (Manager manager : Manager.allManagers)
                    if (usernameTry.equalsIgnoreCase(manager.getUsername())) unique = false;
            }
        }
        return unique;
    }
    
    public boolean isValidPassword(String password) {
        if (password.length() >= 8 && password.length() <= 20) {
            if (password.matches(".*[A-Z].*") && password.matches(".*[a-z].*") && password.matches(".*\\d.*")) {
                if (!password.matches("[^a-zA-Z0-9]+")) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public void setSurname(String surname)
    {
        this.surname = surname;
    }
    
    public void setUsername(String username)
    {
        this.username = username;
    }   
    
    public void setPassword(String password)
    {
        this.password = password;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public String getSurname()
    {
        return this.surname;
    }
    
    public String getUsername()
    {
        return this.username;
    }
    
    public String getPassword()
    {
        return this.password;
    }
    
    public int getUserType()
    {
        return this.userType;
    }
    
    public boolean getLoginAccepted()
    {
        return this.loginAccepted;
    }
}