package com.fit2cloud.ucloud.uhost.model;

/**
 * Created by chixq on 8/12/15.
 */
public class DiskSet {
    private String Type;
    private String DiskId;
    private String Size;

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getDiskId() {
        return DiskId;
    }

    public void setDiskId(String diskId) {
        DiskId = diskId;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String size) {
        Size = size;
    }

    @Override
    public String toString() {
        return "DiskSet{" +
                "Type='" + Type + '\'' +
                ", DiskId='" + DiskId + '\'' +
                ", Size='" + Size + '\'' +
                '}';
    }
}
