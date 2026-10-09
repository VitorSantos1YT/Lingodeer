package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzi {
    public static zzao a(Object obj) {
        if (obj == null) {
            return zzao.f11446k;
        }
        if (obj instanceof String) {
            return new zzas((String) obj);
        }
        if (obj instanceof Double) {
            return new zzah((Double) obj);
        }
        if (obj instanceof Long) {
            return new zzah(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new zzah(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new zzaf((Boolean) obj);
        }
        if (!(obj instanceof Map)) {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            zzae zzaeVar = new zzae();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                zzaeVar.n(zzaeVar.l(), a(it.next()));
            }
            return zzaeVar;
        }
        zzal zzalVar = new zzal();
        Map map = (Map) obj;
        for (Object string : map.keySet()) {
            zzao zzaoVarA = a(map.get(string));
            if (string != null) {
                if (!(string instanceof String)) {
                    string = string.toString();
                }
                zzalVar.e((String) string, zzaoVarA);
            }
        }
        return zzalVar;
    }

    public static zzao b(zzje zzjeVar) {
        if (zzjeVar == null) {
            return zzao.f11445j;
        }
        int iG = zzjeVar.G() - 1;
        if (iG == 1) {
            return zzjeVar.A() ? new zzas(zzjeVar.B()) : zzao.f11451q;
        }
        if (iG == 2) {
            return zzjeVar.E() ? new zzah(Double.valueOf(zzjeVar.F())) : new zzah(null);
        }
        if (iG == 3) {
            return zzjeVar.C() ? new zzaf(Boolean.valueOf(zzjeVar.D())) : new zzaf(null);
        }
        if (iG != 4) {
            throw new IllegalArgumentException("Unknown type found. Cannot convert entity");
        }
        List listY = zzjeVar.y();
        ArrayList arrayList = new ArrayList();
        Iterator it = listY.iterator();
        while (it.hasNext()) {
            arrayList.add(b((zzje) it.next()));
        }
        return new zzap(arrayList, zzjeVar.z());
    }
}
