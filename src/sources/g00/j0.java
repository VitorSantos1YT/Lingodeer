package g00;

import com.lingodeer.data.model.AchievementLevelType;
import ko.Zea.ealNNtLp;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class j0 implements c00.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j0 f28423a = new j0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k1 f28424b = new k1("kotlin.time.Instant", e00.e.f24681k);

    @Override // c00.a
    public final e00.g getDescriptor() {
        return f28424b;
    }

    @Override // c00.a
    public final void serialize(f00.d dVar, Object obj) {
        pz.d value = (pz.d) obj;
        kotlin.jvm.internal.m.f(value, "value");
        dVar.F(value.toString());
    }

    /* JADX WARN: Code duplicated, block: B:194:0x047d  */
    /* JADX WARN: Code duplicated, block: B:195:0x0493  */
    /* JADX WARN: Instruction removed from duplicated block: B:195:0x0493, please report this as an issue */
    @Override // c00.a
    public final Object deserialize(f00.c cVar) {
        int i11;
        pz.h hVarK;
        int i12;
        int i13;
        int i14;
        char cCharAt;
        char cCharAt2;
        pz.d dVar = pz.d.f47223c;
        String strL = cVar.l();
        kotlin.jvm.internal.m.f(strL, ealNNtLp.Cmfkc);
        if (strL.length() == 0) {
            hVarK = new pz.g("An empty string is not a valid Instant", strL, 0);
        } else {
            char cCharAt3 = strL.charAt(0);
            if (cCharAt3 == '+' || cCharAt3 == '-') {
                i11 = 1;
            } else {
                i11 = 0;
                cCharAt3 = ' ';
            }
            int iCharAt = 0;
            int i15 = i11;
            while (i15 < strL.length() && '0' <= (cCharAt2 = strL.charAt(i15)) && cCharAt2 < ':') {
                iCharAt = (iCharAt * 10) + (strL.charAt(i15) - '0');
                i15++;
            }
            int i16 = i15 - i11;
            if (i16 > 10) {
                hVarK = pz.f.l(strL, "Expected at most 10 digits for the year number, got " + i16 + " digits");
            } else if (i16 == 10 && kotlin.jvm.internal.m.h(strL.charAt(i11), 50) >= 0) {
                hVarK = pz.f.l(strL, "Expected at most 9 digits for the year number or year 1000000000, got " + i16 + " digits");
            } else if (i16 < 4) {
                hVarK = pz.f.l(strL, "The year number must be padded to 4 digits, got " + i16 + " digits");
            } else if (cCharAt3 == '+' && i16 == 4) {
                hVarK = pz.f.l(strL, "The '+' sign at the start is only valid for year numbers longer than 4 digits");
            } else if (cCharAt3 != ' ' || i16 == 4) {
                if (cCharAt3 == '-') {
                    iCharAt = -iCharAt;
                }
                int i17 = i15 + 16;
                if (strL.length() < i17) {
                    hVarK = pz.f.l(strL, "The input string is too short");
                } else {
                    hVarK = pz.f.k(strL, "'-'", i15, new ot.f2(8));
                    if (hVarK == null && (hVarK = pz.f.k(strL, "'-'", i15 + 3, new ot.f2(9))) == null && (hVarK = pz.f.k(strL, "'T' or 't'", i15 + 6, new ot.f2(10))) == null && (hVarK = pz.f.k(strL, "':'", i15 + 9, new ot.f2(11))) == null) {
                        char c11 = '\f';
                        hVarK = pz.f.k(strL, "':'", i15 + 12, new ot.f2(12));
                        if (hVarK == null) {
                            int i18 = 0;
                            while (i18 < 10) {
                                char c12 = c11;
                                pz.g gVarK = pz.f.k(strL, "an ASCII digit", pz.f.f47229b[i18] + i15, new ot.f2(13));
                                if (gVarK != null) {
                                    hVarK = gVarK;
                                } else {
                                    i18++;
                                    c11 = c12;
                                }
                            }
                            int iM = pz.f.m(i15 + 1, strL);
                            int iM2 = pz.f.m(i15 + 4, strL);
                            int iM3 = pz.f.m(i15 + 7, strL);
                            int iM4 = pz.f.m(i15 + 10, strL);
                            int iM5 = pz.f.m(i15 + 13, strL);
                            int i19 = i15 + 15;
                            if (strL.charAt(i19) == '.') {
                                i19 = i17;
                                int iCharAt2 = 0;
                                while (i19 < strL.length() && '0' <= (cCharAt = strL.charAt(i19)) && cCharAt < ':') {
                                    iCharAt2 = (iCharAt2 * 10) + (strL.charAt(i19) - '0');
                                    i19++;
                                }
                                int i21 = i19 - i17;
                                if (1 > i21 || i21 >= 10) {
                                    hVarK = pz.f.l(strL, "1..9 digits are supported for the fraction of the second, got " + i21 + " digits");
                                } else {
                                    i12 = iCharAt2 * pz.f.f47228a[9 - i21];
                                }
                            } else {
                                i12 = 0;
                            }
                            if (i19 >= strL.length()) {
                                hVarK = pz.f.l(strL, "The UTC offset at the end of the string is missing");
                            } else {
                                char cCharAt4 = strL.charAt(i19);
                                if (cCharAt4 == '+' || cCharAt4 == '-') {
                                    int length = strL.length() - i19;
                                    if (length > 9) {
                                        hVarK = pz.f.l(strL, "The UTC offset string \"" + pz.f.r(16, strL.subSequence(i19, strL.length()).toString()) + "\" is too long");
                                    } else if (length % 3 != 0) {
                                        hVarK = pz.f.l(strL, "Invalid UTC offset string \"" + strL.subSequence(i19, strL.length()).toString() + '\"');
                                    } else {
                                        int i22 = 0;
                                        for (int i23 = 2; i22 < i23; i23 = 2) {
                                            int i24 = i19 + pz.f.f47230c[i22];
                                            if (i24 >= strL.length()) {
                                                break;
                                            }
                                            if (strL.charAt(i24) != ':') {
                                                StringBuilder sbI = w4.c.i(i24, "Expected ':' at index ", ", got '");
                                                sbI.append(strL.charAt(i24));
                                                sbI.append('\'');
                                                hVarK = pz.f.l(strL, sbI.toString());
                                            } else {
                                                i22++;
                                            }
                                        }
                                        int i25 = 0;
                                        while (i25 < 6 && (i14 = pz.f.f47231d[i25] + i19) < strL.length()) {
                                            char cCharAt5 = strL.charAt(i14);
                                            int i26 = i25;
                                            if ('0' > cCharAt5 || cCharAt5 >= ':') {
                                                StringBuilder sbI2 = w4.c.i(i14, "Expected an ASCII digit at index ", ", got '");
                                                sbI2.append(strL.charAt(i14));
                                                sbI2.append('\'');
                                                hVarK = pz.f.l(strL, sbI2.toString());
                                            } else {
                                                i25 = i26 + 1;
                                            }
                                        }
                                        int iM6 = pz.f.m(i19 + 1, strL);
                                        int iM7 = length > 3 ? pz.f.m(i19 + 4, strL) : 0;
                                        int iM8 = length > 6 ? pz.f.m(i19 + 7, strL) : 0;
                                        if (iM7 > 59) {
                                            hVarK = pz.f.l(strL, "Expected offset-minute-of-hour in 0..59, got " + iM7);
                                        } else if (iM8 > 59) {
                                            hVarK = pz.f.l(strL, "Expected offset-second-of-minute in 0..59, got " + iM8);
                                        } else if (iM6 <= 17 || (iM6 == 18 && iM7 == 0 && iM8 == 0)) {
                                            i13 = ((iM7 * 60) + (iM6 * 3600) + iM8) * (cCharAt4 == '-' ? -1 : 1);
                                            if (1 <= iM || iM >= 13) {
                                                hVarK = pz.f.l(strL, "Expected a month number in 1..12, got " + iM);
                                            } else if (1 > iM2) {
                                                StringBuilder sbK = w4.c.k("Expected a valid day-of-month for month ", iM, " of year ", iCharAt, ", got ");
                                                sbK.append(iM2);
                                                hVarK = pz.f.l(strL, sbK.toString());
                                            } else {
                                                int i27 = iCharAt & 3;
                                                if (iM2 > (iM != 2 ? (iM == 4 || iM == 6 || iM == 9 || iM == 11) ? 30 : 31 : i27 == 0 && (iCharAt % 100 != 0 || iCharAt % 400 == 0) ? 29 : 28)) {
                                                    StringBuilder sbK2 = w4.c.k("Expected a valid day-of-month for month ", iM, " of year ", iCharAt, ", got ");
                                                    sbK2.append(iM2);
                                                    hVarK = pz.f.l(strL, sbK2.toString());
                                                } else if (iM3 > 23) {
                                                    hVarK = pz.f.l(strL, "Expected hour in 0..23, got " + iM3);
                                                } else if (iM4 > 59) {
                                                    hVarK = pz.f.l(strL, "Expected minute-of-hour in 0..59, got " + iM4);
                                                } else if (iM5 > 59) {
                                                    hVarK = pz.f.l(strL, "Expected second-of-minute in 0..59, got " + iM5);
                                                } else {
                                                    long j11 = iCharAt;
                                                    long j12 = ((long) AchievementLevelType.DAY_STREAK_LV_10) * j11;
                                                    long j13 = (j11 >= 0 ? ((j11 + ((long) 399)) / ((long) 400)) + (((((long) 3) + j11) / ((long) 4)) - ((((long) 99) + j11) / ((long) 100))) + j12 : j12 - ((j11 / ((long) (-400))) + ((j11 / ((long) (-4))) - (j11 / ((long) (-100)))))) + ((long) (((iM * 367) - 362) / 12)) + ((long) (iM2 - 1));
                                                    if (iM > 2) {
                                                        j13 = (i27 != 0 || (iCharAt % 100 == 0 && iCharAt % 400 != 0)) ? j13 - 2 : (-1) + j13;
                                                    }
                                                    hVarK = new f9.e((((j13 - ((long) 719528)) * ((long) 86400)) + ((long) (((iM4 * 60) + (iM3 * 3600)) + iM5))) - ((long) i13), i12);
                                                }
                                            }
                                        } else {
                                            hVarK = pz.f.l(strL, "Expected an offset in -18:00..+18:00, got " + strL.subSequence(i19, strL.length()).toString());
                                        }
                                    }
                                } else if (cCharAt4 == 'Z' || cCharAt4 == 'z') {
                                    int i28 = i19 + 1;
                                    if (strL.length() == i28) {
                                        i13 = 0;
                                        if (1 <= iM) {
                                            hVarK = pz.f.l(strL, "Expected a month number in 1..12, got " + iM);
                                        } else {
                                            hVarK = pz.f.l(strL, "Expected a month number in 1..12, got " + iM);
                                        }
                                    } else {
                                        hVarK = pz.f.l(strL, "Extra text after the instant at position " + i28);
                                    }
                                } else {
                                    hVarK = pz.f.l(strL, "Expected the UTC offset at position " + i19 + ", got '" + cCharAt4 + '\'');
                                }
                            }
                        }
                    }
                }
            } else {
                hVarK = pz.f.l(strL, "A '+' or '-' sign is required for year numbers longer than 4 digits");
            }
        }
        return hVarK.toInstant();
    }
}
