package com.alibaba.sdk.android.oss.model;

import com.google.type.bACG.scNRoQgKSYX;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public enum CannedAccessControlList {
    Private(scNRoQgKSYX.FGiewPBAmN),
    PublicRead("public-read"),
    PublicReadWrite("public-read-write"),
    Default("default");

    private String ACLString;

    CannedAccessControlList(String str) {
        this.ACLString = str;
    }

    public static CannedAccessControlList parseACL(String str) {
        for (CannedAccessControlList cannedAccessControlList : values()) {
            if (cannedAccessControlList.toString().equals(str)) {
                return cannedAccessControlList;
            }
        }
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.ACLString;
    }
}
