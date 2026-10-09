package mw;

import com.google.common.math.LongMath;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.text.ParseException;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import su.Mbl.tcppUUQxZjFdy;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class e2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f42406a = TimeUnit.SECONDS.toNanos(1);

    public static void a(List list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            if (!(list.get(i11) instanceof Map)) {
                throw new ClassCastException(String.format(Locale.US, "value %s for idx %d in %s is not object", list.get(i11), Integer.valueOf(i11), list));
            }
        }
    }

    public static Boolean b(String str, Map map) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not Boolean", obj, str, map));
    }

    public static List c(String str, Map map) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof List) {
            return (List) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not List", obj, str, map));
    }

    public static List d(String str, Map map) {
        List listC = c(str, map);
        if (listC == null) {
            return null;
        }
        for (int i11 = 0; i11 < listC.size(); i11++) {
            if (!(listC.get(i11) instanceof String)) {
                throw new ClassCastException(String.format(Locale.US, "value '%s' for idx %d in '%s' is not string", listC.get(i11), Integer.valueOf(i11), listC));
            }
        }
        return listC;
    }

    public static Double e(String str, Map map) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (!(obj instanceof String)) {
            throw new IllegalArgumentException(String.format("value '%s' for key '%s' in '%s' is not a number", obj, str, map));
        }
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            throw new IllegalArgumentException(String.format("value '%s' for key '%s' is not a double", obj, str));
        }
    }

    public static Integer f(String str, Map map) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (!(obj instanceof Double)) {
            if (!(obj instanceof String)) {
                throw new IllegalArgumentException(String.format("value '%s' for key '%s' is not an integer", obj, str));
            }
            try {
                return Integer.valueOf(Integer.parseInt((String) obj));
            } catch (NumberFormatException unused) {
                throw new IllegalArgumentException(String.format("value '%s' for key '%s' is not an integer", obj, str));
            }
        }
        Double d5 = (Double) obj;
        int iIntValue = d5.intValue();
        if (iIntValue == d5.doubleValue()) {
            return Integer.valueOf(iIntValue);
        }
        throw new ClassCastException("Number expected to be integer: " + d5);
    }

    public static Map g(String str, Map map) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Map) {
            return (Map) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not object", obj, str, map));
    }

    public static String h(String str, Map map) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not String", obj, str, map));
    }

    public static Long i(String str, Map map) {
        String strH = h(str, map);
        if (strH == null) {
            return null;
        }
        try {
            return Long.valueOf(k(strH));
        } catch (ParseException e8) {
            throw new RuntimeException(e8);
        }
    }

    public static long j(int i11, long j11) {
        long j12 = i11;
        long j13 = f42406a;
        if (j12 <= (-j13) || j12 >= j13) {
            j11 = LongMath.a(j11, j12 / j13);
            i11 = (int) (j12 % j13);
        }
        if (j11 > 0 && i11 < 0) {
            i11 = (int) (((long) i11) + j13);
            j11--;
        }
        if (j11 < 0 && i11 > 0) {
            i11 = (int) (((long) i11) - j13);
            j11++;
        }
        if (j11 >= -315576000000L && j11 <= 315576000000L) {
            long j14 = i11;
            if (j14 >= -999999999 && j14 < j13 && ((j11 >= 0 && i11 >= 0) || (j11 <= 0 && i11 <= 0))) {
                long nanos = TimeUnit.SECONDS.toNanos(j11);
                long j15 = i11;
                long j16 = nanos + j15;
                return (((j15 ^ nanos) > 0L ? 1 : ((j15 ^ nanos) == 0L ? 0 : -1)) < 0) | ((nanos ^ j16) >= 0) ? j16 : ((j16 >>> 63) ^ 1) + Long.MAX_VALUE;
            }
        }
        throw new IllegalArgumentException("Duration is not valid. See proto definition for valid values. Seconds (" + j11 + ") must be in range [-315,576,000,000, +315,576,000,000]. Nanos (" + i11 + ") must be in range [-999,999,999, +999,999,999]. Nanos must have the same sign as seconds");
    }

    public static long k(String str) throws ParseException {
        boolean z11;
        String strSubstring;
        int iCharAt;
        boolean zIsEmpty = str.isEmpty();
        String str2 = tcppUUQxZjFdy.nUvszjYr;
        if (!zIsEmpty && str.charAt(str.length() - 1) == 's') {
            if (str.charAt(0) == '-') {
                str = str.substring(1);
                z11 = true;
            } else {
                z11 = false;
            }
            String strI = nv.p.i(1, 0, str);
            int iIndexOf = strI.indexOf(46);
            if (iIndexOf != -1) {
                strSubstring = strI.substring(iIndexOf + 1);
                strI = strI.substring(0, iIndexOf);
            } else {
                strSubstring = BuildConfig.VERSION_NAME;
            }
            long j11 = Long.parseLong(strI);
            if (strSubstring.isEmpty()) {
                iCharAt = 0;
            } else {
                iCharAt = 0;
                for (int i11 = 0; i11 < 9; i11++) {
                    iCharAt *= 10;
                    if (i11 < strSubstring.length()) {
                        if (strSubstring.charAt(i11) >= '0' && strSubstring.charAt(i11) <= '9') {
                            iCharAt = (strSubstring.charAt(i11) - '0') + iCharAt;
                        } else {
                            throw new ParseException("Invalid nanoseconds.", 0);
                        }
                    }
                }
            }
            if (j11 >= 0) {
                if (z11) {
                    j11 = -j11;
                    iCharAt = -iCharAt;
                }
                try {
                    return j(iCharAt, j11);
                } catch (IllegalArgumentException unused) {
                    throw new ParseException("Duration value is out of range.", 0);
                }
            }
            throw new ParseException(str2.concat(str), 0);
        }
        throw new ParseException(str2.concat(str), 0);
    }
}
