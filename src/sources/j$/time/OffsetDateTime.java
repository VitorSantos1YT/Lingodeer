package j$.time;

import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalUnit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class OffsetDateTime implements Temporal, j$.time.temporal.k, Comparable<OffsetDateTime>, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f34933c = 0;
    private static final long serialVersionUID = 2287754244819255394L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDateTime f34934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ZoneOffset f34935b;

    @Override // java.lang.Comparable
    public final int compareTo(OffsetDateTime offsetDateTime) {
        int iCompare;
        OffsetDateTime offsetDateTime2 = offsetDateTime;
        if (this.f34935b.equals(offsetDateTime2.f34935b)) {
            iCompare = toLocalDateTime().compareTo(offsetDateTime2.toLocalDateTime());
        } else {
            iCompare = Long.compare(this.f34934a.toEpochSecond(this.f34935b), offsetDateTime2.f34934a.toEpochSecond(offsetDateTime2.f34935b));
            if (iCompare == 0) {
                iCompare = this.f34934a.f34923b.f34930d - offsetDateTime2.f34934a.f34923b.f34930d;
            }
        }
        return iCompare == 0 ? toLocalDateTime().compareTo(offsetDateTime2.toLocalDateTime()) : iCompare;
    }

    static {
        LocalDateTime localDateTime = LocalDateTime.f34920c;
        ZoneOffset zoneOffset = ZoneOffset.f34940g;
        localDateTime.getClass();
        new OffsetDateTime(localDateTime, zoneOffset);
        LocalDateTime localDateTime2 = LocalDateTime.f34921d;
        ZoneOffset zoneOffset2 = ZoneOffset.f34939f;
        localDateTime2.getClass();
        new OffsetDateTime(localDateTime2, zoneOffset2);
    }

    public static OffsetDateTime w(Instant instant, ZoneId zoneId) {
        Objects.requireNonNull(instant, "instant");
        Objects.requireNonNull(zoneId, "zone");
        ZoneOffset zoneOffsetD = zoneId.B().d(instant);
        return new OffsetDateTime(LocalDateTime.Q(instant.getEpochSecond(), instant.f34914b, zoneOffsetD), zoneOffsetD);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v15, types: [j$.time.OffsetDateTime] */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    @Override // j$.time.temporal.Temporal
    public final long m(Temporal temporal, TemporalUnit temporalUnit) {
        OffsetDateTime offsetDateTime;
        if (temporal instanceof OffsetDateTime) {
            temporal = (OffsetDateTime) temporal;
        } else {
            try {
                ZoneOffset zoneOffsetZ = ZoneOffset.Z(temporal);
                LocalDate localDate = (LocalDate) temporal.d(j$.time.temporal.n.f35181f);
                LocalTime localTime = (LocalTime) temporal.d(j$.time.temporal.n.f35182g);
                if (localDate != null && localTime != null) {
                    temporal = new OffsetDateTime(LocalDateTime.J(localDate, localTime), zoneOffsetZ);
                } else {
                    temporal = w(Instant.B(temporal), zoneOffsetZ);
                }
            } catch (c e8) {
                throw new c("Unable to obtain OffsetDateTime from TemporalAccessor: " + temporal + " of type " + temporal.getClass().getName(), e8);
            }
        }
        if (temporalUnit instanceof ChronoUnit) {
            ZoneOffset zoneOffset = this.f34935b;
            if (!zoneOffset.equals(temporal.f34935b)) {
                offsetDateTime = temporal;
                offsetDateTime = new OffsetDateTime(temporal.f34934a.Z(zoneOffset.f34941b - temporal.f34935b.f34941b), zoneOffset);
            }
            offsetDateTime = temporal;
            return this.f34934a.m(offsetDateTime.f34934a, temporalUnit);
        }
        return temporalUnit.between(this, temporal);
    }

    public OffsetDateTime(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        Objects.requireNonNull(localDateTime, "dateTime");
        this.f34934a = localDateTime;
        Objects.requireNonNull(zoneOffset, "offset");
        this.f34935b = zoneOffset;
    }

    public final OffsetDateTime H(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        return (this.f34934a == localDateTime && this.f34935b.equals(zoneOffset)) ? this : new OffsetDateTime(localDateTime, zoneOffset);
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
            if (temporalField != ChronoField.INSTANT_SECONDS && temporalField != ChronoField.OFFSET_SECONDS) {
                return this.f34934a.k(temporalField);
            }
            return ((ChronoField) temporalField).f35149b;
        }
        return temporalField.B(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int get(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            int i11 = m.f35130a[((ChronoField) temporalField).ordinal()];
            if (i11 == 1) {
                throw new j$.time.temporal.o("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
            }
            if (i11 == 2) {
                return this.f34935b.f34941b;
            }
            return this.f34934a.get(temporalField);
        }
        return super.get(temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long j(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            int i11 = m.f35130a[((ChronoField) temporalField).ordinal()];
            if (i11 == 1) {
                return this.f34934a.toEpochSecond(this.f34935b);
            }
            if (i11 == 2) {
                return this.f34935b.f34941b;
            }
            return this.f34934a.j(temporalField);
        }
        return temporalField.Q(this);
    }

    public LocalDateTime toLocalDateTime() {
        return this.f34934a;
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: e */
    public final Temporal i(LocalDate localDate) {
        if (localDate != null) {
            return H(this.f34934a.i(localDate), this.f34935b);
        }
        return (OffsetDateTime) localDate.f(this);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal a(TemporalField temporalField, long j11) {
        if (temporalField instanceof ChronoField) {
            ChronoField chronoField = (ChronoField) temporalField;
            int i11 = m.f35130a[chronoField.ordinal()];
            if (i11 == 1) {
                return w(Instant.H(j11, this.f34934a.f34923b.f34930d), this.f34935b);
            }
            if (i11 == 2) {
                return H(this.f34934a, ZoneOffset.c0(chronoField.f35149b.a(chronoField, j11)));
            }
            return H(this.f34934a.a(temporalField, j11), this.f34935b);
        }
        return (OffsetDateTime) temporalField.W(this, j11);
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public final OffsetDateTime b(long j11, TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            return H(this.f34934a.b(j11, temporalUnit), this.f34935b);
        }
        return (OffsetDateTime) temporalUnit.w(this, j11);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal c(long j11, TemporalUnit temporalUnit) {
        return j11 == Long.MIN_VALUE ? b(Long.MAX_VALUE, temporalUnit).b(1L, temporalUnit) : b(-j11, temporalUnit);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object d(f fVar) {
        if (fVar == j$.time.temporal.n.f35179d || fVar == j$.time.temporal.n.f35180e) {
            return this.f34935b;
        }
        if (fVar == j$.time.temporal.n.f35176a) {
            return null;
        }
        if (fVar == j$.time.temporal.n.f35181f) {
            return this.f34934a.f34922a;
        }
        if (fVar == j$.time.temporal.n.f35182g) {
            return this.f34934a.f34923b;
        }
        if (fVar == j$.time.temporal.n.f35177b) {
            return j$.time.chrono.p.f34989d;
        }
        if (fVar == j$.time.temporal.n.f35178c) {
            return ChronoUnit.NANOS;
        }
        return fVar.k(this);
    }

    @Override // j$.time.temporal.k
    public final Temporal f(Temporal temporal) {
        return temporal.a(ChronoField.EPOCH_DAY, this.f34934a.f34922a.toEpochDay()).a(ChronoField.NANO_OF_DAY, this.f34934a.f34923b.f0()).a(ChronoField.OFFSET_SECONDS, this.f34935b.f34941b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OffsetDateTime) {
            OffsetDateTime offsetDateTime = (OffsetDateTime) obj;
            if (this.f34934a.equals(offsetDateTime.f34934a) && this.f34935b.equals(offsetDateTime.f34935b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f34934a.hashCode() ^ this.f34935b.f34941b;
    }

    public final String toString() {
        return this.f34934a.toString() + this.f34935b.f34942c;
    }

    private Object writeReplace() {
        return new q((byte) 10, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
