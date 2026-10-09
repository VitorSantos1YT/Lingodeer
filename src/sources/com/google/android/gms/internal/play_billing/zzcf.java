package com.google.android.gms.internal.play_billing;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzcf extends zzbw {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final zzbw f12285t = new zzcf(0, null, new Object[0]);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient Object f12286d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient Object[] f12287e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient int f12288f;

    public zzcf(int i11, Object obj, Object[] objArr) {
        this.f12286d = obj;
        this.f12287e = objArr;
        this.f12288f = i11;
    }

    /* JADX WARN: Code duplicated, block: B:81:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:83:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:84:0x01dd  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object[]] */
    public static zzcf e(int i11, Object[] objArr, zzbv zzbvVar) {
        int iHighestOneBit;
        boolean z11;
        int i12;
        char c11;
        ?? r9;
        char c12;
        short[] sArr;
        boolean z12;
        int i13;
        ?? r16;
        boolean z13;
        ?? r11;
        Object[] objArr2;
        zzbu zzbuVar;
        boolean z14;
        int i14 = i11;
        Object[] objArrCopyOf = objArr;
        if (i14 == 0) {
            return (zzcf) f12285t;
        }
        zzbu zzbuVar2 = null;
        ?? r12 = 0;
        zzbu zzbuVar3 = null;
        zzbu zzbuVar4 = null;
        boolean z15 = false;
        int i15 = 1;
        if (i14 == 1) {
            Objects.requireNonNull(objArrCopyOf[0]);
            Objects.requireNonNull(objArrCopyOf[1]);
            return new zzcf(1, null, objArrCopyOf);
        }
        zzbg.b(i14, objArrCopyOf.length >> 1);
        char c13 = 2;
        int iMax = Math.max(i14, 2);
        if (iMax < 751619276) {
            iHighestOneBit = Integer.highestOneBit(iMax - 1);
            do {
                iHighestOneBit += iHighestOneBit;
            } while (((double) iHighestOneBit) * 0.7d < iMax);
        } else {
            iHighestOneBit = 1073741824;
            if (iMax >= 1073741824) {
                throw new IllegalArgumentException("collection too large");
            }
        }
        if (i14 != 1) {
            int i16 = iHighestOneBit - 1;
            if (iHighestOneBit <= 128) {
                byte[] bArr = new byte[iHighestOneBit];
                Arrays.fill(bArr, (byte) -1);
                int i17 = 0;
                int i18 = 0;
                while (i17 < i14) {
                    int i19 = i18 + i18;
                    int i21 = i17 + i17;
                    Object obj = objArrCopyOf[i21];
                    Objects.requireNonNull(obj);
                    Object obj2 = objArrCopyOf[i21 ^ i15];
                    Objects.requireNonNull(obj2);
                    int iA = zzbp.a(obj.hashCode());
                    while (true) {
                        int i22 = iA & i16;
                        z12 = z15;
                        i13 = i15;
                        int i23 = bArr[i22] & 255;
                        if (i23 == 255) {
                            bArr[i22] = (byte) i19;
                            if (i18 < i17) {
                                objArrCopyOf[i19] = obj;
                                objArrCopyOf[i19 ^ 1] = obj2;
                            }
                            i18++;
                            break;
                        }
                        if (obj.equals(objArrCopyOf[i23 == true ? 1 : 0])) {
                            int i24 = ~i23;
                            Object obj3 = objArrCopyOf[i24 == true ? 1 : 0];
                            Objects.requireNonNull(obj3);
                            zzbu zzbuVar5 = new zzbu(obj, obj2, obj3);
                            objArrCopyOf[i24 == true ? 1 : 0] = obj2;
                            zzbuVar3 = zzbuVar5;
                            break;
                        }
                        iA = i22 + 1;
                        z15 = z12;
                        i15 = i13;
                    }
                    i17++;
                    z15 = z12;
                    i15 = i13;
                }
                z11 = z15;
                i12 = i15;
                if (i18 == i14) {
                    c11 = 2;
                    r9 = bArr;
                    r16 = z11;
                } else {
                    sArr = new Object[3];
                    sArr[z11 ? 1 : 0] = bArr;
                    sArr[i12] = Integer.valueOf(i18);
                    sArr[2] = zzbuVar3;
                    r12 = sArr;
                    z14 = z11;
                }
            } else {
                z11 = false;
                i12 = 1;
                if (iHighestOneBit <= 32768) {
                    sArr = new short[iHighestOneBit];
                    Arrays.fill(sArr, (short) -1);
                    int i25 = 0;
                    for (int i26 = 0; i26 < i14; i26++) {
                        int i27 = i25 + i25;
                        int i28 = i26 + i26;
                        Object obj4 = objArrCopyOf[i28];
                        Objects.requireNonNull(obj4);
                        Object obj5 = objArrCopyOf[i28 ^ 1];
                        Objects.requireNonNull(obj5);
                        int iA2 = zzbp.a(obj4.hashCode());
                        while (true) {
                            int i29 = iA2 & i16;
                            char c14 = (char) sArr[i29];
                            if (c14 == 65535) {
                                sArr[i29] = (short) i27;
                                if (i25 < i26) {
                                    objArrCopyOf[i27] = obj4;
                                    objArrCopyOf[i27 ^ 1] = obj5;
                                }
                                i25++;
                                break;
                            }
                            if (obj4.equals(objArrCopyOf[c14])) {
                                int i30 = c14 ^ 1;
                                Object obj6 = objArrCopyOf[i30 == true ? 1 : 0];
                                Objects.requireNonNull(obj6);
                                zzbu zzbuVar6 = new zzbu(obj4, obj5, obj6);
                                objArrCopyOf[i30 == true ? 1 : 0] = obj5;
                                zzbuVar4 = zzbuVar6;
                                break;
                            }
                            iA2 = i29 + 1;
                        }
                    }
                    if (i25 == i14) {
                        r12 = sArr;
                        z14 = z11;
                    } else {
                        r12 = new Object[]{sArr, Integer.valueOf(i25), zzbuVar4};
                        z14 = z11;
                    }
                } else {
                    int[] iArr = new int[iHighestOneBit];
                    Arrays.fill(iArr, -1);
                    int i31 = 0;
                    int i32 = 0;
                    while (i31 < i14) {
                        int i33 = i32 + i32;
                        int i34 = i31 + i31;
                        Object obj7 = objArrCopyOf[i34];
                        Objects.requireNonNull(obj7);
                        Object obj8 = objArrCopyOf[i34 ^ 1];
                        Objects.requireNonNull(obj8);
                        int iA3 = zzbp.a(obj7.hashCode());
                        while (true) {
                            int i35 = iA3 & i16;
                            int i36 = iArr[i35];
                            if (i36 == -1) {
                                iArr[i35] = i33;
                                if (i32 < i31) {
                                    objArrCopyOf[i33] = obj7;
                                    objArrCopyOf[i33 ^ 1] = obj8;
                                }
                                i32++;
                                c12 = c13;
                                break;
                            }
                            c12 = c13;
                            if (obj7.equals(objArrCopyOf[i36])) {
                                int i37 = i36 ^ 1;
                                Object obj9 = objArrCopyOf[i37];
                                Objects.requireNonNull(obj9);
                                zzbu zzbuVar7 = new zzbu(obj7, obj8, obj9);
                                objArrCopyOf[i37] = obj8;
                                zzbuVar2 = zzbuVar7;
                                break;
                            }
                            iA3 = i35 + 1;
                            c13 = c12;
                        }
                        i31++;
                        c13 = c12;
                    }
                    c11 = c13;
                    if (i32 == i14) {
                        r9 = iArr;
                        r16 = z11;
                    } else {
                        Object[] objArr3 = new Object[3];
                        objArr3[0] = iArr;
                        objArr3[1] = Integer.valueOf(i32);
                        objArr3[c11] = zzbuVar2;
                        r9 = objArr3;
                        r16 = z11;
                    }
                }
            }
            z13 = r9 instanceof Object[];
            r11 = r9;
            if (z13) {
                objArr2 = (Object[]) r9;
                zzbuVar = (zzbu) objArr2[c11];
                if (zzbvVar != null) {
                    throw zzbuVar.a();
                }
                zzbvVar.f12267c = zzbuVar;
                Object obj10 = objArr2[r16];
                int iIntValue = ((Integer) objArr2[i12]).intValue();
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue + iIntValue);
                r11 = obj10;
                i14 = iIntValue;
            }
            return new zzcf(i14, r11, objArrCopyOf);
        }
        Objects.requireNonNull(objArrCopyOf[0]);
        Objects.requireNonNull(objArrCopyOf[1]);
        z14 = false;
        i14 = 1;
        i12 = 1;
        c11 = 2;
        r9 = r12;
        r16 = z14;
        z13 = r9 instanceof Object[];
        r11 = r9;
        if (z13) {
            objArr2 = (Object[]) r9;
            zzbuVar = (zzbu) objArr2[c11];
            if (zzbvVar != null) {
                throw zzbuVar.a();
            }
            zzbvVar.f12267c = zzbuVar;
            Object obj11 = objArr2[r16];
            int iIntValue2 = ((Integer) objArr2[i12]).intValue();
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue2 + iIntValue2);
            r11 = obj11;
            i14 = iIntValue2;
        }
        return new zzcf(i14, r11, objArrCopyOf);
    }

    @Override // com.google.android.gms.internal.play_billing.zzbw
    public final zzbq a() {
        return new zzce(1, this.f12288f, this.f12287e);
    }

    @Override // com.google.android.gms.internal.play_billing.zzbw
    public final zzbx c() {
        return new zzcc(this, this.f12287e, this.f12288f);
    }

    @Override // com.google.android.gms.internal.play_billing.zzbw
    public final zzbx d() {
        return new zzcd(this, new zzce(0, this.f12288f, this.f12287e));
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0003  */
    @Override // com.google.android.gms.internal.play_billing.zzbw, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        if (obj == null) {
            obj2 = null;
        } else {
            int i11 = this.f12288f;
            Object[] objArr = this.f12287e;
            if (i11 == 1) {
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                if (obj3.equals(obj)) {
                    obj2 = objArr[1];
                    Objects.requireNonNull(obj2);
                } else {
                    obj2 = null;
                }
            } else {
                Object obj4 = this.f12286d;
                if (obj4 == null) {
                    obj2 = null;
                } else if (obj4 instanceof byte[]) {
                    byte[] bArr = (byte[]) obj4;
                    int length = bArr.length - 1;
                    int iA = zzbp.a(obj.hashCode());
                    while (true) {
                        int i12 = iA & length;
                        int i13 = bArr[i12] & 255;
                        if (i13 == 255) {
                            break;
                        }
                        if (obj.equals(objArr[i13])) {
                            obj2 = objArr[i13 ^ 1];
                        } else {
                            iA = i12 + 1;
                        }
                    }
                    obj2 = null;
                } else if (obj4 instanceof short[]) {
                    short[] sArr = (short[]) obj4;
                    int length2 = sArr.length - 1;
                    int iA2 = zzbp.a(obj.hashCode());
                    while (true) {
                        int i14 = iA2 & length2;
                        char c11 = (char) sArr[i14];
                        if (c11 == 65535) {
                            break;
                        }
                        if (obj.equals(objArr[c11])) {
                            obj2 = objArr[c11 ^ 1];
                        } else {
                            iA2 = i14 + 1;
                        }
                    }
                    obj2 = null;
                } else {
                    int[] iArr = (int[]) obj4;
                    int length3 = iArr.length - 1;
                    int iA3 = zzbp.a(obj.hashCode());
                    while (true) {
                        int i15 = iA3 & length3;
                        int i16 = iArr[i15];
                        if (i16 == -1) {
                            break;
                        }
                        if (obj.equals(objArr[i16])) {
                            obj2 = objArr[i16 ^ 1];
                        } else {
                            iA3 = i15 + 1;
                        }
                    }
                    obj2 = null;
                }
            }
        }
        if (obj2 == null) {
            return null;
        }
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f12288f;
    }
}
