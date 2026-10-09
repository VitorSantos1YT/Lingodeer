package i1;

import j$.time.DayOfWeek;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.chrono.Chronology;
import j$.time.format.DateTimeFormatter;
import j$.time.format.DateTimeFormatterBuilder;
import j$.time.format.DateTimeParseException;
import j$.time.format.FormatStyle;
import j$.time.format.TextStyle;
import j$.time.temporal.WeekFields;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class y extends x {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ZoneId f34099d = ZoneId.of("UTC");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f34100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f34101c;

    public y(Locale locale) {
        this.f34100b = WeekFields.of(locale).getFirstDayOfWeek().getValue();
        DayOfWeek[] dayOfWeekArrValues = DayOfWeek.values();
        ArrayList arrayList = new ArrayList(dayOfWeekArrValues.length);
        for (DayOfWeek dayOfWeek : dayOfWeekArrValues) {
            arrayList.add(new qy.l(dayOfWeek.getDisplayName(TextStyle.FULL, locale), dayOfWeek.getDisplayName(TextStyle.NARROW, locale)));
        }
        this.f34101c = arrayList;
    }

    @Override // i1.x
    public final String a(long j11, String str, Locale locale) {
        return p.f(j11, str, locale, this.f34095a);
    }

    @Override // i1.x
    public final w b(long j11) {
        LocalDate localDate = Instant.ofEpochMilli(j11).atZone(f34099d).l();
        return new w(localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth(), ((long) 1000) * localDate.atStartOfDay().toEpochSecond(ZoneOffset.UTC));
    }

    @Override // i1.x
    public final a0 c(Locale locale) {
        return p.d(DateTimeFormatterBuilder.getLocalizedDateTimePattern(FormatStyle.SHORT, null, Chronology.ofLocale(locale), locale));
    }

    @Override // i1.x
    public final int d() {
        return this.f34100b;
    }

    @Override // i1.x
    public final z e(int i11, int i12) {
        return l(LocalDate.of(i11, i12, 1));
    }

    @Override // i1.x
    public final z f(long j11) {
        return l(Instant.ofEpochMilli(j11).atZone(f34099d).withDayOfMonth(1).l());
    }

    @Override // i1.x
    public final z g(w wVar) {
        return l(LocalDate.of(wVar.f34084a, wVar.f34085b, 1));
    }

    @Override // i1.x
    public final w h() {
        LocalDate localDateNow = LocalDate.now();
        return new w(localDateNow.getYear(), localDateNow.getMonthValue(), localDateNow.getDayOfMonth(), localDateNow.L(LocalTime.MIDNIGHT).G(f34099d).toInstant().toEpochMilli());
    }

    @Override // i1.x
    public final List i() {
        return this.f34101c;
    }

    @Override // i1.x
    public final w j(String str, String str2) {
        try {
            LocalDate localDate = LocalDate.parse(str, DateTimeFormatter.ofPattern(str2));
            return new w(localDate.getYear(), localDate.getMonth().getValue(), localDate.getDayOfMonth(), localDate.L(LocalTime.MIDNIGHT).G(f34099d).toInstant().toEpochMilli());
        } catch (DateTimeParseException unused) {
            return null;
        }
    }

    @Override // i1.x
    public final z k(z zVar, int i11) {
        return i11 <= 0 ? zVar : l(Instant.ofEpochMilli(zVar.f34110e).atZone(f34099d).l().plusMonths(i11));
    }

    public final z l(LocalDate localDate) {
        int value = localDate.getDayOfWeek().getValue() - this.f34100b;
        if (value < 0) {
            value += 7;
        }
        return new z(localDate.getYear(), localDate.getMonthValue(), localDate.lengthOfMonth(), value, localDate.L(LocalTime.MIDNIGHT).G(f34099d).toInstant().toEpochMilli());
    }

    public final String toString() {
        return "CalendarModel";
    }
}
