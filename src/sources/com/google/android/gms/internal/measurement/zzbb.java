package com.google.android.gms.internal.measurement;

import b7.e0;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzbb extends zzav {
    public zzbb() {
        this.f11459a.add(zzbk.AND);
        this.f11459a.add(zzbk.NOT);
        this.f11459a.add(zzbk.OR);
    }

    @Override // com.google.android.gms.internal.measurement.zzav
    public final zzao a(String str, zzg zzgVar, ArrayList arrayList) {
        zzbk zzbkVar = zzbk.ADD;
        int iOrdinal = zzh.e(str).ordinal();
        if (iOrdinal == 1) {
            zzao zzaoVarB = zzgVar.f11600b.b(zzgVar, (zzao) e0.j(zzbk.AND, 2, arrayList, 0));
            if (!zzaoVarB.zze().booleanValue()) {
                return zzaoVarB;
            }
            return zzgVar.f11600b.b(zzgVar, (zzao) arrayList.get(1));
        }
        if (iOrdinal == 47) {
            return new zzaf(Boolean.valueOf(!zzgVar.f11600b.b(zzgVar, (zzao) e0.j(zzbk.NOT, 1, arrayList, 0)).zze().booleanValue()));
        }
        if (iOrdinal != 50) {
            b(str);
            throw null;
        }
        zzao zzaoVarB2 = zzgVar.f11600b.b(zzgVar, (zzao) e0.j(zzbk.OR, 2, arrayList, 0));
        if (zzaoVarB2.zze().booleanValue()) {
            return zzaoVarB2;
        }
        return zzgVar.f11600b.b(zzgVar, (zzao) arrayList.get(1));
    }
}
