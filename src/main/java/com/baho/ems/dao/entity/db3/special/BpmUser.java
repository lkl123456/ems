package com.baho.ems.dao.entity.db3.special;

/**
 * @Description: bpm用户实体
 * @Date: 17:51 2019-08-07
 * @Author: YuanPeng
 * @Modifier:
 */
public class BpmUser {

    /**
     * 用户id
     */
    private String id;
    /**
     * 用户姓名
     */
    private String name;
    /**
     * 用户职位id
     */
    private String jobId;
    /**
     * 用户登录名
     */
    private String loginName;
    /**
     * 用户部门id
     */
    private String departmentId;
    /**
     * 用户部门名称
     */
    private String departmentName;
    /**
     * 用户职位名称
     */
    private String jobName;

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    @Override
    public String toString() {
        return "BpmUser{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", jobID='" + jobId + '\'' +
                ", loginName='" + loginName + '\'' +
                ", departmentID='" + departmentId + '\'' +
                ", departmentName='" + departmentName + '\'' +
                ", jobName='" + jobName + '\'' +
                '}';
    }
}
