package com.google.firebase.database.connection;

import com.tbruyelle.rxpermissions3.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class HostInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f19069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f19070c;

    public HostInfo(String str, String str2, boolean z11) {
        this.f19068a = str;
        this.f19069b = str2;
        this.f19070c = z11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("http");
        sb2.append(this.f19070c ? "s" : BuildConfig.VERSION_NAME);
        sb2.append("://");
        sb2.append(this.f19068a);
        return sb2.toString();
    }
}
