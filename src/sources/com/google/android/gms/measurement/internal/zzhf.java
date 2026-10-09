package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzhf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13011b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f13012c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f13013d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zzhh f13014e;

    public /* synthetic */ zzhf(zzhh zzhhVar, long j11) {
        this.f13014e = zzhhVar;
        Preconditions.d("health_monitor");
        Preconditions.b(j11 > 0);
        this.f13010a = "health_monitor:start";
        this.f13011b = "health_monitor:count";
        this.f13012c = "health_monitor:value";
        this.f13013d = j11;
    }

    public final void a() {
        zzhh zzhhVar = this.f13014e;
        zzhhVar.g();
        zzhhVar.f13202a.f13104k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor editorEdit = zzhhVar.k().edit();
        editorEdit.remove(this.f13011b);
        editorEdit.remove(this.f13012c);
        editorEdit.putLong(this.f13010a, jCurrentTimeMillis);
        editorEdit.apply();
    }
}
