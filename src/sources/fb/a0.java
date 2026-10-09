package fb;

import androidx.lifecycle.MutableLiveData;
import fr.j3;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final z f27037b = new z(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final z f27038c = new z(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f27039a;

    public a0(MutableLiveData mutableLiveData, a4.l lVar) {
        this.f27039a = lVar;
    }

    public j a() {
        j jVar = new j((LinkedHashMap) this.f27039a);
        j3.V(jVar);
        return jVar;
    }

    public void b(Object obj, String key) {
        Object[] objArr;
        kotlin.jvm.internal.m.f(key, "key");
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f27039a;
        if (obj == null) {
            obj = null;
        } else {
            kotlin.jvm.internal.e eVarA = kotlin.jvm.internal.z.a(obj.getClass());
            if (!(eVarA.equals(kotlin.jvm.internal.z.a(Boolean.TYPE)) ? true : eVarA.equals(kotlin.jvm.internal.z.a(Byte.TYPE)) ? true : eVarA.equals(kotlin.jvm.internal.z.a(Integer.TYPE)) ? true : eVarA.equals(kotlin.jvm.internal.z.a(Long.TYPE)) ? true : eVarA.equals(kotlin.jvm.internal.z.a(Float.TYPE)) ? true : eVarA.equals(kotlin.jvm.internal.z.a(Double.TYPE)) ? true : eVarA.equals(kotlin.jvm.internal.z.a(String.class)) ? true : eVarA.equals(kotlin.jvm.internal.z.a(Boolean[].class)) ? true : eVarA.equals(kotlin.jvm.internal.z.a(Byte[].class)) ? true : eVarA.equals(kotlin.jvm.internal.z.a(Integer[].class)) ? true : eVarA.equals(kotlin.jvm.internal.z.a(Long[].class)) ? true : eVarA.equals(kotlin.jvm.internal.z.a(Float[].class)) ? true : eVarA.equals(kotlin.jvm.internal.z.a(Double[].class)) ? true : eVarA.equals(kotlin.jvm.internal.z.a(String[].class)))) {
                int i11 = 0;
                if (eVarA.equals(kotlin.jvm.internal.z.a(boolean[].class))) {
                    boolean[] zArr = (boolean[]) obj;
                    int i12 = k.f27097a;
                    int length = zArr.length;
                    objArr = new Boolean[length];
                    while (i11 < length) {
                        objArr[i11] = Boolean.valueOf(zArr[i11]);
                        i11++;
                    }
                } else if (eVarA.equals(kotlin.jvm.internal.z.a(byte[].class))) {
                    byte[] bArr = (byte[]) obj;
                    int i13 = k.f27097a;
                    int length2 = bArr.length;
                    objArr = new Byte[length2];
                    while (i11 < length2) {
                        objArr[i11] = Byte.valueOf(bArr[i11]);
                        i11++;
                    }
                } else if (eVarA.equals(kotlin.jvm.internal.z.a(int[].class))) {
                    int[] iArr = (int[]) obj;
                    int i14 = k.f27097a;
                    int length3 = iArr.length;
                    objArr = new Integer[length3];
                    while (i11 < length3) {
                        objArr[i11] = Integer.valueOf(iArr[i11]);
                        i11++;
                    }
                } else if (eVarA.equals(kotlin.jvm.internal.z.a(long[].class))) {
                    long[] jArr = (long[]) obj;
                    int i15 = k.f27097a;
                    int length4 = jArr.length;
                    objArr = new Long[length4];
                    while (i11 < length4) {
                        objArr[i11] = Long.valueOf(jArr[i11]);
                        i11++;
                    }
                } else if (eVarA.equals(kotlin.jvm.internal.z.a(float[].class))) {
                    float[] fArr = (float[]) obj;
                    int i16 = k.f27097a;
                    int length5 = fArr.length;
                    objArr = new Float[length5];
                    while (i11 < length5) {
                        objArr[i11] = Float.valueOf(fArr[i11]);
                        i11++;
                    }
                } else {
                    if (!eVarA.equals(kotlin.jvm.internal.z.a(double[].class))) {
                        throw new IllegalArgumentException("Key " + key + " has invalid type " + eVarA);
                    }
                    double[] dArr = (double[]) obj;
                    int i17 = k.f27097a;
                    int length6 = dArr.length;
                    objArr = new Double[length6];
                    while (i11 < length6) {
                        objArr[i11] = Double.valueOf(dArr[i11]);
                        i11++;
                    }
                }
                obj = objArr;
            }
        }
        linkedHashMap.put(key, obj);
    }

    public void c(HashMap values) {
        kotlin.jvm.internal.m.f(values, "values");
        for (Map.Entry entry : values.entrySet()) {
            b(entry.getValue(), (String) entry.getKey());
        }
    }

    public a0() {
        this.f27039a = new LinkedHashMap();
    }
}
