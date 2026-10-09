package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzjy implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f13235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzlj f13236b;

    public zzjy(zzlj zzljVar, boolean z11) {
        this.f13235a = z11;
        Objects.requireNonNull(zzljVar);
        this.f13236b = zzljVar;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004c  */
    @Override // java.lang.Runnable
    public final void run() {
        zzlj zzljVar = this.f13236b;
        zzic zzicVar = zzljVar.f13202a;
        boolean zD = zzicVar.d();
        boolean z11 = false;
        boolean z12 = zzicVar.f13117y != null && zzicVar.f13117y.booleanValue();
        boolean z13 = this.f13235a;
        zzicVar.f13117y = Boolean.valueOf(z13);
        if (z12 == z13) {
            zzgu zzguVar = zzicVar.f13099f;
            zzic.m(zzguVar);
            zzguVar.f12949n.b(Boolean.valueOf(z13), "Default data collection state already set to");
        }
        if (zzicVar.d() != zD) {
            boolean zD2 = zzicVar.d();
            if (zzicVar.f13117y != null && zzicVar.f13117y.booleanValue()) {
                z11 = true;
            }
            if (zD2 != z11) {
                zzgu zzguVar2 = zzicVar.f13099f;
                zzic.m(zzguVar2);
                zzguVar2.f12947k.c(Boolean.valueOf(z13), Boolean.valueOf(zD), "Default data collection is different than actual status");
            }
        } else {
            zzgu zzguVar3 = zzicVar.f13099f;
            zzic.m(zzguVar3);
            zzguVar3.f12947k.c(Boolean.valueOf(z13), Boolean.valueOf(zD), "Default data collection is different than actual status");
        }
        zzljVar.E();
    }
}
