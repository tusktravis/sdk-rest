package com.bullhornsdk.data.model.entity.file;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.Size;

/**
 * @author Murray
 * @since 11/08/2017
 */
public abstract class EntityFileAttachmentExtended extends EntityFileAttachment {

    @Size(max = 8)
    private String distribution;

    @Size(max = 15)
    private String fileType;

    private Boolean isCopied;

    private Boolean isPrivate;

    private Boolean isSendOut;

    @JsonProperty("distribution")
    public String getDistribution() {
        return distribution;
    }

    @JsonProperty("distribution")
    public void setDistribution(String distribution) {
        this.distribution = distribution;
    }

    @JsonProperty("fileType")
    public String getFileType() {
        return fileType;
    }

    @JsonProperty("fileType")
    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    @JsonProperty("isCopied")
    public Boolean getCopied() {
        return isCopied;
    }

    @JsonProperty("isCopied")
    public void setCopied(Boolean isCopied) {
        this.isCopied = isCopied;
    }

    @JsonProperty("isPrivate")
    public Boolean getPrivate() {
        return isPrivate;
    }

    @JsonProperty("isPrivate")
    public void setPrivate(Boolean isPrivate) {
        this.isPrivate = isPrivate;
    }

    @JsonProperty("isSendOut")
    public Boolean getSendOut() {
        return isSendOut;
    }

    @JsonProperty("isSendOut")
    public void setSendOut(Boolean isSendOut) {
        this.isSendOut = isSendOut;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        EntityFileAttachmentExtended that = (EntityFileAttachmentExtended) o;

        if (distribution != null ? !distribution.equals(that.distribution) : that.distribution != null) return false;
        if (fileType != null ? !fileType.equals(that.fileType) : that.fileType != null) return false;
        if (isCopied != null ? !isCopied.equals(that.isCopied) : that.isCopied != null) return false;
        if (isPrivate != null ? !isPrivate.equals(that.isPrivate) : that.isPrivate != null) return false;
        return isSendOut != null ? isSendOut.equals(that.isSendOut) : that.isSendOut == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (distribution != null ? distribution.hashCode() : 0);
        result = 31 * result + (fileType != null ? fileType.hashCode() : 0);
        result = 31 * result + (isCopied != null ? isCopied.hashCode() : 0);
        result = 31 * result + (isPrivate != null ? isPrivate.hashCode() : 0);
        result = 31 * result + (isSendOut != null ? isSendOut.hashCode() : 0);
        return result;
    }
}
