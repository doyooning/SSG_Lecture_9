package java_basic_02.welcomeProject;

public class Guest {
    String userName;
    String userMobile;

    public Guest(String userName, String userMobile) {
        this.userName = userName;
        this.userMobile = userMobile;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserMobile() {
        return userMobile;
    }

    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile;
    }
}
