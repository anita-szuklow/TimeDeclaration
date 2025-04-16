package com.mycompany.timedeclaration;

public class Time
{
    
    private String description;
    private int number;
    private int dueHours;
    private int weekNumber;
    private int declaredHours;
    private int declaredSickTime;
    private int declaredVacation;
    public boolean entered;
    private boolean accepted;
    
    public Time(String description, int number, Employee e1)
    {
        this.description = description;
        this.number = number;
        this.dueHours = e1.getContractTime();
        this.declaredHours = 0;
        this.declaredSickTime = 0;
        this.declaredVacation = 0;
        this.accepted = false;
        this.entered = false;
    }
    
    public void setDescription(int weekNumber)
    {
        switch (weekNumber)
        {
            case 1: description = "27.11.2023-3.12.2023"; break;
            case 2: description = "4.12.2023-10.12.2023"; break;
            case 3: description = "11.12.2023-17.12.2023"; break;
            case 4: description = "18.12.2023-24.12.2023"; break;
            case 5: description = "25.12.2023-31.12.2023"; break;
            case 6: description = "1.01.2024-7.01.2024"; break;
            case 7: description = "8.01.2024-14.01.2024"; break;
            case 8: description = "15.01.2024-21.01.2024"; break;
            case 9: description = "22.01.2024-28.01.2024"; break;
            case 10: description = "29.01.2024-4.02.2024"; break;
            case 11: description = "5.02.2024-11.02.2024"; break;
            case 12: description = "12.02.2024-18.02.2024"; break;
            case 13: description = "19.02.2024-25.02.2024"; break;
            case 14: description = "26.02.2024-1.03.2024"; break;
            default: description = "Undefined"; break;
            //return description;
        }
    }

    public int getWeekNumber() {
        return weekNumber;
    }

    public void setWeekNumber(int weekNumber) {
        this.weekNumber = weekNumber;
    }
        
    public void setNumber(int number)
    {
        this.number = number;
    }
    public void setDueHours(int dueHours)
    {
        this.dueHours = dueHours;
    }
    public void setDeclaredHours(int declaredHours)
    {
        this.declaredHours = declaredHours;
    }
    public void setAccepted(boolean accepted)
    {
        this.accepted = accepted;
    }
    public String getDescription()
    {
        return this.description;
    }
    public int getNumber()
    {
        return this.number;
    }
    public int getDueHours()
    {
        return this.dueHours;
    }
    public int getDeclaredHours()
    {
        return this.declaredHours;
    }
    public boolean getAccepted()
    {
        return this.accepted;
    }

    public int getDeclaredSickTime() {
        return declaredSickTime;
    }

    public void setDeclaredSickTime(int declaredSickTime) {
        this.declaredSickTime = declaredSickTime;
    }

    public int getDeclaredVacation() {
        return declaredVacation;
    }

    public void setDeclaredVacation(int declaredVacation) {
        this.declaredVacation = declaredVacation;
    }

    public boolean isEntered() {
        return entered;
    }

    public void setEntered(boolean entered) {
        this.entered = entered;
    }
    
    
    
}