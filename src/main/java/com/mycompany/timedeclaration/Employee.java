package com.mycompany.timedeclaration;

public class Employee extends User
{
    private int contractTime;
    public TimeSheet workTimeArraylist;
    private String teamPlacement; 
    private int allowedHolidays;
    private int usedHolidays;
    
    public Employee(String name, String surname, String username, String password, int contractTime, String teamPlacement)
    {
        super(name, surname, username, password, 1);
        this.contractTime = contractTime;
        workTimeArraylist = new TimeSheet(this);
        this.teamPlacement = teamPlacement;
    }

    public void addTimesheet(int weekNumber, int workHours, int sickHours, int holidayHours) 
    {
        workTimeArraylist.workTimeByWeeks.get(weekNumber).setDeclaredHours(workHours);
        workTimeArraylist.workTimeByWeeks.get(weekNumber).setDeclaredSickTime(sickHours);
        int newHolidays = holidayHours - workTimeArraylist.workTimeByWeeks.get(weekNumber).getDeclaredVacation(); 
        workTimeArraylist.workTimeByWeeks.get(weekNumber).setDeclaredVacation(holidayHours);
        workTimeArraylist.setVacationUsed(workTimeArraylist.getVacationUsed()+newHolidays);
        workTimeArraylist.setVacationAllowed(workTimeArraylist.getVacationAllowed()-newHolidays);
        workTimeArraylist.workTimeByWeeks.get(weekNumber).setEntered(true);
        Database.exportDb();
    }
    
    
    public void addTimesheet(int weekNumber, int workHours, int sickHours, int holidayHours, boolean accepted) // tylko do importu
    {
        workTimeArraylist.workTimeByWeeks.get(weekNumber).setDeclaredHours(workHours);
        workTimeArraylist.workTimeByWeeks.get(weekNumber).setDeclaredSickTime(sickHours);
        workTimeArraylist.workTimeByWeeks.get(weekNumber).setDeclaredVacation(holidayHours);
        workTimeArraylist.setVacationUsed(workTimeArraylist.getVacationUsed()+holidayHours);
        workTimeArraylist.setVacationAllowed(workTimeArraylist.getVacationAllowed()-holidayHours);
        workTimeArraylist.workTimeByWeeks.get(weekNumber).setEntered(true);
        workTimeArraylist.workTimeByWeeks.get(weekNumber).setAccepted(accepted);
    }
    
    public String getTimesheet()
        {
            StringBuilder s = new StringBuilder();               
            for (int i = 0; i<14; i++)
                {
                    if (workTimeArraylist.workTimeByWeeks.get(i).isEntered() == true)
                    {
                        s.append("Week ").append(workTimeArraylist.workTimeByWeeks.get(i).getDescription());
                        s.append("\nHours worked: ").append(workTimeArraylist.workTimeByWeeks.get(i).getDeclaredHours());
                        s.append(",  vacation hours: ").append(workTimeArraylist.workTimeByWeeks.get(i).getDeclaredVacation());
                        s.append(",  sick time hours: ").append(workTimeArraylist.workTimeByWeeks.get(i).getDeclaredSickTime());
                        if(workTimeArraylist.workTimeByWeeks.get(i).getAccepted()==true) s.append("\t|| Timesheet accepted\n\n");
                        else s.append("\t|| Timesheet not accepted\n\n");
                    }
                    else
                    {
                        s.append("\nWeek ").append(workTimeArraylist.workTimeByWeeks.get(i).getDescription()).append("\t\t\t|| Timesheet not entered yet\n\n");
                    }
                }
            StringBuilder append = s.append("\n").append(workTimeArraylist.getVacationAllowed()).append(" holiday hours left");
            return append.toString();

        }

    public int getContractTime() 
    {
        return contractTime;
    }

    public void setContractTime(int contractTime) 
    {
        this.contractTime = contractTime;
    }

    public TimeSheet getWorkTimeArraylist() 
    {
        return workTimeArraylist;
    }

    public void setWorkTimeArraylist(TimeSheet workTimeArraylist) 
    {
        this.workTimeArraylist = workTimeArraylist;
    }

    public String getTeamPlacement() 
    {
        return teamPlacement;
    }

    public void setTeamPlacement(String teamPlacement) 
    {
        this.teamPlacement = teamPlacement;
    }

    public int getAllowedHolidays() 
    {
        return allowedHolidays;
    }

    public void setAllowedHolidays(int allowedHolidays) 
    {
        this.allowedHolidays = allowedHolidays;
    }

    public int getUsedHolidays() 
    {
        return usedHolidays;
    }

    public void setUsedHolidays(int usedHolidays) 
    {
        this.usedHolidays = usedHolidays;
    }
}
