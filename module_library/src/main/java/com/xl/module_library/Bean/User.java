package com.xl.module_library.Bean;

import java.util.List;

public class User {


    /**
     * userList : [{"birthday":"2017-12-15","password":"123546","address":"sdf","sex":"男","id":1,"username":"akuma"},{"birthday":"2017-12-15","password":"123546","address":"sdf","sex":"男","id":1,"username":"akuma"}]
     * userCount : 2
     */

    private String userCount;
    private List<UserListBean> userList;

    public String getUserCount() {
        return userCount;
    }

    public void setUserCount(String userCount) {
        this.userCount = userCount;
    }

    public List<UserListBean> getUserList() {
        return userList;
    }

    public void setUserList(List<UserListBean> userList) {
        this.userList = userList;
    }

    public static class UserListBean {
        /**
         * birthday : 2017-12-15
         * password : 123546
         * address : sdf
         * sex : 男
         * id : 1
         * username : akuma
         */

        private String birthday;
        private String password;
        private String address;
        private String sex;
        private int id;
        private String username;

        public String getBirthday() {
            return birthday;
        }

        public void setBirthday(String birthday) {
            this.birthday = birthday;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getSex() {
            return sex;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        @Override
        public String toString() {
            return "UserListBean{" +
                    "birthday='" + birthday + '\'' +
                    ", password='" + password + '\'' +
                    ", address='" + address + '\'' +
                    ", sex='" + sex + '\'' +
                    ", id=" + id +
                    ", username='" + username + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "userCount='" + userCount + '\'' +
                ", userList=" + userList +
                '}';
    }
}
