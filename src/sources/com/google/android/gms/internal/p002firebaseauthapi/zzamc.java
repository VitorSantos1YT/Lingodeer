package com.google.android.gms.internal.p002firebaseauthapi;

import b7.e0;
import com.google.api.Service;
import com.google.protobuf.DescriptorProtos;
import com.stkouyu.util.httputil.Consts;
import com.tbruyelle.rxpermissions3.BuildConfig;
import defpackage.e;
import java.lang.reflect.Field;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzamc<T> implements zzamr<T> {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int[] f10160p = new int[0];

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Unsafe f10161q = zzank.g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f10162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f10163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f10164c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f10165d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final zzaly f10166e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f10167f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f10168g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int[] f10169h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f10170i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f10171j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final zzamg f10172k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final zzali f10173l;
    public final zzanf m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final zzakl f10174n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final zzalv f10175o;

    public zzamc(int[] iArr, Object[] objArr, int i11, int i12, zzaly zzalyVar, int[] iArr2, int i13, int i14, zzamg zzamgVar, zzali zzaliVar, zzanf zzanfVar, zzakl zzaklVar, zzalv zzalvVar) {
        this.f10162a = iArr;
        this.f10163b = objArr;
        this.f10164c = i11;
        this.f10165d = i12;
        this.f10168g = zzalyVar instanceof zzaku;
        this.f10167f = zzaklVar != null && zzaklVar.g(zzalyVar);
        this.f10169h = iArr2;
        this.f10170i = i13;
        this.f10171j = i14;
        this.f10172k = zzamgVar;
        this.f10173l = zzaliVar;
        this.m = zzanfVar;
        this.f10174n = zzaklVar;
        this.f10166e = zzalyVar;
        this.f10175o = zzalvVar;
    }

    public static int A(Object obj, long j11) {
        return ((Integer) zzank.m(j11, obj)).intValue();
    }

    public static zzani B(Object obj) {
        zzaku zzakuVar = (zzaku) obj;
        zzani zzaniVar = zzakuVar.zzb;
        if (zzaniVar != zzani.f10217f) {
            return zzaniVar;
        }
        zzani zzaniVarE = zzani.e();
        zzakuVar.zzb = zzaniVarE;
        return zzaniVarE;
    }

    public static long F(Object obj, long j11) {
        return ((Long) zzank.m(j11, obj)).longValue();
    }

    public static void J(Object obj) {
        if (!K(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    public static boolean K(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzaku) {
            return ((zzaku) obj).u();
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:121:0x0251  */
    /* JADX WARN: Code duplicated, block: B:123:0x0255  */
    /* JADX WARN: Code duplicated, block: B:126:0x0273  */
    /* JADX WARN: Code duplicated, block: B:127:0x0276  */
    /* JADX WARN: Code duplicated, block: B:164:0x032d  */
    /* JADX WARN: Code duplicated, block: B:179:0x0382  */
    public static zzamc l(zzalw zzalwVar, zzamg zzamgVar, zzali zzaliVar, zzanf zzanfVar, zzakk zzakkVar, zzalv zzalvVar) {
        int i11;
        int iCharAt;
        int[] iArr;
        int i12;
        int i13;
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
        int i27;
        int i28;
        int[] iArr2;
        int i29;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i30;
        int i31;
        int i32;
        Field fieldP;
        int i33;
        char cCharAt8;
        int i34;
        int i35;
        int i36;
        Object obj;
        Field fieldP2;
        int i37;
        Object obj2;
        Field fieldP3;
        int i38;
        char cCharAt9;
        int i39;
        char cCharAt10;
        int i40;
        char cCharAt11;
        int i41;
        char cCharAt12;
        if (!(zzalwVar instanceof zzamp)) {
            throw new NoSuchMethodError();
        }
        zzamp zzampVar = (zzamp) zzalwVar;
        String str = zzampVar.f10191b;
        int length = str.length();
        int i42 = 55296;
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
                i41 = i44 + 1;
                cCharAt12 = str.charAt(i44);
                if (cCharAt12 < 55296) {
                    break;
                }
                i45 |= (cCharAt12 & 8191) << i46;
                i46 += 13;
                i44 = i41;
            }
            iCharAt2 = i45 | (cCharAt12 << i46);
            i44 = i41;
        }
        if (iCharAt2 == 0) {
            i13 = 0;
            i16 = 0;
            iCharAt = 0;
            i12 = 0;
            i15 = 0;
            i17 = 0;
            iArr = f10160p;
            i14 = 0;
        } else {
            int i47 = i44 + 1;
            int iCharAt3 = str.charAt(i44);
            if (iCharAt3 >= 55296) {
                int i48 = iCharAt3 & 8191;
                int i49 = 13;
                while (true) {
                    i26 = i47 + 1;
                    cCharAt7 = str.charAt(i47);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i48 |= (cCharAt7 & 8191) << i49;
                    i49 += 13;
                    i47 = i26;
                }
                iCharAt3 = i48 | (cCharAt7 << i49);
                i47 = i26;
            }
            int i50 = i47 + 1;
            int iCharAt4 = str.charAt(i47);
            if (iCharAt4 >= 55296) {
                int i51 = iCharAt4 & 8191;
                int i52 = 13;
                while (true) {
                    i25 = i50 + 1;
                    cCharAt6 = str.charAt(i50);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i51 |= (cCharAt6 & 8191) << i52;
                    i52 += 13;
                    i50 = i25;
                }
                iCharAt4 = i51 | (cCharAt6 << i52);
                i50 = i25;
            }
            int i53 = i50 + 1;
            int iCharAt5 = str.charAt(i50);
            if (iCharAt5 >= 55296) {
                int i54 = iCharAt5 & 8191;
                int i55 = 13;
                while (true) {
                    i24 = i53 + 1;
                    cCharAt5 = str.charAt(i53);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i54 |= (cCharAt5 & 8191) << i55;
                    i55 += 13;
                    i53 = i24;
                }
                iCharAt5 = i54 | (cCharAt5 << i55);
                i53 = i24;
            }
            int i56 = i53 + 1;
            int iCharAt6 = str.charAt(i53);
            if (iCharAt6 >= 55296) {
                int i57 = iCharAt6 & 8191;
                int i58 = 13;
                while (true) {
                    i23 = i56 + 1;
                    cCharAt4 = str.charAt(i56);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i57 |= (cCharAt4 & 8191) << i58;
                    i58 += 13;
                    i56 = i23;
                }
                iCharAt6 = i57 | (cCharAt4 << i58);
                i56 = i23;
            }
            int i59 = i56 + 1;
            iCharAt = str.charAt(i56);
            if (iCharAt >= 55296) {
                int i60 = iCharAt & 8191;
                int i61 = 13;
                while (true) {
                    i22 = i59 + 1;
                    cCharAt3 = str.charAt(i59);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i60 |= (cCharAt3 & 8191) << i61;
                    i61 += 13;
                    i59 = i22;
                }
                iCharAt = i60 | (cCharAt3 << i61);
                i59 = i22;
            }
            int i62 = i59 + 1;
            int iCharAt7 = str.charAt(i59);
            if (iCharAt7 >= 55296) {
                int i63 = iCharAt7 & 8191;
                int i64 = 13;
                while (true) {
                    i21 = i62 + 1;
                    cCharAt2 = str.charAt(i62);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i63 |= (cCharAt2 & 8191) << i64;
                    i64 += 13;
                    i62 = i21;
                }
                iCharAt7 = i63 | (cCharAt2 << i64);
                i62 = i21;
            }
            int i65 = i62 + 1;
            if (str.charAt(i62) >= 55296) {
                while (true) {
                    i19 = i65 + 1;
                    if (str.charAt(i65) < 55296) {
                        break;
                    }
                    i65 = i19;
                }
                i65 = i19;
            }
            int i66 = i65 + 1;
            int iCharAt8 = str.charAt(i65);
            if (iCharAt8 >= 55296) {
                int i67 = iCharAt8 & 8191;
                int i68 = 13;
                while (true) {
                    i18 = i66 + 1;
                    cCharAt = str.charAt(i66);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i67 |= (cCharAt & 8191) << i68;
                    i68 += 13;
                    i66 = i18;
                }
                iCharAt8 = i67 | (cCharAt << i68);
                i66 = i18;
            }
            iArr = new int[iCharAt8 + iCharAt7 + iCharAt3];
            int i69 = (iCharAt3 << 1) + iCharAt4;
            int i70 = iCharAt7;
            i12 = iCharAt5;
            i13 = i70;
            i14 = iCharAt3;
            i44 = i66;
            i15 = iCharAt6;
            i16 = i69;
            i17 = iCharAt8;
        }
        Unsafe unsafe = f10161q;
        Object[] objArr = zzampVar.f10192c;
        Class<?> cls = zzampVar.f10190a.getClass();
        int[] iArr3 = new int[iCharAt * 3];
        Object[] objArr2 = new Object[iCharAt << 1];
        int i71 = i17 + i13;
        int i72 = i71;
        int i73 = i17;
        int i74 = 0;
        int i75 = 0;
        while (i44 < length) {
            int i76 = i44 + 1;
            int iCharAt9 = str.charAt(i44);
            if (iCharAt9 >= i42) {
                int i77 = iCharAt9 & 8191;
                int i78 = i76;
                int i79 = 13;
                while (true) {
                    i40 = i78 + 1;
                    cCharAt11 = str.charAt(i78);
                    i27 = length;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i77 |= (cCharAt11 & 8191) << i79;
                    i79 += 13;
                    i78 = i40;
                    length = i27;
                }
                iCharAt9 = i77 | (cCharAt11 << i79);
                i28 = i40;
            } else {
                i27 = length;
                i28 = i76;
            }
            int i80 = i28 + 1;
            int iCharAt10 = str.charAt(i28);
            Object[] objArr3 = objArr;
            char c11 = 55296;
            if (iCharAt10 >= 55296) {
                int i81 = iCharAt10 & 8191;
                int i82 = 13;
                while (true) {
                    i39 = i80 + 1;
                    cCharAt10 = str.charAt(i80);
                    if (cCharAt10 < c11) {
                        break;
                    }
                    i81 |= (cCharAt10 & 8191) << i82;
                    i82 += 13;
                    i80 = i39;
                    c11 = 55296;
                }
                iCharAt10 = i81 | (cCharAt10 << i82);
                i80 = i39;
            }
            int i83 = iCharAt10 & 255;
            int i84 = iCharAt9;
            if ((iCharAt10 & 1024) != 0) {
                iArr[i75] = i74;
                i75++;
            }
            int i85 = i14;
            if (i83 >= 51) {
                int i86 = i80 + 1;
                int iCharAt11 = str.charAt(i80);
                char c12 = 55296;
                if (iCharAt11 >= 55296) {
                    int i87 = iCharAt11 & 8191;
                    int i88 = 13;
                    while (true) {
                        i38 = i86 + 1;
                        cCharAt9 = str.charAt(i86);
                        if (cCharAt9 < c12) {
                            break;
                        }
                        i87 |= (cCharAt9 & 8191) << i88;
                        i88 += 13;
                        i86 = i38;
                        c12 = 55296;
                    }
                    iCharAt11 = i87 | (cCharAt9 << i88);
                    i86 = i38;
                }
                int i89 = i83 - 51;
                i30 = i86;
                if (i89 == 9 || i89 == 17) {
                    i35 = i16 + 1;
                    objArr2[((i74 / 3) << 1) + 1] = objArr3[i16];
                } else {
                    if (i89 == 12 && (zzampVar.zzb().equals(zzamk.zza) || (iCharAt10 & 2048) != 0)) {
                        i35 = i16 + 1;
                        objArr2[((i74 / 3) << 1) + 1] = objArr3[i16];
                    }
                    i36 = iCharAt11 << 1;
                    obj = objArr3[i36];
                    if (obj instanceof Field) {
                        fieldP2 = (Field) obj;
                    } else {
                        fieldP2 = p(cls, (String) obj);
                        objArr3[i36] = fieldP2;
                        iArr[i72] = i74;
                        i72++;
                    }
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldP2);
                    i37 = i36 + 1;
                    obj2 = objArr3[i37];
                    if (obj2 instanceof Field) {
                        fieldP3 = (Field) obj2;
                    } else {
                        fieldP3 = p(cls, (String) obj2);
                        objArr3[i37] = fieldP3;
                    }
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldP3);
                    i31 = iObjectFieldOffset3;
                    i32 = 0;
                    iArr2 = iArr3;
                }
                i16 = i35;
                i36 = iCharAt11 << 1;
                obj = objArr3[i36];
                if (obj instanceof Field) {
                    fieldP2 = (Field) obj;
                } else {
                    fieldP2 = p(cls, (String) obj);
                    objArr3[i36] = fieldP2;
                    iArr[i72] = i74;
                    i72++;
                }
                int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldP2);
                i37 = i36 + 1;
                obj2 = objArr3[i37];
                if (obj2 instanceof Field) {
                    fieldP3 = (Field) obj2;
                } else {
                    fieldP3 = p(cls, (String) obj2);
                    objArr3[i37] = fieldP3;
                }
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldP3);
                i31 = iObjectFieldOffset4;
                i32 = 0;
                iArr2 = iArr3;
            } else {
                int i90 = i16 + 1;
                Field fieldP4 = p(cls, (String) objArr3[i16]);
                if (i83 == 9 || i83 == 17) {
                    iArr2 = iArr3;
                    objArr2[((i74 / 3) << 1) + 1] = fieldP4.getType();
                } else {
                    if (i83 == 27 || i83 == 49) {
                        iArr2 = iArr3;
                        i34 = i16 + 2;
                        objArr2[((i74 / 3) << 1) + 1] = objArr3[i90];
                    } else if (i83 == 12 || i83 == 30 || i83 == 44) {
                        iArr2 = iArr3;
                        if (zzampVar.zzb() == zzamk.zza || (iCharAt10 & 2048) != 0) {
                            i34 = i16 + 2;
                            objArr2[((i74 / 3) << 1) + 1] = objArr3[i90];
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldP4);
                        if ((iCharAt10 & 4096) != 0 || i83 > 17) {
                            int i91 = i29;
                            iObjectFieldOffset2 = 1048575;
                            i30 = i80;
                            i31 = iObjectFieldOffset;
                            i16 = i91;
                            i32 = 0;
                        } else {
                            int i92 = i80 + 1;
                            int iCharAt12 = str.charAt(i80);
                            if (iCharAt12 >= 55296) {
                                int i93 = iCharAt12 & 8191;
                                int i94 = 13;
                                while (true) {
                                    i33 = i92 + 1;
                                    cCharAt8 = str.charAt(i92);
                                    if (cCharAt8 < 55296) {
                                        break;
                                    }
                                    i93 |= (cCharAt8 & 8191) << i94;
                                    i94 += 13;
                                    i92 = i33;
                                }
                                iCharAt12 = i93 | (cCharAt8 << i94);
                                i92 = i33;
                            }
                            int i95 = (iCharAt12 / 32) + (i85 << 1);
                            Object obj3 = objArr3[i95];
                            if (obj3 instanceof Field) {
                                fieldP = (Field) obj3;
                            } else {
                                fieldP = p(cls, (String) obj3);
                                objArr3[i95] = fieldP;
                            }
                            int i96 = i29;
                            i32 = iCharAt12 % 32;
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldP);
                            i31 = iObjectFieldOffset;
                            i30 = i92;
                            i16 = i96;
                        }
                    } else {
                        if (i83 == 50) {
                            int i97 = i73 + 1;
                            iArr[i73] = i74;
                            int i98 = (i74 / 3) << 1;
                            int i99 = i16 + 2;
                            objArr2[i98] = objArr3[i90];
                            if ((iCharAt10 & 2048) != 0) {
                                i29 = i16 + 3;
                                objArr2[i98 + 1] = objArr3[i99];
                                iArr2 = iArr3;
                                i73 = i97;
                            } else {
                                i29 = i99;
                                i73 = i97;
                                iArr2 = iArr3;
                            }
                        } else {
                            iArr2 = iArr3;
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldP4);
                        if ((iCharAt10 & 4096) != 0) {
                            int i910 = i29;
                            iObjectFieldOffset2 = 1048575;
                            i30 = i80;
                            i31 = iObjectFieldOffset;
                            i16 = i910;
                            i32 = 0;
                        } else {
                            int i911 = i29;
                            iObjectFieldOffset2 = 1048575;
                            i30 = i80;
                            i31 = iObjectFieldOffset;
                            i16 = i911;
                            i32 = 0;
                        }
                    }
                    i29 = i34;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldP4);
                    if ((iCharAt10 & 4096) != 0) {
                        int i912 = i29;
                        iObjectFieldOffset2 = 1048575;
                        i30 = i80;
                        i31 = iObjectFieldOffset;
                        i16 = i912;
                        i32 = 0;
                    } else {
                        int i913 = i29;
                        iObjectFieldOffset2 = 1048575;
                        i30 = i80;
                        i31 = iObjectFieldOffset;
                        i16 = i913;
                        i32 = 0;
                    }
                }
                i29 = i90;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldP4);
                if ((iCharAt10 & 4096) != 0) {
                    int i914 = i29;
                    iObjectFieldOffset2 = 1048575;
                    i30 = i80;
                    i31 = iObjectFieldOffset;
                    i16 = i914;
                    i32 = 0;
                } else {
                    int i915 = i29;
                    iObjectFieldOffset2 = 1048575;
                    i30 = i80;
                    i31 = iObjectFieldOffset;
                    i16 = i915;
                    i32 = 0;
                }
            }
            int i100 = i74 + 1;
            iArr2[i74] = i84;
            int i101 = i74 + 2;
            iArr2[i100] = ((iCharAt10 & 512) != 0 ? 536870912 : 0) | ((iCharAt10 & 256) != 0 ? 268435456 : 0) | ((iCharAt10 & 2048) != 0 ? Integer.MIN_VALUE : 0) | (i83 << 20) | i31;
            i74 += 3;
            iArr2[i101] = (i32 << 20) | iObjectFieldOffset2;
            objArr = objArr3;
            length = i27;
            iArr3 = iArr2;
            i14 = i85;
            str = str;
            i44 = i30;
            i42 = 55296;
        }
        return new zzamc(iArr3, objArr2, i12, i15, zzampVar.f10190a, iArr, i17, i71, zzamgVar, zzaliVar, zzanfVar, zzakkVar, zzalvVar);
    }

    public static Field p(Class cls, String str) {
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

    public static void r(int i11, Object obj, zzake zzakeVar) {
        if (!(obj instanceof String)) {
            zzakeVar.e(i11, (zzaje) obj);
        } else {
            zzakeVar.f10111a.i(i11, (String) obj);
        }
    }

    public final boolean C(int i11, int i12, Object obj) {
        return zzank.f10225c.j((long) (this.f10162a[i12 + 2] & 1048575), obj) == i11;
    }

    public final boolean D(int i11, Object obj) {
        int i12 = this.f10162a[i11 + 2];
        long j11 = i12 & 1048575;
        if (j11 == 1048575) {
            int iZ = z(i11);
            long j12 = iZ & 1048575;
            switch ((iZ & 267386880) >>> 20) {
                case 0:
                    if (Double.doubleToRawLongBits(zzank.f10225c.a(obj, j12)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(zzank.f10225c.h(obj, j12)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (zzank.f10225c.k(j12, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (zzank.f10225c.k(j12, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (zzank.f10225c.j(j12, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (zzank.f10225c.k(j12, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (zzank.f10225c.j(j12, obj) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return zzank.f10225c.i(j12, obj);
                case 8:
                    Object objM = zzank.m(j12, obj);
                    if (objM instanceof String) {
                        if (((String) objM).isEmpty()) {
                            return false;
                        }
                    } else {
                        if (!(objM instanceof zzaje)) {
                            throw new IllegalArgumentException();
                        }
                        if (zzaje.f10066b.equals(objM)) {
                            return false;
                        }
                    }
                case 9:
                    if (zzank.m(j12, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    if (zzaje.f10066b.equals(zzank.m(j12, obj))) {
                        return false;
                    }
                    break;
                case 11:
                    if (zzank.f10225c.j(j12, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (zzank.f10225c.j(j12, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (zzank.f10225c.j(j12, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (zzank.f10225c.k(j12, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (zzank.f10225c.j(j12, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (zzank.f10225c.k(j12, obj) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (zzank.m(j12, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i12 >>> 20)) & zzank.f10225c.j(j11, obj)) == 0) {
            return false;
        }
        return true;
    }

    public final boolean E(zzaku zzakuVar, zzaku zzakuVar2, int i11) {
        return D(i11, zzakuVar) == D(i11, zzakuVar2);
    }

    public final zzaky G(int i11) {
        return (zzaky) this.f10163b[((i11 / 3) << 1) + 1];
    }

    public final zzamr H(int i11) {
        int i12 = (i11 / 3) << 1;
        Object[] objArr = this.f10163b;
        zzamr zzamrVar = (zzamr) objArr[i12];
        if (zzamrVar != null) {
            return zzamrVar;
        }
        zzamr zzamrVarA = zzamn.f10187c.a((Class) objArr[i12 + 1]);
        objArr[i12] = zzamrVarA;
        return zzamrVarA;
    }

    public final Object I(int i11) {
        return this.f10163b[(i11 / 3) << 1];
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamr
    public final boolean a(Object obj) {
        int i11;
        int i12;
        zzamc<T> zzamcVar;
        Object obj2;
        int i13 = 1048575;
        int i14 = 0;
        int i15 = 0;
        while (i14 < this.f10170i) {
            int i16 = this.f10169h[i14];
            int iZ = z(i16);
            int[] iArr = this.f10162a;
            int i17 = iArr[i16 + 2];
            int i18 = i17 & 1048575;
            int i19 = 1 << (i17 >>> 20);
            if (i18 != i13) {
                if (i18 != 1048575) {
                    i15 = f10161q.getInt(obj, i18);
                }
                i12 = i15;
                i11 = i18;
            } else {
                i11 = i13;
                i12 = i15;
            }
            if ((268435456 & iZ) != 0) {
                zzamcVar = this;
                obj2 = obj;
                if (!zzamcVar.v(obj2, i16, i11, i12, i19)) {
                }
                return false;
            }
            zzamcVar = this;
            obj2 = obj;
            int i21 = (267386880 & iZ) >>> 20;
            if (i21 == 9 || i21 == 17) {
                if (zzamcVar.v(obj2, i16, i11, i12, i19) && !H(i16).a(zzank.m(iZ & 1048575, obj2))) {
                    return false;
                }
                i14++;
                obj = obj2;
                i13 = i11;
                i15 = i12;
            } else {
                if (i21 != 27) {
                    if (i21 == 60 || i21 == 68) {
                        if (C(iArr[i16], i16, obj2) && !H(i16).a(zzank.m(iZ & 1048575, obj2))) {
                            return false;
                        }
                    } else if (i21 != 49) {
                        if (i21 != 50) {
                            continue;
                        } else {
                            Object objM = zzank.m(iZ & 1048575, obj2);
                            zzalv zzalvVar = zzamcVar.f10175o;
                            if (!zzalvVar.c(objM).isEmpty()) {
                                zzalvVar.zza(I(i16));
                                throw null;
                            }
                        }
                    }
                    i14++;
                    obj = obj2;
                    i13 = i11;
                    i15 = i12;
                }
                List list = (List) zzank.m(iZ & 1048575, obj2);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzamr zzamrVarH = H(i16);
                    for (int i22 = 0; i22 < list.size(); i22++) {
                        if (!zzamrVarH.a(list.get(i22))) {
                            return false;
                        }
                    }
                }
                i14++;
                obj = obj2;
                i13 = i11;
                i15 = i12;
            }
        }
        Object obj3 = obj;
        if (this.f10167f) {
            this.f10174n.b(obj3).f();
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamr
    public final void b(Object obj, Object obj2) {
        Object obj3;
        J(obj);
        byte[] bArr = zzakw.f10134a;
        obj2.getClass();
        int i11 = 0;
        while (true) {
            int[] iArr = this.f10162a;
            if (i11 >= iArr.length) {
                Object obj4 = obj;
                zzanh zzanhVar = zzamq.f10194a;
                zzanf zzanfVar = this.m;
                zzanfVar.o(obj4, zzanfVar.c(zzanfVar.p(obj4), zzanfVar.p(obj2)));
                if (this.f10167f) {
                    zzamq.b(this.f10174n, obj4, obj2);
                    return;
                }
                return;
            }
            int iZ = z(i11);
            long j11 = 1048575 & iZ;
            int i12 = iArr[i11];
            switch ((iZ & 267386880) >>> 20) {
                case 0:
                    if (!D(i11, obj2)) {
                        obj3 = obj;
                    } else {
                        zzank.zzc zzcVar = zzank.f10225c;
                        obj3 = obj;
                        zzcVar.d(obj3, j11, zzcVar.a(obj2, j11));
                        x(i11, obj3);
                    }
                    break;
                case 1:
                    if (D(i11, obj2)) {
                        zzank.zzc zzcVar2 = zzank.f10225c;
                        zzcVar2.e(obj, j11, zzcVar2.h(obj2, j11));
                        x(i11, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (D(i11, obj2)) {
                        zzank.c(obj, j11, zzank.f10225c.k(j11, obj2));
                        x(i11, obj);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (D(i11, obj2)) {
                        zzank.c(obj, j11, zzank.f10225c.k(j11, obj2));
                        x(i11, obj);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (D(i11, obj2)) {
                        zzank.b(j11, obj, zzank.f10225c.j(j11, obj2));
                        x(i11, obj);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (D(i11, obj2)) {
                        zzank.c(obj, j11, zzank.f10225c.k(j11, obj2));
                        x(i11, obj);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (D(i11, obj2)) {
                        zzank.b(j11, obj, zzank.f10225c.j(j11, obj2));
                        x(i11, obj);
                    }
                    obj3 = obj;
                    break;
                case 7:
                    if (D(i11, obj2)) {
                        zzank.zzc zzcVar3 = zzank.f10225c;
                        zzcVar3.g(obj, j11, zzcVar3.i(j11, obj2));
                        x(i11, obj);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (D(i11, obj2)) {
                        zzank.d(obj, j11, zzank.m(j11, obj2));
                        x(i11, obj);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    u(obj, obj2, i11);
                    obj3 = obj;
                    break;
                case 10:
                    if (D(i11, obj2)) {
                        zzank.d(obj, j11, zzank.m(j11, obj2));
                        x(i11, obj);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (D(i11, obj2)) {
                        zzank.b(j11, obj, zzank.f10225c.j(j11, obj2));
                        x(i11, obj);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (D(i11, obj2)) {
                        zzank.b(j11, obj, zzank.f10225c.j(j11, obj2));
                        x(i11, obj);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (D(i11, obj2)) {
                        zzank.b(j11, obj, zzank.f10225c.j(j11, obj2));
                        x(i11, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (D(i11, obj2)) {
                        zzank.c(obj, j11, zzank.f10225c.k(j11, obj2));
                        x(i11, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (D(i11, obj2)) {
                        zzank.b(j11, obj, zzank.f10225c.j(j11, obj2));
                        x(i11, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (D(i11, obj2)) {
                        zzank.c(obj, j11, zzank.f10225c.k(j11, obj2));
                        x(i11, obj);
                    }
                    obj3 = obj;
                    break;
                case 17:
                    u(obj, obj2, i11);
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
                    this.f10173l.c(obj, j11, obj2);
                    obj3 = obj;
                    break;
                case 50:
                    zzanh zzanhVar2 = zzamq.f10194a;
                    zzank.d(obj, j11, this.f10175o.b(zzank.m(j11, obj), zzank.m(j11, obj2)));
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
                    if (C(i12, i11, obj2)) {
                        zzank.d(obj, j11, zzank.m(j11, obj2));
                        w(i12, i11, obj);
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
                    if (C(i12, i11, obj2)) {
                        zzank.d(obj, j11, zzank.m(j11, obj2));
                        w(i12, i11, obj);
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

    /* JADX WARN: Code duplicated, block: B:25:0x006c  */
    /* JADX WARN: Code duplicated, block: B:27:0x0072  */
    /* JADX WARN: Code duplicated, block: B:40:0x007f A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamr
    public final void c(Object obj) {
        if (K(obj)) {
            if (obj instanceof zzaku) {
                zzaku zzakuVar = (zzaku) obj;
                zzakuVar.d(Integer.MAX_VALUE);
                zzakuVar.zza = 0;
                zzakuVar.t();
            }
            int[] iArr = this.f10162a;
            int length = iArr.length;
            for (int i11 = 0; i11 < length; i11 += 3) {
                int iZ = z(i11);
                long j11 = 1048575 & iZ;
                int i12 = (iZ & 267386880) >>> 20;
                if (i12 != 9) {
                    if (i12 != 60 && i12 != 68) {
                        switch (i12) {
                            case 17:
                                if (D(i11, obj)) {
                                    H(i11).c(f10161q.getObject(obj, j11));
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
                                this.f10173l.a(j11, obj);
                                break;
                            case 50:
                                Unsafe unsafe = f10161q;
                                Object object = unsafe.getObject(obj, j11);
                                if (object != null) {
                                    unsafe.putObject(obj, j11, this.f10175o.d(object));
                                }
                                break;
                        }
                    } else if (C(iArr[i11], i11, obj)) {
                        H(i11).c(f10161q.getObject(obj, j11));
                    }
                } else if (D(i11, obj)) {
                    H(i11).c(f10161q.getObject(obj, j11));
                }
            }
            this.m.r(obj);
            if (this.f10167f) {
                this.f10174n.j(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamr
    public final void d(Object obj, byte[] bArr, int i11, int i12, zzajd zzajdVar) {
        k(obj, bArr, i11, i12, 0, zzajdVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0026  */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamr
    public final void e(Object obj, zzake zzakeVar) {
        Map.Entry entry;
        int i11;
        zzamc<T> zzamcVar = this;
        zzakb zzakbVar = zzakeVar.f10111a;
        boolean z11 = zzamcVar.f10167f;
        zzakl zzaklVar = zzamcVar.f10174n;
        if (z11) {
            zzakm zzakmVarB = zzaklVar.b(obj);
            if (zzakmVarB.f10120a.isEmpty()) {
                entry = null;
            } else {
                entry = (Map.Entry) zzakmVarB.c().next();
            }
        } else {
            entry = null;
        }
        int[] iArr = zzamcVar.f10162a;
        int length = iArr.length;
        Unsafe unsafe = f10161q;
        int i12 = 0;
        int i13 = 1048575;
        int i14 = 0;
        while (i12 < length) {
            int iZ = zzamcVar.z(i12);
            int i15 = iArr[i12];
            int i16 = (iZ & 267386880) >>> 20;
            if (i16 <= 17) {
                int i17 = iArr[i12 + 2];
                int i18 = i14;
                int i19 = i17 & 1048575;
                if (i19 != i13) {
                    i14 = i19 == 1048575 ? 0 : unsafe.getInt(obj, i19);
                    i13 = i19;
                } else {
                    iArr = iArr;
                    length = length;
                    i14 = i18;
                }
                i11 = 1 << (i17 >>> 20);
            } else {
                iArr = iArr;
                length = length;
                i11 = 0;
            }
            if (entry != null) {
                zzaklVar.a(entry);
                throw null;
            }
            int i21 = i11;
            long j11 = iZ & 1048575;
            switch (i16) {
                case 0:
                    if (zzamcVar.v(obj, i12, i13, i14, i21)) {
                        zzakeVar.a(i15, zzank.f10225c.a(obj, j11));
                        continue;
                    }
                    i12 += 3;
                    iArr = iArr;
                    length = length;
                    break;
                case 1:
                    if (zzamcVar.v(obj, i12, i13, i14, i21)) {
                        zzakeVar.b(i15, zzank.f10225c.h(obj, j11));
                    }
                    break;
                case 2:
                    if (zzamcVar.v(obj, i12, i13, i14, i21)) {
                        zzakeVar.i(i15, unsafe.getLong(obj, j11));
                    }
                    break;
                case 3:
                    if (zzamcVar.v(obj, i12, i13, i14, i21)) {
                        zzakeVar.p(i15, unsafe.getLong(obj, j11));
                    }
                    break;
                case 4:
                    if (zzamcVar.v(obj, i12, i13, i14, i21)) {
                        zzakeVar.k(i15, unsafe.getInt(obj, j11));
                    }
                    break;
                case 5:
                    if (zzamcVar.v(obj, i12, i13, i14, i21)) {
                        zzakeVar.d(i15, unsafe.getLong(obj, j11));
                    }
                    break;
                case 6:
                    if (zzamcVar.v(obj, i12, i13, i14, i21)) {
                        zzakeVar.h(i15, unsafe.getInt(obj, j11));
                    }
                    break;
                case 7:
                    if (zzamcVar.v(obj, i12, i13, i14, i21)) {
                        zzakeVar.g(i15, zzank.f10225c.i(j11, obj));
                    }
                    break;
                case 8:
                    if (zzamcVar.v(obj, i12, i13, i14, i21)) {
                        r(i15, unsafe.getObject(obj, j11), zzakeVar);
                    }
                    break;
                case 9:
                    if (zzamcVar.v(obj, i12, i13, i14, i21)) {
                        zzakeVar.j(i15, unsafe.getObject(obj, j11), zzamcVar.H(i12));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    iArr = iArr;
                    length = length;
                    break;
                case 10:
                    if (zzamcVar.v(obj, i12, i13, i14, i21)) {
                        zzakeVar.e(i15, (zzaje) unsafe.getObject(obj, j11));
                    }
                    break;
                case 11:
                    if (zzamcVar.v(obj, i12, i13, i14, i21)) {
                        zzakeVar.q(i15, unsafe.getInt(obj, j11));
                    }
                    break;
                case 12:
                    if (zzamcVar.v(obj, i12, i13, i14, i21)) {
                        zzakeVar.c(i15, unsafe.getInt(obj, j11));
                    }
                    break;
                case 13:
                    if (zzamcVar.v(obj, i12, i13, i14, i21)) {
                        zzakeVar.m(i15, unsafe.getInt(obj, j11));
                    }
                    break;
                case 14:
                    if (zzamcVar.v(obj, i12, i13, i14, i21)) {
                        zzakeVar.l(i15, unsafe.getLong(obj, j11));
                    }
                    break;
                case 15:
                    if (zzamcVar.v(obj, i12, i13, i14, i21)) {
                        zzakeVar.o(i15, unsafe.getInt(obj, j11));
                    }
                    break;
                case 16:
                    if (zzamcVar.v(obj, i12, i13, i14, i21)) {
                        zzakeVar.n(i15, unsafe.getLong(obj, j11));
                    }
                    break;
                case 17:
                    if (zzamcVar.v(obj, i12, i13, i14, i21)) {
                        zzakeVar.f(i15, unsafe.getObject(obj, j11), zzamcVar.H(i12));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    iArr = iArr;
                    length = length;
                    break;
                case 18:
                    int i22 = iArr[i12];
                    List list = (List) unsafe.getObject(obj, j11);
                    zzanh zzanhVar = zzamq.f10194a;
                    if (list == null) {
                        continue;
                    } else if (!list.isEmpty()) {
                        if (list instanceof zzakh) {
                            zzakh zzakhVar = (zzakh) list;
                            for (int i23 = 0; i23 < zzakhVar.f10114c; i23++) {
                                zzakhVar.d(i23);
                                double d5 = zzakhVar.f10113b[i23];
                                zzakbVar.getClass();
                                zzakbVar.f(i22, Double.doubleToRawLongBits(d5));
                            }
                        } else {
                            for (int i24 = 0; i24 < list.size(); i24++) {
                                double dDoubleValue = ((Double) list.get(i24)).doubleValue();
                                zzakbVar.getClass();
                                zzakbVar.f(i22, Double.doubleToRawLongBits(dDoubleValue));
                            }
                        }
                    }
                    i12 += 3;
                    iArr = iArr;
                    length = length;
                    break;
                case 19:
                    int i25 = iArr[i12];
                    List list2 = (List) unsafe.getObject(obj, j11);
                    zzanh zzanhVar2 = zzamq.f10194a;
                    if (list2 == null) {
                        continue;
                    } else if (!list2.isEmpty()) {
                        if (list2 instanceof zzaks) {
                            zzaks zzaksVar = (zzaks) list2;
                            for (int i26 = 0; i26 < zzaksVar.f10129c; i26++) {
                                zzaksVar.d(i26);
                                float f5 = zzaksVar.f10128b[i26];
                                zzakbVar.getClass();
                                zzakbVar.e(i25, Float.floatToRawIntBits(f5));
                            }
                        } else {
                            for (int i27 = 0; i27 < list2.size(); i27++) {
                                float fFloatValue = ((Float) list2.get(i27)).floatValue();
                                zzakbVar.getClass();
                                zzakbVar.e(i25, Float.floatToRawIntBits(fFloatValue));
                            }
                        }
                    }
                    i12 += 3;
                    iArr = iArr;
                    length = length;
                    break;
                case 20:
                    int i28 = iArr[i12];
                    List list3 = (List) unsafe.getObject(obj, j11);
                    zzanh zzanhVar3 = zzamq.f10194a;
                    if (list3 == null) {
                        continue;
                    } else if (!list3.isEmpty()) {
                        if (list3 instanceof zzaln) {
                            zzaln zzalnVar = (zzaln) list3;
                            for (int i29 = 0; i29 < zzalnVar.f10151c; i29++) {
                                zzakbVar.n(i28, zzalnVar.d(i29));
                            }
                        } else {
                            for (int i30 = 0; i30 < list3.size(); i30++) {
                                zzakbVar.n(i28, ((Long) list3.get(i30)).longValue());
                            }
                        }
                    }
                    i12 += 3;
                    iArr = iArr;
                    length = length;
                    break;
                case 21:
                    int i31 = iArr[i12];
                    List list4 = (List) unsafe.getObject(obj, j11);
                    zzanh zzanhVar4 = zzamq.f10194a;
                    if (list4 == null) {
                        continue;
                    } else if (!list4.isEmpty()) {
                        if (list4 instanceof zzaln) {
                            zzaln zzalnVar2 = (zzaln) list4;
                            for (int i32 = 0; i32 < zzalnVar2.f10151c; i32++) {
                                zzakbVar.n(i31, zzalnVar2.d(i32));
                            }
                        } else {
                            for (int i33 = 0; i33 < list4.size(); i33++) {
                                zzakbVar.n(i31, ((Long) list4.get(i33)).longValue());
                            }
                        }
                    }
                    i12 += 3;
                    iArr = iArr;
                    length = length;
                    break;
                case 22:
                    int i34 = iArr[i12];
                    List list5 = (List) unsafe.getObject(obj, j11);
                    zzanh zzanhVar5 = zzamq.f10194a;
                    if (list5 == null) {
                        continue;
                    } else if (!list5.isEmpty()) {
                        if (list5 instanceof zzakx) {
                            zzakx zzakxVar = (zzakx) list5;
                            for (int i35 = 0; i35 < zzakxVar.f10137c; i35++) {
                                zzakbVar.m(i34, zzakxVar.b(i35));
                            }
                        } else {
                            for (int i36 = 0; i36 < list5.size(); i36++) {
                                zzakbVar.m(i34, ((Integer) list5.get(i36)).intValue());
                            }
                        }
                    }
                    i12 += 3;
                    iArr = iArr;
                    length = length;
                    break;
                case 23:
                    int i37 = iArr[i12];
                    List list6 = (List) unsafe.getObject(obj, j11);
                    zzanh zzanhVar6 = zzamq.f10194a;
                    if (list6 == null) {
                        continue;
                    } else if (!list6.isEmpty()) {
                        if (list6 instanceof zzaln) {
                            zzaln zzalnVar3 = (zzaln) list6;
                            for (int i38 = 0; i38 < zzalnVar3.f10151c; i38++) {
                                zzakbVar.f(i37, zzalnVar3.d(i38));
                            }
                        } else {
                            for (int i39 = 0; i39 < list6.size(); i39++) {
                                zzakbVar.f(i37, ((Long) list6.get(i39)).longValue());
                            }
                        }
                    }
                    i12 += 3;
                    iArr = iArr;
                    length = length;
                    break;
                case Service.METRICS_FIELD_NUMBER /* 24 */:
                    int i40 = iArr[i12];
                    List list7 = (List) unsafe.getObject(obj, j11);
                    zzanh zzanhVar7 = zzamq.f10194a;
                    if (list7 == null) {
                        continue;
                    } else if (!list7.isEmpty()) {
                        if (list7 instanceof zzakx) {
                            zzakx zzakxVar2 = (zzakx) list7;
                            for (int i41 = 0; i41 < zzakxVar2.f10137c; i41++) {
                                zzakbVar.e(i40, zzakxVar2.b(i41));
                            }
                        } else {
                            for (int i42 = 0; i42 < list7.size(); i42++) {
                                zzakbVar.e(i40, ((Integer) list7.get(i42)).intValue());
                            }
                        }
                    }
                    i12 += 3;
                    iArr = iArr;
                    length = length;
                    break;
                case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                    int i43 = iArr[i12];
                    List list8 = (List) unsafe.getObject(obj, j11);
                    zzanh zzanhVar8 = zzamq.f10194a;
                    if (list8 == null) {
                        continue;
                    } else if (!list8.isEmpty()) {
                        if (list8 instanceof zzajc) {
                            zzajc zzajcVar = (zzajc) list8;
                            for (int i44 = 0; i44 < zzajcVar.f10060c; i44++) {
                                zzajcVar.d(i44);
                                zzakbVar.j(i43, zzajcVar.f10059b[i44]);
                            }
                        } else {
                            for (int i45 = 0; i45 < list8.size(); i45++) {
                                zzakbVar.j(i43, ((Boolean) list8.get(i45)).booleanValue());
                            }
                        }
                    }
                    i12 += 3;
                    iArr = iArr;
                    length = length;
                    break;
                case Service.BILLING_FIELD_NUMBER /* 26 */:
                    int i46 = iArr[i12];
                    List list9 = (List) unsafe.getObject(obj, j11);
                    zzanh zzanhVar9 = zzamq.f10194a;
                    if (list9 == null) {
                        continue;
                    } else if (!list9.isEmpty()) {
                        if (list9 instanceof zzalj) {
                            zzalj zzaljVar = (zzalj) list9;
                            for (int i47 = 0; i47 < list9.size(); i47++) {
                                Object objZza = zzaljVar.zza();
                                if (objZza instanceof String) {
                                    zzakbVar.i(i46, (String) objZza);
                                } else {
                                    zzakbVar.g(i46, (zzaje) objZza);
                                }
                            }
                        } else {
                            for (int i48 = 0; i48 < list9.size(); i48++) {
                                zzakbVar.i(i46, (String) list9.get(i48));
                            }
                        }
                    }
                    i12 += 3;
                    iArr = iArr;
                    length = length;
                    break;
                case 27:
                    int i49 = iArr[i12];
                    List list10 = (List) unsafe.getObject(obj, j11);
                    zzamr zzamrVarH = zzamcVar.H(i12);
                    zzanh zzanhVar10 = zzamq.f10194a;
                    if (list10 == null) {
                        continue;
                    } else if (!list10.isEmpty()) {
                        for (int i50 = 0; i50 < list10.size(); i50++) {
                            zzakeVar.j(i49, list10.get(i50), zzamrVarH);
                        }
                    }
                    i12 += 3;
                    iArr = iArr;
                    length = length;
                    break;
                case Service.MONITORING_FIELD_NUMBER /* 28 */:
                    int i51 = iArr[i12];
                    List list11 = (List) unsafe.getObject(obj, j11);
                    zzanh zzanhVar11 = zzamq.f10194a;
                    if (list11 == null) {
                        continue;
                    } else if (!list11.isEmpty()) {
                        for (int i52 = 0; i52 < list11.size(); i52++) {
                            zzakbVar.g(i51, (zzaje) list11.get(i52));
                        }
                    }
                    i12 += 3;
                    iArr = iArr;
                    length = length;
                    break;
                case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
                    int i53 = iArr[i12];
                    List list12 = (List) unsafe.getObject(obj, j11);
                    zzanh zzanhVar12 = zzamq.f10194a;
                    if (list12 == null) {
                        continue;
                    } else if (!list12.isEmpty()) {
                        if (list12 instanceof zzakx) {
                            zzakx zzakxVar3 = (zzakx) list12;
                            for (int i54 = 0; i54 < zzakxVar3.f10137c; i54++) {
                                zzakbVar.t(i53, zzakxVar3.b(i54));
                            }
                        } else {
                            for (int i55 = 0; i55 < list12.size(); i55++) {
                                zzakbVar.t(i53, ((Integer) list12.get(i55)).intValue());
                            }
                        }
                    }
                    i12 += 3;
                    iArr = iArr;
                    length = length;
                    break;
                case 30:
                    int i56 = iArr[i12];
                    List list13 = (List) unsafe.getObject(obj, j11);
                    zzanh zzanhVar13 = zzamq.f10194a;
                    if (list13 == null) {
                        continue;
                    } else if (!list13.isEmpty()) {
                        if (list13 instanceof zzakx) {
                            zzakx zzakxVar4 = (zzakx) list13;
                            for (int i57 = 0; i57 < zzakxVar4.f10137c; i57++) {
                                zzakbVar.m(i56, zzakxVar4.b(i57));
                            }
                        } else {
                            for (int i58 = 0; i58 < list13.size(); i58++) {
                                zzakbVar.m(i56, ((Integer) list13.get(i58)).intValue());
                            }
                        }
                    }
                    i12 += 3;
                    iArr = iArr;
                    length = length;
                    break;
                case 31:
                    int i59 = iArr[i12];
                    List list14 = (List) unsafe.getObject(obj, j11);
                    zzanh zzanhVar14 = zzamq.f10194a;
                    if (list14 == null) {
                        continue;
                    } else if (!list14.isEmpty()) {
                        if (list14 instanceof zzakx) {
                            zzakx zzakxVar5 = (zzakx) list14;
                            for (int i60 = 0; i60 < zzakxVar5.f10137c; i60++) {
                                zzakbVar.e(i59, zzakxVar5.b(i60));
                            }
                        } else {
                            for (int i61 = 0; i61 < list14.size(); i61++) {
                                zzakbVar.e(i59, ((Integer) list14.get(i61)).intValue());
                            }
                        }
                    }
                    i12 += 3;
                    iArr = iArr;
                    length = length;
                    break;
                case Consts.SP /* 32 */:
                    int i62 = iArr[i12];
                    List list15 = (List) unsafe.getObject(obj, j11);
                    zzanh zzanhVar15 = zzamq.f10194a;
                    if (list15 == null) {
                        continue;
                    } else if (!list15.isEmpty()) {
                        if (list15 instanceof zzaln) {
                            zzaln zzalnVar4 = (zzaln) list15;
                            for (int i63 = 0; i63 < zzalnVar4.f10151c; i63++) {
                                zzakbVar.f(i62, zzalnVar4.d(i63));
                            }
                        } else {
                            for (int i64 = 0; i64 < list15.size(); i64++) {
                                zzakbVar.f(i62, ((Long) list15.get(i64)).longValue());
                            }
                        }
                    }
                    i12 += 3;
                    iArr = iArr;
                    length = length;
                    break;
                case 33:
                    int i65 = iArr[i12];
                    List list16 = (List) unsafe.getObject(obj, j11);
                    zzanh zzanhVar16 = zzamq.f10194a;
                    if (list16 == null) {
                        continue;
                    } else if (!list16.isEmpty()) {
                        if (list16 instanceof zzakx) {
                            zzakx zzakxVar6 = (zzakx) list16;
                            for (int i66 = 0; i66 < zzakxVar6.f10137c; i66++) {
                                int iB = zzakxVar6.b(i66);
                                zzakbVar.t(i65, (iB >> 31) ^ (iB << 1));
                            }
                        } else {
                            for (int i67 = 0; i67 < list16.size(); i67++) {
                                int iIntValue = ((Integer) list16.get(i67)).intValue();
                                zzakbVar.t(i65, (iIntValue >> 31) ^ (iIntValue << 1));
                            }
                        }
                    }
                    i12 += 3;
                    iArr = iArr;
                    length = length;
                    break;
                case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                    int i68 = iArr[i12];
                    List list17 = (List) unsafe.getObject(obj, j11);
                    zzanh zzanhVar17 = zzamq.f10194a;
                    if (list17 == null) {
                        continue;
                    } else if (!list17.isEmpty()) {
                        if (list17 instanceof zzaln) {
                            zzaln zzalnVar5 = (zzaln) list17;
                            for (int i69 = 0; i69 < zzalnVar5.f10151c; i69++) {
                                long jD = zzalnVar5.d(i69);
                                zzakbVar.n(i68, (jD << 1) ^ (jD >> 63));
                            }
                        } else {
                            for (int i70 = 0; i70 < list17.size(); i70++) {
                                long jLongValue = ((Long) list17.get(i70)).longValue();
                                zzakbVar.n(i68, (jLongValue << 1) ^ (jLongValue >> 63));
                            }
                        }
                    }
                    i12 += 3;
                    iArr = iArr;
                    length = length;
                    break;
                case 35:
                    int i71 = iArr[i12];
                    List list18 = (List) unsafe.getObject(obj, j11);
                    zzanh zzanhVar18 = zzamq.f10194a;
                    if (list18 == null) {
                        continue;
                    } else if (!list18.isEmpty()) {
                        if (list18 instanceof zzakh) {
                            zzakh zzakhVar2 = (zzakh) list18;
                            zzakbVar.s(i71, 2);
                            int i72 = 0;
                            for (int i73 = 0; i73 < zzakhVar2.f10114c; i73++) {
                                zzakhVar2.d(i73);
                                double d11 = zzakhVar2.f10113b[i73];
                                boolean z12 = zzakb.f10105b;
                                i72 += 8;
                            }
                            zzakbVar.r(i72);
                            for (int i74 = 0; i74 < zzakhVar2.f10114c; i74++) {
                                zzakhVar2.d(i74);
                                zzakbVar.k(Double.doubleToRawLongBits(zzakhVar2.f10113b[i74]));
                            }
                        } else {
                            zzakbVar.s(i71, 2);
                            int i75 = 0;
                            for (int i76 = 0; i76 < list18.size(); i76++) {
                                ((Double) list18.get(i76)).getClass();
                                boolean z13 = zzakb.f10105b;
                                i75 += 8;
                            }
                            zzakbVar.r(i75);
                            for (int i77 = 0; i77 < list18.size(); i77++) {
                                zzakbVar.k(Double.doubleToRawLongBits(((Double) list18.get(i77)).doubleValue()));
                            }
                        }
                    }
                    i12 += 3;
                    iArr = iArr;
                    length = length;
                    break;
                case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    int i78 = iArr[i12];
                    List list19 = (List) unsafe.getObject(obj, j11);
                    zzanh zzanhVar19 = zzamq.f10194a;
                    if (list19 == null) {
                        continue;
                    } else if (!list19.isEmpty()) {
                        if (list19 instanceof zzaks) {
                            zzaks zzaksVar2 = (zzaks) list19;
                            zzakbVar.s(i78, 2);
                            int i79 = 0;
                            for (int i80 = 0; i80 < zzaksVar2.f10129c; i80++) {
                                zzaksVar2.d(i80);
                                float f11 = zzaksVar2.f10128b[i80];
                                boolean z14 = zzakb.f10105b;
                                i79 += 4;
                            }
                            zzakbVar.r(i79);
                            for (int i81 = 0; i81 < zzaksVar2.f10129c; i81++) {
                                zzaksVar2.d(i81);
                                zzakbVar.d(Float.floatToRawIntBits(zzaksVar2.f10128b[i81]));
                            }
                        } else {
                            zzakbVar.s(i78, 2);
                            int i82 = 0;
                            for (int i83 = 0; i83 < list19.size(); i83++) {
                                ((Float) list19.get(i83)).getClass();
                                boolean z15 = zzakb.f10105b;
                                i82 += 4;
                            }
                            zzakbVar.r(i82);
                            for (int i84 = 0; i84 < list19.size(); i84++) {
                                zzakbVar.d(Float.floatToRawIntBits(((Float) list19.get(i84)).floatValue()));
                            }
                        }
                    }
                    i12 += 3;
                    iArr = iArr;
                    length = length;
                    break;
                case 37:
                    int i85 = iArr[i12];
                    List list20 = (List) unsafe.getObject(obj, j11);
                    zzanh zzanhVar20 = zzamq.f10194a;
                    if (list20 == null) {
                        continue;
                    } else if (!list20.isEmpty()) {
                        if (list20 instanceof zzaln) {
                            zzaln zzalnVar6 = (zzaln) list20;
                            zzakbVar.s(i85, 2);
                            int iU = 0;
                            for (int i86 = 0; i86 < zzalnVar6.f10151c; i86++) {
                                iU += zzakb.u(zzalnVar6.d(i86));
                            }
                            zzakbVar.r(iU);
                            for (int i87 = 0; i87 < zzalnVar6.f10151c; i87++) {
                                zzakbVar.p(zzalnVar6.d(i87));
                            }
                        } else {
                            zzakbVar.s(i85, 2);
                            int iU2 = 0;
                            for (int i88 = 0; i88 < list20.size(); i88++) {
                                iU2 += zzakb.u(((Long) list20.get(i88)).longValue());
                            }
                            zzakbVar.r(iU2);
                            for (int i89 = 0; i89 < list20.size(); i89++) {
                                zzakbVar.p(((Long) list20.get(i89)).longValue());
                            }
                        }
                    }
                    i12 += 3;
                    iArr = iArr;
                    length = length;
                    break;
                case 38:
                    int i90 = iArr[i12];
                    List list21 = (List) unsafe.getObject(obj, j11);
                    zzanh zzanhVar21 = zzamq.f10194a;
                    if (list21 == null) {
                        continue;
                    } else if (!list21.isEmpty()) {
                        if (list21 instanceof zzaln) {
                            zzaln zzalnVar7 = (zzaln) list21;
                            zzakbVar.s(i90, 2);
                            int iU3 = 0;
                            for (int i91 = 0; i91 < zzalnVar7.f10151c; i91++) {
                                iU3 += zzakb.u(zzalnVar7.d(i91));
                            }
                            zzakbVar.r(iU3);
                            for (int i92 = 0; i92 < zzalnVar7.f10151c; i92++) {
                                zzakbVar.p(zzalnVar7.d(i92));
                            }
                        } else {
                            zzakbVar.s(i90, 2);
                            int iU4 = 0;
                            for (int i93 = 0; i93 < list21.size(); i93++) {
                                iU4 += zzakb.u(((Long) list21.get(i93)).longValue());
                            }
                            zzakbVar.r(iU4);
                            for (int i94 = 0; i94 < list21.size(); i94++) {
                                zzakbVar.p(((Long) list21.get(i94)).longValue());
                            }
                        }
                    }
                    i12 += 3;
                    iArr = iArr;
                    length = length;
                    break;
                case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    int i95 = iArr[i12];
                    List list22 = (List) unsafe.getObject(obj, j11);
                    zzanh zzanhVar22 = zzamq.f10194a;
                    if (list22 == null) {
                        continue;
                    } else if (!list22.isEmpty()) {
                        if (list22 instanceof zzakx) {
                            zzakx zzakxVar7 = (zzakx) list22;
                            zzakbVar.s(i95, 2);
                            int iU5 = 0;
                            for (int i96 = 0; i96 < zzakxVar7.f10137c; i96++) {
                                iU5 += zzakb.u(zzakxVar7.b(i96));
                            }
                            zzakbVar.r(iU5);
                            for (int i97 = 0; i97 < zzakxVar7.f10137c; i97++) {
                                zzakbVar.l(zzakxVar7.b(i97));
                            }
                        } else {
                            zzakbVar.s(i95, 2);
                            int iU6 = 0;
                            for (int i98 = 0; i98 < list22.size(); i98++) {
                                iU6 += zzakb.u(((Integer) list22.get(i98)).intValue());
                            }
                            zzakbVar.r(iU6);
                            for (int i99 = 0; i99 < list22.size(); i99++) {
                                zzakbVar.l(((Integer) list22.get(i99)).intValue());
                            }
                        }
                    }
                    i12 += 3;
                    iArr = iArr;
                    length = length;
                    break;
                case DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                    int i100 = iArr[i12];
                    List list23 = (List) unsafe.getObject(obj, j11);
                    zzanh zzanhVar23 = zzamq.f10194a;
                    if (list23 == null) {
                        continue;
                    } else if (!list23.isEmpty()) {
                        if (list23 instanceof zzaln) {
                            zzaln zzalnVar8 = (zzaln) list23;
                            zzakbVar.s(i100, 2);
                            int i101 = 0;
                            for (int i102 = 0; i102 < zzalnVar8.f10151c; i102++) {
                                zzalnVar8.d(i102);
                                boolean z16 = zzakb.f10105b;
                                i101 += 8;
                            }
                            zzakbVar.r(i101);
                            for (int i103 = 0; i103 < zzalnVar8.f10151c; i103++) {
                                zzakbVar.k(zzalnVar8.d(i103));
                            }
                        } else {
                            zzakbVar.s(i100, 2);
                            int i104 = 0;
                            for (int i105 = 0; i105 < list23.size(); i105++) {
                                ((Long) list23.get(i105)).getClass();
                                boolean z17 = zzakb.f10105b;
                                i104 += 8;
                            }
                            zzakbVar.r(i104);
                            for (int i106 = 0; i106 < list23.size(); i106++) {
                                zzakbVar.k(((Long) list23.get(i106)).longValue());
                            }
                        }
                    }
                    i12 += 3;
                    iArr = iArr;
                    length = length;
                    break;
                case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                    int i107 = iArr[i12];
                    List list24 = (List) unsafe.getObject(obj, j11);
                    zzanh zzanhVar24 = zzamq.f10194a;
                    if (list24 == null) {
                        continue;
                    } else if (!list24.isEmpty()) {
                        if (list24 instanceof zzakx) {
                            zzakx zzakxVar8 = (zzakx) list24;
                            zzakbVar.s(i107, 2);
                            int i108 = 0;
                            for (int i109 = 0; i109 < zzakxVar8.f10137c; i109++) {
                                zzakxVar8.b(i109);
                                boolean z18 = zzakb.f10105b;
                                i108 += 4;
                            }
                            zzakbVar.r(i108);
                            for (int i110 = 0; i110 < zzakxVar8.f10137c; i110++) {
                                zzakbVar.d(zzakxVar8.b(i110));
                            }
                        } else {
                            zzakbVar.s(i107, 2);
                            int i111 = 0;
                            for (int i112 = 0; i112 < list24.size(); i112++) {
                                ((Integer) list24.get(i112)).getClass();
                                boolean z19 = zzakb.f10105b;
                                i111 += 4;
                            }
                            zzakbVar.r(i111);
                            for (int i113 = 0; i113 < list24.size(); i113++) {
                                zzakbVar.d(((Integer) list24.get(i113)).intValue());
                            }
                        }
                    }
                    i12 += 3;
                    iArr = iArr;
                    length = length;
                    break;
                case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                    int i114 = iArr[i12];
                    List list25 = (List) unsafe.getObject(obj, j11);
                    zzanh zzanhVar25 = zzamq.f10194a;
                    if (list25 == null) {
                        continue;
                    } else if (!list25.isEmpty()) {
                        if (list25 instanceof zzajc) {
                            zzajc zzajcVar2 = (zzajc) list25;
                            zzakbVar.s(i114, 2);
                            int i115 = 0;
                            for (int i116 = 0; i116 < zzajcVar2.f10060c; i116++) {
                                zzajcVar2.d(i116);
                                boolean z20 = zzajcVar2.f10059b[i116];
                                boolean z21 = zzakb.f10105b;
                                i115++;
                            }
                            zzakbVar.r(i115);
                            for (int i117 = 0; i117 < zzajcVar2.f10060c; i117++) {
                                zzajcVar2.d(i117);
                                zzakbVar.c(zzajcVar2.f10059b[i117] ? (byte) 1 : (byte) 0);
                            }
                        } else {
                            zzakbVar.s(i114, 2);
                            int i118 = 0;
                            for (int i119 = 0; i119 < list25.size(); i119++) {
                                ((Boolean) list25.get(i119)).getClass();
                                boolean z22 = zzakb.f10105b;
                                i118++;
                            }
                            zzakbVar.r(i118);
                            for (int i120 = 0; i120 < list25.size(); i120++) {
                                zzakbVar.c(((Boolean) list25.get(i120)).booleanValue() ? (byte) 1 : (byte) 0);
                            }
                        }
                    }
                    i12 += 3;
                    iArr = iArr;
                    length = length;
                    break;
                case 43:
                    int i121 = iArr[i12];
                    List list26 = (List) unsafe.getObject(obj, j11);
                    zzanh zzanhVar26 = zzamq.f10194a;
                    if (list26 == null) {
                        continue;
                    } else if (!list26.isEmpty()) {
                        if (list26 instanceof zzakx) {
                            zzakx zzakxVar9 = (zzakx) list26;
                            zzakbVar.s(i121, 2);
                            int iX = 0;
                            for (int i122 = 0; i122 < zzakxVar9.f10137c; i122++) {
                                iX += zzakb.x(zzakxVar9.b(i122));
                            }
                            zzakbVar.r(iX);
                            for (int i123 = 0; i123 < zzakxVar9.f10137c; i123++) {
                                zzakbVar.r(zzakxVar9.b(i123));
                            }
                        } else {
                            zzakbVar.s(i121, 2);
                            int iX2 = 0;
                            for (int i124 = 0; i124 < list26.size(); i124++) {
                                iX2 += zzakb.x(((Integer) list26.get(i124)).intValue());
                            }
                            zzakbVar.r(iX2);
                            for (int i125 = 0; i125 < list26.size(); i125++) {
                                zzakbVar.r(((Integer) list26.get(i125)).intValue());
                            }
                        }
                    }
                    i12 += 3;
                    iArr = iArr;
                    length = length;
                    break;
                case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                    int i126 = iArr[i12];
                    List list27 = (List) unsafe.getObject(obj, j11);
                    zzanh zzanhVar27 = zzamq.f10194a;
                    if (list27 == null) {
                        continue;
                    } else if (!list27.isEmpty()) {
                        if (list27 instanceof zzakx) {
                            zzakx zzakxVar10 = (zzakx) list27;
                            zzakbVar.s(i126, 2);
                            int iU7 = 0;
                            for (int i127 = 0; i127 < zzakxVar10.f10137c; i127++) {
                                iU7 += zzakb.u(zzakxVar10.b(i127));
                            }
                            zzakbVar.r(iU7);
                            for (int i128 = 0; i128 < zzakxVar10.f10137c; i128++) {
                                zzakbVar.l(zzakxVar10.b(i128));
                            }
                        } else {
                            zzakbVar.s(i126, 2);
                            int iU8 = 0;
                            for (int i129 = 0; i129 < list27.size(); i129++) {
                                iU8 += zzakb.u(((Integer) list27.get(i129)).intValue());
                            }
                            zzakbVar.r(iU8);
                            for (int i130 = 0; i130 < list27.size(); i130++) {
                                zzakbVar.l(((Integer) list27.get(i130)).intValue());
                            }
                        }
                    }
                    i12 += 3;
                    iArr = iArr;
                    length = length;
                    break;
                case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                    int i131 = iArr[i12];
                    List list28 = (List) unsafe.getObject(obj, j11);
                    zzanh zzanhVar28 = zzamq.f10194a;
                    if (list28 == null) {
                        continue;
                    } else if (!list28.isEmpty()) {
                        if (list28 instanceof zzakx) {
                            zzakx zzakxVar11 = (zzakx) list28;
                            zzakbVar.s(i131, 2);
                            int i132 = 0;
                            for (int i133 = 0; i133 < zzakxVar11.f10137c; i133++) {
                                zzakxVar11.b(i133);
                                boolean z23 = zzakb.f10105b;
                                i132 += 4;
                            }
                            zzakbVar.r(i132);
                            for (int i134 = 0; i134 < zzakxVar11.f10137c; i134++) {
                                zzakbVar.d(zzakxVar11.b(i134));
                            }
                        } else {
                            zzakbVar.s(i131, 2);
                            int i135 = 0;
                            for (int i136 = 0; i136 < list28.size(); i136++) {
                                ((Integer) list28.get(i136)).getClass();
                                boolean z24 = zzakb.f10105b;
                                i135 += 4;
                            }
                            zzakbVar.r(i135);
                            for (int i137 = 0; i137 < list28.size(); i137++) {
                                zzakbVar.d(((Integer) list28.get(i137)).intValue());
                            }
                        }
                    }
                    i12 += 3;
                    iArr = iArr;
                    length = length;
                    break;
                case 46:
                    int i138 = iArr[i12];
                    List list29 = (List) unsafe.getObject(obj, j11);
                    zzanh zzanhVar29 = zzamq.f10194a;
                    if (list29 == null) {
                        continue;
                    } else if (!list29.isEmpty()) {
                        if (list29 instanceof zzaln) {
                            zzaln zzalnVar9 = (zzaln) list29;
                            zzakbVar.s(i138, 2);
                            int i139 = 0;
                            for (int i140 = 0; i140 < zzalnVar9.f10151c; i140++) {
                                zzalnVar9.d(i140);
                                boolean z25 = zzakb.f10105b;
                                i139 += 8;
                            }
                            zzakbVar.r(i139);
                            for (int i141 = 0; i141 < zzalnVar9.f10151c; i141++) {
                                zzakbVar.k(zzalnVar9.d(i141));
                            }
                        } else {
                            zzakbVar.s(i138, 2);
                            int i142 = 0;
                            for (int i143 = 0; i143 < list29.size(); i143++) {
                                ((Long) list29.get(i143)).getClass();
                                boolean z26 = zzakb.f10105b;
                                i142 += 8;
                            }
                            zzakbVar.r(i142);
                            for (int i144 = 0; i144 < list29.size(); i144++) {
                                zzakbVar.k(((Long) list29.get(i144)).longValue());
                            }
                        }
                    }
                    i12 += 3;
                    iArr = iArr;
                    length = length;
                    break;
                case 47:
                    int i145 = iArr[i12];
                    List list30 = (List) unsafe.getObject(obj, j11);
                    zzanh zzanhVar30 = zzamq.f10194a;
                    if (list30 == null) {
                        continue;
                    } else if (!list30.isEmpty()) {
                        if (list30 instanceof zzakx) {
                            zzakx zzakxVar12 = (zzakx) list30;
                            zzakbVar.s(i145, 2);
                            int iX3 = 0;
                            for (int i146 = 0; i146 < zzakxVar12.f10137c; i146++) {
                                int iB2 = zzakxVar12.b(i146);
                                iX3 += zzakb.x((iB2 >> 31) ^ (iB2 << 1));
                            }
                            zzakbVar.r(iX3);
                            for (int i147 = 0; i147 < zzakxVar12.f10137c; i147++) {
                                int iB3 = zzakxVar12.b(i147);
                                zzakbVar.r((iB3 >> 31) ^ (iB3 << 1));
                            }
                        } else {
                            zzakbVar.s(i145, 2);
                            int iX4 = 0;
                            for (int i148 = 0; i148 < list30.size(); i148++) {
                                int iIntValue2 = ((Integer) list30.get(i148)).intValue();
                                iX4 += zzakb.x((iIntValue2 >> 31) ^ (iIntValue2 << 1));
                            }
                            zzakbVar.r(iX4);
                            for (int i149 = 0; i149 < list30.size(); i149++) {
                                int iIntValue3 = ((Integer) list30.get(i149)).intValue();
                                zzakbVar.r((iIntValue3 >> 31) ^ (iIntValue3 << 1));
                            }
                        }
                    }
                    i12 += 3;
                    iArr = iArr;
                    length = length;
                    break;
                case 48:
                    int i150 = iArr[i12];
                    List list31 = (List) unsafe.getObject(obj, j11);
                    zzanh zzanhVar31 = zzamq.f10194a;
                    if (list31 == null) {
                        continue;
                    } else if (!list31.isEmpty()) {
                        if (list31 instanceof zzaln) {
                            zzaln zzalnVar10 = (zzaln) list31;
                            zzakbVar.s(i150, 2);
                            int iU9 = 0;
                            for (int i151 = 0; i151 < zzalnVar10.f10151c; i151++) {
                                long jD2 = zzalnVar10.d(i151);
                                iU9 += zzakb.u((jD2 << 1) ^ (jD2 >> 63));
                            }
                            zzakbVar.r(iU9);
                            for (int i152 = 0; i152 < zzalnVar10.f10151c; i152++) {
                                long jD3 = zzalnVar10.d(i152);
                                zzakbVar.p((jD3 << 1) ^ (jD3 >> 63));
                            }
                        } else {
                            zzakbVar.s(i150, 2);
                            int iU10 = 0;
                            for (int i153 = 0; i153 < list31.size(); i153++) {
                                long jLongValue2 = ((Long) list31.get(i153)).longValue();
                                iU10 += zzakb.u((jLongValue2 << 1) ^ (jLongValue2 >> 63));
                            }
                            zzakbVar.r(iU10);
                            for (int i154 = 0; i154 < list31.size(); i154++) {
                                long jLongValue3 = ((Long) list31.get(i154)).longValue();
                                zzakbVar.p((jLongValue3 << 1) ^ (jLongValue3 >> 63));
                            }
                        }
                    }
                    i12 += 3;
                    iArr = iArr;
                    length = length;
                    break;
                case 49:
                    int i155 = iArr[i12];
                    List list32 = (List) unsafe.getObject(obj, j11);
                    zzamr zzamrVarH2 = zzamcVar.H(i12);
                    zzanh zzanhVar32 = zzamq.f10194a;
                    if (list32 == null) {
                        continue;
                    } else if (!list32.isEmpty()) {
                        for (int i156 = 0; i156 < list32.size(); i156++) {
                            zzakeVar.f(i155, list32.get(i156), zzamrVarH2);
                        }
                    }
                    i12 += 3;
                    iArr = iArr;
                    length = length;
                    break;
                case 50:
                    if (unsafe.getObject(obj, j11) != null) {
                        zzamcVar.f10175o.zza(zzamcVar.I(i12));
                        throw null;
                    }
                    continue;
                    i12 += 3;
                    iArr = iArr;
                    length = length;
                    break;
                    break;
                case 51:
                    if (zzamcVar.C(i15, i12, obj)) {
                        zzakeVar.a(i15, ((Double) zzank.m(j11, obj)).doubleValue());
                    } else {
                        continue;
                    }
                    i12 += 3;
                    iArr = iArr;
                    length = length;
                    break;
                case 52:
                    if (zzamcVar.C(i15, i12, obj)) {
                        zzakeVar.b(i15, ((Float) zzank.m(j11, obj)).floatValue());
                    } else {
                        continue;
                    }
                    i12 += 3;
                    iArr = iArr;
                    length = length;
                    break;
                case 53:
                    if (zzamcVar.C(i15, i12, obj)) {
                        zzakeVar.i(i15, F(obj, j11));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    iArr = iArr;
                    length = length;
                    break;
                case 54:
                    if (zzamcVar.C(i15, i12, obj)) {
                        zzakeVar.p(i15, F(obj, j11));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    iArr = iArr;
                    length = length;
                    break;
                case 55:
                    if (zzamcVar.C(i15, i12, obj)) {
                        zzakeVar.k(i15, A(obj, j11));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    iArr = iArr;
                    length = length;
                    break;
                case 56:
                    if (zzamcVar.C(i15, i12, obj)) {
                        zzakeVar.d(i15, F(obj, j11));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    iArr = iArr;
                    length = length;
                    break;
                case 57:
                    if (zzamcVar.C(i15, i12, obj)) {
                        zzakeVar.h(i15, A(obj, j11));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    iArr = iArr;
                    length = length;
                    break;
                case 58:
                    if (zzamcVar.C(i15, i12, obj)) {
                        zzakeVar.g(i15, ((Boolean) zzank.m(j11, obj)).booleanValue());
                    } else {
                        continue;
                    }
                    i12 += 3;
                    iArr = iArr;
                    length = length;
                    break;
                case 59:
                    if (zzamcVar.C(i15, i12, obj)) {
                        r(i15, unsafe.getObject(obj, j11), zzakeVar);
                    } else {
                        continue;
                    }
                    i12 += 3;
                    iArr = iArr;
                    length = length;
                    break;
                case 60:
                    if (zzamcVar.C(i15, i12, obj)) {
                        zzakeVar.j(i15, unsafe.getObject(obj, j11), zzamcVar.H(i12));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    iArr = iArr;
                    length = length;
                    break;
                case 61:
                    if (zzamcVar.C(i15, i12, obj)) {
                        zzakeVar.e(i15, (zzaje) unsafe.getObject(obj, j11));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    iArr = iArr;
                    length = length;
                    break;
                case 62:
                    if (zzamcVar.C(i15, i12, obj)) {
                        zzakeVar.q(i15, A(obj, j11));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    iArr = iArr;
                    length = length;
                    break;
                case 63:
                    if (zzamcVar.C(i15, i12, obj)) {
                        zzakeVar.c(i15, A(obj, j11));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    iArr = iArr;
                    length = length;
                    break;
                case 64:
                    if (zzamcVar.C(i15, i12, obj)) {
                        zzakeVar.m(i15, A(obj, j11));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    iArr = iArr;
                    length = length;
                    break;
                case 65:
                    if (zzamcVar.C(i15, i12, obj)) {
                        zzakeVar.l(i15, F(obj, j11));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    iArr = iArr;
                    length = length;
                    break;
                case 66:
                    if (zzamcVar.C(i15, i12, obj)) {
                        zzakeVar.o(i15, A(obj, j11));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    iArr = iArr;
                    length = length;
                    break;
                case 67:
                    if (zzamcVar.C(i15, i12, obj)) {
                        zzakeVar.n(i15, F(obj, j11));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    iArr = iArr;
                    length = length;
                    break;
                case 68:
                    if (zzamcVar.C(i15, i12, obj)) {
                        zzakeVar.f(i15, unsafe.getObject(obj, j11), zzamcVar.H(i12));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    iArr = iArr;
                    length = length;
                    break;
                default:
                    continue;
                    i12 += 3;
                    iArr = iArr;
                    length = length;
                    break;
            }
            zzamcVar = this;
            i12 += 3;
            iArr = iArr;
            length = length;
        }
        if (entry != null) {
            zzaklVar.f(entry);
            throw null;
        }
        zzanf zzanfVar = zzamcVar.m;
        zzanfVar.l(zzanfVar.p(obj), zzakeVar);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 22101. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamr
    public final void f(java.lang.Object r20, com.google.android.gms.internal.p002firebaseauthapi.zzajz r21, com.google.android.gms.internal.p002firebaseauthapi.zzakj r22) {
        /*
            Method dump skipped, instruction units count: 2210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzamc.f(java.lang.Object, com.google.android.gms.internal.firebase-auth-api.zzajz, com.google.android.gms.internal.firebase-auth-api.zzakj):void");
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0043  */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamr
    public final boolean g(zzaku zzakuVar, zzaku zzakuVar2) {
        int[] iArr = this.f10162a;
        int length = iArr.length;
        int i11 = 0;
        while (true) {
            boolean zC = true;
            if (i11 < length) {
                int iZ = z(i11);
                int i12 = (267386880 & iZ) >>> 20;
                if (i12 <= 50 || i12 >= 69) {
                    long j11 = iZ & 1048575;
                    switch (i12) {
                        case 0:
                            if (!E(zzakuVar, zzakuVar2, i11)) {
                                zC = false;
                            } else {
                                zzank.zzc zzcVar = zzank.f10225c;
                                if (Double.doubleToLongBits(zzcVar.a(zzakuVar, j11)) != Double.doubleToLongBits(zzcVar.a(zzakuVar2, j11))) {
                                    zC = false;
                                }
                            }
                            break;
                        case 1:
                            if (!E(zzakuVar, zzakuVar2, i11)) {
                                zC = false;
                            } else {
                                zzank.zzc zzcVar2 = zzank.f10225c;
                                if (Float.floatToIntBits(zzcVar2.h(zzakuVar, j11)) != Float.floatToIntBits(zzcVar2.h(zzakuVar2, j11))) {
                                    zC = false;
                                }
                            }
                            break;
                        case 2:
                            if (!E(zzakuVar, zzakuVar2, i11)) {
                                zC = false;
                            } else {
                                zzank.zzc zzcVar3 = zzank.f10225c;
                                if (zzcVar3.k(j11, zzakuVar) != zzcVar3.k(j11, zzakuVar2)) {
                                    zC = false;
                                }
                            }
                            break;
                        case 3:
                            if (!E(zzakuVar, zzakuVar2, i11)) {
                                zC = false;
                            } else {
                                zzank.zzc zzcVar4 = zzank.f10225c;
                                if (zzcVar4.k(j11, zzakuVar) != zzcVar4.k(j11, zzakuVar2)) {
                                    zC = false;
                                }
                            }
                            break;
                        case 4:
                            if (!E(zzakuVar, zzakuVar2, i11)) {
                                zC = false;
                            } else {
                                zzank.zzc zzcVar5 = zzank.f10225c;
                                if (zzcVar5.j(j11, zzakuVar) != zzcVar5.j(j11, zzakuVar2)) {
                                    zC = false;
                                }
                            }
                            break;
                        case 5:
                            if (!E(zzakuVar, zzakuVar2, i11)) {
                                zC = false;
                            } else {
                                zzank.zzc zzcVar6 = zzank.f10225c;
                                if (zzcVar6.k(j11, zzakuVar) != zzcVar6.k(j11, zzakuVar2)) {
                                    zC = false;
                                }
                            }
                            break;
                        case 6:
                            if (!E(zzakuVar, zzakuVar2, i11)) {
                                zC = false;
                            } else {
                                zzank.zzc zzcVar7 = zzank.f10225c;
                                if (zzcVar7.j(j11, zzakuVar) != zzcVar7.j(j11, zzakuVar2)) {
                                    zC = false;
                                }
                            }
                            break;
                        case 7:
                            if (!E(zzakuVar, zzakuVar2, i11)) {
                                zC = false;
                            } else {
                                zzank.zzc zzcVar8 = zzank.f10225c;
                                if (zzcVar8.i(j11, zzakuVar) != zzcVar8.i(j11, zzakuVar2)) {
                                    zC = false;
                                }
                            }
                            break;
                        case 8:
                            if (!E(zzakuVar, zzakuVar2, i11) || !zzamq.c(zzank.m(j11, zzakuVar), zzank.m(j11, zzakuVar2))) {
                                zC = false;
                            }
                            break;
                        case 9:
                            if (!E(zzakuVar, zzakuVar2, i11) || !zzamq.c(zzank.m(j11, zzakuVar), zzank.m(j11, zzakuVar2))) {
                                zC = false;
                            }
                            break;
                        case 10:
                            if (!E(zzakuVar, zzakuVar2, i11) || !zzamq.c(zzank.m(j11, zzakuVar), zzank.m(j11, zzakuVar2))) {
                                zC = false;
                            }
                            break;
                        case 11:
                            if (!E(zzakuVar, zzakuVar2, i11)) {
                                zC = false;
                            } else {
                                zzank.zzc zzcVar9 = zzank.f10225c;
                                if (zzcVar9.j(j11, zzakuVar) != zzcVar9.j(j11, zzakuVar2)) {
                                    zC = false;
                                }
                            }
                            break;
                        case 12:
                            if (!E(zzakuVar, zzakuVar2, i11)) {
                                zC = false;
                            } else {
                                zzank.zzc zzcVar10 = zzank.f10225c;
                                if (zzcVar10.j(j11, zzakuVar) != zzcVar10.j(j11, zzakuVar2)) {
                                    zC = false;
                                }
                            }
                            break;
                        case 13:
                            if (!E(zzakuVar, zzakuVar2, i11)) {
                                zC = false;
                            } else {
                                zzank.zzc zzcVar11 = zzank.f10225c;
                                if (zzcVar11.j(j11, zzakuVar) != zzcVar11.j(j11, zzakuVar2)) {
                                    zC = false;
                                }
                            }
                            break;
                        case 14:
                            if (!E(zzakuVar, zzakuVar2, i11)) {
                                zC = false;
                            } else {
                                zzank.zzc zzcVar12 = zzank.f10225c;
                                if (zzcVar12.k(j11, zzakuVar) != zzcVar12.k(j11, zzakuVar2)) {
                                    zC = false;
                                }
                            }
                            break;
                        case 15:
                            if (!E(zzakuVar, zzakuVar2, i11)) {
                                zC = false;
                            } else {
                                zzank.zzc zzcVar13 = zzank.f10225c;
                                if (zzcVar13.j(j11, zzakuVar) != zzcVar13.j(j11, zzakuVar2)) {
                                    zC = false;
                                }
                            }
                            break;
                        case 16:
                            if (!E(zzakuVar, zzakuVar2, i11)) {
                                zC = false;
                            } else {
                                zzank.zzc zzcVar14 = zzank.f10225c;
                                if (zzcVar14.k(j11, zzakuVar) != zzcVar14.k(j11, zzakuVar2)) {
                                    zC = false;
                                }
                            }
                            break;
                        case 17:
                            if (!E(zzakuVar, zzakuVar2, i11) || !zzamq.c(zzank.m(j11, zzakuVar), zzank.m(j11, zzakuVar2))) {
                                zC = false;
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
                            zC = zzamq.c(zzank.m(j11, zzakuVar), zzank.m(j11, zzakuVar2));
                            break;
                        case 50:
                            zC = zzamq.c(zzank.m(j11, zzakuVar), zzank.m(j11, zzakuVar2));
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
                            long j12 = 1048575 & iArr[i11 + 2];
                            zzank.zzc zzcVar15 = zzank.f10225c;
                            if (zzcVar15.j(j12, zzakuVar) != zzcVar15.j(j12, zzakuVar2) || !zzamq.c(zzank.m(j11, zzakuVar), zzank.m(j11, zzakuVar2))) {
                                zC = false;
                            }
                            break;
                    }
                    if (!zC) {
                    }
                }
                i11 += 3;
            } else {
                int i13 = this.f10171j;
                while (true) {
                    int[] iArr2 = this.f10169h;
                    if (i13 < iArr2.length) {
                        int i14 = iArr2[i13];
                        long j13 = iArr[i14 + 2] & 1048575;
                        zzank.zzc zzcVar16 = zzank.f10225c;
                        if (zzcVar16.j(j13, zzakuVar) == zzcVar16.j(j13, zzakuVar2)) {
                            if (!C(0, i14, zzakuVar)) {
                                long jZ = z(i14) & 1048575;
                                if (!zzamq.c(zzank.m(jZ, zzakuVar), zzank.m(jZ, zzakuVar2))) {
                                }
                            }
                            i13++;
                        }
                    } else {
                        zzanf zzanfVar = this.m;
                        if (zzanfVar.p(zzakuVar).equals(zzanfVar.p(zzakuVar2))) {
                            if (!this.f10167f) {
                                return true;
                            }
                            zzakl zzaklVar = this.f10174n;
                            return zzaklVar.b(zzakuVar).equals(zzaklVar.b(zzakuVar2));
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:137:0x0374  */
    /* JADX WARN: Code duplicated, block: B:147:0x03a9  */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamr
    public final int h(zzaix zzaixVar) {
        int i11;
        int iX;
        int iU;
        int iX2;
        int iU2;
        int iQ;
        int iW;
        int iB;
        int iX3;
        int iW2;
        int iB2;
        int size;
        int iX4;
        int size2;
        int iX5;
        int iW3;
        int size3;
        int iJ;
        int iW4;
        int iX6;
        int iW5;
        int i12;
        int size4;
        int iW6;
        int iX7;
        int iX8;
        int iB3;
        int iX9;
        int iU3;
        int iX10;
        int iU4;
        int iQ2;
        int i13;
        zzamc<T> zzamcVar = this;
        zzaix zzaixVar2 = zzaixVar;
        Unsafe unsafe = f10161q;
        int i14 = 1048575;
        int i15 = 0;
        int i16 = 0;
        int iB4 = 0;
        int i17 = 1048575;
        while (true) {
            int[] iArr = zzamcVar.f10162a;
            if (i15 >= iArr.length) {
                zzanf zzanfVar = zzamcVar.m;
                int iA = iB4 + zzanfVar.a(zzanfVar.p(zzaixVar2));
                if (zzamcVar.f10167f) {
                    zzams zzamsVar = zzamcVar.f10174n.b(zzaixVar2).f10120a;
                    if (zzamsVar.f10197b > 0) {
                        zzamx zzamxVar = (zzamx) zzamsVar.c(0);
                        zzako zzakoVar = (zzako) zzamxVar.f10209a;
                        Object obj = zzamxVar.f10210b;
                        zzakoVar.zzb();
                        throw null;
                    }
                    Iterator<T> it = zzamsVar.f().iterator();
                    if (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        zzako zzakoVar2 = (zzako) entry.getKey();
                        entry.getValue();
                        zzakoVar2.zzb();
                        throw null;
                    }
                }
                return iA;
            }
            int iZ = zzamcVar.z(i15);
            int i18 = (267386880 & iZ) >>> 20;
            int i19 = iArr[i15];
            int i21 = iArr[i15 + 2];
            int i22 = i21 & i14;
            if (i18 <= 17) {
                if (i22 != i17) {
                    i16 = i22 == i14 ? 0 : unsafe.getInt(zzaixVar2, i22);
                    i17 = i22;
                }
                i11 = 1 << (i21 >>> 20);
            } else {
                i11 = 0;
            }
            long j11 = iZ & i14;
            if (i18 >= zzakr.zza.zza()) {
                zzakr.zzb.zza();
            }
            switch (i18) {
                case 0:
                    if (zzamcVar.v(zzaixVar2, i15, i17, i16, i11)) {
                        iB4 = e0.B(i19 << 3, 8, iB4);
                    }
                    break;
                case 1:
                    if (zzamcVar.v(zzaixVar2, i15, i17, i16, i11)) {
                        iB4 = e0.B(i19 << 3, 4, iB4);
                    }
                    zzamcVar = this;
                    zzaixVar2 = zzaixVar;
                    break;
                case 2:
                    if (zzamcVar.v(zzaixVar2, i15, i17, i16, i11)) {
                        long j12 = unsafe.getLong(zzaixVar2, j11);
                        iX = zzakb.x(i19 << 3);
                        iU = zzakb.u(j12);
                        iB4 += iU + iX;
                    }
                    zzamcVar = this;
                    break;
                case 3:
                    if (zzamcVar.v(zzaixVar2, i15, i17, i16, i11)) {
                        long j13 = unsafe.getLong(zzaixVar2, j11);
                        iX = zzakb.x(i19 << 3);
                        iU = zzakb.u(j13);
                        iB4 += iU + iX;
                    }
                    zzamcVar = this;
                    break;
                case 4:
                    if (zzamcVar.v(zzaixVar2, i15, i17, i16, i11)) {
                        int i23 = unsafe.getInt(zzaixVar2, j11);
                        iX2 = zzakb.x(i19 << 3);
                        iU2 = zzakb.u(i23);
                        iQ = iU2 + iX2;
                        iB4 += iQ;
                    }
                    zzamcVar = this;
                    break;
                case 5:
                    if (zzamcVar.v(zzaixVar2, i15, i17, i16, i11)) {
                        iB4 = e0.B(i19 << 3, 8, iB4);
                    }
                    zzamcVar = this;
                    zzaixVar2 = zzaixVar;
                    break;
                case 6:
                    if (zzamcVar.v(zzaixVar2, i15, i17, i16, i11)) {
                        iB4 = e0.B(i19 << 3, 4, iB4);
                    }
                    zzamcVar = this;
                    zzaixVar2 = zzaixVar;
                    break;
                case 7:
                    if (zzamcVar.v(zzaixVar2, i15, i17, i16, i11)) {
                        iB4 = e0.B(i19 << 3, 1, iB4);
                    }
                    zzamcVar = this;
                    zzaixVar2 = zzaixVar;
                    break;
                case 8:
                    if (zzamcVar.v(zzaixVar2, i15, i17, i16, i11)) {
                        Object object = unsafe.getObject(zzaixVar2, j11);
                        if (object instanceof zzaje) {
                            iQ = zzakb.q(i19, (zzaje) object);
                            iB4 += iQ;
                        } else {
                            int iX11 = zzakb.x(i19 << 3);
                            int iA2 = zzanl.a((String) object);
                            iB4 += zzakb.x(iA2) + iA2 + iX11;
                        }
                    }
                    zzamcVar = this;
                    break;
                case 9:
                    if (zzamcVar.v(zzaixVar2, i15, i17, i16, i11)) {
                        Object object2 = unsafe.getObject(zzaixVar2, j11);
                        zzamr zzamrVarH = zzamcVar.H(i15);
                        zzanh zzanhVar = zzamq.f10194a;
                        iW = zzakb.w(i19);
                        iB = ((zzaix) object2).b(zzamrVarH);
                        iX3 = zzakb.x(iB);
                        i13 = iX3 + iB + iW;
                        iB4 += i13;
                    }
                    break;
                case 10:
                    if (zzamcVar.v(zzaixVar2, i15, i17, i16, i11)) {
                        iQ = zzakb.q(i19, (zzaje) unsafe.getObject(zzaixVar2, j11));
                        iB4 += iQ;
                    }
                    zzamcVar = this;
                    break;
                case 11:
                    if (zzamcVar.v(zzaixVar2, i15, i17, i16, i11)) {
                        iQ = zzakb.v(i19, unsafe.getInt(zzaixVar2, j11));
                        iB4 += iQ;
                    }
                    zzamcVar = this;
                    break;
                case 12:
                    if (zzamcVar.v(zzaixVar2, i15, i17, i16, i11)) {
                        int i24 = unsafe.getInt(zzaixVar2, j11);
                        iX2 = zzakb.x(i19 << 3);
                        iU2 = zzakb.u(i24);
                        iQ = iU2 + iX2;
                        iB4 += iQ;
                    }
                    zzamcVar = this;
                    break;
                case 13:
                    if (zzamcVar.v(zzaixVar2, i15, i17, i16, i11)) {
                        iB4 = e0.B(i19 << 3, 4, iB4);
                    }
                    zzamcVar = this;
                    zzaixVar2 = zzaixVar;
                    break;
                case 14:
                    if (zzamcVar.v(zzaixVar2, i15, i17, i16, i11)) {
                        iB4 = e0.B(i19 << 3, 8, iB4);
                    }
                    zzamcVar = this;
                    zzaixVar2 = zzaixVar;
                    break;
                case 15:
                    if (zzamcVar.v(zzaixVar2, i15, i17, i16, i11)) {
                        int i25 = unsafe.getInt(zzaixVar2, j11);
                        iB4 = e0.B((i25 >> 31) ^ (i25 << 1), zzakb.x(i19 << 3), iB4);
                    }
                    zzamcVar = this;
                    break;
                case 16:
                    if (zzamcVar.v(zzaixVar2, i15, i17, i16, i11)) {
                        long j14 = unsafe.getLong(zzaixVar2, j11);
                        iX = zzakb.x(i19 << 3);
                        iU = zzakb.u((j14 >> 63) ^ (j14 << 1));
                        iB4 += iU + iX;
                    }
                    zzamcVar = this;
                    break;
                case 17:
                    if (zzamcVar.v(zzaixVar2, i15, i17, i16, i11)) {
                        zzaly zzalyVar = (zzaly) unsafe.getObject(zzaixVar2, j11);
                        zzamr zzamrVarH2 = zzamcVar.H(i15);
                        zzanh zzanhVar2 = zzamq.f10194a;
                        iW2 = zzakb.w(i19) << 1;
                        iB2 = ((zzaix) zzalyVar).b(zzamrVarH2);
                        iQ2 = iB2 + iW2;
                        iB4 += iQ2;
                    }
                    break;
                case 18:
                    List list = (List) unsafe.getObject(zzaixVar2, j11);
                    zzanh zzanhVar3 = zzamq.f10194a;
                    size = list.size();
                    if (size == 0) {
                        i12 = 0;
                    } else {
                        iX4 = zzakb.x(i19 << 3);
                        iX6 = iX4 + 8;
                        i12 = iX6 * size;
                    }
                    iB4 += i12;
                    break;
                case 19:
                    List list2 = (List) unsafe.getObject(zzaixVar2, j11);
                    zzanh zzanhVar4 = zzamq.f10194a;
                    size2 = list2.size();
                    if (size2 == 0) {
                        iW3 = 0;
                    } else {
                        iX5 = zzakb.x(i19 << 3);
                        iW3 = (iX5 + 4) * size2;
                    }
                    iB4 += iW3;
                    break;
                case 20:
                    List list3 = (List) unsafe.getObject(zzaixVar2, j11);
                    zzanh zzanhVar5 = zzamq.f10194a;
                    if (list3.size() == 0) {
                        iW3 = 0;
                    } else {
                        iW3 = (zzakb.w(i19) * list3.size()) + zzamq.f(list3);
                    }
                    iB4 += iW3;
                    break;
                case 21:
                    List list4 = (List) unsafe.getObject(zzaixVar2, j11);
                    zzanh zzanhVar6 = zzamq.f10194a;
                    size3 = list4.size();
                    if (size3 == 0) {
                        iW3 = 0;
                    } else {
                        iJ = zzamq.j(list4);
                        iW4 = zzakb.w(i19);
                        iW3 = (iW4 * size3) + iJ;
                    }
                    iB4 += iW3;
                    break;
                case 22:
                    List list5 = (List) unsafe.getObject(zzaixVar2, j11);
                    zzanh zzanhVar7 = zzamq.f10194a;
                    size3 = list5.size();
                    if (size3 == 0) {
                        iW3 = 0;
                    } else {
                        iJ = zzamq.e(list5);
                        iW4 = zzakb.w(i19);
                        iW3 = (iW4 * size3) + iJ;
                    }
                    iB4 += iW3;
                    break;
                case 23:
                    List list6 = (List) unsafe.getObject(zzaixVar2, j11);
                    zzanh zzanhVar8 = zzamq.f10194a;
                    size = list6.size();
                    if (size == 0) {
                        i12 = 0;
                    } else {
                        iX4 = zzakb.x(i19 << 3);
                        iX6 = iX4 + 8;
                        i12 = iX6 * size;
                    }
                    iB4 += i12;
                    break;
                case Service.METRICS_FIELD_NUMBER /* 24 */:
                    List list7 = (List) unsafe.getObject(zzaixVar2, j11);
                    zzanh zzanhVar9 = zzamq.f10194a;
                    size2 = list7.size();
                    if (size2 == 0) {
                        iW3 = 0;
                    } else {
                        iX5 = zzakb.x(i19 << 3);
                        iW3 = (iX5 + 4) * size2;
                    }
                    iB4 += iW3;
                    break;
                case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                    List list8 = (List) unsafe.getObject(zzaixVar2, j11);
                    zzanh zzanhVar10 = zzamq.f10194a;
                    size = list8.size();
                    if (size == 0) {
                        i12 = 0;
                    } else {
                        iX6 = zzakb.x(i19 << 3) + 1;
                        i12 = iX6 * size;
                    }
                    iB4 += i12;
                    break;
                case Service.BILLING_FIELD_NUMBER /* 26 */:
                    List list9 = (List) unsafe.getObject(zzaixVar2, j11);
                    zzanh zzanhVar11 = zzamq.f10194a;
                    int size5 = list9.size();
                    if (size5 == 0) {
                        iW3 = 0;
                    } else {
                        iW3 = zzakb.w(i19) * size5;
                        if (list9 instanceof zzalj) {
                            zzalj zzaljVar = (zzalj) list9;
                            for (int i26 = 0; i26 < size5; i26++) {
                                Object objZza = zzaljVar.zza();
                                if (objZza instanceof zzaje) {
                                    int iD = ((zzaje) objZza).d();
                                    iW3 = e0.B(iD, iD, iW3);
                                } else {
                                    int iA3 = zzanl.a((String) objZza);
                                    iW3 = e0.B(iA3, iA3, iW3);
                                }
                            }
                        } else {
                            for (int i27 = 0; i27 < size5; i27++) {
                                Object obj2 = list9.get(i27);
                                if (obj2 instanceof zzaje) {
                                    int iD2 = ((zzaje) obj2).d();
                                    iW3 = e0.B(iD2, iD2, iW3);
                                } else {
                                    int iA4 = zzanl.a((String) obj2);
                                    iW3 = e0.B(iA4, iA4, iW3);
                                }
                            }
                        }
                    }
                    iB4 += iW3;
                    break;
                case 27:
                    List list10 = (List) unsafe.getObject(zzaixVar2, j11);
                    zzamr zzamrVarH3 = zzamcVar.H(i15);
                    zzanh zzanhVar12 = zzamq.f10194a;
                    int size6 = list10.size();
                    if (size6 == 0) {
                        iW5 = 0;
                    } else {
                        iW5 = zzakb.w(i19) * size6;
                        for (int i28 = 0; i28 < size6; i28++) {
                            int iB5 = ((zzaix) list10.get(i28)).b(zzamrVarH3);
                            iW5 = e0.B(iB5, iB5, iW5);
                        }
                    }
                    iB4 += iW5;
                    break;
                case Service.MONITORING_FIELD_NUMBER /* 28 */:
                    List list11 = (List) unsafe.getObject(zzaixVar2, j11);
                    zzanh zzanhVar13 = zzamq.f10194a;
                    int size7 = list11.size();
                    if (size7 == 0) {
                        iW3 = 0;
                    } else {
                        iW3 = zzakb.w(i19) * size7;
                        for (int i29 = 0; i29 < list11.size(); i29++) {
                            int iD3 = ((zzaje) list11.get(i29)).d();
                            iW3 = e0.B(iD3, iD3, iW3);
                        }
                    }
                    iB4 += iW3;
                    break;
                case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
                    List list12 = (List) unsafe.getObject(zzaixVar2, j11);
                    zzanh zzanhVar14 = zzamq.f10194a;
                    size3 = list12.size();
                    if (size3 == 0) {
                        iW3 = 0;
                    } else {
                        iJ = zzamq.i(list12);
                        iW4 = zzakb.w(i19);
                        iW3 = (iW4 * size3) + iJ;
                    }
                    iB4 += iW3;
                    break;
                case 30:
                    List list13 = (List) unsafe.getObject(zzaixVar2, j11);
                    zzanh zzanhVar15 = zzamq.f10194a;
                    size3 = list13.size();
                    if (size3 == 0) {
                        iW3 = 0;
                    } else {
                        iJ = zzamq.d(list13);
                        iW4 = zzakb.w(i19);
                        iW3 = (iW4 * size3) + iJ;
                    }
                    iB4 += iW3;
                    break;
                case 31:
                    List list14 = (List) unsafe.getObject(zzaixVar2, j11);
                    zzanh zzanhVar16 = zzamq.f10194a;
                    size2 = list14.size();
                    if (size2 == 0) {
                        iW3 = 0;
                    } else {
                        iX5 = zzakb.x(i19 << 3);
                        iW3 = (iX5 + 4) * size2;
                    }
                    iB4 += iW3;
                    break;
                case Consts.SP /* 32 */:
                    List list15 = (List) unsafe.getObject(zzaixVar2, j11);
                    zzanh zzanhVar17 = zzamq.f10194a;
                    size = list15.size();
                    if (size == 0) {
                        i12 = 0;
                    } else {
                        iX4 = zzakb.x(i19 << 3);
                        iX6 = iX4 + 8;
                        i12 = iX6 * size;
                    }
                    iB4 += i12;
                    break;
                case 33:
                    List list16 = (List) unsafe.getObject(zzaixVar2, j11);
                    zzanh zzanhVar18 = zzamq.f10194a;
                    size3 = list16.size();
                    if (size3 == 0) {
                        iW3 = 0;
                    } else {
                        iJ = zzamq.g(list16);
                        iW4 = zzakb.w(i19);
                        iW3 = (iW4 * size3) + iJ;
                    }
                    iB4 += iW3;
                    break;
                case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                    List list17 = (List) unsafe.getObject(zzaixVar2, j11);
                    zzanh zzanhVar19 = zzamq.f10194a;
                    size3 = list17.size();
                    if (size3 == 0) {
                        iW3 = 0;
                    } else {
                        iJ = zzamq.h(list17);
                        iW4 = zzakb.w(i19);
                        iW3 = (iW4 * size3) + iJ;
                    }
                    iB4 += iW3;
                    break;
                case 35:
                    List list18 = (List) unsafe.getObject(zzaixVar2, j11);
                    zzanh zzanhVar20 = zzamq.f10194a;
                    size4 = list18.size() << 3;
                    if (size4 > 0) {
                        iW6 = zzakb.w(i19);
                        iX7 = zzakb.x(size4);
                        iX8 = iX7 + iW6 + size4;
                        iB4 += iX8;
                    }
                    break;
                case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    List list19 = (List) unsafe.getObject(zzaixVar2, j11);
                    zzanh zzanhVar21 = zzamq.f10194a;
                    size4 = list19.size() << 2;
                    if (size4 > 0) {
                        iW6 = zzakb.w(i19);
                        iX7 = zzakb.x(size4);
                        iX8 = iX7 + iW6 + size4;
                        iB4 += iX8;
                    }
                    break;
                case 37:
                    size4 = zzamq.f((List) unsafe.getObject(zzaixVar2, j11));
                    if (size4 > 0) {
                        iW6 = zzakb.w(i19);
                        iX7 = zzakb.x(size4);
                        iX8 = iX7 + iW6 + size4;
                        iB4 += iX8;
                    }
                    break;
                case 38:
                    size4 = zzamq.j((List) unsafe.getObject(zzaixVar2, j11));
                    if (size4 > 0) {
                        iW6 = zzakb.w(i19);
                        iX7 = zzakb.x(size4);
                        iX8 = iX7 + iW6 + size4;
                        iB4 += iX8;
                    }
                    break;
                case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    size4 = zzamq.e((List) unsafe.getObject(zzaixVar2, j11));
                    if (size4 > 0) {
                        iW6 = zzakb.w(i19);
                        iX7 = zzakb.x(size4);
                        iX8 = iX7 + iW6 + size4;
                        iB4 += iX8;
                    }
                    break;
                case DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                    List list20 = (List) unsafe.getObject(zzaixVar2, j11);
                    zzanh zzanhVar22 = zzamq.f10194a;
                    size4 = list20.size() << 3;
                    if (size4 > 0) {
                        iW6 = zzakb.w(i19);
                        iX7 = zzakb.x(size4);
                        iX8 = iX7 + iW6 + size4;
                        iB4 += iX8;
                    }
                    break;
                case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                    List list21 = (List) unsafe.getObject(zzaixVar2, j11);
                    zzanh zzanhVar23 = zzamq.f10194a;
                    size4 = list21.size() << 2;
                    if (size4 > 0) {
                        iW6 = zzakb.w(i19);
                        iX7 = zzakb.x(size4);
                        iX8 = iX7 + iW6 + size4;
                        iB4 += iX8;
                    }
                    break;
                case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                    List list22 = (List) unsafe.getObject(zzaixVar2, j11);
                    zzanh zzanhVar24 = zzamq.f10194a;
                    size4 = list22.size();
                    if (size4 > 0) {
                        iW6 = zzakb.w(i19);
                        iX7 = zzakb.x(size4);
                        iX8 = iX7 + iW6 + size4;
                        iB4 += iX8;
                    }
                    break;
                case 43:
                    size4 = zzamq.i((List) unsafe.getObject(zzaixVar2, j11));
                    if (size4 > 0) {
                        iW6 = zzakb.w(i19);
                        iX7 = zzakb.x(size4);
                        iX8 = iX7 + iW6 + size4;
                        iB4 += iX8;
                    }
                    break;
                case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                    size4 = zzamq.d((List) unsafe.getObject(zzaixVar2, j11));
                    if (size4 > 0) {
                        iW6 = zzakb.w(i19);
                        iX7 = zzakb.x(size4);
                        iX8 = iX7 + iW6 + size4;
                        iB4 += iX8;
                    }
                    break;
                case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                    List list23 = (List) unsafe.getObject(zzaixVar2, j11);
                    zzanh zzanhVar25 = zzamq.f10194a;
                    size4 = list23.size() << 2;
                    if (size4 > 0) {
                        iW6 = zzakb.w(i19);
                        iX7 = zzakb.x(size4);
                        iX8 = iX7 + iW6 + size4;
                        iB4 += iX8;
                    }
                    break;
                case 46:
                    List list24 = (List) unsafe.getObject(zzaixVar2, j11);
                    zzanh zzanhVar26 = zzamq.f10194a;
                    size4 = list24.size() << 3;
                    if (size4 > 0) {
                        iW6 = zzakb.w(i19);
                        iX7 = zzakb.x(size4);
                        iX8 = iX7 + iW6 + size4;
                        iB4 += iX8;
                    }
                    break;
                case 47:
                    size4 = zzamq.g((List) unsafe.getObject(zzaixVar2, j11));
                    if (size4 > 0) {
                        iW6 = zzakb.w(i19);
                        iX7 = zzakb.x(size4);
                        iX8 = iX7 + iW6 + size4;
                        iB4 += iX8;
                    }
                    break;
                case 48:
                    size4 = zzamq.h((List) unsafe.getObject(zzaixVar2, j11));
                    if (size4 > 0) {
                        iW6 = zzakb.w(i19);
                        iX7 = zzakb.x(size4);
                        iX8 = iX7 + iW6 + size4;
                        iB4 += iX8;
                    }
                    break;
                case 49:
                    List list25 = (List) unsafe.getObject(zzaixVar2, j11);
                    zzamr zzamrVarH4 = zzamcVar.H(i15);
                    zzanh zzanhVar27 = zzamq.f10194a;
                    int size8 = list25.size();
                    if (size8 == 0) {
                        iB3 = 0;
                    } else {
                        iB3 = 0;
                        for (int i30 = 0; i30 < size8; i30++) {
                            iB3 += ((zzaix) ((zzaly) list25.get(i30))).b(zzamrVarH4) + (zzakb.w(i19) << 1);
                        }
                    }
                    iB4 += iB3;
                    break;
                case 50:
                    zzamcVar.f10175o.mo204b(unsafe.getObject(zzaixVar2, j11), zzamcVar.I(i15));
                    break;
                case 51:
                    if (zzamcVar.C(i19, i15, zzaixVar2)) {
                        iB4 = e0.B(i19 << 3, 8, iB4);
                    }
                    break;
                case 52:
                    if (zzamcVar.C(i19, i15, zzaixVar2)) {
                        iB4 = e0.B(i19 << 3, 4, iB4);
                    }
                    break;
                case 53:
                    if (zzamcVar.C(i19, i15, zzaixVar2)) {
                        long jF = F(zzaixVar2, j11);
                        iX9 = zzakb.x(i19 << 3);
                        iU3 = zzakb.u(jF);
                        i13 = iU3 + iX9;
                        iB4 += i13;
                    }
                    break;
                case 54:
                    if (zzamcVar.C(i19, i15, zzaixVar2)) {
                        long jF2 = F(zzaixVar2, j11);
                        iX9 = zzakb.x(i19 << 3);
                        iU3 = zzakb.u(jF2);
                        i13 = iU3 + iX9;
                        iB4 += i13;
                    }
                    break;
                case 55:
                    if (zzamcVar.C(i19, i15, zzaixVar2)) {
                        int iA5 = A(zzaixVar2, j11);
                        iX10 = zzakb.x(i19 << 3);
                        iU4 = zzakb.u(iA5);
                        iQ2 = iU4 + iX10;
                        iB4 += iQ2;
                    }
                    break;
                case 56:
                    if (zzamcVar.C(i19, i15, zzaixVar2)) {
                        iB4 = e0.B(i19 << 3, 8, iB4);
                    }
                    break;
                case 57:
                    if (zzamcVar.C(i19, i15, zzaixVar2)) {
                        iB4 = e0.B(i19 << 3, 4, iB4);
                    }
                    break;
                case 58:
                    if (zzamcVar.C(i19, i15, zzaixVar2)) {
                        iB4 = e0.B(i19 << 3, 1, iB4);
                    }
                    break;
                case 59:
                    if (zzamcVar.C(i19, i15, zzaixVar2)) {
                        Object object3 = unsafe.getObject(zzaixVar2, j11);
                        if (object3 instanceof zzaje) {
                            iQ2 = zzakb.q(i19, (zzaje) object3);
                            iB4 += iQ2;
                        } else {
                            int iX12 = zzakb.x(i19 << 3);
                            int iA6 = zzanl.a((String) object3);
                            iX8 = zzakb.x(iA6) + iA6 + iX12;
                            iB4 += iX8;
                        }
                    }
                    break;
                case 60:
                    if (zzamcVar.C(i19, i15, zzaixVar2)) {
                        Object object4 = unsafe.getObject(zzaixVar2, j11);
                        zzamr zzamrVarH5 = zzamcVar.H(i15);
                        zzanh zzanhVar28 = zzamq.f10194a;
                        iW = zzakb.w(i19);
                        iB = ((zzaix) object4).b(zzamrVarH5);
                        iX3 = zzakb.x(iB);
                        i13 = iX3 + iB + iW;
                        iB4 += i13;
                    }
                    break;
                case 61:
                    if (zzamcVar.C(i19, i15, zzaixVar2)) {
                        iQ2 = zzakb.q(i19, (zzaje) unsafe.getObject(zzaixVar2, j11));
                        iB4 += iQ2;
                    }
                    break;
                case 62:
                    if (zzamcVar.C(i19, i15, zzaixVar2)) {
                        iQ2 = zzakb.v(i19, A(zzaixVar2, j11));
                        iB4 += iQ2;
                    }
                    break;
                case 63:
                    if (zzamcVar.C(i19, i15, zzaixVar2)) {
                        int iA7 = A(zzaixVar2, j11);
                        iX10 = zzakb.x(i19 << 3);
                        iU4 = zzakb.u(iA7);
                        iQ2 = iU4 + iX10;
                        iB4 += iQ2;
                    }
                    break;
                case 64:
                    if (zzamcVar.C(i19, i15, zzaixVar2)) {
                        iB4 = e0.B(i19 << 3, 4, iB4);
                    }
                    break;
                case 65:
                    if (zzamcVar.C(i19, i15, zzaixVar2)) {
                        iB4 = e0.B(i19 << 3, 8, iB4);
                    }
                    break;
                case 66:
                    if (zzamcVar.C(i19, i15, zzaixVar2)) {
                        int iA8 = A(zzaixVar2, j11);
                        iB4 = e0.B((iA8 >> 31) ^ (iA8 << 1), zzakb.x(i19 << 3), iB4);
                    }
                    break;
                case 67:
                    if (zzamcVar.C(i19, i15, zzaixVar2)) {
                        long jF3 = F(zzaixVar2, j11);
                        iX9 = zzakb.x(i19 << 3);
                        iU3 = zzakb.u((jF3 >> 63) ^ (jF3 << 1));
                        i13 = iU3 + iX9;
                        iB4 += i13;
                    }
                    break;
                case 68:
                    if (zzamcVar.C(i19, i15, zzaixVar2)) {
                        zzaly zzalyVar2 = (zzaly) unsafe.getObject(zzaixVar2, j11);
                        zzamr zzamrVarH6 = zzamcVar.H(i15);
                        zzanh zzanhVar29 = zzamq.f10194a;
                        iW2 = zzakb.w(i19) << 1;
                        iB2 = ((zzaix) zzalyVar2).b(zzamrVarH6);
                        iQ2 = iB2 + iW2;
                        iB4 += iQ2;
                    }
                    break;
            }
            i15 += 3;
            i14 = 1048575;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamr
    public final int i(zzaku zzakuVar) {
        int i11;
        int iB;
        int i12;
        int iJ;
        int length = this.f10162a.length;
        int iHashCode = 0;
        for (int i13 = 0; i13 < length; i13 += 3) {
            int iZ = z(i13);
            int i14 = (267386880 & iZ) >>> 20;
            if (i14 <= 50 || i14 >= 69) {
                long j11 = 1048575 & iZ;
                int iHashCode2 = 37;
                switch (i14) {
                    case 0:
                        i11 = iHashCode * 53;
                        iB = zzakw.b(Double.doubleToLongBits(zzank.f10225c.a(zzakuVar, j11)));
                        iHashCode = i11 + iB;
                        break;
                    case 1:
                        i11 = iHashCode * 53;
                        iB = Float.floatToIntBits(zzank.f10225c.h(zzakuVar, j11));
                        iHashCode = i11 + iB;
                        break;
                    case 2:
                        i11 = iHashCode * 53;
                        iB = zzakw.b(zzank.f10225c.k(j11, zzakuVar));
                        iHashCode = i11 + iB;
                        break;
                    case 3:
                        i11 = iHashCode * 53;
                        iB = zzakw.b(zzank.f10225c.k(j11, zzakuVar));
                        iHashCode = i11 + iB;
                        break;
                    case 4:
                        i12 = iHashCode * 53;
                        iJ = zzank.f10225c.j(j11, zzakuVar);
                        iHashCode = i12 + iJ;
                        break;
                    case 5:
                        i11 = iHashCode * 53;
                        iB = zzakw.b(zzank.f10225c.k(j11, zzakuVar));
                        iHashCode = i11 + iB;
                        break;
                    case 6:
                        i12 = iHashCode * 53;
                        iJ = zzank.f10225c.j(j11, zzakuVar);
                        iHashCode = i12 + iJ;
                        break;
                    case 7:
                        i11 = iHashCode * 53;
                        boolean zI = zzank.f10225c.i(j11, zzakuVar);
                        byte[] bArr = zzakw.f10134a;
                        iB = zI ? 1231 : 1237;
                        iHashCode = i11 + iB;
                        break;
                    case 8:
                        i11 = iHashCode * 53;
                        iB = ((String) zzank.m(j11, zzakuVar)).hashCode();
                        iHashCode = i11 + iB;
                        break;
                    case 9:
                        Object objM = zzank.m(j11, zzakuVar);
                        if (objM != null) {
                            iHashCode2 = objM.hashCode();
                        }
                        iHashCode = (iHashCode * 53) + iHashCode2;
                        break;
                    case 10:
                        i11 = iHashCode * 53;
                        iB = zzank.m(j11, zzakuVar).hashCode();
                        iHashCode = i11 + iB;
                        break;
                    case 11:
                        i12 = iHashCode * 53;
                        iJ = zzank.f10225c.j(j11, zzakuVar);
                        iHashCode = i12 + iJ;
                        break;
                    case 12:
                        i12 = iHashCode * 53;
                        iJ = zzank.f10225c.j(j11, zzakuVar);
                        iHashCode = i12 + iJ;
                        break;
                    case 13:
                        i12 = iHashCode * 53;
                        iJ = zzank.f10225c.j(j11, zzakuVar);
                        iHashCode = i12 + iJ;
                        break;
                    case 14:
                        i11 = iHashCode * 53;
                        iB = zzakw.b(zzank.f10225c.k(j11, zzakuVar));
                        iHashCode = i11 + iB;
                        break;
                    case 15:
                        i12 = iHashCode * 53;
                        iJ = zzank.f10225c.j(j11, zzakuVar);
                        iHashCode = i12 + iJ;
                        break;
                    case 16:
                        i11 = iHashCode * 53;
                        iB = zzakw.b(zzank.f10225c.k(j11, zzakuVar));
                        iHashCode = i11 + iB;
                        break;
                    case 17:
                        Object objM2 = zzank.m(j11, zzakuVar);
                        if (objM2 != null) {
                            iHashCode2 = objM2.hashCode();
                        }
                        iHashCode = (iHashCode * 53) + iHashCode2;
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
                        i11 = iHashCode * 53;
                        iB = zzank.m(j11, zzakuVar).hashCode();
                        iHashCode = i11 + iB;
                        break;
                    case 50:
                        i11 = iHashCode * 53;
                        iB = zzank.m(j11, zzakuVar).hashCode();
                        iHashCode = i11 + iB;
                        break;
                }
            }
        }
        int i15 = this.f10171j;
        while (true) {
            int[] iArr = this.f10169h;
            if (i15 >= iArr.length) {
                int iHashCode3 = this.m.p(zzakuVar).hashCode() + (iHashCode * 53);
                return this.f10167f ? (iHashCode3 * 53) + this.f10174n.b(zzakuVar).f10120a.hashCode() : iHashCode3;
            }
            int i16 = iArr[i15];
            if (!C(0, i16, zzakuVar)) {
                iHashCode = zzank.m(z(i16) & 1048575, zzakuVar).hashCode() + (iHashCode * 53);
            }
            i15++;
        }
    }

    public final int j(int i11, int i12) {
        int[] iArr = this.f10162a;
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

    /* JADX WARN: Code duplicated, block: B:466:0x0ad7 A[PHI: r1 r2 r4 r9 r10 r11 r21 r32
      0x0ad7: PHI (r1v200 com.google.android.gms.internal.firebase-auth-api.zzajd) = 
      (r1v77 com.google.android.gms.internal.firebase-auth-api.zzajd)
      (r1v80 com.google.android.gms.internal.firebase-auth-api.zzajd)
      (r1v83 com.google.android.gms.internal.firebase-auth-api.zzajd)
      (r1v91 com.google.android.gms.internal.firebase-auth-api.zzajd)
      (r1v144 com.google.android.gms.internal.firebase-auth-api.zzajd)
      (r1v149 com.google.android.gms.internal.firebase-auth-api.zzajd)
      (r1v177 com.google.android.gms.internal.firebase-auth-api.zzajd)
      (r1v201 com.google.android.gms.internal.firebase-auth-api.zzajd)
     binds: [B:460:0x0aad, B:430:0x0a0b, B:400:0x096f, B:378:0x0902, B:236:0x0685, B:231:0x064b, B:173:0x051e, B:147:0x0455] A[DONT_GENERATE, DONT_INLINE]
      0x0ad7: PHI (r2v104 byte[]) = 
      (r2v57 byte[])
      (r2v58 byte[])
      (r2v59 byte[])
      (r2v62 byte[])
      (r2v74 byte[])
      (r2v78 byte[])
      (r2v93 byte[])
      (r2v105 byte[])
     binds: [B:460:0x0aad, B:430:0x0a0b, B:400:0x096f, B:378:0x0902, B:236:0x0685, B:231:0x064b, B:173:0x051e, B:147:0x0455] A[DONT_GENERATE, DONT_INLINE]
      0x0ad7: PHI (r4v116 int) = (r4v82 int), (r4v83 int), (r4v84 int), (r4v87 int), (r4v98 int), (r4v100 int), (r4v105 int), (r4v117 int) binds: [B:460:0x0aad, B:430:0x0a0b, B:400:0x096f, B:378:0x0902, B:236:0x0685, B:231:0x064b, B:173:0x051e, B:147:0x0455] A[DONT_GENERATE, DONT_INLINE]
      0x0ad7: PHI (r9v120 int) = (r9v64 int), (r9v65 int), (r9v66 int), (r9v70 int), (r9v103 int), (r9v106 int), (r9v112 int), (r9v121 int) binds: [B:460:0x0aad, B:430:0x0a0b, B:400:0x096f, B:378:0x0902, B:236:0x0685, B:231:0x064b, B:173:0x051e, B:147:0x0455] A[DONT_GENERATE, DONT_INLINE]
      0x0ad7: PHI (r10v64 int) = (r10v7 int), (r10v8 int), (r10v9 int), (r10v12 int), (r10v38 int), (r10v41 int), (r10v48 int), (r10v65 int) binds: [B:460:0x0aad, B:430:0x0a0b, B:400:0x096f, B:378:0x0902, B:236:0x0685, B:231:0x064b, B:173:0x051e, B:147:0x0455] A[DONT_GENERATE, DONT_INLINE]
      0x0ad7: PHI (r11v52 java.lang.Object) = 
      (r11v34 java.lang.Object)
      (r11v34 java.lang.Object)
      (r11v34 java.lang.Object)
      (r11v34 java.lang.Object)
      (r11v37 java.lang.Object)
      (r11v40 java.lang.Object)
      (r11v46 java.lang.Object)
      (r11v34 java.lang.Object)
     binds: [B:460:0x0aad, B:430:0x0a0b, B:400:0x096f, B:378:0x0902, B:236:0x0685, B:231:0x064b, B:173:0x051e, B:147:0x0455] A[DONT_GENERATE, DONT_INLINE]
      0x0ad7: PHI (r21v24 int) = (r21v1 int), (r21v2 int), (r21v3 int), (r21v6 int), (r21v16 int), (r21v17 int), (r21v20 int), (r21v25 int) binds: [B:460:0x0aad, B:430:0x0a0b, B:400:0x096f, B:378:0x0902, B:236:0x0685, B:231:0x064b, B:173:0x051e, B:147:0x0455] A[DONT_GENERATE, DONT_INLINE]
      0x0ad7: PHI (r32v33 int) = (r32v26 int), (r32v26 int), (r32v26 int), (r32v26 int), (r32v28 int), (r32v30 int), (r32v26 int), (r32v26 int) binds: [B:460:0x0aad, B:430:0x0a0b, B:400:0x096f, B:378:0x0902, B:236:0x0685, B:231:0x064b, B:173:0x051e, B:147:0x0455] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:551:0x0d3d A[PHI: r2 r4 r10 r18
      0x0d3d: PHI (r2v133 int) = 
      (r2v109 int)
      (r2v110 int)
      (r2v111 int)
      (r2v112 int)
      (r2v113 int)
      (r2v114 int)
      (r2v115 int)
      (r2v124 int)
      (r2v134 int)
     binds: [B:549:0x0d26, B:546:0x0d06, B:543:0x0cea, B:540:0x0ccf, B:537:0x0cb3, B:534:0x0c96, B:527:0x0c70, B:490:0x0b7e, B:483:0x0b45] A[DONT_GENERATE, DONT_INLINE]
      0x0d3d: PHI (r4v143 com.google.android.gms.internal.firebase-auth-api.zzajd) = 
      (r4v120 com.google.android.gms.internal.firebase-auth-api.zzajd)
      (r4v121 com.google.android.gms.internal.firebase-auth-api.zzajd)
      (r4v122 com.google.android.gms.internal.firebase-auth-api.zzajd)
      (r4v123 com.google.android.gms.internal.firebase-auth-api.zzajd)
      (r4v124 com.google.android.gms.internal.firebase-auth-api.zzajd)
      (r4v125 com.google.android.gms.internal.firebase-auth-api.zzajd)
      (r4v126 com.google.android.gms.internal.firebase-auth-api.zzajd)
      (r4v135 com.google.android.gms.internal.firebase-auth-api.zzajd)
      (r4v144 com.google.android.gms.internal.firebase-auth-api.zzajd)
     binds: [B:549:0x0d26, B:546:0x0d06, B:543:0x0cea, B:540:0x0ccf, B:537:0x0cb3, B:534:0x0c96, B:527:0x0c70, B:490:0x0b7e, B:483:0x0b45] A[DONT_GENERATE, DONT_INLINE]
      0x0d3d: PHI (r10v86 int) = 
      (r10v67 int)
      (r10v68 int)
      (r10v69 int)
      (r10v70 int)
      (r10v71 int)
      (r10v72 int)
      (r10v73 int)
      (r10v80 int)
      (r10v87 int)
     binds: [B:549:0x0d26, B:546:0x0d06, B:543:0x0cea, B:540:0x0ccf, B:537:0x0cb3, B:534:0x0c96, B:527:0x0c70, B:490:0x0b7e, B:483:0x0b45] A[DONT_GENERATE, DONT_INLINE]
      0x0d3d: PHI (r18v42 int) = 
      (r18v27 int)
      (r18v28 int)
      (r18v29 int)
      (r18v30 int)
      (r18v31 int)
      (r18v32 int)
      (r18v33 int)
      (r18v38 int)
      (r18v43 int)
     binds: [B:549:0x0d26, B:546:0x0d06, B:543:0x0cea, B:540:0x0ccf, B:537:0x0cb3, B:534:0x0c96, B:527:0x0c70, B:490:0x0b7e, B:483:0x0b45] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:632:0x0ae7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:635:0x0db8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:680:0x0ada A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:681:0x0d42 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public final int k(Object obj, byte[] bArr, int i11, int i12, int i13, zzajd zzajdVar) {
        int i14;
        int i15;
        int i16;
        int iJ;
        int iK;
        zzajd zzajdVar2;
        int i17;
        zzakj zzakjVar;
        int i18;
        Unsafe unsafe;
        byte[] bArr2;
        int i19;
        zzajd zzajdVar3;
        int i21;
        int i22;
        byte[] bArr3;
        int i23;
        int i24;
        Object obj2;
        byte[] bArr4;
        zzajd zzajdVar4;
        int iJ2;
        int i25;
        Unsafe unsafe2;
        int i26;
        int i27;
        zzajd zzajdVar5;
        int i28;
        int i29;
        int i30;
        int iK2;
        int i31;
        int iB;
        int i32;
        zzajd zzajdVar6;
        int i33;
        int i34;
        int i35;
        zzajd zzajdVar7;
        int i36;
        int i37;
        int i38;
        int i39;
        int i40;
        int iK3;
        byte[] bArr5;
        int i41;
        zzalb zzalbVar;
        int iB2;
        int i42;
        byte[] bArr6;
        int i43;
        int i44;
        int i45;
        int i46;
        int iG;
        zzamc<T> zzamcVar = this;
        Object obj3 = obj;
        byte[] bArr7 = bArr;
        i12 = i12;
        zzajd zzajdVar8 = zzajdVar;
        J(obj3);
        Unsafe unsafe3 = f10161q;
        int iG2 = i11;
        int i47 = -1;
        int i48 = 0;
        int i49 = 1048575;
        int i50 = 0;
        int i51 = 0;
        while (true) {
            if (iG2 < i12) {
                int iD = iG2 + 1;
                int i52 = bArr7[iG2];
                if (i52 < 0) {
                    iD = zzaja.d(i52, bArr7, iD, zzajdVar8);
                    i52 = zzajdVar8.f10061a;
                }
                int i53 = iD;
                i51 = i52;
                int i54 = (i51 == true ? 1 : 0) >>> 3;
                boolean z11 = (i51 == true ? 1 : 0) & 7;
                int i55 = zzamcVar.f10165d;
                int i56 = zzamcVar.f10164c;
                int i57 = i53;
                if (i54 > i47) {
                    iJ = (i54 < i56 || i54 > i55) ? -1 : zzamcVar.j(i54, i48 / 3);
                    i16 = 0;
                } else if (i54 < i56 || i54 > i55) {
                    i16 = 0;
                    iJ = -1;
                } else {
                    i16 = 0;
                    iJ = zzamcVar.j(i54, 0);
                }
                if (iJ != -1) {
                    int[] iArr = zzamcVar.f10162a;
                    int i58 = iArr[iJ + 1];
                    int i59 = (i58 & 267386880) >>> 20;
                    long j11 = i58 & 1048575;
                    if (i59 <= 17) {
                        int i60 = iArr[iJ + 2];
                        int i61 = 1 << (i60 >>> 20);
                        int i62 = i60 & 1048575;
                        if (i62 != i49) {
                            int i63 = 1048575;
                            if (i49 != 1048575) {
                                unsafe3.putInt(obj3, i49, i50);
                                i63 = 1048575;
                            }
                            i49 = i62;
                            i18 = i62 == i63 ? 0 : unsafe3.getInt(obj3, i62);
                        } else {
                            i18 = i50;
                            i49 = i49;
                        }
                        switch (i59) {
                            case 0:
                                i57 = i57;
                                zzajdVar = zzajdVar;
                                unsafe3 = unsafe3;
                                iJ = iJ;
                                i54 = i54;
                                bArr3 = bArr;
                                if (z11 != 1) {
                                    obj3 = obj3;
                                    i47 = i54;
                                    zzajdVar2 = zzajdVar;
                                    iK = i57;
                                    unsafe3 = unsafe3;
                                    i49 = i49;
                                    i17 = i51 == true ? 1 : 0;
                                    i48 = iJ;
                                    i50 = i18;
                                    i13 = i13;
                                    obj3 = obj3;
                                } else {
                                    zzank.f10225c.d(obj3, j11, Double.longBitsToDouble(zzaja.l(bArr3, i57)));
                                    iG2 = i57 + 8;
                                    obj3 = obj3;
                                    unsafe3 = unsafe3;
                                    i49 = i49;
                                    i50 = i18 | i61;
                                    zzajdVar8 = zzajdVar;
                                    bArr7 = bArr3;
                                    i48 = iJ;
                                    i47 = i54;
                                }
                                break;
                            case 1:
                                i57 = i57;
                                zzajdVar = zzajdVar;
                                unsafe3 = unsafe3;
                                iJ = iJ;
                                i54 = i54;
                                bArr3 = bArr;
                                if (z11 != 5) {
                                    obj3 = obj3;
                                    i47 = i54;
                                    zzajdVar2 = zzajdVar;
                                    iK = i57;
                                    unsafe3 = unsafe3;
                                    i49 = i49;
                                    i17 = i51 == true ? 1 : 0;
                                    i48 = iJ;
                                    i50 = i18;
                                    i13 = i13;
                                    obj3 = obj3;
                                } else {
                                    zzank.f10225c.e(obj3, j11, Float.intBitsToFloat(zzaja.i(bArr3, i57)));
                                    iG2 = i57 + 4;
                                    int i64 = i49;
                                    i50 = i18 | i61;
                                    unsafe3 = unsafe3;
                                    i49 = i64;
                                    zzajdVar8 = zzajdVar;
                                    bArr7 = bArr3;
                                    i48 = iJ;
                                    i47 = i54;
                                }
                                break;
                            case 2:
                            case 3:
                                i57 = i57;
                                zzajdVar = zzajdVar;
                                iJ = iJ;
                                i54 = i54;
                                bArr3 = bArr;
                                if (z11 != 0) {
                                    unsafe3 = unsafe3;
                                    obj3 = obj3;
                                    i47 = i54;
                                    zzajdVar2 = zzajdVar;
                                    iK = i57;
                                    unsafe3 = unsafe3;
                                    i49 = i49;
                                    i17 = i51 == true ? 1 : 0;
                                    i48 = iJ;
                                    i50 = i18;
                                    i13 = i13;
                                    obj3 = obj3;
                                } else {
                                    int iK4 = zzaja.k(bArr3, i57, zzajdVar);
                                    unsafe3.putLong(obj3, j11, zzajdVar.f10062b);
                                    int i65 = i49;
                                    i50 = i18 | i61;
                                    unsafe3 = unsafe3;
                                    i49 = i65;
                                    zzajdVar8 = zzajdVar;
                                    iG2 = iK4;
                                    bArr7 = bArr3;
                                    i48 = iJ;
                                    i47 = i54;
                                }
                                break;
                            case 4:
                            case 11:
                                i57 = i57;
                                zzajdVar = zzajdVar;
                                iJ = iJ;
                                i54 = i54;
                                bArr3 = bArr;
                                if (z11 != 0) {
                                    unsafe3 = unsafe3;
                                    obj3 = obj3;
                                    i47 = i54;
                                    zzajdVar2 = zzajdVar;
                                    iK = i57;
                                    unsafe3 = unsafe3;
                                    i49 = i49;
                                    i17 = i51 == true ? 1 : 0;
                                    i48 = iJ;
                                    i50 = i18;
                                    i13 = i13;
                                    obj3 = obj3;
                                } else {
                                    int iJ3 = zzaja.j(bArr3, i57, zzajdVar);
                                    unsafe3.putInt(obj3, j11, zzajdVar.f10061a);
                                    i23 = i18 | i61;
                                    iG2 = iJ3;
                                    zzajdVar8 = zzajdVar;
                                    i48 = iJ;
                                    i47 = i54;
                                    i50 = i23;
                                    bArr7 = bArr3;
                                }
                                break;
                            case 5:
                            case 14:
                                unsafe3 = unsafe3;
                                Object obj4 = obj3;
                                iJ = iJ;
                                i54 = i54;
                                if (z11 != 1) {
                                    zzajdVar = zzajdVar;
                                    obj3 = obj4;
                                    bArr3 = bArr;
                                    i57 = i57;
                                    obj3 = obj3;
                                    i47 = i54;
                                    zzajdVar2 = zzajdVar;
                                    iK = i57;
                                    unsafe3 = unsafe3;
                                    i49 = i49;
                                    i17 = i51 == true ? 1 : 0;
                                    i48 = iJ;
                                    i50 = i18;
                                    i13 = i13;
                                    obj3 = obj3;
                                } else {
                                    obj3 = obj4;
                                    bArr3 = bArr;
                                    unsafe3 = unsafe3;
                                    unsafe3.putLong(obj3, j11, zzaja.l(bArr, i57));
                                    iG2 = i57 + 8;
                                    i23 = i18 | i61;
                                    zzajdVar8 = zzajdVar;
                                    i48 = iJ;
                                    i47 = i54;
                                    i50 = i23;
                                    bArr7 = bArr3;
                                }
                                break;
                            case 6:
                            case 13:
                                i24 = i57;
                                unsafe3 = unsafe3;
                                obj2 = obj3;
                                iJ = iJ;
                                i54 = i54;
                                bArr4 = bArr;
                                zzajdVar4 = zzajdVar;
                                if (z11 != 5) {
                                    bArr3 = bArr4;
                                    i57 = i24;
                                    obj3 = obj2;
                                    zzajdVar = zzajdVar4;
                                    i47 = i54;
                                    zzajdVar2 = zzajdVar;
                                    iK = i57;
                                    unsafe3 = unsafe3;
                                    i49 = i49;
                                    i17 = i51 == true ? 1 : 0;
                                    i48 = iJ;
                                    i50 = i18;
                                    i13 = i13;
                                    obj3 = obj3;
                                } else {
                                    unsafe3.putInt(obj2, j11, zzaja.i(bArr4, i24));
                                    iG2 = i24 + 4;
                                    bArr7 = bArr4;
                                    unsafe3 = unsafe3;
                                    i49 = i49;
                                    i50 = i18 | i61;
                                    i12 = i12;
                                    zzajdVar8 = zzajdVar4;
                                    obj3 = obj2;
                                    i48 = iJ;
                                    i47 = i54;
                                }
                                break;
                            case 7:
                                i24 = i57;
                                unsafe3 = unsafe3;
                                obj2 = obj3;
                                iJ = iJ;
                                i54 = i54;
                                bArr4 = bArr;
                                zzajdVar4 = zzajdVar;
                                if (z11 != 0) {
                                    bArr3 = bArr4;
                                    i57 = i24;
                                    obj3 = obj2;
                                    zzajdVar = zzajdVar4;
                                    i47 = i54;
                                    zzajdVar2 = zzajdVar;
                                    iK = i57;
                                    unsafe3 = unsafe3;
                                    i49 = i49;
                                    i17 = i51 == true ? 1 : 0;
                                    i48 = iJ;
                                    i50 = i18;
                                    i13 = i13;
                                    obj3 = obj3;
                                } else {
                                    iG2 = zzaja.k(bArr4, i24, zzajdVar4);
                                    zzank.f10225c.g(obj2, j11, zzajdVar4.f10062b != 0);
                                    bArr7 = bArr4;
                                    unsafe3 = unsafe3;
                                    i49 = i49;
                                    i50 = i18 | i61;
                                    i12 = i12;
                                    zzajdVar8 = zzajdVar4;
                                    obj3 = obj2;
                                    i48 = iJ;
                                    i47 = i54;
                                }
                                break;
                            case 8:
                                i24 = i57;
                                unsafe3 = unsafe3;
                                obj2 = obj3;
                                iJ = iJ;
                                i54 = i54;
                                bArr4 = bArr;
                                zzajdVar4 = zzajdVar;
                                if (z11 != 2) {
                                    bArr3 = bArr4;
                                    i57 = i24;
                                    obj3 = obj2;
                                    zzajdVar = zzajdVar4;
                                    i47 = i54;
                                    zzajdVar2 = zzajdVar;
                                    iK = i57;
                                    unsafe3 = unsafe3;
                                    i49 = i49;
                                    i17 = i51 == true ? 1 : 0;
                                    i48 = iJ;
                                    i50 = i18;
                                    i13 = i13;
                                    obj3 = obj3;
                                } else {
                                    if ((i58 & 536870912) != 0) {
                                        iJ2 = zzaja.j(bArr4, i24, zzajdVar4);
                                        i25 = zzajdVar4.f10061a;
                                        if (i25 < 0) {
                                            throw zzale.e();
                                        }
                                        if (i25 == 0) {
                                            zzajdVar4.f10063c = BuildConfig.VERSION_NAME;
                                        } else {
                                            zzajdVar4.f10063c = zzanl.c(bArr4, iJ2, i25);
                                            iJ2 += i25;
                                        }
                                    } else {
                                        iJ2 = zzaja.j(bArr4, i24, zzajdVar4);
                                        i25 = zzajdVar4.f10061a;
                                        if (i25 < 0) {
                                            throw zzale.e();
                                        }
                                        if (i25 == 0) {
                                            zzajdVar4.f10063c = BuildConfig.VERSION_NAME;
                                        } else {
                                            zzajdVar4.f10063c = new String(bArr4, iJ2, i25, StandardCharsets.UTF_8);
                                            iJ2 += i25;
                                        }
                                    }
                                    iG2 = iJ2;
                                    unsafe3.putObject(obj2, j11, zzajdVar4.f10063c);
                                    bArr7 = bArr4;
                                    unsafe3 = unsafe3;
                                    i49 = i49;
                                    i50 = i18 | i61;
                                    i12 = i12;
                                    zzajdVar8 = zzajdVar4;
                                    obj3 = obj2;
                                    i48 = iJ;
                                    i47 = i54;
                                }
                                break;
                            case 9:
                                Object obj5 = obj3;
                                Unsafe unsafe4 = unsafe3;
                                int i66 = iJ;
                                if (z11 != 2) {
                                    obj2 = obj5;
                                    unsafe3 = unsafe4;
                                    zzajdVar4 = zzajdVar;
                                    i57 = i57;
                                    i54 = i54;
                                    iJ = i66;
                                    bArr3 = bArr;
                                    obj3 = obj2;
                                    zzajdVar = zzajdVar4;
                                    i47 = i54;
                                    zzajdVar2 = zzajdVar;
                                    iK = i57;
                                    unsafe3 = unsafe3;
                                    i49 = i49;
                                    i17 = i51 == true ? 1 : 0;
                                    i48 = iJ;
                                    i50 = i18;
                                    i13 = i13;
                                    obj3 = obj3;
                                } else {
                                    Object objN = zzamcVar.n(i66, obj5);
                                    zzajdVar8 = zzajdVar;
                                    iG2 = zzaja.f(objN, zzamcVar.H(i66), bArr, i57, i12, zzajdVar8);
                                    zzamcVar.t(obj5, i66, objN);
                                    bArr7 = bArr;
                                    unsafe3 = unsafe4;
                                    i49 = i49;
                                    i50 = i18 | i61;
                                    i12 = i12;
                                    obj3 = obj5;
                                    i47 = i54;
                                    i48 = i66;
                                }
                                break;
                            case 10:
                                Object obj6 = obj3;
                                unsafe = unsafe3;
                                obj3 = obj6;
                                bArr2 = bArr;
                                i19 = i57;
                                zzajdVar3 = zzajdVar;
                                i21 = iJ;
                                if (z11 != 2) {
                                    i57 = i19;
                                    i54 = i54;
                                    iJ = i21;
                                    bArr3 = bArr2;
                                    zzajdVar = zzajdVar3;
                                    unsafe3 = unsafe;
                                    i47 = i54;
                                    zzajdVar2 = zzajdVar;
                                    iK = i57;
                                    unsafe3 = unsafe3;
                                    i49 = i49;
                                    i17 = i51 == true ? 1 : 0;
                                    i48 = iJ;
                                    i50 = i18;
                                    i13 = i13;
                                    obj3 = obj3;
                                } else {
                                    iG2 = zzaja.g(bArr2, i19, zzajdVar3);
                                    unsafe.putObject(obj3, j11, zzajdVar3.f10063c);
                                    i22 = i18 | i61;
                                    Unsafe unsafe5 = unsafe;
                                    obj3 = obj3;
                                    unsafe3 = unsafe5;
                                    zzajdVar8 = zzajdVar3;
                                    i48 = i21;
                                    i49 = i49;
                                    i50 = i22;
                                    bArr7 = bArr2;
                                    i47 = i54;
                                }
                                break;
                            case 12:
                                Object obj7 = obj3;
                                unsafe = unsafe3;
                                obj3 = obj7;
                                bArr2 = bArr;
                                i19 = i57;
                                zzajdVar3 = zzajdVar;
                                i21 = iJ;
                                if (z11 != 0) {
                                    i57 = i19;
                                    i54 = i54;
                                    iJ = i21;
                                    bArr3 = bArr2;
                                    zzajdVar = zzajdVar3;
                                    unsafe3 = unsafe;
                                    i47 = i54;
                                    zzajdVar2 = zzajdVar;
                                    iK = i57;
                                    unsafe3 = unsafe3;
                                    i49 = i49;
                                    i17 = i51 == true ? 1 : 0;
                                    i48 = iJ;
                                    i50 = i18;
                                    i13 = i13;
                                    obj3 = obj3;
                                } else {
                                    int iJ4 = zzaja.j(bArr2, i19, zzajdVar3);
                                    int i67 = zzajdVar3.f10061a;
                                    zzaky zzakyVarG = zzamcVar.G(i21);
                                    if ((i58 & Integer.MIN_VALUE) == 0 || zzakyVarG == null || zzakyVarG.zza()) {
                                        unsafe.putInt(obj3, j11, i67);
                                        i22 = i18 | i61;
                                        obj3 = obj3;
                                        unsafe3 = unsafe;
                                        iG2 = iJ4;
                                        zzajdVar8 = zzajdVar3;
                                        i48 = i21;
                                        i49 = i49;
                                        i50 = i22;
                                        bArr7 = bArr2;
                                        i47 = i54;
                                    } else {
                                        B(obj3).c(i51 == true ? 1 : 0, Long.valueOf(i67));
                                        obj3 = obj3;
                                        unsafe3 = unsafe;
                                        iG2 = iJ4;
                                        i12 = i12;
                                        bArr7 = bArr2;
                                        zzajdVar8 = zzajdVar3;
                                        i47 = i54;
                                        i48 = i21;
                                        i49 = i49;
                                        i50 = i18;
                                    }
                                }
                                break;
                            case 15:
                                Object obj8 = obj3;
                                unsafe = unsafe3;
                                obj3 = obj8;
                                bArr2 = bArr;
                                i19 = i57;
                                zzajdVar3 = zzajdVar;
                                i21 = iJ;
                                if (z11 != 0) {
                                    i57 = i19;
                                    i54 = i54;
                                    iJ = i21;
                                    bArr3 = bArr2;
                                    zzajdVar = zzajdVar3;
                                    unsafe3 = unsafe;
                                    i47 = i54;
                                    zzajdVar2 = zzajdVar;
                                    iK = i57;
                                    unsafe3 = unsafe3;
                                    i49 = i49;
                                    i17 = i51 == true ? 1 : 0;
                                    i48 = iJ;
                                    i50 = i18;
                                    i13 = i13;
                                    obj3 = obj3;
                                } else {
                                    iG2 = zzaja.j(bArr2, i19, zzajdVar3);
                                    unsafe.putInt(obj3, j11, zzajq.b(zzajdVar3.f10061a));
                                    i22 = i18 | i61;
                                    Unsafe unsafe6 = unsafe;
                                    obj3 = obj3;
                                    unsafe3 = unsafe6;
                                    zzajdVar8 = zzajdVar3;
                                    i48 = i21;
                                    i49 = i49;
                                    i50 = i22;
                                    bArr7 = bArr2;
                                    i47 = i54;
                                }
                                break;
                            case 16:
                                bArr2 = bArr;
                                i19 = i57;
                                zzajdVar3 = zzajdVar;
                                i21 = iJ;
                                if (z11 != 0) {
                                    Object obj9 = obj3;
                                    unsafe = unsafe3;
                                    obj3 = obj9;
                                    i57 = i19;
                                    i54 = i54;
                                    iJ = i21;
                                    bArr3 = bArr2;
                                    zzajdVar = zzajdVar3;
                                    unsafe3 = unsafe;
                                    i47 = i54;
                                    zzajdVar2 = zzajdVar;
                                    iK = i57;
                                    unsafe3 = unsafe3;
                                    i49 = i49;
                                    i17 = i51 == true ? 1 : 0;
                                    i48 = iJ;
                                    i50 = i18;
                                    i13 = i13;
                                    obj3 = obj3;
                                } else {
                                    int iK5 = zzaja.k(bArr2, i19, zzajdVar3);
                                    unsafe3.putLong(obj3, j11, zzajq.c(zzajdVar3.f10062b));
                                    i22 = i18 | i61;
                                    obj3 = obj3;
                                    unsafe3 = unsafe3;
                                    iG2 = iK5;
                                    zzajdVar8 = zzajdVar3;
                                    i48 = i21;
                                    i49 = i49;
                                    i50 = i22;
                                    bArr7 = bArr2;
                                    i47 = i54;
                                }
                                break;
                            case 17:
                                if (z11 != 3) {
                                    bArr3 = bArr;
                                    i47 = i54;
                                    zzajdVar2 = zzajdVar;
                                    iK = i57;
                                    unsafe3 = unsafe3;
                                    i49 = i49;
                                    i17 = i51 == true ? 1 : 0;
                                    i48 = iJ;
                                    i50 = i18;
                                    i13 = i13;
                                    obj3 = obj3;
                                } else {
                                    Object objN2 = zzamcVar.n(iJ, obj3);
                                    zzajdVar3 = zzajdVar;
                                    i21 = iJ;
                                    iG2 = zzaja.e(objN2, zzamcVar.H(iJ), bArr, i57, i12, (i54 << 3) | 4, zzajdVar3);
                                    bArr2 = bArr;
                                    zzamcVar.t(obj3, i21, objN2);
                                    i22 = i18 | i61;
                                    zzajdVar8 = zzajdVar3;
                                    i48 = i21;
                                    i49 = i49;
                                    i50 = i22;
                                    bArr7 = bArr2;
                                    i47 = i54;
                                }
                                break;
                            default:
                                bArr3 = bArr;
                                i47 = i54;
                                zzajdVar2 = zzajdVar;
                                iK = i57;
                                unsafe3 = unsafe3;
                                i49 = i49;
                                i17 = i51 == true ? 1 : 0;
                                i48 = iJ;
                                i50 = i18;
                                i13 = i13;
                                obj3 = obj3;
                                break;
                        }
                    } else {
                        Object obj10 = obj3;
                        Unsafe unsafe7 = unsafe3;
                        int i68 = i54;
                        i49 = i49;
                        if (i59 != 27) {
                            obj3 = obj10;
                            unsafe2 = unsafe7;
                            int i69 = iJ;
                            if (i59 <= 49) {
                                long j12 = i58;
                                Unsafe unsafe8 = f10161q;
                                zzalb zzalbVarZza = (zzalb) unsafe8.getObject(obj3, j11);
                                if (!zzalbVarZza.zzc()) {
                                    zzalbVarZza = zzalbVarZza.zza(zzalbVarZza.size() << 1);
                                    unsafe8.putObject(obj3, j11, zzalbVarZza);
                                }
                                zzalb zzalbVar2 = zzalbVarZza;
                                switch (i59) {
                                    case 18:
                                    case 35:
                                        zzajdVar5 = zzajdVar;
                                        i28 = i69;
                                        i29 = i57;
                                        i17 = r1;
                                        bArr = bArr;
                                        i30 = i12;
                                        if (z11 == 2) {
                                            zzakh zzakhVar = (zzakh) zzalbVar2;
                                            int iJ5 = zzaja.j(bArr, i29, zzajdVar5);
                                            int i70 = zzajdVar5.f10061a;
                                            int i71 = iJ5 + i70;
                                            if (i71 > bArr.length) {
                                                throw zzale.g();
                                            }
                                            int i72 = (i70 / 8) + zzakhVar.f10114c;
                                            double[] dArr = zzakhVar.f10113b;
                                            if (i72 <= dArr.length) {
                                                i31 = iJ5;
                                            } else if (dArr.length == 0) {
                                                zzakhVar.f10113b = new double[Math.max(i72, 10)];
                                                i31 = iJ5;
                                            } else {
                                                int length = dArr.length;
                                                while (length < i72) {
                                                    length = e0.c(length, 3, 2, 1, 10);
                                                    iJ5 = iJ5;
                                                    i72 = i72;
                                                }
                                                i31 = iJ5;
                                                zzakhVar.f10113b = Arrays.copyOf(zzakhVar.f10113b, length);
                                            }
                                            iB = i31;
                                            while (iB < i71) {
                                                zzakhVar.b(Double.longBitsToDouble(zzaja.l(bArr, iB)));
                                                iB += 8;
                                            }
                                            if (iB != i71) {
                                                throw zzale.g();
                                            }
                                            iK2 = iB;
                                        } else if (z11 == 1) {
                                            zzakh zzakhVar2 = (zzakh) zzalbVar2;
                                            zzakhVar2.b(Double.longBitsToDouble(zzaja.l(bArr, i29)));
                                            iK2 = i29 + 8;
                                            while (iK2 < i30) {
                                                int iJ6 = zzaja.j(bArr, iK2, zzajdVar5);
                                                if (i17 == zzajdVar5.f10061a) {
                                                    zzakhVar2.b(Double.longBitsToDouble(zzaja.l(bArr, iJ6)));
                                                    iK2 = iJ6 + 8;
                                                }
                                            }
                                        } else {
                                            iK2 = i29;
                                        }
                                        if (iK2 == i29) {
                                            i47 = i68;
                                            zzajdVar8 = zzajdVar5;
                                            i12 = i30;
                                            unsafe3 = unsafe2;
                                            i48 = i28;
                                            iG2 = iK2;
                                            i51 = i17 == true ? 1 : 0;
                                            i49 = i49;
                                            bArr7 = bArr;
                                            obj3 = obj3;
                                        } else {
                                            i47 = i68;
                                            zzajdVar2 = zzajdVar5;
                                            iK = iK2;
                                            unsafe3 = unsafe2;
                                            i48 = i28;
                                        }
                                        break;
                                    case 19:
                                    case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                                        zzajdVar5 = zzajdVar;
                                        i28 = i69;
                                        i29 = i57;
                                        i17 = r1;
                                        bArr = bArr;
                                        i30 = i12;
                                        if (z11 == 2) {
                                            zzaks zzaksVar = (zzaks) zzalbVar2;
                                            int iJ7 = zzaja.j(bArr, i29, zzajdVar5);
                                            int i73 = zzajdVar5.f10061a;
                                            int i74 = iJ7 + i73;
                                            if (i74 > bArr.length) {
                                                throw zzale.g();
                                            }
                                            int i75 = (i73 / 4) + zzaksVar.f10129c;
                                            float[] fArr = zzaksVar.f10128b;
                                            if (i75 <= fArr.length) {
                                                i32 = iJ7;
                                            } else if (fArr.length == 0) {
                                                zzaksVar.f10128b = new float[Math.max(i75, 10)];
                                                i32 = iJ7;
                                            } else {
                                                int i76 = 10;
                                                int length2 = fArr.length;
                                                while (length2 < i75) {
                                                    length2 = e0.c(length2, 3, 2, 1, i76);
                                                    iJ7 = iJ7;
                                                    i75 = i75;
                                                    i76 = 10;
                                                }
                                                i32 = iJ7;
                                                zzaksVar.f10128b = Arrays.copyOf(zzaksVar.f10128b, length2);
                                            }
                                            iB = i32;
                                            while (iB < i74) {
                                                zzaksVar.b(Float.intBitsToFloat(zzaja.i(bArr, iB)));
                                                iB += 4;
                                            }
                                            if (iB != i74) {
                                                throw zzale.g();
                                            }
                                            iK2 = iB;
                                        } else if (z11 == 5) {
                                            zzaks zzaksVar2 = (zzaks) zzalbVar2;
                                            zzaksVar2.b(Float.intBitsToFloat(zzaja.i(bArr, i29)));
                                            iK2 = i29 + 4;
                                            while (iK2 < i30) {
                                                int iJ8 = zzaja.j(bArr, iK2, zzajdVar5);
                                                if (i17 == zzajdVar5.f10061a) {
                                                    zzaksVar2.b(Float.intBitsToFloat(zzaja.i(bArr, iJ8)));
                                                    iK2 = iJ8 + 4;
                                                }
                                            }
                                        } else {
                                            iK2 = i29;
                                        }
                                        if (iK2 == i29) {
                                            i47 = i68;
                                            zzajdVar8 = zzajdVar5;
                                            i12 = i30;
                                            unsafe3 = unsafe2;
                                            i48 = i28;
                                            iG2 = iK2;
                                            i51 = i17 == true ? 1 : 0;
                                            i49 = i49;
                                            bArr7 = bArr;
                                            obj3 = obj3;
                                        } else {
                                            i47 = i68;
                                            zzajdVar2 = zzajdVar5;
                                            iK = iK2;
                                            unsafe3 = unsafe2;
                                            i48 = i28;
                                        }
                                        break;
                                    case 20:
                                    case 21:
                                    case 37:
                                    case 38:
                                        zzajdVar5 = zzajdVar;
                                        i28 = i69;
                                        i29 = i57;
                                        i17 = r1;
                                        bArr = bArr;
                                        i30 = i12;
                                        if (z11 == 2) {
                                            zzaln zzalnVar = (zzaln) zzalbVar2;
                                            iK2 = zzaja.j(bArr, i29, zzajdVar5);
                                            int i77 = zzajdVar5.f10061a + iK2;
                                            while (iK2 < i77) {
                                                iK2 = zzaja.k(bArr, iK2, zzajdVar5);
                                                zzalnVar.b(zzajdVar5.f10062b);
                                            }
                                            if (iK2 != i77) {
                                                throw zzale.g();
                                            }
                                        } else if (z11 == 0) {
                                            zzaln zzalnVar2 = (zzaln) zzalbVar2;
                                            iK2 = zzaja.k(bArr, i29, zzajdVar5);
                                            zzalnVar2.b(zzajdVar5.f10062b);
                                            while (iK2 < i30) {
                                                int iJ9 = zzaja.j(bArr, iK2, zzajdVar5);
                                                if (i17 == zzajdVar5.f10061a) {
                                                    iK2 = zzaja.k(bArr, iJ9, zzajdVar5);
                                                    zzalnVar2.b(zzajdVar5.f10062b);
                                                }
                                            }
                                        } else {
                                            iK2 = i29;
                                        }
                                        if (iK2 == i29) {
                                            i47 = i68;
                                            zzajdVar8 = zzajdVar5;
                                            i12 = i30;
                                            unsafe3 = unsafe2;
                                            i48 = i28;
                                            iG2 = iK2;
                                            i51 = i17 == true ? 1 : 0;
                                            i49 = i49;
                                            bArr7 = bArr;
                                            obj3 = obj3;
                                        } else {
                                            i47 = i68;
                                            zzajdVar2 = zzajdVar5;
                                            iK = iK2;
                                            unsafe3 = unsafe2;
                                            i48 = i28;
                                        }
                                        break;
                                    case 22:
                                    case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
                                    case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                                    case 43:
                                        zzajdVar6 = zzajdVar;
                                        i28 = i69;
                                        i33 = i57;
                                        i34 = r1;
                                        bArr = bArr;
                                        i30 = i12;
                                        if (z11 != 2) {
                                            if (z11 == 0) {
                                                iB = zzaja.b(i34, bArr, i33, i30, zzalbVar2, zzajdVar6);
                                                i17 = i34;
                                                i29 = i33;
                                                zzajdVar5 = zzajdVar6;
                                                iK2 = iB;
                                                if (iK2 == i29) {
                                                    i47 = i68;
                                                    zzajdVar8 = zzajdVar5;
                                                    i12 = i30;
                                                    unsafe3 = unsafe2;
                                                    i48 = i28;
                                                    iG2 = iK2;
                                                    i51 = i17 == true ? 1 : 0;
                                                    i49 = i49;
                                                    bArr7 = bArr;
                                                    obj3 = obj3;
                                                } else {
                                                    i47 = i68;
                                                    zzajdVar2 = zzajdVar5;
                                                    iK = iK2;
                                                    unsafe3 = unsafe2;
                                                    i48 = i28;
                                                }
                                            }
                                            i29 = i33;
                                            zzajdVar5 = zzajdVar6;
                                            i17 = i34;
                                            iK2 = i29;
                                            if (iK2 == i29) {
                                                i47 = i68;
                                                zzajdVar8 = zzajdVar5;
                                                i12 = i30;
                                                unsafe3 = unsafe2;
                                                i48 = i28;
                                                iG2 = iK2;
                                                i51 = i17 == true ? 1 : 0;
                                                i49 = i49;
                                                bArr7 = bArr;
                                                obj3 = obj3;
                                            } else {
                                                i47 = i68;
                                                zzajdVar2 = zzajdVar5;
                                                iK = iK2;
                                                unsafe3 = unsafe2;
                                                i48 = i28;
                                            }
                                            break;
                                        } else {
                                            zzakx zzakxVar = (zzakx) zzalbVar2;
                                            iK2 = zzaja.j(bArr, i33, zzajdVar6);
                                            int i78 = zzajdVar6.f10061a + iK2;
                                            while (iK2 < i78) {
                                                iK2 = zzaja.j(bArr, iK2, zzajdVar6);
                                                zzakxVar.d(zzajdVar6.f10061a);
                                            }
                                            if (iK2 != i78) {
                                                throw zzale.g();
                                            }
                                            i29 = i33;
                                            zzajdVar5 = zzajdVar6;
                                            i17 = i34;
                                            if (iK2 == i29) {
                                                i47 = i68;
                                                zzajdVar8 = zzajdVar5;
                                                i12 = i30;
                                                unsafe3 = unsafe2;
                                                i48 = i28;
                                                iG2 = iK2;
                                                i51 = i17 == true ? 1 : 0;
                                                i49 = i49;
                                                bArr7 = bArr;
                                                obj3 = obj3;
                                            } else {
                                                i47 = i68;
                                                zzajdVar2 = zzajdVar5;
                                                iK = iK2;
                                                unsafe3 = unsafe2;
                                                i48 = i28;
                                            }
                                        }
                                        break;
                                    case 23:
                                    case Consts.SP /* 32 */:
                                    case DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                                    case 46:
                                        zzajdVar6 = zzajdVar;
                                        int i79 = i69;
                                        i33 = i57;
                                        i34 = r1;
                                        bArr = bArr;
                                        i30 = i12;
                                        if (z11 != 2) {
                                            i28 = i79;
                                            if (z11 == 1) {
                                                zzaln zzalnVar3 = (zzaln) zzalbVar2;
                                                zzalnVar3.b(zzaja.l(bArr, i33));
                                                iK2 = i33 + 8;
                                                while (iK2 < i30) {
                                                    int iJ10 = zzaja.j(bArr, iK2, zzajdVar6);
                                                    if (i34 == zzajdVar6.f10061a) {
                                                        zzalnVar3.b(zzaja.l(bArr, iJ10));
                                                        iK2 = iJ10 + 8;
                                                    } else {
                                                        i29 = i33;
                                                    }
                                                }
                                                i29 = i33;
                                            }
                                            i29 = i33;
                                            zzajdVar5 = zzajdVar6;
                                            i17 = i34;
                                            iK2 = i29;
                                            if (iK2 == i29) {
                                                i47 = i68;
                                                zzajdVar8 = zzajdVar5;
                                                i12 = i30;
                                                unsafe3 = unsafe2;
                                                i48 = i28;
                                                iG2 = iK2;
                                                i51 = i17 == true ? 1 : 0;
                                                i49 = i49;
                                                bArr7 = bArr;
                                                obj3 = obj3;
                                            } else {
                                                i47 = i68;
                                                zzajdVar2 = zzajdVar5;
                                                iK = iK2;
                                                unsafe3 = unsafe2;
                                                i48 = i28;
                                            }
                                        } else {
                                            zzaln zzalnVar4 = (zzaln) zzalbVar2;
                                            int iJ11 = zzaja.j(bArr, i33, zzajdVar6);
                                            int i80 = zzajdVar6.f10061a;
                                            int i81 = iJ11 + i80;
                                            if (i81 > bArr.length) {
                                                throw zzale.g();
                                            }
                                            int i82 = (i80 / 8) + zzalnVar4.f10151c;
                                            long[] jArr = zzalnVar4.f10150b;
                                            if (i82 <= jArr.length) {
                                                i35 = iJ11;
                                                i28 = i79;
                                            } else if (jArr.length == 0) {
                                                zzalnVar4.f10150b = new long[Math.max(i82, 10)];
                                                i35 = iJ11;
                                                i28 = i79;
                                            } else {
                                                int i83 = 10;
                                                int length3 = jArr.length;
                                                while (length3 < i82) {
                                                    length3 = e0.c(length3, 3, 2, 1, i83);
                                                    iJ11 = iJ11;
                                                    i82 = i82;
                                                    i79 = i79;
                                                    i83 = 10;
                                                }
                                                i35 = iJ11;
                                                i28 = i79;
                                                zzalnVar4.f10150b = Arrays.copyOf(zzalnVar4.f10150b, length3);
                                            }
                                            int i84 = i35;
                                            while (i84 < i81) {
                                                zzalnVar4.b(zzaja.l(bArr, i84));
                                                i84 += 8;
                                            }
                                            if (i84 != i81) {
                                                throw zzale.g();
                                            }
                                            i29 = i33;
                                            iK2 = i84;
                                        }
                                        zzajdVar5 = zzajdVar6;
                                        i17 = i34;
                                        if (iK2 == i29) {
                                            i47 = i68;
                                            zzajdVar8 = zzajdVar5;
                                            i12 = i30;
                                            unsafe3 = unsafe2;
                                            i48 = i28;
                                            iG2 = iK2;
                                            i51 = i17 == true ? 1 : 0;
                                            i49 = i49;
                                            bArr7 = bArr;
                                            obj3 = obj3;
                                        } else {
                                            i47 = i68;
                                            zzajdVar2 = zzajdVar5;
                                            iK = iK2;
                                            unsafe3 = unsafe2;
                                            i48 = i28;
                                        }
                                        break;
                                    case Service.METRICS_FIELD_NUMBER /* 24 */:
                                    case 31:
                                    case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                                    case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                        zzajdVar7 = zzajdVar;
                                        i36 = i69;
                                        int i85 = i57;
                                        i37 = r1;
                                        bArr = bArr;
                                        i30 = i12;
                                        if (z11 != 2) {
                                            i38 = i85;
                                            if (z11 != 5) {
                                                i29 = i38;
                                                zzajdVar5 = zzajdVar7;
                                                i17 = i37;
                                                i28 = i36;
                                                iK2 = i29;
                                                if (iK2 == i29) {
                                                    i47 = i68;
                                                    zzajdVar8 = zzajdVar5;
                                                    i12 = i30;
                                                    unsafe3 = unsafe2;
                                                    i48 = i28;
                                                    iG2 = iK2;
                                                    i51 = i17 == true ? 1 : 0;
                                                    i49 = i49;
                                                    bArr7 = bArr;
                                                    obj3 = obj3;
                                                } else {
                                                    i47 = i68;
                                                    zzajdVar2 = zzajdVar5;
                                                    iK = iK2;
                                                    unsafe3 = unsafe2;
                                                    i48 = i28;
                                                }
                                                break;
                                            } else {
                                                zzakx zzakxVar2 = (zzakx) zzalbVar2;
                                                zzakxVar2.d(zzaja.i(bArr, i38));
                                                iK2 = i38 + 4;
                                                while (iK2 < i30) {
                                                    int iJ12 = zzaja.j(bArr, iK2, zzajdVar7);
                                                    if (i37 == zzajdVar7.f10061a) {
                                                        zzakxVar2.d(zzaja.i(bArr, iJ12));
                                                        iK2 = iJ12 + 4;
                                                    }
                                                }
                                            }
                                        } else {
                                            zzakx zzakxVar3 = (zzakx) zzalbVar2;
                                            int iJ13 = zzaja.j(bArr, i85, zzajdVar7);
                                            int i86 = zzajdVar7.f10061a;
                                            int i87 = iJ13 + i86;
                                            if (i87 > bArr.length) {
                                                throw zzale.g();
                                            }
                                            int i88 = (i86 / 4) + zzakxVar3.f10137c;
                                            int[] iArr2 = zzakxVar3.f10136b;
                                            if (i88 <= iArr2.length) {
                                                i39 = iJ13;
                                                i38 = i85;
                                            } else if (iArr2.length == 0) {
                                                zzakxVar3.f10136b = new int[Math.max(i88, 10)];
                                                i39 = iJ13;
                                                i38 = i85;
                                            } else {
                                                int length4 = iArr2.length;
                                                while (length4 < i88) {
                                                    length4 = e0.c(length4, 3, 2, 1, 10);
                                                    iJ13 = iJ13;
                                                    i85 = i85;
                                                    i88 = i88;
                                                }
                                                i39 = iJ13;
                                                i38 = i85;
                                                zzakxVar3.f10136b = Arrays.copyOf(zzakxVar3.f10136b, length4);
                                            }
                                            iK2 = i39;
                                            while (iK2 < i87) {
                                                zzakxVar3.d(zzaja.i(bArr, iK2));
                                                iK2 += 4;
                                            }
                                            if (iK2 != i87) {
                                                throw zzale.g();
                                            }
                                        }
                                        i29 = i38;
                                        zzajdVar5 = zzajdVar7;
                                        i17 = i37;
                                        i28 = i36;
                                        if (iK2 == i29) {
                                            i47 = i68;
                                            zzajdVar8 = zzajdVar5;
                                            i12 = i30;
                                            unsafe3 = unsafe2;
                                            i48 = i28;
                                            iG2 = iK2;
                                            i51 = i17 == true ? 1 : 0;
                                            i49 = i49;
                                            bArr7 = bArr;
                                            obj3 = obj3;
                                        } else {
                                            i47 = i68;
                                            zzajdVar2 = zzajdVar5;
                                            iK = iK2;
                                            unsafe3 = unsafe2;
                                            i48 = i28;
                                        }
                                        break;
                                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                                    case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                                        zzajdVar7 = zzajdVar;
                                        i36 = i69;
                                        i40 = i57;
                                        i37 = r1;
                                        bArr = bArr;
                                        i30 = i12;
                                        if (z11 != 2) {
                                            if (z11 == 0) {
                                                zzajc zzajcVar = (zzajc) zzalbVar2;
                                                iK3 = zzaja.k(bArr, i40, zzajdVar7);
                                                zzajcVar.b(zzajdVar7.f10062b != 0);
                                                while (iK3 < i30) {
                                                    int iJ14 = zzaja.j(bArr, iK3, zzajdVar7);
                                                    if (i37 == zzajdVar7.f10061a) {
                                                        iK3 = zzaja.k(bArr, iJ14, zzajdVar7);
                                                        zzajcVar.b(zzajdVar7.f10062b != 0);
                                                    }
                                                }
                                            }
                                            i29 = i40;
                                            zzajdVar5 = zzajdVar7;
                                            i17 = i37;
                                            i28 = i36;
                                            iK2 = i29;
                                            if (iK2 == i29) {
                                                i47 = i68;
                                                zzajdVar8 = zzajdVar5;
                                                i12 = i30;
                                                unsafe3 = unsafe2;
                                                i48 = i28;
                                                iG2 = iK2;
                                                i51 = i17 == true ? 1 : 0;
                                                i49 = i49;
                                                bArr7 = bArr;
                                                obj3 = obj3;
                                            } else {
                                                i47 = i68;
                                                zzajdVar2 = zzajdVar5;
                                                iK = iK2;
                                                unsafe3 = unsafe2;
                                                i48 = i28;
                                            }
                                        } else {
                                            zzajc zzajcVar2 = (zzajc) zzalbVar2;
                                            iK3 = zzaja.j(bArr, i40, zzajdVar7);
                                            int i89 = zzajdVar7.f10061a + iK3;
                                            while (iK3 < i89) {
                                                iK3 = zzaja.k(bArr, iK3, zzajdVar7);
                                                zzajcVar2.b(zzajdVar7.f10062b != 0);
                                            }
                                            if (iK3 != i89) {
                                                throw zzale.g();
                                            }
                                        }
                                        i29 = i40;
                                        i17 = i37;
                                        i28 = i36;
                                        iK2 = iK3;
                                        zzajdVar5 = zzajdVar7;
                                        if (iK2 == i29) {
                                            i47 = i68;
                                            zzajdVar8 = zzajdVar5;
                                            i12 = i30;
                                            unsafe3 = unsafe2;
                                            i48 = i28;
                                            iG2 = iK2;
                                            i51 = i17 == true ? 1 : 0;
                                            i49 = i49;
                                            bArr7 = bArr;
                                            obj3 = obj3;
                                        } else {
                                            i47 = i68;
                                            zzajdVar2 = zzajdVar5;
                                            iK = iK2;
                                            unsafe3 = unsafe2;
                                            i48 = i28;
                                        }
                                        break;
                                    case Service.BILLING_FIELD_NUMBER /* 26 */:
                                        zzajdVar7 = zzajdVar;
                                        i36 = i69;
                                        i40 = i57;
                                        i37 = r1;
                                        bArr = bArr;
                                        i30 = i12;
                                        if (z11 == 2) {
                                            if ((j12 & 536870912) == 0) {
                                                iK3 = zzaja.j(bArr, i40, zzajdVar7);
                                                int i90 = zzajdVar7.f10061a;
                                                if (i90 < 0) {
                                                    throw zzale.e();
                                                }
                                                if (i90 == 0) {
                                                    zzalbVar2.add(BuildConfig.VERSION_NAME);
                                                } else {
                                                    zzalbVar2.add(new String(bArr, iK3, i90, StandardCharsets.UTF_8));
                                                    iK3 += i90;
                                                }
                                                while (iK3 < i30) {
                                                    int iJ15 = zzaja.j(bArr, iK3, zzajdVar7);
                                                    if (i37 == zzajdVar7.f10061a) {
                                                        iK3 = zzaja.j(bArr, iJ15, zzajdVar7);
                                                        int i91 = zzajdVar7.f10061a;
                                                        if (i91 < 0) {
                                                            throw zzale.e();
                                                        }
                                                        if (i91 == 0) {
                                                            zzalbVar2.add(BuildConfig.VERSION_NAME);
                                                        } else {
                                                            zzalbVar2.add(new String(bArr, iK3, i91, StandardCharsets.UTF_8));
                                                            iK3 += i91;
                                                        }
                                                    }
                                                }
                                            } else {
                                                iK3 = zzaja.j(bArr, i40, zzajdVar7);
                                                int i92 = zzajdVar7.f10061a;
                                                if (i92 < 0) {
                                                    throw zzale.e();
                                                }
                                                if (i92 == 0) {
                                                    zzalbVar2.add(BuildConfig.VERSION_NAME);
                                                } else {
                                                    int i93 = iK3 + i92;
                                                    if (!zzanl.d(bArr, iK3, i93)) {
                                                        throw zzale.c();
                                                    }
                                                    zzalbVar2.add(new String(bArr, iK3, i92, StandardCharsets.UTF_8));
                                                    iK3 = i93;
                                                }
                                                while (iK3 < i30) {
                                                    int iJ16 = zzaja.j(bArr, iK3, zzajdVar7);
                                                    if (i37 == zzajdVar7.f10061a) {
                                                        iK3 = zzaja.j(bArr, iJ16, zzajdVar7);
                                                        int i94 = zzajdVar7.f10061a;
                                                        if (i94 < 0) {
                                                            throw zzale.e();
                                                        }
                                                        if (i94 == 0) {
                                                            zzalbVar2.add(BuildConfig.VERSION_NAME);
                                                        } else {
                                                            int i95 = iK3 + i94;
                                                            if (!zzanl.d(bArr, iK3, i95)) {
                                                                throw zzale.c();
                                                            }
                                                            zzalbVar2.add(new String(bArr, iK3, i94, StandardCharsets.UTF_8));
                                                            iK3 = i95;
                                                        }
                                                    }
                                                }
                                            }
                                            i29 = i40;
                                            i17 = i37;
                                            i28 = i36;
                                            iK2 = iK3;
                                            zzajdVar5 = zzajdVar7;
                                            if (iK2 == i29) {
                                                i47 = i68;
                                                zzajdVar8 = zzajdVar5;
                                                i12 = i30;
                                                unsafe3 = unsafe2;
                                                i48 = i28;
                                                iG2 = iK2;
                                                i51 = i17 == true ? 1 : 0;
                                                i49 = i49;
                                                bArr7 = bArr;
                                                obj3 = obj3;
                                            } else {
                                                i47 = i68;
                                                zzajdVar2 = zzajdVar5;
                                                iK = iK2;
                                                unsafe3 = unsafe2;
                                                i48 = i28;
                                            }
                                        }
                                        i29 = i40;
                                        zzajdVar5 = zzajdVar7;
                                        i17 = i37;
                                        i28 = i36;
                                        iK2 = i29;
                                        if (iK2 == i29) {
                                            i47 = i68;
                                            zzajdVar8 = zzajdVar5;
                                            i12 = i30;
                                            unsafe3 = unsafe2;
                                            i48 = i28;
                                            iG2 = iK2;
                                            i51 = i17 == true ? 1 : 0;
                                            i49 = i49;
                                            bArr7 = bArr;
                                            obj3 = obj3;
                                        } else {
                                            i47 = i68;
                                            zzajdVar2 = zzajdVar5;
                                            iK = iK2;
                                            unsafe3 = unsafe2;
                                            i48 = i28;
                                        }
                                        break;
                                    case 27:
                                        i36 = i69;
                                        if (z11 != 2) {
                                            i30 = i12;
                                            bArr = bArr;
                                            obj3 = obj;
                                            i68 = i68;
                                            zzajdVar5 = zzajdVar;
                                            i17 = r1;
                                            i28 = i36;
                                            i29 = i57;
                                            iK2 = i29;
                                            if (iK2 == i29) {
                                                i47 = i68;
                                                zzajdVar8 = zzajdVar5;
                                                i12 = i30;
                                                unsafe3 = unsafe2;
                                                i48 = i28;
                                                iG2 = iK2;
                                                i51 = i17 == true ? 1 : 0;
                                                i49 = i49;
                                                bArr7 = bArr;
                                                obj3 = obj3;
                                            } else {
                                                i47 = i68;
                                                zzajdVar2 = zzajdVar5;
                                                iK = iK2;
                                                unsafe3 = unsafe2;
                                                i48 = i28;
                                            }
                                        } else {
                                            obj3 = obj;
                                            bArr = bArr;
                                            iK2 = zzaja.h(zzamcVar.H(i36), r1, bArr, i57, i12, zzalbVar2, zzajdVar);
                                            i29 = i57;
                                            i30 = i12;
                                            zzajdVar5 = zzajdVar;
                                            i17 = r1;
                                            i68 = i68;
                                            i28 = i36;
                                            if (iK2 == i29) {
                                                i47 = i68;
                                                zzajdVar8 = zzajdVar5;
                                                i12 = i30;
                                                unsafe3 = unsafe2;
                                                i48 = i28;
                                                iG2 = iK2;
                                                i51 = i17 == true ? 1 : 0;
                                                i49 = i49;
                                                bArr7 = bArr;
                                                obj3 = obj3;
                                            } else {
                                                i47 = i68;
                                                zzajdVar2 = zzajdVar5;
                                                iK = iK2;
                                                unsafe3 = unsafe2;
                                                i48 = i28;
                                            }
                                        }
                                        break;
                                    case Service.MONITORING_FIELD_NUMBER /* 28 */:
                                        if (z11 == 2) {
                                            int iJ17 = zzaja.j(bArr, i57, zzajdVar);
                                            int i96 = zzajdVar.f10061a;
                                            if (i96 < 0) {
                                                throw zzale.e();
                                            }
                                            if (i96 > bArr.length - iJ17) {
                                                throw zzale.g();
                                            }
                                            if (i96 == 0) {
                                                zzalbVar2.add(zzaje.f10066b);
                                            } else {
                                                zzalbVar2.add(zzaje.g(bArr, iJ17, i96));
                                                iJ17 += i96;
                                            }
                                            while (iJ17 < i12) {
                                                int iJ18 = zzaja.j(bArr, iJ17, zzajdVar);
                                                if (r1 == zzajdVar.f10061a) {
                                                    iJ17 = zzaja.j(bArr, iJ18, zzajdVar);
                                                    int i97 = zzajdVar.f10061a;
                                                    if (i97 < 0) {
                                                        throw zzale.e();
                                                    }
                                                    if (i97 > bArr.length - iJ17) {
                                                        throw zzale.g();
                                                    }
                                                    if (i97 == 0) {
                                                        zzalbVar2.add(zzaje.f10066b);
                                                    } else {
                                                        zzalbVar2.add(zzaje.g(bArr, iJ17, i97));
                                                        iJ17 += i97;
                                                    }
                                                } else {
                                                    iK2 = iJ17;
                                                    i68 = i68;
                                                    zzajdVar5 = zzajdVar;
                                                    i17 = r1;
                                                    bArr = bArr;
                                                    i28 = i69;
                                                    obj3 = obj;
                                                    i29 = i57;
                                                    i30 = i12;
                                                }
                                            }
                                            iK2 = iJ17;
                                            i68 = i68;
                                            zzajdVar5 = zzajdVar;
                                            i17 = r1;
                                            bArr = bArr;
                                            i28 = i69;
                                            obj3 = obj;
                                            i29 = i57;
                                            i30 = i12;
                                        } else {
                                            i68 = i68;
                                            zzajdVar5 = zzajdVar;
                                            i17 = r1;
                                            bArr = bArr;
                                            i28 = i69;
                                            obj3 = obj;
                                            i29 = i57;
                                            i30 = i12;
                                            iK2 = i29;
                                        }
                                        if (iK2 == i29) {
                                            i47 = i68;
                                            zzajdVar8 = zzajdVar5;
                                            i12 = i30;
                                            unsafe3 = unsafe2;
                                            i48 = i28;
                                            iG2 = iK2;
                                            i51 = i17 == true ? 1 : 0;
                                            i49 = i49;
                                            bArr7 = bArr;
                                            obj3 = obj3;
                                        } else {
                                            i47 = i68;
                                            zzajdVar2 = zzajdVar5;
                                            iK = iK2;
                                            unsafe3 = unsafe2;
                                            i48 = i28;
                                        }
                                        break;
                                    case 30:
                                    case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                                        bArr5 = bArr;
                                        i41 = i12;
                                        zzajdVar7 = zzajdVar;
                                        i36 = i69;
                                        i17 = r1;
                                        if (z11 != 2) {
                                            if (z11 == 0) {
                                                zzalbVar = zzalbVar2;
                                                iB2 = zzaja.b(i17 == true ? 1 : 0, bArr5, i57, i41, zzalbVar, zzajdVar7);
                                                i42 = i17 == true ? 1 : 0;
                                                bArr6 = bArr5;
                                                i43 = i57;
                                                i44 = i41;
                                            }
                                            obj3 = obj;
                                            bArr = bArr5;
                                            i29 = i57;
                                            i30 = i41;
                                            zzajdVar5 = zzajdVar7;
                                            i28 = i36;
                                            iK2 = i29;
                                            if (iK2 == i29) {
                                                i47 = i68;
                                                zzajdVar8 = zzajdVar5;
                                                i12 = i30;
                                                unsafe3 = unsafe2;
                                                i48 = i28;
                                                iG2 = iK2;
                                                i51 = i17 == true ? 1 : 0;
                                                i49 = i49;
                                                bArr7 = bArr;
                                                obj3 = obj3;
                                            } else {
                                                i47 = i68;
                                                zzajdVar2 = zzajdVar5;
                                                iK = iK2;
                                                unsafe3 = unsafe2;
                                                i48 = i28;
                                            }
                                        } else {
                                            zzakx zzakxVar4 = (zzakx) zzalbVar2;
                                            int iJ19 = zzaja.j(bArr5, i57, zzajdVar7);
                                            int i98 = zzajdVar7.f10061a + iJ19;
                                            while (iJ19 < i98) {
                                                iJ19 = zzaja.j(bArr5, iJ19, zzajdVar7);
                                                zzakxVar4.d(zzajdVar7.f10061a);
                                            }
                                            if (iJ19 != i98) {
                                                throw zzale.g();
                                            }
                                            i44 = i41;
                                            zzalbVar = zzalbVar2;
                                            iB2 = iJ19;
                                            bArr6 = bArr5;
                                            i43 = i57;
                                            i42 = i17 == true ? 1 : 0;
                                        }
                                        zzamq.a(obj, i68, zzalbVar, zzamcVar.G(i36), null, zzamcVar.m);
                                        iK2 = iB2;
                                        i30 = i44;
                                        zzajdVar5 = zzajdVar7;
                                        i17 = i42;
                                        bArr = bArr6;
                                        i28 = i36;
                                        i29 = i43;
                                        obj3 = obj;
                                        if (iK2 == i29) {
                                            i47 = i68;
                                            zzajdVar8 = zzajdVar5;
                                            i12 = i30;
                                            unsafe3 = unsafe2;
                                            i48 = i28;
                                            iG2 = iK2;
                                            i51 = i17 == true ? 1 : 0;
                                            i49 = i49;
                                            bArr7 = bArr;
                                            obj3 = obj3;
                                        } else {
                                            i47 = i68;
                                            zzajdVar2 = zzajdVar5;
                                            iK = iK2;
                                            unsafe3 = unsafe2;
                                            i48 = i28;
                                        }
                                        break;
                                    case 33:
                                    case 47:
                                        bArr5 = bArr;
                                        i41 = i12;
                                        zzajdVar7 = zzajdVar;
                                        i36 = i69;
                                        i17 = r1;
                                        if (z11 != 2) {
                                            if (z11 == 0) {
                                                zzakx zzakxVar5 = (zzakx) zzalbVar2;
                                                iK3 = zzaja.j(bArr5, i57, zzajdVar7);
                                                zzakxVar5.d(zzajq.b(zzajdVar7.f10061a));
                                                while (iK3 < i41) {
                                                    int iJ20 = zzaja.j(bArr5, iK3, zzajdVar7);
                                                    if (i17 == zzajdVar7.f10061a) {
                                                        iK3 = zzaja.j(bArr5, iJ20, zzajdVar7);
                                                        zzakxVar5.d(zzajq.b(zzajdVar7.f10061a));
                                                    }
                                                }
                                            }
                                            obj3 = obj;
                                            bArr = bArr5;
                                            i29 = i57;
                                            i30 = i41;
                                            zzajdVar5 = zzajdVar7;
                                            i28 = i36;
                                            iK2 = i29;
                                            if (iK2 == i29) {
                                                i47 = i68;
                                                zzajdVar8 = zzajdVar5;
                                                i12 = i30;
                                                unsafe3 = unsafe2;
                                                i48 = i28;
                                                iG2 = iK2;
                                                i51 = i17 == true ? 1 : 0;
                                                i49 = i49;
                                                bArr7 = bArr;
                                                obj3 = obj3;
                                            } else {
                                                i47 = i68;
                                                zzajdVar2 = zzajdVar5;
                                                iK = iK2;
                                                unsafe3 = unsafe2;
                                                i48 = i28;
                                            }
                                        } else {
                                            zzakx zzakxVar6 = (zzakx) zzalbVar2;
                                            iK3 = zzaja.j(bArr5, i57, zzajdVar7);
                                            int i99 = zzajdVar7.f10061a + iK3;
                                            while (iK3 < i99) {
                                                iK3 = zzaja.j(bArr5, iK3, zzajdVar7);
                                                zzakxVar6.d(zzajq.b(zzajdVar7.f10061a));
                                            }
                                            if (iK3 != i99) {
                                                throw zzale.g();
                                            }
                                        }
                                        obj3 = obj;
                                        bArr = bArr5;
                                        i29 = i57;
                                        i30 = i41;
                                        i28 = i36;
                                        iK2 = iK3;
                                        zzajdVar5 = zzajdVar7;
                                        if (iK2 == i29) {
                                            i47 = i68;
                                            zzajdVar8 = zzajdVar5;
                                            i12 = i30;
                                            unsafe3 = unsafe2;
                                            i48 = i28;
                                            iG2 = iK2;
                                            i51 = i17 == true ? 1 : 0;
                                            i49 = i49;
                                            bArr7 = bArr;
                                            obj3 = obj3;
                                        } else {
                                            i47 = i68;
                                            zzajdVar2 = zzajdVar5;
                                            iK = iK2;
                                            unsafe3 = unsafe2;
                                            i48 = i28;
                                        }
                                        break;
                                    case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                                    case 48:
                                        bArr5 = bArr;
                                        i41 = i12;
                                        zzajdVar7 = zzajdVar;
                                        i36 = i69;
                                        i17 = r1;
                                        if (z11 != 2) {
                                            if (z11 == 0) {
                                                zzaln zzalnVar5 = (zzaln) zzalbVar2;
                                                iK3 = zzaja.k(bArr5, i57, zzajdVar7);
                                                zzalnVar5.b(zzajq.c(zzajdVar7.f10062b));
                                                while (iK3 < i41) {
                                                    int iJ21 = zzaja.j(bArr5, iK3, zzajdVar7);
                                                    if (i17 == zzajdVar7.f10061a) {
                                                        iK3 = zzaja.k(bArr5, iJ21, zzajdVar7);
                                                        zzalnVar5.b(zzajq.c(zzajdVar7.f10062b));
                                                    }
                                                }
                                            }
                                            obj3 = obj;
                                            bArr = bArr5;
                                            i29 = i57;
                                            i30 = i41;
                                            zzajdVar5 = zzajdVar7;
                                            i28 = i36;
                                            iK2 = i29;
                                            if (iK2 == i29) {
                                                i47 = i68;
                                                zzajdVar8 = zzajdVar5;
                                                i12 = i30;
                                                unsafe3 = unsafe2;
                                                i48 = i28;
                                                iG2 = iK2;
                                                i51 = i17 == true ? 1 : 0;
                                                i49 = i49;
                                                bArr7 = bArr;
                                                obj3 = obj3;
                                            } else {
                                                i47 = i68;
                                                zzajdVar2 = zzajdVar5;
                                                iK = iK2;
                                                unsafe3 = unsafe2;
                                                i48 = i28;
                                            }
                                        } else {
                                            zzaln zzalnVar6 = (zzaln) zzalbVar2;
                                            iK3 = zzaja.j(bArr5, i57, zzajdVar7);
                                            int i100 = zzajdVar7.f10061a + iK3;
                                            while (iK3 < i100) {
                                                iK3 = zzaja.k(bArr5, iK3, zzajdVar7);
                                                zzalnVar6.b(zzajq.c(zzajdVar7.f10062b));
                                            }
                                            if (iK3 != i100) {
                                                throw zzale.g();
                                            }
                                        }
                                        obj3 = obj;
                                        bArr = bArr5;
                                        i29 = i57;
                                        i30 = i41;
                                        i28 = i36;
                                        iK2 = iK3;
                                        zzajdVar5 = zzajdVar7;
                                        if (iK2 == i29) {
                                            i47 = i68;
                                            zzajdVar8 = zzajdVar5;
                                            i12 = i30;
                                            unsafe3 = unsafe2;
                                            i48 = i28;
                                            iG2 = iK2;
                                            i51 = i17 == true ? 1 : 0;
                                            i49 = i49;
                                            bArr7 = bArr;
                                            obj3 = obj3;
                                        } else {
                                            i47 = i68;
                                            zzajdVar2 = zzajdVar5;
                                            iK = iK2;
                                            unsafe3 = unsafe2;
                                            i48 = i28;
                                        }
                                        break;
                                    case 49:
                                        if (z11 == 3) {
                                            zzamr zzamrVarH = zzamcVar.H(i69);
                                            int i101 = (r1 & (-8)) | 4;
                                            Object objZza = zzamrVarH.zza();
                                            i17 = r1;
                                            int iE = zzaja.e(objZza, zzamrVarH, bArr, i57, i12, i101, zzajdVar);
                                            int i102 = i101;
                                            zzajd zzajdVar9 = zzajdVar;
                                            zzamrVarH.c(objZza);
                                            zzajdVar9.f10063c = objZza;
                                            zzalbVar2.add(objZza);
                                            while (iE < i12) {
                                                int iJ22 = zzaja.j(bArr, iE, zzajdVar9);
                                                if (i17 == zzajdVar9.f10061a) {
                                                    int i103 = i102;
                                                    Object objZza2 = zzamrVarH.zza();
                                                    iE = zzaja.e(objZza2, zzamrVarH, bArr, iJ22, i12, i103, zzajdVar);
                                                    i102 = i103;
                                                    zzajdVar9 = zzajdVar;
                                                    zzamrVarH.c(objZza2);
                                                    zzajdVar9.f10063c = objZza2;
                                                    zzalbVar2.add(objZza2);
                                                } else {
                                                    bArr = bArr;
                                                    i30 = i12;
                                                    zzajdVar5 = zzajdVar9;
                                                    iK2 = iE;
                                                    i28 = i69;
                                                    i29 = i57;
                                                }
                                            }
                                            bArr = bArr;
                                            i30 = i12;
                                            zzajdVar5 = zzajdVar9;
                                            iK2 = iE;
                                            i28 = i69;
                                            i29 = i57;
                                        }
                                        if (iK2 == i29) {
                                            i47 = i68;
                                            zzajdVar2 = zzajdVar5;
                                            iK = iK2;
                                            unsafe3 = unsafe2;
                                            i48 = i28;
                                            break;
                                        } else {
                                            i47 = i68;
                                            zzajdVar8 = zzajdVar5;
                                            i12 = i30;
                                            unsafe3 = unsafe2;
                                            i48 = i28;
                                            iG2 = iK2;
                                            i51 = i17 == true ? 1 : 0;
                                            i49 = i49;
                                            bArr7 = bArr;
                                            obj3 = obj3;
                                            break;
                                        }
                                    default:
                                        zzajdVar5 = zzajdVar;
                                        i28 = i69;
                                        i29 = i57;
                                        i17 = i51 == true ? 1 : 0;
                                        bArr = bArr;
                                        i30 = i12;
                                        iK2 = i29;
                                        if (iK2 == i29) {
                                            i47 = i68;
                                            zzajdVar8 = zzajdVar5;
                                            i12 = i30;
                                            unsafe3 = unsafe2;
                                            i48 = i28;
                                            iG2 = iK2;
                                            i51 = i17 == true ? 1 : 0;
                                            i49 = i49;
                                            bArr7 = bArr;
                                            obj3 = obj3;
                                        } else {
                                            i47 = i68;
                                            zzajdVar2 = zzajdVar5;
                                            iK = iK2;
                                            unsafe3 = unsafe2;
                                            i48 = i28;
                                        }
                                        break;
                                }
                            } else {
                                i27 = i68;
                                i17 = i51 == true ? 1 : 0;
                                i26 = i57;
                                i48 = i69;
                                if (i59 != 50) {
                                    Unsafe unsafe9 = f10161q;
                                    int i104 = i50;
                                    unsafe3 = unsafe2;
                                    long j13 = iArr[i48 + 2] & 1048575;
                                    switch (i59) {
                                        case 51:
                                            zzajdVar2 = zzajdVar;
                                            i48 = i48;
                                            i45 = i26;
                                            i47 = i27;
                                            if (z11 == 1) {
                                                unsafe9.putObject(obj3, j11, Double.valueOf(Double.longBitsToDouble(zzaja.l(bArr, i45))));
                                                iK = i45 + 8;
                                                unsafe9.putInt(obj3, j13, i47);
                                            } else {
                                                iK = i45;
                                            }
                                            i13 = i13;
                                            if (iK == i45) {
                                                bArr7 = bArr;
                                                zzajdVar8 = zzajdVar;
                                                i51 = i17 == true ? 1 : 0;
                                                iG2 = iK;
                                                i47 = i47;
                                                obj3 = obj3;
                                                i48 = i48;
                                                i50 = i104;
                                                unsafe3 = unsafe3;
                                                i49 = i49;
                                                i12 = i12;
                                            } else {
                                                i48 = i48;
                                                i50 = i104;
                                            }
                                            break;
                                        case 52:
                                            zzajdVar2 = zzajdVar;
                                            i48 = i48;
                                            i45 = i26;
                                            i47 = i27;
                                            if (z11 == 5) {
                                                unsafe9.putObject(obj3, j11, Float.valueOf(Float.intBitsToFloat(zzaja.i(bArr, i45))));
                                                iK = i45 + 4;
                                                unsafe9.putInt(obj3, j13, i47);
                                            } else {
                                                iK = i45;
                                            }
                                            i13 = i13;
                                            if (iK == i45) {
                                                bArr7 = bArr;
                                                zzajdVar8 = zzajdVar;
                                                i51 = i17 == true ? 1 : 0;
                                                iG2 = iK;
                                                i47 = i47;
                                                obj3 = obj3;
                                                i48 = i48;
                                                i50 = i104;
                                                unsafe3 = unsafe3;
                                                i49 = i49;
                                                i12 = i12;
                                            } else {
                                                i48 = i48;
                                                i50 = i104;
                                            }
                                            break;
                                        case 53:
                                        case 54:
                                            zzajdVar2 = zzajdVar;
                                            i48 = i48;
                                            i45 = i26;
                                            i47 = i27;
                                            if (z11 == 0) {
                                                iK = zzaja.k(bArr, i45, zzajdVar2);
                                                unsafe9.putObject(obj3, j11, Long.valueOf(zzajdVar2.f10062b));
                                                unsafe9.putInt(obj3, j13, i47);
                                            } else {
                                                iK = i45;
                                            }
                                            i13 = i13;
                                            if (iK == i45) {
                                                bArr7 = bArr;
                                                zzajdVar8 = zzajdVar;
                                                i51 = i17 == true ? 1 : 0;
                                                iG2 = iK;
                                                i47 = i47;
                                                obj3 = obj3;
                                                i48 = i48;
                                                i50 = i104;
                                                unsafe3 = unsafe3;
                                                i49 = i49;
                                                i12 = i12;
                                            } else {
                                                i48 = i48;
                                                i50 = i104;
                                            }
                                            break;
                                        case 55:
                                        case 62:
                                            zzajdVar2 = zzajdVar;
                                            i48 = i48;
                                            i45 = i26;
                                            i47 = i27;
                                            if (z11 == 0) {
                                                iK = zzaja.j(bArr, i45, zzajdVar2);
                                                unsafe9.putObject(obj3, j11, Integer.valueOf(zzajdVar2.f10061a));
                                                unsafe9.putInt(obj3, j13, i47);
                                            } else {
                                                iK = i45;
                                            }
                                            i13 = i13;
                                            if (iK == i45) {
                                                bArr7 = bArr;
                                                zzajdVar8 = zzajdVar;
                                                i51 = i17 == true ? 1 : 0;
                                                iG2 = iK;
                                                i47 = i47;
                                                obj3 = obj3;
                                                i48 = i48;
                                                i50 = i104;
                                                unsafe3 = unsafe3;
                                                i49 = i49;
                                                i12 = i12;
                                            } else {
                                                i48 = i48;
                                                i50 = i104;
                                            }
                                            break;
                                        case 56:
                                        case 65:
                                            zzajdVar2 = zzajdVar;
                                            i48 = i48;
                                            i45 = i26;
                                            i47 = i27;
                                            if (z11 == 1) {
                                                unsafe9.putObject(obj3, j11, Long.valueOf(zzaja.l(bArr, i45)));
                                                iK = i45 + 8;
                                                unsafe9.putInt(obj3, j13, i47);
                                            } else {
                                                iK = i45;
                                            }
                                            i13 = i13;
                                            if (iK == i45) {
                                                bArr7 = bArr;
                                                zzajdVar8 = zzajdVar;
                                                i51 = i17 == true ? 1 : 0;
                                                iG2 = iK;
                                                i47 = i47;
                                                obj3 = obj3;
                                                i48 = i48;
                                                i50 = i104;
                                                unsafe3 = unsafe3;
                                                i49 = i49;
                                                i12 = i12;
                                            } else {
                                                i48 = i48;
                                                i50 = i104;
                                            }
                                            break;
                                        case 57:
                                        case 64:
                                            zzajdVar2 = zzajdVar;
                                            i48 = i48;
                                            i45 = i26;
                                            i47 = i27;
                                            if (z11 == 5) {
                                                unsafe9.putObject(obj3, j11, Integer.valueOf(zzaja.i(bArr, i45)));
                                                iK = i45 + 4;
                                                unsafe9.putInt(obj3, j13, i47);
                                            } else {
                                                iK = i45;
                                            }
                                            i13 = i13;
                                            if (iK == i45) {
                                                bArr7 = bArr;
                                                zzajdVar8 = zzajdVar;
                                                i51 = i17 == true ? 1 : 0;
                                                iG2 = iK;
                                                i47 = i47;
                                                obj3 = obj3;
                                                i48 = i48;
                                                i50 = i104;
                                                unsafe3 = unsafe3;
                                                i49 = i49;
                                                i12 = i12;
                                            } else {
                                                i48 = i48;
                                                i50 = i104;
                                            }
                                            break;
                                        case 58:
                                            zzajdVar2 = zzajdVar;
                                            i48 = i48;
                                            i45 = i26;
                                            i47 = i27;
                                            if (z11 == 0) {
                                                iK = zzaja.k(bArr, i45, zzajdVar2);
                                                unsafe9.putObject(obj3, j11, Boolean.valueOf(zzajdVar2.f10062b != 0));
                                                unsafe9.putInt(obj3, j13, i47);
                                            } else {
                                                iK = i45;
                                            }
                                            i13 = i13;
                                            if (iK == i45) {
                                                bArr7 = bArr;
                                                zzajdVar8 = zzajdVar;
                                                i51 = i17 == true ? 1 : 0;
                                                iG2 = iK;
                                                i47 = i47;
                                                obj3 = obj3;
                                                i48 = i48;
                                                i50 = i104;
                                                unsafe3 = unsafe3;
                                                i49 = i49;
                                                i12 = i12;
                                            } else {
                                                i48 = i48;
                                                i50 = i104;
                                            }
                                            break;
                                        case 59:
                                            zzajdVar2 = zzajdVar;
                                            i45 = i26;
                                            i47 = i27;
                                            if (z11 == 2) {
                                                int iJ23 = zzaja.j(bArr, i45, zzajdVar2);
                                                int i105 = zzajdVar2.f10061a;
                                                if (i105 == 0) {
                                                    unsafe9.putObject(obj3, j11, BuildConfig.VERSION_NAME);
                                                } else {
                                                    if ((i58 & 536870912) != 0 && !zzanl.d(bArr, iJ23, iJ23 + i105)) {
                                                        throw zzale.c();
                                                    }
                                                    unsafe9.putObject(obj3, j11, new String(bArr, iJ23, i105, StandardCharsets.UTF_8));
                                                    iJ23 += i105;
                                                }
                                                unsafe9.putInt(obj3, j13, i47);
                                                iK = iJ23;
                                            } else {
                                                i48 = i48;
                                                iK = i45;
                                            }
                                            i13 = i13;
                                            if (iK == i45) {
                                                bArr7 = bArr;
                                                zzajdVar8 = zzajdVar;
                                                i51 = i17 == true ? 1 : 0;
                                                iG2 = iK;
                                                i47 = i47;
                                                obj3 = obj3;
                                                i48 = i48;
                                                i50 = i104;
                                                unsafe3 = unsafe3;
                                                i49 = i49;
                                                i12 = i12;
                                            } else {
                                                i48 = i48;
                                                i50 = i104;
                                            }
                                            break;
                                        case 60:
                                            zzajdVar2 = zzajdVar;
                                            i46 = i26;
                                            i47 = i27;
                                            if (z11 == 2) {
                                                Object objM = zzamcVar.m(i47, i48, obj3);
                                                int iF = zzaja.f(objM, zzamcVar.H(i48), bArr, i46, i12, zzajdVar2);
                                                zzajdVar2 = zzajdVar2;
                                                zzamcVar.s(obj3, i47, i48, objM);
                                                iK = iF;
                                                i48 = i48;
                                                i45 = i46;
                                            } else {
                                                i45 = i46;
                                                i48 = i48;
                                                iK = i45;
                                            }
                                            i13 = i13;
                                            if (iK == i45) {
                                                bArr7 = bArr;
                                                zzajdVar8 = zzajdVar;
                                                i51 = i17 == true ? 1 : 0;
                                                iG2 = iK;
                                                i47 = i47;
                                                obj3 = obj3;
                                                i48 = i48;
                                                i50 = i104;
                                                unsafe3 = unsafe3;
                                                i49 = i49;
                                                i12 = i12;
                                            } else {
                                                i48 = i48;
                                                i50 = i104;
                                            }
                                            break;
                                        case 61:
                                            zzajdVar2 = zzajdVar;
                                            i46 = i26;
                                            i47 = i27;
                                            if (z11 == 2) {
                                                iG = zzaja.g(bArr, i46, zzajdVar2);
                                                unsafe9.putObject(obj3, j11, zzajdVar2.f10063c);
                                                unsafe9.putInt(obj3, j13, i47);
                                                int i106 = i46;
                                                iK = iG;
                                                i45 = i106;
                                                i48 = i48;
                                                i13 = i13;
                                                if (iK == i45) {
                                                    bArr7 = bArr;
                                                    zzajdVar8 = zzajdVar;
                                                    i51 = i17 == true ? 1 : 0;
                                                    iG2 = iK;
                                                    i47 = i47;
                                                    obj3 = obj3;
                                                    i48 = i48;
                                                    i50 = i104;
                                                    unsafe3 = unsafe3;
                                                    i49 = i49;
                                                    i12 = i12;
                                                } else {
                                                    i48 = i48;
                                                    i50 = i104;
                                                }
                                            }
                                            i45 = i46;
                                            i48 = i48;
                                            iK = i45;
                                            i13 = i13;
                                            if (iK == i45) {
                                                bArr7 = bArr;
                                                zzajdVar8 = zzajdVar;
                                                i51 = i17 == true ? 1 : 0;
                                                iG2 = iK;
                                                i47 = i47;
                                                obj3 = obj3;
                                                i48 = i48;
                                                i50 = i104;
                                                unsafe3 = unsafe3;
                                                i49 = i49;
                                                i12 = i12;
                                            } else {
                                                i48 = i48;
                                                i50 = i104;
                                            }
                                            break;
                                        case 63:
                                            zzajdVar2 = zzajdVar;
                                            i46 = i26;
                                            i47 = i27;
                                            if (z11 == 0) {
                                                iG = zzaja.j(bArr, i46, zzajdVar2);
                                                int i107 = zzajdVar2.f10061a;
                                                zzaky zzakyVarG2 = zzamcVar.G(i48);
                                                if (zzakyVarG2 == null || zzakyVarG2.zza()) {
                                                    unsafe9.putObject(obj3, j11, Integer.valueOf(i107));
                                                    unsafe9.putInt(obj3, j13, i47);
                                                } else {
                                                    B(obj3).c(i17 == true ? 1 : 0, Long.valueOf(i107));
                                                }
                                                int i108 = i46;
                                                iK = iG;
                                                i45 = i108;
                                                i48 = i48;
                                                i13 = i13;
                                                if (iK == i45) {
                                                    bArr7 = bArr;
                                                    zzajdVar8 = zzajdVar;
                                                    i51 = i17 == true ? 1 : 0;
                                                    iG2 = iK;
                                                    i47 = i47;
                                                    obj3 = obj3;
                                                    i48 = i48;
                                                    i50 = i104;
                                                    unsafe3 = unsafe3;
                                                    i49 = i49;
                                                    i12 = i12;
                                                } else {
                                                    i48 = i48;
                                                    i50 = i104;
                                                }
                                            }
                                            i45 = i46;
                                            i48 = i48;
                                            iK = i45;
                                            i13 = i13;
                                            if (iK == i45) {
                                                bArr7 = bArr;
                                                zzajdVar8 = zzajdVar;
                                                i51 = i17 == true ? 1 : 0;
                                                iG2 = iK;
                                                i47 = i47;
                                                obj3 = obj3;
                                                i48 = i48;
                                                i50 = i104;
                                                unsafe3 = unsafe3;
                                                i49 = i49;
                                                i12 = i12;
                                            } else {
                                                i48 = i48;
                                                i50 = i104;
                                            }
                                            break;
                                        case 66:
                                            zzajdVar2 = zzajdVar;
                                            i46 = i26;
                                            i47 = i27;
                                            if (z11 == 0) {
                                                iG = zzaja.j(bArr, i46, zzajdVar2);
                                                unsafe9.putObject(obj3, j11, Integer.valueOf(zzajq.b(zzajdVar2.f10061a)));
                                                unsafe9.putInt(obj3, j13, i47);
                                                int i109 = i46;
                                                iK = iG;
                                                i45 = i109;
                                                i48 = i48;
                                                i13 = i13;
                                                if (iK == i45) {
                                                    bArr7 = bArr;
                                                    zzajdVar8 = zzajdVar;
                                                    i51 = i17 == true ? 1 : 0;
                                                    iG2 = iK;
                                                    i47 = i47;
                                                    obj3 = obj3;
                                                    i48 = i48;
                                                    i50 = i104;
                                                    unsafe3 = unsafe3;
                                                    i49 = i49;
                                                    i12 = i12;
                                                } else {
                                                    i48 = i48;
                                                    i50 = i104;
                                                }
                                            }
                                            i45 = i46;
                                            i48 = i48;
                                            iK = i45;
                                            i13 = i13;
                                            if (iK == i45) {
                                                bArr7 = bArr;
                                                zzajdVar8 = zzajdVar;
                                                i51 = i17 == true ? 1 : 0;
                                                iG2 = iK;
                                                i47 = i47;
                                                obj3 = obj3;
                                                i48 = i48;
                                                i50 = i104;
                                                unsafe3 = unsafe3;
                                                i49 = i49;
                                                i12 = i12;
                                            } else {
                                                i48 = i48;
                                                i50 = i104;
                                            }
                                            break;
                                        case 67:
                                            zzajdVar2 = zzajdVar;
                                            i46 = i26;
                                            i47 = i27;
                                            if (z11 == 0) {
                                                iG = zzaja.k(bArr, i46, zzajdVar2);
                                                unsafe9.putObject(obj3, j11, Long.valueOf(zzajq.c(zzajdVar2.f10062b)));
                                                unsafe9.putInt(obj3, j13, i47);
                                                int i1010 = i46;
                                                iK = iG;
                                                i45 = i1010;
                                                i48 = i48;
                                                i13 = i13;
                                                if (iK == i45) {
                                                    bArr7 = bArr;
                                                    zzajdVar8 = zzajdVar;
                                                    i51 = i17 == true ? 1 : 0;
                                                    iG2 = iK;
                                                    i47 = i47;
                                                    obj3 = obj3;
                                                    i48 = i48;
                                                    i50 = i104;
                                                    unsafe3 = unsafe3;
                                                    i49 = i49;
                                                    i12 = i12;
                                                } else {
                                                    i48 = i48;
                                                    i50 = i104;
                                                }
                                            }
                                            i45 = i46;
                                            i48 = i48;
                                            iK = i45;
                                            i13 = i13;
                                            if (iK == i45) {
                                                bArr7 = bArr;
                                                zzajdVar8 = zzajdVar;
                                                i51 = i17 == true ? 1 : 0;
                                                iG2 = iK;
                                                i47 = i47;
                                                obj3 = obj3;
                                                i48 = i48;
                                                i50 = i104;
                                                unsafe3 = unsafe3;
                                                i49 = i49;
                                                i12 = i12;
                                            } else {
                                                i48 = i48;
                                                i50 = i104;
                                            }
                                            break;
                                        case 68:
                                            if (z11 != 3) {
                                                i46 = i26;
                                                i47 = i27;
                                                zzajdVar2 = zzajdVar;
                                                i45 = i46;
                                                i48 = i48;
                                                iK = i45;
                                                i13 = i13;
                                                if (iK == i45) {
                                                    bArr7 = bArr;
                                                    zzajdVar8 = zzajdVar;
                                                    i51 = i17 == true ? 1 : 0;
                                                    iG2 = iK;
                                                    i47 = i47;
                                                    obj3 = obj3;
                                                    i48 = i48;
                                                    i50 = i104;
                                                    unsafe3 = unsafe3;
                                                    i49 = i49;
                                                    i12 = i12;
                                                } else {
                                                    i48 = i48;
                                                    i50 = i104;
                                                }
                                            } else {
                                                Object objM2 = zzamcVar.m(i27, i48, obj3);
                                                i47 = i27;
                                                iG = zzaja.e(objM2, zzamcVar.H(i48), bArr, i26, i12, ((i17 == true ? 1 : 0) & (-8)) | 4, zzajdVar);
                                                i46 = i26;
                                                zzajdVar2 = zzajdVar;
                                                zzamcVar.s(obj3, i47, i48, objM2);
                                                int i1011 = i46;
                                                iK = iG;
                                                i45 = i1011;
                                                i48 = i48;
                                                i13 = i13;
                                                if (iK == i45) {
                                                    bArr7 = bArr;
                                                    zzajdVar8 = zzajdVar;
                                                    i51 = i17 == true ? 1 : 0;
                                                    iG2 = iK;
                                                    i47 = i47;
                                                    obj3 = obj3;
                                                    i48 = i48;
                                                    i50 = i104;
                                                    unsafe3 = unsafe3;
                                                    i49 = i49;
                                                    i12 = i12;
                                                } else {
                                                    i48 = i48;
                                                    i50 = i104;
                                                }
                                            }
                                            break;
                                        default:
                                            zzajdVar2 = zzajdVar;
                                            i48 = i48;
                                            i45 = i26;
                                            i47 = i27;
                                            iK = i45;
                                            i13 = i13;
                                            if (iK == i45) {
                                                bArr7 = bArr;
                                                zzajdVar8 = zzajdVar;
                                                i51 = i17 == true ? 1 : 0;
                                                iG2 = iK;
                                                i47 = i47;
                                                obj3 = obj3;
                                                i48 = i48;
                                                i50 = i104;
                                                unsafe3 = unsafe3;
                                                i49 = i49;
                                                i12 = i12;
                                            } else {
                                                i48 = i48;
                                                i50 = i104;
                                            }
                                            break;
                                    }
                                } else {
                                    if (z11 == 2) {
                                        Unsafe unsafe10 = f10161q;
                                        Object objI = zzamcVar.I(i48);
                                        Object object = unsafe10.getObject(obj3, j11);
                                        zzalv zzalvVar = zzamcVar.f10175o;
                                        if (zzalvVar.zzf(object)) {
                                            zzals zzalsVarZzb = zzalvVar.zzb();
                                            zzalvVar.b((Object) zzalsVarZzb, object);
                                            unsafe10.putObject(obj3, j11, zzalsVarZzb);
                                        }
                                        zzalvVar.zza(objI);
                                        throw null;
                                    }
                                    zzajdVar2 = zzajdVar;
                                    iK = i26;
                                    unsafe3 = unsafe2;
                                    i47 = i27;
                                }
                            }
                        } else if (z11 == 2) {
                            zzalb zzalbVarZza2 = (zzalb) unsafe7.getObject(obj10, j11);
                            if (!zzalbVarZza2.zzc()) {
                                int size = zzalbVarZza2.size();
                                zzalbVarZza2 = zzalbVarZza2.zza(size == 0 ? 10 : size << 1);
                                unsafe7.putObject(obj10, j11, zzalbVarZza2);
                            }
                            i12 = i12;
                            int i110 = iJ;
                            iG2 = zzaja.h(zzamcVar.H(iJ), i51 == true ? 1 : 0, bArr, i57, i12, zzalbVarZza2, zzajdVar);
                            i51 = i51 == true ? 1 : 0;
                            unsafe3 = unsafe7;
                            bArr7 = bArr;
                            i47 = i68;
                            zzajdVar8 = zzajdVar;
                            obj3 = obj;
                            i48 = i110;
                            i49 = i49;
                        } else {
                            obj3 = obj10;
                            unsafe2 = unsafe7;
                            i17 = i51 == true ? 1 : 0;
                            i48 = iJ;
                            i26 = i57;
                            i27 = i68;
                            zzajdVar2 = zzajdVar;
                            iK = i26;
                            unsafe3 = unsafe2;
                            i47 = i27;
                        }
                    }
                } else {
                    iK = i57;
                    unsafe3 = unsafe3;
                    zzajdVar2 = zzajdVar8;
                    i49 = i49;
                    i47 = i54;
                    i48 = i16;
                    i17 = i51 == true ? 1 : 0;
                    i13 = i13;
                    obj3 = obj3;
                }
                if (i17 != i13 || i13 == 0) {
                    if (!zzamcVar.f10167f || (zzakjVar = zzajdVar2.f10064d) == zzakj.f10117b) {
                        int i111 = i17;
                        zzajdVar8 = zzajdVar;
                        int iC = zzaja.c(i111 == true ? 1 : 0, bArr, iK, i12, B(obj3), zzajdVar8);
                        i51 = i111 == true ? 1 : 0;
                        i12 = i12;
                        iG2 = iC;
                    } else {
                        if (((zzaku.zzf) zzakjVar.f10118a.get(new zzaki(i47, zzamcVar.f10166e))) != null) {
                            ((zzaku.zzd) obj3).v();
                            throw new NoSuchMethodError();
                        }
                        int i112 = i17;
                        int iC2 = zzaja.c(i112 == true ? 1 : 0, bArr, iK, i12, B(obj3), zzajdVar2);
                        i12 = i12;
                        zzajdVar8 = zzajdVar;
                        i51 = i112 == true ? 1 : 0;
                        iG2 = iC2;
                    }
                    bArr7 = bArr;
                } else {
                    i14 = i12;
                    i15 = iK;
                    i51 = i17;
                    unsafe3 = unsafe3;
                    i49 = i49;
                }
            } else {
                i13 = i13;
                obj3 = obj3;
                i14 = i12;
                i15 = iG2;
            }
        }
        if (i49 != 1048575) {
            unsafe3.putInt(obj3, i49, i50);
        }
        int i113 = zzamcVar.f10170i;
        while (i113 < zzamcVar.f10171j) {
            zzamcVar.o(obj3, zzamcVar.f10169h[i113], null, zzamcVar.m, obj);
            i113++;
            zzamcVar = this;
            obj3 = obj;
        }
        if (i13 == 0) {
            if (i15 != i14) {
                throw zzale.f();
            }
        } else if (i15 > i14 || i51 != i13) {
            throw zzale.f();
        }
        return i15;
    }

    public final Object m(int i11, int i12, Object obj) {
        zzamr zzamrVarH = H(i12);
        if (!C(i11, i12, obj)) {
            return zzamrVarH.zza();
        }
        Object object = f10161q.getObject(obj, z(i12) & 1048575);
        if (K(object)) {
            return object;
        }
        Object objZza = zzamrVarH.zza();
        if (object != null) {
            zzamrVarH.b(objZza, object);
        }
        return objZza;
    }

    public final Object n(int i11, Object obj) {
        zzamr zzamrVarH = H(i11);
        long jZ = z(i11) & 1048575;
        if (!D(i11, obj)) {
            return zzamrVarH.zza();
        }
        Object object = f10161q.getObject(obj, jZ);
        if (K(object)) {
            return object;
        }
        Object objZza = zzamrVarH.zza();
        if (object != null) {
            zzamrVarH.b(objZza, object);
        }
        return objZza;
    }

    public final Object o(Object obj, int i11, Object obj2, zzanf zzanfVar, Object obj3) {
        int i12 = this.f10162a[i11];
        Object objM = zzank.m(z(i11) & 1048575, obj);
        if (objM == null || G(i11) == null) {
            return obj2;
        }
        zzalv zzalvVar = this.f10175o;
        zzalvVar.a(objM);
        zzalvVar.zza(I(i11));
        throw null;
    }

    public final void q(int i11, zzamo zzamoVar, Object obj) {
        if ((536870912 & i11) != 0) {
            zzank.d(obj, i11 & 1048575, zzamoVar.zzr());
        } else if (this.f10168g) {
            zzank.d(obj, i11 & 1048575, zzamoVar.c());
        } else {
            zzank.d(obj, i11 & 1048575, zzamoVar.zzp());
        }
    }

    public final void s(Object obj, int i11, int i12, Object obj2) {
        f10161q.putObject(obj, z(i12) & 1048575, obj2);
        w(i11, i12, obj);
    }

    public final void t(Object obj, int i11, Object obj2) {
        f10161q.putObject(obj, z(i11) & 1048575, obj2);
        x(i11, obj);
    }

    public final void u(Object obj, Object obj2, int i11) {
        if (D(i11, obj2)) {
            long jZ = z(i11) & 1048575;
            Unsafe unsafe = f10161q;
            Object object = unsafe.getObject(obj2, jZ);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f10162a[i11] + " is present but null: " + String.valueOf(obj2));
            }
            zzamr zzamrVarH = H(i11);
            if (!D(i11, obj)) {
                if (K(object)) {
                    Object objZza = zzamrVarH.zza();
                    zzamrVarH.b(objZza, object);
                    unsafe.putObject(obj, jZ, objZza);
                } else {
                    unsafe.putObject(obj, jZ, object);
                }
                x(i11, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jZ);
            if (!K(object2)) {
                Object objZza2 = zzamrVarH.zza();
                zzamrVarH.b(objZza2, object2);
                unsafe.putObject(obj, jZ, objZza2);
                object2 = objZza2;
            }
            zzamrVarH.b(object2, object);
        }
    }

    public final boolean v(Object obj, int i11, int i12, int i13, int i14) {
        if (i12 == 1048575) {
            return D(i11, obj);
        }
        return (i13 & i14) != 0;
    }

    public final void w(int i11, int i12, Object obj) {
        zzank.b(this.f10162a[i12 + 2] & 1048575, obj, i11);
    }

    public final void x(int i11, Object obj) {
        int i12 = this.f10162a[i11 + 2];
        long j11 = 1048575 & i12;
        if (j11 == 1048575) {
            return;
        }
        zzank.b(j11, obj, (1 << (i12 >>> 20)) | zzank.f10225c.j(j11, obj));
    }

    public final void y(int i11, Object obj, Object obj2) {
        int[] iArr = this.f10162a;
        int i12 = iArr[i11];
        if (C(i12, i11, obj2)) {
            long jZ = z(i11) & 1048575;
            Unsafe unsafe = f10161q;
            Object object = unsafe.getObject(obj2, jZ);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i11] + " is present but null: " + String.valueOf(obj2));
            }
            zzamr zzamrVarH = H(i11);
            if (!C(i12, i11, obj)) {
                if (K(object)) {
                    Object objZza = zzamrVarH.zza();
                    zzamrVarH.b(objZza, object);
                    unsafe.putObject(obj, jZ, objZza);
                } else {
                    unsafe.putObject(obj, jZ, object);
                }
                w(i12, i11, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jZ);
            if (!K(object2)) {
                Object objZza2 = zzamrVarH.zza();
                zzamrVarH.b(objZza2, object2);
                unsafe.putObject(obj, jZ, objZza2);
                object2 = objZza2;
            }
            zzamrVarH.b(object2, object);
        }
    }

    public final int z(int i11) {
        return this.f10162a[i11 + 1];
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamr
    public final Object zza() {
        return this.f10172k.zza(this.f10166e);
    }
}
