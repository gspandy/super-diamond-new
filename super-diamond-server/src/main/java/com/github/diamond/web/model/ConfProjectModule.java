package com.github.diamond.web.model;

public class ConfProjectModule {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column conf_project_module.MODULE_ID
     *
     * @mbggenerated Fri May 01 20:25:16 CST 2015
     */
    private Long moduleId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column conf_project_module.PROJ_ID
     *
     * @mbggenerated Fri May 01 20:25:16 CST 2015
     */
    private Long projId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column conf_project_module.MODULE_NAME
     *
     * @mbggenerated Fri May 01 20:25:16 CST 2015
     */
    private String moduleName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column conf_project_module.MODULE_ID
     *
     * @return the value of conf_project_module.MODULE_ID
     *
     * @mbggenerated Fri May 01 20:25:16 CST 2015
     */
    public Long getModuleId() {
        return moduleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column conf_project_module.MODULE_ID
     *
     * @param moduleId the value for conf_project_module.MODULE_ID
     *
     * @mbggenerated Fri May 01 20:25:16 CST 2015
     */
    public void setModuleId(Long moduleId) {
        this.moduleId = moduleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column conf_project_module.PROJ_ID
     *
     * @return the value of conf_project_module.PROJ_ID
     *
     * @mbggenerated Fri May 01 20:25:16 CST 2015
     */
    public Long getProjId() {
        return projId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column conf_project_module.PROJ_ID
     *
     * @param projId the value for conf_project_module.PROJ_ID
     *
     * @mbggenerated Fri May 01 20:25:16 CST 2015
     */
    public void setProjId(Long projId) {
        this.projId = projId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column conf_project_module.MODULE_NAME
     *
     * @return the value of conf_project_module.MODULE_NAME
     *
     * @mbggenerated Fri May 01 20:25:16 CST 2015
     */
    public String getModuleName() {
        return moduleName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column conf_project_module.MODULE_NAME
     *
     * @param moduleName the value for conf_project_module.MODULE_NAME
     *
     * @mbggenerated Fri May 01 20:25:16 CST 2015
     */
    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    @Override
    public String toString() {
        return "ConfProjectModule{" +
                "moduleId=" + moduleId +
                ", projId=" + projId +
                ", moduleName='" + moduleName + '\'' +
                '}';
    }
}