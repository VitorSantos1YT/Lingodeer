package oz;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class w extends v {
    /* JADX WARN: Code duplicated, block: B:106:0x0121  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c5  */
    public static final boolean i0(String str) {
        char c11;
        boolean z11;
        boolean z12;
        int i11;
        boolean z13;
        String str2;
        boolean z14;
        boolean z15 = true;
        int length = str.length() - 1;
        int i12 = 0;
        while (true) {
            c11 = ' ';
            if (i12 > length || str.charAt(i12) > ' ') {
                break;
            }
            i12++;
        }
        if (i12 > length) {
            return false;
        }
        while (length > i12 && str.charAt(length) <= ' ') {
            length--;
        }
        if (str.charAt(i12) == '+' || str.charAt(i12) == '-') {
            i12++;
        }
        if (i12 > length) {
            return false;
        }
        if (str.charAt(i12) != '0') {
            z11 = true;
            z12 = false;
        } else {
            int i13 = i12 + 1;
            if (i13 > length) {
                return true;
            }
            if ((str.charAt(i13) | ' ') == 120) {
                int i14 = i12 + 2;
                int i15 = i14;
                while (true) {
                    if (i15 > length) {
                        z11 = z15;
                        break;
                    }
                    char cCharAt = str.charAt(i15);
                    z11 = z15;
                    if (((cCharAt - '0') & 65535) >= 10 && (((cCharAt | ' ') - 97) & 65535) >= 6) {
                        break;
                    }
                    i15++;
                    z15 = z11;
                }
                boolean z16 = i14 != i15 ? z11 : false;
                if (i15 <= length) {
                    if (str.charAt(i15) == '.') {
                        int i16 = i15 + 1;
                        int i17 = i16;
                        while (i17 <= length) {
                            char cCharAt2 = str.charAt(i17);
                            char c12 = c11;
                            if (((cCharAt2 - '0') & 65535) >= 10 && (((cCharAt2 | ' ') - 97) & 65535) >= 6) {
                                break;
                            }
                            i17++;
                            c11 = c12;
                        }
                        z14 = i16 != i17 ? z11 : false;
                        i15 = i17;
                    } else {
                        z14 = false;
                    }
                    if (z16 || z14) {
                        i12 = i15;
                    }
                    if (i12 != -1 || i12 > length) {
                        return false;
                    }
                    z12 = z11;
                }
                i12 = -1;
                if (i12 != -1) {
                }
                return false;
            }
            z11 = true;
            z12 = false;
        }
        if (!z12) {
            int i18 = i12;
            while (i18 <= length && ((str.charAt(i18) - '0') & 65535) < 10) {
                i18++;
            }
            boolean z17 = i12 != i18 ? z11 : false;
            if (i18 > length) {
                i12 = i18;
            } else {
                if (str.charAt(i18) == '.') {
                    int i19 = i18 + 1;
                    i11 = i19;
                    while (i11 <= length && ((str.charAt(i11) - '0') & 65535) < 10) {
                        i11++;
                    }
                    if (i19 != i11) {
                        z13 = z11;
                    }
                    if (!z17 || z13) {
                        i12 = i11;
                    } else {
                        if (length == i11 + 2) {
                            str2 = "NaN";
                        } else {
                            str2 = length == i11 + 7 ? "Infinity" : null;
                        }
                        i12 = (str2 != null && q.F0(str, str2, i11, false) == i11) ? length + 1 : -1;
                    }
                } else {
                    i11 = i18;
                }
                z13 = false;
                if (z17) {
                    i12 = i11;
                } else {
                    i12 = i11;
                }
            }
            if (i12 == -1) {
                return false;
            }
            if (i12 > length) {
                return z11;
            }
        }
        int i21 = i12 + 1;
        int iCharAt = str.charAt(i12) | ' ';
        if (iCharAt != (z12 ? 112 : 101)) {
            if (z12 || (!(iCharAt == 102 || iCharAt == 100) || i21 <= length)) {
                return false;
            }
            return z11;
        }
        if (i21 > length) {
            return false;
        }
        if ((str.charAt(i21) == '+' || str.charAt(i21) == '-') && (i21 = i12 + 2) > length) {
            return false;
        }
        while (i21 <= length && ((str.charAt(i21) - '0') & 65535) < 10) {
            i21++;
        }
        if (i21 > length) {
            return z11;
        }
        if (i21 != length) {
            return false;
        }
        int iCharAt2 = str.charAt(i21) | ' ';
        if (iCharAt2 == 102 || iCharAt2 == 100) {
            return z11;
        }
        return false;
    }

    public static Float j0(String str) {
        kotlin.jvm.internal.m.f(str, "<this>");
        try {
            if (i0(str)) {
                return Float.valueOf(Float.parseFloat(str));
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }
}
