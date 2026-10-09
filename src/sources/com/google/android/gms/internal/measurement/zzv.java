package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzv extends zzai {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zzz f12054c;

    public zzv(zzz zzzVar) {
        super("internal.registerCallback");
        this.f12054c = zzzVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzai
    public final zzao a(zzg zzgVar, List list) {
        TreeMap treeMap;
        zzh.a(3, this.f11406a, list);
        zzgVar.f11600b.b(zzgVar, (zzao) list.get(0)).zzc();
        zzao zzaoVar = (zzao) list.get(1);
        zzaw zzawVar = zzgVar.f11600b;
        zzao zzaoVarB = zzawVar.b(zzgVar, zzaoVar);
        if (!(zzaoVarB instanceof zzan)) {
            throw new IllegalArgumentException("Invalid callback type");
        }
        zzao zzaoVarB2 = zzawVar.b(zzgVar, (zzao) list.get(2));
        if (!(zzaoVarB2 instanceof zzal)) {
            throw new IllegalArgumentException("Invalid callback params");
        }
        zzal zzalVar = (zzal) zzaoVarB2;
        HashMap map = zzalVar.f11441a;
        if (!map.containsKey("type")) {
            throw new IllegalArgumentException("Undefined rule type");
        }
        String strZzc = zzalVar.d("type").zzc();
        int iG = map.containsKey("priority") ? zzh.g(zzalVar.d("priority").zzd().doubleValue()) : 1000;
        zzan zzanVar = (zzan) zzaoVarB;
        zzz zzzVar = this.f12054c;
        zzzVar.getClass();
        if ("create".equals(strZzc)) {
            treeMap = zzzVar.f12202b;
        } else {
            if (!"edit".equals(strZzc)) {
                throw new IllegalStateException("Unknown callback type: ".concat(String.valueOf(strZzc)));
            }
            treeMap = zzzVar.f12201a;
        }
        if (treeMap.containsKey(Integer.valueOf(iG))) {
            iG = ((Integer) treeMap.lastKey()).intValue() + 1;
        }
        treeMap.put(Integer.valueOf(iG), zzanVar);
        return zzao.f11445j;
    }
}
