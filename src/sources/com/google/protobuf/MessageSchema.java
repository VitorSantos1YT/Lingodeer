package com.google.protobuf;

import com.google.android.material.datepicker.d;
import com.google.api.Service;
import com.stkouyu.util.httputil.Consts;
import defpackage.e;
import hh.p0;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@CheckReturnValue
final class MessageSchema<T> implements Schema<T> {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int[] f21322p = new int[0];

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Unsafe f21323q = UnsafeUtil.k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f21324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f21325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f21326c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f21327d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final MessageLite f21328e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f21329f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f21330g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int[] f21331h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f21332i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f21333j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final NewInstanceSchema f21334k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ListFieldSchema f21335l;
    public final UnknownFieldSchema m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ExtensionSchema f21336n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final MapFieldSchema f21337o;

    /* JADX INFO: renamed from: com.google.protobuf.MessageSchema$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21338a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f21338a = iArr;
            try {
                iArr[WireFormat.FieldType.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21338a[WireFormat.FieldType.BYTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21338a[WireFormat.FieldType.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21338a[WireFormat.FieldType.FIXED32.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21338a[WireFormat.FieldType.SFIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21338a[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21338a[WireFormat.FieldType.SFIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f21338a[WireFormat.FieldType.FLOAT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f21338a[WireFormat.FieldType.ENUM.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f21338a[WireFormat.FieldType.INT32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f21338a[WireFormat.FieldType.UINT32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f21338a[WireFormat.FieldType.INT64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f21338a[WireFormat.FieldType.UINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f21338a[WireFormat.FieldType.MESSAGE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f21338a[WireFormat.FieldType.SINT32.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f21338a[WireFormat.FieldType.SINT64.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f21338a[WireFormat.FieldType.STRING.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public MessageSchema(int[] iArr, Object[] objArr, int i11, int i12, MessageLite messageLite, int[] iArr2, int i13, int i14, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema unknownFieldSchema, ExtensionSchema extensionSchema, MapFieldSchema mapFieldSchema) {
        this.f21324a = iArr;
        this.f21325b = objArr;
        this.f21326c = i11;
        this.f21327d = i12;
        this.f21330g = messageLite instanceof GeneratedMessageLite;
        this.f21329f = extensionSchema != null && extensionSchema.e(messageLite);
        this.f21331h = iArr2;
        this.f21332i = i13;
        this.f21333j = i14;
        this.f21334k = newInstanceSchema;
        this.f21335l = listFieldSchema;
        this.m = unknownFieldSchema;
        this.f21336n = extensionSchema;
        this.f21328e = messageLite;
        this.f21337o = mapFieldSchema;
    }

    public static long A(int i11) {
        return i11 & 1048575;
    }

    public static int B(long j11, Object obj) {
        return ((Integer) UnsafeUtil.f21417c.m(j11, obj)).intValue();
    }

    public static long C(long j11, Object obj) {
        return ((Long) UnsafeUtil.f21417c.m(j11, obj)).longValue();
    }

    public static java.lang.reflect.Field E(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            java.lang.reflect.Field[] declaredFields = cls.getDeclaredFields();
            for (java.lang.reflect.Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder sbQ = p0.q("Field ", str, " for ");
            sbQ.append(cls.getName());
            sbQ.append(" not found. Known fields are ");
            sbQ.append(Arrays.toString(declaredFields));
            throw new RuntimeException(sbQ.toString());
        }
    }

    public static int J(int i11) {
        return (i11 & 267386880) >>> 20;
    }

    public static void M(int i11, Object obj, Writer writer) {
        if (obj instanceof String) {
            writer.n(i11, (String) obj);
        } else {
            writer.w(i11, (ByteString) obj);
        }
    }

    public static void k(Object obj) {
        if (!r(obj)) {
            throw new IllegalArgumentException(p0.k(obj, "Mutating immutable message: "));
        }
    }

    public static boolean r(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof GeneratedMessageLite) {
            return ((GeneratedMessageLite) obj).x();
        }
        return true;
    }

    public static MessageSchema y(MessageInfo messageInfo, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema unknownFieldSchema, ExtensionSchema extensionSchema, MapFieldSchema mapFieldSchema) {
        if (messageInfo instanceof RawMessageInfo) {
            return z((RawMessageInfo) messageInfo, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:166:0x0362  */
    /* JADX WARN: Code duplicated, block: B:181:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:184:0x03c3  */
    public static MessageSchema z(RawMessageInfo rawMessageInfo, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema unknownFieldSchema, ExtensionSchema extensionSchema, MapFieldSchema mapFieldSchema) {
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
        java.lang.reflect.Field fieldE;
        int i33;
        char cCharAt9;
        int i34;
        java.lang.reflect.Field fieldE2;
        java.lang.reflect.Field fieldE3;
        int i35;
        char cCharAt10;
        int i36;
        char cCharAt11;
        int i37;
        int i38;
        char cCharAt12;
        int i39;
        char cCharAt13;
        String str = rawMessageInfo.f21356b;
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
            iArr = f21322p;
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
        Unsafe unsafe = f21323q;
        Object[] objArr2 = rawMessageInfo.f21357c;
        Class<?> cls = rawMessageInfo.f21355a.getClass();
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
                    objArr3[e.c(i73, 3, 2, 1)] = objArr[i16];
                    i16++;
                } else if (i90 == 12 && (rawMessageInfo.c().equals(ProtoSyntax.PROTO2) || (iCharAt11 & 2048) != 0)) {
                    objArr3[e.c(i73, 3, 2, 1)] = objArr[i16];
                    i16++;
                }
                int i92 = i91 * 2;
                Object obj = objArr[i92];
                if (obj instanceof java.lang.reflect.Field) {
                    fieldE2 = (java.lang.reflect.Field) obj;
                } else {
                    fieldE2 = E(cls, (String) obj);
                    objArr[i92] = fieldE2;
                }
                int i93 = i70;
                i30 = i16;
                int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldE2);
                int i94 = i92 + 1;
                Object obj2 = objArr[i94];
                if (obj2 instanceof java.lang.reflect.Field) {
                    fieldE3 = (java.lang.reflect.Field) obj2;
                } else {
                    fieldE3 = E(cls, (String) obj2);
                    objArr[i94] = fieldE3;
                }
                int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldE3);
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
                java.lang.reflect.Field fieldE4 = E(cls, (String) objArr[i16]);
                if (i85 == 9 || i85 == 17) {
                    i29 = i95;
                    objArr3[e.c(i73, 3, 2, 1)] = fieldE4.getType();
                } else {
                    if (i85 == 27 || i85 == 49) {
                        i29 = i95;
                        i34 = i16 + 2;
                        objArr3[e.c(i73, 3, 2, 1)] = objArr[i96];
                    } else if (i85 == 12 || i85 == 30 || i85 == 44) {
                        i29 = i95;
                        if (rawMessageInfo.c() == ProtoSyntax.PROTO2 || (iCharAt11 & 2048) != 0) {
                            i34 = i16 + 2;
                            objArr3[e.c(i73, 3, 2, 1)] = objArr[i96];
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
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldE4);
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
                            if (obj3 instanceof java.lang.reflect.Field) {
                                fieldE = (java.lang.reflect.Field) obj3;
                            } else {
                                fieldE = E(cls, (String) obj3);
                                objArr[i102] = fieldE;
                            }
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldE);
                            i32 = iCharAt13 % 32;
                        }
                        if (i85 >= 18 && i85 <= 49) {
                            iArr[i71] = iObjectFieldOffset;
                            i71++;
                        }
                    }
                    i30 = i34;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldE4);
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
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldE4);
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
        MessageLite messageLite = rawMessageInfo.f21355a;
        rawMessageInfo.c();
        return new MessageSchema(iArr3, objArr3, i12, i15, messageLite, iArr, i17, i70, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
    }

    public final void D(int i11, Reader reader, Object obj) {
        if ((536870912 & i11) != 0) {
            UnsafeUtil.r(obj, i11 & 1048575, reader.O());
        } else if (this.f21330g) {
            UnsafeUtil.r(obj, i11 & 1048575, reader.z());
        } else {
            UnsafeUtil.r(obj, i11 & 1048575, reader.G());
        }
    }

    public final void F(int i11, Object obj) {
        int i12 = this.f21324a[i11 + 2];
        long j11 = 1048575 & i12;
        if (j11 == 1048575) {
            return;
        }
        UnsafeUtil.p(j11, obj, (1 << (i12 >>> 20)) | UnsafeUtil.f21417c.j(j11, obj));
    }

    public final void G(int i11, int i12, Object obj) {
        UnsafeUtil.p(this.f21324a[i12 + 2] & 1048575, obj, i11);
    }

    public final void H(int i11, Object obj, Object obj2) {
        f21323q.putObject(obj, K(i11) & 1048575, obj2);
        F(i11, obj);
    }

    public final void I(Object obj, int i11, int i12, Object obj2) {
        f21323q.putObject(obj, K(i12) & 1048575, obj2);
        G(i11, i12, obj);
    }

    public final int K(int i11) {
        return this.f21324a[i11 + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x0024  */
    public final void L(Object obj, Writer writer) {
        Map.Entry entry;
        Iterator it;
        boolean z11;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z12;
        MessageSchema<T> messageSchema = this;
        boolean z13 = messageSchema.f21329f;
        ExtensionSchema extensionSchema = messageSchema.f21336n;
        if (z13) {
            FieldSet fieldSetC = extensionSchema.c(obj);
            if (fieldSetC.f21252a.isEmpty()) {
                entry = null;
                it = null;
            } else {
                Iterator itI = fieldSetC.i();
                entry = (Map.Entry) itI.next();
                it = itI;
            }
        } else {
            entry = null;
            it = null;
        }
        int[] iArr = messageSchema.f21324a;
        int length = iArr.length;
        Unsafe unsafe = f21323q;
        int i16 = 0;
        int i17 = 1048575;
        int i18 = 0;
        while (i16 < length) {
            int iK = messageSchema.K(i16);
            int i19 = iArr[i16];
            int iJ = J(iK);
            Map.Entry entry2 = entry;
            if (iJ <= 17) {
                int i21 = iArr[i16 + 2];
                z11 = true;
                int i22 = i21 & 1048575;
                if (i22 != i17) {
                    i18 = i22 == 1048575 ? 0 : unsafe.getInt(obj, i22);
                    i17 = i22;
                }
                int i23 = 1 << (i21 >>> 20);
                int i24 = i18;
                i13 = i23;
                i12 = i17;
                i11 = i24;
            } else {
                int i25 = i17;
                z11 = true;
                i11 = i18;
                i12 = i25;
                i13 = 0;
            }
            while (true) {
                i14 = i12;
                if (entry2 != null && extensionSchema.a(entry2) <= i19) {
                    extensionSchema.j(writer, entry2);
                    entry2 = it.hasNext() ? (Map.Entry) it.next() : null;
                    i12 = i14;
                }
            }
            int i26 = iK & 1048575;
            Iterator it2 = it;
            int[] iArr2 = iArr;
            long j11 = i26;
            switch (iJ) {
                case 0:
                    i15 = i14;
                    if (messageSchema.q(obj, i16, i15, i11, i13)) {
                        writer.g(i19, UnsafeUtil.f21417c.h(j11, obj));
                    }
                    break;
                case 1:
                    i15 = i14;
                    if (messageSchema.q(obj, i16, i15, i11, i13)) {
                        writer.H(i19, UnsafeUtil.f21417c.i(j11, obj));
                    }
                    messageSchema = this;
                    break;
                case 2:
                    i15 = i14;
                    if (messageSchema.q(obj, i16, i15, i11, i13)) {
                        writer.r(i19, unsafe.getLong(obj, j11));
                    }
                    messageSchema = this;
                    break;
                case 3:
                    i15 = i14;
                    if (messageSchema.q(obj, i16, i15, i11, i13)) {
                        writer.o(i19, unsafe.getLong(obj, j11));
                    }
                    messageSchema = this;
                    break;
                case 4:
                    i15 = i14;
                    if (messageSchema.q(obj, i16, i15, i11, i13)) {
                        writer.x(i19, unsafe.getInt(obj, j11));
                    }
                    messageSchema = this;
                    break;
                case 5:
                    i15 = i14;
                    if (messageSchema.q(obj, i16, i15, i11, i13)) {
                        writer.k(i19, unsafe.getLong(obj, j11));
                    }
                    messageSchema = this;
                    break;
                case 6:
                    i15 = i14;
                    if (messageSchema.q(obj, i16, i15, i11, i13)) {
                        writer.f(i19, unsafe.getInt(obj, j11));
                    }
                    messageSchema = this;
                    break;
                case 7:
                    i15 = i14;
                    if (messageSchema.q(obj, i16, i15, i11, i13)) {
                        writer.s(i19, UnsafeUtil.f21417c.e(j11, obj));
                    }
                    messageSchema = this;
                    break;
                case 8:
                    i15 = i14;
                    if (messageSchema.q(obj, i16, i15, i11, i13)) {
                        M(i19, unsafe.getObject(obj, j11), writer);
                    }
                    messageSchema = this;
                    break;
                case 9:
                    i15 = i14;
                    if (messageSchema.q(obj, i16, i15, i11, i13)) {
                        writer.j(i19, unsafe.getObject(obj, j11), messageSchema.o(i16));
                    }
                    break;
                case 10:
                    i15 = i14;
                    if (messageSchema.q(obj, i16, i15, i11, i13)) {
                        writer.w(i19, (ByteString) unsafe.getObject(obj, j11));
                    }
                    messageSchema = this;
                    break;
                case 11:
                    i15 = i14;
                    if (messageSchema.q(obj, i16, i15, i11, i13)) {
                        writer.d(i19, unsafe.getInt(obj, j11));
                    }
                    messageSchema = this;
                    break;
                case 12:
                    i15 = i14;
                    if (messageSchema.q(obj, i16, i15, i11, i13)) {
                        writer.K(i19, unsafe.getInt(obj, j11));
                    }
                    messageSchema = this;
                    break;
                case 13:
                    i15 = i14;
                    if (messageSchema.q(obj, i16, i15, i11, i13)) {
                        writer.u(i19, unsafe.getInt(obj, j11));
                    }
                    messageSchema = this;
                    break;
                case 14:
                    i15 = i14;
                    if (messageSchema.q(obj, i16, i15, i11, i13)) {
                        writer.A(i19, unsafe.getLong(obj, j11));
                    }
                    messageSchema = this;
                    break;
                case 15:
                    i15 = i14;
                    if (messageSchema.q(obj, i16, i15, i11, i13)) {
                        writer.O(i19, unsafe.getInt(obj, j11));
                    }
                    messageSchema = this;
                    break;
                case 16:
                    i15 = i14;
                    if (messageSchema.q(obj, i16, i15, i11, i13)) {
                        writer.G(i19, unsafe.getLong(obj, j11));
                    }
                    messageSchema = this;
                    break;
                case 17:
                    i15 = i14;
                    if (messageSchema.q(obj, i16, i15, i11, i13)) {
                        writer.t(i19, unsafe.getObject(obj, j11), messageSchema.o(i16));
                    }
                    break;
                case 18:
                    SchemaUtil.p(iArr2[i16], (List) unsafe.getObject(obj, j11), writer, false);
                    i15 = i14;
                    break;
                case 19:
                    SchemaUtil.s(iArr2[i16], (List) unsafe.getObject(obj, j11), writer, false);
                    i15 = i14;
                    break;
                case 20:
                    SchemaUtil.u(iArr2[i16], (List) unsafe.getObject(obj, j11), writer, false);
                    i15 = i14;
                    break;
                case 21:
                    SchemaUtil.A(iArr2[i16], (List) unsafe.getObject(obj, j11), writer, false);
                    i15 = i14;
                    break;
                case 22:
                    SchemaUtil.t(iArr2[i16], (List) unsafe.getObject(obj, j11), writer, false);
                    i15 = i14;
                    break;
                case 23:
                    SchemaUtil.r(iArr2[i16], (List) unsafe.getObject(obj, j11), writer, false);
                    i15 = i14;
                    break;
                case Service.METRICS_FIELD_NUMBER /* 24 */:
                    SchemaUtil.q(iArr2[i16], (List) unsafe.getObject(obj, j11), writer, false);
                    i15 = i14;
                    break;
                case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                    SchemaUtil.o(iArr2[i16], (List) unsafe.getObject(obj, j11), writer, false);
                    i15 = i14;
                    break;
                case Service.BILLING_FIELD_NUMBER /* 26 */:
                    int i27 = iArr2[i16];
                    List list = (List) unsafe.getObject(obj, j11);
                    Class cls = SchemaUtil.f21373a;
                    if (list != null && !list.isEmpty()) {
                        writer.m(i27, list);
                    }
                    i15 = i14;
                    break;
                case 27:
                    int i28 = iArr2[i16];
                    List list2 = (List) unsafe.getObject(obj, j11);
                    Schema schemaO = messageSchema.o(i16);
                    Class cls2 = SchemaUtil.f21373a;
                    if (list2 != null && !list2.isEmpty()) {
                        writer.a(i28, list2, schemaO);
                    }
                    i15 = i14;
                    break;
                case Service.MONITORING_FIELD_NUMBER /* 28 */:
                    int i29 = iArr2[i16];
                    List list3 = (List) unsafe.getObject(obj, j11);
                    Class cls3 = SchemaUtil.f21373a;
                    if (list3 != null && !list3.isEmpty()) {
                        writer.P(i29, list3);
                    }
                    i15 = i14;
                    break;
                case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
                    z12 = false;
                    SchemaUtil.z(iArr2[i16], (List) unsafe.getObject(obj, j11), writer, false);
                    i15 = i14;
                    break;
                case 30:
                    z12 = false;
                    int i30 = iArr2[i16];
                    List list4 = (List) unsafe.getObject(obj, j11);
                    Class cls4 = SchemaUtil.f21373a;
                    if (list4 != null && !list4.isEmpty()) {
                        writer.M(i30, list4, false);
                    }
                    i15 = i14;
                    break;
                case 31:
                    z12 = false;
                    SchemaUtil.v(iArr2[i16], (List) unsafe.getObject(obj, j11), writer, false);
                    i15 = i14;
                    break;
                case Consts.SP /* 32 */:
                    z12 = false;
                    SchemaUtil.w(iArr2[i16], (List) unsafe.getObject(obj, j11), writer, false);
                    i15 = i14;
                    break;
                case 33:
                    z12 = false;
                    SchemaUtil.x(iArr2[i16], (List) unsafe.getObject(obj, j11), writer, false);
                    i15 = i14;
                    break;
                case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                    z12 = false;
                    SchemaUtil.y(iArr2[i16], (List) unsafe.getObject(obj, j11), writer, false);
                    i15 = i14;
                    break;
                case 35:
                    SchemaUtil.p(iArr2[i16], (List) unsafe.getObject(obj, j11), writer, z11);
                    i15 = i14;
                    break;
                case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    SchemaUtil.s(iArr2[i16], (List) unsafe.getObject(obj, j11), writer, z11);
                    i15 = i14;
                    break;
                case 37:
                    SchemaUtil.u(iArr2[i16], (List) unsafe.getObject(obj, j11), writer, z11);
                    i15 = i14;
                    break;
                case 38:
                    SchemaUtil.A(iArr2[i16], (List) unsafe.getObject(obj, j11), writer, z11);
                    i15 = i14;
                    break;
                case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    SchemaUtil.t(iArr2[i16], (List) unsafe.getObject(obj, j11), writer, z11);
                    i15 = i14;
                    break;
                case DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                    SchemaUtil.r(iArr2[i16], (List) unsafe.getObject(obj, j11), writer, z11);
                    i15 = i14;
                    break;
                case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                    SchemaUtil.q(iArr2[i16], (List) unsafe.getObject(obj, j11), writer, z11);
                    i15 = i14;
                    break;
                case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                    SchemaUtil.o(iArr2[i16], (List) unsafe.getObject(obj, j11), writer, z11);
                    i15 = i14;
                    break;
                case 43:
                    SchemaUtil.z(iArr2[i16], (List) unsafe.getObject(obj, j11), writer, z11);
                    i15 = i14;
                    break;
                case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                    boolean z14 = z11;
                    int i31 = iArr2[i16];
                    List list5 = (List) unsafe.getObject(obj, j11);
                    Class cls5 = SchemaUtil.f21373a;
                    if (list5 != null && !list5.isEmpty()) {
                        writer.M(i31, list5, z14);
                    }
                    i15 = i14;
                    break;
                case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                    SchemaUtil.v(iArr2[i16], (List) unsafe.getObject(obj, j11), writer, z11);
                    i15 = i14;
                    break;
                case 46:
                    SchemaUtil.w(iArr2[i16], (List) unsafe.getObject(obj, j11), writer, z11);
                    i15 = i14;
                    break;
                case 47:
                    SchemaUtil.x(iArr2[i16], (List) unsafe.getObject(obj, j11), writer, z11);
                    i15 = i14;
                    break;
                case 48:
                    SchemaUtil.y(iArr2[i16], (List) unsafe.getObject(obj, j11), writer, z11);
                    i15 = i14;
                    break;
                case 49:
                    int i32 = iArr2[i16];
                    List list6 = (List) unsafe.getObject(obj, j11);
                    Schema schemaO2 = messageSchema.o(i16);
                    Class cls6 = SchemaUtil.f21373a;
                    if (list6 != null && !list6.isEmpty()) {
                        writer.b(i32, list6, schemaO2);
                    }
                    i15 = i14;
                    break;
                case 50:
                    Object object = unsafe.getObject(obj, j11);
                    if (object != null) {
                        Object objN = messageSchema.n(i16);
                        MapFieldSchema mapFieldSchema = messageSchema.f21337o;
                        writer.D(i19, mapFieldSchema.c(objN), mapFieldSchema.h(object));
                    }
                    i15 = i14;
                    break;
                case 51:
                    if (messageSchema.s(i19, i16, obj)) {
                        writer.g(i19, ((Double) UnsafeUtil.f21417c.m(j11, obj)).doubleValue());
                    }
                    i15 = i14;
                    break;
                case 52:
                    if (messageSchema.s(i19, i16, obj)) {
                        writer.H(i19, ((Float) UnsafeUtil.f21417c.m(j11, obj)).floatValue());
                    }
                    i15 = i14;
                    break;
                case 53:
                    if (messageSchema.s(i19, i16, obj)) {
                        writer.r(i19, C(j11, obj));
                    }
                    i15 = i14;
                    break;
                case 54:
                    if (messageSchema.s(i19, i16, obj)) {
                        writer.o(i19, C(j11, obj));
                    }
                    i15 = i14;
                    break;
                case 55:
                    if (messageSchema.s(i19, i16, obj)) {
                        writer.x(i19, B(j11, obj));
                    }
                    i15 = i14;
                    break;
                case 56:
                    if (messageSchema.s(i19, i16, obj)) {
                        writer.k(i19, C(j11, obj));
                    }
                    i15 = i14;
                    break;
                case 57:
                    if (messageSchema.s(i19, i16, obj)) {
                        writer.f(i19, B(j11, obj));
                    }
                    i15 = i14;
                    break;
                case 58:
                    if (messageSchema.s(i19, i16, obj)) {
                        writer.s(i19, ((Boolean) UnsafeUtil.f21417c.m(j11, obj)).booleanValue());
                    }
                    i15 = i14;
                    break;
                case 59:
                    if (messageSchema.s(i19, i16, obj)) {
                        M(i19, unsafe.getObject(obj, j11), writer);
                    }
                    i15 = i14;
                    break;
                case 60:
                    if (messageSchema.s(i19, i16, obj)) {
                        writer.j(i19, unsafe.getObject(obj, j11), messageSchema.o(i16));
                    }
                    i15 = i14;
                    break;
                case 61:
                    if (messageSchema.s(i19, i16, obj)) {
                        writer.w(i19, (ByteString) unsafe.getObject(obj, j11));
                    }
                    i15 = i14;
                    break;
                case 62:
                    if (messageSchema.s(i19, i16, obj)) {
                        writer.d(i19, B(j11, obj));
                    }
                    i15 = i14;
                    break;
                case 63:
                    if (messageSchema.s(i19, i16, obj)) {
                        writer.K(i19, B(j11, obj));
                    }
                    i15 = i14;
                    break;
                case 64:
                    if (messageSchema.s(i19, i16, obj)) {
                        writer.u(i19, B(j11, obj));
                    }
                    i15 = i14;
                    break;
                case 65:
                    if (messageSchema.s(i19, i16, obj)) {
                        writer.A(i19, C(j11, obj));
                    }
                    i15 = i14;
                    break;
                case 66:
                    if (messageSchema.s(i19, i16, obj)) {
                        writer.O(i19, B(j11, obj));
                    }
                    i15 = i14;
                    break;
                case 67:
                    if (messageSchema.s(i19, i16, obj)) {
                        writer.G(i19, C(j11, obj));
                    }
                    i15 = i14;
                    break;
                case 68:
                    if (messageSchema.s(i19, i16, obj)) {
                        writer.t(i19, unsafe.getObject(obj, j11), messageSchema.o(i16));
                    }
                    i15 = i14;
                    break;
                default:
                    i15 = i14;
                    break;
            }
            i16 += 3;
            i18 = i11;
            it = it2;
            iArr = iArr2;
            i17 = i15;
            entry = entry2;
        }
        Iterator it3 = it;
        while (entry != null) {
            extensionSchema.j(writer, entry);
            entry = it3.hasNext() ? (Map.Entry) it3.next() : null;
        }
        UnknownFieldSchema unknownFieldSchema = messageSchema.m;
        unknownFieldSchema.r(unknownFieldSchema.g(obj), writer);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    @Override // com.google.protobuf.Schema
    public final void a(Object obj, Object obj2) {
        Object obj3;
        k(obj);
        obj2.getClass();
        int i11 = 0;
        while (true) {
            int[] iArr = this.f21324a;
            if (i11 >= iArr.length) {
                Object obj4 = obj;
                Class cls = SchemaUtil.f21373a;
                UnknownFieldSchema unknownFieldSchema = this.m;
                unknownFieldSchema.o(obj4, unknownFieldSchema.k(unknownFieldSchema.g(obj4), unknownFieldSchema.g(obj2)));
                if (this.f21329f) {
                    SchemaUtil.l(this.f21336n, obj4, obj2);
                    return;
                }
                return;
            }
            int iK = K(i11);
            long j11 = 1048575 & iK;
            int i12 = iArr[i11];
            switch (J(iK)) {
                case 0:
                    if (!p(i11, obj2)) {
                        obj3 = obj;
                    } else {
                        UnsafeUtil.MemoryAccessor memoryAccessor = UnsafeUtil.f21417c;
                        obj3 = obj;
                        memoryAccessor.r(obj3, j11, memoryAccessor.h(j11, obj2));
                        F(i11, obj3);
                    }
                    break;
                case 1:
                    if (p(i11, obj2)) {
                        UnsafeUtil.MemoryAccessor memoryAccessor2 = UnsafeUtil.f21417c;
                        memoryAccessor2.s(obj, j11, memoryAccessor2.i(j11, obj2));
                        F(i11, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (p(i11, obj2)) {
                        UnsafeUtil.q(obj, j11, UnsafeUtil.f21417c.l(j11, obj2));
                        F(i11, obj);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (p(i11, obj2)) {
                        UnsafeUtil.q(obj, j11, UnsafeUtil.f21417c.l(j11, obj2));
                        F(i11, obj);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (p(i11, obj2)) {
                        UnsafeUtil.p(j11, obj, UnsafeUtil.f21417c.j(j11, obj2));
                        F(i11, obj);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (p(i11, obj2)) {
                        UnsafeUtil.q(obj, j11, UnsafeUtil.f21417c.l(j11, obj2));
                        F(i11, obj);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (p(i11, obj2)) {
                        UnsafeUtil.p(j11, obj, UnsafeUtil.f21417c.j(j11, obj2));
                        F(i11, obj);
                    }
                    obj3 = obj;
                    break;
                case 7:
                    if (p(i11, obj2)) {
                        UnsafeUtil.MemoryAccessor memoryAccessor3 = UnsafeUtil.f21417c;
                        memoryAccessor3.o(obj, j11, memoryAccessor3.e(j11, obj2));
                        F(i11, obj);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (p(i11, obj2)) {
                        UnsafeUtil.r(obj, j11, UnsafeUtil.f21417c.m(j11, obj2));
                        F(i11, obj);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    u(i11, obj, obj2);
                    obj3 = obj;
                    break;
                case 10:
                    if (p(i11, obj2)) {
                        UnsafeUtil.r(obj, j11, UnsafeUtil.f21417c.m(j11, obj2));
                        F(i11, obj);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (p(i11, obj2)) {
                        UnsafeUtil.p(j11, obj, UnsafeUtil.f21417c.j(j11, obj2));
                        F(i11, obj);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (p(i11, obj2)) {
                        UnsafeUtil.p(j11, obj, UnsafeUtil.f21417c.j(j11, obj2));
                        F(i11, obj);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (p(i11, obj2)) {
                        UnsafeUtil.p(j11, obj, UnsafeUtil.f21417c.j(j11, obj2));
                        F(i11, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (p(i11, obj2)) {
                        UnsafeUtil.q(obj, j11, UnsafeUtil.f21417c.l(j11, obj2));
                        F(i11, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (p(i11, obj2)) {
                        UnsafeUtil.p(j11, obj, UnsafeUtil.f21417c.j(j11, obj2));
                        F(i11, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (p(i11, obj2)) {
                        UnsafeUtil.q(obj, j11, UnsafeUtil.f21417c.l(j11, obj2));
                        F(i11, obj);
                    }
                    obj3 = obj;
                    break;
                case 17:
                    u(i11, obj, obj2);
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
                    this.f21335l.b(obj, j11, obj2);
                    obj3 = obj;
                    break;
                case 50:
                    Class cls2 = SchemaUtil.f21373a;
                    UnsafeUtil.MemoryAccessor memoryAccessor4 = UnsafeUtil.f21417c;
                    UnsafeUtil.r(obj, j11, this.f21337o.a(memoryAccessor4.m(j11, obj), memoryAccessor4.m(j11, obj2)));
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
                    if (s(i12, i11, obj2)) {
                        UnsafeUtil.r(obj, j11, UnsafeUtil.f21417c.m(j11, obj2));
                        G(i12, i11, obj);
                    }
                    obj3 = obj;
                    break;
                case 60:
                    v(i11, obj, obj2);
                    obj3 = obj;
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (s(i12, i11, obj2)) {
                        UnsafeUtil.r(obj, j11, UnsafeUtil.f21417c.m(j11, obj2));
                        G(i12, i11, obj);
                    }
                    obj3 = obj;
                    break;
                case 68:
                    v(i11, obj, obj2);
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

    /* JADX WARN: Code duplicated, block: B:25:0x006b  */
    /* JADX WARN: Code duplicated, block: B:27:0x0071  */
    /* JADX WARN: Code duplicated, block: B:40:0x007e A[SYNTHETIC] */
    @Override // com.google.protobuf.Schema
    public final void b(Object obj) {
        if (r(obj)) {
            if (obj instanceof GeneratedMessageLite) {
                GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
                generatedMessageLite.m(Integer.MAX_VALUE);
                generatedMessageLite.memoizedHashCode = 0;
                generatedMessageLite.y();
            }
            int[] iArr = this.f21324a;
            int length = iArr.length;
            for (int i11 = 0; i11 < length; i11 += 3) {
                int iK = K(i11);
                long j11 = 1048575 & iK;
                int iJ = J(iK);
                if (iJ != 9) {
                    if (iJ != 60 && iJ != 68) {
                        switch (iJ) {
                            case 17:
                                if (p(i11, obj)) {
                                    o(i11).b(f21323q.getObject(obj, j11));
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
                                this.f21335l.a(j11, obj);
                                break;
                            case 50:
                                Unsafe unsafe = f21323q;
                                Object object = unsafe.getObject(obj, j11);
                                if (object != null) {
                                    unsafe.putObject(obj, j11, this.f21337o.b(object));
                                }
                                break;
                        }
                    } else if (s(iArr[i11], i11, obj)) {
                        o(i11).b(f21323q.getObject(obj, j11));
                    }
                } else if (p(i11, obj)) {
                    o(i11).b(f21323q.getObject(obj, j11));
                }
            }
            this.m.j(obj);
            if (this.f21329f) {
                this.f21336n.f(obj);
            }
        }
    }

    @Override // com.google.protobuf.Schema
    public final boolean c(Object obj) {
        int i11;
        int i12;
        int i13 = 1048575;
        int i14 = 0;
        int i15 = 0;
        while (i15 < this.f21332i) {
            int i16 = this.f21331h[i15];
            int[] iArr = this.f21324a;
            int i17 = iArr[i16];
            int iK = K(i16);
            int i18 = iArr[i16 + 2];
            int i19 = i18 & 1048575;
            int i21 = 1 << (i18 >>> 20);
            if (i19 != i13) {
                if (i19 != 1048575) {
                    i14 = f21323q.getInt(obj, i19);
                }
                i12 = i14;
                i11 = i19;
            } else {
                int i22 = i14;
                i11 = i13;
                i12 = i22;
            }
            if ((268435456 & iK) == 0 || q(obj, i16, i11, i12, i21)) {
                int iJ = J(iK);
                if (iJ == 9 || iJ == 17) {
                    if (!q(obj, i16, i11, i12, i21)) {
                        continue;
                    } else if (!o(i16).c(UnsafeUtil.f21417c.m(iK & 1048575, obj))) {
                    }
                    i15++;
                    i13 = i11;
                    i14 = i12;
                } else {
                    if (iJ != 27) {
                        if (iJ == 60 || iJ == 68) {
                            if (!s(i17, i16, obj)) {
                                continue;
                            } else if (!o(i16).c(UnsafeUtil.f21417c.m(iK & 1048575, obj))) {
                            }
                            i15++;
                            i13 = i11;
                            i14 = i12;
                        } else if (iJ != 49) {
                            if (iJ != 50) {
                                continue;
                            } else {
                                Object objM = UnsafeUtil.f21417c.m(iK & 1048575, obj);
                                MapFieldSchema mapFieldSchema = this.f21337o;
                                MapFieldLite mapFieldLiteH = mapFieldSchema.h(objM);
                                if (!mapFieldLiteH.isEmpty() && mapFieldSchema.c(n(i16)).f21315b.a() == WireFormat.JavaType.MESSAGE) {
                                    Schema schemaA = null;
                                    for (Object obj2 : mapFieldLiteH.values()) {
                                        if (schemaA == null) {
                                            schemaA = Protobuf.f21349c.a(obj2.getClass());
                                        }
                                        if (!schemaA.c(obj2)) {
                                        }
                                    }
                                }
                            }
                            i15++;
                            i13 = i11;
                            i14 = i12;
                        }
                    }
                    List list = (List) UnsafeUtil.f21417c.m(iK & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        Schema schemaO = o(i16);
                        for (int i23 = 0; i23 < list.size(); i23++) {
                            if (schemaO.c(list.get(i23))) {
                            }
                        }
                    }
                    i15++;
                    i13 = i11;
                    i14 = i12;
                }
            }
        }
        return !this.f21329f || this.f21336n.c(obj).g();
    }

    @Override // com.google.protobuf.Schema
    public final Object d() {
        return this.f21334k.a(this.f21328e);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005b  */
    @Override // com.google.protobuf.Schema
    public final void e(Object obj, Writer writer) {
        Iterator it;
        Map.Entry entry;
        if (writer.l() != Writer.FieldOrder.DESCENDING) {
            L(obj, writer);
            return;
        }
        ExtensionSchema extensionSchema = this.f21336n;
        int[] iArr = this.f21324a;
        UnknownFieldSchema unknownFieldSchema = this.m;
        unknownFieldSchema.r(unknownFieldSchema.g(obj), writer);
        if (this.f21329f) {
            FieldSet fieldSetC = extensionSchema.c(obj);
            if (fieldSetC.f21252a.isEmpty()) {
                it = null;
                entry = null;
            } else {
                SmallSortedMap.AnonymousClass1 anonymousClass1 = fieldSetC.f21252a;
                if (fieldSetC.f21254c) {
                    if (anonymousClass1.f21382t == null) {
                        anonymousClass1.f21382t = new SmallSortedMap.DescendingEntrySet();
                    }
                    it = new LazyField.LazyIterator(anonymousClass1.f21382t.iterator());
                } else {
                    if (anonymousClass1.f21382t == null) {
                        anonymousClass1.f21382t = new SmallSortedMap.DescendingEntrySet();
                    }
                    it = anonymousClass1.f21382t.iterator();
                }
                entry = (Map.Entry) it.next();
            }
        } else {
            it = null;
            entry = null;
        }
        for (int length = iArr.length - 3; length >= 0; length -= 3) {
            int iK = K(length);
            int i11 = iArr[length];
            while (entry != null && extensionSchema.a(entry) > i11) {
                extensionSchema.j(writer, entry);
                entry = it.hasNext() ? (Map.Entry) it.next() : null;
            }
            switch (J(iK)) {
                case 0:
                    if (p(length, obj)) {
                        writer.g(i11, UnsafeUtil.f21417c.h(iK & 1048575, obj));
                    }
                    break;
                case 1:
                    if (p(length, obj)) {
                        writer.H(i11, UnsafeUtil.f21417c.i(iK & 1048575, obj));
                    }
                    break;
                case 2:
                    if (p(length, obj)) {
                        writer.r(i11, UnsafeUtil.f21417c.l(iK & 1048575, obj));
                    }
                    break;
                case 3:
                    if (p(length, obj)) {
                        writer.o(i11, UnsafeUtil.f21417c.l(iK & 1048575, obj));
                    }
                    break;
                case 4:
                    if (p(length, obj)) {
                        writer.x(i11, UnsafeUtil.f21417c.j(iK & 1048575, obj));
                    }
                    break;
                case 5:
                    if (p(length, obj)) {
                        writer.k(i11, UnsafeUtil.f21417c.l(iK & 1048575, obj));
                    }
                    break;
                case 6:
                    if (p(length, obj)) {
                        writer.f(i11, UnsafeUtil.f21417c.j(iK & 1048575, obj));
                    }
                    break;
                case 7:
                    if (p(length, obj)) {
                        writer.s(i11, UnsafeUtil.f21417c.e(iK & 1048575, obj));
                    }
                    break;
                case 8:
                    if (p(length, obj)) {
                        M(i11, UnsafeUtil.f21417c.m(iK & 1048575, obj), writer);
                    }
                    break;
                case 9:
                    if (p(length, obj)) {
                        writer.j(i11, UnsafeUtil.f21417c.m(iK & 1048575, obj), o(length));
                    }
                    break;
                case 10:
                    if (p(length, obj)) {
                        writer.w(i11, (ByteString) UnsafeUtil.f21417c.m(iK & 1048575, obj));
                    }
                    break;
                case 11:
                    if (p(length, obj)) {
                        writer.d(i11, UnsafeUtil.f21417c.j(iK & 1048575, obj));
                    }
                    break;
                case 12:
                    if (p(length, obj)) {
                        writer.K(i11, UnsafeUtil.f21417c.j(iK & 1048575, obj));
                    }
                    break;
                case 13:
                    if (p(length, obj)) {
                        writer.u(i11, UnsafeUtil.f21417c.j(iK & 1048575, obj));
                    }
                    break;
                case 14:
                    if (p(length, obj)) {
                        writer.A(i11, UnsafeUtil.f21417c.l(iK & 1048575, obj));
                    }
                    break;
                case 15:
                    if (p(length, obj)) {
                        writer.O(i11, UnsafeUtil.f21417c.j(iK & 1048575, obj));
                    }
                    break;
                case 16:
                    if (p(length, obj)) {
                        writer.G(i11, UnsafeUtil.f21417c.l(iK & 1048575, obj));
                    }
                    break;
                case 17:
                    if (p(length, obj)) {
                        writer.t(i11, UnsafeUtil.f21417c.m(iK & 1048575, obj), o(length));
                    }
                    break;
                case 18:
                    SchemaUtil.p(iArr[length], (List) UnsafeUtil.f21417c.m(iK & 1048575, obj), writer, false);
                    break;
                case 19:
                    SchemaUtil.s(iArr[length], (List) UnsafeUtil.f21417c.m(iK & 1048575, obj), writer, false);
                    break;
                case 20:
                    SchemaUtil.u(iArr[length], (List) UnsafeUtil.f21417c.m(iK & 1048575, obj), writer, false);
                    break;
                case 21:
                    SchemaUtil.A(iArr[length], (List) UnsafeUtil.f21417c.m(iK & 1048575, obj), writer, false);
                    break;
                case 22:
                    SchemaUtil.t(iArr[length], (List) UnsafeUtil.f21417c.m(iK & 1048575, obj), writer, false);
                    break;
                case 23:
                    SchemaUtil.r(iArr[length], (List) UnsafeUtil.f21417c.m(iK & 1048575, obj), writer, false);
                    break;
                case Service.METRICS_FIELD_NUMBER /* 24 */:
                    SchemaUtil.q(iArr[length], (List) UnsafeUtil.f21417c.m(iK & 1048575, obj), writer, false);
                    break;
                case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                    SchemaUtil.o(iArr[length], (List) UnsafeUtil.f21417c.m(iK & 1048575, obj), writer, false);
                    break;
                case Service.BILLING_FIELD_NUMBER /* 26 */:
                    int i12 = iArr[length];
                    List list = (List) UnsafeUtil.f21417c.m(iK & 1048575, obj);
                    Class cls = SchemaUtil.f21373a;
                    if (list != null && !list.isEmpty()) {
                        writer.m(i12, list);
                    }
                    break;
                case 27:
                    int i13 = iArr[length];
                    List list2 = (List) UnsafeUtil.f21417c.m(iK & 1048575, obj);
                    Schema schemaO = o(length);
                    Class cls2 = SchemaUtil.f21373a;
                    if (list2 != null && !list2.isEmpty()) {
                        writer.a(i13, list2, schemaO);
                    }
                    break;
                case Service.MONITORING_FIELD_NUMBER /* 28 */:
                    int i14 = iArr[length];
                    List list3 = (List) UnsafeUtil.f21417c.m(iK & 1048575, obj);
                    Class cls3 = SchemaUtil.f21373a;
                    if (list3 != null && !list3.isEmpty()) {
                        writer.P(i14, list3);
                    }
                    break;
                case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
                    SchemaUtil.z(iArr[length], (List) UnsafeUtil.f21417c.m(iK & 1048575, obj), writer, false);
                    break;
                case 30:
                    int i15 = iArr[length];
                    List list4 = (List) UnsafeUtil.f21417c.m(iK & 1048575, obj);
                    Class cls4 = SchemaUtil.f21373a;
                    if (list4 != null && !list4.isEmpty()) {
                        writer.M(i15, list4, false);
                    }
                    break;
                case 31:
                    SchemaUtil.v(iArr[length], (List) UnsafeUtil.f21417c.m(iK & 1048575, obj), writer, false);
                    break;
                case Consts.SP /* 32 */:
                    SchemaUtil.w(iArr[length], (List) UnsafeUtil.f21417c.m(iK & 1048575, obj), writer, false);
                    break;
                case 33:
                    SchemaUtil.x(iArr[length], (List) UnsafeUtil.f21417c.m(iK & 1048575, obj), writer, false);
                    break;
                case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                    SchemaUtil.y(iArr[length], (List) UnsafeUtil.f21417c.m(iK & 1048575, obj), writer, false);
                    break;
                case 35:
                    SchemaUtil.p(iArr[length], (List) UnsafeUtil.f21417c.m(iK & 1048575, obj), writer, true);
                    break;
                case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    SchemaUtil.s(iArr[length], (List) UnsafeUtil.f21417c.m(iK & 1048575, obj), writer, true);
                    break;
                case 37:
                    SchemaUtil.u(iArr[length], (List) UnsafeUtil.f21417c.m(iK & 1048575, obj), writer, true);
                    break;
                case 38:
                    SchemaUtil.A(iArr[length], (List) UnsafeUtil.f21417c.m(iK & 1048575, obj), writer, true);
                    break;
                case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    SchemaUtil.t(iArr[length], (List) UnsafeUtil.f21417c.m(iK & 1048575, obj), writer, true);
                    break;
                case DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                    SchemaUtil.r(iArr[length], (List) UnsafeUtil.f21417c.m(iK & 1048575, obj), writer, true);
                    break;
                case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                    SchemaUtil.q(iArr[length], (List) UnsafeUtil.f21417c.m(iK & 1048575, obj), writer, true);
                    break;
                case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                    SchemaUtil.o(iArr[length], (List) UnsafeUtil.f21417c.m(iK & 1048575, obj), writer, true);
                    break;
                case 43:
                    SchemaUtil.z(iArr[length], (List) UnsafeUtil.f21417c.m(iK & 1048575, obj), writer, true);
                    break;
                case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                    int i16 = iArr[length];
                    List list5 = (List) UnsafeUtil.f21417c.m(iK & 1048575, obj);
                    Class cls5 = SchemaUtil.f21373a;
                    if (list5 != null && !list5.isEmpty()) {
                        writer.M(i16, list5, true);
                    }
                    break;
                case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                    SchemaUtil.v(iArr[length], (List) UnsafeUtil.f21417c.m(iK & 1048575, obj), writer, true);
                    break;
                case 46:
                    SchemaUtil.w(iArr[length], (List) UnsafeUtil.f21417c.m(iK & 1048575, obj), writer, true);
                    break;
                case 47:
                    SchemaUtil.x(iArr[length], (List) UnsafeUtil.f21417c.m(iK & 1048575, obj), writer, true);
                    break;
                case 48:
                    SchemaUtil.y(iArr[length], (List) UnsafeUtil.f21417c.m(iK & 1048575, obj), writer, true);
                    break;
                case 49:
                    int i17 = iArr[length];
                    List list6 = (List) UnsafeUtil.f21417c.m(iK & 1048575, obj);
                    Schema schemaO2 = o(length);
                    Class cls6 = SchemaUtil.f21373a;
                    if (list6 != null && !list6.isEmpty()) {
                        writer.b(i17, list6, schemaO2);
                    }
                    break;
                case 50:
                    Object objM = UnsafeUtil.f21417c.m(iK & 1048575, obj);
                    MapFieldSchema mapFieldSchema = this.f21337o;
                    if (objM != null) {
                        writer.D(i11, mapFieldSchema.c(n(length)), mapFieldSchema.h(objM));
                    }
                    break;
                case 51:
                    if (s(i11, length, obj)) {
                        writer.g(i11, ((Double) UnsafeUtil.f21417c.m(iK & 1048575, obj)).doubleValue());
                    }
                    break;
                case 52:
                    if (s(i11, length, obj)) {
                        writer.H(i11, ((Float) UnsafeUtil.f21417c.m(iK & 1048575, obj)).floatValue());
                    }
                    break;
                case 53:
                    if (s(i11, length, obj)) {
                        writer.r(i11, C(iK & 1048575, obj));
                    }
                    break;
                case 54:
                    if (s(i11, length, obj)) {
                        writer.o(i11, C(iK & 1048575, obj));
                    }
                    break;
                case 55:
                    if (s(i11, length, obj)) {
                        writer.x(i11, B(iK & 1048575, obj));
                    }
                    break;
                case 56:
                    if (s(i11, length, obj)) {
                        writer.k(i11, C(iK & 1048575, obj));
                    }
                    break;
                case 57:
                    if (s(i11, length, obj)) {
                        writer.f(i11, B(iK & 1048575, obj));
                    }
                    break;
                case 58:
                    if (s(i11, length, obj)) {
                        writer.s(i11, ((Boolean) UnsafeUtil.f21417c.m(iK & 1048575, obj)).booleanValue());
                    }
                    break;
                case 59:
                    if (s(i11, length, obj)) {
                        M(i11, UnsafeUtil.f21417c.m(iK & 1048575, obj), writer);
                    }
                    break;
                case 60:
                    if (s(i11, length, obj)) {
                        writer.j(i11, UnsafeUtil.f21417c.m(iK & 1048575, obj), o(length));
                    }
                    break;
                case 61:
                    if (s(i11, length, obj)) {
                        writer.w(i11, (ByteString) UnsafeUtil.f21417c.m(iK & 1048575, obj));
                    }
                    break;
                case 62:
                    if (s(i11, length, obj)) {
                        writer.d(i11, B(iK & 1048575, obj));
                    }
                    break;
                case 63:
                    if (s(i11, length, obj)) {
                        writer.K(i11, B(iK & 1048575, obj));
                    }
                    break;
                case 64:
                    if (s(i11, length, obj)) {
                        writer.u(i11, B(iK & 1048575, obj));
                    }
                    break;
                case 65:
                    if (s(i11, length, obj)) {
                        writer.A(i11, C(iK & 1048575, obj));
                    }
                    break;
                case 66:
                    if (s(i11, length, obj)) {
                        writer.O(i11, B(iK & 1048575, obj));
                    }
                    break;
                case 67:
                    if (s(i11, length, obj)) {
                        writer.G(i11, C(iK & 1048575, obj));
                    }
                    break;
                case 68:
                    if (s(i11, length, obj)) {
                        writer.t(i11, UnsafeUtil.f21417c.m(iK & 1048575, obj), o(length));
                    }
                    break;
            }
        }
        while (entry != null) {
            extensionSchema.j(writer, entry);
            entry = it.hasNext() ? (Map.Entry) it.next() : null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:278:0x07c9 A[Catch: all -> 0x07d0, TryCatch #36 {all -> 0x07d0, blocks: (B:276:0x07c4, B:278:0x07c9, B:282:0x07d3), top: B:327:0x07c4 }] */
    /* JADX WARN: Code duplicated, block: B:286:0x07dc A[LOOP:3: B:285:0x07da->B:286:0x07dc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:289:0x07ee  */
    /* JADX WARN: Code duplicated, block: B:301:0x080d A[LOOP:4: B:300:0x080b->B:301:0x080d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:303:0x081c  */
    /* JADX WARN: Code duplicated, block: B:372:0x07d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:394:? A[RETURN, SYNTHETIC] */
    @Override // com.google.protobuf.Schema
    public final void f(Object obj, Reader reader, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
        Object obj2;
        Object objL;
        Object obj3;
        int i11;
        UnknownFieldSchema unknownFieldSchema;
        Object objF;
        Object objL2;
        Object obj4;
        Object obj5;
        ExtensionRegistryLite extensionRegistryLite2;
        Reader reader2;
        Object objL3;
        UnknownFieldSchema unknownFieldSchema2;
        Object obj6;
        Object obj7;
        Object obj8;
        MessageSchema<T> messageSchema = this;
        ExtensionRegistryLite extensionRegistryLite3 = extensionRegistryLite;
        extensionRegistryLite3.getClass();
        k(obj);
        UnknownFieldSchema unknownFieldSchema3 = messageSchema.m;
        int[] iArr = messageSchema.f21331h;
        int i12 = messageSchema.f21333j;
        int i13 = messageSchema.f21332i;
        Object objF2 = null;
        FieldSet fieldSetD = null;
        while (true) {
            try {
                int iB = reader.B();
                try {
                    if (iB < messageSchema.f21326c || iB > messageSchema.f21327d) {
                        i11 = -1;
                    } else {
                        int[] iArr2 = messageSchema.f21324a;
                        int length = (iArr2.length / 3) - 1;
                        int i14 = 0;
                        while (true) {
                            if (i14 > length) {
                                i11 = -1;
                            } else {
                                int i15 = (length + i14) >>> 1;
                                i11 = i15 * 3;
                                int i16 = iArr2[i11];
                                if (iB != i16) {
                                    if (iB < i16) {
                                        length = i15 - 1;
                                    } else {
                                        i14 = i15 + 1;
                                    }
                                }
                            }
                        }
                    }
                    int i17 = i11;
                    if (i17 >= 0) {
                        unknownFieldSchema = unknownFieldSchema3;
                        objF = objF2;
                        obj4 = obj;
                        try {
                            int iK = messageSchema.K(i17);
                            try {
                                int iJ = J(iK);
                                ListFieldSchema listFieldSchema = messageSchema.f21335l;
                                switch (iJ) {
                                    case 0:
                                        messageSchema = messageSchema;
                                        extensionRegistryLite2 = extensionRegistryLite3;
                                        obj2 = obj4;
                                        fieldSetD = fieldSetD;
                                        iArr = iArr;
                                        reader2 = reader;
                                        try {
                                            try {
                                                try {
                                                    obj5 = objF;
                                                    try {
                                                        UnsafeUtil.f21417c.r(obj, A(iK), reader2.readDouble());
                                                        obj2 = obj;
                                                        try {
                                                            messageSchema.F(i17, obj2);
                                                            objF2 = obj5;
                                                        } catch (InvalidProtocolBufferException.InvalidWireTypeException unused) {
                                                            objF2 = obj5;
                                                            try {
                                                                unknownFieldSchema.getClass();
                                                                if (objF2 == null) {
                                                                    objF2 = unknownFieldSchema.f(obj2);
                                                                }
                                                                if (!unknownFieldSchema.l(0, reader2, objF2)) {
                                                                    objL3 = objF2;
                                                                    while (i13 < i12) {
                                                                        objL3 = messageSchema.l(obj2, iArr[i13], objL3, unknownFieldSchema, obj);
                                                                        i13++;
                                                                        messageSchema = this;
                                                                    }
                                                                    unknownFieldSchema2 = unknownFieldSchema;
                                                                    if (objL3 != null) {
                                                                        unknownFieldSchema2.n(obj2, objL3);
                                                                        return;
                                                                    }
                                                                    return;
                                                                }
                                                            } catch (Throwable th2) {
                                                                th = th2;
                                                                unknownFieldSchema3 = unknownFieldSchema;
                                                                objL = objF2;
                                                                while (i13 < i12) {
                                                                    objL = l(obj2, iArr[i13], objL, unknownFieldSchema3, obj);
                                                                    i13++;
                                                                }
                                                                if (objL != null) {
                                                                    unknownFieldSchema3.n(obj2, objL);
                                                                }
                                                                throw th;
                                                            }
                                                        } catch (Throwable th3) {
                                                            th = th3;
                                                            objF2 = obj5;
                                                            unknownFieldSchema3 = unknownFieldSchema;
                                                            objL = objF2;
                                                            while (i13 < i12) {
                                                                objL = l(obj2, iArr[i13], objL, unknownFieldSchema3, obj);
                                                                i13++;
                                                            }
                                                            if (objL != null) {
                                                                unknownFieldSchema3.n(obj2, objL);
                                                            }
                                                            throw th;
                                                        }
                                                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused2) {
                                                        obj2 = obj;
                                                    } catch (Throwable th4) {
                                                        th = th4;
                                                        obj2 = obj;
                                                    }
                                                } catch (InvalidProtocolBufferException.InvalidWireTypeException unused3) {
                                                    obj2 = obj;
                                                    obj5 = objF;
                                                    objF2 = obj5;
                                                    unknownFieldSchema.getClass();
                                                    if (objF2 == null) {
                                                        objF2 = unknownFieldSchema.f(obj2);
                                                    }
                                                    if (!unknownFieldSchema.l(0, reader2, objF2)) {
                                                        objL3 = objF2;
                                                        while (i13 < i12) {
                                                            objL3 = messageSchema.l(obj2, iArr[i13], objL3, unknownFieldSchema, obj);
                                                            i13++;
                                                            messageSchema = this;
                                                        }
                                                        unknownFieldSchema2 = unknownFieldSchema;
                                                        if (objL3 != null) {
                                                            unknownFieldSchema2.n(obj2, objL3);
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    unknownFieldSchema3 = unknownFieldSchema;
                                                    messageSchema = this;
                                                    extensionRegistryLite3 = extensionRegistryLite2;
                                                    iArr = iArr;
                                                    fieldSetD = fieldSetD;
                                                    break;
                                                } catch (Throwable th5) {
                                                    th = th5;
                                                    obj2 = obj;
                                                    obj5 = objF;
                                                    objF2 = obj5;
                                                    unknownFieldSchema3 = unknownFieldSchema;
                                                    objL = objF2;
                                                    while (i13 < i12) {
                                                        objL = l(obj2, iArr[i13], objL, unknownFieldSchema3, obj);
                                                        i13++;
                                                    }
                                                    if (objL != null) {
                                                        unknownFieldSchema3.n(obj2, objL);
                                                    }
                                                    throw th;
                                                }
                                            } catch (InvalidProtocolBufferException.InvalidWireTypeException unused4) {
                                                obj2 = obj;
                                            } catch (Throwable th6) {
                                                th = th6;
                                                obj2 = obj;
                                            }
                                        } catch (InvalidProtocolBufferException.InvalidWireTypeException unused5) {
                                        } catch (Throwable th7) {
                                            th = th7;
                                        }
                                        unknownFieldSchema3 = unknownFieldSchema;
                                        messageSchema = this;
                                        extensionRegistryLite3 = extensionRegistryLite2;
                                        iArr = iArr;
                                        fieldSetD = fieldSetD;
                                        break;
                                    case 1:
                                        MessageSchema<T> messageSchema2 = messageSchema;
                                        extensionRegistryLite2 = extensionRegistryLite3;
                                        fieldSetD = fieldSetD;
                                        iArr = iArr;
                                        obj7 = objF;
                                        UnsafeUtil.f21417c.s(obj4, A(iK), reader.readFloat());
                                        messageSchema2.F(i17, obj4);
                                        obj5 = obj7;
                                        objF2 = obj5;
                                        unknownFieldSchema3 = unknownFieldSchema;
                                        messageSchema = this;
                                        extensionRegistryLite3 = extensionRegistryLite2;
                                        iArr = iArr;
                                        fieldSetD = fieldSetD;
                                        break;
                                    case 2:
                                        MessageSchema<T> messageSchema3 = messageSchema;
                                        extensionRegistryLite2 = extensionRegistryLite3;
                                        fieldSetD = fieldSetD;
                                        iArr = iArr;
                                        obj7 = objF;
                                        UnsafeUtil.q(obj4, A(iK), reader.N());
                                        messageSchema3.F(i17, obj4);
                                        obj5 = obj7;
                                        objF2 = obj5;
                                        unknownFieldSchema3 = unknownFieldSchema;
                                        messageSchema = this;
                                        extensionRegistryLite3 = extensionRegistryLite2;
                                        iArr = iArr;
                                        fieldSetD = fieldSetD;
                                        break;
                                    case 3:
                                        MessageSchema<T> messageSchema4 = messageSchema;
                                        extensionRegistryLite2 = extensionRegistryLite3;
                                        fieldSetD = fieldSetD;
                                        iArr = iArr;
                                        obj7 = objF;
                                        UnsafeUtil.q(obj4, A(iK), reader.b());
                                        messageSchema4.F(i17, obj4);
                                        obj5 = obj7;
                                        objF2 = obj5;
                                        unknownFieldSchema3 = unknownFieldSchema;
                                        messageSchema = this;
                                        extensionRegistryLite3 = extensionRegistryLite2;
                                        iArr = iArr;
                                        fieldSetD = fieldSetD;
                                        break;
                                    case 4:
                                        MessageSchema<T> messageSchema5 = messageSchema;
                                        extensionRegistryLite2 = extensionRegistryLite3;
                                        fieldSetD = fieldSetD;
                                        iArr = iArr;
                                        obj7 = objF;
                                        UnsafeUtil.p(A(iK), obj4, reader.I());
                                        messageSchema5.F(i17, obj4);
                                        obj5 = obj7;
                                        objF2 = obj5;
                                        unknownFieldSchema3 = unknownFieldSchema;
                                        messageSchema = this;
                                        extensionRegistryLite3 = extensionRegistryLite2;
                                        iArr = iArr;
                                        fieldSetD = fieldSetD;
                                        break;
                                    case 5:
                                        MessageSchema<T> messageSchema6 = messageSchema;
                                        extensionRegistryLite2 = extensionRegistryLite3;
                                        fieldSetD = fieldSetD;
                                        iArr = iArr;
                                        obj7 = objF;
                                        UnsafeUtil.q(obj4, A(iK), reader.c());
                                        messageSchema6.F(i17, obj4);
                                        obj5 = obj7;
                                        objF2 = obj5;
                                        unknownFieldSchema3 = unknownFieldSchema;
                                        messageSchema = this;
                                        extensionRegistryLite3 = extensionRegistryLite2;
                                        iArr = iArr;
                                        fieldSetD = fieldSetD;
                                        break;
                                    case 6:
                                        MessageSchema<T> messageSchema7 = messageSchema;
                                        extensionRegistryLite2 = extensionRegistryLite3;
                                        fieldSetD = fieldSetD;
                                        iArr = iArr;
                                        obj7 = objF;
                                        UnsafeUtil.p(A(iK), obj4, reader.j());
                                        messageSchema7.F(i17, obj4);
                                        obj5 = obj7;
                                        objF2 = obj5;
                                        unknownFieldSchema3 = unknownFieldSchema;
                                        messageSchema = this;
                                        extensionRegistryLite3 = extensionRegistryLite2;
                                        iArr = iArr;
                                        fieldSetD = fieldSetD;
                                        break;
                                    case 7:
                                        MessageSchema<T> messageSchema8 = messageSchema;
                                        extensionRegistryLite2 = extensionRegistryLite3;
                                        fieldSetD = fieldSetD;
                                        iArr = iArr;
                                        obj7 = objF;
                                        UnsafeUtil.f21417c.o(obj4, iK & 1048575, reader.k());
                                        messageSchema8.F(i17, obj4);
                                        obj5 = obj7;
                                        objF2 = obj5;
                                        unknownFieldSchema3 = unknownFieldSchema;
                                        messageSchema = this;
                                        extensionRegistryLite3 = extensionRegistryLite2;
                                        iArr = iArr;
                                        fieldSetD = fieldSetD;
                                        break;
                                    case 8:
                                        MessageSchema<T> messageSchema9 = messageSchema;
                                        extensionRegistryLite2 = extensionRegistryLite3;
                                        fieldSetD = fieldSetD;
                                        iArr = iArr;
                                        obj7 = objF;
                                        messageSchema9.D(iK, reader, obj4);
                                        messageSchema9.F(i17, obj4);
                                        obj5 = obj7;
                                        objF2 = obj5;
                                        unknownFieldSchema3 = unknownFieldSchema;
                                        messageSchema = this;
                                        extensionRegistryLite3 = extensionRegistryLite2;
                                        iArr = iArr;
                                        fieldSetD = fieldSetD;
                                        break;
                                    case 9:
                                        MessageSchema<T> messageSchema10 = messageSchema;
                                        extensionRegistryLite2 = extensionRegistryLite3;
                                        fieldSetD = fieldSetD;
                                        iArr = iArr;
                                        obj7 = objF;
                                        MessageLite messageLite = (MessageLite) messageSchema10.w(i17, obj4);
                                        reader.D(messageLite, messageSchema10.o(i17), extensionRegistryLite2);
                                        messageSchema10.H(i17, obj4, messageLite);
                                        obj5 = obj7;
                                        objF2 = obj5;
                                        unknownFieldSchema3 = unknownFieldSchema;
                                        messageSchema = this;
                                        extensionRegistryLite3 = extensionRegistryLite2;
                                        iArr = iArr;
                                        fieldSetD = fieldSetD;
                                        break;
                                    case 10:
                                        MessageSchema<T> messageSchema11 = messageSchema;
                                        extensionRegistryLite2 = extensionRegistryLite3;
                                        fieldSetD = fieldSetD;
                                        iArr = iArr;
                                        obj7 = objF;
                                        UnsafeUtil.r(obj4, iK & 1048575, reader.G());
                                        messageSchema11.F(i17, obj4);
                                        obj5 = obj7;
                                        objF2 = obj5;
                                        unknownFieldSchema3 = unknownFieldSchema;
                                        messageSchema = this;
                                        extensionRegistryLite3 = extensionRegistryLite2;
                                        iArr = iArr;
                                        fieldSetD = fieldSetD;
                                        break;
                                    case 11:
                                        MessageSchema<T> messageSchema12 = messageSchema;
                                        extensionRegistryLite2 = extensionRegistryLite3;
                                        fieldSetD = fieldSetD;
                                        iArr = iArr;
                                        obj7 = objF;
                                        UnsafeUtil.p(iK & 1048575, obj4, reader.o());
                                        messageSchema12.F(i17, obj4);
                                        obj5 = obj7;
                                        objF2 = obj5;
                                        unknownFieldSchema3 = unknownFieldSchema;
                                        messageSchema = this;
                                        extensionRegistryLite3 = extensionRegistryLite2;
                                        iArr = iArr;
                                        fieldSetD = fieldSetD;
                                        break;
                                    case 12:
                                        MessageSchema<T> messageSchema13 = messageSchema;
                                        extensionRegistryLite2 = extensionRegistryLite3;
                                        fieldSetD = fieldSetD;
                                        iArr = iArr;
                                        obj7 = objF;
                                        int iT = reader.t();
                                        Internal.EnumVerifier enumVerifierM = messageSchema13.m(i17);
                                        if (enumVerifierM == null || enumVerifierM.a(iT)) {
                                            UnsafeUtil.p(iK & 1048575, obj4, iT);
                                            messageSchema13.F(i17, obj4);
                                            obj5 = obj7;
                                            objF2 = obj5;
                                        } else {
                                            objF2 = SchemaUtil.n(obj4, iB, iT, obj7, unknownFieldSchema);
                                        }
                                        unknownFieldSchema3 = unknownFieldSchema;
                                        messageSchema = this;
                                        extensionRegistryLite3 = extensionRegistryLite2;
                                        iArr = iArr;
                                        fieldSetD = fieldSetD;
                                        break;
                                    case 13:
                                        MessageSchema<T> messageSchema14 = messageSchema;
                                        extensionRegistryLite2 = extensionRegistryLite3;
                                        fieldSetD = fieldSetD;
                                        iArr = iArr;
                                        obj7 = objF;
                                        UnsafeUtil.p(iK & 1048575, obj4, reader.K());
                                        messageSchema14.F(i17, obj4);
                                        obj5 = obj7;
                                        objF2 = obj5;
                                        unknownFieldSchema3 = unknownFieldSchema;
                                        messageSchema = this;
                                        extensionRegistryLite3 = extensionRegistryLite2;
                                        iArr = iArr;
                                        fieldSetD = fieldSetD;
                                        break;
                                    case 14:
                                        MessageSchema<T> messageSchema15 = messageSchema;
                                        extensionRegistryLite2 = extensionRegistryLite3;
                                        fieldSetD = fieldSetD;
                                        iArr = iArr;
                                        obj7 = objF;
                                        UnsafeUtil.q(obj4, iK & 1048575, reader.m());
                                        messageSchema15.F(i17, obj4);
                                        obj5 = obj7;
                                        objF2 = obj5;
                                        unknownFieldSchema3 = unknownFieldSchema;
                                        messageSchema = this;
                                        extensionRegistryLite3 = extensionRegistryLite2;
                                        iArr = iArr;
                                        fieldSetD = fieldSetD;
                                        break;
                                    case 15:
                                        MessageSchema<T> messageSchema16 = messageSchema;
                                        extensionRegistryLite2 = extensionRegistryLite3;
                                        fieldSetD = fieldSetD;
                                        iArr = iArr;
                                        obj7 = objF;
                                        UnsafeUtil.p(iK & 1048575, obj4, reader.w());
                                        messageSchema16.F(i17, obj4);
                                        obj5 = obj7;
                                        objF2 = obj5;
                                        unknownFieldSchema3 = unknownFieldSchema;
                                        messageSchema = this;
                                        extensionRegistryLite3 = extensionRegistryLite2;
                                        iArr = iArr;
                                        fieldSetD = fieldSetD;
                                        break;
                                    case 16:
                                        messageSchema = messageSchema;
                                        extensionRegistryLite2 = extensionRegistryLite3;
                                        obj2 = obj4;
                                        obj7 = objF;
                                        reader2 = reader;
                                        fieldSetD = fieldSetD;
                                        iArr = iArr;
                                        try {
                                            UnsafeUtil.q(obj2, iK & 1048575, reader2.x());
                                            messageSchema.F(i17, obj2);
                                            obj5 = obj7;
                                            objF2 = obj5;
                                        } catch (InvalidProtocolBufferException.InvalidWireTypeException unused6) {
                                            objF2 = obj7;
                                            unknownFieldSchema.getClass();
                                            if (objF2 == null) {
                                                objF2 = unknownFieldSchema.f(obj2);
                                            }
                                            if (!unknownFieldSchema.l(0, reader2, objF2)) {
                                                objL3 = objF2;
                                                while (i13 < i12) {
                                                    objL3 = messageSchema.l(obj2, iArr[i13], objL3, unknownFieldSchema, obj);
                                                    i13++;
                                                    messageSchema = this;
                                                }
                                                unknownFieldSchema2 = unknownFieldSchema;
                                                if (objL3 != null) {
                                                    unknownFieldSchema2.n(obj2, objL3);
                                                    return;
                                                }
                                                return;
                                            }
                                        } catch (Throwable th8) {
                                            th = th8;
                                            objF2 = obj7;
                                            unknownFieldSchema3 = unknownFieldSchema;
                                            objL = objF2;
                                            while (i13 < i12) {
                                                objL = l(obj2, iArr[i13], objL, unknownFieldSchema3, obj);
                                                i13++;
                                            }
                                            if (objL != null) {
                                                unknownFieldSchema3.n(obj2, objL);
                                            }
                                            throw th;
                                        }
                                        unknownFieldSchema3 = unknownFieldSchema;
                                        messageSchema = this;
                                        extensionRegistryLite3 = extensionRegistryLite2;
                                        iArr = iArr;
                                        fieldSetD = fieldSetD;
                                        break;
                                    case 17:
                                        MessageSchema<T> messageSchema17 = messageSchema;
                                        extensionRegistryLite2 = extensionRegistryLite3;
                                        obj7 = objF;
                                        MessageLite messageLite2 = (MessageLite) messageSchema17.w(i17, obj4);
                                        reader.i(messageLite2, messageSchema17.o(i17), extensionRegistryLite2);
                                        messageSchema17.H(i17, obj4, messageLite2);
                                        fieldSetD = fieldSetD;
                                        iArr = iArr;
                                        obj5 = obj7;
                                        objF2 = obj5;
                                        unknownFieldSchema3 = unknownFieldSchema;
                                        messageSchema = this;
                                        extensionRegistryLite3 = extensionRegistryLite2;
                                        iArr = iArr;
                                        fieldSetD = fieldSetD;
                                        break;
                                    case 18:
                                        extensionRegistryLite2 = extensionRegistryLite3;
                                        obj7 = objF;
                                        reader.M(listFieldSchema.c(iK & 1048575, obj4));
                                        fieldSetD = fieldSetD;
                                        iArr = iArr;
                                        obj5 = obj7;
                                        objF2 = obj5;
                                        unknownFieldSchema3 = unknownFieldSchema;
                                        messageSchema = this;
                                        extensionRegistryLite3 = extensionRegistryLite2;
                                        iArr = iArr;
                                        fieldSetD = fieldSetD;
                                        break;
                                    case 19:
                                        extensionRegistryLite2 = extensionRegistryLite3;
                                        obj7 = objF;
                                        reader.H(listFieldSchema.c(iK & 1048575, obj4));
                                        fieldSetD = fieldSetD;
                                        iArr = iArr;
                                        obj5 = obj7;
                                        objF2 = obj5;
                                        unknownFieldSchema3 = unknownFieldSchema;
                                        messageSchema = this;
                                        extensionRegistryLite3 = extensionRegistryLite2;
                                        iArr = iArr;
                                        fieldSetD = fieldSetD;
                                        break;
                                    case 20:
                                        extensionRegistryLite2 = extensionRegistryLite3;
                                        obj7 = objF;
                                        reader.p(listFieldSchema.c(iK & 1048575, obj4));
                                        fieldSetD = fieldSetD;
                                        iArr = iArr;
                                        obj5 = obj7;
                                        objF2 = obj5;
                                        unknownFieldSchema3 = unknownFieldSchema;
                                        messageSchema = this;
                                        extensionRegistryLite3 = extensionRegistryLite2;
                                        iArr = iArr;
                                        fieldSetD = fieldSetD;
                                        break;
                                    case 21:
                                        extensionRegistryLite2 = extensionRegistryLite3;
                                        obj7 = objF;
                                        reader.n(listFieldSchema.c(iK & 1048575, obj4));
                                        fieldSetD = fieldSetD;
                                        iArr = iArr;
                                        obj5 = obj7;
                                        objF2 = obj5;
                                        unknownFieldSchema3 = unknownFieldSchema;
                                        messageSchema = this;
                                        extensionRegistryLite3 = extensionRegistryLite2;
                                        iArr = iArr;
                                        fieldSetD = fieldSetD;
                                        break;
                                    case 22:
                                        extensionRegistryLite2 = extensionRegistryLite3;
                                        obj7 = objF;
                                        reader.r(listFieldSchema.c(iK & 1048575, obj4));
                                        fieldSetD = fieldSetD;
                                        iArr = iArr;
                                        obj5 = obj7;
                                        objF2 = obj5;
                                        unknownFieldSchema3 = unknownFieldSchema;
                                        messageSchema = this;
                                        extensionRegistryLite3 = extensionRegistryLite2;
                                        iArr = iArr;
                                        fieldSetD = fieldSetD;
                                        break;
                                    case 23:
                                        extensionRegistryLite2 = extensionRegistryLite3;
                                        obj7 = objF;
                                        reader.P(listFieldSchema.c(iK & 1048575, obj4));
                                        fieldSetD = fieldSetD;
                                        iArr = iArr;
                                        obj5 = obj7;
                                        objF2 = obj5;
                                        unknownFieldSchema3 = unknownFieldSchema;
                                        messageSchema = this;
                                        extensionRegistryLite3 = extensionRegistryLite2;
                                        iArr = iArr;
                                        fieldSetD = fieldSetD;
                                        break;
                                    case Service.METRICS_FIELD_NUMBER /* 24 */:
                                        extensionRegistryLite2 = extensionRegistryLite3;
                                        obj7 = objF;
                                        reader.v(listFieldSchema.c(iK & 1048575, obj4));
                                        fieldSetD = fieldSetD;
                                        iArr = iArr;
                                        obj5 = obj7;
                                        objF2 = obj5;
                                        unknownFieldSchema3 = unknownFieldSchema;
                                        messageSchema = this;
                                        extensionRegistryLite3 = extensionRegistryLite2;
                                        iArr = iArr;
                                        fieldSetD = fieldSetD;
                                        break;
                                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                                        extensionRegistryLite2 = extensionRegistryLite3;
                                        obj7 = objF;
                                        reader.y(listFieldSchema.c(iK & 1048575, obj4));
                                        fieldSetD = fieldSetD;
                                        iArr = iArr;
                                        obj5 = obj7;
                                        objF2 = obj5;
                                        unknownFieldSchema3 = unknownFieldSchema;
                                        messageSchema = this;
                                        extensionRegistryLite3 = extensionRegistryLite2;
                                        iArr = iArr;
                                        fieldSetD = fieldSetD;
                                        break;
                                    case Service.BILLING_FIELD_NUMBER /* 26 */:
                                        extensionRegistryLite2 = extensionRegistryLite3;
                                        obj7 = objF;
                                        if ((536870912 & iK) != 0) {
                                            reader.F(listFieldSchema.c(iK & 1048575, obj4));
                                        } else {
                                            reader.C(listFieldSchema.c(iK & 1048575, obj4));
                                        }
                                        fieldSetD = fieldSetD;
                                        iArr = iArr;
                                        obj5 = obj7;
                                        objF2 = obj5;
                                        unknownFieldSchema3 = unknownFieldSchema;
                                        messageSchema = this;
                                        extensionRegistryLite3 = extensionRegistryLite2;
                                        iArr = iArr;
                                        fieldSetD = fieldSetD;
                                        break;
                                    case 27:
                                        MessageSchema<T> messageSchema18 = messageSchema;
                                        extensionRegistryLite2 = extensionRegistryLite3;
                                        obj7 = objF;
                                        reader.l(listFieldSchema.c(iK & 1048575, obj4), messageSchema18.o(i17), extensionRegistryLite2);
                                        fieldSetD = fieldSetD;
                                        iArr = iArr;
                                        obj5 = obj7;
                                        objF2 = obj5;
                                        unknownFieldSchema3 = unknownFieldSchema;
                                        messageSchema = this;
                                        extensionRegistryLite3 = extensionRegistryLite2;
                                        iArr = iArr;
                                        fieldSetD = fieldSetD;
                                        break;
                                    case Service.MONITORING_FIELD_NUMBER /* 28 */:
                                        extensionRegistryLite2 = extensionRegistryLite3;
                                        obj7 = objF;
                                        reader.L(listFieldSchema.c(iK & 1048575, obj4));
                                        fieldSetD = fieldSetD;
                                        iArr = iArr;
                                        obj5 = obj7;
                                        objF2 = obj5;
                                        unknownFieldSchema3 = unknownFieldSchema;
                                        messageSchema = this;
                                        extensionRegistryLite3 = extensionRegistryLite2;
                                        iArr = iArr;
                                        fieldSetD = fieldSetD;
                                        break;
                                    case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
                                        messageSchema = messageSchema;
                                        extensionRegistryLite2 = extensionRegistryLite3;
                                        obj2 = obj4;
                                        obj7 = objF;
                                        reader2 = reader;
                                        try {
                                            reader2.g(listFieldSchema.c(iK & 1048575, obj2));
                                            fieldSetD = fieldSetD;
                                            iArr = iArr;
                                            obj5 = obj7;
                                            objF2 = obj5;
                                        } catch (InvalidProtocolBufferException.InvalidWireTypeException unused7) {
                                            objF2 = obj7;
                                            fieldSetD = fieldSetD;
                                            iArr = iArr;
                                            unknownFieldSchema.getClass();
                                            if (objF2 == null) {
                                                objF2 = unknownFieldSchema.f(obj2);
                                            }
                                            if (!unknownFieldSchema.l(0, reader2, objF2)) {
                                                objL3 = objF2;
                                                while (i13 < i12) {
                                                    objL3 = messageSchema.l(obj2, iArr[i13], objL3, unknownFieldSchema, obj);
                                                    i13++;
                                                    messageSchema = this;
                                                }
                                                unknownFieldSchema2 = unknownFieldSchema;
                                                if (objL3 != null) {
                                                    unknownFieldSchema2.n(obj2, objL3);
                                                    return;
                                                }
                                                return;
                                            }
                                        } catch (Throwable th9) {
                                            th = th9;
                                            objF2 = obj7;
                                            iArr = iArr;
                                            unknownFieldSchema3 = unknownFieldSchema;
                                            objL = objF2;
                                            while (i13 < i12) {
                                                objL = l(obj2, iArr[i13], objL, unknownFieldSchema3, obj);
                                                i13++;
                                            }
                                            if (objL != null) {
                                                unknownFieldSchema3.n(obj2, objL);
                                            }
                                            throw th;
                                        }
                                        unknownFieldSchema3 = unknownFieldSchema;
                                        messageSchema = this;
                                        extensionRegistryLite3 = extensionRegistryLite2;
                                        iArr = iArr;
                                        fieldSetD = fieldSetD;
                                        break;
                                    case 30:
                                        messageSchema = messageSchema;
                                        extensionRegistryLite2 = extensionRegistryLite3;
                                        obj2 = obj4;
                                        unknownFieldSchema3 = unknownFieldSchema;
                                        reader2 = reader;
                                        try {
                                            List listC = listFieldSchema.c(iK & 1048575, obj2);
                                            reader2.s(listC);
                                            try {
                                                unknownFieldSchema = unknownFieldSchema3;
                                                objF2 = SchemaUtil.k(obj2, iB, listC, messageSchema.m(i17), objF, unknownFieldSchema3);
                                                fieldSetD = fieldSetD;
                                                iArr = iArr;
                                            } catch (InvalidProtocolBufferException.InvalidWireTypeException unused8) {
                                                obj2 = obj2;
                                                obj7 = objF;
                                                unknownFieldSchema = unknownFieldSchema3;
                                                objF2 = obj7;
                                                fieldSetD = fieldSetD;
                                                iArr = iArr;
                                                unknownFieldSchema.getClass();
                                                if (objF2 == null) {
                                                    objF2 = unknownFieldSchema.f(obj2);
                                                }
                                                if (!unknownFieldSchema.l(0, reader2, objF2)) {
                                                    objL3 = objF2;
                                                    while (i13 < i12) {
                                                        objL3 = messageSchema.l(obj2, iArr[i13], objL3, unknownFieldSchema, obj);
                                                        i13++;
                                                        messageSchema = this;
                                                    }
                                                    unknownFieldSchema2 = unknownFieldSchema;
                                                    if (objL3 != null) {
                                                        unknownFieldSchema2.n(obj2, objL3);
                                                        return;
                                                    }
                                                    return;
                                                }
                                            } catch (Throwable th10) {
                                                th = th10;
                                                obj2 = obj2;
                                                obj7 = objF;
                                                unknownFieldSchema = unknownFieldSchema3;
                                                objF2 = obj7;
                                                iArr = iArr;
                                                unknownFieldSchema3 = unknownFieldSchema;
                                                objL = objF2;
                                                while (i13 < i12) {
                                                    objL = l(obj2, iArr[i13], objL, unknownFieldSchema3, obj);
                                                    i13++;
                                                }
                                                if (objL != null) {
                                                    unknownFieldSchema3.n(obj2, objL);
                                                }
                                                throw th;
                                            }
                                        } catch (InvalidProtocolBufferException.InvalidWireTypeException unused9) {
                                            unknownFieldSchema = unknownFieldSchema3;
                                            obj7 = objF;
                                        } catch (Throwable th11) {
                                            th = th11;
                                            objF2 = objF;
                                            iArr = iArr;
                                            objL = objF2;
                                            while (i13 < i12) {
                                                objL = l(obj2, iArr[i13], objL, unknownFieldSchema3, obj);
                                                i13++;
                                            }
                                            if (objL != null) {
                                                unknownFieldSchema3.n(obj2, objL);
                                            }
                                            throw th;
                                        }
                                        unknownFieldSchema3 = unknownFieldSchema;
                                        messageSchema = this;
                                        extensionRegistryLite3 = extensionRegistryLite2;
                                        iArr = iArr;
                                        fieldSetD = fieldSetD;
                                        break;
                                    case 31:
                                        extensionRegistryLite2 = extensionRegistryLite3;
                                        unknownFieldSchema3 = unknownFieldSchema;
                                        obj6 = objF;
                                        reader.d(listFieldSchema.c(iK & 1048575, obj4));
                                        obj5 = obj6;
                                        unknownFieldSchema = unknownFieldSchema3;
                                        iArr = iArr;
                                        objF2 = obj5;
                                        unknownFieldSchema3 = unknownFieldSchema;
                                        messageSchema = this;
                                        extensionRegistryLite3 = extensionRegistryLite2;
                                        iArr = iArr;
                                        fieldSetD = fieldSetD;
                                        break;
                                    case Consts.SP /* 32 */:
                                        extensionRegistryLite2 = extensionRegistryLite3;
                                        unknownFieldSchema3 = unknownFieldSchema;
                                        obj6 = objF;
                                        reader.q(listFieldSchema.c(iK & 1048575, obj4));
                                        obj5 = obj6;
                                        unknownFieldSchema = unknownFieldSchema3;
                                        iArr = iArr;
                                        objF2 = obj5;
                                        unknownFieldSchema3 = unknownFieldSchema;
                                        messageSchema = this;
                                        extensionRegistryLite3 = extensionRegistryLite2;
                                        iArr = iArr;
                                        fieldSetD = fieldSetD;
                                        break;
                                    case 33:
                                        extensionRegistryLite2 = extensionRegistryLite3;
                                        unknownFieldSchema3 = unknownFieldSchema;
                                        obj6 = objF;
                                        reader.a(listFieldSchema.c(iK & 1048575, obj4));
                                        obj5 = obj6;
                                        unknownFieldSchema = unknownFieldSchema3;
                                        iArr = iArr;
                                        objF2 = obj5;
                                        unknownFieldSchema3 = unknownFieldSchema;
                                        messageSchema = this;
                                        extensionRegistryLite3 = extensionRegistryLite2;
                                        iArr = iArr;
                                        fieldSetD = fieldSetD;
                                        break;
                                    case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                                        extensionRegistryLite2 = extensionRegistryLite3;
                                        unknownFieldSchema3 = unknownFieldSchema;
                                        obj6 = objF;
                                        reader.e(listFieldSchema.c(iK & 1048575, obj4));
                                        obj5 = obj6;
                                        unknownFieldSchema = unknownFieldSchema3;
                                        iArr = iArr;
                                        objF2 = obj5;
                                        unknownFieldSchema3 = unknownFieldSchema;
                                        messageSchema = this;
                                        extensionRegistryLite3 = extensionRegistryLite2;
                                        iArr = iArr;
                                        fieldSetD = fieldSetD;
                                        break;
                                    case 35:
                                        extensionRegistryLite2 = extensionRegistryLite3;
                                        unknownFieldSchema3 = unknownFieldSchema;
                                        obj6 = objF;
                                        reader.M(listFieldSchema.c(iK & 1048575, obj4));
                                        obj5 = obj6;
                                        unknownFieldSchema = unknownFieldSchema3;
                                        iArr = iArr;
                                        objF2 = obj5;
                                        unknownFieldSchema3 = unknownFieldSchema;
                                        messageSchema = this;
                                        extensionRegistryLite3 = extensionRegistryLite2;
                                        iArr = iArr;
                                        fieldSetD = fieldSetD;
                                        break;
                                    case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                                        extensionRegistryLite2 = extensionRegistryLite3;
                                        unknownFieldSchema3 = unknownFieldSchema;
                                        obj6 = objF;
                                        reader.H(listFieldSchema.c(iK & 1048575, obj4));
                                        obj5 = obj6;
                                        unknownFieldSchema = unknownFieldSchema3;
                                        iArr = iArr;
                                        objF2 = obj5;
                                        unknownFieldSchema3 = unknownFieldSchema;
                                        messageSchema = this;
                                        extensionRegistryLite3 = extensionRegistryLite2;
                                        iArr = iArr;
                                        fieldSetD = fieldSetD;
                                        break;
                                    case 37:
                                        extensionRegistryLite2 = extensionRegistryLite3;
                                        unknownFieldSchema3 = unknownFieldSchema;
                                        obj6 = objF;
                                        reader.p(listFieldSchema.c(iK & 1048575, obj4));
                                        obj5 = obj6;
                                        unknownFieldSchema = unknownFieldSchema3;
                                        iArr = iArr;
                                        objF2 = obj5;
                                        unknownFieldSchema3 = unknownFieldSchema;
                                        messageSchema = this;
                                        extensionRegistryLite3 = extensionRegistryLite2;
                                        iArr = iArr;
                                        fieldSetD = fieldSetD;
                                        break;
                                    case 38:
                                        extensionRegistryLite2 = extensionRegistryLite3;
                                        unknownFieldSchema3 = unknownFieldSchema;
                                        obj6 = objF;
                                        reader.n(listFieldSchema.c(iK & 1048575, obj4));
                                        obj5 = obj6;
                                        unknownFieldSchema = unknownFieldSchema3;
                                        iArr = iArr;
                                        objF2 = obj5;
                                        unknownFieldSchema3 = unknownFieldSchema;
                                        messageSchema = this;
                                        extensionRegistryLite3 = extensionRegistryLite2;
                                        iArr = iArr;
                                        fieldSetD = fieldSetD;
                                        break;
                                    case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                                        extensionRegistryLite2 = extensionRegistryLite3;
                                        unknownFieldSchema3 = unknownFieldSchema;
                                        obj6 = objF;
                                        reader.r(listFieldSchema.c(iK & 1048575, obj4));
                                        obj5 = obj6;
                                        unknownFieldSchema = unknownFieldSchema3;
                                        iArr = iArr;
                                        objF2 = obj5;
                                        unknownFieldSchema3 = unknownFieldSchema;
                                        messageSchema = this;
                                        extensionRegistryLite3 = extensionRegistryLite2;
                                        iArr = iArr;
                                        fieldSetD = fieldSetD;
                                        break;
                                    case DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                                        extensionRegistryLite2 = extensionRegistryLite3;
                                        unknownFieldSchema3 = unknownFieldSchema;
                                        obj6 = objF;
                                        reader.P(listFieldSchema.c(iK & 1048575, obj4));
                                        obj5 = obj6;
                                        unknownFieldSchema = unknownFieldSchema3;
                                        iArr = iArr;
                                        objF2 = obj5;
                                        unknownFieldSchema3 = unknownFieldSchema;
                                        messageSchema = this;
                                        extensionRegistryLite3 = extensionRegistryLite2;
                                        iArr = iArr;
                                        fieldSetD = fieldSetD;
                                        break;
                                    case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                                        extensionRegistryLite2 = extensionRegistryLite3;
                                        unknownFieldSchema3 = unknownFieldSchema;
                                        obj6 = objF;
                                        reader.v(listFieldSchema.c(iK & 1048575, obj4));
                                        obj5 = obj6;
                                        unknownFieldSchema = unknownFieldSchema3;
                                        iArr = iArr;
                                        objF2 = obj5;
                                        unknownFieldSchema3 = unknownFieldSchema;
                                        messageSchema = this;
                                        extensionRegistryLite3 = extensionRegistryLite2;
                                        iArr = iArr;
                                        fieldSetD = fieldSetD;
                                        break;
                                    case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                                        extensionRegistryLite2 = extensionRegistryLite3;
                                        unknownFieldSchema3 = unknownFieldSchema;
                                        obj6 = objF;
                                        reader.y(listFieldSchema.c(iK & 1048575, obj4));
                                        obj5 = obj6;
                                        unknownFieldSchema = unknownFieldSchema3;
                                        iArr = iArr;
                                        objF2 = obj5;
                                        unknownFieldSchema3 = unknownFieldSchema;
                                        messageSchema = this;
                                        extensionRegistryLite3 = extensionRegistryLite2;
                                        iArr = iArr;
                                        fieldSetD = fieldSetD;
                                        break;
                                    case 43:
                                        messageSchema = messageSchema;
                                        extensionRegistryLite2 = extensionRegistryLite3;
                                        obj2 = obj4;
                                        unknownFieldSchema3 = unknownFieldSchema;
                                        obj6 = objF;
                                        reader2 = reader;
                                        try {
                                            reader2.g(listFieldSchema.c(iK & 1048575, obj2));
                                            obj5 = obj6;
                                            unknownFieldSchema = unknownFieldSchema3;
                                            iArr = iArr;
                                            objF2 = obj5;
                                        } catch (InvalidProtocolBufferException.InvalidWireTypeException unused10) {
                                            unknownFieldSchema = unknownFieldSchema3;
                                            iArr = iArr;
                                            objF2 = obj6;
                                            fieldSetD = fieldSetD;
                                            unknownFieldSchema.getClass();
                                            if (objF2 == null) {
                                                objF2 = unknownFieldSchema.f(obj2);
                                            }
                                            if (!unknownFieldSchema.l(0, reader2, objF2)) {
                                                objL3 = objF2;
                                                while (i13 < i12) {
                                                    objL3 = messageSchema.l(obj2, iArr[i13], objL3, unknownFieldSchema, obj);
                                                    i13++;
                                                    messageSchema = this;
                                                }
                                                unknownFieldSchema2 = unknownFieldSchema;
                                                if (objL3 != null) {
                                                    unknownFieldSchema2.n(obj2, objL3);
                                                    return;
                                                }
                                                return;
                                            }
                                        } catch (Throwable th12) {
                                            th = th12;
                                            objF2 = obj6;
                                            objL = objF2;
                                            while (i13 < i12) {
                                                objL = l(obj2, iArr[i13], objL, unknownFieldSchema3, obj);
                                                i13++;
                                            }
                                            if (objL != null) {
                                                unknownFieldSchema3.n(obj2, objL);
                                            }
                                            throw th;
                                        }
                                        unknownFieldSchema3 = unknownFieldSchema;
                                        messageSchema = this;
                                        extensionRegistryLite3 = extensionRegistryLite2;
                                        iArr = iArr;
                                        fieldSetD = fieldSetD;
                                        break;
                                    case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                                        messageSchema = messageSchema;
                                        extensionRegistryLite2 = extensionRegistryLite3;
                                        obj6 = objF;
                                        reader2 = reader;
                                        try {
                                            List listC2 = listFieldSchema.c(iK & 1048575, obj4);
                                            reader2.s(listC2);
                                            try {
                                                objF2 = SchemaUtil.k(obj4, iB, listC2, messageSchema.m(i17), obj6, unknownFieldSchema);
                                                unknownFieldSchema = unknownFieldSchema;
                                                fieldSetD = fieldSetD;
                                                iArr = iArr;
                                            } catch (InvalidProtocolBufferException.InvalidWireTypeException unused11) {
                                                obj6 = obj6;
                                                obj2 = obj4;
                                                unknownFieldSchema = unknownFieldSchema;
                                                iArr = iArr;
                                                objF2 = obj6;
                                                fieldSetD = fieldSetD;
                                                unknownFieldSchema.getClass();
                                                if (objF2 == null) {
                                                    objF2 = unknownFieldSchema.f(obj2);
                                                }
                                                if (!unknownFieldSchema.l(0, reader2, objF2)) {
                                                    objL3 = objF2;
                                                    while (i13 < i12) {
                                                        objL3 = messageSchema.l(obj2, iArr[i13], objL3, unknownFieldSchema, obj);
                                                        i13++;
                                                        messageSchema = this;
                                                    }
                                                    unknownFieldSchema2 = unknownFieldSchema;
                                                    if (objL3 != null) {
                                                        unknownFieldSchema2.n(obj2, objL3);
                                                        return;
                                                    }
                                                    return;
                                                }
                                            } catch (Throwable th13) {
                                                th = th13;
                                                obj2 = obj4;
                                                obj6 = obj6;
                                                unknownFieldSchema3 = unknownFieldSchema;
                                                objF2 = obj6;
                                                objL = objF2;
                                                while (i13 < i12) {
                                                    objL = l(obj2, iArr[i13], objL, unknownFieldSchema3, obj);
                                                    i13++;
                                                }
                                                if (objL != null) {
                                                    unknownFieldSchema3.n(obj2, objL);
                                                }
                                                throw th;
                                            }
                                            unknownFieldSchema3 = unknownFieldSchema;
                                            messageSchema = this;
                                            extensionRegistryLite3 = extensionRegistryLite2;
                                            iArr = iArr;
                                            fieldSetD = fieldSetD;
                                        } catch (Throwable th14) {
                                            th = th14;
                                            obj2 = obj4;
                                            unknownFieldSchema3 = unknownFieldSchema;
                                        }
                                        break;
                                    case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                        extensionRegistryLite2 = extensionRegistryLite3;
                                        obj8 = obj4;
                                        obj6 = objF;
                                        reader.d(listFieldSchema.c(iK & 1048575, obj8));
                                        obj5 = obj6;
                                        iArr = iArr;
                                        objF2 = obj5;
                                        unknownFieldSchema3 = unknownFieldSchema;
                                        messageSchema = this;
                                        extensionRegistryLite3 = extensionRegistryLite2;
                                        iArr = iArr;
                                        fieldSetD = fieldSetD;
                                        break;
                                    case 46:
                                        extensionRegistryLite2 = extensionRegistryLite3;
                                        obj8 = obj4;
                                        obj6 = objF;
                                        reader.q(listFieldSchema.c(iK & 1048575, obj8));
                                        obj5 = obj6;
                                        iArr = iArr;
                                        objF2 = obj5;
                                        unknownFieldSchema3 = unknownFieldSchema;
                                        messageSchema = this;
                                        extensionRegistryLite3 = extensionRegistryLite2;
                                        iArr = iArr;
                                        fieldSetD = fieldSetD;
                                        break;
                                    case 47:
                                        extensionRegistryLite2 = extensionRegistryLite3;
                                        obj8 = obj4;
                                        obj6 = objF;
                                        reader.a(listFieldSchema.c(iK & 1048575, obj8));
                                        obj5 = obj6;
                                        iArr = iArr;
                                        objF2 = obj5;
                                        unknownFieldSchema3 = unknownFieldSchema;
                                        messageSchema = this;
                                        extensionRegistryLite3 = extensionRegistryLite2;
                                        iArr = iArr;
                                        fieldSetD = fieldSetD;
                                        break;
                                    case 48:
                                        extensionRegistryLite2 = extensionRegistryLite3;
                                        obj8 = obj4;
                                        obj6 = objF;
                                        reader.e(listFieldSchema.c(iK & 1048575, obj8));
                                        obj5 = obj6;
                                        iArr = iArr;
                                        objF2 = obj5;
                                        unknownFieldSchema3 = unknownFieldSchema;
                                        messageSchema = this;
                                        extensionRegistryLite3 = extensionRegistryLite2;
                                        iArr = iArr;
                                        fieldSetD = fieldSetD;
                                        break;
                                    case 49:
                                        messageSchema = messageSchema;
                                        extensionRegistryLite2 = extensionRegistryLite3;
                                        obj8 = obj4;
                                        obj6 = objF;
                                        reader2 = reader;
                                        try {
                                            try {
                                                reader2.f(listFieldSchema.c(iK & 1048575, obj8), messageSchema.o(i17), extensionRegistryLite2);
                                                obj5 = obj6;
                                                iArr = iArr;
                                                objF2 = obj5;
                                            } catch (InvalidProtocolBufferException.InvalidWireTypeException unused12) {
                                                obj2 = obj8;
                                                iArr = iArr;
                                                objF2 = obj6;
                                                fieldSetD = fieldSetD;
                                                unknownFieldSchema.getClass();
                                                if (objF2 == null) {
                                                    objF2 = unknownFieldSchema.f(obj2);
                                                }
                                                if (!unknownFieldSchema.l(0, reader2, objF2)) {
                                                    objL3 = objF2;
                                                    while (i13 < i12) {
                                                        objL3 = messageSchema.l(obj2, iArr[i13], objL3, unknownFieldSchema, obj);
                                                        i13++;
                                                        messageSchema = this;
                                                    }
                                                    unknownFieldSchema2 = unknownFieldSchema;
                                                    if (objL3 != null) {
                                                        unknownFieldSchema2.n(obj2, objL3);
                                                        return;
                                                    }
                                                    return;
                                                }
                                            }
                                            unknownFieldSchema3 = unknownFieldSchema;
                                            messageSchema = this;
                                            extensionRegistryLite3 = extensionRegistryLite2;
                                            iArr = iArr;
                                            fieldSetD = fieldSetD;
                                        } catch (Throwable th15) {
                                            th = th15;
                                            obj2 = obj8;
                                            unknownFieldSchema3 = unknownFieldSchema;
                                            objF2 = obj6;
                                            objL = objF2;
                                            while (i13 < i12) {
                                                objL = l(obj2, iArr[i13], objL, unknownFieldSchema3, obj);
                                                i13++;
                                            }
                                            if (objL != null) {
                                                unknownFieldSchema3.n(obj2, objL);
                                            }
                                            throw th;
                                        }
                                        break;
                                    case 50:
                                        obj6 = objF;
                                        try {
                                            obj2 = obj4;
                                            try {
                                                messageSchema.t(obj2, i17, messageSchema.n(i17), extensionRegistryLite, reader);
                                                obj8 = obj2;
                                                extensionRegistryLite2 = extensionRegistryLite;
                                                obj5 = obj6;
                                                iArr = iArr;
                                                objF2 = obj5;
                                            } catch (InvalidProtocolBufferException.InvalidWireTypeException unused13) {
                                                extensionRegistryLite2 = extensionRegistryLite;
                                                reader2 = reader;
                                                iArr = iArr;
                                                objF2 = obj6;
                                                fieldSetD = fieldSetD;
                                                unknownFieldSchema.getClass();
                                                if (objF2 == null) {
                                                    objF2 = unknownFieldSchema.f(obj2);
                                                }
                                                if (!unknownFieldSchema.l(0, reader2, objF2)) {
                                                    objL3 = objF2;
                                                    while (i13 < i12) {
                                                        objL3 = messageSchema.l(obj2, iArr[i13], objL3, unknownFieldSchema, obj);
                                                        i13++;
                                                        messageSchema = this;
                                                    }
                                                    unknownFieldSchema2 = unknownFieldSchema;
                                                    if (objL3 != null) {
                                                        unknownFieldSchema2.n(obj2, objL3);
                                                        return;
                                                    }
                                                    return;
                                                }
                                            } catch (Throwable th16) {
                                                th = th16;
                                                unknownFieldSchema3 = unknownFieldSchema;
                                                objF2 = obj6;
                                                objL = objF2;
                                                while (i13 < i12) {
                                                    objL = l(obj2, iArr[i13], objL, unknownFieldSchema3, obj);
                                                    i13++;
                                                }
                                                if (objL != null) {
                                                    unknownFieldSchema3.n(obj2, objL);
                                                }
                                                throw th;
                                            }
                                        } catch (InvalidProtocolBufferException.InvalidWireTypeException unused14) {
                                            extensionRegistryLite2 = extensionRegistryLite;
                                            messageSchema = messageSchema;
                                            reader2 = reader;
                                            obj2 = obj4;
                                            iArr = iArr;
                                            objF2 = obj6;
                                            fieldSetD = fieldSetD;
                                            unknownFieldSchema.getClass();
                                            if (objF2 == null) {
                                                objF2 = unknownFieldSchema.f(obj2);
                                            }
                                            if (!unknownFieldSchema.l(0, reader2, objF2)) {
                                                objL3 = objF2;
                                                while (i13 < i12) {
                                                    objL3 = messageSchema.l(obj2, iArr[i13], objL3, unknownFieldSchema, obj);
                                                    i13++;
                                                    messageSchema = this;
                                                }
                                                unknownFieldSchema2 = unknownFieldSchema;
                                                if (objL3 != null) {
                                                    unknownFieldSchema2.n(obj2, objL3);
                                                    return;
                                                }
                                                return;
                                            }
                                        } catch (Throwable th17) {
                                            th = th17;
                                            obj8 = obj4;
                                            obj2 = obj8;
                                            unknownFieldSchema3 = unknownFieldSchema;
                                            objF2 = obj6;
                                            objL = objF2;
                                            while (i13 < i12) {
                                                objL = l(obj2, iArr[i13], objL, unknownFieldSchema3, obj);
                                                i13++;
                                            }
                                            if (objL != null) {
                                                unknownFieldSchema3.n(obj2, objL);
                                            }
                                            throw th;
                                        }
                                        unknownFieldSchema3 = unknownFieldSchema;
                                        messageSchema = this;
                                        extensionRegistryLite3 = extensionRegistryLite2;
                                        iArr = iArr;
                                        fieldSetD = fieldSetD;
                                        break;
                                    case 51:
                                        obj6 = objF;
                                        UnsafeUtil.r(obj4, iK & 1048575, Double.valueOf(reader.readDouble()));
                                        messageSchema.G(iB, i17, obj4);
                                        obj5 = obj6;
                                        extensionRegistryLite2 = extensionRegistryLite3;
                                        iArr = iArr;
                                        objF2 = obj5;
                                        unknownFieldSchema3 = unknownFieldSchema;
                                        messageSchema = this;
                                        extensionRegistryLite3 = extensionRegistryLite2;
                                        iArr = iArr;
                                        fieldSetD = fieldSetD;
                                        break;
                                    case 52:
                                        obj6 = objF;
                                        UnsafeUtil.r(obj4, iK & 1048575, Float.valueOf(reader.readFloat()));
                                        messageSchema.G(iB, i17, obj4);
                                        obj5 = obj6;
                                        extensionRegistryLite2 = extensionRegistryLite3;
                                        iArr = iArr;
                                        objF2 = obj5;
                                        unknownFieldSchema3 = unknownFieldSchema;
                                        messageSchema = this;
                                        extensionRegistryLite3 = extensionRegistryLite2;
                                        iArr = iArr;
                                        fieldSetD = fieldSetD;
                                        break;
                                    case 53:
                                        obj6 = objF;
                                        UnsafeUtil.r(obj4, iK & 1048575, Long.valueOf(reader.N()));
                                        messageSchema.G(iB, i17, obj4);
                                        obj5 = obj6;
                                        extensionRegistryLite2 = extensionRegistryLite3;
                                        iArr = iArr;
                                        objF2 = obj5;
                                        unknownFieldSchema3 = unknownFieldSchema;
                                        messageSchema = this;
                                        extensionRegistryLite3 = extensionRegistryLite2;
                                        iArr = iArr;
                                        fieldSetD = fieldSetD;
                                        break;
                                    case 54:
                                        obj6 = objF;
                                        UnsafeUtil.r(obj4, iK & 1048575, Long.valueOf(reader.b()));
                                        messageSchema.G(iB, i17, obj4);
                                        obj5 = obj6;
                                        extensionRegistryLite2 = extensionRegistryLite3;
                                        iArr = iArr;
                                        objF2 = obj5;
                                        unknownFieldSchema3 = unknownFieldSchema;
                                        messageSchema = this;
                                        extensionRegistryLite3 = extensionRegistryLite2;
                                        iArr = iArr;
                                        fieldSetD = fieldSetD;
                                        break;
                                    case 55:
                                        obj6 = objF;
                                        UnsafeUtil.r(obj4, iK & 1048575, Integer.valueOf(reader.I()));
                                        messageSchema.G(iB, i17, obj4);
                                        obj5 = obj6;
                                        extensionRegistryLite2 = extensionRegistryLite3;
                                        iArr = iArr;
                                        objF2 = obj5;
                                        unknownFieldSchema3 = unknownFieldSchema;
                                        messageSchema = this;
                                        extensionRegistryLite3 = extensionRegistryLite2;
                                        iArr = iArr;
                                        fieldSetD = fieldSetD;
                                        break;
                                    case 56:
                                        obj6 = objF;
                                        UnsafeUtil.r(obj4, iK & 1048575, Long.valueOf(reader.c()));
                                        messageSchema.G(iB, i17, obj4);
                                        obj5 = obj6;
                                        extensionRegistryLite2 = extensionRegistryLite3;
                                        iArr = iArr;
                                        objF2 = obj5;
                                        unknownFieldSchema3 = unknownFieldSchema;
                                        messageSchema = this;
                                        extensionRegistryLite3 = extensionRegistryLite2;
                                        iArr = iArr;
                                        fieldSetD = fieldSetD;
                                        break;
                                    case 57:
                                        obj6 = objF;
                                        UnsafeUtil.r(obj4, iK & 1048575, Integer.valueOf(reader.j()));
                                        messageSchema.G(iB, i17, obj4);
                                        obj5 = obj6;
                                        extensionRegistryLite2 = extensionRegistryLite3;
                                        iArr = iArr;
                                        objF2 = obj5;
                                        unknownFieldSchema3 = unknownFieldSchema;
                                        messageSchema = this;
                                        extensionRegistryLite3 = extensionRegistryLite2;
                                        iArr = iArr;
                                        fieldSetD = fieldSetD;
                                        break;
                                    case 58:
                                        obj6 = objF;
                                        UnsafeUtil.r(obj4, iK & 1048575, Boolean.valueOf(reader.k()));
                                        messageSchema.G(iB, i17, obj4);
                                        obj5 = obj6;
                                        extensionRegistryLite2 = extensionRegistryLite3;
                                        iArr = iArr;
                                        objF2 = obj5;
                                        unknownFieldSchema3 = unknownFieldSchema;
                                        messageSchema = this;
                                        extensionRegistryLite3 = extensionRegistryLite2;
                                        iArr = iArr;
                                        fieldSetD = fieldSetD;
                                        break;
                                    case 59:
                                        obj6 = objF;
                                        messageSchema.D(iK, reader, obj4);
                                        messageSchema.G(iB, i17, obj4);
                                        obj5 = obj6;
                                        extensionRegistryLite2 = extensionRegistryLite3;
                                        iArr = iArr;
                                        objF2 = obj5;
                                        unknownFieldSchema3 = unknownFieldSchema;
                                        messageSchema = this;
                                        extensionRegistryLite3 = extensionRegistryLite2;
                                        iArr = iArr;
                                        fieldSetD = fieldSetD;
                                        break;
                                    case 60:
                                        obj6 = objF;
                                        MessageLite messageLite3 = (MessageLite) messageSchema.x(iB, i17, obj4);
                                        reader.D(messageLite3, messageSchema.o(i17), extensionRegistryLite3);
                                        messageSchema.I(obj4, iB, i17, messageLite3);
                                        obj5 = obj6;
                                        extensionRegistryLite2 = extensionRegistryLite3;
                                        iArr = iArr;
                                        objF2 = obj5;
                                        unknownFieldSchema3 = unknownFieldSchema;
                                        messageSchema = this;
                                        extensionRegistryLite3 = extensionRegistryLite2;
                                        iArr = iArr;
                                        fieldSetD = fieldSetD;
                                        break;
                                    case 61:
                                        obj6 = objF;
                                        UnsafeUtil.r(obj4, iK & 1048575, reader.G());
                                        messageSchema.G(iB, i17, obj4);
                                        obj5 = obj6;
                                        extensionRegistryLite2 = extensionRegistryLite3;
                                        iArr = iArr;
                                        objF2 = obj5;
                                        unknownFieldSchema3 = unknownFieldSchema;
                                        messageSchema = this;
                                        extensionRegistryLite3 = extensionRegistryLite2;
                                        iArr = iArr;
                                        fieldSetD = fieldSetD;
                                        break;
                                    case 62:
                                        obj6 = objF;
                                        UnsafeUtil.r(obj4, iK & 1048575, Integer.valueOf(reader.o()));
                                        messageSchema.G(iB, i17, obj4);
                                        obj5 = obj6;
                                        extensionRegistryLite2 = extensionRegistryLite3;
                                        iArr = iArr;
                                        objF2 = obj5;
                                        unknownFieldSchema3 = unknownFieldSchema;
                                        messageSchema = this;
                                        extensionRegistryLite3 = extensionRegistryLite2;
                                        iArr = iArr;
                                        fieldSetD = fieldSetD;
                                        break;
                                    case 63:
                                        try {
                                            int iT2 = reader.t();
                                            Internal.EnumVerifier enumVerifierM2 = messageSchema.m(i17);
                                            if (enumVerifierM2 == null || enumVerifierM2.a(iT2)) {
                                                obj6 = objF;
                                                try {
                                                    UnsafeUtil.r(obj4, iK & 1048575, Integer.valueOf(iT2));
                                                    messageSchema.G(iB, i17, obj4);
                                                    obj5 = obj6;
                                                    extensionRegistryLite2 = extensionRegistryLite3;
                                                    iArr = iArr;
                                                    objF2 = obj5;
                                                } catch (InvalidProtocolBufferException.InvalidWireTypeException unused15) {
                                                    extensionRegistryLite2 = extensionRegistryLite3;
                                                    obj2 = obj4;
                                                    reader2 = reader;
                                                    iArr = iArr;
                                                    objF2 = obj6;
                                                    fieldSetD = fieldSetD;
                                                    unknownFieldSchema.getClass();
                                                    if (objF2 == null) {
                                                        objF2 = unknownFieldSchema.f(obj2);
                                                    }
                                                    if (!unknownFieldSchema.l(0, reader2, objF2)) {
                                                        objL3 = objF2;
                                                        while (i13 < i12) {
                                                            objL3 = messageSchema.l(obj2, iArr[i13], objL3, unknownFieldSchema, obj);
                                                            i13++;
                                                            messageSchema = this;
                                                        }
                                                        unknownFieldSchema2 = unknownFieldSchema;
                                                        if (objL3 != null) {
                                                            unknownFieldSchema2.n(obj2, objL3);
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                } catch (Throwable th18) {
                                                    th = th18;
                                                    obj2 = obj4;
                                                    unknownFieldSchema3 = unknownFieldSchema;
                                                    objF2 = obj6;
                                                    objL = objF2;
                                                    while (i13 < i12) {
                                                        objL = l(obj2, iArr[i13], objL, unknownFieldSchema3, obj);
                                                        i13++;
                                                    }
                                                    if (objL != null) {
                                                        unknownFieldSchema3.n(obj2, objL);
                                                    }
                                                    throw th;
                                                }
                                            } else {
                                                Object objN = SchemaUtil.n(obj4, iB, iT2, objF, unknownFieldSchema);
                                                extensionRegistryLite2 = extensionRegistryLite3;
                                                fieldSetD = fieldSetD;
                                                iArr = iArr;
                                                objF2 = objN;
                                            }
                                        } catch (InvalidProtocolBufferException.InvalidWireTypeException unused16) {
                                            obj6 = objF;
                                        } catch (Throwable th19) {
                                            th = th19;
                                            obj6 = objF;
                                        }
                                        unknownFieldSchema3 = unknownFieldSchema;
                                        messageSchema = this;
                                        extensionRegistryLite3 = extensionRegistryLite2;
                                        iArr = iArr;
                                        fieldSetD = fieldSetD;
                                        break;
                                    case 64:
                                        UnsafeUtil.r(obj4, iK & 1048575, Integer.valueOf(reader.K()));
                                        messageSchema.G(iB, i17, obj4);
                                        extensionRegistryLite2 = extensionRegistryLite3;
                                        fieldSetD = fieldSetD;
                                        iArr = iArr;
                                        obj5 = objF;
                                        objF2 = obj5;
                                        unknownFieldSchema3 = unknownFieldSchema;
                                        messageSchema = this;
                                        extensionRegistryLite3 = extensionRegistryLite2;
                                        iArr = iArr;
                                        fieldSetD = fieldSetD;
                                        break;
                                    case 65:
                                        UnsafeUtil.r(obj4, iK & 1048575, Long.valueOf(reader.m()));
                                        messageSchema.G(iB, i17, obj4);
                                        extensionRegistryLite2 = extensionRegistryLite3;
                                        fieldSetD = fieldSetD;
                                        iArr = iArr;
                                        obj5 = objF;
                                        objF2 = obj5;
                                        unknownFieldSchema3 = unknownFieldSchema;
                                        messageSchema = this;
                                        extensionRegistryLite3 = extensionRegistryLite2;
                                        iArr = iArr;
                                        fieldSetD = fieldSetD;
                                        break;
                                    case 66:
                                        UnsafeUtil.r(obj4, iK & 1048575, Integer.valueOf(reader.w()));
                                        messageSchema.G(iB, i17, obj4);
                                        extensionRegistryLite2 = extensionRegistryLite3;
                                        fieldSetD = fieldSetD;
                                        iArr = iArr;
                                        obj5 = objF;
                                        objF2 = obj5;
                                        unknownFieldSchema3 = unknownFieldSchema;
                                        messageSchema = this;
                                        extensionRegistryLite3 = extensionRegistryLite2;
                                        iArr = iArr;
                                        fieldSetD = fieldSetD;
                                        break;
                                    case 67:
                                        UnsafeUtil.r(obj4, iK & 1048575, Long.valueOf(reader.x()));
                                        messageSchema.G(iB, i17, obj4);
                                        extensionRegistryLite2 = extensionRegistryLite3;
                                        fieldSetD = fieldSetD;
                                        iArr = iArr;
                                        obj5 = objF;
                                        objF2 = obj5;
                                        unknownFieldSchema3 = unknownFieldSchema;
                                        messageSchema = this;
                                        extensionRegistryLite3 = extensionRegistryLite2;
                                        iArr = iArr;
                                        fieldSetD = fieldSetD;
                                        break;
                                    case 68:
                                        MessageLite messageLite4 = (MessageLite) messageSchema.x(iB, i17, obj4);
                                        reader.i(messageLite4, messageSchema.o(i17), extensionRegistryLite3);
                                        messageSchema.I(obj4, iB, i17, messageLite4);
                                        extensionRegistryLite2 = extensionRegistryLite3;
                                        fieldSetD = fieldSetD;
                                        iArr = iArr;
                                        obj5 = objF;
                                        objF2 = obj5;
                                        unknownFieldSchema3 = unknownFieldSchema;
                                        messageSchema = this;
                                        extensionRegistryLite3 = extensionRegistryLite2;
                                        iArr = iArr;
                                        fieldSetD = fieldSetD;
                                        break;
                                    default:
                                        if (objF == null) {
                                            try {
                                                objF = unknownFieldSchema.f(obj4);
                                            } catch (InvalidProtocolBufferException.InvalidWireTypeException unused17) {
                                                Object obj9 = objF;
                                                reader2 = reader;
                                                objF2 = obj9;
                                                messageSchema = messageSchema;
                                                extensionRegistryLite2 = extensionRegistryLite3;
                                                obj2 = obj4;
                                                fieldSetD = fieldSetD;
                                                iArr = iArr;
                                                unknownFieldSchema.getClass();
                                                if (objF2 == null) {
                                                    objF2 = unknownFieldSchema.f(obj2);
                                                }
                                                if (!unknownFieldSchema.l(0, reader2, objF2)) {
                                                    objL3 = objF2;
                                                    while (i13 < i12) {
                                                        objL3 = messageSchema.l(obj2, iArr[i13], objL3, unknownFieldSchema, obj);
                                                        i13++;
                                                        messageSchema = this;
                                                    }
                                                    unknownFieldSchema2 = unknownFieldSchema;
                                                    if (objL3 != null) {
                                                        unknownFieldSchema2.n(obj2, objL3);
                                                        return;
                                                    }
                                                    return;
                                                }
                                            } catch (Throwable th20) {
                                                th = th20;
                                                obj2 = obj4;
                                                unknownFieldSchema3 = unknownFieldSchema;
                                                objF2 = objF;
                                                objL = objF2;
                                                while (i13 < i12) {
                                                    objL = l(obj2, iArr[i13], objL, unknownFieldSchema3, obj);
                                                    i13++;
                                                }
                                                if (objL != null) {
                                                    unknownFieldSchema3.n(obj2, objL);
                                                }
                                                throw th;
                                            }
                                        }
                                        if (!unknownFieldSchema.l(0, reader, objF)) {
                                            objL2 = objF;
                                            while (i13 < i12) {
                                                Object obj10 = obj4;
                                                objL2 = messageSchema.l(obj10, iArr[i13], objL2, unknownFieldSchema, obj);
                                                obj4 = obj10;
                                                i13++;
                                            }
                                            if (objL2 == null) {
                                                return;
                                            }
                                            unknownFieldSchema.n(obj4, objL2);
                                            return;
                                        }
                                        objF2 = objF;
                                        extensionRegistryLite2 = extensionRegistryLite3;
                                        fieldSetD = fieldSetD;
                                        iArr = iArr;
                                        unknownFieldSchema3 = unknownFieldSchema;
                                        messageSchema = this;
                                        extensionRegistryLite3 = extensionRegistryLite2;
                                        iArr = iArr;
                                        fieldSetD = fieldSetD;
                                        break;
                                        break;
                                }
                            } catch (InvalidProtocolBufferException.InvalidWireTypeException unused18) {
                                messageSchema = messageSchema;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                obj2 = obj4;
                                fieldSetD = fieldSetD;
                                iArr = iArr;
                                obj5 = objF;
                                reader2 = reader;
                            } catch (Throwable th21) {
                                th = th21;
                                obj2 = obj4;
                                iArr = iArr;
                                obj5 = objF;
                            }
                        } catch (Throwable th22) {
                            th = th22;
                            obj2 = obj4;
                            unknownFieldSchema3 = unknownFieldSchema;
                            obj3 = objF;
                            objF2 = obj3;
                        }
                    } else {
                        if (iB == Integer.MAX_VALUE) {
                            Object objL4 = objF2;
                            while (i13 < i12) {
                                objL4 = messageSchema.l(obj, iArr[i13], objL4, unknownFieldSchema3, obj);
                                i13++;
                                messageSchema = messageSchema;
                            }
                            if (objL4 != null) {
                                unknownFieldSchema3.n(obj, objL4);
                                return;
                            }
                            return;
                        }
                        MessageSchema<T> messageSchema19 = messageSchema;
                        try {
                            boolean z11 = messageSchema19.f21329f;
                            ExtensionSchema extensionSchema = messageSchema19.f21336n;
                            GeneratedMessageLite.GeneratedExtension generatedExtensionB = !z11 ? null : extensionSchema.b(extensionRegistryLite3, messageSchema19.f21328e, iB);
                            if (generatedExtensionB != null) {
                                if (fieldSetD == null) {
                                    try {
                                        fieldSetD = extensionSchema.d(obj);
                                    } catch (Throwable th23) {
                                        th = th23;
                                        obj2 = obj;
                                        iArr = iArr;
                                        objL = objF2;
                                        while (i13 < i12) {
                                            objL = l(obj2, iArr[i13], objL, unknownFieldSchema3, obj);
                                            i13++;
                                        }
                                        if (objL != null) {
                                            unknownFieldSchema3.n(obj2, objL);
                                        }
                                        throw th;
                                    }
                                }
                                FieldSet fieldSet = fieldSetD;
                                UnknownFieldSchema unknownFieldSchema4 = unknownFieldSchema3;
                                try {
                                    Object objG = extensionSchema.g(obj, reader, generatedExtensionB, extensionRegistryLite3, fieldSet, objF2, unknownFieldSchema4);
                                    fieldSetD = fieldSet;
                                    unknownFieldSchema3 = unknownFieldSchema4;
                                    objF2 = objG;
                                    messageSchema = messageSchema19;
                                } catch (Throwable th24) {
                                    th = th24;
                                    obj2 = obj;
                                    unknownFieldSchema3 = unknownFieldSchema4;
                                    iArr = iArr;
                                    objL = objF2;
                                    while (i13 < i12) {
                                        objL = l(obj2, iArr[i13], objL, unknownFieldSchema3, obj);
                                        i13++;
                                    }
                                    if (objL != null) {
                                        unknownFieldSchema3.n(obj2, objL);
                                    }
                                    throw th;
                                }
                            } else {
                                obj2 = obj;
                                objF = objF2;
                                try {
                                    unknownFieldSchema3.getClass();
                                    if (objF == null) {
                                        try {
                                            objF = unknownFieldSchema3.f(obj2);
                                        } catch (Throwable th25) {
                                            th = th25;
                                            objF2 = objF;
                                            objL = objF2;
                                            while (i13 < i12) {
                                                objL = l(obj2, iArr[i13], objL, unknownFieldSchema3, obj);
                                                i13++;
                                            }
                                            if (objL != null) {
                                                unknownFieldSchema3.n(obj2, objL);
                                            }
                                            throw th;
                                        }
                                    }
                                    if (!unknownFieldSchema3.l(0, reader, objF)) {
                                        objL2 = objF;
                                        while (i13 < i12) {
                                            MessageSchema<T> messageSchema20 = messageSchema19;
                                            objL2 = messageSchema20.l(obj2, iArr[i13], objL2, unknownFieldSchema3, obj);
                                            i13++;
                                            unknownFieldSchema3 = unknownFieldSchema3;
                                            messageSchema19 = messageSchema20;
                                        }
                                        unknownFieldSchema = unknownFieldSchema3;
                                        obj4 = obj2;
                                        if (objL2 == null) {
                                            return;
                                        }
                                        unknownFieldSchema.n(obj4, objL2);
                                        return;
                                    }
                                    messageSchema = messageSchema19;
                                    objF2 = objF;
                                } catch (Throwable th26) {
                                    th = th26;
                                    unknownFieldSchema = unknownFieldSchema3;
                                    unknownFieldSchema3 = unknownFieldSchema;
                                    objF2 = objF;
                                    objL = objF2;
                                    while (i13 < i12) {
                                        objL = l(obj2, iArr[i13], objL, unknownFieldSchema3, obj);
                                        i13++;
                                    }
                                    if (objL != null) {
                                        unknownFieldSchema3.n(obj2, objL);
                                    }
                                    throw th;
                                }
                            }
                        } catch (Throwable th27) {
                            th = th27;
                            unknownFieldSchema = unknownFieldSchema3;
                            obj2 = obj;
                            iArr = iArr;
                            unknownFieldSchema3 = unknownFieldSchema;
                            objL = objF2;
                            while (i13 < i12) {
                                objL = l(obj2, iArr[i13], objL, unknownFieldSchema3, obj);
                                i13++;
                            }
                            if (objL != null) {
                                unknownFieldSchema3.n(obj2, objL);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th28) {
                    th = th28;
                    obj2 = obj;
                    obj3 = objF2;
                }
            } catch (Throwable th29) {
                th = th29;
                obj2 = obj;
            }
            objL = objF2;
            while (i13 < i12) {
                objL = l(obj2, iArr[i13], objL, unknownFieldSchema3, obj);
                i13++;
            }
            if (objL != null) {
                unknownFieldSchema3.n(obj2, objL);
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00e4 A[PHI: r3
      0x00e4: PHI (r3v32 int) = (r3v10 int), (r3v33 int) binds: [B:84:0x0219, B:42:0x00e2] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.protobuf.Schema
    public final int g(GeneratedMessageLite generatedMessageLite) {
        int i11;
        int iB;
        int i12;
        int iJ;
        int i13;
        int[] iArr = this.f21324a;
        int length = iArr.length;
        int i14 = 0;
        for (int i15 = 0; i15 < length; i15 += 3) {
            int iK = K(i15);
            int i16 = iArr[i15];
            long j11 = 1048575 & iK;
            int i17 = 1237;
            int iHashCode = 37;
            switch (J(iK)) {
                case 0:
                    i11 = i14 * 53;
                    iB = Internal.b(Double.doubleToLongBits(UnsafeUtil.f21417c.h(j11, generatedMessageLite)));
                    i14 = iB + i11;
                    break;
                case 1:
                    i11 = i14 * 53;
                    iB = Float.floatToIntBits(UnsafeUtil.f21417c.i(j11, generatedMessageLite));
                    i14 = iB + i11;
                    break;
                case 2:
                    i11 = i14 * 53;
                    iB = Internal.b(UnsafeUtil.f21417c.l(j11, generatedMessageLite));
                    i14 = iB + i11;
                    break;
                case 3:
                    i11 = i14 * 53;
                    iB = Internal.b(UnsafeUtil.f21417c.l(j11, generatedMessageLite));
                    i14 = iB + i11;
                    break;
                case 4:
                    i12 = i14 * 53;
                    iJ = UnsafeUtil.f21417c.j(j11, generatedMessageLite);
                    i14 = i12 + iJ;
                    break;
                case 5:
                    i11 = i14 * 53;
                    iB = Internal.b(UnsafeUtil.f21417c.l(j11, generatedMessageLite));
                    i14 = iB + i11;
                    break;
                case 6:
                    i12 = i14 * 53;
                    iJ = UnsafeUtil.f21417c.j(j11, generatedMessageLite);
                    i14 = i12 + iJ;
                    break;
                case 7:
                    i13 = i14 * 53;
                    boolean zE = UnsafeUtil.f21417c.e(j11, generatedMessageLite);
                    Charset charset = Internal.f21282a;
                    if (zE) {
                        i17 = 1231;
                    }
                    i14 = i17 + i13;
                    break;
                case 8:
                    i11 = i14 * 53;
                    iB = ((String) UnsafeUtil.f21417c.m(j11, generatedMessageLite)).hashCode();
                    i14 = iB + i11;
                    break;
                case 9:
                    Object objM = UnsafeUtil.f21417c.m(j11, generatedMessageLite);
                    if (objM != null) {
                        iHashCode = objM.hashCode();
                    }
                    i14 = (i14 * 53) + iHashCode;
                    break;
                case 10:
                    i11 = i14 * 53;
                    iB = UnsafeUtil.f21417c.m(j11, generatedMessageLite).hashCode();
                    i14 = iB + i11;
                    break;
                case 11:
                    i12 = i14 * 53;
                    iJ = UnsafeUtil.f21417c.j(j11, generatedMessageLite);
                    i14 = i12 + iJ;
                    break;
                case 12:
                    i12 = i14 * 53;
                    iJ = UnsafeUtil.f21417c.j(j11, generatedMessageLite);
                    i14 = i12 + iJ;
                    break;
                case 13:
                    i12 = i14 * 53;
                    iJ = UnsafeUtil.f21417c.j(j11, generatedMessageLite);
                    i14 = i12 + iJ;
                    break;
                case 14:
                    i11 = i14 * 53;
                    iB = Internal.b(UnsafeUtil.f21417c.l(j11, generatedMessageLite));
                    i14 = iB + i11;
                    break;
                case 15:
                    i12 = i14 * 53;
                    iJ = UnsafeUtil.f21417c.j(j11, generatedMessageLite);
                    i14 = i12 + iJ;
                    break;
                case 16:
                    i11 = i14 * 53;
                    iB = Internal.b(UnsafeUtil.f21417c.l(j11, generatedMessageLite));
                    i14 = iB + i11;
                    break;
                case 17:
                    Object objM2 = UnsafeUtil.f21417c.m(j11, generatedMessageLite);
                    if (objM2 != null) {
                        iHashCode = objM2.hashCode();
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
                    i11 = i14 * 53;
                    iB = UnsafeUtil.f21417c.m(j11, generatedMessageLite).hashCode();
                    i14 = iB + i11;
                    break;
                case 50:
                    i11 = i14 * 53;
                    iB = UnsafeUtil.f21417c.m(j11, generatedMessageLite).hashCode();
                    i14 = iB + i11;
                    break;
                case 51:
                    if (s(i16, i15, generatedMessageLite)) {
                        i11 = i14 * 53;
                        iB = Internal.b(Double.doubleToLongBits(((Double) UnsafeUtil.f21417c.m(j11, generatedMessageLite)).doubleValue()));
                        i14 = iB + i11;
                    }
                    break;
                case 52:
                    if (s(i16, i15, generatedMessageLite)) {
                        i11 = i14 * 53;
                        iB = Float.floatToIntBits(((Float) UnsafeUtil.f21417c.m(j11, generatedMessageLite)).floatValue());
                        i14 = iB + i11;
                    }
                    break;
                case 53:
                    if (s(i16, i15, generatedMessageLite)) {
                        i11 = i14 * 53;
                        iB = Internal.b(C(j11, generatedMessageLite));
                        i14 = iB + i11;
                    }
                    break;
                case 54:
                    if (s(i16, i15, generatedMessageLite)) {
                        i11 = i14 * 53;
                        iB = Internal.b(C(j11, generatedMessageLite));
                        i14 = iB + i11;
                    }
                    break;
                case 55:
                    if (s(i16, i15, generatedMessageLite)) {
                        i12 = i14 * 53;
                        iJ = B(j11, generatedMessageLite);
                        i14 = i12 + iJ;
                    }
                    break;
                case 56:
                    if (s(i16, i15, generatedMessageLite)) {
                        i11 = i14 * 53;
                        iB = Internal.b(C(j11, generatedMessageLite));
                        i14 = iB + i11;
                    }
                    break;
                case 57:
                    if (s(i16, i15, generatedMessageLite)) {
                        i12 = i14 * 53;
                        iJ = B(j11, generatedMessageLite);
                        i14 = i12 + iJ;
                    }
                    break;
                case 58:
                    if (s(i16, i15, generatedMessageLite)) {
                        i13 = i14 * 53;
                        boolean zBooleanValue = ((Boolean) UnsafeUtil.f21417c.m(j11, generatedMessageLite)).booleanValue();
                        Charset charset2 = Internal.f21282a;
                        if (zBooleanValue) {
                            i17 = 1231;
                        }
                        i14 = i17 + i13;
                    }
                    break;
                case 59:
                    if (s(i16, i15, generatedMessageLite)) {
                        i11 = i14 * 53;
                        iB = ((String) UnsafeUtil.f21417c.m(j11, generatedMessageLite)).hashCode();
                        i14 = iB + i11;
                    }
                    break;
                case 60:
                    if (s(i16, i15, generatedMessageLite)) {
                        i11 = i14 * 53;
                        iB = UnsafeUtil.f21417c.m(j11, generatedMessageLite).hashCode();
                        i14 = iB + i11;
                    }
                    break;
                case 61:
                    if (s(i16, i15, generatedMessageLite)) {
                        i11 = i14 * 53;
                        iB = UnsafeUtil.f21417c.m(j11, generatedMessageLite).hashCode();
                        i14 = iB + i11;
                    }
                    break;
                case 62:
                    if (s(i16, i15, generatedMessageLite)) {
                        i12 = i14 * 53;
                        iJ = B(j11, generatedMessageLite);
                        i14 = i12 + iJ;
                    }
                    break;
                case 63:
                    if (s(i16, i15, generatedMessageLite)) {
                        i12 = i14 * 53;
                        iJ = B(j11, generatedMessageLite);
                        i14 = i12 + iJ;
                    }
                    break;
                case 64:
                    if (s(i16, i15, generatedMessageLite)) {
                        i12 = i14 * 53;
                        iJ = B(j11, generatedMessageLite);
                        i14 = i12 + iJ;
                    }
                    break;
                case 65:
                    if (s(i16, i15, generatedMessageLite)) {
                        i11 = i14 * 53;
                        iB = Internal.b(C(j11, generatedMessageLite));
                        i14 = iB + i11;
                    }
                    break;
                case 66:
                    if (s(i16, i15, generatedMessageLite)) {
                        i12 = i14 * 53;
                        iJ = B(j11, generatedMessageLite);
                        i14 = i12 + iJ;
                    }
                    break;
                case 67:
                    if (s(i16, i15, generatedMessageLite)) {
                        i11 = i14 * 53;
                        iB = Internal.b(C(j11, generatedMessageLite));
                        i14 = iB + i11;
                    }
                    break;
                case 68:
                    if (s(i16, i15, generatedMessageLite)) {
                        i11 = i14 * 53;
                        iB = UnsafeUtil.f21417c.m(j11, generatedMessageLite).hashCode();
                        i14 = iB + i11;
                    }
                    break;
            }
        }
        int iHashCode2 = this.m.g(generatedMessageLite).hashCode() + (i14 * 53);
        return this.f21329f ? (iHashCode2 * 53) + this.f21336n.c(generatedMessageLite).f21252a.hashCode() : iHashCode2;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003d  */
    @Override // com.google.protobuf.Schema
    public final boolean h(GeneratedMessageLite generatedMessageLite, GeneratedMessageLite generatedMessageLite2) {
        int[] iArr = this.f21324a;
        int length = iArr.length;
        int i11 = 0;
        while (true) {
            boolean zM = true;
            if (i11 < length) {
                int iK = K(i11);
                long j11 = iK & 1048575;
                switch (J(iK)) {
                    case 0:
                        if (!j(generatedMessageLite, generatedMessageLite2, i11)) {
                            zM = false;
                        } else {
                            UnsafeUtil.MemoryAccessor memoryAccessor = UnsafeUtil.f21417c;
                            if (Double.doubleToLongBits(memoryAccessor.h(j11, generatedMessageLite)) != Double.doubleToLongBits(memoryAccessor.h(j11, generatedMessageLite2))) {
                                zM = false;
                            }
                        }
                        break;
                    case 1:
                        if (!j(generatedMessageLite, generatedMessageLite2, i11)) {
                            zM = false;
                        } else {
                            UnsafeUtil.MemoryAccessor memoryAccessor2 = UnsafeUtil.f21417c;
                            if (Float.floatToIntBits(memoryAccessor2.i(j11, generatedMessageLite)) != Float.floatToIntBits(memoryAccessor2.i(j11, generatedMessageLite2))) {
                                zM = false;
                            }
                        }
                        break;
                    case 2:
                        if (!j(generatedMessageLite, generatedMessageLite2, i11)) {
                            zM = false;
                        } else {
                            UnsafeUtil.MemoryAccessor memoryAccessor3 = UnsafeUtil.f21417c;
                            if (memoryAccessor3.l(j11, generatedMessageLite) != memoryAccessor3.l(j11, generatedMessageLite2)) {
                                zM = false;
                            }
                        }
                        break;
                    case 3:
                        if (!j(generatedMessageLite, generatedMessageLite2, i11)) {
                            zM = false;
                        } else {
                            UnsafeUtil.MemoryAccessor memoryAccessor4 = UnsafeUtil.f21417c;
                            if (memoryAccessor4.l(j11, generatedMessageLite) != memoryAccessor4.l(j11, generatedMessageLite2)) {
                                zM = false;
                            }
                        }
                        break;
                    case 4:
                        if (!j(generatedMessageLite, generatedMessageLite2, i11)) {
                            zM = false;
                        } else {
                            UnsafeUtil.MemoryAccessor memoryAccessor5 = UnsafeUtil.f21417c;
                            if (memoryAccessor5.j(j11, generatedMessageLite) != memoryAccessor5.j(j11, generatedMessageLite2)) {
                                zM = false;
                            }
                        }
                        break;
                    case 5:
                        if (!j(generatedMessageLite, generatedMessageLite2, i11)) {
                            zM = false;
                        } else {
                            UnsafeUtil.MemoryAccessor memoryAccessor6 = UnsafeUtil.f21417c;
                            if (memoryAccessor6.l(j11, generatedMessageLite) != memoryAccessor6.l(j11, generatedMessageLite2)) {
                                zM = false;
                            }
                        }
                        break;
                    case 6:
                        if (!j(generatedMessageLite, generatedMessageLite2, i11)) {
                            zM = false;
                        } else {
                            UnsafeUtil.MemoryAccessor memoryAccessor7 = UnsafeUtil.f21417c;
                            if (memoryAccessor7.j(j11, generatedMessageLite) != memoryAccessor7.j(j11, generatedMessageLite2)) {
                                zM = false;
                            }
                        }
                        break;
                    case 7:
                        if (!j(generatedMessageLite, generatedMessageLite2, i11)) {
                            zM = false;
                        } else {
                            UnsafeUtil.MemoryAccessor memoryAccessor8 = UnsafeUtil.f21417c;
                            if (memoryAccessor8.e(j11, generatedMessageLite) != memoryAccessor8.e(j11, generatedMessageLite2)) {
                                zM = false;
                            }
                        }
                        break;
                    case 8:
                        if (!j(generatedMessageLite, generatedMessageLite2, i11)) {
                            zM = false;
                        } else {
                            UnsafeUtil.MemoryAccessor memoryAccessor9 = UnsafeUtil.f21417c;
                            if (!SchemaUtil.m(memoryAccessor9.m(j11, generatedMessageLite), memoryAccessor9.m(j11, generatedMessageLite2))) {
                                zM = false;
                            }
                        }
                        break;
                    case 9:
                        if (!j(generatedMessageLite, generatedMessageLite2, i11)) {
                            zM = false;
                        } else {
                            UnsafeUtil.MemoryAccessor memoryAccessor10 = UnsafeUtil.f21417c;
                            if (!SchemaUtil.m(memoryAccessor10.m(j11, generatedMessageLite), memoryAccessor10.m(j11, generatedMessageLite2))) {
                                zM = false;
                            }
                        }
                        break;
                    case 10:
                        if (!j(generatedMessageLite, generatedMessageLite2, i11)) {
                            zM = false;
                        } else {
                            UnsafeUtil.MemoryAccessor memoryAccessor11 = UnsafeUtil.f21417c;
                            if (!SchemaUtil.m(memoryAccessor11.m(j11, generatedMessageLite), memoryAccessor11.m(j11, generatedMessageLite2))) {
                                zM = false;
                            }
                        }
                        break;
                    case 11:
                        if (!j(generatedMessageLite, generatedMessageLite2, i11)) {
                            zM = false;
                        } else {
                            UnsafeUtil.MemoryAccessor memoryAccessor12 = UnsafeUtil.f21417c;
                            if (memoryAccessor12.j(j11, generatedMessageLite) != memoryAccessor12.j(j11, generatedMessageLite2)) {
                                zM = false;
                            }
                        }
                        break;
                    case 12:
                        if (!j(generatedMessageLite, generatedMessageLite2, i11)) {
                            zM = false;
                        } else {
                            UnsafeUtil.MemoryAccessor memoryAccessor13 = UnsafeUtil.f21417c;
                            if (memoryAccessor13.j(j11, generatedMessageLite) != memoryAccessor13.j(j11, generatedMessageLite2)) {
                                zM = false;
                            }
                        }
                        break;
                    case 13:
                        if (!j(generatedMessageLite, generatedMessageLite2, i11)) {
                            zM = false;
                        } else {
                            UnsafeUtil.MemoryAccessor memoryAccessor14 = UnsafeUtil.f21417c;
                            if (memoryAccessor14.j(j11, generatedMessageLite) != memoryAccessor14.j(j11, generatedMessageLite2)) {
                                zM = false;
                            }
                        }
                        break;
                    case 14:
                        if (!j(generatedMessageLite, generatedMessageLite2, i11)) {
                            zM = false;
                        } else {
                            UnsafeUtil.MemoryAccessor memoryAccessor15 = UnsafeUtil.f21417c;
                            if (memoryAccessor15.l(j11, generatedMessageLite) != memoryAccessor15.l(j11, generatedMessageLite2)) {
                                zM = false;
                            }
                        }
                        break;
                    case 15:
                        if (!j(generatedMessageLite, generatedMessageLite2, i11)) {
                            zM = false;
                        } else {
                            UnsafeUtil.MemoryAccessor memoryAccessor16 = UnsafeUtil.f21417c;
                            if (memoryAccessor16.j(j11, generatedMessageLite) != memoryAccessor16.j(j11, generatedMessageLite2)) {
                                zM = false;
                            }
                        }
                        break;
                    case 16:
                        if (!j(generatedMessageLite, generatedMessageLite2, i11)) {
                            zM = false;
                        } else {
                            UnsafeUtil.MemoryAccessor memoryAccessor17 = UnsafeUtil.f21417c;
                            if (memoryAccessor17.l(j11, generatedMessageLite) != memoryAccessor17.l(j11, generatedMessageLite2)) {
                                zM = false;
                            }
                        }
                        break;
                    case 17:
                        if (!j(generatedMessageLite, generatedMessageLite2, i11)) {
                            zM = false;
                        } else {
                            UnsafeUtil.MemoryAccessor memoryAccessor18 = UnsafeUtil.f21417c;
                            if (!SchemaUtil.m(memoryAccessor18.m(j11, generatedMessageLite), memoryAccessor18.m(j11, generatedMessageLite2))) {
                                zM = false;
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
                        UnsafeUtil.MemoryAccessor memoryAccessor19 = UnsafeUtil.f21417c;
                        zM = SchemaUtil.m(memoryAccessor19.m(j11, generatedMessageLite), memoryAccessor19.m(j11, generatedMessageLite2));
                        break;
                    case 50:
                        UnsafeUtil.MemoryAccessor memoryAccessor20 = UnsafeUtil.f21417c;
                        zM = SchemaUtil.m(memoryAccessor20.m(j11, generatedMessageLite), memoryAccessor20.m(j11, generatedMessageLite2));
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
                        UnsafeUtil.MemoryAccessor memoryAccessor21 = UnsafeUtil.f21417c;
                        if (memoryAccessor21.j(j12, generatedMessageLite) != memoryAccessor21.j(j12, generatedMessageLite2) || !SchemaUtil.m(memoryAccessor21.m(j11, generatedMessageLite), memoryAccessor21.m(j11, generatedMessageLite2))) {
                            zM = false;
                        }
                        break;
                }
                if (zM) {
                    i11 += 3;
                }
            } else {
                UnknownFieldSchema unknownFieldSchema = this.m;
                if (unknownFieldSchema.g(generatedMessageLite).equals(unknownFieldSchema.g(generatedMessageLite2))) {
                    if (!this.f21329f) {
                        return true;
                    }
                    ExtensionSchema extensionSchema = this.f21336n;
                    return extensionSchema.c(generatedMessageLite).equals(extensionSchema.c(generatedMessageLite2));
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:141:0x0376  */
    @Override // com.google.protobuf.Schema
    public final int i(AbstractMessageLite abstractMessageLite) {
        int i11;
        int iV;
        int iV2;
        int iV3;
        int iX;
        int iV4;
        int iS;
        int iV5;
        int iV6;
        int iU;
        int iV7;
        int iK;
        int iW;
        int iV8;
        int iT;
        int iV9;
        int iK2;
        int iC;
        int iV10;
        int size;
        int i12;
        int iV11;
        int iV12;
        int iK3;
        int iV13;
        int iV14;
        int iX2;
        int iV15;
        int iS2;
        int iV16;
        int iU2;
        MessageSchema<T> messageSchema = this;
        AbstractMessageLite abstractMessageLite2 = abstractMessageLite;
        Unsafe unsafe = f21323q;
        int i13 = 0;
        int i14 = 0;
        int iB = 0;
        int i15 = 1048575;
        while (true) {
            int[] iArr = messageSchema.f21324a;
            if (i13 >= iArr.length) {
                UnknownFieldSchema unknownFieldSchema = messageSchema.m;
                int iH = iB + unknownFieldSchema.h(unknownFieldSchema.g(abstractMessageLite2));
                if (!messageSchema.f21329f) {
                    return iH;
                }
                SmallSortedMap.AnonymousClass1 anonymousClass1 = messageSchema.f21336n.c(abstractMessageLite2).f21252a;
                int iD = 0;
                for (int i16 = 0; i16 < anonymousClass1.f21377b.size(); i16++) {
                    Map.Entry entryC = anonymousClass1.c(i16);
                    iD += FieldSet.d((FieldSet.FieldDescriptorLite) entryC.getKey(), entryC.getValue());
                }
                for (Map.Entry entry : anonymousClass1.d()) {
                    iD += FieldSet.d((FieldSet.FieldDescriptorLite) entry.getKey(), entry.getValue());
                }
                return iH + iD;
            }
            int iK4 = messageSchema.K(i13);
            int iJ = J(iK4);
            int i17 = iArr[i13];
            int i18 = iArr[i13 + 2];
            int i19 = i18 & 1048575;
            if (iJ <= 17) {
                if (i19 != i15) {
                    i14 = i19 == 1048575 ? 0 : unsafe.getInt(abstractMessageLite2, i19);
                    i15 = i19;
                }
                i11 = 1 << (i18 >>> 20);
            } else {
                i11 = 0;
            }
            long j11 = iK4 & 1048575;
            if (iJ >= FieldType.DOUBLE_LIST_PACKED.a()) {
                FieldType.SINT64_LIST_PACKED.a();
            }
            switch (iJ) {
                case 0:
                    if (messageSchema.q(abstractMessageLite2, i13, i15, i14, i11)) {
                        iV = CodedOutputStream.V(i17);
                        iV16 = iV + 8;
                        iB += iV16;
                    }
                    break;
                case 1:
                    if (messageSchema.q(abstractMessageLite2, i13, i15, i14, i11)) {
                        iV2 = CodedOutputStream.V(i17);
                        iV6 = iV2 + 4;
                        iB += iV6;
                    }
                    messageSchema = this;
                    abstractMessageLite2 = abstractMessageLite;
                    break;
                case 2:
                    if (messageSchema.q(abstractMessageLite2, i13, i15, i14, i11)) {
                        long j12 = unsafe.getLong(abstractMessageLite2, j11);
                        iV3 = CodedOutputStream.V(i17);
                        iX = CodedOutputStream.X(j12);
                        iB += iX + iV3;
                    }
                    messageSchema = this;
                    break;
                case 3:
                    if (messageSchema.q(abstractMessageLite2, i13, i15, i14, i11)) {
                        long j13 = unsafe.getLong(abstractMessageLite2, j11);
                        iV3 = CodedOutputStream.V(i17);
                        iX = CodedOutputStream.X(j13);
                        iB += iX + iV3;
                    }
                    messageSchema = this;
                    break;
                case 4:
                    if (messageSchema.q(abstractMessageLite2, i13, i15, i14, i11)) {
                        int i21 = unsafe.getInt(abstractMessageLite2, j11);
                        iV4 = CodedOutputStream.V(i17);
                        iS = CodedOutputStream.S(i21);
                        iB += iS + iV4;
                    }
                    messageSchema = this;
                    break;
                case 5:
                    if (messageSchema.q(abstractMessageLite2, i13, i15, i14, i11)) {
                        iV5 = CodedOutputStream.V(i17);
                        iV6 = iV5 + 8;
                        iB += iV6;
                    }
                    messageSchema = this;
                    abstractMessageLite2 = abstractMessageLite;
                    break;
                case 6:
                    if (messageSchema.q(abstractMessageLite2, i13, i15, i14, i11)) {
                        iV2 = CodedOutputStream.V(i17);
                        iV6 = iV2 + 4;
                        iB += iV6;
                    }
                    messageSchema = this;
                    abstractMessageLite2 = abstractMessageLite;
                    break;
                case 7:
                    if (messageSchema.q(abstractMessageLite2, i13, i15, i14, i11)) {
                        iV6 = CodedOutputStream.V(i17) + 1;
                        iB += iV6;
                    }
                    messageSchema = this;
                    abstractMessageLite2 = abstractMessageLite;
                    break;
                case 8:
                    if (messageSchema.q(abstractMessageLite2, i13, i15, i14, i11)) {
                        Object object = unsafe.getObject(abstractMessageLite2, j11);
                        if (object instanceof ByteString) {
                            int iV17 = CodedOutputStream.V(i17);
                            int size2 = ((ByteString) object).size();
                            iU = d.b(size2, size2, iV17, iB);
                        } else {
                            iU = CodedOutputStream.U((String) object) + CodedOutputStream.V(i17) + iB;
                        }
                        iB = iU;
                    }
                    messageSchema = this;
                    break;
                case 9:
                    if (messageSchema.q(abstractMessageLite2, i13, i15, i14, i11)) {
                        Object object2 = unsafe.getObject(abstractMessageLite2, j11);
                        Schema schemaO = messageSchema.o(i13);
                        Class cls = SchemaUtil.f21373a;
                        if (object2 instanceof LazyFieldLite) {
                            iV8 = CodedOutputStream.V(i17);
                            iT = CodedOutputStream.T((LazyFieldLite) object2);
                            iC = iT + iV8;
                            iB += iC;
                        } else {
                            iV7 = CodedOutputStream.V(i17);
                            iK = ((AbstractMessageLite) ((MessageLite) object2)).k(schemaO);
                            iW = CodedOutputStream.W(iK);
                            iC = iW + iK + iV7;
                            iB += iC;
                        }
                    }
                    break;
                case 10:
                    if (messageSchema.q(abstractMessageLite2, i13, i15, i14, i11)) {
                        ByteString byteString = (ByteString) unsafe.getObject(abstractMessageLite2, j11);
                        int iV18 = CodedOutputStream.V(i17);
                        int size3 = byteString.size();
                        iB = d.b(size3, size3, iV18, iB);
                    }
                    messageSchema = this;
                    break;
                case 11:
                    if (messageSchema.q(abstractMessageLite2, i13, i15, i14, i11)) {
                        int i22 = unsafe.getInt(abstractMessageLite2, j11);
                        iV4 = CodedOutputStream.V(i17);
                        iS = CodedOutputStream.W(i22);
                        iB += iS + iV4;
                    }
                    messageSchema = this;
                    break;
                case 12:
                    if (messageSchema.q(abstractMessageLite2, i13, i15, i14, i11)) {
                        int i23 = unsafe.getInt(abstractMessageLite2, j11);
                        iV4 = CodedOutputStream.V(i17);
                        iS = CodedOutputStream.S(i23);
                        iB += iS + iV4;
                    }
                    messageSchema = this;
                    break;
                case 13:
                    if (messageSchema.q(abstractMessageLite2, i13, i15, i14, i11)) {
                        iV2 = CodedOutputStream.V(i17);
                        iV6 = iV2 + 4;
                        iB += iV6;
                    }
                    messageSchema = this;
                    abstractMessageLite2 = abstractMessageLite;
                    break;
                case 14:
                    if (messageSchema.q(abstractMessageLite2, i13, i15, i14, i11)) {
                        iV5 = CodedOutputStream.V(i17);
                        iV6 = iV5 + 8;
                        iB += iV6;
                    }
                    messageSchema = this;
                    abstractMessageLite2 = abstractMessageLite;
                    break;
                case 15:
                    if (messageSchema.q(abstractMessageLite2, i13, i15, i14, i11)) {
                        int i24 = unsafe.getInt(abstractMessageLite2, j11);
                        iV4 = CodedOutputStream.V(i17);
                        iS = CodedOutputStream.W(CodedOutputStream.Y(i24));
                        iB += iS + iV4;
                    }
                    messageSchema = this;
                    break;
                case 16:
                    if (messageSchema.q(abstractMessageLite2, i13, i15, i14, i11)) {
                        long j14 = unsafe.getLong(abstractMessageLite2, j11);
                        iV3 = CodedOutputStream.V(i17);
                        iX = CodedOutputStream.X(CodedOutputStream.Z(j14));
                        iB += iX + iV3;
                    }
                    messageSchema = this;
                    break;
                case 17:
                    if (messageSchema.q(abstractMessageLite2, i13, i15, i14, i11)) {
                        MessageLite messageLite = (MessageLite) unsafe.getObject(abstractMessageLite2, j11);
                        Schema schemaO2 = messageSchema.o(i13);
                        iV9 = CodedOutputStream.V(i17) * 2;
                        iK2 = ((AbstractMessageLite) messageLite).k(schemaO2);
                        iV16 = iK2 + iV9;
                        iB += iV16;
                    }
                    break;
                case 18:
                    iC = SchemaUtil.c(i17, (List) unsafe.getObject(abstractMessageLite2, j11));
                    iB += iC;
                    break;
                case 19:
                    iC = SchemaUtil.b(i17, (List) unsafe.getObject(abstractMessageLite2, j11));
                    iB += iC;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(abstractMessageLite2, j11);
                    Class cls2 = SchemaUtil.f21373a;
                    if (list.size() == 0) {
                        iV10 = 0;
                    } else {
                        iV10 = (CodedOutputStream.V(i17) * list.size()) + SchemaUtil.e(list);
                    }
                    iB += iV10;
                    break;
                case 21:
                    List list2 = (List) unsafe.getObject(abstractMessageLite2, j11);
                    Class cls3 = SchemaUtil.f21373a;
                    size = list2.size();
                    if (size == 0) {
                        iV10 = 0;
                    } else {
                        i12 = SchemaUtil.i(list2);
                        iV11 = CodedOutputStream.V(i17);
                        iV10 = (iV11 * size) + i12;
                    }
                    iB += iV10;
                    break;
                case 22:
                    List list3 = (List) unsafe.getObject(abstractMessageLite2, j11);
                    Class cls4 = SchemaUtil.f21373a;
                    size = list3.size();
                    if (size == 0) {
                        iV10 = 0;
                    } else {
                        i12 = SchemaUtil.d(list3);
                        iV11 = CodedOutputStream.V(i17);
                        iV10 = (iV11 * size) + i12;
                    }
                    iB += iV10;
                    break;
                case 23:
                    iC = SchemaUtil.c(i17, (List) unsafe.getObject(abstractMessageLite2, j11));
                    iB += iC;
                    break;
                case Service.METRICS_FIELD_NUMBER /* 24 */:
                    iC = SchemaUtil.b(i17, (List) unsafe.getObject(abstractMessageLite2, j11));
                    iB += iC;
                    break;
                case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                    List list4 = (List) unsafe.getObject(abstractMessageLite2, j11);
                    Class cls5 = SchemaUtil.f21373a;
                    int size4 = list4.size();
                    iB += size4 == 0 ? 0 : (CodedOutputStream.V(i17) + 1) * size4;
                    break;
                case Service.BILLING_FIELD_NUMBER /* 26 */:
                    List list5 = (List) unsafe.getObject(abstractMessageLite2, j11);
                    Class cls6 = SchemaUtil.f21373a;
                    int size5 = list5.size();
                    if (size5 == 0) {
                        iV10 = 0;
                    } else {
                        iV10 = CodedOutputStream.V(i17) * size5;
                        if (list5 instanceof LazyStringList) {
                            LazyStringList lazyStringList = (LazyStringList) list5;
                            for (int i25 = 0; i25 < size5; i25++) {
                                Object objJ1 = lazyStringList.j1(i25);
                                if (objJ1 instanceof ByteString) {
                                    int size6 = ((ByteString) objJ1).size();
                                    iV10 = CodedOutputStream.W(size6) + size6 + iV10;
                                } else {
                                    iV10 = CodedOutputStream.U((String) objJ1) + iV10;
                                }
                            }
                        } else {
                            for (int i26 = 0; i26 < size5; i26++) {
                                Object obj = list5.get(i26);
                                if (obj instanceof ByteString) {
                                    int size7 = ((ByteString) obj).size();
                                    iV10 = CodedOutputStream.W(size7) + size7 + iV10;
                                } else {
                                    iV10 = CodedOutputStream.U((String) obj) + iV10;
                                }
                            }
                        }
                    }
                    iB += iV10;
                    break;
                case 27:
                    List list6 = (List) unsafe.getObject(abstractMessageLite2, j11);
                    Schema schemaO3 = messageSchema.o(i13);
                    Class cls7 = SchemaUtil.f21373a;
                    int size8 = list6.size();
                    if (size8 == 0) {
                        iV12 = 0;
                    } else {
                        iV12 = CodedOutputStream.V(i17) * size8;
                        for (int i27 = 0; i27 < size8; i27++) {
                            Object obj2 = list6.get(i27);
                            if (obj2 instanceof LazyFieldLite) {
                                iV12 = CodedOutputStream.T((LazyFieldLite) obj2) + iV12;
                            } else {
                                int iK5 = ((AbstractMessageLite) ((MessageLite) obj2)).k(schemaO3);
                                iV12 = CodedOutputStream.W(iK5) + iK5 + iV12;
                            }
                        }
                    }
                    iB += iV12;
                    break;
                case Service.MONITORING_FIELD_NUMBER /* 28 */:
                    List list7 = (List) unsafe.getObject(abstractMessageLite2, j11);
                    Class cls8 = SchemaUtil.f21373a;
                    int size9 = list7.size();
                    if (size9 == 0) {
                        iV10 = 0;
                    } else {
                        iV10 = CodedOutputStream.V(i17) * size9;
                        for (int i28 = 0; i28 < list7.size(); i28++) {
                            int size10 = ((ByteString) list7.get(i28)).size();
                            iV10 += CodedOutputStream.W(size10) + size10;
                        }
                    }
                    iB += iV10;
                    break;
                case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
                    List list8 = (List) unsafe.getObject(abstractMessageLite2, j11);
                    Class cls9 = SchemaUtil.f21373a;
                    size = list8.size();
                    if (size == 0) {
                        iV10 = 0;
                    } else {
                        i12 = SchemaUtil.h(list8);
                        iV11 = CodedOutputStream.V(i17);
                        iV10 = (iV11 * size) + i12;
                    }
                    iB += iV10;
                    break;
                case 30:
                    List list9 = (List) unsafe.getObject(abstractMessageLite2, j11);
                    Class cls10 = SchemaUtil.f21373a;
                    size = list9.size();
                    if (size == 0) {
                        iV10 = 0;
                    } else {
                        i12 = SchemaUtil.a(list9);
                        iV11 = CodedOutputStream.V(i17);
                        iV10 = (iV11 * size) + i12;
                    }
                    iB += iV10;
                    break;
                case 31:
                    iC = SchemaUtil.b(i17, (List) unsafe.getObject(abstractMessageLite2, j11));
                    iB += iC;
                    break;
                case Consts.SP /* 32 */:
                    iC = SchemaUtil.c(i17, (List) unsafe.getObject(abstractMessageLite2, j11));
                    iB += iC;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(abstractMessageLite2, j11);
                    Class cls11 = SchemaUtil.f21373a;
                    size = list10.size();
                    if (size == 0) {
                        iV10 = 0;
                    } else {
                        i12 = SchemaUtil.f(list10);
                        iV11 = CodedOutputStream.V(i17);
                        iV10 = (iV11 * size) + i12;
                    }
                    iB += iV10;
                    break;
                case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                    List list11 = (List) unsafe.getObject(abstractMessageLite2, j11);
                    Class cls12 = SchemaUtil.f21373a;
                    size = list11.size();
                    if (size == 0) {
                        iV10 = 0;
                    } else {
                        i12 = SchemaUtil.g(list11);
                        iV11 = CodedOutputStream.V(i17);
                        iV10 = (iV11 * size) + i12;
                    }
                    iB += iV10;
                    break;
                case 35:
                    List list12 = (List) unsafe.getObject(abstractMessageLite2, j11);
                    Class cls13 = SchemaUtil.f21373a;
                    int size11 = list12.size() * 8;
                    if (size11 > 0) {
                        iB = d.b(size11, CodedOutputStream.V(i17), size11, iB);
                    }
                    break;
                case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    List list13 = (List) unsafe.getObject(abstractMessageLite2, j11);
                    Class cls14 = SchemaUtil.f21373a;
                    int size12 = list13.size() * 4;
                    if (size12 > 0) {
                        iB = d.b(size12, CodedOutputStream.V(i17), size12, iB);
                    }
                    break;
                case 37:
                    int iE = SchemaUtil.e((List) unsafe.getObject(abstractMessageLite2, j11));
                    if (iE > 0) {
                        iB = d.b(iE, CodedOutputStream.V(i17), iE, iB);
                    }
                    break;
                case 38:
                    int i29 = SchemaUtil.i((List) unsafe.getObject(abstractMessageLite2, j11));
                    if (i29 > 0) {
                        iB = d.b(i29, CodedOutputStream.V(i17), i29, iB);
                    }
                    break;
                case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    int iD2 = SchemaUtil.d((List) unsafe.getObject(abstractMessageLite2, j11));
                    if (iD2 > 0) {
                        iB = d.b(iD2, CodedOutputStream.V(i17), iD2, iB);
                    }
                    break;
                case DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                    List list14 = (List) unsafe.getObject(abstractMessageLite2, j11);
                    Class cls15 = SchemaUtil.f21373a;
                    int size13 = list14.size() * 8;
                    if (size13 > 0) {
                        iB = d.b(size13, CodedOutputStream.V(i17), size13, iB);
                    }
                    break;
                case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                    List list15 = (List) unsafe.getObject(abstractMessageLite2, j11);
                    Class cls16 = SchemaUtil.f21373a;
                    int size14 = list15.size() * 4;
                    if (size14 > 0) {
                        iB = d.b(size14, CodedOutputStream.V(i17), size14, iB);
                    }
                    break;
                case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                    List list16 = (List) unsafe.getObject(abstractMessageLite2, j11);
                    Class cls17 = SchemaUtil.f21373a;
                    int size15 = list16.size();
                    if (size15 > 0) {
                        iB = d.b(size15, CodedOutputStream.V(i17), size15, iB);
                    }
                    break;
                case 43:
                    int iH2 = SchemaUtil.h((List) unsafe.getObject(abstractMessageLite2, j11));
                    if (iH2 > 0) {
                        iB = d.b(iH2, CodedOutputStream.V(i17), iH2, iB);
                    }
                    break;
                case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                    int iA = SchemaUtil.a((List) unsafe.getObject(abstractMessageLite2, j11));
                    if (iA > 0) {
                        iB = d.b(iA, CodedOutputStream.V(i17), iA, iB);
                    }
                    break;
                case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                    List list17 = (List) unsafe.getObject(abstractMessageLite2, j11);
                    Class cls18 = SchemaUtil.f21373a;
                    int size16 = list17.size() * 4;
                    if (size16 > 0) {
                        iB = d.b(size16, CodedOutputStream.V(i17), size16, iB);
                    }
                    break;
                case 46:
                    List list18 = (List) unsafe.getObject(abstractMessageLite2, j11);
                    Class cls19 = SchemaUtil.f21373a;
                    int size17 = list18.size() * 8;
                    if (size17 > 0) {
                        iB = d.b(size17, CodedOutputStream.V(i17), size17, iB);
                    }
                    break;
                case 47:
                    int iF = SchemaUtil.f((List) unsafe.getObject(abstractMessageLite2, j11));
                    if (iF > 0) {
                        iB = d.b(iF, CodedOutputStream.V(i17), iF, iB);
                    }
                    break;
                case 48:
                    int iG = SchemaUtil.g((List) unsafe.getObject(abstractMessageLite2, j11));
                    if (iG > 0) {
                        iB = d.b(iG, CodedOutputStream.V(i17), iG, iB);
                    }
                    break;
                case 49:
                    List list19 = (List) unsafe.getObject(abstractMessageLite2, j11);
                    Schema schemaO4 = messageSchema.o(i13);
                    Class cls20 = SchemaUtil.f21373a;
                    int size18 = list19.size();
                    if (size18 == 0) {
                        iK3 = 0;
                    } else {
                        iK3 = 0;
                        for (int i30 = 0; i30 < size18; i30++) {
                            iK3 += ((AbstractMessageLite) ((MessageLite) list19.get(i30))).k(schemaO4) + (CodedOutputStream.V(i17) * 2);
                        }
                    }
                    iB += iK3;
                    break;
                case 50:
                    iC = messageSchema.f21337o.f(i17, unsafe.getObject(abstractMessageLite2, j11), messageSchema.n(i13));
                    iB += iC;
                    break;
                case 51:
                    if (messageSchema.s(i17, i13, abstractMessageLite2)) {
                        iV = CodedOutputStream.V(i17);
                        iV16 = iV + 8;
                        iB += iV16;
                    }
                    break;
                case 52:
                    if (messageSchema.s(i17, i13, abstractMessageLite2)) {
                        iV13 = CodedOutputStream.V(i17);
                        iV16 = iV13 + 4;
                        iB += iV16;
                    }
                    break;
                case 53:
                    if (messageSchema.s(i17, i13, abstractMessageLite2)) {
                        long jC = C(j11, abstractMessageLite2);
                        iV14 = CodedOutputStream.V(i17);
                        iX2 = CodedOutputStream.X(jC);
                        iB += iX2 + iV14;
                    }
                    break;
                case 54:
                    if (messageSchema.s(i17, i13, abstractMessageLite2)) {
                        long jC2 = C(j11, abstractMessageLite2);
                        iV14 = CodedOutputStream.V(i17);
                        iX2 = CodedOutputStream.X(jC2);
                        iB += iX2 + iV14;
                    }
                    break;
                case 55:
                    if (messageSchema.s(i17, i13, abstractMessageLite2)) {
                        int iB2 = B(j11, abstractMessageLite2);
                        iV15 = CodedOutputStream.V(i17);
                        iS2 = CodedOutputStream.S(iB2);
                        iV16 = iS2 + iV15;
                        iB += iV16;
                    }
                    break;
                case 56:
                    if (messageSchema.s(i17, i13, abstractMessageLite2)) {
                        iV = CodedOutputStream.V(i17);
                        iV16 = iV + 8;
                        iB += iV16;
                    }
                    break;
                case 57:
                    if (messageSchema.s(i17, i13, abstractMessageLite2)) {
                        iV13 = CodedOutputStream.V(i17);
                        iV16 = iV13 + 4;
                        iB += iV16;
                    }
                    break;
                case 58:
                    if (messageSchema.s(i17, i13, abstractMessageLite2)) {
                        iV16 = CodedOutputStream.V(i17) + 1;
                        iB += iV16;
                    }
                    break;
                case 59:
                    if (messageSchema.s(i17, i13, abstractMessageLite2)) {
                        Object object3 = unsafe.getObject(abstractMessageLite2, j11);
                        if (object3 instanceof ByteString) {
                            int iV19 = CodedOutputStream.V(i17);
                            int size19 = ((ByteString) object3).size();
                            iU2 = d.b(size19, size19, iV19, iB);
                        } else {
                            iU2 = CodedOutputStream.U((String) object3) + CodedOutputStream.V(i17) + iB;
                        }
                        iB = iU2;
                    }
                    break;
                case 60:
                    if (messageSchema.s(i17, i13, abstractMessageLite2)) {
                        Object object4 = unsafe.getObject(abstractMessageLite2, j11);
                        Schema schemaO5 = messageSchema.o(i13);
                        Class cls21 = SchemaUtil.f21373a;
                        if (object4 instanceof LazyFieldLite) {
                            iV8 = CodedOutputStream.V(i17);
                            iT = CodedOutputStream.T((LazyFieldLite) object4);
                            iC = iT + iV8;
                            iB += iC;
                        } else {
                            iV7 = CodedOutputStream.V(i17);
                            iK = ((AbstractMessageLite) ((MessageLite) object4)).k(schemaO5);
                            iW = CodedOutputStream.W(iK);
                            iC = iW + iK + iV7;
                            iB += iC;
                        }
                    }
                    break;
                case 61:
                    if (messageSchema.s(i17, i13, abstractMessageLite2)) {
                        ByteString byteString2 = (ByteString) unsafe.getObject(abstractMessageLite2, j11);
                        int iV20 = CodedOutputStream.V(i17);
                        int size20 = byteString2.size();
                        iB = d.b(size20, size20, iV20, iB);
                    }
                    break;
                case 62:
                    if (messageSchema.s(i17, i13, abstractMessageLite2)) {
                        int iB3 = B(j11, abstractMessageLite2);
                        iV15 = CodedOutputStream.V(i17);
                        iS2 = CodedOutputStream.W(iB3);
                        iV16 = iS2 + iV15;
                        iB += iV16;
                    }
                    break;
                case 63:
                    if (messageSchema.s(i17, i13, abstractMessageLite2)) {
                        int iB4 = B(j11, abstractMessageLite2);
                        iV15 = CodedOutputStream.V(i17);
                        iS2 = CodedOutputStream.S(iB4);
                        iV16 = iS2 + iV15;
                        iB += iV16;
                    }
                    break;
                case 64:
                    if (messageSchema.s(i17, i13, abstractMessageLite2)) {
                        iV13 = CodedOutputStream.V(i17);
                        iV16 = iV13 + 4;
                        iB += iV16;
                    }
                    break;
                case 65:
                    if (messageSchema.s(i17, i13, abstractMessageLite2)) {
                        iV = CodedOutputStream.V(i17);
                        iV16 = iV + 8;
                        iB += iV16;
                    }
                    break;
                case 66:
                    if (messageSchema.s(i17, i13, abstractMessageLite2)) {
                        int iB5 = B(j11, abstractMessageLite2);
                        iV15 = CodedOutputStream.V(i17);
                        iS2 = CodedOutputStream.W(CodedOutputStream.Y(iB5));
                        iV16 = iS2 + iV15;
                        iB += iV16;
                    }
                    break;
                case 67:
                    if (messageSchema.s(i17, i13, abstractMessageLite2)) {
                        long jC3 = C(j11, abstractMessageLite2);
                        iV14 = CodedOutputStream.V(i17);
                        iX2 = CodedOutputStream.X(CodedOutputStream.Z(jC3));
                        iB += iX2 + iV14;
                    }
                    break;
                case 68:
                    if (messageSchema.s(i17, i13, abstractMessageLite2)) {
                        MessageLite messageLite2 = (MessageLite) unsafe.getObject(abstractMessageLite2, j11);
                        Schema schemaO6 = messageSchema.o(i13);
                        iV9 = CodedOutputStream.V(i17) * 2;
                        iK2 = ((AbstractMessageLite) messageLite2).k(schemaO6);
                        iV16 = iK2 + iV9;
                        iB += iV16;
                    }
                    break;
            }
            i13 += 3;
        }
    }

    public final boolean j(GeneratedMessageLite generatedMessageLite, GeneratedMessageLite generatedMessageLite2, int i11) {
        return p(i11, generatedMessageLite) == p(i11, generatedMessageLite2);
    }

    public final Object l(Object obj, int i11, Object obj2, UnknownFieldSchema unknownFieldSchema, Object obj3) {
        Internal.EnumVerifier enumVerifierM;
        int i12 = this.f21324a[i11];
        Object objM = UnsafeUtil.f21417c.m(K(i11) & 1048575, obj);
        if (objM == null || (enumVerifierM = m(i11)) == null) {
            return obj2;
        }
        MapFieldSchema mapFieldSchema = this.f21337o;
        MapFieldLite mapFieldLiteE = mapFieldSchema.e(objM);
        MapEntryLite.Metadata metadataC = mapFieldSchema.c(n(i11));
        Iterator it = mapFieldLiteE.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!enumVerifierM.a(((Integer) entry.getValue()).intValue())) {
                if (obj2 == null) {
                    obj2 = unknownFieldSchema.f(obj3);
                }
                ByteString.CodedBuilder codedBuilder = new ByteString.CodedBuilder(MapEntryLite.a(metadataC, entry.getKey(), entry.getValue()));
                CodedOutputStream codedOutputStream = codedBuilder.f21166a;
                try {
                    MapEntryLite.b(codedOutputStream, metadataC, entry.getKey(), entry.getValue());
                    if (codedOutputStream.c0() != 0) {
                        throw new IllegalStateException("Did not write as much data as expected.");
                    }
                    unknownFieldSchema.d(obj2, i12, new ByteString.LiteralByteString(codedBuilder.f21167b));
                    it.remove();
                } catch (IOException e8) {
                    throw new RuntimeException(e8);
                }
            }
        }
        return obj2;
    }

    public final Internal.EnumVerifier m(int i11) {
        return (Internal.EnumVerifier) this.f21325b[e.c(i11, 3, 2, 1)];
    }

    public final Object n(int i11) {
        return this.f21325b[(i11 / 3) * 2];
    }

    public final Schema o(int i11) {
        int i12 = (i11 / 3) * 2;
        Object[] objArr = this.f21325b;
        Schema schema = (Schema) objArr[i12];
        if (schema != null) {
            return schema;
        }
        Schema schemaA = Protobuf.f21349c.a((Class) objArr[i12 + 1]);
        objArr[i12] = schemaA;
        return schemaA;
    }

    public final boolean p(int i11, Object obj) {
        int i12 = this.f21324a[i11 + 2];
        long j11 = i12 & 1048575;
        if (j11 == 1048575) {
            int iK = K(i11);
            long j12 = iK & 1048575;
            switch (J(iK)) {
                case 0:
                    if (Double.doubleToRawLongBits(UnsafeUtil.f21417c.h(j12, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(UnsafeUtil.f21417c.i(j12, obj)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (UnsafeUtil.f21417c.l(j12, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (UnsafeUtil.f21417c.l(j12, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (UnsafeUtil.f21417c.j(j12, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (UnsafeUtil.f21417c.l(j12, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (UnsafeUtil.f21417c.j(j12, obj) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return UnsafeUtil.f21417c.e(j12, obj);
                case 8:
                    Object objM = UnsafeUtil.f21417c.m(j12, obj);
                    if (objM instanceof String) {
                        return !((String) objM).isEmpty();
                    }
                    if (objM instanceof ByteString) {
                        return !ByteString.f21158b.equals(objM);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (UnsafeUtil.f21417c.m(j12, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    return !ByteString.f21158b.equals(UnsafeUtil.f21417c.m(j12, obj));
                case 11:
                    if (UnsafeUtil.f21417c.j(j12, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (UnsafeUtil.f21417c.j(j12, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (UnsafeUtil.f21417c.j(j12, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (UnsafeUtil.f21417c.l(j12, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (UnsafeUtil.f21417c.j(j12, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (UnsafeUtil.f21417c.l(j12, obj) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (UnsafeUtil.f21417c.m(j12, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i12 >>> 20)) & UnsafeUtil.f21417c.j(j11, obj)) == 0) {
            return false;
        }
        return true;
    }

    public final boolean q(Object obj, int i11, int i12, int i13, int i14) {
        if (i12 == 1048575) {
            return p(i11, obj);
        }
        return (i13 & i14) != 0;
    }

    public final boolean s(int i11, int i12, Object obj) {
        return UnsafeUtil.f21417c.j((long) (this.f21324a[i12 + 2] & 1048575), obj) == i11;
    }

    public final void t(Object obj, int i11, Object obj2, ExtensionRegistryLite extensionRegistryLite, Reader reader) {
        long jK = K(i11) & 1048575;
        Object objM = UnsafeUtil.f21417c.m(jK, obj);
        MapFieldSchema mapFieldSchema = this.f21337o;
        if (objM == null) {
            objM = mapFieldSchema.d();
            UnsafeUtil.r(obj, jK, objM);
        } else if (mapFieldSchema.g(objM)) {
            MapFieldLite mapFieldLiteD = mapFieldSchema.d();
            mapFieldSchema.a(mapFieldLiteD, objM);
            UnsafeUtil.r(obj, jK, mapFieldLiteD);
            objM = mapFieldLiteD;
        }
        reader.E(mapFieldSchema.e(objM), mapFieldSchema.c(obj2), extensionRegistryLite);
    }

    public final void u(int i11, Object obj, Object obj2) {
        if (p(i11, obj2)) {
            long jK = K(i11) & 1048575;
            Unsafe unsafe = f21323q;
            Object object = unsafe.getObject(obj2, jK);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f21324a[i11] + " is present but null: " + obj2);
            }
            Schema schemaO = o(i11);
            if (!p(i11, obj)) {
                if (r(object)) {
                    Object objD = schemaO.d();
                    schemaO.a(objD, object);
                    unsafe.putObject(obj, jK, objD);
                } else {
                    unsafe.putObject(obj, jK, object);
                }
                F(i11, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jK);
            if (!r(object2)) {
                Object objD2 = schemaO.d();
                schemaO.a(objD2, object2);
                unsafe.putObject(obj, jK, objD2);
                object2 = objD2;
            }
            schemaO.a(object2, object);
        }
    }

    public final void v(int i11, Object obj, Object obj2) {
        int[] iArr = this.f21324a;
        int i12 = iArr[i11];
        if (s(i12, i11, obj2)) {
            long jK = K(i11) & 1048575;
            Unsafe unsafe = f21323q;
            Object object = unsafe.getObject(obj2, jK);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i11] + " is present but null: " + obj2);
            }
            Schema schemaO = o(i11);
            if (!s(i12, i11, obj)) {
                if (r(object)) {
                    Object objD = schemaO.d();
                    schemaO.a(objD, object);
                    unsafe.putObject(obj, jK, objD);
                } else {
                    unsafe.putObject(obj, jK, object);
                }
                G(i12, i11, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jK);
            if (!r(object2)) {
                Object objD2 = schemaO.d();
                schemaO.a(objD2, object2);
                unsafe.putObject(obj, jK, objD2);
                object2 = objD2;
            }
            schemaO.a(object2, object);
        }
    }

    public final Object w(int i11, Object obj) {
        Schema schemaO = o(i11);
        long jK = K(i11) & 1048575;
        if (!p(i11, obj)) {
            return schemaO.d();
        }
        Object object = f21323q.getObject(obj, jK);
        if (r(object)) {
            return object;
        }
        Object objD = schemaO.d();
        if (object != null) {
            schemaO.a(objD, object);
        }
        return objD;
    }

    public final Object x(int i11, int i12, Object obj) {
        Schema schemaO = o(i12);
        if (!s(i11, i12, obj)) {
            return schemaO.d();
        }
        Object object = f21323q.getObject(obj, K(i12) & 1048575);
        if (r(object)) {
            return object;
        }
        Object objD = schemaO.d();
        if (object != null) {
            schemaO.a(objD, object);
        }
        return objD;
    }
}
