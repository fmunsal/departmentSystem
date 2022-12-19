package staff;

import academic.Department;
import area.Area;

import java.util.ArrayList;

public class StaffSecurity extends Staff {
    private ArrayList<Area> workingPlace;
    public StaffSecurity(String identificationNumber, String name, String surname, Department department, int workingHours, String taskInformation) {
        super(identificationNumber, name, surname, department, workingHours, taskInformation);
        workingPlace = new ArrayList<Area>();

    }

    public ArrayList<Area> getWorkingPlace() {
        return workingPlace;
    }
    /*
    * GirişYapildi
    * CikisYapildi
    * KatKontrolEdildi
    * AcilDurum(Yer)
    * */
}
