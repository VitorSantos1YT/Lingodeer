package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzabp extends zzabn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f11188a;

    static {
        String property;
        try {
            property = System.getProperty("line.separator");
            if (!property.matches("\\n|\\r(?:\\n)?")) {
                property = "\n";
            }
        } catch (SecurityException unused) {
        }
        f11188a = property;
    }

    public static int d(int i11, String str) {
        while (i11 < str.length()) {
            int i12 = i11 + 1;
            if (str.charAt(i11) != '%') {
                i11 = i12;
            } else {
                if (i12 >= str.length()) {
                    throw new zzabo(zzabo.c("trailing unquoted '%' character", i11, -1, str));
                }
                char cCharAt = str.charAt(i12);
                if (cCharAt != '%' && cCharAt != 'n') {
                    return i11;
                }
                i11 += 2;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.zzabn
    public final void a(zzyy zzyyVar) {
        int i11;
        char cCharAt;
        int i12;
        int i13;
        int i14;
        int i15;
        String str = zzyyVar.f11185a.f11133b;
        int iD = d(0, str);
        int i16 = -1;
        int i17 = 0;
        while (iD >= 0) {
            int i18 = iD + 1;
            int i19 = 0;
            int i21 = i18;
            while (true) {
                if (i21 >= str.length()) {
                    throw new zzabo(zzabo.c("unterminated parameter", iD, -1, str));
                }
                i11 = i21 + 1;
                cCharAt = str.charAt(i21);
                char c11 = (char) (cCharAt - '0');
                if (c11 < '\n') {
                    i19 = (i19 * 10) + c11;
                    if (i19 >= 1000000) {
                        throw zzabo.a("index too large", iD, i11, str);
                    }
                    i21 = i11;
                }
            }
            if (cCharAt == '$') {
                if (i21 - i18 == 0) {
                    throw zzabo.a("missing index", iD, i11, str);
                }
                if (str.charAt(i18) == '0') {
                    throw zzabo.a("index has leading zero", iD, i11, str);
                }
                int i22 = i19 - 1;
                if (i11 == str.length()) {
                    throw new zzabo(zzabo.c("unterminated parameter", iD, -1, str));
                }
                str.charAt(i11);
                i15 = i17;
                i14 = i21 + 2;
                i12 = i11;
                i13 = i22;
            } else if (cCharAt != '<') {
                int i23 = i17 + 1;
                i12 = i18;
                i13 = i17;
                i14 = i11;
                i15 = i23;
            } else {
                if (i16 == -1) {
                    throw zzabo.a("invalid relative parameter", iD, i11, str);
                }
                if (i11 == str.length()) {
                    throw new zzabo(zzabo.c("unterminated parameter", iD, -1, str));
                }
                str.charAt(i11);
                i15 = i17;
                i14 = i21 + 2;
                i12 = i11;
                i13 = i16;
            }
            int i24 = i14 - 1;
            while (true) {
                if (i24 >= str.length()) {
                    throw new zzabo(zzabo.c("unterminated parameter", iD, -1, str));
                }
                if (((char) ((str.charAt(i24) & (-33)) - 65)) < 26) {
                    break;
                } else {
                    i24++;
                }
            }
            zzyy zzyyVar2 = zzyyVar;
            iD = d(c(zzyyVar2, i13, str, iD, i12, i24), str);
            zzyyVar = zzyyVar2;
            i16 = i13;
            i17 = i15;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzabn
    public final void b(int i11, int i12, String str, StringBuilder sb2) {
        int i13 = i11;
        while (i11 < i12) {
            int i14 = i11 + 1;
            if (str.charAt(i11) == '%') {
                if (i14 == i12) {
                    break;
                }
                char cCharAt = str.charAt(i14);
                if (cCharAt == '%') {
                    sb2.append((CharSequence) str, i13, i14);
                } else if (cCharAt == 'n') {
                    sb2.append((CharSequence) str, i13, i11);
                    sb2.append(f11188a);
                }
                i13 = i11 + 2;
                i11 = i13;
            }
            i11 = i14;
        }
        if (i13 < i12) {
            sb2.append((CharSequence) str, i13, i12);
        }
    }

    public abstract int c(zzyy zzyyVar, int i11, String str, int i12, int i13, int i14);
}
