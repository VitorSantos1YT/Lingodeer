package com.google.android.gms.measurement.internal;

import android.content.Context;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zznx implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f13523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f13524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzny f13525c;

    public zznx(zzny zznyVar, long j11, long j12) {
        Objects.requireNonNull(zznyVar);
        this.f13525c = zznyVar;
        this.f13523a = j11;
        this.f13524b = j12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzhz zzhzVar = this.f13525c.f13527b.f13202a.f13100g;
        zzic.m(zzhzVar);
        zzhzVar.p(new Runnable() { // from class: com.google.android.gms.measurement.internal.zznw
            /* JADX WARN: Code duplicated, block: B:10:0x007c  */
            @Override // java.lang.Runnable
            public final void run() {
                zznx zznxVar = this.f13522a;
                zzoc zzocVar = zznxVar.f13525c.f13527b;
                zzocVar.g();
                zzic zzicVar = zzocVar.f13202a;
                zzgu zzguVar = zzicVar.f13099f;
                Context context = zzicVar.f13094a;
                zzic.m(zzguVar);
                zzguVar.m.a("Application going to the background");
                zzhh zzhhVar = zzicVar.f13098e;
                zzic.k(zzhhVar);
                zzhhVar.f13035s.b(true);
                zzocVar.g();
                zzocVar.f13537d = true;
                zzal zzalVar = zzicVar.f13097d;
                if (!zzalVar.v()) {
                    long j11 = zznxVar.f13524b;
                    zzoa zzoaVar = zzocVar.f13539f;
                    zzoaVar.a(j11, false, false);
                    zzoaVar.f13533c.c();
                }
                long j12 = zznxVar.f13523a;
                zzic.m(zzguVar);
                zzguVar.f12948l.b(Long.valueOf(j12), "Application backgrounded at: timestamp_millis");
                zzlj zzljVar = zzicVar.m;
                zzic.l(zzljVar);
                zzljVar.g();
                zzic zzicVar2 = zzljVar.f13202a;
                zzljVar.h();
                zznl zznlVarP = zzicVar2.p();
                zznlVarP.g();
                zznlVarP.h();
                if (zznlVarP.n()) {
                    zzpp zzppVar = zznlVarP.f13202a.f13102i;
                    zzic.k(zzppVar);
                    if (zzppVar.S() >= 242600) {
                        zznl zznlVarP2 = zzicVar2.p();
                        zznlVarP2.g();
                        zznlVarP2.h();
                        zznlVarP2.u(new zzml(zznlVarP2, zznlVarP2.w(true)));
                    }
                } else {
                    zznl zznlVarP3 = zzicVar2.p();
                    zznlVarP3.g();
                    zznlVarP3.h();
                    zznlVarP3.u(new zzml(zznlVarP3, zznlVarP3.w(true)));
                }
                if (zzalVar.r(null, zzfy.N0)) {
                    zzpp zzppVar2 = zzicVar.f13102i;
                    zzic.k(zzppVar2);
                    long jO = zzppVar2.M(context.getPackageName(), zzalVar.f12629c) ? 1000L : zzalVar.o(context.getPackageName(), zzfy.E);
                    zzic.m(zzguVar);
                    zzguVar.f12949n.b(Long.valueOf(jO), "[sgtm] Scheduling batch upload with minimum latency in millis");
                    zzic.j(zzicVar.f13113u);
                    zzicVar.f13113u.k(jO);
                }
            }
        });
    }
}
