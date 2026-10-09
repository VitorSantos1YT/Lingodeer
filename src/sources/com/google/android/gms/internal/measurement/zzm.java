package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzm extends zzai {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzo f11731c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzm(zzn zznVar, zzo zzoVar) {
        super("getValue");
        this.f11731c = zzoVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzai
    public final zzao a(zzg zzgVar, List list) {
        zzh.a(2, "getValue", list);
        zzao zzaoVarB = zzgVar.f11600b.b(zzgVar, (zzao) list.get(0));
        zzao zzaoVarB2 = zzgVar.f11600b.b(zzgVar, (zzao) list.get(1));
        String strZza = this.f11731c.zza(zzaoVarB.zzc());
        return strZza != null ? new zzas(strZza) : zzaoVarB2;
    }
}
