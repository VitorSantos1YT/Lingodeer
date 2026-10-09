package com.google.firebase.database.core;

import com.tbruyelle.rxpermissions3.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class RepoInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f19281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f19282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f19283c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || RepoInfo.class != obj.getClass()) {
            return false;
        }
        RepoInfo repoInfo = (RepoInfo) obj;
        if (this.f19282b == repoInfo.f19282b && this.f19281a.equals(repoInfo.f19281a)) {
            return this.f19283c.equals(repoInfo.f19283c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f19283c.hashCode() + (((this.f19281a.hashCode() * 31) + (this.f19282b ? 1 : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("http");
        sb2.append(this.f19282b ? "s" : BuildConfig.VERSION_NAME);
        sb2.append("://");
        sb2.append(this.f19281a);
        return sb2.toString();
    }
}
