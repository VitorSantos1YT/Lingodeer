package w1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import ns.o;
import qp.m3;
import qx.p;
import ry.s;
import y.i0;
import y.r0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fz.c f54462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i0 f54463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public i0 f54464c;

    public f(Map map, fz.c cVar) {
        i0 i0Var;
        this.f54462a = cVar;
        if (map == null || map.isEmpty()) {
            i0Var = null;
        } else {
            i0Var = new i0(map.size());
            for (Map.Entry entry : map.entrySet()) {
                i0Var.m(entry.getKey(), entry.getValue());
            }
        }
        this.f54463b = i0Var;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x008e  */
    @Override // w1.e
    public final Map a() {
        char c11;
        long j11;
        long j12;
        long j13;
        long[] jArr;
        int i11;
        long[] jArr2;
        int i12;
        i0 i0Var = this.f54463b;
        if (i0Var == null && this.f54464c == null) {
            return s.f50855a;
        }
        int i13 = 0;
        int i14 = i0Var != null ? i0Var.f56717e : 0;
        i0 i0Var2 = this.f54464c;
        HashMap map = new HashMap(i14 + (i0Var2 != null ? i0Var2.f56717e : 0));
        char c12 = 7;
        long j14 = -9187201950435737472L;
        int i15 = 8;
        if (i0Var != null) {
            Object[] objArr = i0Var.f56714b;
            Object[] objArr2 = i0Var.f56715c;
            long[] jArr3 = i0Var.f56713a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i16 = 0;
                j12 = 128;
                while (true) {
                    long j15 = jArr3[i16];
                    j13 = 255;
                    if ((((~j15) << c12) & j15 & j14) != j14) {
                        int i17 = 8 - ((~(i16 - length)) >>> 31);
                        int i18 = 0;
                        while (i18 < i17) {
                            if ((j15 & 255) < 128) {
                                int i19 = (i16 << 3) + i18;
                                map.put((String) objArr[i19], (List) objArr2[i19]);
                            }
                            j15 >>= 8;
                            i18++;
                            c12 = c12;
                            j14 = j14;
                        }
                        c11 = c12;
                        j11 = j14;
                        if (i17 != 8) {
                            break;
                        }
                    } else {
                        c11 = c12;
                        j11 = j14;
                    }
                    if (i16 == length) {
                        break;
                    }
                    i16++;
                    c12 = c11;
                    j14 = j11;
                }
            } else {
                c11 = 7;
                j11 = -9187201950435737472L;
                j12 = 128;
                j13 = 255;
            }
        } else {
            c11 = 7;
            j11 = -9187201950435737472L;
            j12 = 128;
            j13 = 255;
        }
        i0 i0Var3 = this.f54464c;
        if (i0Var3 != null) {
            Object[] objArr3 = i0Var3.f56714b;
            Object[] objArr4 = i0Var3.f56715c;
            long[] jArr4 = i0Var3.f56713a;
            int length2 = jArr4.length - 2;
            if (length2 >= 0) {
                int i21 = 0;
                while (true) {
                    long j16 = jArr4[i21];
                    if ((((~j16) << c11) & j16 & j11) != j11) {
                        int i22 = 8 - ((~(i21 - length2)) >>> 31);
                        int i23 = i13;
                        while (i23 < i22) {
                            if ((j16 & j13) < j12) {
                                int i24 = (i21 << 3) + i23;
                                Object obj = objArr3[i24];
                                List list = (List) objArr4[i24];
                                String str = (String) obj;
                                i12 = i15;
                                if (list.size() == 1) {
                                    Object objInvoke = ((fz.a) list.get(i13)).invoke();
                                    if (objInvoke != null) {
                                        if (!canBeSaved(objInvoke)) {
                                            throw new IllegalStateException(j.a(objInvoke).toString());
                                        }
                                        map.put(str, o.b(objInvoke));
                                    }
                                    jArr2 = jArr4;
                                } else {
                                    int size = list.size();
                                    ArrayList arrayList = new ArrayList(size);
                                    while (i13 < size) {
                                        long[] jArr5 = jArr4;
                                        Object objInvoke2 = ((fz.a) list.get(i13)).invoke();
                                        if (objInvoke2 != null && !canBeSaved(objInvoke2)) {
                                            throw new IllegalStateException(j.a(objInvoke2).toString());
                                        }
                                        arrayList.add(objInvoke2);
                                        i13++;
                                        jArr4 = jArr5;
                                    }
                                    jArr2 = jArr4;
                                    map.put(str, arrayList);
                                }
                            } else {
                                jArr2 = jArr4;
                                i12 = i15;
                            }
                            j16 >>= i12;
                            i23++;
                            i15 = i12;
                            jArr4 = jArr2;
                            i13 = 0;
                        }
                        jArr = jArr4;
                        i11 = i15;
                        if (i22 != i11) {
                            break;
                        }
                    } else {
                        jArr = jArr4;
                        i11 = i15;
                    }
                    if (i21 == length2) {
                        break;
                    }
                    i21++;
                    i15 = i11;
                    jArr4 = jArr;
                    i13 = 0;
                }
            }
        }
        return map;
    }

    @Override // w1.e
    public final Object b(String str) {
        i0 i0Var = this.f54463b;
        List list = i0Var != null ? (List) i0Var.k(str) : null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (list.size() > 1 && i0Var != null) {
            List listSubList = list.subList(1, list.size());
            int iF = i0Var.f(str);
            if (iF < 0) {
                iF = ~iF;
            }
            Object[] objArr = i0Var.f56715c;
            Object obj = objArr[iF];
            i0Var.f56714b[iF] = str;
            objArr[iF] = listSubList;
        }
        return list.get(0);
    }

    @Override // w1.e
    public final boolean canBeSaved(Object obj) {
        return ((Boolean) this.f54462a.invoke(obj)).booleanValue();
    }

    @Override // w1.e
    public final d e(String str, fz.a aVar) {
        int length = str.length();
        for (int i11 = 0; i11 < length; i11++) {
            if (!p.s(str.charAt(i11))) {
                i0 i0Var = this.f54464c;
                if (i0Var == null) {
                    long[] jArr = r0.f56756a;
                    i0Var = new i0();
                    this.f54464c = i0Var;
                }
                Object objG = i0Var.g(str);
                if (objG == null) {
                    objG = new ArrayList();
                    i0Var.m(str, objG);
                }
                ((List) objG).add(aVar);
                m3 m3Var = new m3();
                m3Var.f48057b = i0Var;
                m3Var.f48056a = str;
                m3Var.f48058c = aVar;
                return m3Var;
            }
        }
        throw new IllegalArgumentException("Registered key is empty or blank");
    }
}
