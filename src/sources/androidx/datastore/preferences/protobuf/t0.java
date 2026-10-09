package androidx.datastore.preferences.protobuf;

import com.google.api.Service;
import com.google.protobuf.DescriptorProtos;
import com.stkouyu.util.httputil.Consts;
import com.tbruyelle.rxpermissions3.BuildConfig;
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
public final class t0 implements d1 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int[] f1552n = new int[0];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Unsafe f1553o = q1.i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f1554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f1555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1556c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f1557d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f1558e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f1559f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f1560g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f1561h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f1562i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final v0 f1563j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final h0 f1564k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final j1 f1565l;
    public final p0 m;

    public t0(int[] iArr, Object[] objArr, int i11, int i12, a aVar, int[] iArr2, int i13, int i14, v0 v0Var, h0 h0Var, j1 j1Var, r rVar, p0 p0Var) {
        this.f1554a = iArr;
        this.f1555b = objArr;
        this.f1556c = i11;
        this.f1557d = i12;
        this.f1559f = aVar instanceof c0;
        this.f1560g = iArr2;
        this.f1561h = i13;
        this.f1562i = i14;
        this.f1563j = v0Var;
        this.f1564k = h0Var;
        this.f1565l = j1Var;
        this.f1558e = aVar;
        this.m = p0Var;
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

    public static void O(int i11, Object obj, l0 l0Var) throws IOException {
        if (!(obj instanceof String)) {
            l0Var.a(i11, (i) obj);
        } else {
            ((o) l0Var.f1512a).w0(i11, (String) obj);
        }
    }

    public static boolean p(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof c0) {
            return ((c0) obj).g();
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:166:0x0362  */
    /* JADX WARN: Code duplicated, block: B:181:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:184:0x03c3  */
    public static t0 w(c1 c1Var, v0 v0Var, h0 h0Var, j1 j1Var, r rVar, p0 p0Var) {
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
        String str = c1Var.f1455b;
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
            iArr = f1552n;
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
        Unsafe unsafe = f1553o;
        Object[] objArr2 = c1Var.f1456c;
        Class<?> cls = c1Var.f1454a.getClass();
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
                } else if (i90 == 12 && (c1Var.a().equals(z0.PROTO2) || (iCharAt11 & 2048) != 0)) {
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
                        if (c1Var.a() == z0.PROTO2 || (iCharAt11 & 2048) != 0) {
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
        a aVar = c1Var.f1454a;
        c1Var.a();
        return new t0(iArr3, objArr3, i12, i15, aVar, iArr, i17, i70, v0Var, h0Var, j1Var, rVar, p0Var);
    }

    public static long x(int i11) {
        return i11 & 1048575;
    }

    public static int y(long j11, Object obj) {
        return ((Integer) q1.f1541c.h(j11, obj)).intValue();
    }

    public static long z(long j11, Object obj) {
        return ((Long) q1.f1541c.h(j11, obj)).longValue();
    }

    public final int A(int i11) {
        if (i11 >= this.f1556c && i11 <= this.f1557d) {
            int[] iArr = this.f1554a;
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

    public final void B(Object obj, long j11, n nVar, d1 d1Var, q qVar) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iA;
        this.f1564k.getClass();
        d0 d0VarA = h0.a(j11, obj);
        l lVar = nVar.f1517a;
        int i11 = nVar.f1518b;
        if ((i11 & 7) != 3) {
            throw InvalidProtocolBufferException.b();
        }
        do {
            c0 c0VarD = d1Var.d();
            nVar.b(c0VarD, d1Var, qVar);
            d1Var.b(c0VarD);
            ((b1) d0VarA).add(c0VarD);
            if (lVar.c() || nVar.f1520d != 0) {
                return;
            } else {
                iA = lVar.A();
            }
        } while (iA == i11);
        nVar.f1520d = iA;
    }

    public final void C(Object obj, int i11, n nVar, d1 d1Var, q qVar) throws InvalidProtocolBufferException {
        int iA;
        this.f1564k.getClass();
        d0 d0VarA = h0.a(i11 & 1048575, obj);
        l lVar = nVar.f1517a;
        int i12 = nVar.f1518b;
        if ((i12 & 7) != 2) {
            throw InvalidProtocolBufferException.b();
        }
        do {
            c0 c0VarD = d1Var.d();
            nVar.c(c0VarD, d1Var, qVar);
            d1Var.b(c0VarD);
            ((b1) d0VarA).add(c0VarD);
            if (lVar.c() || nVar.f1520d != 0) {
                return;
            } else {
                iA = lVar.A();
            }
        } while (iA == i12);
        nVar.f1520d = iA;
    }

    public final void D(int i11, n nVar, Object obj) throws InvalidProtocolBufferException.InvalidWireTypeException {
        if ((536870912 & i11) != 0) {
            nVar.w(2);
            q1.o(obj, i11 & 1048575, nVar.f1517a.z());
        } else if (!this.f1559f) {
            q1.o(obj, i11 & 1048575, nVar.e());
        } else {
            nVar.w(2);
            q1.o(obj, i11 & 1048575, nVar.f1517a.y());
        }
    }

    public final void E(int i11, n nVar, Object obj) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int i12 = 536870912 & i11;
        h0 h0Var = this.f1564k;
        if (i12 != 0) {
            h0Var.getClass();
            nVar.s(h0.a(i11 & 1048575, obj), true);
        } else {
            h0Var.getClass();
            nVar.s(h0.a(i11 & 1048575, obj), false);
        }
    }

    public final void G(int i11, Object obj) {
        int i12 = this.f1554a[i11 + 2];
        long j11 = 1048575 & i12;
        if (j11 == 1048575) {
            return;
        }
        q1.m(j11, obj, (1 << (i12 >>> 20)) | q1.f1541c.f(j11, obj));
    }

    public final void H(int i11, int i12, Object obj) {
        q1.m(this.f1554a[i12 + 2] & 1048575, obj, i11);
    }

    public final void I(Object obj, int i11, a aVar) {
        f1553o.putObject(obj, L(i11) & 1048575, aVar);
        G(i11, obj);
    }

    public final void J(Object obj, int i11, int i12, a aVar) {
        f1553o.putObject(obj, L(i12) & 1048575, aVar);
        H(i11, i12, obj);
    }

    public final int L(int i11) {
        return this.f1554a[i11 + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void M(Object obj, l0 l0Var) throws IOException {
        int i11;
        boolean z11;
        t0 t0Var = this;
        int[] iArr = t0Var.f1554a;
        int length = iArr.length;
        Unsafe unsafe = f1553o;
        int i12 = 1048575;
        int i13 = 1048575;
        int i14 = 0;
        int i15 = 0;
        while (i14 < length) {
            int iL = t0Var.L(i14);
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
                    if (t0Var.o(obj, i14, i13, i15, i11)) {
                        double d5 = q1.f1541c.d(j11, obj);
                        o oVar = (o) l0Var.f1512a;
                        oVar.getClass();
                        oVar.r0(i16, Double.doubleToRawLongBits(d5));
                    }
                    break;
                case 1:
                    if (t0Var.o(obj, i14, i13, i15, i11)) {
                        float fE = q1.f1541c.e(j11, obj);
                        o oVar2 = (o) l0Var.f1512a;
                        oVar2.getClass();
                        oVar2.p0(i16, Float.floatToRawIntBits(fE));
                    }
                    t0Var = this;
                    break;
                case 2:
                    if (t0Var.o(obj, i14, i13, i15, i11)) {
                        ((o) l0Var.f1512a).B0(i16, unsafe.getLong(obj, j11));
                    }
                    t0Var = this;
                    break;
                case 3:
                    if (t0Var.o(obj, i14, i13, i15, i11)) {
                        ((o) l0Var.f1512a).B0(i16, unsafe.getLong(obj, j11));
                    }
                    t0Var = this;
                    break;
                case 4:
                    if (t0Var.o(obj, i14, i13, i15, i11)) {
                        ((o) l0Var.f1512a).t0(i16, unsafe.getInt(obj, j11));
                    }
                    t0Var = this;
                    break;
                case 5:
                    if (t0Var.o(obj, i14, i13, i15, i11)) {
                        ((o) l0Var.f1512a).r0(i16, unsafe.getLong(obj, j11));
                    }
                    t0Var = this;
                    break;
                case 6:
                    if (t0Var.o(obj, i14, i13, i15, i11)) {
                        ((o) l0Var.f1512a).p0(i16, unsafe.getInt(obj, j11));
                    }
                    t0Var = this;
                    break;
                case 7:
                    if (t0Var.o(obj, i14, i13, i15, i11)) {
                        ((o) l0Var.f1512a).m0(i16, q1.f1541c.c(j11, obj));
                    }
                    t0Var = this;
                    break;
                case 8:
                    if (t0Var.o(obj, i14, i13, i15, i11)) {
                        O(i16, unsafe.getObject(obj, j11), l0Var);
                    }
                    t0Var = this;
                    break;
                case 9:
                    if (t0Var.o(obj, i14, i13, i15, i11)) {
                        ((o) l0Var.f1512a).v0(i16, (a) unsafe.getObject(obj, j11), t0Var.m(i14));
                    }
                    break;
                case 10:
                    if (t0Var.o(obj, i14, i13, i15, i11)) {
                        l0Var.a(i16, (i) unsafe.getObject(obj, j11));
                    }
                    t0Var = this;
                    break;
                case 11:
                    if (t0Var.o(obj, i14, i13, i15, i11)) {
                        ((o) l0Var.f1512a).z0(i16, unsafe.getInt(obj, j11));
                    }
                    t0Var = this;
                    break;
                case 12:
                    if (t0Var.o(obj, i14, i13, i15, i11)) {
                        ((o) l0Var.f1512a).t0(i16, unsafe.getInt(obj, j11));
                    }
                    t0Var = this;
                    break;
                case 13:
                    if (t0Var.o(obj, i14, i13, i15, i11)) {
                        ((o) l0Var.f1512a).p0(i16, unsafe.getInt(obj, j11));
                    }
                    t0Var = this;
                    break;
                case 14:
                    if (t0Var.o(obj, i14, i13, i15, i11)) {
                        ((o) l0Var.f1512a).r0(i16, unsafe.getLong(obj, j11));
                    }
                    t0Var = this;
                    break;
                case 15:
                    if (t0Var.o(obj, i14, i13, i15, i11)) {
                        int i19 = unsafe.getInt(obj, j11);
                        ((o) l0Var.f1512a).z0(i16, (i19 >> 31) ^ (i19 << 1));
                    }
                    t0Var = this;
                    break;
                case 16:
                    if (t0Var.o(obj, i14, i13, i15, i11)) {
                        long j12 = unsafe.getLong(obj, j11);
                        ((o) l0Var.f1512a).B0(i16, (j12 >> 63) ^ (j12 << 1));
                    }
                    t0Var = this;
                    break;
                case 17:
                    if (t0Var.o(obj, i14, i13, i15, i11)) {
                        l0Var.b(i16, unsafe.getObject(obj, j11), t0Var.m(i14));
                    }
                    break;
                case 18:
                    e1.o(iArr[i14], (List) unsafe.getObject(obj, j11), l0Var, false);
                    break;
                case 19:
                    e1.s(iArr[i14], (List) unsafe.getObject(obj, j11), l0Var, false);
                    break;
                case 20:
                    e1.v(iArr[i14], (List) unsafe.getObject(obj, j11), l0Var, false);
                    break;
                case 21:
                    e1.D(iArr[i14], (List) unsafe.getObject(obj, j11), l0Var, false);
                    break;
                case 22:
                    e1.u(iArr[i14], (List) unsafe.getObject(obj, j11), l0Var, false);
                    break;
                case 23:
                    e1.r(iArr[i14], (List) unsafe.getObject(obj, j11), l0Var, false);
                    break;
                case Service.METRICS_FIELD_NUMBER /* 24 */:
                    e1.q(iArr[i14], (List) unsafe.getObject(obj, j11), l0Var, false);
                    break;
                case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                    e1.m(iArr[i14], (List) unsafe.getObject(obj, j11), l0Var, false);
                    break;
                case Service.BILLING_FIELD_NUMBER /* 26 */:
                    e1.B(iArr[i14], (List) unsafe.getObject(obj, j11), l0Var);
                    break;
                case 27:
                    e1.w(iArr[i14], (List) unsafe.getObject(obj, j11), l0Var, t0Var.m(i14));
                    break;
                case Service.MONITORING_FIELD_NUMBER /* 28 */:
                    e1.n(iArr[i14], (List) unsafe.getObject(obj, j11), l0Var);
                    break;
                case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
                    z11 = false;
                    e1.C(iArr[i14], (List) unsafe.getObject(obj, j11), l0Var, false);
                    break;
                case 30:
                    z11 = false;
                    e1.p(iArr[i14], (List) unsafe.getObject(obj, j11), l0Var, false);
                    break;
                case 31:
                    z11 = false;
                    e1.x(iArr[i14], (List) unsafe.getObject(obj, j11), l0Var, false);
                    break;
                case Consts.SP /* 32 */:
                    z11 = false;
                    e1.y(iArr[i14], (List) unsafe.getObject(obj, j11), l0Var, false);
                    break;
                case 33:
                    z11 = false;
                    e1.z(iArr[i14], (List) unsafe.getObject(obj, j11), l0Var, false);
                    break;
                case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                    z11 = false;
                    e1.A(iArr[i14], (List) unsafe.getObject(obj, j11), l0Var, false);
                    break;
                case 35:
                    e1.o(iArr[i14], (List) unsafe.getObject(obj, j11), l0Var, true);
                    break;
                case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    e1.s(iArr[i14], (List) unsafe.getObject(obj, j11), l0Var, true);
                    break;
                case 37:
                    e1.v(iArr[i14], (List) unsafe.getObject(obj, j11), l0Var, true);
                    break;
                case 38:
                    e1.D(iArr[i14], (List) unsafe.getObject(obj, j11), l0Var, true);
                    break;
                case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    e1.u(iArr[i14], (List) unsafe.getObject(obj, j11), l0Var, true);
                    break;
                case DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                    e1.r(iArr[i14], (List) unsafe.getObject(obj, j11), l0Var, true);
                    break;
                case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                    e1.q(iArr[i14], (List) unsafe.getObject(obj, j11), l0Var, true);
                    break;
                case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                    e1.m(iArr[i14], (List) unsafe.getObject(obj, j11), l0Var, true);
                    break;
                case 43:
                    e1.C(iArr[i14], (List) unsafe.getObject(obj, j11), l0Var, true);
                    break;
                case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                    e1.p(iArr[i14], (List) unsafe.getObject(obj, j11), l0Var, true);
                    break;
                case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                    e1.x(iArr[i14], (List) unsafe.getObject(obj, j11), l0Var, true);
                    break;
                case 46:
                    e1.y(iArr[i14], (List) unsafe.getObject(obj, j11), l0Var, true);
                    break;
                case 47:
                    e1.z(iArr[i14], (List) unsafe.getObject(obj, j11), l0Var, true);
                    break;
                case 48:
                    e1.A(iArr[i14], (List) unsafe.getObject(obj, j11), l0Var, true);
                    break;
                case 49:
                    e1.t(iArr[i14], (List) unsafe.getObject(obj, j11), l0Var, t0Var.m(i14));
                    break;
                case 50:
                    t0Var.N(l0Var, i16, unsafe.getObject(obj, j11), i14);
                    break;
                case 51:
                    if (t0Var.q(i16, i14, obj)) {
                        double dDoubleValue = ((Double) q1.f1541c.h(j11, obj)).doubleValue();
                        o oVar3 = (o) l0Var.f1512a;
                        oVar3.getClass();
                        oVar3.r0(i16, Double.doubleToRawLongBits(dDoubleValue));
                    }
                    break;
                case 52:
                    if (t0Var.q(i16, i14, obj)) {
                        float fFloatValue = ((Float) q1.f1541c.h(j11, obj)).floatValue();
                        o oVar4 = (o) l0Var.f1512a;
                        oVar4.getClass();
                        oVar4.p0(i16, Float.floatToRawIntBits(fFloatValue));
                    }
                    break;
                case 53:
                    if (t0Var.q(i16, i14, obj)) {
                        ((o) l0Var.f1512a).B0(i16, z(j11, obj));
                    }
                    break;
                case 54:
                    if (t0Var.q(i16, i14, obj)) {
                        ((o) l0Var.f1512a).B0(i16, z(j11, obj));
                    }
                    break;
                case 55:
                    if (t0Var.q(i16, i14, obj)) {
                        ((o) l0Var.f1512a).t0(i16, y(j11, obj));
                    }
                    break;
                case 56:
                    if (t0Var.q(i16, i14, obj)) {
                        ((o) l0Var.f1512a).r0(i16, z(j11, obj));
                    }
                    break;
                case 57:
                    if (t0Var.q(i16, i14, obj)) {
                        ((o) l0Var.f1512a).p0(i16, y(j11, obj));
                    }
                    break;
                case 58:
                    if (t0Var.q(i16, i14, obj)) {
                        ((o) l0Var.f1512a).m0(i16, ((Boolean) q1.f1541c.h(j11, obj)).booleanValue());
                    }
                    break;
                case 59:
                    if (t0Var.q(i16, i14, obj)) {
                        O(i16, unsafe.getObject(obj, j11), l0Var);
                    }
                    break;
                case 60:
                    if (t0Var.q(i16, i14, obj)) {
                        ((o) l0Var.f1512a).v0(i16, (a) unsafe.getObject(obj, j11), t0Var.m(i14));
                    }
                    break;
                case 61:
                    if (t0Var.q(i16, i14, obj)) {
                        l0Var.a(i16, (i) unsafe.getObject(obj, j11));
                    }
                    break;
                case 62:
                    if (t0Var.q(i16, i14, obj)) {
                        ((o) l0Var.f1512a).z0(i16, y(j11, obj));
                    }
                    break;
                case 63:
                    if (t0Var.q(i16, i14, obj)) {
                        ((o) l0Var.f1512a).t0(i16, y(j11, obj));
                    }
                    break;
                case 64:
                    if (t0Var.q(i16, i14, obj)) {
                        ((o) l0Var.f1512a).p0(i16, y(j11, obj));
                    }
                    break;
                case 65:
                    if (t0Var.q(i16, i14, obj)) {
                        ((o) l0Var.f1512a).r0(i16, z(j11, obj));
                    }
                    break;
                case 66:
                    if (t0Var.q(i16, i14, obj)) {
                        int iY = y(j11, obj);
                        ((o) l0Var.f1512a).z0(i16, (iY >> 31) ^ (iY << 1));
                    }
                    break;
                case 67:
                    if (t0Var.q(i16, i14, obj)) {
                        long jZ = z(j11, obj);
                        ((o) l0Var.f1512a).B0(i16, (jZ << 1) ^ (jZ >> 63));
                    }
                    break;
                case 68:
                    if (t0Var.q(i16, i14, obj)) {
                        l0Var.b(i16, unsafe.getObject(obj, j11), t0Var.m(i14));
                    }
                    break;
                default:
                    break;
            }
            i14 += 3;
            i12 = 1048575;
        }
        ((l1) t0Var.f1565l).getClass();
        ((c0) obj).unknownFields.d(l0Var);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0187  */
    /* JADX WARN: Code duplicated, block: B:48:0x0198  */
    /* JADX WARN: Code duplicated, block: B:49:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:50:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:51:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:52:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:54:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:55:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:57:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:59:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:60:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:62:0x0201  */
    /* JADX WARN: Code duplicated, block: B:63:0x020c  */
    /* JADX WARN: Code duplicated, block: B:64:0x0213  */
    /* JADX WARN: Code duplicated, block: B:65:0x0220  */
    /* JADX WARN: Code duplicated, block: B:66:0x0229  */
    /* JADX WARN: Code duplicated, block: B:67:0x0231  */
    /* JADX WARN: Code duplicated, block: B:68:0x0237  */
    /* JADX WARN: Code duplicated, block: B:69:0x023d  */
    /* JADX WARN: Code duplicated, block: B:70:0x0249  */
    /* JADX WARN: Code duplicated, block: B:71:0x0254  */
    /* JADX WARN: Code duplicated, block: B:72:0x025f  */
    /* JADX WARN: Code duplicated, block: B:73:0x0266  */
    /* JADX WARN: Code duplicated, block: B:78:0x0192 A[SYNTHETIC] */
    public final void N(l0 l0Var, int i11, Object obj, int i12) throws IOException {
        int iH0;
        int iA;
        int iG0;
        int i13;
        int iF0;
        int iA2;
        int iG1;
        if (obj != null) {
            int i14 = 2;
            Object obj2 = this.f1555b[(i12 / 3) * 2];
            this.m.getClass();
            m0 m0Var = ((n0) obj2).f1521a;
            y1 y1Var = m0Var.f1515b;
            y1 y1Var2 = m0Var.f1514a;
            o oVar = (o) l0Var.f1512a;
            oVar.getClass();
            for (Map.Entry entry : ((o0) obj).entrySet()) {
                oVar.y0(i11, i14);
                Object key = entry.getKey();
                Object value = entry.getValue();
                int i15 = u.f1567c;
                int i16 = 1;
                int iF1 = o.f0(1);
                y1 y1Var3 = y1.GROUP;
                if (y1Var2 == y1Var3) {
                    iF1 *= 2;
                }
                int[] iArr = t.f1551b;
                int iH1 = 8;
                int i17 = i14;
                switch (iArr[y1Var2.ordinal()]) {
                    case 1:
                        ((Double) key).getClass();
                        iH0 = 8;
                        i13 = iH0 + iF1;
                        iF0 = o.f0(i17);
                        if (y1Var == y1Var3) {
                            iF0 *= 2;
                        }
                        switch (iArr[y1Var.ordinal()]) {
                            case 1:
                                ((Double) value).getClass();
                                oVar.A0(iH1 + iF0 + i13);
                                Object key2 = entry.getKey();
                                Object value2 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key2);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value2);
                                break;
                            case 2:
                                ((Float) value).getClass();
                                iH1 = 4;
                                oVar.A0(iH1 + iF0 + i13);
                                Object key3 = entry.getKey();
                                Object value3 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key3);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value3);
                                break;
                            case 3:
                                iH1 = o.h0(((Long) value).longValue());
                                oVar.A0(iH1 + iF0 + i13);
                                Object key4 = entry.getKey();
                                Object value4 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key4);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value4);
                                break;
                            case 4:
                                iH1 = o.h0(((Long) value).longValue());
                                oVar.A0(iH1 + iF0 + i13);
                                Object key5 = entry.getKey();
                                Object value5 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key5);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value5);
                                break;
                            case 5:
                                iH1 = o.h0(((Integer) value).intValue());
                                oVar.A0(iH1 + iF0 + i13);
                                Object key6 = entry.getKey();
                                Object value6 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key6);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value6);
                                break;
                            case 6:
                                ((Long) value).getClass();
                                oVar.A0(iH1 + iF0 + i13);
                                Object key7 = entry.getKey();
                                Object value7 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key7);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value7);
                                break;
                            case 7:
                                ((Integer) value).getClass();
                                iH1 = 4;
                                oVar.A0(iH1 + iF0 + i13);
                                Object key8 = entry.getKey();
                                Object value8 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key8);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value8);
                                break;
                            case 8:
                                ((Boolean) value).getClass();
                                iH1 = i16;
                                oVar.A0(iH1 + iF0 + i13);
                                Object key9 = entry.getKey();
                                Object value9 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key9);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value9);
                                break;
                            case 9:
                                iH1 = ((c0) ((a) value)).a(null);
                                oVar.A0(iH1 + iF0 + i13);
                                Object key10 = entry.getKey();
                                Object value10 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key10);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value10);
                                break;
                            case 10:
                                iA2 = ((c0) ((a) value)).a(null);
                                iG1 = o.g0(iA2);
                                iH1 = iG1 + iA2;
                                oVar.A0(iH1 + iF0 + i13);
                                Object key11 = entry.getKey();
                                Object value11 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key11);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value11);
                                break;
                            case 11:
                                if (value instanceof i) {
                                    iA2 = ((i) value).size();
                                    iG1 = o.g0(iA2);
                                    iH1 = iG1 + iA2;
                                } else {
                                    iH1 = o.e0((String) value);
                                }
                                oVar.A0(iH1 + iF0 + i13);
                                Object key12 = entry.getKey();
                                Object value12 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key12);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value12);
                                break;
                            case 12:
                                if (value instanceof i) {
                                    iA2 = ((i) value).size();
                                    iG1 = o.g0(iA2);
                                } else {
                                    iA2 = ((byte[]) value).length;
                                    iG1 = o.g0(iA2);
                                }
                                iH1 = iG1 + iA2;
                                oVar.A0(iH1 + iF0 + i13);
                                Object key13 = entry.getKey();
                                Object value13 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key13);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value13);
                                break;
                            case 13:
                                iH1 = o.g0(((Integer) value).intValue());
                                oVar.A0(iH1 + iF0 + i13);
                                Object key14 = entry.getKey();
                                Object value14 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key14);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value14);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iH1 = 4;
                                oVar.A0(iH1 + iF0 + i13);
                                Object key15 = entry.getKey();
                                Object value15 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key15);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value15);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                oVar.A0(iH1 + iF0 + i13);
                                Object key16 = entry.getKey();
                                Object value16 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key16);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value16);
                                break;
                            case 16:
                                int iIntValue = ((Integer) value).intValue();
                                iH1 = o.g0((iIntValue >> 31) ^ (iIntValue << 1));
                                oVar.A0(iH1 + iF0 + i13);
                                Object key17 = entry.getKey();
                                Object value17 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key17);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value17);
                                break;
                            case 17:
                                long jLongValue = ((Long) value).longValue();
                                iH1 = o.h0((jLongValue >> 63) ^ (jLongValue << i16));
                                oVar.A0(iH1 + iF0 + i13);
                                Object key18 = entry.getKey();
                                Object value18 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key18);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value18);
                                break;
                            case 18:
                                iH1 = o.h0(((Integer) value).intValue());
                                oVar.A0(iH1 + iF0 + i13);
                                Object key19 = entry.getKey();
                                Object value19 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key19);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value19);
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    case 2:
                        ((Float) key).getClass();
                        iH0 = 4;
                        i13 = iH0 + iF1;
                        iF0 = o.f0(i17);
                        if (y1Var == y1Var3) {
                            iF0 *= 2;
                        }
                        switch (iArr[y1Var.ordinal()]) {
                            case 1:
                                ((Double) value).getClass();
                                oVar.A0(iH1 + iF0 + i13);
                                Object key110 = entry.getKey();
                                Object value110 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key110);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value110);
                                break;
                            case 2:
                                ((Float) value).getClass();
                                iH1 = 4;
                                oVar.A0(iH1 + iF0 + i13);
                                Object key111 = entry.getKey();
                                Object value111 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key111);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value111);
                                break;
                            case 3:
                                iH1 = o.h0(((Long) value).longValue());
                                oVar.A0(iH1 + iF0 + i13);
                                Object key112 = entry.getKey();
                                Object value112 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key112);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value112);
                                break;
                            case 4:
                                iH1 = o.h0(((Long) value).longValue());
                                oVar.A0(iH1 + iF0 + i13);
                                Object key113 = entry.getKey();
                                Object value113 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key113);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value113);
                                break;
                            case 5:
                                iH1 = o.h0(((Integer) value).intValue());
                                oVar.A0(iH1 + iF0 + i13);
                                Object key114 = entry.getKey();
                                Object value114 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key114);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value114);
                                break;
                            case 6:
                                ((Long) value).getClass();
                                oVar.A0(iH1 + iF0 + i13);
                                Object key115 = entry.getKey();
                                Object value115 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key115);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value115);
                                break;
                            case 7:
                                ((Integer) value).getClass();
                                iH1 = 4;
                                oVar.A0(iH1 + iF0 + i13);
                                Object key116 = entry.getKey();
                                Object value116 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key116);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value116);
                                break;
                            case 8:
                                ((Boolean) value).getClass();
                                iH1 = i16;
                                oVar.A0(iH1 + iF0 + i13);
                                Object key117 = entry.getKey();
                                Object value117 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key117);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value117);
                                break;
                            case 9:
                                iH1 = ((c0) ((a) value)).a(null);
                                oVar.A0(iH1 + iF0 + i13);
                                Object key118 = entry.getKey();
                                Object value118 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key118);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value118);
                                break;
                            case 10:
                                iA2 = ((c0) ((a) value)).a(null);
                                iG1 = o.g0(iA2);
                                iH1 = iG1 + iA2;
                                oVar.A0(iH1 + iF0 + i13);
                                Object key119 = entry.getKey();
                                Object value119 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key119);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value119);
                                break;
                            case 11:
                                if (value instanceof i) {
                                    iA2 = ((i) value).size();
                                    iG1 = o.g0(iA2);
                                    iH1 = iG1 + iA2;
                                } else {
                                    iH1 = o.e0((String) value);
                                }
                                oVar.A0(iH1 + iF0 + i13);
                                Object key1110 = entry.getKey();
                                Object value1110 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key1110);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value1110);
                                break;
                            case 12:
                                if (value instanceof i) {
                                    iA2 = ((i) value).size();
                                    iG1 = o.g0(iA2);
                                } else {
                                    iA2 = ((byte[]) value).length;
                                    iG1 = o.g0(iA2);
                                }
                                iH1 = iG1 + iA2;
                                oVar.A0(iH1 + iF0 + i13);
                                Object key1111 = entry.getKey();
                                Object value1111 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key1111);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value1111);
                                break;
                            case 13:
                                iH1 = o.g0(((Integer) value).intValue());
                                oVar.A0(iH1 + iF0 + i13);
                                Object key1112 = entry.getKey();
                                Object value1112 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key1112);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value1112);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iH1 = 4;
                                oVar.A0(iH1 + iF0 + i13);
                                Object key1113 = entry.getKey();
                                Object value1113 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key1113);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value1113);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                oVar.A0(iH1 + iF0 + i13);
                                Object key1114 = entry.getKey();
                                Object value1114 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key1114);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value1114);
                                break;
                            case 16:
                                int iIntValue2 = ((Integer) value).intValue();
                                iH1 = o.g0((iIntValue2 >> 31) ^ (iIntValue2 << 1));
                                oVar.A0(iH1 + iF0 + i13);
                                Object key1115 = entry.getKey();
                                Object value1115 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key1115);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value1115);
                                break;
                            case 17:
                                long jLongValue2 = ((Long) value).longValue();
                                iH1 = o.h0((jLongValue2 >> 63) ^ (jLongValue2 << i16));
                                oVar.A0(iH1 + iF0 + i13);
                                Object key1116 = entry.getKey();
                                Object value1116 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key1116);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value1116);
                                break;
                            case 18:
                                iH1 = o.h0(((Integer) value).intValue());
                                oVar.A0(iH1 + iF0 + i13);
                                Object key1117 = entry.getKey();
                                Object value1117 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key1117);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value1117);
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    case 3:
                        i16 = 1;
                        iF1 = iF1;
                        iH0 = o.h0(((Long) key).longValue());
                        i13 = iH0 + iF1;
                        iF0 = o.f0(i17);
                        if (y1Var == y1Var3) {
                            iF0 *= 2;
                        }
                        switch (iArr[y1Var.ordinal()]) {
                            case 1:
                                ((Double) value).getClass();
                                oVar.A0(iH1 + iF0 + i13);
                                Object key1118 = entry.getKey();
                                Object value1118 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key1118);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value1118);
                                break;
                            case 2:
                                ((Float) value).getClass();
                                iH1 = 4;
                                oVar.A0(iH1 + iF0 + i13);
                                Object key1119 = entry.getKey();
                                Object value1119 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key1119);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value1119);
                                break;
                            case 3:
                                iH1 = o.h0(((Long) value).longValue());
                                oVar.A0(iH1 + iF0 + i13);
                                Object key11110 = entry.getKey();
                                Object value11110 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key11110);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value11110);
                                break;
                            case 4:
                                iH1 = o.h0(((Long) value).longValue());
                                oVar.A0(iH1 + iF0 + i13);
                                Object key11111 = entry.getKey();
                                Object value11111 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key11111);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value11111);
                                break;
                            case 5:
                                iH1 = o.h0(((Integer) value).intValue());
                                oVar.A0(iH1 + iF0 + i13);
                                Object key11112 = entry.getKey();
                                Object value11112 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key11112);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value11112);
                                break;
                            case 6:
                                ((Long) value).getClass();
                                oVar.A0(iH1 + iF0 + i13);
                                Object key11113 = entry.getKey();
                                Object value11113 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key11113);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value11113);
                                break;
                            case 7:
                                ((Integer) value).getClass();
                                iH1 = 4;
                                oVar.A0(iH1 + iF0 + i13);
                                Object key11114 = entry.getKey();
                                Object value11114 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key11114);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value11114);
                                break;
                            case 8:
                                ((Boolean) value).getClass();
                                iH1 = i16;
                                oVar.A0(iH1 + iF0 + i13);
                                Object key11115 = entry.getKey();
                                Object value11115 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key11115);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value11115);
                                break;
                            case 9:
                                iH1 = ((c0) ((a) value)).a(null);
                                oVar.A0(iH1 + iF0 + i13);
                                Object key11116 = entry.getKey();
                                Object value11116 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key11116);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value11116);
                                break;
                            case 10:
                                iA2 = ((c0) ((a) value)).a(null);
                                iG1 = o.g0(iA2);
                                iH1 = iG1 + iA2;
                                oVar.A0(iH1 + iF0 + i13);
                                Object key11117 = entry.getKey();
                                Object value11117 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key11117);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value11117);
                                break;
                            case 11:
                                if (value instanceof i) {
                                    iA2 = ((i) value).size();
                                    iG1 = o.g0(iA2);
                                    iH1 = iG1 + iA2;
                                } else {
                                    iH1 = o.e0((String) value);
                                }
                                oVar.A0(iH1 + iF0 + i13);
                                Object key11118 = entry.getKey();
                                Object value11118 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key11118);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value11118);
                                break;
                            case 12:
                                if (value instanceof i) {
                                    iA2 = ((i) value).size();
                                    iG1 = o.g0(iA2);
                                } else {
                                    iA2 = ((byte[]) value).length;
                                    iG1 = o.g0(iA2);
                                }
                                iH1 = iG1 + iA2;
                                oVar.A0(iH1 + iF0 + i13);
                                Object key11119 = entry.getKey();
                                Object value11119 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key11119);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value11119);
                                break;
                            case 13:
                                iH1 = o.g0(((Integer) value).intValue());
                                oVar.A0(iH1 + iF0 + i13);
                                Object key111110 = entry.getKey();
                                Object value111110 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key111110);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value111110);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iH1 = 4;
                                oVar.A0(iH1 + iF0 + i13);
                                Object key111111 = entry.getKey();
                                Object value111111 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key111111);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value111111);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                oVar.A0(iH1 + iF0 + i13);
                                Object key111112 = entry.getKey();
                                Object value111112 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key111112);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value111112);
                                break;
                            case 16:
                                int iIntValue3 = ((Integer) value).intValue();
                                iH1 = o.g0((iIntValue3 >> 31) ^ (iIntValue3 << 1));
                                oVar.A0(iH1 + iF0 + i13);
                                Object key111113 = entry.getKey();
                                Object value111113 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key111113);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value111113);
                                break;
                            case 17:
                                long jLongValue3 = ((Long) value).longValue();
                                iH1 = o.h0((jLongValue3 >> 63) ^ (jLongValue3 << i16));
                                oVar.A0(iH1 + iF0 + i13);
                                Object key111114 = entry.getKey();
                                Object value111114 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key111114);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value111114);
                                break;
                            case 18:
                                iH1 = o.h0(((Integer) value).intValue());
                                oVar.A0(iH1 + iF0 + i13);
                                Object key111115 = entry.getKey();
                                Object value111115 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key111115);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value111115);
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    case 4:
                        i16 = 1;
                        iF1 = iF1;
                        iH0 = o.h0(((Long) key).longValue());
                        i13 = iH0 + iF1;
                        iF0 = o.f0(i17);
                        if (y1Var == y1Var3) {
                            iF0 *= 2;
                        }
                        switch (iArr[y1Var.ordinal()]) {
                            case 1:
                                ((Double) value).getClass();
                                oVar.A0(iH1 + iF0 + i13);
                                Object key111116 = entry.getKey();
                                Object value111116 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key111116);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value111116);
                                break;
                            case 2:
                                ((Float) value).getClass();
                                iH1 = 4;
                                oVar.A0(iH1 + iF0 + i13);
                                Object key111117 = entry.getKey();
                                Object value111117 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key111117);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value111117);
                                break;
                            case 3:
                                iH1 = o.h0(((Long) value).longValue());
                                oVar.A0(iH1 + iF0 + i13);
                                Object key111118 = entry.getKey();
                                Object value111118 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key111118);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value111118);
                                break;
                            case 4:
                                iH1 = o.h0(((Long) value).longValue());
                                oVar.A0(iH1 + iF0 + i13);
                                Object key111119 = entry.getKey();
                                Object value111119 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key111119);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value111119);
                                break;
                            case 5:
                                iH1 = o.h0(((Integer) value).intValue());
                                oVar.A0(iH1 + iF0 + i13);
                                Object key1111110 = entry.getKey();
                                Object value1111110 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key1111110);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value1111110);
                                break;
                            case 6:
                                ((Long) value).getClass();
                                oVar.A0(iH1 + iF0 + i13);
                                Object key1111111 = entry.getKey();
                                Object value1111111 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key1111111);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value1111111);
                                break;
                            case 7:
                                ((Integer) value).getClass();
                                iH1 = 4;
                                oVar.A0(iH1 + iF0 + i13);
                                Object key1111112 = entry.getKey();
                                Object value1111112 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key1111112);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value1111112);
                                break;
                            case 8:
                                ((Boolean) value).getClass();
                                iH1 = i16;
                                oVar.A0(iH1 + iF0 + i13);
                                Object key1111113 = entry.getKey();
                                Object value1111113 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key1111113);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value1111113);
                                break;
                            case 9:
                                iH1 = ((c0) ((a) value)).a(null);
                                oVar.A0(iH1 + iF0 + i13);
                                Object key1111114 = entry.getKey();
                                Object value1111114 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key1111114);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value1111114);
                                break;
                            case 10:
                                iA2 = ((c0) ((a) value)).a(null);
                                iG1 = o.g0(iA2);
                                iH1 = iG1 + iA2;
                                oVar.A0(iH1 + iF0 + i13);
                                Object key1111115 = entry.getKey();
                                Object value1111115 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key1111115);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value1111115);
                                break;
                            case 11:
                                if (value instanceof i) {
                                    iA2 = ((i) value).size();
                                    iG1 = o.g0(iA2);
                                    iH1 = iG1 + iA2;
                                } else {
                                    iH1 = o.e0((String) value);
                                }
                                oVar.A0(iH1 + iF0 + i13);
                                Object key1111116 = entry.getKey();
                                Object value1111116 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key1111116);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value1111116);
                                break;
                            case 12:
                                if (value instanceof i) {
                                    iA2 = ((i) value).size();
                                    iG1 = o.g0(iA2);
                                } else {
                                    iA2 = ((byte[]) value).length;
                                    iG1 = o.g0(iA2);
                                }
                                iH1 = iG1 + iA2;
                                oVar.A0(iH1 + iF0 + i13);
                                Object key1111117 = entry.getKey();
                                Object value1111117 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key1111117);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value1111117);
                                break;
                            case 13:
                                iH1 = o.g0(((Integer) value).intValue());
                                oVar.A0(iH1 + iF0 + i13);
                                Object key1111118 = entry.getKey();
                                Object value1111118 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key1111118);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value1111118);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iH1 = 4;
                                oVar.A0(iH1 + iF0 + i13);
                                Object key1111119 = entry.getKey();
                                Object value1111119 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key1111119);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value1111119);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                oVar.A0(iH1 + iF0 + i13);
                                Object key11111110 = entry.getKey();
                                Object value11111110 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key11111110);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value11111110);
                                break;
                            case 16:
                                int iIntValue4 = ((Integer) value).intValue();
                                iH1 = o.g0((iIntValue4 >> 31) ^ (iIntValue4 << 1));
                                oVar.A0(iH1 + iF0 + i13);
                                Object key11111111 = entry.getKey();
                                Object value11111111 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key11111111);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value11111111);
                                break;
                            case 17:
                                long jLongValue4 = ((Long) value).longValue();
                                iH1 = o.h0((jLongValue4 >> 63) ^ (jLongValue4 << i16));
                                oVar.A0(iH1 + iF0 + i13);
                                Object key11111112 = entry.getKey();
                                Object value11111112 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key11111112);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value11111112);
                                break;
                            case 18:
                                iH1 = o.h0(((Integer) value).intValue());
                                oVar.A0(iH1 + iF0 + i13);
                                Object key11111113 = entry.getKey();
                                Object value11111113 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key11111113);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value11111113);
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    case 5:
                        i16 = 1;
                        iF1 = iF1;
                        iH0 = o.h0(((Integer) key).intValue());
                        i13 = iH0 + iF1;
                        iF0 = o.f0(i17);
                        if (y1Var == y1Var3) {
                            iF0 *= 2;
                        }
                        switch (iArr[y1Var.ordinal()]) {
                            case 1:
                                ((Double) value).getClass();
                                oVar.A0(iH1 + iF0 + i13);
                                Object key11111114 = entry.getKey();
                                Object value11111114 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key11111114);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value11111114);
                                break;
                            case 2:
                                ((Float) value).getClass();
                                iH1 = 4;
                                oVar.A0(iH1 + iF0 + i13);
                                Object key11111115 = entry.getKey();
                                Object value11111115 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key11111115);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value11111115);
                                break;
                            case 3:
                                iH1 = o.h0(((Long) value).longValue());
                                oVar.A0(iH1 + iF0 + i13);
                                Object key11111116 = entry.getKey();
                                Object value11111116 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key11111116);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value11111116);
                                break;
                            case 4:
                                iH1 = o.h0(((Long) value).longValue());
                                oVar.A0(iH1 + iF0 + i13);
                                Object key11111117 = entry.getKey();
                                Object value11111117 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key11111117);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value11111117);
                                break;
                            case 5:
                                iH1 = o.h0(((Integer) value).intValue());
                                oVar.A0(iH1 + iF0 + i13);
                                Object key11111118 = entry.getKey();
                                Object value11111118 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key11111118);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value11111118);
                                break;
                            case 6:
                                ((Long) value).getClass();
                                oVar.A0(iH1 + iF0 + i13);
                                Object key11111119 = entry.getKey();
                                Object value11111119 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key11111119);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value11111119);
                                break;
                            case 7:
                                ((Integer) value).getClass();
                                iH1 = 4;
                                oVar.A0(iH1 + iF0 + i13);
                                Object key111111110 = entry.getKey();
                                Object value111111110 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key111111110);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value111111110);
                                break;
                            case 8:
                                ((Boolean) value).getClass();
                                iH1 = i16;
                                oVar.A0(iH1 + iF0 + i13);
                                Object key111111111 = entry.getKey();
                                Object value111111111 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key111111111);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value111111111);
                                break;
                            case 9:
                                iH1 = ((c0) ((a) value)).a(null);
                                oVar.A0(iH1 + iF0 + i13);
                                Object key111111112 = entry.getKey();
                                Object value111111112 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key111111112);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value111111112);
                                break;
                            case 10:
                                iA2 = ((c0) ((a) value)).a(null);
                                iG1 = o.g0(iA2);
                                iH1 = iG1 + iA2;
                                oVar.A0(iH1 + iF0 + i13);
                                Object key111111113 = entry.getKey();
                                Object value111111113 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key111111113);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value111111113);
                                break;
                            case 11:
                                if (value instanceof i) {
                                    iA2 = ((i) value).size();
                                    iG1 = o.g0(iA2);
                                    iH1 = iG1 + iA2;
                                } else {
                                    iH1 = o.e0((String) value);
                                }
                                oVar.A0(iH1 + iF0 + i13);
                                Object key111111114 = entry.getKey();
                                Object value111111114 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key111111114);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value111111114);
                                break;
                            case 12:
                                if (value instanceof i) {
                                    iA2 = ((i) value).size();
                                    iG1 = o.g0(iA2);
                                } else {
                                    iA2 = ((byte[]) value).length;
                                    iG1 = o.g0(iA2);
                                }
                                iH1 = iG1 + iA2;
                                oVar.A0(iH1 + iF0 + i13);
                                Object key111111115 = entry.getKey();
                                Object value111111115 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key111111115);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value111111115);
                                break;
                            case 13:
                                iH1 = o.g0(((Integer) value).intValue());
                                oVar.A0(iH1 + iF0 + i13);
                                Object key111111116 = entry.getKey();
                                Object value111111116 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key111111116);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value111111116);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iH1 = 4;
                                oVar.A0(iH1 + iF0 + i13);
                                Object key111111117 = entry.getKey();
                                Object value111111117 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key111111117);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value111111117);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                oVar.A0(iH1 + iF0 + i13);
                                Object key111111118 = entry.getKey();
                                Object value111111118 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key111111118);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value111111118);
                                break;
                            case 16:
                                int iIntValue5 = ((Integer) value).intValue();
                                iH1 = o.g0((iIntValue5 >> 31) ^ (iIntValue5 << 1));
                                oVar.A0(iH1 + iF0 + i13);
                                Object key111111119 = entry.getKey();
                                Object value111111119 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key111111119);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value111111119);
                                break;
                            case 17:
                                long jLongValue5 = ((Long) value).longValue();
                                iH1 = o.h0((jLongValue5 >> 63) ^ (jLongValue5 << i16));
                                oVar.A0(iH1 + iF0 + i13);
                                Object key1111111110 = entry.getKey();
                                Object value1111111110 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key1111111110);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value1111111110);
                                break;
                            case 18:
                                iH1 = o.h0(((Integer) value).intValue());
                                oVar.A0(iH1 + iF0 + i13);
                                Object key1111111111 = entry.getKey();
                                Object value1111111111 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key1111111111);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value1111111111);
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    case 6:
                        ((Long) key).getClass();
                        iH0 = 8;
                        i13 = iH0 + iF1;
                        iF0 = o.f0(i17);
                        if (y1Var == y1Var3) {
                            iF0 *= 2;
                        }
                        switch (iArr[y1Var.ordinal()]) {
                            case 1:
                                ((Double) value).getClass();
                                oVar.A0(iH1 + iF0 + i13);
                                Object key1111111112 = entry.getKey();
                                Object value1111111112 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key1111111112);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value1111111112);
                                break;
                            case 2:
                                ((Float) value).getClass();
                                iH1 = 4;
                                oVar.A0(iH1 + iF0 + i13);
                                Object key1111111113 = entry.getKey();
                                Object value1111111113 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key1111111113);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value1111111113);
                                break;
                            case 3:
                                iH1 = o.h0(((Long) value).longValue());
                                oVar.A0(iH1 + iF0 + i13);
                                Object key1111111114 = entry.getKey();
                                Object value1111111114 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key1111111114);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value1111111114);
                                break;
                            case 4:
                                iH1 = o.h0(((Long) value).longValue());
                                oVar.A0(iH1 + iF0 + i13);
                                Object key1111111115 = entry.getKey();
                                Object value1111111115 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key1111111115);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value1111111115);
                                break;
                            case 5:
                                iH1 = o.h0(((Integer) value).intValue());
                                oVar.A0(iH1 + iF0 + i13);
                                Object key1111111116 = entry.getKey();
                                Object value1111111116 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key1111111116);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value1111111116);
                                break;
                            case 6:
                                ((Long) value).getClass();
                                oVar.A0(iH1 + iF0 + i13);
                                Object key1111111117 = entry.getKey();
                                Object value1111111117 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key1111111117);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value1111111117);
                                break;
                            case 7:
                                ((Integer) value).getClass();
                                iH1 = 4;
                                oVar.A0(iH1 + iF0 + i13);
                                Object key1111111118 = entry.getKey();
                                Object value1111111118 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key1111111118);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value1111111118);
                                break;
                            case 8:
                                ((Boolean) value).getClass();
                                iH1 = i16;
                                oVar.A0(iH1 + iF0 + i13);
                                Object key1111111119 = entry.getKey();
                                Object value1111111119 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key1111111119);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value1111111119);
                                break;
                            case 9:
                                iH1 = ((c0) ((a) value)).a(null);
                                oVar.A0(iH1 + iF0 + i13);
                                Object key11111111110 = entry.getKey();
                                Object value11111111110 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key11111111110);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value11111111110);
                                break;
                            case 10:
                                iA2 = ((c0) ((a) value)).a(null);
                                iG1 = o.g0(iA2);
                                iH1 = iG1 + iA2;
                                oVar.A0(iH1 + iF0 + i13);
                                Object key11111111111 = entry.getKey();
                                Object value11111111111 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key11111111111);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value11111111111);
                                break;
                            case 11:
                                if (value instanceof i) {
                                    iA2 = ((i) value).size();
                                    iG1 = o.g0(iA2);
                                    iH1 = iG1 + iA2;
                                } else {
                                    iH1 = o.e0((String) value);
                                }
                                oVar.A0(iH1 + iF0 + i13);
                                Object key11111111112 = entry.getKey();
                                Object value11111111112 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key11111111112);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value11111111112);
                                break;
                            case 12:
                                if (value instanceof i) {
                                    iA2 = ((i) value).size();
                                    iG1 = o.g0(iA2);
                                } else {
                                    iA2 = ((byte[]) value).length;
                                    iG1 = o.g0(iA2);
                                }
                                iH1 = iG1 + iA2;
                                oVar.A0(iH1 + iF0 + i13);
                                Object key11111111113 = entry.getKey();
                                Object value11111111113 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key11111111113);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value11111111113);
                                break;
                            case 13:
                                iH1 = o.g0(((Integer) value).intValue());
                                oVar.A0(iH1 + iF0 + i13);
                                Object key11111111114 = entry.getKey();
                                Object value11111111114 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key11111111114);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value11111111114);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iH1 = 4;
                                oVar.A0(iH1 + iF0 + i13);
                                Object key11111111115 = entry.getKey();
                                Object value11111111115 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key11111111115);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value11111111115);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                oVar.A0(iH1 + iF0 + i13);
                                Object key11111111116 = entry.getKey();
                                Object value11111111116 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key11111111116);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value11111111116);
                                break;
                            case 16:
                                int iIntValue6 = ((Integer) value).intValue();
                                iH1 = o.g0((iIntValue6 >> 31) ^ (iIntValue6 << 1));
                                oVar.A0(iH1 + iF0 + i13);
                                Object key11111111117 = entry.getKey();
                                Object value11111111117 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key11111111117);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value11111111117);
                                break;
                            case 17:
                                long jLongValue6 = ((Long) value).longValue();
                                iH1 = o.h0((jLongValue6 >> 63) ^ (jLongValue6 << i16));
                                oVar.A0(iH1 + iF0 + i13);
                                Object key11111111118 = entry.getKey();
                                Object value11111111118 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key11111111118);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value11111111118);
                                break;
                            case 18:
                                iH1 = o.h0(((Integer) value).intValue());
                                oVar.A0(iH1 + iF0 + i13);
                                Object key11111111119 = entry.getKey();
                                Object value11111111119 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key11111111119);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value11111111119);
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    case 7:
                        ((Integer) key).getClass();
                        iH0 = 4;
                        i13 = iH0 + iF1;
                        iF0 = o.f0(i17);
                        if (y1Var == y1Var3) {
                            iF0 *= 2;
                        }
                        switch (iArr[y1Var.ordinal()]) {
                            case 1:
                                ((Double) value).getClass();
                                oVar.A0(iH1 + iF0 + i13);
                                Object key111111111110 = entry.getKey();
                                Object value111111111110 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key111111111110);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value111111111110);
                                break;
                            case 2:
                                ((Float) value).getClass();
                                iH1 = 4;
                                oVar.A0(iH1 + iF0 + i13);
                                Object key111111111111 = entry.getKey();
                                Object value111111111111 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key111111111111);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value111111111111);
                                break;
                            case 3:
                                iH1 = o.h0(((Long) value).longValue());
                                oVar.A0(iH1 + iF0 + i13);
                                Object key111111111112 = entry.getKey();
                                Object value111111111112 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key111111111112);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value111111111112);
                                break;
                            case 4:
                                iH1 = o.h0(((Long) value).longValue());
                                oVar.A0(iH1 + iF0 + i13);
                                Object key111111111113 = entry.getKey();
                                Object value111111111113 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key111111111113);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value111111111113);
                                break;
                            case 5:
                                iH1 = o.h0(((Integer) value).intValue());
                                oVar.A0(iH1 + iF0 + i13);
                                Object key111111111114 = entry.getKey();
                                Object value111111111114 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key111111111114);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value111111111114);
                                break;
                            case 6:
                                ((Long) value).getClass();
                                oVar.A0(iH1 + iF0 + i13);
                                Object key111111111115 = entry.getKey();
                                Object value111111111115 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key111111111115);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value111111111115);
                                break;
                            case 7:
                                ((Integer) value).getClass();
                                iH1 = 4;
                                oVar.A0(iH1 + iF0 + i13);
                                Object key111111111116 = entry.getKey();
                                Object value111111111116 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key111111111116);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value111111111116);
                                break;
                            case 8:
                                ((Boolean) value).getClass();
                                iH1 = i16;
                                oVar.A0(iH1 + iF0 + i13);
                                Object key111111111117 = entry.getKey();
                                Object value111111111117 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key111111111117);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value111111111117);
                                break;
                            case 9:
                                iH1 = ((c0) ((a) value)).a(null);
                                oVar.A0(iH1 + iF0 + i13);
                                Object key111111111118 = entry.getKey();
                                Object value111111111118 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key111111111118);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value111111111118);
                                break;
                            case 10:
                                iA2 = ((c0) ((a) value)).a(null);
                                iG1 = o.g0(iA2);
                                iH1 = iG1 + iA2;
                                oVar.A0(iH1 + iF0 + i13);
                                Object key111111111119 = entry.getKey();
                                Object value111111111119 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key111111111119);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value111111111119);
                                break;
                            case 11:
                                if (value instanceof i) {
                                    iA2 = ((i) value).size();
                                    iG1 = o.g0(iA2);
                                    iH1 = iG1 + iA2;
                                } else {
                                    iH1 = o.e0((String) value);
                                }
                                oVar.A0(iH1 + iF0 + i13);
                                Object key1111111111110 = entry.getKey();
                                Object value1111111111110 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key1111111111110);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value1111111111110);
                                break;
                            case 12:
                                if (value instanceof i) {
                                    iA2 = ((i) value).size();
                                    iG1 = o.g0(iA2);
                                } else {
                                    iA2 = ((byte[]) value).length;
                                    iG1 = o.g0(iA2);
                                }
                                iH1 = iG1 + iA2;
                                oVar.A0(iH1 + iF0 + i13);
                                Object key1111111111111 = entry.getKey();
                                Object value1111111111111 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key1111111111111);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value1111111111111);
                                break;
                            case 13:
                                iH1 = o.g0(((Integer) value).intValue());
                                oVar.A0(iH1 + iF0 + i13);
                                Object key1111111111112 = entry.getKey();
                                Object value1111111111112 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key1111111111112);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value1111111111112);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iH1 = 4;
                                oVar.A0(iH1 + iF0 + i13);
                                Object key1111111111113 = entry.getKey();
                                Object value1111111111113 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key1111111111113);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value1111111111113);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                oVar.A0(iH1 + iF0 + i13);
                                Object key1111111111114 = entry.getKey();
                                Object value1111111111114 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key1111111111114);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value1111111111114);
                                break;
                            case 16:
                                int iIntValue7 = ((Integer) value).intValue();
                                iH1 = o.g0((iIntValue7 >> 31) ^ (iIntValue7 << 1));
                                oVar.A0(iH1 + iF0 + i13);
                                Object key1111111111115 = entry.getKey();
                                Object value1111111111115 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key1111111111115);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value1111111111115);
                                break;
                            case 17:
                                long jLongValue7 = ((Long) value).longValue();
                                iH1 = o.h0((jLongValue7 >> 63) ^ (jLongValue7 << i16));
                                oVar.A0(iH1 + iF0 + i13);
                                Object key1111111111116 = entry.getKey();
                                Object value1111111111116 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key1111111111116);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value1111111111116);
                                break;
                            case 18:
                                iH1 = o.h0(((Integer) value).intValue());
                                oVar.A0(iH1 + iF0 + i13);
                                Object key1111111111117 = entry.getKey();
                                Object value1111111111117 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key1111111111117);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value1111111111117);
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    case 8:
                        i16 = 1;
                        iF1 = iF1;
                        ((Boolean) key).getClass();
                        iH0 = 1;
                        i13 = iH0 + iF1;
                        iF0 = o.f0(i17);
                        if (y1Var == y1Var3) {
                            iF0 *= 2;
                        }
                        switch (iArr[y1Var.ordinal()]) {
                            case 1:
                                ((Double) value).getClass();
                                oVar.A0(iH1 + iF0 + i13);
                                Object key1111111111118 = entry.getKey();
                                Object value1111111111118 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key1111111111118);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value1111111111118);
                                break;
                            case 2:
                                ((Float) value).getClass();
                                iH1 = 4;
                                oVar.A0(iH1 + iF0 + i13);
                                Object key1111111111119 = entry.getKey();
                                Object value1111111111119 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key1111111111119);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value1111111111119);
                                break;
                            case 3:
                                iH1 = o.h0(((Long) value).longValue());
                                oVar.A0(iH1 + iF0 + i13);
                                Object key11111111111110 = entry.getKey();
                                Object value11111111111110 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key11111111111110);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value11111111111110);
                                break;
                            case 4:
                                iH1 = o.h0(((Long) value).longValue());
                                oVar.A0(iH1 + iF0 + i13);
                                Object key11111111111111 = entry.getKey();
                                Object value11111111111111 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key11111111111111);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value11111111111111);
                                break;
                            case 5:
                                iH1 = o.h0(((Integer) value).intValue());
                                oVar.A0(iH1 + iF0 + i13);
                                Object key11111111111112 = entry.getKey();
                                Object value11111111111112 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key11111111111112);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value11111111111112);
                                break;
                            case 6:
                                ((Long) value).getClass();
                                oVar.A0(iH1 + iF0 + i13);
                                Object key11111111111113 = entry.getKey();
                                Object value11111111111113 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key11111111111113);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value11111111111113);
                                break;
                            case 7:
                                ((Integer) value).getClass();
                                iH1 = 4;
                                oVar.A0(iH1 + iF0 + i13);
                                Object key11111111111114 = entry.getKey();
                                Object value11111111111114 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key11111111111114);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value11111111111114);
                                break;
                            case 8:
                                ((Boolean) value).getClass();
                                iH1 = i16;
                                oVar.A0(iH1 + iF0 + i13);
                                Object key11111111111115 = entry.getKey();
                                Object value11111111111115 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key11111111111115);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value11111111111115);
                                break;
                            case 9:
                                iH1 = ((c0) ((a) value)).a(null);
                                oVar.A0(iH1 + iF0 + i13);
                                Object key11111111111116 = entry.getKey();
                                Object value11111111111116 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key11111111111116);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value11111111111116);
                                break;
                            case 10:
                                iA2 = ((c0) ((a) value)).a(null);
                                iG1 = o.g0(iA2);
                                iH1 = iG1 + iA2;
                                oVar.A0(iH1 + iF0 + i13);
                                Object key11111111111117 = entry.getKey();
                                Object value11111111111117 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key11111111111117);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value11111111111117);
                                break;
                            case 11:
                                if (value instanceof i) {
                                    iA2 = ((i) value).size();
                                    iG1 = o.g0(iA2);
                                    iH1 = iG1 + iA2;
                                } else {
                                    iH1 = o.e0((String) value);
                                }
                                oVar.A0(iH1 + iF0 + i13);
                                Object key11111111111118 = entry.getKey();
                                Object value11111111111118 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key11111111111118);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value11111111111118);
                                break;
                            case 12:
                                if (value instanceof i) {
                                    iA2 = ((i) value).size();
                                    iG1 = o.g0(iA2);
                                } else {
                                    iA2 = ((byte[]) value).length;
                                    iG1 = o.g0(iA2);
                                }
                                iH1 = iG1 + iA2;
                                oVar.A0(iH1 + iF0 + i13);
                                Object key11111111111119 = entry.getKey();
                                Object value11111111111119 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key11111111111119);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value11111111111119);
                                break;
                            case 13:
                                iH1 = o.g0(((Integer) value).intValue());
                                oVar.A0(iH1 + iF0 + i13);
                                Object key111111111111110 = entry.getKey();
                                Object value111111111111110 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key111111111111110);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value111111111111110);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iH1 = 4;
                                oVar.A0(iH1 + iF0 + i13);
                                Object key111111111111111 = entry.getKey();
                                Object value111111111111111 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key111111111111111);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value111111111111111);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                oVar.A0(iH1 + iF0 + i13);
                                Object key111111111111112 = entry.getKey();
                                Object value111111111111112 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key111111111111112);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value111111111111112);
                                break;
                            case 16:
                                int iIntValue8 = ((Integer) value).intValue();
                                iH1 = o.g0((iIntValue8 >> 31) ^ (iIntValue8 << 1));
                                oVar.A0(iH1 + iF0 + i13);
                                Object key111111111111113 = entry.getKey();
                                Object value111111111111113 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key111111111111113);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value111111111111113);
                                break;
                            case 17:
                                long jLongValue8 = ((Long) value).longValue();
                                iH1 = o.h0((jLongValue8 >> 63) ^ (jLongValue8 << i16));
                                oVar.A0(iH1 + iF0 + i13);
                                Object key111111111111114 = entry.getKey();
                                Object value111111111111114 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key111111111111114);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value111111111111114);
                                break;
                            case 18:
                                iH1 = o.h0(((Integer) value).intValue());
                                oVar.A0(iH1 + iF0 + i13);
                                Object key111111111111115 = entry.getKey();
                                Object value111111111111115 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key111111111111115);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value111111111111115);
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    case 9:
                        i16 = 1;
                        iF1 = iF1;
                        iH0 = ((c0) ((a) key)).a(null);
                        i13 = iH0 + iF1;
                        iF0 = o.f0(i17);
                        if (y1Var == y1Var3) {
                            iF0 *= 2;
                        }
                        switch (iArr[y1Var.ordinal()]) {
                            case 1:
                                ((Double) value).getClass();
                                oVar.A0(iH1 + iF0 + i13);
                                Object key111111111111116 = entry.getKey();
                                Object value111111111111116 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key111111111111116);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value111111111111116);
                                break;
                            case 2:
                                ((Float) value).getClass();
                                iH1 = 4;
                                oVar.A0(iH1 + iF0 + i13);
                                Object key111111111111117 = entry.getKey();
                                Object value111111111111117 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key111111111111117);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value111111111111117);
                                break;
                            case 3:
                                iH1 = o.h0(((Long) value).longValue());
                                oVar.A0(iH1 + iF0 + i13);
                                Object key111111111111118 = entry.getKey();
                                Object value111111111111118 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key111111111111118);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value111111111111118);
                                break;
                            case 4:
                                iH1 = o.h0(((Long) value).longValue());
                                oVar.A0(iH1 + iF0 + i13);
                                Object key111111111111119 = entry.getKey();
                                Object value111111111111119 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key111111111111119);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value111111111111119);
                                break;
                            case 5:
                                iH1 = o.h0(((Integer) value).intValue());
                                oVar.A0(iH1 + iF0 + i13);
                                Object key1111111111111110 = entry.getKey();
                                Object value1111111111111110 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key1111111111111110);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value1111111111111110);
                                break;
                            case 6:
                                ((Long) value).getClass();
                                oVar.A0(iH1 + iF0 + i13);
                                Object key1111111111111111 = entry.getKey();
                                Object value1111111111111111 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key1111111111111111);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value1111111111111111);
                                break;
                            case 7:
                                ((Integer) value).getClass();
                                iH1 = 4;
                                oVar.A0(iH1 + iF0 + i13);
                                Object key1111111111111112 = entry.getKey();
                                Object value1111111111111112 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key1111111111111112);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value1111111111111112);
                                break;
                            case 8:
                                ((Boolean) value).getClass();
                                iH1 = i16;
                                oVar.A0(iH1 + iF0 + i13);
                                Object key1111111111111113 = entry.getKey();
                                Object value1111111111111113 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key1111111111111113);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value1111111111111113);
                                break;
                            case 9:
                                iH1 = ((c0) ((a) value)).a(null);
                                oVar.A0(iH1 + iF0 + i13);
                                Object key1111111111111114 = entry.getKey();
                                Object value1111111111111114 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key1111111111111114);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value1111111111111114);
                                break;
                            case 10:
                                iA2 = ((c0) ((a) value)).a(null);
                                iG1 = o.g0(iA2);
                                iH1 = iG1 + iA2;
                                oVar.A0(iH1 + iF0 + i13);
                                Object key1111111111111115 = entry.getKey();
                                Object value1111111111111115 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key1111111111111115);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value1111111111111115);
                                break;
                            case 11:
                                if (value instanceof i) {
                                    iA2 = ((i) value).size();
                                    iG1 = o.g0(iA2);
                                    iH1 = iG1 + iA2;
                                } else {
                                    iH1 = o.e0((String) value);
                                }
                                oVar.A0(iH1 + iF0 + i13);
                                Object key1111111111111116 = entry.getKey();
                                Object value1111111111111116 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key1111111111111116);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value1111111111111116);
                                break;
                            case 12:
                                if (value instanceof i) {
                                    iA2 = ((i) value).size();
                                    iG1 = o.g0(iA2);
                                } else {
                                    iA2 = ((byte[]) value).length;
                                    iG1 = o.g0(iA2);
                                }
                                iH1 = iG1 + iA2;
                                oVar.A0(iH1 + iF0 + i13);
                                Object key1111111111111117 = entry.getKey();
                                Object value1111111111111117 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key1111111111111117);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value1111111111111117);
                                break;
                            case 13:
                                iH1 = o.g0(((Integer) value).intValue());
                                oVar.A0(iH1 + iF0 + i13);
                                Object key1111111111111118 = entry.getKey();
                                Object value1111111111111118 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key1111111111111118);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value1111111111111118);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iH1 = 4;
                                oVar.A0(iH1 + iF0 + i13);
                                Object key1111111111111119 = entry.getKey();
                                Object value1111111111111119 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key1111111111111119);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value1111111111111119);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                oVar.A0(iH1 + iF0 + i13);
                                Object key11111111111111110 = entry.getKey();
                                Object value11111111111111110 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key11111111111111110);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value11111111111111110);
                                break;
                            case 16:
                                int iIntValue9 = ((Integer) value).intValue();
                                iH1 = o.g0((iIntValue9 >> 31) ^ (iIntValue9 << 1));
                                oVar.A0(iH1 + iF0 + i13);
                                Object key11111111111111111 = entry.getKey();
                                Object value11111111111111111 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key11111111111111111);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value11111111111111111);
                                break;
                            case 17:
                                long jLongValue9 = ((Long) value).longValue();
                                iH1 = o.h0((jLongValue9 >> 63) ^ (jLongValue9 << i16));
                                oVar.A0(iH1 + iF0 + i13);
                                Object key11111111111111112 = entry.getKey();
                                Object value11111111111111112 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key11111111111111112);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value11111111111111112);
                                break;
                            case 18:
                                iH1 = o.h0(((Integer) value).intValue());
                                oVar.A0(iH1 + iF0 + i13);
                                Object key11111111111111113 = entry.getKey();
                                Object value11111111111111113 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key11111111111111113);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value11111111111111113);
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    case 10:
                        i16 = 1;
                        iF1 = iF1;
                        iA = ((c0) ((a) key)).a(null);
                        iG0 = o.g0(iA);
                        iH0 = iA + iG0;
                        i13 = iH0 + iF1;
                        iF0 = o.f0(i17);
                        if (y1Var == y1Var3) {
                            iF0 *= 2;
                        }
                        switch (iArr[y1Var.ordinal()]) {
                            case 1:
                                ((Double) value).getClass();
                                oVar.A0(iH1 + iF0 + i13);
                                Object key11111111111111114 = entry.getKey();
                                Object value11111111111111114 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key11111111111111114);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value11111111111111114);
                                break;
                            case 2:
                                ((Float) value).getClass();
                                iH1 = 4;
                                oVar.A0(iH1 + iF0 + i13);
                                Object key11111111111111115 = entry.getKey();
                                Object value11111111111111115 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key11111111111111115);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value11111111111111115);
                                break;
                            case 3:
                                iH1 = o.h0(((Long) value).longValue());
                                oVar.A0(iH1 + iF0 + i13);
                                Object key11111111111111116 = entry.getKey();
                                Object value11111111111111116 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key11111111111111116);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value11111111111111116);
                                break;
                            case 4:
                                iH1 = o.h0(((Long) value).longValue());
                                oVar.A0(iH1 + iF0 + i13);
                                Object key11111111111111117 = entry.getKey();
                                Object value11111111111111117 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key11111111111111117);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value11111111111111117);
                                break;
                            case 5:
                                iH1 = o.h0(((Integer) value).intValue());
                                oVar.A0(iH1 + iF0 + i13);
                                Object key11111111111111118 = entry.getKey();
                                Object value11111111111111118 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key11111111111111118);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value11111111111111118);
                                break;
                            case 6:
                                ((Long) value).getClass();
                                oVar.A0(iH1 + iF0 + i13);
                                Object key11111111111111119 = entry.getKey();
                                Object value11111111111111119 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key11111111111111119);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value11111111111111119);
                                break;
                            case 7:
                                ((Integer) value).getClass();
                                iH1 = 4;
                                oVar.A0(iH1 + iF0 + i13);
                                Object key111111111111111110 = entry.getKey();
                                Object value111111111111111110 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key111111111111111110);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value111111111111111110);
                                break;
                            case 8:
                                ((Boolean) value).getClass();
                                iH1 = i16;
                                oVar.A0(iH1 + iF0 + i13);
                                Object key111111111111111111 = entry.getKey();
                                Object value111111111111111111 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key111111111111111111);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value111111111111111111);
                                break;
                            case 9:
                                iH1 = ((c0) ((a) value)).a(null);
                                oVar.A0(iH1 + iF0 + i13);
                                Object key111111111111111112 = entry.getKey();
                                Object value111111111111111112 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key111111111111111112);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value111111111111111112);
                                break;
                            case 10:
                                iA2 = ((c0) ((a) value)).a(null);
                                iG1 = o.g0(iA2);
                                iH1 = iG1 + iA2;
                                oVar.A0(iH1 + iF0 + i13);
                                Object key111111111111111113 = entry.getKey();
                                Object value111111111111111113 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key111111111111111113);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value111111111111111113);
                                break;
                            case 11:
                                if (value instanceof i) {
                                    iA2 = ((i) value).size();
                                    iG1 = o.g0(iA2);
                                    iH1 = iG1 + iA2;
                                } else {
                                    iH1 = o.e0((String) value);
                                }
                                oVar.A0(iH1 + iF0 + i13);
                                Object key111111111111111114 = entry.getKey();
                                Object value111111111111111114 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key111111111111111114);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value111111111111111114);
                                break;
                            case 12:
                                if (value instanceof i) {
                                    iA2 = ((i) value).size();
                                    iG1 = o.g0(iA2);
                                } else {
                                    iA2 = ((byte[]) value).length;
                                    iG1 = o.g0(iA2);
                                }
                                iH1 = iG1 + iA2;
                                oVar.A0(iH1 + iF0 + i13);
                                Object key111111111111111115 = entry.getKey();
                                Object value111111111111111115 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key111111111111111115);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value111111111111111115);
                                break;
                            case 13:
                                iH1 = o.g0(((Integer) value).intValue());
                                oVar.A0(iH1 + iF0 + i13);
                                Object key111111111111111116 = entry.getKey();
                                Object value111111111111111116 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key111111111111111116);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value111111111111111116);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iH1 = 4;
                                oVar.A0(iH1 + iF0 + i13);
                                Object key111111111111111117 = entry.getKey();
                                Object value111111111111111117 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key111111111111111117);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value111111111111111117);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                oVar.A0(iH1 + iF0 + i13);
                                Object key111111111111111118 = entry.getKey();
                                Object value111111111111111118 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key111111111111111118);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value111111111111111118);
                                break;
                            case 16:
                                int iIntValue10 = ((Integer) value).intValue();
                                iH1 = o.g0((iIntValue10 >> 31) ^ (iIntValue10 << 1));
                                oVar.A0(iH1 + iF0 + i13);
                                Object key111111111111111119 = entry.getKey();
                                Object value111111111111111119 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key111111111111111119);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value111111111111111119);
                                break;
                            case 17:
                                long jLongValue10 = ((Long) value).longValue();
                                iH1 = o.h0((jLongValue10 >> 63) ^ (jLongValue10 << i16));
                                oVar.A0(iH1 + iF0 + i13);
                                Object key1111111111111111110 = entry.getKey();
                                Object value1111111111111111110 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key1111111111111111110);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value1111111111111111110);
                                break;
                            case 18:
                                iH1 = o.h0(((Integer) value).intValue());
                                oVar.A0(iH1 + iF0 + i13);
                                Object key1111111111111111111 = entry.getKey();
                                Object value1111111111111111111 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key1111111111111111111);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value1111111111111111111);
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    case 11:
                        i16 = 1;
                        iF1 = iF1;
                        if (key instanceof i) {
                            iA = ((i) key).size();
                            iG0 = o.g0(iA);
                            iH0 = iA + iG0;
                        } else {
                            iH0 = o.e0((String) key);
                        }
                        i13 = iH0 + iF1;
                        iF0 = o.f0(i17);
                        if (y1Var == y1Var3) {
                            iF0 *= 2;
                        }
                        switch (iArr[y1Var.ordinal()]) {
                            case 1:
                                ((Double) value).getClass();
                                oVar.A0(iH1 + iF0 + i13);
                                Object key1111111111111111112 = entry.getKey();
                                Object value1111111111111111112 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key1111111111111111112);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value1111111111111111112);
                                break;
                            case 2:
                                ((Float) value).getClass();
                                iH1 = 4;
                                oVar.A0(iH1 + iF0 + i13);
                                Object key1111111111111111113 = entry.getKey();
                                Object value1111111111111111113 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key1111111111111111113);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value1111111111111111113);
                                break;
                            case 3:
                                iH1 = o.h0(((Long) value).longValue());
                                oVar.A0(iH1 + iF0 + i13);
                                Object key1111111111111111114 = entry.getKey();
                                Object value1111111111111111114 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key1111111111111111114);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value1111111111111111114);
                                break;
                            case 4:
                                iH1 = o.h0(((Long) value).longValue());
                                oVar.A0(iH1 + iF0 + i13);
                                Object key1111111111111111115 = entry.getKey();
                                Object value1111111111111111115 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key1111111111111111115);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value1111111111111111115);
                                break;
                            case 5:
                                iH1 = o.h0(((Integer) value).intValue());
                                oVar.A0(iH1 + iF0 + i13);
                                Object key1111111111111111116 = entry.getKey();
                                Object value1111111111111111116 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key1111111111111111116);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value1111111111111111116);
                                break;
                            case 6:
                                ((Long) value).getClass();
                                oVar.A0(iH1 + iF0 + i13);
                                Object key1111111111111111117 = entry.getKey();
                                Object value1111111111111111117 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key1111111111111111117);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value1111111111111111117);
                                break;
                            case 7:
                                ((Integer) value).getClass();
                                iH1 = 4;
                                oVar.A0(iH1 + iF0 + i13);
                                Object key1111111111111111118 = entry.getKey();
                                Object value1111111111111111118 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key1111111111111111118);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value1111111111111111118);
                                break;
                            case 8:
                                ((Boolean) value).getClass();
                                iH1 = i16;
                                oVar.A0(iH1 + iF0 + i13);
                                Object key1111111111111111119 = entry.getKey();
                                Object value1111111111111111119 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key1111111111111111119);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value1111111111111111119);
                                break;
                            case 9:
                                iH1 = ((c0) ((a) value)).a(null);
                                oVar.A0(iH1 + iF0 + i13);
                                Object key11111111111111111110 = entry.getKey();
                                Object value11111111111111111110 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key11111111111111111110);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value11111111111111111110);
                                break;
                            case 10:
                                iA2 = ((c0) ((a) value)).a(null);
                                iG1 = o.g0(iA2);
                                iH1 = iG1 + iA2;
                                oVar.A0(iH1 + iF0 + i13);
                                Object key11111111111111111111 = entry.getKey();
                                Object value11111111111111111111 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key11111111111111111111);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value11111111111111111111);
                                break;
                            case 11:
                                if (value instanceof i) {
                                    iA2 = ((i) value).size();
                                    iG1 = o.g0(iA2);
                                    iH1 = iG1 + iA2;
                                } else {
                                    iH1 = o.e0((String) value);
                                }
                                oVar.A0(iH1 + iF0 + i13);
                                Object key11111111111111111112 = entry.getKey();
                                Object value11111111111111111112 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key11111111111111111112);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value11111111111111111112);
                                break;
                            case 12:
                                if (value instanceof i) {
                                    iA2 = ((i) value).size();
                                    iG1 = o.g0(iA2);
                                } else {
                                    iA2 = ((byte[]) value).length;
                                    iG1 = o.g0(iA2);
                                }
                                iH1 = iG1 + iA2;
                                oVar.A0(iH1 + iF0 + i13);
                                Object key11111111111111111113 = entry.getKey();
                                Object value11111111111111111113 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key11111111111111111113);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value11111111111111111113);
                                break;
                            case 13:
                                iH1 = o.g0(((Integer) value).intValue());
                                oVar.A0(iH1 + iF0 + i13);
                                Object key11111111111111111114 = entry.getKey();
                                Object value11111111111111111114 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key11111111111111111114);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value11111111111111111114);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iH1 = 4;
                                oVar.A0(iH1 + iF0 + i13);
                                Object key11111111111111111115 = entry.getKey();
                                Object value11111111111111111115 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key11111111111111111115);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value11111111111111111115);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                oVar.A0(iH1 + iF0 + i13);
                                Object key11111111111111111116 = entry.getKey();
                                Object value11111111111111111116 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key11111111111111111116);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value11111111111111111116);
                                break;
                            case 16:
                                int iIntValue11 = ((Integer) value).intValue();
                                iH1 = o.g0((iIntValue11 >> 31) ^ (iIntValue11 << 1));
                                oVar.A0(iH1 + iF0 + i13);
                                Object key11111111111111111117 = entry.getKey();
                                Object value11111111111111111117 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key11111111111111111117);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value11111111111111111117);
                                break;
                            case 17:
                                long jLongValue11 = ((Long) value).longValue();
                                iH1 = o.h0((jLongValue11 >> 63) ^ (jLongValue11 << i16));
                                oVar.A0(iH1 + iF0 + i13);
                                Object key11111111111111111118 = entry.getKey();
                                Object value11111111111111111118 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key11111111111111111118);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value11111111111111111118);
                                break;
                            case 18:
                                iH1 = o.h0(((Integer) value).intValue());
                                oVar.A0(iH1 + iF0 + i13);
                                Object key11111111111111111119 = entry.getKey();
                                Object value11111111111111111119 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key11111111111111111119);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value11111111111111111119);
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    case 12:
                        i16 = 1;
                        iF1 = iF1;
                        if (key instanceof i) {
                            iA = ((i) key).size();
                            iG0 = o.g0(iA);
                        } else {
                            iA = ((byte[]) key).length;
                            iG0 = o.g0(iA);
                        }
                        iH0 = iA + iG0;
                        i13 = iH0 + iF1;
                        iF0 = o.f0(i17);
                        if (y1Var == y1Var3) {
                            iF0 *= 2;
                        }
                        switch (iArr[y1Var.ordinal()]) {
                            case 1:
                                ((Double) value).getClass();
                                oVar.A0(iH1 + iF0 + i13);
                                Object key111111111111111111110 = entry.getKey();
                                Object value111111111111111111110 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key111111111111111111110);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value111111111111111111110);
                                break;
                            case 2:
                                ((Float) value).getClass();
                                iH1 = 4;
                                oVar.A0(iH1 + iF0 + i13);
                                Object key111111111111111111111 = entry.getKey();
                                Object value111111111111111111111 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key111111111111111111111);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value111111111111111111111);
                                break;
                            case 3:
                                iH1 = o.h0(((Long) value).longValue());
                                oVar.A0(iH1 + iF0 + i13);
                                Object key111111111111111111112 = entry.getKey();
                                Object value111111111111111111112 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key111111111111111111112);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value111111111111111111112);
                                break;
                            case 4:
                                iH1 = o.h0(((Long) value).longValue());
                                oVar.A0(iH1 + iF0 + i13);
                                Object key111111111111111111113 = entry.getKey();
                                Object value111111111111111111113 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key111111111111111111113);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value111111111111111111113);
                                break;
                            case 5:
                                iH1 = o.h0(((Integer) value).intValue());
                                oVar.A0(iH1 + iF0 + i13);
                                Object key111111111111111111114 = entry.getKey();
                                Object value111111111111111111114 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key111111111111111111114);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value111111111111111111114);
                                break;
                            case 6:
                                ((Long) value).getClass();
                                oVar.A0(iH1 + iF0 + i13);
                                Object key111111111111111111115 = entry.getKey();
                                Object value111111111111111111115 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key111111111111111111115);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value111111111111111111115);
                                break;
                            case 7:
                                ((Integer) value).getClass();
                                iH1 = 4;
                                oVar.A0(iH1 + iF0 + i13);
                                Object key111111111111111111116 = entry.getKey();
                                Object value111111111111111111116 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key111111111111111111116);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value111111111111111111116);
                                break;
                            case 8:
                                ((Boolean) value).getClass();
                                iH1 = i16;
                                oVar.A0(iH1 + iF0 + i13);
                                Object key111111111111111111117 = entry.getKey();
                                Object value111111111111111111117 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key111111111111111111117);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value111111111111111111117);
                                break;
                            case 9:
                                iH1 = ((c0) ((a) value)).a(null);
                                oVar.A0(iH1 + iF0 + i13);
                                Object key111111111111111111118 = entry.getKey();
                                Object value111111111111111111118 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key111111111111111111118);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value111111111111111111118);
                                break;
                            case 10:
                                iA2 = ((c0) ((a) value)).a(null);
                                iG1 = o.g0(iA2);
                                iH1 = iG1 + iA2;
                                oVar.A0(iH1 + iF0 + i13);
                                Object key111111111111111111119 = entry.getKey();
                                Object value111111111111111111119 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key111111111111111111119);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value111111111111111111119);
                                break;
                            case 11:
                                if (value instanceof i) {
                                    iA2 = ((i) value).size();
                                    iG1 = o.g0(iA2);
                                    iH1 = iG1 + iA2;
                                } else {
                                    iH1 = o.e0((String) value);
                                }
                                oVar.A0(iH1 + iF0 + i13);
                                Object key1111111111111111111110 = entry.getKey();
                                Object value1111111111111111111110 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key1111111111111111111110);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value1111111111111111111110);
                                break;
                            case 12:
                                if (value instanceof i) {
                                    iA2 = ((i) value).size();
                                    iG1 = o.g0(iA2);
                                } else {
                                    iA2 = ((byte[]) value).length;
                                    iG1 = o.g0(iA2);
                                }
                                iH1 = iG1 + iA2;
                                oVar.A0(iH1 + iF0 + i13);
                                Object key1111111111111111111111 = entry.getKey();
                                Object value1111111111111111111111 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key1111111111111111111111);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value1111111111111111111111);
                                break;
                            case 13:
                                iH1 = o.g0(((Integer) value).intValue());
                                oVar.A0(iH1 + iF0 + i13);
                                Object key1111111111111111111112 = entry.getKey();
                                Object value1111111111111111111112 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key1111111111111111111112);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value1111111111111111111112);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iH1 = 4;
                                oVar.A0(iH1 + iF0 + i13);
                                Object key1111111111111111111113 = entry.getKey();
                                Object value1111111111111111111113 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key1111111111111111111113);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value1111111111111111111113);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                oVar.A0(iH1 + iF0 + i13);
                                Object key1111111111111111111114 = entry.getKey();
                                Object value1111111111111111111114 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key1111111111111111111114);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value1111111111111111111114);
                                break;
                            case 16:
                                int iIntValue12 = ((Integer) value).intValue();
                                iH1 = o.g0((iIntValue12 >> 31) ^ (iIntValue12 << 1));
                                oVar.A0(iH1 + iF0 + i13);
                                Object key1111111111111111111115 = entry.getKey();
                                Object value1111111111111111111115 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key1111111111111111111115);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value1111111111111111111115);
                                break;
                            case 17:
                                long jLongValue12 = ((Long) value).longValue();
                                iH1 = o.h0((jLongValue12 >> 63) ^ (jLongValue12 << i16));
                                oVar.A0(iH1 + iF0 + i13);
                                Object key1111111111111111111116 = entry.getKey();
                                Object value1111111111111111111116 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key1111111111111111111116);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value1111111111111111111116);
                                break;
                            case 18:
                                iH1 = o.h0(((Integer) value).intValue());
                                oVar.A0(iH1 + iF0 + i13);
                                Object key1111111111111111111117 = entry.getKey();
                                Object value1111111111111111111117 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key1111111111111111111117);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value1111111111111111111117);
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    case 13:
                        i16 = 1;
                        iF1 = iF1;
                        iH0 = o.g0(((Integer) key).intValue());
                        i13 = iH0 + iF1;
                        iF0 = o.f0(i17);
                        if (y1Var == y1Var3) {
                            iF0 *= 2;
                        }
                        switch (iArr[y1Var.ordinal()]) {
                            case 1:
                                ((Double) value).getClass();
                                oVar.A0(iH1 + iF0 + i13);
                                Object key1111111111111111111118 = entry.getKey();
                                Object value1111111111111111111118 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key1111111111111111111118);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value1111111111111111111118);
                                break;
                            case 2:
                                ((Float) value).getClass();
                                iH1 = 4;
                                oVar.A0(iH1 + iF0 + i13);
                                Object key1111111111111111111119 = entry.getKey();
                                Object value1111111111111111111119 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key1111111111111111111119);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value1111111111111111111119);
                                break;
                            case 3:
                                iH1 = o.h0(((Long) value).longValue());
                                oVar.A0(iH1 + iF0 + i13);
                                Object key11111111111111111111110 = entry.getKey();
                                Object value11111111111111111111110 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key11111111111111111111110);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value11111111111111111111110);
                                break;
                            case 4:
                                iH1 = o.h0(((Long) value).longValue());
                                oVar.A0(iH1 + iF0 + i13);
                                Object key11111111111111111111111 = entry.getKey();
                                Object value11111111111111111111111 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key11111111111111111111111);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value11111111111111111111111);
                                break;
                            case 5:
                                iH1 = o.h0(((Integer) value).intValue());
                                oVar.A0(iH1 + iF0 + i13);
                                Object key11111111111111111111112 = entry.getKey();
                                Object value11111111111111111111112 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key11111111111111111111112);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value11111111111111111111112);
                                break;
                            case 6:
                                ((Long) value).getClass();
                                oVar.A0(iH1 + iF0 + i13);
                                Object key11111111111111111111113 = entry.getKey();
                                Object value11111111111111111111113 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key11111111111111111111113);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value11111111111111111111113);
                                break;
                            case 7:
                                ((Integer) value).getClass();
                                iH1 = 4;
                                oVar.A0(iH1 + iF0 + i13);
                                Object key11111111111111111111114 = entry.getKey();
                                Object value11111111111111111111114 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key11111111111111111111114);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value11111111111111111111114);
                                break;
                            case 8:
                                ((Boolean) value).getClass();
                                iH1 = i16;
                                oVar.A0(iH1 + iF0 + i13);
                                Object key11111111111111111111115 = entry.getKey();
                                Object value11111111111111111111115 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key11111111111111111111115);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value11111111111111111111115);
                                break;
                            case 9:
                                iH1 = ((c0) ((a) value)).a(null);
                                oVar.A0(iH1 + iF0 + i13);
                                Object key11111111111111111111116 = entry.getKey();
                                Object value11111111111111111111116 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key11111111111111111111116);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value11111111111111111111116);
                                break;
                            case 10:
                                iA2 = ((c0) ((a) value)).a(null);
                                iG1 = o.g0(iA2);
                                iH1 = iG1 + iA2;
                                oVar.A0(iH1 + iF0 + i13);
                                Object key11111111111111111111117 = entry.getKey();
                                Object value11111111111111111111117 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key11111111111111111111117);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value11111111111111111111117);
                                break;
                            case 11:
                                if (value instanceof i) {
                                    iA2 = ((i) value).size();
                                    iG1 = o.g0(iA2);
                                    iH1 = iG1 + iA2;
                                } else {
                                    iH1 = o.e0((String) value);
                                }
                                oVar.A0(iH1 + iF0 + i13);
                                Object key11111111111111111111118 = entry.getKey();
                                Object value11111111111111111111118 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key11111111111111111111118);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value11111111111111111111118);
                                break;
                            case 12:
                                if (value instanceof i) {
                                    iA2 = ((i) value).size();
                                    iG1 = o.g0(iA2);
                                } else {
                                    iA2 = ((byte[]) value).length;
                                    iG1 = o.g0(iA2);
                                }
                                iH1 = iG1 + iA2;
                                oVar.A0(iH1 + iF0 + i13);
                                Object key11111111111111111111119 = entry.getKey();
                                Object value11111111111111111111119 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key11111111111111111111119);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value11111111111111111111119);
                                break;
                            case 13:
                                iH1 = o.g0(((Integer) value).intValue());
                                oVar.A0(iH1 + iF0 + i13);
                                Object key111111111111111111111110 = entry.getKey();
                                Object value111111111111111111111110 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key111111111111111111111110);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value111111111111111111111110);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iH1 = 4;
                                oVar.A0(iH1 + iF0 + i13);
                                Object key111111111111111111111111 = entry.getKey();
                                Object value111111111111111111111111 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key111111111111111111111111);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value111111111111111111111111);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                oVar.A0(iH1 + iF0 + i13);
                                Object key111111111111111111111112 = entry.getKey();
                                Object value111111111111111111111112 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key111111111111111111111112);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value111111111111111111111112);
                                break;
                            case 16:
                                int iIntValue13 = ((Integer) value).intValue();
                                iH1 = o.g0((iIntValue13 >> 31) ^ (iIntValue13 << 1));
                                oVar.A0(iH1 + iF0 + i13);
                                Object key111111111111111111111113 = entry.getKey();
                                Object value111111111111111111111113 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key111111111111111111111113);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value111111111111111111111113);
                                break;
                            case 17:
                                long jLongValue13 = ((Long) value).longValue();
                                iH1 = o.h0((jLongValue13 >> 63) ^ (jLongValue13 << i16));
                                oVar.A0(iH1 + iF0 + i13);
                                Object key111111111111111111111114 = entry.getKey();
                                Object value111111111111111111111114 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key111111111111111111111114);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value111111111111111111111114);
                                break;
                            case 18:
                                iH1 = o.h0(((Integer) value).intValue());
                                oVar.A0(iH1 + iF0 + i13);
                                Object key111111111111111111111115 = entry.getKey();
                                Object value111111111111111111111115 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key111111111111111111111115);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value111111111111111111111115);
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    case 14:
                        ((Integer) key).getClass();
                        iH0 = 4;
                        i13 = iH0 + iF1;
                        iF0 = o.f0(i17);
                        if (y1Var == y1Var3) {
                            iF0 *= 2;
                        }
                        switch (iArr[y1Var.ordinal()]) {
                            case 1:
                                ((Double) value).getClass();
                                oVar.A0(iH1 + iF0 + i13);
                                Object key111111111111111111111116 = entry.getKey();
                                Object value111111111111111111111116 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key111111111111111111111116);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value111111111111111111111116);
                                break;
                            case 2:
                                ((Float) value).getClass();
                                iH1 = 4;
                                oVar.A0(iH1 + iF0 + i13);
                                Object key111111111111111111111117 = entry.getKey();
                                Object value111111111111111111111117 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key111111111111111111111117);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value111111111111111111111117);
                                break;
                            case 3:
                                iH1 = o.h0(((Long) value).longValue());
                                oVar.A0(iH1 + iF0 + i13);
                                Object key111111111111111111111118 = entry.getKey();
                                Object value111111111111111111111118 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key111111111111111111111118);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value111111111111111111111118);
                                break;
                            case 4:
                                iH1 = o.h0(((Long) value).longValue());
                                oVar.A0(iH1 + iF0 + i13);
                                Object key111111111111111111111119 = entry.getKey();
                                Object value111111111111111111111119 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key111111111111111111111119);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value111111111111111111111119);
                                break;
                            case 5:
                                iH1 = o.h0(((Integer) value).intValue());
                                oVar.A0(iH1 + iF0 + i13);
                                Object key1111111111111111111111110 = entry.getKey();
                                Object value1111111111111111111111110 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key1111111111111111111111110);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value1111111111111111111111110);
                                break;
                            case 6:
                                ((Long) value).getClass();
                                oVar.A0(iH1 + iF0 + i13);
                                Object key1111111111111111111111111 = entry.getKey();
                                Object value1111111111111111111111111 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key1111111111111111111111111);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value1111111111111111111111111);
                                break;
                            case 7:
                                ((Integer) value).getClass();
                                iH1 = 4;
                                oVar.A0(iH1 + iF0 + i13);
                                Object key1111111111111111111111112 = entry.getKey();
                                Object value1111111111111111111111112 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key1111111111111111111111112);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value1111111111111111111111112);
                                break;
                            case 8:
                                ((Boolean) value).getClass();
                                iH1 = i16;
                                oVar.A0(iH1 + iF0 + i13);
                                Object key1111111111111111111111113 = entry.getKey();
                                Object value1111111111111111111111113 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key1111111111111111111111113);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value1111111111111111111111113);
                                break;
                            case 9:
                                iH1 = ((c0) ((a) value)).a(null);
                                oVar.A0(iH1 + iF0 + i13);
                                Object key1111111111111111111111114 = entry.getKey();
                                Object value1111111111111111111111114 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key1111111111111111111111114);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value1111111111111111111111114);
                                break;
                            case 10:
                                iA2 = ((c0) ((a) value)).a(null);
                                iG1 = o.g0(iA2);
                                iH1 = iG1 + iA2;
                                oVar.A0(iH1 + iF0 + i13);
                                Object key1111111111111111111111115 = entry.getKey();
                                Object value1111111111111111111111115 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key1111111111111111111111115);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value1111111111111111111111115);
                                break;
                            case 11:
                                if (value instanceof i) {
                                    iA2 = ((i) value).size();
                                    iG1 = o.g0(iA2);
                                    iH1 = iG1 + iA2;
                                } else {
                                    iH1 = o.e0((String) value);
                                }
                                oVar.A0(iH1 + iF0 + i13);
                                Object key1111111111111111111111116 = entry.getKey();
                                Object value1111111111111111111111116 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key1111111111111111111111116);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value1111111111111111111111116);
                                break;
                            case 12:
                                if (value instanceof i) {
                                    iA2 = ((i) value).size();
                                    iG1 = o.g0(iA2);
                                } else {
                                    iA2 = ((byte[]) value).length;
                                    iG1 = o.g0(iA2);
                                }
                                iH1 = iG1 + iA2;
                                oVar.A0(iH1 + iF0 + i13);
                                Object key1111111111111111111111117 = entry.getKey();
                                Object value1111111111111111111111117 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key1111111111111111111111117);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value1111111111111111111111117);
                                break;
                            case 13:
                                iH1 = o.g0(((Integer) value).intValue());
                                oVar.A0(iH1 + iF0 + i13);
                                Object key1111111111111111111111118 = entry.getKey();
                                Object value1111111111111111111111118 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key1111111111111111111111118);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value1111111111111111111111118);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iH1 = 4;
                                oVar.A0(iH1 + iF0 + i13);
                                Object key1111111111111111111111119 = entry.getKey();
                                Object value1111111111111111111111119 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key1111111111111111111111119);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value1111111111111111111111119);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                oVar.A0(iH1 + iF0 + i13);
                                Object key11111111111111111111111110 = entry.getKey();
                                Object value11111111111111111111111110 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key11111111111111111111111110);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value11111111111111111111111110);
                                break;
                            case 16:
                                int iIntValue14 = ((Integer) value).intValue();
                                iH1 = o.g0((iIntValue14 >> 31) ^ (iIntValue14 << 1));
                                oVar.A0(iH1 + iF0 + i13);
                                Object key11111111111111111111111111 = entry.getKey();
                                Object value11111111111111111111111111 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key11111111111111111111111111);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value11111111111111111111111111);
                                break;
                            case 17:
                                long jLongValue14 = ((Long) value).longValue();
                                iH1 = o.h0((jLongValue14 >> 63) ^ (jLongValue14 << i16));
                                oVar.A0(iH1 + iF0 + i13);
                                Object key11111111111111111111111112 = entry.getKey();
                                Object value11111111111111111111111112 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key11111111111111111111111112);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value11111111111111111111111112);
                                break;
                            case 18:
                                iH1 = o.h0(((Integer) value).intValue());
                                oVar.A0(iH1 + iF0 + i13);
                                Object key11111111111111111111111113 = entry.getKey();
                                Object value11111111111111111111111113 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key11111111111111111111111113);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value11111111111111111111111113);
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    case 15:
                        ((Long) key).getClass();
                        iH0 = 8;
                        i13 = iH0 + iF1;
                        iF0 = o.f0(i17);
                        if (y1Var == y1Var3) {
                            iF0 *= 2;
                        }
                        switch (iArr[y1Var.ordinal()]) {
                            case 1:
                                ((Double) value).getClass();
                                oVar.A0(iH1 + iF0 + i13);
                                Object key11111111111111111111111114 = entry.getKey();
                                Object value11111111111111111111111114 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key11111111111111111111111114);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value11111111111111111111111114);
                                break;
                            case 2:
                                ((Float) value).getClass();
                                iH1 = 4;
                                oVar.A0(iH1 + iF0 + i13);
                                Object key11111111111111111111111115 = entry.getKey();
                                Object value11111111111111111111111115 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key11111111111111111111111115);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value11111111111111111111111115);
                                break;
                            case 3:
                                iH1 = o.h0(((Long) value).longValue());
                                oVar.A0(iH1 + iF0 + i13);
                                Object key11111111111111111111111116 = entry.getKey();
                                Object value11111111111111111111111116 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key11111111111111111111111116);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value11111111111111111111111116);
                                break;
                            case 4:
                                iH1 = o.h0(((Long) value).longValue());
                                oVar.A0(iH1 + iF0 + i13);
                                Object key11111111111111111111111117 = entry.getKey();
                                Object value11111111111111111111111117 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key11111111111111111111111117);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value11111111111111111111111117);
                                break;
                            case 5:
                                iH1 = o.h0(((Integer) value).intValue());
                                oVar.A0(iH1 + iF0 + i13);
                                Object key11111111111111111111111118 = entry.getKey();
                                Object value11111111111111111111111118 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key11111111111111111111111118);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value11111111111111111111111118);
                                break;
                            case 6:
                                ((Long) value).getClass();
                                oVar.A0(iH1 + iF0 + i13);
                                Object key11111111111111111111111119 = entry.getKey();
                                Object value11111111111111111111111119 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key11111111111111111111111119);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value11111111111111111111111119);
                                break;
                            case 7:
                                ((Integer) value).getClass();
                                iH1 = 4;
                                oVar.A0(iH1 + iF0 + i13);
                                Object key111111111111111111111111110 = entry.getKey();
                                Object value111111111111111111111111110 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key111111111111111111111111110);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value111111111111111111111111110);
                                break;
                            case 8:
                                ((Boolean) value).getClass();
                                iH1 = i16;
                                oVar.A0(iH1 + iF0 + i13);
                                Object key111111111111111111111111111 = entry.getKey();
                                Object value111111111111111111111111111 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key111111111111111111111111111);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value111111111111111111111111111);
                                break;
                            case 9:
                                iH1 = ((c0) ((a) value)).a(null);
                                oVar.A0(iH1 + iF0 + i13);
                                Object key111111111111111111111111112 = entry.getKey();
                                Object value111111111111111111111111112 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key111111111111111111111111112);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value111111111111111111111111112);
                                break;
                            case 10:
                                iA2 = ((c0) ((a) value)).a(null);
                                iG1 = o.g0(iA2);
                                iH1 = iG1 + iA2;
                                oVar.A0(iH1 + iF0 + i13);
                                Object key111111111111111111111111113 = entry.getKey();
                                Object value111111111111111111111111113 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key111111111111111111111111113);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value111111111111111111111111113);
                                break;
                            case 11:
                                if (value instanceof i) {
                                    iA2 = ((i) value).size();
                                    iG1 = o.g0(iA2);
                                    iH1 = iG1 + iA2;
                                } else {
                                    iH1 = o.e0((String) value);
                                }
                                oVar.A0(iH1 + iF0 + i13);
                                Object key111111111111111111111111114 = entry.getKey();
                                Object value111111111111111111111111114 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key111111111111111111111111114);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value111111111111111111111111114);
                                break;
                            case 12:
                                if (value instanceof i) {
                                    iA2 = ((i) value).size();
                                    iG1 = o.g0(iA2);
                                } else {
                                    iA2 = ((byte[]) value).length;
                                    iG1 = o.g0(iA2);
                                }
                                iH1 = iG1 + iA2;
                                oVar.A0(iH1 + iF0 + i13);
                                Object key111111111111111111111111115 = entry.getKey();
                                Object value111111111111111111111111115 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key111111111111111111111111115);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value111111111111111111111111115);
                                break;
                            case 13:
                                iH1 = o.g0(((Integer) value).intValue());
                                oVar.A0(iH1 + iF0 + i13);
                                Object key111111111111111111111111116 = entry.getKey();
                                Object value111111111111111111111111116 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key111111111111111111111111116);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value111111111111111111111111116);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iH1 = 4;
                                oVar.A0(iH1 + iF0 + i13);
                                Object key111111111111111111111111117 = entry.getKey();
                                Object value111111111111111111111111117 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key111111111111111111111111117);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value111111111111111111111111117);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                oVar.A0(iH1 + iF0 + i13);
                                Object key111111111111111111111111118 = entry.getKey();
                                Object value111111111111111111111111118 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key111111111111111111111111118);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value111111111111111111111111118);
                                break;
                            case 16:
                                int iIntValue15 = ((Integer) value).intValue();
                                iH1 = o.g0((iIntValue15 >> 31) ^ (iIntValue15 << 1));
                                oVar.A0(iH1 + iF0 + i13);
                                Object key111111111111111111111111119 = entry.getKey();
                                Object value111111111111111111111111119 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key111111111111111111111111119);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value111111111111111111111111119);
                                break;
                            case 17:
                                long jLongValue15 = ((Long) value).longValue();
                                iH1 = o.h0((jLongValue15 >> 63) ^ (jLongValue15 << i16));
                                oVar.A0(iH1 + iF0 + i13);
                                Object key1111111111111111111111111110 = entry.getKey();
                                Object value1111111111111111111111111110 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key1111111111111111111111111110);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value1111111111111111111111111110);
                                break;
                            case 18:
                                iH1 = o.h0(((Integer) value).intValue());
                                oVar.A0(iH1 + iF0 + i13);
                                Object key1111111111111111111111111111 = entry.getKey();
                                Object value1111111111111111111111111111 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key1111111111111111111111111111);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value1111111111111111111111111111);
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    case 16:
                        i16 = 1;
                        iF1 = iF1;
                        int iIntValue16 = ((Integer) key).intValue();
                        iH0 = o.g0((iIntValue16 >> 31) ^ (iIntValue16 << 1));
                        i13 = iH0 + iF1;
                        iF0 = o.f0(i17);
                        if (y1Var == y1Var3) {
                            iF0 *= 2;
                        }
                        switch (iArr[y1Var.ordinal()]) {
                            case 1:
                                ((Double) value).getClass();
                                oVar.A0(iH1 + iF0 + i13);
                                Object key1111111111111111111111111112 = entry.getKey();
                                Object value1111111111111111111111111112 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key1111111111111111111111111112);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value1111111111111111111111111112);
                                break;
                            case 2:
                                ((Float) value).getClass();
                                iH1 = 4;
                                oVar.A0(iH1 + iF0 + i13);
                                Object key1111111111111111111111111113 = entry.getKey();
                                Object value1111111111111111111111111113 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key1111111111111111111111111113);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value1111111111111111111111111113);
                                break;
                            case 3:
                                iH1 = o.h0(((Long) value).longValue());
                                oVar.A0(iH1 + iF0 + i13);
                                Object key1111111111111111111111111114 = entry.getKey();
                                Object value1111111111111111111111111114 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key1111111111111111111111111114);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value1111111111111111111111111114);
                                break;
                            case 4:
                                iH1 = o.h0(((Long) value).longValue());
                                oVar.A0(iH1 + iF0 + i13);
                                Object key1111111111111111111111111115 = entry.getKey();
                                Object value1111111111111111111111111115 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key1111111111111111111111111115);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value1111111111111111111111111115);
                                break;
                            case 5:
                                iH1 = o.h0(((Integer) value).intValue());
                                oVar.A0(iH1 + iF0 + i13);
                                Object key1111111111111111111111111116 = entry.getKey();
                                Object value1111111111111111111111111116 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key1111111111111111111111111116);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value1111111111111111111111111116);
                                break;
                            case 6:
                                ((Long) value).getClass();
                                oVar.A0(iH1 + iF0 + i13);
                                Object key1111111111111111111111111117 = entry.getKey();
                                Object value1111111111111111111111111117 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key1111111111111111111111111117);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value1111111111111111111111111117);
                                break;
                            case 7:
                                ((Integer) value).getClass();
                                iH1 = 4;
                                oVar.A0(iH1 + iF0 + i13);
                                Object key1111111111111111111111111118 = entry.getKey();
                                Object value1111111111111111111111111118 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key1111111111111111111111111118);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value1111111111111111111111111118);
                                break;
                            case 8:
                                ((Boolean) value).getClass();
                                iH1 = i16;
                                oVar.A0(iH1 + iF0 + i13);
                                Object key1111111111111111111111111119 = entry.getKey();
                                Object value1111111111111111111111111119 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key1111111111111111111111111119);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value1111111111111111111111111119);
                                break;
                            case 9:
                                iH1 = ((c0) ((a) value)).a(null);
                                oVar.A0(iH1 + iF0 + i13);
                                Object key11111111111111111111111111110 = entry.getKey();
                                Object value11111111111111111111111111110 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key11111111111111111111111111110);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value11111111111111111111111111110);
                                break;
                            case 10:
                                iA2 = ((c0) ((a) value)).a(null);
                                iG1 = o.g0(iA2);
                                iH1 = iG1 + iA2;
                                oVar.A0(iH1 + iF0 + i13);
                                Object key11111111111111111111111111111 = entry.getKey();
                                Object value11111111111111111111111111111 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key11111111111111111111111111111);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value11111111111111111111111111111);
                                break;
                            case 11:
                                if (value instanceof i) {
                                    iA2 = ((i) value).size();
                                    iG1 = o.g0(iA2);
                                    iH1 = iG1 + iA2;
                                } else {
                                    iH1 = o.e0((String) value);
                                }
                                oVar.A0(iH1 + iF0 + i13);
                                Object key11111111111111111111111111112 = entry.getKey();
                                Object value11111111111111111111111111112 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key11111111111111111111111111112);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value11111111111111111111111111112);
                                break;
                            case 12:
                                if (value instanceof i) {
                                    iA2 = ((i) value).size();
                                    iG1 = o.g0(iA2);
                                } else {
                                    iA2 = ((byte[]) value).length;
                                    iG1 = o.g0(iA2);
                                }
                                iH1 = iG1 + iA2;
                                oVar.A0(iH1 + iF0 + i13);
                                Object key11111111111111111111111111113 = entry.getKey();
                                Object value11111111111111111111111111113 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key11111111111111111111111111113);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value11111111111111111111111111113);
                                break;
                            case 13:
                                iH1 = o.g0(((Integer) value).intValue());
                                oVar.A0(iH1 + iF0 + i13);
                                Object key11111111111111111111111111114 = entry.getKey();
                                Object value11111111111111111111111111114 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key11111111111111111111111111114);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value11111111111111111111111111114);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iH1 = 4;
                                oVar.A0(iH1 + iF0 + i13);
                                Object key11111111111111111111111111115 = entry.getKey();
                                Object value11111111111111111111111111115 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key11111111111111111111111111115);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value11111111111111111111111111115);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                oVar.A0(iH1 + iF0 + i13);
                                Object key11111111111111111111111111116 = entry.getKey();
                                Object value11111111111111111111111111116 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key11111111111111111111111111116);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value11111111111111111111111111116);
                                break;
                            case 16:
                                int iIntValue17 = ((Integer) value).intValue();
                                iH1 = o.g0((iIntValue17 >> 31) ^ (iIntValue17 << 1));
                                oVar.A0(iH1 + iF0 + i13);
                                Object key11111111111111111111111111117 = entry.getKey();
                                Object value11111111111111111111111111117 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key11111111111111111111111111117);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value11111111111111111111111111117);
                                break;
                            case 17:
                                long jLongValue16 = ((Long) value).longValue();
                                iH1 = o.h0((jLongValue16 >> 63) ^ (jLongValue16 << i16));
                                oVar.A0(iH1 + iF0 + i13);
                                Object key11111111111111111111111111118 = entry.getKey();
                                Object value11111111111111111111111111118 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key11111111111111111111111111118);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value11111111111111111111111111118);
                                break;
                            case 18:
                                iH1 = o.h0(((Integer) value).intValue());
                                oVar.A0(iH1 + iF0 + i13);
                                Object key11111111111111111111111111119 = entry.getKey();
                                Object value11111111111111111111111111119 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key11111111111111111111111111119);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value11111111111111111111111111119);
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    case 17:
                        i16 = 1;
                        iF1 = iF1;
                        long jLongValue17 = ((Long) key).longValue();
                        iH0 = o.h0((jLongValue17 << 1) ^ (jLongValue17 >> 63));
                        i13 = iH0 + iF1;
                        iF0 = o.f0(i17);
                        if (y1Var == y1Var3) {
                            iF0 *= 2;
                        }
                        switch (iArr[y1Var.ordinal()]) {
                            case 1:
                                ((Double) value).getClass();
                                oVar.A0(iH1 + iF0 + i13);
                                Object key111111111111111111111111111110 = entry.getKey();
                                Object value111111111111111111111111111110 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key111111111111111111111111111110);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value111111111111111111111111111110);
                                break;
                            case 2:
                                ((Float) value).getClass();
                                iH1 = 4;
                                oVar.A0(iH1 + iF0 + i13);
                                Object key111111111111111111111111111111 = entry.getKey();
                                Object value111111111111111111111111111111 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key111111111111111111111111111111);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value111111111111111111111111111111);
                                break;
                            case 3:
                                iH1 = o.h0(((Long) value).longValue());
                                oVar.A0(iH1 + iF0 + i13);
                                Object key111111111111111111111111111112 = entry.getKey();
                                Object value111111111111111111111111111112 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key111111111111111111111111111112);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value111111111111111111111111111112);
                                break;
                            case 4:
                                iH1 = o.h0(((Long) value).longValue());
                                oVar.A0(iH1 + iF0 + i13);
                                Object key111111111111111111111111111113 = entry.getKey();
                                Object value111111111111111111111111111113 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key111111111111111111111111111113);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value111111111111111111111111111113);
                                break;
                            case 5:
                                iH1 = o.h0(((Integer) value).intValue());
                                oVar.A0(iH1 + iF0 + i13);
                                Object key111111111111111111111111111114 = entry.getKey();
                                Object value111111111111111111111111111114 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key111111111111111111111111111114);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value111111111111111111111111111114);
                                break;
                            case 6:
                                ((Long) value).getClass();
                                oVar.A0(iH1 + iF0 + i13);
                                Object key111111111111111111111111111115 = entry.getKey();
                                Object value111111111111111111111111111115 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key111111111111111111111111111115);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value111111111111111111111111111115);
                                break;
                            case 7:
                                ((Integer) value).getClass();
                                iH1 = 4;
                                oVar.A0(iH1 + iF0 + i13);
                                Object key111111111111111111111111111116 = entry.getKey();
                                Object value111111111111111111111111111116 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key111111111111111111111111111116);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value111111111111111111111111111116);
                                break;
                            case 8:
                                ((Boolean) value).getClass();
                                iH1 = i16;
                                oVar.A0(iH1 + iF0 + i13);
                                Object key111111111111111111111111111117 = entry.getKey();
                                Object value111111111111111111111111111117 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key111111111111111111111111111117);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value111111111111111111111111111117);
                                break;
                            case 9:
                                iH1 = ((c0) ((a) value)).a(null);
                                oVar.A0(iH1 + iF0 + i13);
                                Object key111111111111111111111111111118 = entry.getKey();
                                Object value111111111111111111111111111118 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key111111111111111111111111111118);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value111111111111111111111111111118);
                                break;
                            case 10:
                                iA2 = ((c0) ((a) value)).a(null);
                                iG1 = o.g0(iA2);
                                iH1 = iG1 + iA2;
                                oVar.A0(iH1 + iF0 + i13);
                                Object key111111111111111111111111111119 = entry.getKey();
                                Object value111111111111111111111111111119 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key111111111111111111111111111119);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value111111111111111111111111111119);
                                break;
                            case 11:
                                if (value instanceof i) {
                                    iA2 = ((i) value).size();
                                    iG1 = o.g0(iA2);
                                    iH1 = iG1 + iA2;
                                } else {
                                    iH1 = o.e0((String) value);
                                }
                                oVar.A0(iH1 + iF0 + i13);
                                Object key1111111111111111111111111111110 = entry.getKey();
                                Object value1111111111111111111111111111110 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key1111111111111111111111111111110);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value1111111111111111111111111111110);
                                break;
                            case 12:
                                if (value instanceof i) {
                                    iA2 = ((i) value).size();
                                    iG1 = o.g0(iA2);
                                } else {
                                    iA2 = ((byte[]) value).length;
                                    iG1 = o.g0(iA2);
                                }
                                iH1 = iG1 + iA2;
                                oVar.A0(iH1 + iF0 + i13);
                                Object key1111111111111111111111111111111 = entry.getKey();
                                Object value1111111111111111111111111111111 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key1111111111111111111111111111111);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value1111111111111111111111111111111);
                                break;
                            case 13:
                                iH1 = o.g0(((Integer) value).intValue());
                                oVar.A0(iH1 + iF0 + i13);
                                Object key1111111111111111111111111111112 = entry.getKey();
                                Object value1111111111111111111111111111112 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key1111111111111111111111111111112);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value1111111111111111111111111111112);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iH1 = 4;
                                oVar.A0(iH1 + iF0 + i13);
                                Object key1111111111111111111111111111113 = entry.getKey();
                                Object value1111111111111111111111111111113 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key1111111111111111111111111111113);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value1111111111111111111111111111113);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                oVar.A0(iH1 + iF0 + i13);
                                Object key1111111111111111111111111111114 = entry.getKey();
                                Object value1111111111111111111111111111114 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key1111111111111111111111111111114);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value1111111111111111111111111111114);
                                break;
                            case 16:
                                int iIntValue18 = ((Integer) value).intValue();
                                iH1 = o.g0((iIntValue18 >> 31) ^ (iIntValue18 << 1));
                                oVar.A0(iH1 + iF0 + i13);
                                Object key1111111111111111111111111111115 = entry.getKey();
                                Object value1111111111111111111111111111115 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key1111111111111111111111111111115);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value1111111111111111111111111111115);
                                break;
                            case 17:
                                long jLongValue18 = ((Long) value).longValue();
                                iH1 = o.h0((jLongValue18 >> 63) ^ (jLongValue18 << i16));
                                oVar.A0(iH1 + iF0 + i13);
                                Object key1111111111111111111111111111116 = entry.getKey();
                                Object value1111111111111111111111111111116 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key1111111111111111111111111111116);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value1111111111111111111111111111116);
                                break;
                            case 18:
                                iH1 = o.h0(((Integer) value).intValue());
                                oVar.A0(iH1 + iF0 + i13);
                                Object key1111111111111111111111111111117 = entry.getKey();
                                Object value1111111111111111111111111111117 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key1111111111111111111111111111117);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value1111111111111111111111111111117);
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    case 18:
                        i16 = 1;
                        iF1 = iF1;
                        iH0 = o.h0(((Integer) key).intValue());
                        i13 = iH0 + iF1;
                        iF0 = o.f0(i17);
                        if (y1Var == y1Var3) {
                            iF0 *= 2;
                        }
                        switch (iArr[y1Var.ordinal()]) {
                            case 1:
                                ((Double) value).getClass();
                                oVar.A0(iH1 + iF0 + i13);
                                Object key1111111111111111111111111111118 = entry.getKey();
                                Object value1111111111111111111111111111118 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key1111111111111111111111111111118);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value1111111111111111111111111111118);
                                break;
                            case 2:
                                ((Float) value).getClass();
                                iH1 = 4;
                                oVar.A0(iH1 + iF0 + i13);
                                Object key1111111111111111111111111111119 = entry.getKey();
                                Object value1111111111111111111111111111119 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key1111111111111111111111111111119);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value1111111111111111111111111111119);
                                break;
                            case 3:
                                iH1 = o.h0(((Long) value).longValue());
                                oVar.A0(iH1 + iF0 + i13);
                                Object key11111111111111111111111111111110 = entry.getKey();
                                Object value11111111111111111111111111111110 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key11111111111111111111111111111110);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value11111111111111111111111111111110);
                                break;
                            case 4:
                                iH1 = o.h0(((Long) value).longValue());
                                oVar.A0(iH1 + iF0 + i13);
                                Object key11111111111111111111111111111111 = entry.getKey();
                                Object value11111111111111111111111111111111 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key11111111111111111111111111111111);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value11111111111111111111111111111111);
                                break;
                            case 5:
                                iH1 = o.h0(((Integer) value).intValue());
                                oVar.A0(iH1 + iF0 + i13);
                                Object key11111111111111111111111111111112 = entry.getKey();
                                Object value11111111111111111111111111111112 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key11111111111111111111111111111112);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value11111111111111111111111111111112);
                                break;
                            case 6:
                                ((Long) value).getClass();
                                oVar.A0(iH1 + iF0 + i13);
                                Object key11111111111111111111111111111113 = entry.getKey();
                                Object value11111111111111111111111111111113 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key11111111111111111111111111111113);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value11111111111111111111111111111113);
                                break;
                            case 7:
                                ((Integer) value).getClass();
                                iH1 = 4;
                                oVar.A0(iH1 + iF0 + i13);
                                Object key11111111111111111111111111111114 = entry.getKey();
                                Object value11111111111111111111111111111114 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key11111111111111111111111111111114);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value11111111111111111111111111111114);
                                break;
                            case 8:
                                ((Boolean) value).getClass();
                                iH1 = i16;
                                oVar.A0(iH1 + iF0 + i13);
                                Object key11111111111111111111111111111115 = entry.getKey();
                                Object value11111111111111111111111111111115 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key11111111111111111111111111111115);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value11111111111111111111111111111115);
                                break;
                            case 9:
                                iH1 = ((c0) ((a) value)).a(null);
                                oVar.A0(iH1 + iF0 + i13);
                                Object key11111111111111111111111111111116 = entry.getKey();
                                Object value11111111111111111111111111111116 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key11111111111111111111111111111116);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value11111111111111111111111111111116);
                                break;
                            case 10:
                                iA2 = ((c0) ((a) value)).a(null);
                                iG1 = o.g0(iA2);
                                iH1 = iG1 + iA2;
                                oVar.A0(iH1 + iF0 + i13);
                                Object key11111111111111111111111111111117 = entry.getKey();
                                Object value11111111111111111111111111111117 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key11111111111111111111111111111117);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value11111111111111111111111111111117);
                                break;
                            case 11:
                                if (value instanceof i) {
                                    iA2 = ((i) value).size();
                                    iG1 = o.g0(iA2);
                                    iH1 = iG1 + iA2;
                                } else {
                                    iH1 = o.e0((String) value);
                                }
                                oVar.A0(iH1 + iF0 + i13);
                                Object key11111111111111111111111111111118 = entry.getKey();
                                Object value11111111111111111111111111111118 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key11111111111111111111111111111118);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value11111111111111111111111111111118);
                                break;
                            case 12:
                                if (value instanceof i) {
                                    iA2 = ((i) value).size();
                                    iG1 = o.g0(iA2);
                                } else {
                                    iA2 = ((byte[]) value).length;
                                    iG1 = o.g0(iA2);
                                }
                                iH1 = iG1 + iA2;
                                oVar.A0(iH1 + iF0 + i13);
                                Object key11111111111111111111111111111119 = entry.getKey();
                                Object value11111111111111111111111111111119 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key11111111111111111111111111111119);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value11111111111111111111111111111119);
                                break;
                            case 13:
                                iH1 = o.g0(((Integer) value).intValue());
                                oVar.A0(iH1 + iF0 + i13);
                                Object key111111111111111111111111111111110 = entry.getKey();
                                Object value111111111111111111111111111111110 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key111111111111111111111111111111110);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value111111111111111111111111111111110);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iH1 = 4;
                                oVar.A0(iH1 + iF0 + i13);
                                Object key111111111111111111111111111111111 = entry.getKey();
                                Object value111111111111111111111111111111111 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key111111111111111111111111111111111);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value111111111111111111111111111111111);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                oVar.A0(iH1 + iF0 + i13);
                                Object key111111111111111111111111111111112 = entry.getKey();
                                Object value111111111111111111111111111111112 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key111111111111111111111111111111112);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value111111111111111111111111111111112);
                                break;
                            case 16:
                                int iIntValue19 = ((Integer) value).intValue();
                                iH1 = o.g0((iIntValue19 >> 31) ^ (iIntValue19 << 1));
                                oVar.A0(iH1 + iF0 + i13);
                                Object key111111111111111111111111111111113 = entry.getKey();
                                Object value111111111111111111111111111111113 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key111111111111111111111111111111113);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value111111111111111111111111111111113);
                                break;
                            case 17:
                                long jLongValue19 = ((Long) value).longValue();
                                iH1 = o.h0((jLongValue19 >> 63) ^ (jLongValue19 << i16));
                                oVar.A0(iH1 + iF0 + i13);
                                Object key111111111111111111111111111111114 = entry.getKey();
                                Object value111111111111111111111111111111114 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key111111111111111111111111111111114);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value111111111111111111111111111111114);
                                break;
                            case 18:
                                iH1 = o.h0(((Integer) value).intValue());
                                oVar.A0(iH1 + iF0 + i13);
                                Object key111111111111111111111111111111115 = entry.getKey();
                                Object value111111111111111111111111111111115 = entry.getValue();
                                u.b(oVar, y1Var2, i16, key111111111111111111111111111111115);
                                i14 = i17;
                                u.b(oVar, y1Var, i14, value111111111111111111111111111111115);
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:11:0x0025  */
    @Override // androidx.datastore.preferences.protobuf.d1
    public final void a(Object obj, Object obj2) {
        Object obj3;
        if (!p(obj)) {
            throw new IllegalArgumentException(hh.p0.k(obj, "Mutating immutable message: "));
        }
        obj2.getClass();
        int i11 = 0;
        while (true) {
            int[] iArr = this.f1554a;
            if (i11 >= iArr.length) {
                e1.k(this.f1565l, obj, obj2);
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
                        p1 p1Var = q1.f1541c;
                        obj3 = obj;
                        p1Var.l(obj3, j11, p1Var.d(j11, obj2));
                        G(i11, obj3);
                    }
                    break;
                case 1:
                    if (n(i11, obj2)) {
                        p1 p1Var2 = q1.f1541c;
                        p1Var2.m(obj, j11, p1Var2.e(j11, obj2));
                        G(i11, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (n(i11, obj2)) {
                        q1.n(obj, j11, q1.f1541c.g(j11, obj2));
                        G(i11, obj);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (n(i11, obj2)) {
                        q1.n(obj, j11, q1.f1541c.g(j11, obj2));
                        G(i11, obj);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (n(i11, obj2)) {
                        q1.m(j11, obj, q1.f1541c.f(j11, obj2));
                        G(i11, obj);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (n(i11, obj2)) {
                        q1.n(obj, j11, q1.f1541c.g(j11, obj2));
                        G(i11, obj);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (n(i11, obj2)) {
                        q1.m(j11, obj, q1.f1541c.f(j11, obj2));
                        G(i11, obj);
                    }
                    obj3 = obj;
                    break;
                case 7:
                    if (n(i11, obj2)) {
                        p1 p1Var3 = q1.f1541c;
                        p1Var3.j(obj, j11, p1Var3.c(j11, obj2));
                        G(i11, obj);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (n(i11, obj2)) {
                        q1.o(obj, j11, q1.f1541c.h(j11, obj2));
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
                        q1.o(obj, j11, q1.f1541c.h(j11, obj2));
                        G(i11, obj);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (n(i11, obj2)) {
                        q1.m(j11, obj, q1.f1541c.f(j11, obj2));
                        G(i11, obj);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (n(i11, obj2)) {
                        q1.m(j11, obj, q1.f1541c.f(j11, obj2));
                        G(i11, obj);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (n(i11, obj2)) {
                        q1.m(j11, obj, q1.f1541c.f(j11, obj2));
                        G(i11, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (n(i11, obj2)) {
                        q1.n(obj, j11, q1.f1541c.g(j11, obj2));
                        G(i11, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (n(i11, obj2)) {
                        q1.m(j11, obj, q1.f1541c.f(j11, obj2));
                        G(i11, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (n(i11, obj2)) {
                        q1.n(obj, j11, q1.f1541c.g(j11, obj2));
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
                    this.f1564k.getClass();
                    p1 p1Var4 = q1.f1541c;
                    d0 d0VarE = (d0) p1Var4.h(j11, obj);
                    d0 d0Var = (d0) p1Var4.h(j11, obj2);
                    b1 b1Var = (b1) d0VarE;
                    int i13 = b1Var.f1451c;
                    int i14 = ((b1) d0Var).f1451c;
                    if (i13 > 0 && i14 > 0) {
                        if (!((b) d0VarE).f1448a) {
                            d0VarE = b1Var.e(i14 + i13);
                        }
                        ((b) d0VarE).addAll(d0Var);
                    }
                    if (i13 > 0) {
                        d0Var = d0VarE;
                    }
                    q1.o(obj, j11, d0Var);
                    obj3 = obj;
                    break;
                case 50:
                    Class cls = e1.f1465a;
                    p1 p1Var5 = q1.f1541c;
                    Object objH = p1Var5.h(j11, obj);
                    Object objH2 = p1Var5.h(j11, obj2);
                    this.m.getClass();
                    q1.o(obj, j11, p0.a(objH, objH2));
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
                        q1.o(obj, j11, q1.f1541c.h(j11, obj2));
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
                        q1.o(obj, j11, q1.f1541c.h(j11, obj2));
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
    @Override // androidx.datastore.preferences.protobuf.d1
    public final void b(Object obj) {
        if (p(obj)) {
            if (obj instanceof c0) {
                c0 c0Var = (c0) obj;
                c0Var.k(Integer.MAX_VALUE);
                c0Var.memoizedHashCode = 0;
                c0Var.h();
            }
            int[] iArr = this.f1554a;
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
                                    m(i11).b(f1553o.getObject(obj, j11));
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
                                this.f1564k.getClass();
                                b bVar = (b) ((d0) q1.f1541c.h(j11, obj));
                                if (bVar.f1448a) {
                                    bVar.f1448a = false;
                                }
                                break;
                            case 50:
                                Unsafe unsafe = f1553o;
                                Object object = unsafe.getObject(obj, j11);
                                if (object != null) {
                                    this.m.getClass();
                                    ((o0) object).f1531a = false;
                                    unsafe.putObject(obj, j11, object);
                                }
                                break;
                        }
                    } else if (q(iArr[i11], i11, obj)) {
                        m(i11).b(f1553o.getObject(obj, j11));
                    }
                } else if (n(i11, obj)) {
                    m(i11).b(f1553o.getObject(obj, j11));
                }
            }
            ((l1) this.f1565l).getClass();
            k1 k1Var = ((c0) obj).unknownFields;
            if (k1Var.f1508e) {
                k1Var.f1508e = false;
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.d1
    public final boolean c(Object obj) {
        int i11;
        int i12;
        int i13 = 1048575;
        int i14 = 0;
        int i15 = 0;
        while (i15 < this.f1561h) {
            int i16 = this.f1560g[i15];
            int[] iArr = this.f1554a;
            int i17 = iArr[i16];
            int iL = L(i16);
            int i18 = iArr[i16 + 2];
            int i19 = i18 & 1048575;
            int i21 = 1 << (i18 >>> 20);
            if (i19 != i13) {
                if (i19 != 1048575) {
                    i14 = f1553o.getInt(obj, i19);
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
                        if (!m(i16).c(q1.f1541c.h(iL & 1048575, obj))) {
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
                                if (!m(i16).c(q1.f1541c.h(iL & 1048575, obj))) {
                                }
                            } else {
                                continue;
                            }
                            i15++;
                            i13 = i11;
                            i14 = i12;
                        } else if (iK != 49) {
                            if (iK != 50) {
                                continue;
                            } else {
                                Object objH = q1.f1541c.h(iL & 1048575, obj);
                                this.m.getClass();
                                o0 o0Var = (o0) objH;
                                if (o0Var.isEmpty()) {
                                    continue;
                                } else {
                                    if (((n0) this.f1555b[(i16 / 3) * 2]).f1521a.f1515b.a() != z1.MESSAGE) {
                                        continue;
                                    } else {
                                        d1 d1VarA = null;
                                        for (Object obj2 : o0Var.values()) {
                                            if (d1VarA == null) {
                                                d1VarA = a1.f1445c.a(obj2.getClass());
                                            }
                                            if (!d1VarA.c(obj2)) {
                                            }
                                        }
                                    }
                                }
                            }
                            i15++;
                            i13 = i11;
                            i14 = i12;
                        }
                    }
                    List list = (List) q1.f1541c.h(iL & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        d1 d1VarM = m(i16);
                        for (int i23 = 0; i23 < list.size(); i23++) {
                            if (d1VarM.c(list.get(i23))) {
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

    @Override // androidx.datastore.preferences.protobuf.d1
    public final c0 d() {
        this.f1563j.getClass();
        return ((c0) this.f1558e).i();
    }

    @Override // androidx.datastore.preferences.protobuf.d1
    public final void e(Object obj, l0 l0Var) throws IOException {
        l0Var.getClass();
        o oVar = (o) l0Var.f1512a;
        if (a2.ASCENDING != a2.DESCENDING) {
            M(obj, l0Var);
            return;
        }
        ((l1) this.f1565l).getClass();
        ((c0) obj).unknownFields.d(l0Var);
        int[] iArr = this.f1554a;
        for (int length = iArr.length - 3; length >= 0; length -= 3) {
            int iL = L(length);
            int i11 = iArr[length];
            switch (K(iL)) {
                case 0:
                    if (n(length, obj)) {
                        double d5 = q1.f1541c.d(iL & 1048575, obj);
                        oVar.getClass();
                        oVar.r0(i11, Double.doubleToRawLongBits(d5));
                    }
                    break;
                case 1:
                    if (n(length, obj)) {
                        float fE = q1.f1541c.e(iL & 1048575, obj);
                        oVar.getClass();
                        oVar.p0(i11, Float.floatToRawIntBits(fE));
                    }
                    break;
                case 2:
                    if (n(length, obj)) {
                        oVar.B0(i11, q1.f1541c.g(iL & 1048575, obj));
                    }
                    break;
                case 3:
                    if (n(length, obj)) {
                        oVar.B0(i11, q1.f1541c.g(iL & 1048575, obj));
                    }
                    break;
                case 4:
                    if (n(length, obj)) {
                        oVar.t0(i11, q1.f1541c.f(iL & 1048575, obj));
                    }
                    break;
                case 5:
                    if (n(length, obj)) {
                        oVar.r0(i11, q1.f1541c.g(iL & 1048575, obj));
                    }
                    break;
                case 6:
                    if (n(length, obj)) {
                        oVar.p0(i11, q1.f1541c.f(iL & 1048575, obj));
                    }
                    break;
                case 7:
                    if (n(length, obj)) {
                        oVar.m0(i11, q1.f1541c.c(iL & 1048575, obj));
                    }
                    break;
                case 8:
                    if (n(length, obj)) {
                        O(i11, q1.f1541c.h(iL & 1048575, obj), l0Var);
                    }
                    break;
                case 9:
                    if (n(length, obj)) {
                        oVar.v0(i11, (a) q1.f1541c.h(iL & 1048575, obj), m(length));
                    }
                    break;
                case 10:
                    if (n(length, obj)) {
                        l0Var.a(i11, (i) q1.f1541c.h(iL & 1048575, obj));
                    }
                    break;
                case 11:
                    if (n(length, obj)) {
                        oVar.z0(i11, q1.f1541c.f(iL & 1048575, obj));
                    }
                    break;
                case 12:
                    if (n(length, obj)) {
                        oVar.t0(i11, q1.f1541c.f(iL & 1048575, obj));
                    }
                    break;
                case 13:
                    if (n(length, obj)) {
                        oVar.p0(i11, q1.f1541c.f(iL & 1048575, obj));
                    }
                    break;
                case 14:
                    if (n(length, obj)) {
                        oVar.r0(i11, q1.f1541c.g(iL & 1048575, obj));
                    }
                    break;
                case 15:
                    if (n(length, obj)) {
                        int iF = q1.f1541c.f(iL & 1048575, obj);
                        oVar.z0(i11, (iF >> 31) ^ (iF << 1));
                    }
                    break;
                case 16:
                    if (n(length, obj)) {
                        long jG = q1.f1541c.g(iL & 1048575, obj);
                        oVar.B0(i11, (jG >> 63) ^ (jG << 1));
                    }
                    break;
                case 17:
                    if (n(length, obj)) {
                        l0Var.b(i11, q1.f1541c.h(iL & 1048575, obj), m(length));
                    }
                    break;
                case 18:
                    e1.o(iArr[length], (List) q1.f1541c.h(iL & 1048575, obj), l0Var, false);
                    break;
                case 19:
                    e1.s(iArr[length], (List) q1.f1541c.h(iL & 1048575, obj), l0Var, false);
                    break;
                case 20:
                    e1.v(iArr[length], (List) q1.f1541c.h(iL & 1048575, obj), l0Var, false);
                    break;
                case 21:
                    e1.D(iArr[length], (List) q1.f1541c.h(iL & 1048575, obj), l0Var, false);
                    break;
                case 22:
                    e1.u(iArr[length], (List) q1.f1541c.h(iL & 1048575, obj), l0Var, false);
                    break;
                case 23:
                    e1.r(iArr[length], (List) q1.f1541c.h(iL & 1048575, obj), l0Var, false);
                    break;
                case Service.METRICS_FIELD_NUMBER /* 24 */:
                    e1.q(iArr[length], (List) q1.f1541c.h(iL & 1048575, obj), l0Var, false);
                    break;
                case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                    e1.m(iArr[length], (List) q1.f1541c.h(iL & 1048575, obj), l0Var, false);
                    break;
                case Service.BILLING_FIELD_NUMBER /* 26 */:
                    e1.B(iArr[length], (List) q1.f1541c.h(iL & 1048575, obj), l0Var);
                    break;
                case 27:
                    e1.w(iArr[length], (List) q1.f1541c.h(iL & 1048575, obj), l0Var, m(length));
                    break;
                case Service.MONITORING_FIELD_NUMBER /* 28 */:
                    e1.n(iArr[length], (List) q1.f1541c.h(iL & 1048575, obj), l0Var);
                    break;
                case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
                    e1.C(iArr[length], (List) q1.f1541c.h(iL & 1048575, obj), l0Var, false);
                    break;
                case 30:
                    e1.p(iArr[length], (List) q1.f1541c.h(iL & 1048575, obj), l0Var, false);
                    break;
                case 31:
                    e1.x(iArr[length], (List) q1.f1541c.h(iL & 1048575, obj), l0Var, false);
                    break;
                case Consts.SP /* 32 */:
                    e1.y(iArr[length], (List) q1.f1541c.h(iL & 1048575, obj), l0Var, false);
                    break;
                case 33:
                    e1.z(iArr[length], (List) q1.f1541c.h(iL & 1048575, obj), l0Var, false);
                    break;
                case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                    e1.A(iArr[length], (List) q1.f1541c.h(iL & 1048575, obj), l0Var, false);
                    break;
                case 35:
                    e1.o(iArr[length], (List) q1.f1541c.h(iL & 1048575, obj), l0Var, true);
                    break;
                case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    e1.s(iArr[length], (List) q1.f1541c.h(iL & 1048575, obj), l0Var, true);
                    break;
                case 37:
                    e1.v(iArr[length], (List) q1.f1541c.h(iL & 1048575, obj), l0Var, true);
                    break;
                case 38:
                    e1.D(iArr[length], (List) q1.f1541c.h(iL & 1048575, obj), l0Var, true);
                    break;
                case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    e1.u(iArr[length], (List) q1.f1541c.h(iL & 1048575, obj), l0Var, true);
                    break;
                case DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                    e1.r(iArr[length], (List) q1.f1541c.h(iL & 1048575, obj), l0Var, true);
                    break;
                case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                    e1.q(iArr[length], (List) q1.f1541c.h(iL & 1048575, obj), l0Var, true);
                    break;
                case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                    e1.m(iArr[length], (List) q1.f1541c.h(iL & 1048575, obj), l0Var, true);
                    break;
                case 43:
                    e1.C(iArr[length], (List) q1.f1541c.h(iL & 1048575, obj), l0Var, true);
                    break;
                case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                    e1.p(iArr[length], (List) q1.f1541c.h(iL & 1048575, obj), l0Var, true);
                    break;
                case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                    e1.x(iArr[length], (List) q1.f1541c.h(iL & 1048575, obj), l0Var, true);
                    break;
                case 46:
                    e1.y(iArr[length], (List) q1.f1541c.h(iL & 1048575, obj), l0Var, true);
                    break;
                case 47:
                    e1.z(iArr[length], (List) q1.f1541c.h(iL & 1048575, obj), l0Var, true);
                    break;
                case 48:
                    e1.A(iArr[length], (List) q1.f1541c.h(iL & 1048575, obj), l0Var, true);
                    break;
                case 49:
                    e1.t(iArr[length], (List) q1.f1541c.h(iL & 1048575, obj), l0Var, m(length));
                    break;
                case 50:
                    N(l0Var, i11, q1.f1541c.h(iL & 1048575, obj), length);
                    break;
                case 51:
                    if (q(i11, length, obj)) {
                        double dDoubleValue = ((Double) q1.f1541c.h(iL & 1048575, obj)).doubleValue();
                        oVar.getClass();
                        oVar.r0(i11, Double.doubleToRawLongBits(dDoubleValue));
                    }
                    break;
                case 52:
                    if (q(i11, length, obj)) {
                        float fFloatValue = ((Float) q1.f1541c.h(iL & 1048575, obj)).floatValue();
                        oVar.getClass();
                        oVar.p0(i11, Float.floatToRawIntBits(fFloatValue));
                    }
                    break;
                case 53:
                    if (q(i11, length, obj)) {
                        oVar.B0(i11, z(iL & 1048575, obj));
                    }
                    break;
                case 54:
                    if (q(i11, length, obj)) {
                        oVar.B0(i11, z(iL & 1048575, obj));
                    }
                    break;
                case 55:
                    if (q(i11, length, obj)) {
                        oVar.t0(i11, y(iL & 1048575, obj));
                    }
                    break;
                case 56:
                    if (q(i11, length, obj)) {
                        oVar.r0(i11, z(iL & 1048575, obj));
                    }
                    break;
                case 57:
                    if (q(i11, length, obj)) {
                        oVar.p0(i11, y(iL & 1048575, obj));
                    }
                    break;
                case 58:
                    if (q(i11, length, obj)) {
                        oVar.m0(i11, ((Boolean) q1.f1541c.h(iL & 1048575, obj)).booleanValue());
                    }
                    break;
                case 59:
                    if (q(i11, length, obj)) {
                        O(i11, q1.f1541c.h(iL & 1048575, obj), l0Var);
                    }
                    break;
                case 60:
                    if (q(i11, length, obj)) {
                        oVar.v0(i11, (a) q1.f1541c.h(iL & 1048575, obj), m(length));
                    }
                    break;
                case 61:
                    if (q(i11, length, obj)) {
                        l0Var.a(i11, (i) q1.f1541c.h(iL & 1048575, obj));
                    }
                    break;
                case 62:
                    if (q(i11, length, obj)) {
                        oVar.z0(i11, y(iL & 1048575, obj));
                    }
                    break;
                case 63:
                    if (q(i11, length, obj)) {
                        oVar.t0(i11, y(iL & 1048575, obj));
                    }
                    break;
                case 64:
                    if (q(i11, length, obj)) {
                        oVar.p0(i11, y(iL & 1048575, obj));
                    }
                    break;
                case 65:
                    if (q(i11, length, obj)) {
                        oVar.r0(i11, z(iL & 1048575, obj));
                    }
                    break;
                case 66:
                    if (q(i11, length, obj)) {
                        int iY = y(iL & 1048575, obj);
                        oVar.z0(i11, (iY >> 31) ^ (iY << 1));
                    }
                    break;
                case 67:
                    if (q(i11, length, obj)) {
                        long jZ = z(iL & 1048575, obj);
                        oVar.B0(i11, (jZ >> 63) ^ (jZ << 1));
                    }
                    break;
                case 68:
                    if (q(i11, length, obj)) {
                        l0Var.b(i11, q1.f1541c.h(iL & 1048575, obj), m(length));
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:128:0x0325  */
    /* JADX WARN: Code duplicated, block: B:133:0x0336  */
    /* JADX WARN: Code duplicated, block: B:134:0x0343  */
    /* JADX WARN: Code duplicated, block: B:135:0x0355  */
    /* JADX WARN: Code duplicated, block: B:136:0x0366  */
    /* JADX WARN: Code duplicated, block: B:138:0x036f  */
    /* JADX WARN: Code duplicated, block: B:140:0x0378  */
    /* JADX WARN: Code duplicated, block: B:141:0x0384  */
    /* JADX WARN: Code duplicated, block: B:143:0x0388  */
    /* JADX WARN: Code duplicated, block: B:145:0x0395  */
    /* JADX WARN: Code duplicated, block: B:146:0x039d  */
    /* JADX WARN: Code duplicated, block: B:148:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:149:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:150:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:151:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:152:0x03cb  */
    /* JADX WARN: Code duplicated, block: B:153:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:154:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:155:0x03df  */
    /* JADX WARN: Code duplicated, block: B:156:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:157:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:158:0x0401  */
    /* JADX WARN: Code duplicated, block: B:159:0x0408  */
    /* JADX WARN: Code duplicated, block: B:215:0x05f7 A[PHI: r24 r25
      0x05f7: PHI (r24v19 int) = 
      (r24v2 int)
      (r24v3 int)
      (r24v4 int)
      (r24v8 int)
      (r24v10 int)
      (r24v11 int)
      (r24v12 int)
      (r24v16 int)
      (r24v20 int)
     binds: [B:274:0x07ae, B:270:0x0790, B:266:0x0772, B:249:0x06f5, B:235:0x068c, B:231:0x0670, B:227:0x0654, B:220:0x0616, B:214:0x05f5] A[DONT_GENERATE, DONT_INLINE]
      0x05f7: PHI (r25v18 int) = 
      (r25v2 int)
      (r25v3 int)
      (r25v4 int)
      (r25v8 int)
      (r25v10 int)
      (r25v11 int)
      (r25v12 int)
      (r25v15 int)
      (r25v19 int)
     binds: [B:274:0x07ae, B:270:0x0790, B:266:0x0772, B:249:0x06f5, B:235:0x068c, B:231:0x0670, B:227:0x0654, B:220:0x0616, B:214:0x05f5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:350:0x0330 A[SYNTHETIC] */
    @Override // androidx.datastore.preferences.protobuf.d1
    public final int f(c0 c0Var) {
        int i11;
        int iF0;
        int iF1;
        int iF2;
        int iH0;
        int iF3;
        int iH1;
        int iF4;
        int iF5;
        int iD0;
        int iA;
        int iC;
        int i12;
        int i13;
        int iF6;
        int size;
        int i14;
        int iF7;
        int iF8;
        int size2;
        int iF9;
        int iG0;
        int iA2;
        int iG1;
        int iH2;
        int iA3;
        int size3;
        int iG2;
        int i15;
        y1 y1Var;
        int iF10;
        int iH3;
        int iA4;
        int iG3;
        int iF11;
        int iF12;
        int iH4;
        int iF13;
        int iH5;
        int iG4;
        t0 t0Var = this;
        c0 c0Var2 = c0Var;
        Unsafe unsafe = f1553o;
        int i16 = 1048575;
        int i17 = 1048575;
        int i18 = 0;
        int i19 = 0;
        int iD1 = 0;
        while (true) {
            int[] iArr = t0Var.f1554a;
            if (i18 >= iArr.length) {
                ((l1) t0Var.f1565l).getClass();
                return c0Var2.unknownFields.b() + iD1;
            }
            int iL = t0Var.L(i18);
            int iK = K(iL);
            int i21 = iArr[i18];
            int i22 = iArr[i18 + 2];
            int i23 = i22 & i16;
            int i24 = 1;
            if (iK <= 17) {
                if (i23 != i17) {
                    i19 = i23 == i16 ? 0 : unsafe.getInt(c0Var2, i23);
                    i17 = i23;
                }
                i11 = 1 << (i22 >>> 20);
            } else {
                i11 = 0;
            }
            long j11 = iL & i16;
            if (iK >= x.DOUBLE_LIST_PACKED.a()) {
                x.SINT64_LIST_PACKED.a();
            }
            char c11 = '?';
            switch (iK) {
                case 0:
                    if (t0Var.o(c0Var2, i18, i17, i19, i11)) {
                        iF0 = o.f0(i21);
                        iA = iF0 + 8;
                        iD1 += iA;
                    }
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case 1:
                    if (t0Var.o(c0Var2, i18, i17, i19, i11)) {
                        iF1 = o.f0(i21);
                        iF5 = iF1 + 4;
                        iD1 += iF5;
                    }
                    t0Var = this;
                    c0Var2 = c0Var;
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case 2:
                    if (t0Var.o(c0Var2, i18, i17, i19, i11)) {
                        long j12 = unsafe.getLong(c0Var2, j11);
                        iF2 = o.f0(i21);
                        iH0 = o.h0(j12);
                        iD1 += iH0 + iF2;
                    }
                    t0Var = this;
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case 3:
                    if (t0Var.o(c0Var2, i18, i17, i19, i11)) {
                        long j13 = unsafe.getLong(c0Var2, j11);
                        iF2 = o.f0(i21);
                        iH0 = o.h0(j13);
                        iD1 += iH0 + iF2;
                    }
                    t0Var = this;
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case 4:
                    if (t0Var.o(c0Var2, i18, i17, i19, i11)) {
                        int i25 = unsafe.getInt(c0Var2, j11);
                        iF3 = o.f0(i21);
                        iH1 = o.h0(i25);
                        iD0 = iH1 + iF3;
                        iD1 += iD0;
                    }
                    t0Var = this;
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case 5:
                    if (t0Var.o(c0Var2, i18, i17, i19, i11)) {
                        iF4 = o.f0(i21);
                        iF5 = iF4 + 8;
                        iD1 += iF5;
                    }
                    t0Var = this;
                    c0Var2 = c0Var;
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case 6:
                    if (t0Var.o(c0Var2, i18, i17, i19, i11)) {
                        iF1 = o.f0(i21);
                        iF5 = iF1 + 4;
                        iD1 += iF5;
                    }
                    t0Var = this;
                    c0Var2 = c0Var;
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case 7:
                    if (t0Var.o(c0Var2, i18, i17, i19, i11)) {
                        iF5 = o.f0(i21) + 1;
                        iD1 += iF5;
                    }
                    t0Var = this;
                    c0Var2 = c0Var;
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case 8:
                    if (t0Var.o(c0Var2, i18, i17, i19, i11)) {
                        Object object = unsafe.getObject(c0Var2, j11);
                        iD1 = (object instanceof i ? o.d0(i21, (i) object) : o.e0((String) object) + o.f0(i21)) + iD1;
                    }
                    t0Var = this;
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case 9:
                    if (t0Var.o(c0Var2, i18, i17, i19, i11)) {
                        Object object2 = unsafe.getObject(c0Var2, j11);
                        d1 d1VarM = t0Var.m(i18);
                        Class cls = e1.f1465a;
                        int iF14 = o.f0(i21);
                        int iA5 = ((a) object2).a(d1VarM);
                        iD1 += o.g0(iA5) + iA5 + iF14;
                    }
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case 10:
                    if (t0Var.o(c0Var2, i18, i17, i19, i11)) {
                        iD0 = o.d0(i21, (i) unsafe.getObject(c0Var2, j11));
                        iD1 += iD0;
                    }
                    t0Var = this;
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case 11:
                    if (t0Var.o(c0Var2, i18, i17, i19, i11)) {
                        int i26 = unsafe.getInt(c0Var2, j11);
                        iF3 = o.f0(i21);
                        iH1 = o.g0(i26);
                        iD0 = iH1 + iF3;
                        iD1 += iD0;
                    }
                    t0Var = this;
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case 12:
                    if (t0Var.o(c0Var2, i18, i17, i19, i11)) {
                        int i27 = unsafe.getInt(c0Var2, j11);
                        iF3 = o.f0(i21);
                        iH1 = o.h0(i27);
                        iD0 = iH1 + iF3;
                        iD1 += iD0;
                    }
                    t0Var = this;
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case 13:
                    if (t0Var.o(c0Var2, i18, i17, i19, i11)) {
                        iF1 = o.f0(i21);
                        iF5 = iF1 + 4;
                        iD1 += iF5;
                    }
                    t0Var = this;
                    c0Var2 = c0Var;
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case 14:
                    if (t0Var.o(c0Var2, i18, i17, i19, i11)) {
                        iF4 = o.f0(i21);
                        iF5 = iF4 + 8;
                        iD1 += iF5;
                    }
                    t0Var = this;
                    c0Var2 = c0Var;
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case 15:
                    if (t0Var.o(c0Var2, i18, i17, i19, i11)) {
                        int i28 = unsafe.getInt(c0Var2, j11);
                        iF3 = o.f0(i21);
                        iH1 = o.g0((i28 >> 31) ^ (i28 << 1));
                        iD0 = iH1 + iF3;
                        iD1 += iD0;
                    }
                    t0Var = this;
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case 16:
                    if (t0Var.o(c0Var2, i18, i17, i19, i11)) {
                        long j14 = unsafe.getLong(c0Var2, j11);
                        iF2 = o.f0(i21);
                        iH0 = o.h0((j14 >> 63) ^ (j14 << 1));
                        iD1 += iH0 + iF2;
                    }
                    t0Var = this;
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case 17:
                    if (t0Var.o(c0Var2, i18, i17, i19, i11)) {
                        iA = ((a) unsafe.getObject(c0Var2, j11)).a(t0Var.m(i18)) + (o.f0(i21) * 2);
                        iD1 += iA;
                    }
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case 18:
                    iC = e1.c(i21, (List) unsafe.getObject(c0Var2, j11));
                    iD1 += iC;
                    i17 = i17;
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case 19:
                    iC = e1.b(i21, (List) unsafe.getObject(c0Var2, j11));
                    iD1 += iC;
                    i17 = i17;
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case 20:
                    i12 = i17;
                    i13 = i19;
                    List list = (List) unsafe.getObject(c0Var2, j11);
                    Class cls2 = e1.f1465a;
                    if (list.size() == 0) {
                        iF6 = 0;
                    } else {
                        iF6 = (o.f0(i21) * list.size()) + e1.e(list);
                    }
                    iD1 += iF6;
                    i17 = i12;
                    i19 = i13;
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case 21:
                    i12 = i17;
                    i13 = i19;
                    List list2 = (List) unsafe.getObject(c0Var2, j11);
                    Class cls3 = e1.f1465a;
                    size = list2.size();
                    if (size == 0) {
                        iF6 = 0;
                    } else {
                        i14 = e1.i(list2);
                        iF7 = o.f0(i21);
                        iF6 = (iF7 * size) + i14;
                    }
                    iD1 += iF6;
                    i17 = i12;
                    i19 = i13;
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case 22:
                    i12 = i17;
                    i13 = i19;
                    List list3 = (List) unsafe.getObject(c0Var2, j11);
                    Class cls4 = e1.f1465a;
                    size = list3.size();
                    if (size == 0) {
                        iF6 = 0;
                    } else {
                        i14 = e1.d(list3);
                        iF7 = o.f0(i21);
                        iF6 = (iF7 * size) + i14;
                    }
                    iD1 += iF6;
                    i17 = i12;
                    i19 = i13;
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case 23:
                    iC = e1.c(i21, (List) unsafe.getObject(c0Var2, j11));
                    iD1 += iC;
                    i17 = i17;
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case Service.METRICS_FIELD_NUMBER /* 24 */:
                    iC = e1.b(i21, (List) unsafe.getObject(c0Var2, j11));
                    iD1 += iC;
                    i17 = i17;
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                    i12 = i17;
                    i13 = i19;
                    List list4 = (List) unsafe.getObject(c0Var2, j11);
                    Class cls5 = e1.f1465a;
                    int size4 = list4.size();
                    iD1 += size4 == 0 ? 0 : (o.f0(i21) + 1) * size4;
                    i17 = i12;
                    i19 = i13;
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case Service.BILLING_FIELD_NUMBER /* 26 */:
                    i12 = i17;
                    i13 = i19;
                    List list5 = (List) unsafe.getObject(c0Var2, j11);
                    Class cls6 = e1.f1465a;
                    int size5 = list5.size();
                    if (size5 == 0) {
                        iF6 = 0;
                    } else {
                        iF6 = o.f0(i21) * size5;
                        for (int i29 = 0; i29 < size5; i29++) {
                            Object obj = list5.get(i29);
                            if (obj instanceof i) {
                                int size6 = ((i) obj).size();
                                iF6 = o.g0(size6) + size6 + iF6;
                            } else {
                                iF6 = o.e0((String) obj) + iF6;
                            }
                        }
                    }
                    iD1 += iF6;
                    i17 = i12;
                    i19 = i13;
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case 27:
                    i12 = i17;
                    i13 = i19;
                    List list6 = (List) unsafe.getObject(c0Var2, j11);
                    d1 d1VarM2 = t0Var.m(i18);
                    Class cls7 = e1.f1465a;
                    int size7 = list6.size();
                    if (size7 == 0) {
                        iF8 = 0;
                    } else {
                        iF8 = o.f0(i21) * size7;
                        for (int i30 = 0; i30 < size7; i30++) {
                            int iA6 = ((a) list6.get(i30)).a(d1VarM2);
                            iF8 += o.g0(iA6) + iA6;
                        }
                    }
                    iD1 += iF8;
                    i17 = i12;
                    i19 = i13;
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case Service.MONITORING_FIELD_NUMBER /* 28 */:
                    i12 = i17;
                    i13 = i19;
                    List list7 = (List) unsafe.getObject(c0Var2, j11);
                    Class cls8 = e1.f1465a;
                    int size8 = list7.size();
                    if (size8 == 0) {
                        iF6 = 0;
                    } else {
                        iF6 = o.f0(i21) * size8;
                        for (int i31 = 0; i31 < list7.size(); i31++) {
                            int size9 = ((i) list7.get(i31)).size();
                            iF6 += o.g0(size9) + size9;
                        }
                    }
                    iD1 += iF6;
                    i17 = i12;
                    i19 = i13;
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
                    i12 = i17;
                    i13 = i19;
                    List list8 = (List) unsafe.getObject(c0Var2, j11);
                    Class cls9 = e1.f1465a;
                    size = list8.size();
                    if (size == 0) {
                        iF6 = 0;
                    } else {
                        i14 = e1.h(list8);
                        iF7 = o.f0(i21);
                        iF6 = (iF7 * size) + i14;
                    }
                    iD1 += iF6;
                    i17 = i12;
                    i19 = i13;
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case 30:
                    i12 = i17;
                    i13 = i19;
                    List list9 = (List) unsafe.getObject(c0Var2, j11);
                    Class cls10 = e1.f1465a;
                    size = list9.size();
                    if (size == 0) {
                        iF6 = 0;
                    } else {
                        i14 = e1.a(list9);
                        iF7 = o.f0(i21);
                        iF6 = (iF7 * size) + i14;
                    }
                    iD1 += iF6;
                    i17 = i12;
                    i19 = i13;
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case 31:
                    iC = e1.b(i21, (List) unsafe.getObject(c0Var2, j11));
                    iD1 += iC;
                    i17 = i17;
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case Consts.SP /* 32 */:
                    iC = e1.c(i21, (List) unsafe.getObject(c0Var2, j11));
                    iD1 += iC;
                    i17 = i17;
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case 33:
                    i12 = i17;
                    i13 = i19;
                    List list10 = (List) unsafe.getObject(c0Var2, j11);
                    Class cls11 = e1.f1465a;
                    size = list10.size();
                    if (size == 0) {
                        iF6 = 0;
                    } else {
                        i14 = e1.f(list10);
                        iF7 = o.f0(i21);
                        iF6 = (iF7 * size) + i14;
                    }
                    iD1 += iF6;
                    i17 = i12;
                    i19 = i13;
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                    i12 = i17;
                    i13 = i19;
                    List list11 = (List) unsafe.getObject(c0Var2, j11);
                    Class cls12 = e1.f1465a;
                    size = list11.size();
                    if (size == 0) {
                        iF6 = 0;
                    } else {
                        i14 = e1.g(list11);
                        iF7 = o.f0(i21);
                        iF6 = (iF7 * size) + i14;
                    }
                    iD1 += iF6;
                    i17 = i12;
                    i19 = i13;
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case 35:
                    i12 = i17;
                    i13 = i19;
                    List list12 = (List) unsafe.getObject(c0Var2, j11);
                    Class cls13 = e1.f1465a;
                    size2 = list12.size() * 8;
                    if (size2 > 0) {
                        iF9 = o.f0(i21);
                        iG0 = o.g0(size2);
                        iD1 += iG0 + iF9 + size2;
                    }
                    i17 = i12;
                    i19 = i13;
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    i12 = i17;
                    i13 = i19;
                    List list13 = (List) unsafe.getObject(c0Var2, j11);
                    Class cls14 = e1.f1465a;
                    size2 = list13.size() * 4;
                    if (size2 > 0) {
                        iF9 = o.f0(i21);
                        iG0 = o.g0(size2);
                        iD1 += iG0 + iF9 + size2;
                    }
                    i17 = i12;
                    i19 = i13;
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case 37:
                    i12 = i17;
                    i13 = i19;
                    size2 = e1.e((List) unsafe.getObject(c0Var2, j11));
                    if (size2 > 0) {
                        iF9 = o.f0(i21);
                        iG0 = o.g0(size2);
                        iD1 += iG0 + iF9 + size2;
                    }
                    i17 = i12;
                    i19 = i13;
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case 38:
                    i12 = i17;
                    i13 = i19;
                    size2 = e1.i((List) unsafe.getObject(c0Var2, j11));
                    if (size2 > 0) {
                        iF9 = o.f0(i21);
                        iG0 = o.g0(size2);
                        iD1 += iG0 + iF9 + size2;
                    }
                    i17 = i12;
                    i19 = i13;
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    i12 = i17;
                    i13 = i19;
                    size2 = e1.d((List) unsafe.getObject(c0Var2, j11));
                    if (size2 > 0) {
                        iF9 = o.f0(i21);
                        iG0 = o.g0(size2);
                        iD1 += iG0 + iF9 + size2;
                    }
                    i17 = i12;
                    i19 = i13;
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                    i12 = i17;
                    i13 = i19;
                    List list14 = (List) unsafe.getObject(c0Var2, j11);
                    Class cls15 = e1.f1465a;
                    size2 = list14.size() * 8;
                    if (size2 > 0) {
                        iF9 = o.f0(i21);
                        iG0 = o.g0(size2);
                        iD1 += iG0 + iF9 + size2;
                    }
                    i17 = i12;
                    i19 = i13;
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                    i12 = i17;
                    i13 = i19;
                    List list15 = (List) unsafe.getObject(c0Var2, j11);
                    Class cls16 = e1.f1465a;
                    size2 = list15.size() * 4;
                    if (size2 > 0) {
                        iF9 = o.f0(i21);
                        iG0 = o.g0(size2);
                        iD1 += iG0 + iF9 + size2;
                    }
                    i17 = i12;
                    i19 = i13;
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                    i12 = i17;
                    i13 = i19;
                    List list16 = (List) unsafe.getObject(c0Var2, j11);
                    Class cls17 = e1.f1465a;
                    size2 = list16.size();
                    if (size2 > 0) {
                        iF9 = o.f0(i21);
                        iG0 = o.g0(size2);
                        iD1 += iG0 + iF9 + size2;
                    }
                    i17 = i12;
                    i19 = i13;
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case 43:
                    i12 = i17;
                    i13 = i19;
                    size2 = e1.h((List) unsafe.getObject(c0Var2, j11));
                    if (size2 > 0) {
                        iF9 = o.f0(i21);
                        iG0 = o.g0(size2);
                        iD1 += iG0 + iF9 + size2;
                    }
                    i17 = i12;
                    i19 = i13;
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                    i12 = i17;
                    i13 = i19;
                    size2 = e1.a((List) unsafe.getObject(c0Var2, j11));
                    if (size2 > 0) {
                        iF9 = o.f0(i21);
                        iG0 = o.g0(size2);
                        iD1 += iG0 + iF9 + size2;
                    }
                    i17 = i12;
                    i19 = i13;
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                    i12 = i17;
                    i13 = i19;
                    List list17 = (List) unsafe.getObject(c0Var2, j11);
                    Class cls18 = e1.f1465a;
                    size2 = list17.size() * 4;
                    if (size2 > 0) {
                        iF9 = o.f0(i21);
                        iG0 = o.g0(size2);
                        iD1 += iG0 + iF9 + size2;
                    }
                    i17 = i12;
                    i19 = i13;
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case 46:
                    i12 = i17;
                    i13 = i19;
                    List list18 = (List) unsafe.getObject(c0Var2, j11);
                    Class cls19 = e1.f1465a;
                    size2 = list18.size() * 8;
                    if (size2 > 0) {
                        iF9 = o.f0(i21);
                        iG0 = o.g0(size2);
                        iD1 += iG0 + iF9 + size2;
                    }
                    i17 = i12;
                    i19 = i13;
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case 47:
                    i12 = i17;
                    i13 = i19;
                    size2 = e1.f((List) unsafe.getObject(c0Var2, j11));
                    if (size2 > 0) {
                        iF9 = o.f0(i21);
                        iG0 = o.g0(size2);
                        iD1 += iG0 + iF9 + size2;
                    }
                    i17 = i12;
                    i19 = i13;
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case 48:
                    i12 = i17;
                    i13 = i19;
                    size2 = e1.g((List) unsafe.getObject(c0Var2, j11));
                    if (size2 > 0) {
                        iF9 = o.f0(i21);
                        iG0 = o.g0(size2);
                        iD1 += iG0 + iF9 + size2;
                    }
                    i17 = i12;
                    i19 = i13;
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case 49:
                    i12 = i17;
                    i13 = i19;
                    List list19 = (List) unsafe.getObject(c0Var2, j11);
                    d1 d1VarM3 = t0Var.m(i18);
                    Class cls20 = e1.f1465a;
                    int size10 = list19.size();
                    if (size10 == 0) {
                        iA2 = 0;
                    } else {
                        iA2 = 0;
                        for (int i32 = 0; i32 < size10; i32++) {
                            iA2 += ((a) list19.get(i32)).a(d1VarM3) + (o.f0(i21) * 2);
                        }
                    }
                    iD1 += iA2;
                    i17 = i12;
                    i19 = i13;
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case 50:
                    Object object3 = unsafe.getObject(c0Var2, j11);
                    Object obj2 = t0Var.f1555b[(i18 / 3) * 2];
                    t0Var.m.getClass();
                    o0 o0Var = (o0) object3;
                    n0 n0Var = (n0) obj2;
                    if (o0Var.isEmpty()) {
                        iG1 = 0;
                    } else {
                        Iterator it = o0Var.entrySet().iterator();
                        iG1 = 0;
                        while (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            n0Var.getClass();
                            int iF15 = o.f0(i21);
                            m0 m0Var = n0Var.f1521a;
                            char c12 = c11;
                            y1 y1Var2 = m0Var.f1514a;
                            int i33 = u.f1567c;
                            int iF16 = o.f0(i24);
                            int i34 = i24;
                            y1 y1Var3 = y1.GROUP;
                            if (y1Var2 == y1Var3) {
                                iF16 *= 2;
                            }
                            int[] iArr2 = t.f1551b;
                            int i35 = i17;
                            int i36 = i19;
                            switch (iArr2[y1Var2.ordinal()]) {
                                case 1:
                                    ((Double) key).getClass();
                                    iH2 = 8;
                                    i15 = iH2 + iF16;
                                    y1Var = m0Var.f1515b;
                                    iF10 = o.f0(2);
                                    if (y1Var == y1Var3) {
                                        iF10 *= 2;
                                    }
                                    switch (iArr2[y1Var.ordinal()]) {
                                        case 1:
                                            ((Double) value).getClass();
                                            iH3 = 8;
                                            int i37 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i37) + i37 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 2:
                                            ((Float) value).getClass();
                                            iH3 = 4;
                                            int i38 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i38) + i38 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 3:
                                            iH3 = o.h0(((Long) value).longValue());
                                            int i39 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i39) + i39 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 4:
                                            iH3 = o.h0(((Long) value).longValue());
                                            int i310 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i310) + i310 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 5:
                                            iH3 = o.h0(((Integer) value).intValue());
                                            int i311 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i311) + i311 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 6:
                                            ((Long) value).getClass();
                                            iH3 = 8;
                                            int i312 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i312) + i312 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 7:
                                            ((Integer) value).getClass();
                                            iH3 = 4;
                                            int i313 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i313) + i313 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 8:
                                            ((Boolean) value).getClass();
                                            iH3 = i34;
                                            int i314 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i314) + i314 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 9:
                                            iH3 = ((c0) ((a) value)).a(null);
                                            int i315 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i315) + i315 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 10:
                                            iA4 = ((c0) ((a) value)).a(null);
                                            iG3 = o.g0(iA4);
                                            iH3 = iA4 + iG3;
                                            int i316 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i316) + i316 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 11:
                                            if (value instanceof i) {
                                                iA4 = ((i) value).size();
                                                iG3 = o.g0(iA4);
                                                iH3 = iA4 + iG3;
                                            } else {
                                                iH3 = o.e0((String) value);
                                            }
                                            int i317 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i317) + i317 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 12:
                                            if (value instanceof i) {
                                                iA4 = ((i) value).size();
                                                iG3 = o.g0(iA4);
                                            } else {
                                                iA4 = ((byte[]) value).length;
                                                iG3 = o.g0(iA4);
                                            }
                                            iH3 = iA4 + iG3;
                                            int i318 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i318) + i318 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 13:
                                            iH3 = o.g0(((Integer) value).intValue());
                                            int i319 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i319) + i319 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iH3 = 4;
                                            int i3110 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i3110) + i3110 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iH3 = 8;
                                            int i3111 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i3111) + i3111 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 16:
                                            int iIntValue = ((Integer) value).intValue();
                                            iH3 = o.g0((iIntValue >> 31) ^ (iIntValue << 1));
                                            int i3112 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i3112) + i3112 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 17:
                                            long jLongValue = ((Long) value).longValue();
                                            iH3 = o.h0((jLongValue << i34) ^ (jLongValue >> c12));
                                            int i3113 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i3113) + i3113 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 18:
                                            iH3 = o.h0(((Integer) value).intValue());
                                            int i3114 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i3114) + i3114 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 2:
                                    ((Float) key).getClass();
                                    iH2 = 4;
                                    i15 = iH2 + iF16;
                                    y1Var = m0Var.f1515b;
                                    iF10 = o.f0(2);
                                    if (y1Var == y1Var3) {
                                        iF10 *= 2;
                                    }
                                    switch (iArr2[y1Var.ordinal()]) {
                                        case 1:
                                            ((Double) value).getClass();
                                            iH3 = 8;
                                            int i3115 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i3115) + i3115 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 2:
                                            ((Float) value).getClass();
                                            iH3 = 4;
                                            int i3116 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i3116) + i3116 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 3:
                                            iH3 = o.h0(((Long) value).longValue());
                                            int i3117 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i3117) + i3117 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 4:
                                            iH3 = o.h0(((Long) value).longValue());
                                            int i3118 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i3118) + i3118 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 5:
                                            iH3 = o.h0(((Integer) value).intValue());
                                            int i3119 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i3119) + i3119 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 6:
                                            ((Long) value).getClass();
                                            iH3 = 8;
                                            int i31110 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i31110) + i31110 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 7:
                                            ((Integer) value).getClass();
                                            iH3 = 4;
                                            int i31111 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i31111) + i31111 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 8:
                                            ((Boolean) value).getClass();
                                            iH3 = i34;
                                            int i31112 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i31112) + i31112 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 9:
                                            iH3 = ((c0) ((a) value)).a(null);
                                            int i31113 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i31113) + i31113 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 10:
                                            iA4 = ((c0) ((a) value)).a(null);
                                            iG3 = o.g0(iA4);
                                            iH3 = iA4 + iG3;
                                            int i31114 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i31114) + i31114 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 11:
                                            if (value instanceof i) {
                                                iA4 = ((i) value).size();
                                                iG3 = o.g0(iA4);
                                                iH3 = iA4 + iG3;
                                            } else {
                                                iH3 = o.e0((String) value);
                                            }
                                            int i31115 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i31115) + i31115 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 12:
                                            if (value instanceof i) {
                                                iA4 = ((i) value).size();
                                                iG3 = o.g0(iA4);
                                            } else {
                                                iA4 = ((byte[]) value).length;
                                                iG3 = o.g0(iA4);
                                            }
                                            iH3 = iA4 + iG3;
                                            int i31116 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i31116) + i31116 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 13:
                                            iH3 = o.g0(((Integer) value).intValue());
                                            int i31117 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i31117) + i31117 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iH3 = 4;
                                            int i31118 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i31118) + i31118 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iH3 = 8;
                                            int i31119 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i31119) + i31119 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 16:
                                            int iIntValue2 = ((Integer) value).intValue();
                                            iH3 = o.g0((iIntValue2 >> 31) ^ (iIntValue2 << 1));
                                            int i311110 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i311110) + i311110 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 17:
                                            long jLongValue2 = ((Long) value).longValue();
                                            iH3 = o.h0((jLongValue2 << i34) ^ (jLongValue2 >> c12));
                                            int i311111 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i311111) + i311111 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 18:
                                            iH3 = o.h0(((Integer) value).intValue());
                                            int i311112 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i311112) + i311112 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 3:
                                    it = it;
                                    iH2 = o.h0(((Long) key).longValue());
                                    i15 = iH2 + iF16;
                                    y1Var = m0Var.f1515b;
                                    iF10 = o.f0(2);
                                    if (y1Var == y1Var3) {
                                        iF10 *= 2;
                                    }
                                    switch (iArr2[y1Var.ordinal()]) {
                                        case 1:
                                            ((Double) value).getClass();
                                            iH3 = 8;
                                            int i311113 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i311113) + i311113 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 2:
                                            ((Float) value).getClass();
                                            iH3 = 4;
                                            int i311114 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i311114) + i311114 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 3:
                                            iH3 = o.h0(((Long) value).longValue());
                                            int i311115 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i311115) + i311115 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 4:
                                            iH3 = o.h0(((Long) value).longValue());
                                            int i311116 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i311116) + i311116 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 5:
                                            iH3 = o.h0(((Integer) value).intValue());
                                            int i311117 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i311117) + i311117 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 6:
                                            ((Long) value).getClass();
                                            iH3 = 8;
                                            int i311118 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i311118) + i311118 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 7:
                                            ((Integer) value).getClass();
                                            iH3 = 4;
                                            int i311119 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i311119) + i311119 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 8:
                                            ((Boolean) value).getClass();
                                            iH3 = i34;
                                            int i3111110 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i3111110) + i3111110 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 9:
                                            iH3 = ((c0) ((a) value)).a(null);
                                            int i3111111 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i3111111) + i3111111 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 10:
                                            iA4 = ((c0) ((a) value)).a(null);
                                            iG3 = o.g0(iA4);
                                            iH3 = iA4 + iG3;
                                            int i3111112 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i3111112) + i3111112 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 11:
                                            if (value instanceof i) {
                                                iA4 = ((i) value).size();
                                                iG3 = o.g0(iA4);
                                                iH3 = iA4 + iG3;
                                            } else {
                                                iH3 = o.e0((String) value);
                                            }
                                            int i3111113 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i3111113) + i3111113 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 12:
                                            if (value instanceof i) {
                                                iA4 = ((i) value).size();
                                                iG3 = o.g0(iA4);
                                            } else {
                                                iA4 = ((byte[]) value).length;
                                                iG3 = o.g0(iA4);
                                            }
                                            iH3 = iA4 + iG3;
                                            int i3111114 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i3111114) + i3111114 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 13:
                                            iH3 = o.g0(((Integer) value).intValue());
                                            int i3111115 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i3111115) + i3111115 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iH3 = 4;
                                            int i3111116 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i3111116) + i3111116 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iH3 = 8;
                                            int i3111117 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i3111117) + i3111117 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 16:
                                            int iIntValue3 = ((Integer) value).intValue();
                                            iH3 = o.g0((iIntValue3 >> 31) ^ (iIntValue3 << 1));
                                            int i3111118 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i3111118) + i3111118 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 17:
                                            long jLongValue3 = ((Long) value).longValue();
                                            iH3 = o.h0((jLongValue3 << i34) ^ (jLongValue3 >> c12));
                                            int i3111119 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i3111119) + i3111119 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 18:
                                            iH3 = o.h0(((Integer) value).intValue());
                                            int i31111110 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i31111110) + i31111110 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 4:
                                    it = it;
                                    iH2 = o.h0(((Long) key).longValue());
                                    i15 = iH2 + iF16;
                                    y1Var = m0Var.f1515b;
                                    iF10 = o.f0(2);
                                    if (y1Var == y1Var3) {
                                        iF10 *= 2;
                                    }
                                    switch (iArr2[y1Var.ordinal()]) {
                                        case 1:
                                            ((Double) value).getClass();
                                            iH3 = 8;
                                            int i31111111 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i31111111) + i31111111 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 2:
                                            ((Float) value).getClass();
                                            iH3 = 4;
                                            int i31111112 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i31111112) + i31111112 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 3:
                                            iH3 = o.h0(((Long) value).longValue());
                                            int i31111113 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i31111113) + i31111113 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 4:
                                            iH3 = o.h0(((Long) value).longValue());
                                            int i31111114 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i31111114) + i31111114 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 5:
                                            iH3 = o.h0(((Integer) value).intValue());
                                            int i31111115 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i31111115) + i31111115 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 6:
                                            ((Long) value).getClass();
                                            iH3 = 8;
                                            int i31111116 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i31111116) + i31111116 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 7:
                                            ((Integer) value).getClass();
                                            iH3 = 4;
                                            int i31111117 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i31111117) + i31111117 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 8:
                                            ((Boolean) value).getClass();
                                            iH3 = i34;
                                            int i31111118 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i31111118) + i31111118 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 9:
                                            iH3 = ((c0) ((a) value)).a(null);
                                            int i31111119 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i31111119) + i31111119 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 10:
                                            iA4 = ((c0) ((a) value)).a(null);
                                            iG3 = o.g0(iA4);
                                            iH3 = iA4 + iG3;
                                            int i311111110 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i311111110) + i311111110 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 11:
                                            if (value instanceof i) {
                                                iA4 = ((i) value).size();
                                                iG3 = o.g0(iA4);
                                                iH3 = iA4 + iG3;
                                            } else {
                                                iH3 = o.e0((String) value);
                                            }
                                            int i311111111 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i311111111) + i311111111 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 12:
                                            if (value instanceof i) {
                                                iA4 = ((i) value).size();
                                                iG3 = o.g0(iA4);
                                            } else {
                                                iA4 = ((byte[]) value).length;
                                                iG3 = o.g0(iA4);
                                            }
                                            iH3 = iA4 + iG3;
                                            int i311111112 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i311111112) + i311111112 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 13:
                                            iH3 = o.g0(((Integer) value).intValue());
                                            int i311111113 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i311111113) + i311111113 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iH3 = 4;
                                            int i311111114 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i311111114) + i311111114 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iH3 = 8;
                                            int i311111115 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i311111115) + i311111115 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 16:
                                            int iIntValue4 = ((Integer) value).intValue();
                                            iH3 = o.g0((iIntValue4 >> 31) ^ (iIntValue4 << 1));
                                            int i311111116 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i311111116) + i311111116 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 17:
                                            long jLongValue4 = ((Long) value).longValue();
                                            iH3 = o.h0((jLongValue4 << i34) ^ (jLongValue4 >> c12));
                                            int i311111117 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i311111117) + i311111117 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 18:
                                            iH3 = o.h0(((Integer) value).intValue());
                                            int i311111118 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i311111118) + i311111118 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 5:
                                    it = it;
                                    iH2 = o.h0(((Integer) key).intValue());
                                    i15 = iH2 + iF16;
                                    y1Var = m0Var.f1515b;
                                    iF10 = o.f0(2);
                                    if (y1Var == y1Var3) {
                                        iF10 *= 2;
                                    }
                                    switch (iArr2[y1Var.ordinal()]) {
                                        case 1:
                                            ((Double) value).getClass();
                                            iH3 = 8;
                                            int i311111119 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i311111119) + i311111119 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 2:
                                            ((Float) value).getClass();
                                            iH3 = 4;
                                            int i3111111110 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i3111111110) + i3111111110 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 3:
                                            iH3 = o.h0(((Long) value).longValue());
                                            int i3111111111 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i3111111111) + i3111111111 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 4:
                                            iH3 = o.h0(((Long) value).longValue());
                                            int i3111111112 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i3111111112) + i3111111112 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 5:
                                            iH3 = o.h0(((Integer) value).intValue());
                                            int i3111111113 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i3111111113) + i3111111113 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 6:
                                            ((Long) value).getClass();
                                            iH3 = 8;
                                            int i3111111114 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i3111111114) + i3111111114 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 7:
                                            ((Integer) value).getClass();
                                            iH3 = 4;
                                            int i3111111115 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i3111111115) + i3111111115 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 8:
                                            ((Boolean) value).getClass();
                                            iH3 = i34;
                                            int i3111111116 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i3111111116) + i3111111116 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 9:
                                            iH3 = ((c0) ((a) value)).a(null);
                                            int i3111111117 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i3111111117) + i3111111117 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 10:
                                            iA4 = ((c0) ((a) value)).a(null);
                                            iG3 = o.g0(iA4);
                                            iH3 = iA4 + iG3;
                                            int i3111111118 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i3111111118) + i3111111118 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 11:
                                            if (value instanceof i) {
                                                iA4 = ((i) value).size();
                                                iG3 = o.g0(iA4);
                                                iH3 = iA4 + iG3;
                                            } else {
                                                iH3 = o.e0((String) value);
                                            }
                                            int i3111111119 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i3111111119) + i3111111119 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 12:
                                            if (value instanceof i) {
                                                iA4 = ((i) value).size();
                                                iG3 = o.g0(iA4);
                                            } else {
                                                iA4 = ((byte[]) value).length;
                                                iG3 = o.g0(iA4);
                                            }
                                            iH3 = iA4 + iG3;
                                            int i31111111110 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i31111111110) + i31111111110 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 13:
                                            iH3 = o.g0(((Integer) value).intValue());
                                            int i31111111111 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i31111111111) + i31111111111 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iH3 = 4;
                                            int i31111111112 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i31111111112) + i31111111112 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iH3 = 8;
                                            int i31111111113 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i31111111113) + i31111111113 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 16:
                                            int iIntValue5 = ((Integer) value).intValue();
                                            iH3 = o.g0((iIntValue5 >> 31) ^ (iIntValue5 << 1));
                                            int i31111111114 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i31111111114) + i31111111114 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 17:
                                            long jLongValue5 = ((Long) value).longValue();
                                            iH3 = o.h0((jLongValue5 << i34) ^ (jLongValue5 >> c12));
                                            int i31111111115 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i31111111115) + i31111111115 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 18:
                                            iH3 = o.h0(((Integer) value).intValue());
                                            int i31111111116 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i31111111116) + i31111111116 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 6:
                                    ((Long) key).getClass();
                                    iH2 = 8;
                                    i15 = iH2 + iF16;
                                    y1Var = m0Var.f1515b;
                                    iF10 = o.f0(2);
                                    if (y1Var == y1Var3) {
                                        iF10 *= 2;
                                    }
                                    switch (iArr2[y1Var.ordinal()]) {
                                        case 1:
                                            ((Double) value).getClass();
                                            iH3 = 8;
                                            int i31111111117 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i31111111117) + i31111111117 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 2:
                                            ((Float) value).getClass();
                                            iH3 = 4;
                                            int i31111111118 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i31111111118) + i31111111118 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 3:
                                            iH3 = o.h0(((Long) value).longValue());
                                            int i31111111119 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i31111111119) + i31111111119 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 4:
                                            iH3 = o.h0(((Long) value).longValue());
                                            int i311111111110 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i311111111110) + i311111111110 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 5:
                                            iH3 = o.h0(((Integer) value).intValue());
                                            int i311111111111 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i311111111111) + i311111111111 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 6:
                                            ((Long) value).getClass();
                                            iH3 = 8;
                                            int i311111111112 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i311111111112) + i311111111112 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 7:
                                            ((Integer) value).getClass();
                                            iH3 = 4;
                                            int i311111111113 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i311111111113) + i311111111113 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 8:
                                            ((Boolean) value).getClass();
                                            iH3 = i34;
                                            int i311111111114 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i311111111114) + i311111111114 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 9:
                                            iH3 = ((c0) ((a) value)).a(null);
                                            int i311111111115 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i311111111115) + i311111111115 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 10:
                                            iA4 = ((c0) ((a) value)).a(null);
                                            iG3 = o.g0(iA4);
                                            iH3 = iA4 + iG3;
                                            int i311111111116 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i311111111116) + i311111111116 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 11:
                                            if (value instanceof i) {
                                                iA4 = ((i) value).size();
                                                iG3 = o.g0(iA4);
                                                iH3 = iA4 + iG3;
                                            } else {
                                                iH3 = o.e0((String) value);
                                            }
                                            int i311111111117 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i311111111117) + i311111111117 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 12:
                                            if (value instanceof i) {
                                                iA4 = ((i) value).size();
                                                iG3 = o.g0(iA4);
                                            } else {
                                                iA4 = ((byte[]) value).length;
                                                iG3 = o.g0(iA4);
                                            }
                                            iH3 = iA4 + iG3;
                                            int i311111111118 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i311111111118) + i311111111118 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 13:
                                            iH3 = o.g0(((Integer) value).intValue());
                                            int i311111111119 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i311111111119) + i311111111119 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iH3 = 4;
                                            int i3111111111110 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i3111111111110) + i3111111111110 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iH3 = 8;
                                            int i3111111111111 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i3111111111111) + i3111111111111 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 16:
                                            int iIntValue6 = ((Integer) value).intValue();
                                            iH3 = o.g0((iIntValue6 >> 31) ^ (iIntValue6 << 1));
                                            int i3111111111112 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i3111111111112) + i3111111111112 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 17:
                                            long jLongValue6 = ((Long) value).longValue();
                                            iH3 = o.h0((jLongValue6 << i34) ^ (jLongValue6 >> c12));
                                            int i3111111111113 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i3111111111113) + i3111111111113 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 18:
                                            iH3 = o.h0(((Integer) value).intValue());
                                            int i3111111111114 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i3111111111114) + i3111111111114 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 7:
                                    ((Integer) key).getClass();
                                    iH2 = 4;
                                    i15 = iH2 + iF16;
                                    y1Var = m0Var.f1515b;
                                    iF10 = o.f0(2);
                                    if (y1Var == y1Var3) {
                                        iF10 *= 2;
                                    }
                                    switch (iArr2[y1Var.ordinal()]) {
                                        case 1:
                                            ((Double) value).getClass();
                                            iH3 = 8;
                                            int i3111111111115 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i3111111111115) + i3111111111115 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 2:
                                            ((Float) value).getClass();
                                            iH3 = 4;
                                            int i3111111111116 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i3111111111116) + i3111111111116 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 3:
                                            iH3 = o.h0(((Long) value).longValue());
                                            int i3111111111117 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i3111111111117) + i3111111111117 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 4:
                                            iH3 = o.h0(((Long) value).longValue());
                                            int i3111111111118 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i3111111111118) + i3111111111118 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 5:
                                            iH3 = o.h0(((Integer) value).intValue());
                                            int i3111111111119 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i3111111111119) + i3111111111119 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 6:
                                            ((Long) value).getClass();
                                            iH3 = 8;
                                            int i31111111111110 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i31111111111110) + i31111111111110 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 7:
                                            ((Integer) value).getClass();
                                            iH3 = 4;
                                            int i31111111111111 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i31111111111111) + i31111111111111 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 8:
                                            ((Boolean) value).getClass();
                                            iH3 = i34;
                                            int i31111111111112 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i31111111111112) + i31111111111112 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 9:
                                            iH3 = ((c0) ((a) value)).a(null);
                                            int i31111111111113 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i31111111111113) + i31111111111113 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 10:
                                            iA4 = ((c0) ((a) value)).a(null);
                                            iG3 = o.g0(iA4);
                                            iH3 = iA4 + iG3;
                                            int i31111111111114 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i31111111111114) + i31111111111114 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 11:
                                            if (value instanceof i) {
                                                iA4 = ((i) value).size();
                                                iG3 = o.g0(iA4);
                                                iH3 = iA4 + iG3;
                                            } else {
                                                iH3 = o.e0((String) value);
                                            }
                                            int i31111111111115 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i31111111111115) + i31111111111115 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 12:
                                            if (value instanceof i) {
                                                iA4 = ((i) value).size();
                                                iG3 = o.g0(iA4);
                                            } else {
                                                iA4 = ((byte[]) value).length;
                                                iG3 = o.g0(iA4);
                                            }
                                            iH3 = iA4 + iG3;
                                            int i31111111111116 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i31111111111116) + i31111111111116 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 13:
                                            iH3 = o.g0(((Integer) value).intValue());
                                            int i31111111111117 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i31111111111117) + i31111111111117 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iH3 = 4;
                                            int i31111111111118 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i31111111111118) + i31111111111118 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iH3 = 8;
                                            int i31111111111119 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i31111111111119) + i31111111111119 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 16:
                                            int iIntValue7 = ((Integer) value).intValue();
                                            iH3 = o.g0((iIntValue7 >> 31) ^ (iIntValue7 << 1));
                                            int i311111111111110 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i311111111111110) + i311111111111110 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 17:
                                            long jLongValue7 = ((Long) value).longValue();
                                            iH3 = o.h0((jLongValue7 << i34) ^ (jLongValue7 >> c12));
                                            int i311111111111111 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i311111111111111) + i311111111111111 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 18:
                                            iH3 = o.h0(((Integer) value).intValue());
                                            int i311111111111112 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i311111111111112) + i311111111111112 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 8:
                                    it = it;
                                    ((Boolean) key).getClass();
                                    iH2 = i34;
                                    i15 = iH2 + iF16;
                                    y1Var = m0Var.f1515b;
                                    iF10 = o.f0(2);
                                    if (y1Var == y1Var3) {
                                        iF10 *= 2;
                                    }
                                    switch (iArr2[y1Var.ordinal()]) {
                                        case 1:
                                            ((Double) value).getClass();
                                            iH3 = 8;
                                            int i311111111111113 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i311111111111113) + i311111111111113 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 2:
                                            ((Float) value).getClass();
                                            iH3 = 4;
                                            int i311111111111114 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i311111111111114) + i311111111111114 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 3:
                                            iH3 = o.h0(((Long) value).longValue());
                                            int i311111111111115 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i311111111111115) + i311111111111115 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 4:
                                            iH3 = o.h0(((Long) value).longValue());
                                            int i311111111111116 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i311111111111116) + i311111111111116 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 5:
                                            iH3 = o.h0(((Integer) value).intValue());
                                            int i311111111111117 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i311111111111117) + i311111111111117 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 6:
                                            ((Long) value).getClass();
                                            iH3 = 8;
                                            int i311111111111118 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i311111111111118) + i311111111111118 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 7:
                                            ((Integer) value).getClass();
                                            iH3 = 4;
                                            int i311111111111119 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i311111111111119) + i311111111111119 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 8:
                                            ((Boolean) value).getClass();
                                            iH3 = i34;
                                            int i3111111111111110 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i3111111111111110) + i3111111111111110 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 9:
                                            iH3 = ((c0) ((a) value)).a(null);
                                            int i3111111111111111 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i3111111111111111) + i3111111111111111 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 10:
                                            iA4 = ((c0) ((a) value)).a(null);
                                            iG3 = o.g0(iA4);
                                            iH3 = iA4 + iG3;
                                            int i3111111111111112 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i3111111111111112) + i3111111111111112 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 11:
                                            if (value instanceof i) {
                                                iA4 = ((i) value).size();
                                                iG3 = o.g0(iA4);
                                                iH3 = iA4 + iG3;
                                            } else {
                                                iH3 = o.e0((String) value);
                                            }
                                            int i3111111111111113 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i3111111111111113) + i3111111111111113 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 12:
                                            if (value instanceof i) {
                                                iA4 = ((i) value).size();
                                                iG3 = o.g0(iA4);
                                            } else {
                                                iA4 = ((byte[]) value).length;
                                                iG3 = o.g0(iA4);
                                            }
                                            iH3 = iA4 + iG3;
                                            int i3111111111111114 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i3111111111111114) + i3111111111111114 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 13:
                                            iH3 = o.g0(((Integer) value).intValue());
                                            int i3111111111111115 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i3111111111111115) + i3111111111111115 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iH3 = 4;
                                            int i3111111111111116 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i3111111111111116) + i3111111111111116 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iH3 = 8;
                                            int i3111111111111117 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i3111111111111117) + i3111111111111117 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 16:
                                            int iIntValue8 = ((Integer) value).intValue();
                                            iH3 = o.g0((iIntValue8 >> 31) ^ (iIntValue8 << 1));
                                            int i3111111111111118 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i3111111111111118) + i3111111111111118 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 17:
                                            long jLongValue8 = ((Long) value).longValue();
                                            iH3 = o.h0((jLongValue8 << i34) ^ (jLongValue8 >> c12));
                                            int i3111111111111119 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i3111111111111119) + i3111111111111119 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 18:
                                            iH3 = o.h0(((Integer) value).intValue());
                                            int i31111111111111110 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i31111111111111110) + i31111111111111110 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 9:
                                    iA3 = ((c0) ((a) key)).a(null);
                                    iH2 = iA3;
                                    i15 = iH2 + iF16;
                                    y1Var = m0Var.f1515b;
                                    iF10 = o.f0(2);
                                    if (y1Var == y1Var3) {
                                        iF10 *= 2;
                                    }
                                    switch (iArr2[y1Var.ordinal()]) {
                                        case 1:
                                            ((Double) value).getClass();
                                            iH3 = 8;
                                            int i31111111111111111 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i31111111111111111) + i31111111111111111 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 2:
                                            ((Float) value).getClass();
                                            iH3 = 4;
                                            int i31111111111111112 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i31111111111111112) + i31111111111111112 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 3:
                                            iH3 = o.h0(((Long) value).longValue());
                                            int i31111111111111113 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i31111111111111113) + i31111111111111113 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 4:
                                            iH3 = o.h0(((Long) value).longValue());
                                            int i31111111111111114 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i31111111111111114) + i31111111111111114 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 5:
                                            iH3 = o.h0(((Integer) value).intValue());
                                            int i31111111111111115 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i31111111111111115) + i31111111111111115 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 6:
                                            ((Long) value).getClass();
                                            iH3 = 8;
                                            int i31111111111111116 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i31111111111111116) + i31111111111111116 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 7:
                                            ((Integer) value).getClass();
                                            iH3 = 4;
                                            int i31111111111111117 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i31111111111111117) + i31111111111111117 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 8:
                                            ((Boolean) value).getClass();
                                            iH3 = i34;
                                            int i31111111111111118 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i31111111111111118) + i31111111111111118 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 9:
                                            iH3 = ((c0) ((a) value)).a(null);
                                            int i31111111111111119 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i31111111111111119) + i31111111111111119 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 10:
                                            iA4 = ((c0) ((a) value)).a(null);
                                            iG3 = o.g0(iA4);
                                            iH3 = iA4 + iG3;
                                            int i311111111111111110 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i311111111111111110) + i311111111111111110 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 11:
                                            if (value instanceof i) {
                                                iA4 = ((i) value).size();
                                                iG3 = o.g0(iA4);
                                                iH3 = iA4 + iG3;
                                            } else {
                                                iH3 = o.e0((String) value);
                                            }
                                            int i311111111111111111 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i311111111111111111) + i311111111111111111 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 12:
                                            if (value instanceof i) {
                                                iA4 = ((i) value).size();
                                                iG3 = o.g0(iA4);
                                            } else {
                                                iA4 = ((byte[]) value).length;
                                                iG3 = o.g0(iA4);
                                            }
                                            iH3 = iA4 + iG3;
                                            int i311111111111111112 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i311111111111111112) + i311111111111111112 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 13:
                                            iH3 = o.g0(((Integer) value).intValue());
                                            int i311111111111111113 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i311111111111111113) + i311111111111111113 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iH3 = 4;
                                            int i311111111111111114 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i311111111111111114) + i311111111111111114 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iH3 = 8;
                                            int i311111111111111115 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i311111111111111115) + i311111111111111115 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 16:
                                            int iIntValue9 = ((Integer) value).intValue();
                                            iH3 = o.g0((iIntValue9 >> 31) ^ (iIntValue9 << 1));
                                            int i311111111111111116 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i311111111111111116) + i311111111111111116 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 17:
                                            long jLongValue9 = ((Long) value).longValue();
                                            iH3 = o.h0((jLongValue9 << i34) ^ (jLongValue9 >> c12));
                                            int i311111111111111117 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i311111111111111117) + i311111111111111117 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 18:
                                            iH3 = o.h0(((Integer) value).intValue());
                                            int i311111111111111118 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i311111111111111118) + i311111111111111118 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 10:
                                    int iA7 = ((c0) ((a) key)).a(null);
                                    iA3 = iA7 + o.g0(iA7);
                                    iH2 = iA3;
                                    i15 = iH2 + iF16;
                                    y1Var = m0Var.f1515b;
                                    iF10 = o.f0(2);
                                    if (y1Var == y1Var3) {
                                        iF10 *= 2;
                                    }
                                    switch (iArr2[y1Var.ordinal()]) {
                                        case 1:
                                            ((Double) value).getClass();
                                            iH3 = 8;
                                            int i311111111111111119 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i311111111111111119) + i311111111111111119 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 2:
                                            ((Float) value).getClass();
                                            iH3 = 4;
                                            int i3111111111111111110 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i3111111111111111110) + i3111111111111111110 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 3:
                                            iH3 = o.h0(((Long) value).longValue());
                                            int i3111111111111111111 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i3111111111111111111) + i3111111111111111111 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 4:
                                            iH3 = o.h0(((Long) value).longValue());
                                            int i3111111111111111112 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i3111111111111111112) + i3111111111111111112 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 5:
                                            iH3 = o.h0(((Integer) value).intValue());
                                            int i3111111111111111113 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i3111111111111111113) + i3111111111111111113 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 6:
                                            ((Long) value).getClass();
                                            iH3 = 8;
                                            int i3111111111111111114 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i3111111111111111114) + i3111111111111111114 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 7:
                                            ((Integer) value).getClass();
                                            iH3 = 4;
                                            int i3111111111111111115 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i3111111111111111115) + i3111111111111111115 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 8:
                                            ((Boolean) value).getClass();
                                            iH3 = i34;
                                            int i3111111111111111116 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i3111111111111111116) + i3111111111111111116 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 9:
                                            iH3 = ((c0) ((a) value)).a(null);
                                            int i3111111111111111117 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i3111111111111111117) + i3111111111111111117 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 10:
                                            iA4 = ((c0) ((a) value)).a(null);
                                            iG3 = o.g0(iA4);
                                            iH3 = iA4 + iG3;
                                            int i3111111111111111118 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i3111111111111111118) + i3111111111111111118 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 11:
                                            if (value instanceof i) {
                                                iA4 = ((i) value).size();
                                                iG3 = o.g0(iA4);
                                                iH3 = iA4 + iG3;
                                            } else {
                                                iH3 = o.e0((String) value);
                                            }
                                            int i3111111111111111119 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i3111111111111111119) + i3111111111111111119 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 12:
                                            if (value instanceof i) {
                                                iA4 = ((i) value).size();
                                                iG3 = o.g0(iA4);
                                            } else {
                                                iA4 = ((byte[]) value).length;
                                                iG3 = o.g0(iA4);
                                            }
                                            iH3 = iA4 + iG3;
                                            int i31111111111111111110 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i31111111111111111110) + i31111111111111111110 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 13:
                                            iH3 = o.g0(((Integer) value).intValue());
                                            int i31111111111111111111 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i31111111111111111111) + i31111111111111111111 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iH3 = 4;
                                            int i31111111111111111112 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i31111111111111111112) + i31111111111111111112 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iH3 = 8;
                                            int i31111111111111111113 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i31111111111111111113) + i31111111111111111113 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 16:
                                            int iIntValue10 = ((Integer) value).intValue();
                                            iH3 = o.g0((iIntValue10 >> 31) ^ (iIntValue10 << 1));
                                            int i31111111111111111114 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i31111111111111111114) + i31111111111111111114 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 17:
                                            long jLongValue10 = ((Long) value).longValue();
                                            iH3 = o.h0((jLongValue10 << i34) ^ (jLongValue10 >> c12));
                                            int i31111111111111111115 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i31111111111111111115) + i31111111111111111115 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 18:
                                            iH3 = o.h0(((Integer) value).intValue());
                                            int i31111111111111111116 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i31111111111111111116) + i31111111111111111116 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 11:
                                    it = it;
                                    if (key instanceof i) {
                                        size3 = ((i) key).size();
                                        iG2 = o.g0(size3);
                                        iH2 = size3 + iG2;
                                    } else {
                                        iH2 = o.e0((String) key);
                                    }
                                    i15 = iH2 + iF16;
                                    y1Var = m0Var.f1515b;
                                    iF10 = o.f0(2);
                                    if (y1Var == y1Var3) {
                                        iF10 *= 2;
                                    }
                                    switch (iArr2[y1Var.ordinal()]) {
                                        case 1:
                                            ((Double) value).getClass();
                                            iH3 = 8;
                                            int i31111111111111111117 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i31111111111111111117) + i31111111111111111117 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 2:
                                            ((Float) value).getClass();
                                            iH3 = 4;
                                            int i31111111111111111118 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i31111111111111111118) + i31111111111111111118 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 3:
                                            iH3 = o.h0(((Long) value).longValue());
                                            int i31111111111111111119 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i31111111111111111119) + i31111111111111111119 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 4:
                                            iH3 = o.h0(((Long) value).longValue());
                                            int i311111111111111111110 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i311111111111111111110) + i311111111111111111110 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 5:
                                            iH3 = o.h0(((Integer) value).intValue());
                                            int i311111111111111111111 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i311111111111111111111) + i311111111111111111111 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 6:
                                            ((Long) value).getClass();
                                            iH3 = 8;
                                            int i311111111111111111112 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i311111111111111111112) + i311111111111111111112 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 7:
                                            ((Integer) value).getClass();
                                            iH3 = 4;
                                            int i311111111111111111113 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i311111111111111111113) + i311111111111111111113 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 8:
                                            ((Boolean) value).getClass();
                                            iH3 = i34;
                                            int i311111111111111111114 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i311111111111111111114) + i311111111111111111114 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 9:
                                            iH3 = ((c0) ((a) value)).a(null);
                                            int i311111111111111111115 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i311111111111111111115) + i311111111111111111115 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 10:
                                            iA4 = ((c0) ((a) value)).a(null);
                                            iG3 = o.g0(iA4);
                                            iH3 = iA4 + iG3;
                                            int i311111111111111111116 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i311111111111111111116) + i311111111111111111116 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 11:
                                            if (value instanceof i) {
                                                iA4 = ((i) value).size();
                                                iG3 = o.g0(iA4);
                                                iH3 = iA4 + iG3;
                                            } else {
                                                iH3 = o.e0((String) value);
                                            }
                                            int i311111111111111111117 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i311111111111111111117) + i311111111111111111117 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 12:
                                            if (value instanceof i) {
                                                iA4 = ((i) value).size();
                                                iG3 = o.g0(iA4);
                                            } else {
                                                iA4 = ((byte[]) value).length;
                                                iG3 = o.g0(iA4);
                                            }
                                            iH3 = iA4 + iG3;
                                            int i311111111111111111118 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i311111111111111111118) + i311111111111111111118 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 13:
                                            iH3 = o.g0(((Integer) value).intValue());
                                            int i311111111111111111119 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i311111111111111111119) + i311111111111111111119 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iH3 = 4;
                                            int i3111111111111111111110 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i3111111111111111111110) + i3111111111111111111110 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iH3 = 8;
                                            int i3111111111111111111111 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i3111111111111111111111) + i3111111111111111111111 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 16:
                                            int iIntValue11 = ((Integer) value).intValue();
                                            iH3 = o.g0((iIntValue11 >> 31) ^ (iIntValue11 << 1));
                                            int i3111111111111111111112 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i3111111111111111111112) + i3111111111111111111112 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 17:
                                            long jLongValue11 = ((Long) value).longValue();
                                            iH3 = o.h0((jLongValue11 << i34) ^ (jLongValue11 >> c12));
                                            int i3111111111111111111113 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i3111111111111111111113) + i3111111111111111111113 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 18:
                                            iH3 = o.h0(((Integer) value).intValue());
                                            int i3111111111111111111114 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i3111111111111111111114) + i3111111111111111111114 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 12:
                                    it = it;
                                    if (key instanceof i) {
                                        size3 = ((i) key).size();
                                        iG2 = o.g0(size3);
                                    } else {
                                        size3 = ((byte[]) key).length;
                                        iG2 = o.g0(size3);
                                    }
                                    iH2 = size3 + iG2;
                                    i15 = iH2 + iF16;
                                    y1Var = m0Var.f1515b;
                                    iF10 = o.f0(2);
                                    if (y1Var == y1Var3) {
                                        iF10 *= 2;
                                    }
                                    switch (iArr2[y1Var.ordinal()]) {
                                        case 1:
                                            ((Double) value).getClass();
                                            iH3 = 8;
                                            int i3111111111111111111115 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i3111111111111111111115) + i3111111111111111111115 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 2:
                                            ((Float) value).getClass();
                                            iH3 = 4;
                                            int i3111111111111111111116 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i3111111111111111111116) + i3111111111111111111116 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 3:
                                            iH3 = o.h0(((Long) value).longValue());
                                            int i3111111111111111111117 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i3111111111111111111117) + i3111111111111111111117 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 4:
                                            iH3 = o.h0(((Long) value).longValue());
                                            int i3111111111111111111118 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i3111111111111111111118) + i3111111111111111111118 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 5:
                                            iH3 = o.h0(((Integer) value).intValue());
                                            int i3111111111111111111119 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i3111111111111111111119) + i3111111111111111111119 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 6:
                                            ((Long) value).getClass();
                                            iH3 = 8;
                                            int i31111111111111111111110 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i31111111111111111111110) + i31111111111111111111110 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 7:
                                            ((Integer) value).getClass();
                                            iH3 = 4;
                                            int i31111111111111111111111 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i31111111111111111111111) + i31111111111111111111111 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 8:
                                            ((Boolean) value).getClass();
                                            iH3 = i34;
                                            int i31111111111111111111112 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i31111111111111111111112) + i31111111111111111111112 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 9:
                                            iH3 = ((c0) ((a) value)).a(null);
                                            int i31111111111111111111113 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i31111111111111111111113) + i31111111111111111111113 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 10:
                                            iA4 = ((c0) ((a) value)).a(null);
                                            iG3 = o.g0(iA4);
                                            iH3 = iA4 + iG3;
                                            int i31111111111111111111114 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i31111111111111111111114) + i31111111111111111111114 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 11:
                                            if (value instanceof i) {
                                                iA4 = ((i) value).size();
                                                iG3 = o.g0(iA4);
                                                iH3 = iA4 + iG3;
                                            } else {
                                                iH3 = o.e0((String) value);
                                            }
                                            int i31111111111111111111115 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i31111111111111111111115) + i31111111111111111111115 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 12:
                                            if (value instanceof i) {
                                                iA4 = ((i) value).size();
                                                iG3 = o.g0(iA4);
                                            } else {
                                                iA4 = ((byte[]) value).length;
                                                iG3 = o.g0(iA4);
                                            }
                                            iH3 = iA4 + iG3;
                                            int i31111111111111111111116 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i31111111111111111111116) + i31111111111111111111116 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 13:
                                            iH3 = o.g0(((Integer) value).intValue());
                                            int i31111111111111111111117 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i31111111111111111111117) + i31111111111111111111117 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iH3 = 4;
                                            int i31111111111111111111118 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i31111111111111111111118) + i31111111111111111111118 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iH3 = 8;
                                            int i31111111111111111111119 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i31111111111111111111119) + i31111111111111111111119 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 16:
                                            int iIntValue12 = ((Integer) value).intValue();
                                            iH3 = o.g0((iIntValue12 >> 31) ^ (iIntValue12 << 1));
                                            int i311111111111111111111110 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i311111111111111111111110) + i311111111111111111111110 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 17:
                                            long jLongValue12 = ((Long) value).longValue();
                                            iH3 = o.h0((jLongValue12 << i34) ^ (jLongValue12 >> c12));
                                            int i311111111111111111111111 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i311111111111111111111111) + i311111111111111111111111 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 18:
                                            iH3 = o.h0(((Integer) value).intValue());
                                            int i311111111111111111111112 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i311111111111111111111112) + i311111111111111111111112 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 13:
                                    it = it;
                                    iH2 = o.g0(((Integer) key).intValue());
                                    i15 = iH2 + iF16;
                                    y1Var = m0Var.f1515b;
                                    iF10 = o.f0(2);
                                    if (y1Var == y1Var3) {
                                        iF10 *= 2;
                                    }
                                    switch (iArr2[y1Var.ordinal()]) {
                                        case 1:
                                            ((Double) value).getClass();
                                            iH3 = 8;
                                            int i311111111111111111111113 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i311111111111111111111113) + i311111111111111111111113 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 2:
                                            ((Float) value).getClass();
                                            iH3 = 4;
                                            int i311111111111111111111114 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i311111111111111111111114) + i311111111111111111111114 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 3:
                                            iH3 = o.h0(((Long) value).longValue());
                                            int i311111111111111111111115 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i311111111111111111111115) + i311111111111111111111115 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 4:
                                            iH3 = o.h0(((Long) value).longValue());
                                            int i311111111111111111111116 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i311111111111111111111116) + i311111111111111111111116 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 5:
                                            iH3 = o.h0(((Integer) value).intValue());
                                            int i311111111111111111111117 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i311111111111111111111117) + i311111111111111111111117 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 6:
                                            ((Long) value).getClass();
                                            iH3 = 8;
                                            int i311111111111111111111118 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i311111111111111111111118) + i311111111111111111111118 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 7:
                                            ((Integer) value).getClass();
                                            iH3 = 4;
                                            int i311111111111111111111119 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i311111111111111111111119) + i311111111111111111111119 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 8:
                                            ((Boolean) value).getClass();
                                            iH3 = i34;
                                            int i3111111111111111111111110 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i3111111111111111111111110) + i3111111111111111111111110 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 9:
                                            iH3 = ((c0) ((a) value)).a(null);
                                            int i3111111111111111111111111 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i3111111111111111111111111) + i3111111111111111111111111 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 10:
                                            iA4 = ((c0) ((a) value)).a(null);
                                            iG3 = o.g0(iA4);
                                            iH3 = iA4 + iG3;
                                            int i3111111111111111111111112 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i3111111111111111111111112) + i3111111111111111111111112 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 11:
                                            if (value instanceof i) {
                                                iA4 = ((i) value).size();
                                                iG3 = o.g0(iA4);
                                                iH3 = iA4 + iG3;
                                            } else {
                                                iH3 = o.e0((String) value);
                                            }
                                            int i3111111111111111111111113 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i3111111111111111111111113) + i3111111111111111111111113 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 12:
                                            if (value instanceof i) {
                                                iA4 = ((i) value).size();
                                                iG3 = o.g0(iA4);
                                            } else {
                                                iA4 = ((byte[]) value).length;
                                                iG3 = o.g0(iA4);
                                            }
                                            iH3 = iA4 + iG3;
                                            int i3111111111111111111111114 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i3111111111111111111111114) + i3111111111111111111111114 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 13:
                                            iH3 = o.g0(((Integer) value).intValue());
                                            int i3111111111111111111111115 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i3111111111111111111111115) + i3111111111111111111111115 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iH3 = 4;
                                            int i3111111111111111111111116 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i3111111111111111111111116) + i3111111111111111111111116 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iH3 = 8;
                                            int i3111111111111111111111117 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i3111111111111111111111117) + i3111111111111111111111117 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 16:
                                            int iIntValue13 = ((Integer) value).intValue();
                                            iH3 = o.g0((iIntValue13 >> 31) ^ (iIntValue13 << 1));
                                            int i3111111111111111111111118 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i3111111111111111111111118) + i3111111111111111111111118 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 17:
                                            long jLongValue13 = ((Long) value).longValue();
                                            iH3 = o.h0((jLongValue13 << i34) ^ (jLongValue13 >> c12));
                                            int i3111111111111111111111119 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i3111111111111111111111119) + i3111111111111111111111119 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 18:
                                            iH3 = o.h0(((Integer) value).intValue());
                                            int i31111111111111111111111110 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i31111111111111111111111110) + i31111111111111111111111110 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 14:
                                    ((Integer) key).getClass();
                                    iH2 = 4;
                                    i15 = iH2 + iF16;
                                    y1Var = m0Var.f1515b;
                                    iF10 = o.f0(2);
                                    if (y1Var == y1Var3) {
                                        iF10 *= 2;
                                    }
                                    switch (iArr2[y1Var.ordinal()]) {
                                        case 1:
                                            ((Double) value).getClass();
                                            iH3 = 8;
                                            int i31111111111111111111111111 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i31111111111111111111111111) + i31111111111111111111111111 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 2:
                                            ((Float) value).getClass();
                                            iH3 = 4;
                                            int i31111111111111111111111112 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i31111111111111111111111112) + i31111111111111111111111112 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 3:
                                            iH3 = o.h0(((Long) value).longValue());
                                            int i31111111111111111111111113 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i31111111111111111111111113) + i31111111111111111111111113 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 4:
                                            iH3 = o.h0(((Long) value).longValue());
                                            int i31111111111111111111111114 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i31111111111111111111111114) + i31111111111111111111111114 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 5:
                                            iH3 = o.h0(((Integer) value).intValue());
                                            int i31111111111111111111111115 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i31111111111111111111111115) + i31111111111111111111111115 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 6:
                                            ((Long) value).getClass();
                                            iH3 = 8;
                                            int i31111111111111111111111116 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i31111111111111111111111116) + i31111111111111111111111116 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 7:
                                            ((Integer) value).getClass();
                                            iH3 = 4;
                                            int i31111111111111111111111117 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i31111111111111111111111117) + i31111111111111111111111117 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 8:
                                            ((Boolean) value).getClass();
                                            iH3 = i34;
                                            int i31111111111111111111111118 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i31111111111111111111111118) + i31111111111111111111111118 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 9:
                                            iH3 = ((c0) ((a) value)).a(null);
                                            int i31111111111111111111111119 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i31111111111111111111111119) + i31111111111111111111111119 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 10:
                                            iA4 = ((c0) ((a) value)).a(null);
                                            iG3 = o.g0(iA4);
                                            iH3 = iA4 + iG3;
                                            int i311111111111111111111111110 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i311111111111111111111111110) + i311111111111111111111111110 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 11:
                                            if (value instanceof i) {
                                                iA4 = ((i) value).size();
                                                iG3 = o.g0(iA4);
                                                iH3 = iA4 + iG3;
                                            } else {
                                                iH3 = o.e0((String) value);
                                            }
                                            int i311111111111111111111111111 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i311111111111111111111111111) + i311111111111111111111111111 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 12:
                                            if (value instanceof i) {
                                                iA4 = ((i) value).size();
                                                iG3 = o.g0(iA4);
                                            } else {
                                                iA4 = ((byte[]) value).length;
                                                iG3 = o.g0(iA4);
                                            }
                                            iH3 = iA4 + iG3;
                                            int i311111111111111111111111112 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i311111111111111111111111112) + i311111111111111111111111112 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 13:
                                            iH3 = o.g0(((Integer) value).intValue());
                                            int i311111111111111111111111113 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i311111111111111111111111113) + i311111111111111111111111113 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iH3 = 4;
                                            int i311111111111111111111111114 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i311111111111111111111111114) + i311111111111111111111111114 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iH3 = 8;
                                            int i311111111111111111111111115 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i311111111111111111111111115) + i311111111111111111111111115 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 16:
                                            int iIntValue14 = ((Integer) value).intValue();
                                            iH3 = o.g0((iIntValue14 >> 31) ^ (iIntValue14 << 1));
                                            int i311111111111111111111111116 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i311111111111111111111111116) + i311111111111111111111111116 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 17:
                                            long jLongValue14 = ((Long) value).longValue();
                                            iH3 = o.h0((jLongValue14 << i34) ^ (jLongValue14 >> c12));
                                            int i311111111111111111111111117 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i311111111111111111111111117) + i311111111111111111111111117 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 18:
                                            iH3 = o.h0(((Integer) value).intValue());
                                            int i311111111111111111111111118 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i311111111111111111111111118) + i311111111111111111111111118 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 15:
                                    ((Long) key).getClass();
                                    iH2 = 8;
                                    i15 = iH2 + iF16;
                                    y1Var = m0Var.f1515b;
                                    iF10 = o.f0(2);
                                    if (y1Var == y1Var3) {
                                        iF10 *= 2;
                                    }
                                    switch (iArr2[y1Var.ordinal()]) {
                                        case 1:
                                            ((Double) value).getClass();
                                            iH3 = 8;
                                            int i311111111111111111111111119 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i311111111111111111111111119) + i311111111111111111111111119 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 2:
                                            ((Float) value).getClass();
                                            iH3 = 4;
                                            int i3111111111111111111111111110 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i3111111111111111111111111110) + i3111111111111111111111111110 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 3:
                                            iH3 = o.h0(((Long) value).longValue());
                                            int i3111111111111111111111111111 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i3111111111111111111111111111) + i3111111111111111111111111111 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 4:
                                            iH3 = o.h0(((Long) value).longValue());
                                            int i3111111111111111111111111112 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i3111111111111111111111111112) + i3111111111111111111111111112 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 5:
                                            iH3 = o.h0(((Integer) value).intValue());
                                            int i3111111111111111111111111113 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i3111111111111111111111111113) + i3111111111111111111111111113 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 6:
                                            ((Long) value).getClass();
                                            iH3 = 8;
                                            int i3111111111111111111111111114 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i3111111111111111111111111114) + i3111111111111111111111111114 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 7:
                                            ((Integer) value).getClass();
                                            iH3 = 4;
                                            int i3111111111111111111111111115 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i3111111111111111111111111115) + i3111111111111111111111111115 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 8:
                                            ((Boolean) value).getClass();
                                            iH3 = i34;
                                            int i3111111111111111111111111116 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i3111111111111111111111111116) + i3111111111111111111111111116 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 9:
                                            iH3 = ((c0) ((a) value)).a(null);
                                            int i3111111111111111111111111117 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i3111111111111111111111111117) + i3111111111111111111111111117 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 10:
                                            iA4 = ((c0) ((a) value)).a(null);
                                            iG3 = o.g0(iA4);
                                            iH3 = iA4 + iG3;
                                            int i3111111111111111111111111118 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i3111111111111111111111111118) + i3111111111111111111111111118 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 11:
                                            if (value instanceof i) {
                                                iA4 = ((i) value).size();
                                                iG3 = o.g0(iA4);
                                                iH3 = iA4 + iG3;
                                            } else {
                                                iH3 = o.e0((String) value);
                                            }
                                            int i3111111111111111111111111119 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i3111111111111111111111111119) + i3111111111111111111111111119 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 12:
                                            if (value instanceof i) {
                                                iA4 = ((i) value).size();
                                                iG3 = o.g0(iA4);
                                            } else {
                                                iA4 = ((byte[]) value).length;
                                                iG3 = o.g0(iA4);
                                            }
                                            iH3 = iA4 + iG3;
                                            int i31111111111111111111111111110 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i31111111111111111111111111110) + i31111111111111111111111111110 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 13:
                                            iH3 = o.g0(((Integer) value).intValue());
                                            int i31111111111111111111111111111 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i31111111111111111111111111111) + i31111111111111111111111111111 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iH3 = 4;
                                            int i31111111111111111111111111112 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i31111111111111111111111111112) + i31111111111111111111111111112 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iH3 = 8;
                                            int i31111111111111111111111111113 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i31111111111111111111111111113) + i31111111111111111111111111113 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 16:
                                            int iIntValue15 = ((Integer) value).intValue();
                                            iH3 = o.g0((iIntValue15 >> 31) ^ (iIntValue15 << 1));
                                            int i31111111111111111111111111114 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i31111111111111111111111111114) + i31111111111111111111111111114 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 17:
                                            long jLongValue15 = ((Long) value).longValue();
                                            iH3 = o.h0((jLongValue15 << i34) ^ (jLongValue15 >> c12));
                                            int i31111111111111111111111111115 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i31111111111111111111111111115) + i31111111111111111111111111115 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 18:
                                            iH3 = o.h0(((Integer) value).intValue());
                                            int i31111111111111111111111111116 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i31111111111111111111111111116) + i31111111111111111111111111116 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 16:
                                    it = it;
                                    int iIntValue16 = ((Integer) key).intValue();
                                    iH2 = o.g0((iIntValue16 >> 31) ^ (iIntValue16 << 1));
                                    i15 = iH2 + iF16;
                                    y1Var = m0Var.f1515b;
                                    iF10 = o.f0(2);
                                    if (y1Var == y1Var3) {
                                        iF10 *= 2;
                                    }
                                    switch (iArr2[y1Var.ordinal()]) {
                                        case 1:
                                            ((Double) value).getClass();
                                            iH3 = 8;
                                            int i31111111111111111111111111117 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i31111111111111111111111111117) + i31111111111111111111111111117 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 2:
                                            ((Float) value).getClass();
                                            iH3 = 4;
                                            int i31111111111111111111111111118 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i31111111111111111111111111118) + i31111111111111111111111111118 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 3:
                                            iH3 = o.h0(((Long) value).longValue());
                                            int i31111111111111111111111111119 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i31111111111111111111111111119) + i31111111111111111111111111119 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 4:
                                            iH3 = o.h0(((Long) value).longValue());
                                            int i311111111111111111111111111110 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i311111111111111111111111111110) + i311111111111111111111111111110 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 5:
                                            iH3 = o.h0(((Integer) value).intValue());
                                            int i311111111111111111111111111111 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i311111111111111111111111111111) + i311111111111111111111111111111 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 6:
                                            ((Long) value).getClass();
                                            iH3 = 8;
                                            int i311111111111111111111111111112 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i311111111111111111111111111112) + i311111111111111111111111111112 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 7:
                                            ((Integer) value).getClass();
                                            iH3 = 4;
                                            int i311111111111111111111111111113 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i311111111111111111111111111113) + i311111111111111111111111111113 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 8:
                                            ((Boolean) value).getClass();
                                            iH3 = i34;
                                            int i311111111111111111111111111114 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i311111111111111111111111111114) + i311111111111111111111111111114 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 9:
                                            iH3 = ((c0) ((a) value)).a(null);
                                            int i311111111111111111111111111115 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i311111111111111111111111111115) + i311111111111111111111111111115 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 10:
                                            iA4 = ((c0) ((a) value)).a(null);
                                            iG3 = o.g0(iA4);
                                            iH3 = iA4 + iG3;
                                            int i311111111111111111111111111116 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i311111111111111111111111111116) + i311111111111111111111111111116 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 11:
                                            if (value instanceof i) {
                                                iA4 = ((i) value).size();
                                                iG3 = o.g0(iA4);
                                                iH3 = iA4 + iG3;
                                            } else {
                                                iH3 = o.e0((String) value);
                                            }
                                            int i311111111111111111111111111117 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i311111111111111111111111111117) + i311111111111111111111111111117 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 12:
                                            if (value instanceof i) {
                                                iA4 = ((i) value).size();
                                                iG3 = o.g0(iA4);
                                            } else {
                                                iA4 = ((byte[]) value).length;
                                                iG3 = o.g0(iA4);
                                            }
                                            iH3 = iA4 + iG3;
                                            int i311111111111111111111111111118 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i311111111111111111111111111118) + i311111111111111111111111111118 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 13:
                                            iH3 = o.g0(((Integer) value).intValue());
                                            int i311111111111111111111111111119 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i311111111111111111111111111119) + i311111111111111111111111111119 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iH3 = 4;
                                            int i3111111111111111111111111111110 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i3111111111111111111111111111110) + i3111111111111111111111111111110 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iH3 = 8;
                                            int i3111111111111111111111111111111 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i3111111111111111111111111111111) + i3111111111111111111111111111111 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 16:
                                            int iIntValue17 = ((Integer) value).intValue();
                                            iH3 = o.g0((iIntValue17 >> 31) ^ (iIntValue17 << 1));
                                            int i3111111111111111111111111111112 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i3111111111111111111111111111112) + i3111111111111111111111111111112 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 17:
                                            long jLongValue16 = ((Long) value).longValue();
                                            iH3 = o.h0((jLongValue16 << i34) ^ (jLongValue16 >> c12));
                                            int i3111111111111111111111111111113 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i3111111111111111111111111111113) + i3111111111111111111111111111113 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 18:
                                            iH3 = o.h0(((Integer) value).intValue());
                                            int i3111111111111111111111111111114 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i3111111111111111111111111111114) + i3111111111111111111111111111114 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 17:
                                    it = it;
                                    long jLongValue17 = ((Long) key).longValue();
                                    iH2 = o.h0((jLongValue17 << i34) ^ (jLongValue17 >> c12));
                                    i15 = iH2 + iF16;
                                    y1Var = m0Var.f1515b;
                                    iF10 = o.f0(2);
                                    if (y1Var == y1Var3) {
                                        iF10 *= 2;
                                    }
                                    switch (iArr2[y1Var.ordinal()]) {
                                        case 1:
                                            ((Double) value).getClass();
                                            iH3 = 8;
                                            int i3111111111111111111111111111115 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i3111111111111111111111111111115) + i3111111111111111111111111111115 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 2:
                                            ((Float) value).getClass();
                                            iH3 = 4;
                                            int i3111111111111111111111111111116 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i3111111111111111111111111111116) + i3111111111111111111111111111116 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 3:
                                            iH3 = o.h0(((Long) value).longValue());
                                            int i3111111111111111111111111111117 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i3111111111111111111111111111117) + i3111111111111111111111111111117 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 4:
                                            iH3 = o.h0(((Long) value).longValue());
                                            int i3111111111111111111111111111118 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i3111111111111111111111111111118) + i3111111111111111111111111111118 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 5:
                                            iH3 = o.h0(((Integer) value).intValue());
                                            int i3111111111111111111111111111119 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i3111111111111111111111111111119) + i3111111111111111111111111111119 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 6:
                                            ((Long) value).getClass();
                                            iH3 = 8;
                                            int i31111111111111111111111111111110 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i31111111111111111111111111111110) + i31111111111111111111111111111110 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 7:
                                            ((Integer) value).getClass();
                                            iH3 = 4;
                                            int i31111111111111111111111111111111 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i31111111111111111111111111111111) + i31111111111111111111111111111111 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 8:
                                            ((Boolean) value).getClass();
                                            iH3 = i34;
                                            int i31111111111111111111111111111112 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i31111111111111111111111111111112) + i31111111111111111111111111111112 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 9:
                                            iH3 = ((c0) ((a) value)).a(null);
                                            int i31111111111111111111111111111113 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i31111111111111111111111111111113) + i31111111111111111111111111111113 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 10:
                                            iA4 = ((c0) ((a) value)).a(null);
                                            iG3 = o.g0(iA4);
                                            iH3 = iA4 + iG3;
                                            int i31111111111111111111111111111114 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i31111111111111111111111111111114) + i31111111111111111111111111111114 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 11:
                                            if (value instanceof i) {
                                                iA4 = ((i) value).size();
                                                iG3 = o.g0(iA4);
                                                iH3 = iA4 + iG3;
                                            } else {
                                                iH3 = o.e0((String) value);
                                            }
                                            int i31111111111111111111111111111115 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i31111111111111111111111111111115) + i31111111111111111111111111111115 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 12:
                                            if (value instanceof i) {
                                                iA4 = ((i) value).size();
                                                iG3 = o.g0(iA4);
                                            } else {
                                                iA4 = ((byte[]) value).length;
                                                iG3 = o.g0(iA4);
                                            }
                                            iH3 = iA4 + iG3;
                                            int i31111111111111111111111111111116 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i31111111111111111111111111111116) + i31111111111111111111111111111116 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 13:
                                            iH3 = o.g0(((Integer) value).intValue());
                                            int i31111111111111111111111111111117 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i31111111111111111111111111111117) + i31111111111111111111111111111117 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iH3 = 4;
                                            int i31111111111111111111111111111118 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i31111111111111111111111111111118) + i31111111111111111111111111111118 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iH3 = 8;
                                            int i31111111111111111111111111111119 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i31111111111111111111111111111119) + i31111111111111111111111111111119 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 16:
                                            int iIntValue18 = ((Integer) value).intValue();
                                            iH3 = o.g0((iIntValue18 >> 31) ^ (iIntValue18 << 1));
                                            int i311111111111111111111111111111110 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i311111111111111111111111111111110) + i311111111111111111111111111111110 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 17:
                                            long jLongValue18 = ((Long) value).longValue();
                                            iH3 = o.h0((jLongValue18 << i34) ^ (jLongValue18 >> c12));
                                            int i311111111111111111111111111111111 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i311111111111111111111111111111111) + i311111111111111111111111111111111 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 18:
                                            iH3 = o.h0(((Integer) value).intValue());
                                            int i311111111111111111111111111111112 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i311111111111111111111111111111112) + i311111111111111111111111111111112 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 18:
                                    it = it;
                                    iH2 = o.h0(((Integer) key).intValue());
                                    i15 = iH2 + iF16;
                                    y1Var = m0Var.f1515b;
                                    iF10 = o.f0(2);
                                    if (y1Var == y1Var3) {
                                        iF10 *= 2;
                                    }
                                    switch (iArr2[y1Var.ordinal()]) {
                                        case 1:
                                            ((Double) value).getClass();
                                            iH3 = 8;
                                            int i311111111111111111111111111111113 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i311111111111111111111111111111113) + i311111111111111111111111111111113 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 2:
                                            ((Float) value).getClass();
                                            iH3 = 4;
                                            int i311111111111111111111111111111114 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i311111111111111111111111111111114) + i311111111111111111111111111111114 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 3:
                                            iH3 = o.h0(((Long) value).longValue());
                                            int i311111111111111111111111111111115 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i311111111111111111111111111111115) + i311111111111111111111111111111115 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 4:
                                            iH3 = o.h0(((Long) value).longValue());
                                            int i311111111111111111111111111111116 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i311111111111111111111111111111116) + i311111111111111111111111111111116 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 5:
                                            iH3 = o.h0(((Integer) value).intValue());
                                            int i311111111111111111111111111111117 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i311111111111111111111111111111117) + i311111111111111111111111111111117 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 6:
                                            ((Long) value).getClass();
                                            iH3 = 8;
                                            int i311111111111111111111111111111118 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i311111111111111111111111111111118) + i311111111111111111111111111111118 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 7:
                                            ((Integer) value).getClass();
                                            iH3 = 4;
                                            int i311111111111111111111111111111119 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i311111111111111111111111111111119) + i311111111111111111111111111111119 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 8:
                                            ((Boolean) value).getClass();
                                            iH3 = i34;
                                            int i3111111111111111111111111111111110 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i3111111111111111111111111111111110) + i3111111111111111111111111111111110 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 9:
                                            iH3 = ((c0) ((a) value)).a(null);
                                            int i3111111111111111111111111111111111 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i3111111111111111111111111111111111) + i3111111111111111111111111111111111 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 10:
                                            iA4 = ((c0) ((a) value)).a(null);
                                            iG3 = o.g0(iA4);
                                            iH3 = iA4 + iG3;
                                            int i3111111111111111111111111111111112 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i3111111111111111111111111111111112) + i3111111111111111111111111111111112 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 11:
                                            if (value instanceof i) {
                                                iA4 = ((i) value).size();
                                                iG3 = o.g0(iA4);
                                                iH3 = iA4 + iG3;
                                            } else {
                                                iH3 = o.e0((String) value);
                                            }
                                            int i3111111111111111111111111111111113 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i3111111111111111111111111111111113) + i3111111111111111111111111111111113 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 12:
                                            if (value instanceof i) {
                                                iA4 = ((i) value).size();
                                                iG3 = o.g0(iA4);
                                            } else {
                                                iA4 = ((byte[]) value).length;
                                                iG3 = o.g0(iA4);
                                            }
                                            iH3 = iA4 + iG3;
                                            int i3111111111111111111111111111111114 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i3111111111111111111111111111111114) + i3111111111111111111111111111111114 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 13:
                                            iH3 = o.g0(((Integer) value).intValue());
                                            int i3111111111111111111111111111111115 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i3111111111111111111111111111111115) + i3111111111111111111111111111111115 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iH3 = 4;
                                            int i3111111111111111111111111111111116 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i3111111111111111111111111111111116) + i3111111111111111111111111111111116 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iH3 = 8;
                                            int i3111111111111111111111111111111117 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i3111111111111111111111111111111117) + i3111111111111111111111111111111117 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 16:
                                            int iIntValue19 = ((Integer) value).intValue();
                                            iH3 = o.g0((iIntValue19 >> 31) ^ (iIntValue19 << 1));
                                            int i3111111111111111111111111111111118 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i3111111111111111111111111111111118) + i3111111111111111111111111111111118 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 17:
                                            long jLongValue19 = ((Long) value).longValue();
                                            iH3 = o.h0((jLongValue19 << i34) ^ (jLongValue19 >> c12));
                                            int i3111111111111111111111111111111119 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i3111111111111111111111111111111119) + i3111111111111111111111111111111119 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        case 18:
                                            iH3 = o.h0(((Integer) value).intValue());
                                            int i31111111111111111111111111111111110 = iH3 + iF10 + i15;
                                            iG1 += o.g0(i31111111111111111111111111111111110) + i31111111111111111111111111111111110 + iF15;
                                            it = it;
                                            c11 = c12;
                                            i24 = i34;
                                            i17 = i35;
                                            i19 = i36;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                default:
                                    throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                            }
                        }
                    }
                    i12 = i17;
                    i13 = i19;
                    iD1 += iG1;
                    i17 = i12;
                    i19 = i13;
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case 51:
                    if (t0Var.q(i21, i18, c0Var2)) {
                        iF0 = o.f0(i21);
                        iA = iF0 + 8;
                        iD1 += iA;
                    }
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case 52:
                    if (t0Var.q(i21, i18, c0Var2)) {
                        iF11 = o.f0(i21);
                        iA = iF11 + 4;
                        iD1 += iA;
                    }
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case 53:
                    if (t0Var.q(i21, i18, c0Var2)) {
                        long jZ = z(j11, c0Var2);
                        iF12 = o.f0(i21);
                        iH4 = o.h0(jZ);
                        iG4 = iH4 + iF12;
                        iD1 += iG4;
                    }
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case 54:
                    if (t0Var.q(i21, i18, c0Var2)) {
                        long jZ2 = z(j11, c0Var2);
                        iF12 = o.f0(i21);
                        iH4 = o.h0(jZ2);
                        iG4 = iH4 + iF12;
                        iD1 += iG4;
                    }
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case 55:
                    if (t0Var.q(i21, i18, c0Var2)) {
                        int iY = y(j11, c0Var2);
                        iF13 = o.f0(i21);
                        iH5 = o.h0(iY);
                        iA = iH5 + iF13;
                        iD1 += iA;
                    }
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case 56:
                    if (t0Var.q(i21, i18, c0Var2)) {
                        iF0 = o.f0(i21);
                        iA = iF0 + 8;
                        iD1 += iA;
                    }
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case 57:
                    if (t0Var.q(i21, i18, c0Var2)) {
                        iF11 = o.f0(i21);
                        iA = iF11 + 4;
                        iD1 += iA;
                    }
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case 58:
                    if (t0Var.q(i21, i18, c0Var2)) {
                        iA = o.f0(i21) + 1;
                        iD1 += iA;
                    }
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case 59:
                    if (t0Var.q(i21, i18, c0Var2)) {
                        Object object4 = unsafe.getObject(c0Var2, j11);
                        iD1 = (object4 instanceof i ? o.d0(i21, (i) object4) : o.e0((String) object4) + o.f0(i21)) + iD1;
                    }
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case 60:
                    if (t0Var.q(i21, i18, c0Var2)) {
                        Object object5 = unsafe.getObject(c0Var2, j11);
                        d1 d1VarM4 = t0Var.m(i18);
                        Class cls21 = e1.f1465a;
                        int iF17 = o.f0(i21);
                        int iA8 = ((a) object5).a(d1VarM4);
                        iG4 = o.g0(iA8) + iA8 + iF17;
                        iD1 += iG4;
                    }
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case 61:
                    if (t0Var.q(i21, i18, c0Var2)) {
                        iA = o.d0(i21, (i) unsafe.getObject(c0Var2, j11));
                        iD1 += iA;
                    }
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case 62:
                    if (t0Var.q(i21, i18, c0Var2)) {
                        int iY2 = y(j11, c0Var2);
                        iF13 = o.f0(i21);
                        iH5 = o.g0(iY2);
                        iA = iH5 + iF13;
                        iD1 += iA;
                    }
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case 63:
                    if (t0Var.q(i21, i18, c0Var2)) {
                        int iY3 = y(j11, c0Var2);
                        iF13 = o.f0(i21);
                        iH5 = o.h0(iY3);
                        iA = iH5 + iF13;
                        iD1 += iA;
                    }
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case 64:
                    if (t0Var.q(i21, i18, c0Var2)) {
                        iF11 = o.f0(i21);
                        iA = iF11 + 4;
                        iD1 += iA;
                    }
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case 65:
                    if (t0Var.q(i21, i18, c0Var2)) {
                        iF0 = o.f0(i21);
                        iA = iF0 + 8;
                        iD1 += iA;
                    }
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case 66:
                    if (t0Var.q(i21, i18, c0Var2)) {
                        int iY4 = y(j11, c0Var2);
                        iF13 = o.f0(i21);
                        iH5 = o.g0((iY4 >> 31) ^ (iY4 << 1));
                        iA = iH5 + iF13;
                        iD1 += iA;
                    }
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case 67:
                    if (t0Var.q(i21, i18, c0Var2)) {
                        long jZ3 = z(j11, c0Var2);
                        iF12 = o.f0(i21);
                        iH4 = o.h0((jZ3 << 1) ^ (jZ3 >> 63));
                        iG4 = iH4 + iF12;
                        iD1 += iG4;
                    }
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case 68:
                    if (t0Var.q(i21, i18, c0Var2)) {
                        iA = ((a) unsafe.getObject(c0Var2, j11)).a(t0Var.m(i18)) + (o.f0(i21) * 2);
                        iD1 += iA;
                    }
                    i18 += 3;
                    i16 = 1048575;
                    break;
                default:
                    i18 += 3;
                    i16 = 1048575;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00e1 A[PHI: r3
      0x00e1: PHI (r3v32 int) = (r3v10 int), (r3v33 int) binds: [B:83:0x0216, B:41:0x00df] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.datastore.preferences.protobuf.d1
    public final int g(c0 c0Var) {
        int i11;
        int iB;
        int i12;
        int[] iArr = this.f1554a;
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
                    iB = e0.b(Double.doubleToLongBits(q1.f1541c.d(j11, c0Var)));
                    i13 = iB + i11;
                    break;
                case 1:
                    i11 = i13 * 53;
                    iB = Float.floatToIntBits(q1.f1541c.e(j11, c0Var));
                    i13 = iB + i11;
                    break;
                case 2:
                    i11 = i13 * 53;
                    iB = e0.b(q1.f1541c.g(j11, c0Var));
                    i13 = iB + i11;
                    break;
                case 3:
                    i11 = i13 * 53;
                    iB = e0.b(q1.f1541c.g(j11, c0Var));
                    i13 = iB + i11;
                    break;
                case 4:
                    i11 = i13 * 53;
                    iB = q1.f1541c.f(j11, c0Var);
                    i13 = iB + i11;
                    break;
                case 5:
                    i11 = i13 * 53;
                    iB = e0.b(q1.f1541c.g(j11, c0Var));
                    i13 = iB + i11;
                    break;
                case 6:
                    i11 = i13 * 53;
                    iB = q1.f1541c.f(j11, c0Var);
                    i13 = iB + i11;
                    break;
                case 7:
                    i12 = i13 * 53;
                    boolean zC = q1.f1541c.c(j11, c0Var);
                    Charset charset = e0.f1463a;
                    if (zC) {
                        i16 = 1231;
                    }
                    i13 = i16 + i12;
                    break;
                case 8:
                    i11 = i13 * 53;
                    iB = ((String) q1.f1541c.h(j11, c0Var)).hashCode();
                    i13 = iB + i11;
                    break;
                case 9:
                    Object objH = q1.f1541c.h(j11, c0Var);
                    if (objH != null) {
                        iHashCode = objH.hashCode();
                    }
                    i13 = (i13 * 53) + iHashCode;
                    break;
                case 10:
                    i11 = i13 * 53;
                    iB = q1.f1541c.h(j11, c0Var).hashCode();
                    i13 = iB + i11;
                    break;
                case 11:
                    i11 = i13 * 53;
                    iB = q1.f1541c.f(j11, c0Var);
                    i13 = iB + i11;
                    break;
                case 12:
                    i11 = i13 * 53;
                    iB = q1.f1541c.f(j11, c0Var);
                    i13 = iB + i11;
                    break;
                case 13:
                    i11 = i13 * 53;
                    iB = q1.f1541c.f(j11, c0Var);
                    i13 = iB + i11;
                    break;
                case 14:
                    i11 = i13 * 53;
                    iB = e0.b(q1.f1541c.g(j11, c0Var));
                    i13 = iB + i11;
                    break;
                case 15:
                    i11 = i13 * 53;
                    iB = q1.f1541c.f(j11, c0Var);
                    i13 = iB + i11;
                    break;
                case 16:
                    i11 = i13 * 53;
                    iB = e0.b(q1.f1541c.g(j11, c0Var));
                    i13 = iB + i11;
                    break;
                case 17:
                    Object objH2 = q1.f1541c.h(j11, c0Var);
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
                    iB = q1.f1541c.h(j11, c0Var).hashCode();
                    i13 = iB + i11;
                    break;
                case 50:
                    i11 = i13 * 53;
                    iB = q1.f1541c.h(j11, c0Var).hashCode();
                    i13 = iB + i11;
                    break;
                case 51:
                    if (q(i15, i14, c0Var)) {
                        i11 = i13 * 53;
                        iB = e0.b(Double.doubleToLongBits(((Double) q1.f1541c.h(j11, c0Var)).doubleValue()));
                        i13 = iB + i11;
                    }
                    break;
                case 52:
                    if (q(i15, i14, c0Var)) {
                        i11 = i13 * 53;
                        iB = Float.floatToIntBits(((Float) q1.f1541c.h(j11, c0Var)).floatValue());
                        i13 = iB + i11;
                    }
                    break;
                case 53:
                    if (q(i15, i14, c0Var)) {
                        i11 = i13 * 53;
                        iB = e0.b(z(j11, c0Var));
                        i13 = iB + i11;
                    }
                    break;
                case 54:
                    if (q(i15, i14, c0Var)) {
                        i11 = i13 * 53;
                        iB = e0.b(z(j11, c0Var));
                        i13 = iB + i11;
                    }
                    break;
                case 55:
                    if (q(i15, i14, c0Var)) {
                        i11 = i13 * 53;
                        iB = y(j11, c0Var);
                        i13 = iB + i11;
                    }
                    break;
                case 56:
                    if (q(i15, i14, c0Var)) {
                        i11 = i13 * 53;
                        iB = e0.b(z(j11, c0Var));
                        i13 = iB + i11;
                    }
                    break;
                case 57:
                    if (q(i15, i14, c0Var)) {
                        i11 = i13 * 53;
                        iB = y(j11, c0Var);
                        i13 = iB + i11;
                    }
                    break;
                case 58:
                    if (q(i15, i14, c0Var)) {
                        i12 = i13 * 53;
                        boolean zBooleanValue = ((Boolean) q1.f1541c.h(j11, c0Var)).booleanValue();
                        Charset charset2 = e0.f1463a;
                        if (zBooleanValue) {
                            i16 = 1231;
                        }
                        i13 = i16 + i12;
                    }
                    break;
                case 59:
                    if (q(i15, i14, c0Var)) {
                        i11 = i13 * 53;
                        iB = ((String) q1.f1541c.h(j11, c0Var)).hashCode();
                        i13 = iB + i11;
                    }
                    break;
                case 60:
                    if (q(i15, i14, c0Var)) {
                        i11 = i13 * 53;
                        iB = q1.f1541c.h(j11, c0Var).hashCode();
                        i13 = iB + i11;
                    }
                    break;
                case 61:
                    if (q(i15, i14, c0Var)) {
                        i11 = i13 * 53;
                        iB = q1.f1541c.h(j11, c0Var).hashCode();
                        i13 = iB + i11;
                    }
                    break;
                case 62:
                    if (q(i15, i14, c0Var)) {
                        i11 = i13 * 53;
                        iB = y(j11, c0Var);
                        i13 = iB + i11;
                    }
                    break;
                case 63:
                    if (q(i15, i14, c0Var)) {
                        i11 = i13 * 53;
                        iB = y(j11, c0Var);
                        i13 = iB + i11;
                    }
                    break;
                case 64:
                    if (q(i15, i14, c0Var)) {
                        i11 = i13 * 53;
                        iB = y(j11, c0Var);
                        i13 = iB + i11;
                    }
                    break;
                case 65:
                    if (q(i15, i14, c0Var)) {
                        i11 = i13 * 53;
                        iB = e0.b(z(j11, c0Var));
                        i13 = iB + i11;
                    }
                    break;
                case 66:
                    if (q(i15, i14, c0Var)) {
                        i11 = i13 * 53;
                        iB = y(j11, c0Var);
                        i13 = iB + i11;
                    }
                    break;
                case 67:
                    if (q(i15, i14, c0Var)) {
                        i11 = i13 * 53;
                        iB = e0.b(z(j11, c0Var));
                        i13 = iB + i11;
                    }
                    break;
                case 68:
                    if (q(i15, i14, c0Var)) {
                        i11 = i13 * 53;
                        iB = q1.f1541c.h(j11, c0Var).hashCode();
                        i13 = iB + i11;
                    }
                    break;
            }
        }
        ((l1) this.f1565l).getClass();
        return c0Var.unknownFields.hashCode() + (i13 * 53);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003d  */
    @Override // androidx.datastore.preferences.protobuf.d1
    public final boolean h(c0 c0Var, c0 c0Var2) {
        int[] iArr = this.f1554a;
        int length = iArr.length;
        int i11 = 0;
        while (true) {
            boolean zL = true;
            if (i11 < length) {
                int iL = L(i11);
                long j11 = iL & 1048575;
                switch (K(iL)) {
                    case 0:
                        if (!j(c0Var, c0Var2, i11)) {
                            zL = false;
                        } else {
                            p1 p1Var = q1.f1541c;
                            if (Double.doubleToLongBits(p1Var.d(j11, c0Var)) != Double.doubleToLongBits(p1Var.d(j11, c0Var2))) {
                                zL = false;
                            }
                        }
                        break;
                    case 1:
                        if (!j(c0Var, c0Var2, i11)) {
                            zL = false;
                        } else {
                            p1 p1Var2 = q1.f1541c;
                            if (Float.floatToIntBits(p1Var2.e(j11, c0Var)) != Float.floatToIntBits(p1Var2.e(j11, c0Var2))) {
                                zL = false;
                            }
                        }
                        break;
                    case 2:
                        if (!j(c0Var, c0Var2, i11)) {
                            zL = false;
                        } else {
                            p1 p1Var3 = q1.f1541c;
                            if (p1Var3.g(j11, c0Var) != p1Var3.g(j11, c0Var2)) {
                                zL = false;
                            }
                        }
                        break;
                    case 3:
                        if (!j(c0Var, c0Var2, i11)) {
                            zL = false;
                        } else {
                            p1 p1Var4 = q1.f1541c;
                            if (p1Var4.g(j11, c0Var) != p1Var4.g(j11, c0Var2)) {
                                zL = false;
                            }
                        }
                        break;
                    case 4:
                        if (!j(c0Var, c0Var2, i11)) {
                            zL = false;
                        } else {
                            p1 p1Var5 = q1.f1541c;
                            if (p1Var5.f(j11, c0Var) != p1Var5.f(j11, c0Var2)) {
                                zL = false;
                            }
                        }
                        break;
                    case 5:
                        if (!j(c0Var, c0Var2, i11)) {
                            zL = false;
                        } else {
                            p1 p1Var6 = q1.f1541c;
                            if (p1Var6.g(j11, c0Var) != p1Var6.g(j11, c0Var2)) {
                                zL = false;
                            }
                        }
                        break;
                    case 6:
                        if (!j(c0Var, c0Var2, i11)) {
                            zL = false;
                        } else {
                            p1 p1Var7 = q1.f1541c;
                            if (p1Var7.f(j11, c0Var) != p1Var7.f(j11, c0Var2)) {
                                zL = false;
                            }
                        }
                        break;
                    case 7:
                        if (!j(c0Var, c0Var2, i11)) {
                            zL = false;
                        } else {
                            p1 p1Var8 = q1.f1541c;
                            if (p1Var8.c(j11, c0Var) != p1Var8.c(j11, c0Var2)) {
                                zL = false;
                            }
                        }
                        break;
                    case 8:
                        if (!j(c0Var, c0Var2, i11)) {
                            zL = false;
                        } else {
                            p1 p1Var9 = q1.f1541c;
                            if (!e1.l(p1Var9.h(j11, c0Var), p1Var9.h(j11, c0Var2))) {
                                zL = false;
                            }
                        }
                        break;
                    case 9:
                        if (!j(c0Var, c0Var2, i11)) {
                            zL = false;
                        } else {
                            p1 p1Var10 = q1.f1541c;
                            if (!e1.l(p1Var10.h(j11, c0Var), p1Var10.h(j11, c0Var2))) {
                                zL = false;
                            }
                        }
                        break;
                    case 10:
                        if (!j(c0Var, c0Var2, i11)) {
                            zL = false;
                        } else {
                            p1 p1Var11 = q1.f1541c;
                            if (!e1.l(p1Var11.h(j11, c0Var), p1Var11.h(j11, c0Var2))) {
                                zL = false;
                            }
                        }
                        break;
                    case 11:
                        if (!j(c0Var, c0Var2, i11)) {
                            zL = false;
                        } else {
                            p1 p1Var12 = q1.f1541c;
                            if (p1Var12.f(j11, c0Var) != p1Var12.f(j11, c0Var2)) {
                                zL = false;
                            }
                        }
                        break;
                    case 12:
                        if (!j(c0Var, c0Var2, i11)) {
                            zL = false;
                        } else {
                            p1 p1Var13 = q1.f1541c;
                            if (p1Var13.f(j11, c0Var) != p1Var13.f(j11, c0Var2)) {
                                zL = false;
                            }
                        }
                        break;
                    case 13:
                        if (!j(c0Var, c0Var2, i11)) {
                            zL = false;
                        } else {
                            p1 p1Var14 = q1.f1541c;
                            if (p1Var14.f(j11, c0Var) != p1Var14.f(j11, c0Var2)) {
                                zL = false;
                            }
                        }
                        break;
                    case 14:
                        if (!j(c0Var, c0Var2, i11)) {
                            zL = false;
                        } else {
                            p1 p1Var15 = q1.f1541c;
                            if (p1Var15.g(j11, c0Var) != p1Var15.g(j11, c0Var2)) {
                                zL = false;
                            }
                        }
                        break;
                    case 15:
                        if (!j(c0Var, c0Var2, i11)) {
                            zL = false;
                        } else {
                            p1 p1Var16 = q1.f1541c;
                            if (p1Var16.f(j11, c0Var) != p1Var16.f(j11, c0Var2)) {
                                zL = false;
                            }
                        }
                        break;
                    case 16:
                        if (!j(c0Var, c0Var2, i11)) {
                            zL = false;
                        } else {
                            p1 p1Var17 = q1.f1541c;
                            if (p1Var17.g(j11, c0Var) != p1Var17.g(j11, c0Var2)) {
                                zL = false;
                            }
                        }
                        break;
                    case 17:
                        if (!j(c0Var, c0Var2, i11)) {
                            zL = false;
                        } else {
                            p1 p1Var18 = q1.f1541c;
                            if (!e1.l(p1Var18.h(j11, c0Var), p1Var18.h(j11, c0Var2))) {
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
                        p1 p1Var19 = q1.f1541c;
                        zL = e1.l(p1Var19.h(j11, c0Var), p1Var19.h(j11, c0Var2));
                        break;
                    case 50:
                        p1 p1Var20 = q1.f1541c;
                        zL = e1.l(p1Var20.h(j11, c0Var), p1Var20.h(j11, c0Var2));
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
                        p1 p1Var21 = q1.f1541c;
                        if (p1Var21.f(j12, c0Var) != p1Var21.f(j12, c0Var2) || !e1.l(p1Var21.h(j11, c0Var), p1Var21.h(j11, c0Var2))) {
                            zL = false;
                        }
                        break;
                }
                if (zL) {
                    i11 += 3;
                }
            } else {
                l1 l1Var = (l1) this.f1565l;
                l1Var.getClass();
                k1 k1Var = c0Var.unknownFields;
                l1Var.getClass();
                if (k1Var.equals(c0Var2.unknownFields)) {
                    return true;
                }
            }
        }
        return false;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 18741. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // androidx.datastore.preferences.protobuf.d1
    public final void i(java.lang.Object r19, androidx.datastore.preferences.protobuf.n r20, androidx.datastore.preferences.protobuf.q r21) {
        /*
            Method dump skipped, instruction units count: 1874
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.t0.i(java.lang.Object, androidx.datastore.preferences.protobuf.n, androidx.datastore.preferences.protobuf.q):void");
    }

    public final boolean j(c0 c0Var, c0 c0Var2, int i11) {
        return n(i11, c0Var) == n(i11, c0Var2);
    }

    public final void k(int i11, Object obj, Object obj2) {
        int i12 = this.f1554a[i11];
        if (q1.f1541c.h(L(i11) & 1048575, obj) == null) {
            return;
        }
        l(i11);
    }

    public final void l(int i11) {
        if (this.f1555b[defpackage.e.c(i11, 3, 2, 1)] != null) {
            throw new ClassCastException();
        }
    }

    public final d1 m(int i11) {
        int i12 = (i11 / 3) * 2;
        Object[] objArr = this.f1555b;
        d1 d1Var = (d1) objArr[i12];
        if (d1Var != null) {
            return d1Var;
        }
        d1 d1VarA = a1.f1445c.a((Class) objArr[i12 + 1]);
        objArr[i12] = d1VarA;
        return d1VarA;
    }

    public final boolean n(int i11, Object obj) {
        int i12 = this.f1554a[i11 + 2];
        long j11 = i12 & 1048575;
        if (j11 == 1048575) {
            int iL = L(i11);
            long j12 = iL & 1048575;
            switch (K(iL)) {
                case 0:
                    if (Double.doubleToRawLongBits(q1.f1541c.d(j12, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(q1.f1541c.e(j12, obj)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (q1.f1541c.g(j12, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (q1.f1541c.g(j12, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (q1.f1541c.f(j12, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (q1.f1541c.g(j12, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (q1.f1541c.f(j12, obj) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return q1.f1541c.c(j12, obj);
                case 8:
                    Object objH = q1.f1541c.h(j12, obj);
                    if (objH instanceof String) {
                        return !((String) objH).isEmpty();
                    }
                    if (objH instanceof i) {
                        return !i.f1484b.equals(objH);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (q1.f1541c.h(j12, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    return !i.f1484b.equals(q1.f1541c.h(j12, obj));
                case 11:
                    if (q1.f1541c.f(j12, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (q1.f1541c.f(j12, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (q1.f1541c.f(j12, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (q1.f1541c.g(j12, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (q1.f1541c.f(j12, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (q1.f1541c.g(j12, obj) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (q1.f1541c.h(j12, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i12 >>> 20)) & q1.f1541c.f(j11, obj)) == 0) {
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
        return q1.f1541c.f((long) (this.f1554a[i12 + 2] & 1048575), obj) == i11;
    }

    public final void r(Object obj, int i11, Object obj2, q qVar, n nVar) throws InvalidProtocolBufferException.InvalidWireTypeException {
        long jL = L(i11) & 1048575;
        Object objH = q1.f1541c.h(jL, obj);
        p0 p0Var = this.m;
        if (objH == null) {
            p0Var.getClass();
            objH = o0.f1530b.c();
            q1.o(obj, jL, objH);
        } else {
            p0Var.getClass();
            if (!((o0) objH).f1531a) {
                o0 o0VarC = o0.f1530b.c();
                p0.a(o0VarC, objH);
                q1.o(obj, jL, o0VarC);
                objH = o0VarC;
            }
        }
        p0Var.getClass();
        o0 o0Var = (o0) objH;
        m0 m0Var = ((n0) obj2).f1521a;
        nVar.w(2);
        l lVar = nVar.f1517a;
        int iJ = lVar.j(lVar.B());
        Object obj3 = m0Var.f1516c;
        Object objI = BuildConfig.VERSION_NAME;
        Object objI2 = obj3;
        while (true) {
            try {
                int iA = nVar.a();
                if (iA == Integer.MAX_VALUE || lVar.c()) {
                    break;
                }
                if (iA == 1) {
                    objI = nVar.i(m0Var.f1514a, null, null);
                } else if (iA != 2) {
                    try {
                        if (!nVar.x()) {
                            throw new InvalidProtocolBufferException("Unable to parse map entry.");
                        }
                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused) {
                        if (!nVar.x()) {
                            throw new InvalidProtocolBufferException("Unable to parse map entry.");
                        }
                    }
                } else {
                    objI2 = nVar.i(m0Var.f1515b, obj3.getClass(), qVar);
                }
            } catch (Throwable th2) {
                lVar.i(iJ);
                throw th2;
            }
        }
        o0Var.put(objI, objI2);
        lVar.i(iJ);
    }

    public final void s(int i11, Object obj, Object obj2) {
        if (n(i11, obj2)) {
            long jL = L(i11) & 1048575;
            Unsafe unsafe = f1553o;
            Object object = unsafe.getObject(obj2, jL);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f1554a[i11] + " is present but null: " + obj2);
            }
            d1 d1VarM = m(i11);
            if (!n(i11, obj)) {
                if (p(object)) {
                    c0 c0VarD = d1VarM.d();
                    d1VarM.a(c0VarD, object);
                    unsafe.putObject(obj, jL, c0VarD);
                } else {
                    unsafe.putObject(obj, jL, object);
                }
                G(i11, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jL);
            if (!p(object2)) {
                c0 c0VarD2 = d1VarM.d();
                d1VarM.a(c0VarD2, object2);
                unsafe.putObject(obj, jL, c0VarD2);
                object2 = c0VarD2;
            }
            d1VarM.a(object2, object);
        }
    }

    public final void t(int i11, Object obj, Object obj2) {
        int[] iArr = this.f1554a;
        int i12 = iArr[i11];
        if (q(i12, i11, obj2)) {
            long jL = L(i11) & 1048575;
            Unsafe unsafe = f1553o;
            Object object = unsafe.getObject(obj2, jL);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i11] + " is present but null: " + obj2);
            }
            d1 d1VarM = m(i11);
            if (!q(i12, i11, obj)) {
                if (p(object)) {
                    c0 c0VarD = d1VarM.d();
                    d1VarM.a(c0VarD, object);
                    unsafe.putObject(obj, jL, c0VarD);
                } else {
                    unsafe.putObject(obj, jL, object);
                }
                H(i12, i11, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jL);
            if (!p(object2)) {
                c0 c0VarD2 = d1VarM.d();
                d1VarM.a(c0VarD2, object2);
                unsafe.putObject(obj, jL, c0VarD2);
                object2 = c0VarD2;
            }
            d1VarM.a(object2, object);
        }
    }

    public final Object u(int i11, Object obj) {
        d1 d1VarM = m(i11);
        long jL = L(i11) & 1048575;
        if (!n(i11, obj)) {
            return d1VarM.d();
        }
        Object object = f1553o.getObject(obj, jL);
        if (p(object)) {
            return object;
        }
        c0 c0VarD = d1VarM.d();
        if (object != null) {
            d1VarM.a(c0VarD, object);
        }
        return c0VarD;
    }

    public final Object v(int i11, int i12, Object obj) {
        d1 d1VarM = m(i12);
        if (!q(i11, i12, obj)) {
            return d1VarM.d();
        }
        Object object = f1553o.getObject(obj, L(i12) & 1048575);
        if (p(object)) {
            return object;
        }
        c0 c0VarD = d1VarM.d();
        if (object != null) {
            d1VarM.a(c0VarD, object);
        }
        return c0VarD;
    }
}
