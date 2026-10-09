package com.google.android.gms.measurement.internal;

import android.os.SystemClock;
import com.google.android.gms.common.util.DefaultClock;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zznu implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f13518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzoc f13519b;

    public zznu(zzoc zzocVar, long j11) {
        this.f13518a = j11;
        Objects.requireNonNull(zzocVar);
        this.f13519b = zzocVar;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0055  */
    @Override // java.lang.Runnable
    public final void run() {
        long jElapsedRealtime;
        zzoc zzocVar = this.f13519b;
        zzoa zzoaVar = zzocVar.f13539f;
        zzocVar.g();
        zzocVar.k();
        zzic zzicVar = zzocVar.f13202a;
        zzgu zzguVar = zzicVar.f13099f;
        zzic.m(zzguVar);
        zzgs zzgsVar = zzguVar.f12949n;
        long j11 = this.f13518a;
        zzgsVar.b(Long.valueOf(j11), "Activity resumed, time");
        zzal zzalVar = zzicVar.f13097d;
        if (zzalVar.r(null, zzfy.S0)) {
            if (zzalVar.v() || zzocVar.f13537d) {
                zzoaVar.f13534d.g();
                zzoaVar.f13533c.c();
                zzoaVar.f13531a = j11;
                zzoaVar.f13532b = j11;
            }
        } else if (zzalVar.v()) {
            zzoaVar.f13534d.g();
            zzoaVar.f13533c.c();
            zzoaVar.f13531a = j11;
            zzoaVar.f13532b = j11;
        } else {
            zzhh zzhhVar = zzicVar.f13098e;
            zzic.k(zzhhVar);
            if (zzhhVar.f13035s.a()) {
                zzoaVar.f13534d.g();
                zzoaVar.f13533c.c();
                zzoaVar.f13531a = j11;
                zzoaVar.f13532b = j11;
            }
        }
        zzny zznyVar = zzocVar.f13540g;
        zzoc zzocVar2 = zznyVar.f13527b;
        zzocVar2.g();
        zznx zznxVar = zznyVar.f13526a;
        if (zznxVar != null) {
            zzocVar2.f13536c.removeCallbacks(zznxVar);
        }
        zzhh zzhhVar2 = zzocVar2.f13202a.f13098e;
        zzic.k(zzhhVar2);
        zzhhVar2.f13035s.b(false);
        zzocVar2.g();
        zzocVar2.f13537d = false;
        zzob zzobVar = zzocVar.f13538e;
        zzoc zzocVar3 = zzobVar.f13535a;
        zzocVar3.g();
        zzic zzicVar2 = zzocVar3.f13202a;
        boolean zD = zzicVar2.d();
        DefaultClock defaultClock = zzicVar2.f13104k;
        if (zD) {
            defaultClock.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (zzicVar2.f13097d.r(null, zzfy.e1)) {
                defaultClock.getClass();
                jElapsedRealtime = SystemClock.elapsedRealtime();
            } else {
                jElapsedRealtime = 0;
            }
            zzobVar.b(jCurrentTimeMillis, jElapsedRealtime);
        }
    }
}
