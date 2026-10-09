package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzl extends zzal {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzab f11684b;

    public zzl(zzab zzabVar) {
        this.f11684b = zzabVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.measurement.zzal, com.google.android.gms.internal.measurement.zzao
    public final zzao g(String str, zzg zzgVar, ArrayList arrayList) {
        int iHashCode = str.hashCode();
        zzab zzabVar = this.f11684b;
        switch (iHashCode) {
            case 21624207:
                if (str.equals("getEventName")) {
                    zzh.a(0, "getEventName", arrayList);
                    return new zzas(zzabVar.f11164b.f11125a);
                }
                break;
            case 45521504:
                if (str.equals("getTimestamp")) {
                    zzh.a(0, "getTimestamp", arrayList);
                    return new zzah(Double.valueOf(zzabVar.f11164b.f11126b));
                }
                break;
            case 146575578:
                if (str.equals("getParamValue")) {
                    zzh.a(1, "getParamValue", arrayList);
                    String strZzc = zzgVar.f11600b.b(zzgVar, (zzao) arrayList.get(0)).zzc();
                    HashMap map = zzabVar.f11164b.f11127c;
                    return zzi.a(map.containsKey(strZzc) ? map.get(strZzc) : null);
                }
                break;
            case 700587132:
                if (str.equals("getParams")) {
                    zzh.a(0, "getParams", arrayList);
                    HashMap map2 = zzabVar.f11164b.f11127c;
                    zzal zzalVar = new zzal();
                    for (String str2 : map2.keySet()) {
                        zzalVar.e(str2, zzi.a(map2.get(str2)));
                    }
                    return zzalVar;
                }
                break;
            case 920706790:
                if (str.equals("setParamValue")) {
                    zzh.a(2, "setParamValue", arrayList);
                    String strZzc2 = zzgVar.f11600b.b(zzgVar, (zzao) arrayList.get(0)).zzc();
                    zzao zzaoVarB = zzgVar.f11600b.b(zzgVar, (zzao) arrayList.get(1));
                    zzaa zzaaVar = zzabVar.f11164b;
                    Object objI = zzh.i(zzaoVarB);
                    HashMap map3 = zzaaVar.f11127c;
                    if (objI == null) {
                        map3.remove(strZzc2);
                        return zzaoVarB;
                    }
                    map3.put(strZzc2, zzaa.b(map3.get(strZzc2), objI, strZzc2));
                    return zzaoVarB;
                }
                break;
            case 1570616835:
                if (str.equals("setEventName")) {
                    zzh.a(1, "setEventName", arrayList);
                    zzao zzaoVarB2 = zzgVar.f11600b.b(zzgVar, (zzao) arrayList.get(0));
                    if (zzao.f11445j.equals(zzaoVarB2) || zzao.f11446k.equals(zzaoVarB2)) {
                        throw new IllegalArgumentException("Illegal event name");
                    }
                    zzabVar.f11164b.f11125a = zzaoVarB2.zzc();
                    return new zzas(zzaoVarB2.zzc());
                }
                break;
        }
        return super.g(str, zzgVar, arrayList);
    }
}
