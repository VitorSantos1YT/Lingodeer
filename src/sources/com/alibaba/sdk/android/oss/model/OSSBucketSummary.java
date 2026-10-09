package com.alibaba.sdk.android.oss.model;

import ep.a;
import java.util.Date;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class OSSBucketSummary {
    private CannedAccessControlList acl;
    public Date createDate;
    public String extranetEndpoint;
    public String intranetEndpoint;
    public String location;
    public String name;
    public Owner owner;
    public String storageClass;

    public String getAcl() {
        CannedAccessControlList cannedAccessControlList = this.acl;
        if (cannedAccessControlList != null) {
            return cannedAccessControlList.toString();
        }
        return null;
    }

    public void setAcl(String str) {
        this.acl = CannedAccessControlList.parseACL(str);
    }

    public String toString() {
        if (this.storageClass == null) {
            StringBuilder sb2 = new StringBuilder("OSSBucket [name=");
            sb2.append(this.name);
            sb2.append(", creationDate=");
            sb2.append(this.createDate);
            sb2.append(", owner=");
            sb2.append(this.owner.toString());
            sb2.append(", location=");
            return a.k(sb2, this.location, "]");
        }
        StringBuilder sb3 = new StringBuilder("OSSBucket [name=");
        sb3.append(this.name);
        sb3.append(", creationDate=");
        sb3.append(this.createDate);
        sb3.append(", owner=");
        sb3.append(this.owner.toString());
        sb3.append(", location=");
        sb3.append(this.location);
        sb3.append(", storageClass=");
        return a.k(sb3, this.storageClass, "]");
    }
}
