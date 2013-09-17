/*
 * Index: 110099T
 */
package com.mycompany.mavenprojectnic;
import org.joda.time.*;
/**
 *
 * @author Madhawi
 */
public class NIC_Calc {
    private int year,month,date;
    private String gender;
    private boolean isVoter;
    private String IDnumber;
    private int numOfDays;
    private String birthday;
    DateTime date_time;
    
public NIC_Calc(String IDnumber){
    this.IDnumber=IDnumber;
    gender = new String();
}
    public String getGender() {
        return gender;
    }
    public boolean isIsVoter() {
        return isVoter;
    }
    public String getBirthday(){
        return birthday;
    }
    public String getIsVoter(){
        if(isIsVoter()){
            return "\nIs a voter of Sri Lanka";
        }
        else{
            return "\nIs not a voter of Sri Lanka";
        }         
    }
    public void findNumOfDays(){
        numOfDays= Integer.parseInt(IDnumber.substring(2,5));
    }
    public void findBirthday(){
        findNumOfDays();
        year=1900+Integer.parseInt(IDnumber.substring(0, 2));
        
        findGender();
        date_time= new DateTime(2012,1,1,0,0);
        date_time=date_time.plusDays(numOfDays-1);
        month=date_time.getMonthOfYear();
        date=date_time.getDayOfMonth();
        
        birthday= year +"-" +month+"-"+date;
        
       }
   public void findGender(){
        if(numOfDays>=500){
            gender="Female";
          
            numOfDays=numOfDays-500;
        }
        else{
            gender="Male";
        }
    }
    public void findIsVoter(){
        if(2013-year> 18 ){
            isVoter=true;
        }
        else{
            isVoter=false;
        }
    }
   
}
