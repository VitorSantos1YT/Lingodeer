package com.google.android.gms.internal.p002firebaseauthapi;

import ep.a;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzal<K, V> implements Serializable, Map<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public transient zzaq f10138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient zzaq f10139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient zzag f10140c;

    /* JADX WARN: Code duplicated, block: B:106:0x0258  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v8 */
    public static void b(HashMap map) {
        int iHighestOneBit;
        int i11;
        boolean z11;
        char c11;
        ?? r9;
        char c12;
        short[] sArr;
        int i12;
        boolean z12;
        ?? r16;
        boolean z13;
        ?? r11;
        boolean z14;
        Set<Map.Entry<K, V>> setEntrySet = map.entrySet();
        boolean z15 = setEntrySet instanceof Collection;
        zzao zzaoVar = new zzao(z15 ? setEntrySet.size() : 4);
        int i13 = 1;
        if (z15) {
            int size = setEntrySet.size() << 1;
            Object[] objArr = zzaoVar.f10232a;
            if (size > objArr.length) {
                zzaoVar.f10232a = Arrays.copyOf(objArr, zzai.a(objArr.length, size));
            }
        }
        Iterator it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i14 = (zzaoVar.f10233b + 1) << 1;
            Object[] objArr2 = zzaoVar.f10232a;
            if (i14 > objArr2.length) {
                zzaoVar.f10232a = Arrays.copyOf(objArr2, zzai.a(objArr2.length, i14));
            }
            if (key == null) {
                throw new NullPointerException("null key in entry: null=".concat(String.valueOf(value)));
            }
            if (value == null) {
                throw new NullPointerException(a.g("null value in entry: ", String.valueOf(key), "=null"));
            }
            Object[] objArr3 = zzaoVar.f10232a;
            int i15 = zzaoVar.f10233b;
            int i16 = i15 * 2;
            objArr3[i16] = key;
            objArr3[i16 + 1] = value;
            zzaoVar.f10233b = i15 + 1;
        }
        zzan zzanVar = zzaoVar.f10234c;
        if (zzanVar != null) {
            throw zzanVar.a();
        }
        int i17 = zzaoVar.f10233b;
        Object[] objArrCopyOf = zzaoVar.f10232a;
        if (i17 == 0) {
            int i18 = zzar.f10238t;
        } else {
            int i19 = zzar.f10238t;
            zzan zzanVar2 = null;
            ?? r12 = 0;
            zzan zzanVar3 = null;
            zzan zzanVar4 = null;
            boolean z16 = false;
            if (i17 == 1) {
                Objects.requireNonNull(objArrCopyOf[0]);
                Objects.requireNonNull(objArrCopyOf[1]);
                new zzar(1, null, objArrCopyOf);
            } else {
                zzu.d(i17, objArrCopyOf.length >> 1);
                char c13 = 2;
                int iMax = Math.max(i17, 2);
                if (iMax < 751619276) {
                    iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
                    while (((double) iHighestOneBit) * 0.7d < iMax) {
                        iHighestOneBit <<= 1;
                    }
                } else {
                    iHighestOneBit = 1073741824;
                    if (!(iMax < 1073741824)) {
                        zzq zzqVar = zzp.f10824a;
                        throw new IllegalArgumentException("collection too large");
                    }
                }
                if (i17 == 1) {
                    Objects.requireNonNull(objArrCopyOf[0]);
                    Objects.requireNonNull(objArrCopyOf[1]);
                    i11 = 1;
                    z14 = false;
                } else {
                    int i21 = iHighestOneBit - 1;
                    if (iHighestOneBit <= 128) {
                        byte[] bArr = new byte[iHighestOneBit];
                        Arrays.fill(bArr, (byte) -1);
                        int i22 = 0;
                        int i23 = 0;
                        while (i22 < i17) {
                            int i24 = i22 * 2;
                            int i25 = i23 * 2;
                            Object obj = objArrCopyOf[i24];
                            Objects.requireNonNull(obj);
                            Object obj2 = objArrCopyOf[i24 ^ i13];
                            Objects.requireNonNull(obj2);
                            int iA = zzad.a(obj.hashCode());
                            while (true) {
                                int i26 = iA & i21;
                                i12 = i13;
                                z12 = z16;
                                int i27 = bArr[i26] & 255;
                                if (i27 == 255) {
                                    bArr[i26] = (byte) i25;
                                    if (i23 < i22) {
                                        objArrCopyOf[i25] = obj;
                                        objArrCopyOf[i25 ^ 1] = obj2;
                                    }
                                    i23++;
                                    break;
                                }
                                if (obj.equals(objArrCopyOf[i27 == true ? 1 : 0])) {
                                    int i28 = ~i27;
                                    Object obj3 = objArrCopyOf[i28 == true ? 1 : 0];
                                    Objects.requireNonNull(obj3);
                                    zzanVar3 = new zzan(obj, obj2, obj3);
                                    objArrCopyOf[i28 == true ? 1 : 0] = obj2;
                                    break;
                                }
                                iA = i26 + 1;
                                i13 = i12;
                                z16 = z12;
                            }
                            i22++;
                            i13 = i12;
                            z16 = z12;
                        }
                        i11 = i13;
                        z11 = z16;
                        if (i23 == i17) {
                            c11 = 2;
                            r9 = bArr;
                            r16 = z11;
                        } else {
                            sArr = new Object[3];
                            sArr[z11 ? 1 : 0] = bArr;
                            sArr[i11] = Integer.valueOf(i23);
                            sArr[2] = zzanVar3;
                            r12 = sArr;
                            z14 = z11;
                        }
                    } else {
                        i11 = 1;
                        z11 = false;
                        if (iHighestOneBit <= 32768) {
                            sArr = new short[iHighestOneBit];
                            Arrays.fill(sArr, (short) -1);
                            int i29 = 0;
                            for (int i30 = 0; i30 < i17; i30++) {
                                int i31 = i30 * 2;
                                int i32 = i29 * 2;
                                Object obj4 = objArrCopyOf[i31];
                                Objects.requireNonNull(obj4);
                                Object obj5 = objArrCopyOf[i31 ^ 1];
                                Objects.requireNonNull(obj5);
                                int iA2 = zzad.a(obj4.hashCode());
                                while (true) {
                                    int i33 = iA2 & i21;
                                    int i34 = sArr[i33] & 65535;
                                    if (i34 == 65535) {
                                        sArr[i33] = (short) i32;
                                        if (i29 < i30) {
                                            objArrCopyOf[i32] = obj4;
                                            objArrCopyOf[i32 ^ 1] = obj5;
                                        }
                                        i29++;
                                        break;
                                    }
                                    if (obj4.equals(objArrCopyOf[i34 == true ? 1 : 0])) {
                                        int i35 = ~i34;
                                        Object obj6 = objArrCopyOf[i35 == true ? 1 : 0];
                                        Objects.requireNonNull(obj6);
                                        zzanVar4 = new zzan(obj4, obj5, obj6);
                                        objArrCopyOf[i35 == true ? 1 : 0] = obj5;
                                        break;
                                    }
                                    iA2 = i33 + 1;
                                }
                            }
                            if (i29 == i17) {
                                r12 = sArr;
                                z14 = z11;
                            } else {
                                r12 = new Object[]{sArr, Integer.valueOf(i29), zzanVar4};
                                z14 = z11;
                            }
                        } else {
                            int[] iArr = new int[iHighestOneBit];
                            Arrays.fill(iArr, -1);
                            int i36 = 0;
                            int i37 = 0;
                            while (i36 < i17) {
                                int i38 = i36 * 2;
                                int i39 = i37 * 2;
                                Object obj7 = objArrCopyOf[i38];
                                Objects.requireNonNull(obj7);
                                Object obj8 = objArrCopyOf[i38 ^ 1];
                                Objects.requireNonNull(obj8);
                                int iA3 = zzad.a(obj7.hashCode());
                                while (true) {
                                    int i40 = iA3 & i21;
                                    int i41 = iArr[i40];
                                    if (i41 == -1) {
                                        iArr[i40] = i39;
                                        if (i37 < i36) {
                                            objArrCopyOf[i39] = obj7;
                                            objArrCopyOf[i39 ^ 1] = obj8;
                                        }
                                        i37++;
                                        c12 = c13;
                                        break;
                                    }
                                    c12 = c13;
                                    if (obj7.equals(objArrCopyOf[i41])) {
                                        int i42 = i41 ^ 1;
                                        Object obj9 = objArrCopyOf[i42];
                                        Objects.requireNonNull(obj9);
                                        zzanVar2 = new zzan(obj7, obj8, obj9);
                                        objArrCopyOf[i42] = obj8;
                                        break;
                                    }
                                    iA3 = i40 + 1;
                                    c13 = c12;
                                }
                                i36++;
                                c13 = c12;
                            }
                            c11 = c13;
                            if (i37 == i17) {
                                r9 = iArr;
                                r16 = z11;
                            } else {
                                Object[] objArr4 = new Object[3];
                                objArr4[0] = iArr;
                                objArr4[1] = Integer.valueOf(i37);
                                objArr4[c11] = zzanVar2;
                                r9 = objArr4;
                                r16 = z11;
                            }
                        }
                    }
                    z13 = r9 instanceof Object[];
                    r11 = r9;
                    if (z13) {
                        Object[] objArr5 = (Object[]) r9;
                        zzaoVar.f10234c = (zzan) objArr5[c11];
                        Object obj10 = objArr5[r16];
                        int iIntValue = ((Integer) objArr5[i11]).intValue();
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue << 1);
                        r11 = obj10;
                        i17 = iIntValue;
                    }
                    new zzar(i17, r11, objArrCopyOf);
                }
                c11 = 2;
                r9 = r12;
                r16 = z14;
                z13 = r9 instanceof Object[];
                r11 = r9;
                if (z13) {
                    Object[] objArr6 = (Object[]) r9;
                    zzaoVar.f10234c = (zzan) objArr6[c11];
                    Object obj11 = objArr6[r16];
                    int iIntValue2 = ((Integer) objArr6[i11]).intValue();
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue2 << 1);
                    r11 = obj11;
                    i17 = iIntValue2;
                }
                new zzar(i17, r11, objArrCopyOf);
            }
        }
        zzan zzanVar5 = zzaoVar.f10234c;
        if (zzanVar5 != null) {
            throw zzanVar5.a();
        }
    }

    public abstract zzag a();

    public abstract zzaq c();

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return ((zzag) values()).contains(obj);
    }

    public abstract zzaq d();

    @Override // java.util.Map
    public final /* synthetic */ Set entrySet() {
        zzaq zzaqVar = this.f10138a;
        if (zzaqVar != null) {
            return zzaqVar;
        }
        zzaq zzaqVarC = c();
        this.f10138a = zzaqVarC;
        return zzaqVarC;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        Iterator<E> it = ((zzaq) entrySet()).iterator();
        int i11 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i11 = ~(~(i11 + (next != null ? next.hashCode() : 0)));
        }
        return i11;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final /* synthetic */ Set keySet() {
        zzaq zzaqVar = this.f10139b;
        if (zzaqVar != null) {
            return zzaqVar;
        }
        zzaq zzaqVarD = d();
        this.f10139b = zzaqVarD;
        return zzaqVarD;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        if (size < 0) {
            throw new IllegalArgumentException(p.j(size, "size cannot be negative but was: "));
        }
        StringBuilder sb2 = new StringBuilder((int) Math.min(((long) size) << 3, 1073741824L));
        sb2.append('{');
        boolean z11 = true;
        for (Map.Entry<K, V> entry : entrySet()) {
            if (!z11) {
                sb2.append(", ");
            }
            sb2.append(entry.getKey());
            sb2.append('=');
            sb2.append(entry.getValue());
            z11 = false;
        }
        sb2.append('}');
        return sb2.toString();
    }

    @Override // java.util.Map
    public final /* synthetic */ Collection values() {
        zzag zzagVar = this.f10140c;
        if (zzagVar != null) {
            return zzagVar;
        }
        zzag zzagVarA = a();
        this.f10140c = zzagVarA;
        return zzagVarA;
    }
}
