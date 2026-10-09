package j$.time;

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
public final class Instant implements Temporal, j$.time.temporal.k, Comparable<Instant>, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Instant f34912c = new Instant(0, 0);
    private static final long serialVersionUID = -665713676816604388L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f34913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f34914b;

    public static Instant now() {
        a.f34946b.getClass();
        return ofEpochMilli(System.currentTimeMillis());
    }

    @Override // java.lang.Comparable
    public final int compareTo(Instant instant) {
        Instant instant2 = instant;
        int iCompare = Long.compare(this.f34913a, instant2.f34913a);
        return iCompare != 0 ? iCompare : this.f34914b - instant2.f34914b;
    }

    static {
        H(-31557014167219200L, 0L);
        H(31556889864403199L, 999999999L);
    }

    public static Instant ofEpochSecond(long j11) {
        return w(j11, 0);
    }

    public static Instant H(long j11, long j12) {
        return w(Math.addExact(j11, Math.floorDiv(j12, 1000000000L)), (int) Math.floorMod(j12, 1000000000L));
    }

    public static Instant ofEpochMilli(long j11) {
        long j12 = 1000;
        return w(Math.floorDiv(j11, j12), ((int) Math.floorMod(j11, j12)) * 1000000);
    }

    public static Instant B(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof Instant) {
            return (Instant) temporalAccessor;
        }
        Objects.requireNonNull(temporalAccessor, "temporal");
        try {
            return H(temporalAccessor.j(ChronoField.INSTANT_SECONDS), temporalAccessor.get(ChronoField.NANO_OF_SECOND));
        } catch (c e8) {
            throw new c("Unable to obtain Instant from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName(), e8);
        }
    }

    public static Instant w(long j11, int i11) {
        if ((((long) i11) | j11) == 0) {
            return f34912c;
        }
        if (j11 < -31557014167219200L || j11 > 31556889864403199L) {
            throw new c("Instant exceeds minimum or maximum instant");
        }
        return new Instant(j11, i11);
    }

    public ZonedDateTime atZone(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        return ZonedDateTime.w(getEpochSecond(), this.f34914b, zoneId);
    }

    public Instant(long j11, int i11) {
        this.f34913a = j11;
        this.f34914b = i11;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean h(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return temporalField == ChronoField.INSTANT_SECONDS || temporalField == ChronoField.NANO_OF_SECOND || temporalField == ChronoField.MICRO_OF_SECOND || temporalField == ChronoField.MILLI_OF_SECOND;
        }
        return temporalField != null && temporalField.w(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int get(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return super.k(temporalField).a(temporalField, temporalField.Q(this));
        }
        int i11 = e.f35007a[((ChronoField) temporalField).ordinal()];
        if (i11 == 1) {
            return this.f34914b;
        }
        if (i11 == 2) {
            return this.f34914b / 1000;
        }
        if (i11 == 3) {
            return this.f34914b / 1000000;
        }
        if (i11 == 4) {
            ChronoField chronoField = ChronoField.INSTANT_SECONDS;
            chronoField.f35149b.a(chronoField, this.f34913a);
        }
        throw new j$.time.temporal.o(d.a("Unsupported field: ", temporalField));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long j(TemporalField temporalField) {
        int i11;
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.Q(this);
        }
        int i12 = e.f35007a[((ChronoField) temporalField).ordinal()];
        if (i12 == 1) {
            i11 = this.f34914b;
        } else if (i12 == 2) {
            i11 = this.f34914b / 1000;
        } else {
            if (i12 != 3) {
                if (i12 == 4) {
                    return this.f34913a;
                }
                throw new j$.time.temporal.o(d.a("Unsupported field: ", temporalField));
            }
            i11 = this.f34914b / 1000000;
        }
        return i11;
    }

    public long getEpochSecond() {
        return this.f34913a;
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: e */
    public final Temporal i(LocalDate localDate) {
        return (Instant) localDate.f(this);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal a(TemporalField temporalField, long j11) {
        if (!(temporalField instanceof ChronoField)) {
            return (Instant) temporalField.W(this, j11);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        chronoField.Z(j11);
        int i11 = e.f35007a[chronoField.ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                int i12 = ((int) j11) * 1000;
                if (i12 != this.f34914b) {
                    return w(this.f34913a, i12);
                }
            } else if (i11 == 3) {
                int i13 = ((int) j11) * 1000000;
                if (i13 != this.f34914b) {
                    return w(this.f34913a, i13);
                }
            } else {
                if (i11 != 4) {
                    throw new j$.time.temporal.o(d.a("Unsupported field: ", temporalField));
                }
                if (j11 != this.f34913a) {
                    return w(j11, this.f34914b);
                }
            }
        } else if (j11 != this.f34914b) {
            return w(this.f34913a, (int) j11);
        }
        return this;
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: plus, reason: merged with bridge method [inline-methods] */
    public Instant b(long j11, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (Instant) temporalUnit.w(this, j11);
        }
        switch (e.f35008b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return J(0L, j11);
            case 2:
                return J(j11 / 1000000, (j11 % 1000000) * 1000);
            case 3:
                return J(j11 / 1000, (j11 % 1000) * 1000000);
            case 4:
                return plusSeconds(j11);
            case 5:
                return plusSeconds(Math.multiplyExact(j11, 60));
            case 6:
                return plusSeconds(Math.multiplyExact(j11, 3600));
            case 7:
                return plusSeconds(Math.multiplyExact(j11, 43200));
            case 8:
                return plusSeconds(Math.multiplyExact(j11, 86400));
            default:
                throw new j$.time.temporal.o("Unsupported unit: " + temporalUnit);
        }
    }

    public Instant plusSeconds(long j11) {
        return J(j11, 0L);
    }

    public final Instant J(long j11, long j12) {
        if ((j11 | j12) == 0) {
            return this;
        }
        return H(Math.addExact(Math.addExact(this.f34913a, j11), j12 / 1000000000), ((long) this.f34914b) + (j12 % 1000000000));
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal c(long j11, TemporalUnit temporalUnit) {
        return j11 == Long.MIN_VALUE ? b(Long.MAX_VALUE, temporalUnit).b(1L, temporalUnit) : b(-j11, temporalUnit);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object d(f fVar) {
        if (fVar == j$.time.temporal.n.f35178c) {
            return ChronoUnit.NANOS;
        }
        if (fVar == j$.time.temporal.n.f35177b || fVar == j$.time.temporal.n.f35176a || fVar == j$.time.temporal.n.f35180e || fVar == j$.time.temporal.n.f35179d || fVar == j$.time.temporal.n.f35181f || fVar == j$.time.temporal.n.f35182g) {
            return null;
        }
        return fVar.k(this);
    }

    @Override // j$.time.temporal.k
    public final Temporal f(Temporal temporal) {
        return temporal.a(ChronoField.INSTANT_SECONDS, this.f34913a).a(ChronoField.NANO_OF_SECOND, this.f34914b);
    }

    @Override // j$.time.temporal.Temporal
    public final long m(Temporal temporal, TemporalUnit temporalUnit) {
        Instant instantB = B(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.between(this, instantB);
        }
        switch (e.f35008b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return Math.addExact(Math.multiplyExact(Math.subtractExact(instantB.f34913a, this.f34913a), 1000000000L), instantB.f34914b - this.f34914b);
            case 2:
                return Math.addExact(Math.multiplyExact(Math.subtractExact(instantB.f34913a, this.f34913a), 1000000000L), instantB.f34914b - this.f34914b) / 1000;
            case 3:
                return Math.subtractExact(instantB.toEpochMilli(), toEpochMilli());
            case 4:
                return Q(instantB);
            case 5:
                return Q(instantB) / 60;
            case 6:
                return Q(instantB) / 3600;
            case 7:
                return Q(instantB) / 43200;
            case 8:
                return Q(instantB) / 86400;
            default:
                throw new j$.time.temporal.o("Unsupported unit: " + temporalUnit);
        }
    }

    public final long Q(Instant instant) {
        long jSubtractExact = Math.subtractExact(instant.f34913a, this.f34913a);
        long j11 = instant.f34914b - this.f34914b;
        if (jSubtractExact <= 0 || j11 >= 0) {
            return (jSubtractExact >= 0 || j11 <= 0) ? jSubtractExact : jSubtractExact + 1;
        }
        return jSubtractExact - 1;
    }

    public OffsetDateTime atOffset(ZoneOffset zoneOffset) {
        return OffsetDateTime.w(this, zoneOffset);
    }

    public long toEpochMilli() {
        long j11 = this.f34913a;
        return (j11 >= 0 || this.f34914b <= 0) ? Math.addExact(Math.multiplyExact(j11, 1000), this.f34914b / 1000000) : Math.addExact(Math.multiplyExact(j11 + 1, 1000), (this.f34914b / 1000000) - 1000);
    }

    public boolean isBefore(Instant instant) {
        int iCompare = Long.compare(this.f34913a, instant.f34913a);
        if (iCompare == 0) {
            iCompare = this.f34914b - instant.f34914b;
        }
        return iCompare < 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Instant) {
            Instant instant = (Instant) obj;
            if (this.f34913a == instant.f34913a && this.f34914b == instant.f34914b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j11 = this.f34913a;
        return (this.f34914b * 51) + ((int) (j11 ^ (j11 >>> 32)));
    }

    public final String toString() {
        return DateTimeFormatter.f35010f.format(this);
    }

    private Object writeReplace() {
        return new q((byte) 2, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
