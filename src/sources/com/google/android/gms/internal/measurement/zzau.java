package com.google.android.gms.internal.measurement;

import b7.e0;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzau extends zzav {
    public zzau() {
        this.f11459a.add(zzbk.BITWISE_AND);
        this.f11459a.add(zzbk.BITWISE_LEFT_SHIFT);
        this.f11459a.add(zzbk.BITWISE_NOT);
        this.f11459a.add(zzbk.BITWISE_OR);
        this.f11459a.add(zzbk.BITWISE_RIGHT_SHIFT);
        this.f11459a.add(zzbk.BITWISE_UNSIGNED_RIGHT_SHIFT);
        this.f11459a.add(zzbk.BITWISE_XOR);
    }

    @Override // com.google.android.gms.internal.measurement.zzav
    public final zzao a(String str, zzg zzgVar, ArrayList arrayList) {
        zzbk zzbkVar = zzbk.ADD;
        switch (zzh.e(str).ordinal()) {
            case 4:
                return new zzah(Double.valueOf(zzh.g(zzgVar.f11600b.b(zzgVar, (zzao) e0.j(zzbk.BITWISE_AND, 2, arrayList, 0)).zzd().doubleValue()) & zzh.g(zzgVar.f11600b.b(zzgVar, (zzao) arrayList.get(1)).zzd().doubleValue())));
            case 5:
                return new zzah(Double.valueOf(zzh.g(zzgVar.f11600b.b(zzgVar, (zzao) e0.j(zzbk.BITWISE_LEFT_SHIFT, 2, arrayList, 0)).zzd().doubleValue()) << ((int) (((long) zzh.g(zzgVar.f11600b.b(zzgVar, (zzao) arrayList.get(1)).zzd().doubleValue())) & 31))));
            case 6:
                return new zzah(Double.valueOf(~zzh.g(zzgVar.f11600b.b(zzgVar, (zzao) e0.j(zzbk.BITWISE_NOT, 1, arrayList, 0)).zzd().doubleValue())));
            case 7:
                return new zzah(Double.valueOf(zzh.g(zzgVar.f11600b.b(zzgVar, (zzao) e0.j(zzbk.BITWISE_OR, 2, arrayList, 0)).zzd().doubleValue()) | zzh.g(zzgVar.f11600b.b(zzgVar, (zzao) arrayList.get(1)).zzd().doubleValue())));
            case 8:
                return new zzah(Double.valueOf(zzh.g(zzgVar.f11600b.b(zzgVar, (zzao) e0.j(zzbk.BITWISE_RIGHT_SHIFT, 2, arrayList, 0)).zzd().doubleValue()) >> ((int) (((long) zzh.g(zzgVar.f11600b.b(zzgVar, (zzao) arrayList.get(1)).zzd().doubleValue())) & 31))));
            case 9:
                return new zzah(Double.valueOf((((long) zzh.g(zzgVar.f11600b.b(zzgVar, (zzao) e0.j(zzbk.BITWISE_UNSIGNED_RIGHT_SHIFT, 2, arrayList, 0)).zzd().doubleValue())) & 4294967295L) >>> ((int) (((long) zzh.g(zzgVar.f11600b.b(zzgVar, (zzao) arrayList.get(1)).zzd().doubleValue())) & 31))));
            case 10:
                return new zzah(Double.valueOf(zzh.g(zzgVar.f11600b.b(zzgVar, (zzao) e0.j(zzbk.BITWISE_XOR, 2, arrayList, 0)).zzd().doubleValue()) ^ zzh.g(zzgVar.f11600b.b(zzgVar, (zzao) arrayList.get(1)).zzd().doubleValue())));
            default:
                b(str);
                throw null;
        }
    }
}
