package j$.time;

import j$.time.chrono.ChronoLocalDateTime;
import j$.time.chrono.ChronoZonedDateTime;
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
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class ZonedDateTime implements Temporal, ChronoZonedDateTime<LocalDate>, Serializable {
    private static final long serialVersionUID = -6260982410461394882L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDateTime f34943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ZoneOffset f34944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ZoneId f34945c;

    public static ZonedDateTime H(LocalDateTime localDateTime, ZoneId zoneId, ZoneOffset zoneOffset) {
        Objects.requireNonNull(localDateTime, "localDateTime");
        Objects.requireNonNull(zoneId, "zone");
        if (zoneId instanceof ZoneOffset) {
            return new ZonedDateTime(localDateTime, zoneId, (ZoneOffset) zoneId);
        }
        j$.time.zone.f fVarB = zoneId.B();
        List listF = fVarB.f(localDateTime);
        if (listF.size() == 1) {
            zoneOffset = (ZoneOffset) listF.get(0);
        } else if (listF.size() != 0) {
            if (zoneOffset == null || !listF.contains(zoneOffset)) {
                zoneOffset = (ZoneOffset) listF.get(0);
                Objects.requireNonNull(zoneOffset, "offset");
            }
        } else {
            Object objE = fVarB.e(localDateTime);
            j$.time.zone.b bVar = objE instanceof j$.time.zone.b ? (j$.time.zone.b) objE : null;
            localDateTime = localDateTime.Z(Duration.B(bVar.f35209d.f34941b - bVar.f35208c.f34941b, 0).getSeconds());
            zoneOffset = bVar.f35209d;
        }
        return new ZonedDateTime(localDateTime, zoneId, zoneOffset);
    }

    public static ZonedDateTime w(long j11, int i11, ZoneId zoneId) {
        ZoneOffset zoneOffsetD = zoneId.B().d(Instant.H(j11, i11));
        return new ZonedDateTime(LocalDateTime.Q(j11, i11, zoneOffsetD), zoneId, zoneOffsetD);
    }

    public static ZonedDateTime B(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof ZonedDateTime) {
            return (ZonedDateTime) temporalAccessor;
        }
        try {
            ZoneId zoneIdW = ZoneId.w(temporalAccessor);
            ChronoField chronoField = ChronoField.INSTANT_SECONDS;
            if (!temporalAccessor.h(chronoField)) {
                return H(LocalDateTime.J(LocalDate.H(temporalAccessor), LocalTime.H(temporalAccessor)), zoneIdW, null);
            }
            return w(temporalAccessor.j(chronoField), temporalAccessor.get(ChronoField.NANO_OF_SECOND), zoneIdW);
        } catch (c e8) {
            throw new c("Unable to obtain ZonedDateTime from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName(), e8);
        }
    }

    public static ZonedDateTime parse(CharSequence charSequence, DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return (ZonedDateTime) dateTimeFormatter.a(charSequence, new f(1));
    }

    public ZonedDateTime(LocalDateTime localDateTime, ZoneId zoneId, ZoneOffset zoneOffset) {
        this.f34943a = localDateTime;
        this.f34944b = zoneOffset;
        this.f34945c = zoneId;
    }

    public final ZonedDateTime Q(ZoneOffset zoneOffset) {
        return (zoneOffset.equals(this.f34944b) || !this.f34945c.B().f(this.f34943a).contains(zoneOffset)) ? this : new ZonedDateTime(this.f34943a, this.f34945c, zoneOffset);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean h(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return true;
        }
        return temporalField != null && temporalField.w(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.p k(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            if (temporalField == ChronoField.INSTANT_SECONDS || temporalField == ChronoField.OFFSET_SECONDS) {
                return ((ChronoField) temporalField).f35149b;
            }
            return this.f34943a.k(temporalField);
        }
        return temporalField.B(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int get(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            int i11 = w.f35202a[((ChronoField) temporalField).ordinal()];
            if (i11 == 1) {
                throw new j$.time.temporal.o("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
            }
            if (i11 == 2) {
                return this.f34944b.f34941b;
            }
            return this.f34943a.get(temporalField);
        }
        return super.get(temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long j(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            int i11 = w.f35202a[((ChronoField) temporalField).ordinal()];
            if (i11 == 1) {
                return Y();
            }
            if (i11 == 2) {
                return this.f34944b.f34941b;
            }
            return this.f34943a.j(temporalField);
        }
        return temporalField.Q(this);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ZoneOffset n() {
        return this.f34944b;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ZoneId K() {
        return this.f34945c;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ChronoZonedDateTime F(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        return this.f34945c.equals(zoneId) ? this : H(this.f34943a, zoneId, this.f34944b);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
    public final ZonedDateTime o(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        return this.f34945c.equals(zoneId) ? this : w(this.f34943a.toEpochSecond(this.f34944b), this.f34943a.f34923b.f34930d, zoneId);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ChronoLocalDateTime x() {
        return this.f34943a;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    /* JADX INFO: renamed from: toLocalDate, reason: merged with bridge method [inline-methods] */
    public LocalDate l() {
        return this.f34943a.f34922a;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public LocalTime toLocalTime() {
        return this.f34943a.f34923b;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public final ZonedDateTime i(j$.time.temporal.k kVar) {
        if (kVar instanceof LocalDate) {
            return H(LocalDateTime.J((LocalDate) kVar, this.f34943a.f34923b), this.f34945c, this.f34944b);
        }
        if (kVar instanceof LocalTime) {
            return H(LocalDateTime.J(this.f34943a.f34922a, (LocalTime) kVar), this.f34945c, this.f34944b);
        }
        if (kVar instanceof LocalDateTime) {
            return H((LocalDateTime) kVar, this.f34945c, this.f34944b);
        }
        if (kVar instanceof OffsetDateTime) {
            OffsetDateTime offsetDateTime = (OffsetDateTime) kVar;
            return H(offsetDateTime.toLocalDateTime(), this.f34945c, offsetDateTime.f34935b);
        }
        if (kVar instanceof Instant) {
            Instant instant = (Instant) kVar;
            return w(instant.getEpochSecond(), instant.f34914b, this.f34945c);
        }
        if (kVar instanceof ZoneOffset) {
            return Q((ZoneOffset) kVar);
        }
        return (ZonedDateTime) kVar.f(this);
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public final ZonedDateTime a(TemporalField temporalField, long j11) {
        if (temporalField instanceof ChronoField) {
            ChronoField chronoField = (ChronoField) temporalField;
            int i11 = w.f35202a[chronoField.ordinal()];
            if (i11 == 1) {
                return w(j11, this.f34943a.f34923b.f34930d, this.f34945c);
            }
            if (i11 != 2) {
                return H(this.f34943a.a(temporalField, j11), this.f34945c, this.f34944b);
            }
            return Q(ZoneOffset.c0(chronoField.f35149b.a(chronoField, j11)));
        }
        return (ZonedDateTime) temporalField.W(this, j11);
    }

    public ZonedDateTime withDayOfMonth(int i11) {
        LocalDateTime localDateTime = this.f34943a;
        return H(localDateTime.b0(localDateTime.f34922a.withDayOfMonth(i11), localDateTime.f34923b), this.f34945c, this.f34944b);
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public final ZonedDateTime b(long j11, TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            ChronoUnit chronoUnit = (ChronoUnit) temporalUnit;
            if (chronoUnit.compareTo(ChronoUnit.DAYS) >= 0 && chronoUnit != ChronoUnit.FOREVER) {
                return H(this.f34943a.b(j11, temporalUnit), this.f34945c, this.f34944b);
            }
            LocalDateTime localDateTimeW = this.f34943a.b(j11, temporalUnit);
            ZoneOffset zoneOffset = this.f34944b;
            ZoneId zoneId = this.f34945c;
            Objects.requireNonNull(localDateTimeW, "localDateTime");
            Objects.requireNonNull(zoneOffset, "offset");
            Objects.requireNonNull(zoneId, "zone");
            if (zoneId.B().f(localDateTimeW).contains(zoneOffset)) {
                return new ZonedDateTime(localDateTimeW, zoneId, zoneOffset);
            }
            return w(localDateTimeW.toEpochSecond(zoneOffset), localDateTimeW.f34923b.f34930d, zoneId);
        }
        return (ZonedDateTime) temporalUnit.w(this, j11);
    }

    @Override // j$.time.temporal.Temporal
    public final ChronoZonedDateTime c(long j11, TemporalUnit temporalUnit) {
        return j11 == Long.MIN_VALUE ? b(Long.MAX_VALUE, temporalUnit).b(1L, temporalUnit) : b(-j11, temporalUnit);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal c(long j11, TemporalUnit temporalUnit) {
        return j11 == Long.MIN_VALUE ? b(Long.MAX_VALUE, temporalUnit).b(1L, temporalUnit) : b(-j11, temporalUnit);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object d(f fVar) {
        if (fVar == j$.time.temporal.n.f35181f) {
            return l();
        }
        return super.d(fVar);
    }

    @Override // j$.time.temporal.Temporal
    public final long m(Temporal temporal, TemporalUnit temporalUnit) {
        ZonedDateTime zonedDateTimeB = B(temporal);
        if (temporalUnit instanceof ChronoUnit) {
            ZonedDateTime zonedDateTimeO = zonedDateTimeB.o(this.f34945c);
            ChronoUnit chronoUnit = (ChronoUnit) temporalUnit;
            if (chronoUnit.compareTo(ChronoUnit.DAYS) >= 0 && chronoUnit != ChronoUnit.FOREVER) {
                return this.f34943a.m(zonedDateTimeO.f34943a, temporalUnit);
            }
            return new OffsetDateTime(this.f34943a, this.f34944b).m(new OffsetDateTime(zonedDateTimeO.f34943a, zonedDateTimeO.f34944b), temporalUnit);
        }
        return temporalUnit.between(this, zonedDateTimeB);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZonedDateTime) {
            ZonedDateTime zonedDateTime = (ZonedDateTime) obj;
            if (this.f34943a.equals(zonedDateTime.f34943a) && this.f34944b.equals(zonedDateTime.f34944b) && this.f34945c.equals(zonedDateTime.f34945c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f34943a.hashCode() ^ this.f34944b.f34941b) ^ Integer.rotateLeft(this.f34945c.hashCode(), 3);
    }

    public final String toString() {
        String str = this.f34943a.toString() + this.f34944b.f34942c;
        ZoneOffset zoneOffset = this.f34944b;
        ZoneId zoneId = this.f34945c;
        if (zoneOffset == zoneId) {
            return str;
        }
        return str + "[" + zoneId.toString() + "]";
    }

    private Object writeReplace() {
        return new q((byte) 6, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
