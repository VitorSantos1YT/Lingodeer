package com.google.android.material.datepicker;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
class DateStrings {
    private DateStrings() {
    }

    public static y4.b a(Long l9, Long l11) {
        if (l9 == null && l11 == null) {
            return new y4.b(null, null);
        }
        if (l9 == null) {
            return new y4.b(null, b(l11.longValue()));
        }
        if (l11 == null) {
            return new y4.b(b(l9.longValue()), null);
        }
        Calendar calendarF = UtcDates.f();
        Calendar calendarG = UtcDates.g(null);
        calendarG.setTimeInMillis(l9.longValue());
        Calendar calendarG2 = UtcDates.g(null);
        calendarG2.setTimeInMillis(l11.longValue());
        if (calendarG.get(1) == calendarG2.get(1)) {
            return calendarG.get(1) == calendarF.get(1) ? new y4.b(c(l9.longValue(), Locale.getDefault()), c(l11.longValue(), Locale.getDefault())) : new y4.b(c(l9.longValue(), Locale.getDefault()), d(l11.longValue(), Locale.getDefault()));
        }
        return new y4.b(d(l9.longValue(), Locale.getDefault()), d(l11.longValue(), Locale.getDefault()));
    }

    public static String b(long j11) {
        Calendar calendarF = UtcDates.f();
        Calendar calendarG = UtcDates.g(null);
        calendarG.setTimeInMillis(j11);
        return calendarF.get(1) == calendarG.get(1) ? c(j11, Locale.getDefault()) : d(j11, Locale.getDefault());
    }

    public static String c(long j11, Locale locale) {
        return UtcDates.b("MMMd", locale).format(new Date(j11));
    }

    public static String d(long j11, Locale locale) {
        return UtcDates.b("yMMMd", locale).format(new Date(j11));
    }
}
