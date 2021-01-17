package org.spt.firstmybatissinglesource.Entity;

import java.io.Serializable;
import java.util.Date;

public class FlywaySchemaHistory implements Serializable {
    private Integer installed_rank;

    private String version;

    private String description;

    private String type;

    private String script;

    private Integer checksum;

    private String installed_by;

    private Date installed_on;

    private Integer execution_time;

    private Boolean success;

    private static final long serialVersionUID = 1L;

    public Integer getInstalled_rank() {
        return installed_rank;
    }

    public void setInstalled_rank(Integer installed_rank) {
        this.installed_rank = installed_rank;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getScript() {
        return script;
    }

    public void setScript(String script) {
        this.script = script == null ? null : script.trim();
    }

    public Integer getChecksum() {
        return checksum;
    }

    public void setChecksum(Integer checksum) {
        this.checksum = checksum;
    }

    public String getInstalled_by() {
        return installed_by;
    }

    public void setInstalled_by(String installed_by) {
        this.installed_by = installed_by == null ? null : installed_by.trim();
    }

    public Date getInstalled_on() {
        return installed_on;
    }

    public void setInstalled_on(Date installed_on) {
        this.installed_on = installed_on;
    }

    public Integer getExecution_time() {
        return execution_time;
    }

    public void setExecution_time(Integer execution_time) {
        this.execution_time = execution_time;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", installed_rank=").append(installed_rank);
        sb.append(", version=").append(version);
        sb.append(", description=").append(description);
        sb.append(", type=").append(type);
        sb.append(", script=").append(script);
        sb.append(", checksum=").append(checksum);
        sb.append(", installed_by=").append(installed_by);
        sb.append(", installed_on=").append(installed_on);
        sb.append(", execution_time=").append(execution_time);
        sb.append(", success=").append(success);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}