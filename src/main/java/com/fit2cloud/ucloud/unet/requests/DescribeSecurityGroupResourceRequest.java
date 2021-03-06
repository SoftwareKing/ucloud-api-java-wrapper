
package com.fit2cloud.ucloud.unet.requests;

import com.fit2cloud.ucloud.Request;

/**
 * Created with IntelliJ IDEA.
 * User: chilaoqi
 * Date: 7/28/15
 * Time: 1:47 PM
 * Email: xqiang.chi@samsung.com
 */
public class DescribeSecurityGroupResourceRequest extends Request {
    private String Region;
    private Integer GroupId;


    public void setRegion(String Region) {
        this.Region = Region;
    }

    public String getRegion() {
        return Region;
    }

    public void setGroupId(Integer GroupId) {
        this.GroupId = GroupId;
    }

    public int getGroupId() {
        return GroupId;
    }

    @Override
    public String toString() {
        return "DescribeSecurityGroupResourceRequest{" +
                "Region='" + Region + '\'' +
                ", GroupId=" + GroupId +
                '}';
    }
}
        