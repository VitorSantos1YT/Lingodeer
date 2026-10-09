package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzkm implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.internal.measurement.zzcs f13276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzlj f13277b;

    public zzkm(zzlj zzljVar, com.google.android.gms.internal.measurement.zzcs zzcsVar) {
        this.f13276a = zzcsVar;
        Objects.requireNonNull(zzljVar);
        this.f13277b = zzljVar;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0058  */
    /* JADX WARN: Code duplicated, block: B:21:0x0065 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    public final void run() {
        Long lValueOf;
        com.google.android.gms.internal.measurement.zzcs zzcsVar;
        zzlj zzljVar = this.f13277b;
        zzic zzicVar = zzljVar.f13202a;
        zzic zzicVar2 = zzljVar.f13202a;
        zzoc zzocVar = zzicVar.f13101h;
        zzic.l(zzocVar);
        zzic zzicVar3 = zzocVar.f13202a;
        zzhh zzhhVar = zzicVar3.f13098e;
        zzic.k(zzhhVar);
        if (zzhhVar.n().i(zzjk.ANALYTICS_STORAGE)) {
            zzic.k(zzhhVar);
            zzhe zzheVar = zzhhVar.f13033q;
            zzicVar3.f13104k.getClass();
            if (!zzhhVar.p(System.currentTimeMillis()) && zzheVar.a() != 0) {
                lValueOf = Long.valueOf(zzheVar.a());
            }
            zzcsVar = this.f13276a;
            if (lValueOf == null) {
                zzpp zzppVar = zzicVar2.f13102i;
                zzic.k(zzppVar);
                zzppVar.V(zzcsVar, lValueOf.longValue());
            } else {
                try {
                    zzcsVar.A0(null);
                    return;
                } catch (RemoteException e8) {
                    zzgu zzguVar = zzicVar2.f13099f;
                    zzic.m(zzguVar);
                    zzguVar.f12942f.b(e8, "getSessionId failed with exception");
                    return;
                }
            }
        }
        zzgu zzguVar2 = zzicVar3.f13099f;
        zzic.m(zzguVar2);
        zzguVar2.f12947k.a("Analytics storage consent denied; will not get session id");
        lValueOf = null;
        zzcsVar = this.f13276a;
        if (lValueOf == null) {
            zzcsVar.A0(null);
            return;
        }
        zzpp zzppVar2 = zzicVar2.f13102i;
        zzic.k(zzppVar2);
        zzppVar2.V(zzcsVar, lValueOf.longValue());
    }
}
