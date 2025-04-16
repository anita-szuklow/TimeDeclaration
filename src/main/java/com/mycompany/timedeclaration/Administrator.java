package com.mycompany.timedeclaration;

public class Administrator extends Manager
{
    public Administrator()
    {
        super("admin", "admin", "admin", "admin123",3);
    }
    
    public void addManager(String uName, String uSurname, String uUsername, String uPassword) 
    {
        Manager newManager = new Manager (uName,uSurname,uUsername,uPassword,2);
        allManagers.add(newManager);
        Database.exportDb();
    }
    
    public void setManager(String uUsername, String uName, String uSurname, String uPassword) 
    {
        for (int i=0; i<allManagers.size(); i++)
        {
            if (uUsername.equalsIgnoreCase(allManagers.get(i).getUsername()))
            {
                allManagers.get(i).setName(uName);
                allManagers.get(i).setSurname(uSurname);
                allManagers.get(i).setPassword(uPassword);
            }
        }
        Database.exportDb();
    }    
    
    public void moveUser(String uUsername, String nManager) 
    {
        int oldManager = 0;
        for (int i=0; i<allEmployees.size(); i++)
        {
            if (uUsername.equalsIgnoreCase(allEmployees.get(i).getUsername()))
            {
                allEmployees.get(i).setTeamPlacement(nManager);
                for (int j=0; j<allManagers.get(oldManager).teamEmployeesArraylist.size(); j++) 
                    if (allManagers.get(oldManager).teamEmployeesArraylist.get(j).getUsername().equalsIgnoreCase(uUsername)) 
                        allManagers.get(oldManager).teamEmployeesArraylist.remove(j);
                for (int j=0; j<allManagers.size(); j++)
                    if (allManagers.get(j).getUsername().equalsIgnoreCase(nManager))
                        allManagers.get(j).teamEmployeesArraylist.add(allEmployees.get(i));
            }
        }
    }
    
    public void setEmployee(String uUsername, String newName, String newSurname, String newPassword, String nManager)
    {
        for (int i=0; i<allEmployees.size(); i++)
        {
            if (allEmployees.get(i).getUsername().equalsIgnoreCase(uUsername)) 
            {
                allEmployees.get(i).setName(newName); 
                allEmployees.get(i).setSurname(newSurname); 
                allEmployees.get(i).setPassword(newPassword);
                moveUser(uUsername, nManager);
            }
            
        }
        Database.exportDb();
    }
    
    public void removeManager(String uUsername)
    {
        for (int i=0; i<allManagers.size(); i++)
            {
                if (uUsername.equalsIgnoreCase(allManagers.get(i).getUsername())) 
                {
                    allManagers.remove(i);
                }
            }
        Database.exportDb();
    }
    
    public void removeEmployee(String uUsername)
    {
        for (int i=0; i<allEmployees.size(); i++)
            {
                if (uUsername.equalsIgnoreCase(allEmployees.get(i).getUsername())) 
                {
                    for (int j=0; j<allManagers.size(); j++)
                        if (allEmployees.get(i).getTeamPlacement().equalsIgnoreCase(allManagers.get(j).getUsername()))
                            for (int k=0; k<allManagers.get(j).teamEmployeesArraylist.size(); k++)
                                if (uUsername.equalsIgnoreCase(allManagers.get(j).teamEmployeesArraylist.get(k).getUsername())) 
                                     allManagers.get(j).teamEmployeesArraylist.remove(k);
                    allEmployees.remove(i);
                }
            }
        Database.exportDb();
    }
}

