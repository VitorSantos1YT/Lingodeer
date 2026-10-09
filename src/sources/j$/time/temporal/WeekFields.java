package j$.time.temporal;

import j$.time.DayOfWeek;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes2.dex */
public final class WeekFields implements Serializable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final g f35153h;
    private static final long serialVersionUID = -1177360819670808121L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DayOfWeek f35154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f35155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient q f35156c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient q f35157d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient q f35158e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient q f35159f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ConcurrentMap f35152g = new ConcurrentHashMap(4, 0.75f, 2);
    public static final WeekFields ISO = new WeekFields(DayOfWeek.MONDAY, 4);

    static {
        a(DayOfWeek.SUNDAY, 1);
        f35153h = h.f35168d;
    }

    public static WeekFields of(Locale locale) {
        Objects.requireNonNull(locale, "locale");
        Calendar calendar = Calendar.getInstance(new Locale(locale.getLanguage(), locale.getCountry()));
        return a(DayOfWeek.f34907a[((((int) (((long) (calendar.getFirstDayOfWeek() - 1)) % 7)) + 7) + DayOfWeek.SUNDAY.ordinal()) % 7], calendar.getMinimalDaysInFirstWeek());
    }

    public static WeekFields a(DayOfWeek dayOfWeek, int i11) {
        String str = dayOfWeek.toString() + i11;
        ConcurrentMap concurrentMap = f35152g;
        WeekFields weekFields = (WeekFields) concurrentMap.get(str);
        if (weekFields != null) {
            return weekFields;
        }
        concurrentMap.putIfAbsent(str, new WeekFields(dayOfWeek, i11));
        return (WeekFields) concurrentMap.get(str);
    }

    public WeekFields(DayOfWeek dayOfWeek, int i11) {
        ChronoUnit chronoUnit = ChronoUnit.DAYS;
        ChronoUnit chronoUnit2 = ChronoUnit.WEEKS;
        this.f35156c = new q("DayOfWeek", this, chronoUnit, chronoUnit2, q.f35187f);
        this.f35157d = new q("WeekOfMonth", this, chronoUnit2, ChronoUnit.MONTHS, q.f35188g);
        g gVar = h.f35168d;
        this.f35158e = new q("WeekOfWeekBasedYear", this, chronoUnit2, gVar, q.f35190i);
        this.f35159f = new q("WeekBasedYear", this, gVar, ChronoUnit.FOREVER, ChronoField.YEAR.f35149b);
        Objects.requireNonNull(dayOfWeek, "firstDayOfWeek");
        if (i11 < 1 || i11 > 7) {
            throw new IllegalArgumentException("Minimal number of days is invalid");
        }
        this.f35154a = dayOfWeek;
        this.f35155b = i11;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        if (this.f35154a == null) {
            throw new InvalidObjectException("firstDayOfWeek is null");
        }
        int i11 = this.f35155b;
        if (i11 < 1 || i11 > 7) {
            throw new InvalidObjectException("Minimal number of days is invalid");
        }
    }

    private Object readResolve() throws InvalidObjectException {
        try {
            return a(this.f35154a, this.f35155b);
        } catch (IllegalArgumentException e8) {
            throw new InvalidObjectException("Invalid serialized WeekFields: " + e8.getMessage());
        }
    }

    public DayOfWeek getFirstDayOfWeek() {
        return this.f35154a;
    }

    public TemporalField weekOfWeekBasedYear() {
        return this.f35158e;
    }

    public TemporalField weekBasedYear() {
        return this.f35159f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WeekFields) && hashCode() == obj.hashCode();
    }

    public final int hashCode() {
        return (this.f35154a.ordinal() * 7) + this.f35155b;
    }

    public final String toString() {
        return "WeekFields[" + this.f35154a + "," + this.f35155b + "]";
    }
}
