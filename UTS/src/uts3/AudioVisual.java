package uts3;

import java.beans.DefaultPersistenceDelegate;

public class AudioVisual extends Resource {
    String Production_Company;
    String type;
    Integer year_of_release;

    public String getProduction_Company() {
        return Production_Company;
    }
    public void setProduction_Company(String production_Company) {
        Production_Company = production_Company;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public Integer getYear_of_release() {
        return year_of_release;
    }
    public void setYear_of_release(Integer year_of_release) {
        this.year_of_release = year_of_release;
    }
   
    @Override
   public void setDue_date(String due_date) {
       // TODO Auto-generated method stub
       super.setDue_date(due_date);
   }
}
