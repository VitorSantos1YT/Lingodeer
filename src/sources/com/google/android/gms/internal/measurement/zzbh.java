package com.google.android.gms.internal.measurement;

import b7.e0;
import com.google.protobuf.DescriptorProtos;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzbh extends zzav {
    public zzbh() {
        this.f11459a.add(zzbk.ADD);
        this.f11459a.add(zzbk.DIVIDE);
        this.f11459a.add(zzbk.MODULUS);
        this.f11459a.add(zzbk.MULTIPLY);
        this.f11459a.add(zzbk.NEGATE);
        this.f11459a.add(zzbk.POST_DECREMENT);
        this.f11459a.add(zzbk.POST_INCREMENT);
        this.f11459a.add(zzbk.PRE_DECREMENT);
        this.f11459a.add(zzbk.PRE_INCREMENT);
        this.f11459a.add(zzbk.SUBTRACT);
    }

    @Override // com.google.android.gms.internal.measurement.zzav
    public final zzao a(String str, zzg zzgVar, ArrayList arrayList) {
        zzbk zzbkVar = zzbk.ADD;
        int iOrdinal = zzh.e(str).ordinal();
        if (iOrdinal == 0) {
            zzao zzaoVarB = zzgVar.f11600b.b(zzgVar, (zzao) e0.j(zzbk.ADD, 2, arrayList, 0));
            zzao zzaoVarB2 = zzgVar.f11600b.b(zzgVar, (zzao) arrayList.get(1));
            if (!(zzaoVarB instanceof zzak) && !(zzaoVarB instanceof zzas) && !(zzaoVarB2 instanceof zzak) && !(zzaoVarB2 instanceof zzas)) {
                return new zzah(Double.valueOf(zzaoVarB2.zzd().doubleValue() + zzaoVarB.zzd().doubleValue()));
            }
            return new zzas(String.valueOf(zzaoVarB.zzc()).concat(String.valueOf(zzaoVarB2.zzc())));
        }
        if (iOrdinal == 21) {
            return new zzah(Double.valueOf(zzgVar.f11600b.b(zzgVar, (zzao) e0.j(zzbk.DIVIDE, 2, arrayList, 0)).zzd().doubleValue() / zzgVar.f11600b.b(zzgVar, (zzao) arrayList.get(1)).zzd().doubleValue()));
        }
        if (iOrdinal == 59) {
            zzao zzaoVarB3 = zzgVar.f11600b.b(zzgVar, (zzao) e0.j(zzbk.SUBTRACT, 2, arrayList, 0));
            zzah zzahVar = new zzah(Double.valueOf(-zzgVar.f11600b.b(zzgVar, (zzao) arrayList.get(1)).zzd().doubleValue()));
            return new zzah(Double.valueOf(zzahVar.f11371a.doubleValue() + zzaoVarB3.zzd().doubleValue()));
        }
        if (iOrdinal == 52 || iOrdinal == 53) {
            zzh.a(2, str, arrayList);
            zzao zzaoVarB4 = zzgVar.f11600b.b(zzgVar, (zzao) arrayList.get(0));
            zzgVar.a((zzao) arrayList.get(1));
            return zzaoVarB4;
        }
        if (iOrdinal == 55 || iOrdinal == 56) {
            zzh.a(1, str, arrayList);
            return zzgVar.f11600b.b(zzgVar, (zzao) arrayList.get(0));
        }
        switch (iOrdinal) {
            case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                return new zzah(Double.valueOf(zzgVar.f11600b.b(zzgVar, (zzao) e0.j(zzbk.MODULUS, 2, arrayList, 0)).zzd().doubleValue() % zzgVar.f11600b.b(zzgVar, (zzao) arrayList.get(1)).zzd().doubleValue()));
            case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                return new zzah(Double.valueOf(zzgVar.f11600b.b(zzgVar, (zzao) arrayList.get(1)).zzd().doubleValue() * zzgVar.f11600b.b(zzgVar, (zzao) e0.j(zzbk.MULTIPLY, 2, arrayList, 0)).zzd().doubleValue()));
            case 46:
                return new zzah(Double.valueOf(-zzgVar.f11600b.b(zzgVar, (zzao) e0.j(zzbk.NEGATE, 1, arrayList, 0)).zzd().doubleValue()));
            default:
                b(str);
                throw null;
        }
    }
}
