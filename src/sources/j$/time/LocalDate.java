package j$.time;

import com.lingodeer.data.model.AchievementLevelType;
import j$.time.chrono.ChronoLocalDate;
import j$.time.chrono.Chronology;
import j$.time.format.DateTimeFormatter;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalUnit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class LocalDate implements Temporal, j$.time.temporal.k, ChronoLocalDate, Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final LocalDate f34915d = of(-999999999, 1, 1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final LocalDate f34916e = of(999999999, 12, 31);
    private static final long serialVersionUID = 2942565459149668126L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f34917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final short f34918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final short f34919c;

    static {
        of(1970, 1, 1);
    }

    public static LocalDate now() {
        return c0(b.d());
    }

    public static LocalDate now(ZoneId zoneId) {
        a aVar;
        Objects.requireNonNull(zoneId, "zone");
        if (zoneId == ZoneOffset.UTC) {
            aVar = a.f34946b;
        } else {
            aVar = new a(zoneId);
        }
        return c0(aVar);
    }

    public static LocalDate c0(a aVar) {
        Objects.requireNonNull(aVar, "clock");
        Instant instantOfEpochMilli = Instant.ofEpochMilli(System.currentTimeMillis());
        ZoneId zoneId = aVar.f34947a;
        Objects.requireNonNull(instantOfEpochMilli, "instant");
        Objects.requireNonNull(zoneId, "zone");
        return ofEpochDay(Math.floorDiv(instantOfEpochMilli.getEpochSecond() + ((long) zoneId.B().d(instantOfEpochMilli).f34941b), 86400));
    }

    public static LocalDate of(int i11, int i12, int i13) {
        ChronoField.YEAR.Z(i11);
        ChronoField.MONTH_OF_YEAR.Z(i12);
        ChronoField.DAY_OF_MONTH.Z(i13);
        return B(i11, i12, i13);
    }

    public static LocalDate d0(int i11, int i12) {
        long j11 = i11;
        ChronoField.YEAR.Z(j11);
        ChronoField.DAY_OF_YEAR.Z(i12);
        boolean zX = j$.time.chrono.p.f34989d.X(j11);
        if (i12 == 366 && !zX) {
            throw new c("Invalid date 'DayOfYear 366' as '" + i11 + "' is not a leap year");
        }
        Month monthJ = Month.J(((i12 - 1) / 31) + 1);
        if (i12 > (monthJ.B(zX) + monthJ.w(zX)) - 1) {
            monthJ = Month.f34931a[((((int) 1) + 12) + monthJ.ordinal()) % 12];
        }
        return new LocalDate(i11, monthJ.getValue(), (i12 - monthJ.w(zX)) + 1);
    }

    public static LocalDate ofEpochDay(long j11) {
        long j12;
        ChronoField.EPOCH_DAY.Z(j11);
        long j13 = 719468 + j11;
        if (j13 < 0) {
            long j14 = ((j11 + 719469) / 146097) - 1;
            j12 = j14 * 400;
            j13 += (-j14) * 146097;
        } else {
            j12 = 0;
        }
        long j15 = ((j13 * 400) + 591) / 146097;
        long j16 = j13 - ((j15 / 400) + (((j15 / 4) + (j15 * 365)) - (j15 / 100)));
        if (j16 < 0) {
            j15--;
            j16 = j13 - ((j15 / 400) + (((j15 / 4) + (365 * j15)) - (j15 / 100)));
        }
        int i11 = (int) j16;
        int i12 = ((i11 * 5) + 2) / 153;
        int i13 = ((i12 + 2) % 12) + 1;
        int i14 = (i11 - (((i12 * 306) + 5) / 10)) + 1;
        long j17 = j15 + j12 + ((long) (i12 / 10));
        ChronoField chronoField = ChronoField.YEAR;
        return new LocalDate(chronoField.f35149b.a(chronoField, j17), i13, i14);
    }

    public static LocalDate H(TemporalAccessor temporalAccessor) {
        Objects.requireNonNull(temporalAccessor, "temporal");
        LocalDate localDate = (LocalDate) temporalAccessor.d(j$.time.temporal.n.f35181f);
        if (localDate != null) {
            return localDate;
        }
        throw new c("Unable to obtain LocalDate from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName());
    }

    public static LocalDate parse(CharSequence charSequence, DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return (LocalDate) dateTimeFormatter.a(charSequence, new f(0));
    }

    public static LocalDate B(int i11, int i12, int i13) {
        int i14 = 28;
        if (i13 > 28) {
            if (i12 != 2) {
                i14 = (i12 == 4 || i12 == 6 || i12 == 9 || i12 == 11) ? 30 : 31;
            } else if (j$.time.chrono.p.f34989d.X(i11)) {
                i14 = 29;
            }
            if (i13 > i14) {
                if (i13 == 29) {
                    throw new c("Invalid date 'February 29' as '" + i11 + "' is not a leap year");
                }
                throw new c("Invalid date '" + Month.J(i12).name() + " " + i13 + "'");
            }
        }
        return new LocalDate(i11, i12, i13);
    }

    public static LocalDate h0(int i11, int i12, int i13) {
        if (i12 == 2) {
            i13 = Math.min(i13, j$.time.chrono.p.f34989d.X((long) i11) ? 29 : 28);
        } else if (i12 == 4 || i12 == 6 || i12 == 9 || i12 == 11) {
            i13 = Math.min(i13, 30);
        }
        return new LocalDate(i11, i12, i13);
    }

    public LocalDate(int i11, int i12, int i13) {
        this.f34917a = i11;
        this.f34918b = (short) i12;
        this.f34919c = (short) i13;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.p k(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.B(this);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        if (!chronoField.isDateBased()) {
            throw new j$.time.temporal.o(d.a("Unsupported field: ", temporalField));
        }
        int i11 = g.f35120a[chronoField.ordinal()];
        if (i11 == 1) {
            return j$.time.temporal.p.f(1L, lengthOfMonth());
        }
        if (i11 == 2) {
            return j$.time.temporal.p.f(1L, V());
        }
        if (i11 == 3) {
            return j$.time.temporal.p.f(1L, (getMonth() != Month.FEBRUARY || y()) ? 5L : 4L);
        }
        if (i11 != 4) {
            return chronoField.f35149b;
        }
        return getYear() <= 0 ? j$.time.temporal.p.f(1L, 1000000000L) : j$.time.temporal.p.f(1L, 999999999L);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public int get(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return J(temporalField);
        }
        return super.get(temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long j(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            if (temporalField == ChronoField.EPOCH_DAY) {
                return toEpochDay();
            }
            if (temporalField == ChronoField.PROLEPTIC_MONTH) {
                return W();
            }
            return J(temporalField);
        }
        return temporalField.Q(this);
    }

    public final int J(TemporalField temporalField) {
        switch (g.f35120a[((ChronoField) temporalField).ordinal()]) {
            case 1:
                return this.f34919c;
            case 2:
                return Q();
            case 3:
                return ((this.f34919c - 1) / 7) + 1;
            case 4:
                int i11 = this.f34917a;
                return i11 >= 1 ? i11 : 1 - i11;
            case 5:
                return getDayOfWeek().getValue();
            case 6:
                return ((this.f34919c - 1) % 7) + 1;
            case 7:
                return ((Q() - 1) % 7) + 1;
            case 8:
                throw new j$.time.temporal.o("Invalid field 'EpochDay' for get() method, use getLong() instead");
            case 9:
                return ((Q() - 1) / 7) + 1;
            case 10:
                return this.f34918b;
            case 11:
                throw new j$.time.temporal.o("Invalid field 'ProlepticMonth' for get() method, use getLong() instead");
            case 12:
                return this.f34917a;
            case 13:
                return this.f34917a >= 1 ? 1 : 0;
            default:
                throw new j$.time.temporal.o(d.a("Unsupported field: ", temporalField));
        }
    }

    public final long W() {
        return ((((long) this.f34917a) * 12) + ((long) this.f34918b)) - 1;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final Chronology g() {
        return j$.time.chrono.p.f34989d;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final j$.time.chrono.j O() {
        return getYear() >= 1 ? j$.time.chrono.q.CE : j$.time.chrono.q.BCE;
    }

    public int getYear() {
        return this.f34917a;
    }

    public int getMonthValue() {
        return this.f34918b;
    }

    public Month getMonth() {
        return Month.J(this.f34918b);
    }

    public int getDayOfMonth() {
        return this.f34919c;
    }

    public final int Q() {
        return (getMonth().w(y()) + this.f34919c) - 1;
    }

    public DayOfWeek getDayOfWeek() {
        return DayOfWeek.w(((int) Math.floorMod(toEpochDay() + 3, 7)) + 1);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final boolean y() {
        return j$.time.chrono.p.f34989d.X(this.f34917a);
    }

    public int lengthOfMonth() {
        short s3 = this.f34918b;
        if (s3 != 2) {
            return (s3 == 4 || s3 == 6 || s3 == 9 || s3 == 11) ? 30 : 31;
        }
        return y() ? 29 : 28;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final int V() {
        if (y()) {
            return 366;
        }
        return AchievementLevelType.DAY_STREAK_LV_10;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    /* JADX INFO: renamed from: i0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final LocalDate i(j$.time.temporal.k kVar) {
        if (kVar instanceof LocalDate) {
            return (LocalDate) kVar;
        }
        return (LocalDate) kVar.f(this);
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: with, reason: merged with bridge method [inline-methods] */
    public LocalDate a(TemporalField temporalField, long j11) {
        if (!(temporalField instanceof ChronoField)) {
            return (LocalDate) temporalField.W(this, j11);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        chronoField.Z(j11);
        switch (g.f35120a[chronoField.ordinal()]) {
            case 1:
                return withDayOfMonth((int) j11);
            case 2:
                int i11 = (int) j11;
                if (Q() != i11) {
                    return d0(this.f34917a, i11);
                }
                return this;
            case 3:
                return f0(j11 - j(ChronoField.ALIGNED_WEEK_OF_MONTH));
            case 4:
                if (this.f34917a < 1) {
                    j11 = 1 - j11;
                }
                return j0((int) j11);
            case 5:
                return plusDays(j11 - ((long) getDayOfWeek().getValue()));
            case 6:
                return plusDays(j11 - j(ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 7:
                return plusDays(j11 - j(ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 8:
                return ofEpochDay(j11);
            case 9:
                return f0(j11 - j(ChronoField.ALIGNED_WEEK_OF_YEAR));
            case 10:
                int i12 = (int) j11;
                if (this.f34918b != i12) {
                    ChronoField.MONTH_OF_YEAR.Z(i12);
                    return h0(this.f34917a, i12, this.f34919c);
                }
                return this;
            case 11:
                return plusMonths(j11 - W());
            case 12:
                return j0((int) j11);
            case 13:
                if (j(ChronoField.ERA) != j11) {
                    return j0(1 - this.f34917a);
                }
                return this;
            default:
                throw new j$.time.temporal.o(d.a("Unsupported field: ", temporalField));
        }
    }

    public final LocalDate j0(int i11) {
        if (this.f34917a == i11) {
            return this;
        }
        ChronoField.YEAR.Z(i11);
        return h0(i11, this.f34918b, this.f34919c);
    }

    public LocalDate withDayOfMonth(int i11) {
        return this.f34919c == i11 ? this : of(this.f34917a, this.f34918b, i11);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDate S(j$.time.temporal.m mVar) {
        if (mVar != null) {
            p pVar = (p) mVar;
            return plusMonths((((long) pVar.f35136a) * 12) + ((long) pVar.f35137b)).plusDays(pVar.f35138c);
        }
        Objects.requireNonNull(mVar, "amountToAdd");
        return (LocalDate) ((p) mVar).w(this);
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: e0, reason: merged with bridge method [inline-methods] */
    public final LocalDate b(long j11, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (LocalDate) temporalUnit.w(this, j11);
        }
        switch (g.f35121b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return plusDays(j11);
            case 2:
                return f0(j11);
            case 3:
                return plusMonths(j11);
            case 4:
                return g0(j11);
            case 5:
                return g0(Math.multiplyExact(j11, 10));
            case 6:
                return g0(Math.multiplyExact(j11, 100));
            case 7:
                return g0(Math.multiplyExact(j11, 1000));
            case 8:
                ChronoField chronoField = ChronoField.ERA;
                return a(chronoField, Math.addExact(j(chronoField), j11));
            default:
                throw new j$.time.temporal.o("Unsupported unit: " + temporalUnit);
        }
    }

    public final LocalDate g0(long j11) {
        if (j11 == 0) {
            return this;
        }
        ChronoField chronoField = ChronoField.YEAR;
        return h0(chronoField.f35149b.a(chronoField, ((long) this.f34917a) + j11), this.f34918b, this.f34919c);
    }

    public LocalDate plusMonths(long j11) {
        if (j11 == 0) {
            return this;
        }
        long j12 = (((long) this.f34917a) * 12) + ((long) (this.f34918b - 1)) + j11;
        ChronoField chronoField = ChronoField.YEAR;
        long j13 = 12;
        return h0(chronoField.f35149b.a(chronoField, Math.floorDiv(j12, j13)), ((int) Math.floorMod(j12, j13)) + 1, this.f34919c);
    }

    public final LocalDate f0(long j11) {
        return plusDays(Math.multiplyExact(j11, 7));
    }

    public LocalDate plusDays(long j11) {
        if (j11 == 0) {
            return this;
        }
        long j12 = ((long) this.f34919c) + j11;
        if (j12 > 0) {
            if (j12 <= 28) {
                return new LocalDate(this.f34917a, this.f34918b, (int) j12);
            }
            if (j12 <= 59) {
                long jLengthOfMonth = lengthOfMonth();
                if (j12 <= jLengthOfMonth) {
                    return new LocalDate(this.f34917a, this.f34918b, (int) j12);
                }
                short s3 = this.f34918b;
                if (s3 < 12) {
                    return new LocalDate(this.f34917a, s3 + 1, (int) (j12 - jLengthOfMonth));
                }
                ChronoField.YEAR.Z(this.f34917a + 1);
                return new LocalDate(this.f34917a + 1, 1, (int) (j12 - jLengthOfMonth));
            }
        }
        return ofEpochDay(Math.addExact(toEpochDay(), j11));
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
    public final LocalDate c(long j11, TemporalUnit temporalUnit) {
        return j11 == Long.MIN_VALUE ? b(Long.MAX_VALUE, temporalUnit).b(1L, temporalUnit) : b(-j11, temporalUnit);
    }

    public LocalDate minusMonths(long j11) {
        return j11 == Long.MIN_VALUE ? plusMonths(Long.MAX_VALUE).plusMonths(1L) : plusMonths(-j11);
    }

    public LocalDate minusWeeks(long j11) {
        return j11 == Long.MIN_VALUE ? f0(Long.MAX_VALUE).f0(1L) : f0(-j11);
    }

    public LocalDate minusDays(long j11) {
        return j11 == Long.MIN_VALUE ? plusDays(Long.MAX_VALUE).plusDays(1L) : plusDays(-j11);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object d(f fVar) {
        return fVar == j$.time.temporal.n.f35181f ? this : super.d(fVar);
    }

    @Override // j$.time.temporal.Temporal
    public final long m(Temporal temporal, TemporalUnit temporalUnit) {
        LocalDate localDateH = H(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.between(this, localDateH);
        }
        switch (g.f35121b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return localDateH.toEpochDay() - toEpochDay();
            case 2:
                return (localDateH.toEpochDay() - toEpochDay()) / 7;
            case 3:
                return b0(localDateH);
            case 4:
                return b0(localDateH) / 12;
            case 5:
                return b0(localDateH) / 120;
            case 6:
                return b0(localDateH) / 1200;
            case 7:
                return b0(localDateH) / 12000;
            case 8:
                ChronoField chronoField = ChronoField.ERA;
                return localDateH.j(chronoField) - j(chronoField);
            default:
                throw new j$.time.temporal.o("Unsupported unit: " + temporalUnit);
        }
    }

    public final long b0(LocalDate localDate) {
        return (((localDate.W() * 32) + ((long) localDate.getDayOfMonth())) - ((W() * 32) + ((long) getDayOfMonth()))) / 32;
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return dateTimeFormatter.format(this);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    /* JADX INFO: renamed from: atTime, reason: merged with bridge method [inline-methods] */
    public LocalDateTime L(LocalTime localTime) {
        return LocalDateTime.J(this, localTime);
    }

    public LocalDateTime atStartOfDay() {
        return LocalDateTime.J(this, LocalTime.MIDNIGHT);
    }

    public ZonedDateTime atStartOfDay(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        LocalDateTime localDateTimeL = L(LocalTime.MIDNIGHT);
        if (!(zoneId instanceof ZoneOffset)) {
            Object objE = zoneId.B().e(localDateTimeL);
            j$.time.zone.b bVar = objE instanceof j$.time.zone.b ? (j$.time.zone.b) objE : null;
            if (bVar != null && bVar.w()) {
                localDateTimeL = bVar.f35207b.Z(bVar.f35209d.f34941b - bVar.f35208c.f34941b);
            }
        }
        return ZonedDateTime.H(localDateTimeL, zoneId, null);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public long toEpochDay() {
        long j11;
        long j12 = this.f34917a;
        long j13 = this.f34918b;
        long j14 = 365 * j12;
        if (j12 >= 0) {
            j11 = ((j12 + 399) / 400) + (((3 + j12) / 4) - ((99 + j12) / 100)) + j14;
        } else {
            j11 = j14 - ((j12 / (-400)) + ((j12 / (-4)) - (j12 / (-100))));
        }
        long j15 = (((367 * j13) - 362) / 12) + j11 + ((long) (this.f34919c - 1));
        if (j13 > 2) {
            j15 = !y() ? j15 - 2 : j15 - 1;
        }
        return j15 - 719528;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // j$.time.chrono.ChronoLocalDate, java.lang.Comparable
    public int compareTo(ChronoLocalDate chronoLocalDate) {
        if (chronoLocalDate instanceof LocalDate) {
            return w((LocalDate) chronoLocalDate);
        }
        return super.compareTo(chronoLocalDate);
    }

    public final int w(LocalDate localDate) {
        int i11 = this.f34917a - localDate.f34917a;
        if (i11 != 0) {
            return i11;
        }
        int i12 = this.f34918b - localDate.f34918b;
        return i12 == 0 ? this.f34919c - localDate.f34919c : i12;
    }

    public final boolean Z(ChronoLocalDate chronoLocalDate) {
        if (chronoLocalDate instanceof LocalDate) {
            return w((LocalDate) chronoLocalDate) < 0;
        }
        return toEpochDay() < chronoLocalDate.toEpochDay();
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LocalDate) && w((LocalDate) obj) == 0;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final int hashCode() {
        int i11 = this.f34917a;
        return (((i11 << 11) + (this.f34918b << 6)) + this.f34919c) ^ (i11 & (-2048));
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final String toString() {
        int i11 = this.f34917a;
        short s3 = this.f34918b;
        short s11 = this.f34919c;
        int iAbs = Math.abs(i11);
        StringBuilder sb2 = new StringBuilder(10);
        if (iAbs >= 1000) {
            if (i11 > 9999) {
                sb2.append('+');
            }
            sb2.append(i11);
        } else if (i11 < 0) {
            sb2.append(i11 - 10000);
            sb2.deleteCharAt(1);
        } else {
            sb2.append(i11 + 10000);
            sb2.deleteCharAt(0);
        }
        sb2.append(s3 < 10 ? "-0" : "-");
        sb2.append((int) s3);
        sb2.append(s11 < 10 ? "-0" : "-");
        sb2.append((int) s11);
        return sb2.toString();
    }

    private Object writeReplace() {
        return new q((byte) 3, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
