package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzoa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f13531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f13532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zznz f13533c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zzoc f13534d;

    public zzoa(zzoc zzocVar) {
        this.f13534d = zzocVar;
        zzic zzicVar = zzocVar.f13202a;
        this.f13533c = new zznz(this, zzicVar);
        zzicVar.f13104k.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.f13531a = jElapsedRealtime;
        this.f13532b = jElapsedRealtime;
    }

    public final boolean a(long j11, boolean z11, boolean z12) {
        zzoc zzocVar = this.f13534d;
        zzocVar.g();
        zzocVar.h();
        zzic zzicVar = zzocVar.f13202a;
        boolean zD = zzicVar.d();
        zzgu zzguVar = zzicVar.f13099f;
        if (zD) {
            zzhh zzhhVar = zzicVar.f13098e;
            zzic.k(zzhhVar);
            zzhe zzheVar = zzhhVar.f13032p;
            zzicVar.f13104k.getClass();
            zzheVar.b(System.currentTimeMillis());
        }
        long j12 = j11 - this.f13531a;
        if (!z11 && j12 < 1000) {
            zzic.m(zzguVar);
            zzguVar.f12949n.b(Long.valueOf(j12), "Screen exposed for less than 1000 ms. Event not sent. time");
            return false;
        }
        if (!z12) {
            j12 = j11 - this.f13532b;
            this.f13532b = j11;
        }
        zzic.m(zzguVar);
        zzguVar.f12949n.b(Long.valueOf(j12), "Recording user engagement, ms");
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j12);
        boolean z13 = !zzicVar.f13097d.v();
        zzmb zzmbVar = zzicVar.f13105l;
        zzic.l(zzmbVar);
        zzpp.d0(zzmbVar.k(z13), bundle, true);
        if (!z12) {
            zzlj zzljVar = zzicVar.m;
            zzic.l(zzljVar);
            zzljVar.n("auto", "_e", bundle);
        }
        this.f13531a = j11;
        zznz zznzVar = this.f13533c;
        zznzVar.c();
        zznzVar.b(((Long) zzfy.f12874p0.a(null)).longValue());
        return true;
    }
}
