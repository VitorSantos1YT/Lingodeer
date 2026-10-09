package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzkt implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzba f13289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzlj f13290b;

    public zzkt(zzlj zzljVar, zzba zzbaVar) {
        this.f13289a = zzbaVar;
        this.f13290b = zzljVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzlj zzljVar = this.f13290b;
        zzic zzicVar = zzljVar.f13202a;
        zzhh zzhhVar = zzicVar.f13098e;
        zzgu zzguVar = zzicVar.f13099f;
        zzic.k(zzhhVar);
        zzhhVar.g();
        zzhhVar.g();
        zzba zzbaVarB = zzba.b(zzhhVar.k().getString("dma_consent_settings", null));
        zzba zzbaVar = this.f13289a;
        int i11 = zzbaVar.f12675a;
        if (!zzjl.l(i11, zzbaVarB.f12675a)) {
            zzic.m(zzguVar);
            zzguVar.f12948l.b(Integer.valueOf(i11), "Lower precedence consent source ignored, proposed source");
            return;
        }
        SharedPreferences.Editor editorEdit = zzhhVar.k().edit();
        editorEdit.putString("dma_consent_settings", zzbaVar.f12676b);
        editorEdit.apply();
        zzic.m(zzguVar);
        zzguVar.f12949n.b(zzbaVar, "Setting DMA consent(FE)");
        zzic zzicVar2 = zzljVar.f13202a;
        if (zzicVar2.p().q()) {
            final zznl zznlVarP = zzicVar2.p();
            zznlVarP.g();
            zznlVarP.h();
            zznlVarP.u(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzng
                @Override // java.lang.Runnable
                public final void run() {
                    zznl zznlVar = zznlVarP;
                    zzic zzicVar3 = zznlVar.f13202a;
                    zzgb zzgbVar = zznlVar.f13489d;
                    if (zzgbVar == null) {
                        zzgu zzguVar2 = zzicVar3.f13099f;
                        zzic.m(zzguVar2);
                        zzguVar2.f12942f.a("Failed to send Dma consent settings to service");
                        return;
                    }
                    try {
                        zzgbVar.q0(zznlVar.w(false));
                        zznlVar.t();
                    } catch (RemoteException e8) {
                        zzgu zzguVar3 = zzicVar3.f13099f;
                        zzic.m(zzguVar3);
                        zzguVar3.f12942f.b(e8, "Failed to send Dma consent settings to the service");
                    }
                }
            });
            return;
        }
        zznl zznlVarP2 = zzicVar2.p();
        zznlVarP2.g();
        zznlVarP2.h();
        if (zznlVarP2.p()) {
            zznlVarP2.u(new zzms(zznlVarP2, zznlVarP2.w(false)));
        }
    }
}
