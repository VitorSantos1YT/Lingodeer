package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalUnit;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c implements ChronoLocalDate, Temporal, j$.time.temporal.k, Serializable {
    private static final long serialVersionUID = 6282433883239719096L;

    public abstract ChronoLocalDate H(long j11);

    public abstract ChronoLocalDate J(long j11);

    public abstract ChronoLocalDate Q(long j11);

    @Override // j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    public /* bridge */ /* synthetic */ Temporal a(TemporalField temporalField, long j11) {
        return a(temporalField, j11);
    }

    @Override // j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    public /* bridge */ /* synthetic */ Temporal c(long j11, TemporalUnit temporalUnit) {
        return c(j11, temporalUnit);
    }

    @Override // j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    /* JADX INFO: renamed from: e */
    public /* bridge */ /* synthetic */ Temporal i(LocalDate localDate) {
        return i(localDate);
    }

    public static ChronoLocalDate w(Chronology chronology, Temporal temporal) {
        ChronoLocalDate chronoLocalDate = (ChronoLocalDate) temporal;
        if (chronology.equals(chronoLocalDate.g())) {
            return chronoLocalDate;
        }
        throw new ClassCastException("Chronology mismatch, expected: " + chronology.q() + ", actual: " + chronoLocalDate.g().q());
    }

    @Override // j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    public ChronoLocalDate b(long j11, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return super.b(j11, temporalUnit);
        }
        switch (b.f34952a[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return H(j11);
            case 2:
                return H(Math.multiplyExact(j11, 7));
            case 3:
                return J(j11);
            case 4:
                return Q(j11);
            case 5:
                return Q(Math.multiplyExact(j11, 10));
            case 6:
                return Q(Math.multiplyExact(j11, 100));
            case 7:
                return Q(Math.multiplyExact(j11, 1000));
            case 8:
                ChronoField chronoField = ChronoField.ERA;
                return a((TemporalField) chronoField, Math.addExact(j(chronoField), j11));
            default:
                throw new j$.time.temporal.o("Unsupported unit: " + temporalUnit);
        }
    }

    @Override // j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    public final long m(Temporal temporal, TemporalUnit temporalUnit) {
        Objects.requireNonNull(temporal, "endExclusive");
        ChronoLocalDate chronoLocalDateI = g().I(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            Objects.requireNonNull(temporalUnit, "unit");
            return temporalUnit.between(this, chronoLocalDateI);
        }
        switch (b.f34952a[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return chronoLocalDateI.toEpochDay() - toEpochDay();
            case 2:
                return (chronoLocalDateI.toEpochDay() - toEpochDay()) / 7;
            case 3:
                return B(chronoLocalDateI);
            case 4:
                return B(chronoLocalDateI) / 12;
            case 5:
                return B(chronoLocalDateI) / 120;
            case 6:
                return B(chronoLocalDateI) / 1200;
            case 7:
                return B(chronoLocalDateI) / 12000;
            case 8:
                ChronoField chronoField = ChronoField.ERA;
                return chronoLocalDateI.j(chronoField) - j(chronoField);
            default:
                throw new j$.time.temporal.o("Unsupported unit: " + temporalUnit);
        }
    }

    public final long B(ChronoLocalDate chronoLocalDate) {
        if (g().z(ChronoField.MONTH_OF_YEAR).f35186d != 12) {
            throw new IllegalStateException("ChronoLocalDateImpl only supports Chronologies with 12 months per year");
        }
        ChronoField chronoField = ChronoField.PROLEPTIC_MONTH;
        long j11 = j(chronoField) * 32;
        ChronoField chronoField2 = ChronoField.DAY_OF_MONTH;
        return (((chronoLocalDate.j(chronoField) * 32) + ((long) chronoLocalDate.get(chronoField2))) - (j11 + ((long) get(chronoField2)))) / 32;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChronoLocalDate) && compareTo((ChronoLocalDate) obj) == 0;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public int hashCode() {
        long epochDay = toEpochDay();
        return ((int) (epochDay ^ (epochDay >>> 32))) ^ g().hashCode();
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final String toString() {
        long j11 = j(ChronoField.YEAR_OF_ERA);
        long j12 = j(ChronoField.MONTH_OF_YEAR);
        long j13 = j(ChronoField.DAY_OF_MONTH);
        StringBuilder sb2 = new StringBuilder(30);
        sb2.append(g().toString());
        sb2.append(" ");
        sb2.append(O());
        sb2.append(" ");
        sb2.append(j11);
        sb2.append(j12 < 10 ? "-0" : "-");
        sb2.append(j12);
        sb2.append(j13 < 10 ? "-0" : "-");
        sb2.append(j13);
        return sb2.toString();
    }
}
