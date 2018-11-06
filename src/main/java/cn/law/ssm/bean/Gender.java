package cn.law.ssm.bean;

public enum Gender {
    Female("F"), Male("M");

    private final String gender;

    Gender(String gender) {
        this.gender = gender;
    }
}
