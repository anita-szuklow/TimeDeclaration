package com.mycompany.timedeclaration;
import java.util.ArrayList;

public class TimeSheet
{
    public ArrayList<Time> workTimeByWeeks;
    public int vacationAllowed;
    public int vacationUsed;
    
    public TimeSheet(Employee e1)
    {
        workTimeByWeeks = new ArrayList<>(14);
            for (int i = 0; i<14; i++)
            {
                workTimeByWeeks.add(new Time("Undefined",i+1,e1));   
                workTimeByWeeks.get(i).setDescription(i+1);
                workTimeByWeeks.get(i).setDueHours(e1.getContractTime());
            }
        switch (e1.getContractTime())
                {
                    case 10: this.vacationAllowed = 14; break;
                    case 20: this.vacationAllowed = 28; break;
                    case 30: this.vacationAllowed = 42; break;
                    default: this.vacationAllowed = 56; break; //+4 godziny co tydzien, mamy 14 tygodni
                    }
        this.vacationUsed = 0;
    }
   
    public int getVacationAllowed() {
        return vacationAllowed;
    }

    public void setVacationAllowed(int vacationAllowed) {
        this.vacationAllowed = vacationAllowed;
    }

    public int getVacationUsed() {
        return vacationUsed;
    }

    public void setVacationUsed(int vacationUsed) {
        this.vacationUsed = vacationUsed;
    }
}