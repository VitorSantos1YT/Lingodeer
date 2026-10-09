package androidx.glance.appwidget.protobuf;

import com.google.api.Service;
import com.google.protobuf.DescriptorProtos;
import com.stkouyu.util.httputil.Consts;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 implements w0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int[] f1970n = new int[0];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Unsafe f1971o = f1.i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f1972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f1973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1974c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f1975d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f1976e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f1977f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f1978g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f1979h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f1980i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p0 f1981j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final d0 f1982k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final y0 f1983l;
    public final j0 m;

    public n0(int[] iArr, Object[] objArr, int i11, int i12, a aVar, int[] iArr2, int i13, int i14, p0 p0Var, d0 d0Var, y0 y0Var, o oVar, j0 j0Var) {
        this.f1972a = iArr;
        this.f1973b = objArr;
        this.f1974c = i11;
        this.f1975d = i12;
        this.f1977f = aVar instanceof x;
        this.f1978g = iArr2;
        this.f1979h = i13;
        this.f1980i = i14;
        this.f1981j = p0Var;
        this.f1982k = d0Var;
        this.f1983l = y0Var;
        this.f1976e = aVar;
        this.m = j0Var;
    }

    public static Field F(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder sbQ = hh.p0.q("Field ", str, " for ");
            sbQ.append(cls.getName());
            sbQ.append(" not found. Known fields are ");
            sbQ.append(Arrays.toString(declaredFields));
            throw new RuntimeException(sbQ.toString());
        }
    }

    public static int K(int i11) {
        return (i11 & 267386880) >>> 20;
    }

    public static void N(int i11, Object obj, h0 h0Var) throws IOException {
        if (!(obj instanceof String)) {
            h0Var.a(i11, (h) obj);
        } else {
            ((l) h0Var.f1938a).p0(i11, (String) obj);
        }
    }

    public static boolean p(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof x) {
            return ((x) obj).f();
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:166:0x0362  */
    /* JADX WARN: Code duplicated, block: B:181:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:184:0x03c3  */
    public static n0 w(v0 v0Var, p0 p0Var, d0 d0Var, y0 y0Var, o oVar, j0 j0Var) {
        int i11;
        int iCharAt;
        int i12;
        int i13;
        int i14;
        int[] iArr;
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
        int i30;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i31;
        int i32;
        Field fieldF;
        int i33;
        char cCharAt9;
        int i34;
        Field fieldF2;
        Field fieldF3;
        int i35;
        char cCharAt10;
        int i36;
        char cCharAt11;
        int i37;
        int i38;
        char cCharAt12;
        int i39;
        char cCharAt13;
        String str = v0Var.f2005b;
        int length = str.length();
        if (str.charAt(0) >= 55296) {
            int i40 = 1;
            while (true) {
                i11 = i40 + 1;
                if (str.charAt(i40) < 55296) {
                    break;
                }
                i40 = i11;
            }
        } else {
            i11 = 1;
        }
        int i41 = i11 + 1;
        int iCharAt2 = str.charAt(i11);
        if (iCharAt2 >= 55296) {
            int i42 = iCharAt2 & 8191;
            int i43 = 13;
            while (true) {
                i39 = i41 + 1;
                cCharAt13 = str.charAt(i41);
                if (cCharAt13 < 55296) {
                    break;
                }
                i42 |= (cCharAt13 & 8191) << i43;
                i43 += 13;
                i41 = i39;
            }
            iCharAt2 = i42 | (cCharAt13 << i43);
            i41 = i39;
        }
        if (iCharAt2 == 0) {
            i13 = 0;
            i16 = 0;
            iCharAt = 0;
            i12 = 0;
            i15 = 0;
            i17 = 0;
            iArr = f1970n;
            i14 = 0;
        } else {
            int i44 = i41 + 1;
            int iCharAt3 = str.charAt(i41);
            if (iCharAt3 >= 55296) {
                int i45 = iCharAt3 & 8191;
                int i46 = 13;
                while (true) {
                    i26 = i44 + 1;
                    cCharAt8 = str.charAt(i44);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i45 |= (cCharAt8 & 8191) << i46;
                    i46 += 13;
                    i44 = i26;
                }
                iCharAt3 = i45 | (cCharAt8 << i46);
                i44 = i26;
            }
            int i47 = i44 + 1;
            int iCharAt4 = str.charAt(i44);
            if (iCharAt4 >= 55296) {
                int i48 = iCharAt4 & 8191;
                int i49 = 13;
                while (true) {
                    i25 = i47 + 1;
                    cCharAt7 = str.charAt(i47);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i48 |= (cCharAt7 & 8191) << i49;
                    i49 += 13;
                    i47 = i25;
                }
                iCharAt4 = i48 | (cCharAt7 << i49);
                i47 = i25;
            }
            int i50 = i47 + 1;
            int iCharAt5 = str.charAt(i47);
            if (iCharAt5 >= 55296) {
                int i51 = iCharAt5 & 8191;
                int i52 = 13;
                while (true) {
                    i24 = i50 + 1;
                    cCharAt6 = str.charAt(i50);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i51 |= (cCharAt6 & 8191) << i52;
                    i52 += 13;
                    i50 = i24;
                }
                iCharAt5 = i51 | (cCharAt6 << i52);
                i50 = i24;
            }
            int i53 = i50 + 1;
            int iCharAt6 = str.charAt(i50);
            if (iCharAt6 >= 55296) {
                int i54 = iCharAt6 & 8191;
                int i55 = 13;
                while (true) {
                    i23 = i53 + 1;
                    cCharAt5 = str.charAt(i53);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i54 |= (cCharAt5 & 8191) << i55;
                    i55 += 13;
                    i53 = i23;
                }
                iCharAt6 = i54 | (cCharAt5 << i55);
                i53 = i23;
            }
            int i56 = i53 + 1;
            iCharAt = str.charAt(i53);
            if (iCharAt >= 55296) {
                int i57 = iCharAt & 8191;
                int i58 = 13;
                while (true) {
                    i22 = i56 + 1;
                    cCharAt4 = str.charAt(i56);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i57 |= (cCharAt4 & 8191) << i58;
                    i58 += 13;
                    i56 = i22;
                }
                iCharAt = i57 | (cCharAt4 << i58);
                i56 = i22;
            }
            int i59 = i56 + 1;
            int iCharAt7 = str.charAt(i56);
            if (iCharAt7 >= 55296) {
                int i60 = iCharAt7 & 8191;
                int i61 = 13;
                while (true) {
                    i21 = i59 + 1;
                    cCharAt3 = str.charAt(i59);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i60 |= (cCharAt3 & 8191) << i61;
                    i61 += 13;
                    i59 = i21;
                }
                iCharAt7 = i60 | (cCharAt3 << i61);
                i59 = i21;
            }
            int i62 = i59 + 1;
            int iCharAt8 = str.charAt(i59);
            if (iCharAt8 >= 55296) {
                int i63 = iCharAt8 & 8191;
                int i64 = 13;
                while (true) {
                    i19 = i62 + 1;
                    cCharAt2 = str.charAt(i62);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i63 |= (cCharAt2 & 8191) << i64;
                    i64 += 13;
                    i62 = i19;
                }
                iCharAt8 = i63 | (cCharAt2 << i64);
                i62 = i19;
            }
            int i65 = i62 + 1;
            int iCharAt9 = str.charAt(i62);
            if (iCharAt9 >= 55296) {
                int i66 = iCharAt9 & 8191;
                int i67 = 13;
                while (true) {
                    i18 = i65 + 1;
                    cCharAt = str.charAt(i65);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i66 |= (cCharAt & 8191) << i67;
                    i67 += 13;
                    i65 = i18;
                }
                iCharAt9 = i66 | (cCharAt << i67);
                i65 = i18;
            }
            int[] iArr2 = new int[iCharAt9 + iCharAt7 + iCharAt8];
            int i68 = (iCharAt3 * 2) + iCharAt4;
            int i69 = iCharAt7;
            i12 = iCharAt5;
            i13 = i69;
            i14 = iCharAt3;
            i41 = i65;
            iArr = iArr2;
            i15 = iCharAt6;
            i16 = i68;
            i17 = iCharAt9;
        }
        Unsafe unsafe = f1971o;
        Object[] objArr2 = v0Var.f2006c;
        Class<?> cls = v0Var.f2004a.getClass();
        int[] iArr3 = new int[iCharAt * 3];
        Object[] objArr3 = new Object[iCharAt * 2];
        int i70 = i17 + i13;
        int i71 = i70;
        int i72 = i17;
        int i73 = 0;
        int i74 = 0;
        while (i41 < length) {
            int i75 = i41 + 1;
            int iCharAt10 = str.charAt(i41);
            int i76 = length;
            if (iCharAt10 >= 55296) {
                int i77 = iCharAt10 & 8191;
                int i78 = i75;
                int i79 = 13;
                while (true) {
                    i38 = i78 + 1;
                    cCharAt12 = str.charAt(i78);
                    objArr = objArr2;
                    if (cCharAt12 < 55296) {
                        break;
                    }
                    i77 |= (cCharAt12 & 8191) << i79;
                    i79 += 13;
                    i78 = i38;
                    objArr2 = objArr;
                }
                iCharAt10 = i77 | (cCharAt12 << i79);
                i27 = i38;
            } else {
                objArr = objArr2;
                i27 = i75;
            }
            int i80 = i27 + 1;
            int iCharAt11 = str.charAt(i27);
            if (iCharAt11 >= 55296) {
                int i81 = iCharAt11 & 8191;
                int i82 = i80;
                int i83 = 13;
                while (true) {
                    i36 = i82 + 1;
                    cCharAt11 = str.charAt(i82);
                    i37 = i81;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i81 = i37 | ((cCharAt11 & 8191) << i83);
                    i83 += 13;
                    i82 = i36;
                }
                iCharAt11 = i37 | (cCharAt11 << i83);
                i28 = i36;
            } else {
                i28 = i80;
            }
            int i84 = iCharAt10;
            int i85 = iCharAt11 & 255;
            int[] iArr4 = iArr3;
            if ((iCharAt11 & 1024) != 0) {
                iArr[i74] = i73;
                i74++;
            }
            int i86 = i14;
            if (i85 >= 51) {
                int i87 = i28 + 1;
                int iCharAt12 = str.charAt(i28);
                char c11 = 55296;
                if (iCharAt12 >= 55296) {
                    int i88 = iCharAt12 & 8191;
                    int i89 = 13;
                    while (true) {
                        i35 = i87 + 1;
                        cCharAt10 = str.charAt(i87);
                        if (cCharAt10 < c11) {
                            break;
                        }
                        i88 |= (cCharAt10 & 8191) << i89;
                        i89 += 13;
                        i87 = i35;
                        c11 = 55296;
                    }
                    iCharAt12 = i88 | (cCharAt10 << i89);
                    i87 = i35;
                }
                int i90 = i85 - 51;
                int i91 = iCharAt12;
                if (i90 == 9 || i90 == 17) {
                    objArr3[defpackage.e.c(i73, 3, 2, 1)] = objArr[i16];
                    i16++;
                } else if (i90 == 12 && (v0Var.a().equals(s0.PROTO2) || (iCharAt11 & 2048) != 0)) {
                    objArr3[defpackage.e.c(i73, 3, 2, 1)] = objArr[i16];
                    i16++;
                }
                int i92 = i91 * 2;
                Object obj = objArr[i92];
                if (obj instanceof Field) {
                    fieldF2 = (Field) obj;
                } else {
                    fieldF2 = F(cls, (String) obj);
                    objArr[i92] = fieldF2;
                }
                int i93 = i70;
                i30 = i16;
                int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldF2);
                int i94 = i92 + 1;
                Object obj2 = objArr[i94];
                if (obj2 instanceof Field) {
                    fieldF3 = (Field) obj2;
                } else {
                    fieldF3 = F(cls, (String) obj2);
                    objArr[i94] = fieldF3;
                }
                int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldF3);
                str = str;
                iObjectFieldOffset = iObjectFieldOffset3;
                i73 = i73;
                i31 = i87;
                iObjectFieldOffset2 = iObjectFieldOffset4;
                i29 = i93;
                objArr3 = objArr3;
                i32 = 0;
            } else {
                int i95 = i70;
                int i96 = i16 + 1;
                Field fieldF4 = F(cls, (String) objArr[i16]);
                if (i85 == 9 || i85 == 17) {
                    i29 = i95;
                    objArr3[defpackage.e.c(i73, 3, 2, 1)] = fieldF4.getType();
                } else {
                    if (i85 == 27 || i85 == 49) {
                        i29 = i95;
                        i34 = i16 + 2;
                        objArr3[defpackage.e.c(i73, 3, 2, 1)] = objArr[i96];
                    } else if (i85 == 12 || i85 == 30 || i85 == 44) {
                        i29 = i95;
                        if (v0Var.a() == s0.PROTO2 || (iCharAt11 & 2048) != 0) {
                            i34 = i16 + 2;
                            objArr3[defpackage.e.c(i73, 3, 2, 1)] = objArr[i96];
                        }
                    } else {
                        if (i85 == 50) {
                            int i97 = i72 + 1;
                            iArr[i72] = i73;
                            int i98 = (i73 / 3) * 2;
                            int i99 = i16 + 2;
                            objArr3[i98] = objArr[i96];
                            if ((iCharAt11 & 2048) != 0) {
                                i30 = i16 + 3;
                                objArr3[i98 + 1] = objArr[i99];
                                i29 = i95;
                                i72 = i97;
                            } else {
                                i30 = i99;
                                i72 = i97;
                                i29 = i95;
                            }
                        } else {
                            i29 = i95;
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldF4);
                        if ((iCharAt11 & 4096) != 0 || i85 > 17) {
                            iObjectFieldOffset2 = 1048575;
                            i31 = i28;
                            i32 = 0;
                        } else {
                            i31 = i28 + 1;
                            int iCharAt13 = str.charAt(i28);
                            if (iCharAt13 >= 55296) {
                                int i100 = iCharAt13 & 8191;
                                int i101 = 13;
                                while (true) {
                                    i33 = i31 + 1;
                                    cCharAt9 = str.charAt(i31);
                                    if (cCharAt9 < 55296) {
                                        break;
                                    }
                                    i100 |= (cCharAt9 & 8191) << i101;
                                    i101 += 13;
                                    i31 = i33;
                                }
                                iCharAt13 = i100 | (cCharAt9 << i101);
                                i31 = i33;
                            }
                            int i102 = (iCharAt13 / 32) + (i86 * 2);
                            Object obj3 = objArr[i102];
                            if (obj3 instanceof Field) {
                                fieldF = (Field) obj3;
                            } else {
                                fieldF = F(cls, (String) obj3);
                                objArr[i102] = fieldF;
                            }
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldF);
                            i32 = iCharAt13 % 32;
                        }
                        if (i85 >= 18 && i85 <= 49) {
                            iArr[i71] = iObjectFieldOffset;
                            i71++;
                        }
                    }
                    i30 = i34;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldF4);
                    if ((iCharAt11 & 4096) != 0) {
                        iObjectFieldOffset2 = 1048575;
                        i31 = i28;
                        i32 = 0;
                    } else {
                        iObjectFieldOffset2 = 1048575;
                        i31 = i28;
                        i32 = 0;
                    }
                    if (i85 >= 18) {
                        iArr[i71] = iObjectFieldOffset;
                        i71++;
                    }
                }
                i30 = i96;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldF4);
                if ((iCharAt11 & 4096) != 0) {
                    iObjectFieldOffset2 = 1048575;
                    i31 = i28;
                    i32 = 0;
                } else {
                    iObjectFieldOffset2 = 1048575;
                    i31 = i28;
                    i32 = 0;
                }
                if (i85 >= 18) {
                    iArr[i71] = iObjectFieldOffset;
                    i71++;
                }
            }
            int i103 = i73 + 1;
            iArr4[i73] = i84;
            int i104 = i73 + 2;
            int i105 = i73;
            iArr4[i103] = ((iCharAt11 & 512) != 0 ? 536870912 : 0) | ((iCharAt11 & 256) != 0 ? 268435456 : 0) | ((iCharAt11 & 2048) != 0 ? Integer.MIN_VALUE : 0) | (i85 << 20) | iObjectFieldOffset;
            i73 = i105 + 3;
            iArr4[i104] = (i32 << 20) | iObjectFieldOffset2;
            objArr3 = objArr3;
            i41 = i31;
            length = i76;
            iArr3 = iArr4;
            objArr2 = objArr;
            i70 = i29;
            i16 = i30;
            i14 = i86;
            str = str;
        }
        a aVar = v0Var.f2004a;
        v0Var.a();
        return new n0(iArr3, objArr3, i12, i15, aVar, iArr, i17, i70, p0Var, d0Var, y0Var, oVar, j0Var);
    }

    public static long x(int i11) {
        return i11 & 1048575;
    }

    public static int y(long j11, Object obj) {
        return ((Integer) f1.f1926c.h(j11, obj)).intValue();
    }

    public static long z(long j11, Object obj) {
        return ((Long) f1.f1926c.h(j11, obj)).longValue();
    }

    public final int A(int i11) {
        if (i11 >= this.f1974c && i11 <= this.f1975d) {
            int[] iArr = this.f1972a;
            int length = (iArr.length / 3) - 1;
            int i12 = 0;
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
        }
        return -1;
    }

    public final void B(Object obj, long j11, k kVar, w0 w0Var, n nVar) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iA;
        this.f1982k.getClass();
        a0 a0VarA = d0.a(j11, obj);
        androidx.datastore.preferences.protobuf.l lVar = kVar.f1952a;
        int i11 = kVar.f1953b;
        if ((i11 & 7) != 3) {
            throw InvalidProtocolBufferException.b();
        }
        do {
            x xVarD = w0Var.d();
            kVar.b(xVarD, w0Var, nVar);
            w0Var.b(xVarD);
            ((u0) a0VarA).add(xVarD);
            if (lVar.c() || kVar.f1955d != 0) {
                return;
            } else {
                iA = lVar.A();
            }
        } while (iA == i11);
        kVar.f1955d = iA;
    }

    public final void C(Object obj, int i11, k kVar, w0 w0Var, n nVar) throws InvalidProtocolBufferException {
        int iA;
        this.f1982k.getClass();
        a0 a0VarA = d0.a(i11 & 1048575, obj);
        androidx.datastore.preferences.protobuf.l lVar = kVar.f1952a;
        int i12 = kVar.f1953b;
        if ((i12 & 7) != 2) {
            throw InvalidProtocolBufferException.b();
        }
        do {
            x xVarD = w0Var.d();
            kVar.c(xVarD, w0Var, nVar);
            w0Var.b(xVarD);
            ((u0) a0VarA).add(xVarD);
            if (lVar.c() || kVar.f1955d != 0) {
                return;
            } else {
                iA = lVar.A();
            }
        } while (iA == i12);
        kVar.f1955d = iA;
    }

    public final void D(int i11, k kVar, Object obj) throws InvalidProtocolBufferException.InvalidWireTypeException {
        if ((536870912 & i11) != 0) {
            kVar.v(2);
            f1.o(obj, i11 & 1048575, kVar.f1952a.z());
        } else if (!this.f1977f) {
            f1.o(obj, i11 & 1048575, kVar.e());
        } else {
            kVar.v(2);
            f1.o(obj, i11 & 1048575, kVar.f1952a.y());
        }
    }

    public final void E(int i11, k kVar, Object obj) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int i12 = 536870912 & i11;
        d0 d0Var = this.f1982k;
        if (i12 != 0) {
            d0Var.getClass();
            kVar.r(d0.a(i11 & 1048575, obj), true);
        } else {
            d0Var.getClass();
            kVar.r(d0.a(i11 & 1048575, obj), false);
        }
    }

    public final void G(int i11, Object obj) {
        int i12 = this.f1972a[i11 + 2];
        long j11 = 1048575 & i12;
        if (j11 == 1048575) {
            return;
        }
        f1.m(j11, obj, (1 << (i12 >>> 20)) | f1.f1926c.f(j11, obj));
    }

    public final void H(int i11, int i12, Object obj) {
        f1.m(this.f1972a[i12 + 2] & 1048575, obj, i11);
    }

    public final void I(Object obj, int i11, a aVar) {
        f1971o.putObject(obj, L(i11) & 1048575, aVar);
        G(i11, obj);
    }

    public final void J(Object obj, int i11, int i12, a aVar) {
        f1971o.putObject(obj, L(i12) & 1048575, aVar);
        H(i11, i12, obj);
    }

    public final int L(int i11) {
        return this.f1972a[i11 + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void M(Object obj, h0 h0Var) throws IOException {
        int i11;
        boolean z11;
        n0 n0Var = this;
        int[] iArr = n0Var.f1972a;
        int length = iArr.length;
        Unsafe unsafe = f1971o;
        int i12 = 1048575;
        int i13 = 1048575;
        int i14 = 0;
        int i15 = 0;
        while (i14 < length) {
            int iL = n0Var.L(i14);
            int i16 = iArr[i14];
            int iK = K(iL);
            if (iK <= 17) {
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
            long j11 = iL & i12;
            switch (iK) {
                case 0:
                    if (n0Var.o(obj, i14, i13, i15, i11)) {
                        double d5 = f1.f1926c.d(j11, obj);
                        l lVar = (l) h0Var.f1938a;
                        lVar.getClass();
                        lVar.k0(i16, Double.doubleToRawLongBits(d5));
                    }
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 1:
                    if (n0Var.o(obj, i14, i13, i15, i11)) {
                        float fE = f1.f1926c.e(j11, obj);
                        l lVar2 = (l) h0Var.f1938a;
                        lVar2.getClass();
                        lVar2.i0(i16, Float.floatToRawIntBits(fE));
                    }
                    n0Var = this;
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 2:
                    if (n0Var.o(obj, i14, i13, i15, i11)) {
                        ((l) h0Var.f1938a).t0(i16, unsafe.getLong(obj, j11));
                    }
                    n0Var = this;
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 3:
                    if (n0Var.o(obj, i14, i13, i15, i11)) {
                        ((l) h0Var.f1938a).t0(i16, unsafe.getLong(obj, j11));
                    }
                    n0Var = this;
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 4:
                    if (n0Var.o(obj, i14, i13, i15, i11)) {
                        ((l) h0Var.f1938a).m0(i16, unsafe.getInt(obj, j11));
                    }
                    n0Var = this;
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 5:
                    if (n0Var.o(obj, i14, i13, i15, i11)) {
                        ((l) h0Var.f1938a).k0(i16, unsafe.getLong(obj, j11));
                    }
                    n0Var = this;
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 6:
                    if (n0Var.o(obj, i14, i13, i15, i11)) {
                        ((l) h0Var.f1938a).i0(i16, unsafe.getInt(obj, j11));
                    }
                    n0Var = this;
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 7:
                    if (n0Var.o(obj, i14, i13, i15, i11)) {
                        ((l) h0Var.f1938a).g0(i16, f1.f1926c.c(j11, obj));
                    }
                    n0Var = this;
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 8:
                    if (n0Var.o(obj, i14, i13, i15, i11)) {
                        N(i16, unsafe.getObject(obj, j11), h0Var);
                    }
                    n0Var = this;
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 9:
                    if (n0Var.o(obj, i14, i13, i15, i11)) {
                        ((l) h0Var.f1938a).o0(i16, (a) unsafe.getObject(obj, j11), n0Var.m(i14));
                    }
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 10:
                    if (n0Var.o(obj, i14, i13, i15, i11)) {
                        h0Var.a(i16, (h) unsafe.getObject(obj, j11));
                    }
                    n0Var = this;
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 11:
                    if (n0Var.o(obj, i14, i13, i15, i11)) {
                        ((l) h0Var.f1938a).r0(i16, unsafe.getInt(obj, j11));
                    }
                    n0Var = this;
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 12:
                    if (n0Var.o(obj, i14, i13, i15, i11)) {
                        ((l) h0Var.f1938a).m0(i16, unsafe.getInt(obj, j11));
                    }
                    n0Var = this;
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 13:
                    if (n0Var.o(obj, i14, i13, i15, i11)) {
                        ((l) h0Var.f1938a).i0(i16, unsafe.getInt(obj, j11));
                    }
                    n0Var = this;
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 14:
                    if (n0Var.o(obj, i14, i13, i15, i11)) {
                        ((l) h0Var.f1938a).k0(i16, unsafe.getLong(obj, j11));
                    }
                    n0Var = this;
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 15:
                    if (n0Var.o(obj, i14, i13, i15, i11)) {
                        int i19 = unsafe.getInt(obj, j11);
                        ((l) h0Var.f1938a).r0(i16, (i19 >> 31) ^ (i19 << 1));
                    }
                    n0Var = this;
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 16:
                    if (n0Var.o(obj, i14, i13, i15, i11)) {
                        long j12 = unsafe.getLong(obj, j11);
                        ((l) h0Var.f1938a).t0(i16, (j12 >> 63) ^ (j12 << 1));
                    }
                    n0Var = this;
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 17:
                    if (n0Var.o(obj, i14, i13, i15, i11)) {
                        h0Var.b(i16, unsafe.getObject(obj, j11), n0Var.m(i14));
                    }
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 18:
                    x0.o(iArr[i14], (List) unsafe.getObject(obj, j11), h0Var, false);
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 19:
                    x0.s(iArr[i14], (List) unsafe.getObject(obj, j11), h0Var, false);
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 20:
                    x0.v(iArr[i14], (List) unsafe.getObject(obj, j11), h0Var, false);
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 21:
                    x0.D(iArr[i14], (List) unsafe.getObject(obj, j11), h0Var, false);
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 22:
                    x0.u(iArr[i14], (List) unsafe.getObject(obj, j11), h0Var, false);
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 23:
                    x0.r(iArr[i14], (List) unsafe.getObject(obj, j11), h0Var, false);
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case Service.METRICS_FIELD_NUMBER /* 24 */:
                    x0.q(iArr[i14], (List) unsafe.getObject(obj, j11), h0Var, false);
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                    x0.m(iArr[i14], (List) unsafe.getObject(obj, j11), h0Var, false);
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case Service.BILLING_FIELD_NUMBER /* 26 */:
                    x0.B(iArr[i14], (List) unsafe.getObject(obj, j11), h0Var);
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 27:
                    x0.w(iArr[i14], (List) unsafe.getObject(obj, j11), h0Var, n0Var.m(i14));
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case Service.MONITORING_FIELD_NUMBER /* 28 */:
                    x0.n(iArr[i14], (List) unsafe.getObject(obj, j11), h0Var);
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
                    z11 = false;
                    x0.C(iArr[i14], (List) unsafe.getObject(obj, j11), h0Var, false);
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 30:
                    z11 = false;
                    x0.p(iArr[i14], (List) unsafe.getObject(obj, j11), h0Var, false);
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 31:
                    z11 = false;
                    x0.x(iArr[i14], (List) unsafe.getObject(obj, j11), h0Var, false);
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case Consts.SP /* 32 */:
                    z11 = false;
                    x0.y(iArr[i14], (List) unsafe.getObject(obj, j11), h0Var, false);
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 33:
                    z11 = false;
                    x0.z(iArr[i14], (List) unsafe.getObject(obj, j11), h0Var, false);
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                    z11 = false;
                    x0.A(iArr[i14], (List) unsafe.getObject(obj, j11), h0Var, false);
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 35:
                    x0.o(iArr[i14], (List) unsafe.getObject(obj, j11), h0Var, true);
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    x0.s(iArr[i14], (List) unsafe.getObject(obj, j11), h0Var, true);
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 37:
                    x0.v(iArr[i14], (List) unsafe.getObject(obj, j11), h0Var, true);
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 38:
                    x0.D(iArr[i14], (List) unsafe.getObject(obj, j11), h0Var, true);
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    x0.u(iArr[i14], (List) unsafe.getObject(obj, j11), h0Var, true);
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                    x0.r(iArr[i14], (List) unsafe.getObject(obj, j11), h0Var, true);
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                    x0.q(iArr[i14], (List) unsafe.getObject(obj, j11), h0Var, true);
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                    x0.m(iArr[i14], (List) unsafe.getObject(obj, j11), h0Var, true);
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 43:
                    x0.C(iArr[i14], (List) unsafe.getObject(obj, j11), h0Var, true);
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                    x0.p(iArr[i14], (List) unsafe.getObject(obj, j11), h0Var, true);
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                    x0.x(iArr[i14], (List) unsafe.getObject(obj, j11), h0Var, true);
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 46:
                    x0.y(iArr[i14], (List) unsafe.getObject(obj, j11), h0Var, true);
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 47:
                    x0.z(iArr[i14], (List) unsafe.getObject(obj, j11), h0Var, true);
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 48:
                    x0.A(iArr[i14], (List) unsafe.getObject(obj, j11), h0Var, true);
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 49:
                    x0.t(iArr[i14], (List) unsafe.getObject(obj, j11), h0Var, n0Var.m(i14));
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 50:
                    if (unsafe.getObject(obj, j11) != null) {
                        Object obj2 = n0Var.f1973b[(i14 / 3) * 2];
                        n0Var.m.getClass();
                        hh.p0.z(obj2);
                        throw null;
                    }
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 51:
                    if (n0Var.q(i16, i14, obj)) {
                        double dDoubleValue = ((Double) f1.f1926c.h(j11, obj)).doubleValue();
                        l lVar3 = (l) h0Var.f1938a;
                        lVar3.getClass();
                        lVar3.k0(i16, Double.doubleToRawLongBits(dDoubleValue));
                    }
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 52:
                    if (n0Var.q(i16, i14, obj)) {
                        float fFloatValue = ((Float) f1.f1926c.h(j11, obj)).floatValue();
                        l lVar4 = (l) h0Var.f1938a;
                        lVar4.getClass();
                        lVar4.i0(i16, Float.floatToRawIntBits(fFloatValue));
                    }
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 53:
                    if (n0Var.q(i16, i14, obj)) {
                        ((l) h0Var.f1938a).t0(i16, z(j11, obj));
                    }
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 54:
                    if (n0Var.q(i16, i14, obj)) {
                        ((l) h0Var.f1938a).t0(i16, z(j11, obj));
                    }
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 55:
                    if (n0Var.q(i16, i14, obj)) {
                        ((l) h0Var.f1938a).m0(i16, y(j11, obj));
                    }
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 56:
                    if (n0Var.q(i16, i14, obj)) {
                        ((l) h0Var.f1938a).k0(i16, z(j11, obj));
                    }
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 57:
                    if (n0Var.q(i16, i14, obj)) {
                        ((l) h0Var.f1938a).i0(i16, y(j11, obj));
                    }
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 58:
                    if (n0Var.q(i16, i14, obj)) {
                        ((l) h0Var.f1938a).g0(i16, ((Boolean) f1.f1926c.h(j11, obj)).booleanValue());
                    }
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 59:
                    if (n0Var.q(i16, i14, obj)) {
                        N(i16, unsafe.getObject(obj, j11), h0Var);
                    }
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 60:
                    if (n0Var.q(i16, i14, obj)) {
                        ((l) h0Var.f1938a).o0(i16, (a) unsafe.getObject(obj, j11), n0Var.m(i14));
                    }
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 61:
                    if (n0Var.q(i16, i14, obj)) {
                        h0Var.a(i16, (h) unsafe.getObject(obj, j11));
                    }
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 62:
                    if (n0Var.q(i16, i14, obj)) {
                        ((l) h0Var.f1938a).r0(i16, y(j11, obj));
                    }
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 63:
                    if (n0Var.q(i16, i14, obj)) {
                        ((l) h0Var.f1938a).m0(i16, y(j11, obj));
                    }
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 64:
                    if (n0Var.q(i16, i14, obj)) {
                        ((l) h0Var.f1938a).i0(i16, y(j11, obj));
                    }
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 65:
                    if (n0Var.q(i16, i14, obj)) {
                        ((l) h0Var.f1938a).k0(i16, z(j11, obj));
                    }
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 66:
                    if (n0Var.q(i16, i14, obj)) {
                        int iY = y(j11, obj);
                        ((l) h0Var.f1938a).r0(i16, (iY >> 31) ^ (iY << 1));
                    }
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 67:
                    if (n0Var.q(i16, i14, obj)) {
                        long jZ = z(j11, obj);
                        ((l) h0Var.f1938a).t0(i16, (jZ << 1) ^ (jZ >> 63));
                    }
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 68:
                    if (n0Var.q(i16, i14, obj)) {
                        h0Var.b(i16, unsafe.getObject(obj, j11), n0Var.m(i14));
                    }
                    i14 += 3;
                    i12 = 1048575;
                    break;
                default:
                    i14 += 3;
                    i12 = 1048575;
                    break;
            }
        }
        ((a1) n0Var.f1983l).getClass();
        ((x) obj).unknownFields.d(h0Var);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:11:0x0025  */
    @Override // androidx.glance.appwidget.protobuf.w0
    public final void a(Object obj, Object obj2) {
        Object obj3;
        if (!p(obj)) {
            throw new IllegalArgumentException(hh.p0.k(obj, "Mutating immutable message: "));
        }
        obj2.getClass();
        int i11 = 0;
        while (true) {
            int[] iArr = this.f1972a;
            if (i11 >= iArr.length) {
                x0.k(this.f1983l, obj, obj2);
                return;
            }
            int iL = L(i11);
            long j11 = 1048575 & iL;
            int i12 = iArr[i11];
            switch (K(iL)) {
                case 0:
                    if (!n(i11, obj2)) {
                        obj3 = obj;
                    } else {
                        e1 e1Var = f1.f1926c;
                        obj3 = obj;
                        e1Var.l(obj3, j11, e1Var.d(j11, obj2));
                        G(i11, obj3);
                    }
                    break;
                case 1:
                    if (n(i11, obj2)) {
                        e1 e1Var2 = f1.f1926c;
                        e1Var2.m(obj, j11, e1Var2.e(j11, obj2));
                        G(i11, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (n(i11, obj2)) {
                        f1.n(obj, j11, f1.f1926c.g(j11, obj2));
                        G(i11, obj);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (n(i11, obj2)) {
                        f1.n(obj, j11, f1.f1926c.g(j11, obj2));
                        G(i11, obj);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (n(i11, obj2)) {
                        f1.m(j11, obj, f1.f1926c.f(j11, obj2));
                        G(i11, obj);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (n(i11, obj2)) {
                        f1.n(obj, j11, f1.f1926c.g(j11, obj2));
                        G(i11, obj);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (n(i11, obj2)) {
                        f1.m(j11, obj, f1.f1926c.f(j11, obj2));
                        G(i11, obj);
                    }
                    obj3 = obj;
                    break;
                case 7:
                    if (n(i11, obj2)) {
                        e1 e1Var3 = f1.f1926c;
                        e1Var3.j(obj, j11, e1Var3.c(j11, obj2));
                        G(i11, obj);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (n(i11, obj2)) {
                        f1.o(obj, j11, f1.f1926c.h(j11, obj2));
                        G(i11, obj);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    s(i11, obj, obj2);
                    obj3 = obj;
                    break;
                case 10:
                    if (n(i11, obj2)) {
                        f1.o(obj, j11, f1.f1926c.h(j11, obj2));
                        G(i11, obj);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (n(i11, obj2)) {
                        f1.m(j11, obj, f1.f1926c.f(j11, obj2));
                        G(i11, obj);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (n(i11, obj2)) {
                        f1.m(j11, obj, f1.f1926c.f(j11, obj2));
                        G(i11, obj);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (n(i11, obj2)) {
                        f1.m(j11, obj, f1.f1926c.f(j11, obj2));
                        G(i11, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (n(i11, obj2)) {
                        f1.n(obj, j11, f1.f1926c.g(j11, obj2));
                        G(i11, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (n(i11, obj2)) {
                        f1.m(j11, obj, f1.f1926c.f(j11, obj2));
                        G(i11, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (n(i11, obj2)) {
                        f1.n(obj, j11, f1.f1926c.g(j11, obj2));
                        G(i11, obj);
                    }
                    obj3 = obj;
                    break;
                case 17:
                    s(i11, obj, obj2);
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
                    this.f1982k.getClass();
                    e1 e1Var4 = f1.f1926c;
                    a0 a0VarE = (a0) e1Var4.h(j11, obj);
                    a0 a0Var = (a0) e1Var4.h(j11, obj2);
                    u0 u0Var = (u0) a0VarE;
                    int i13 = u0Var.f2003c;
                    int i14 = ((u0) a0Var).f2003c;
                    if (i13 > 0 && i14 > 0) {
                        if (!((b) a0VarE).f1911a) {
                            a0VarE = u0Var.e(i14 + i13);
                        }
                        ((b) a0VarE).addAll(a0Var);
                    }
                    if (i13 > 0) {
                        a0Var = a0VarE;
                    }
                    f1.o(obj, j11, a0Var);
                    obj3 = obj;
                    break;
                case 50:
                    Class cls = x0.f2008a;
                    e1 e1Var5 = f1.f1926c;
                    Object objH = e1Var5.h(j11, obj);
                    Object objH2 = e1Var5.h(j11, obj2);
                    this.m.getClass();
                    f1.o(obj, j11, j0.a(objH, objH2));
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
                    if (q(i12, i11, obj2)) {
                        f1.o(obj, j11, f1.f1926c.h(j11, obj2));
                        H(i12, i11, obj);
                    }
                    obj3 = obj;
                    break;
                case 60:
                    t(i11, obj, obj2);
                    obj3 = obj;
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (q(i12, i11, obj2)) {
                        f1.o(obj, j11, f1.f1926c.h(j11, obj2));
                        H(i12, i11, obj);
                    }
                    obj3 = obj;
                    break;
                case 68:
                    t(i11, obj, obj2);
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

    /* JADX WARN: Code duplicated, block: B:27:0x0080  */
    /* JADX WARN: Code duplicated, block: B:29:0x0086  */
    /* JADX WARN: Code duplicated, block: B:43:0x0093 A[SYNTHETIC] */
    @Override // androidx.glance.appwidget.protobuf.w0
    public final void b(Object obj) {
        if (p(obj)) {
            if (obj instanceof x) {
                x xVar = (x) obj;
                xVar.j(Integer.MAX_VALUE);
                xVar.memoizedHashCode = 0;
                xVar.g();
            }
            int[] iArr = this.f1972a;
            int length = iArr.length;
            for (int i11 = 0; i11 < length; i11 += 3) {
                int iL = L(i11);
                long j11 = 1048575 & iL;
                int iK = K(iL);
                if (iK != 9) {
                    if (iK != 60 && iK != 68) {
                        switch (iK) {
                            case 17:
                                if (n(i11, obj)) {
                                    m(i11).b(f1971o.getObject(obj, j11));
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
                                this.f1982k.getClass();
                                b bVar = (b) ((a0) f1.f1926c.h(j11, obj));
                                if (bVar.f1911a) {
                                    bVar.f1911a = false;
                                }
                                break;
                            case 50:
                                Unsafe unsafe = f1971o;
                                Object object = unsafe.getObject(obj, j11);
                                if (object != null) {
                                    this.m.getClass();
                                    ((i0) object).f1945a = false;
                                    unsafe.putObject(obj, j11, object);
                                }
                                break;
                        }
                    } else if (q(iArr[i11], i11, obj)) {
                        m(i11).b(f1971o.getObject(obj, j11));
                    }
                } else if (n(i11, obj)) {
                    m(i11).b(f1971o.getObject(obj, j11));
                }
            }
            ((a1) this.f1983l).getClass();
            z0 z0Var = ((x) obj).unknownFields;
            if (z0Var.f2016e) {
                z0Var.f2016e = false;
            }
        }
    }

    @Override // androidx.glance.appwidget.protobuf.w0
    public final boolean c(Object obj) {
        int i11;
        int i12;
        int i13 = 1048575;
        int i14 = 0;
        int i15 = 0;
        while (i15 < this.f1979h) {
            int i16 = this.f1978g[i15];
            int[] iArr = this.f1972a;
            int i17 = iArr[i16];
            int iL = L(i16);
            int i18 = iArr[i16 + 2];
            int i19 = i18 & 1048575;
            int i21 = 1 << (i18 >>> 20);
            if (i19 != i13) {
                if (i19 != 1048575) {
                    i14 = f1971o.getInt(obj, i19);
                }
                i12 = i14;
                i11 = i19;
            } else {
                int i22 = i14;
                i11 = i13;
                i12 = i22;
            }
            if ((268435456 & iL) == 0 || o(obj, i16, i11, i12, i21)) {
                int iK = K(iL);
                if (iK == 9 || iK == 17) {
                    if (o(obj, i16, i11, i12, i21)) {
                        if (!m(i16).c(f1.f1926c.h(iL & 1048575, obj))) {
                        }
                    } else {
                        continue;
                    }
                    i15++;
                    i13 = i11;
                    i14 = i12;
                } else {
                    if (iK != 27) {
                        if (iK == 60 || iK == 68) {
                            if (q(i17, i16, obj)) {
                                if (!m(i16).c(f1.f1926c.h(iL & 1048575, obj))) {
                                }
                            } else {
                                continue;
                            }
                        } else if (iK != 49) {
                            if (iK != 50) {
                                continue;
                            } else {
                                Object objH = f1.f1926c.h(iL & 1048575, obj);
                                this.m.getClass();
                                if (!((i0) objH).isEmpty()) {
                                    hh.p0.z(this.f1973b[(i16 / 3) * 2]);
                                    throw null;
                                }
                            }
                        }
                        i15++;
                        i13 = i11;
                        i14 = i12;
                    }
                    List list = (List) f1.f1926c.h(iL & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        w0 w0VarM = m(i16);
                        for (int i23 = 0; i23 < list.size(); i23++) {
                            if (w0VarM.c(list.get(i23))) {
                            }
                        }
                    }
                    i15++;
                    i13 = i11;
                    i14 = i12;
                }
            }
            return false;
        }
        return true;
    }

    @Override // androidx.glance.appwidget.protobuf.w0
    public final x d() {
        this.f1981j.getClass();
        return ((x) this.f1976e).h();
    }

    /* JADX WARN: Code duplicated, block: B:150:0x0383  */
    @Override // androidx.glance.appwidget.protobuf.w0
    public final int e(x xVar) {
        int i11;
        int iA0;
        int iA1;
        int iA2;
        int iC0;
        int iA3;
        int iC1;
        int iA4;
        int iA5;
        int iA6;
        int iA;
        int iB0;
        int iY;
        int iA7;
        int iA8;
        int iC;
        int iA9;
        int size;
        int i12;
        int iA10;
        int iA11;
        int size2;
        int iA12;
        int iB1;
        int iA13;
        int iA14;
        int iA15;
        int iC2;
        int iA16;
        int iC3;
        int i13;
        n0 n0Var = this;
        x xVar2 = xVar;
        Unsafe unsafe = f1971o;
        int i14 = 0;
        int i15 = 0;
        int iY2 = 0;
        int i16 = 1048575;
        while (true) {
            int[] iArr = n0Var.f1972a;
            if (i14 >= iArr.length) {
                ((a1) n0Var.f1983l).getClass();
                return xVar2.unknownFields.b() + iY2;
            }
            int iL = n0Var.L(i14);
            int iK = K(iL);
            int i17 = iArr[i14];
            int i18 = iArr[i14 + 2];
            int i19 = i18 & 1048575;
            if (iK <= 17) {
                if (i19 != i16) {
                    i15 = i19 == 1048575 ? 0 : unsafe.getInt(xVar2, i19);
                    i16 = i19;
                }
                i11 = 1 << (i18 >>> 20);
            } else {
                i11 = 0;
            }
            long j11 = iL & 1048575;
            if (iK >= s.DOUBLE_LIST_PACKED.a()) {
                s.SINT64_LIST_PACKED.a();
            }
            switch (iK) {
                case 0:
                    if (n0Var.o(xVar2, i14, i16, i15, i11)) {
                        iA0 = l.a0(i17);
                        iC = iA0 + 8;
                        iY2 += iC;
                    }
                    i14 += 3;
                    break;
                case 1:
                    if (n0Var.o(xVar2, i14, i16, i15, i11)) {
                        iA1 = l.a0(i17);
                        iA5 = iA1 + 4;
                        iY2 += iA5;
                    }
                    n0Var = this;
                    xVar2 = xVar;
                    i14 += 3;
                    break;
                case 2:
                    if (n0Var.o(xVar2, i14, i16, i15, i11)) {
                        long j12 = unsafe.getLong(xVar2, j11);
                        iA2 = l.a0(i17);
                        iC0 = l.c0(j12);
                        iY2 += iC0 + iA2;
                    }
                    n0Var = this;
                    i14 += 3;
                    break;
                case 3:
                    if (n0Var.o(xVar2, i14, i16, i15, i11)) {
                        long j13 = unsafe.getLong(xVar2, j11);
                        iA2 = l.a0(i17);
                        iC0 = l.c0(j13);
                        iY2 += iC0 + iA2;
                    }
                    n0Var = this;
                    i14 += 3;
                    break;
                case 4:
                    if (n0Var.o(xVar2, i14, i16, i15, i11)) {
                        int i21 = unsafe.getInt(xVar2, j11);
                        iA3 = l.a0(i17);
                        iC1 = l.c0(i21);
                        iY = iC1 + iA3;
                        iY2 += iY;
                    }
                    n0Var = this;
                    i14 += 3;
                    break;
                case 5:
                    if (n0Var.o(xVar2, i14, i16, i15, i11)) {
                        iA4 = l.a0(i17);
                        iA5 = iA4 + 8;
                        iY2 += iA5;
                    }
                    n0Var = this;
                    xVar2 = xVar;
                    i14 += 3;
                    break;
                case 6:
                    if (n0Var.o(xVar2, i14, i16, i15, i11)) {
                        iA1 = l.a0(i17);
                        iA5 = iA1 + 4;
                        iY2 += iA5;
                    }
                    n0Var = this;
                    xVar2 = xVar;
                    i14 += 3;
                    break;
                case 7:
                    if (n0Var.o(xVar2, i14, i16, i15, i11)) {
                        iA5 = l.a0(i17) + 1;
                        iY2 += iA5;
                    }
                    n0Var = this;
                    xVar2 = xVar;
                    i14 += 3;
                    break;
                case 8:
                    if (n0Var.o(xVar2, i14, i16, i15, i11)) {
                        Object object = unsafe.getObject(xVar2, j11);
                        iY2 = (object instanceof h ? l.Y(i17, (h) object) : l.Z((String) object) + l.a0(i17)) + iY2;
                    }
                    n0Var = this;
                    i14 += 3;
                    break;
                case 9:
                    if (n0Var.o(xVar2, i14, i16, i15, i11)) {
                        Object object2 = unsafe.getObject(xVar2, j11);
                        w0 w0VarM = n0Var.m(i14);
                        Class cls = x0.f2008a;
                        iA6 = l.a0(i17);
                        iA = ((a) object2).a(w0VarM);
                        iB0 = l.b0(iA);
                        i13 = iB0 + iA + iA6;
                        iY2 += i13;
                    }
                    i14 += 3;
                    break;
                case 10:
                    if (n0Var.o(xVar2, i14, i16, i15, i11)) {
                        iY = l.Y(i17, (h) unsafe.getObject(xVar2, j11));
                        iY2 += iY;
                    }
                    n0Var = this;
                    i14 += 3;
                    break;
                case 11:
                    if (n0Var.o(xVar2, i14, i16, i15, i11)) {
                        int i22 = unsafe.getInt(xVar2, j11);
                        iA3 = l.a0(i17);
                        iC1 = l.b0(i22);
                        iY = iC1 + iA3;
                        iY2 += iY;
                    }
                    n0Var = this;
                    i14 += 3;
                    break;
                case 12:
                    if (n0Var.o(xVar2, i14, i16, i15, i11)) {
                        int i23 = unsafe.getInt(xVar2, j11);
                        iA3 = l.a0(i17);
                        iC1 = l.c0(i23);
                        iY = iC1 + iA3;
                        iY2 += iY;
                    }
                    n0Var = this;
                    i14 += 3;
                    break;
                case 13:
                    if (n0Var.o(xVar2, i14, i16, i15, i11)) {
                        iA1 = l.a0(i17);
                        iA5 = iA1 + 4;
                        iY2 += iA5;
                    }
                    n0Var = this;
                    xVar2 = xVar;
                    i14 += 3;
                    break;
                case 14:
                    if (n0Var.o(xVar2, i14, i16, i15, i11)) {
                        iA4 = l.a0(i17);
                        iA5 = iA4 + 8;
                        iY2 += iA5;
                    }
                    n0Var = this;
                    xVar2 = xVar;
                    i14 += 3;
                    break;
                case 15:
                    if (n0Var.o(xVar2, i14, i16, i15, i11)) {
                        int i24 = unsafe.getInt(xVar2, j11);
                        iA3 = l.a0(i17);
                        iC1 = l.b0((i24 >> 31) ^ (i24 << 1));
                        iY = iC1 + iA3;
                        iY2 += iY;
                    }
                    n0Var = this;
                    i14 += 3;
                    break;
                case 16:
                    if (n0Var.o(xVar2, i14, i16, i15, i11)) {
                        long j14 = unsafe.getLong(xVar2, j11);
                        iA2 = l.a0(i17);
                        iC0 = l.c0((j14 << 1) ^ (j14 >> 63));
                        iY2 += iC0 + iA2;
                    }
                    n0Var = this;
                    i14 += 3;
                    break;
                case 17:
                    if (n0Var.o(xVar2, i14, i16, i15, i11)) {
                        a aVar = (a) unsafe.getObject(xVar2, j11);
                        w0 w0VarM2 = n0Var.m(i14);
                        iA7 = l.a0(i17) * 2;
                        iA8 = aVar.a(w0VarM2);
                        iC = iA8 + iA7;
                        iY2 += iC;
                    }
                    i14 += 3;
                    break;
                case 18:
                    iC = x0.c(i17, (List) unsafe.getObject(xVar2, j11));
                    iY2 += iC;
                    i14 += 3;
                    break;
                case 19:
                    iC = x0.b(i17, (List) unsafe.getObject(xVar2, j11));
                    iY2 += iC;
                    i14 += 3;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(xVar2, j11);
                    Class cls2 = x0.f2008a;
                    if (list.size() == 0) {
                        iA9 = 0;
                    } else {
                        iA9 = (l.a0(i17) * list.size()) + x0.e(list);
                    }
                    iY2 += iA9;
                    i14 += 3;
                    break;
                case 21:
                    List list2 = (List) unsafe.getObject(xVar2, j11);
                    Class cls3 = x0.f2008a;
                    size = list2.size();
                    if (size == 0) {
                        iA9 = 0;
                    } else {
                        i12 = x0.i(list2);
                        iA10 = l.a0(i17);
                        iA9 = (iA10 * size) + i12;
                    }
                    iY2 += iA9;
                    i14 += 3;
                    break;
                case 22:
                    List list3 = (List) unsafe.getObject(xVar2, j11);
                    Class cls4 = x0.f2008a;
                    size = list3.size();
                    if (size == 0) {
                        iA9 = 0;
                    } else {
                        i12 = x0.d(list3);
                        iA10 = l.a0(i17);
                        iA9 = (iA10 * size) + i12;
                    }
                    iY2 += iA9;
                    i14 += 3;
                    break;
                case 23:
                    iC = x0.c(i17, (List) unsafe.getObject(xVar2, j11));
                    iY2 += iC;
                    i14 += 3;
                    break;
                case Service.METRICS_FIELD_NUMBER /* 24 */:
                    iC = x0.b(i17, (List) unsafe.getObject(xVar2, j11));
                    iY2 += iC;
                    i14 += 3;
                    break;
                case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                    List list4 = (List) unsafe.getObject(xVar2, j11);
                    Class cls5 = x0.f2008a;
                    int size3 = list4.size();
                    iY2 += size3 == 0 ? 0 : (l.a0(i17) + 1) * size3;
                    i14 += 3;
                    break;
                case Service.BILLING_FIELD_NUMBER /* 26 */:
                    List list5 = (List) unsafe.getObject(xVar2, j11);
                    Class cls6 = x0.f2008a;
                    int size4 = list5.size();
                    if (size4 == 0) {
                        iA9 = 0;
                    } else {
                        iA9 = l.a0(i17) * size4;
                        for (int i25 = 0; i25 < size4; i25++) {
                            Object obj = list5.get(i25);
                            if (obj instanceof h) {
                                int size5 = ((h) obj).size();
                                iA9 = l.b0(size5) + size5 + iA9;
                            } else {
                                iA9 = l.Z((String) obj) + iA9;
                            }
                        }
                    }
                    iY2 += iA9;
                    i14 += 3;
                    break;
                case 27:
                    List list6 = (List) unsafe.getObject(xVar2, j11);
                    w0 w0VarM3 = n0Var.m(i14);
                    Class cls7 = x0.f2008a;
                    int size6 = list6.size();
                    if (size6 == 0) {
                        iA11 = 0;
                    } else {
                        iA11 = l.a0(i17) * size6;
                        for (int i26 = 0; i26 < size6; i26++) {
                            int iA17 = ((a) list6.get(i26)).a(w0VarM3);
                            iA11 += l.b0(iA17) + iA17;
                        }
                    }
                    iY2 += iA11;
                    i14 += 3;
                    break;
                case Service.MONITORING_FIELD_NUMBER /* 28 */:
                    List list7 = (List) unsafe.getObject(xVar2, j11);
                    Class cls8 = x0.f2008a;
                    int size7 = list7.size();
                    if (size7 == 0) {
                        iA9 = 0;
                    } else {
                        iA9 = l.a0(i17) * size7;
                        for (int i27 = 0; i27 < list7.size(); i27++) {
                            int size8 = ((h) list7.get(i27)).size();
                            iA9 += l.b0(size8) + size8;
                        }
                    }
                    iY2 += iA9;
                    i14 += 3;
                    break;
                case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
                    List list8 = (List) unsafe.getObject(xVar2, j11);
                    Class cls9 = x0.f2008a;
                    size = list8.size();
                    if (size == 0) {
                        iA9 = 0;
                    } else {
                        i12 = x0.h(list8);
                        iA10 = l.a0(i17);
                        iA9 = (iA10 * size) + i12;
                    }
                    iY2 += iA9;
                    i14 += 3;
                    break;
                case 30:
                    List list9 = (List) unsafe.getObject(xVar2, j11);
                    Class cls10 = x0.f2008a;
                    size = list9.size();
                    if (size == 0) {
                        iA9 = 0;
                    } else {
                        i12 = x0.a(list9);
                        iA10 = l.a0(i17);
                        iA9 = (iA10 * size) + i12;
                    }
                    iY2 += iA9;
                    i14 += 3;
                    break;
                case 31:
                    iC = x0.b(i17, (List) unsafe.getObject(xVar2, j11));
                    iY2 += iC;
                    i14 += 3;
                    break;
                case Consts.SP /* 32 */:
                    iC = x0.c(i17, (List) unsafe.getObject(xVar2, j11));
                    iY2 += iC;
                    i14 += 3;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(xVar2, j11);
                    Class cls11 = x0.f2008a;
                    size = list10.size();
                    if (size == 0) {
                        iA9 = 0;
                    } else {
                        i12 = x0.f(list10);
                        iA10 = l.a0(i17);
                        iA9 = (iA10 * size) + i12;
                    }
                    iY2 += iA9;
                    i14 += 3;
                    break;
                case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                    List list11 = (List) unsafe.getObject(xVar2, j11);
                    Class cls12 = x0.f2008a;
                    size = list11.size();
                    if (size == 0) {
                        iA9 = 0;
                    } else {
                        i12 = x0.g(list11);
                        iA10 = l.a0(i17);
                        iA9 = (iA10 * size) + i12;
                    }
                    iY2 += iA9;
                    i14 += 3;
                    break;
                case 35:
                    List list12 = (List) unsafe.getObject(xVar2, j11);
                    Class cls13 = x0.f2008a;
                    size2 = list12.size() * 8;
                    if (size2 > 0) {
                        iA12 = l.a0(i17);
                        iB1 = l.b0(size2);
                        iY2 += iB1 + iA12 + size2;
                    }
                    i14 += 3;
                    break;
                case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    List list13 = (List) unsafe.getObject(xVar2, j11);
                    Class cls14 = x0.f2008a;
                    size2 = list13.size() * 4;
                    if (size2 > 0) {
                        iA12 = l.a0(i17);
                        iB1 = l.b0(size2);
                        iY2 += iB1 + iA12 + size2;
                    }
                    i14 += 3;
                    break;
                case 37:
                    size2 = x0.e((List) unsafe.getObject(xVar2, j11));
                    if (size2 > 0) {
                        iA12 = l.a0(i17);
                        iB1 = l.b0(size2);
                        iY2 += iB1 + iA12 + size2;
                    }
                    i14 += 3;
                    break;
                case 38:
                    size2 = x0.i((List) unsafe.getObject(xVar2, j11));
                    if (size2 > 0) {
                        iA12 = l.a0(i17);
                        iB1 = l.b0(size2);
                        iY2 += iB1 + iA12 + size2;
                    }
                    i14 += 3;
                    break;
                case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    size2 = x0.d((List) unsafe.getObject(xVar2, j11));
                    if (size2 > 0) {
                        iA12 = l.a0(i17);
                        iB1 = l.b0(size2);
                        iY2 += iB1 + iA12 + size2;
                    }
                    i14 += 3;
                    break;
                case DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                    List list14 = (List) unsafe.getObject(xVar2, j11);
                    Class cls15 = x0.f2008a;
                    size2 = list14.size() * 8;
                    if (size2 > 0) {
                        iA12 = l.a0(i17);
                        iB1 = l.b0(size2);
                        iY2 += iB1 + iA12 + size2;
                    }
                    i14 += 3;
                    break;
                case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                    List list15 = (List) unsafe.getObject(xVar2, j11);
                    Class cls16 = x0.f2008a;
                    size2 = list15.size() * 4;
                    if (size2 > 0) {
                        iA12 = l.a0(i17);
                        iB1 = l.b0(size2);
                        iY2 += iB1 + iA12 + size2;
                    }
                    i14 += 3;
                    break;
                case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                    List list16 = (List) unsafe.getObject(xVar2, j11);
                    Class cls17 = x0.f2008a;
                    size2 = list16.size();
                    if (size2 > 0) {
                        iA12 = l.a0(i17);
                        iB1 = l.b0(size2);
                        iY2 += iB1 + iA12 + size2;
                    }
                    i14 += 3;
                    break;
                case 43:
                    size2 = x0.h((List) unsafe.getObject(xVar2, j11));
                    if (size2 > 0) {
                        iA12 = l.a0(i17);
                        iB1 = l.b0(size2);
                        iY2 += iB1 + iA12 + size2;
                    }
                    i14 += 3;
                    break;
                case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                    size2 = x0.a((List) unsafe.getObject(xVar2, j11));
                    if (size2 > 0) {
                        iA12 = l.a0(i17);
                        iB1 = l.b0(size2);
                        iY2 += iB1 + iA12 + size2;
                    }
                    i14 += 3;
                    break;
                case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                    List list17 = (List) unsafe.getObject(xVar2, j11);
                    Class cls18 = x0.f2008a;
                    size2 = list17.size() * 4;
                    if (size2 > 0) {
                        iA12 = l.a0(i17);
                        iB1 = l.b0(size2);
                        iY2 += iB1 + iA12 + size2;
                    }
                    i14 += 3;
                    break;
                case 46:
                    List list18 = (List) unsafe.getObject(xVar2, j11);
                    Class cls19 = x0.f2008a;
                    size2 = list18.size() * 8;
                    if (size2 > 0) {
                        iA12 = l.a0(i17);
                        iB1 = l.b0(size2);
                        iY2 += iB1 + iA12 + size2;
                    }
                    i14 += 3;
                    break;
                case 47:
                    size2 = x0.f((List) unsafe.getObject(xVar2, j11));
                    if (size2 > 0) {
                        iA12 = l.a0(i17);
                        iB1 = l.b0(size2);
                        iY2 += iB1 + iA12 + size2;
                    }
                    i14 += 3;
                    break;
                case 48:
                    size2 = x0.g((List) unsafe.getObject(xVar2, j11));
                    if (size2 > 0) {
                        iA12 = l.a0(i17);
                        iB1 = l.b0(size2);
                        iY2 += iB1 + iA12 + size2;
                    }
                    i14 += 3;
                    break;
                case 49:
                    List list19 = (List) unsafe.getObject(xVar2, j11);
                    w0 w0VarM4 = n0Var.m(i14);
                    Class cls20 = x0.f2008a;
                    int size9 = list19.size();
                    if (size9 == 0) {
                        iA13 = 0;
                    } else {
                        iA13 = 0;
                        for (int i28 = 0; i28 < size9; i28++) {
                            iA13 += ((a) list19.get(i28)).a(w0VarM4) + (l.a0(i17) * 2);
                        }
                    }
                    iY2 += iA13;
                    i14 += 3;
                    break;
                case 50:
                    Object object3 = unsafe.getObject(xVar2, j11);
                    Object obj2 = n0Var.f1973b[(i14 / 3) * 2];
                    n0Var.m.getClass();
                    i0 i0Var = (i0) object3;
                    if (obj2 != null) {
                        throw new ClassCastException();
                    }
                    if (i0Var.isEmpty()) {
                        continue;
                    } else {
                        Iterator it = i0Var.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            entry.getKey();
                            entry.getValue();
                            throw null;
                        }
                    }
                    i14 += 3;
                    break;
                case 51:
                    if (n0Var.q(i17, i14, xVar2)) {
                        iA0 = l.a0(i17);
                        iC = iA0 + 8;
                        iY2 += iC;
                    }
                    i14 += 3;
                    break;
                case 52:
                    if (n0Var.q(i17, i14, xVar2)) {
                        iA14 = l.a0(i17);
                        iC = iA14 + 4;
                        iY2 += iC;
                    }
                    i14 += 3;
                    break;
                case 53:
                    if (n0Var.q(i17, i14, xVar2)) {
                        long jZ = z(j11, xVar2);
                        iA15 = l.a0(i17);
                        iC2 = l.c0(jZ);
                        i13 = iC2 + iA15;
                        iY2 += i13;
                    }
                    i14 += 3;
                    break;
                case 54:
                    if (n0Var.q(i17, i14, xVar2)) {
                        long jZ2 = z(j11, xVar2);
                        iA15 = l.a0(i17);
                        iC2 = l.c0(jZ2);
                        i13 = iC2 + iA15;
                        iY2 += i13;
                    }
                    i14 += 3;
                    break;
                case 55:
                    if (n0Var.q(i17, i14, xVar2)) {
                        int iY3 = y(j11, xVar2);
                        iA16 = l.a0(i17);
                        iC3 = l.c0(iY3);
                        iC = iC3 + iA16;
                        iY2 += iC;
                    }
                    i14 += 3;
                    break;
                case 56:
                    if (n0Var.q(i17, i14, xVar2)) {
                        iA0 = l.a0(i17);
                        iC = iA0 + 8;
                        iY2 += iC;
                    }
                    i14 += 3;
                    break;
                case 57:
                    if (n0Var.q(i17, i14, xVar2)) {
                        iA14 = l.a0(i17);
                        iC = iA14 + 4;
                        iY2 += iC;
                    }
                    i14 += 3;
                    break;
                case 58:
                    if (n0Var.q(i17, i14, xVar2)) {
                        iC = l.a0(i17) + 1;
                        iY2 += iC;
                    }
                    i14 += 3;
                    break;
                case 59:
                    if (n0Var.q(i17, i14, xVar2)) {
                        Object object4 = unsafe.getObject(xVar2, j11);
                        iY2 = (object4 instanceof h ? l.Y(i17, (h) object4) : l.Z((String) object4) + l.a0(i17)) + iY2;
                    }
                    i14 += 3;
                    break;
                case 60:
                    if (n0Var.q(i17, i14, xVar2)) {
                        Object object5 = unsafe.getObject(xVar2, j11);
                        w0 w0VarM5 = n0Var.m(i14);
                        Class cls21 = x0.f2008a;
                        iA6 = l.a0(i17);
                        iA = ((a) object5).a(w0VarM5);
                        iB0 = l.b0(iA);
                        i13 = iB0 + iA + iA6;
                        iY2 += i13;
                    }
                    i14 += 3;
                    break;
                case 61:
                    if (n0Var.q(i17, i14, xVar2)) {
                        iC = l.Y(i17, (h) unsafe.getObject(xVar2, j11));
                        iY2 += iC;
                    }
                    i14 += 3;
                    break;
                case 62:
                    if (n0Var.q(i17, i14, xVar2)) {
                        int iY4 = y(j11, xVar2);
                        iA16 = l.a0(i17);
                        iC3 = l.b0(iY4);
                        iC = iC3 + iA16;
                        iY2 += iC;
                    }
                    i14 += 3;
                    break;
                case 63:
                    if (n0Var.q(i17, i14, xVar2)) {
                        int iY5 = y(j11, xVar2);
                        iA16 = l.a0(i17);
                        iC3 = l.c0(iY5);
                        iC = iC3 + iA16;
                        iY2 += iC;
                    }
                    i14 += 3;
                    break;
                case 64:
                    if (n0Var.q(i17, i14, xVar2)) {
                        iA14 = l.a0(i17);
                        iC = iA14 + 4;
                        iY2 += iC;
                    }
                    i14 += 3;
                    break;
                case 65:
                    if (n0Var.q(i17, i14, xVar2)) {
                        iA0 = l.a0(i17);
                        iC = iA0 + 8;
                        iY2 += iC;
                    }
                    i14 += 3;
                    break;
                case 66:
                    if (n0Var.q(i17, i14, xVar2)) {
                        int iY6 = y(j11, xVar2);
                        iA16 = l.a0(i17);
                        iC3 = l.b0((iY6 >> 31) ^ (iY6 << 1));
                        iC = iC3 + iA16;
                        iY2 += iC;
                    }
                    i14 += 3;
                    break;
                case 67:
                    if (n0Var.q(i17, i14, xVar2)) {
                        long jZ3 = z(j11, xVar2);
                        iA15 = l.a0(i17);
                        iC2 = l.c0((jZ3 << 1) ^ (jZ3 >> 63));
                        i13 = iC2 + iA15;
                        iY2 += i13;
                    }
                    i14 += 3;
                    break;
                case 68:
                    if (n0Var.q(i17, i14, xVar2)) {
                        a aVar2 = (a) unsafe.getObject(xVar2, j11);
                        w0 w0VarM6 = n0Var.m(i14);
                        iA7 = l.a0(i17) * 2;
                        iA8 = aVar2.a(w0VarM6);
                        iC = iA8 + iA7;
                        iY2 += iC;
                    }
                    i14 += 3;
                    break;
                default:
                    i14 += 3;
                    break;
            }
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 19701. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // androidx.glance.appwidget.protobuf.w0
    public final void f(java.lang.Object r21, androidx.glance.appwidget.protobuf.k r22, androidx.glance.appwidget.protobuf.n r23) {
        /*
            Method dump skipped, instruction units count: 1970
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.glance.appwidget.protobuf.n0.f(java.lang.Object, androidx.glance.appwidget.protobuf.k, androidx.glance.appwidget.protobuf.n):void");
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00e1 A[PHI: r3
      0x00e1: PHI (r3v32 int) = (r3v10 int), (r3v33 int) binds: [B:83:0x0216, B:41:0x00df] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.glance.appwidget.protobuf.w0
    public final int g(x xVar) {
        int i11;
        int iB;
        int i12;
        int[] iArr = this.f1972a;
        int length = iArr.length;
        int i13 = 0;
        for (int i14 = 0; i14 < length; i14 += 3) {
            int iL = L(i14);
            int i15 = iArr[i14];
            long j11 = 1048575 & iL;
            int i16 = 1237;
            int iHashCode = 37;
            switch (K(iL)) {
                case 0:
                    i11 = i13 * 53;
                    iB = b0.b(Double.doubleToLongBits(f1.f1926c.d(j11, xVar)));
                    i13 = iB + i11;
                    break;
                case 1:
                    i11 = i13 * 53;
                    iB = Float.floatToIntBits(f1.f1926c.e(j11, xVar));
                    i13 = iB + i11;
                    break;
                case 2:
                    i11 = i13 * 53;
                    iB = b0.b(f1.f1926c.g(j11, xVar));
                    i13 = iB + i11;
                    break;
                case 3:
                    i11 = i13 * 53;
                    iB = b0.b(f1.f1926c.g(j11, xVar));
                    i13 = iB + i11;
                    break;
                case 4:
                    i11 = i13 * 53;
                    iB = f1.f1926c.f(j11, xVar);
                    i13 = iB + i11;
                    break;
                case 5:
                    i11 = i13 * 53;
                    iB = b0.b(f1.f1926c.g(j11, xVar));
                    i13 = iB + i11;
                    break;
                case 6:
                    i11 = i13 * 53;
                    iB = f1.f1926c.f(j11, xVar);
                    i13 = iB + i11;
                    break;
                case 7:
                    i12 = i13 * 53;
                    boolean zC = f1.f1926c.c(j11, xVar);
                    Charset charset = b0.f1912a;
                    if (zC) {
                        i16 = 1231;
                    }
                    i13 = i16 + i12;
                    break;
                case 8:
                    i11 = i13 * 53;
                    iB = ((String) f1.f1926c.h(j11, xVar)).hashCode();
                    i13 = iB + i11;
                    break;
                case 9:
                    Object objH = f1.f1926c.h(j11, xVar);
                    if (objH != null) {
                        iHashCode = objH.hashCode();
                    }
                    i13 = (i13 * 53) + iHashCode;
                    break;
                case 10:
                    i11 = i13 * 53;
                    iB = f1.f1926c.h(j11, xVar).hashCode();
                    i13 = iB + i11;
                    break;
                case 11:
                    i11 = i13 * 53;
                    iB = f1.f1926c.f(j11, xVar);
                    i13 = iB + i11;
                    break;
                case 12:
                    i11 = i13 * 53;
                    iB = f1.f1926c.f(j11, xVar);
                    i13 = iB + i11;
                    break;
                case 13:
                    i11 = i13 * 53;
                    iB = f1.f1926c.f(j11, xVar);
                    i13 = iB + i11;
                    break;
                case 14:
                    i11 = i13 * 53;
                    iB = b0.b(f1.f1926c.g(j11, xVar));
                    i13 = iB + i11;
                    break;
                case 15:
                    i11 = i13 * 53;
                    iB = f1.f1926c.f(j11, xVar);
                    i13 = iB + i11;
                    break;
                case 16:
                    i11 = i13 * 53;
                    iB = b0.b(f1.f1926c.g(j11, xVar));
                    i13 = iB + i11;
                    break;
                case 17:
                    Object objH2 = f1.f1926c.h(j11, xVar);
                    if (objH2 != null) {
                        iHashCode = objH2.hashCode();
                    }
                    i13 = (i13 * 53) + iHashCode;
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
                    i11 = i13 * 53;
                    iB = f1.f1926c.h(j11, xVar).hashCode();
                    i13 = iB + i11;
                    break;
                case 50:
                    i11 = i13 * 53;
                    iB = f1.f1926c.h(j11, xVar).hashCode();
                    i13 = iB + i11;
                    break;
                case 51:
                    if (q(i15, i14, xVar)) {
                        i11 = i13 * 53;
                        iB = b0.b(Double.doubleToLongBits(((Double) f1.f1926c.h(j11, xVar)).doubleValue()));
                        i13 = iB + i11;
                    }
                    break;
                case 52:
                    if (q(i15, i14, xVar)) {
                        i11 = i13 * 53;
                        iB = Float.floatToIntBits(((Float) f1.f1926c.h(j11, xVar)).floatValue());
                        i13 = iB + i11;
                    }
                    break;
                case 53:
                    if (q(i15, i14, xVar)) {
                        i11 = i13 * 53;
                        iB = b0.b(z(j11, xVar));
                        i13 = iB + i11;
                    }
                    break;
                case 54:
                    if (q(i15, i14, xVar)) {
                        i11 = i13 * 53;
                        iB = b0.b(z(j11, xVar));
                        i13 = iB + i11;
                    }
                    break;
                case 55:
                    if (q(i15, i14, xVar)) {
                        i11 = i13 * 53;
                        iB = y(j11, xVar);
                        i13 = iB + i11;
                    }
                    break;
                case 56:
                    if (q(i15, i14, xVar)) {
                        i11 = i13 * 53;
                        iB = b0.b(z(j11, xVar));
                        i13 = iB + i11;
                    }
                    break;
                case 57:
                    if (q(i15, i14, xVar)) {
                        i11 = i13 * 53;
                        iB = y(j11, xVar);
                        i13 = iB + i11;
                    }
                    break;
                case 58:
                    if (q(i15, i14, xVar)) {
                        i12 = i13 * 53;
                        boolean zBooleanValue = ((Boolean) f1.f1926c.h(j11, xVar)).booleanValue();
                        Charset charset2 = b0.f1912a;
                        if (zBooleanValue) {
                            i16 = 1231;
                        }
                        i13 = i16 + i12;
                    }
                    break;
                case 59:
                    if (q(i15, i14, xVar)) {
                        i11 = i13 * 53;
                        iB = ((String) f1.f1926c.h(j11, xVar)).hashCode();
                        i13 = iB + i11;
                    }
                    break;
                case 60:
                    if (q(i15, i14, xVar)) {
                        i11 = i13 * 53;
                        iB = f1.f1926c.h(j11, xVar).hashCode();
                        i13 = iB + i11;
                    }
                    break;
                case 61:
                    if (q(i15, i14, xVar)) {
                        i11 = i13 * 53;
                        iB = f1.f1926c.h(j11, xVar).hashCode();
                        i13 = iB + i11;
                    }
                    break;
                case 62:
                    if (q(i15, i14, xVar)) {
                        i11 = i13 * 53;
                        iB = y(j11, xVar);
                        i13 = iB + i11;
                    }
                    break;
                case 63:
                    if (q(i15, i14, xVar)) {
                        i11 = i13 * 53;
                        iB = y(j11, xVar);
                        i13 = iB + i11;
                    }
                    break;
                case 64:
                    if (q(i15, i14, xVar)) {
                        i11 = i13 * 53;
                        iB = y(j11, xVar);
                        i13 = iB + i11;
                    }
                    break;
                case 65:
                    if (q(i15, i14, xVar)) {
                        i11 = i13 * 53;
                        iB = b0.b(z(j11, xVar));
                        i13 = iB + i11;
                    }
                    break;
                case 66:
                    if (q(i15, i14, xVar)) {
                        i11 = i13 * 53;
                        iB = y(j11, xVar);
                        i13 = iB + i11;
                    }
                    break;
                case 67:
                    if (q(i15, i14, xVar)) {
                        i11 = i13 * 53;
                        iB = b0.b(z(j11, xVar));
                        i13 = iB + i11;
                    }
                    break;
                case 68:
                    if (q(i15, i14, xVar)) {
                        i11 = i13 * 53;
                        iB = f1.f1926c.h(j11, xVar).hashCode();
                        i13 = iB + i11;
                    }
                    break;
            }
        }
        ((a1) this.f1983l).getClass();
        return xVar.unknownFields.hashCode() + (i13 * 53);
    }

    @Override // androidx.glance.appwidget.protobuf.w0
    public final void h(Object obj, h0 h0Var) throws IOException {
        h0Var.getClass();
        l lVar = (l) h0Var.f1938a;
        if (j1.ASCENDING != j1.DESCENDING) {
            M(obj, h0Var);
            return;
        }
        ((a1) this.f1983l).getClass();
        ((x) obj).unknownFields.d(h0Var);
        int[] iArr = this.f1972a;
        for (int length = iArr.length - 3; length >= 0; length -= 3) {
            int iL = L(length);
            int i11 = iArr[length];
            switch (K(iL)) {
                case 0:
                    if (n(length, obj)) {
                        double d5 = f1.f1926c.d(iL & 1048575, obj);
                        lVar.getClass();
                        lVar.k0(i11, Double.doubleToRawLongBits(d5));
                    }
                    break;
                case 1:
                    if (n(length, obj)) {
                        float fE = f1.f1926c.e(iL & 1048575, obj);
                        lVar.getClass();
                        lVar.i0(i11, Float.floatToRawIntBits(fE));
                    }
                    break;
                case 2:
                    if (n(length, obj)) {
                        lVar.t0(i11, f1.f1926c.g(iL & 1048575, obj));
                    }
                    break;
                case 3:
                    if (n(length, obj)) {
                        lVar.t0(i11, f1.f1926c.g(iL & 1048575, obj));
                    }
                    break;
                case 4:
                    if (n(length, obj)) {
                        lVar.m0(i11, f1.f1926c.f(iL & 1048575, obj));
                    }
                    break;
                case 5:
                    if (n(length, obj)) {
                        lVar.k0(i11, f1.f1926c.g(iL & 1048575, obj));
                    }
                    break;
                case 6:
                    if (n(length, obj)) {
                        lVar.i0(i11, f1.f1926c.f(iL & 1048575, obj));
                    }
                    break;
                case 7:
                    if (n(length, obj)) {
                        lVar.g0(i11, f1.f1926c.c(iL & 1048575, obj));
                    }
                    break;
                case 8:
                    if (n(length, obj)) {
                        N(i11, f1.f1926c.h(iL & 1048575, obj), h0Var);
                    }
                    break;
                case 9:
                    if (n(length, obj)) {
                        lVar.o0(i11, (a) f1.f1926c.h(iL & 1048575, obj), m(length));
                    }
                    break;
                case 10:
                    if (n(length, obj)) {
                        h0Var.a(i11, (h) f1.f1926c.h(iL & 1048575, obj));
                    }
                    break;
                case 11:
                    if (n(length, obj)) {
                        lVar.r0(i11, f1.f1926c.f(iL & 1048575, obj));
                    }
                    break;
                case 12:
                    if (n(length, obj)) {
                        lVar.m0(i11, f1.f1926c.f(iL & 1048575, obj));
                    }
                    break;
                case 13:
                    if (n(length, obj)) {
                        lVar.i0(i11, f1.f1926c.f(iL & 1048575, obj));
                    }
                    break;
                case 14:
                    if (n(length, obj)) {
                        lVar.k0(i11, f1.f1926c.g(iL & 1048575, obj));
                    }
                    break;
                case 15:
                    if (n(length, obj)) {
                        int iF = f1.f1926c.f(iL & 1048575, obj);
                        lVar.r0(i11, (iF >> 31) ^ (iF << 1));
                    }
                    break;
                case 16:
                    if (n(length, obj)) {
                        long jG = f1.f1926c.g(iL & 1048575, obj);
                        lVar.t0(i11, (jG >> 63) ^ (jG << 1));
                    }
                    break;
                case 17:
                    if (n(length, obj)) {
                        h0Var.b(i11, f1.f1926c.h(iL & 1048575, obj), m(length));
                    }
                    break;
                case 18:
                    x0.o(iArr[length], (List) f1.f1926c.h(iL & 1048575, obj), h0Var, false);
                    break;
                case 19:
                    x0.s(iArr[length], (List) f1.f1926c.h(iL & 1048575, obj), h0Var, false);
                    break;
                case 20:
                    x0.v(iArr[length], (List) f1.f1926c.h(iL & 1048575, obj), h0Var, false);
                    break;
                case 21:
                    x0.D(iArr[length], (List) f1.f1926c.h(iL & 1048575, obj), h0Var, false);
                    break;
                case 22:
                    x0.u(iArr[length], (List) f1.f1926c.h(iL & 1048575, obj), h0Var, false);
                    break;
                case 23:
                    x0.r(iArr[length], (List) f1.f1926c.h(iL & 1048575, obj), h0Var, false);
                    break;
                case Service.METRICS_FIELD_NUMBER /* 24 */:
                    x0.q(iArr[length], (List) f1.f1926c.h(iL & 1048575, obj), h0Var, false);
                    break;
                case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                    x0.m(iArr[length], (List) f1.f1926c.h(iL & 1048575, obj), h0Var, false);
                    break;
                case Service.BILLING_FIELD_NUMBER /* 26 */:
                    x0.B(iArr[length], (List) f1.f1926c.h(iL & 1048575, obj), h0Var);
                    break;
                case 27:
                    x0.w(iArr[length], (List) f1.f1926c.h(iL & 1048575, obj), h0Var, m(length));
                    break;
                case Service.MONITORING_FIELD_NUMBER /* 28 */:
                    x0.n(iArr[length], (List) f1.f1926c.h(iL & 1048575, obj), h0Var);
                    break;
                case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
                    x0.C(iArr[length], (List) f1.f1926c.h(iL & 1048575, obj), h0Var, false);
                    break;
                case 30:
                    x0.p(iArr[length], (List) f1.f1926c.h(iL & 1048575, obj), h0Var, false);
                    break;
                case 31:
                    x0.x(iArr[length], (List) f1.f1926c.h(iL & 1048575, obj), h0Var, false);
                    break;
                case Consts.SP /* 32 */:
                    x0.y(iArr[length], (List) f1.f1926c.h(iL & 1048575, obj), h0Var, false);
                    break;
                case 33:
                    x0.z(iArr[length], (List) f1.f1926c.h(iL & 1048575, obj), h0Var, false);
                    break;
                case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                    x0.A(iArr[length], (List) f1.f1926c.h(iL & 1048575, obj), h0Var, false);
                    break;
                case 35:
                    x0.o(iArr[length], (List) f1.f1926c.h(iL & 1048575, obj), h0Var, true);
                    break;
                case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    x0.s(iArr[length], (List) f1.f1926c.h(iL & 1048575, obj), h0Var, true);
                    break;
                case 37:
                    x0.v(iArr[length], (List) f1.f1926c.h(iL & 1048575, obj), h0Var, true);
                    break;
                case 38:
                    x0.D(iArr[length], (List) f1.f1926c.h(iL & 1048575, obj), h0Var, true);
                    break;
                case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    x0.u(iArr[length], (List) f1.f1926c.h(iL & 1048575, obj), h0Var, true);
                    break;
                case DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                    x0.r(iArr[length], (List) f1.f1926c.h(iL & 1048575, obj), h0Var, true);
                    break;
                case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                    x0.q(iArr[length], (List) f1.f1926c.h(iL & 1048575, obj), h0Var, true);
                    break;
                case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                    x0.m(iArr[length], (List) f1.f1926c.h(iL & 1048575, obj), h0Var, true);
                    break;
                case 43:
                    x0.C(iArr[length], (List) f1.f1926c.h(iL & 1048575, obj), h0Var, true);
                    break;
                case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                    x0.p(iArr[length], (List) f1.f1926c.h(iL & 1048575, obj), h0Var, true);
                    break;
                case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                    x0.x(iArr[length], (List) f1.f1926c.h(iL & 1048575, obj), h0Var, true);
                    break;
                case 46:
                    x0.y(iArr[length], (List) f1.f1926c.h(iL & 1048575, obj), h0Var, true);
                    break;
                case 47:
                    x0.z(iArr[length], (List) f1.f1926c.h(iL & 1048575, obj), h0Var, true);
                    break;
                case 48:
                    x0.A(iArr[length], (List) f1.f1926c.h(iL & 1048575, obj), h0Var, true);
                    break;
                case 49:
                    x0.t(iArr[length], (List) f1.f1926c.h(iL & 1048575, obj), h0Var, m(length));
                    break;
                case 50:
                    if (f1.f1926c.h(iL & 1048575, obj) != null) {
                        Object obj2 = this.f1973b[(length / 3) * 2];
                        this.m.getClass();
                        hh.p0.z(obj2);
                        throw null;
                    }
                    break;
                    break;
                case 51:
                    if (q(i11, length, obj)) {
                        double dDoubleValue = ((Double) f1.f1926c.h(iL & 1048575, obj)).doubleValue();
                        lVar.getClass();
                        lVar.k0(i11, Double.doubleToRawLongBits(dDoubleValue));
                    }
                    break;
                case 52:
                    if (q(i11, length, obj)) {
                        float fFloatValue = ((Float) f1.f1926c.h(iL & 1048575, obj)).floatValue();
                        lVar.getClass();
                        lVar.i0(i11, Float.floatToRawIntBits(fFloatValue));
                    }
                    break;
                case 53:
                    if (q(i11, length, obj)) {
                        lVar.t0(i11, z(iL & 1048575, obj));
                    }
                    break;
                case 54:
                    if (q(i11, length, obj)) {
                        lVar.t0(i11, z(iL & 1048575, obj));
                    }
                    break;
                case 55:
                    if (q(i11, length, obj)) {
                        lVar.m0(i11, y(iL & 1048575, obj));
                    }
                    break;
                case 56:
                    if (q(i11, length, obj)) {
                        lVar.k0(i11, z(iL & 1048575, obj));
                    }
                    break;
                case 57:
                    if (q(i11, length, obj)) {
                        lVar.i0(i11, y(iL & 1048575, obj));
                    }
                    break;
                case 58:
                    if (q(i11, length, obj)) {
                        lVar.g0(i11, ((Boolean) f1.f1926c.h(iL & 1048575, obj)).booleanValue());
                    }
                    break;
                case 59:
                    if (q(i11, length, obj)) {
                        N(i11, f1.f1926c.h(iL & 1048575, obj), h0Var);
                    }
                    break;
                case 60:
                    if (q(i11, length, obj)) {
                        lVar.o0(i11, (a) f1.f1926c.h(iL & 1048575, obj), m(length));
                    }
                    break;
                case 61:
                    if (q(i11, length, obj)) {
                        h0Var.a(i11, (h) f1.f1926c.h(iL & 1048575, obj));
                    }
                    break;
                case 62:
                    if (q(i11, length, obj)) {
                        lVar.r0(i11, y(iL & 1048575, obj));
                    }
                    break;
                case 63:
                    if (q(i11, length, obj)) {
                        lVar.m0(i11, y(iL & 1048575, obj));
                    }
                    break;
                case 64:
                    if (q(i11, length, obj)) {
                        lVar.i0(i11, y(iL & 1048575, obj));
                    }
                    break;
                case 65:
                    if (q(i11, length, obj)) {
                        lVar.k0(i11, z(iL & 1048575, obj));
                    }
                    break;
                case 66:
                    if (q(i11, length, obj)) {
                        int iY = y(iL & 1048575, obj);
                        lVar.r0(i11, (iY >> 31) ^ (iY << 1));
                    }
                    break;
                case 67:
                    if (q(i11, length, obj)) {
                        long jZ = z(iL & 1048575, obj);
                        lVar.t0(i11, (jZ >> 63) ^ (jZ << 1));
                    }
                    break;
                case 68:
                    if (q(i11, length, obj)) {
                        h0Var.b(i11, f1.f1926c.h(iL & 1048575, obj), m(length));
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003d  */
    @Override // androidx.glance.appwidget.protobuf.w0
    public final boolean i(x xVar, x xVar2) {
        int[] iArr = this.f1972a;
        int length = iArr.length;
        int i11 = 0;
        while (true) {
            boolean zL = true;
            if (i11 < length) {
                int iL = L(i11);
                long j11 = iL & 1048575;
                switch (K(iL)) {
                    case 0:
                        if (!j(xVar, xVar2, i11)) {
                            zL = false;
                        } else {
                            e1 e1Var = f1.f1926c;
                            if (Double.doubleToLongBits(e1Var.d(j11, xVar)) != Double.doubleToLongBits(e1Var.d(j11, xVar2))) {
                                zL = false;
                            }
                        }
                        break;
                    case 1:
                        if (!j(xVar, xVar2, i11)) {
                            zL = false;
                        } else {
                            e1 e1Var2 = f1.f1926c;
                            if (Float.floatToIntBits(e1Var2.e(j11, xVar)) != Float.floatToIntBits(e1Var2.e(j11, xVar2))) {
                                zL = false;
                            }
                        }
                        break;
                    case 2:
                        if (!j(xVar, xVar2, i11)) {
                            zL = false;
                        } else {
                            e1 e1Var3 = f1.f1926c;
                            if (e1Var3.g(j11, xVar) != e1Var3.g(j11, xVar2)) {
                                zL = false;
                            }
                        }
                        break;
                    case 3:
                        if (!j(xVar, xVar2, i11)) {
                            zL = false;
                        } else {
                            e1 e1Var4 = f1.f1926c;
                            if (e1Var4.g(j11, xVar) != e1Var4.g(j11, xVar2)) {
                                zL = false;
                            }
                        }
                        break;
                    case 4:
                        if (!j(xVar, xVar2, i11)) {
                            zL = false;
                        } else {
                            e1 e1Var5 = f1.f1926c;
                            if (e1Var5.f(j11, xVar) != e1Var5.f(j11, xVar2)) {
                                zL = false;
                            }
                        }
                        break;
                    case 5:
                        if (!j(xVar, xVar2, i11)) {
                            zL = false;
                        } else {
                            e1 e1Var6 = f1.f1926c;
                            if (e1Var6.g(j11, xVar) != e1Var6.g(j11, xVar2)) {
                                zL = false;
                            }
                        }
                        break;
                    case 6:
                        if (!j(xVar, xVar2, i11)) {
                            zL = false;
                        } else {
                            e1 e1Var7 = f1.f1926c;
                            if (e1Var7.f(j11, xVar) != e1Var7.f(j11, xVar2)) {
                                zL = false;
                            }
                        }
                        break;
                    case 7:
                        if (!j(xVar, xVar2, i11)) {
                            zL = false;
                        } else {
                            e1 e1Var8 = f1.f1926c;
                            if (e1Var8.c(j11, xVar) != e1Var8.c(j11, xVar2)) {
                                zL = false;
                            }
                        }
                        break;
                    case 8:
                        if (!j(xVar, xVar2, i11)) {
                            zL = false;
                        } else {
                            e1 e1Var9 = f1.f1926c;
                            if (!x0.l(e1Var9.h(j11, xVar), e1Var9.h(j11, xVar2))) {
                                zL = false;
                            }
                        }
                        break;
                    case 9:
                        if (!j(xVar, xVar2, i11)) {
                            zL = false;
                        } else {
                            e1 e1Var10 = f1.f1926c;
                            if (!x0.l(e1Var10.h(j11, xVar), e1Var10.h(j11, xVar2))) {
                                zL = false;
                            }
                        }
                        break;
                    case 10:
                        if (!j(xVar, xVar2, i11)) {
                            zL = false;
                        } else {
                            e1 e1Var11 = f1.f1926c;
                            if (!x0.l(e1Var11.h(j11, xVar), e1Var11.h(j11, xVar2))) {
                                zL = false;
                            }
                        }
                        break;
                    case 11:
                        if (!j(xVar, xVar2, i11)) {
                            zL = false;
                        } else {
                            e1 e1Var12 = f1.f1926c;
                            if (e1Var12.f(j11, xVar) != e1Var12.f(j11, xVar2)) {
                                zL = false;
                            }
                        }
                        break;
                    case 12:
                        if (!j(xVar, xVar2, i11)) {
                            zL = false;
                        } else {
                            e1 e1Var13 = f1.f1926c;
                            if (e1Var13.f(j11, xVar) != e1Var13.f(j11, xVar2)) {
                                zL = false;
                            }
                        }
                        break;
                    case 13:
                        if (!j(xVar, xVar2, i11)) {
                            zL = false;
                        } else {
                            e1 e1Var14 = f1.f1926c;
                            if (e1Var14.f(j11, xVar) != e1Var14.f(j11, xVar2)) {
                                zL = false;
                            }
                        }
                        break;
                    case 14:
                        if (!j(xVar, xVar2, i11)) {
                            zL = false;
                        } else {
                            e1 e1Var15 = f1.f1926c;
                            if (e1Var15.g(j11, xVar) != e1Var15.g(j11, xVar2)) {
                                zL = false;
                            }
                        }
                        break;
                    case 15:
                        if (!j(xVar, xVar2, i11)) {
                            zL = false;
                        } else {
                            e1 e1Var16 = f1.f1926c;
                            if (e1Var16.f(j11, xVar) != e1Var16.f(j11, xVar2)) {
                                zL = false;
                            }
                        }
                        break;
                    case 16:
                        if (!j(xVar, xVar2, i11)) {
                            zL = false;
                        } else {
                            e1 e1Var17 = f1.f1926c;
                            if (e1Var17.g(j11, xVar) != e1Var17.g(j11, xVar2)) {
                                zL = false;
                            }
                        }
                        break;
                    case 17:
                        if (!j(xVar, xVar2, i11)) {
                            zL = false;
                        } else {
                            e1 e1Var18 = f1.f1926c;
                            if (!x0.l(e1Var18.h(j11, xVar), e1Var18.h(j11, xVar2))) {
                                zL = false;
                            }
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
                        e1 e1Var19 = f1.f1926c;
                        zL = x0.l(e1Var19.h(j11, xVar), e1Var19.h(j11, xVar2));
                        break;
                    case 50:
                        e1 e1Var20 = f1.f1926c;
                        zL = x0.l(e1Var20.h(j11, xVar), e1Var20.h(j11, xVar2));
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
                        e1 e1Var21 = f1.f1926c;
                        if (e1Var21.f(j12, xVar) != e1Var21.f(j12, xVar2) || !x0.l(e1Var21.h(j11, xVar), e1Var21.h(j11, xVar2))) {
                            zL = false;
                        }
                        break;
                }
                if (zL) {
                    i11 += 3;
                }
            } else {
                a1 a1Var = (a1) this.f1983l;
                a1Var.getClass();
                z0 z0Var = xVar.unknownFields;
                a1Var.getClass();
                if (z0Var.equals(xVar2.unknownFields)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean j(x xVar, x xVar2, int i11) {
        return n(i11, xVar) == n(i11, xVar2);
    }

    public final void k(int i11, Object obj, Object obj2) {
        int i12 = this.f1972a[i11];
        if (f1.f1926c.h(L(i11) & 1048575, obj) == null) {
            return;
        }
        l(i11);
    }

    public final void l(int i11) {
        if (this.f1973b[defpackage.e.c(i11, 3, 2, 1)] != null) {
            throw new ClassCastException();
        }
    }

    public final w0 m(int i11) {
        int i12 = (i11 / 3) * 2;
        Object[] objArr = this.f1973b;
        w0 w0Var = (w0) objArr[i12];
        if (w0Var != null) {
            return w0Var;
        }
        w0 w0VarA = t0.f1996c.a((Class) objArr[i12 + 1]);
        objArr[i12] = w0VarA;
        return w0VarA;
    }

    public final boolean n(int i11, Object obj) {
        int i12 = this.f1972a[i11 + 2];
        long j11 = i12 & 1048575;
        if (j11 == 1048575) {
            int iL = L(i11);
            long j12 = iL & 1048575;
            switch (K(iL)) {
                case 0:
                    if (Double.doubleToRawLongBits(f1.f1926c.d(j12, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(f1.f1926c.e(j12, obj)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (f1.f1926c.g(j12, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (f1.f1926c.g(j12, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (f1.f1926c.f(j12, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (f1.f1926c.g(j12, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (f1.f1926c.f(j12, obj) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return f1.f1926c.c(j12, obj);
                case 8:
                    Object objH = f1.f1926c.h(j12, obj);
                    if (objH instanceof String) {
                        return !((String) objH).isEmpty();
                    }
                    if (objH instanceof h) {
                        return !h.f1934b.equals(objH);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (f1.f1926c.h(j12, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    return !h.f1934b.equals(f1.f1926c.h(j12, obj));
                case 11:
                    if (f1.f1926c.f(j12, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (f1.f1926c.f(j12, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (f1.f1926c.f(j12, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (f1.f1926c.g(j12, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (f1.f1926c.f(j12, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (f1.f1926c.g(j12, obj) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (f1.f1926c.h(j12, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i12 >>> 20)) & f1.f1926c.f(j11, obj)) == 0) {
            return false;
        }
        return true;
    }

    public final boolean o(Object obj, int i11, int i12, int i13, int i14) {
        if (i12 == 1048575) {
            return n(i11, obj);
        }
        return (i13 & i14) != 0;
    }

    public final boolean q(int i11, int i12, Object obj) {
        return f1.f1926c.f((long) (this.f1972a[i12 + 2] & 1048575), obj) == i11;
    }

    public final void r(int i11, Object obj, Object obj2) {
        long jL = L(i11) & 1048575;
        Object objH = f1.f1926c.h(jL, obj);
        j0 j0Var = this.m;
        if (objH != null) {
            j0Var.getClass();
            if (!((i0) objH).f1945a) {
                i0 i0VarD = i0.f1944b.d();
                j0.a(i0VarD, objH);
                f1.o(obj, jL, i0VarD);
                objH = i0VarD;
            }
        } else {
            j0Var.getClass();
            objH = i0.f1944b.d();
            f1.o(obj, jL, objH);
        }
        j0Var.getClass();
        hh.p0.z(obj2);
        throw null;
    }

    public final void s(int i11, Object obj, Object obj2) {
        if (n(i11, obj2)) {
            long jL = L(i11) & 1048575;
            Unsafe unsafe = f1971o;
            Object object = unsafe.getObject(obj2, jL);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f1972a[i11] + " is present but null: " + obj2);
            }
            w0 w0VarM = m(i11);
            if (!n(i11, obj)) {
                if (p(object)) {
                    x xVarD = w0VarM.d();
                    w0VarM.a(xVarD, object);
                    unsafe.putObject(obj, jL, xVarD);
                } else {
                    unsafe.putObject(obj, jL, object);
                }
                G(i11, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jL);
            if (!p(object2)) {
                x xVarD2 = w0VarM.d();
                w0VarM.a(xVarD2, object2);
                unsafe.putObject(obj, jL, xVarD2);
                object2 = xVarD2;
            }
            w0VarM.a(object2, object);
        }
    }

    public final void t(int i11, Object obj, Object obj2) {
        int[] iArr = this.f1972a;
        int i12 = iArr[i11];
        if (q(i12, i11, obj2)) {
            long jL = L(i11) & 1048575;
            Unsafe unsafe = f1971o;
            Object object = unsafe.getObject(obj2, jL);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i11] + " is present but null: " + obj2);
            }
            w0 w0VarM = m(i11);
            if (!q(i12, i11, obj)) {
                if (p(object)) {
                    x xVarD = w0VarM.d();
                    w0VarM.a(xVarD, object);
                    unsafe.putObject(obj, jL, xVarD);
                } else {
                    unsafe.putObject(obj, jL, object);
                }
                H(i12, i11, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jL);
            if (!p(object2)) {
                x xVarD2 = w0VarM.d();
                w0VarM.a(xVarD2, object2);
                unsafe.putObject(obj, jL, xVarD2);
                object2 = xVarD2;
            }
            w0VarM.a(object2, object);
        }
    }

    public final Object u(int i11, Object obj) {
        w0 w0VarM = m(i11);
        long jL = L(i11) & 1048575;
        if (!n(i11, obj)) {
            return w0VarM.d();
        }
        Object object = f1971o.getObject(obj, jL);
        if (p(object)) {
            return object;
        }
        x xVarD = w0VarM.d();
        if (object != null) {
            w0VarM.a(xVarD, object);
        }
        return xVarD;
    }

    public final Object v(int i11, int i12, Object obj) {
        w0 w0VarM = m(i12);
        if (!q(i11, i12, obj)) {
            return w0VarM.d();
        }
        Object object = f1971o.getObject(obj, L(i12) & 1048575);
        if (p(object)) {
            return object;
        }
        x xVarD = w0VarM.d();
        if (object != null) {
            w0VarM.a(xVarD, object);
        }
        return xVarD;
    }
}
