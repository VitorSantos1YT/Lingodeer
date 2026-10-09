package com.google.android.gms.internal.measurement;

import b7.e0;
import com.google.android.material.datepicker.d;
import com.google.api.Service;
import com.google.protobuf.DescriptorProtos;
import com.stkouyu.util.httputil.Consts;
import ep.a;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzaff<T> implements zzafp<T> {
    public static final int[] m = new int[0];

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Unsafe f11299n = zzagg.l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f11300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f11301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11302c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f11303d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final zzafc f11304e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f11305f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f11306g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int[] f11307h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f11308i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f11309j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final zzafz f11310k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final zzadg f11311l;

    public zzaff(int[] iArr, Object[] objArr, int i11, int i12, zzafc zzafcVar, int[] iArr2, int i13, int i14, zzafz zzafzVar, zzadg zzadgVar) {
        this.f11300a = iArr;
        this.f11301b = objArr;
        this.f11302c = i11;
        this.f11303d = i12;
        this.f11306g = zzafcVar instanceof zzadu;
        boolean z11 = false;
        if (zzadgVar != null && (zzafcVar instanceof zzadr)) {
            z11 = true;
        }
        this.f11305f = z11;
        this.f11307h = iArr2;
        this.f11308i = i13;
        this.f11309j = i14;
        this.f11310k = zzafzVar;
        this.f11311l = zzadgVar;
        this.f11304e = zzafcVar;
    }

    public static int j(int i11) {
        return (i11 >>> 20) & 255;
    }

    public static boolean k(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzadu) {
            return ((zzadu) obj).l();
        }
        return true;
    }

    public static void l(Object obj) {
        if (!k(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    public static int m(long j11, Object obj) {
        return ((Integer) zzagg.i(j11, obj)).intValue();
    }

    public static long n(long j11, Object obj) {
        return ((Long) zzagg.i(j11, obj)).longValue();
    }

    public static final int v(byte[] bArr, int i11, int i12, zzagm zzagmVar, Class cls, zzacg zzacgVar) throws zzaeh {
        zzagm zzagmVar2 = zzagm.zza;
        switch (zzagmVar.ordinal()) {
            case 0:
                int i13 = i11 + 8;
                zzacgVar.f11200c = Double.valueOf(Double.longBitsToDouble(zzach.e(bArr, i11)));
                return i13;
            case 1:
                int i14 = i11 + 4;
                zzacgVar.f11200c = Float.valueOf(Float.intBitsToFloat(zzach.d(bArr, i11)));
                return i14;
            case 2:
            case 3:
                int iC = zzach.c(bArr, i11, zzacgVar);
                zzacgVar.f11200c = Long.valueOf(zzacgVar.f11199b);
                return iC;
            case 4:
            case 12:
            case 13:
                int iA = zzach.a(bArr, i11, zzacgVar);
                zzacgVar.f11200c = Integer.valueOf(zzacgVar.f11198a);
                return iA;
            case 5:
            case 15:
                int i15 = i11 + 8;
                zzacgVar.f11200c = Long.valueOf(zzach.e(bArr, i11));
                return i15;
            case 6:
            case 14:
                int i16 = i11 + 4;
                zzacgVar.f11200c = Integer.valueOf(zzach.d(bArr, i11));
                return i16;
            case 7:
                int iC2 = zzach.c(bArr, i11, zzacgVar);
                zzacgVar.f11200c = Boolean.valueOf(zzacgVar.f11199b != 0);
                return iC2;
            case 8:
                return zzach.f(bArr, i11, zzacgVar);
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                zzafp zzafpVarA = zzafl.f11317c.a(cls);
                Object objZza = zzafpVarA.zza();
                int iH = zzach.h(objZza, zzafpVarA, bArr, i11, i12, zzacgVar);
                zzafpVarA.a(objZza);
                zzacgVar.f11200c = objZza;
                return iH;
            case 11:
                return zzach.g(bArr, i11, zzacgVar);
            case 16:
                int iA2 = zzach.a(bArr, i11, zzacgVar);
                zzacgVar.f11200c = Integer.valueOf(zzacv.j(zzacgVar.f11198a));
                return iA2;
            case 17:
                int iC3 = zzach.c(bArr, i11, zzacgVar);
                zzacgVar.f11200c = Long.valueOf(zzacv.k(zzacgVar.f11199b));
                return iC3;
        }
    }

    public static zzaga w(Object obj) {
        zzadu zzaduVar = (zzadu) obj;
        zzaga zzagaVar = zzaduVar.zzc;
        if (zzagaVar != zzaga.f11345f) {
            return zzagaVar;
        }
        zzaga zzagaVarA = zzaga.a();
        zzaduVar.zzc = zzagaVarA;
        return zzagaVarA;
    }

    /* JADX WARN: Code duplicated, block: B:170:0x035f  */
    /* JADX WARN: Code duplicated, block: B:188:0x03cb  */
    /* JADX WARN: Code duplicated, block: B:189:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:192:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:193:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:195:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:196:0x03dc  */
    public static zzaff y(zzaez zzaezVar, zzafz zzafzVar, zzadh zzadhVar) {
        int i11;
        int iCharAt;
        int i12;
        int i13;
        int[] iArr;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        char cCharAt;
        int i19;
        int i21;
        char cCharAt2;
        int i22;
        char cCharAt3;
        int i23;
        char cCharAt4;
        int i24;
        char cCharAt5;
        int i25;
        char cCharAt6;
        int i26;
        char cCharAt7;
        Object[] objArr;
        int i27;
        int i28;
        int i29;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i30;
        int i31;
        int i32;
        Field fieldZ;
        int i33;
        int i34;
        char cCharAt8;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        int i40;
        int i41;
        Field fieldZ2;
        Field fieldZ3;
        int i42;
        char cCharAt9;
        int i43;
        int i44;
        char cCharAt10;
        int i45;
        int i46;
        char cCharAt11;
        int i47;
        char cCharAt12;
        if (!(zzaezVar instanceof zzafn)) {
            throw null;
        }
        zzafn zzafnVar = (zzafn) zzaezVar;
        String str = zzafnVar.f11325b;
        int length = str.length();
        if (str.charAt(0) >= 55296) {
            int i48 = 1;
            while (true) {
                i11 = i48 + 1;
                if (str.charAt(i48) < 55296) {
                    break;
                }
                i48 = i11;
            }
        } else {
            i11 = 1;
        }
        int i49 = i11 + 1;
        int iCharAt2 = str.charAt(i11);
        if (iCharAt2 >= 55296) {
            int i50 = iCharAt2 & 8191;
            int i51 = 13;
            while (true) {
                i47 = i49 + 1;
                cCharAt12 = str.charAt(i49);
                if (cCharAt12 < 55296) {
                    break;
                }
                i50 |= (cCharAt12 & 8191) << i51;
                i51 += 13;
                i49 = i47;
            }
            iCharAt2 = i50 | (cCharAt12 << i51);
            i49 = i47;
        }
        if (iCharAt2 == 0) {
            i13 = 0;
            i16 = 0;
            iCharAt = 0;
            i12 = 0;
            i15 = 0;
            i17 = 0;
            iArr = m;
            i14 = 0;
        } else {
            int i52 = i49 + 1;
            int iCharAt3 = str.charAt(i49);
            if (iCharAt3 >= 55296) {
                int i53 = iCharAt3 & 8191;
                int i54 = 13;
                while (true) {
                    i26 = i52 + 1;
                    cCharAt7 = str.charAt(i52);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i53 |= (cCharAt7 & 8191) << i54;
                    i54 += 13;
                    i52 = i26;
                }
                iCharAt3 = i53 | (cCharAt7 << i54);
                i52 = i26;
            }
            int i55 = i52 + 1;
            int iCharAt4 = str.charAt(i52);
            if (iCharAt4 >= 55296) {
                int i56 = iCharAt4 & 8191;
                int i57 = 13;
                while (true) {
                    i25 = i55 + 1;
                    cCharAt6 = str.charAt(i55);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i56 |= (cCharAt6 & 8191) << i57;
                    i57 += 13;
                    i55 = i25;
                }
                iCharAt4 = i56 | (cCharAt6 << i57);
                i55 = i25;
            }
            int i58 = i55 + 1;
            int iCharAt5 = str.charAt(i55);
            if (iCharAt5 >= 55296) {
                int i59 = iCharAt5 & 8191;
                int i60 = 13;
                while (true) {
                    i24 = i58 + 1;
                    cCharAt5 = str.charAt(i58);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i59 |= (cCharAt5 & 8191) << i60;
                    i60 += 13;
                    i58 = i24;
                }
                iCharAt5 = i59 | (cCharAt5 << i60);
                i58 = i24;
            }
            int i61 = i58 + 1;
            int iCharAt6 = str.charAt(i58);
            if (iCharAt6 >= 55296) {
                int i62 = iCharAt6 & 8191;
                int i63 = 13;
                while (true) {
                    i23 = i61 + 1;
                    cCharAt4 = str.charAt(i61);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i62 |= (cCharAt4 & 8191) << i63;
                    i63 += 13;
                    i61 = i23;
                }
                iCharAt6 = i62 | (cCharAt4 << i63);
                i61 = i23;
            }
            int i64 = i61 + 1;
            iCharAt = str.charAt(i61);
            if (iCharAt >= 55296) {
                int i65 = iCharAt & 8191;
                int i66 = 13;
                while (true) {
                    i22 = i64 + 1;
                    cCharAt3 = str.charAt(i64);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i65 |= (cCharAt3 & 8191) << i66;
                    i66 += 13;
                    i64 = i22;
                }
                iCharAt = i65 | (cCharAt3 << i66);
                i64 = i22;
            }
            int i67 = i64 + 1;
            int iCharAt7 = str.charAt(i64);
            if (iCharAt7 >= 55296) {
                int i68 = iCharAt7 & 8191;
                int i69 = 13;
                while (true) {
                    i21 = i67 + 1;
                    cCharAt2 = str.charAt(i67);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i68 |= (cCharAt2 & 8191) << i69;
                    i69 += 13;
                    i67 = i21;
                }
                iCharAt7 = i68 | (cCharAt2 << i69);
                i67 = i21;
            }
            int i70 = i67 + 1;
            if (str.charAt(i67) >= 55296) {
                while (true) {
                    i19 = i70 + 1;
                    if (str.charAt(i70) < 55296) {
                        break;
                    }
                    i70 = i19;
                }
                i70 = i19;
            }
            int i71 = i70 + 1;
            int iCharAt8 = str.charAt(i70);
            if (iCharAt8 >= 55296) {
                int i72 = iCharAt8 & 8191;
                int i73 = 13;
                while (true) {
                    i18 = i71 + 1;
                    cCharAt = str.charAt(i71);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i72 |= (cCharAt & 8191) << i73;
                    i73 += 13;
                    i71 = i18;
                }
                iCharAt8 = i72 | (cCharAt << i73);
                i71 = i18;
            }
            int i74 = iCharAt3 + iCharAt3 + iCharAt4;
            int[] iArr2 = new int[iCharAt8 + iCharAt7 + iCharAt3];
            int i75 = iCharAt7;
            i12 = iCharAt5;
            i13 = i75;
            iArr = iArr2;
            i14 = iCharAt3;
            i49 = i71;
            i15 = iCharAt6;
            i16 = i74;
            i17 = iCharAt8;
        }
        Unsafe unsafe = f11299n;
        Object[] objArr2 = zzafnVar.f11326c;
        Class<?> cls = zzafnVar.f11324a.getClass();
        int i76 = i17 + i13;
        int i77 = iCharAt + iCharAt;
        int[] iArr3 = new int[iCharAt * 3];
        Object[] objArr3 = new Object[i77];
        int i78 = i76;
        int i79 = i17;
        int i80 = 0;
        int i81 = 0;
        while (i49 < length) {
            int i82 = i49 + 1;
            int iCharAt9 = str.charAt(i49);
            int i83 = length;
            if (iCharAt9 >= 55296) {
                int i84 = iCharAt9 & 8191;
                int i85 = i82;
                int i86 = 13;
                while (true) {
                    i46 = i85 + 1;
                    cCharAt11 = str.charAt(i85);
                    objArr = objArr2;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i84 |= (cCharAt11 & 8191) << i86;
                    i86 += 13;
                    i85 = i46;
                    objArr2 = objArr;
                }
                iCharAt9 = i84 | (cCharAt11 << i86);
                i27 = i46;
            } else {
                objArr = objArr2;
                i27 = i82;
            }
            int i87 = i27 + 1;
            int iCharAt10 = str.charAt(i27);
            if (iCharAt10 >= 55296) {
                int i88 = iCharAt10 & 8191;
                int i89 = i87;
                int i90 = 13;
                while (true) {
                    i44 = i89 + 1;
                    cCharAt10 = str.charAt(i89);
                    i45 = i88;
                    if (cCharAt10 < 55296) {
                        break;
                    }
                    i88 = i45 | ((cCharAt10 & 8191) << i90);
                    i90 += 13;
                    i89 = i44;
                }
                iCharAt10 = i45 | (cCharAt10 << i90);
                i28 = i44;
            } else {
                i28 = i87;
            }
            int i91 = iCharAt9;
            if ((iCharAt10 & 1024) != 0) {
                iArr[i81] = i80;
                i81++;
            }
            int i92 = iCharAt10 & 255;
            Object[] objArr4 = objArr3;
            int i93 = iCharAt10 & 2048;
            if (i92 >= 51) {
                int i94 = i28 + 1;
                int iCharAt11 = str.charAt(i28);
                if (iCharAt11 >= 55296) {
                    int i95 = iCharAt11 & 8191;
                    int i96 = i94;
                    int i97 = 13;
                    while (true) {
                        i42 = i96 + 1;
                        cCharAt9 = str.charAt(i96);
                        i43 = i95;
                        if (cCharAt9 < 55296) {
                            break;
                        }
                        i95 = i43 | ((cCharAt9 & 8191) << i97);
                        i97 += 13;
                        i96 = i42;
                    }
                    iCharAt11 = i43 | (cCharAt9 << i97);
                    i40 = i42;
                } else {
                    i40 = i94;
                }
                int i98 = iCharAt11;
                int i99 = i92 - 51;
                i30 = i40;
                if (i99 == 9 || i99 == 17) {
                    objArr4[e0.a(i80, 3, 1)] = objArr[i16];
                    i41 = i93;
                    i16++;
                } else if (i99 != 12) {
                    i41 = i93;
                } else if (zzafnVar.zzc() == 1 || i93 != 0) {
                    objArr4[e0.a(i80, 3, 1)] = objArr[i16];
                    i16++;
                    i41 = i93;
                } else {
                    i41 = 0;
                }
                int i100 = i98 + i98;
                Object obj = objArr[i100];
                int i101 = i41;
                if (obj instanceof Field) {
                    fieldZ2 = (Field) obj;
                } else {
                    fieldZ2 = z(cls, (String) obj);
                    objArr[i100] = fieldZ2;
                    iArr[i78] = i80;
                    i78++;
                }
                i29 = i14;
                int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldZ2);
                int i102 = i100 + 1;
                Object obj2 = objArr[i102];
                if (obj2 instanceof Field) {
                    fieldZ3 = (Field) obj2;
                } else {
                    fieldZ3 = z(cls, (String) obj2);
                    objArr[i102] = fieldZ3;
                }
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZ3);
                i76 = i76;
                i31 = iObjectFieldOffset3;
                i32 = i101;
            } else {
                i29 = i14;
                int i103 = i16 + 1;
                Field fieldZ4 = z(cls, (String) objArr[i16]);
                if (i92 == 9 || i92 == 17) {
                    objArr4[e0.a(i80, 3, 1)] = fieldZ4.getType();
                } else {
                    if (i92 != 27) {
                        if (i92 == 49) {
                            i16 += 2;
                            i35 = 3;
                            i36 = 1;
                        } else if (i92 == 12 || i92 == 30 || i92 == 44) {
                            i76 = i76;
                            if (zzafnVar.zzc() == 1 || i93 != 0) {
                                i16 += 2;
                                objArr4[e0.a(i80, 3, 1)] = objArr[i103];
                            } else {
                                i16 = i103;
                                i93 = 0;
                            }
                        } else if (i92 == 50) {
                            int i104 = i16 + 2;
                            i79++;
                            iArr[i79] = i80;
                            int i105 = i80 / 3;
                            int i106 = i105 + i105;
                            objArr4[i106] = objArr[i103];
                            if (i93 != 0) {
                                i16 += 3;
                                objArr4[i106 + 1] = objArr[i104];
                            } else {
                                i16 = i104;
                                i93 = 0;
                            }
                            i76 = i76;
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZ4);
                        iObjectFieldOffset2 = 1048575;
                        if ((iCharAt10 & 4096) != 0 || i92 > 17) {
                            i30 = i28;
                            i31 = iObjectFieldOffset;
                            i32 = i93;
                        } else {
                            int i107 = i28 + 1;
                            int iCharAt12 = str.charAt(i28);
                            if (iCharAt12 >= 55296) {
                                int i108 = iCharAt12 & 8191;
                                int i109 = 13;
                                while (true) {
                                    i34 = i107 + 1;
                                    cCharAt8 = str.charAt(i107);
                                    if (cCharAt8 < 55296) {
                                        break;
                                    }
                                    i108 |= (cCharAt8 & 8191) << i109;
                                    i109 += 13;
                                    i107 = i34;
                                }
                                iCharAt12 = i108 | (cCharAt8 << i109);
                                i107 = i34;
                            }
                            int i110 = (iCharAt12 / 32) + i29 + i29;
                            Object obj3 = objArr[i110];
                            str = str;
                            if (obj3 instanceof Field) {
                                fieldZ = (Field) obj3;
                            } else {
                                fieldZ = z(cls, (String) obj3);
                                objArr[i110] = fieldZ;
                            }
                            i92 = i92;
                            i33 = iCharAt12 % 32;
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZ);
                            i31 = iObjectFieldOffset;
                            i30 = i107;
                            i32 = i93;
                        }
                        int i111 = i80 + 1;
                        iArr3[i80] = i91;
                        int i112 = i80 + 2;
                        int i113 = i92;
                        if ((iCharAt10 & 512) != 0) {
                            i37 = 536870912;
                        } else {
                            i37 = 0;
                        }
                        if ((iCharAt10 & 256) != 0) {
                            i38 = 268435456;
                        } else {
                            i38 = 0;
                        }
                        if (i32 != 0) {
                            i39 = Integer.MIN_VALUE;
                        } else {
                            i39 = 0;
                        }
                        iArr3[i111] = i37 | i38 | i39 | (i113 << 20) | i31;
                        i80 += 3;
                        iArr3[i112] = (i33 << 20) | iObjectFieldOffset2;
                        length = i83;
                        objArr3 = objArr4;
                        objArr2 = objArr;
                        i76 = i76;
                        str = str;
                        i49 = i30;
                        i14 = i29;
                    } else {
                        i35 = 3;
                        i36 = 1;
                        i16 += 2;
                    }
                    objArr4[e0.a(i80, i35, i36)] = objArr[i103];
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZ4);
                    iObjectFieldOffset2 = 1048575;
                    if ((iCharAt10 & 4096) != 0) {
                    }
                    i30 = i28;
                    i31 = iObjectFieldOffset;
                    i32 = i93;
                }
                i16 = i103;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZ4);
                iObjectFieldOffset2 = 1048575;
                if ((iCharAt10 & 4096) != 0) {
                }
                i30 = i28;
                i31 = iObjectFieldOffset;
                i32 = i93;
            }
            i33 = 0;
            int i114 = i80 + 1;
            iArr3[i80] = i91;
            int i115 = i80 + 2;
            int i116 = i92;
            if ((iCharAt10 & 512) != 0) {
                i37 = 536870912;
            } else {
                i37 = 0;
            }
            if ((iCharAt10 & 256) != 0) {
                i38 = 268435456;
            } else {
                i38 = 0;
            }
            if (i32 != 0) {
                i39 = Integer.MIN_VALUE;
            } else {
                i39 = 0;
            }
            iArr3[i114] = i37 | i38 | i39 | (i116 << 20) | i31;
            i80 += 3;
            iArr3[i115] = (i33 << 20) | iObjectFieldOffset2;
            length = i83;
            objArr3 = objArr4;
            objArr2 = objArr;
            i76 = i76;
            str = str;
            i49 = i30;
            i14 = i29;
        }
        return new zzaff(iArr3, objArr3, i12, i15, zzafnVar.f11324a, iArr, i17, i76, zzafzVar, zzadhVar);
    }

    public static Field z(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e8) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String string = Arrays.toString(declaredFields);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 11 + name.length() + 29 + String.valueOf(string).length());
            d.w(sb2, "Field ", str, " for ", name);
            throw new RuntimeException(a.k(sb2, " not found. Known fields are ", string), e8);
        }
    }

    public final void A(int i11, Object obj, Object obj2) {
        if (q(i11, obj2)) {
            int i12 = i(i11) & 1048575;
            Unsafe unsafe = f11299n;
            long j11 = i12;
            Object object = unsafe.getObject(obj2, j11);
            if (object == null) {
                int i13 = this.f11300a[i11];
                String string = obj2.toString();
                StringBuilder sb2 = new StringBuilder(String.valueOf(i13).length() + 38 + string.length());
                sb2.append("Source subfield ");
                sb2.append(i13);
                sb2.append(" is present but null: ");
                sb2.append(string);
                throw new IllegalStateException(sb2.toString());
            }
            zzafp zzafpVarC = C(i11);
            if (!q(i11, obj)) {
                if (k(object)) {
                    Object objZza = zzafpVarC.zza();
                    zzafpVarC.c(objZza, object);
                    unsafe.putObject(obj, j11, objZza);
                } else {
                    unsafe.putObject(obj, j11, object);
                }
                r(i11, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j11);
            if (!k(object2)) {
                Object objZza2 = zzafpVarC.zza();
                zzafpVarC.c(objZza2, object2);
                unsafe.putObject(obj, j11, objZza2);
                object2 = objZza2;
            }
            zzafpVarC.c(object2, object);
        }
    }

    public final void B(int i11, Object obj, Object obj2) {
        int[] iArr = this.f11300a;
        int i12 = iArr[i11];
        if (s(i12, i11, obj2)) {
            int i13 = i(i11) & 1048575;
            Unsafe unsafe = f11299n;
            long j11 = i13;
            Object object = unsafe.getObject(obj2, j11);
            if (object == null) {
                int i14 = iArr[i11];
                String string = obj2.toString();
                StringBuilder sb2 = new StringBuilder(String.valueOf(i14).length() + 38 + string.length());
                sb2.append("Source subfield ");
                sb2.append(i14);
                sb2.append(" is present but null: ");
                sb2.append(string);
                throw new IllegalStateException(sb2.toString());
            }
            zzafp zzafpVarC = C(i11);
            if (!s(i12, i11, obj)) {
                if (k(object)) {
                    Object objZza = zzafpVarC.zza();
                    zzafpVarC.c(objZza, object);
                    unsafe.putObject(obj, j11, objZza);
                } else {
                    unsafe.putObject(obj, j11, object);
                }
                t(i12, i11, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j11);
            if (!k(object2)) {
                Object objZza2 = zzafpVarC.zza();
                zzafpVarC.c(objZza2, object2);
                unsafe.putObject(obj, j11, objZza2);
                object2 = objZza2;
            }
            zzafpVarC.c(object2, object);
        }
    }

    public final zzafp C(int i11) {
        int i12 = i11 / 3;
        int i13 = i12 + i12;
        Object[] objArr = this.f11301b;
        zzafp zzafpVar = (zzafp) objArr[i13];
        if (zzafpVar != null) {
            return zzafpVar;
        }
        zzafp zzafpVarA = zzafl.f11317c.a((Class) objArr[i13 + 1]);
        objArr[i13] = zzafpVarA;
        return zzafpVarA;
    }

    public final Object D(int i11) {
        int i12 = i11 / 3;
        return this.f11301b[i12 + i12];
    }

    public final zzadz E(int i11) {
        int i12 = i11 / 3;
        return (zzadz) this.f11301b[i12 + i12 + 1];
    }

    public final Object F(int i11, Object obj) {
        zzafp zzafpVarC = C(i11);
        int i12 = i(i11) & 1048575;
        if (!q(i11, obj)) {
            return zzafpVarC.zza();
        }
        Object object = f11299n.getObject(obj, i12);
        if (k(object)) {
            return object;
        }
        Object objZza = zzafpVarC.zza();
        if (object != null) {
            zzafpVarC.c(objZza, object);
        }
        return objZza;
    }

    public final void G(int i11, Object obj, Object obj2) {
        f11299n.putObject(obj, i(i11) & 1048575, obj2);
        r(i11, obj);
    }

    public final Object H(int i11, int i12, Object obj) {
        zzafp zzafpVarC = C(i12);
        if (!s(i11, i12, obj)) {
            return zzafpVarC.zza();
        }
        Object object = f11299n.getObject(obj, i(i12) & 1048575);
        if (k(object)) {
            return object;
        }
        Object objZza = zzafpVarC.zza();
        if (object != null) {
            zzafpVarC.c(objZza, object);
        }
        return objZza;
    }

    public final void I(Object obj, int i11, int i12, Object obj2) {
        f11299n.putObject(obj, i(i12) & 1048575, obj2);
        t(i11, i12, obj);
    }

    public final Object J(Object obj, int i11, Object obj2, zzafz zzafzVar, Object obj3) {
        zzadz zzadzVarE;
        int i12 = this.f11300a[i11];
        Object objI = zzagg.i(i(i11) & 1048575, obj);
        if (objI == null || (zzadzVarE = E(i11)) == null) {
            return obj2;
        }
        zzaeu zzaeuVar = ((zzaev) D(i11)).f11293a;
        Iterator it = ((zzaew) objI).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!zzadzVarE.zza(((Integer) entry.getValue()).intValue())) {
                if (obj2 == null) {
                    obj2 = zzafzVar.h(obj3);
                }
                int iB = zzaev.b(zzaeuVar, entry.getKey(), entry.getValue());
                zzacr zzacrVar = zzacr.f11213b;
                byte[] bArr = new byte[iB];
                boolean z11 = zzada.f11245b;
                zzacx zzacxVar = new zzacx(bArr, iB);
                try {
                    zzaev.a(zzacxVar, zzaeuVar, entry.getKey(), entry.getValue());
                    zzacxVar.e();
                    zzafzVar.d(obj2, i12, new zzacq(bArr));
                    it.remove();
                } catch (IOException e8) {
                    throw new RuntimeException(e8);
                }
            }
        }
        return obj2;
    }

    public final void K(int i11, zzacw zzacwVar, Object obj) {
        long j11 = i11 & 1048575;
        if ((536870912 & i11) != 0) {
            zzagg.j(obj, j11, zzacwVar.H());
        } else if (this.f11306g) {
            zzagg.j(obj, j11, zzacwVar.G());
        } else {
            zzagg.j(obj, j11, zzacwVar.K());
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006c  */
    /* JADX WARN: Code duplicated, block: B:28:0x0072  */
    /* JADX WARN: Code duplicated, block: B:41:0x007f A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.measurement.zzafp
    public final void a(Object obj) {
        if (!k(obj)) {
            return;
        }
        if (obj instanceof zzadu) {
            zzadu zzaduVar = (zzadu) obj;
            zzaduVar.r();
            zzaduVar.zza = 0;
            zzaduVar.m();
        }
        int i11 = 0;
        while (true) {
            int[] iArr = this.f11300a;
            if (i11 >= iArr.length) {
                this.f11310k.j(obj);
                if (this.f11305f) {
                    this.f11311l.a(obj);
                    return;
                }
                return;
            }
            int i12 = i(i11);
            int i13 = 1048575 & i12;
            int iJ = j(i12);
            long j11 = i13;
            if (iJ != 9) {
                if (iJ != 60 && iJ != 68) {
                    switch (iJ) {
                        case 17:
                            if (q(i11, obj)) {
                                C(i11).a(f11299n.getObject(obj, j11));
                            }
                            break;
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case Service.METRICS_FIELD_NUMBER /* 24 */:
                        case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        case Service.BILLING_FIELD_NUMBER /* 26 */:
                        case 27:
                        case Service.MONITORING_FIELD_NUMBER /* 28 */:
                        case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
                        case 30:
                        case 31:
                        case Consts.SP /* 32 */:
                        case 33:
                        case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                        case 35:
                        case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                        case 37:
                        case 38:
                        case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                        case DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                        case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                        case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                        case 43:
                        case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                        case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                            ((zzaef) zzagg.i(j11, obj)).zzb();
                            break;
                        case 50:
                            Unsafe unsafe = f11299n;
                            Object object = unsafe.getObject(obj, j11);
                            if (object != null) {
                                ((zzaew) object).f11295a = false;
                                unsafe.putObject(obj, j11, object);
                            }
                            break;
                    }
                } else if (s(iArr[i11], i11, obj)) {
                    C(i11).a(f11299n.getObject(obj, j11));
                }
            } else if (q(i11, obj)) {
                C(i11).a(f11299n.getObject(obj, j11));
            }
            i11 += 3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0025  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.measurement.zzafp
    public final void b(Object obj, zzadb zzadbVar) {
        Map.Entry entry;
        int i11;
        zzaff<T> zzaffVar = this;
        zzada zzadaVar = zzadbVar.f11247a;
        if (zzaffVar.f11305f) {
            zzadk zzadkVar = ((zzadr) obj).zzb;
            if (zzadkVar.f11258a.isEmpty()) {
                entry = null;
            } else {
                entry = (Map.Entry) zzadkVar.b().next();
            }
        } else {
            entry = null;
        }
        Unsafe unsafe = f11299n;
        int i12 = 1048575;
        int i13 = 1048575;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            int[] iArr = zzaffVar.f11300a;
            if (i14 >= iArr.length) {
                if (entry == null) {
                    ((zzadu) obj).zzc.b(zzadbVar);
                    return;
                } else {
                    throw null;
                }
            }
            int i16 = zzaffVar.i(i14);
            int iJ = j(i16);
            int i17 = iArr[i14];
            if (iJ <= 17) {
                int i18 = iArr[i14 + 2];
                int i19 = i18 & i12;
                if (i19 != i13) {
                    i15 = i19 == i12 ? 0 : unsafe.getInt(obj, i19);
                    i13 = i19;
                }
                i11 = 1 << (i18 >>> 20);
            } else {
                i11 = 0;
            }
            if (entry != null) {
                throw null;
            }
            long j11 = i16 & i12;
            switch (iJ) {
                case 0:
                    if (zzaffVar.p(obj, i14, i13, i15, i11)) {
                        zzadbVar.g(i17, zzagg.f11354c.f(j11, obj));
                    }
                    break;
                case 1:
                    if (zzaffVar.p(obj, i14, i13, i15, i11)) {
                        zzadbVar.f(i17, zzagg.f11354c.d(j11, obj));
                    }
                    break;
                case 2:
                    if (zzaffVar.p(obj, i14, i13, i15, i11)) {
                        zzadbVar.d(i17, unsafe.getLong(obj, j11));
                    }
                    break;
                case 3:
                    if (zzaffVar.p(obj, i14, i13, i15, i11)) {
                        zzadbVar.i(i17, unsafe.getLong(obj, j11));
                    }
                    break;
                case 4:
                    if (zzaffVar.p(obj, i14, i13, i15, i11)) {
                        zzadbVar.j(i17, unsafe.getInt(obj, j11));
                    }
                    break;
                case 5:
                    if (zzaffVar.p(obj, i14, i13, i15, i11)) {
                        zzadbVar.k(i17, unsafe.getLong(obj, j11));
                    }
                    break;
                case 6:
                    if (zzaffVar.p(obj, i14, i13, i15, i11)) {
                        zzadbVar.l(i17, unsafe.getInt(obj, j11));
                    }
                    break;
                case 7:
                    if (zzaffVar.p(obj, i14, i13, i15, i11)) {
                        zzadbVar.m(i17, zzagg.f11354c.b(j11, obj));
                    }
                    break;
                case 8:
                    if (zzaffVar.p(obj, i14, i13, i15, i11)) {
                        Object object = unsafe.getObject(obj, j11);
                        if (object instanceof String) {
                            zzadaVar.m(i17, (String) object);
                        } else {
                            zzadbVar.n(i17, (zzacr) object);
                        }
                    }
                    break;
                case 9:
                    if (zzaffVar.p(obj, i14, i13, i15, i11)) {
                        zzadbVar.r(i17, unsafe.getObject(obj, j11), zzaffVar.C(i14));
                    }
                    break;
                case 10:
                    if (zzaffVar.p(obj, i14, i13, i15, i11)) {
                        zzadbVar.n(i17, (zzacr) unsafe.getObject(obj, j11));
                    }
                    break;
                case 11:
                    if (zzaffVar.p(obj, i14, i13, i15, i11)) {
                        zzadbVar.o(i17, unsafe.getInt(obj, j11));
                    }
                    break;
                case 12:
                    if (zzaffVar.p(obj, i14, i13, i15, i11)) {
                        zzadbVar.h(i17, unsafe.getInt(obj, j11));
                    }
                    break;
                case 13:
                    if (zzaffVar.p(obj, i14, i13, i15, i11)) {
                        zzadbVar.c(i17, unsafe.getInt(obj, j11));
                    }
                    break;
                case 14:
                    if (zzaffVar.p(obj, i14, i13, i15, i11)) {
                        zzadbVar.e(i17, unsafe.getLong(obj, j11));
                    }
                    break;
                case 15:
                    if (zzaffVar.p(obj, i14, i13, i15, i11)) {
                        zzadbVar.p(i17, unsafe.getInt(obj, j11));
                    }
                    break;
                case 16:
                    if (zzaffVar.p(obj, i14, i13, i15, i11)) {
                        zzadbVar.q(i17, unsafe.getLong(obj, j11));
                    }
                    break;
                case 17:
                    if (zzaffVar.p(obj, i14, i13, i15, i11)) {
                        zzadbVar.s(i17, unsafe.getObject(obj, j11), zzaffVar.C(i14));
                    }
                    break;
                case 18:
                    int i21 = iArr[i14];
                    List list = (List) unsafe.getObject(obj, j11);
                    zzagb zzagbVar = zzafq.f11328a;
                    if (list != null && !list.isEmpty()) {
                        if (list instanceof zzadc) {
                            zzadc zzadcVar = (zzadc) list;
                            for (int i22 = 0; i22 < zzadcVar.f11250c; i22++) {
                                zzadcVar.e(i22);
                                zzadaVar.k(i21, Double.doubleToRawLongBits(zzadcVar.f11249b[i22]));
                            }
                        } else {
                            for (int i23 = 0; i23 < list.size(); i23++) {
                                zzadaVar.k(i21, Double.doubleToRawLongBits(((Double) list.get(i23)).doubleValue()));
                            }
                        }
                    }
                    break;
                case 19:
                    int i24 = iArr[i14];
                    List list2 = (List) unsafe.getObject(obj, j11);
                    zzagb zzagbVar2 = zzafq.f11328a;
                    if (list2 != null && !list2.isEmpty()) {
                        if (list2 instanceof zzadm) {
                            zzadm zzadmVar = (zzadm) list2;
                            for (int i25 = 0; i25 < zzadmVar.f11263c; i25++) {
                                zzadmVar.e(i25);
                                zzadaVar.i(i24, Float.floatToRawIntBits(zzadmVar.f11262b[i25]));
                            }
                        } else {
                            for (int i26 = 0; i26 < list2.size(); i26++) {
                                zzadaVar.i(i24, Float.floatToRawIntBits(((Float) list2.get(i26)).floatValue()));
                            }
                        }
                    }
                    break;
                case 20:
                    int i27 = iArr[i14];
                    List list3 = (List) unsafe.getObject(obj, j11);
                    zzagb zzagbVar3 = zzafq.f11328a;
                    if (list3 != null && !list3.isEmpty()) {
                        if (list3 instanceof zzaeq) {
                            zzaeq zzaeqVar = (zzaeq) list3;
                            for (int i28 = 0; i28 < zzaeqVar.f11286c; i28++) {
                                zzadaVar.j(i27, zzaeqVar.p(i28));
                            }
                        } else {
                            for (int i29 = 0; i29 < list3.size(); i29++) {
                                zzadaVar.j(i27, ((Long) list3.get(i29)).longValue());
                            }
                        }
                    }
                    break;
                case 21:
                    int i30 = iArr[i14];
                    List list4 = (List) unsafe.getObject(obj, j11);
                    zzagb zzagbVar4 = zzafq.f11328a;
                    if (list4 != null && !list4.isEmpty()) {
                        if (list4 instanceof zzaeq) {
                            zzaeq zzaeqVar2 = (zzaeq) list4;
                            for (int i31 = 0; i31 < zzaeqVar2.f11286c; i31++) {
                                zzadaVar.j(i30, zzaeqVar2.p(i31));
                            }
                        } else {
                            for (int i32 = 0; i32 < list4.size(); i32++) {
                                zzadaVar.j(i30, ((Long) list4.get(i32)).longValue());
                            }
                        }
                    }
                    break;
                case 22:
                    int i33 = iArr[i14];
                    List list5 = (List) unsafe.getObject(obj, j11);
                    zzagb zzagbVar5 = zzafq.f11328a;
                    if (list5 != null && !list5.isEmpty()) {
                        if (list5 instanceof zzadv) {
                            zzadv zzadvVar = (zzadv) list5;
                            for (int i34 = 0; i34 < zzadvVar.f11271c; i34++) {
                                zzadaVar.g(i33, zzadvVar.U(i34));
                            }
                        } else {
                            for (int i35 = 0; i35 < list5.size(); i35++) {
                                zzadaVar.g(i33, ((Integer) list5.get(i35)).intValue());
                            }
                        }
                    }
                    break;
                case 23:
                    int i36 = iArr[i14];
                    List list6 = (List) unsafe.getObject(obj, j11);
                    zzagb zzagbVar6 = zzafq.f11328a;
                    if (list6 != null && !list6.isEmpty()) {
                        if (list6 instanceof zzaeq) {
                            zzaeq zzaeqVar3 = (zzaeq) list6;
                            for (int i37 = 0; i37 < zzaeqVar3.f11286c; i37++) {
                                zzadaVar.k(i36, zzaeqVar3.p(i37));
                            }
                        } else {
                            for (int i38 = 0; i38 < list6.size(); i38++) {
                                zzadaVar.k(i36, ((Long) list6.get(i38)).longValue());
                            }
                        }
                    }
                    break;
                case Service.METRICS_FIELD_NUMBER /* 24 */:
                    int i39 = iArr[i14];
                    List list7 = (List) unsafe.getObject(obj, j11);
                    zzagb zzagbVar7 = zzafq.f11328a;
                    if (list7 != null && !list7.isEmpty()) {
                        if (list7 instanceof zzadv) {
                            zzadv zzadvVar2 = (zzadv) list7;
                            for (int i40 = 0; i40 < zzadvVar2.f11271c; i40++) {
                                zzadaVar.i(i39, zzadvVar2.U(i40));
                            }
                        } else {
                            for (int i41 = 0; i41 < list7.size(); i41++) {
                                zzadaVar.i(i39, ((Integer) list7.get(i41)).intValue());
                            }
                        }
                    }
                    break;
                case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                    int i42 = iArr[i14];
                    List list8 = (List) unsafe.getObject(obj, j11);
                    zzagb zzagbVar8 = zzafq.f11328a;
                    if (list8 != null && !list8.isEmpty()) {
                        if (list8 instanceof zzaci) {
                            zzaci zzaciVar = (zzaci) list8;
                            for (int i43 = 0; i43 < zzaciVar.f11205c; i43++) {
                                zzaciVar.e(i43);
                                zzadaVar.l(i42, zzaciVar.f11204b[i43]);
                            }
                        } else {
                            for (int i44 = 0; i44 < list8.size(); i44++) {
                                zzadaVar.l(i42, ((Boolean) list8.get(i44)).booleanValue());
                            }
                        }
                    }
                    break;
                case Service.BILLING_FIELD_NUMBER /* 26 */:
                    int i45 = iArr[i14];
                    List list9 = (List) unsafe.getObject(obj, j11);
                    zzagb zzagbVar9 = zzafq.f11328a;
                    if (list9 != null && !list9.isEmpty()) {
                        zzadbVar.a(i45, list9);
                    }
                    break;
                case 27:
                    int i46 = iArr[i14];
                    List list10 = (List) unsafe.getObject(obj, j11);
                    zzafp zzafpVarC = zzaffVar.C(i14);
                    zzagb zzagbVar10 = zzafq.f11328a;
                    if (list10 != null && !list10.isEmpty()) {
                        for (int i47 = 0; i47 < list10.size(); i47++) {
                            zzadbVar.r(i46, list10.get(i47), zzafpVarC);
                        }
                    }
                    break;
                case Service.MONITORING_FIELD_NUMBER /* 28 */:
                    int i48 = iArr[i14];
                    List list11 = (List) unsafe.getObject(obj, j11);
                    zzagb zzagbVar11 = zzafq.f11328a;
                    if (list11 != null && !list11.isEmpty()) {
                        zzadbVar.b(i48, list11);
                    }
                    break;
                case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
                    int i49 = iArr[i14];
                    List list12 = (List) unsafe.getObject(obj, j11);
                    zzagb zzagbVar12 = zzafq.f11328a;
                    if (list12 != null && !list12.isEmpty()) {
                        if (list12 instanceof zzadv) {
                            zzadv zzadvVar3 = (zzadv) list12;
                            for (int i50 = 0; i50 < zzadvVar3.f11271c; i50++) {
                                zzadaVar.h(i49, zzadvVar3.U(i50));
                            }
                        } else {
                            for (int i51 = 0; i51 < list12.size(); i51++) {
                                zzadaVar.h(i49, ((Integer) list12.get(i51)).intValue());
                            }
                        }
                    }
                    break;
                case 30:
                    int i52 = iArr[i14];
                    List list13 = (List) unsafe.getObject(obj, j11);
                    zzagb zzagbVar13 = zzafq.f11328a;
                    if (list13 != null && !list13.isEmpty()) {
                        if (list13 instanceof zzadv) {
                            zzadv zzadvVar4 = (zzadv) list13;
                            for (int i53 = 0; i53 < zzadvVar4.f11271c; i53++) {
                                zzadaVar.g(i52, zzadvVar4.U(i53));
                            }
                        } else {
                            for (int i54 = 0; i54 < list13.size(); i54++) {
                                zzadaVar.g(i52, ((Integer) list13.get(i54)).intValue());
                            }
                        }
                    }
                    break;
                case 31:
                    int i55 = iArr[i14];
                    List list14 = (List) unsafe.getObject(obj, j11);
                    zzagb zzagbVar14 = zzafq.f11328a;
                    if (list14 != null && !list14.isEmpty()) {
                        if (list14 instanceof zzadv) {
                            zzadv zzadvVar5 = (zzadv) list14;
                            for (int i56 = 0; i56 < zzadvVar5.f11271c; i56++) {
                                zzadaVar.i(i55, zzadvVar5.U(i56));
                            }
                        } else {
                            for (int i57 = 0; i57 < list14.size(); i57++) {
                                zzadaVar.i(i55, ((Integer) list14.get(i57)).intValue());
                            }
                        }
                    }
                    break;
                case Consts.SP /* 32 */:
                    int i58 = iArr[i14];
                    List list15 = (List) unsafe.getObject(obj, j11);
                    zzagb zzagbVar15 = zzafq.f11328a;
                    if (list15 != null && !list15.isEmpty()) {
                        if (list15 instanceof zzaeq) {
                            zzaeq zzaeqVar4 = (zzaeq) list15;
                            for (int i59 = 0; i59 < zzaeqVar4.f11286c; i59++) {
                                zzadaVar.k(i58, zzaeqVar4.p(i59));
                            }
                        } else {
                            for (int i60 = 0; i60 < list15.size(); i60++) {
                                zzadaVar.k(i58, ((Long) list15.get(i60)).longValue());
                            }
                        }
                    }
                    break;
                case 33:
                    int i61 = iArr[i14];
                    List list16 = (List) unsafe.getObject(obj, j11);
                    zzagb zzagbVar16 = zzafq.f11328a;
                    if (list16 != null && !list16.isEmpty()) {
                        if (list16 instanceof zzadv) {
                            zzadv zzadvVar6 = (zzadv) list16;
                            for (int i62 = 0; i62 < zzadvVar6.f11271c; i62++) {
                                int iU = zzadvVar6.U(i62);
                                zzadaVar.h(i61, (iU >> 31) ^ (iU + iU));
                            }
                        } else {
                            for (int i63 = 0; i63 < list16.size(); i63++) {
                                int iIntValue = ((Integer) list16.get(i63)).intValue();
                                zzadaVar.h(i61, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                            }
                        }
                    }
                    break;
                case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                    int i64 = iArr[i14];
                    List list17 = (List) unsafe.getObject(obj, j11);
                    zzagb zzagbVar17 = zzafq.f11328a;
                    if (list17 != null && !list17.isEmpty()) {
                        if (list17 instanceof zzaeq) {
                            zzaeq zzaeqVar5 = (zzaeq) list17;
                            for (int i65 = 0; i65 < zzaeqVar5.f11286c; i65++) {
                                long jP = zzaeqVar5.p(i65);
                                zzadaVar.j(i64, (jP >> 63) ^ (jP + jP));
                            }
                        } else {
                            for (int i66 = 0; i66 < list17.size(); i66++) {
                                long jLongValue = ((Long) list17.get(i66)).longValue();
                                zzadaVar.j(i64, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                            }
                        }
                    }
                    break;
                case 35:
                    int i67 = iArr[i14];
                    List list18 = (List) unsafe.getObject(obj, j11);
                    zzagb zzagbVar18 = zzafq.f11328a;
                    if (list18 != null && !list18.isEmpty()) {
                        if (list18 instanceof zzadc) {
                            zzadc zzadcVar2 = (zzadc) list18;
                            zzadaVar.f(i67, 2);
                            int i68 = 0;
                            for (int i69 = 0; i69 < zzadcVar2.f11250c; i69++) {
                                zzadcVar2.e(i69);
                                double d5 = zzadcVar2.f11249b[i69];
                                i68 += 8;
                            }
                            zzadaVar.v(i68);
                            for (int i70 = 0; i70 < zzadcVar2.f11250c; i70++) {
                                zzadcVar2.e(i70);
                                zzadaVar.y(Double.doubleToRawLongBits(zzadcVar2.f11249b[i70]));
                            }
                        } else {
                            zzadaVar.f(i67, 2);
                            int i71 = 0;
                            for (int i72 = 0; i72 < list18.size(); i72++) {
                                ((Double) list18.get(i72)).getClass();
                                i71 += 8;
                            }
                            zzadaVar.v(i71);
                            for (int i73 = 0; i73 < list18.size(); i73++) {
                                zzadaVar.y(Double.doubleToRawLongBits(((Double) list18.get(i73)).doubleValue()));
                            }
                        }
                    }
                    break;
                case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    int i74 = iArr[i14];
                    List list19 = (List) unsafe.getObject(obj, j11);
                    zzagb zzagbVar19 = zzafq.f11328a;
                    if (list19 != null && !list19.isEmpty()) {
                        if (list19 instanceof zzadm) {
                            zzadm zzadmVar2 = (zzadm) list19;
                            zzadaVar.f(i74, 2);
                            int i75 = 0;
                            for (int i76 = 0; i76 < zzadmVar2.f11263c; i76++) {
                                zzadmVar2.e(i76);
                                float f5 = zzadmVar2.f11262b[i76];
                                i75 += 4;
                            }
                            zzadaVar.v(i75);
                            for (int i77 = 0; i77 < zzadmVar2.f11263c; i77++) {
                                zzadmVar2.e(i77);
                                zzadaVar.w(Float.floatToRawIntBits(zzadmVar2.f11262b[i77]));
                            }
                        } else {
                            zzadaVar.f(i74, 2);
                            int i78 = 0;
                            for (int i79 = 0; i79 < list19.size(); i79++) {
                                ((Float) list19.get(i79)).getClass();
                                i78 += 4;
                            }
                            zzadaVar.v(i78);
                            for (int i80 = 0; i80 < list19.size(); i80++) {
                                zzadaVar.w(Float.floatToRawIntBits(((Float) list19.get(i80)).floatValue()));
                            }
                        }
                    }
                    break;
                case 37:
                    int i81 = iArr[i14];
                    List list20 = (List) unsafe.getObject(obj, j11);
                    zzagb zzagbVar20 = zzafq.f11328a;
                    if (list20 != null && !list20.isEmpty()) {
                        if (list20 instanceof zzaeq) {
                            zzaeq zzaeqVar6 = (zzaeq) list20;
                            zzadaVar.f(i81, 2);
                            int iC = 0;
                            for (int i82 = 0; i82 < zzaeqVar6.f11286c; i82++) {
                                iC += zzada.c(zzaeqVar6.p(i82));
                            }
                            zzadaVar.v(iC);
                            for (int i83 = 0; i83 < zzaeqVar6.f11286c; i83++) {
                                zzadaVar.x(zzaeqVar6.p(i83));
                            }
                        } else {
                            zzadaVar.f(i81, 2);
                            int iC2 = 0;
                            for (int i84 = 0; i84 < list20.size(); i84++) {
                                iC2 += zzada.c(((Long) list20.get(i84)).longValue());
                            }
                            zzadaVar.v(iC2);
                            for (int i85 = 0; i85 < list20.size(); i85++) {
                                zzadaVar.x(((Long) list20.get(i85)).longValue());
                            }
                        }
                    }
                    break;
                case 38:
                    int i86 = iArr[i14];
                    List list21 = (List) unsafe.getObject(obj, j11);
                    zzagb zzagbVar21 = zzafq.f11328a;
                    if (list21 != null && !list21.isEmpty()) {
                        if (list21 instanceof zzaeq) {
                            zzaeq zzaeqVar7 = (zzaeq) list21;
                            zzadaVar.f(i86, 2);
                            int iC3 = 0;
                            for (int i87 = 0; i87 < zzaeqVar7.f11286c; i87++) {
                                iC3 += zzada.c(zzaeqVar7.p(i87));
                            }
                            zzadaVar.v(iC3);
                            for (int i88 = 0; i88 < zzaeqVar7.f11286c; i88++) {
                                zzadaVar.x(zzaeqVar7.p(i88));
                            }
                        } else {
                            zzadaVar.f(i86, 2);
                            int iC4 = 0;
                            for (int i89 = 0; i89 < list21.size(); i89++) {
                                iC4 += zzada.c(((Long) list21.get(i89)).longValue());
                            }
                            zzadaVar.v(iC4);
                            for (int i90 = 0; i90 < list21.size(); i90++) {
                                zzadaVar.x(((Long) list21.get(i90)).longValue());
                            }
                        }
                    }
                    break;
                case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    int i91 = iArr[i14];
                    List list22 = (List) unsafe.getObject(obj, j11);
                    zzagb zzagbVar22 = zzafq.f11328a;
                    if (list22 != null && !list22.isEmpty()) {
                        if (list22 instanceof zzadv) {
                            zzadv zzadvVar7 = (zzadv) list22;
                            zzadaVar.f(i91, 2);
                            int iC5 = 0;
                            for (int i92 = 0; i92 < zzadvVar7.f11271c; i92++) {
                                iC5 += zzada.c(zzadvVar7.U(i92));
                            }
                            zzadaVar.v(iC5);
                            for (int i93 = 0; i93 < zzadvVar7.f11271c; i93++) {
                                zzadaVar.u(zzadvVar7.U(i93));
                            }
                        } else {
                            zzadaVar.f(i91, 2);
                            int iC6 = 0;
                            for (int i94 = 0; i94 < list22.size(); i94++) {
                                iC6 += zzada.c(((Integer) list22.get(i94)).intValue());
                            }
                            zzadaVar.v(iC6);
                            for (int i95 = 0; i95 < list22.size(); i95++) {
                                zzadaVar.u(((Integer) list22.get(i95)).intValue());
                            }
                        }
                    }
                    break;
                case DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                    int i96 = iArr[i14];
                    List list23 = (List) unsafe.getObject(obj, j11);
                    zzagb zzagbVar23 = zzafq.f11328a;
                    if (list23 != null && !list23.isEmpty()) {
                        if (list23 instanceof zzaeq) {
                            zzaeq zzaeqVar8 = (zzaeq) list23;
                            zzadaVar.f(i96, 2);
                            int i97 = 0;
                            for (int i98 = 0; i98 < zzaeqVar8.f11286c; i98++) {
                                zzaeqVar8.p(i98);
                                i97 += 8;
                            }
                            zzadaVar.v(i97);
                            for (int i99 = 0; i99 < zzaeqVar8.f11286c; i99++) {
                                zzadaVar.y(zzaeqVar8.p(i99));
                            }
                        } else {
                            zzadaVar.f(i96, 2);
                            int i100 = 0;
                            for (int i101 = 0; i101 < list23.size(); i101++) {
                                ((Long) list23.get(i101)).getClass();
                                i100 += 8;
                            }
                            zzadaVar.v(i100);
                            for (int i102 = 0; i102 < list23.size(); i102++) {
                                zzadaVar.y(((Long) list23.get(i102)).longValue());
                            }
                        }
                    }
                    break;
                case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                    int i103 = iArr[i14];
                    List list24 = (List) unsafe.getObject(obj, j11);
                    zzagb zzagbVar24 = zzafq.f11328a;
                    if (list24 != null && !list24.isEmpty()) {
                        if (list24 instanceof zzadv) {
                            zzadv zzadvVar8 = (zzadv) list24;
                            zzadaVar.f(i103, 2);
                            int i104 = 0;
                            for (int i105 = 0; i105 < zzadvVar8.f11271c; i105++) {
                                zzadvVar8.U(i105);
                                i104 += 4;
                            }
                            zzadaVar.v(i104);
                            for (int i106 = 0; i106 < zzadvVar8.f11271c; i106++) {
                                zzadaVar.w(zzadvVar8.U(i106));
                            }
                        } else {
                            zzadaVar.f(i103, 2);
                            int i107 = 0;
                            for (int i108 = 0; i108 < list24.size(); i108++) {
                                ((Integer) list24.get(i108)).getClass();
                                i107 += 4;
                            }
                            zzadaVar.v(i107);
                            for (int i109 = 0; i109 < list24.size(); i109++) {
                                zzadaVar.w(((Integer) list24.get(i109)).intValue());
                            }
                        }
                    }
                    break;
                case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                    int i110 = iArr[i14];
                    List list25 = (List) unsafe.getObject(obj, j11);
                    zzagb zzagbVar25 = zzafq.f11328a;
                    if (list25 != null && !list25.isEmpty()) {
                        if (list25 instanceof zzaci) {
                            zzaci zzaciVar2 = (zzaci) list25;
                            zzadaVar.f(i110, 2);
                            int i111 = 0;
                            for (int i112 = 0; i112 < zzaciVar2.f11205c; i112++) {
                                zzaciVar2.e(i112);
                                boolean z11 = zzaciVar2.f11204b[i112];
                                i111++;
                            }
                            zzadaVar.v(i111);
                            for (int i113 = 0; i113 < zzaciVar2.f11205c; i113++) {
                                zzaciVar2.e(i113);
                                zzadaVar.t(zzaciVar2.f11204b[i113] ? (byte) 1 : (byte) 0);
                            }
                        } else {
                            zzadaVar.f(i110, 2);
                            int i114 = 0;
                            for (int i115 = 0; i115 < list25.size(); i115++) {
                                ((Boolean) list25.get(i115)).getClass();
                                i114++;
                            }
                            zzadaVar.v(i114);
                            for (int i116 = 0; i116 < list25.size(); i116++) {
                                zzadaVar.t(((Boolean) list25.get(i116)).booleanValue() ? (byte) 1 : (byte) 0);
                            }
                        }
                    }
                    break;
                case 43:
                    int i117 = iArr[i14];
                    List list26 = (List) unsafe.getObject(obj, j11);
                    zzagb zzagbVar26 = zzafq.f11328a;
                    if (list26 != null && !list26.isEmpty()) {
                        if (list26 instanceof zzadv) {
                            zzadv zzadvVar9 = (zzadv) list26;
                            zzadaVar.f(i117, 2);
                            int iB = 0;
                            for (int i118 = 0; i118 < zzadvVar9.f11271c; i118++) {
                                iB += zzada.b(zzadvVar9.U(i118));
                            }
                            zzadaVar.v(iB);
                            for (int i119 = 0; i119 < zzadvVar9.f11271c; i119++) {
                                zzadaVar.v(zzadvVar9.U(i119));
                            }
                        } else {
                            zzadaVar.f(i117, 2);
                            int iB2 = 0;
                            for (int i120 = 0; i120 < list26.size(); i120++) {
                                iB2 += zzada.b(((Integer) list26.get(i120)).intValue());
                            }
                            zzadaVar.v(iB2);
                            for (int i121 = 0; i121 < list26.size(); i121++) {
                                zzadaVar.v(((Integer) list26.get(i121)).intValue());
                            }
                        }
                    }
                    break;
                case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                    int i122 = iArr[i14];
                    List list27 = (List) unsafe.getObject(obj, j11);
                    zzagb zzagbVar27 = zzafq.f11328a;
                    if (list27 != null && !list27.isEmpty()) {
                        if (list27 instanceof zzadv) {
                            zzadv zzadvVar10 = (zzadv) list27;
                            zzadaVar.f(i122, 2);
                            int iC7 = 0;
                            for (int i123 = 0; i123 < zzadvVar10.f11271c; i123++) {
                                iC7 += zzada.c(zzadvVar10.U(i123));
                            }
                            zzadaVar.v(iC7);
                            for (int i124 = 0; i124 < zzadvVar10.f11271c; i124++) {
                                zzadaVar.u(zzadvVar10.U(i124));
                            }
                        } else {
                            zzadaVar.f(i122, 2);
                            int iC8 = 0;
                            for (int i125 = 0; i125 < list27.size(); i125++) {
                                iC8 += zzada.c(((Integer) list27.get(i125)).intValue());
                            }
                            zzadaVar.v(iC8);
                            for (int i126 = 0; i126 < list27.size(); i126++) {
                                zzadaVar.u(((Integer) list27.get(i126)).intValue());
                            }
                        }
                    }
                    break;
                case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                    int i127 = iArr[i14];
                    List list28 = (List) unsafe.getObject(obj, j11);
                    zzagb zzagbVar28 = zzafq.f11328a;
                    if (list28 != null && !list28.isEmpty()) {
                        if (list28 instanceof zzadv) {
                            zzadv zzadvVar11 = (zzadv) list28;
                            zzadaVar.f(i127, 2);
                            int i128 = 0;
                            for (int i129 = 0; i129 < zzadvVar11.f11271c; i129++) {
                                zzadvVar11.U(i129);
                                i128 += 4;
                            }
                            zzadaVar.v(i128);
                            for (int i130 = 0; i130 < zzadvVar11.f11271c; i130++) {
                                zzadaVar.w(zzadvVar11.U(i130));
                            }
                        } else {
                            zzadaVar.f(i127, 2);
                            int i131 = 0;
                            for (int i132 = 0; i132 < list28.size(); i132++) {
                                ((Integer) list28.get(i132)).getClass();
                                i131 += 4;
                            }
                            zzadaVar.v(i131);
                            for (int i133 = 0; i133 < list28.size(); i133++) {
                                zzadaVar.w(((Integer) list28.get(i133)).intValue());
                            }
                        }
                    }
                    break;
                case 46:
                    int i134 = iArr[i14];
                    List list29 = (List) unsafe.getObject(obj, j11);
                    zzagb zzagbVar29 = zzafq.f11328a;
                    if (list29 != null && !list29.isEmpty()) {
                        if (list29 instanceof zzaeq) {
                            zzaeq zzaeqVar9 = (zzaeq) list29;
                            zzadaVar.f(i134, 2);
                            int i135 = 0;
                            for (int i136 = 0; i136 < zzaeqVar9.f11286c; i136++) {
                                zzaeqVar9.p(i136);
                                i135 += 8;
                            }
                            zzadaVar.v(i135);
                            for (int i137 = 0; i137 < zzaeqVar9.f11286c; i137++) {
                                zzadaVar.y(zzaeqVar9.p(i137));
                            }
                        } else {
                            zzadaVar.f(i134, 2);
                            int i138 = 0;
                            for (int i139 = 0; i139 < list29.size(); i139++) {
                                ((Long) list29.get(i139)).getClass();
                                i138 += 8;
                            }
                            zzadaVar.v(i138);
                            for (int i140 = 0; i140 < list29.size(); i140++) {
                                zzadaVar.y(((Long) list29.get(i140)).longValue());
                            }
                        }
                    }
                    break;
                case 47:
                    int i141 = iArr[i14];
                    List list30 = (List) unsafe.getObject(obj, j11);
                    zzagb zzagbVar30 = zzafq.f11328a;
                    if (list30 != null && !list30.isEmpty()) {
                        if (list30 instanceof zzadv) {
                            zzadv zzadvVar12 = (zzadv) list30;
                            zzadaVar.f(i141, 2);
                            int iB3 = 0;
                            for (int i142 = 0; i142 < zzadvVar12.f11271c; i142++) {
                                int iU2 = zzadvVar12.U(i142);
                                iB3 += zzada.b((iU2 >> 31) ^ (iU2 + iU2));
                            }
                            zzadaVar.v(iB3);
                            for (int i143 = 0; i143 < zzadvVar12.f11271c; i143++) {
                                int iU3 = zzadvVar12.U(i143);
                                zzadaVar.v((iU3 >> 31) ^ (iU3 + iU3));
                            }
                        } else {
                            zzadaVar.f(i141, 2);
                            int iB4 = 0;
                            for (int i144 = 0; i144 < list30.size(); i144++) {
                                int iIntValue2 = ((Integer) list30.get(i144)).intValue();
                                iB4 += zzada.b((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
                            }
                            zzadaVar.v(iB4);
                            for (int i145 = 0; i145 < list30.size(); i145++) {
                                int iIntValue3 = ((Integer) list30.get(i145)).intValue();
                                zzadaVar.v((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                            }
                        }
                    }
                    break;
                case 48:
                    int i146 = iArr[i14];
                    List list31 = (List) unsafe.getObject(obj, j11);
                    zzagb zzagbVar31 = zzafq.f11328a;
                    if (list31 != null && !list31.isEmpty()) {
                        if (list31 instanceof zzaeq) {
                            zzaeq zzaeqVar10 = (zzaeq) list31;
                            zzadaVar.f(i146, 2);
                            int iC9 = 0;
                            for (int i147 = 0; i147 < zzaeqVar10.f11286c; i147++) {
                                long jP2 = zzaeqVar10.p(i147);
                                iC9 += zzada.c((jP2 >> 63) ^ (jP2 + jP2));
                            }
                            zzadaVar.v(iC9);
                            for (int i148 = 0; i148 < zzaeqVar10.f11286c; i148++) {
                                long jP3 = zzaeqVar10.p(i148);
                                zzadaVar.x((jP3 >> 63) ^ (jP3 + jP3));
                            }
                        } else {
                            zzadaVar.f(i146, 2);
                            int iC10 = 0;
                            for (int i149 = 0; i149 < list31.size(); i149++) {
                                long jLongValue2 = ((Long) list31.get(i149)).longValue();
                                iC10 += zzada.c((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
                            }
                            zzadaVar.v(iC10);
                            for (int i150 = 0; i150 < list31.size(); i150++) {
                                long jLongValue3 = ((Long) list31.get(i150)).longValue();
                                zzadaVar.x((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                            }
                        }
                    }
                    break;
                case 49:
                    int i151 = iArr[i14];
                    List list32 = (List) unsafe.getObject(obj, j11);
                    zzafp zzafpVarC2 = zzaffVar.C(i14);
                    zzagb zzagbVar32 = zzafq.f11328a;
                    if (list32 != null && !list32.isEmpty()) {
                        for (int i152 = 0; i152 < list32.size(); i152++) {
                            zzadbVar.s(i151, list32.get(i152), zzafpVarC2);
                        }
                    }
                    break;
                case 50:
                    Object object2 = unsafe.getObject(obj, j11);
                    if (object2 != null) {
                        zzaeu zzaeuVar = ((zzaev) zzaffVar.D(i14)).f11293a;
                        for (Map.Entry entry2 : ((zzaew) object2).entrySet()) {
                            zzadaVar.f(i17, 2);
                            zzadaVar.v(zzaev.b(zzaeuVar, entry2.getKey(), entry2.getValue()));
                            zzaev.a(zzadaVar, zzaeuVar, entry2.getKey(), entry2.getValue());
                        }
                    }
                    break;
                case 51:
                    if (zzaffVar.s(i17, i14, obj)) {
                        zzadbVar.g(i17, ((Double) zzagg.i(j11, obj)).doubleValue());
                    }
                    break;
                case 52:
                    if (zzaffVar.s(i17, i14, obj)) {
                        zzadbVar.f(i17, ((Float) zzagg.i(j11, obj)).floatValue());
                    }
                    break;
                case 53:
                    if (zzaffVar.s(i17, i14, obj)) {
                        zzadbVar.d(i17, n(j11, obj));
                    }
                    break;
                case 54:
                    if (zzaffVar.s(i17, i14, obj)) {
                        zzadbVar.i(i17, n(j11, obj));
                    }
                    break;
                case 55:
                    if (zzaffVar.s(i17, i14, obj)) {
                        zzadbVar.j(i17, m(j11, obj));
                    }
                    break;
                case 56:
                    if (zzaffVar.s(i17, i14, obj)) {
                        zzadbVar.k(i17, n(j11, obj));
                    }
                    break;
                case 57:
                    if (zzaffVar.s(i17, i14, obj)) {
                        zzadbVar.l(i17, m(j11, obj));
                    }
                    break;
                case 58:
                    if (zzaffVar.s(i17, i14, obj)) {
                        zzadbVar.m(i17, ((Boolean) zzagg.i(j11, obj)).booleanValue());
                    }
                    break;
                case 59:
                    if (zzaffVar.s(i17, i14, obj)) {
                        Object object3 = unsafe.getObject(obj, j11);
                        if (object3 instanceof String) {
                            zzadaVar.m(i17, (String) object3);
                        } else {
                            zzadbVar.n(i17, (zzacr) object3);
                        }
                    }
                    break;
                case 60:
                    if (zzaffVar.s(i17, i14, obj)) {
                        zzadbVar.r(i17, unsafe.getObject(obj, j11), zzaffVar.C(i14));
                    }
                    break;
                case 61:
                    if (zzaffVar.s(i17, i14, obj)) {
                        zzadbVar.n(i17, (zzacr) unsafe.getObject(obj, j11));
                    }
                    break;
                case 62:
                    if (zzaffVar.s(i17, i14, obj)) {
                        zzadbVar.o(i17, m(j11, obj));
                    }
                    break;
                case 63:
                    if (zzaffVar.s(i17, i14, obj)) {
                        zzadbVar.h(i17, m(j11, obj));
                    }
                    break;
                case 64:
                    if (zzaffVar.s(i17, i14, obj)) {
                        zzadbVar.c(i17, m(j11, obj));
                    }
                    break;
                case 65:
                    if (zzaffVar.s(i17, i14, obj)) {
                        zzadbVar.e(i17, n(j11, obj));
                    }
                    break;
                case 66:
                    if (zzaffVar.s(i17, i14, obj)) {
                        zzadbVar.p(i17, m(j11, obj));
                    }
                    break;
                case 67:
                    if (zzaffVar.s(i17, i14, obj)) {
                        zzadbVar.q(i17, n(j11, obj));
                    }
                    break;
                case 68:
                    if (zzaffVar.s(i17, i14, obj)) {
                        zzadbVar.s(i17, unsafe.getObject(obj, j11), zzaffVar.C(i14));
                    }
                    break;
            }
            i14 += 3;
            i12 = 1048575;
            zzaffVar = this;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x001e  */
    @Override // com.google.android.gms.internal.measurement.zzafp
    public final void c(Object obj, Object obj2) {
        Object obj3;
        l(obj);
        obj2.getClass();
        int i11 = 0;
        while (true) {
            int[] iArr = this.f11300a;
            if (i11 >= iArr.length) {
                Object obj4 = obj;
                zzafq.b(obj4, obj2);
                if (!this.f11305f || ((zzadr) obj2).zzb.f11258a.isEmpty()) {
                    return;
                }
                throw null;
            }
            int i12 = i(i11);
            int i13 = 1048575 & i12;
            int iJ = j(i12);
            int i14 = iArr[i11];
            long j11 = i13;
            switch (iJ) {
                case 0:
                    if (!q(i11, obj2)) {
                        obj3 = obj;
                    } else {
                        zzagf zzagfVar = zzagg.f11354c;
                        obj3 = obj;
                        zzagfVar.g(obj3, j11, zzagfVar.f(j11, obj2));
                        r(i11, obj3);
                    }
                    break;
                case 1:
                    if (q(i11, obj2)) {
                        zzagf zzagfVar2 = zzagg.f11354c;
                        zzagfVar2.e(obj, j11, zzagfVar2.d(j11, obj2));
                        r(i11, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (q(i11, obj2)) {
                        zzagg.h(obj, j11, zzagg.g(j11, obj2));
                        r(i11, obj);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (q(i11, obj2)) {
                        zzagg.h(obj, j11, zzagg.g(j11, obj2));
                        r(i11, obj);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (q(i11, obj2)) {
                        zzagg.f(j11, obj, zzagg.e(obj2, j11));
                        r(i11, obj);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (q(i11, obj2)) {
                        zzagg.h(obj, j11, zzagg.g(j11, obj2));
                        r(i11, obj);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (q(i11, obj2)) {
                        zzagg.f(j11, obj, zzagg.e(obj2, j11));
                        r(i11, obj);
                    }
                    obj3 = obj;
                    break;
                case 7:
                    if (q(i11, obj2)) {
                        zzagf zzagfVar3 = zzagg.f11354c;
                        zzagfVar3.c(obj, j11, zzagfVar3.b(j11, obj2));
                        r(i11, obj);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (q(i11, obj2)) {
                        zzagg.j(obj, j11, zzagg.i(j11, obj2));
                        r(i11, obj);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    A(i11, obj, obj2);
                    obj3 = obj;
                    break;
                case 10:
                    if (q(i11, obj2)) {
                        zzagg.j(obj, j11, zzagg.i(j11, obj2));
                        r(i11, obj);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (q(i11, obj2)) {
                        zzagg.f(j11, obj, zzagg.e(obj2, j11));
                        r(i11, obj);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (q(i11, obj2)) {
                        zzagg.f(j11, obj, zzagg.e(obj2, j11));
                        r(i11, obj);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (q(i11, obj2)) {
                        zzagg.f(j11, obj, zzagg.e(obj2, j11));
                        r(i11, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (q(i11, obj2)) {
                        zzagg.h(obj, j11, zzagg.g(j11, obj2));
                        r(i11, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (q(i11, obj2)) {
                        zzagg.f(j11, obj, zzagg.e(obj2, j11));
                        r(i11, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (q(i11, obj2)) {
                        zzagg.h(obj, j11, zzagg.g(j11, obj2));
                        r(i11, obj);
                    }
                    obj3 = obj;
                    break;
                case 17:
                    A(i11, obj, obj2);
                    obj3 = obj;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case Service.METRICS_FIELD_NUMBER /* 24 */:
                case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                case Service.BILLING_FIELD_NUMBER /* 26 */:
                case 27:
                case Service.MONITORING_FIELD_NUMBER /* 28 */:
                case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
                case 30:
                case 31:
                case Consts.SP /* 32 */:
                case 33:
                case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                case 35:
                case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                case 37:
                case 38:
                case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                case DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                case 43:
                case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                case 46:
                case 47:
                case 48:
                case 49:
                    zzaef zzaefVarZzg = (zzaef) zzagg.i(j11, obj);
                    zzaef zzaefVar = (zzaef) zzagg.i(j11, obj2);
                    int size = zzaefVarZzg.size();
                    int size2 = zzaefVar.size();
                    if (size > 0 && size2 > 0) {
                        if (!zzaefVarZzg.zza()) {
                            zzaefVarZzg = zzaefVarZzg.zzg(size2 + size);
                        }
                        zzaefVarZzg.addAll(zzaefVar);
                    }
                    if (size > 0) {
                        zzaefVar = zzaefVarZzg;
                    }
                    zzagg.j(obj, j11, zzaefVar);
                    obj3 = obj;
                    break;
                case 50:
                    zzagb zzagbVar = zzafq.f11328a;
                    zzagg.j(obj, j11, zzaex.a(zzagg.i(j11, obj), zzagg.i(j11, obj2)));
                    obj3 = obj;
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (s(i14, i11, obj2)) {
                        zzagg.j(obj, j11, zzagg.i(j11, obj2));
                        t(i14, i11, obj);
                    }
                    obj3 = obj;
                    break;
                case 60:
                    B(i11, obj, obj2);
                    obj3 = obj;
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (s(i14, i11, obj2)) {
                        zzagg.j(obj, j11, zzagg.i(j11, obj2));
                        t(i14, i11, obj);
                    }
                    obj3 = obj;
                    break;
                case 68:
                    B(i11, obj, obj2);
                    obj3 = obj;
                    break;
                default:
                    obj3 = obj;
                    break;
            }
            i11 += 3;
            obj = obj3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:195:0x0525  */
    /* JADX WARN: Code duplicated, block: B:82:0x01f3  */
    @Override // com.google.android.gms.internal.measurement.zzafp
    public final int d(zzadu zzaduVar) {
        int i11;
        int iB;
        int iC;
        int iM;
        int i12;
        int iE;
        int iB2;
        int size;
        int iE2;
        int iB3;
        int iB4;
        int iB5;
        int iE3;
        int iB6;
        int iC2;
        zzaff<T> zzaffVar = this;
        zzadu zzaduVar2 = zzaduVar;
        Unsafe unsafe = f11299n;
        int i13 = 1048575;
        int i14 = 0;
        int i15 = 0;
        int iC3 = 0;
        int i16 = 1048575;
        while (true) {
            int[] iArr = zzaffVar.f11300a;
            if (i14 >= iArr.length) {
                int iC4 = zzaduVar2.zzc.c() + iC3;
                if (zzaffVar.f11305f) {
                    zzafr zzafrVar = ((zzadr) zzaduVar2).zzb.f11258a;
                    if (zzafrVar.f11338b > 0) {
                        ((zzadj) ((zzafs) zzafrVar.b(0)).f11329a).zzb();
                        throw null;
                    }
                    Iterator<T> it = zzafrVar.c().iterator();
                    if (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        zzadj zzadjVar = (zzadj) entry.getKey();
                        entry.getValue();
                        zzadjVar.zzb();
                        throw null;
                    }
                }
                return iC4;
            }
            int i17 = zzaffVar.i(i14);
            int iJ = j(i17);
            int i18 = iArr[i14];
            int i19 = iArr[i14 + 2];
            int i21 = i19 & i13;
            if (iJ <= 17) {
                if (i21 != i16) {
                    i15 = i21 == i13 ? 0 : unsafe.getInt(zzaduVar2, i21);
                    i16 = i21;
                }
                i11 = 1 << (i19 >>> 20);
            } else {
                i11 = 0;
            }
            int i22 = i17 & i13;
            if (iJ >= zzadl.zzJ.zza()) {
                zzadl.zzW.getClass();
            }
            long j11 = i22;
            switch (iJ) {
                case 0:
                    if (zzaffVar.p(zzaduVar2, i14, i16, i15, i11)) {
                        iC3 = e0.C(i18 << 3, 8, iC3);
                    }
                    break;
                case 1:
                    if (zzaffVar.p(zzaduVar2, i14, i16, i15, i11)) {
                        iC3 = e0.C(i18 << 3, 4, iC3);
                    }
                    zzaffVar = this;
                    zzaduVar2 = zzaduVar;
                    break;
                case 2:
                    if (zzaffVar.p(zzaduVar2, i14, i16, i15, i11)) {
                        long j12 = unsafe.getLong(zzaduVar2, j11);
                        iB = zzada.b(i18 << 3);
                        iC = zzada.c(j12);
                        iC3 += iC + iB;
                    }
                    zzaffVar = this;
                    break;
                case 3:
                    if (zzaffVar.p(zzaduVar2, i14, i16, i15, i11)) {
                        long j13 = unsafe.getLong(zzaduVar2, j11);
                        iB = zzada.b(i18 << 3);
                        iC = zzada.c(j13);
                        iC3 += iC + iB;
                    }
                    zzaffVar = this;
                    break;
                case 4:
                    if (zzaffVar.p(zzaduVar2, i14, i16, i15, i11)) {
                        long j14 = unsafe.getInt(zzaduVar2, j11);
                        iB = zzada.b(i18 << 3);
                        iC = zzada.c(j14);
                        iC3 += iC + iB;
                    }
                    zzaffVar = this;
                    break;
                case 5:
                    if (zzaffVar.p(zzaduVar2, i14, i16, i15, i11)) {
                        iC3 = e0.C(i18 << 3, 8, iC3);
                    }
                    zzaffVar = this;
                    zzaduVar2 = zzaduVar;
                    break;
                case 6:
                    if (zzaffVar.p(zzaduVar2, i14, i16, i15, i11)) {
                        iC3 = e0.C(i18 << 3, 4, iC3);
                    }
                    zzaffVar = this;
                    zzaduVar2 = zzaduVar;
                    break;
                case 7:
                    if (zzaffVar.p(zzaduVar2, i14, i16, i15, i11)) {
                        iC3 = e0.C(i18 << 3, 1, iC3);
                    }
                    zzaffVar = this;
                    zzaduVar2 = zzaduVar;
                    break;
                case 8:
                    if (zzaffVar.p(zzaduVar2, i14, i16, i15, i11)) {
                        int i23 = i18 << 3;
                        Object object = unsafe.getObject(zzaduVar2, j11);
                        if (object instanceof zzacr) {
                            int iB7 = zzada.b(i23);
                            int iD = ((zzacr) object).d();
                            iC3 = e0.b(iD, iD, iB7, iC3);
                        } else {
                            int iB8 = zzada.b(i23);
                            int iB9 = zzagl.b((String) object);
                            iC3 = e0.b(iB9, iB9, iB8, iC3);
                        }
                    }
                    zzaffVar = this;
                    break;
                case 9:
                    if (zzaffVar.p(zzaduVar2, i14, i16, i15, i11)) {
                        iM = zzafq.m(i18, unsafe.getObject(zzaduVar2, j11), zzaffVar.C(i14));
                        iC3 += iM;
                    }
                    break;
                case 10:
                    if (zzaffVar.p(zzaduVar2, i14, i16, i15, i11)) {
                        zzacr zzacrVar = (zzacr) unsafe.getObject(zzaduVar2, j11);
                        int iB10 = zzada.b(i18 << 3);
                        int iD2 = zzacrVar.d();
                        iC3 = e0.b(iD2, iD2, iB10, iC3);
                    }
                    zzaffVar = this;
                    break;
                case 11:
                    if (zzaffVar.p(zzaduVar2, i14, i16, i15, i11)) {
                        iC3 = e0.C(unsafe.getInt(zzaduVar2, j11), zzada.b(i18 << 3), iC3);
                    }
                    zzaffVar = this;
                    break;
                case 12:
                    if (zzaffVar.p(zzaduVar2, i14, i16, i15, i11)) {
                        long j15 = unsafe.getInt(zzaduVar2, j11);
                        iB = zzada.b(i18 << 3);
                        iC = zzada.c(j15);
                        iC3 += iC + iB;
                    }
                    zzaffVar = this;
                    break;
                case 13:
                    if (zzaffVar.p(zzaduVar2, i14, i16, i15, i11)) {
                        iC3 = e0.C(i18 << 3, 4, iC3);
                    }
                    zzaffVar = this;
                    zzaduVar2 = zzaduVar;
                    break;
                case 14:
                    if (zzaffVar.p(zzaduVar2, i14, i16, i15, i11)) {
                        iC3 = e0.C(i18 << 3, 8, iC3);
                    }
                    zzaffVar = this;
                    zzaduVar2 = zzaduVar;
                    break;
                case 15:
                    if (zzaffVar.p(zzaduVar2, i14, i16, i15, i11)) {
                        int i24 = unsafe.getInt(zzaduVar2, j11);
                        iC3 = e0.C((i24 >> 31) ^ (i24 + i24), zzada.b(i18 << 3), iC3);
                    }
                    zzaffVar = this;
                    break;
                case 16:
                    if (zzaffVar.p(zzaduVar2, i14, i16, i15, i11)) {
                        long j16 = unsafe.getLong(zzaduVar2, j11);
                        iB = zzada.b(i18 << 3);
                        iC = zzada.c((j16 >> 63) ^ (j16 + j16));
                        iC3 += iC + iB;
                    }
                    zzaffVar = this;
                    break;
                case 17:
                    if (zzaffVar.p(zzaduVar2, i14, i16, i15, i11)) {
                        zzafc zzafcVar = (zzafc) unsafe.getObject(zzaduVar2, j11);
                        zzafp zzafpVarC = zzaffVar.C(i14);
                        zzagb zzagbVar = zzafq.f11328a;
                        int iB11 = zzada.b(i18 << 3);
                        i12 = iB11 + iB11;
                        iE = ((zzacb) zzafcVar).e(zzafpVarC);
                        iC3 += iE + i12;
                    }
                    break;
                case 18:
                    iM = zzafq.l(i18, (List) unsafe.getObject(zzaduVar2, j11));
                    iC3 += iM;
                    break;
                case 19:
                    iM = zzafq.k(i18, (List) unsafe.getObject(zzaduVar2, j11));
                    iC3 += iM;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(zzaduVar2, j11);
                    zzagb zzagbVar2 = zzafq.f11328a;
                    if (list.size() == 0) {
                        iB2 = 0;
                    } else {
                        iB2 = (zzada.b(i18 << 3) * list.size()) + zzafq.d(list);
                    }
                    iC3 += iB2;
                    break;
                case 21:
                    List list2 = (List) unsafe.getObject(zzaduVar2, j11);
                    zzagb zzagbVar3 = zzafq.f11328a;
                    size = list2.size();
                    if (size == 0) {
                        iB4 = 0;
                    } else {
                        iE2 = zzafq.e(list2);
                        iB3 = zzada.b(i18 << 3);
                        iB4 = (iB3 * size) + iE2;
                    }
                    iC3 += iB4;
                    break;
                case 22:
                    List list3 = (List) unsafe.getObject(zzaduVar2, j11);
                    zzagb zzagbVar4 = zzafq.f11328a;
                    size = list3.size();
                    if (size == 0) {
                        iB4 = 0;
                    } else {
                        iE2 = zzafq.h(list3);
                        iB3 = zzada.b(i18 << 3);
                        iB4 = (iB3 * size) + iE2;
                    }
                    iC3 += iB4;
                    break;
                case 23:
                    iM = zzafq.l(i18, (List) unsafe.getObject(zzaduVar2, j11));
                    iC3 += iM;
                    break;
                case Service.METRICS_FIELD_NUMBER /* 24 */:
                    iM = zzafq.k(i18, (List) unsafe.getObject(zzaduVar2, j11));
                    iC3 += iM;
                    break;
                case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                    List list4 = (List) unsafe.getObject(zzaduVar2, j11);
                    zzagb zzagbVar5 = zzafq.f11328a;
                    int size2 = list4.size();
                    if (size2 == 0) {
                        iB2 = 0;
                    } else {
                        iB2 = (zzada.b(i18 << 3) + 1) * size2;
                    }
                    iC3 += iB2;
                    break;
                case Service.BILLING_FIELD_NUMBER /* 26 */:
                    List list5 = (List) unsafe.getObject(zzaduVar2, j11);
                    zzagb zzagbVar6 = zzafq.f11328a;
                    int size3 = list5.size();
                    if (size3 == 0) {
                        iB4 = 0;
                    } else {
                        iB4 = zzada.b(i18 << 3) * size3;
                        if (list5 instanceof zzaen) {
                            zzaen zzaenVar = (zzaen) list5;
                            for (int i25 = 0; i25 < size3; i25++) {
                                Object objZzc = zzaenVar.zzc();
                                if (objZzc instanceof zzacr) {
                                    int iD3 = ((zzacr) objZzc).d();
                                    iB4 = e0.C(iD3, iD3, iB4);
                                } else {
                                    int iB12 = zzagl.b((String) objZzc);
                                    iB4 = e0.C(iB12, iB12, iB4);
                                }
                            }
                        } else {
                            for (int i26 = 0; i26 < size3; i26++) {
                                Object obj = list5.get(i26);
                                if (obj instanceof zzacr) {
                                    int iD4 = ((zzacr) obj).d();
                                    iB4 = e0.C(iD4, iD4, iB4);
                                } else {
                                    int iB13 = zzagl.b((String) obj);
                                    iB4 = e0.C(iB13, iB13, iB4);
                                }
                            }
                        }
                    }
                    iC3 += iB4;
                    break;
                case 27:
                    List list6 = (List) unsafe.getObject(zzaduVar2, j11);
                    zzafp zzafpVarC2 = zzaffVar.C(i14);
                    zzagb zzagbVar7 = zzafq.f11328a;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        iB5 = 0;
                    } else {
                        iB5 = zzada.b(i18 << 3) * size4;
                        for (int i27 = 0; i27 < size4; i27++) {
                            Object obj2 = list6.get(i27);
                            if (obj2 instanceof zzaem) {
                                int iA = ((zzaem) obj2).a();
                                iB5 = e0.C(iA, iA, iB5);
                            } else {
                                int iE4 = ((zzacb) obj2).e(zzafpVarC2);
                                iB5 = e0.C(iE4, iE4, iB5);
                            }
                        }
                    }
                    iC3 += iB5;
                    break;
                case Service.MONITORING_FIELD_NUMBER /* 28 */:
                    List list7 = (List) unsafe.getObject(zzaduVar2, j11);
                    zzagb zzagbVar8 = zzafq.f11328a;
                    int size5 = list7.size();
                    if (size5 == 0) {
                        iB4 = 0;
                    } else {
                        iB4 = zzada.b(i18 << 3) * size5;
                        for (int i28 = 0; i28 < list7.size(); i28++) {
                            int iD5 = ((zzacr) list7.get(i28)).d();
                            iB4 = e0.C(iD5, iD5, iB4);
                        }
                    }
                    iC3 += iB4;
                    break;
                case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
                    List list8 = (List) unsafe.getObject(zzaduVar2, j11);
                    zzagb zzagbVar9 = zzafq.f11328a;
                    size = list8.size();
                    if (size == 0) {
                        iB4 = 0;
                    } else {
                        iE2 = zzafq.i(list8);
                        iB3 = zzada.b(i18 << 3);
                        iB4 = (iB3 * size) + iE2;
                    }
                    iC3 += iB4;
                    break;
                case 30:
                    List list9 = (List) unsafe.getObject(zzaduVar2, j11);
                    zzagb zzagbVar10 = zzafq.f11328a;
                    size = list9.size();
                    if (size == 0) {
                        iB4 = 0;
                    } else {
                        iE2 = zzafq.g(list9);
                        iB3 = zzada.b(i18 << 3);
                        iB4 = (iB3 * size) + iE2;
                    }
                    iC3 += iB4;
                    break;
                case 31:
                    iM = zzafq.k(i18, (List) unsafe.getObject(zzaduVar2, j11));
                    iC3 += iM;
                    break;
                case Consts.SP /* 32 */:
                    iM = zzafq.l(i18, (List) unsafe.getObject(zzaduVar2, j11));
                    iC3 += iM;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(zzaduVar2, j11);
                    zzagb zzagbVar11 = zzafq.f11328a;
                    size = list10.size();
                    if (size == 0) {
                        iB4 = 0;
                    } else {
                        iE2 = zzafq.j(list10);
                        iB3 = zzada.b(i18 << 3);
                        iB4 = (iB3 * size) + iE2;
                    }
                    iC3 += iB4;
                    break;
                case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                    List list11 = (List) unsafe.getObject(zzaduVar2, j11);
                    zzagb zzagbVar12 = zzafq.f11328a;
                    size = list11.size();
                    if (size == 0) {
                        iB4 = 0;
                    } else {
                        iE2 = zzafq.f(list11);
                        iB3 = zzada.b(i18 << 3);
                        iB4 = (iB3 * size) + iE2;
                    }
                    iC3 += iB4;
                    break;
                case 35:
                    List list12 = (List) unsafe.getObject(zzaduVar2, j11);
                    zzagb zzagbVar13 = zzafq.f11328a;
                    int size6 = list12.size() * 8;
                    if (size6 > 0) {
                        iC3 = e0.b(size6, zzada.b(i18 << 3), size6, iC3);
                    }
                    break;
                case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    List list13 = (List) unsafe.getObject(zzaduVar2, j11);
                    zzagb zzagbVar14 = zzafq.f11328a;
                    int size7 = list13.size() * 4;
                    if (size7 > 0) {
                        iC3 = e0.b(size7, zzada.b(i18 << 3), size7, iC3);
                    }
                    break;
                case 37:
                    int iD6 = zzafq.d((List) unsafe.getObject(zzaduVar2, j11));
                    if (iD6 > 0) {
                        iC3 = e0.b(iD6, zzada.b(i18 << 3), iD6, iC3);
                    }
                    break;
                case 38:
                    int iE5 = zzafq.e((List) unsafe.getObject(zzaduVar2, j11));
                    if (iE5 > 0) {
                        iC3 = e0.b(iE5, zzada.b(i18 << 3), iE5, iC3);
                    }
                    break;
                case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    int iH = zzafq.h((List) unsafe.getObject(zzaduVar2, j11));
                    if (iH > 0) {
                        iC3 = e0.b(iH, zzada.b(i18 << 3), iH, iC3);
                    }
                    break;
                case DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                    List list14 = (List) unsafe.getObject(zzaduVar2, j11);
                    zzagb zzagbVar15 = zzafq.f11328a;
                    int size8 = list14.size() * 8;
                    if (size8 > 0) {
                        iC3 = e0.b(size8, zzada.b(i18 << 3), size8, iC3);
                    }
                    break;
                case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                    List list15 = (List) unsafe.getObject(zzaduVar2, j11);
                    zzagb zzagbVar16 = zzafq.f11328a;
                    int size9 = list15.size() * 4;
                    if (size9 > 0) {
                        iC3 = e0.b(size9, zzada.b(i18 << 3), size9, iC3);
                    }
                    break;
                case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                    List list16 = (List) unsafe.getObject(zzaduVar2, j11);
                    zzagb zzagbVar17 = zzafq.f11328a;
                    int size10 = list16.size();
                    if (size10 > 0) {
                        iC3 = e0.b(size10, zzada.b(i18 << 3), size10, iC3);
                    }
                    break;
                case 43:
                    int i29 = zzafq.i((List) unsafe.getObject(zzaduVar2, j11));
                    if (i29 > 0) {
                        iC3 = e0.b(i29, zzada.b(i18 << 3), i29, iC3);
                    }
                    break;
                case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                    int iG = zzafq.g((List) unsafe.getObject(zzaduVar2, j11));
                    if (iG > 0) {
                        iC3 = e0.b(iG, zzada.b(i18 << 3), iG, iC3);
                    }
                    break;
                case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                    List list17 = (List) unsafe.getObject(zzaduVar2, j11);
                    zzagb zzagbVar18 = zzafq.f11328a;
                    int size11 = list17.size() * 4;
                    if (size11 > 0) {
                        iC3 = e0.b(size11, zzada.b(i18 << 3), size11, iC3);
                    }
                    break;
                case 46:
                    List list18 = (List) unsafe.getObject(zzaduVar2, j11);
                    zzagb zzagbVar19 = zzafq.f11328a;
                    int size12 = list18.size() * 8;
                    if (size12 > 0) {
                        iC3 = e0.b(size12, zzada.b(i18 << 3), size12, iC3);
                    }
                    break;
                case 47:
                    int iJ2 = zzafq.j((List) unsafe.getObject(zzaduVar2, j11));
                    if (iJ2 > 0) {
                        iC3 = e0.b(iJ2, zzada.b(i18 << 3), iJ2, iC3);
                    }
                    break;
                case 48:
                    int iF = zzafq.f((List) unsafe.getObject(zzaduVar2, j11));
                    if (iF > 0) {
                        iC3 = e0.b(iF, zzada.b(i18 << 3), iF, iC3);
                    }
                    break;
                case 49:
                    List list19 = (List) unsafe.getObject(zzaduVar2, j11);
                    zzafp zzafpVarC3 = zzaffVar.C(i14);
                    zzagb zzagbVar20 = zzafq.f11328a;
                    int size13 = list19.size();
                    if (size13 == 0) {
                        iE3 = 0;
                    } else {
                        iE3 = 0;
                        for (int i30 = 0; i30 < size13; i30++) {
                            zzafc zzafcVar2 = (zzafc) list19.get(i30);
                            int iB14 = zzada.b(i18 << 3);
                            iE3 += ((zzacb) zzafcVar2).e(zzafpVarC3) + iB14 + iB14;
                        }
                    }
                    iC3 += iE3;
                    break;
                case 50:
                    zzaew zzaewVar = (zzaew) unsafe.getObject(zzaduVar2, j11);
                    zzaev zzaevVar = (zzaev) zzaffVar.D(i14);
                    if (zzaewVar.isEmpty()) {
                        iB4 = 0;
                    } else {
                        iB4 = 0;
                        for (Map.Entry entry2 : zzaewVar.entrySet()) {
                            Object key = entry2.getKey();
                            Object value = entry2.getValue();
                            zzaeu zzaeuVar = zzaevVar.f11293a;
                            int iB15 = zzada.b(i18 << 3);
                            int iB16 = zzaev.b(zzaeuVar, key, value);
                            iB4 = e0.b(iB16, iB16, iB15, iB4);
                        }
                    }
                    iC3 += iB4;
                    break;
                case 51:
                    if (zzaffVar.s(i18, i14, zzaduVar2)) {
                        iC3 = e0.C(i18 << 3, 8, iC3);
                    }
                    break;
                case 52:
                    if (zzaffVar.s(i18, i14, zzaduVar2)) {
                        iC3 = e0.C(i18 << 3, 4, iC3);
                    }
                    break;
                case 53:
                    if (zzaffVar.s(i18, i14, zzaduVar2)) {
                        long jN = n(j11, zzaduVar2);
                        iB6 = zzada.b(i18 << 3);
                        iC2 = zzada.c(jN);
                        iC3 += iC2 + iB6;
                    }
                    break;
                case 54:
                    if (zzaffVar.s(i18, i14, zzaduVar2)) {
                        long jN2 = n(j11, zzaduVar2);
                        iB6 = zzada.b(i18 << 3);
                        iC2 = zzada.c(jN2);
                        iC3 += iC2 + iB6;
                    }
                    break;
                case 55:
                    if (zzaffVar.s(i18, i14, zzaduVar2)) {
                        long jM = m(j11, zzaduVar2);
                        iB6 = zzada.b(i18 << 3);
                        iC2 = zzada.c(jM);
                        iC3 += iC2 + iB6;
                    }
                    break;
                case 56:
                    if (zzaffVar.s(i18, i14, zzaduVar2)) {
                        iC3 = e0.C(i18 << 3, 8, iC3);
                    }
                    break;
                case 57:
                    if (zzaffVar.s(i18, i14, zzaduVar2)) {
                        iC3 = e0.C(i18 << 3, 4, iC3);
                    }
                    break;
                case 58:
                    if (zzaffVar.s(i18, i14, zzaduVar2)) {
                        iC3 = e0.C(i18 << 3, 1, iC3);
                    }
                    break;
                case 59:
                    if (zzaffVar.s(i18, i14, zzaduVar2)) {
                        int i31 = i18 << 3;
                        Object object2 = unsafe.getObject(zzaduVar2, j11);
                        if (object2 instanceof zzacr) {
                            int iB17 = zzada.b(i31);
                            int iD7 = ((zzacr) object2).d();
                            iC3 = e0.b(iD7, iD7, iB17, iC3);
                        } else {
                            int iB18 = zzada.b(i31);
                            int iB19 = zzagl.b((String) object2);
                            iC3 = e0.b(iB19, iB19, iB18, iC3);
                        }
                    }
                    break;
                case 60:
                    if (zzaffVar.s(i18, i14, zzaduVar2)) {
                        iM = zzafq.m(i18, unsafe.getObject(zzaduVar2, j11), zzaffVar.C(i14));
                        iC3 += iM;
                    }
                    break;
                case 61:
                    if (zzaffVar.s(i18, i14, zzaduVar2)) {
                        zzacr zzacrVar2 = (zzacr) unsafe.getObject(zzaduVar2, j11);
                        int iB20 = zzada.b(i18 << 3);
                        int iD8 = zzacrVar2.d();
                        iC3 = e0.b(iD8, iD8, iB20, iC3);
                    }
                    break;
                case 62:
                    if (zzaffVar.s(i18, i14, zzaduVar2)) {
                        iC3 = e0.C(m(j11, zzaduVar2), zzada.b(i18 << 3), iC3);
                    }
                    break;
                case 63:
                    if (zzaffVar.s(i18, i14, zzaduVar2)) {
                        long jM2 = m(j11, zzaduVar2);
                        iB6 = zzada.b(i18 << 3);
                        iC2 = zzada.c(jM2);
                        iC3 += iC2 + iB6;
                    }
                    break;
                case 64:
                    if (zzaffVar.s(i18, i14, zzaduVar2)) {
                        iC3 = e0.C(i18 << 3, 4, iC3);
                    }
                    break;
                case 65:
                    if (zzaffVar.s(i18, i14, zzaduVar2)) {
                        iC3 = e0.C(i18 << 3, 8, iC3);
                    }
                    break;
                case 66:
                    if (zzaffVar.s(i18, i14, zzaduVar2)) {
                        int iM2 = m(j11, zzaduVar2);
                        iC3 = e0.C((iM2 >> 31) ^ (iM2 + iM2), zzada.b(i18 << 3), iC3);
                    }
                    break;
                case 67:
                    if (zzaffVar.s(i18, i14, zzaduVar2)) {
                        long jN3 = n(j11, zzaduVar2);
                        iB6 = zzada.b(i18 << 3);
                        iC2 = zzada.c((jN3 >> 63) ^ (jN3 + jN3));
                        iC3 += iC2 + iB6;
                    }
                    break;
                case 68:
                    if (zzaffVar.s(i18, i14, zzaduVar2)) {
                        zzafc zzafcVar3 = (zzafc) unsafe.getObject(zzaduVar2, j11);
                        zzafp zzafpVarC4 = zzaffVar.C(i14);
                        zzagb zzagbVar21 = zzafq.f11328a;
                        int iB21 = zzada.b(i18 << 3);
                        i12 = iB21 + iB21;
                        iE = ((zzacb) zzafcVar3).e(zzafpVarC4);
                        iC3 += iE + i12;
                    }
                    break;
            }
            i14 += 3;
            i13 = 1048575;
        }
    }

    /* JADX WARN: Code duplicated, block: B:140:0x021d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:177:0x01d1 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.measurement.zzafp
    public final boolean e(zzadu zzaduVar, zzadu zzaduVar2) {
        boolean zA;
        int i11 = 0;
        while (true) {
            int[] iArr = this.f11300a;
            if (i11 < iArr.length) {
                int i12 = i(i11);
                int iJ = j(i12);
                if (iJ <= 50 || iJ >= 69) {
                    long j11 = i12 & 1048575;
                    switch (iJ) {
                        case 0:
                            if (o(zzaduVar, zzaduVar2, i11)) {
                                zzagf zzagfVar = zzagg.f11354c;
                                if (Double.doubleToLongBits(zzagfVar.f(j11, zzaduVar)) != Double.doubleToLongBits(zzagfVar.f(j11, zzaduVar2))) {
                                }
                            }
                            break;
                        case 1:
                            if (o(zzaduVar, zzaduVar2, i11)) {
                                zzagf zzagfVar2 = zzagg.f11354c;
                                if (Float.floatToIntBits(zzagfVar2.d(j11, zzaduVar)) != Float.floatToIntBits(zzagfVar2.d(j11, zzaduVar2))) {
                                }
                            }
                            break;
                        case 2:
                            if (!o(zzaduVar, zzaduVar2, i11) || zzagg.g(j11, zzaduVar) != zzagg.g(j11, zzaduVar2)) {
                            }
                            break;
                        case 3:
                            if (!o(zzaduVar, zzaduVar2, i11) || zzagg.g(j11, zzaduVar) != zzagg.g(j11, zzaduVar2)) {
                            }
                            break;
                        case 4:
                            if (!o(zzaduVar, zzaduVar2, i11) || zzagg.e(zzaduVar, j11) != zzagg.e(zzaduVar2, j11)) {
                            }
                            break;
                        case 5:
                            if (!o(zzaduVar, zzaduVar2, i11) || zzagg.g(j11, zzaduVar) != zzagg.g(j11, zzaduVar2)) {
                            }
                            break;
                        case 6:
                            if (!o(zzaduVar, zzaduVar2, i11) || zzagg.e(zzaduVar, j11) != zzagg.e(zzaduVar2, j11)) {
                            }
                            break;
                        case 7:
                            if (o(zzaduVar, zzaduVar2, i11)) {
                                zzagf zzagfVar3 = zzagg.f11354c;
                                if (zzagfVar3.b(j11, zzaduVar) != zzagfVar3.b(j11, zzaduVar2)) {
                                }
                            }
                            break;
                        case 8:
                            if (!o(zzaduVar, zzaduVar2, i11) || !zzafq.a(zzagg.i(j11, zzaduVar), zzagg.i(j11, zzaduVar2))) {
                            }
                            break;
                        case 9:
                            if (!o(zzaduVar, zzaduVar2, i11) || !zzafq.a(zzagg.i(j11, zzaduVar), zzagg.i(j11, zzaduVar2))) {
                            }
                            break;
                        case 10:
                            if (!o(zzaduVar, zzaduVar2, i11) || !zzafq.a(zzagg.i(j11, zzaduVar), zzagg.i(j11, zzaduVar2))) {
                            }
                            break;
                        case 11:
                            if (!o(zzaduVar, zzaduVar2, i11) || zzagg.e(zzaduVar, j11) != zzagg.e(zzaduVar2, j11)) {
                            }
                            break;
                        case 12:
                            if (!o(zzaduVar, zzaduVar2, i11) || zzagg.e(zzaduVar, j11) != zzagg.e(zzaduVar2, j11)) {
                            }
                            break;
                        case 13:
                            if (!o(zzaduVar, zzaduVar2, i11) || zzagg.e(zzaduVar, j11) != zzagg.e(zzaduVar2, j11)) {
                            }
                            break;
                        case 14:
                            if (!o(zzaduVar, zzaduVar2, i11) || zzagg.g(j11, zzaduVar) != zzagg.g(j11, zzaduVar2)) {
                            }
                            break;
                        case 15:
                            if (!o(zzaduVar, zzaduVar2, i11) || zzagg.e(zzaduVar, j11) != zzagg.e(zzaduVar2, j11)) {
                            }
                            break;
                        case 16:
                            if (!o(zzaduVar, zzaduVar2, i11) || zzagg.g(j11, zzaduVar) != zzagg.g(j11, zzaduVar2)) {
                            }
                            break;
                        case 17:
                            if (!o(zzaduVar, zzaduVar2, i11) || !zzafq.a(zzagg.i(j11, zzaduVar), zzagg.i(j11, zzaduVar2))) {
                            }
                            break;
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case Service.METRICS_FIELD_NUMBER /* 24 */:
                        case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        case Service.BILLING_FIELD_NUMBER /* 26 */:
                        case 27:
                        case Service.MONITORING_FIELD_NUMBER /* 28 */:
                        case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
                        case 30:
                        case 31:
                        case Consts.SP /* 32 */:
                        case 33:
                        case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                        case 35:
                        case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                        case 37:
                        case 38:
                        case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                        case DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                        case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                        case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                        case 43:
                        case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                        case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                            zA = zzafq.a(zzagg.i(j11, zzaduVar), zzagg.i(j11, zzaduVar2));
                            if (zA) {
                            }
                            break;
                        case 50:
                            zA = zzafq.a(zzagg.i(j11, zzaduVar), zzagg.i(j11, zzaduVar2));
                            if (zA) {
                            }
                            break;
                        case 51:
                        case 52:
                        case 53:
                        case 54:
                        case 55:
                        case 56:
                        case 57:
                        case 58:
                        case 59:
                        case 60:
                        case 61:
                        case 62:
                        case 63:
                        case 64:
                        case 65:
                        case 66:
                        case 67:
                        case 68:
                            long j12 = iArr[i11 + 2] & 1048575;
                            if (zzagg.e(zzaduVar, j12) == zzagg.e(zzaduVar2, j12) && zzafq.a(zzagg.i(j11, zzaduVar), zzagg.i(j11, zzaduVar2))) {
                            }
                            break;
                        default:
                            continue;
                    }
                }
                i11 += 3;
            } else {
                int i13 = this.f11309j;
                while (true) {
                    int[] iArr2 = this.f11307h;
                    if (i13 < iArr2.length) {
                        int i14 = iArr2[i13];
                        long j13 = iArr[i14 + 2] & 1048575;
                        if (zzagg.e(zzaduVar, j13) == zzagg.e(zzaduVar2, j13)) {
                            if (!s(0, i14, zzaduVar)) {
                                long jI = i(i14) & 1048575;
                                if (!zzafq.a(zzagg.i(jI, zzaduVar), zzagg.i(jI, zzaduVar2))) {
                                }
                            }
                            i13++;
                        }
                    } else if (zzaduVar.zzc.equals(zzaduVar2.zzc)) {
                        if (this.f11305f) {
                            return ((zzadr) zzaduVar).zzb.equals(((zzadr) zzaduVar2).zzb);
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzafp
    public final void f(Object obj, byte[] bArr, int i11, int i12, zzacg zzacgVar) {
        x(obj, bArr, i11, i12, 0, zzacgVar);
    }

    /* JADX WARN: Code duplicated, block: B:202:0x05c3 A[LOOP:2: B:201:0x05c1->B:202:0x05c3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:204:0x05d5  */
    /* JADX WARN: Code duplicated, block: B:206:0x05d9  */
    /* JADX WARN: Code duplicated, block: B:212:0x05e7 A[LOOP:1: B:211:0x05e5->B:212:0x05e7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:215:0x05f9  */
    /* JADX WARN: Code duplicated, block: B:233:0x05b1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:323:0x05c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:338:? A[RETURN, SYNTHETIC] */
    @Override // com.google.android.gms.internal.measurement.zzafp
    public final void g(Object obj, zzacw zzacwVar, zzadf zzadfVar) throws Throwable {
        Object obj2;
        Object objJ;
        zzafz zzafzVar;
        Object obj3;
        Object objJ2;
        Object obj4;
        zzaff<T> zzaffVar;
        Object obj5;
        zzaff<T> zzaffVar2 = this;
        int[] iArr = zzaffVar2.f11307h;
        int i11 = zzaffVar2.f11309j;
        int i12 = zzaffVar2.f11308i;
        zzadfVar.getClass();
        l(obj);
        Throwable th2 = null;
        zzafz zzafzVar2 = zzaffVar2.f11310k;
        Object objH = null;
        while (true) {
            try {
                int iX = zzacwVar.x();
                int iU = (iX < zzaffVar2.f11302c || iX > zzaffVar2.f11303d) ? -1 : zzaffVar2.u(iX, 0);
                if (iU >= 0) {
                    obj4 = obj;
                    int i13 = zzaffVar2.i(iU);
                    try {
                        try {
                            switch (j(i13)) {
                                case 0:
                                    zzaffVar = zzaffVar2;
                                    obj3 = objH;
                                    try {
                                        obj5 = obj;
                                        try {
                                            zzagg.f11354c.g(obj5, i13 & 1048575, zzacwVar.y());
                                            zzaffVar.r(iU, obj5);
                                            zzaffVar2 = zzaffVar;
                                            objH = obj3;
                                            th2 = null;
                                        } catch (zzaeg unused) {
                                            obj2 = obj5;
                                            objH = obj3;
                                            if (objH == null) {
                                                try {
                                                    objH = zzafzVar2.h(obj2);
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                }
                                            }
                                            if (!zzafzVar2.k(0, zzacwVar, objH)) {
                                                objJ2 = objH;
                                                while (i12 < i11) {
                                                    zzafz zzafzVar3 = zzafzVar2;
                                                    objJ2 = zzaffVar.J(obj2, iArr[i12], objJ2, zzafzVar3, obj);
                                                    zzafzVar2 = zzafzVar3;
                                                    i12++;
                                                    zzaffVar = this;
                                                }
                                                if (objJ2 != null) {
                                                    zzafzVar2.i(obj2, objJ2);
                                                }
                                            }
                                            th2 = null;
                                            zzaffVar2 = this;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            obj2 = obj5;
                                        }
                                    } catch (zzaeg unused2) {
                                        obj2 = obj;
                                        objH = obj3;
                                        if (objH == null) {
                                            objH = zzafzVar2.h(obj2);
                                        }
                                        if (!zzafzVar2.k(0, zzacwVar, objH)) {
                                            objJ2 = objH;
                                            while (i12 < i11) {
                                                zzafz zzafzVar4 = zzafzVar2;
                                                objJ2 = zzaffVar.J(obj2, iArr[i12], objJ2, zzafzVar4, obj);
                                                zzafzVar2 = zzafzVar4;
                                                i12++;
                                                zzaffVar = this;
                                            }
                                            if (objJ2 != null) {
                                                zzafzVar2.i(obj2, objJ2);
                                            }
                                        }
                                        th2 = null;
                                        zzaffVar2 = this;
                                    } catch (Throwable th5) {
                                        th = th5;
                                        obj2 = obj;
                                    }
                                    break;
                                case 1:
                                    zzaffVar = zzaffVar2;
                                    obj3 = objH;
                                    zzagg.f11354c.e(obj4, i13 & 1048575, zzacwVar.z());
                                    zzaffVar.r(iU, obj4);
                                    zzaffVar2 = zzaffVar;
                                    objH = obj3;
                                    th2 = null;
                                    break;
                                case 2:
                                    zzaffVar = zzaffVar2;
                                    obj3 = objH;
                                    zzagg.h(obj4, i13 & 1048575, zzacwVar.B());
                                    zzaffVar.r(iU, obj4);
                                    zzaffVar2 = zzaffVar;
                                    objH = obj3;
                                    th2 = null;
                                    break;
                                case 3:
                                    zzaffVar = zzaffVar2;
                                    obj3 = objH;
                                    zzagg.h(obj4, i13 & 1048575, zzacwVar.A());
                                    zzaffVar.r(iU, obj4);
                                    zzaffVar2 = zzaffVar;
                                    objH = obj3;
                                    th2 = null;
                                    break;
                                case 4:
                                    zzaffVar = zzaffVar2;
                                    obj3 = objH;
                                    zzagg.f(i13 & 1048575, obj4, zzacwVar.C());
                                    zzaffVar.r(iU, obj4);
                                    zzaffVar2 = zzaffVar;
                                    objH = obj3;
                                    th2 = null;
                                    break;
                                case 5:
                                    zzaffVar = zzaffVar2;
                                    obj3 = objH;
                                    zzagg.h(obj4, i13 & 1048575, zzacwVar.D());
                                    zzaffVar.r(iU, obj4);
                                    zzaffVar2 = zzaffVar;
                                    objH = obj3;
                                    th2 = null;
                                    break;
                                case 6:
                                    zzaffVar = zzaffVar2;
                                    obj3 = objH;
                                    zzagg.f(i13 & 1048575, obj4, zzacwVar.E());
                                    zzaffVar.r(iU, obj4);
                                    zzaffVar2 = zzaffVar;
                                    objH = obj3;
                                    th2 = null;
                                    break;
                                case 7:
                                    zzaffVar = zzaffVar2;
                                    obj3 = objH;
                                    zzagg.f11354c.c(obj4, i13 & 1048575, zzacwVar.F());
                                    zzaffVar.r(iU, obj4);
                                    zzaffVar2 = zzaffVar;
                                    objH = obj3;
                                    th2 = null;
                                    break;
                                case 8:
                                    zzaffVar = zzaffVar2;
                                    obj3 = objH;
                                    zzaffVar.K(i13, zzacwVar, obj4);
                                    zzaffVar.r(iU, obj4);
                                    zzaffVar2 = zzaffVar;
                                    objH = obj3;
                                    th2 = null;
                                    break;
                                case 9:
                                    zzaffVar = zzaffVar2;
                                    obj3 = objH;
                                    zzafc zzafcVar = (zzafc) zzaffVar.F(iU, obj4);
                                    zzacwVar.I(zzafcVar, zzaffVar.C(iU), zzadfVar);
                                    zzaffVar.G(iU, obj4, zzafcVar);
                                    zzaffVar2 = zzaffVar;
                                    objH = obj3;
                                    th2 = null;
                                    break;
                                case 10:
                                    zzaffVar = zzaffVar2;
                                    obj3 = objH;
                                    zzagg.j(obj4, i13 & 1048575, zzacwVar.K());
                                    zzaffVar.r(iU, obj4);
                                    zzaffVar2 = zzaffVar;
                                    objH = obj3;
                                    th2 = null;
                                    break;
                                case 11:
                                    zzaffVar = zzaffVar2;
                                    obj3 = objH;
                                    zzagg.f(i13 & 1048575, obj4, zzacwVar.L());
                                    zzaffVar.r(iU, obj4);
                                    zzaffVar2 = zzaffVar;
                                    objH = obj3;
                                    th2 = null;
                                    break;
                                case 12:
                                    zzaffVar = zzaffVar2;
                                    obj3 = objH;
                                    int iM = zzacwVar.M();
                                    zzadz zzadzVarE = zzaffVar.E(iU);
                                    if (zzadzVarE != null && !zzadzVarE.zza(iM)) {
                                        zzagb zzagbVar = zzafq.f11328a;
                                        objH = obj3 == null ? zzafzVar2.h(obj4) : obj3;
                                        zzafzVar2.a(iM, objH, iX);
                                        zzaffVar2 = zzaffVar;
                                        th2 = null;
                                    }
                                    zzagg.f(i13 & 1048575, obj4, iM);
                                    zzaffVar.r(iU, obj4);
                                    zzaffVar2 = zzaffVar;
                                    objH = obj3;
                                    th2 = null;
                                    break;
                                case 13:
                                    zzaffVar = zzaffVar2;
                                    obj3 = objH;
                                    zzagg.f(i13 & 1048575, obj4, zzacwVar.N());
                                    zzaffVar.r(iU, obj4);
                                    zzaffVar2 = zzaffVar;
                                    objH = obj3;
                                    th2 = null;
                                    break;
                                case 14:
                                    zzaffVar = zzaffVar2;
                                    obj3 = objH;
                                    zzagg.h(obj4, i13 & 1048575, zzacwVar.O());
                                    zzaffVar.r(iU, obj4);
                                    zzaffVar2 = zzaffVar;
                                    objH = obj3;
                                    th2 = null;
                                    break;
                                case 15:
                                    zzaffVar = zzaffVar2;
                                    obj3 = objH;
                                    zzagg.f(i13 & 1048575, obj4, zzacwVar.P());
                                    zzaffVar.r(iU, obj4);
                                    zzaffVar2 = zzaffVar;
                                    objH = obj3;
                                    th2 = null;
                                    break;
                                case 16:
                                    zzaffVar = zzaffVar2;
                                    obj3 = objH;
                                    zzagg.h(obj4, i13 & 1048575, zzacwVar.Q());
                                    zzaffVar.r(iU, obj4);
                                    zzaffVar2 = zzaffVar;
                                    objH = obj3;
                                    th2 = null;
                                    break;
                                case 17:
                                    zzaffVar = zzaffVar2;
                                    obj3 = objH;
                                    zzafc zzafcVar2 = (zzafc) zzaffVar.F(iU, obj4);
                                    zzacwVar.J(zzafcVar2, zzaffVar.C(iU), zzadfVar);
                                    zzaffVar.G(iU, obj4, zzafcVar2);
                                    zzaffVar2 = zzaffVar;
                                    objH = obj3;
                                    th2 = null;
                                    break;
                                case 18:
                                    zzaffVar = zzaffVar2;
                                    obj3 = objH;
                                    zzacwVar.R(zzaeo.a(i13 & 1048575, obj4));
                                    zzaffVar2 = zzaffVar;
                                    objH = obj3;
                                    th2 = null;
                                    break;
                                case 19:
                                    zzaffVar = zzaffVar2;
                                    obj3 = objH;
                                    zzacwVar.S(zzaeo.a(i13 & 1048575, obj4));
                                    zzaffVar2 = zzaffVar;
                                    objH = obj3;
                                    th2 = null;
                                    break;
                                case 20:
                                    zzaffVar = zzaffVar2;
                                    obj3 = objH;
                                    zzacwVar.a(zzaeo.a(i13 & 1048575, obj4));
                                    zzaffVar2 = zzaffVar;
                                    objH = obj3;
                                    th2 = null;
                                    break;
                                case 21:
                                    zzaffVar = zzaffVar2;
                                    obj3 = objH;
                                    zzacwVar.T(zzaeo.a(i13 & 1048575, obj4));
                                    zzaffVar2 = zzaffVar;
                                    objH = obj3;
                                    th2 = null;
                                    break;
                                case 22:
                                    zzaffVar = zzaffVar2;
                                    obj3 = objH;
                                    zzacwVar.b(zzaeo.a(i13 & 1048575, obj4));
                                    zzaffVar2 = zzaffVar;
                                    objH = obj3;
                                    th2 = null;
                                    break;
                                case 23:
                                    zzaffVar = zzaffVar2;
                                    obj3 = objH;
                                    zzacwVar.c(zzaeo.a(i13 & 1048575, obj4));
                                    zzaffVar2 = zzaffVar;
                                    objH = obj3;
                                    th2 = null;
                                    break;
                                case Service.METRICS_FIELD_NUMBER /* 24 */:
                                    zzaffVar = zzaffVar2;
                                    obj3 = objH;
                                    zzacwVar.d(zzaeo.a(i13 & 1048575, obj4));
                                    zzaffVar2 = zzaffVar;
                                    objH = obj3;
                                    th2 = null;
                                    break;
                                case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                                    zzaffVar = zzaffVar2;
                                    obj3 = objH;
                                    zzacwVar.e(zzaeo.a(i13 & 1048575, obj4));
                                    zzaffVar2 = zzaffVar;
                                    objH = obj3;
                                    th2 = null;
                                    break;
                                case Service.BILLING_FIELD_NUMBER /* 26 */:
                                    zzaffVar = zzaffVar2;
                                    obj3 = objH;
                                    if ((536870912 & i13) != 0) {
                                        zzacwVar.f(zzaeo.a(i13 & 1048575, obj4), true);
                                    } else {
                                        zzacwVar.f(zzaeo.a(i13 & 1048575, obj4), false);
                                    }
                                    zzaffVar2 = zzaffVar;
                                    objH = obj3;
                                    th2 = null;
                                    break;
                                case 27:
                                    zzaffVar = zzaffVar2;
                                    obj3 = objH;
                                    zzacwVar.g(zzaeo.a(i13 & 1048575, obj4), zzaffVar.C(iU), zzadfVar);
                                    zzaffVar2 = zzaffVar;
                                    objH = obj3;
                                    th2 = null;
                                    break;
                                case Service.MONITORING_FIELD_NUMBER /* 28 */:
                                    zzaffVar = zzaffVar2;
                                    obj3 = objH;
                                    zzacwVar.i(zzaeo.a(i13 & 1048575, obj4));
                                    zzaffVar2 = zzaffVar;
                                    objH = obj3;
                                    th2 = null;
                                    break;
                                case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
                                    zzaffVar = zzaffVar2;
                                    obj2 = obj4;
                                    obj3 = objH;
                                    try {
                                        zzacwVar.j(zzaeo.a(i13 & 1048575, obj2));
                                        zzaffVar2 = zzaffVar;
                                        objH = obj3;
                                        th2 = null;
                                    } catch (zzaeg unused3) {
                                        objH = obj3;
                                        if (objH == null) {
                                            objH = zzafzVar2.h(obj2);
                                        }
                                        if (!zzafzVar2.k(0, zzacwVar, objH)) {
                                            objJ2 = objH;
                                            while (i12 < i11) {
                                                zzafz zzafzVar5 = zzafzVar2;
                                                objJ2 = zzaffVar.J(obj2, iArr[i12], objJ2, zzafzVar5, obj);
                                                zzafzVar2 = zzafzVar5;
                                                i12++;
                                                zzaffVar = this;
                                            }
                                            if (objJ2 != null) {
                                                zzafzVar2.i(obj2, objJ2);
                                            }
                                        }
                                        th2 = null;
                                        zzaffVar2 = this;
                                    } catch (Throwable th6) {
                                        th = th6;
                                    }
                                    break;
                                case 30:
                                    zzaffVar = zzaffVar2;
                                    zzaef zzaefVarA = zzaeo.a(i13 & 1048575, obj4);
                                    zzacwVar.k(zzaefVarA);
                                    obj5 = obj4;
                                    try {
                                        objH = zzafq.c(obj5, iX, zzaefVarA, zzaffVar.E(iU), objH, zzafzVar2);
                                        zzaffVar2 = zzaffVar;
                                        th2 = null;
                                    } catch (zzaeg unused4) {
                                        obj3 = objH;
                                        obj2 = obj5;
                                        objH = obj3;
                                        if (objH == null) {
                                            objH = zzafzVar2.h(obj2);
                                        }
                                        if (!zzafzVar2.k(0, zzacwVar, objH)) {
                                            objJ2 = objH;
                                            while (i12 < i11) {
                                                zzafz zzafzVar6 = zzafzVar2;
                                                objJ2 = zzaffVar.J(obj2, iArr[i12], objJ2, zzafzVar6, obj);
                                                zzafzVar2 = zzafzVar6;
                                                i12++;
                                                zzaffVar = this;
                                            }
                                            if (objJ2 != null) {
                                                zzafzVar2.i(obj2, objJ2);
                                            }
                                        }
                                        th2 = null;
                                        zzaffVar2 = this;
                                    }
                                    break;
                                case 31:
                                    zzaffVar = zzaffVar2;
                                    zzacwVar.l(zzaeo.a(i13 & 1048575, obj4));
                                    obj3 = objH;
                                    zzaffVar2 = zzaffVar;
                                    objH = obj3;
                                    th2 = null;
                                    break;
                                case Consts.SP /* 32 */:
                                    zzaffVar = zzaffVar2;
                                    zzacwVar.m(zzaeo.a(i13 & 1048575, obj4));
                                    obj3 = objH;
                                    zzaffVar2 = zzaffVar;
                                    objH = obj3;
                                    th2 = null;
                                    break;
                                case 33:
                                    zzaffVar = zzaffVar2;
                                    zzacwVar.n(zzaeo.a(i13 & 1048575, obj4));
                                    obj3 = objH;
                                    zzaffVar2 = zzaffVar;
                                    objH = obj3;
                                    th2 = null;
                                    break;
                                case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                                    zzaffVar = zzaffVar2;
                                    zzacwVar.o(zzaeo.a(i13 & 1048575, obj4));
                                    obj3 = objH;
                                    zzaffVar2 = zzaffVar;
                                    objH = obj3;
                                    th2 = null;
                                    break;
                                case 35:
                                    zzaffVar = zzaffVar2;
                                    zzacwVar.R(zzaeo.a(i13 & 1048575, obj4));
                                    obj3 = objH;
                                    zzaffVar2 = zzaffVar;
                                    objH = obj3;
                                    th2 = null;
                                    break;
                                case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                                    zzaffVar = zzaffVar2;
                                    zzacwVar.S(zzaeo.a(i13 & 1048575, obj4));
                                    obj3 = objH;
                                    zzaffVar2 = zzaffVar;
                                    objH = obj3;
                                    th2 = null;
                                    break;
                                case 37:
                                    zzaffVar = zzaffVar2;
                                    zzacwVar.a(zzaeo.a(i13 & 1048575, obj4));
                                    obj3 = objH;
                                    zzaffVar2 = zzaffVar;
                                    objH = obj3;
                                    th2 = null;
                                    break;
                                case 38:
                                    zzaffVar = zzaffVar2;
                                    zzacwVar.T(zzaeo.a(i13 & 1048575, obj4));
                                    obj3 = objH;
                                    zzaffVar2 = zzaffVar;
                                    objH = obj3;
                                    th2 = null;
                                    break;
                                case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                                    zzaffVar = zzaffVar2;
                                    zzacwVar.b(zzaeo.a(i13 & 1048575, obj4));
                                    obj3 = objH;
                                    zzaffVar2 = zzaffVar;
                                    objH = obj3;
                                    th2 = null;
                                    break;
                                case DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                                    zzaffVar = zzaffVar2;
                                    zzacwVar.c(zzaeo.a(i13 & 1048575, obj4));
                                    obj3 = objH;
                                    zzaffVar2 = zzaffVar;
                                    objH = obj3;
                                    th2 = null;
                                    break;
                                case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                                    zzaffVar = zzaffVar2;
                                    zzacwVar.d(zzaeo.a(i13 & 1048575, obj4));
                                    obj3 = objH;
                                    zzaffVar2 = zzaffVar;
                                    objH = obj3;
                                    th2 = null;
                                    break;
                                case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                                    zzaffVar = zzaffVar2;
                                    zzacwVar.e(zzaeo.a(i13 & 1048575, obj4));
                                    obj3 = objH;
                                    zzaffVar2 = zzaffVar;
                                    objH = obj3;
                                    th2 = null;
                                    break;
                                case 43:
                                    zzaffVar = zzaffVar2;
                                    obj2 = obj4;
                                    try {
                                        zzacwVar.j(zzaeo.a(i13 & 1048575, obj2));
                                        obj3 = objH;
                                        zzaffVar2 = zzaffVar;
                                        objH = obj3;
                                        th2 = null;
                                    } catch (zzaeg unused5) {
                                        obj3 = objH;
                                        objH = obj3;
                                        if (objH == null) {
                                            objH = zzafzVar2.h(obj2);
                                        }
                                        if (!zzafzVar2.k(0, zzacwVar, objH)) {
                                            objJ2 = objH;
                                            while (i12 < i11) {
                                                zzafz zzafzVar7 = zzafzVar2;
                                                objJ2 = zzaffVar.J(obj2, iArr[i12], objJ2, zzafzVar7, obj);
                                                zzafzVar2 = zzafzVar7;
                                                i12++;
                                                zzaffVar = this;
                                            }
                                            if (objJ2 != null) {
                                                zzafzVar2.i(obj2, objJ2);
                                            }
                                        }
                                        th2 = null;
                                        zzaffVar2 = this;
                                    } catch (Throwable th7) {
                                        th = th7;
                                        obj3 = objH;
                                        objH = obj3;
                                        objJ = objH;
                                        while (i12 < i11) {
                                            zzafz zzafzVar8 = zzafzVar2;
                                            objJ = J(obj2, iArr[i12], objJ, zzafzVar8, obj);
                                            i12++;
                                            zzafzVar2 = zzafzVar8;
                                        }
                                        zzafzVar = zzafzVar2;
                                        if (objJ != null) {
                                            zzafzVar.i(obj2, objJ);
                                        }
                                        throw th;
                                    }
                                    break;
                                case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                                    zzaef zzaefVarA2 = zzaeo.a(i13 & 1048575, obj4);
                                    zzacwVar.k(zzaefVarA2);
                                    zzaffVar = zzaffVar2;
                                    try {
                                        try {
                                            objH = zzafq.c(obj4, iX, zzaefVarA2, zzaffVar2.E(iU), objH, zzafzVar2);
                                            zzaffVar2 = zzaffVar;
                                            th2 = null;
                                        } catch (Throwable th8) {
                                            th = th8;
                                            obj2 = obj4;
                                            obj3 = objH;
                                            objH = obj3;
                                            objJ = objH;
                                            while (i12 < i11) {
                                                zzafz zzafzVar9 = zzafzVar2;
                                                objJ = J(obj2, iArr[i12], objJ, zzafzVar9, obj);
                                                i12++;
                                                zzafzVar2 = zzafzVar9;
                                            }
                                            zzafzVar = zzafzVar2;
                                            if (objJ != null) {
                                                zzafzVar.i(obj2, objJ);
                                            }
                                            throw th;
                                        }
                                    } catch (zzaeg unused6) {
                                        obj2 = obj4;
                                        obj3 = objH;
                                        objH = obj3;
                                        if (objH == null) {
                                            objH = zzafzVar2.h(obj2);
                                        }
                                        if (!zzafzVar2.k(0, zzacwVar, objH)) {
                                            objJ2 = objH;
                                            while (i12 < i11) {
                                                zzafz zzafzVar10 = zzafzVar2;
                                                objJ2 = zzaffVar.J(obj2, iArr[i12], objJ2, zzafzVar10, obj);
                                                zzafzVar2 = zzafzVar10;
                                                i12++;
                                                zzaffVar = this;
                                            }
                                            if (objJ2 != null) {
                                                zzafzVar2.i(obj2, objJ2);
                                            }
                                        }
                                        th2 = null;
                                        zzaffVar2 = this;
                                        break;
                                    }
                                    break;
                                case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                    zzacwVar.l(zzaeo.a(i13 & 1048575, obj4));
                                    zzaffVar = zzaffVar2;
                                    obj3 = objH;
                                    zzaffVar2 = zzaffVar;
                                    objH = obj3;
                                    th2 = null;
                                    break;
                                case 46:
                                    zzacwVar.m(zzaeo.a(i13 & 1048575, obj4));
                                    zzaffVar = zzaffVar2;
                                    obj3 = objH;
                                    zzaffVar2 = zzaffVar;
                                    objH = obj3;
                                    th2 = null;
                                    break;
                                case 47:
                                    zzacwVar.n(zzaeo.a(i13 & 1048575, obj4));
                                    zzaffVar = zzaffVar2;
                                    obj3 = objH;
                                    zzaffVar2 = zzaffVar;
                                    objH = obj3;
                                    th2 = null;
                                    break;
                                case 48:
                                    zzacwVar.o(zzaeo.a(i13 & 1048575, obj4));
                                    zzaffVar = zzaffVar2;
                                    obj3 = objH;
                                    zzaffVar2 = zzaffVar;
                                    objH = obj3;
                                    th2 = null;
                                    break;
                                case 49:
                                    zzacwVar.h(zzaeo.a(i13 & 1048575, obj4), zzaffVar2.C(iU), zzadfVar);
                                    zzaffVar = zzaffVar2;
                                    obj3 = objH;
                                    zzaffVar2 = zzaffVar;
                                    objH = obj3;
                                    th2 = null;
                                    break;
                                case 50:
                                    Object objD = zzaffVar2.D(iU);
                                    long jI = zzaffVar2.i(iU) & 1048575;
                                    Object objI = zzagg.i(jI, obj4);
                                    if (objI == null) {
                                        objI = zzaew.f11294b.a();
                                        zzagg.j(obj4, jI, objI);
                                    } else if (!((zzaew) objI).f11295a) {
                                        Object objA = zzaew.f11294b.a();
                                        zzaex.a(objA, objI);
                                        zzagg.j(obj4, jI, objA);
                                        objI = objA;
                                    }
                                    zzacwVar.p((zzaew) objI, ((zzaev) objD).f11293a, zzadfVar);
                                    zzaffVar = zzaffVar2;
                                    obj3 = objH;
                                    zzaffVar2 = zzaffVar;
                                    objH = obj3;
                                    th2 = null;
                                    break;
                                case 51:
                                    zzagg.j(obj4, i13 & 1048575, Double.valueOf(zzacwVar.y()));
                                    zzaffVar2.t(iX, iU, obj4);
                                    zzaffVar = zzaffVar2;
                                    obj3 = objH;
                                    zzaffVar2 = zzaffVar;
                                    objH = obj3;
                                    th2 = null;
                                    break;
                                case 52:
                                    zzagg.j(obj4, i13 & 1048575, Float.valueOf(zzacwVar.z()));
                                    zzaffVar2.t(iX, iU, obj4);
                                    zzaffVar = zzaffVar2;
                                    obj3 = objH;
                                    zzaffVar2 = zzaffVar;
                                    objH = obj3;
                                    th2 = null;
                                    break;
                                case 53:
                                    zzagg.j(obj4, i13 & 1048575, Long.valueOf(zzacwVar.B()));
                                    zzaffVar2.t(iX, iU, obj4);
                                    zzaffVar = zzaffVar2;
                                    obj3 = objH;
                                    zzaffVar2 = zzaffVar;
                                    objH = obj3;
                                    th2 = null;
                                    break;
                                case 54:
                                    zzagg.j(obj4, i13 & 1048575, Long.valueOf(zzacwVar.A()));
                                    zzaffVar2.t(iX, iU, obj4);
                                    zzaffVar = zzaffVar2;
                                    obj3 = objH;
                                    zzaffVar2 = zzaffVar;
                                    objH = obj3;
                                    th2 = null;
                                    break;
                                case 55:
                                    zzagg.j(obj4, i13 & 1048575, Integer.valueOf(zzacwVar.C()));
                                    zzaffVar2.t(iX, iU, obj4);
                                    zzaffVar = zzaffVar2;
                                    obj3 = objH;
                                    zzaffVar2 = zzaffVar;
                                    objH = obj3;
                                    th2 = null;
                                    break;
                                case 56:
                                    zzagg.j(obj4, i13 & 1048575, Long.valueOf(zzacwVar.D()));
                                    zzaffVar2.t(iX, iU, obj4);
                                    zzaffVar = zzaffVar2;
                                    obj3 = objH;
                                    zzaffVar2 = zzaffVar;
                                    objH = obj3;
                                    th2 = null;
                                    break;
                                case 57:
                                    zzagg.j(obj4, i13 & 1048575, Integer.valueOf(zzacwVar.E()));
                                    zzaffVar2.t(iX, iU, obj4);
                                    zzaffVar = zzaffVar2;
                                    obj3 = objH;
                                    zzaffVar2 = zzaffVar;
                                    objH = obj3;
                                    th2 = null;
                                    break;
                                case 58:
                                    zzagg.j(obj4, i13 & 1048575, Boolean.valueOf(zzacwVar.F()));
                                    zzaffVar2.t(iX, iU, obj4);
                                    zzaffVar = zzaffVar2;
                                    obj3 = objH;
                                    zzaffVar2 = zzaffVar;
                                    objH = obj3;
                                    th2 = null;
                                    break;
                                case 59:
                                    zzaffVar2.K(i13, zzacwVar, obj4);
                                    zzaffVar2.t(iX, iU, obj4);
                                    zzaffVar = zzaffVar2;
                                    obj3 = objH;
                                    zzaffVar2 = zzaffVar;
                                    objH = obj3;
                                    th2 = null;
                                    break;
                                case 60:
                                    zzafc zzafcVar3 = (zzafc) zzaffVar2.H(iX, iU, obj4);
                                    zzacwVar.I(zzafcVar3, zzaffVar2.C(iU), zzadfVar);
                                    zzaffVar2.I(obj4, iX, iU, zzafcVar3);
                                    zzaffVar = zzaffVar2;
                                    obj3 = objH;
                                    zzaffVar2 = zzaffVar;
                                    objH = obj3;
                                    th2 = null;
                                    break;
                                case 61:
                                    zzagg.j(obj4, i13 & 1048575, zzacwVar.K());
                                    zzaffVar2.t(iX, iU, obj4);
                                    zzaffVar = zzaffVar2;
                                    obj3 = objH;
                                    zzaffVar2 = zzaffVar;
                                    objH = obj3;
                                    th2 = null;
                                    break;
                                case 62:
                                    zzagg.j(obj4, i13 & 1048575, Integer.valueOf(zzacwVar.L()));
                                    zzaffVar2.t(iX, iU, obj4);
                                    zzaffVar = zzaffVar2;
                                    obj3 = objH;
                                    zzaffVar2 = zzaffVar;
                                    objH = obj3;
                                    th2 = null;
                                    break;
                                case 63:
                                    int iM2 = zzacwVar.M();
                                    zzadz zzadzVarE2 = zzaffVar2.E(iU);
                                    if (zzadzVarE2 == null || zzadzVarE2.zza(iM2)) {
                                        zzagg.j(obj4, i13 & 1048575, Integer.valueOf(iM2));
                                        zzaffVar2.t(iX, iU, obj4);
                                        zzaffVar = zzaffVar2;
                                        obj3 = objH;
                                        zzaffVar2 = zzaffVar;
                                        objH = obj3;
                                    } else {
                                        zzagb zzagbVar2 = zzafq.f11328a;
                                        Object objH2 = objH == null ? zzafzVar2.h(obj4) : objH;
                                        zzafzVar2.a(iM2, objH2, iX);
                                        objH = objH2;
                                    }
                                    th2 = null;
                                    break;
                                case 64:
                                    zzagg.j(obj4, i13 & 1048575, Integer.valueOf(zzacwVar.N()));
                                    zzaffVar2.t(iX, iU, obj4);
                                    zzaffVar = zzaffVar2;
                                    obj3 = objH;
                                    zzaffVar2 = zzaffVar;
                                    objH = obj3;
                                    th2 = null;
                                    break;
                                case 65:
                                    zzagg.j(obj4, i13 & 1048575, Long.valueOf(zzacwVar.O()));
                                    zzaffVar2.t(iX, iU, obj4);
                                    zzaffVar = zzaffVar2;
                                    obj3 = objH;
                                    zzaffVar2 = zzaffVar;
                                    objH = obj3;
                                    th2 = null;
                                    break;
                                case 66:
                                    zzagg.j(obj4, i13 & 1048575, Integer.valueOf(zzacwVar.P()));
                                    zzaffVar2.t(iX, iU, obj4);
                                    zzaffVar = zzaffVar2;
                                    obj3 = objH;
                                    zzaffVar2 = zzaffVar;
                                    objH = obj3;
                                    th2 = null;
                                    break;
                                case 67:
                                    zzagg.j(obj4, i13 & 1048575, Long.valueOf(zzacwVar.Q()));
                                    zzaffVar2.t(iX, iU, obj4);
                                    zzaffVar = zzaffVar2;
                                    obj3 = objH;
                                    zzaffVar2 = zzaffVar;
                                    objH = obj3;
                                    th2 = null;
                                    break;
                                case 68:
                                    zzafc zzafcVar4 = (zzafc) zzaffVar2.H(iX, iU, obj4);
                                    zzacwVar.J(zzafcVar4, zzaffVar2.C(iU), zzadfVar);
                                    zzaffVar2.I(obj4, iX, iU, zzafcVar4);
                                    zzaffVar = zzaffVar2;
                                    obj3 = objH;
                                    zzaffVar2 = zzaffVar;
                                    objH = obj3;
                                    th2 = null;
                                    break;
                                default:
                                    if (objH == null) {
                                        objH = zzafzVar2.h(obj4);
                                    }
                                    try {
                                        if (!zzafzVar2.k(0, zzacwVar, objH)) {
                                            objJ2 = objH;
                                            while (i12 < i11) {
                                                zzafz zzafzVar11 = zzafzVar2;
                                                objJ2 = zzaffVar2.J(obj, iArr[i12], objJ2, zzafzVar11, obj);
                                                obj4 = obj;
                                                zzafzVar2 = zzafzVar11;
                                                i12++;
                                            }
                                            obj2 = obj4;
                                        }
                                    } catch (zzaeg unused7) {
                                        zzaffVar = zzaffVar2;
                                        obj2 = obj4;
                                        if (objH == null) {
                                            objH = zzafzVar2.h(obj2);
                                        }
                                        if (!zzafzVar2.k(0, zzacwVar, objH)) {
                                            objJ2 = objH;
                                            while (i12 < i11) {
                                                zzafz zzafzVar12 = zzafzVar2;
                                                objJ2 = zzaffVar.J(obj2, iArr[i12], objJ2, zzafzVar12, obj);
                                                zzafzVar2 = zzafzVar12;
                                                i12++;
                                                zzaffVar = this;
                                            }
                                            if (objJ2 != null) {
                                                zzafzVar2.i(obj2, objJ2);
                                            }
                                        }
                                        th2 = null;
                                        zzaffVar2 = this;
                                    }
                                    break;
                            }
                        } catch (zzaeg unused8) {
                            zzaffVar = zzaffVar2;
                            obj2 = obj4;
                        }
                    } catch (Throwable th9) {
                        th = th9;
                        obj2 = obj4;
                        obj3 = objH;
                        objH = obj3;
                        objJ = objH;
                        while (i12 < i11) {
                            zzafz zzafzVar13 = zzafzVar2;
                            objJ = J(obj2, iArr[i12], objJ, zzafzVar13, obj);
                            i12++;
                            zzafzVar2 = zzafzVar13;
                        }
                        zzafzVar = zzafzVar2;
                        if (objJ != null) {
                            zzafzVar.i(obj2, objJ);
                        }
                        throw th;
                    }
                } else if (iX == Integer.MAX_VALUE) {
                    objJ2 = objH;
                    while (i12 < i11) {
                        zzafz zzafzVar14 = zzafzVar2;
                        objJ2 = zzaffVar2.J(obj, iArr[i12], objJ2, zzafzVar14, obj);
                        zzafzVar2 = zzafzVar14;
                        i12++;
                    }
                    obj2 = obj;
                } else {
                    obj4 = obj;
                    try {
                        if ((zzaffVar2.f11305f ? (zzadt) zzadfVar.f11255a.get(new zzade(iX, zzaffVar2.f11304e)) : th2) != null) {
                            throw th2;
                        }
                        if (objH == null) {
                            objH = zzafzVar2.h(obj4);
                        }
                        try {
                            if (!zzafzVar2.k(0, zzacwVar, objH)) {
                                objJ2 = objH;
                                while (i12 < i11) {
                                    zzafz zzafzVar15 = zzafzVar2;
                                    objJ2 = zzaffVar2.J(obj, iArr[i12], objJ2, zzafzVar15, obj);
                                    obj4 = obj;
                                    zzafzVar2 = zzafzVar15;
                                    i12++;
                                }
                                obj2 = obj4;
                            }
                        } catch (Throwable th10) {
                            th = th10;
                            obj2 = obj4;
                        }
                    } catch (Throwable th11) {
                        th = th11;
                        obj2 = obj4;
                        obj3 = objH;
                        objH = obj3;
                    }
                }
            } catch (Throwable th12) {
                th = th12;
                obj2 = obj;
            }
            objH = obj3;
            objJ = objH;
            while (i12 < i11) {
                zzafz zzafzVar16 = zzafzVar2;
                objJ = J(obj2, iArr[i12], objJ, zzafzVar16, obj);
                i12++;
                zzafzVar2 = zzafzVar16;
            }
            zzafzVar = zzafzVar2;
            if (objJ != null) {
                zzafzVar.i(obj2, objJ);
            }
            throw th;
        }
        if (objJ2 != null) {
            zzafzVar2.i(obj2, objJ2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzafp
    public final int h(zzadu zzaduVar) {
        int i11;
        long jDoubleToLongBits;
        int i12;
        int iFloatToIntBits;
        int iE;
        int i13;
        int iHashCode = 0;
        for (int i14 = 0; i14 < this.f11300a.length; i14 += 3) {
            int i15 = i(i14);
            int iJ = j(i15);
            if (iJ <= 50 || iJ >= 69) {
                long j11 = i15 & 1048575;
                int iHashCode2 = 37;
                switch (iJ) {
                    case 0:
                        i11 = iHashCode * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(zzagg.f11354c.f(j11, zzaduVar));
                        byte[] bArr = zzaed.f11274a;
                        iE = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i11 + iE;
                        break;
                    case 1:
                        i12 = iHashCode * 53;
                        iFloatToIntBits = Float.floatToIntBits(zzagg.f11354c.d(j11, zzaduVar));
                        iHashCode = i12 + iFloatToIntBits;
                        break;
                    case 2:
                        i11 = iHashCode * 53;
                        jDoubleToLongBits = zzagg.g(j11, zzaduVar);
                        byte[] bArr2 = zzaed.f11274a;
                        iE = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i11 + iE;
                        break;
                    case 3:
                        i11 = iHashCode * 53;
                        jDoubleToLongBits = zzagg.g(j11, zzaduVar);
                        byte[] bArr3 = zzaed.f11274a;
                        iE = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i11 + iE;
                        break;
                    case 4:
                        i11 = iHashCode * 53;
                        iE = zzagg.e(zzaduVar, j11);
                        iHashCode = i11 + iE;
                        break;
                    case 5:
                        i11 = iHashCode * 53;
                        jDoubleToLongBits = zzagg.g(j11, zzaduVar);
                        byte[] bArr4 = zzaed.f11274a;
                        iE = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i11 + iE;
                        break;
                    case 6:
                        i11 = iHashCode * 53;
                        iE = zzagg.e(zzaduVar, j11);
                        iHashCode = i11 + iE;
                        break;
                    case 7:
                        i12 = iHashCode * 53;
                        boolean zB = zzagg.f11354c.b(j11, zzaduVar);
                        byte[] bArr5 = zzaed.f11274a;
                        iFloatToIntBits = zB ? 1231 : 1237;
                        iHashCode = i12 + iFloatToIntBits;
                        break;
                    case 8:
                        i12 = iHashCode * 53;
                        iFloatToIntBits = ((String) zzagg.i(j11, zzaduVar)).hashCode();
                        iHashCode = i12 + iFloatToIntBits;
                        break;
                    case 9:
                        i13 = iHashCode * 53;
                        Object objI = zzagg.i(j11, zzaduVar);
                        if (objI != null) {
                            iHashCode2 = objI.hashCode();
                        }
                        iHashCode = i13 + iHashCode2;
                        break;
                    case 10:
                        i12 = iHashCode * 53;
                        iFloatToIntBits = zzagg.i(j11, zzaduVar).hashCode();
                        iHashCode = i12 + iFloatToIntBits;
                        break;
                    case 11:
                        i11 = iHashCode * 53;
                        iE = zzagg.e(zzaduVar, j11);
                        iHashCode = i11 + iE;
                        break;
                    case 12:
                        i11 = iHashCode * 53;
                        iE = zzagg.e(zzaduVar, j11);
                        iHashCode = i11 + iE;
                        break;
                    case 13:
                        i11 = iHashCode * 53;
                        iE = zzagg.e(zzaduVar, j11);
                        iHashCode = i11 + iE;
                        break;
                    case 14:
                        i11 = iHashCode * 53;
                        jDoubleToLongBits = zzagg.g(j11, zzaduVar);
                        byte[] bArr6 = zzaed.f11274a;
                        iE = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i11 + iE;
                        break;
                    case 15:
                        i11 = iHashCode * 53;
                        iE = zzagg.e(zzaduVar, j11);
                        iHashCode = i11 + iE;
                        break;
                    case 16:
                        i11 = iHashCode * 53;
                        jDoubleToLongBits = zzagg.g(j11, zzaduVar);
                        byte[] bArr7 = zzaed.f11274a;
                        iE = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i11 + iE;
                        break;
                    case 17:
                        i13 = iHashCode * 53;
                        Object objI2 = zzagg.i(j11, zzaduVar);
                        if (objI2 != null) {
                            iHashCode2 = objI2.hashCode();
                        }
                        iHashCode = i13 + iHashCode2;
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case Service.METRICS_FIELD_NUMBER /* 24 */:
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                    case Service.BILLING_FIELD_NUMBER /* 26 */:
                    case 27:
                    case Service.MONITORING_FIELD_NUMBER /* 28 */:
                    case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
                    case 30:
                    case 31:
                    case Consts.SP /* 32 */:
                    case 33:
                    case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                    case 35:
                    case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    case 37:
                    case 38:
                    case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    case DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                    case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                    case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                    case 43:
                    case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                    case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        i12 = iHashCode * 53;
                        iFloatToIntBits = zzagg.i(j11, zzaduVar).hashCode();
                        iHashCode = i12 + iFloatToIntBits;
                        break;
                    case 50:
                        i12 = iHashCode * 53;
                        iFloatToIntBits = zzagg.i(j11, zzaduVar).hashCode();
                        iHashCode = i12 + iFloatToIntBits;
                        break;
                }
            }
        }
        int i16 = this.f11309j;
        while (true) {
            int[] iArr = this.f11307h;
            if (i16 >= iArr.length) {
                int iHashCode3 = zzaduVar.zzc.hashCode() + (iHashCode * 53);
                return this.f11305f ? (iHashCode3 * 53) + ((zzadr) zzaduVar).zzb.f11258a.hashCode() : iHashCode3;
            }
            int i17 = iArr[i16];
            if (!s(0, i17, zzaduVar)) {
                iHashCode = zzagg.i(i(i17) & 1048575, zzaduVar).hashCode() + (iHashCode * 53);
            }
            i16++;
        }
    }

    public final int i(int i11) {
        return this.f11300a[i11 + 1];
    }

    public final boolean o(zzadu zzaduVar, zzadu zzaduVar2, int i11) {
        return q(i11, zzaduVar) == q(i11, zzaduVar2);
    }

    public final boolean p(Object obj, int i11, int i12, int i13, int i14) {
        if (i12 == 1048575) {
            return q(i11, obj);
        }
        return (i13 & i14) != 0;
    }

    public final boolean q(int i11, Object obj) {
        int i12 = this.f11300a[i11 + 2];
        long j11 = i12 & 1048575;
        if (j11 == 1048575) {
            int i13 = i(i11);
            long j12 = i13 & 1048575;
            switch (j(i13)) {
                case 0:
                    if (Double.doubleToRawLongBits(zzagg.f11354c.f(j12, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(zzagg.f11354c.d(j12, obj)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (zzagg.g(j12, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (zzagg.g(j12, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (zzagg.e(obj, j12) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (zzagg.g(j12, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (zzagg.e(obj, j12) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return zzagg.f11354c.b(j12, obj);
                case 8:
                    Object objI = zzagg.i(j12, obj);
                    if (objI instanceof String) {
                        if (((String) objI).isEmpty()) {
                            return false;
                        }
                    } else {
                        if (!(objI instanceof zzacr)) {
                            throw new IllegalArgumentException();
                        }
                        if (zzacr.f11213b.equals(objI)) {
                            return false;
                        }
                    }
                case 9:
                    if (zzagg.i(j12, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    if (zzacr.f11213b.equals(zzagg.i(j12, obj))) {
                        return false;
                    }
                    break;
                case 11:
                    if (zzagg.e(obj, j12) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (zzagg.e(obj, j12) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (zzagg.e(obj, j12) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (zzagg.g(j12, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (zzagg.e(obj, j12) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (zzagg.g(j12, obj) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (zzagg.i(j12, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i12 >>> 20)) & zzagg.e(obj, j11)) == 0) {
            return false;
        }
        return true;
    }

    public final void r(int i11, Object obj) {
        int i12 = this.f11300a[i11 + 2];
        long j11 = 1048575 & i12;
        if (j11 == 1048575) {
            return;
        }
        zzagg.f(j11, obj, (1 << (i12 >>> 20)) | zzagg.e(obj, j11));
    }

    public final boolean s(int i11, int i12, Object obj) {
        return zzagg.e(obj, (long) (this.f11300a[i12 + 2] & 1048575)) == i11;
    }

    public final void t(int i11, int i12, Object obj) {
        zzagg.f(this.f11300a[i12 + 2] & 1048575, obj, i11);
    }

    public final int u(int i11, int i12) {
        int[] iArr = this.f11300a;
        int length = (iArr.length / 3) - 1;
        while (i12 <= length) {
            int i13 = (length + i12) >>> 1;
            int i14 = i13 * 3;
            int i15 = iArr[i14];
            if (i11 == i15) {
                return i14;
            }
            if (i11 < i15) {
                length = i13 - 1;
            } else {
                i12 = i13 + 1;
            }
        }
        return -1;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 42181. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final int x(java.lang.Object r37, byte[] r38, int r39, int r40, int r41, com.google.android.gms.internal.measurement.zzacg r42) {
        /*
            Method dump skipped, instruction units count: 4218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzaff.x(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.measurement.zzacg):int");
    }

    @Override // com.google.android.gms.internal.measurement.zzafp
    public final Object zza() {
        return ((zzadu) this.f11304e).n();
    }

    @Override // com.google.android.gms.internal.measurement.zzafp
    public final boolean zzl(Object obj) {
        int i11;
        int i12;
        int i13 = 0;
        int i14 = 0;
        int i15 = 1048575;
        while (i13 < this.f11308i) {
            int i16 = this.f11307h[i13];
            int i17 = i(i16);
            int[] iArr = this.f11300a;
            int i18 = iArr[i16 + 2];
            int i19 = i18 & 1048575;
            int i21 = 1 << (i18 >>> 20);
            if (i19 != i15) {
                if (i19 != 1048575) {
                    i14 = f11299n.getInt(obj, i19);
                }
                i12 = i14;
                i11 = i19;
            } else {
                i11 = i15;
                i12 = i14;
            }
            Object obj2 = obj;
            if ((268435456 & i17) == 0 || p(obj2, i16, i11, i12, i21)) {
                int iJ = j(i17);
                if (iJ != 9 && iJ != 17) {
                    if (iJ != 27) {
                        if (iJ == 60 || iJ == 68) {
                            if (!s(iArr[i16], i16, obj2) || C(i16).zzl(zzagg.i(i17 & 1048575, obj2))) {
                                i13++;
                                obj = obj2;
                                i15 = i11;
                                i14 = i12;
                            }
                        } else if (iJ != 49) {
                            if (iJ != 50) {
                                continue;
                            } else {
                                zzaew zzaewVar = (zzaew) zzagg.i(i17 & 1048575, obj2);
                                if (!zzaewVar.isEmpty() && ((zzaev) D(i16)).f11293a.f11291b.a() == zzagn.zzi) {
                                    zzafp zzafpVarA = null;
                                    for (Object obj3 : zzaewVar.values()) {
                                        if (zzafpVarA == null) {
                                            zzafpVarA = zzafl.f11317c.a(obj3.getClass());
                                        }
                                        if (!zzafpVarA.zzl(obj3)) {
                                        }
                                    }
                                }
                            }
                            i13++;
                            obj = obj2;
                            i15 = i11;
                            i14 = i12;
                        }
                    }
                    List list = (List) zzagg.i(i17 & 1048575, obj2);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        zzafp zzafpVarC = C(i16);
                        for (int i22 = 0; i22 < list.size(); i22++) {
                            if (zzafpVarC.zzl(list.get(i22))) {
                            }
                        }
                    }
                    i13++;
                    obj = obj2;
                    i15 = i11;
                    i14 = i12;
                } else if (!p(obj2, i16, i11, i12, i21) || C(i16).zzl(zzagg.i(i17 & 1048575, obj2))) {
                    i13++;
                    obj = obj2;
                    i15 = i11;
                    i14 = i12;
                }
            }
            return false;
        }
        Object obj4 = obj;
        if (this.f11305f) {
            ((zzadr) obj4).zzb.c();
        }
        return true;
    }
}
