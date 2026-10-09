package com.google.gson.internal;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class PreJava9DateFormatProvider {
    private PreJava9DateFormatProvider() {
    }

    private static String getDatePartOfDateTimePattern(int i11) {
        if (i11 == 0) {
            return "EEEE, MMMM d, yyyy";
        }
        if (i11 == 1) {
            return "MMMM d, yyyy";
        }
        if (i11 == 2) {
            return "MMM d, yyyy";
        }
        if (i11 == 3) {
            return "M/d/yy";
        }
        throw new IllegalArgumentException(p.j(i11, "Unknown DateFormat style: "));
    }

    private static String getTimePartOfDateTimePattern(int i11) {
        if (i11 == 0 || i11 == 1) {
            return "h:mm:ss a z";
        }
        if (i11 == 2) {
            return "h:mm:ss a";
        }
        if (i11 == 3) {
            return "h:mm a";
        }
        throw new IllegalArgumentException(p.j(i11, "Unknown DateFormat style: "));
    }

    public static DateFormat getUsDateTimeFormat(int i11, int i12) {
        return new SimpleDateFormat(getDatePartOfDateTimePattern(i11) + " " + getTimePartOfDateTimePattern(i12), Locale.US);
    }
}
