package com.example.tbdapp.activities;

import android.net.Uri;
import android.provider.MediaStore;

public class UserInformation {
    public Uri photo ;
    public String name = "Jane Foster";
    public String dateOfBirth = "1996-09-04";
    public String email = "Janefoster@tdb.com" ;
    public String provinceText = "Ontario";
    public String citizenshipText = "Permanent Resident";
    public String employmentStatusText = "Unemployed";
    public String expectedIncomeText = "$10,000";
    public String housingStatusText = "Tenant" ;
    public String healthConditionText = "None";
    public String lookingForText = "A financial adviser";

    public UserInformation(){
    }

    public UserInformation(Uri photo, String name, String dateOfBirth, String email, String province, String citizenship, String employmentStatus, String expectedIncome, String housingStatus, String healthCondition, String lookingFor
    ){
        this.photo = photo;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.employmentStatusText = employmentStatus;
        this.provinceText = province;
        this.citizenshipText = citizenship;
        this.healthConditionText = healthCondition;
        this.housingStatusText = housingStatus;
        this.lookingForText = lookingFor;
        this.expectedIncomeText = expectedIncome;
    }

    public String getName(){

        return name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public String getCitizenship() {
        return citizenshipText;
    }

    public String getEmploymentStatus() {
        return employmentStatusText;
    }

    public String getExpectedIncome() {
        return expectedIncomeText;
    }

    public String getHealthCondition() {
        return healthConditionText;
    }

    public String getHousingStatus() {
        return housingStatusText;
    }

    public String getLookingFor() {
        return lookingForText;
    }

    public String getProvince() {
        return provinceText;
    }
}
