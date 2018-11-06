package cn.law.ssm.bean;

public class User {
    private Long id;
    private String username;
    private String password;
    private String gender;
    private Integer age;
    private String sign;
    private String address;
    private String mobile;
    private Boolean validate;
    private String registration_platform;
    private String registration_time;
    private String token;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Boolean getValidate() {
        return validate;
    }

    public void setValidate(Boolean validate) {
        this.validate = validate;
    }

    public String getRegistration_platform() {
        return registration_platform;
    }

    public void setRegistration_platform(String registration_platform) {
        this.registration_platform = registration_platform;
    }

    public String getRegistration_time() {
        return registration_time;
    }

    public void setRegistration_time(String registration_time) {
        this.registration_time = registration_time;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", sign='" + sign + '\'' +
                ", address='" + address + '\'' +
                ", mobile='" + mobile + '\'' +
                ", validate=" + validate +
                ", registration_platform='" + registration_platform + '\'' +
                ", registration_time='" + registration_time + '\'' +
                '}';
    }
}
