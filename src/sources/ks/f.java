package ks;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class f {
    public static String a(int i11, boolean z11) {
        int i12 = i11 / 3600;
        int i13 = i11 - (i12 * 3600);
        int i14 = i13 / 60;
        int i15 = i13 - (i14 * 60);
        if (!z11) {
            if (i12 > 0) {
                if (i14 <= 0) {
                    return w4.c.f(i12, "h");
                }
                return i12 + "h " + i14 + "m";
            }
            if (i14 <= 0) {
                return w4.c.f(i15, "s");
            }
            if (i15 <= 0) {
                return w4.c.f(i14, "m");
            }
            return i14 + "m " + i15 + "s";
        }
        if (i12 <= 0) {
            if (i14 <= 0) {
                return w4.c.f(i15, "s");
            }
            if (i15 <= 0) {
                return w4.c.f(i14, "m");
            }
            return i14 + "m " + i15 + "s";
        }
        if (i14 > 0) {
            return i12 + "h " + i14 + "m " + i15 + "s";
        }
        if (i15 <= 0) {
            return w4.c.f(i12, "h");
        }
        return i12 + "h " + i15 + "s";
    }

    public static String b() {
        Integer numValueOf = Integer.valueOf(new SimpleDateFormat("yyyyMMdd", Locale.US).format(Calendar.getInstance().getTime()));
        m.e(numValueOf, "valueOf(...)");
        return String.valueOf(numValueOf.intValue());
    }
}
