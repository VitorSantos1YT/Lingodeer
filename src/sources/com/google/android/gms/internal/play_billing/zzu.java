package com.google.android.gms.internal.play_billing;

import com.android.billingclient.api.c0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzu {
    public static zzcz a(c0 c0Var) {
        zzp zzpVar = new zzp();
        zzt zztVar = new zzt(zzpVar);
        zzpVar.f12487b = zztVar;
        zzpVar.f12486a = c0.class;
        try {
            c0Var.l(zzpVar);
            zzpVar.f12486a = "billingOverrideService.getBillingOverride";
            return zztVar;
        } catch (Exception e8) {
            zzg zzgVar = new zzg(e8);
            zzd zzdVar = zzo.f12481f;
            zzo zzoVar = zztVar.f12491b;
            if (zzdVar.d(zzoVar, null, zzgVar)) {
                zzo.b(zzoVar);
            }
            return zztVar;
        }
    }
}
