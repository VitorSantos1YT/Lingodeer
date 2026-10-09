package j$.time.chrono;

import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.chrono.ChronoLocalDate;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalUnit;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public interface ChronoLocalDateTime<D extends ChronoLocalDate> extends Temporal, j$.time.temporal.k, Comparable<ChronoLocalDateTime<?>> {
    ChronoZonedDateTime G(ZoneId zoneId);

    @Override // j$.time.temporal.Temporal
    ChronoLocalDateTime a(TemporalField temporalField, long j11);

    @Override // j$.time.temporal.Temporal
    ChronoLocalDateTime b(long j11, TemporalUnit temporalUnit);

    ChronoLocalDate l();

    LocalTime toLocalTime();

    default Chronology g() {
        return l().g();
    }

    @Override // j$.time.temporal.Temporal
    default ChronoLocalDateTime i(j$.time.temporal.k kVar) {
        return e.w(g(), kVar.f(this));
    }

    @Override // j$.time.temporal.Temporal
    default ChronoLocalDateTime c(long j11, TemporalUnit temporalUnit) {
        return e.w(g(), super.c(j11, temporalUnit));
    }

    @Override // j$.time.temporal.TemporalAccessor
    default Object d(j$.time.f fVar) {
        if (fVar == j$.time.temporal.n.f35176a || fVar == j$.time.temporal.n.f35180e || fVar == j$.time.temporal.n.f35179d) {
            return null;
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

    @Override // j$.time.temporal.k
    default Temporal f(Temporal temporal) {
        return temporal.a(ChronoField.EPOCH_DAY, l().toEpochDay()).a(ChronoField.NANO_OF_DAY, toLocalTime().f0());
    }

    default long toEpochSecond(ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, "offset");
        return ((l().toEpochDay() * 86400) + ((long) toLocalTime().g0())) - ((long) zoneOffset.f34941b);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    default int compareTo(ChronoLocalDateTime chronoLocalDateTime) {
        int iCompareTo = l().compareTo(chronoLocalDateTime.l());
        return (iCompareTo == 0 && (iCompareTo = toLocalTime().compareTo(chronoLocalDateTime.toLocalTime())) == 0) ? g().compareTo(chronoLocalDateTime.g()) : iCompareTo;
    }
}
