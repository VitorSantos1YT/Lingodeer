package com.google.android.gms.internal.measurement;

import ep.a;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzbi extends zzav {
    @Override // com.google.android.gms.internal.measurement.zzav
    public final zzao a(String str, zzg zzgVar, ArrayList arrayList) {
        if (str == null || str.isEmpty() || !zzgVar.d(str)) {
            throw new IllegalArgumentException(a.e("Command not found: ", str));
        }
        zzao zzaoVarG = zzgVar.g(str);
        if (zzaoVarG instanceof zzai) {
            return ((zzai) zzaoVarG).a(zzgVar, arrayList);
        }
        throw new IllegalArgumentException(a.g("Function ", str, " is not defined"));
    }
}
