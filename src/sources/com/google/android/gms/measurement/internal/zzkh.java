package com.google.android.gms.measurement.internal;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzkh implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f13261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzlj f13262b;

    public zzkh(zzlj zzljVar, long j11) {
        this.f13261a = j11;
        this.f13262b = zzljVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzlj zzljVar = this.f13262b;
        zzljVar.g();
        zzljVar.h();
        zzic zzicVar = zzljVar.f13202a;
        zzgu zzguVar = zzicVar.f13099f;
        zzic.m(zzguVar);
        zzguVar.m.a("Resetting analytics data (FE)");
        zzoc zzocVar = zzicVar.f13101h;
        zzic.l(zzocVar);
        zzocVar.g();
        zzoa zzoaVar = zzocVar.f13539f;
        zzoaVar.f13533c.c();
        zzoaVar.f13534d.f13202a.f13104k.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        zzoaVar.f13531a = jElapsedRealtime;
        zzoaVar.f13532b = jElapsedRealtime;
        zzicVar.r().l();
        boolean z11 = !zzicVar.d();
        zzhh zzhhVar = zzicVar.f13098e;
        zzic.k(zzhhVar);
        zzhhVar.f13023f.b(this.f13261a);
        zzic zzicVar2 = zzhhVar.f13202a;
        zzhh zzhhVar2 = zzicVar2.f13098e;
        zzic.k(zzhhVar2);
        if (!TextUtils.isEmpty(zzhhVar2.f13038v.a())) {
            zzhhVar.f13038v.b(null);
        }
        zzhhVar.f13032p.b(0L);
        zzhhVar.f13033q.b(0L);
        if (!zzicVar2.f13097d.u()) {
            zzhhVar.o(z11);
        }
        zzhhVar.f13039w.b(null);
        zzhhVar.f13040x.b(0L);
        zzhhVar.f13041y.b(null);
        zznl zznlVarP = zzicVar.p();
        zznlVarP.g();
        zznlVarP.h();
        zzr zzrVarW = zznlVarP.w(false);
        zznlVarP.s();
        zznlVarP.f13202a.o().k();
        zznlVarP.u(new zzmh(zznlVarP, zzrVarW));
        zzic.l(zzocVar);
        zzocVar.f13538e.a();
        zzljVar.f13338r = z11;
        zzicVar.p().k(new AtomicReference());
    }
}
