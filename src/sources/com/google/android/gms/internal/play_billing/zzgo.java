package com.google.android.gms.internal.play_billing;

import b7.e0;
import com.google.api.Service;
import com.google.protobuf.DescriptorProtos;
import com.stkouyu.util.httputil.Consts;
import defpackage.e;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzgo<T> implements zzgv<T> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int[] f12401l = new int[0];
    public static final Unsafe m = zzho.i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f12402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f12403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f12404c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f12405d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final zzgl f12406e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f12407f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f12408g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f12409h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f12410i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final zzhh f12411j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final zzev f12412k;

    public zzgo(int[] iArr, Object[] objArr, int i11, int i12, zzgl zzglVar, int[] iArr2, int i13, int i14, zzhh zzhhVar, zzev zzevVar) {
        this.f12402a = iArr;
        this.f12403b = objArr;
        this.f12404c = i11;
        this.f12405d = i12;
        boolean z11 = false;
        if (zzevVar != null && (zzglVar instanceof zzff)) {
            z11 = true;
        }
        this.f12407f = z11;
        this.f12408g = iArr2;
        this.f12409h = i13;
        this.f12410i = i14;
        this.f12411j = zzhhVar;
        this.f12412k = zzevVar;
        this.f12406e = zzglVar;
    }

    public static Field C(Class cls, String str) {
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
            StringBuilder sbS = e.s("Field ", str, " for ", name, " not found. Known fields are ");
            sbS.append(string);
            throw new RuntimeException(sbS.toString(), e8);
        }
    }

    public static boolean o(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzfi) {
            return ((zzfi) obj).o();
        }
        return true;
    }

    public static zzhi r(Object obj) {
        zzfi zzfiVar = (zzfi) obj;
        zzhi zzhiVar = zzfiVar.zzc;
        if (zzhiVar != zzhi.f12449f) {
            return zzhiVar;
        }
        zzhi zzhiVarB = zzhi.b();
        zzfiVar.zzc = zzhiVarB;
        return zzhiVarB;
    }

    /* JADX WARN: Code duplicated, block: B:170:0x036b  */
    /* JADX WARN: Code duplicated, block: B:186:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:189:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:193:0x03d5  */
    public static zzgo s(zzgi zzgiVar, zzhh zzhhVar, zzew zzewVar) {
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
        Object[] objArr;
        int i27;
        int i28;
        int i29;
        int iObjectFieldOffset;
        int i30;
        int i31;
        int i32;
        Field fieldC;
        char cCharAt9;
        int i33;
        int i34;
        int i35;
        int i36;
        Field fieldC2;
        Field fieldC3;
        int i37;
        char cCharAt10;
        int i38;
        int i39;
        char cCharAt11;
        int i40;
        int i41;
        char cCharAt12;
        int i42;
        char cCharAt13;
        if (!(zzgiVar instanceof zzgu)) {
            throw null;
        }
        zzgu zzguVar = (zzgu) zzgiVar;
        String str = zzguVar.f12426b;
        int length = str.length();
        if (str.charAt(0) >= 55296) {
            int i43 = 1;
            while (true) {
                i11 = i43 + 1;
                if (str.charAt(i43) < 55296) {
                    break;
                }
                i43 = i11;
            }
        } else {
            i11 = 1;
        }
        int i44 = i11 + 1;
        int iCharAt2 = str.charAt(i11);
        if (iCharAt2 >= 55296) {
            int i45 = iCharAt2 & 8191;
            int i46 = 13;
            while (true) {
                i42 = i44 + 1;
                cCharAt13 = str.charAt(i44);
                if (cCharAt13 < 55296) {
                    break;
                }
                i45 |= (cCharAt13 & 8191) << i46;
                i46 += 13;
                i44 = i42;
            }
            iCharAt2 = i45 | (cCharAt13 << i46);
            i44 = i42;
        }
        if (iCharAt2 == 0) {
            i14 = 0;
            i16 = 0;
            iCharAt = 0;
            i13 = 0;
            i15 = 0;
            i17 = 0;
            iArr = f12401l;
            i12 = 0;
        } else {
            int i47 = i44 + 1;
            int iCharAt3 = str.charAt(i44);
            if (iCharAt3 >= 55296) {
                int i48 = iCharAt3 & 8191;
                int i49 = 13;
                while (true) {
                    i26 = i47 + 1;
                    cCharAt8 = str.charAt(i47);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i48 |= (cCharAt8 & 8191) << i49;
                    i49 += 13;
                    i47 = i26;
                }
                iCharAt3 = i48 | (cCharAt8 << i49);
                i47 = i26;
            }
            int i50 = i47 + 1;
            int iCharAt4 = str.charAt(i47);
            if (iCharAt4 >= 55296) {
                int i51 = iCharAt4 & 8191;
                int i52 = 13;
                while (true) {
                    i25 = i50 + 1;
                    cCharAt7 = str.charAt(i50);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i51 |= (cCharAt7 & 8191) << i52;
                    i52 += 13;
                    i50 = i25;
                }
                iCharAt4 = i51 | (cCharAt7 << i52);
                i50 = i25;
            }
            int i53 = i50 + 1;
            int iCharAt5 = str.charAt(i50);
            if (iCharAt5 >= 55296) {
                int i54 = iCharAt5 & 8191;
                int i55 = 13;
                while (true) {
                    i24 = i53 + 1;
                    cCharAt6 = str.charAt(i53);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i54 |= (cCharAt6 & 8191) << i55;
                    i55 += 13;
                    i53 = i24;
                }
                iCharAt5 = i54 | (cCharAt6 << i55);
                i53 = i24;
            }
            int i56 = i53 + 1;
            int iCharAt6 = str.charAt(i53);
            if (iCharAt6 >= 55296) {
                int i57 = iCharAt6 & 8191;
                int i58 = 13;
                while (true) {
                    i23 = i56 + 1;
                    cCharAt5 = str.charAt(i56);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i57 |= (cCharAt5 & 8191) << i58;
                    i58 += 13;
                    i56 = i23;
                }
                iCharAt6 = i57 | (cCharAt5 << i58);
                i56 = i23;
            }
            int i59 = i56 + 1;
            iCharAt = str.charAt(i56);
            if (iCharAt >= 55296) {
                int i60 = iCharAt & 8191;
                int i61 = 13;
                while (true) {
                    i22 = i59 + 1;
                    cCharAt4 = str.charAt(i59);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i60 |= (cCharAt4 & 8191) << i61;
                    i61 += 13;
                    i59 = i22;
                }
                iCharAt = i60 | (cCharAt4 << i61);
                i59 = i22;
            }
            int i62 = i59 + 1;
            int iCharAt7 = str.charAt(i59);
            if (iCharAt7 >= 55296) {
                int i63 = iCharAt7 & 8191;
                int i64 = 13;
                while (true) {
                    i21 = i62 + 1;
                    cCharAt3 = str.charAt(i62);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i63 |= (cCharAt3 & 8191) << i64;
                    i64 += 13;
                    i62 = i21;
                }
                iCharAt7 = i63 | (cCharAt3 << i64);
                i62 = i21;
            }
            int i65 = i62 + 1;
            int iCharAt8 = str.charAt(i62);
            if (iCharAt8 >= 55296) {
                int i66 = iCharAt8 & 8191;
                int i67 = 13;
                while (true) {
                    i19 = i65 + 1;
                    cCharAt2 = str.charAt(i65);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i66 |= (cCharAt2 & 8191) << i67;
                    i67 += 13;
                    i65 = i19;
                }
                iCharAt8 = i66 | (cCharAt2 << i67);
                i65 = i19;
            }
            int i68 = i65 + 1;
            int iCharAt9 = str.charAt(i65);
            if (iCharAt9 >= 55296) {
                int i69 = iCharAt9 & 8191;
                int i70 = 13;
                while (true) {
                    i18 = i68 + 1;
                    cCharAt = str.charAt(i68);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i69 |= (cCharAt & 8191) << i70;
                    i70 += 13;
                    i68 = i18;
                }
                iCharAt9 = i69 | (cCharAt << i70);
                i68 = i18;
            }
            int i71 = iCharAt3 + iCharAt3 + iCharAt4;
            i12 = iCharAt3;
            i44 = i68;
            iArr = new int[iCharAt9 + iCharAt7 + iCharAt8];
            int i72 = iCharAt7;
            i13 = iCharAt5;
            i14 = i72;
            i15 = iCharAt6;
            i16 = i71;
            i17 = iCharAt9;
        }
        Unsafe unsafe = m;
        Object[] objArr2 = zzguVar.f12427c;
        Class<?> cls = zzguVar.f12425a.getClass();
        int i73 = i17 + i14;
        int i74 = iCharAt + iCharAt;
        int[] iArr2 = new int[iCharAt * 3];
        Object[] objArr3 = new Object[i74];
        int i75 = i73;
        int i76 = i17;
        int i77 = 0;
        int i78 = 0;
        while (i44 < length) {
            int i79 = i44 + 1;
            int iCharAt10 = str.charAt(i44);
            int i80 = length;
            if (iCharAt10 >= 55296) {
                int i81 = iCharAt10 & 8191;
                int i82 = i79;
                int i83 = 13;
                while (true) {
                    i41 = i82 + 1;
                    cCharAt12 = str.charAt(i82);
                    objArr = objArr2;
                    if (cCharAt12 < 55296) {
                        break;
                    }
                    i81 |= (cCharAt12 & 8191) << i83;
                    i83 += 13;
                    i82 = i41;
                    objArr2 = objArr;
                }
                iCharAt10 = i81 | (cCharAt12 << i83);
                i27 = i41;
            } else {
                objArr = objArr2;
                i27 = i79;
            }
            int i84 = i27 + 1;
            int iCharAt11 = str.charAt(i27);
            if (iCharAt11 >= 55296) {
                int i85 = iCharAt11 & 8191;
                int i86 = i84;
                int i87 = 13;
                while (true) {
                    i39 = i86 + 1;
                    cCharAt11 = str.charAt(i86);
                    i40 = i85;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i85 = i40 | ((cCharAt11 & 8191) << i87);
                    i87 += 13;
                    i86 = i39;
                }
                iCharAt11 = i40 | (cCharAt11 << i87);
                i28 = i39;
            } else {
                i28 = i84;
            }
            int i88 = iCharAt10;
            if ((iCharAt11 & 1024) != 0) {
                iArr[i78] = i77;
                i78++;
            }
            int i89 = iCharAt11 & 255;
            Object[] objArr4 = objArr3;
            int i90 = iCharAt11 & 2048;
            if (i89 >= 51) {
                int i91 = i28 + 1;
                int iCharAt12 = str.charAt(i28);
                if (iCharAt12 >= 55296) {
                    int i92 = iCharAt12 & 8191;
                    int i93 = i91;
                    int i94 = 13;
                    while (true) {
                        i37 = i93 + 1;
                        cCharAt10 = str.charAt(i93);
                        i38 = i92;
                        if (cCharAt10 < 55296) {
                            break;
                        }
                        i92 = i38 | ((cCharAt10 & 8191) << i94);
                        i94 += 13;
                        i93 = i37;
                    }
                    iCharAt12 = i38 | (cCharAt10 << i94);
                    i35 = i37;
                } else {
                    i35 = i91;
                }
                int i95 = iCharAt12;
                int i96 = i89 - 51;
                int i97 = i35;
                if (i96 == 9 || i96 == 17) {
                    objArr4[e0.a(i77, 3, 1)] = objArr[i16];
                    i36 = i90;
                    i16++;
                } else if (i96 != 12) {
                    i36 = i90;
                } else if (zzguVar.zzc() == 1 || i90 != 0) {
                    objArr4[e0.a(i77, 3, 1)] = objArr[i16];
                    i16++;
                    i36 = i90;
                } else {
                    i36 = 0;
                }
                int i98 = i95 + i95;
                Object obj = objArr[i98];
                int i99 = i36;
                if (obj instanceof Field) {
                    fieldC2 = (Field) obj;
                } else {
                    fieldC2 = C(cls, (String) obj);
                    objArr[i98] = fieldC2;
                }
                i29 = i12;
                int iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldC2);
                int i100 = i98 + 1;
                Object obj2 = objArr[i100];
                if (obj2 instanceof Field) {
                    fieldC3 = (Field) obj2;
                } else {
                    fieldC3 = C(cls, (String) obj2);
                    objArr[i100] = fieldC3;
                }
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldC3);
                i73 = i73;
                i32 = iObjectFieldOffset2;
                i90 = i99;
                i30 = i97;
                i77 = i77;
                i31 = 0;
            } else {
                i29 = i12;
                int i101 = i16 + 1;
                Field fieldC4 = C(cls, (String) objArr[i16]);
                if (i89 == 9 || i89 == 17) {
                    objArr4[e0.a(i77, 3, 1)] = fieldC4.getType();
                } else {
                    if (i89 != 27) {
                        if (i89 == 49) {
                            i16 += 2;
                            i33 = 3;
                            i34 = 1;
                        } else if (i89 == 12 || i89 == 30 || i89 == 44) {
                            i73 = i73;
                            if (zzguVar.zzc() == 1 || i90 != 0) {
                                i16 += 2;
                                objArr4[e0.a(i77, 3, 1)] = objArr[i101];
                            } else {
                                i16 = i101;
                                i90 = 0;
                            }
                        } else if (i89 == 50) {
                            int i102 = i16 + 2;
                            i76++;
                            iArr[i76] = i77;
                            int i103 = i77 / 3;
                            int i104 = i103 + i103;
                            objArr4[i104] = objArr[i101];
                            if (i90 != 0) {
                                i16 += 3;
                                objArr4[i104 + 1] = objArr[i102];
                            } else {
                                i16 = i102;
                                i90 = 0;
                            }
                            i73 = i73;
                        }
                        int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldC4);
                        iObjectFieldOffset = 1048575;
                        if ((iCharAt11 & 4096) != 0 || i89 > 17) {
                            i30 = i28;
                            i31 = 0;
                        } else {
                            int i105 = i28 + 1;
                            int iCharAt13 = str.charAt(i28);
                            if (iCharAt13 >= 55296) {
                                int i106 = iCharAt13 & 8191;
                                int i107 = 13;
                                while (true) {
                                    i30 = i105 + 1;
                                    cCharAt9 = str.charAt(i105);
                                    if (cCharAt9 < 55296) {
                                        break;
                                    }
                                    i106 |= (cCharAt9 & 8191) << i107;
                                    i107 += 13;
                                    i105 = i30;
                                }
                                iCharAt13 = i106 | (cCharAt9 << i107);
                            } else {
                                i30 = i105;
                            }
                            int i108 = (iCharAt13 / 32) + i29 + i29;
                            Object obj3 = objArr[i108];
                            if (obj3 instanceof Field) {
                                fieldC = (Field) obj3;
                            } else {
                                fieldC = C(cls, (String) obj3);
                                objArr[i108] = fieldC;
                            }
                            i31 = iCharAt13 % 32;
                            iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldC);
                        }
                        if (i89 < 18 && i89 <= 49) {
                            iArr[i75] = iObjectFieldOffset3;
                            i75++;
                        }
                        i32 = iObjectFieldOffset3;
                    } else {
                        i33 = 3;
                        i34 = 1;
                        i16 += 2;
                    }
                    objArr4[e0.a(i77, i33, i34)] = objArr[i101];
                    int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldC4);
                    iObjectFieldOffset = 1048575;
                    if ((iCharAt11 & 4096) != 0) {
                        i30 = i28;
                        i31 = 0;
                    } else {
                        i30 = i28;
                        i31 = 0;
                    }
                    if (i89 < 18) {
                    }
                    i32 = iObjectFieldOffset4;
                }
                i16 = i101;
                int iObjectFieldOffset5 = (int) unsafe.objectFieldOffset(fieldC4);
                iObjectFieldOffset = 1048575;
                if ((iCharAt11 & 4096) != 0) {
                    i30 = i28;
                    i31 = 0;
                } else {
                    i30 = i28;
                    i31 = 0;
                }
                if (i89 < 18) {
                }
                i32 = iObjectFieldOffset5;
            }
            int i109 = i77 + 1;
            iArr2[i77] = i88;
            int i110 = i77 + 2;
            String str2 = str;
            iArr2[i109] = ((iCharAt11 & 512) != 0 ? 536870912 : 0) | ((iCharAt11 & 256) != 0 ? 268435456 : 0) | (i90 != 0 ? Integer.MIN_VALUE : 0) | (i89 << 20) | i32;
            iArr2[i110] = (i31 << 20) | iObjectFieldOffset;
            i77 += 3;
            i44 = i30;
            length = i80;
            objArr3 = objArr4;
            objArr2 = objArr;
            str = str2;
            i73 = i73;
            i12 = i29;
        }
        return new zzgo(iArr2, objArr3, i13, i15, zzguVar.f12425a, iArr, i17, i73, zzhhVar, zzewVar);
    }

    public static int t(long j11, Object obj) {
        return ((Integer) zzho.h(obj, j11)).intValue();
    }

    public static int v(int i11) {
        return (i11 >>> 20) & 255;
    }

    public static long x(long j11, Object obj) {
        return ((Long) zzho.h(obj, j11)).longValue();
    }

    public final Object A(int i11, Object obj) {
        zzgv zzgvVarZ = z(i11);
        int iW = w(i11) & 1048575;
        if (!m(i11, obj)) {
            return zzgvVarZ.zze();
        }
        Object object = m.getObject(obj, iW);
        if (o(object)) {
            return object;
        }
        Object objZze = zzgvVarZ.zze();
        if (object != null) {
            zzgvVarZ.zzg(objZze, object);
        }
        return objZze;
    }

    public final Object B(int i11, int i12, Object obj) {
        zzgv zzgvVarZ = z(i12);
        if (!p(i11, i12, obj)) {
            return zzgvVarZ.zze();
        }
        Object object = m.getObject(obj, w(i12) & 1048575);
        if (o(object)) {
            return object;
        }
        Object objZze = zzgvVarZ.zze();
        if (object != null) {
            zzgvVarZ.zzg(objZze, object);
        }
        return objZze;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgv
    public final boolean a(Object obj) {
        int i11;
        int i12;
        int i13 = 0;
        int i14 = 0;
        int i15 = 1048575;
        while (i14 < this.f12409h) {
            int i16 = this.f12408g[i14];
            int[] iArr = this.f12402a;
            int i17 = iArr[i16];
            int iW = w(i16);
            int i18 = iArr[i16 + 2];
            int i19 = i18 & 1048575;
            int i21 = 1 << (i18 >>> 20);
            if (i19 != i15) {
                if (i19 != 1048575) {
                    i13 = m.getInt(obj, i19);
                }
                i12 = i13;
                i11 = i19;
            } else {
                int i22 = i13;
                i11 = i15;
                i12 = i22;
            }
            if ((268435456 & iW) == 0 || n(obj, i16, i11, i12, i21)) {
                int iV = v(iW);
                if (iV != 9 && iV != 17) {
                    if (iV != 27) {
                        if (iV == 60 || iV == 68) {
                            if (!p(i17, i16, obj) || z(i16).a(zzho.h(obj, iW & 1048575))) {
                            }
                        } else if (iV != 49) {
                            if (iV == 50 && !((zzgf) zzho.h(obj, iW & 1048575)).isEmpty()) {
                                int i23 = i16 / 3;
                                throw null;
                            }
                        }
                        i14++;
                        i15 = i11;
                        i13 = i12;
                    }
                    List list = (List) zzho.h(obj, iW & 1048575);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        zzgv zzgvVarZ = z(i16);
                        for (int i24 = 0; i24 < list.size(); i24++) {
                            if (zzgvVarZ.a(list.get(i24))) {
                            }
                        }
                    }
                    i14++;
                    i15 = i11;
                    i13 = i12;
                } else if (!n(obj, i16, i11, i12, i21) || z(i16).a(zzho.h(obj, iW & 1048575))) {
                    i14++;
                    i15 = i11;
                    i13 = i12;
                }
            }
            return false;
        }
        if (this.f12407f) {
            ((zzff) obj).zzb.c();
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    @Override // com.google.android.gms.internal.play_billing.zzgv
    public final void b(Object obj, zzhu zzhuVar) {
        Map.Entry entry;
        int i11;
        zzgo<T> zzgoVar = this;
        if (zzgoVar.f12407f) {
            zzez zzezVar = ((zzff) obj).zzb;
            if (zzezVar.f12370a.isEmpty()) {
                entry = null;
            } else {
                entry = (Map.Entry) zzezVar.a().next();
            }
        } else {
            entry = null;
        }
        Unsafe unsafe = m;
        int i12 = 1048575;
        int i13 = 1048575;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            int[] iArr = zzgoVar.f12402a;
            if (i14 >= iArr.length) {
                if (entry == null) {
                    ((zzfi) obj).zzc.d(zzhuVar);
                    return;
                } else {
                    throw null;
                }
            }
            int iW = zzgoVar.w(i14);
            int iV = v(iW);
            int i16 = iArr[i14];
            if (iV <= 17) {
                int i17 = iArr[i14 + 2];
                int i18 = i17 & i12;
                if (i18 != i13) {
                    i15 = i18 == i12 ? 0 : unsafe.getInt(obj, i18);
                    i13 = i18;
                }
                i11 = 1 << (i17 >>> 20);
            } else {
                i11 = 0;
            }
            if (entry != null) {
                throw null;
            }
            long j11 = iW & i12;
            switch (iV) {
                case 0:
                    if (zzgoVar.n(obj, i14, i13, i15, i11)) {
                        zzhuVar.zzf(i16, zzho.f12458c.a(obj, j11));
                        continue;
                    }
                    i14 += 3;
                    i12 = 1048575;
                    zzgoVar = this;
                    break;
                case 1:
                    if (zzgoVar.n(obj, i14, i13, i15, i11)) {
                        zzhuVar.zzo(i16, zzho.f12458c.b(obj, j11));
                    } else {
                        continue;
                    }
                    i14 += 3;
                    i12 = 1048575;
                    zzgoVar = this;
                    break;
                case 2:
                    if (zzgoVar.n(obj, i14, i13, i15, i11)) {
                        zzhuVar.zzt(i16, unsafe.getLong(obj, j11));
                    } else {
                        continue;
                    }
                    i14 += 3;
                    i12 = 1048575;
                    zzgoVar = this;
                    break;
                case 3:
                    if (zzgoVar.n(obj, i14, i13, i15, i11)) {
                        zzhuVar.zzK(i16, unsafe.getLong(obj, j11));
                    } else {
                        continue;
                    }
                    i14 += 3;
                    i12 = 1048575;
                    zzgoVar = this;
                    break;
                case 4:
                    if (zzgoVar.n(obj, i14, i13, i15, i11)) {
                        zzhuVar.zzr(i16, unsafe.getInt(obj, j11));
                    } else {
                        continue;
                    }
                    i14 += 3;
                    i12 = 1048575;
                    zzgoVar = this;
                    break;
                case 5:
                    if (zzgoVar.n(obj, i14, i13, i15, i11)) {
                        zzhuVar.zzm(i16, unsafe.getLong(obj, j11));
                    } else {
                        continue;
                    }
                    i14 += 3;
                    i12 = 1048575;
                    zzgoVar = this;
                    break;
                case 6:
                    if (zzgoVar.n(obj, i14, i13, i15, i11)) {
                        zzhuVar.zzk(i16, unsafe.getInt(obj, j11));
                    } else {
                        continue;
                    }
                    i14 += 3;
                    i12 = 1048575;
                    zzgoVar = this;
                    break;
                case 7:
                    if (zzgoVar.n(obj, i14, i13, i15, i11)) {
                        zzhuVar.zzb(i16, zzho.f12458c.g(obj, j11));
                    } else {
                        continue;
                    }
                    i14 += 3;
                    i12 = 1048575;
                    zzgoVar = this;
                    break;
                case 8:
                    if (zzgoVar.n(obj, i14, i13, i15, i11)) {
                        Object object = unsafe.getObject(obj, j11);
                        if (object instanceof String) {
                            zzhuVar.zzG(i16, (String) object);
                        } else {
                            zzhuVar.b(i16, (zzei) object);
                        }
                    } else {
                        continue;
                    }
                    i14 += 3;
                    i12 = 1048575;
                    zzgoVar = this;
                    break;
                case 9:
                    if (zzgoVar.n(obj, i14, i13, i15, i11)) {
                        zzhuVar.c(i16, unsafe.getObject(obj, j11), zzgoVar.z(i14));
                    } else {
                        continue;
                    }
                    i14 += 3;
                    i12 = 1048575;
                    zzgoVar = this;
                    break;
                case 10:
                    if (zzgoVar.n(obj, i14, i13, i15, i11)) {
                        zzhuVar.b(i16, (zzei) unsafe.getObject(obj, j11));
                    } else {
                        continue;
                    }
                    i14 += 3;
                    i12 = 1048575;
                    zzgoVar = this;
                    break;
                case 11:
                    if (zzgoVar.n(obj, i14, i13, i15, i11)) {
                        zzhuVar.zzI(i16, unsafe.getInt(obj, j11));
                    } else {
                        continue;
                    }
                    i14 += 3;
                    i12 = 1048575;
                    zzgoVar = this;
                    break;
                case 12:
                    if (zzgoVar.n(obj, i14, i13, i15, i11)) {
                        zzhuVar.zzi(i16, unsafe.getInt(obj, j11));
                    } else {
                        continue;
                    }
                    i14 += 3;
                    i12 = 1048575;
                    zzgoVar = this;
                    break;
                case 13:
                    if (zzgoVar.n(obj, i14, i13, i15, i11)) {
                        zzhuVar.zzx(i16, unsafe.getInt(obj, j11));
                    } else {
                        continue;
                    }
                    i14 += 3;
                    i12 = 1048575;
                    zzgoVar = this;
                    break;
                case 14:
                    if (zzgoVar.n(obj, i14, i13, i15, i11)) {
                        zzhuVar.zzz(i16, unsafe.getLong(obj, j11));
                    } else {
                        continue;
                    }
                    i14 += 3;
                    i12 = 1048575;
                    zzgoVar = this;
                    break;
                case 15:
                    if (zzgoVar.n(obj, i14, i13, i15, i11)) {
                        zzhuVar.zzB(i16, unsafe.getInt(obj, j11));
                    } else {
                        continue;
                    }
                    i14 += 3;
                    i12 = 1048575;
                    zzgoVar = this;
                    break;
                case 16:
                    if (zzgoVar.n(obj, i14, i13, i15, i11)) {
                        zzhuVar.zzD(i16, unsafe.getLong(obj, j11));
                    } else {
                        continue;
                    }
                    i14 += 3;
                    i12 = 1048575;
                    zzgoVar = this;
                    break;
                case 17:
                    if (zzgoVar.n(obj, i14, i13, i15, i11)) {
                        zzhuVar.a(i16, unsafe.getObject(obj, j11), zzgoVar.z(i14));
                    } else {
                        continue;
                    }
                    i14 += 3;
                    i12 = 1048575;
                    zzgoVar = this;
                    break;
                case 18:
                    int i19 = iArr[i14];
                    List list = (List) unsafe.getObject(obj, j11);
                    zzhj zzhjVar = zzgx.f12429a;
                    if (list != null && !list.isEmpty()) {
                        zzhuVar.zzg(i19, list, false);
                    }
                    i14 += 3;
                    i12 = 1048575;
                    zzgoVar = this;
                    break;
                case 19:
                    int i21 = iArr[i14];
                    List list2 = (List) unsafe.getObject(obj, j11);
                    zzhj zzhjVar2 = zzgx.f12429a;
                    if (list2 != null && !list2.isEmpty()) {
                        zzhuVar.zzp(i21, list2, false);
                    }
                    break;
                case 20:
                    int i22 = iArr[i14];
                    List list3 = (List) unsafe.getObject(obj, j11);
                    zzhj zzhjVar3 = zzgx.f12429a;
                    if (list3 != null && !list3.isEmpty()) {
                        zzhuVar.zzu(i22, list3, false);
                    }
                    break;
                case 21:
                    int i23 = iArr[i14];
                    List list4 = (List) unsafe.getObject(obj, j11);
                    zzhj zzhjVar4 = zzgx.f12429a;
                    if (list4 != null && !list4.isEmpty()) {
                        zzhuVar.zzL(i23, list4, false);
                    }
                    break;
                case 22:
                    int i24 = iArr[i14];
                    List list5 = (List) unsafe.getObject(obj, j11);
                    zzhj zzhjVar5 = zzgx.f12429a;
                    if (list5 != null && !list5.isEmpty()) {
                        zzhuVar.zzs(i24, list5, false);
                    }
                    break;
                case 23:
                    int i25 = iArr[i14];
                    List list6 = (List) unsafe.getObject(obj, j11);
                    zzhj zzhjVar6 = zzgx.f12429a;
                    if (list6 != null && !list6.isEmpty()) {
                        zzhuVar.zzn(i25, list6, false);
                    }
                    break;
                case Service.METRICS_FIELD_NUMBER /* 24 */:
                    int i26 = iArr[i14];
                    List list7 = (List) unsafe.getObject(obj, j11);
                    zzhj zzhjVar7 = zzgx.f12429a;
                    if (list7 != null && !list7.isEmpty()) {
                        zzhuVar.zzl(i26, list7, false);
                    }
                    break;
                case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                    int i27 = iArr[i14];
                    List list8 = (List) unsafe.getObject(obj, j11);
                    zzhj zzhjVar8 = zzgx.f12429a;
                    if (list8 != null && !list8.isEmpty()) {
                        zzhuVar.zzc(i27, list8, false);
                    }
                    break;
                case Service.BILLING_FIELD_NUMBER /* 26 */:
                    int i28 = iArr[i14];
                    List list9 = (List) unsafe.getObject(obj, j11);
                    zzhj zzhjVar9 = zzgx.f12429a;
                    if (list9 != null && !list9.isEmpty()) {
                        zzhuVar.zzH(i28, list9);
                    }
                    break;
                case 27:
                    int i29 = iArr[i14];
                    List list10 = (List) unsafe.getObject(obj, j11);
                    zzgv zzgvVarZ = zzgoVar.z(i14);
                    zzhj zzhjVar10 = zzgx.f12429a;
                    if (list10 != null && !list10.isEmpty()) {
                        for (int i30 = 0; i30 < list10.size(); i30++) {
                            ((zzeq) zzhuVar).c(i29, list10.get(i30), zzgvVarZ);
                        }
                    }
                    break;
                case Service.MONITORING_FIELD_NUMBER /* 28 */:
                    int i31 = iArr[i14];
                    List list11 = (List) unsafe.getObject(obj, j11);
                    zzhj zzhjVar11 = zzgx.f12429a;
                    if (list11 != null && !list11.isEmpty()) {
                        zzhuVar.zze(i31, list11);
                    }
                    break;
                case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
                    int i32 = iArr[i14];
                    List list12 = (List) unsafe.getObject(obj, j11);
                    zzhj zzhjVar12 = zzgx.f12429a;
                    if (list12 != null && !list12.isEmpty()) {
                        zzhuVar.zzJ(i32, list12, false);
                    }
                    break;
                case 30:
                    int i33 = iArr[i14];
                    List list13 = (List) unsafe.getObject(obj, j11);
                    zzhj zzhjVar13 = zzgx.f12429a;
                    if (list13 != null && !list13.isEmpty()) {
                        zzhuVar.zzj(i33, list13, false);
                    }
                    break;
                case 31:
                    int i34 = iArr[i14];
                    List list14 = (List) unsafe.getObject(obj, j11);
                    zzhj zzhjVar14 = zzgx.f12429a;
                    if (list14 != null && !list14.isEmpty()) {
                        zzhuVar.zzy(i34, list14, false);
                    }
                    break;
                case Consts.SP /* 32 */:
                    int i35 = iArr[i14];
                    List list15 = (List) unsafe.getObject(obj, j11);
                    zzhj zzhjVar15 = zzgx.f12429a;
                    if (list15 != null && !list15.isEmpty()) {
                        zzhuVar.zzA(i35, list15, false);
                    }
                    break;
                case 33:
                    int i36 = iArr[i14];
                    List list16 = (List) unsafe.getObject(obj, j11);
                    zzhj zzhjVar16 = zzgx.f12429a;
                    if (list16 != null && !list16.isEmpty()) {
                        zzhuVar.zzC(i36, list16, false);
                    }
                    break;
                case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                    int i37 = iArr[i14];
                    List list17 = (List) unsafe.getObject(obj, j11);
                    zzhj zzhjVar17 = zzgx.f12429a;
                    if (list17 != null && !list17.isEmpty()) {
                        zzhuVar.zzE(i37, list17, false);
                    }
                    break;
                case 35:
                    int i38 = iArr[i14];
                    List list18 = (List) unsafe.getObject(obj, j11);
                    zzhj zzhjVar18 = zzgx.f12429a;
                    if (list18 != null && !list18.isEmpty()) {
                        zzhuVar.zzg(i38, list18, true);
                    }
                    break;
                case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    int i39 = iArr[i14];
                    List list19 = (List) unsafe.getObject(obj, j11);
                    zzhj zzhjVar19 = zzgx.f12429a;
                    if (list19 != null && !list19.isEmpty()) {
                        zzhuVar.zzp(i39, list19, true);
                    }
                    break;
                case 37:
                    int i40 = iArr[i14];
                    List list20 = (List) unsafe.getObject(obj, j11);
                    zzhj zzhjVar20 = zzgx.f12429a;
                    if (list20 != null && !list20.isEmpty()) {
                        zzhuVar.zzu(i40, list20, true);
                    }
                    break;
                case 38:
                    int i41 = iArr[i14];
                    List list21 = (List) unsafe.getObject(obj, j11);
                    zzhj zzhjVar21 = zzgx.f12429a;
                    if (list21 != null && !list21.isEmpty()) {
                        zzhuVar.zzL(i41, list21, true);
                    }
                    break;
                case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    int i42 = iArr[i14];
                    List list22 = (List) unsafe.getObject(obj, j11);
                    zzhj zzhjVar22 = zzgx.f12429a;
                    if (list22 != null && !list22.isEmpty()) {
                        zzhuVar.zzs(i42, list22, true);
                    }
                    break;
                case DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                    int i43 = iArr[i14];
                    List list23 = (List) unsafe.getObject(obj, j11);
                    zzhj zzhjVar23 = zzgx.f12429a;
                    if (list23 != null && !list23.isEmpty()) {
                        zzhuVar.zzn(i43, list23, true);
                    }
                    break;
                case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                    int i44 = iArr[i14];
                    List list24 = (List) unsafe.getObject(obj, j11);
                    zzhj zzhjVar24 = zzgx.f12429a;
                    if (list24 != null && !list24.isEmpty()) {
                        zzhuVar.zzl(i44, list24, true);
                    }
                    break;
                case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                    int i45 = iArr[i14];
                    List list25 = (List) unsafe.getObject(obj, j11);
                    zzhj zzhjVar25 = zzgx.f12429a;
                    if (list25 != null && !list25.isEmpty()) {
                        zzhuVar.zzc(i45, list25, true);
                    }
                    break;
                case 43:
                    int i46 = iArr[i14];
                    List list26 = (List) unsafe.getObject(obj, j11);
                    zzhj zzhjVar26 = zzgx.f12429a;
                    if (list26 != null && !list26.isEmpty()) {
                        zzhuVar.zzJ(i46, list26, true);
                    }
                    break;
                case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                    int i47 = iArr[i14];
                    List list27 = (List) unsafe.getObject(obj, j11);
                    zzhj zzhjVar27 = zzgx.f12429a;
                    if (list27 != null && !list27.isEmpty()) {
                        zzhuVar.zzj(i47, list27, true);
                    }
                    break;
                case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                    int i48 = iArr[i14];
                    List list28 = (List) unsafe.getObject(obj, j11);
                    zzhj zzhjVar28 = zzgx.f12429a;
                    if (list28 != null && !list28.isEmpty()) {
                        zzhuVar.zzy(i48, list28, true);
                    }
                    break;
                case 46:
                    int i49 = iArr[i14];
                    List list29 = (List) unsafe.getObject(obj, j11);
                    zzhj zzhjVar29 = zzgx.f12429a;
                    if (list29 != null && !list29.isEmpty()) {
                        zzhuVar.zzA(i49, list29, true);
                    }
                    break;
                case 47:
                    int i50 = iArr[i14];
                    List list30 = (List) unsafe.getObject(obj, j11);
                    zzhj zzhjVar30 = zzgx.f12429a;
                    if (list30 != null && !list30.isEmpty()) {
                        zzhuVar.zzC(i50, list30, true);
                    }
                    break;
                case 48:
                    int i51 = iArr[i14];
                    List list31 = (List) unsafe.getObject(obj, j11);
                    zzhj zzhjVar31 = zzgx.f12429a;
                    if (list31 != null && !list31.isEmpty()) {
                        zzhuVar.zzE(i51, list31, true);
                    }
                    break;
                case 49:
                    int i52 = iArr[i14];
                    List list32 = (List) unsafe.getObject(obj, j11);
                    zzgv zzgvVarZ2 = zzgoVar.z(i14);
                    zzhj zzhjVar32 = zzgx.f12429a;
                    if (list32 != null && !list32.isEmpty()) {
                        for (int i53 = 0; i53 < list32.size(); i53++) {
                            ((zzeq) zzhuVar).a(i52, list32.get(i53), zzgvVarZ2);
                        }
                    }
                    break;
                case 50:
                    if (unsafe.getObject(obj, j11) != null) {
                        int i54 = i14 / 3;
                        throw null;
                    }
                    break;
                case 51:
                    if (zzgoVar.p(i16, i14, obj)) {
                        zzhuVar.zzf(i16, ((Double) zzho.h(obj, j11)).doubleValue());
                    }
                    break;
                case 52:
                    if (zzgoVar.p(i16, i14, obj)) {
                        zzhuVar.zzo(i16, ((Float) zzho.h(obj, j11)).floatValue());
                    }
                    break;
                case 53:
                    if (zzgoVar.p(i16, i14, obj)) {
                        zzhuVar.zzt(i16, x(j11, obj));
                    }
                    break;
                case 54:
                    if (zzgoVar.p(i16, i14, obj)) {
                        zzhuVar.zzK(i16, x(j11, obj));
                    }
                    break;
                case 55:
                    if (zzgoVar.p(i16, i14, obj)) {
                        zzhuVar.zzr(i16, t(j11, obj));
                    }
                    break;
                case 56:
                    if (zzgoVar.p(i16, i14, obj)) {
                        zzhuVar.zzm(i16, x(j11, obj));
                    }
                    break;
                case 57:
                    if (zzgoVar.p(i16, i14, obj)) {
                        zzhuVar.zzk(i16, t(j11, obj));
                    }
                    break;
                case 58:
                    if (zzgoVar.p(i16, i14, obj)) {
                        zzhuVar.zzb(i16, ((Boolean) zzho.h(obj, j11)).booleanValue());
                    }
                    break;
                case 59:
                    if (zzgoVar.p(i16, i14, obj)) {
                        Object object2 = unsafe.getObject(obj, j11);
                        if (object2 instanceof String) {
                            zzhuVar.zzG(i16, (String) object2);
                        } else {
                            zzhuVar.b(i16, (zzei) object2);
                        }
                    }
                    break;
                case 60:
                    if (zzgoVar.p(i16, i14, obj)) {
                        zzhuVar.c(i16, unsafe.getObject(obj, j11), zzgoVar.z(i14));
                    }
                    break;
                case 61:
                    if (zzgoVar.p(i16, i14, obj)) {
                        zzhuVar.b(i16, (zzei) unsafe.getObject(obj, j11));
                    }
                    break;
                case 62:
                    if (zzgoVar.p(i16, i14, obj)) {
                        zzhuVar.zzI(i16, t(j11, obj));
                    }
                    break;
                case 63:
                    if (zzgoVar.p(i16, i14, obj)) {
                        zzhuVar.zzi(i16, t(j11, obj));
                    }
                    break;
                case 64:
                    if (zzgoVar.p(i16, i14, obj)) {
                        zzhuVar.zzx(i16, t(j11, obj));
                    }
                    break;
                case 65:
                    if (zzgoVar.p(i16, i14, obj)) {
                        zzhuVar.zzz(i16, x(j11, obj));
                    }
                    break;
                case 66:
                    if (zzgoVar.p(i16, i14, obj)) {
                        zzhuVar.zzB(i16, t(j11, obj));
                    }
                    break;
                case 67:
                    if (zzgoVar.p(i16, i14, obj)) {
                        zzhuVar.zzD(i16, x(j11, obj));
                    }
                    break;
                case 68:
                    if (zzgoVar.p(i16, i14, obj)) {
                        zzhuVar.a(i16, unsafe.getObject(obj, j11), zzgoVar.z(i14));
                    }
                    break;
            }
            i14 += 3;
            i12 = 1048575;
            zzgoVar = this;
        }
    }

    /* JADX WARN: Code duplicated, block: B:139:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:196:0x050c  */
    @Override // com.google.android.gms.internal.play_billing.zzgv
    public final int c(zzfi zzfiVar) {
        int i11;
        int iB;
        int iC;
        int iB2;
        int iE;
        int iB3;
        int iG;
        int i12;
        int iD;
        int iB4;
        int size;
        int iK;
        int iB5;
        int iB6;
        int iB7;
        int size2;
        int iB8;
        int iB9;
        int iD2;
        int iB10;
        int iC2;
        zzgo<T> zzgoVar = this;
        zzfi zzfiVar2 = zzfiVar;
        Unsafe unsafe = m;
        int i13 = 1048575;
        int i14 = 0;
        int i15 = 0;
        int iD3 = 0;
        int i16 = 1048575;
        while (true) {
            int[] iArr = zzgoVar.f12402a;
            if (i14 >= iArr.length) {
                int iA = zzfiVar2.zzc.a() + iD3;
                if (zzgoVar.f12407f) {
                    zzgy zzgyVar = ((zzff) zzfiVar2).zzb.f12370a;
                    if (zzgyVar.f12444b > 0) {
                        ((zzey) ((zzgz) zzgyVar.d(0)).f12430a).zzb();
                        throw null;
                    }
                    Iterator<T> it = zzgyVar.b().iterator();
                    if (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        zzey zzeyVar = (zzey) entry.getKey();
                        entry.getValue();
                        zzeyVar.zzb();
                        throw null;
                    }
                }
                return iA;
            }
            int iW = zzgoVar.w(i14);
            int iV = v(iW);
            int i17 = iArr[i14];
            int i18 = iArr[i14 + 2];
            int i19 = i18 & i13;
            if (iV <= 17) {
                if (i19 != i16) {
                    i15 = i19 == i13 ? 0 : unsafe.getInt(zzfiVar2, i19);
                    i16 = i19;
                }
                i11 = 1 << (i18 >>> 20);
            } else {
                i11 = 0;
            }
            int i21 = iW & i13;
            if (iV >= zzfa.zzJ.zza()) {
                zzfa.zzW.getClass();
            }
            long j11 = i21;
            switch (iV) {
                case 0:
                    if (zzgoVar.n(zzfiVar2, i14, i16, i15, i11)) {
                        iD3 = e0.D(i17 << 3, 8, iD3);
                    }
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case 1:
                    if (zzgoVar.n(zzfiVar2, i14, i16, i15, i11)) {
                        iD3 = e0.D(i17 << 3, 4, iD3);
                    }
                    zzgoVar = this;
                    zzfiVar2 = zzfiVar;
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case 2:
                    if (zzgoVar.n(zzfiVar2, i14, i16, i15, i11)) {
                        long j12 = unsafe.getLong(zzfiVar2, j11);
                        iB = zzep.b(i17 << 3);
                        iC = zzep.c(j12);
                        iD3 += iC + iB;
                    }
                    zzgoVar = this;
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case 3:
                    if (zzgoVar.n(zzfiVar2, i14, i16, i15, i11)) {
                        long j13 = unsafe.getLong(zzfiVar2, j11);
                        iB = zzep.b(i17 << 3);
                        iC = zzep.c(j13);
                        iD3 += iC + iB;
                    }
                    zzgoVar = this;
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case 4:
                    if (zzgoVar.n(zzfiVar2, i14, i16, i15, i11)) {
                        long j14 = unsafe.getInt(zzfiVar2, j11);
                        iB = zzep.b(i17 << 3);
                        iC = zzep.c(j14);
                        iD3 += iC + iB;
                    }
                    zzgoVar = this;
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case 5:
                    if (zzgoVar.n(zzfiVar2, i14, i16, i15, i11)) {
                        iD3 = e0.D(i17 << 3, 8, iD3);
                    }
                    zzgoVar = this;
                    zzfiVar2 = zzfiVar;
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case 6:
                    if (zzgoVar.n(zzfiVar2, i14, i16, i15, i11)) {
                        iD3 = e0.D(i17 << 3, 4, iD3);
                    }
                    zzgoVar = this;
                    zzfiVar2 = zzfiVar;
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case 7:
                    if (zzgoVar.n(zzfiVar2, i14, i16, i15, i11)) {
                        iD3 = e0.D(i17 << 3, 1, iD3);
                    }
                    zzgoVar = this;
                    zzfiVar2 = zzfiVar;
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case 8:
                    if (zzgoVar.n(zzfiVar2, i14, i16, i15, i11)) {
                        int i22 = i17 << 3;
                        Object object = unsafe.getObject(zzfiVar2, j11);
                        if (object instanceof zzei) {
                            iB2 = zzep.b(i22);
                            iE = ((zzei) object).e();
                            iB3 = zzep.b(iE);
                            iD3 += iB3 + iE + iB2;
                        } else {
                            iB = zzep.b(i22);
                            iC = zzep.a((String) object);
                            iD3 += iC + iB;
                        }
                    }
                    zzgoVar = this;
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case 9:
                    if (zzgoVar.n(zzfiVar2, i14, i16, i15, i11)) {
                        iG = zzgx.g(i17, unsafe.getObject(zzfiVar2, j11), zzgoVar.z(i14));
                        iD3 += iG;
                    }
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case 10:
                    if (zzgoVar.n(zzfiVar2, i14, i16, i15, i11)) {
                        zzei zzeiVar = (zzei) unsafe.getObject(zzfiVar2, j11);
                        iB2 = zzep.b(i17 << 3);
                        iE = zzeiVar.e();
                        iB3 = zzep.b(iE);
                        iD3 += iB3 + iE + iB2;
                    }
                    zzgoVar = this;
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case 11:
                    if (zzgoVar.n(zzfiVar2, i14, i16, i15, i11)) {
                        iD3 = e0.D(unsafe.getInt(zzfiVar2, j11), zzep.b(i17 << 3), iD3);
                    }
                    zzgoVar = this;
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case 12:
                    if (zzgoVar.n(zzfiVar2, i14, i16, i15, i11)) {
                        long j15 = unsafe.getInt(zzfiVar2, j11);
                        iB = zzep.b(i17 << 3);
                        iC = zzep.c(j15);
                        iD3 += iC + iB;
                    }
                    zzgoVar = this;
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case 13:
                    if (zzgoVar.n(zzfiVar2, i14, i16, i15, i11)) {
                        iD3 = e0.D(i17 << 3, 4, iD3);
                    }
                    zzgoVar = this;
                    zzfiVar2 = zzfiVar;
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case 14:
                    if (zzgoVar.n(zzfiVar2, i14, i16, i15, i11)) {
                        iD3 = e0.D(i17 << 3, 8, iD3);
                    }
                    zzgoVar = this;
                    zzfiVar2 = zzfiVar;
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case 15:
                    if (zzgoVar.n(zzfiVar2, i14, i16, i15, i11)) {
                        int i23 = unsafe.getInt(zzfiVar2, j11);
                        iD3 = e0.D((i23 >> 31) ^ (i23 + i23), zzep.b(i17 << 3), iD3);
                    }
                    zzgoVar = this;
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case 16:
                    if (zzgoVar.n(zzfiVar2, i14, i16, i15, i11)) {
                        long j16 = unsafe.getLong(zzfiVar2, j11);
                        iB = zzep.b(i17 << 3);
                        iC = zzep.c((j16 >> 63) ^ (j16 + j16));
                        iD3 += iC + iB;
                    }
                    zzgoVar = this;
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case 17:
                    if (zzgoVar.n(zzfiVar2, i14, i16, i15, i11)) {
                        zzgl zzglVar = (zzgl) unsafe.getObject(zzfiVar2, j11);
                        zzgv zzgvVarZ = zzgoVar.z(i14);
                        int iB11 = zzep.b(i17 << 3);
                        i12 = iB11 + iB11;
                        iD = ((zzds) zzglVar).d(zzgvVarZ);
                        iD3 += iD + i12;
                    }
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case 18:
                    iG = zzgx.d(i17, (List) unsafe.getObject(zzfiVar2, j11));
                    iD3 += iG;
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case 19:
                    iG = zzgx.c(i17, (List) unsafe.getObject(zzfiVar2, j11));
                    iD3 += iG;
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(zzfiVar2, j11);
                    zzhj zzhjVar = zzgx.f12429a;
                    if (list.size() == 0) {
                        iB4 = 0;
                    } else {
                        iB4 = (zzep.b(i17 << 3) * list.size()) + zzgx.f(list);
                    }
                    iD3 += iB4;
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case 21:
                    List list2 = (List) unsafe.getObject(zzfiVar2, j11);
                    zzhj zzhjVar2 = zzgx.f12429a;
                    size = list2.size();
                    if (size == 0) {
                        iB6 = 0;
                    } else {
                        iK = zzgx.k(list2);
                        iB5 = zzep.b(i17 << 3);
                        iB6 = (iB5 * size) + iK;
                    }
                    iD3 += iB6;
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case 22:
                    List list3 = (List) unsafe.getObject(zzfiVar2, j11);
                    zzhj zzhjVar3 = zzgx.f12429a;
                    size = list3.size();
                    if (size == 0) {
                        iB6 = 0;
                    } else {
                        iK = zzgx.e(list3);
                        iB5 = zzep.b(i17 << 3);
                        iB6 = (iB5 * size) + iK;
                    }
                    iD3 += iB6;
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case 23:
                    iG = zzgx.d(i17, (List) unsafe.getObject(zzfiVar2, j11));
                    iD3 += iG;
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case Service.METRICS_FIELD_NUMBER /* 24 */:
                    iG = zzgx.c(i17, (List) unsafe.getObject(zzfiVar2, j11));
                    iD3 += iG;
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                    List list4 = (List) unsafe.getObject(zzfiVar2, j11);
                    zzhj zzhjVar4 = zzgx.f12429a;
                    int size3 = list4.size();
                    if (size3 == 0) {
                        iB4 = 0;
                    } else {
                        iB4 = (zzep.b(i17 << 3) + 1) * size3;
                    }
                    iD3 += iB4;
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case Service.BILLING_FIELD_NUMBER /* 26 */:
                    List list5 = (List) unsafe.getObject(zzfiVar2, j11);
                    zzhj zzhjVar5 = zzgx.f12429a;
                    int size4 = list5.size();
                    if (size4 == 0) {
                        iB6 = 0;
                    } else {
                        iB6 = zzep.b(i17 << 3) * size4;
                        if (list5 instanceof zzfx) {
                            zzfx zzfxVar = (zzfx) list5;
                            for (int i24 = 0; i24 < size4; i24++) {
                                Object objZza = zzfxVar.zza();
                                if (objZza instanceof zzei) {
                                    int iE2 = ((zzei) objZza).e();
                                    iB6 = e0.D(iE2, iE2, iB6);
                                } else {
                                    iB6 = zzep.a((String) objZza) + iB6;
                                }
                            }
                        } else {
                            for (int i25 = 0; i25 < size4; i25++) {
                                Object obj = list5.get(i25);
                                if (obj instanceof zzei) {
                                    int iE3 = ((zzei) obj).e();
                                    iB6 = e0.D(iE3, iE3, iB6);
                                } else {
                                    iB6 = zzep.a((String) obj) + iB6;
                                }
                            }
                        }
                    }
                    iD3 += iB6;
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case 27:
                    List list6 = (List) unsafe.getObject(zzfiVar2, j11);
                    zzgv zzgvVarZ2 = zzgoVar.z(i14);
                    zzhj zzhjVar6 = zzgx.f12429a;
                    int size5 = list6.size();
                    if (size5 == 0) {
                        iB7 = 0;
                    } else {
                        iB7 = zzep.b(i17 << 3) * size5;
                        for (int i26 = 0; i26 < size5; i26++) {
                            Object obj2 = list6.get(i26);
                            if (obj2 instanceof zzfw) {
                                int iA2 = ((zzfw) obj2).a();
                                iB7 = e0.D(iA2, iA2, iB7);
                            } else {
                                int iD4 = ((zzds) ((zzgl) obj2)).d(zzgvVarZ2);
                                iB7 = e0.D(iD4, iD4, iB7);
                            }
                        }
                    }
                    iD3 += iB7;
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case Service.MONITORING_FIELD_NUMBER /* 28 */:
                    List list7 = (List) unsafe.getObject(zzfiVar2, j11);
                    zzhj zzhjVar7 = zzgx.f12429a;
                    int size6 = list7.size();
                    if (size6 == 0) {
                        iB6 = 0;
                    } else {
                        iB6 = zzep.b(i17 << 3) * size6;
                        for (int i27 = 0; i27 < list7.size(); i27++) {
                            int iE4 = ((zzei) list7.get(i27)).e();
                            iB6 = e0.D(iE4, iE4, iB6);
                        }
                    }
                    iD3 += iB6;
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
                    List list8 = (List) unsafe.getObject(zzfiVar2, j11);
                    zzhj zzhjVar8 = zzgx.f12429a;
                    size = list8.size();
                    if (size == 0) {
                        iB6 = 0;
                    } else {
                        iK = zzgx.j(list8);
                        iB5 = zzep.b(i17 << 3);
                        iB6 = (iB5 * size) + iK;
                    }
                    iD3 += iB6;
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case 30:
                    List list9 = (List) unsafe.getObject(zzfiVar2, j11);
                    zzhj zzhjVar9 = zzgx.f12429a;
                    size = list9.size();
                    if (size == 0) {
                        iB6 = 0;
                    } else {
                        iK = zzgx.b(list9);
                        iB5 = zzep.b(i17 << 3);
                        iB6 = (iB5 * size) + iK;
                    }
                    iD3 += iB6;
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case 31:
                    iG = zzgx.c(i17, (List) unsafe.getObject(zzfiVar2, j11));
                    iD3 += iG;
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case Consts.SP /* 32 */:
                    iG = zzgx.d(i17, (List) unsafe.getObject(zzfiVar2, j11));
                    iD3 += iG;
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(zzfiVar2, j11);
                    zzhj zzhjVar10 = zzgx.f12429a;
                    size = list10.size();
                    if (size == 0) {
                        iB6 = 0;
                    } else {
                        iK = zzgx.h(list10);
                        iB5 = zzep.b(i17 << 3);
                        iB6 = (iB5 * size) + iK;
                    }
                    iD3 += iB6;
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                    List list11 = (List) unsafe.getObject(zzfiVar2, j11);
                    zzhj zzhjVar11 = zzgx.f12429a;
                    size = list11.size();
                    if (size == 0) {
                        iB6 = 0;
                    } else {
                        iK = zzgx.i(list11);
                        iB5 = zzep.b(i17 << 3);
                        iB6 = (iB5 * size) + iK;
                    }
                    iD3 += iB6;
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case 35:
                    List list12 = (List) unsafe.getObject(zzfiVar2, j11);
                    zzhj zzhjVar12 = zzgx.f12429a;
                    size2 = list12.size() * 8;
                    if (size2 > 0) {
                        iB8 = zzep.b(i17 << 3);
                        iB9 = zzep.b(size2);
                        iD3 += iB9 + iB8 + size2;
                    }
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    List list13 = (List) unsafe.getObject(zzfiVar2, j11);
                    zzhj zzhjVar13 = zzgx.f12429a;
                    size2 = list13.size() * 4;
                    if (size2 > 0) {
                        iB8 = zzep.b(i17 << 3);
                        iB9 = zzep.b(size2);
                        iD3 += iB9 + iB8 + size2;
                    }
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case 37:
                    size2 = zzgx.f((List) unsafe.getObject(zzfiVar2, j11));
                    if (size2 > 0) {
                        iB8 = zzep.b(i17 << 3);
                        iB9 = zzep.b(size2);
                        iD3 += iB9 + iB8 + size2;
                    }
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case 38:
                    size2 = zzgx.k((List) unsafe.getObject(zzfiVar2, j11));
                    if (size2 > 0) {
                        iB8 = zzep.b(i17 << 3);
                        iB9 = zzep.b(size2);
                        iD3 += iB9 + iB8 + size2;
                    }
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    size2 = zzgx.e((List) unsafe.getObject(zzfiVar2, j11));
                    if (size2 > 0) {
                        iB8 = zzep.b(i17 << 3);
                        iB9 = zzep.b(size2);
                        iD3 += iB9 + iB8 + size2;
                    }
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                    List list14 = (List) unsafe.getObject(zzfiVar2, j11);
                    zzhj zzhjVar14 = zzgx.f12429a;
                    size2 = list14.size() * 8;
                    if (size2 > 0) {
                        iB8 = zzep.b(i17 << 3);
                        iB9 = zzep.b(size2);
                        iD3 += iB9 + iB8 + size2;
                    }
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                    List list15 = (List) unsafe.getObject(zzfiVar2, j11);
                    zzhj zzhjVar15 = zzgx.f12429a;
                    size2 = list15.size() * 4;
                    if (size2 > 0) {
                        iB8 = zzep.b(i17 << 3);
                        iB9 = zzep.b(size2);
                        iD3 += iB9 + iB8 + size2;
                    }
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                    List list16 = (List) unsafe.getObject(zzfiVar2, j11);
                    zzhj zzhjVar16 = zzgx.f12429a;
                    size2 = list16.size();
                    if (size2 > 0) {
                        iB8 = zzep.b(i17 << 3);
                        iB9 = zzep.b(size2);
                        iD3 += iB9 + iB8 + size2;
                    }
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case 43:
                    size2 = zzgx.j((List) unsafe.getObject(zzfiVar2, j11));
                    if (size2 > 0) {
                        iB8 = zzep.b(i17 << 3);
                        iB9 = zzep.b(size2);
                        iD3 += iB9 + iB8 + size2;
                    }
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                    size2 = zzgx.b((List) unsafe.getObject(zzfiVar2, j11));
                    if (size2 > 0) {
                        iB8 = zzep.b(i17 << 3);
                        iB9 = zzep.b(size2);
                        iD3 += iB9 + iB8 + size2;
                    }
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                    List list17 = (List) unsafe.getObject(zzfiVar2, j11);
                    zzhj zzhjVar17 = zzgx.f12429a;
                    size2 = list17.size() * 4;
                    if (size2 > 0) {
                        iB8 = zzep.b(i17 << 3);
                        iB9 = zzep.b(size2);
                        iD3 += iB9 + iB8 + size2;
                    }
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case 46:
                    List list18 = (List) unsafe.getObject(zzfiVar2, j11);
                    zzhj zzhjVar18 = zzgx.f12429a;
                    size2 = list18.size() * 8;
                    if (size2 > 0) {
                        iB8 = zzep.b(i17 << 3);
                        iB9 = zzep.b(size2);
                        iD3 += iB9 + iB8 + size2;
                    }
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case 47:
                    size2 = zzgx.h((List) unsafe.getObject(zzfiVar2, j11));
                    if (size2 > 0) {
                        iB8 = zzep.b(i17 << 3);
                        iB9 = zzep.b(size2);
                        iD3 += iB9 + iB8 + size2;
                    }
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case 48:
                    size2 = zzgx.i((List) unsafe.getObject(zzfiVar2, j11));
                    if (size2 > 0) {
                        iB8 = zzep.b(i17 << 3);
                        iB9 = zzep.b(size2);
                        iD3 += iB9 + iB8 + size2;
                    }
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case 49:
                    List list19 = (List) unsafe.getObject(zzfiVar2, j11);
                    zzgv zzgvVarZ3 = zzgoVar.z(i14);
                    zzhj zzhjVar19 = zzgx.f12429a;
                    int size7 = list19.size();
                    if (size7 == 0) {
                        iD2 = 0;
                    } else {
                        iD2 = 0;
                        for (int i28 = 0; i28 < size7; i28++) {
                            zzgl zzglVar2 = (zzgl) list19.get(i28);
                            int iB12 = zzep.b(i17 << 3);
                            iD2 += ((zzds) zzglVar2).d(zzgvVarZ3) + iB12 + iB12;
                        }
                    }
                    iD3 += iD2;
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case 50:
                    int i29 = i14 / 3;
                    zzgf zzgfVar = (zzgf) unsafe.getObject(zzfiVar2, j11);
                    if (zzgfVar.isEmpty()) {
                        continue;
                    } else {
                        Iterator it2 = zzgfVar.entrySet().iterator();
                        if (it2.hasNext()) {
                            Map.Entry entry2 = (Map.Entry) it2.next();
                            entry2.getKey();
                            entry2.getValue();
                            throw null;
                        }
                    }
                    i14 += 3;
                    i13 = 1048575;
                case 51:
                    if (zzgoVar.p(i17, i14, zzfiVar2)) {
                        iD3 = e0.D(i17 << 3, 8, iD3);
                    }
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case 52:
                    if (zzgoVar.p(i17, i14, zzfiVar2)) {
                        iD3 = e0.D(i17 << 3, 4, iD3);
                    }
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case 53:
                    if (zzgoVar.p(i17, i14, zzfiVar2)) {
                        long jX = x(j11, zzfiVar2);
                        iB10 = zzep.b(i17 << 3);
                        iC2 = zzep.c(jX);
                        iD3 += iC2 + iB10;
                    }
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case 54:
                    if (zzgoVar.p(i17, i14, zzfiVar2)) {
                        long jX2 = x(j11, zzfiVar2);
                        iB10 = zzep.b(i17 << 3);
                        iC2 = zzep.c(jX2);
                        iD3 += iC2 + iB10;
                    }
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case 55:
                    if (zzgoVar.p(i17, i14, zzfiVar2)) {
                        long jT = t(j11, zzfiVar2);
                        iB10 = zzep.b(i17 << 3);
                        iC2 = zzep.c(jT);
                        iD3 += iC2 + iB10;
                    }
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case 56:
                    if (zzgoVar.p(i17, i14, zzfiVar2)) {
                        iD3 = e0.D(i17 << 3, 8, iD3);
                    }
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case 57:
                    if (zzgoVar.p(i17, i14, zzfiVar2)) {
                        iD3 = e0.D(i17 << 3, 4, iD3);
                    }
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case 58:
                    if (zzgoVar.p(i17, i14, zzfiVar2)) {
                        iD3 = e0.D(i17 << 3, 1, iD3);
                    }
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case 59:
                    if (zzgoVar.p(i17, i14, zzfiVar2)) {
                        int i30 = i17 << 3;
                        Object object2 = unsafe.getObject(zzfiVar2, j11);
                        if (object2 instanceof zzei) {
                            size2 = zzep.b(i30);
                            iB8 = ((zzei) object2).e();
                            iB9 = zzep.b(iB8);
                            iD3 += iB9 + iB8 + size2;
                        } else {
                            iB10 = zzep.b(i30);
                            iC2 = zzep.a((String) object2);
                            iD3 += iC2 + iB10;
                        }
                    }
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case 60:
                    if (zzgoVar.p(i17, i14, zzfiVar2)) {
                        iG = zzgx.g(i17, unsafe.getObject(zzfiVar2, j11), zzgoVar.z(i14));
                        iD3 += iG;
                    }
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case 61:
                    if (zzgoVar.p(i17, i14, zzfiVar2)) {
                        zzei zzeiVar2 = (zzei) unsafe.getObject(zzfiVar2, j11);
                        size2 = zzep.b(i17 << 3);
                        iB8 = zzeiVar2.e();
                        iB9 = zzep.b(iB8);
                        iD3 += iB9 + iB8 + size2;
                    }
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case 62:
                    if (zzgoVar.p(i17, i14, zzfiVar2)) {
                        iD3 = e0.D(t(j11, zzfiVar2), zzep.b(i17 << 3), iD3);
                    }
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case 63:
                    if (zzgoVar.p(i17, i14, zzfiVar2)) {
                        long jT2 = t(j11, zzfiVar2);
                        iB10 = zzep.b(i17 << 3);
                        iC2 = zzep.c(jT2);
                        iD3 += iC2 + iB10;
                    }
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case 64:
                    if (zzgoVar.p(i17, i14, zzfiVar2)) {
                        iD3 = e0.D(i17 << 3, 4, iD3);
                    }
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case 65:
                    if (zzgoVar.p(i17, i14, zzfiVar2)) {
                        iD3 = e0.D(i17 << 3, 8, iD3);
                    }
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case 66:
                    if (zzgoVar.p(i17, i14, zzfiVar2)) {
                        int iT = t(j11, zzfiVar2);
                        iD3 = e0.D((iT >> 31) ^ (iT + iT), zzep.b(i17 << 3), iD3);
                    }
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case 67:
                    if (zzgoVar.p(i17, i14, zzfiVar2)) {
                        long jX3 = x(j11, zzfiVar2);
                        iB10 = zzep.b(i17 << 3);
                        iC2 = zzep.c((jX3 >> 63) ^ (jX3 + jX3));
                        iD3 += iC2 + iB10;
                    }
                    i14 += 3;
                    i13 = 1048575;
                    break;
                case 68:
                    if (zzgoVar.p(i17, i14, zzfiVar2)) {
                        zzgl zzglVar3 = (zzgl) unsafe.getObject(zzfiVar2, j11);
                        zzgv zzgvVarZ4 = zzgoVar.z(i14);
                        int iB13 = zzep.b(i17 << 3);
                        i12 = iB13 + iB13;
                        iD = ((zzds) zzglVar3).d(zzgvVarZ4);
                        iD3 += iD + i12;
                    }
                    i14 += 3;
                    i13 = 1048575;
                    break;
                default:
                    i14 += 3;
                    i13 = 1048575;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00db A[PHI: r1
      0x00db: PHI (r1v35 int) = (r1v11 int), (r1v36 int) binds: [B:86:0x01ea, B:44:0x00d9] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.play_billing.zzgv
    public final int d(zzfi zzfiVar) {
        int i11;
        long jDoubleToLongBits;
        int i12;
        int iFloatToIntBits;
        int iE;
        int i13;
        int i14;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            int[] iArr = this.f12402a;
            if (i15 >= iArr.length) {
                int iHashCode = zzfiVar.zzc.hashCode() + (i16 * 53);
                return this.f12407f ? (iHashCode * 53) + ((zzff) zzfiVar).zzb.f12370a.hashCode() : iHashCode;
            }
            int iW = w(i15);
            int i17 = 1048575 & iW;
            int iV = v(iW);
            int i18 = iArr[i15];
            long j11 = i17;
            int i19 = 1237;
            int iHashCode2 = 37;
            switch (iV) {
                case 0:
                    i11 = i16 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(zzho.f12458c.a(zzfiVar, j11));
                    Charset charset = zzfo.f12383a;
                    iE = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i16 = i11 + iE;
                    break;
                case 1:
                    i12 = i16 * 53;
                    iFloatToIntBits = Float.floatToIntBits(zzho.f12458c.b(zzfiVar, j11));
                    i16 = iFloatToIntBits + i12;
                    break;
                case 2:
                    i11 = i16 * 53;
                    jDoubleToLongBits = zzho.f(zzfiVar, j11);
                    Charset charset2 = zzfo.f12383a;
                    iE = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i16 = i11 + iE;
                    break;
                case 3:
                    i11 = i16 * 53;
                    jDoubleToLongBits = zzho.f(zzfiVar, j11);
                    Charset charset3 = zzfo.f12383a;
                    iE = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i16 = i11 + iE;
                    break;
                case 4:
                    i11 = i16 * 53;
                    iE = zzho.e(zzfiVar, j11);
                    i16 = i11 + iE;
                    break;
                case 5:
                    i11 = i16 * 53;
                    jDoubleToLongBits = zzho.f(zzfiVar, j11);
                    Charset charset4 = zzfo.f12383a;
                    iE = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i16 = i11 + iE;
                    break;
                case 6:
                    i11 = i16 * 53;
                    iE = zzho.e(zzfiVar, j11);
                    i16 = i11 + iE;
                    break;
                case 7:
                    i13 = i16 * 53;
                    boolean zG = zzho.f12458c.g(zzfiVar, j11);
                    Charset charset5 = zzfo.f12383a;
                    if (zG) {
                        i19 = 1231;
                    }
                    i16 = i19 + i13;
                    break;
                case 8:
                    i12 = i16 * 53;
                    iFloatToIntBits = ((String) zzho.h(zzfiVar, j11)).hashCode();
                    i16 = iFloatToIntBits + i12;
                    break;
                case 9:
                    i14 = i16 * 53;
                    Object objH = zzho.h(zzfiVar, j11);
                    if (objH != null) {
                        iHashCode2 = objH.hashCode();
                    }
                    i16 = i14 + iHashCode2;
                    break;
                case 10:
                    i12 = i16 * 53;
                    iFloatToIntBits = zzho.h(zzfiVar, j11).hashCode();
                    i16 = iFloatToIntBits + i12;
                    break;
                case 11:
                    i11 = i16 * 53;
                    iE = zzho.e(zzfiVar, j11);
                    i16 = i11 + iE;
                    break;
                case 12:
                    i11 = i16 * 53;
                    iE = zzho.e(zzfiVar, j11);
                    i16 = i11 + iE;
                    break;
                case 13:
                    i11 = i16 * 53;
                    iE = zzho.e(zzfiVar, j11);
                    i16 = i11 + iE;
                    break;
                case 14:
                    i11 = i16 * 53;
                    jDoubleToLongBits = zzho.f(zzfiVar, j11);
                    Charset charset6 = zzfo.f12383a;
                    iE = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i16 = i11 + iE;
                    break;
                case 15:
                    i11 = i16 * 53;
                    iE = zzho.e(zzfiVar, j11);
                    i16 = i11 + iE;
                    break;
                case 16:
                    i11 = i16 * 53;
                    jDoubleToLongBits = zzho.f(zzfiVar, j11);
                    Charset charset7 = zzfo.f12383a;
                    iE = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i16 = i11 + iE;
                    break;
                case 17:
                    i14 = i16 * 53;
                    Object objH2 = zzho.h(zzfiVar, j11);
                    if (objH2 != null) {
                        iHashCode2 = objH2.hashCode();
                    }
                    i16 = i14 + iHashCode2;
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
                    i12 = i16 * 53;
                    iFloatToIntBits = zzho.h(zzfiVar, j11).hashCode();
                    i16 = iFloatToIntBits + i12;
                    break;
                case 50:
                    i12 = i16 * 53;
                    iFloatToIntBits = zzho.h(zzfiVar, j11).hashCode();
                    i16 = iFloatToIntBits + i12;
                    break;
                case 51:
                    if (p(i18, i15, zzfiVar)) {
                        i11 = i16 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(((Double) zzho.h(zzfiVar, j11)).doubleValue());
                        Charset charset8 = zzfo.f12383a;
                        iE = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i16 = i11 + iE;
                    }
                    break;
                case 52:
                    if (p(i18, i15, zzfiVar)) {
                        i12 = i16 * 53;
                        iFloatToIntBits = Float.floatToIntBits(((Float) zzho.h(zzfiVar, j11)).floatValue());
                        i16 = iFloatToIntBits + i12;
                    }
                    break;
                case 53:
                    if (p(i18, i15, zzfiVar)) {
                        i11 = i16 * 53;
                        jDoubleToLongBits = x(j11, zzfiVar);
                        Charset charset9 = zzfo.f12383a;
                        iE = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i16 = i11 + iE;
                    }
                    break;
                case 54:
                    if (p(i18, i15, zzfiVar)) {
                        i11 = i16 * 53;
                        jDoubleToLongBits = x(j11, zzfiVar);
                        Charset charset10 = zzfo.f12383a;
                        iE = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i16 = i11 + iE;
                    }
                    break;
                case 55:
                    if (p(i18, i15, zzfiVar)) {
                        i11 = i16 * 53;
                        iE = t(j11, zzfiVar);
                        i16 = i11 + iE;
                    }
                    break;
                case 56:
                    if (p(i18, i15, zzfiVar)) {
                        i11 = i16 * 53;
                        jDoubleToLongBits = x(j11, zzfiVar);
                        Charset charset11 = zzfo.f12383a;
                        iE = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i16 = i11 + iE;
                    }
                    break;
                case 57:
                    if (p(i18, i15, zzfiVar)) {
                        i11 = i16 * 53;
                        iE = t(j11, zzfiVar);
                        i16 = i11 + iE;
                    }
                    break;
                case 58:
                    if (p(i18, i15, zzfiVar)) {
                        i13 = i16 * 53;
                        boolean zBooleanValue = ((Boolean) zzho.h(zzfiVar, j11)).booleanValue();
                        Charset charset12 = zzfo.f12383a;
                        if (zBooleanValue) {
                            i19 = 1231;
                        }
                        i16 = i19 + i13;
                    }
                    break;
                case 59:
                    if (p(i18, i15, zzfiVar)) {
                        i12 = i16 * 53;
                        iFloatToIntBits = ((String) zzho.h(zzfiVar, j11)).hashCode();
                        i16 = iFloatToIntBits + i12;
                    }
                    break;
                case 60:
                    if (p(i18, i15, zzfiVar)) {
                        i12 = i16 * 53;
                        iFloatToIntBits = zzho.h(zzfiVar, j11).hashCode();
                        i16 = iFloatToIntBits + i12;
                    }
                    break;
                case 61:
                    if (p(i18, i15, zzfiVar)) {
                        i12 = i16 * 53;
                        iFloatToIntBits = zzho.h(zzfiVar, j11).hashCode();
                        i16 = iFloatToIntBits + i12;
                    }
                    break;
                case 62:
                    if (p(i18, i15, zzfiVar)) {
                        i11 = i16 * 53;
                        iE = t(j11, zzfiVar);
                        i16 = i11 + iE;
                    }
                    break;
                case 63:
                    if (p(i18, i15, zzfiVar)) {
                        i11 = i16 * 53;
                        iE = t(j11, zzfiVar);
                        i16 = i11 + iE;
                    }
                    break;
                case 64:
                    if (p(i18, i15, zzfiVar)) {
                        i11 = i16 * 53;
                        iE = t(j11, zzfiVar);
                        i16 = i11 + iE;
                    }
                    break;
                case 65:
                    if (p(i18, i15, zzfiVar)) {
                        i11 = i16 * 53;
                        jDoubleToLongBits = x(j11, zzfiVar);
                        Charset charset13 = zzfo.f12383a;
                        iE = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i16 = i11 + iE;
                    }
                    break;
                case 66:
                    if (p(i18, i15, zzfiVar)) {
                        i11 = i16 * 53;
                        iE = t(j11, zzfiVar);
                        i16 = i11 + iE;
                    }
                    break;
                case 67:
                    if (p(i18, i15, zzfiVar)) {
                        i11 = i16 * 53;
                        jDoubleToLongBits = x(j11, zzfiVar);
                        Charset charset14 = zzfo.f12383a;
                        iE = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i16 = i11 + iE;
                    }
                    break;
                case 68:
                    if (p(i18, i15, zzfiVar)) {
                        i12 = i16 * 53;
                        iFloatToIntBits = zzho.h(zzfiVar, j11).hashCode();
                        i16 = iFloatToIntBits + i12;
                    }
                    break;
            }
            i15 += 3;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzgv
    public final void e(Object obj, byte[] bArr, int i11, int i12, zzdw zzdwVar) {
        q(obj, bArr, i11, i12, 0, zzdwVar);
    }

    @Override // com.google.android.gms.internal.play_billing.zzgv
    public final boolean f(zzfi zzfiVar, zzfi zzfiVar2) {
        boolean zA;
        int i11 = 0;
        while (true) {
            int[] iArr = this.f12402a;
            if (i11 < iArr.length) {
                int iW = w(i11);
                long j11 = iW & 1048575;
                switch (v(iW)) {
                    case 0:
                        if (l(zzfiVar, zzfiVar2, i11)) {
                            zzhn zzhnVar = zzho.f12458c;
                            if (Double.doubleToLongBits(zzhnVar.a(zzfiVar, j11)) == Double.doubleToLongBits(zzhnVar.a(zzfiVar2, j11))) {
                                continue;
                                i11 += 3;
                            }
                        }
                        break;
                    case 1:
                        if (l(zzfiVar, zzfiVar2, i11)) {
                            zzhn zzhnVar2 = zzho.f12458c;
                            if (Float.floatToIntBits(zzhnVar2.b(zzfiVar, j11)) == Float.floatToIntBits(zzhnVar2.b(zzfiVar2, j11))) {
                                continue;
                                i11 += 3;
                            }
                        }
                        break;
                    case 2:
                        if (l(zzfiVar, zzfiVar2, i11) && zzho.f(zzfiVar, j11) == zzho.f(zzfiVar2, j11)) {
                            continue;
                            i11 += 3;
                        }
                        break;
                    case 3:
                        if (l(zzfiVar, zzfiVar2, i11) && zzho.f(zzfiVar, j11) == zzho.f(zzfiVar2, j11)) {
                            continue;
                            i11 += 3;
                        }
                        break;
                    case 4:
                        if (l(zzfiVar, zzfiVar2, i11) && zzho.e(zzfiVar, j11) == zzho.e(zzfiVar2, j11)) {
                            continue;
                            i11 += 3;
                        }
                        break;
                    case 5:
                        if (l(zzfiVar, zzfiVar2, i11) && zzho.f(zzfiVar, j11) == zzho.f(zzfiVar2, j11)) {
                            continue;
                            i11 += 3;
                        }
                        break;
                    case 6:
                        if (l(zzfiVar, zzfiVar2, i11) && zzho.e(zzfiVar, j11) == zzho.e(zzfiVar2, j11)) {
                            continue;
                            i11 += 3;
                        }
                        break;
                    case 7:
                        if (l(zzfiVar, zzfiVar2, i11)) {
                            zzhn zzhnVar3 = zzho.f12458c;
                            if (zzhnVar3.g(zzfiVar, j11) == zzhnVar3.g(zzfiVar2, j11)) {
                                continue;
                                i11 += 3;
                            }
                        }
                        break;
                    case 8:
                        if (l(zzfiVar, zzfiVar2, i11) && zzgx.a(zzho.h(zzfiVar, j11), zzho.h(zzfiVar2, j11))) {
                            continue;
                            i11 += 3;
                        }
                        break;
                    case 9:
                        if (l(zzfiVar, zzfiVar2, i11) && zzgx.a(zzho.h(zzfiVar, j11), zzho.h(zzfiVar2, j11))) {
                            continue;
                            i11 += 3;
                        }
                        break;
                    case 10:
                        if (l(zzfiVar, zzfiVar2, i11) && zzgx.a(zzho.h(zzfiVar, j11), zzho.h(zzfiVar2, j11))) {
                            continue;
                            i11 += 3;
                        }
                        break;
                    case 11:
                        if (l(zzfiVar, zzfiVar2, i11) && zzho.e(zzfiVar, j11) == zzho.e(zzfiVar2, j11)) {
                            continue;
                            i11 += 3;
                        }
                        break;
                    case 12:
                        if (l(zzfiVar, zzfiVar2, i11) && zzho.e(zzfiVar, j11) == zzho.e(zzfiVar2, j11)) {
                            continue;
                            i11 += 3;
                        }
                        break;
                    case 13:
                        if (l(zzfiVar, zzfiVar2, i11) && zzho.e(zzfiVar, j11) == zzho.e(zzfiVar2, j11)) {
                            continue;
                            i11 += 3;
                        }
                        break;
                    case 14:
                        if (l(zzfiVar, zzfiVar2, i11) && zzho.f(zzfiVar, j11) == zzho.f(zzfiVar2, j11)) {
                            continue;
                            i11 += 3;
                        }
                        break;
                    case 15:
                        if (l(zzfiVar, zzfiVar2, i11) && zzho.e(zzfiVar, j11) == zzho.e(zzfiVar2, j11)) {
                            continue;
                            i11 += 3;
                        }
                        break;
                    case 16:
                        if (l(zzfiVar, zzfiVar2, i11) && zzho.f(zzfiVar, j11) == zzho.f(zzfiVar2, j11)) {
                            continue;
                            i11 += 3;
                        }
                        break;
                    case 17:
                        if (l(zzfiVar, zzfiVar2, i11) && zzgx.a(zzho.h(zzfiVar, j11), zzho.h(zzfiVar2, j11))) {
                            continue;
                            i11 += 3;
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
                        zA = zzgx.a(zzho.h(zzfiVar, j11), zzho.h(zzfiVar2, j11));
                        break;
                    case 50:
                        zA = zzgx.a(zzho.h(zzfiVar, j11), zzho.h(zzfiVar2, j11));
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
                        if (zzho.e(zzfiVar, j12) == zzho.e(zzfiVar2, j12) && zzgx.a(zzho.h(zzfiVar, j11), zzho.h(zzfiVar2, j11))) {
                            continue;
                            i11 += 3;
                        }
                        break;
                    default:
                        continue;
                        i11 += 3;
                        break;
                }
                if (zA) {
                    i11 += 3;
                }
            } else if (zzfiVar.zzc.equals(zzfiVar2.zzc)) {
                if (this.f12407f) {
                    return ((zzff) zzfiVar).zzb.equals(((zzff) zzfiVar2).zzb);
                }
                return true;
            }
        }
        return false;
    }

    public final void g(int i11, Object obj, Object obj2) {
        if (m(i11, obj2)) {
            int iW = w(i11) & 1048575;
            Unsafe unsafe = m;
            long j11 = iW;
            Object object = unsafe.getObject(obj2, j11);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f12402a[i11] + " is present but null: " + obj2.toString());
            }
            zzgv zzgvVarZ = z(i11);
            if (!m(i11, obj)) {
                if (o(object)) {
                    Object objZze = zzgvVarZ.zze();
                    zzgvVarZ.zzg(objZze, object);
                    unsafe.putObject(obj, j11, objZze);
                } else {
                    unsafe.putObject(obj, j11, object);
                }
                i(i11, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j11);
            if (!o(object2)) {
                Object objZze2 = zzgvVarZ.zze();
                zzgvVarZ.zzg(objZze2, object2);
                unsafe.putObject(obj, j11, objZze2);
                object2 = objZze2;
            }
            zzgvVarZ.zzg(object2, object);
        }
    }

    public final void h(int i11, Object obj, Object obj2) {
        int[] iArr = this.f12402a;
        int i12 = iArr[i11];
        if (p(i12, i11, obj2)) {
            int iW = w(i11) & 1048575;
            Unsafe unsafe = m;
            long j11 = iW;
            Object object = unsafe.getObject(obj2, j11);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i11] + " is present but null: " + obj2.toString());
            }
            zzgv zzgvVarZ = z(i11);
            if (!p(i12, i11, obj)) {
                if (o(object)) {
                    Object objZze = zzgvVarZ.zze();
                    zzgvVarZ.zzg(objZze, object);
                    unsafe.putObject(obj, j11, objZze);
                } else {
                    unsafe.putObject(obj, j11, object);
                }
                zzho.j(obj, iArr[i11 + 2] & 1048575, i12);
                return;
            }
            Object object2 = unsafe.getObject(obj, j11);
            if (!o(object2)) {
                Object objZze2 = zzgvVarZ.zze();
                zzgvVarZ.zzg(objZze2, object2);
                unsafe.putObject(obj, j11, objZze2);
                object2 = objZze2;
            }
            zzgvVarZ.zzg(object2, object);
        }
    }

    public final void i(int i11, Object obj) {
        int i12 = this.f12402a[i11 + 2];
        long j11 = 1048575 & i12;
        if (j11 == 1048575) {
            return;
        }
        zzho.j(obj, j11, (1 << (i12 >>> 20)) | zzho.e(obj, j11));
    }

    public final void j(int i11, Object obj, Object obj2) {
        m.putObject(obj, w(i11) & 1048575, obj2);
        i(i11, obj);
    }

    public final void k(Object obj, int i11, int i12, Object obj2) {
        m.putObject(obj, w(i12) & 1048575, obj2);
        zzho.j(obj, this.f12402a[i12 + 2] & 1048575, i11);
    }

    public final boolean l(zzfi zzfiVar, zzfi zzfiVar2, int i11) {
        return m(i11, zzfiVar) == m(i11, zzfiVar2);
    }

    public final boolean m(int i11, Object obj) {
        int i12 = this.f12402a[i11 + 2];
        long j11 = i12 & 1048575;
        if (j11 == 1048575) {
            int iW = w(i11);
            long j12 = iW & 1048575;
            switch (v(iW)) {
                case 0:
                    if (Double.doubleToRawLongBits(zzho.f12458c.a(obj, j12)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(zzho.f12458c.b(obj, j12)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (zzho.f(obj, j12) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (zzho.f(obj, j12) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (zzho.e(obj, j12) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (zzho.f(obj, j12) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (zzho.e(obj, j12) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return zzho.f12458c.g(obj, j12);
                case 8:
                    Object objH = zzho.h(obj, j12);
                    if (objH instanceof String) {
                        if (((String) objH).isEmpty()) {
                            return false;
                        }
                    } else {
                        if (!(objH instanceof zzei)) {
                            throw new IllegalArgumentException();
                        }
                        if (zzei.f12350b.equals(objH)) {
                            return false;
                        }
                    }
                case 9:
                    if (zzho.h(obj, j12) == null) {
                        return false;
                    }
                    break;
                case 10:
                    if (zzei.f12350b.equals(zzho.h(obj, j12))) {
                        return false;
                    }
                    break;
                case 11:
                    if (zzho.e(obj, j12) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (zzho.e(obj, j12) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (zzho.e(obj, j12) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (zzho.f(obj, j12) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (zzho.e(obj, j12) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (zzho.f(obj, j12) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (zzho.h(obj, j12) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i12 >>> 20)) & zzho.e(obj, j11)) == 0) {
            return false;
        }
        return true;
    }

    public final boolean n(Object obj, int i11, int i12, int i13, int i14) {
        if (i12 == 1048575) {
            return m(i11, obj);
        }
        return (i13 & i14) != 0;
    }

    public final boolean p(int i11, int i12, Object obj) {
        return zzho.e(obj, (long) (this.f12402a[i12 + 2] & 1048575)) == i11;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 45841. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final int q(java.lang.Object r38, byte[] r39, int r40, int r41, int r42, com.google.android.gms.internal.play_billing.zzdw r43) {
        /*
            Method dump skipped, instruction units count: 4584
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzgo.q(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.play_billing.zzdw):int");
    }

    public final int u(int i11, int i12) {
        int[] iArr = this.f12402a;
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

    public final int w(int i11) {
        return this.f12402a[i11 + 1];
    }

    public final zzfl y(int i11) {
        int i12 = i11 / 3;
        return (zzfl) this.f12403b[i12 + i12 + 1];
    }

    public final zzgv z(int i11) {
        int i12 = i11 / 3;
        int i13 = i12 + i12;
        Object[] objArr = this.f12403b;
        zzgv zzgvVar = (zzgv) objArr[i13];
        if (zzgvVar != null) {
            return zzgvVar;
        }
        zzgv zzgvVarA = zzgs.f12418c.a((Class) objArr[i13 + 1]);
        objArr[i13] = zzgvVarA;
        return zzgvVarA;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgv
    public final Object zze() {
        return (zzfi) ((zzfi) this.f12406e).f(4);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006c  */
    /* JADX WARN: Code duplicated, block: B:28:0x0072  */
    /* JADX WARN: Code duplicated, block: B:41:0x007f A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.play_billing.zzgv
    public final void zzf(Object obj) {
        if (!o(obj)) {
            return;
        }
        if (obj instanceof zzfi) {
            zzfi zzfiVar = (zzfi) obj;
            zzfiVar.n();
            zzfiVar.zza = 0;
            zzfiVar.l();
        }
        int i11 = 0;
        while (true) {
            int[] iArr = this.f12402a;
            if (i11 >= iArr.length) {
                this.f12411j.b(obj);
                if (this.f12407f) {
                    this.f12412k.a(obj);
                    return;
                }
                return;
            }
            int iW = w(i11);
            int i12 = 1048575 & iW;
            int iV = v(iW);
            long j11 = i12;
            if (iV != 9) {
                if (iV != 60 && iV != 68) {
                    switch (iV) {
                        case 17:
                            if (m(i11, obj)) {
                                z(i11).zzf(m.getObject(obj, j11));
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
                            ((zzfn) zzho.h(obj, j11)).zzb();
                            break;
                        case 50:
                            Unsafe unsafe = m;
                            Object object = unsafe.getObject(obj, j11);
                            if (object != null) {
                                ((zzgf) object).f12398a = false;
                                unsafe.putObject(obj, j11, object);
                            }
                            break;
                    }
                } else if (p(iArr[i11], i11, obj)) {
                    z(i11).zzf(m.getObject(obj, j11));
                }
            } else if (m(i11, obj)) {
                z(i11).zzf(m.getObject(obj, j11));
            }
            i11 += 3;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    @Override // com.google.android.gms.internal.play_billing.zzgv
    public final void zzg(Object obj, Object obj2) {
        Object obj3;
        if (!o(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
        obj2.getClass();
        int i11 = 0;
        while (true) {
            int[] iArr = this.f12402a;
            if (i11 >= iArr.length) {
                Object obj4 = obj;
                zzgx.l(obj4, obj2);
                if (!this.f12407f || ((zzff) obj2).zzb.f12370a.isEmpty()) {
                    return;
                }
                throw null;
            }
            int iW = w(i11);
            int i12 = iW & 1048575;
            int iV = v(iW);
            int i13 = iArr[i11];
            long j11 = i12;
            switch (iV) {
                case 0:
                    if (!m(i11, obj2)) {
                        obj3 = obj;
                    } else {
                        zzhn zzhnVar = zzho.f12458c;
                        obj3 = obj;
                        zzhnVar.e(obj3, j11, zzhnVar.a(obj2, j11));
                        i(i11, obj3);
                    }
                    break;
                case 1:
                    if (m(i11, obj2)) {
                        zzhn zzhnVar2 = zzho.f12458c;
                        zzhnVar2.f(obj, j11, zzhnVar2.b(obj2, j11));
                        i(i11, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (m(i11, obj2)) {
                        zzho.k(obj, j11, zzho.f(obj2, j11));
                        i(i11, obj);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (m(i11, obj2)) {
                        zzho.k(obj, j11, zzho.f(obj2, j11));
                        i(i11, obj);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (m(i11, obj2)) {
                        zzho.j(obj, j11, zzho.e(obj2, j11));
                        i(i11, obj);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (m(i11, obj2)) {
                        zzho.k(obj, j11, zzho.f(obj2, j11));
                        i(i11, obj);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (m(i11, obj2)) {
                        zzho.j(obj, j11, zzho.e(obj2, j11));
                        i(i11, obj);
                    }
                    obj3 = obj;
                    break;
                case 7:
                    if (m(i11, obj2)) {
                        zzhn zzhnVar3 = zzho.f12458c;
                        zzhnVar3.c(obj, j11, zzhnVar3.g(obj2, j11));
                        i(i11, obj);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (m(i11, obj2)) {
                        zzho.l(obj, j11, zzho.h(obj2, j11));
                        i(i11, obj);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    g(i11, obj, obj2);
                    obj3 = obj;
                    break;
                case 10:
                    if (m(i11, obj2)) {
                        zzho.l(obj, j11, zzho.h(obj2, j11));
                        i(i11, obj);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (m(i11, obj2)) {
                        zzho.j(obj, j11, zzho.e(obj2, j11));
                        i(i11, obj);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (m(i11, obj2)) {
                        zzho.j(obj, j11, zzho.e(obj2, j11));
                        i(i11, obj);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (m(i11, obj2)) {
                        zzho.j(obj, j11, zzho.e(obj2, j11));
                        i(i11, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (m(i11, obj2)) {
                        zzho.k(obj, j11, zzho.f(obj2, j11));
                        i(i11, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (m(i11, obj2)) {
                        zzho.j(obj, j11, zzho.e(obj2, j11));
                        i(i11, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (m(i11, obj2)) {
                        zzho.k(obj, j11, zzho.f(obj2, j11));
                        i(i11, obj);
                    }
                    obj3 = obj;
                    break;
                case 17:
                    g(i11, obj, obj2);
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
                    zzfn zzfnVarZzd = (zzfn) zzho.h(obj, j11);
                    zzfn zzfnVar = (zzfn) zzho.h(obj2, j11);
                    int size = zzfnVarZzd.size();
                    int size2 = zzfnVar.size();
                    if (size > 0 && size2 > 0) {
                        if (!zzfnVarZzd.zzc()) {
                            zzfnVarZzd = zzfnVarZzd.zzd(size2 + size);
                        }
                        zzfnVarZzd.addAll(zzfnVar);
                    }
                    if (size > 0) {
                        zzfnVar = zzfnVarZzd;
                    }
                    zzho.l(obj, j11, zzfnVar);
                    obj3 = obj;
                    break;
                case 50:
                    zzhj zzhjVar = zzgx.f12429a;
                    zzho.l(obj, j11, zzgg.a(zzho.h(obj, j11), zzho.h(obj2, j11)));
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
                    if (p(i13, i11, obj2)) {
                        zzho.l(obj, j11, zzho.h(obj2, j11));
                        zzho.j(obj, iArr[i11 + 2] & 1048575, i13);
                    }
                    obj3 = obj;
                    break;
                case 60:
                    h(i11, obj, obj2);
                    obj3 = obj;
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (p(i13, i11, obj2)) {
                        zzho.l(obj, j11, zzho.h(obj2, j11));
                        zzho.j(obj, iArr[i11 + 2] & 1048575, i13);
                    }
                    obj3 = obj;
                    break;
                case 68:
                    h(i11, obj, obj2);
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
}
