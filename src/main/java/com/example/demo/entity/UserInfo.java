package com.example.demo.entity;

public class UserInfo {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_userinfo.user_id
     *
     * @mbggenerated Mon May 06 12:09:49 CST 2019
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_userinfo.username
     *
     * @mbggenerated Mon May 06 12:09:49 CST 2019
     */
    private String username;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_userinfo.password
     *
     * @mbggenerated Mon May 06 12:09:49 CST 2019
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_userinfo.role_id
     *
     * @mbggenerated Mon May 06 12:09:49 CST 2019
     */
    private Integer roleId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_userinfo.telephone
     *
     * @mbggenerated Mon May 06 12:09:49 CST 2019
     */
    private String telephone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_userinfo.score
     *
     * @mbggenerated Mon May 06 12:09:49 CST 2019
     */
    private Float score;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_userinfo.user_id
     *
     * @return the value of t_userinfo.user_id
     *
     * @mbggenerated Mon May 06 12:09:49 CST 2019
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_userinfo.user_id
     *
     * @param userId the value for t_userinfo.user_id
     *
     * @mbggenerated Mon May 06 12:09:49 CST 2019
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_userinfo.username
     *
     * @return the value of t_userinfo.username
     *
     * @mbggenerated Mon May 06 12:09:49 CST 2019
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_userinfo.username
     *
     * @param username the value for t_userinfo.username
     *
     * @mbggenerated Mon May 06 12:09:49 CST 2019
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_userinfo.password
     *
     * @return the value of t_userinfo.password
     *
     * @mbggenerated Mon May 06 12:09:49 CST 2019
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_userinfo.password
     *
     * @param password the value for t_userinfo.password
     *
     * @mbggenerated Mon May 06 12:09:49 CST 2019
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_userinfo.role_id
     *
     * @return the value of t_userinfo.role_id
     *
     * @mbggenerated Mon May 06 12:09:49 CST 2019
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_userinfo.role_id
     *
     * @param roleId the value for t_userinfo.role_id
     *
     * @mbggenerated Mon May 06 12:09:49 CST 2019
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_userinfo.telephone
     *
     * @return the value of t_userinfo.telephone
     *
     * @mbggenerated Mon May 06 12:09:49 CST 2019
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_userinfo.telephone
     *
     * @param telephone the value for t_userinfo.telephone
     *
     * @mbggenerated Mon May 06 12:09:49 CST 2019
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_userinfo.score
     *
     * @return the value of t_userinfo.score
     *
     * @mbggenerated Mon May 06 12:09:49 CST 2019
     */
    public Float getScore() {
        return score;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_userinfo.score
     *
     * @param score the value for t_userinfo.score
     *
     * @mbggenerated Mon May 06 12:09:49 CST 2019
     */
    public void setScore(Float score) {
        this.score = score;
    }
}