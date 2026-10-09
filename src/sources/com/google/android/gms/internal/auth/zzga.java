package com.google.android.gms.internal.auth;

import b7.e0;
import com.google.api.Service;
import com.google.protobuf.DescriptorProtos;
import com.stkouyu.util.httputil.Consts;
import com.tbruyelle.rxpermissions3.BuildConfig;
import defpackage.e;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzga<T> implements zzgi<T> {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f9516k = new int[0];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Unsafe f9517l = zzhj.e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f9518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f9519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9520c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f9521d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final zzfx f9522e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f9523f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f9524g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f9525h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final zzfl f9526i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final zzgz f9527j;

    public zzga(int[] iArr, Object[] objArr, int i11, int i12, zzfx zzfxVar, int[] iArr2, int i13, int i14, zzfl zzflVar, zzgz zzgzVar) {
        this.f9518a = iArr;
        this.f9519b = objArr;
        this.f9520c = i11;
        this.f9521d = i12;
        this.f9523f = iArr2;
        this.f9524g = i13;
        this.f9525h = i14;
        this.f9526i = zzflVar;
        this.f9527j = zzgzVar;
        this.f9522e = zzfxVar;
    }

    public static boolean k(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzev) {
            return ((zzev) obj).f();
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:173:0x0347  */
    /* JADX WARN: Code duplicated, block: B:189:0x0397  */
    /* JADX WARN: Code duplicated, block: B:192:0x03a2  */
    public static zzga n(zzfu zzfuVar, zzfl zzflVar, zzgz zzgzVar) {
        int i11;
        int iCharAt;
        int i12;
        int[] iArr;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        char cCharAt;
        int i19;
        char cCharAt2;
        int i21;
        char cCharAt3;
        int i22;
        char cCharAt4;
        int i23;
        char cCharAt5;
        int i24;
        char cCharAt6;
        int i25;
        char cCharAt7;
        int i26;
        char cCharAt8;
        int i27;
        int i28;
        int i29;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i30;
        int i31;
        Field fieldW;
        char cCharAt9;
        Field fieldW2;
        Field fieldW3;
        int i32;
        char cCharAt10;
        int i33;
        char cCharAt11;
        int i34;
        int i35;
        char cCharAt12;
        int i36;
        int i37;
        char cCharAt13;
        if (!(zzfuVar instanceof zzgh)) {
            throw null;
        }
        zzgh zzghVar = (zzgh) zzfuVar;
        String str = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a";
        if ("\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a".charAt(0) >= 55296) {
            int i38 = 1;
            while (true) {
                i11 = i38 + 1;
                if ("\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a".charAt(i38) < 55296) {
                    break;
                }
                i38 = i11;
            }
        } else {
            i11 = 1;
        }
        int i39 = i11 + 1;
        int iCharAt2 = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a".charAt(i11);
        if (iCharAt2 >= 55296) {
            int i40 = iCharAt2 & 8191;
            int i41 = 13;
            while (true) {
                i37 = i39 + 1;
                cCharAt13 = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a".charAt(i39);
                if (cCharAt13 < 55296) {
                    break;
                }
                i40 |= (cCharAt13 & 8191) << i41;
                i41 += 13;
                i39 = i37;
            }
            iCharAt2 = i40 | (cCharAt13 << i41);
            i39 = i37;
        }
        if (iCharAt2 == 0) {
            i14 = 0;
            i16 = 0;
            iCharAt = 0;
            i13 = 0;
            i15 = 0;
            i17 = 0;
            iArr = f9516k;
            i12 = 0;
        } else {
            int i42 = i39 + 1;
            int iCharAt3 = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a".charAt(i39);
            if (iCharAt3 >= 55296) {
                int i43 = iCharAt3 & 8191;
                int i44 = 13;
                while (true) {
                    i26 = i42 + 1;
                    cCharAt8 = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a".charAt(i42);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i43 |= (cCharAt8 & 8191) << i44;
                    i44 += 13;
                    i42 = i26;
                }
                iCharAt3 = i43 | (cCharAt8 << i44);
                i42 = i26;
            }
            int i45 = i42 + 1;
            int iCharAt4 = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a".charAt(i42);
            if (iCharAt4 >= 55296) {
                int i46 = iCharAt4 & 8191;
                int i47 = 13;
                while (true) {
                    i25 = i45 + 1;
                    cCharAt7 = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a".charAt(i45);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i46 |= (cCharAt7 & 8191) << i47;
                    i47 += 13;
                    i45 = i25;
                }
                iCharAt4 = i46 | (cCharAt7 << i47);
                i45 = i25;
            }
            int i48 = i45 + 1;
            int iCharAt5 = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a".charAt(i45);
            if (iCharAt5 >= 55296) {
                int i49 = iCharAt5 & 8191;
                int i50 = 13;
                while (true) {
                    i24 = i48 + 1;
                    cCharAt6 = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a".charAt(i48);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i49 |= (cCharAt6 & 8191) << i50;
                    i50 += 13;
                    i48 = i24;
                }
                iCharAt5 = i49 | (cCharAt6 << i50);
                i48 = i24;
            }
            int i51 = i48 + 1;
            int iCharAt6 = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a".charAt(i48);
            if (iCharAt6 >= 55296) {
                int i52 = iCharAt6 & 8191;
                int i53 = 13;
                while (true) {
                    i23 = i51 + 1;
                    cCharAt5 = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a".charAt(i51);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i52 |= (cCharAt5 & 8191) << i53;
                    i53 += 13;
                    i51 = i23;
                }
                iCharAt6 = i52 | (cCharAt5 << i53);
                i51 = i23;
            }
            int i54 = i51 + 1;
            iCharAt = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a".charAt(i51);
            if (iCharAt >= 55296) {
                int i55 = iCharAt & 8191;
                int i56 = 13;
                while (true) {
                    i22 = i54 + 1;
                    cCharAt4 = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a".charAt(i54);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i55 |= (cCharAt4 & 8191) << i56;
                    i56 += 13;
                    i54 = i22;
                }
                iCharAt = i55 | (cCharAt4 << i56);
                i54 = i22;
            }
            int i57 = i54 + 1;
            int iCharAt7 = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a".charAt(i54);
            if (iCharAt7 >= 55296) {
                int i58 = iCharAt7 & 8191;
                int i59 = 13;
                while (true) {
                    i21 = i57 + 1;
                    cCharAt3 = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a".charAt(i57);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i58 |= (cCharAt3 & 8191) << i59;
                    i59 += 13;
                    i57 = i21;
                }
                iCharAt7 = i58 | (cCharAt3 << i59);
                i57 = i21;
            }
            int i60 = i57 + 1;
            int iCharAt8 = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a".charAt(i57);
            if (iCharAt8 >= 55296) {
                int i61 = iCharAt8 & 8191;
                int i62 = 13;
                while (true) {
                    i19 = i60 + 1;
                    cCharAt2 = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a".charAt(i60);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i61 |= (cCharAt2 & 8191) << i62;
                    i62 += 13;
                    i60 = i19;
                }
                iCharAt8 = i61 | (cCharAt2 << i62);
                i60 = i19;
            }
            int i63 = i60 + 1;
            int iCharAt9 = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a".charAt(i60);
            if (iCharAt9 >= 55296) {
                int i64 = iCharAt9 & 8191;
                int i65 = 13;
                while (true) {
                    i18 = i63 + 1;
                    cCharAt = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a".charAt(i63);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i64 |= (cCharAt & 8191) << i65;
                    i65 += 13;
                    i63 = i18;
                }
                iCharAt9 = i64 | (cCharAt << i65);
                i63 = i18;
            }
            int i66 = iCharAt9 + iCharAt7 + iCharAt8;
            int i67 = iCharAt3 + iCharAt3 + iCharAt4;
            i12 = iCharAt3;
            i39 = i63;
            iArr = new int[i66];
            int i68 = iCharAt7;
            i13 = iCharAt5;
            i14 = i68;
            i15 = iCharAt6;
            i16 = i67;
            i17 = iCharAt9;
        }
        Unsafe unsafe = f9517l;
        Object[] objArr = zzghVar.f9539b;
        Class<?> cls = zzghVar.f9538a.getClass();
        int i69 = i14 + i17;
        int i70 = iCharAt + iCharAt;
        int[] iArr2 = new int[iCharAt * 3];
        Object[] objArr2 = new Object[i70];
        int i71 = i69;
        int i72 = i17;
        int i73 = 0;
        int i74 = 0;
        while (i39 < 12) {
            int i75 = i39 + 1;
            int iCharAt10 = str.charAt(i39);
            if (iCharAt10 >= 55296) {
                int i76 = iCharAt10 & 8191;
                int i77 = i75;
                int i78 = 13;
                while (true) {
                    i35 = i77 + 1;
                    cCharAt12 = str.charAt(i77);
                    i36 = i76;
                    if (cCharAt12 < 55296) {
                        break;
                    }
                    i76 = i36 | ((cCharAt12 & 8191) << i78);
                    i78 += 13;
                    i77 = i35;
                }
                iCharAt10 = i36 | (cCharAt12 << i78);
                i27 = i35;
            } else {
                i27 = i75;
            }
            int i79 = i27 + 1;
            int iCharAt11 = str.charAt(i27);
            int i80 = iCharAt10;
            if (iCharAt11 >= 55296) {
                int i81 = iCharAt11 & 8191;
                int i82 = i79;
                int i83 = 13;
                while (true) {
                    i33 = i82 + 1;
                    cCharAt11 = str.charAt(i82);
                    i34 = i81;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i81 = i34 | ((cCharAt11 & 8191) << i83);
                    i83 += 13;
                    i82 = i33;
                }
                iCharAt11 = i34 | (cCharAt11 << i83);
                i28 = i33;
            } else {
                i28 = i79;
            }
            Object[] objArr3 = objArr2;
            if ((iCharAt11 & 1024) != 0) {
                iArr[i74] = i73;
                i74++;
            }
            int i84 = iCharAt11 & 255;
            int i85 = i12;
            int i86 = i69;
            if (i84 >= 51) {
                int i87 = i28 + 1;
                int iCharAt12 = str.charAt(i28);
                char c11 = 55296;
                if (iCharAt12 >= 55296) {
                    int i88 = iCharAt12 & 8191;
                    int i89 = 13;
                    while (true) {
                        i32 = i87 + 1;
                        cCharAt10 = str.charAt(i87);
                        if (cCharAt10 < c11) {
                            break;
                        }
                        i88 |= (cCharAt10 & 8191) << i89;
                        i89 += 13;
                        i87 = i32;
                        c11 = 55296;
                    }
                    iCharAt12 = i88 | (cCharAt10 << i89);
                    i87 = i32;
                }
                int i90 = i84 - 51;
                int i91 = iCharAt12;
                if (i90 == 9 || i90 == 17) {
                    objArr3[e0.a(i73, 3, 1)] = objArr[i16];
                    i16++;
                } else if (i90 == 12 && (zzghVar.zzc() == 1 || (iCharAt11 & 2048) != 0)) {
                    objArr3[e0.a(i73, 3, 1)] = objArr[i16];
                    i16++;
                }
                int i92 = i91 + i91;
                Object obj = objArr[i92];
                if (obj instanceof Field) {
                    fieldW2 = (Field) obj;
                } else {
                    fieldW2 = w(cls, (String) obj);
                    objArr[i92] = fieldW2;
                }
                int i93 = i16;
                int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldW2);
                int i94 = i92 + 1;
                Object obj2 = objArr[i94];
                i30 = i87;
                if (obj2 instanceof Field) {
                    fieldW3 = (Field) obj2;
                } else {
                    fieldW3 = w(cls, (String) obj2);
                    objArr[i94] = fieldW3;
                }
                iObjectFieldOffset = iObjectFieldOffset3;
                iArr2 = iArr2;
                i13 = i13;
                i16 = i93;
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldW3);
                i31 = 0;
            } else {
                int i95 = i16 + 1;
                Field fieldW4 = w(cls, (String) objArr[i16]);
                if (i84 == 9 || i84 == 17) {
                    objArr3[e0.a(i73, 3, 1)] = fieldW4.getType();
                } else {
                    if (i84 == 27 || i84 == 49) {
                        i29 = i16 + 2;
                        objArr3[e0.a(i73, 3, 1)] = objArr[i95];
                    } else if (i84 == 12 || i84 == 30 || i84 == 44) {
                        int i96 = i16;
                        if (zzghVar.zzc() == 1 || (iCharAt11 & 2048) != 0) {
                            i29 = i96 + 2;
                            objArr3[e0.a(i73, 3, 1)] = objArr[i95];
                        }
                    } else {
                        if (i84 == 50) {
                            int i97 = i72 + 1;
                            iArr[i72] = i73;
                            int i98 = i73 / 3;
                            int i99 = i16 + 2;
                            int i100 = i98 + i98;
                            objArr3[i100] = objArr[i95];
                            if ((iCharAt11 & 2048) != 0) {
                                objArr3[i100 + 1] = objArr[i99];
                                i29 = i16 + 3;
                            } else {
                                i29 = i99;
                            }
                            i72 = i97;
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldW4);
                        iObjectFieldOffset2 = 1048575;
                        if ((iCharAt11 & 4096) != 0 || i84 > 17) {
                            i30 = i28;
                            i31 = 0;
                        } else {
                            int i101 = i28 + 1;
                            int iCharAt13 = str.charAt(i28);
                            if (iCharAt13 >= 55296) {
                                int i102 = iCharAt13 & 8191;
                                int i103 = 13;
                                while (true) {
                                    i30 = i101 + 1;
                                    cCharAt9 = str.charAt(i101);
                                    if (cCharAt9 < 55296) {
                                        break;
                                    }
                                    i102 |= (cCharAt9 & 8191) << i103;
                                    i103 += 13;
                                    i101 = i30;
                                }
                                iCharAt13 = i102 | (cCharAt9 << i103);
                            } else {
                                i30 = i101;
                            }
                            int i104 = (iCharAt13 / 32) + i85 + i85;
                            Object obj3 = objArr[i104];
                            if (obj3 instanceof Field) {
                                fieldW = (Field) obj3;
                            } else {
                                fieldW = w(cls, (String) obj3);
                                objArr[i104] = fieldW;
                            }
                            i31 = iCharAt13 % 32;
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldW);
                        }
                        if (i84 >= 18 && i84 <= 49) {
                            iArr[i71] = iObjectFieldOffset;
                            i71++;
                        }
                        i16 = i29;
                    }
                    iArr2 = iArr2;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldW4);
                    iObjectFieldOffset2 = 1048575;
                    if ((iCharAt11 & 4096) != 0) {
                        i30 = i28;
                        i31 = 0;
                    } else {
                        i30 = i28;
                        i31 = 0;
                    }
                    if (i84 >= 18) {
                        iArr[i71] = iObjectFieldOffset;
                        i71++;
                    }
                    i16 = i29;
                }
                iArr2 = iArr2;
                i29 = i95;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldW4);
                iObjectFieldOffset2 = 1048575;
                if ((iCharAt11 & 4096) != 0) {
                    i30 = i28;
                    i31 = 0;
                } else {
                    i30 = i28;
                    i31 = 0;
                }
                if (i84 >= 18) {
                    iArr[i71] = iObjectFieldOffset;
                    i71++;
                }
                i16 = i29;
            }
            int i105 = i73 + 1;
            iArr2[i73] = i80;
            int i106 = i73 + 2;
            String str2 = str;
            iArr2[i105] = ((iCharAt11 & 512) != 0 ? 536870912 : 0) | ((iCharAt11 & 256) != 0 ? 268435456 : 0) | ((iCharAt11 & 2048) != 0 ? Integer.MIN_VALUE : 0) | (i84 << 20) | iObjectFieldOffset;
            i73 += 3;
            iArr2[i106] = (i31 << 20) | iObjectFieldOffset2;
            i13 = i13;
            iArr2 = iArr2;
            objArr2 = objArr3;
            str = str2;
            i12 = i85;
            i69 = i86;
            i39 = i30;
        }
        return new zzga(iArr2, objArr2, i13, i15, zzghVar.f9538a, iArr, i17, i69, zzflVar, zzgzVar);
    }

    public static int o(zzev zzevVar, long j11) {
        return ((Integer) zzhj.d(zzevVar, j11)).intValue();
    }

    public static int q(int i11) {
        return (i11 >>> 20) & 255;
    }

    public static Field w(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String string = Arrays.toString(declaredFields);
            StringBuilder sbS = e.s("Field ", str, " for ", name, " not found. Known fields are ");
            sbS.append(string);
            throw new RuntimeException(sbS.toString());
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0067  */
    /* JADX WARN: Code duplicated, block: B:27:0x006d  */
    /* JADX WARN: Code duplicated, block: B:38:0x007a A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.auth.zzgi
    public final void a(Object obj) {
        if (k(obj)) {
            if (obj instanceof zzev) {
                zzev zzevVar = (zzev) obj;
                zzevVar.e();
                zzevVar.zza = 0;
                zzevVar.c();
            }
            int[] iArr = this.f9518a;
            int length = iArr.length;
            for (int i11 = 0; i11 < length; i11 += 3) {
                int iR = r(i11);
                int i12 = 1048575 & iR;
                int iQ = q(iR);
                long j11 = i12;
                if (iQ != 9) {
                    if (iQ != 60 && iQ != 68) {
                        switch (iQ) {
                            case 17:
                                if (j(i11, obj)) {
                                    t(i11).a(f9517l.getObject(obj, j11));
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
                                this.f9526i.a(j11, obj);
                                break;
                            case 50:
                                Unsafe unsafe = f9517l;
                                Object object = unsafe.getObject(obj, j11);
                                if (object != null) {
                                    ((zzfr) object).f9513a = false;
                                    unsafe.putObject(obj, j11, object);
                                }
                                break;
                        }
                    } else if (l(iArr[i11], i11, obj)) {
                        t(i11).a(f9517l.getObject(obj, j11));
                    }
                } else if (j(i11, obj)) {
                    t(i11).a(f9517l.getObject(obj, j11));
                }
            }
            this.f9527j.e(obj);
        }
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final boolean b(zzev zzevVar, zzev zzevVar2) {
        boolean zA;
        int[] iArr = this.f9518a;
        int length = iArr.length;
        for (int i11 = 0; i11 < length; i11 += 3) {
            int iR = r(i11);
            long j11 = iR & 1048575;
            switch (q(iR)) {
                case 0:
                    if (i(zzevVar, zzevVar2, i11)) {
                        zzhi zzhiVar = zzhj.f9572c;
                        if (Double.doubleToLongBits(zzhiVar.a(zzevVar, j11)) == Double.doubleToLongBits(zzhiVar.a(zzevVar2, j11))) {
                            continue;
                            break;
                        }
                    }
                case 1:
                    if (i(zzevVar, zzevVar2, i11)) {
                        zzhi zzhiVar2 = zzhj.f9572c;
                        if (Float.floatToIntBits(zzhiVar2.b(zzevVar, j11)) == Float.floatToIntBits(zzhiVar2.b(zzevVar2, j11))) {
                            continue;
                            break;
                        }
                    }
                case 2:
                    if (i(zzevVar, zzevVar2, i11) && zzhj.b(zzevVar, j11) == zzhj.b(zzevVar2, j11)) {
                        continue;
                        break;
                    }
                    break;
                case 3:
                    if (i(zzevVar, zzevVar2, i11) && zzhj.b(zzevVar, j11) == zzhj.b(zzevVar2, j11)) {
                        continue;
                        break;
                    }
                    break;
                case 4:
                    if (i(zzevVar, zzevVar2, i11) && zzhj.a(zzevVar, j11) == zzhj.a(zzevVar2, j11)) {
                        continue;
                        break;
                    }
                    break;
                case 5:
                    if (i(zzevVar, zzevVar2, i11) && zzhj.b(zzevVar, j11) == zzhj.b(zzevVar2, j11)) {
                        continue;
                        break;
                    }
                    break;
                case 6:
                    if (i(zzevVar, zzevVar2, i11) && zzhj.a(zzevVar, j11) == zzhj.a(zzevVar2, j11)) {
                        continue;
                        break;
                    }
                    break;
                case 7:
                    if (i(zzevVar, zzevVar2, i11)) {
                        zzhi zzhiVar3 = zzhj.f9572c;
                        if (zzhiVar3.f(j11, zzevVar) == zzhiVar3.f(j11, zzevVar2)) {
                            continue;
                            break;
                        }
                    }
                case 8:
                    if (i(zzevVar, zzevVar2, i11) && zzgk.a(zzhj.d(zzevVar, j11), zzhj.d(zzevVar2, j11))) {
                        continue;
                        break;
                    }
                    break;
                case 9:
                    if (i(zzevVar, zzevVar2, i11) && zzgk.a(zzhj.d(zzevVar, j11), zzhj.d(zzevVar2, j11))) {
                        continue;
                        break;
                    }
                    break;
                case 10:
                    if (i(zzevVar, zzevVar2, i11) && zzgk.a(zzhj.d(zzevVar, j11), zzhj.d(zzevVar2, j11))) {
                        continue;
                        break;
                    }
                    break;
                case 11:
                    if (i(zzevVar, zzevVar2, i11) && zzhj.a(zzevVar, j11) == zzhj.a(zzevVar2, j11)) {
                        continue;
                        break;
                    }
                    break;
                case 12:
                    if (i(zzevVar, zzevVar2, i11) && zzhj.a(zzevVar, j11) == zzhj.a(zzevVar2, j11)) {
                        continue;
                        break;
                    }
                    break;
                case 13:
                    if (i(zzevVar, zzevVar2, i11) && zzhj.a(zzevVar, j11) == zzhj.a(zzevVar2, j11)) {
                        continue;
                        break;
                    }
                    break;
                case 14:
                    if (i(zzevVar, zzevVar2, i11) && zzhj.b(zzevVar, j11) == zzhj.b(zzevVar2, j11)) {
                        continue;
                        break;
                    }
                    break;
                case 15:
                    if (i(zzevVar, zzevVar2, i11) && zzhj.a(zzevVar, j11) == zzhj.a(zzevVar2, j11)) {
                        continue;
                        break;
                    }
                    break;
                case 16:
                    if (i(zzevVar, zzevVar2, i11) && zzhj.b(zzevVar, j11) == zzhj.b(zzevVar2, j11)) {
                        continue;
                        break;
                    }
                    break;
                case 17:
                    if (i(zzevVar, zzevVar2, i11) && zzgk.a(zzhj.d(zzevVar, j11), zzhj.d(zzevVar2, j11))) {
                        continue;
                        break;
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
                    zA = zzgk.a(zzhj.d(zzevVar, j11), zzhj.d(zzevVar2, j11));
                    break;
                case 50:
                    zA = zzgk.a(zzhj.d(zzevVar, j11), zzhj.d(zzevVar2, j11));
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
                    if (zzhj.a(zzevVar, j12) == zzhj.a(zzevVar2, j12) && zzgk.a(zzhj.d(zzevVar, j11), zzhj.d(zzevVar2, j11))) {
                        continue;
                        break;
                    }
                    break;
                default:
                    continue;
                    break;
            }
            if (zA) {
            }
        }
        zzgz zzgzVar = this.f9527j;
        return zzgzVar.b(zzevVar).equals(zzgzVar.b(zzevVar2));
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00e8 A[PHI: r3
      0x00e8: PHI (r3v32 int) = (r3v10 int), (r3v33 int) binds: [B:85:0x0207, B:43:0x00e6] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.auth.zzgi
    public final int c(zzev zzevVar) {
        int i11;
        long jDoubleToLongBits;
        int i12;
        int iFloatToIntBits;
        int iA;
        int i13;
        int[] iArr = this.f9518a;
        int length = iArr.length;
        int i14 = 0;
        for (int i15 = 0; i15 < length; i15 += 3) {
            int iR = r(i15);
            int i16 = iArr[i15];
            long j11 = 1048575 & iR;
            int i17 = 1237;
            int iHashCode = 37;
            switch (q(iR)) {
                case 0:
                    i11 = i14 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(zzhj.f9572c.a(zzevVar, j11));
                    Charset charset = zzfa.f9501a;
                    iA = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i14 = i11 + iA;
                    break;
                case 1:
                    i12 = i14 * 53;
                    iFloatToIntBits = Float.floatToIntBits(zzhj.f9572c.b(zzevVar, j11));
                    i14 = iFloatToIntBits + i12;
                    break;
                case 2:
                    i11 = i14 * 53;
                    jDoubleToLongBits = zzhj.b(zzevVar, j11);
                    Charset charset2 = zzfa.f9501a;
                    iA = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i14 = i11 + iA;
                    break;
                case 3:
                    i11 = i14 * 53;
                    jDoubleToLongBits = zzhj.b(zzevVar, j11);
                    Charset charset3 = zzfa.f9501a;
                    iA = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i14 = i11 + iA;
                    break;
                case 4:
                    i11 = i14 * 53;
                    iA = zzhj.a(zzevVar, j11);
                    i14 = i11 + iA;
                    break;
                case 5:
                    i11 = i14 * 53;
                    jDoubleToLongBits = zzhj.b(zzevVar, j11);
                    Charset charset4 = zzfa.f9501a;
                    iA = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i14 = i11 + iA;
                    break;
                case 6:
                    i11 = i14 * 53;
                    iA = zzhj.a(zzevVar, j11);
                    i14 = i11 + iA;
                    break;
                case 7:
                    i13 = i14 * 53;
                    boolean zF = zzhj.f9572c.f(j11, zzevVar);
                    Charset charset5 = zzfa.f9501a;
                    if (zF) {
                        i17 = 1231;
                    }
                    i14 = i17 + i13;
                    break;
                case 8:
                    i12 = i14 * 53;
                    iFloatToIntBits = ((String) zzhj.d(zzevVar, j11)).hashCode();
                    i14 = iFloatToIntBits + i12;
                    break;
                case 9:
                    Object objD = zzhj.d(zzevVar, j11);
                    if (objD != null) {
                        iHashCode = objD.hashCode();
                    }
                    i14 = (i14 * 53) + iHashCode;
                    break;
                case 10:
                    i12 = i14 * 53;
                    iFloatToIntBits = zzhj.d(zzevVar, j11).hashCode();
                    i14 = iFloatToIntBits + i12;
                    break;
                case 11:
                    i11 = i14 * 53;
                    iA = zzhj.a(zzevVar, j11);
                    i14 = i11 + iA;
                    break;
                case 12:
                    i11 = i14 * 53;
                    iA = zzhj.a(zzevVar, j11);
                    i14 = i11 + iA;
                    break;
                case 13:
                    i11 = i14 * 53;
                    iA = zzhj.a(zzevVar, j11);
                    i14 = i11 + iA;
                    break;
                case 14:
                    i11 = i14 * 53;
                    jDoubleToLongBits = zzhj.b(zzevVar, j11);
                    Charset charset6 = zzfa.f9501a;
                    iA = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i14 = i11 + iA;
                    break;
                case 15:
                    i11 = i14 * 53;
                    iA = zzhj.a(zzevVar, j11);
                    i14 = i11 + iA;
                    break;
                case 16:
                    i11 = i14 * 53;
                    jDoubleToLongBits = zzhj.b(zzevVar, j11);
                    Charset charset7 = zzfa.f9501a;
                    iA = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i14 = i11 + iA;
                    break;
                case 17:
                    Object objD2 = zzhj.d(zzevVar, j11);
                    if (objD2 != null) {
                        iHashCode = objD2.hashCode();
                    }
                    i14 = (i14 * 53) + iHashCode;
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
                    i12 = i14 * 53;
                    iFloatToIntBits = zzhj.d(zzevVar, j11).hashCode();
                    i14 = iFloatToIntBits + i12;
                    break;
                case 50:
                    i12 = i14 * 53;
                    iFloatToIntBits = zzhj.d(zzevVar, j11).hashCode();
                    i14 = iFloatToIntBits + i12;
                    break;
                case 51:
                    if (l(i16, i15, zzevVar)) {
                        i11 = i14 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(((Double) zzhj.d(zzevVar, j11)).doubleValue());
                        Charset charset8 = zzfa.f9501a;
                        iA = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i14 = i11 + iA;
                    }
                    break;
                case 52:
                    if (l(i16, i15, zzevVar)) {
                        i12 = i14 * 53;
                        iFloatToIntBits = Float.floatToIntBits(((Float) zzhj.d(zzevVar, j11)).floatValue());
                        i14 = iFloatToIntBits + i12;
                    }
                    break;
                case 53:
                    if (l(i16, i15, zzevVar)) {
                        i11 = i14 * 53;
                        jDoubleToLongBits = ((Long) zzhj.d(zzevVar, j11)).longValue();
                        Charset charset9 = zzfa.f9501a;
                        iA = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i14 = i11 + iA;
                    }
                    break;
                case 54:
                    if (l(i16, i15, zzevVar)) {
                        i11 = i14 * 53;
                        jDoubleToLongBits = ((Long) zzhj.d(zzevVar, j11)).longValue();
                        Charset charset10 = zzfa.f9501a;
                        iA = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i14 = i11 + iA;
                    }
                    break;
                case 55:
                    if (l(i16, i15, zzevVar)) {
                        i11 = i14 * 53;
                        iA = o(zzevVar, j11);
                        i14 = i11 + iA;
                    }
                    break;
                case 56:
                    if (l(i16, i15, zzevVar)) {
                        i11 = i14 * 53;
                        jDoubleToLongBits = ((Long) zzhj.d(zzevVar, j11)).longValue();
                        Charset charset11 = zzfa.f9501a;
                        iA = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i14 = i11 + iA;
                    }
                    break;
                case 57:
                    if (l(i16, i15, zzevVar)) {
                        i11 = i14 * 53;
                        iA = o(zzevVar, j11);
                        i14 = i11 + iA;
                    }
                    break;
                case 58:
                    if (l(i16, i15, zzevVar)) {
                        i13 = i14 * 53;
                        boolean zBooleanValue = ((Boolean) zzhj.d(zzevVar, j11)).booleanValue();
                        Charset charset12 = zzfa.f9501a;
                        if (zBooleanValue) {
                            i17 = 1231;
                        }
                        i14 = i17 + i13;
                    }
                    break;
                case 59:
                    if (l(i16, i15, zzevVar)) {
                        i12 = i14 * 53;
                        iFloatToIntBits = ((String) zzhj.d(zzevVar, j11)).hashCode();
                        i14 = iFloatToIntBits + i12;
                    }
                    break;
                case 60:
                    if (l(i16, i15, zzevVar)) {
                        i12 = i14 * 53;
                        iFloatToIntBits = zzhj.d(zzevVar, j11).hashCode();
                        i14 = iFloatToIntBits + i12;
                    }
                    break;
                case 61:
                    if (l(i16, i15, zzevVar)) {
                        i12 = i14 * 53;
                        iFloatToIntBits = zzhj.d(zzevVar, j11).hashCode();
                        i14 = iFloatToIntBits + i12;
                    }
                    break;
                case 62:
                    if (l(i16, i15, zzevVar)) {
                        i11 = i14 * 53;
                        iA = o(zzevVar, j11);
                        i14 = i11 + iA;
                    }
                    break;
                case 63:
                    if (l(i16, i15, zzevVar)) {
                        i11 = i14 * 53;
                        iA = o(zzevVar, j11);
                        i14 = i11 + iA;
                    }
                    break;
                case 64:
                    if (l(i16, i15, zzevVar)) {
                        i11 = i14 * 53;
                        iA = o(zzevVar, j11);
                        i14 = i11 + iA;
                    }
                    break;
                case 65:
                    if (l(i16, i15, zzevVar)) {
                        i11 = i14 * 53;
                        jDoubleToLongBits = ((Long) zzhj.d(zzevVar, j11)).longValue();
                        Charset charset13 = zzfa.f9501a;
                        iA = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i14 = i11 + iA;
                    }
                    break;
                case 66:
                    if (l(i16, i15, zzevVar)) {
                        i11 = i14 * 53;
                        iA = o(zzevVar, j11);
                        i14 = i11 + iA;
                    }
                    break;
                case 67:
                    if (l(i16, i15, zzevVar)) {
                        i11 = i14 * 53;
                        jDoubleToLongBits = ((Long) zzhj.d(zzevVar, j11)).longValue();
                        Charset charset14 = zzfa.f9501a;
                        iA = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i14 = i11 + iA;
                    }
                    break;
                case 68:
                    if (l(i16, i15, zzevVar)) {
                        i12 = i14 * 53;
                        iFloatToIntBits = zzhj.d(zzevVar, j11).hashCode();
                        i14 = iFloatToIntBits + i12;
                    }
                    break;
            }
        }
        return this.f9527j.b(zzevVar).hashCode() + (i14 * 53);
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final void d(Object obj, byte[] bArr, int i11, int i12, zzdt zzdtVar) {
        m(obj, bArr, i11, i12, 0, zzdtVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    @Override // com.google.android.gms.internal.auth.zzgi
    public final void e(Object obj, Object obj2) {
        Object obj3;
        if (!k(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
        obj2.getClass();
        int i11 = 0;
        while (true) {
            int[] iArr = this.f9518a;
            if (i11 >= iArr.length) {
                Object obj4 = obj;
                Class cls = zzgk.f9541a;
                zzgz zzgzVar = this.f9527j;
                zzgzVar.f(obj4, zzgzVar.c(zzgzVar.b(obj4), zzgzVar.b(obj2)));
                return;
            }
            int iR = r(i11);
            int i12 = iArr[i11];
            long j11 = iR & 1048575;
            switch (q(iR)) {
                case 0:
                    if (!j(i11, obj2)) {
                        obj3 = obj;
                    } else {
                        zzhi zzhiVar = zzhj.f9572c;
                        obj3 = obj;
                        zzhiVar.d(obj3, j11, zzhiVar.a(obj2, j11));
                        z(i11, obj3);
                    }
                    break;
                case 1:
                    if (j(i11, obj2)) {
                        zzhi zzhiVar2 = zzhj.f9572c;
                        zzhiVar2.e(obj, j11, zzhiVar2.b(obj2, j11));
                        z(i11, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (j(i11, obj2)) {
                        zzhj.i(obj, j11, zzhj.b(obj2, j11));
                        z(i11, obj);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (j(i11, obj2)) {
                        zzhj.i(obj, j11, zzhj.b(obj2, j11));
                        z(i11, obj);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (j(i11, obj2)) {
                        zzhj.h(j11, obj, zzhj.a(obj2, j11));
                        z(i11, obj);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (j(i11, obj2)) {
                        zzhj.i(obj, j11, zzhj.b(obj2, j11));
                        z(i11, obj);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (j(i11, obj2)) {
                        zzhj.h(j11, obj, zzhj.a(obj2, j11));
                        z(i11, obj);
                    }
                    obj3 = obj;
                    break;
                case 7:
                    if (j(i11, obj2)) {
                        zzhi zzhiVar3 = zzhj.f9572c;
                        zzhiVar3.c(obj, j11, zzhiVar3.f(j11, obj2));
                        z(i11, obj);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (j(i11, obj2)) {
                        zzhj.j(obj, j11, zzhj.d(obj2, j11));
                        z(i11, obj);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    x(i11, obj, obj2);
                    obj3 = obj;
                    break;
                case 10:
                    if (j(i11, obj2)) {
                        zzhj.j(obj, j11, zzhj.d(obj2, j11));
                        z(i11, obj);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (j(i11, obj2)) {
                        zzhj.h(j11, obj, zzhj.a(obj2, j11));
                        z(i11, obj);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (j(i11, obj2)) {
                        zzhj.h(j11, obj, zzhj.a(obj2, j11));
                        z(i11, obj);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (j(i11, obj2)) {
                        zzhj.h(j11, obj, zzhj.a(obj2, j11));
                        z(i11, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (j(i11, obj2)) {
                        zzhj.i(obj, j11, zzhj.b(obj2, j11));
                        z(i11, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (j(i11, obj2)) {
                        zzhj.h(j11, obj, zzhj.a(obj2, j11));
                        z(i11, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (j(i11, obj2)) {
                        zzhj.i(obj, j11, zzhj.b(obj2, j11));
                        z(i11, obj);
                    }
                    obj3 = obj;
                    break;
                case 17:
                    x(i11, obj, obj2);
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
                    this.f9526i.b(obj, j11, obj2);
                    obj3 = obj;
                    break;
                case 50:
                    Class cls2 = zzgk.f9541a;
                    zzhj.j(obj, j11, zzfs.a(zzhj.d(obj, j11), zzhj.d(obj2, j11)));
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
                    if (l(i12, i11, obj2)) {
                        zzhj.j(obj, j11, zzhj.d(obj2, j11));
                        zzhj.h(iArr[i11 + 2] & 1048575, obj, i12);
                    }
                    obj3 = obj;
                    break;
                case 60:
                    y(i11, obj, obj2);
                    obj3 = obj;
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (l(i12, i11, obj2)) {
                        zzhj.j(obj, j11, zzhj.d(obj2, j11));
                        zzhj.h(iArr[i11 + 2] & 1048575, obj, i12);
                    }
                    obj3 = obj;
                    break;
                case 68:
                    y(i11, obj, obj2);
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

    /* JADX WARN: Code duplicated, block: B:19:0x0043  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:55:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:58:0x00cc  */
    @Override // com.google.android.gms.internal.auth.zzgi
    public final boolean f(Object obj) {
        int iQ;
        int i11 = 0;
        int i12 = 0;
        int i13 = 1048575;
        while (true) {
            boolean zJ = true;
            if (i11 >= this.f9524g) {
                return true;
            }
            int i14 = this.f9523f[i11];
            int[] iArr = this.f9518a;
            int i15 = iArr[i14];
            int iR = r(i14);
            int i16 = iArr[i14 + 2];
            int i17 = i16 & 1048575;
            int i18 = 1 << (i16 >>> 20);
            if (i17 != i13) {
                if (i17 != 1048575) {
                    i12 = f9517l.getInt(obj, i17);
                }
                i13 = i17;
            }
            if ((268435456 & iR) == 0) {
                iQ = q(iR);
                if (iQ != 9 || iQ == 17) {
                    if (i13 == 1048575) {
                        zJ = j(i14, obj);
                    } else if ((i18 & i12) == 0) {
                        zJ = false;
                    }
                    if (!zJ || t(i14).f(zzhj.d(obj, iR & 1048575))) {
                        i11++;
                    }
                } else {
                    if (iQ != 27) {
                        if (iQ == 60 || iQ == 68) {
                            if (!l(i15, i14, obj) || t(i14).f(zzhj.d(obj, iR & 1048575))) {
                            }
                        } else if (iQ != 49) {
                            if (iQ == 50 && !((zzfr) zzhj.d(obj, iR & 1048575)).isEmpty()) {
                                int i19 = i14 / 3;
                                throw null;
                            }
                        }
                        i11++;
                    }
                    List list = (List) zzhj.d(obj, iR & 1048575);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        zzgi zzgiVarT = t(i14);
                        for (int i21 = 0; i21 < list.size(); i21++) {
                            if (zzgiVarT.f(list.get(i21))) {
                            }
                        }
                    }
                    i11++;
                }
            } else {
                if (i13 == 1048575 ? j(i14, obj) : (i12 & i18) != 0) {
                    iQ = q(iR);
                    if (iQ != 9) {
                    }
                    if (i13 == 1048575) {
                        zJ = j(i14, obj);
                    } else if ((i18 & i12) == 0) {
                        zJ = false;
                    }
                    if (!zJ) {
                        continue;
                    }
                    i11++;
                }
            }
            return false;
        }
    }

    public final void g(int i11, Object obj, Object obj2) {
        f9517l.putObject(obj, r(i11) & 1048575, obj2);
        z(i11, obj);
    }

    public final void h(Object obj, int i11, int i12, Object obj2) {
        f9517l.putObject(obj, r(i12) & 1048575, obj2);
        zzhj.h(this.f9518a[i12 + 2] & 1048575, obj, i11);
    }

    public final boolean i(zzev zzevVar, zzev zzevVar2, int i11) {
        return j(i11, zzevVar) == j(i11, zzevVar2);
    }

    public final boolean j(int i11, Object obj) {
        int i12 = this.f9518a[i11 + 2];
        long j11 = i12 & 1048575;
        if (j11 == 1048575) {
            int iR = r(i11);
            long j12 = iR & 1048575;
            switch (q(iR)) {
                case 0:
                    if (Double.doubleToRawLongBits(zzhj.f9572c.a(obj, j12)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(zzhj.f9572c.b(obj, j12)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (zzhj.b(obj, j12) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (zzhj.b(obj, j12) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (zzhj.a(obj, j12) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (zzhj.b(obj, j12) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (zzhj.a(obj, j12) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return zzhj.f9572c.f(j12, obj);
                case 8:
                    Object objD = zzhj.d(obj, j12);
                    if (objD instanceof String) {
                        if (((String) objD).isEmpty()) {
                            return false;
                        }
                    } else {
                        if (!(objD instanceof zzef)) {
                            throw new IllegalArgumentException();
                        }
                        if (zzef.f9482b.equals(objD)) {
                            return false;
                        }
                    }
                case 9:
                    if (zzhj.d(obj, j12) == null) {
                        return false;
                    }
                    break;
                case 10:
                    if (zzef.f9482b.equals(zzhj.d(obj, j12))) {
                        return false;
                    }
                    break;
                case 11:
                    if (zzhj.a(obj, j12) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (zzhj.a(obj, j12) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (zzhj.a(obj, j12) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (zzhj.b(obj, j12) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (zzhj.a(obj, j12) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (zzhj.b(obj, j12) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (zzhj.d(obj, j12) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i12 >>> 20)) & zzhj.a(obj, j11)) == 0) {
            return false;
        }
        return true;
    }

    public final boolean l(int i11, int i12, Object obj) {
        return zzhj.a(obj, (long) (this.f9518a[i12 + 2] & 1048575)) == i11;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:114:0x02da  */
    /* JADX WARN: Code duplicated, block: B:116:0x02de  */
    /* JADX WARN: Code duplicated, block: B:118:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:120:0x02f8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:121:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:122:0x02fb A[PHI: r8
      0x02fb: PHI (r8v19 byte) = (r8v14 byte), (r8v22 byte) binds: [B:119:0x02f6, B:121:0x02fa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:124:0x02ff A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:125:0x0301  */
    /* JADX WARN: Code duplicated, block: B:126:0x0302 A[PHI: r8
      0x0302: PHI (r8v20 byte) = (r8v19 byte), (r8v21 byte) binds: [B:123:0x02fd, B:125:0x0301] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:128:0x0308  */
    /* JADX WARN: Code duplicated, block: B:134:0x0329  */
    /* JADX WARN: Code duplicated, block: B:136:0x032f  */
    /* JADX WARN: Code duplicated, block: B:138:0x0341  */
    /* JADX WARN: Code duplicated, block: B:506:0x0bd9 A[PHI: r1 r2 r5 r8 r9 r15 r20 r22 r29
      0x0bd9: PHI (r1v221 int) = (r1v123 int), (r1v126 int), (r1v128 int), (r1v157 int), (r1v209 int), (r1v226 int) binds: [B:500:0x0baf, B:483:0x0b4a, B:467:0x0aef, B:386:0x0950, B:256:0x06b7, B:235:0x0633] A[DONT_GENERATE, DONT_INLINE]
      0x0bd9: PHI (r2v207 byte[]) = (r2v122 byte[]), (r2v124 byte[]), (r2v125 byte[]), (r2v152 byte[]), (r2v199 byte[]), (r2v211 byte[]) binds: [B:500:0x0baf, B:483:0x0b4a, B:467:0x0aef, B:386:0x0950, B:256:0x06b7, B:235:0x0633] A[DONT_GENERATE, DONT_INLINE]
      0x0bd9: PHI (r5v186 int) = (r5v129 int), (r5v131 int), (r5v132 int), (r5v152 int), (r5v179 int), (r5v191 int) binds: [B:500:0x0baf, B:483:0x0b4a, B:467:0x0aef, B:386:0x0950, B:256:0x06b7, B:235:0x0633] A[DONT_GENERATE, DONT_INLINE]
      0x0bd9: PHI (r8v60 int) = (r8v35 int), (r8v37 int), (r8v38 int), (r8v44 int), (r8v54 int), (r8v64 int) binds: [B:500:0x0baf, B:483:0x0b4a, B:467:0x0aef, B:386:0x0950, B:256:0x06b7, B:235:0x0633] A[DONT_GENERATE, DONT_INLINE]
      0x0bd9: PHI (r9v106 com.google.android.gms.internal.auth.zzdt) = 
      (r9v82 com.google.android.gms.internal.auth.zzdt)
      (r9v84 com.google.android.gms.internal.auth.zzdt)
      (r9v85 com.google.android.gms.internal.auth.zzdt)
      (r9v91 com.google.android.gms.internal.auth.zzdt)
      (r9v101 com.google.android.gms.internal.auth.zzdt)
      (r9v111 com.google.android.gms.internal.auth.zzdt)
     binds: [B:500:0x0baf, B:483:0x0b4a, B:467:0x0aef, B:386:0x0950, B:256:0x06b7, B:235:0x0633] A[DONT_GENERATE, DONT_INLINE]
      0x0bd9: PHI (r15v59 int) = (r15v31 int), (r15v33 int), (r15v34 int), (r15v42 int), (r15v54 int), (r15v62 int) binds: [B:500:0x0baf, B:483:0x0b4a, B:467:0x0aef, B:386:0x0950, B:256:0x06b7, B:235:0x0633] A[DONT_GENERATE, DONT_INLINE]
      0x0bd9: PHI (r20v65 com.google.android.gms.internal.auth.zzha) = 
      (r20v39 com.google.android.gms.internal.auth.zzha)
      (r20v41 com.google.android.gms.internal.auth.zzha)
      (r20v42 com.google.android.gms.internal.auth.zzha)
      (r20v48 com.google.android.gms.internal.auth.zzha)
      (r20v57 com.google.android.gms.internal.auth.zzha)
      (r20v68 com.google.android.gms.internal.auth.zzha)
     binds: [B:500:0x0baf, B:483:0x0b4a, B:467:0x0aef, B:386:0x0950, B:256:0x06b7, B:235:0x0633] A[DONT_GENERATE, DONT_INLINE]
      0x0bd9: PHI (r22v63 int) = (r22v30 int), (r22v32 int), (r22v33 int), (r22v39 int), (r22v58 int), (r22v66 int) binds: [B:500:0x0baf, B:483:0x0b4a, B:467:0x0aef, B:386:0x0950, B:256:0x06b7, B:235:0x0633] A[DONT_GENERATE, DONT_INLINE]
      0x0bd9: PHI (r29v33 int) = (r29v9 int), (r29v11 int), (r29v12 int), (r29v18 int), (r29v27 int), (r29v36 int) binds: [B:500:0x0baf, B:483:0x0b4a, B:467:0x0aef, B:386:0x0950, B:256:0x06b7, B:235:0x0633] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:601:0x0ee0 A[PHI: r1 r5 r9 r11 r14 r21 r23
      0x0ee0: PHI (r1v114 byte[]) = 
      (r1v82 byte[])
      (r1v83 byte[])
      (r1v85 byte[])
      (r1v87 byte[])
      (r1v88 byte[])
      (r1v89 byte[])
      (r1v92 byte[])
      (r1v94 byte[])
      (r1v95 byte[])
      (r1v103 byte[])
      (r1v109 byte[])
      (r1v116 byte[])
     binds: [B:599:0x0ec9, B:596:0x0ea4, B:593:0x0e82, B:590:0x0e62, B:587:0x0e41, B:584:0x0e1f, B:576:0x0df3, B:562:0x0db4, B:560:0x0d9f, B:535:0x0ccf, B:527:0x0c90, B:523:0x0c53] A[DONT_GENERATE, DONT_INLINE]
      0x0ee0: PHI (r5v121 com.google.android.gms.internal.auth.zzdt) = 
      (r5v88 com.google.android.gms.internal.auth.zzdt)
      (r5v89 com.google.android.gms.internal.auth.zzdt)
      (r5v90 com.google.android.gms.internal.auth.zzdt)
      (r5v91 com.google.android.gms.internal.auth.zzdt)
      (r5v92 com.google.android.gms.internal.auth.zzdt)
      (r5v93 com.google.android.gms.internal.auth.zzdt)
      (r5v95 com.google.android.gms.internal.auth.zzdt)
      (r5v96 com.google.android.gms.internal.auth.zzdt)
      (r5v98 com.google.android.gms.internal.auth.zzdt)
      (r5v109 com.google.android.gms.internal.auth.zzdt)
      (r5v115 com.google.android.gms.internal.auth.zzdt)
      (r5v122 com.google.android.gms.internal.auth.zzdt)
     binds: [B:599:0x0ec9, B:596:0x0ea4, B:593:0x0e82, B:590:0x0e62, B:587:0x0e41, B:584:0x0e1f, B:576:0x0df3, B:562:0x0db4, B:560:0x0d9f, B:535:0x0ccf, B:527:0x0c90, B:523:0x0c53] A[DONT_GENERATE, DONT_INLINE]
      0x0ee0: PHI (r9v80 java.lang.Object) = 
      (r9v56 java.lang.Object)
      (r9v57 java.lang.Object)
      (r9v58 java.lang.Object)
      (r9v59 java.lang.Object)
      (r9v60 java.lang.Object)
      (r9v61 java.lang.Object)
      (r9v63 java.lang.Object)
      (r9v64 java.lang.Object)
      (r9v65 java.lang.Object)
      (r9v71 java.lang.Object)
      (r9v76 java.lang.Object)
      (r9v81 java.lang.Object)
     binds: [B:599:0x0ec9, B:596:0x0ea4, B:593:0x0e82, B:590:0x0e62, B:587:0x0e41, B:584:0x0e1f, B:576:0x0df3, B:562:0x0db4, B:560:0x0d9f, B:535:0x0ccf, B:527:0x0c90, B:523:0x0c53] A[DONT_GENERATE, DONT_INLINE]
      0x0ee0: PHI (r11v25 int) = 
      (r11v6 int)
      (r11v7 int)
      (r11v8 int)
      (r11v9 int)
      (r11v10 int)
      (r11v11 int)
      (r11v13 int)
      (r11v14 int)
      (r11v15 int)
      (r11v18 int)
      (r11v21 int)
      (r11v26 int)
     binds: [B:599:0x0ec9, B:596:0x0ea4, B:593:0x0e82, B:590:0x0e62, B:587:0x0e41, B:584:0x0e1f, B:576:0x0df3, B:562:0x0db4, B:560:0x0d9f, B:535:0x0ccf, B:527:0x0c90, B:523:0x0c53] A[DONT_GENERATE, DONT_INLINE]
      0x0ee0: PHI (r14v83 int) = 
      (r14v50 int)
      (r14v51 int)
      (r14v52 int)
      (r14v53 int)
      (r14v54 int)
      (r14v55 int)
      (r14v57 int)
      (r14v58 int)
      (r14v59 int)
      (r14v71 int)
      (r14v79 int)
      (r14v84 int)
     binds: [B:599:0x0ec9, B:596:0x0ea4, B:593:0x0e82, B:590:0x0e62, B:587:0x0e41, B:584:0x0e1f, B:576:0x0df3, B:562:0x0db4, B:560:0x0d9f, B:535:0x0ccf, B:527:0x0c90, B:523:0x0c53] A[DONT_GENERATE, DONT_INLINE]
      0x0ee0: PHI (r21v62 int) = 
      (r21v34 int)
      (r21v35 int)
      (r21v36 int)
      (r21v37 int)
      (r21v38 int)
      (r21v39 int)
      (r21v41 int)
      (r21v42 int)
      (r21v43 int)
      (r11v3 int)
      (r21v59 int)
      (r21v63 int)
     binds: [B:599:0x0ec9, B:596:0x0ea4, B:593:0x0e82, B:590:0x0e62, B:587:0x0e41, B:584:0x0e1f, B:576:0x0df3, B:562:0x0db4, B:560:0x0d9f, B:535:0x0ccf, B:527:0x0c90, B:523:0x0c53] A[DONT_GENERATE, DONT_INLINE]
      0x0ee0: PHI (r23v39 sun.misc.Unsafe) = 
      (r23v15 sun.misc.Unsafe)
      (r23v16 sun.misc.Unsafe)
      (r23v17 sun.misc.Unsafe)
      (r23v18 sun.misc.Unsafe)
      (r23v19 sun.misc.Unsafe)
      (r23v20 sun.misc.Unsafe)
      (r23v22 sun.misc.Unsafe)
      (r23v23 sun.misc.Unsafe)
      (r23v24 sun.misc.Unsafe)
      (r23v30 sun.misc.Unsafe)
      (r23v36 sun.misc.Unsafe)
      (r23v40 sun.misc.Unsafe)
     binds: [B:599:0x0ec9, B:596:0x0ea4, B:593:0x0e82, B:590:0x0e62, B:587:0x0e41, B:584:0x0e1f, B:576:0x0df3, B:562:0x0db4, B:560:0x0d9f, B:535:0x0ccf, B:527:0x0c90, B:523:0x0c53] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:604:0x0ef8  */
    /* JADX WARN: Code duplicated, block: B:650:0x02d1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:653:0x0324 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:654:0x031f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:655:0x031f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:656:0x031f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:657:0x031f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:658:0x0386 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:659:0x0381 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:692:0x0ee3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:704:0x0bdc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:729:0x0bef A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:801:0x02a3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:802:0x02d6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:803:0x028d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:804:0x02a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:809:0x0285 A[EDGE_INSN: B:809:0x0285->B:805:0x0285 BREAK  A[LOOP:28: B:96:0x0294->B:99:0x029a], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x0287  */
    /* JADX WARN: Code duplicated, block: B:97:0x0296  */
    /* JADX WARN: Code duplicated, block: B:99:0x029a A[LOOP:28: B:96:0x0294->B:99:0x029a, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    public final int m(Object obj, byte[] bArr, int i11, int i12, int i13, zzdt zzdtVar) {
        Object[] objArr;
        Unsafe unsafe;
        int[] iArr;
        int iF;
        zzha zzhaVar;
        int i14;
        int i15;
        byte[] bArr2;
        Object obj2;
        int i16;
        zzdt zzdtVar2;
        int i17;
        int i18;
        int i19;
        byte[] bArr3;
        zzdt zzdtVar3;
        Object obj3;
        int i21;
        Unsafe unsafe2;
        zzdt zzdtVar4;
        Object obj4;
        int i22;
        byte[] bArr4;
        int i23;
        byte b3;
        byte b11;
        int i24;
        int i25;
        byte b12;
        byte b13;
        int i26;
        byte b14;
        int i27;
        Unsafe unsafe3;
        byte[] bArr5;
        int i28;
        int i29;
        Object obj5;
        zzdt zzdtVar5;
        Unsafe unsafe4;
        int i30;
        int i31;
        int i32;
        int iF2;
        zzdt zzdtVar6;
        int i33;
        int i34;
        zzha zzhaVar2;
        byte[] bArr6;
        int i35;
        int i36;
        zzdt zzdtVar7;
        int i37;
        byte[] bArr7;
        int i38;
        int i39;
        int i40;
        int iF3;
        int i41;
        byte[] bArr8;
        int i42;
        zzdt zzdtVar8;
        int i43;
        int i44;
        zzez zzezVar;
        int i45;
        int iF4;
        int i46;
        int i47;
        zzha zzhaVar3;
        int i48;
        byte[] bArr9;
        int i49;
        int i50;
        int iF5;
        byte[] bArr10;
        zzga<T> zzgaVar = this;
        Object obj6 = obj;
        byte[] bArr11 = bArr;
        i12 = i12;
        zzdt zzdtVar9 = zzdtVar;
        if (!k(obj6)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj6)));
        }
        Unsafe unsafe5 = f9517l;
        int iE = i11;
        int i51 = -1;
        int iP = 0;
        int i52 = 1048575;
        int i53 = 0;
        int i54 = 0;
        while (true) {
            int i55 = 1048575;
            while (true) {
                objArr = zzgaVar.f9519b;
                int[] iArr2 = zzgaVar.f9518a;
                if (iE < i12) {
                    int iG = iE + 1;
                    int i56 = bArr11[iE];
                    if (i56 < 0) {
                        iG = zzdu.g(i56, bArr11, iG, zzdtVar9);
                        i56 = zzdtVar9.f9472a;
                    }
                    int i57 = iG;
                    i54 = i56;
                    int i58 = (i54 == true ? 1 : 0) >>> 3;
                    int i59 = zzgaVar.f9521d;
                    int i60 = zzgaVar.f9520c;
                    iP = i58 > i51 ? (i58 < i60 || i58 > i59) ? -1 : zzgaVar.p(i58, iP / 3) : (i58 < i60 || i58 > i59) ? -1 : zzgaVar.p(i58, 0);
                    zzha zzhaVar4 = zzha.f9561e;
                    if (iP == -1) {
                        unsafe = unsafe5;
                        iF = i57;
                        zzhaVar = zzhaVar4;
                        i14 = i52;
                        iArr = iArr2;
                        objArr = objArr;
                        i53 = i53;
                        i15 = i54 == true ? 1 : 0;
                        iP = 0;
                        bArr2 = bArr;
                        obj2 = obj6;
                        i16 = i58;
                        zzdtVar2 = zzdtVar;
                    } else {
                        boolean z11 = (i54 == true ? 1 : 0) & 7;
                        int i61 = iArr2[iP + 1];
                        int iQ = q(i61);
                        long j11 = i61 & i55;
                        iArr = iArr2;
                        if (iQ <= 17) {
                            int i62 = iArr[iP + 2];
                            int i63 = 1 << (i62 >>> 20);
                            int i64 = i62 & i55;
                            if (i64 != i52) {
                                int i65 = i55;
                                if (i52 != i65) {
                                    unsafe5.putInt(obj6, i52, i53);
                                    i65 = 1048575;
                                }
                                int i66 = i64 == i65 ? 0 : unsafe5.getInt(obj6, i64);
                                i17 = i64;
                                i53 = i66;
                            } else {
                                i17 = i52;
                            }
                            switch (iQ) {
                                case 0:
                                    zzdtVar3 = zzdtVar;
                                    i18 = i17;
                                    i21 = i57;
                                    bArr3 = bArr;
                                    i53 = i53;
                                    i19 = i58;
                                    unsafe2 = unsafe5;
                                    if (z11 == 1) {
                                        zzhj.f9572c.d(obj6, j11, Double.longBitsToDouble(zzdu.l(bArr3, i21)));
                                        iE = i21 + 8;
                                        obj6 = obj6;
                                        unsafe5 = unsafe2;
                                        i53 |= i63;
                                        bArr11 = bArr3;
                                        zzdtVar9 = zzdtVar3;
                                        i52 = i18;
                                        i51 = i19;
                                    }
                                    obj3 = obj6;
                                    iF = i21;
                                    zzdtVar2 = zzdtVar3;
                                    unsafe = unsafe2;
                                    i15 = i54 == true ? 1 : 0;
                                    i14 = i18;
                                    obj2 = obj3;
                                    zzhaVar = zzhaVar4;
                                    bArr2 = bArr3;
                                    i16 = i19;
                                    break;
                                case 1:
                                    zzdtVar3 = zzdtVar;
                                    i18 = i17;
                                    i21 = i57;
                                    bArr3 = bArr;
                                    i53 = i53;
                                    i19 = i58;
                                    unsafe2 = unsafe5;
                                    if (z11 == 5) {
                                        zzhj.f9572c.e(obj6, j11, Float.intBitsToFloat(zzdu.b(bArr3, i21)));
                                        iE = i21 + 4;
                                        i53 |= i63;
                                        unsafe5 = unsafe2;
                                        bArr11 = bArr3;
                                        zzdtVar9 = zzdtVar3;
                                        i52 = i18;
                                        i51 = i19;
                                    }
                                    obj3 = obj6;
                                    iF = i21;
                                    zzdtVar2 = zzdtVar3;
                                    unsafe = unsafe2;
                                    i15 = i54 == true ? 1 : 0;
                                    i14 = i18;
                                    obj2 = obj3;
                                    zzhaVar = zzhaVar4;
                                    bArr2 = bArr3;
                                    i16 = i19;
                                    break;
                                case 2:
                                case 3:
                                    zzdtVar3 = zzdtVar;
                                    i18 = i17;
                                    i21 = i57;
                                    bArr3 = bArr;
                                    i53 = i53;
                                    i19 = i58;
                                    if (z11 == 0) {
                                        int i67 = zzdu.i(bArr3, i21, zzdtVar3);
                                        unsafe5.putLong(obj6, j11, zzdtVar3.f9473b);
                                        i53 |= i63;
                                        unsafe5 = unsafe5;
                                        iE = i67;
                                        bArr11 = bArr3;
                                        zzdtVar9 = zzdtVar3;
                                        i52 = i18;
                                        i51 = i19;
                                    }
                                    unsafe2 = unsafe5;
                                    obj3 = obj6;
                                    iF = i21;
                                    zzdtVar2 = zzdtVar3;
                                    unsafe = unsafe2;
                                    i15 = i54 == true ? 1 : 0;
                                    i14 = i18;
                                    obj2 = obj3;
                                    zzhaVar = zzhaVar4;
                                    bArr2 = bArr3;
                                    i16 = i19;
                                    break;
                                case 4:
                                case 11:
                                    zzdtVar3 = zzdtVar;
                                    i18 = i17;
                                    i21 = i57;
                                    bArr3 = bArr;
                                    i53 = i53;
                                    i19 = i58;
                                    if (z11 == 0) {
                                        iE = zzdu.f(bArr3, i21, zzdtVar3);
                                        unsafe5.putInt(obj6, j11, zzdtVar3.f9472a);
                                        i53 |= i63;
                                        bArr11 = bArr3;
                                        zzdtVar9 = zzdtVar3;
                                        i52 = i18;
                                        i51 = i19;
                                    }
                                    unsafe2 = unsafe5;
                                    obj3 = obj6;
                                    iF = i21;
                                    zzdtVar2 = zzdtVar3;
                                    unsafe = unsafe2;
                                    i15 = i54 == true ? 1 : 0;
                                    i14 = i18;
                                    obj2 = obj3;
                                    zzhaVar = zzhaVar4;
                                    bArr2 = bArr3;
                                    i16 = i19;
                                    break;
                                case 5:
                                case 14:
                                    Object obj7 = obj6;
                                    i18 = i17;
                                    i53 = i53;
                                    i19 = i58;
                                    unsafe2 = unsafe5;
                                    if (z11 == 1) {
                                        zzdtVar3 = zzdtVar;
                                        obj6 = obj7;
                                        bArr3 = bArr;
                                        unsafe5 = unsafe2;
                                        unsafe5.putLong(obj6, j11, zzdu.l(bArr, i57));
                                        iE = i57 + 8;
                                        i53 |= i63;
                                        bArr11 = bArr3;
                                        zzdtVar9 = zzdtVar3;
                                        i52 = i18;
                                        i51 = i19;
                                    } else {
                                        i21 = i57;
                                        obj6 = obj7;
                                        bArr3 = bArr;
                                        zzdtVar3 = zzdtVar;
                                        obj3 = obj6;
                                        iF = i21;
                                        zzdtVar2 = zzdtVar3;
                                        unsafe = unsafe2;
                                        i15 = i54 == true ? 1 : 0;
                                        i14 = i18;
                                        obj2 = obj3;
                                        zzhaVar = zzhaVar4;
                                        bArr2 = bArr3;
                                        i16 = i19;
                                    }
                                    break;
                                case 6:
                                case 13:
                                    zzdtVar4 = zzdtVar;
                                    obj4 = obj6;
                                    i18 = i17;
                                    i22 = i57;
                                    i53 = i53;
                                    i19 = i58;
                                    unsafe2 = unsafe5;
                                    bArr4 = bArr;
                                    if (z11 == 5) {
                                        unsafe2.putInt(obj4, j11, zzdu.b(bArr4, i22));
                                        iE = i22 + 4;
                                        bArr11 = bArr4;
                                        zzdtVar9 = zzdtVar4;
                                        iP = iP;
                                        unsafe5 = unsafe2;
                                        i51 = i19;
                                        i55 = 1048575;
                                        i12 = i12;
                                        i53 |= i63;
                                        obj6 = obj4;
                                        i52 = i18;
                                    } else {
                                        bArr3 = bArr4;
                                        zzdtVar3 = zzdtVar4;
                                        obj3 = obj4;
                                        i21 = i22;
                                        iF = i21;
                                        zzdtVar2 = zzdtVar3;
                                        unsafe = unsafe2;
                                        i15 = i54 == true ? 1 : 0;
                                        i14 = i18;
                                        obj2 = obj3;
                                        zzhaVar = zzhaVar4;
                                        bArr2 = bArr3;
                                        i16 = i19;
                                    }
                                    break;
                                case 7:
                                    zzdtVar4 = zzdtVar;
                                    obj4 = obj6;
                                    i18 = i17;
                                    i22 = i57;
                                    i53 = i53;
                                    i19 = i58;
                                    unsafe2 = unsafe5;
                                    bArr4 = bArr;
                                    if (z11 == 0) {
                                        iE = zzdu.i(bArr4, i22, zzdtVar4);
                                        zzhj.f9572c.c(obj4, j11, zzdtVar4.f9473b != 0);
                                        bArr11 = bArr4;
                                        zzdtVar9 = zzdtVar4;
                                        iP = iP;
                                        unsafe5 = unsafe2;
                                        i51 = i19;
                                        i55 = 1048575;
                                        i12 = i12;
                                        i53 |= i63;
                                        obj6 = obj4;
                                        i52 = i18;
                                    } else {
                                        bArr3 = bArr4;
                                        zzdtVar3 = zzdtVar4;
                                        obj3 = obj4;
                                        i21 = i22;
                                        iF = i21;
                                        zzdtVar2 = zzdtVar3;
                                        unsafe = unsafe2;
                                        i15 = i54 == true ? 1 : 0;
                                        i14 = i18;
                                        obj2 = obj3;
                                        zzhaVar = zzhaVar4;
                                        bArr2 = bArr3;
                                        i16 = i19;
                                    }
                                    break;
                                case 8:
                                    zzdtVar4 = zzdtVar;
                                    obj4 = obj6;
                                    i18 = i17;
                                    i22 = i57;
                                    i53 = i53;
                                    i19 = i58;
                                    unsafe2 = unsafe5;
                                    bArr4 = bArr;
                                    if (z11 == 2) {
                                        if ((i61 & 536870912) != 0) {
                                            int iF6 = zzdu.f(bArr4, i22, zzdtVar4);
                                            int i68 = zzdtVar4.f9472a;
                                            if (i68 < 0) {
                                                throw zzfb.b();
                                            }
                                            if (i68 == 0) {
                                                zzdtVar4.f9474c = BuildConfig.VERSION_NAME;
                                                iE = iF6;
                                            } else {
                                                zzhm zzhmVar = zzhn.f9576a;
                                                int length = bArr4.length;
                                                if ((((length - iF6) - i68) | iF6 | i68) < 0) {
                                                    throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(iF6), Integer.valueOf(i68)));
                                                }
                                                iE = iF6 + i68;
                                                char[] cArr = new char[i68];
                                                int i69 = 0;
                                                while (iF6 < iE) {
                                                    byte b15 = bArr4[iF6];
                                                    if (b15 >= 0) {
                                                        iF6++;
                                                        cArr[i69] = (char) b15;
                                                        i69++;
                                                    } else {
                                                        while (iF6 < iE) {
                                                            i23 = iF6 + 1;
                                                            b3 = bArr4[iF6];
                                                            if (b3 >= 0) {
                                                                cArr[i69] = (char) b3;
                                                                i69++;
                                                                iF6 = i23;
                                                                while (iF6 < iE) {
                                                                    b11 = bArr4[iF6];
                                                                    if (b11 >= 0) {
                                                                    }
                                                                    iF6++;
                                                                    cArr[i69] = (char) b11;
                                                                    i69++;
                                                                    break;
                                                                }
                                                            } else {
                                                                i24 = iF6;
                                                                if (b3 >= -32) {
                                                                    if (b3 < -16) {
                                                                        i25 = iE;
                                                                        if (i23 < i25 - 2) {
                                                                            throw zzfb.a();
                                                                        }
                                                                        b12 = bArr4[i23];
                                                                        int i70 = i24 + 3;
                                                                        byte b16 = bArr4[i24 + 2];
                                                                        int i71 = i24 + 4;
                                                                        byte b17 = bArr4[i70];
                                                                        if (!zzhk.a(b12)) {
                                                                            if ((((b12 + 112) + (b3 << 28)) >> 30) != 0 && !zzhk.a(b16) && !zzhk.a(b17)) {
                                                                                int i72 = ((b16 & 63) << 6) | ((b12 & 63) << 12) | ((b3 & 7) << 18) | (b17 & 63);
                                                                                cArr[i69] = (char) ((i72 >>> 10) + 55232);
                                                                                cArr[i69 + 1] = (char) ((i72 & 1023) + 56320);
                                                                                i69 += 2;
                                                                                iF6 = i71;
                                                                            }
                                                                        }
                                                                        throw zzfb.a();
                                                                    }
                                                                    if (i23 < iE - 1) {
                                                                        throw zzfb.a();
                                                                    }
                                                                    int i73 = i24 + 2;
                                                                    b13 = bArr4[i23];
                                                                    i26 = i24 + 3;
                                                                    b14 = bArr4[i73];
                                                                    i27 = i69 + 1;
                                                                    if (!zzhk.a(b13)) {
                                                                        i25 = iE;
                                                                        if (b3 != -32) {
                                                                            if (b3 != -19) {
                                                                                if (!zzhk.a(b14)) {
                                                                                    cArr[i69] = (char) (((b3 & 15) << 12) | ((b13 & 63) << 6) | (b14 & 63));
                                                                                    iF6 = i26;
                                                                                    i69 = i27;
                                                                                }
                                                                            } else if (b13 < -96) {
                                                                                b3 = -19;
                                                                                if (!zzhk.a(b14)) {
                                                                                    cArr[i69] = (char) (((b3 & 15) << 12) | ((b13 & 63) << 6) | (b14 & 63));
                                                                                    iF6 = i26;
                                                                                    i69 = i27;
                                                                                }
                                                                            }
                                                                        } else if (b13 >= -96) {
                                                                            b3 = -32;
                                                                            if (b3 != -19) {
                                                                                if (!zzhk.a(b14)) {
                                                                                    cArr[i69] = (char) (((b3 & 15) << 12) | ((b13 & 63) << 6) | (b14 & 63));
                                                                                    iF6 = i26;
                                                                                    i69 = i27;
                                                                                }
                                                                            } else if (b13 < -96) {
                                                                                b3 = -19;
                                                                                if (!zzhk.a(b14)) {
                                                                                    cArr[i69] = (char) (((b3 & 15) << 12) | ((b13 & 63) << 6) | (b14 & 63));
                                                                                    iF6 = i26;
                                                                                    i69 = i27;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    throw zzfb.a();
                                                                    iE = i25;
                                                                } else {
                                                                    if (i23 < iE) {
                                                                        throw zzfb.a();
                                                                    }
                                                                    int i74 = i24 + 2;
                                                                    byte b18 = bArr4[i23];
                                                                    int i75 = i69 + 1;
                                                                    if (b3 >= -62 || zzhk.a(b18)) {
                                                                        throw zzfb.a();
                                                                    }
                                                                    cArr[i69] = (char) (((b3 & 31) << 6) | (b18 & 63));
                                                                    iF6 = i74;
                                                                    i69 = i75;
                                                                }
                                                            }
                                                        }
                                                        zzdtVar4.f9474c = new String(cArr, 0, i69);
                                                    }
                                                }
                                                while (iF6 < iE) {
                                                    i23 = iF6 + 1;
                                                    b3 = bArr4[iF6];
                                                    if (b3 >= 0) {
                                                        cArr[i69] = (char) b3;
                                                        i69++;
                                                        iF6 = i23;
                                                        while (iF6 < iE) {
                                                            b11 = bArr4[iF6];
                                                            if (b11 >= 0) {
                                                            }
                                                            iF6++;
                                                            cArr[i69] = (char) b11;
                                                            i69++;
                                                        }
                                                    } else {
                                                        i24 = iF6;
                                                        if (b3 >= -32) {
                                                            if (i23 < iE) {
                                                                throw zzfb.a();
                                                            }
                                                            int i76 = i24 + 2;
                                                            byte b19 = bArr4[i23];
                                                            int i77 = i69 + 1;
                                                            if (b3 >= -62) {
                                                            }
                                                            throw zzfb.a();
                                                        }
                                                        if (b3 < -16) {
                                                            i25 = iE;
                                                            if (i23 < i25 - 2) {
                                                                throw zzfb.a();
                                                            }
                                                            b12 = bArr4[i23];
                                                            int i78 = i24 + 3;
                                                            byte b110 = bArr4[i24 + 2];
                                                            int i79 = i24 + 4;
                                                            byte b111 = bArr4[i78];
                                                            if (!zzhk.a(b12)) {
                                                                if ((((b12 + 112) + (b3 << 28)) >> 30) != 0) {
                                                                }
                                                            }
                                                            throw zzfb.a();
                                                        }
                                                        if (i23 < iE - 1) {
                                                            throw zzfb.a();
                                                        }
                                                        int i710 = i24 + 2;
                                                        b13 = bArr4[i23];
                                                        i26 = i24 + 3;
                                                        b14 = bArr4[i710];
                                                        i27 = i69 + 1;
                                                        if (!zzhk.a(b13)) {
                                                            i25 = iE;
                                                            if (b3 != -32) {
                                                                if (b3 != -19) {
                                                                    if (!zzhk.a(b14)) {
                                                                        cArr[i69] = (char) (((b3 & 15) << 12) | ((b13 & 63) << 6) | (b14 & 63));
                                                                        iF6 = i26;
                                                                        i69 = i27;
                                                                    }
                                                                } else if (b13 < -96) {
                                                                    b3 = -19;
                                                                    if (!zzhk.a(b14)) {
                                                                        cArr[i69] = (char) (((b3 & 15) << 12) | ((b13 & 63) << 6) | (b14 & 63));
                                                                        iF6 = i26;
                                                                        i69 = i27;
                                                                    }
                                                                }
                                                            } else if (b13 >= -96) {
                                                                b3 = -32;
                                                                if (b3 != -19) {
                                                                    if (!zzhk.a(b14)) {
                                                                        cArr[i69] = (char) (((b3 & 15) << 12) | ((b13 & 63) << 6) | (b14 & 63));
                                                                        iF6 = i26;
                                                                        i69 = i27;
                                                                    }
                                                                } else if (b13 < -96) {
                                                                    b3 = -19;
                                                                    if (!zzhk.a(b14)) {
                                                                        cArr[i69] = (char) (((b3 & 15) << 12) | ((b13 & 63) << 6) | (b14 & 63));
                                                                        iF6 = i26;
                                                                        i69 = i27;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        throw zzfb.a();
                                                        iE = i25;
                                                    }
                                                    break;
                                                }
                                                zzdtVar4.f9474c = new String(cArr, 0, i69);
                                            }
                                        } else {
                                            int iF7 = zzdu.f(bArr4, i22, zzdtVar4);
                                            int i80 = zzdtVar4.f9472a;
                                            if (i80 < 0) {
                                                throw zzfb.b();
                                            }
                                            if (i80 == 0) {
                                                zzdtVar4.f9474c = BuildConfig.VERSION_NAME;
                                            } else {
                                                zzdtVar4.f9474c = new String(bArr4, iF7, i80, zzfa.f9501a);
                                                iF7 += i80;
                                            }
                                            iE = iF7;
                                        }
                                        unsafe2.putObject(obj4, j11, zzdtVar4.f9474c);
                                        bArr11 = bArr4;
                                        zzdtVar9 = zzdtVar4;
                                        iP = iP;
                                        unsafe5 = unsafe2;
                                        i51 = i19;
                                        i55 = 1048575;
                                        i12 = i12;
                                        i53 |= i63;
                                        obj6 = obj4;
                                        i52 = i18;
                                    } else {
                                        bArr3 = bArr4;
                                        zzdtVar3 = zzdtVar4;
                                        obj3 = obj4;
                                        i21 = i22;
                                        iF = i21;
                                        zzdtVar2 = zzdtVar3;
                                        unsafe = unsafe2;
                                        i15 = i54 == true ? 1 : 0;
                                        i14 = i18;
                                        obj2 = obj3;
                                        zzhaVar = zzhaVar4;
                                        bArr2 = bArr3;
                                        i16 = i19;
                                    }
                                    break;
                                case 9:
                                    Object obj8 = obj6;
                                    Unsafe unsafe6 = unsafe5;
                                    zzdtVar9 = zzdtVar;
                                    i18 = i17;
                                    i19 = i58;
                                    if (z11 == 2) {
                                        Object objU = zzgaVar.u(iP, obj8);
                                        int iK = zzdu.k(objU, zzgaVar.t(iP), bArr, i57, i12, zzdtVar9);
                                        zzgaVar.g(iP, obj8, objU);
                                        i53 |= i63;
                                        bArr11 = bArr;
                                        iE = iK;
                                        unsafe5 = unsafe6;
                                        obj6 = obj8;
                                        i52 = i18;
                                        i51 = i19;
                                        i55 = 1048575;
                                        i12 = i12;
                                    } else {
                                        bArr3 = bArr;
                                        zzdtVar3 = zzdtVar9;
                                        obj3 = obj8;
                                        i53 = i53;
                                        i21 = i57;
                                        unsafe2 = unsafe6;
                                        iF = i21;
                                        zzdtVar2 = zzdtVar3;
                                        unsafe = unsafe2;
                                        i15 = i54 == true ? 1 : 0;
                                        i14 = i18;
                                        obj2 = obj3;
                                        zzhaVar = zzhaVar4;
                                        bArr2 = bArr3;
                                        i16 = i19;
                                    }
                                    break;
                                case 10:
                                    Object obj9 = obj6;
                                    unsafe3 = unsafe5;
                                    obj3 = obj9;
                                    bArr5 = bArr;
                                    zzdtVar9 = zzdtVar;
                                    i18 = i17;
                                    i28 = i57;
                                    i19 = i58;
                                    if (z11 == 2) {
                                        iE = zzdu.a(bArr5, i28, zzdtVar9);
                                        unsafe3.putObject(obj3, j11, zzdtVar9.f9474c);
                                        i53 |= i63;
                                        Unsafe unsafe7 = unsafe3;
                                        obj6 = obj3;
                                        unsafe5 = unsafe7;
                                        i12 = i12;
                                        bArr11 = bArr5;
                                        i52 = i18;
                                        i51 = i19;
                                    }
                                    zzdtVar3 = zzdtVar9;
                                    bArr3 = bArr5;
                                    unsafe2 = unsafe3;
                                    i21 = i28;
                                    iF = i21;
                                    zzdtVar2 = zzdtVar3;
                                    unsafe = unsafe2;
                                    i15 = i54 == true ? 1 : 0;
                                    i14 = i18;
                                    obj2 = obj3;
                                    zzhaVar = zzhaVar4;
                                    bArr2 = bArr3;
                                    i16 = i19;
                                    break;
                                case 12:
                                    Object obj10 = obj6;
                                    unsafe3 = unsafe5;
                                    obj3 = obj10;
                                    bArr5 = bArr;
                                    zzdtVar9 = zzdtVar;
                                    i18 = i17;
                                    i28 = i57;
                                    i19 = i58;
                                    if (z11 == 0) {
                                        iE = zzdu.f(bArr5, i28, zzdtVar9);
                                        int i81 = zzdtVar9.f9472a;
                                        zzey zzeyVarS = zzgaVar.s(iP);
                                        if ((i61 & Integer.MIN_VALUE) == 0 || zzeyVarS == null || zzeyVarS.zza()) {
                                            unsafe3.putInt(obj3, j11, i81);
                                            i53 |= i63;
                                        } else {
                                            zzev zzevVar = (zzev) obj3;
                                            zzha zzhaVarA = zzevVar.zzc;
                                            if (zzhaVarA == zzhaVar4) {
                                                zzhaVarA = zzha.a();
                                                zzevVar.zzc = zzhaVarA;
                                            }
                                            zzhaVarA.b(i54 == true ? 1 : 0, Long.valueOf(i81));
                                        }
                                        Unsafe unsafe8 = unsafe3;
                                        obj6 = obj3;
                                        unsafe5 = unsafe8;
                                        i12 = i12;
                                        bArr11 = bArr5;
                                        i52 = i18;
                                        i51 = i19;
                                    }
                                    zzdtVar3 = zzdtVar9;
                                    bArr3 = bArr5;
                                    unsafe2 = unsafe3;
                                    i21 = i28;
                                    iF = i21;
                                    zzdtVar2 = zzdtVar3;
                                    unsafe = unsafe2;
                                    i15 = i54 == true ? 1 : 0;
                                    i14 = i18;
                                    obj2 = obj3;
                                    zzhaVar = zzhaVar4;
                                    bArr2 = bArr3;
                                    i16 = i19;
                                    break;
                                case 15:
                                    Object obj11 = obj6;
                                    unsafe3 = unsafe5;
                                    obj3 = obj11;
                                    bArr5 = bArr;
                                    zzdtVar9 = zzdtVar;
                                    i18 = i17;
                                    i28 = i57;
                                    i19 = i58;
                                    if (z11 == 0) {
                                        iE = zzdu.f(bArr5, i28, zzdtVar9);
                                        int i82 = zzdtVar9.f9472a;
                                        unsafe3.putInt(obj3, j11, (i82 >>> 1) ^ (-(i82 & 1)));
                                        i53 |= i63;
                                        Unsafe unsafe9 = unsafe3;
                                        obj6 = obj3;
                                        unsafe5 = unsafe9;
                                        i12 = i12;
                                        bArr11 = bArr5;
                                        i52 = i18;
                                        i51 = i19;
                                    }
                                    zzdtVar3 = zzdtVar9;
                                    bArr3 = bArr5;
                                    unsafe2 = unsafe3;
                                    i21 = i28;
                                    iF = i21;
                                    zzdtVar2 = zzdtVar3;
                                    unsafe = unsafe2;
                                    i15 = i54 == true ? 1 : 0;
                                    i14 = i18;
                                    obj2 = obj3;
                                    zzhaVar = zzhaVar4;
                                    bArr2 = bArr3;
                                    i16 = i19;
                                    break;
                                case 16:
                                    i28 = i57;
                                    if (z11 == 0) {
                                        int i83 = zzdu.i(bArr, i28, zzdtVar);
                                        unsafe5.putLong(obj6, j11, zzej.a(zzdtVar.f9473b));
                                        i53 |= i63;
                                        obj6 = obj6;
                                        unsafe5 = unsafe5;
                                        i12 = i12;
                                        zzdtVar9 = zzdtVar;
                                        iE = i83;
                                        bArr11 = bArr;
                                        iP = iP;
                                        i52 = i17;
                                        i51 = i58;
                                    } else {
                                        Object obj12 = obj6;
                                        Unsafe unsafe10 = unsafe5;
                                        obj3 = obj12;
                                        i18 = i17;
                                        i19 = i58;
                                        unsafe2 = unsafe10;
                                        zzdtVar3 = zzdtVar;
                                        bArr3 = bArr;
                                        i21 = i28;
                                        iF = i21;
                                        zzdtVar2 = zzdtVar3;
                                        unsafe = unsafe2;
                                        i15 = i54 == true ? 1 : 0;
                                        i14 = i18;
                                        obj2 = obj3;
                                        zzhaVar = zzhaVar4;
                                        bArr2 = bArr3;
                                        i16 = i19;
                                    }
                                    break;
                                default:
                                    if (z11 == 3) {
                                        Object objU2 = zzgaVar.u(iP, obj6);
                                        int iJ = zzdu.j(objU2, zzgaVar.t(iP), bArr, i57, i12, (i58 << 3) | 4, zzdtVar);
                                        zzgaVar.g(iP, obj6, objU2);
                                        i53 |= i63;
                                        zzdtVar9 = zzdtVar;
                                        iE = iJ;
                                        bArr11 = bArr;
                                        i52 = i17;
                                        i51 = i58;
                                        i55 = 1048575;
                                        i12 = i12;
                                    } else {
                                        i18 = i17;
                                        i53 = i53;
                                        i21 = i57;
                                        bArr3 = bArr;
                                        unsafe2 = unsafe5;
                                        obj3 = obj6;
                                        i19 = i58;
                                        zzdtVar3 = zzdtVar;
                                        iF = i21;
                                        zzdtVar2 = zzdtVar3;
                                        unsafe = unsafe2;
                                        i15 = i54 == true ? 1 : 0;
                                        i14 = i18;
                                        obj2 = obj3;
                                        zzhaVar = zzhaVar4;
                                        bArr2 = bArr3;
                                        i16 = i19;
                                    }
                                    break;
                            }
                        } else {
                            Object obj13 = obj6;
                            Unsafe unsafe11 = unsafe5;
                            objArr = objArr;
                            i19 = i58;
                            if (iQ != 27) {
                                Object obj14 = obj13;
                                if (iQ <= 49) {
                                    unsafe = unsafe11;
                                    long j12 = i61;
                                    Unsafe unsafe12 = f9517l;
                                    zzez zzezVarZzd = (zzez) unsafe12.getObject(obj14, j11);
                                    if (!zzezVarZzd.zzc()) {
                                        int size = zzezVarZzd.size();
                                        zzezVarZzd = zzezVarZzd.zzd(size != 0 ? size + size : 10);
                                        unsafe12.putObject(obj14, j11, zzezVarZzd);
                                    }
                                    zzez zzezVar2 = zzezVarZzd;
                                    switch (iQ) {
                                        case 18:
                                        case 35:
                                            bArr6 = bArr;
                                            i54 = i54 == true ? 1 : 0;
                                            i14 = i52;
                                            i53 = i53;
                                            i35 = i57;
                                            i36 = i12;
                                            zzdtVar7 = zzdtVar;
                                            zzhaVar = zzhaVar4;
                                            i16 = i19;
                                            if (z11 == 2) {
                                                zzek zzekVar = (zzek) zzezVar2;
                                                iF = zzdu.f(bArr6, i35, zzdtVar7);
                                                int i84 = zzdtVar7.f9472a + iF;
                                                while (iF < i84) {
                                                    zzekVar.b(Double.longBitsToDouble(zzdu.l(bArr6, iF)));
                                                    iF += 8;
                                                }
                                                if (iF != i84) {
                                                    throw zzfb.c();
                                                }
                                            } else if (z11 == 1) {
                                                zzek zzekVar2 = (zzek) zzezVar2;
                                                zzekVar2.b(Double.longBitsToDouble(zzdu.l(bArr6, i35)));
                                                i37 = i35 + 8;
                                                while (i37 < i36) {
                                                    int iF8 = zzdu.f(bArr6, i37, zzdtVar7);
                                                    if (i54 == zzdtVar7.f9472a) {
                                                        zzekVar2.b(Double.longBitsToDouble(zzdu.l(bArr6, iF8)));
                                                        i37 = iF8 + 8;
                                                    } else {
                                                        iF = i37;
                                                    }
                                                }
                                                iF = i37;
                                            } else {
                                                iF = i35;
                                            }
                                            if (iF != i35) {
                                                bArr2 = bArr6;
                                                zzdtVar2 = zzdtVar7;
                                                i15 = i54 == true ? 1 : 0;
                                                obj2 = obj;
                                            } else {
                                                i12 = i36;
                                                i51 = i16;
                                                zzdtVar9 = zzdtVar7;
                                                iP = iP;
                                                i53 = i53;
                                                unsafe5 = unsafe;
                                                i52 = i14;
                                                i55 = 1048575;
                                                iE = iF;
                                                bArr11 = bArr6;
                                                obj6 = obj;
                                            }
                                            break;
                                        case 19:
                                        case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                                            bArr6 = bArr;
                                            i54 = i54 == true ? 1 : 0;
                                            i14 = i52;
                                            i53 = i53;
                                            i35 = i57;
                                            i36 = i12;
                                            zzdtVar7 = zzdtVar;
                                            zzhaVar = zzhaVar4;
                                            i16 = i19;
                                            if (z11 == 2) {
                                                zzer zzerVar = (zzer) zzezVar2;
                                                iF = zzdu.f(bArr6, i35, zzdtVar7);
                                                int i85 = zzdtVar7.f9472a + iF;
                                                while (iF < i85) {
                                                    zzerVar.b(Float.intBitsToFloat(zzdu.b(bArr6, iF)));
                                                    iF += 4;
                                                }
                                                if (iF != i85) {
                                                    throw zzfb.c();
                                                }
                                            } else if (z11 == 5) {
                                                zzer zzerVar2 = (zzer) zzezVar2;
                                                zzerVar2.b(Float.intBitsToFloat(zzdu.b(bArr6, i35)));
                                                i37 = i35 + 4;
                                                while (i37 < i36) {
                                                    int iF9 = zzdu.f(bArr6, i37, zzdtVar7);
                                                    if (i54 == zzdtVar7.f9472a) {
                                                        zzerVar2.b(Float.intBitsToFloat(zzdu.b(bArr6, iF9)));
                                                        i37 = iF9 + 4;
                                                    } else {
                                                        iF = i37;
                                                    }
                                                }
                                                iF = i37;
                                            } else {
                                                iF = i35;
                                            }
                                            if (iF != i35) {
                                                bArr2 = bArr6;
                                                zzdtVar2 = zzdtVar7;
                                                i15 = i54 == true ? 1 : 0;
                                                obj2 = obj;
                                            } else {
                                                i12 = i36;
                                                i51 = i16;
                                                zzdtVar9 = zzdtVar7;
                                                iP = iP;
                                                i53 = i53;
                                                unsafe5 = unsafe;
                                                i52 = i14;
                                                i55 = 1048575;
                                                iE = iF;
                                                bArr11 = bArr6;
                                                obj6 = obj;
                                            }
                                            break;
                                        case 20:
                                        case 21:
                                        case 37:
                                        case 38:
                                            bArr6 = bArr;
                                            i54 = i54 == true ? 1 : 0;
                                            i14 = i52;
                                            i53 = i53;
                                            i35 = i57;
                                            i36 = i12;
                                            zzdtVar7 = zzdtVar;
                                            zzhaVar = zzhaVar4;
                                            i16 = i19;
                                            if (z11 == 2) {
                                                zzfm zzfmVar = (zzfm) zzezVar2;
                                                iF = zzdu.f(bArr6, i35, zzdtVar7);
                                                int i86 = zzdtVar7.f9472a + iF;
                                                while (iF < i86) {
                                                    iF = zzdu.i(bArr6, iF, zzdtVar7);
                                                    zzfmVar.b(zzdtVar7.f9473b);
                                                }
                                                if (iF != i86) {
                                                    throw zzfb.c();
                                                }
                                            } else if (z11 == 0) {
                                                zzfm zzfmVar2 = (zzfm) zzezVar2;
                                                iF = zzdu.i(bArr6, i35, zzdtVar7);
                                                zzfmVar2.b(zzdtVar7.f9473b);
                                                while (iF < i36) {
                                                    int iF10 = zzdu.f(bArr6, iF, zzdtVar7);
                                                    if (i54 == zzdtVar7.f9472a) {
                                                        iF = zzdu.i(bArr6, iF10, zzdtVar7);
                                                        zzfmVar2.b(zzdtVar7.f9473b);
                                                    }
                                                }
                                            } else {
                                                iF = i35;
                                            }
                                            if (iF != i35) {
                                                bArr2 = bArr6;
                                                zzdtVar2 = zzdtVar7;
                                                i15 = i54 == true ? 1 : 0;
                                                obj2 = obj;
                                            } else {
                                                i12 = i36;
                                                i51 = i16;
                                                zzdtVar9 = zzdtVar7;
                                                iP = iP;
                                                i53 = i53;
                                                unsafe5 = unsafe;
                                                i52 = i14;
                                                i55 = 1048575;
                                                iE = iF;
                                                bArr11 = bArr6;
                                                obj6 = obj;
                                            }
                                            break;
                                        case 22:
                                        case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
                                        case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                                        case 43:
                                            bArr7 = bArr;
                                            i38 = i12;
                                            i39 = i54 == true ? 1 : 0;
                                            i14 = i52;
                                            i53 = i53;
                                            i40 = i57;
                                            zzdtVar7 = zzdtVar;
                                            zzhaVar = zzhaVar4;
                                            i16 = i19;
                                            if (z11 == 2) {
                                                zzew zzewVar = (zzew) zzezVar2;
                                                iF3 = zzdu.f(bArr7, i40, zzdtVar7);
                                                int i87 = zzdtVar7.f9472a + iF3;
                                                while (iF3 < i87) {
                                                    iF3 = zzdu.f(bArr7, iF3, zzdtVar7);
                                                    zzewVar.b(zzdtVar7.f9472a);
                                                }
                                                if (iF3 != i87) {
                                                    throw zzfb.c();
                                                }
                                                bArr6 = bArr7;
                                                i36 = i38;
                                                iF = iF3;
                                                i35 = i40;
                                                i54 = i39;
                                            } else if (z11 == 0) {
                                                bArr6 = bArr7;
                                                int iH = zzdu.h(i39 == true ? 1 : 0, bArr6, i40, i38, zzezVar2, zzdtVar7);
                                                i54 = i39 == true ? 1 : 0;
                                                i35 = i40;
                                                iF = iH;
                                                i36 = i38;
                                            } else {
                                                bArr6 = bArr7;
                                                i36 = i38;
                                                i35 = i40;
                                                i54 = i39;
                                                iF = i35;
                                            }
                                            if (iF != i35) {
                                                bArr2 = bArr6;
                                                zzdtVar2 = zzdtVar7;
                                                i15 = i54 == true ? 1 : 0;
                                                obj2 = obj;
                                            } else {
                                                i12 = i36;
                                                i51 = i16;
                                                zzdtVar9 = zzdtVar7;
                                                iP = iP;
                                                i53 = i53;
                                                unsafe5 = unsafe;
                                                i52 = i14;
                                                i55 = 1048575;
                                                iE = iF;
                                                bArr11 = bArr6;
                                                obj6 = obj;
                                            }
                                            break;
                                        case 23:
                                        case Consts.SP /* 32 */:
                                        case DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                                        case 46:
                                            bArr7 = bArr;
                                            i38 = i12;
                                            i39 = i54 == true ? 1 : 0;
                                            i14 = i52;
                                            i53 = i53;
                                            i40 = i57;
                                            zzdtVar7 = zzdtVar;
                                            zzhaVar = zzhaVar4;
                                            i16 = i19;
                                            if (z11 != 2) {
                                                if (z11 == 1) {
                                                    zzfm zzfmVar3 = (zzfm) zzezVar2;
                                                    zzfmVar3.b(zzdu.l(bArr7, i40));
                                                    i41 = i40 + 8;
                                                    while (i41 < i38) {
                                                        int iF11 = zzdu.f(bArr7, i41, zzdtVar7);
                                                        if (i39 != zzdtVar7.f9472a) {
                                                            bArr6 = bArr7;
                                                            i36 = i38;
                                                            iF = i41;
                                                            i35 = i40;
                                                            i54 = i39;
                                                            if (iF != i35) {
                                                                bArr2 = bArr6;
                                                                zzdtVar2 = zzdtVar7;
                                                                i15 = i54 == true ? 1 : 0;
                                                                obj2 = obj;
                                                            } else {
                                                                i12 = i36;
                                                                i51 = i16;
                                                                zzdtVar9 = zzdtVar7;
                                                                iP = iP;
                                                                i53 = i53;
                                                                unsafe5 = unsafe;
                                                                i52 = i14;
                                                                i55 = 1048575;
                                                                iE = iF;
                                                                bArr11 = bArr6;
                                                                obj6 = obj;
                                                            }
                                                        } else {
                                                            zzfmVar3.b(zzdu.l(bArr7, iF11));
                                                            i41 = iF11 + 8;
                                                        }
                                                        break;
                                                    }
                                                    bArr6 = bArr7;
                                                    i36 = i38;
                                                    iF = i41;
                                                    i35 = i40;
                                                    i54 = i39;
                                                    if (iF != i35) {
                                                        bArr2 = bArr6;
                                                        zzdtVar2 = zzdtVar7;
                                                        i15 = i54 == true ? 1 : 0;
                                                        obj2 = obj;
                                                    } else {
                                                        i12 = i36;
                                                        i51 = i16;
                                                        zzdtVar9 = zzdtVar7;
                                                        iP = iP;
                                                        i53 = i53;
                                                        unsafe5 = unsafe;
                                                        i52 = i14;
                                                        i55 = 1048575;
                                                        iE = iF;
                                                        bArr11 = bArr6;
                                                        obj6 = obj;
                                                    }
                                                }
                                                bArr6 = bArr7;
                                                i36 = i38;
                                                i35 = i40;
                                                i54 = i39;
                                                iF = i35;
                                                if (iF != i35) {
                                                    bArr2 = bArr6;
                                                    zzdtVar2 = zzdtVar7;
                                                    i15 = i54 == true ? 1 : 0;
                                                    obj2 = obj;
                                                } else {
                                                    i12 = i36;
                                                    i51 = i16;
                                                    zzdtVar9 = zzdtVar7;
                                                    iP = iP;
                                                    i53 = i53;
                                                    unsafe5 = unsafe;
                                                    i52 = i14;
                                                    i55 = 1048575;
                                                    iE = iF;
                                                    bArr11 = bArr6;
                                                    obj6 = obj;
                                                }
                                                break;
                                            } else {
                                                zzfm zzfmVar4 = (zzfm) zzezVar2;
                                                iF3 = zzdu.f(bArr7, i40, zzdtVar7);
                                                int i88 = zzdtVar7.f9472a + iF3;
                                                while (iF3 < i88) {
                                                    zzfmVar4.b(zzdu.l(bArr7, iF3));
                                                    iF3 += 8;
                                                }
                                                if (iF3 != i88) {
                                                    throw zzfb.c();
                                                }
                                                bArr6 = bArr7;
                                                i36 = i38;
                                                iF = iF3;
                                                i35 = i40;
                                                i54 = i39;
                                                if (iF != i35) {
                                                    bArr2 = bArr6;
                                                    zzdtVar2 = zzdtVar7;
                                                    i15 = i54 == true ? 1 : 0;
                                                    obj2 = obj;
                                                } else {
                                                    i12 = i36;
                                                    i51 = i16;
                                                    zzdtVar9 = zzdtVar7;
                                                    iP = iP;
                                                    i53 = i53;
                                                    unsafe5 = unsafe;
                                                    i52 = i14;
                                                    i55 = 1048575;
                                                    iE = iF;
                                                    bArr11 = bArr6;
                                                    obj6 = obj;
                                                }
                                            }
                                            break;
                                        case Service.METRICS_FIELD_NUMBER /* 24 */:
                                        case 31:
                                        case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                                        case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                            bArr7 = bArr;
                                            i38 = i12;
                                            i39 = i54 == true ? 1 : 0;
                                            i14 = i52;
                                            i53 = i53;
                                            i40 = i57;
                                            zzdtVar7 = zzdtVar;
                                            zzhaVar = zzhaVar4;
                                            i16 = i19;
                                            if (z11 != 2) {
                                                if (z11 == 5) {
                                                    zzew zzewVar2 = (zzew) zzezVar2;
                                                    zzewVar2.b(zzdu.b(bArr7, i40));
                                                    i41 = i40 + 4;
                                                    while (i41 < i38) {
                                                        int iF12 = zzdu.f(bArr7, i41, zzdtVar7);
                                                        if (i39 != zzdtVar7.f9472a) {
                                                            bArr6 = bArr7;
                                                            i36 = i38;
                                                            iF = i41;
                                                            i35 = i40;
                                                            i54 = i39;
                                                            if (iF != i35) {
                                                                bArr2 = bArr6;
                                                                zzdtVar2 = zzdtVar7;
                                                                i15 = i54 == true ? 1 : 0;
                                                                obj2 = obj;
                                                            } else {
                                                                i12 = i36;
                                                                i51 = i16;
                                                                zzdtVar9 = zzdtVar7;
                                                                iP = iP;
                                                                i53 = i53;
                                                                unsafe5 = unsafe;
                                                                i52 = i14;
                                                                i55 = 1048575;
                                                                iE = iF;
                                                                bArr11 = bArr6;
                                                                obj6 = obj;
                                                            }
                                                        } else {
                                                            zzewVar2.b(zzdu.b(bArr7, iF12));
                                                            i41 = iF12 + 4;
                                                        }
                                                        break;
                                                    }
                                                    bArr6 = bArr7;
                                                    i36 = i38;
                                                    iF = i41;
                                                    i35 = i40;
                                                    i54 = i39;
                                                    if (iF != i35) {
                                                        bArr2 = bArr6;
                                                        zzdtVar2 = zzdtVar7;
                                                        i15 = i54 == true ? 1 : 0;
                                                        obj2 = obj;
                                                    } else {
                                                        i12 = i36;
                                                        i51 = i16;
                                                        zzdtVar9 = zzdtVar7;
                                                        iP = iP;
                                                        i53 = i53;
                                                        unsafe5 = unsafe;
                                                        i52 = i14;
                                                        i55 = 1048575;
                                                        iE = iF;
                                                        bArr11 = bArr6;
                                                        obj6 = obj;
                                                    }
                                                }
                                                bArr6 = bArr7;
                                                i36 = i38;
                                                i35 = i40;
                                                i54 = i39;
                                                iF = i35;
                                                if (iF != i35) {
                                                    bArr2 = bArr6;
                                                    zzdtVar2 = zzdtVar7;
                                                    i15 = i54 == true ? 1 : 0;
                                                    obj2 = obj;
                                                } else {
                                                    i12 = i36;
                                                    i51 = i16;
                                                    zzdtVar9 = zzdtVar7;
                                                    iP = iP;
                                                    i53 = i53;
                                                    unsafe5 = unsafe;
                                                    i52 = i14;
                                                    i55 = 1048575;
                                                    iE = iF;
                                                    bArr11 = bArr6;
                                                    obj6 = obj;
                                                }
                                                break;
                                            } else {
                                                zzew zzewVar3 = (zzew) zzezVar2;
                                                iF3 = zzdu.f(bArr7, i40, zzdtVar7);
                                                int i89 = zzdtVar7.f9472a + iF3;
                                                while (iF3 < i89) {
                                                    zzewVar3.b(zzdu.b(bArr7, iF3));
                                                    iF3 += 4;
                                                }
                                                if (iF3 != i89) {
                                                    throw zzfb.c();
                                                }
                                                bArr6 = bArr7;
                                                i36 = i38;
                                                iF = iF3;
                                                i35 = i40;
                                                i54 = i39;
                                                if (iF != i35) {
                                                    bArr2 = bArr6;
                                                    zzdtVar2 = zzdtVar7;
                                                    i15 = i54 == true ? 1 : 0;
                                                    obj2 = obj;
                                                } else {
                                                    i12 = i36;
                                                    i51 = i16;
                                                    zzdtVar9 = zzdtVar7;
                                                    iP = iP;
                                                    i53 = i53;
                                                    unsafe5 = unsafe;
                                                    i52 = i14;
                                                    i55 = 1048575;
                                                    iE = iF;
                                                    bArr11 = bArr6;
                                                    obj6 = obj;
                                                }
                                            }
                                            break;
                                        case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                                        case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                                            bArr7 = bArr;
                                            i38 = i12;
                                            i39 = i54 == true ? 1 : 0;
                                            i14 = i52;
                                            i53 = i53;
                                            i40 = i57;
                                            zzdtVar7 = zzdtVar;
                                            zzhaVar = zzhaVar4;
                                            i16 = i19;
                                            if (z11 != 2) {
                                                if (z11 == 0) {
                                                    zzdv zzdvVar = (zzdv) zzezVar2;
                                                    iF3 = zzdu.i(bArr7, i40, zzdtVar7);
                                                    zzdvVar.b(zzdtVar7.f9473b != 0);
                                                    while (iF3 < i38) {
                                                        int iF13 = zzdu.f(bArr7, iF3, zzdtVar7);
                                                        if (i39 == zzdtVar7.f9472a) {
                                                            iF3 = zzdu.i(bArr7, iF13, zzdtVar7);
                                                            zzdvVar.b(zzdtVar7.f9473b != 0);
                                                        }
                                                    }
                                                }
                                                bArr6 = bArr7;
                                                i36 = i38;
                                                i35 = i40;
                                                i54 = i39;
                                                iF = i35;
                                                if (iF != i35) {
                                                    bArr2 = bArr6;
                                                    zzdtVar2 = zzdtVar7;
                                                    i15 = i54 == true ? 1 : 0;
                                                    obj2 = obj;
                                                } else {
                                                    i12 = i36;
                                                    i51 = i16;
                                                    zzdtVar9 = zzdtVar7;
                                                    iP = iP;
                                                    i53 = i53;
                                                    unsafe5 = unsafe;
                                                    i52 = i14;
                                                    i55 = 1048575;
                                                    iE = iF;
                                                    bArr11 = bArr6;
                                                    obj6 = obj;
                                                }
                                            } else {
                                                zzdv zzdvVar2 = (zzdv) zzezVar2;
                                                iF3 = zzdu.f(bArr7, i40, zzdtVar7);
                                                int i90 = zzdtVar7.f9472a + iF3;
                                                while (iF3 < i90) {
                                                    iF3 = zzdu.i(bArr7, iF3, zzdtVar7);
                                                    zzdvVar2.b(zzdtVar7.f9473b != 0);
                                                }
                                                if (iF3 != i90) {
                                                    throw zzfb.c();
                                                }
                                            }
                                            bArr6 = bArr7;
                                            i36 = i38;
                                            iF = iF3;
                                            i35 = i40;
                                            i54 = i39;
                                            if (iF != i35) {
                                                bArr2 = bArr6;
                                                zzdtVar2 = zzdtVar7;
                                                i15 = i54 == true ? 1 : 0;
                                                obj2 = obj;
                                            } else {
                                                i12 = i36;
                                                i51 = i16;
                                                zzdtVar9 = zzdtVar7;
                                                iP = iP;
                                                i53 = i53;
                                                unsafe5 = unsafe;
                                                i52 = i14;
                                                i55 = 1048575;
                                                iE = iF;
                                                bArr11 = bArr6;
                                                obj6 = obj;
                                            }
                                            break;
                                        case Service.BILLING_FIELD_NUMBER /* 26 */:
                                            bArr7 = bArr;
                                            i38 = i12;
                                            i39 = i54 == true ? 1 : 0;
                                            i14 = i52;
                                            i53 = i53;
                                            i40 = i57;
                                            zzdtVar7 = zzdtVar;
                                            zzhaVar = zzhaVar4;
                                            i16 = i19;
                                            if (z11 == 2) {
                                                if ((j12 & 536870912) == 0) {
                                                    iF3 = zzdu.f(bArr7, i40, zzdtVar7);
                                                    int i91 = zzdtVar7.f9472a;
                                                    if (i91 < 0) {
                                                        throw zzfb.b();
                                                    }
                                                    if (i91 == 0) {
                                                        zzezVar2.add(BuildConfig.VERSION_NAME);
                                                    } else {
                                                        zzezVar2.add(new String(bArr7, iF3, i91, zzfa.f9501a));
                                                        iF3 += i91;
                                                    }
                                                    while (iF3 < i38) {
                                                        int iF14 = zzdu.f(bArr7, iF3, zzdtVar7);
                                                        if (i39 == zzdtVar7.f9472a) {
                                                            iF3 = zzdu.f(bArr7, iF14, zzdtVar7);
                                                            int i92 = zzdtVar7.f9472a;
                                                            if (i92 < 0) {
                                                                throw zzfb.b();
                                                            }
                                                            if (i92 == 0) {
                                                                zzezVar2.add(BuildConfig.VERSION_NAME);
                                                            } else {
                                                                zzezVar2.add(new String(bArr7, iF3, i92, zzfa.f9501a));
                                                                iF3 += i92;
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    iF3 = zzdu.f(bArr7, i40, zzdtVar7);
                                                    int i93 = zzdtVar7.f9472a;
                                                    if (i93 < 0) {
                                                        throw zzfb.b();
                                                    }
                                                    if (i93 == 0) {
                                                        zzezVar2.add(BuildConfig.VERSION_NAME);
                                                    } else {
                                                        int i94 = iF3 + i93;
                                                        if (!zzhn.f9576a.b(bArr7, iF3, i94)) {
                                                            throw zzfb.a();
                                                        }
                                                        zzezVar2.add(new String(bArr7, iF3, i93, zzfa.f9501a));
                                                        iF3 = i94;
                                                    }
                                                    while (iF3 < i38) {
                                                        int iF15 = zzdu.f(bArr7, iF3, zzdtVar7);
                                                        if (i39 == zzdtVar7.f9472a) {
                                                            iF3 = zzdu.f(bArr7, iF15, zzdtVar7);
                                                            int i95 = zzdtVar7.f9472a;
                                                            if (i95 < 0) {
                                                                throw zzfb.b();
                                                            }
                                                            if (i95 == 0) {
                                                                zzezVar2.add(BuildConfig.VERSION_NAME);
                                                            } else {
                                                                int i96 = iF3 + i95;
                                                                if (!zzhn.f9576a.b(bArr7, iF3, i96)) {
                                                                    throw zzfb.a();
                                                                }
                                                                zzezVar2.add(new String(bArr7, iF3, i95, zzfa.f9501a));
                                                                iF3 = i96;
                                                            }
                                                        }
                                                    }
                                                }
                                                bArr6 = bArr7;
                                                i36 = i38;
                                                iF = iF3;
                                                i35 = i40;
                                                i54 = i39;
                                                if (iF != i35) {
                                                    bArr2 = bArr6;
                                                    zzdtVar2 = zzdtVar7;
                                                    i15 = i54 == true ? 1 : 0;
                                                    obj2 = obj;
                                                } else {
                                                    i12 = i36;
                                                    i51 = i16;
                                                    zzdtVar9 = zzdtVar7;
                                                    iP = iP;
                                                    i53 = i53;
                                                    unsafe5 = unsafe;
                                                    i52 = i14;
                                                    i55 = 1048575;
                                                    iE = iF;
                                                    bArr11 = bArr6;
                                                    obj6 = obj;
                                                }
                                            }
                                            bArr6 = bArr7;
                                            i36 = i38;
                                            i35 = i40;
                                            i54 = i39;
                                            iF = i35;
                                            if (iF != i35) {
                                                bArr2 = bArr6;
                                                zzdtVar2 = zzdtVar7;
                                                i15 = i54 == true ? 1 : 0;
                                                obj2 = obj;
                                            } else {
                                                i12 = i36;
                                                i51 = i16;
                                                zzdtVar9 = zzdtVar7;
                                                iP = iP;
                                                i53 = i53;
                                                unsafe5 = unsafe;
                                                i52 = i14;
                                                i55 = 1048575;
                                                iE = iF;
                                                bArr11 = bArr6;
                                                obj6 = obj;
                                            }
                                            break;
                                        case 27:
                                            bArr8 = bArr;
                                            i42 = i12;
                                            zzdtVar8 = zzdtVar;
                                            i43 = i54 == true ? 1 : 0;
                                            i14 = i52;
                                            i53 = i53;
                                            i44 = i57;
                                            zzhaVar = zzhaVar4;
                                            i16 = i19;
                                            if (z11 == 2) {
                                                i36 = i42;
                                                int iD = zzdu.d(zzgaVar.t(iP), i43 == true ? 1 : 0, bArr8, i44, i36, zzezVar2, zzdtVar8);
                                                i54 = i43 == true ? 1 : 0;
                                                bArr6 = bArr8;
                                                zzdtVar7 = zzdtVar8;
                                                iF = iD;
                                                i35 = i44;
                                            } else {
                                                i54 = i43;
                                                bArr6 = bArr8;
                                                i36 = i42;
                                                i35 = i44;
                                                zzdtVar7 = zzdtVar8;
                                                iF = i35;
                                            }
                                            if (iF != i35) {
                                                bArr2 = bArr6;
                                                zzdtVar2 = zzdtVar7;
                                                i15 = i54 == true ? 1 : 0;
                                                obj2 = obj;
                                            } else {
                                                i12 = i36;
                                                i51 = i16;
                                                zzdtVar9 = zzdtVar7;
                                                iP = iP;
                                                i53 = i53;
                                                unsafe5 = unsafe;
                                                i52 = i14;
                                                i55 = 1048575;
                                                iE = iF;
                                                bArr11 = bArr6;
                                                obj6 = obj;
                                            }
                                            break;
                                        case Service.MONITORING_FIELD_NUMBER /* 28 */:
                                            bArr8 = bArr;
                                            i42 = i12;
                                            zzdtVar8 = zzdtVar;
                                            i43 = i54 == true ? 1 : 0;
                                            i14 = i52;
                                            i53 = i53;
                                            i44 = i57;
                                            zzhaVar = zzhaVar4;
                                            i16 = i19;
                                            if (z11 == 2) {
                                                int iF16 = zzdu.f(bArr8, i44, zzdtVar8);
                                                int i97 = zzdtVar8.f9472a;
                                                if (i97 < 0) {
                                                    throw zzfb.b();
                                                }
                                                if (i97 > bArr8.length - iF16) {
                                                    throw zzfb.c();
                                                }
                                                if (i97 == 0) {
                                                    zzezVar2.add(zzef.f9482b);
                                                } else {
                                                    zzezVar2.add(zzef.l(bArr8, iF16, i97));
                                                    iF16 += i97;
                                                }
                                                while (iF16 < i42) {
                                                    int iF17 = zzdu.f(bArr8, iF16, zzdtVar8);
                                                    if (i43 != zzdtVar8.f9472a) {
                                                        iF = iF16;
                                                        bArr6 = bArr8;
                                                        i54 = i43 == true ? 1 : 0;
                                                        i36 = i42;
                                                        i35 = i44;
                                                        zzdtVar7 = zzdtVar8;
                                                        if (iF != i35) {
                                                            bArr2 = bArr6;
                                                            zzdtVar2 = zzdtVar7;
                                                            i15 = i54 == true ? 1 : 0;
                                                            obj2 = obj;
                                                        } else {
                                                            i12 = i36;
                                                            i51 = i16;
                                                            zzdtVar9 = zzdtVar7;
                                                            iP = iP;
                                                            i53 = i53;
                                                            unsafe5 = unsafe;
                                                            i52 = i14;
                                                            i55 = 1048575;
                                                            iE = iF;
                                                            bArr11 = bArr6;
                                                            obj6 = obj;
                                                        }
                                                        break;
                                                    } else {
                                                        iF16 = zzdu.f(bArr8, iF17, zzdtVar8);
                                                        int i98 = zzdtVar8.f9472a;
                                                        if (i98 < 0) {
                                                            throw zzfb.b();
                                                        }
                                                        if (i98 > bArr8.length - iF16) {
                                                            throw zzfb.c();
                                                        }
                                                        if (i98 == 0) {
                                                            zzezVar2.add(zzef.f9482b);
                                                        } else {
                                                            zzezVar2.add(zzef.l(bArr8, iF16, i98));
                                                            iF16 += i98;
                                                        }
                                                    }
                                                }
                                                iF = iF16;
                                                bArr6 = bArr8;
                                                i54 = i43 == true ? 1 : 0;
                                                i36 = i42;
                                                i35 = i44;
                                                zzdtVar7 = zzdtVar8;
                                                if (iF != i35) {
                                                    bArr2 = bArr6;
                                                    zzdtVar2 = zzdtVar7;
                                                    i15 = i54 == true ? 1 : 0;
                                                    obj2 = obj;
                                                } else {
                                                    i12 = i36;
                                                    i51 = i16;
                                                    zzdtVar9 = zzdtVar7;
                                                    iP = iP;
                                                    i53 = i53;
                                                    unsafe5 = unsafe;
                                                    i52 = i14;
                                                    i55 = 1048575;
                                                    iE = iF;
                                                    bArr11 = bArr6;
                                                    obj6 = obj;
                                                }
                                            }
                                            i54 = i43;
                                            bArr6 = bArr8;
                                            i36 = i42;
                                            i35 = i44;
                                            zzdtVar7 = zzdtVar8;
                                            iF = i35;
                                            if (iF != i35) {
                                                bArr2 = bArr6;
                                                zzdtVar2 = zzdtVar7;
                                                i15 = i54 == true ? 1 : 0;
                                                obj2 = obj;
                                            } else {
                                                i12 = i36;
                                                i51 = i16;
                                                zzdtVar9 = zzdtVar7;
                                                iP = iP;
                                                i53 = i53;
                                                unsafe5 = unsafe;
                                                i52 = i14;
                                                i55 = 1048575;
                                                iE = iF;
                                                bArr11 = bArr6;
                                                obj6 = obj;
                                            }
                                            break;
                                        case 30:
                                        case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                                            byte[] bArr12 = bArr;
                                            zzdtVar8 = zzdtVar;
                                            i14 = i52;
                                            zzhaVar = zzhaVar4;
                                            if (z11 == 2) {
                                                zzew zzewVar4 = (zzew) zzezVar2;
                                                iF4 = zzdu.f(bArr12, i57, zzdtVar8);
                                                int i99 = zzdtVar8.f9472a + iF4;
                                                while (iF4 < i99) {
                                                    iF4 = zzdu.f(bArr12, iF4, zzdtVar8);
                                                    zzewVar4.b(zzdtVar8.f9472a);
                                                }
                                                if (iF4 != i99) {
                                                    throw zzfb.c();
                                                }
                                                zzezVar = zzezVar2;
                                                i45 = i54 == true ? 1 : 0;
                                            } else if (z11 != 0) {
                                                bArr6 = bArr12;
                                                i36 = i12;
                                                i35 = i57;
                                                i54 = i54 == true ? 1 : 0;
                                                i16 = i19;
                                                zzdtVar7 = zzdtVar8;
                                                iF = i35;
                                                if (iF != i35) {
                                                    bArr2 = bArr6;
                                                    zzdtVar2 = zzdtVar7;
                                                    i15 = i54 == true ? 1 : 0;
                                                    obj2 = obj;
                                                } else {
                                                    i12 = i36;
                                                    i51 = i16;
                                                    zzdtVar9 = zzdtVar7;
                                                    iP = iP;
                                                    i53 = i53;
                                                    unsafe5 = unsafe;
                                                    i52 = i14;
                                                    i55 = 1048575;
                                                    iE = iF;
                                                    bArr11 = bArr6;
                                                    obj6 = obj;
                                                }
                                            } else {
                                                zzezVar = zzezVar2;
                                                i45 = i54 == true ? 1 : 0;
                                                int iH2 = zzdu.h(i45 == true ? 1 : 0, bArr12, i57, i12, zzezVar, zzdtVar8);
                                                bArr12 = bArr12;
                                                iF4 = iH2;
                                            }
                                            zzey zzeyVarS2 = zzgaVar.s(iP);
                                            Class cls = zzgk.f9541a;
                                            if (zzeyVarS2 != null) {
                                                int size2 = zzezVar.size();
                                                zzha zzhaVarA2 = null;
                                                int i100 = 0;
                                                int i101 = 0;
                                                while (i100 < size2) {
                                                    int i102 = iF4;
                                                    Integer num = (Integer) zzezVar.get(i100);
                                                    zzey zzeyVar = zzeyVarS2;
                                                    int iIntValue = num.intValue();
                                                    if (zzeyVar.zza()) {
                                                        if (i100 != i101) {
                                                            zzezVar.set(i101, num);
                                                        }
                                                        i101++;
                                                        i48 = i19;
                                                        zzhaVar3 = zzhaVarA2;
                                                    } else {
                                                        zzgz zzgzVar = zzgaVar.f9527j;
                                                        if (zzhaVarA2 == null) {
                                                            zzhaVarA2 = zzgzVar.a(obj14);
                                                        }
                                                        zzhaVar3 = zzhaVarA2;
                                                        long j13 = iIntValue;
                                                        i48 = i19;
                                                        zzgzVar.d(j13, zzhaVar3, i48);
                                                    }
                                                    obj14 = obj;
                                                    i19 = i48;
                                                    i53 = i53;
                                                    zzeyVarS2 = zzeyVar;
                                                    zzhaVarA2 = zzhaVar3;
                                                    i100++;
                                                    iF4 = i102;
                                                }
                                                i46 = iF4;
                                                i53 = i53;
                                                i47 = i19;
                                                if (i101 != size2) {
                                                    zzezVar.subList(i101, size2).clear();
                                                }
                                            } else {
                                                i46 = iF4;
                                                i53 = i53;
                                                i47 = i19;
                                            }
                                            i54 = i45;
                                            bArr6 = bArr12;
                                            i36 = i12;
                                            i16 = i47;
                                            i35 = i57;
                                            iF = i46;
                                            zzdtVar7 = zzdtVar8;
                                            if (iF != i35) {
                                                bArr2 = bArr6;
                                                zzdtVar2 = zzdtVar7;
                                                i15 = i54 == true ? 1 : 0;
                                                obj2 = obj;
                                            } else {
                                                i12 = i36;
                                                i51 = i16;
                                                zzdtVar9 = zzdtVar7;
                                                iP = iP;
                                                i53 = i53;
                                                unsafe5 = unsafe;
                                                i52 = i14;
                                                i55 = 1048575;
                                                iE = iF;
                                                bArr11 = bArr6;
                                                obj6 = obj;
                                            }
                                            break;
                                        case 33:
                                        case 47:
                                            bArr9 = bArr;
                                            i49 = i12;
                                            zzdtVar8 = zzdtVar;
                                            i50 = i54 == true ? 1 : 0;
                                            i14 = i52;
                                            i44 = i57;
                                            zzhaVar = zzhaVar4;
                                            if (z11 != 2) {
                                                if (z11 == 0) {
                                                    zzew zzewVar5 = (zzew) zzezVar2;
                                                    iF5 = zzdu.f(bArr9, i44, zzdtVar8);
                                                    int i103 = zzdtVar8.f9472a;
                                                    zzewVar5.b((i103 >>> 1) ^ (-(i103 & 1)));
                                                    while (iF5 < i49) {
                                                        int iF18 = zzdu.f(bArr9, iF5, zzdtVar8);
                                                        if (i50 == zzdtVar8.f9472a) {
                                                            iF5 = zzdu.f(bArr9, iF18, zzdtVar8);
                                                            int i104 = zzdtVar8.f9472a;
                                                            zzewVar5.b((i104 >>> 1) ^ (-(i104 & 1)));
                                                        }
                                                    }
                                                }
                                                bArr6 = bArr9;
                                                i36 = i49;
                                                i35 = i44;
                                                i54 = i50;
                                                i16 = i19;
                                                zzdtVar7 = zzdtVar8;
                                                iF = i35;
                                                if (iF != i35) {
                                                    bArr2 = bArr6;
                                                    zzdtVar2 = zzdtVar7;
                                                    i15 = i54 == true ? 1 : 0;
                                                    obj2 = obj;
                                                } else {
                                                    i12 = i36;
                                                    i51 = i16;
                                                    zzdtVar9 = zzdtVar7;
                                                    iP = iP;
                                                    i53 = i53;
                                                    unsafe5 = unsafe;
                                                    i52 = i14;
                                                    i55 = 1048575;
                                                    iE = iF;
                                                    bArr11 = bArr6;
                                                    obj6 = obj;
                                                }
                                            } else {
                                                zzew zzewVar6 = (zzew) zzezVar2;
                                                iF5 = zzdu.f(bArr9, i44, zzdtVar8);
                                                int i105 = zzdtVar8.f9472a + iF5;
                                                while (iF5 < i105) {
                                                    iF5 = zzdu.f(bArr9, iF5, zzdtVar8);
                                                    int i106 = zzdtVar8.f9472a;
                                                    zzewVar6.b((i106 >>> 1) ^ (-(i106 & 1)));
                                                }
                                                if (iF5 != i105) {
                                                    throw zzfb.c();
                                                }
                                            }
                                            bArr6 = bArr9;
                                            i36 = i49;
                                            i54 = i50;
                                            i53 = i53;
                                            i16 = i19;
                                            iF = iF5;
                                            i35 = i44;
                                            zzdtVar7 = zzdtVar8;
                                            if (iF != i35) {
                                                bArr2 = bArr6;
                                                zzdtVar2 = zzdtVar7;
                                                i15 = i54 == true ? 1 : 0;
                                                obj2 = obj;
                                            } else {
                                                i12 = i36;
                                                i51 = i16;
                                                zzdtVar9 = zzdtVar7;
                                                iP = iP;
                                                i53 = i53;
                                                unsafe5 = unsafe;
                                                i52 = i14;
                                                i55 = 1048575;
                                                iE = iF;
                                                bArr11 = bArr6;
                                                obj6 = obj;
                                            }
                                            break;
                                        case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                                        case 48:
                                            bArr9 = bArr;
                                            i49 = i12;
                                            zzdtVar8 = zzdtVar;
                                            i50 = i54 == true ? 1 : 0;
                                            i14 = i52;
                                            i44 = i57;
                                            if (z11 != 2) {
                                                zzhaVar = zzhaVar4;
                                                if (z11 == 0) {
                                                    zzfm zzfmVar5 = (zzfm) zzezVar2;
                                                    iF5 = zzdu.i(bArr9, i44, zzdtVar8);
                                                    zzfmVar5.b(zzej.a(zzdtVar8.f9473b));
                                                    while (iF5 < i49) {
                                                        int iF19 = zzdu.f(bArr9, iF5, zzdtVar8);
                                                        if (i50 == zzdtVar8.f9472a) {
                                                            iF5 = zzdu.i(bArr9, iF19, zzdtVar8);
                                                            zzfmVar5.b(zzej.a(zzdtVar8.f9473b));
                                                        }
                                                    }
                                                }
                                                bArr6 = bArr9;
                                                i36 = i49;
                                                i35 = i44;
                                                i54 = i50;
                                                i16 = i19;
                                                zzdtVar7 = zzdtVar8;
                                                iF = i35;
                                                if (iF != i35) {
                                                    bArr2 = bArr6;
                                                    zzdtVar2 = zzdtVar7;
                                                    i15 = i54 == true ? 1 : 0;
                                                    obj2 = obj;
                                                } else {
                                                    i12 = i36;
                                                    i51 = i16;
                                                    zzdtVar9 = zzdtVar7;
                                                    iP = iP;
                                                    i53 = i53;
                                                    unsafe5 = unsafe;
                                                    i52 = i14;
                                                    i55 = 1048575;
                                                    iE = iF;
                                                    bArr11 = bArr6;
                                                    obj6 = obj;
                                                }
                                            } else {
                                                zzfm zzfmVar6 = (zzfm) zzezVar2;
                                                iF5 = zzdu.f(bArr9, i44, zzdtVar8);
                                                int i107 = zzdtVar8.f9472a + iF5;
                                                while (iF5 < i107) {
                                                    iF5 = zzdu.i(bArr9, iF5, zzdtVar8);
                                                    zzfmVar6.b(zzej.a(zzdtVar8.f9473b));
                                                    zzhaVar4 = zzhaVar4;
                                                }
                                                zzhaVar = zzhaVar4;
                                                if (iF5 != i107) {
                                                    throw zzfb.c();
                                                }
                                            }
                                            bArr6 = bArr9;
                                            i36 = i49;
                                            i54 = i50;
                                            i53 = i53;
                                            i16 = i19;
                                            iF = iF5;
                                            i35 = i44;
                                            zzdtVar7 = zzdtVar8;
                                            if (iF != i35) {
                                                bArr2 = bArr6;
                                                zzdtVar2 = zzdtVar7;
                                                i15 = i54 == true ? 1 : 0;
                                                obj2 = obj;
                                            } else {
                                                i12 = i36;
                                                i51 = i16;
                                                zzdtVar9 = zzdtVar7;
                                                iP = iP;
                                                i53 = i53;
                                                unsafe5 = unsafe;
                                                i52 = i14;
                                                i55 = 1048575;
                                                iE = iF;
                                                bArr11 = bArr6;
                                                obj6 = obj;
                                            }
                                            break;
                                        default:
                                            if (z11 == 3) {
                                                zzgi zzgiVarT = zzgaVar.t(iP);
                                                int i108 = ((i54 == true ? 1 : 0) & (-8)) | 4;
                                                zzdtVar8 = zzdtVar;
                                                int iC = zzdu.c(zzgiVarT, bArr, i57, i12, i108, zzdtVar8);
                                                zzezVar2.add(zzdtVar8.f9474c);
                                                while (true) {
                                                    if (iC < i12) {
                                                        int iF20 = zzdu.f(bArr, iC, zzdtVar8);
                                                        zzgi zzgiVar = zzgiVarT;
                                                        if (i54 == zzdtVar8.f9472a) {
                                                            zzgiVarT = zzgiVar;
                                                            iC = zzdu.c(zzgiVarT, bArr, iF20, i12, i108, zzdtVar8);
                                                            zzezVar2.add(zzdtVar8.f9474c);
                                                            i52 = i52;
                                                        } else {
                                                            bArr10 = bArr;
                                                        }
                                                    } else {
                                                        bArr10 = bArr;
                                                    }
                                                }
                                                i14 = i52;
                                                bArr6 = bArr10;
                                                i36 = i12;
                                                iF = iC;
                                                zzhaVar = zzhaVar4;
                                                i35 = i57;
                                                i54 = i54 == true ? 1 : 0;
                                                i53 = i53;
                                                i16 = i19;
                                                zzdtVar7 = zzdtVar8;
                                                if (iF != i35) {
                                                    bArr2 = bArr6;
                                                    zzdtVar2 = zzdtVar7;
                                                    i15 = i54 == true ? 1 : 0;
                                                    obj2 = obj;
                                                } else {
                                                    i12 = i36;
                                                    i51 = i16;
                                                    zzdtVar9 = zzdtVar7;
                                                    iP = iP;
                                                    i53 = i53;
                                                    unsafe5 = unsafe;
                                                    i52 = i14;
                                                    i55 = 1048575;
                                                    iE = iF;
                                                    bArr11 = bArr6;
                                                    obj6 = obj;
                                                }
                                            } else {
                                                i14 = i52;
                                                bArr6 = bArr;
                                                zzdtVar7 = zzdtVar;
                                                i54 = i54 == true ? 1 : 0;
                                                i53 = i53;
                                                i35 = i57;
                                                i36 = i12;
                                                zzhaVar = zzhaVar4;
                                                i16 = i19;
                                                iF = i35;
                                                if (iF != i35) {
                                                    bArr2 = bArr6;
                                                    zzdtVar2 = zzdtVar7;
                                                    i15 = i54 == true ? 1 : 0;
                                                    obj2 = obj;
                                                } else {
                                                    i12 = i36;
                                                    i51 = i16;
                                                    zzdtVar9 = zzdtVar7;
                                                    iP = iP;
                                                    i53 = i53;
                                                    unsafe5 = unsafe;
                                                    i52 = i14;
                                                    i55 = 1048575;
                                                    iE = iF;
                                                    bArr11 = bArr6;
                                                    obj6 = obj;
                                                }
                                            }
                                            break;
                                    }
                                } else {
                                    zzhaVar = zzhaVar4;
                                    i16 = i19;
                                    i29 = i57;
                                    i54 = i54 == true ? 1 : 0;
                                    i14 = i52;
                                    i53 = i53;
                                    zzdtVar5 = zzdtVar;
                                    unsafe4 = unsafe11;
                                    if (iQ != 50) {
                                        Unsafe unsafe13 = f9517l;
                                        long j14 = iArr[iP + 2] & 1048575;
                                        switch (iQ) {
                                            case 51:
                                                iP = iP;
                                                i30 = i29;
                                                bArr2 = bArr;
                                                zzdtVar2 = zzdtVar5;
                                                unsafe = unsafe4;
                                                i15 = i54 == true ? 1 : 0;
                                                obj2 = obj;
                                                if (z11 == 1) {
                                                    unsafe13.putObject(obj2, j11, Double.valueOf(Double.longBitsToDouble(zzdu.l(bArr2, i30))));
                                                    i31 = i30 + 8;
                                                    unsafe13.putInt(obj2, j14, i16);
                                                } else {
                                                    i31 = i30;
                                                }
                                                if (i31 != i30) {
                                                    int i109 = i31;
                                                    zzdtVar9 = zzdtVar2;
                                                    iE = i109;
                                                    zzgaVar = this;
                                                    i12 = i12;
                                                    bArr11 = bArr2;
                                                    i51 = i16;
                                                    obj6 = obj2;
                                                    i54 = i15 == true ? 1 : 0;
                                                    iP = iP;
                                                    i53 = i53;
                                                    unsafe5 = unsafe;
                                                    i52 = i14;
                                                } else {
                                                    iF = i31;
                                                    iP = iP;
                                                }
                                                break;
                                            case 52:
                                                iP = iP;
                                                i30 = i29;
                                                bArr2 = bArr;
                                                zzdtVar2 = zzdtVar5;
                                                unsafe = unsafe4;
                                                i15 = i54 == true ? 1 : 0;
                                                obj2 = obj;
                                                if (z11 == 5) {
                                                    unsafe13.putObject(obj2, j11, Float.valueOf(Float.intBitsToFloat(zzdu.b(bArr2, i30))));
                                                    i31 = i30 + 4;
                                                    unsafe13.putInt(obj2, j14, i16);
                                                } else {
                                                    i31 = i30;
                                                }
                                                if (i31 != i30) {
                                                    int i1010 = i31;
                                                    zzdtVar9 = zzdtVar2;
                                                    iE = i1010;
                                                    zzgaVar = this;
                                                    i12 = i12;
                                                    bArr11 = bArr2;
                                                    i51 = i16;
                                                    obj6 = obj2;
                                                    i54 = i15 == true ? 1 : 0;
                                                    iP = iP;
                                                    i53 = i53;
                                                    unsafe5 = unsafe;
                                                    i52 = i14;
                                                } else {
                                                    iF = i31;
                                                    iP = iP;
                                                }
                                                break;
                                            case 53:
                                            case 54:
                                                iP = iP;
                                                i30 = i29;
                                                bArr2 = bArr;
                                                zzdtVar2 = zzdtVar5;
                                                unsafe = unsafe4;
                                                i15 = i54 == true ? 1 : 0;
                                                obj2 = obj;
                                                if (z11 == 0) {
                                                    i32 = zzdu.i(bArr2, i30, zzdtVar2);
                                                    unsafe13.putObject(obj2, j11, Long.valueOf(zzdtVar2.f9473b));
                                                    unsafe13.putInt(obj2, j14, i16);
                                                    i31 = i32;
                                                } else {
                                                    i31 = i30;
                                                }
                                                if (i31 != i30) {
                                                    int i1011 = i31;
                                                    zzdtVar9 = zzdtVar2;
                                                    iE = i1011;
                                                    zzgaVar = this;
                                                    i12 = i12;
                                                    bArr11 = bArr2;
                                                    i51 = i16;
                                                    obj6 = obj2;
                                                    i54 = i15 == true ? 1 : 0;
                                                    iP = iP;
                                                    i53 = i53;
                                                    unsafe5 = unsafe;
                                                    i52 = i14;
                                                } else {
                                                    iF = i31;
                                                    iP = iP;
                                                }
                                                break;
                                            case 55:
                                            case 62:
                                                iP = iP;
                                                i30 = i29;
                                                bArr2 = bArr;
                                                zzdtVar2 = zzdtVar5;
                                                unsafe = unsafe4;
                                                i15 = i54 == true ? 1 : 0;
                                                obj2 = obj;
                                                if (z11 == 0) {
                                                    i32 = zzdu.f(bArr2, i30, zzdtVar2);
                                                    unsafe13.putObject(obj2, j11, Integer.valueOf(zzdtVar2.f9472a));
                                                    unsafe13.putInt(obj2, j14, i16);
                                                    i31 = i32;
                                                } else {
                                                    i31 = i30;
                                                }
                                                if (i31 != i30) {
                                                    int i1012 = i31;
                                                    zzdtVar9 = zzdtVar2;
                                                    iE = i1012;
                                                    zzgaVar = this;
                                                    i12 = i12;
                                                    bArr11 = bArr2;
                                                    i51 = i16;
                                                    obj6 = obj2;
                                                    i54 = i15 == true ? 1 : 0;
                                                    iP = iP;
                                                    i53 = i53;
                                                    unsafe5 = unsafe;
                                                    i52 = i14;
                                                } else {
                                                    iF = i31;
                                                    iP = iP;
                                                }
                                                break;
                                            case 56:
                                            case 65:
                                                iP = iP;
                                                i30 = i29;
                                                bArr2 = bArr;
                                                zzdtVar2 = zzdtVar5;
                                                unsafe = unsafe4;
                                                i15 = i54 == true ? 1 : 0;
                                                obj2 = obj;
                                                if (z11 == 1) {
                                                    unsafe13.putObject(obj2, j11, Long.valueOf(zzdu.l(bArr2, i30)));
                                                    i31 = i30 + 8;
                                                    unsafe13.putInt(obj2, j14, i16);
                                                } else {
                                                    i31 = i30;
                                                }
                                                if (i31 != i30) {
                                                    int i1013 = i31;
                                                    zzdtVar9 = zzdtVar2;
                                                    iE = i1013;
                                                    zzgaVar = this;
                                                    i12 = i12;
                                                    bArr11 = bArr2;
                                                    i51 = i16;
                                                    obj6 = obj2;
                                                    i54 = i15 == true ? 1 : 0;
                                                    iP = iP;
                                                    i53 = i53;
                                                    unsafe5 = unsafe;
                                                    i52 = i14;
                                                } else {
                                                    iF = i31;
                                                    iP = iP;
                                                }
                                                break;
                                            case 57:
                                            case 64:
                                                iP = iP;
                                                i30 = i29;
                                                bArr2 = bArr;
                                                zzdtVar2 = zzdtVar5;
                                                unsafe = unsafe4;
                                                i15 = i54 == true ? 1 : 0;
                                                obj2 = obj;
                                                if (z11 == 5) {
                                                    unsafe13.putObject(obj2, j11, Integer.valueOf(zzdu.b(bArr2, i30)));
                                                    i31 = i30 + 4;
                                                    unsafe13.putInt(obj2, j14, i16);
                                                } else {
                                                    i31 = i30;
                                                }
                                                if (i31 != i30) {
                                                    int i1014 = i31;
                                                    zzdtVar9 = zzdtVar2;
                                                    iE = i1014;
                                                    zzgaVar = this;
                                                    i12 = i12;
                                                    bArr11 = bArr2;
                                                    i51 = i16;
                                                    obj6 = obj2;
                                                    i54 = i15 == true ? 1 : 0;
                                                    iP = iP;
                                                    i53 = i53;
                                                    unsafe5 = unsafe;
                                                    i52 = i14;
                                                } else {
                                                    iF = i31;
                                                    iP = iP;
                                                }
                                                break;
                                            case 58:
                                                iP = iP;
                                                i30 = i29;
                                                bArr2 = bArr;
                                                zzdtVar2 = zzdtVar5;
                                                unsafe = unsafe4;
                                                i15 = i54 == true ? 1 : 0;
                                                obj2 = obj;
                                                if (z11 == 0) {
                                                    i32 = zzdu.i(bArr2, i30, zzdtVar2);
                                                    unsafe13.putObject(obj2, j11, Boolean.valueOf(zzdtVar2.f9473b != 0));
                                                    unsafe13.putInt(obj2, j14, i16);
                                                    i31 = i32;
                                                } else {
                                                    i31 = i30;
                                                }
                                                if (i31 != i30) {
                                                    int i1015 = i31;
                                                    zzdtVar9 = zzdtVar2;
                                                    iE = i1015;
                                                    zzgaVar = this;
                                                    i12 = i12;
                                                    bArr11 = bArr2;
                                                    i51 = i16;
                                                    obj6 = obj2;
                                                    i54 = i15 == true ? 1 : 0;
                                                    iP = iP;
                                                    i53 = i53;
                                                    unsafe5 = unsafe;
                                                    i52 = i14;
                                                } else {
                                                    iF = i31;
                                                    iP = iP;
                                                }
                                                break;
                                            case 59:
                                                iP = iP;
                                                i30 = i29;
                                                bArr2 = bArr;
                                                zzdtVar2 = zzdtVar5;
                                                unsafe = unsafe4;
                                                i15 = i54 == true ? 1 : 0;
                                                obj2 = obj;
                                                if (z11 == 2) {
                                                    iF2 = zzdu.f(bArr2, i30, zzdtVar2);
                                                    int i110 = zzdtVar2.f9472a;
                                                    if (i110 == 0) {
                                                        unsafe13.putObject(obj2, j11, BuildConfig.VERSION_NAME);
                                                    } else {
                                                        if ((i61 & 536870912) != 0) {
                                                            if (!zzhn.f9576a.b(bArr2, iF2, iF2 + i110)) {
                                                                throw zzfb.a();
                                                            }
                                                        }
                                                        unsafe13.putObject(obj2, j11, new String(bArr2, iF2, i110, zzfa.f9501a));
                                                        iF2 += i110;
                                                    }
                                                    unsafe13.putInt(obj2, j14, i16);
                                                    i31 = iF2;
                                                } else {
                                                    i31 = i30;
                                                }
                                                if (i31 != i30) {
                                                    int i1016 = i31;
                                                    zzdtVar9 = zzdtVar2;
                                                    iE = i1016;
                                                    zzgaVar = this;
                                                    i12 = i12;
                                                    bArr11 = bArr2;
                                                    i51 = i16;
                                                    obj6 = obj2;
                                                    i54 = i15 == true ? 1 : 0;
                                                    iP = iP;
                                                    i53 = i53;
                                                    unsafe5 = unsafe;
                                                    i52 = i14;
                                                } else {
                                                    iF = i31;
                                                    iP = iP;
                                                }
                                                break;
                                            case 60:
                                                bArr2 = bArr;
                                                unsafe = unsafe4;
                                                i15 = i54 == true ? 1 : 0;
                                                obj2 = obj;
                                                if (z11 == 2) {
                                                    Object objV = zzgaVar.v(i16, iP, obj2);
                                                    int iK2 = zzdu.k(objV, zzgaVar.t(iP), bArr, i29, i12, zzdtVar5);
                                                    bArr2 = bArr;
                                                    zzdtVar2 = zzdtVar5;
                                                    zzgaVar.h(obj2, i16, iP, objV);
                                                    i31 = iK2;
                                                    iP = iP;
                                                    i30 = i29;
                                                } else {
                                                    zzdtVar2 = zzdtVar5;
                                                    iP = iP;
                                                    i30 = i29;
                                                    i31 = i30;
                                                }
                                                if (i31 != i30) {
                                                    int i1017 = i31;
                                                    zzdtVar9 = zzdtVar2;
                                                    iE = i1017;
                                                    zzgaVar = this;
                                                    i12 = i12;
                                                    bArr11 = bArr2;
                                                    i51 = i16;
                                                    obj6 = obj2;
                                                    i54 = i15 == true ? 1 : 0;
                                                    iP = iP;
                                                    i53 = i53;
                                                    unsafe5 = unsafe;
                                                    i52 = i14;
                                                } else {
                                                    iF = i31;
                                                    iP = iP;
                                                }
                                                break;
                                            case 61:
                                                bArr2 = bArr;
                                                zzdtVar6 = zzdtVar5;
                                                unsafe = unsafe4;
                                                i15 = i54 == true ? 1 : 0;
                                                i33 = i29;
                                                obj2 = obj;
                                                if (z11 == 2) {
                                                    iF2 = zzdu.a(bArr2, i33, zzdtVar6);
                                                    unsafe13.putObject(obj2, j11, zzdtVar6.f9474c);
                                                    unsafe13.putInt(obj2, j14, i16);
                                                    iP = iP;
                                                    i30 = i33;
                                                    zzdtVar2 = zzdtVar6;
                                                    i31 = iF2;
                                                    if (i31 != i30) {
                                                        int i1018 = i31;
                                                        zzdtVar9 = zzdtVar2;
                                                        iE = i1018;
                                                        zzgaVar = this;
                                                        i12 = i12;
                                                        bArr11 = bArr2;
                                                        i51 = i16;
                                                        obj6 = obj2;
                                                        i54 = i15 == true ? 1 : 0;
                                                        iP = iP;
                                                        i53 = i53;
                                                        unsafe5 = unsafe;
                                                        i52 = i14;
                                                    } else {
                                                        iF = i31;
                                                        iP = iP;
                                                    }
                                                }
                                                i30 = i33;
                                                zzdtVar2 = zzdtVar6;
                                                i31 = i30;
                                                if (i31 != i30) {
                                                    int i1019 = i31;
                                                    zzdtVar9 = zzdtVar2;
                                                    iE = i1019;
                                                    zzgaVar = this;
                                                    i12 = i12;
                                                    bArr11 = bArr2;
                                                    i51 = i16;
                                                    obj6 = obj2;
                                                    i54 = i15 == true ? 1 : 0;
                                                    iP = iP;
                                                    i53 = i53;
                                                    unsafe5 = unsafe;
                                                    i52 = i14;
                                                } else {
                                                    iF = i31;
                                                    iP = iP;
                                                }
                                                break;
                                            case 63:
                                                bArr2 = bArr;
                                                zzdtVar6 = zzdtVar5;
                                                unsafe = unsafe4;
                                                i33 = i29;
                                                obj2 = obj;
                                                i34 = i54 == true ? 1 : 0;
                                                if (z11 == 0) {
                                                    int iF21 = zzdu.f(bArr2, i33, zzdtVar6);
                                                    int i111 = zzdtVar6.f9472a;
                                                    zzey zzeyVarS3 = zzgaVar.s(iP);
                                                    if (zzeyVarS3 == null || zzeyVarS3.zza()) {
                                                        zzhaVar2 = zzhaVar;
                                                        i15 = i34 == true ? 1 : 0;
                                                        unsafe13.putObject(obj2, j11, Integer.valueOf(i111));
                                                        unsafe13.putInt(obj2, j14, i16);
                                                    } else {
                                                        zzev zzevVar2 = (zzev) obj2;
                                                        zzha zzhaVarA3 = zzevVar2.zzc;
                                                        zzhaVar2 = zzhaVar;
                                                        if (zzhaVarA3 == zzhaVar2) {
                                                            zzhaVarA3 = zzha.a();
                                                            zzevVar2.zzc = zzhaVarA3;
                                                        }
                                                        zzhaVarA3.b(i34 == true ? 1 : 0, Long.valueOf(i111));
                                                        i15 = i34 == true ? 1 : 0;
                                                    }
                                                    int i112 = iP;
                                                    i30 = i33;
                                                    zzdtVar2 = zzdtVar6;
                                                    i31 = iF21;
                                                    iP = i112;
                                                    zzhaVar = zzhaVar2;
                                                } else {
                                                    i15 = i34;
                                                    i30 = i33;
                                                    zzdtVar2 = zzdtVar6;
                                                    i31 = i30;
                                                }
                                                if (i31 != i30) {
                                                    int i10110 = i31;
                                                    zzdtVar9 = zzdtVar2;
                                                    iE = i10110;
                                                    zzgaVar = this;
                                                    i12 = i12;
                                                    bArr11 = bArr2;
                                                    i51 = i16;
                                                    obj6 = obj2;
                                                    i54 = i15 == true ? 1 : 0;
                                                    iP = iP;
                                                    i53 = i53;
                                                    unsafe5 = unsafe;
                                                    i52 = i14;
                                                } else {
                                                    iF = i31;
                                                    iP = iP;
                                                }
                                                break;
                                            case 66:
                                                bArr2 = bArr;
                                                zzdtVar6 = zzdtVar5;
                                                unsafe = unsafe4;
                                                i33 = i29;
                                                obj2 = obj;
                                                i34 = i54 == true ? 1 : 0;
                                                if (z11 == 0) {
                                                    iF2 = zzdu.f(bArr2, i33, zzdtVar6);
                                                    int i113 = zzdtVar6.f9472a;
                                                    unsafe13.putObject(obj2, j11, Integer.valueOf((i113 >>> 1) ^ (-(i113 & 1))));
                                                    unsafe13.putInt(obj2, j14, i16);
                                                    i15 = i34;
                                                    iP = iP;
                                                    i30 = i33;
                                                    zzdtVar2 = zzdtVar6;
                                                    i31 = iF2;
                                                    if (i31 != i30) {
                                                        int i10111 = i31;
                                                        zzdtVar9 = zzdtVar2;
                                                        iE = i10111;
                                                        zzgaVar = this;
                                                        i12 = i12;
                                                        bArr11 = bArr2;
                                                        i51 = i16;
                                                        obj6 = obj2;
                                                        i54 = i15 == true ? 1 : 0;
                                                        iP = iP;
                                                        i53 = i53;
                                                        unsafe5 = unsafe;
                                                        i52 = i14;
                                                    } else {
                                                        iF = i31;
                                                        iP = iP;
                                                    }
                                                }
                                                i15 = i34;
                                                i30 = i33;
                                                zzdtVar2 = zzdtVar6;
                                                i31 = i30;
                                                if (i31 != i30) {
                                                    int i10112 = i31;
                                                    zzdtVar9 = zzdtVar2;
                                                    iE = i10112;
                                                    zzgaVar = this;
                                                    i12 = i12;
                                                    bArr11 = bArr2;
                                                    i51 = i16;
                                                    obj6 = obj2;
                                                    i54 = i15 == true ? 1 : 0;
                                                    iP = iP;
                                                    i53 = i53;
                                                    unsafe5 = unsafe;
                                                    i52 = i14;
                                                } else {
                                                    iF = i31;
                                                    iP = iP;
                                                }
                                                break;
                                            case 67:
                                                bArr2 = bArr;
                                                zzdtVar6 = zzdtVar5;
                                                i33 = i29;
                                                obj2 = obj;
                                                if (z11 == 0) {
                                                    iF2 = zzdu.i(bArr2, i33, zzdtVar6);
                                                    unsafe = unsafe4;
                                                    i34 = i54 == true ? 1 : 0;
                                                    unsafe13.putObject(obj2, j11, Long.valueOf(zzej.a(zzdtVar6.f9473b)));
                                                    unsafe13.putInt(obj2, j14, i16);
                                                    i15 = i34;
                                                    iP = iP;
                                                    i30 = i33;
                                                    zzdtVar2 = zzdtVar6;
                                                    i31 = iF2;
                                                    if (i31 != i30) {
                                                        int i10113 = i31;
                                                        zzdtVar9 = zzdtVar2;
                                                        iE = i10113;
                                                        zzgaVar = this;
                                                        i12 = i12;
                                                        bArr11 = bArr2;
                                                        i51 = i16;
                                                        obj6 = obj2;
                                                        i54 = i15 == true ? 1 : 0;
                                                        iP = iP;
                                                        i53 = i53;
                                                        unsafe5 = unsafe;
                                                        i52 = i14;
                                                    } else {
                                                        iF = i31;
                                                        iP = iP;
                                                    }
                                                } else {
                                                    unsafe = unsafe4;
                                                    i15 = i54 == true ? 1 : 0;
                                                    i30 = i33;
                                                    zzdtVar2 = zzdtVar6;
                                                    i31 = i30;
                                                    if (i31 != i30) {
                                                        int i10114 = i31;
                                                        zzdtVar9 = zzdtVar2;
                                                        iE = i10114;
                                                        zzgaVar = this;
                                                        i12 = i12;
                                                        bArr11 = bArr2;
                                                        i51 = i16;
                                                        obj6 = obj2;
                                                        i54 = i15 == true ? 1 : 0;
                                                        iP = iP;
                                                        i53 = i53;
                                                        unsafe5 = unsafe;
                                                        i52 = i14;
                                                    } else {
                                                        iF = i31;
                                                        iP = iP;
                                                    }
                                                }
                                                break;
                                            case 68:
                                                if (z11 == 3) {
                                                    Object objV2 = zzgaVar.v(i16, iP, obj);
                                                    obj2 = obj;
                                                    int iJ2 = zzdu.j(objV2, zzgaVar.t(iP), bArr, i29, i12, ((i54 == true ? 1 : 0) & (-8)) | 4, zzdtVar5);
                                                    bArr2 = bArr;
                                                    zzgaVar.h(obj2, i16, iP, objV2);
                                                    iP = iP;
                                                    unsafe = unsafe4;
                                                    i15 = i54 == true ? 1 : 0;
                                                    i30 = i29;
                                                    zzdtVar2 = zzdtVar5;
                                                    i31 = iJ2;
                                                } else {
                                                    obj2 = obj;
                                                    iP = iP;
                                                    i30 = i29;
                                                    bArr2 = bArr;
                                                    zzdtVar2 = zzdtVar5;
                                                    unsafe = unsafe4;
                                                    i15 = i54 == true ? 1 : 0;
                                                    i31 = i30;
                                                }
                                                if (i31 != i30) {
                                                    int i10115 = i31;
                                                    zzdtVar9 = zzdtVar2;
                                                    iE = i10115;
                                                    zzgaVar = this;
                                                    i12 = i12;
                                                    bArr11 = bArr2;
                                                    i51 = i16;
                                                    obj6 = obj2;
                                                    i54 = i15 == true ? 1 : 0;
                                                    iP = iP;
                                                    i53 = i53;
                                                    unsafe5 = unsafe;
                                                    i52 = i14;
                                                } else {
                                                    iF = i31;
                                                    iP = iP;
                                                }
                                                break;
                                            default:
                                                iP = iP;
                                                i30 = i29;
                                                bArr2 = bArr;
                                                zzdtVar2 = zzdtVar5;
                                                unsafe = unsafe4;
                                                i15 = i54 == true ? 1 : 0;
                                                obj2 = obj;
                                                i31 = i30;
                                                if (i31 != i30) {
                                                    int i10116 = i31;
                                                    zzdtVar9 = zzdtVar2;
                                                    iE = i10116;
                                                    zzgaVar = this;
                                                    i12 = i12;
                                                    bArr11 = bArr2;
                                                    i51 = i16;
                                                    obj6 = obj2;
                                                    i54 = i15 == true ? 1 : 0;
                                                    iP = iP;
                                                    i53 = i53;
                                                    unsafe5 = unsafe;
                                                    i52 = i14;
                                                } else {
                                                    iF = i31;
                                                    iP = iP;
                                                }
                                                break;
                                        }
                                    } else {
                                        if (z11 == 2) {
                                            Unsafe unsafe14 = f9517l;
                                            int i114 = iP / 3;
                                            Object obj15 = objArr[i114 + i114];
                                            Object object = unsafe14.getObject(obj, j11);
                                            if (!((zzfr) object).f9513a) {
                                                zzfr zzfrVarA = zzfr.f9512b.a();
                                                zzfs.a(zzfrVarA, object);
                                                unsafe14.putObject(obj, j11, zzfrVarA);
                                            }
                                            throw null;
                                        }
                                        obj5 = obj;
                                    }
                                }
                            } else if (z11 == 2) {
                                zzez zzezVarZzd2 = (zzez) unsafe11.getObject(obj13, j11);
                                if (!zzezVarZzd2.zzc()) {
                                    int size3 = zzezVarZzd2.size();
                                    zzezVarZzd2 = zzezVarZzd2.zzd(size3 != 0 ? size3 + size3 : 10);
                                    unsafe11.putObject(obj13, j11, zzezVarZzd2);
                                }
                                int iD2 = zzdu.d(zzgaVar.t(iP), i54 == true ? 1 : 0, bArr, i57, i12, zzezVarZzd2, zzdtVar);
                                i54 = i54 == true ? 1 : 0;
                                obj6 = obj;
                                bArr11 = bArr;
                                i12 = i12;
                                zzdtVar9 = zzdtVar;
                                iE = iD2;
                                iP = iP;
                                unsafe5 = unsafe11;
                                i51 = i19;
                            } else {
                                zzhaVar = zzhaVar4;
                                i16 = i19;
                                i29 = i57;
                                obj5 = obj13;
                                i14 = i52;
                                i53 = i53;
                                zzdtVar5 = zzdtVar;
                                unsafe4 = unsafe11;
                            }
                            bArr2 = bArr;
                            zzdtVar2 = zzdtVar5;
                            unsafe = unsafe4;
                            i15 = i54;
                            obj2 = obj5;
                            iF = i29;
                        }
                    }
                    if (i15 != i13 || i13 == 0) {
                        zzev zzevVar3 = (zzev) obj2;
                        zzha zzhaVarA4 = zzevVar3.zzc;
                        if (zzhaVarA4 == zzhaVar) {
                            zzhaVarA4 = zzha.a();
                            zzevVar3.zzc = zzhaVarA4;
                        }
                        i12 = i12;
                        zzdt zzdtVar10 = zzdtVar2;
                        zzha zzhaVar5 = zzhaVarA4;
                        byte[] bArr13 = bArr2;
                        int i115 = i15;
                        iE = zzdu.e(i115 == true ? 1 : 0, bArr13, iF, i12, zzhaVar5, zzdtVar10);
                        i55 = 1048575;
                        zzgaVar = this;
                        bArr11 = bArr;
                        zzdtVar9 = zzdtVar;
                        i54 = i115 == true ? 1 : 0;
                        i51 = i16;
                        obj6 = obj2;
                        iP = iP;
                        i53 = i53;
                        unsafe5 = unsafe;
                        i52 = i14;
                    } else {
                        i12 = i12;
                        iE = iF;
                        obj6 = obj2;
                        i54 = i15;
                        i53 = i53;
                        i52 = i14;
                    }
                } else {
                    unsafe = unsafe5;
                    iArr = iArr2;
                    objArr = objArr;
                }
            }
        }
        if (i52 != 1048575) {
            unsafe.putInt(obj6, i52, i53);
        }
        for (int i116 = this.f9524g; i116 < this.f9525h; i116++) {
            int i117 = this.f9523f[i116];
            int i118 = iArr[i117];
            Object objD = zzhj.d(obj6, r(i117) & 1048575);
            if (objD != null && s(i117) != null) {
                int i119 = i117 / 3;
                throw null;
            }
        }
        if (i13 == 0) {
            if (iE != i12) {
                throw new zzfb("Failed to parse the message.");
            }
        } else if (iE > i12 || i54 != i13) {
            throw new zzfb("Failed to parse the message.");
        }
        return iE;
    }

    public final int p(int i11, int i12) {
        int[] iArr = this.f9518a;
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

    public final int r(int i11) {
        return this.f9518a[i11 + 1];
    }

    public final zzey s(int i11) {
        int i12 = i11 / 3;
        return (zzey) this.f9519b[i12 + i12 + 1];
    }

    public final zzgi t(int i11) {
        int i12 = i11 / 3;
        int i13 = i12 + i12;
        Object[] objArr = this.f9519b;
        zzgi zzgiVar = (zzgi) objArr[i13];
        if (zzgiVar != null) {
            return zzgiVar;
        }
        zzgi zzgiVarA = zzgf.f9532c.a((Class) objArr[i13 + 1]);
        objArr[i13] = zzgiVarA;
        return zzgiVarA;
    }

    public final Object u(int i11, Object obj) {
        zzgi zzgiVarT = t(i11);
        int iR = r(i11) & 1048575;
        if (!j(i11, obj)) {
            return zzgiVarT.zzd();
        }
        Object object = f9517l.getObject(obj, iR);
        if (k(object)) {
            return object;
        }
        zzev zzevVarZzd = zzgiVarT.zzd();
        if (object != null) {
            zzgiVarT.e(zzevVarZzd, object);
        }
        return zzevVarZzd;
    }

    public final Object v(int i11, int i12, Object obj) {
        zzgi zzgiVarT = t(i12);
        if (!l(i11, i12, obj)) {
            return zzgiVarT.zzd();
        }
        Object object = f9517l.getObject(obj, r(i12) & 1048575);
        if (k(object)) {
            return object;
        }
        zzev zzevVarZzd = zzgiVarT.zzd();
        if (object != null) {
            zzgiVarT.e(zzevVarZzd, object);
        }
        return zzevVarZzd;
    }

    public final void x(int i11, Object obj, Object obj2) {
        if (j(i11, obj2)) {
            int iR = r(i11) & 1048575;
            Unsafe unsafe = f9517l;
            long j11 = iR;
            Object object = unsafe.getObject(obj2, j11);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f9518a[i11] + " is present but null: " + obj2.toString());
            }
            zzgi zzgiVarT = t(i11);
            if (!j(i11, obj)) {
                if (k(object)) {
                    zzev zzevVarZzd = zzgiVarT.zzd();
                    zzgiVarT.e(zzevVarZzd, object);
                    unsafe.putObject(obj, j11, zzevVarZzd);
                } else {
                    unsafe.putObject(obj, j11, object);
                }
                z(i11, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j11);
            if (!k(object2)) {
                zzev zzevVarZzd2 = zzgiVarT.zzd();
                zzgiVarT.e(zzevVarZzd2, object2);
                unsafe.putObject(obj, j11, zzevVarZzd2);
                object2 = zzevVarZzd2;
            }
            zzgiVarT.e(object2, object);
        }
    }

    public final void y(int i11, Object obj, Object obj2) {
        int[] iArr = this.f9518a;
        int i12 = iArr[i11];
        if (l(i12, i11, obj2)) {
            int iR = r(i11) & 1048575;
            Unsafe unsafe = f9517l;
            long j11 = iR;
            Object object = unsafe.getObject(obj2, j11);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i11] + " is present but null: " + obj2.toString());
            }
            zzgi zzgiVarT = t(i11);
            if (!l(i12, i11, obj)) {
                if (k(object)) {
                    zzev zzevVarZzd = zzgiVarT.zzd();
                    zzgiVarT.e(zzevVarZzd, object);
                    unsafe.putObject(obj, j11, zzevVarZzd);
                } else {
                    unsafe.putObject(obj, j11, object);
                }
                zzhj.h(iArr[i11 + 2] & 1048575, obj, i12);
                return;
            }
            Object object2 = unsafe.getObject(obj, j11);
            if (!k(object2)) {
                zzev zzevVarZzd2 = zzgiVarT.zzd();
                zzgiVarT.e(zzevVarZzd2, object2);
                unsafe.putObject(obj, j11, zzevVarZzd2);
                object2 = zzevVarZzd2;
            }
            zzgiVarT.e(object2, object);
        }
    }

    public final void z(int i11, Object obj) {
        int i12 = this.f9518a[i11 + 2];
        long j11 = 1048575 & i12;
        if (j11 == 1048575) {
            return;
        }
        zzhj.h(j11, obj, (1 << (i12 >>> 20)) | zzhj.a(obj, j11));
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final zzev zzd() {
        return (zzev) ((zzev) this.f9522e).g(4);
    }
}
