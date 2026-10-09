package com.google.android.gms.measurement.internal;

import android.app.ActivityManager;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.common.util.DefaultClock;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzob {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzoc f13535a;

    public zzob(zzoc zzocVar) {
        this.f13535a = zzocVar;
    }

    public final void a() {
        long jElapsedRealtime;
        zzoc zzocVar = this.f13535a;
        zzocVar.g();
        zzic zzicVar = zzocVar.f13202a;
        zzhh zzhhVar = zzicVar.f13098e;
        zzic.k(zzhhVar);
        DefaultClock defaultClock = zzicVar.f13104k;
        defaultClock.getClass();
        if (zzhhVar.p(System.currentTimeMillis())) {
            zzhh zzhhVar2 = zzicVar.f13098e;
            zzic.k(zzhhVar2);
            zzhhVar2.f13029l.b(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                zzgu zzguVar = zzicVar.f13099f;
                zzic.m(zzguVar);
                zzguVar.f12949n.a("Detected application was in foreground");
                defaultClock.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (zzicVar.f13097d.r(null, zzfy.e1)) {
                    defaultClock.getClass();
                    jElapsedRealtime = SystemClock.elapsedRealtime();
                } else {
                    jElapsedRealtime = 0;
                }
                c(jCurrentTimeMillis, jElapsedRealtime);
            }
        }
    }

    public final void b(long j11, long j12) {
        zzoc zzocVar = this.f13535a;
        zzocVar.g();
        zzocVar.k();
        zzic zzicVar = zzocVar.f13202a;
        zzhh zzhhVar = zzicVar.f13098e;
        zzic.k(zzhhVar);
        if (zzhhVar.p(j11)) {
            zzic.k(zzhhVar);
            zzhhVar.f13029l.b(true);
            zzicVar.r().l();
        }
        zzic.k(zzhhVar);
        zzhhVar.f13032p.b(j11);
        if (zzhhVar.f13029l.a()) {
            c(j11, j12);
        }
    }

    public final void c(long j11, long j12) {
        zzoc zzocVar = this.f13535a;
        zzocVar.g();
        zzic zzicVar = zzocVar.f13202a;
        if (zzicVar.d()) {
            zzhh zzhhVar = zzicVar.f13098e;
            zzic.k(zzhhVar);
            zzhhVar.f13032p.b(j11);
            zzicVar.f13104k.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            zzgu zzguVar = zzicVar.f13099f;
            zzic.m(zzguVar);
            zzguVar.f12949n.b(Long.valueOf(jElapsedRealtime), "Session started, time");
            long j13 = j11 / 1000;
            Long lValueOf = Long.valueOf(j13);
            zzlj zzljVar = zzicVar.m;
            zzic.l(zzljVar);
            zzljVar.r(j11, lValueOf, "auto", "_sid");
            zzic.k(zzhhVar);
            zzhhVar.f13033q.b(j13);
            zzhhVar.f13029l.b(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", j13);
            zzic.l(zzljVar);
            zzljVar.o(j11, j12, bundle, "auto", "_s");
            String strA = zzhhVar.f13038v.a();
            if (TextUtils.isEmpty(strA)) {
                return;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("_ffr", strA);
            zzic.l(zzljVar);
            zzljVar.o(j11, j12, bundle2, "auto", "_ssr");
        }
    }
}
