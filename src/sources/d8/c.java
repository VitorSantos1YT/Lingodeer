package d8;

import b0.h2;
import b7.w;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends h2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f23279c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long[] f23280d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long[] f23281e;

    public static Serializable s0(int i11, w wVar) {
        if (i11 == 0) {
            return Double.valueOf(Double.longBitsToDouble(wVar.q()));
        }
        if (i11 == 1) {
            return Boolean.valueOf(wVar.w() == 1);
        }
        if (i11 == 2) {
            return u0(wVar);
        }
        if (i11 != 3) {
            if (i11 == 8) {
                return t0(wVar);
            }
            if (i11 != 10) {
                if (i11 != 11) {
                    return null;
                }
                Date date = new Date((long) Double.longBitsToDouble(wVar.q()));
                wVar.J(2);
                return date;
            }
            int iA = wVar.A();
            ArrayList arrayList = new ArrayList(iA);
            for (int i12 = 0; i12 < iA; i12++) {
                Serializable serializableS0 = s0(wVar.w(), wVar);
                if (serializableS0 != null) {
                    arrayList.add(serializableS0);
                }
            }
            return arrayList;
        }
        HashMap map = new HashMap();
        while (true) {
            String strU0 = u0(wVar);
            int iW = wVar.w();
            if (iW == 9) {
                return map;
            }
            Serializable serializableS1 = s0(iW, wVar);
            if (serializableS1 != null) {
                map.put(strU0, serializableS1);
            }
        }
    }

    public static HashMap t0(w wVar) {
        int iA = wVar.A();
        HashMap map = new HashMap(iA);
        for (int i11 = 0; i11 < iA; i11++) {
            String strU0 = u0(wVar);
            Serializable serializableS0 = s0(wVar.w(), wVar);
            if (serializableS0 != null) {
                map.put(strU0, serializableS0);
            }
        }
        return map;
    }

    public static String u0(w wVar) {
        int iC = wVar.C();
        int i11 = wVar.f4040b;
        wVar.J(iC);
        return new String(wVar.f4039a, i11, iC);
    }
}
