package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.chrono.ChronoLocalDate;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalUnit;

/* JADX INFO: loaded from: classes2.dex */
public interface ChronoZonedDateTime<D extends ChronoLocalDate> extends Temporal, Comparable<ChronoZonedDateTime<?>> {
    ChronoZonedDateTime F(ZoneId zoneId);

    ZoneId K();

    @Override // j$.time.temporal.Temporal
    ChronoZonedDateTime a(TemporalField temporalField, long j11);

    @Override // j$.time.temporal.Temporal
    ChronoZonedDateTime b(long j11, TemporalUnit temporalUnit);

    ZoneOffset n();

    ChronoZonedDateTime o(ZoneId zoneId);

    ChronoLocalDateTime x();

    @Override // j$.time.temporal.TemporalAccessor
    default j$.time.temporal.p k(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            if (temporalField != ChronoField.INSTANT_SECONDS && temporalField != ChronoField.OFFSET_SECONDS) {
                return x().k(temporalField);
            }
            return ((ChronoField) temporalField).f35149b;
        }
        return temporalField.B(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    default int get(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            int i11 = g.f34967a[((ChronoField) temporalField).ordinal()];
            if (i11 == 1) {
                throw new j$.time.temporal.o("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
            }
            if (i11 != 2) {
                return x().get(temporalField);
            }
            return n().f34941b;
        }
        return super.get(temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    default long j(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            int i11 = g.f34967a[((ChronoField) temporalField).ordinal()];
            if (i11 == 1) {
                return Y();
            }
            if (i11 != 2) {
                return x().j(temporalField);
            }
            return n().f34941b;
        }
        return temporalField.Q(this);
    }

    default ChronoLocalDate l() {
        return x().l();
    }

    default LocalTime toLocalTime() {
        return x().toLocalTime();
    }

    default Chronology g() {
        return l().g();
    }

    @Override // j$.time.temporal.Temporal
    default ChronoZonedDateTime i(j$.time.temporal.k kVar) {
        return i.w(g(), kVar.f(this));
    }

    @Override // j$.time.temporal.Temporal
    default ChronoZonedDateTime c(long j11, TemporalUnit temporalUnit) {
        return i.w(g(), super.c(j11, temporalUnit));
    }

    @Override // j$.time.temporal.TemporalAccessor
    default Object d(j$.time.f fVar) {
        if (fVar == j$.time.temporal.n.f35180e || fVar == j$.time.temporal.n.f35176a) {
            return K();
        }
        if (fVar == j$.time.temporal.n.f35179d) {
            return n();
        }
        if (fVar == j$.time.temporal.n.f35182g) {
            return toLocalTime();
        }
        if (fVar == j$.time.temporal.n.f35177b) {
            return g();
        }
        if (fVar == j$.time.temporal.n.f35178c) {
            return ChronoUnit.NANOS;
        }
        return fVar.k(this);
    }

    default Instant toInstant() {
        return Instant.H(Y(), toLocalTime().f34930d);
    }

    default long Y() {
        return ((l().toEpochDay() * 86400) + ((long) toLocalTime().g0())) - ((long) n().f34941b);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    default int compareTo(ChronoZonedDateTime chronoZonedDateTime) {
        int iCompare = Long.compare(Y(), chronoZonedDateTime.Y());
        return (iCompare == 0 && (iCompare = toLocalTime().f34930d - chronoZonedDateTime.toLocalTime().f34930d) == 0 && (iCompare = x().compareTo(chronoZonedDateTime.x())) == 0 && (iCompare = K().q().compareTo(chronoZonedDateTime.K().q())) == 0) ? g().compareTo(chronoZonedDateTime.g()) : iCompare;
    }
}
