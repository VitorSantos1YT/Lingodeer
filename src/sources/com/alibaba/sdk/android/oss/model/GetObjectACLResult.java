package com.alibaba.sdk.android.oss.model;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class GetObjectACLResult extends OSSResult {
    private CannedAccessControlList objectACL;
    private Owner objectOwner = new Owner();

    public String getObjectACL() {
        CannedAccessControlList cannedAccessControlList = this.objectACL;
        if (cannedAccessControlList != null) {
            return cannedAccessControlList.toString();
        }
        return null;
    }

    public String getObjectOwner() {
        return this.objectOwner.getDisplayName();
    }

    public String getObjectOwnerID() {
        return this.objectOwner.getId();
    }

    public Owner getOwner() {
        return this.objectOwner;
    }

    public void setObjectACL(String str) {
        this.objectACL = CannedAccessControlList.parseACL(str);
    }

    public void setObjectOwner(String str) {
        this.objectOwner.setDisplayName(str);
    }

    public void setObjectOwnerID(String str) {
        this.objectOwner.setId(str);
    }
}
