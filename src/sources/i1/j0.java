package i1;

import j$.util.DesugarTimeZone;
import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 extends x {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final TimeZone f34030d = DesugarTimeZone.getTimeZone("UTC");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f34031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sy.c f34032c;

    public j0(Locale locale) {
        int firstDayOfWeek = (Calendar.getInstance(locale).getFirstDayOfWeek() + 6) % 7;
        this.f34031b = firstDayOfWeek != 0 ? firstDayOfWeek : 7;
        sy.c cVarO = ns.o.o();
        String[] weekdays = new DateFormatSymbols(locale).getWeekdays();
        String[] shortWeekdays = new DateFormatSymbols(locale).getShortWeekdays();
        List listO = ry.l.O(weekdays);
        int size = listO.size();
        for (int i11 = 0; i11 < size; i11++) {
            cVarO.add(new qy.l((String) listO.get(i11), shortWeekdays[i11 + 2]));
        }
        cVarO.add(new qy.l(weekdays[1], shortWeekdays[1]));
        this.f34032c = ns.o.e(cVarO);
    }

    @Override // i1.x
    public final String a(long j11, String str, Locale locale) {
        return p.g(j11, str, locale, this.f34095a);
    }

    @Override // i1.x
    public final w b(long j11) {
        Calendar calendar = Calendar.getInstance(f34030d);
        calendar.setTimeInMillis(j11);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return new w(calendar.get(1), calendar.get(2) + 1, calendar.get(5), calendar.getTimeInMillis());
    }

    @Override // i1.x
    public final a0 c(Locale locale) {
        DateFormat dateInstance = DateFormat.getDateInstance(3, locale);
        kotlin.jvm.internal.m.d(dateInstance, "null cannot be cast to non-null type java.text.SimpleDateFormat");
        return p.d(((SimpleDateFormat) dateInstance).toPattern());
    }

    @Override // i1.x
    public final int d() {
        return this.f34031b;
    }

    @Override // i1.x
    public final z e(int i11, int i12) {
        Calendar calendar = Calendar.getInstance(f34030d);
        calendar.clear();
        calendar.set(1, i11);
        calendar.set(2, i12 - 1);
        calendar.set(5, 1);
        return l(calendar);
    }

    @Override // i1.x
    public final z f(long j11) {
        Calendar calendar = Calendar.getInstance(f34030d);
        calendar.setTimeInMillis(j11);
        calendar.set(5, 1);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return l(calendar);
    }

    @Override // i1.x
    public final z g(w wVar) {
        return e(wVar.f34084a, wVar.f34085b);
    }

    @Override // i1.x
    public final w h() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return new w(calendar.get(1), calendar.get(2) + 1, calendar.get(5), ((long) (calendar.get(16) + calendar.get(15))) + calendar.getTimeInMillis());
    }

    @Override // i1.x
    public final List i() {
        return this.f34032c;
    }

    @Override // i1.x
    public final w j(String str, String str2) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str2);
        TimeZone timeZone = f34030d;
        simpleDateFormat.setTimeZone(timeZone);
        simpleDateFormat.setLenient(false);
        try {
            Date date = simpleDateFormat.parse(str);
            if (date == null) {
                return null;
            }
            Calendar calendar = Calendar.getInstance(timeZone);
            calendar.setTime(date);
            return new w(calendar.get(1), calendar.get(2) + 1, calendar.get(5), calendar.getTimeInMillis());
        } catch (ParseException unused) {
            return null;
        }
    }

    @Override // i1.x
    public final z k(z zVar, int i11) {
        if (i11 <= 0) {
            return zVar;
        }
        Calendar calendar = Calendar.getInstance(f34030d);
        calendar.setTimeInMillis(zVar.f34110e);
        calendar.add(2, i11);
        return l(calendar);
    }

    public final z l(Calendar calendar) {
        int i11 = (calendar.get(7) + 6) % 7;
        int i12 = (i11 != 0 ? i11 : 7) - this.f34031b;
        if (i12 < 0) {
            i12 += 7;
        }
        return new z(calendar.get(1), calendar.get(2) + 1, calendar.getActualMaximum(5), i12, calendar.getTimeInMillis());
    }

    public final String toString() {
        return "LegacyCalendarModel";
    }
}
