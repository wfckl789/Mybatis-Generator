package com.example.mybatisgenerator.model;

import java.io.Serializable;
import java.util.Date;

public class ActRuTask implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ACT_RU_TASK.ID_
     *
     * @mbg.generated Wed Jan 04 15:39:59 CST 2023
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ACT_RU_TASK.REV_
     *
     * @mbg.generated Wed Jan 04 15:39:59 CST 2023
     */
    private Integer rev;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ACT_RU_TASK.EXECUTION_ID_
     *
     * @mbg.generated Wed Jan 04 15:39:59 CST 2023
     */
    private String executionId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ACT_RU_TASK.PROC_INST_ID_
     *
     * @mbg.generated Wed Jan 04 15:39:59 CST 2023
     */
    private String procInstId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ACT_RU_TASK.PROC_DEF_ID_
     *
     * @mbg.generated Wed Jan 04 15:39:59 CST 2023
     */
    private String procDefId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ACT_RU_TASK.NAME_
     *
     * @mbg.generated Wed Jan 04 15:39:59 CST 2023
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ACT_RU_TASK.PARENT_TASK_ID_
     *
     * @mbg.generated Wed Jan 04 15:39:59 CST 2023
     */
    private String parentTaskId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ACT_RU_TASK.DESCRIPTION_
     *
     * @mbg.generated Wed Jan 04 15:39:59 CST 2023
     */
    private String description;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ACT_RU_TASK.TASK_DEF_KEY_
     *
     * @mbg.generated Wed Jan 04 15:39:59 CST 2023
     */
    private String taskDefKey;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ACT_RU_TASK.OWNER_
     *
     * @mbg.generated Wed Jan 04 15:39:59 CST 2023
     */
    private String owner;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ACT_RU_TASK.ASSIGNEE_
     *
     * @mbg.generated Wed Jan 04 15:39:59 CST 2023
     */
    private String assignee;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ACT_RU_TASK.DELEGATION_
     *
     * @mbg.generated Wed Jan 04 15:39:59 CST 2023
     */
    private String delegation;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ACT_RU_TASK.PRIORITY_
     *
     * @mbg.generated Wed Jan 04 15:39:59 CST 2023
     */
    private Integer priority;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ACT_RU_TASK.CREATE_TIME_
     *
     * @mbg.generated Wed Jan 04 15:39:59 CST 2023
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ACT_RU_TASK.DUE_DATE_
     *
     * @mbg.generated Wed Jan 04 15:39:59 CST 2023
     */
    private Date dueDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ACT_RU_TASK.CATEGORY_
     *
     * @mbg.generated Wed Jan 04 15:39:59 CST 2023
     */
    private String category;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ACT_RU_TASK.SUSPENSION_STATE_
     *
     * @mbg.generated Wed Jan 04 15:39:59 CST 2023
     */
    private Integer suspensionState;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ACT_RU_TASK.TENANT_ID_
     *
     * @mbg.generated Wed Jan 04 15:39:59 CST 2023
     */
    private String tenantId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ACT_RU_TASK.FORM_KEY_
     *
     * @mbg.generated Wed Jan 04 15:39:59 CST 2023
     */
    private String formKey;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ACT_RU_TASK.CLAIM_TIME_
     *
     * @mbg.generated Wed Jan 04 15:39:59 CST 2023
     */
    private Date claimTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ACT_RU_TASK
     *
     * @mbg.generated Wed Jan 04 15:39:59 CST 2023
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ACT_RU_TASK.ID_
     *
     * @return the value of ACT_RU_TASK.ID_
     *
     * @mbg.generated Wed Jan 04 15:39:59 CST 2023
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ACT_RU_TASK.ID_
     *
     * @param id the value for ACT_RU_TASK.ID_
     *
     * @mbg.generated Wed Jan 04 15:39:59 CST 2023
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ACT_RU_TASK.REV_
     *
     * @return the value of ACT_RU_TASK.REV_
     *
     * @mbg.generated Wed Jan 04 15:39:59 CST 2023
     */
    public Integer getRev() {
        return rev;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ACT_RU_TASK.REV_
     *
     * @param rev the value for ACT_RU_TASK.REV_
     *
     * @mbg.generated Wed Jan 04 15:39:59 CST 2023
     */
    public void setRev(Integer rev) {
        this.rev = rev;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ACT_RU_TASK.EXECUTION_ID_
     *
     * @return the value of ACT_RU_TASK.EXECUTION_ID_
     *
     * @mbg.generated Wed Jan 04 15:39:59 CST 2023
     */
    public String getExecutionId() {
        return executionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ACT_RU_TASK.EXECUTION_ID_
     *
     * @param executionId the value for ACT_RU_TASK.EXECUTION_ID_
     *
     * @mbg.generated Wed Jan 04 15:39:59 CST 2023
     */
    public void setExecutionId(String executionId) {
        this.executionId = executionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ACT_RU_TASK.PROC_INST_ID_
     *
     * @return the value of ACT_RU_TASK.PROC_INST_ID_
     *
     * @mbg.generated Wed Jan 04 15:39:59 CST 2023
     */
    public String getProcInstId() {
        return procInstId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ACT_RU_TASK.PROC_INST_ID_
     *
     * @param procInstId the value for ACT_RU_TASK.PROC_INST_ID_
     *
     * @mbg.generated Wed Jan 04 15:39:59 CST 2023
     */
    public void setProcInstId(String procInstId) {
        this.procInstId = procInstId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ACT_RU_TASK.PROC_DEF_ID_
     *
     * @return the value of ACT_RU_TASK.PROC_DEF_ID_
     *
     * @mbg.generated Wed Jan 04 15:39:59 CST 2023
     */
    public String getProcDefId() {
        return procDefId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ACT_RU_TASK.PROC_DEF_ID_
     *
     * @param procDefId the value for ACT_RU_TASK.PROC_DEF_ID_
     *
     * @mbg.generated Wed Jan 04 15:39:59 CST 2023
     */
    public void setProcDefId(String procDefId) {
        this.procDefId = procDefId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ACT_RU_TASK.NAME_
     *
     * @return the value of ACT_RU_TASK.NAME_
     *
     * @mbg.generated Wed Jan 04 15:39:59 CST 2023
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ACT_RU_TASK.NAME_
     *
     * @param name the value for ACT_RU_TASK.NAME_
     *
     * @mbg.generated Wed Jan 04 15:39:59 CST 2023
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ACT_RU_TASK.PARENT_TASK_ID_
     *
     * @return the value of ACT_RU_TASK.PARENT_TASK_ID_
     *
     * @mbg.generated Wed Jan 04 15:39:59 CST 2023
     */
    public String getParentTaskId() {
        return parentTaskId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ACT_RU_TASK.PARENT_TASK_ID_
     *
     * @param parentTaskId the value for ACT_RU_TASK.PARENT_TASK_ID_
     *
     * @mbg.generated Wed Jan 04 15:39:59 CST 2023
     */
    public void setParentTaskId(String parentTaskId) {
        this.parentTaskId = parentTaskId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ACT_RU_TASK.DESCRIPTION_
     *
     * @return the value of ACT_RU_TASK.DESCRIPTION_
     *
     * @mbg.generated Wed Jan 04 15:39:59 CST 2023
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ACT_RU_TASK.DESCRIPTION_
     *
     * @param description the value for ACT_RU_TASK.DESCRIPTION_
     *
     * @mbg.generated Wed Jan 04 15:39:59 CST 2023
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ACT_RU_TASK.TASK_DEF_KEY_
     *
     * @return the value of ACT_RU_TASK.TASK_DEF_KEY_
     *
     * @mbg.generated Wed Jan 04 15:39:59 CST 2023
     */
    public String getTaskDefKey() {
        return taskDefKey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ACT_RU_TASK.TASK_DEF_KEY_
     *
     * @param taskDefKey the value for ACT_RU_TASK.TASK_DEF_KEY_
     *
     * @mbg.generated Wed Jan 04 15:39:59 CST 2023
     */
    public void setTaskDefKey(String taskDefKey) {
        this.taskDefKey = taskDefKey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ACT_RU_TASK.OWNER_
     *
     * @return the value of ACT_RU_TASK.OWNER_
     *
     * @mbg.generated Wed Jan 04 15:39:59 CST 2023
     */
    public String getOwner() {
        return owner;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ACT_RU_TASK.OWNER_
     *
     * @param owner the value for ACT_RU_TASK.OWNER_
     *
     * @mbg.generated Wed Jan 04 15:39:59 CST 2023
     */
    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ACT_RU_TASK.ASSIGNEE_
     *
     * @return the value of ACT_RU_TASK.ASSIGNEE_
     *
     * @mbg.generated Wed Jan 04 15:39:59 CST 2023
     */
    public String getAssignee() {
        return assignee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ACT_RU_TASK.ASSIGNEE_
     *
     * @param assignee the value for ACT_RU_TASK.ASSIGNEE_
     *
     * @mbg.generated Wed Jan 04 15:39:59 CST 2023
     */
    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ACT_RU_TASK.DELEGATION_
     *
     * @return the value of ACT_RU_TASK.DELEGATION_
     *
     * @mbg.generated Wed Jan 04 15:39:59 CST 2023
     */
    public String getDelegation() {
        return delegation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ACT_RU_TASK.DELEGATION_
     *
     * @param delegation the value for ACT_RU_TASK.DELEGATION_
     *
     * @mbg.generated Wed Jan 04 15:39:59 CST 2023
     */
    public void setDelegation(String delegation) {
        this.delegation = delegation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ACT_RU_TASK.PRIORITY_
     *
     * @return the value of ACT_RU_TASK.PRIORITY_
     *
     * @mbg.generated Wed Jan 04 15:39:59 CST 2023
     */
    public Integer getPriority() {
        return priority;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ACT_RU_TASK.PRIORITY_
     *
     * @param priority the value for ACT_RU_TASK.PRIORITY_
     *
     * @mbg.generated Wed Jan 04 15:39:59 CST 2023
     */
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ACT_RU_TASK.CREATE_TIME_
     *
     * @return the value of ACT_RU_TASK.CREATE_TIME_
     *
     * @mbg.generated Wed Jan 04 15:39:59 CST 2023
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ACT_RU_TASK.CREATE_TIME_
     *
     * @param createTime the value for ACT_RU_TASK.CREATE_TIME_
     *
     * @mbg.generated Wed Jan 04 15:39:59 CST 2023
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ACT_RU_TASK.DUE_DATE_
     *
     * @return the value of ACT_RU_TASK.DUE_DATE_
     *
     * @mbg.generated Wed Jan 04 15:39:59 CST 2023
     */
    public Date getDueDate() {
        return dueDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ACT_RU_TASK.DUE_DATE_
     *
     * @param dueDate the value for ACT_RU_TASK.DUE_DATE_
     *
     * @mbg.generated Wed Jan 04 15:39:59 CST 2023
     */
    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ACT_RU_TASK.CATEGORY_
     *
     * @return the value of ACT_RU_TASK.CATEGORY_
     *
     * @mbg.generated Wed Jan 04 15:39:59 CST 2023
     */
    public String getCategory() {
        return category;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ACT_RU_TASK.CATEGORY_
     *
     * @param category the value for ACT_RU_TASK.CATEGORY_
     *
     * @mbg.generated Wed Jan 04 15:39:59 CST 2023
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ACT_RU_TASK.SUSPENSION_STATE_
     *
     * @return the value of ACT_RU_TASK.SUSPENSION_STATE_
     *
     * @mbg.generated Wed Jan 04 15:39:59 CST 2023
     */
    public Integer getSuspensionState() {
        return suspensionState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ACT_RU_TASK.SUSPENSION_STATE_
     *
     * @param suspensionState the value for ACT_RU_TASK.SUSPENSION_STATE_
     *
     * @mbg.generated Wed Jan 04 15:39:59 CST 2023
     */
    public void setSuspensionState(Integer suspensionState) {
        this.suspensionState = suspensionState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ACT_RU_TASK.TENANT_ID_
     *
     * @return the value of ACT_RU_TASK.TENANT_ID_
     *
     * @mbg.generated Wed Jan 04 15:39:59 CST 2023
     */
    public String getTenantId() {
        return tenantId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ACT_RU_TASK.TENANT_ID_
     *
     * @param tenantId the value for ACT_RU_TASK.TENANT_ID_
     *
     * @mbg.generated Wed Jan 04 15:39:59 CST 2023
     */
    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ACT_RU_TASK.FORM_KEY_
     *
     * @return the value of ACT_RU_TASK.FORM_KEY_
     *
     * @mbg.generated Wed Jan 04 15:39:59 CST 2023
     */
    public String getFormKey() {
        return formKey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ACT_RU_TASK.FORM_KEY_
     *
     * @param formKey the value for ACT_RU_TASK.FORM_KEY_
     *
     * @mbg.generated Wed Jan 04 15:39:59 CST 2023
     */
    public void setFormKey(String formKey) {
        this.formKey = formKey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ACT_RU_TASK.CLAIM_TIME_
     *
     * @return the value of ACT_RU_TASK.CLAIM_TIME_
     *
     * @mbg.generated Wed Jan 04 15:39:59 CST 2023
     */
    public Date getClaimTime() {
        return claimTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ACT_RU_TASK.CLAIM_TIME_
     *
     * @param claimTime the value for ACT_RU_TASK.CLAIM_TIME_
     *
     * @mbg.generated Wed Jan 04 15:39:59 CST 2023
     */
    public void setClaimTime(Date claimTime) {
        this.claimTime = claimTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ACT_RU_TASK
     *
     * @mbg.generated Wed Jan 04 15:39:59 CST 2023
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", rev=").append(rev);
        sb.append(", executionId=").append(executionId);
        sb.append(", procInstId=").append(procInstId);
        sb.append(", procDefId=").append(procDefId);
        sb.append(", name=").append(name);
        sb.append(", parentTaskId=").append(parentTaskId);
        sb.append(", description=").append(description);
        sb.append(", taskDefKey=").append(taskDefKey);
        sb.append(", owner=").append(owner);
        sb.append(", assignee=").append(assignee);
        sb.append(", delegation=").append(delegation);
        sb.append(", priority=").append(priority);
        sb.append(", createTime=").append(createTime);
        sb.append(", dueDate=").append(dueDate);
        sb.append(", category=").append(category);
        sb.append(", suspensionState=").append(suspensionState);
        sb.append(", tenantId=").append(tenantId);
        sb.append(", formKey=").append(formKey);
        sb.append(", claimTime=").append(claimTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}