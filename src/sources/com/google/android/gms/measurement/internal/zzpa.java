package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DefaultClock;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzpa implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f13579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f13580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Bundle f13581c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zzpb f13582d;

    public zzpa(zzpb zzpbVar, String str, String str2, Bundle bundle) {
        this.f13579a = str;
        this.f13580b = str2;
        this.f13581c = bundle;
        this.f13582d = zzpbVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        long jElapsedRealtime;
        zzpg zzpgVar = this.f13582d.f13583a;
        zzpp zzppVarL0 = zzpgVar.l0();
        ((DefaultClock) zzpgVar.c()).getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (zzpgVar.f0().r(null, zzfy.e1)) {
            ((DefaultClock) zzpgVar.c()).getClass();
            jElapsedRealtime = SystemClock.elapsedRealtime();
        } else {
            jElapsedRealtime = 0;
        }
        zzbh zzbhVarO = zzppVarL0.O(this.f13580b, this.f13581c, "auto", jCurrentTimeMillis, jElapsedRealtime, false);
        Preconditions.g(zzbhVarO);
        zzpgVar.h(zzbhVarO, this.f13579a);
    }
}
