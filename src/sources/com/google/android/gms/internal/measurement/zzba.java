package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzba {
    public static zzao a(zzae zzaeVar, zzg zzgVar, ArrayList arrayList, boolean z11) {
        zzao zzaoVarA;
        zzh.b(1, "reduce", arrayList);
        zzh.c(2, "reduce", arrayList);
        zzao zzaoVarB = zzgVar.f11600b.b(zzgVar, (zzao) arrayList.get(0));
        if (!(zzaoVarB instanceof zzai)) {
            throw new IllegalArgumentException("Callback should be a method");
        }
        if (arrayList.size() == 2) {
            zzaoVarA = zzgVar.f11600b.b(zzgVar, (zzao) arrayList.get(1));
            if (zzaoVarA instanceof zzag) {
                throw new IllegalArgumentException("Failed to parse initial value");
            }
        } else {
            if (zzaeVar.l() == 0) {
                throw new IllegalStateException("Empty array with no initial value error");
            }
            zzaoVarA = null;
        }
        zzai zzaiVar = (zzai) zzaoVarB;
        int iL = zzaeVar.l();
        int i11 = z11 ? 0 : iL - 1;
        int i12 = z11 ? iL - 1 : 0;
        int i13 = true == z11 ? 1 : -1;
        if (zzaoVarA == null) {
            zzaoVarA = zzaeVar.m(i11);
            i11 += i13;
        }
        while ((i12 - i11) * i13 >= 0) {
            if (zzaeVar.o(i11)) {
                zzaoVarA = zzaiVar.a(zzgVar, Arrays.asList(zzaoVarA, zzaeVar.m(i11), new zzah(Double.valueOf(i11)), zzaeVar));
                if (zzaoVarA instanceof zzag) {
                    throw new IllegalStateException("Reduce operation failed");
                }
                i11 += i13;
            } else {
                i11 += i13;
            }
        }
        return zzaoVarA;
    }

    public static zzae b(zzae zzaeVar, zzg zzgVar, zzan zzanVar, Boolean bool, Boolean bool2) {
        zzae zzaeVar2 = new zzae();
        Iterator itK = zzaeVar.k();
        while (itK.hasNext()) {
            int iIntValue = ((Integer) itK.next()).intValue();
            if (zzaeVar.o(iIntValue)) {
                zzao zzaoVarA = zzanVar.a(zzgVar, Arrays.asList(zzaeVar.m(iIntValue), new zzah(Double.valueOf(iIntValue)), zzaeVar));
                if (zzaoVarA.zze().equals(bool)) {
                    break;
                }
                if (bool2 == null || zzaoVarA.zze().equals(bool2)) {
                    zzaeVar2.n(iIntValue, zzaoVarA);
                }
            }
        }
        return zzaeVar2;
    }
}
