package com.google.android.gms.internal.measurement;

import defpackage.e;
import ep.a;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public interface zzak {
    static zzao f(zzak zzakVar, zzas zzasVar, zzg zzgVar, ArrayList arrayList) {
        String str = zzasVar.f11458a;
        if (zzakVar.h(str)) {
            zzao zzaoVarD = zzakVar.d(str);
            if (zzaoVarD instanceof zzai) {
                return ((zzai) zzaoVarD).a(zzgVar, arrayList);
            }
            throw new IllegalArgumentException(e.m(str, " is not a function"));
        }
        if (!"hasOwnProperty".equals(str)) {
            throw new IllegalArgumentException(a.e("Object has no function ", str));
        }
        zzh.a(1, "hasOwnProperty", arrayList);
        return zzakVar.h(zzgVar.f11600b.b(zzgVar, (zzao) arrayList.get(0)).zzc()) ? zzao.f11449o : zzao.f11450p;
    }

    zzao d(String str);

    void e(String str, zzao zzaoVar);

    boolean h(String str);
}
