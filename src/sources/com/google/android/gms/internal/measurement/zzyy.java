package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Formattable;
import java.util.Formatter;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzyy extends zzabm implements zzabi {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object[] f12198d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final StringBuilder f12199e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f12200f;

    public zzyy(zzaaf zzaafVar, Object[] objArr, StringBuilder sb2) {
        super(zzaafVar);
        this.f12200f = 0;
        this.f12198d = objArr;
        this.f12199e = sb2;
    }

    public static void b(StringBuilder sb2, Object obj, String str) {
        sb2.append("[INVALID: format=");
        sb2.append(str);
        sb2.append(", type=");
        sb2.append(obj.getClass().getCanonicalName());
        sb2.append(", value=");
        sb2.append(zzzh.a(obj));
        sb2.append("]");
    }

    /* JADX WARN: Code duplicated, block: B:106:0x012e  */
    /* JADX WARN: Code duplicated, block: B:108:0x0134  */
    /* JADX WARN: Code duplicated, block: B:14:0x0025  */
    /* JADX WARN: Code duplicated, block: B:15:0x0027  */
    /* JADX WARN: Code duplicated, block: B:64:0x0094  */
    public final void a(Object obj, zzyz zzyzVar, zzza zzzaVar) {
        String simpleName;
        zzza zzzaVar2;
        boolean zIsValidCodePoint;
        int iOrdinal = zzyzVar.c().ordinal();
        StringBuilder sb2 = this.f12199e;
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                zIsValidCodePoint = obj instanceof Boolean;
            } else if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        throw null;
                    }
                    if ((obj instanceof Double) || (obj instanceof Float) || (obj instanceof BigDecimal)) {
                        zIsValidCodePoint = true;
                    } else {
                        zIsValidCodePoint = false;
                    }
                } else if ((obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof BigInteger)) {
                    zIsValidCodePoint = true;
                } else {
                    zIsValidCodePoint = false;
                }
            } else if (obj instanceof Character) {
                zIsValidCodePoint = true;
            } else if ((obj instanceof Integer) || (obj instanceof Byte) || (obj instanceof Short)) {
                zIsValidCodePoint = Character.isValidCodePoint(((Number) obj).intValue());
            } else {
                zIsValidCodePoint = false;
            }
            if (!zIsValidCodePoint) {
                b(sb2, obj, zzyzVar.f());
                return;
            }
        }
        int iOrdinal2 = zzyzVar.ordinal();
        if (iOrdinal2 != 0) {
            if (iOrdinal2 == 1) {
                if (zzzaVar.a()) {
                    sb2.append(obj);
                    return;
                }
            } else if (iOrdinal2 != 2) {
                if (iOrdinal2 != 3) {
                    if (iOrdinal2 == 5) {
                        if (zzzaVar.a()) {
                            zzzaVar2 = zzzaVar;
                        } else {
                            int i11 = zzzaVar.f12205a;
                            int i12 = i11 & 128;
                            if (i12 == 0) {
                                zzzaVar2 = zzza.f12204e;
                            } else if (i12 == i11 && zzzaVar.f12206b == -1 && zzzaVar.f12207c == -1) {
                                zzzaVar2 = zzzaVar;
                            } else {
                                zzzaVar2 = new zzza(i12, -1, -1);
                            }
                        }
                        if (zzzaVar2.equals(zzzaVar)) {
                            Number number = (Number) obj;
                            Locale locale = zzzh.f12211a;
                            boolean zC = zzzaVar.c();
                            long jLongValue = number.longValue();
                            if (number instanceof Long) {
                                zzzh.b(sb2, jLongValue, zC);
                                return;
                            }
                            if (number instanceof Integer) {
                                zzzh.b(sb2, jLongValue & 4294967295L, zC);
                                return;
                            }
                            if (number instanceof Byte) {
                                zzzh.b(sb2, jLongValue & 255, zC);
                                return;
                            }
                            if (number instanceof Short) {
                                zzzh.b(sb2, jLongValue & 65535, zC);
                                return;
                            } else {
                                if (!(number instanceof BigInteger)) {
                                    throw new IllegalStateException("unsupported number type: ".concat(String.valueOf(number.getClass())));
                                }
                                String string = ((BigInteger) number).toString(16);
                                if (zC) {
                                    string = string.toUpperCase(zzzh.f12211a);
                                }
                                sb2.append(string);
                                return;
                            }
                        }
                    }
                } else if (zzzaVar.a()) {
                    sb2.append(obj);
                    return;
                }
            } else if (zzzaVar.a()) {
                if (obj instanceof Character) {
                    sb2.append(obj);
                    return;
                }
                int iIntValue = ((Number) obj).intValue();
                if ((iIntValue >>> 16) == 0) {
                    sb2.append((char) iIntValue);
                    return;
                } else {
                    sb2.append(Character.toChars(iIntValue));
                    return;
                }
            }
        } else {
            if (obj instanceof Formattable) {
                Formattable formattable = (Formattable) obj;
                Locale locale2 = zzzh.f12211a;
                int i13 = zzzaVar.f12205a;
                int i14 = i13 & 162;
                if (i14 != 0) {
                    i14 = ((i13 & 32) == 0 ? 0 : 1) | ((i13 & 128) != 0 ? 2 : 0) | ((i13 & 2) == 0 ? 0 : 4);
                }
                int length = sb2.length();
                Formatter formatter = new Formatter(sb2, zzzh.f12211a);
                try {
                    formattable.formatTo(formatter, i14, zzzaVar.f12206b, zzzaVar.f12207c);
                    return;
                } catch (RuntimeException e8) {
                    sb2.setLength(length);
                    try {
                        Appendable appendableOut = formatter.out();
                        try {
                            simpleName = e8.toString();
                        } catch (RuntimeException e10) {
                            simpleName = e10.getClass().getSimpleName();
                        }
                        appendableOut.append(zzzh.c(formattable, simpleName));
                        return;
                    } catch (IOException unused) {
                        return;
                    }
                }
            }
            if (zzzaVar.a()) {
                sb2.append(zzzh.a(obj));
                return;
            }
        }
        String strF = zzyzVar.f();
        if (!zzzaVar.a()) {
            int iB = zzyzVar.b();
            if (zzzaVar.c()) {
                iB &= 65503;
            }
            StringBuilder sb3 = new StringBuilder("%");
            zzzaVar.d(sb3);
            sb3.append((char) iB);
            strF = sb3.toString();
        }
        sb2.append(String.format(zzzh.f12211a, strF, obj));
    }
}
