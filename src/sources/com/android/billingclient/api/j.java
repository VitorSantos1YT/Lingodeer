package com.android.billingclient.api;

import com.google.android.gms.internal.play_billing.zzc;
import com.tbruyelle.rxpermissions3.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f7521c;

    public static i a() {
        i iVar = new i();
        iVar.f7516b = 0;
        iVar.f7517c = BuildConfig.VERSION_NAME;
        return iVar;
    }

    public final String toString() {
        return defpackage.e.n("Response Code: ", zzc.g(this.f7519a), ", Debug Message: ", this.f7521c);
    }
}
