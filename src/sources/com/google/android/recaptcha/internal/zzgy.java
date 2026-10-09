package com.google.android.recaptcha.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import ns.o;
import ry.l;
import ry.n;
import ry.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzgy implements zzgx {
    public static final zzgy zza = new zzgy();

    private zzgy() {
    }

    private static final List zzc(Object obj) {
        boolean z11 = obj instanceof byte[];
        r rVar = r.f50854a;
        int i11 = 0;
        if (z11) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length;
            if (length == 0) {
                return rVar;
            }
            if (length == 1) {
                return o.K(Byte.valueOf(bArr[0]));
            }
            ArrayList arrayList = new ArrayList(bArr.length);
            int length2 = bArr.length;
            while (i11 < length2) {
                arrayList.add(Byte.valueOf(bArr[i11]));
                i11++;
            }
            return arrayList;
        }
        if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length3 = sArr.length;
            if (length3 == 0) {
                return rVar;
            }
            if (length3 == 1) {
                return o.K(Short.valueOf(sArr[0]));
            }
            ArrayList arrayList2 = new ArrayList(sArr.length);
            int length4 = sArr.length;
            while (i11 < length4) {
                arrayList2.add(Short.valueOf(sArr[i11]));
                i11++;
            }
            return arrayList2;
        }
        if (obj instanceof int[]) {
            return l.i0((int[]) obj);
        }
        if (obj instanceof long[]) {
            return l.j0((long[]) obj);
        }
        if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            int length5 = fArr.length;
            if (length5 == 0) {
                return rVar;
            }
            if (length5 == 1) {
                return o.K(Float.valueOf(fArr[0]));
            }
            ArrayList arrayList3 = new ArrayList(fArr.length);
            int length6 = fArr.length;
            while (i11 < length6) {
                arrayList3.add(Float.valueOf(fArr[i11]));
                i11++;
            }
            return arrayList3;
        }
        if (!(obj instanceof double[])) {
            return null;
        }
        double[] dArr = (double[]) obj;
        int length7 = dArr.length;
        if (length7 == 0) {
            return rVar;
        }
        if (length7 == 1) {
            return o.K(Double.valueOf(dArr[0]));
        }
        ArrayList arrayList4 = new ArrayList(dArr.length);
        int length8 = dArr.length;
        while (i11 < length8) {
            arrayList4.add(Double.valueOf(dArr[i11]));
            i11++;
        }
        return arrayList4;
    }

    @Override // com.google.android.recaptcha.internal.zzgx
    public final void zza(int i11, zzgd zzgdVar, zzue... zzueVarArr) throws zzce {
        if (zzueVarArr.length != 2) {
            throw new zzce(4, 3, null);
        }
        Object objZza = zzgdVar.zzc().zza(zzueVarArr[0]);
        if (true != Objects.nonNull(objZza)) {
            objZza = null;
        }
        if (objZza == null) {
            throw new zzce(4, 5, null);
        }
        Object objZza2 = zzgdVar.zzc().zza(zzueVarArr[1]);
        if (true != Objects.nonNull(objZza2)) {
            objZza2 = null;
        }
        if (objZza2 == null) {
            throw new zzce(4, 5, null);
        }
        zzgdVar.zzc().zze(i11, zzb(objZza, objZza2));
    }

    public final Object zzb(Object obj, Object obj2) throws zzce {
        List listZzc = zzc(obj);
        List listZzc2 = zzc(obj2);
        if (obj instanceof Number) {
            if (obj2 instanceof Number) {
                return Double.valueOf(Math.pow(((Number) obj).doubleValue(), ((Number) obj2).doubleValue()));
            }
            if (listZzc2 != null) {
                ArrayList arrayList = new ArrayList(n.W(listZzc2, 10));
                Iterator it = listZzc2.iterator();
                while (it.hasNext()) {
                    arrayList.add(Double.valueOf(Math.pow(((Number) it.next()).doubleValue(), ((Number) obj).doubleValue())));
                }
                return arrayList.toArray(new Double[0]);
            }
        }
        if (listZzc != null && (obj2 instanceof Number)) {
            ArrayList arrayList2 = new ArrayList(n.W(listZzc, 10));
            Iterator it2 = listZzc.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Double.valueOf(Math.pow(((Number) it2.next()).doubleValue(), ((Number) obj2).doubleValue())));
            }
            return arrayList2.toArray(new Double[0]);
        }
        if (listZzc == null || listZzc2 == null) {
            throw new zzce(4, 5, null);
        }
        zzgw.zza(this, listZzc.size(), listZzc2.size());
        int size = listZzc.size();
        Double[] dArr = new Double[size];
        for (int i11 = 0; i11 < size; i11++) {
            dArr[i11] = Double.valueOf(Math.pow(((Number) listZzc.get(i11)).doubleValue(), ((Number) listZzc2.get(i11)).doubleValue()));
        }
        return dArr;
    }
}
