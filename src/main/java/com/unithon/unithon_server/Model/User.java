package com.unithon.unithon_server.Model;

public class User {

        private String email;
        private String id;
        private String password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User(){}
        public User(String email, String id, String password){
            this.email = email;
            this.id = id;
            this.password = password;
        }

}
