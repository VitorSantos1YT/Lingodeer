package j$.time.chrono;

import j$.time.LocalTime;
import j$.time.ZoneId;
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
public final class e implements ChronoLocalDateTime, Temporal, j$.time.temporal.k, Serializable {
    private static final long serialVersionUID = 4556003607393004514L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient ChronoLocalDate f34958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final transient LocalTime f34959b;

    public static e w(Chronology chronology, Temporal temporal) {
        e eVar = (e) temporal;
        if (chronology.equals(eVar.g())) {
            return eVar;
        }
        throw new ClassCastException("Chronology mismatch, required: " + chronology.q() + ", actual: " + eVar.g().q());
    }

    public e(ChronoLocalDate chronoLocalDate, LocalTime localTime) {
        Objects.requireNonNull(localTime, "time");
        this.f34958a = chronoLocalDate;
        this.f34959b = localTime;
    }

    public final e J(Temporal temporal, LocalTime localTime) {
        ChronoLocalDate chronoLocalDate = this.f34958a;
        return (chronoLocalDate == temporal && this.f34959b == localTime) ? this : new e(c.w(chronoLocalDate.g(), temporal), localTime);
    }

    public final int hashCode() {
        return this.f34958a.hashCode() ^ this.f34959b.hashCode();
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final ChronoLocalDate l() {
        return this.f34958a;
    }

    public final String toString() {
        return this.f34958a.toString() + "T" + this.f34959b.toString();
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final LocalTime toLocalTime() {
        return this.f34959b;
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
            return (((ChronoField) temporalField).a0() ? this.f34959b : this.f34958a).k(temporalField);
        }
        return temporalField.B(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int get(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return ((ChronoField) temporalField).a0() ? this.f34959b.get(temporalField) : this.f34958a.get(temporalField);
        }
        return k(temporalField).a(temporalField, j(temporalField));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long j(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return ((ChronoField) temporalField).a0() ? this.f34959b.j(temporalField) : this.f34958a.j(temporalField);
        }
        return temporalField.Q(this);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public final e i(j$.time.temporal.k kVar) {
        if (kVar instanceof ChronoLocalDate) {
            return J((ChronoLocalDate) kVar, this.f34959b);
        }
        if (kVar instanceof LocalTime) {
            return J(this.f34958a, (LocalTime) kVar);
        }
        if (kVar instanceof e) {
            return w(this.f34958a.g(), (e) kVar);
        }
        return w(this.f34958a.g(), (e) kVar.f(this));
    }

    @Override // j$.time.chrono.ChronoLocalDateTime, j$.time.temporal.Temporal
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public final e a(TemporalField temporalField, long j11) {
        if (temporalField instanceof ChronoField) {
            if (((ChronoField) temporalField).a0()) {
                return J(this.f34958a, this.f34959b.a(temporalField, j11));
            }
            return J(this.f34958a.a(temporalField, j11), this.f34959b);
        }
        return w(this.f34958a.g(), temporalField.W(this, j11));
    }

    @Override // j$.time.chrono.ChronoLocalDateTime, j$.time.temporal.Temporal
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public final e b(long j11, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return w(this.f34958a.g(), temporalUnit.w(this, j11));
        }
        switch (d.f34956a[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return H(this.f34958a, 0L, 0L, 0L, j11);
            case 2:
                e eVarJ = J(this.f34958a.b(j11 / 86400000000L, (TemporalUnit) ChronoUnit.DAYS), this.f34959b);
                return eVarJ.H(eVarJ.f34958a, 0L, 0L, 0L, (j11 % 86400000000L) * 1000);
            case 3:
                e eVarJ2 = J(this.f34958a.b(j11 / 86400000, (TemporalUnit) ChronoUnit.DAYS), this.f34959b);
                return eVarJ2.H(eVarJ2.f34958a, 0L, 0L, 0L, (j11 % 86400000) * 1000000);
            case 4:
                return H(this.f34958a, 0L, 0L, j11, 0L);
            case 5:
                return H(this.f34958a, 0L, j11, 0L, 0L);
            case 6:
                return H(this.f34958a, j11, 0L, 0L, 0L);
            case 7:
                e eVarJ3 = J(this.f34958a.b(j11 / 256, (TemporalUnit) ChronoUnit.DAYS), this.f34959b);
                return eVarJ3.H(eVarJ3.f34958a, (j11 % 256) * 12, 0L, 0L, 0L);
            default:
                return J(this.f34958a.b(j11, temporalUnit), this.f34959b);
        }
    }

    public final e H(ChronoLocalDate chronoLocalDate, long j11, long j12, long j13, long j14) {
        if ((j11 | j12 | j13 | j14) == 0) {
            return J(chronoLocalDate, this.f34959b);
        }
        long j15 = j11 / 24;
        long j16 = ((j11 % 24) * 3600000000000L) + ((j12 % 1440) * 60000000000L) + ((j13 % 86400) * 1000000000) + (j14 % 86400000000000L);
        long jF0 = this.f34959b.f0();
        long j17 = j16 + jF0;
        long jFloorDiv = Math.floorDiv(j17, 86400000000000L) + j15 + (j12 / 1440) + (j13 / 86400) + (j14 / 86400000000000L);
        long jFloorMod = Math.floorMod(j17, 86400000000000L);
        return J(chronoLocalDate.b(jFloorDiv, (TemporalUnit) ChronoUnit.DAYS), jFloorMod == jF0 ? this.f34959b : LocalTime.W(jFloorMod));
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final ChronoZonedDateTime G(ZoneId zoneId) {
        return i.B(zoneId, null, this);
    }

    @Override // j$.time.temporal.Temporal
    public final long m(Temporal temporal, TemporalUnit temporalUnit) {
        Objects.requireNonNull(temporal, "endExclusive");
        ChronoLocalDateTime chronoLocalDateTimeN = g().N(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            Objects.requireNonNull(temporalUnit, "unit");
            return temporalUnit.between(this, chronoLocalDateTimeN);
        }
        ChronoUnit chronoUnit = (ChronoUnit) temporalUnit;
        ChronoUnit chronoUnit2 = ChronoUnit.DAYS;
        if (chronoUnit.compareTo(chronoUnit2) >= 0) {
            ChronoLocalDate chronoLocalDateL = chronoLocalDateTimeN.l();
            if (chronoLocalDateTimeN.toLocalTime().compareTo(this.f34959b) < 0) {
                chronoLocalDateL = chronoLocalDateL.c(1L, (TemporalUnit) chronoUnit2);
            }
            return this.f34958a.m(chronoLocalDateL, temporalUnit);
        }
        ChronoField chronoField = ChronoField.EPOCH_DAY;
        long j11 = chronoLocalDateTimeN.j(chronoField) - this.f34958a.j(chronoField);
        switch (d.f34956a[chronoUnit.ordinal()]) {
            case 1:
                j11 = Math.multiplyExact(j11, 86400000000000L);
                break;
            case 2:
                j11 = Math.multiplyExact(j11, 86400000000L);
                break;
            case 3:
                j11 = Math.multiplyExact(j11, 86400000L);
                break;
            case 4:
                j11 = Math.multiplyExact(j11, 86400);
                break;
            case 5:
                j11 = Math.multiplyExact(j11, 1440);
                break;
            case 6:
                j11 = Math.multiplyExact(j11, 24);
                break;
            case 7:
                j11 = Math.multiplyExact(j11, 2);
                break;
        }
        return Math.addExact(j11, this.f34959b.m(chronoLocalDateTimeN.toLocalTime(), temporalUnit));
    }

    private Object writeReplace() {
        return new b0((byte) 2, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChronoLocalDateTime) && compareTo((ChronoLocalDateTime) obj) == 0;
    }
}
