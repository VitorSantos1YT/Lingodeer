package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzk extends zzai {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zzab f11656c;

    public zzk(zzab zzabVar) {
        super("internal.eventLogger");
        this.f11656c = zzabVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzai
    public final zzao a(zzg zzgVar, List list) {
        zzh.a(3, this.f11406a, list);
        String strZzc = zzgVar.f11600b.b(zzgVar, (zzao) list.get(0)).zzc();
        zzao zzaoVar = (zzao) list.get(1);
        zzaw zzawVar = zzgVar.f11600b;
        long jH = (long) zzh.h(zzawVar.b(zzgVar, zzaoVar).zzd().doubleValue());
        zzao zzaoVarB = zzawVar.b(zzgVar, (zzao) list.get(2));
        HashMap mapJ = zzaoVarB instanceof zzal ? zzh.j((zzal) zzaoVarB) : new HashMap();
        zzab zzabVar = this.f11656c;
        zzabVar.getClass();
        HashMap map = new HashMap();
        for (String str : mapJ.keySet()) {
            HashMap map2 = zzabVar.f11163a.f11127c;
            map.put(str, zzaa.b(map2.containsKey(str) ? map2.get(str) : null, mapJ.get(str), str));
        }
        zzabVar.f11165c.add(new zzaa(strZzc, jH, map));
        return zzao.f11445j;
    }
}
