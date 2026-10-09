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
public final class o implements Temporal, j$.time.temporal.k, Comparable, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f35132c = 0;
    private static final long serialVersionUID = 7264499704384272492L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalTime f35133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ZoneOffset f35134b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        o oVar = (o) obj;
        if (this.f35134b.equals(oVar.f35134b)) {
            return this.f35133a.compareTo(oVar.f35133a);
        }
        int iCompare = Long.compare(B(), oVar.B());
        return iCompare == 0 ? this.f35133a.compareTo(oVar.f35133a) : iCompare;
    }

    static {
        LocalTime localTime = LocalTime.f34924e;
        ZoneOffset zoneOffset = ZoneOffset.f34940g;
        localTime.getClass();
        new o(localTime, zoneOffset);
        LocalTime localTime2 = LocalTime.f34925f;
        ZoneOffset zoneOffset2 = ZoneOffset.f34939f;
        localTime2.getClass();
        new o(localTime2, zoneOffset2);
    }

    @Override // j$.time.temporal.Temporal
    public final long m(Temporal temporal, TemporalUnit temporalUnit) {
        o oVar;
        if (temporal instanceof o) {
            oVar = (o) temporal;
        } else {
            try {
                oVar = new o(LocalTime.H(temporal), ZoneOffset.Z(temporal));
            } catch (c e8) {
                throw new c("Unable to obtain OffsetTime from TemporalAccessor: " + temporal + " of type " + temporal.getClass().getName(), e8);
            }
        }
        if (temporalUnit instanceof ChronoUnit) {
            long jB = oVar.B() - B();
            switch (n.f35131a[((ChronoUnit) temporalUnit).ordinal()]) {
                case 1:
                    return jB;
                case 2:
                    return jB / 1000;
                case 3:
                    return jB / 1000000;
                case 4:
                    return jB / 1000000000;
                case 5:
                    return jB / 60000000000L;
                case 6:
                    return jB / 3600000000000L;
                case 7:
                    return jB / 43200000000000L;
                default:
                    throw new j$.time.temporal.o("Unsupported unit: " + temporalUnit);
            }
        }
        return temporalUnit.between(this, oVar);
    }

    public o(LocalTime localTime, ZoneOffset zoneOffset) {
        Objects.requireNonNull(localTime, "time");
        this.f35133a = localTime;
        Objects.requireNonNull(zoneOffset, "offset");
        this.f35134b = zoneOffset;
    }

    public final o H(LocalTime localTime, ZoneOffset zoneOffset) {
        return (this.f35133a == localTime && this.f35134b.equals(zoneOffset)) ? this : new o(localTime, zoneOffset);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean h(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return ((ChronoField) temporalField).a0() || temporalField == ChronoField.OFFSET_SECONDS;
        }
        return temporalField != null && temporalField.w(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.p k(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            if (temporalField != ChronoField.OFFSET_SECONDS) {
                return this.f35133a.k(temporalField);
            }
            return ((ChronoField) temporalField).f35149b;
        }
        return temporalField.B(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long j(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            if (temporalField == ChronoField.OFFSET_SECONDS) {
                return this.f35134b.f34941b;
            }
            return this.f35133a.j(temporalField);
        }
        return temporalField.Q(this);
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: e */
    public final Temporal i(LocalDate localDate) {
        return (o) localDate.f(this);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal a(TemporalField temporalField, long j11) {
        if (temporalField instanceof ChronoField) {
            if (temporalField == ChronoField.OFFSET_SECONDS) {
                ChronoField chronoField = (ChronoField) temporalField;
                return H(this.f35133a, ZoneOffset.c0(chronoField.f35149b.a(chronoField, j11)));
            }
            return H(this.f35133a.a(temporalField, j11), this.f35134b);
        }
        return (o) temporalField.W(this, j11);
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public final o b(long j11, TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            return H(this.f35133a.b(j11, temporalUnit), this.f35134b);
        }
        return (o) temporalUnit.w(this, j11);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal c(long j11, TemporalUnit temporalUnit) {
        return j11 == Long.MIN_VALUE ? b(Long.MAX_VALUE, temporalUnit).b(1L, temporalUnit) : b(-j11, temporalUnit);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object d(f fVar) {
        if (fVar == j$.time.temporal.n.f35179d || fVar == j$.time.temporal.n.f35180e) {
            return this.f35134b;
        }
        if (((fVar == j$.time.temporal.n.f35176a) || (fVar == j$.time.temporal.n.f35177b)) || fVar == j$.time.temporal.n.f35181f) {
            return null;
        }
        if (fVar == j$.time.temporal.n.f35182g) {
            return this.f35133a;
        }
        if (fVar == j$.time.temporal.n.f35178c) {
            return ChronoUnit.NANOS;
        }
        return fVar.k(this);
    }

    @Override // j$.time.temporal.k
    public final Temporal f(Temporal temporal) {
        return temporal.a(ChronoField.NANO_OF_DAY, this.f35133a.f0()).a(ChronoField.OFFSET_SECONDS, this.f35134b.f34941b);
    }

    public final long B() {
        return this.f35133a.f0() - (((long) this.f35134b.f34941b) * 1000000000);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            if (this.f35133a.equals(oVar.f35133a) && this.f35134b.equals(oVar.f35134b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f35133a.hashCode() ^ this.f35134b.f34941b;
    }

    public final String toString() {
        return this.f35133a.toString() + this.f35134b.f34942c;
    }

    private Object writeReplace() {
        return new q((byte) 9, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
