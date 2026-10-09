package j$.time.chrono;

import com.lingodeer.data.model.AchievementLevelType;
import j$.time.LocalTime;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalUnit;

/* JADX INFO: loaded from: classes2.dex */
public interface ChronoLocalDate extends Temporal, j$.time.temporal.k, Comparable<ChronoLocalDate> {
    boolean equals(Object obj);

    Chronology g();

    int hashCode();

    @Override // j$.time.temporal.Temporal
    long m(Temporal temporal, TemporalUnit temporalUnit);

    String toString();

    default ChronoLocalDateTime L(LocalTime localTime) {
        return new e(this, localTime);
    }

    default j O() {
        return g().C(get(ChronoField.ERA));
    }

    default boolean y() {
        return g().X(j(ChronoField.YEAR));
    }

    default int V() {
        if (y()) {
            return 366;
        }
        return AchievementLevelType.DAY_STREAK_LV_10;
    }

    @Override // j$.time.temporal.TemporalAccessor
    default boolean h(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return ((ChronoField) temporalField).isDateBased();
        }
        return temporalField != null && temporalField.w(this);
    }

    @Override // j$.time.temporal.Temporal
    default ChronoLocalDate i(j$.time.temporal.k kVar) {
        return c.w(g(), kVar.f(this));
    }

    @Override // j$.time.temporal.Temporal
    default ChronoLocalDate a(TemporalField temporalField, long j11) {
        if (temporalField instanceof ChronoField) {
            throw new j$.time.temporal.o(j$.time.d.a("Unsupported field: ", temporalField));
        }
        return c.w(g(), temporalField.W(this, j11));
    }

    default ChronoLocalDate S(j$.time.temporal.m mVar) {
        return c.w(g(), mVar.w(this));
    }

    @Override // j$.time.temporal.Temporal
    default ChronoLocalDate b(long j11, TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            throw new j$.time.temporal.o("Unsupported unit: " + temporalUnit);
        }
        return c.w(g(), temporalUnit.w(this, j11));
    }

    @Override // j$.time.temporal.Temporal
    default ChronoLocalDate c(long j11, TemporalUnit temporalUnit) {
        return c.w(g(), super.c(j11, temporalUnit));
    }

    @Override // j$.time.temporal.TemporalAccessor
    default Object d(j$.time.f fVar) {
        if (fVar == j$.time.temporal.n.f35176a || fVar == j$.time.temporal.n.f35180e || fVar == j$.time.temporal.n.f35179d || fVar == j$.time.temporal.n.f35182g) {
            return null;
        }
        if (fVar == j$.time.temporal.n.f35177b) {
            return g();
        }
        if (fVar == j$.time.temporal.n.f35178c) {
            return ChronoUnit.DAYS;
        }
        return fVar.k(this);
    }

    @Override // j$.time.temporal.k
    default Temporal f(Temporal temporal) {
        return temporal.a(ChronoField.EPOCH_DAY, toEpochDay());
    }

    default long toEpochDay() {
        return j(ChronoField.EPOCH_DAY);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.lang.Comparable
    default int compareTo(ChronoLocalDate chronoLocalDate) {
        int iCompare = Long.compare(toEpochDay(), chronoLocalDate.toEpochDay());
        if (iCompare != 0) {
            return iCompare;
        }
        return ((a) g()).compareTo(chronoLocalDate.g());
    }
}
