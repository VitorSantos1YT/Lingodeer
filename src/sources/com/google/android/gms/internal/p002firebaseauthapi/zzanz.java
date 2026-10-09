package com.google.android.gms.internal.p002firebaseauthapi;

import com.tbruyelle.rxpermissions3.BuildConfig;
import ep.a;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import lt.AJC.PQgum;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzanz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f10231a;

    public static zzand a(String str) throws ParseException {
        String strSubstring;
        int iCharAt;
        int iIndexOf = str.indexOf(84);
        if (iIndexOf == -1) {
            throw new ParseException(a.g("Failed to parse timestamp: invalid timestamp \"", str, "\""), 0);
        }
        int iIndexOf2 = str.indexOf(90, iIndexOf);
        if (iIndexOf2 == -1) {
            iIndexOf2 = str.indexOf(43, iIndexOf);
        }
        if (iIndexOf2 == -1) {
            iIndexOf2 = str.indexOf(45, iIndexOf);
        }
        if (iIndexOf2 == -1) {
            throw new ParseException("Failed to parse timestamp: missing valid timezone offset.", 0);
        }
        String strSubstring2 = str.substring(0, iIndexOf2);
        int iIndexOf3 = strSubstring2.indexOf(46);
        boolean z11 = true;
        if (iIndexOf3 != -1) {
            String strSubstring3 = strSubstring2.substring(0, iIndexOf3);
            strSubstring = strSubstring2.substring(iIndexOf3 + 1);
            strSubstring2 = strSubstring3;
        } else {
            strSubstring = BuildConfig.VERSION_NAME;
        }
        long time = ((SimpleDateFormat) f10231a.get()).parse(strSubstring2).getTime() / 1000;
        if (strSubstring.isEmpty()) {
            iCharAt = 0;
        } else {
            iCharAt = 0;
            for (int i11 = 0; i11 < 9; i11++) {
                iCharAt *= 10;
                if (i11 < strSubstring.length()) {
                    if (strSubstring.charAt(i11) < '0' || strSubstring.charAt(i11) > '9') {
                        throw new ParseException("Invalid nanoseconds.", 0);
                    }
                    iCharAt = (strSubstring.charAt(i11) - '0') + iCharAt;
                }
            }
        }
        if (str.charAt(iIndexOf2) != 'Z') {
            String strSubstring4 = str.substring(iIndexOf2 + 1);
            int iIndexOf4 = strSubstring4.indexOf(58);
            if (iIndexOf4 == -1) {
                throw new ParseException("Invalid offset value: ".concat(strSubstring4), 0);
            }
            try {
                long j11 = ((Long.parseLong(strSubstring4.substring(0, iIndexOf4)) * 60) + Long.parseLong(strSubstring4.substring(iIndexOf4 + 1))) * 60;
                time = str.charAt(iIndexOf2) == '+' ? time - j11 : time + j11;
            } catch (NumberFormatException e8) {
                ParseException parseException = new ParseException("Invalid offset value: ".concat(strSubstring4), 0);
                parseException.initCause(e8);
                throw parseException;
            }
        } else if (str.length() != iIndexOf2 + 1) {
            throw new ParseException(a.g("Failed to parse timestamp: invalid trailing data \"", str.substring(iIndexOf2), "\""), 0);
        }
        try {
            if (!(time >= -62135596800L && time <= 253402300799L)) {
                throw new IllegalArgumentException("Timestamp is not valid. Input seconds is too large. Seconds (" + time + ") must be in range [-62,135,596,800, +253,402,300,799]. ");
            }
            if (iCharAt <= -1000000000 || iCharAt >= 1000000000) {
                long j12 = iCharAt / 1000000000;
                long j13 = time + j12;
                if (!((j12 ^ time) < 0) && !((time ^ j13) >= 0)) {
                    throw new ArithmeticException();
                }
                iCharAt %= 1000000000;
                time = j13;
            }
            if (iCharAt < 0) {
                iCharAt += 1000000000;
                long j14 = time - 1;
                boolean z12 = (1 ^ time) >= 0;
                if ((time ^ j14) < 0) {
                    z11 = false;
                }
                if (!z12 && !z11) {
                    throw new ArithmeticException();
                }
                time = j14;
            }
            zzand.zza zzaVarZ = zzand.z();
            zzaVarZ.l(time);
            zzaVarZ.k(iCharAt);
            zzand zzandVar = (zzand) zzaVarZ.g();
            b(zzandVar);
            return zzandVar;
        } catch (IllegalArgumentException e10) {
            ParseException parseException2 = new ParseException(a.g("Failed to parse timestamp ", str, " Timestamp is out of range."), 0);
            parseException2.initCause(e10);
            throw parseException2;
        }
    }

    public static void b(zzand zzandVar) {
        long jY = zzandVar.y();
        int iV = zzandVar.v();
        if (jY < -62135596800L || jY > 253402300799L || iV < 0 || iV >= 1000000000) {
            throw new IllegalArgumentException("Timestamp is not valid. See proto definition for valid values. Seconds (" + jY + ") must be in range [-62,135,596,800, +253,402,300,799]. Nanos (" + iV + ") must be in range [0, +999,999,999].");
        }
    }

    static {
        zzand.zza zzaVarZ = zzand.z();
        zzaVarZ.l(-62135596800L);
        zzaVarZ.k(0);
        zzand.zza zzaVarZ2 = zzand.z();
        zzaVarZ2.l(253402300799L);
        zzaVarZ2.k(999999999);
        zzand.zza zzaVarZ3 = zzand.z();
        zzaVarZ3.l(0L);
        zzaVarZ3.k(0);
        f10231a = new zzany();
        try {
            Class.forName("j$.time.Instant").getMethod(PQgum.tfDXnmemQNgnBw, null);
        } catch (Exception unused) {
        }
        try {
            Class.forName("j$.time.Instant").getMethod("getEpochSecond", null);
        } catch (Exception unused2) {
        }
        try {
            Class.forName("j$.time.Instant").getMethod("getNano", null);
        } catch (Exception unused3) {
        }
    }
}
