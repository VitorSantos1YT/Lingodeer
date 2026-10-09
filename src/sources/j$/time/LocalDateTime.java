package j$.time;

import j$.time.chrono.ChronoLocalDate;
import j$.time.chrono.ChronoLocalDateTime;
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
public final class LocalDateTime implements Temporal, j$.time.temporal.k, ChronoLocalDateTime<LocalDate>, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final LocalDateTime f34920c = J(LocalDate.f34915d, LocalTime.f34924e);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final LocalDateTime f34921d = J(LocalDate.f34916e, LocalTime.f34925f);
    private static final long serialVersionUID = 6207766400415563566L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f34922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalTime f34923b;

    @Override // j$.time.chrono.ChronoLocalDateTime
    /* JADX INFO: renamed from: atZone, reason: merged with bridge method [inline-methods] */
    public ZonedDateTime G(ZoneId zoneId) {
        return ZonedDateTime.H(this, zoneId, null);
    }

    public static LocalDateTime J(LocalDate localDate, LocalTime localTime) {
        Objects.requireNonNull(localDate, "date");
        Objects.requireNonNull(localTime, "time");
        return new LocalDateTime(localDate, localTime);
    }

    public static LocalDateTime Q(long j11, int i11, ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, "offset");
        long j12 = i11;
        ChronoField.NANO_OF_SECOND.Z(j12);
        long j13 = j11 + ((long) zoneOffset.f34941b);
        long j14 = 86400;
        return new LocalDateTime(LocalDate.ofEpochDay(Math.floorDiv(j13, j14)), LocalTime.W((((long) ((int) Math.floorMod(j13, j14))) * 1000000000) + j12));
    }

    public static LocalDateTime B(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof LocalDateTime) {
            return (LocalDateTime) temporalAccessor;
        }
        if (!(temporalAccessor instanceof ZonedDateTime)) {
            if (temporalAccessor instanceof OffsetDateTime) {
                return ((OffsetDateTime) temporalAccessor).toLocalDateTime();
            }
            try {
                return new LocalDateTime(LocalDate.H(temporalAccessor), LocalTime.H(temporalAccessor));
            } catch (c e8) {
                throw new c("Unable to obtain LocalDateTime from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName(), e8);
            }
        }
        return ((ZonedDateTime) temporalAccessor).f34943a;
    }

    public LocalDateTime(LocalDate localDate, LocalTime localTime) {
        this.f34922a = localDate;
        this.f34923b = localTime;
    }

    public final LocalDateTime b0(LocalDate localDate, LocalTime localTime) {
        return (this.f34922a == localDate && this.f34923b == localTime) ? this : new LocalDateTime(localDate, localTime);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean h(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField != null && temporalField.w(this);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        return chronoField.isDateBased() || chronoField.a0();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.p k(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return ((ChronoField) temporalField).a0() ? this.f34923b.k(temporalField) : this.f34922a.k(temporalField);
        }
        return temporalField.B(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int get(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return ((ChronoField) temporalField).a0() ? this.f34923b.get(temporalField) : this.f34922a.get(temporalField);
        }
        return super.get(temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long j(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return ((ChronoField) temporalField).a0() ? this.f34923b.j(temporalField) : this.f34922a.j(temporalField);
        }
        return temporalField.Q(this);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final ChronoLocalDate l() {
        return this.f34922a;
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final LocalTime toLocalTime() {
        return this.f34923b;
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime i(j$.time.temporal.k kVar) {
        if (kVar instanceof LocalDate) {
            return b0((LocalDate) kVar, this.f34923b);
        }
        if (kVar instanceof LocalTime) {
            return b0(this.f34922a, (LocalTime) kVar);
        }
        if (kVar instanceof LocalDateTime) {
            return (LocalDateTime) kVar;
        }
        return (LocalDateTime) kVar.f(this);
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: d0, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime a(TemporalField temporalField, long j11) {
        if (temporalField instanceof ChronoField) {
            if (((ChronoField) temporalField).a0()) {
                return b0(this.f34922a, this.f34923b.a(temporalField, j11));
            }
            return b0(this.f34922a.a(temporalField, j11), this.f34923b);
        }
        return (LocalDateTime) temporalField.W(this, j11);
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime b(long j11, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (LocalDateTime) temporalUnit.w(this, j11);
        }
        switch (h.f35122a[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return a0(this.f34922a, 0L, 0L, 0L, j11);
            case 2:
                LocalDateTime localDateTimeB0 = b0(this.f34922a.plusDays(j11 / 86400000000L), this.f34923b);
                return localDateTimeB0.a0(localDateTimeB0.f34922a, 0L, 0L, 0L, (j11 % 86400000000L) * 1000);
            case 3:
                LocalDateTime localDateTimeB1 = b0(this.f34922a.plusDays(j11 / 86400000), this.f34923b);
                return localDateTimeB1.a0(localDateTimeB1.f34922a, 0L, 0L, 0L, (j11 % 86400000) * 1000000);
            case 4:
                return Z(j11);
            case 5:
                return a0(this.f34922a, 0L, j11, 0L, 0L);
            case 6:
                return a0(this.f34922a, j11, 0L, 0L, 0L);
            case 7:
                LocalDateTime localDateTimeB2 = b0(this.f34922a.plusDays(j11 / 256), this.f34923b);
                return localDateTimeB2.a0(localDateTimeB2.f34922a, (j11 % 256) * 12, 0L, 0L, 0L);
            default:
                return b0(this.f34922a.b(j11, temporalUnit), this.f34923b);
        }
    }

    public final LocalDateTime Z(long j11) {
        return a0(this.f34922a, 0L, 0L, j11, 0L);
    }

    @Override // j$.time.temporal.Temporal
    public final ChronoLocalDateTime c(long j11, TemporalUnit temporalUnit) {
        return j11 == Long.MIN_VALUE ? b(Long.MAX_VALUE, temporalUnit).b(1L, temporalUnit) : b(-j11, temporalUnit);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal c(long j11, TemporalUnit temporalUnit) {
        return j11 == Long.MIN_VALUE ? b(Long.MAX_VALUE, temporalUnit).b(1L, temporalUnit) : b(-j11, temporalUnit);
    }

    public final LocalDateTime a0(LocalDate localDate, long j11, long j12, long j13, long j14) {
        if ((j11 | j12 | j13 | j14) == 0) {
            return b0(localDate, this.f34923b);
        }
        long j15 = 1;
        long jF0 = this.f34923b.f0();
        long j16 = ((((j11 % 24) * 3600000000000L) + ((j12 % 1440) * 60000000000L) + ((j13 % 86400) * 1000000000) + (j14 % 86400000000000L)) * j15) + jF0;
        long jFloorDiv = Math.floorDiv(j16, 86400000000000L) + (((j11 / 24) + (j12 / 1440) + (j13 / 86400) + (j14 / 86400000000000L)) * j15);
        long jFloorMod = Math.floorMod(j16, 86400000000000L);
        return b0(localDate.plusDays(jFloorDiv), jFloorMod == jF0 ? this.f34923b : LocalTime.W(jFloorMod));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object d(f fVar) {
        if (fVar == j$.time.temporal.n.f35181f) {
            return this.f34922a;
        }
        return super.d(fVar);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:35:0x00d7  */
    @Override // j$.time.temporal.Temporal
    public final long m(Temporal temporal, TemporalUnit temporalUnit) {
        long jMultiplyExact;
        long j11;
        LocalDateTime localDateTimeB = B(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.between(this, localDateTimeB);
        }
        ChronoUnit chronoUnit = (ChronoUnit) temporalUnit;
        if (chronoUnit.compareTo(ChronoUnit.DAYS) >= 0) {
            LocalDate localDateMinusDays = localDateTimeB.f34922a;
            LocalDate localDate = this.f34922a;
            if (localDate == null) {
                if (localDateMinusDays.toEpochDay() > localDate.toEpochDay()) {
                    if (localDateTimeB.f34923b.compareTo(this.f34923b) < 0) {
                        localDateMinusDays = localDateMinusDays.minusDays(1L);
                    }
                }
                return this.f34922a.m(localDateMinusDays, temporalUnit);
            }
            localDateMinusDays.getClass();
            if (localDateMinusDays.w(localDate) > 0) {
                if (localDateTimeB.f34923b.compareTo(this.f34923b) < 0) {
                    localDateMinusDays = localDateMinusDays.minusDays(1L);
                }
            }
            return this.f34922a.m(localDateMinusDays, temporalUnit);
            if (localDateMinusDays.Z(this.f34922a) && localDateTimeB.f34923b.compareTo(this.f34923b) > 0) {
                localDateMinusDays = localDateMinusDays.plusDays(1L);
            }
            return this.f34922a.m(localDateMinusDays, temporalUnit);
        }
        LocalDate localDate2 = this.f34922a;
        LocalDate localDate3 = localDateTimeB.f34922a;
        localDate2.getClass();
        long epochDay = localDate3.toEpochDay() - localDate2.toEpochDay();
        if (epochDay == 0) {
            return this.f34923b.m(localDateTimeB.f34923b, temporalUnit);
        }
        long jF0 = localDateTimeB.f34923b.f0() - this.f34923b.f0();
        if (epochDay > 0) {
            jMultiplyExact = epochDay - 1;
            j11 = jF0 + 86400000000000L;
        } else {
            jMultiplyExact = epochDay + 1;
            j11 = jF0 - 86400000000000L;
        }
        switch (h.f35122a[chronoUnit.ordinal()]) {
            case 1:
                jMultiplyExact = Math.multiplyExact(jMultiplyExact, 86400000000000L);
                break;
            case 2:
                jMultiplyExact = Math.multiplyExact(jMultiplyExact, 86400000000L);
                j11 /= 1000;
                break;
            case 3:
                jMultiplyExact = Math.multiplyExact(jMultiplyExact, 86400000L);
                j11 /= 1000000;
                break;
            case 4:
                jMultiplyExact = Math.multiplyExact(jMultiplyExact, 86400);
                j11 /= 1000000000;
                break;
            case 5:
                jMultiplyExact = Math.multiplyExact(jMultiplyExact, 1440);
                j11 /= 60000000000L;
                break;
            case 6:
                jMultiplyExact = Math.multiplyExact(jMultiplyExact, 24);
                j11 /= 3600000000000L;
                break;
            case 7:
                jMultiplyExact = Math.multiplyExact(jMultiplyExact, 2);
                j11 /= 43200000000000L;
                break;
        }
        return Math.addExact(jMultiplyExact, j11);
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return dateTimeFormatter.format(this);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime, java.lang.Comparable
    /* JADX INFO: renamed from: P */
    public final int compareTo(ChronoLocalDateTime chronoLocalDateTime) {
        if (chronoLocalDateTime instanceof LocalDateTime) {
            return w((LocalDateTime) chronoLocalDateTime);
        }
        return super.compareTo(chronoLocalDateTime);
    }

    public final int w(LocalDateTime localDateTime) {
        int iW = this.f34922a.w(localDateTime.f34922a);
        return iW == 0 ? this.f34923b.compareTo(localDateTime.f34923b) : iW;
    }

    public final boolean H(ChronoLocalDateTime chronoLocalDateTime) {
        if (chronoLocalDateTime instanceof LocalDateTime) {
            return w((LocalDateTime) chronoLocalDateTime) < 0;
        }
        long epochDay = this.f34922a.toEpochDay();
        long epochDay2 = chronoLocalDateTime.l().toEpochDay();
        if (epochDay >= epochDay2) {
            return epochDay == epochDay2 && this.f34923b.f0() < chronoLocalDateTime.toLocalTime().f0();
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocalDateTime) {
            LocalDateTime localDateTime = (LocalDateTime) obj;
            if (this.f34922a.equals(localDateTime.f34922a) && this.f34923b.equals(localDateTime.f34923b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f34922a.hashCode() ^ this.f34923b.hashCode();
    }

    public final String toString() {
        return this.f34922a.toString() + "T" + this.f34923b.toString();
    }

    private Object writeReplace() {
        return new q((byte) 5, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
