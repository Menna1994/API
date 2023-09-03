package resources;

import pojo.RegisterPojo;

public class TestDataBuild {
    public RegisterPojo registerData(String email, String password){
        RegisterPojo register = new RegisterPojo();
        register.setEmail("");
        register.setPassword("");
        return register ;

    }
}
