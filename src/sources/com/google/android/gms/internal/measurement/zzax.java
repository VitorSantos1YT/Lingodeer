package com.google.android.gms.internal.measurement;

import com.google.protobuf.DescriptorProtos;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzax extends zzav {
    public zzax() {
        this.f11459a.add(zzbk.EQUALS);
        this.f11459a.add(zzbk.GREATER_THAN);
        this.f11459a.add(zzbk.GREATER_THAN_EQUALS);
        this.f11459a.add(zzbk.IDENTITY_EQUALS);
        this.f11459a.add(zzbk.IDENTITY_NOT_EQUALS);
        this.f11459a.add(zzbk.LESS_THAN);
        this.f11459a.add(zzbk.LESS_THAN_EQUALS);
        this.f11459a.add(zzbk.NOT_EQUALS);
    }

    public static boolean c(zzao zzaoVar, zzao zzaoVar2) {
        if (zzaoVar instanceof zzak) {
            zzaoVar = new zzas(zzaoVar.zzc());
        }
        if (zzaoVar2 instanceof zzak) {
            zzaoVar2 = new zzas(zzaoVar2.zzc());
        }
        if ((zzaoVar instanceof zzas) && (zzaoVar2 instanceof zzas)) {
            return ((zzas) zzaoVar).f11458a.compareTo(((zzas) zzaoVar2).f11458a) < 0;
        }
        double dDoubleValue = zzaoVar.zzd().doubleValue();
        double dDoubleValue2 = zzaoVar2.zzd().doubleValue();
        return (Double.isNaN(dDoubleValue) || Double.isNaN(dDoubleValue2) || (dDoubleValue == 0.0d && dDoubleValue2 == 0.0d) || ((dDoubleValue == 0.0d && dDoubleValue2 == 0.0d) || Double.compare(dDoubleValue, dDoubleValue2) >= 0)) ? false : true;
    }

    public static boolean d(zzao zzaoVar, zzao zzaoVar2) {
        if (zzaoVar.getClass().equals(zzaoVar2.getClass())) {
            if ((zzaoVar instanceof zzat) || (zzaoVar instanceof zzam)) {
                return true;
            }
            if (zzaoVar instanceof zzah) {
                return (Double.isNaN(zzaoVar.zzd().doubleValue()) || Double.isNaN(zzaoVar2.zzd().doubleValue()) || zzaoVar.zzd().doubleValue() != zzaoVar2.zzd().doubleValue()) ? false : true;
            }
            if (zzaoVar instanceof zzas) {
                return zzaoVar.zzc().equals(zzaoVar2.zzc());
            }
            if (zzaoVar instanceof zzaf) {
                return zzaoVar.zze().equals(zzaoVar2.zze());
            }
            return zzaoVar == zzaoVar2;
        }
        if (((zzaoVar instanceof zzat) || (zzaoVar instanceof zzam)) && ((zzaoVar2 instanceof zzat) || (zzaoVar2 instanceof zzam))) {
            return true;
        }
        boolean z11 = zzaoVar instanceof zzah;
        if (z11 && (zzaoVar2 instanceof zzas)) {
            return d(zzaoVar, new zzah(zzaoVar2.zzd()));
        }
        boolean z12 = zzaoVar instanceof zzas;
        if (z12 && (zzaoVar2 instanceof zzah)) {
            return d(new zzah(zzaoVar.zzd()), zzaoVar2);
        }
        if (zzaoVar instanceof zzaf) {
            return d(new zzah(zzaoVar.zzd()), zzaoVar2);
        }
        if (zzaoVar2 instanceof zzaf) {
            return d(zzaoVar, new zzah(zzaoVar2.zzd()));
        }
        if ((z12 || z11) && (zzaoVar2 instanceof zzak)) {
            return d(zzaoVar, new zzas(zzaoVar2.zzc()));
        }
        if ((zzaoVar instanceof zzak) && ((zzaoVar2 instanceof zzas) || (zzaoVar2 instanceof zzah))) {
            return d(new zzas(zzaoVar.zzc()), zzaoVar2);
        }
        return false;
    }

    public static boolean e(zzao zzaoVar, zzao zzaoVar2) {
        if (zzaoVar instanceof zzak) {
            zzaoVar = new zzas(zzaoVar.zzc());
        }
        if (zzaoVar2 instanceof zzak) {
            zzaoVar2 = new zzas(zzaoVar2.zzc());
        }
        return (((zzaoVar instanceof zzas) && (zzaoVar2 instanceof zzas)) || !(Double.isNaN(zzaoVar.zzd().doubleValue()) || Double.isNaN(zzaoVar2.zzd().doubleValue()))) && !c(zzaoVar2, zzaoVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzav
    public final zzao a(String str, zzg zzgVar, ArrayList arrayList) {
        boolean zD;
        boolean zD2;
        zzh.a(2, zzh.e(str).name(), arrayList);
        zzao zzaoVarB = zzgVar.f11600b.b(zzgVar, (zzao) arrayList.get(0));
        zzao zzaoVarB2 = zzgVar.f11600b.b(zzgVar, (zzao) arrayList.get(1));
        int iOrdinal = zzh.e(str).ordinal();
        if (iOrdinal != 23) {
            if (iOrdinal == 48) {
                zD2 = d(zzaoVarB, zzaoVarB2);
            } else if (iOrdinal == 42) {
                zD = c(zzaoVarB, zzaoVarB2);
            } else if (iOrdinal != 43) {
                switch (iOrdinal) {
                    case 37:
                        zD = c(zzaoVarB2, zzaoVarB);
                        break;
                    case 38:
                        zD = e(zzaoVarB2, zzaoVarB);
                        break;
                    case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                        zD = zzh.f(zzaoVarB, zzaoVarB2);
                        break;
                    case DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                        zD2 = zzh.f(zzaoVarB, zzaoVarB2);
                        break;
                    default:
                        b(str);
                        throw null;
                }
            } else {
                zD = e(zzaoVarB, zzaoVarB2);
            }
            zD = !zD2;
        } else {
            zD = d(zzaoVarB, zzaoVarB2);
        }
        return zD ? zzao.f11449o : zzao.f11450p;
    }
}
