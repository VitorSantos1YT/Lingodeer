package com.alibaba.sdk.android.oss.model;

import com.tbruyelle.rxpermissions3.BuildConfig;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class Owner implements Serializable {
    private static final long serialVersionUID = -1942759024112448066L;
    private String displayName;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private String f7441id;

    public Owner() {
        this(null, null);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Owner)) {
            return false;
        }
        Owner owner = (Owner) obj;
        String id2 = owner.getId();
        String displayName = owner.getDisplayName();
        String id3 = getId();
        String displayName2 = getDisplayName();
        if (id2 == null) {
            id2 = BuildConfig.VERSION_NAME;
        }
        if (displayName == null) {
            displayName = BuildConfig.VERSION_NAME;
        }
        if (id3 == null) {
            id3 = BuildConfig.VERSION_NAME;
        }
        if (displayName2 == null) {
            displayName2 = BuildConfig.VERSION_NAME;
        }
        return id2.equals(id3) && displayName.equals(displayName2);
    }

    public String getDisplayName() {
        return this.displayName;
    }

    public String getId() {
        return this.f7441id;
    }

    public int hashCode() {
        String str = this.f7441id;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public void setDisplayName(String str) {
        this.displayName = str;
    }

    public void setId(String str) {
        this.f7441id = str;
    }

    public String toString() {
        return "Owner [name=" + getDisplayName() + ",id=" + getId() + "]";
    }

    public Owner(String str, String str2) {
        this.f7441id = str;
        this.displayName = str2;
    }
}
