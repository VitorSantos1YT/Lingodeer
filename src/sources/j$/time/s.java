package j$.time;

import j$.time.chrono.Chronology;
import j$.time.format.DateTimeFormatterBuilder;
import j$.time.format.c0;
import j$.time.format.d0;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalUnit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class s implements Temporal, j$.time.temporal.k, Comparable, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f35143b = 0;
    private static final long serialVersionUID = -23038383694477807L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f35144a;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f35144a - ((s) obj).f35144a;
    }

    static {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.n(ChronoField.YEAR, 4, 10, d0.EXCEEDS_PAD);
        dateTimeFormatterBuilder.r(Locale.getDefault(), c0.SMART, null);
    }

    public static s w(int i11) {
        ChronoField.YEAR.Z(i11);
        return new s(i11);
    }

    @Override // j$.time.temporal.Temporal
    public final long m(Temporal temporal, TemporalUnit temporalUnit) {
        s sVarW;
        if (temporal instanceof s) {
            sVarW = (s) temporal;
        } else {
            Objects.requireNonNull(temporal, "temporal");
            try {
                if (!j$.time.chrono.p.f34989d.equals(Chronology.r(temporal))) {
                    temporal = LocalDate.H(temporal);
                }
                sVarW = w(temporal.get(ChronoField.YEAR));
            } catch (c e8) {
                throw new c("Unable to obtain Year from TemporalAccessor: " + temporal + " of type " + temporal.getClass().getName(), e8);
            }
        }
        if (temporalUnit instanceof ChronoUnit) {
            long j11 = ((long) sVarW.f35144a) - ((long) this.f35144a);
            int i11 = r.f35142b[((ChronoUnit) temporalUnit).ordinal()];
            if (i11 == 1) {
                return j11;
            }
            if (i11 == 2) {
                return j11 / 10;
            }
            if (i11 == 3) {
                return j11 / 100;
            }
            if (i11 == 4) {
                return j11 / 1000;
            }
            if (i11 == 5) {
                ChronoField chronoField = ChronoField.ERA;
                return sVarW.j(chronoField) - j(chronoField);
            }
            throw new j$.time.temporal.o("Unsupported unit: " + temporalUnit);
        }
        return temporalUnit.between(this, sVarW);
    }

    public s(int i11) {
        this.f35144a = i11;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean h(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return temporalField == ChronoField.YEAR || temporalField == ChronoField.YEAR_OF_ERA || temporalField == ChronoField.ERA;
        }
        return temporalField != null && temporalField.w(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.p k(TemporalField temporalField) {
        if (temporalField == ChronoField.YEAR_OF_ERA) {
            return j$.time.temporal.p.f(1L, this.f35144a <= 0 ? 1000000000L : 999999999L);
        }
        return super.k(temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int get(TemporalField temporalField) {
        return k(temporalField).a(temporalField, j(temporalField));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long j(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.Q(this);
        }
        int i11 = r.f35141a[((ChronoField) temporalField).ordinal()];
        if (i11 == 1) {
            int i12 = this.f35144a;
            if (i12 < 1) {
                i12 = 1 - i12;
            }
            return i12;
        }
        if (i11 == 2) {
            return this.f35144a;
        }
        if (i11 == 3) {
            return this.f35144a < 1 ? 0 : 1;
        }
        throw new j$.time.temporal.o(d.a("Unsupported field: ", temporalField));
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: e */
    public final Temporal i(LocalDate localDate) {
        return (s) localDate.f(this);
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public final s a(TemporalField temporalField, long j11) {
        if (!(temporalField instanceof ChronoField)) {
            return (s) temporalField.W(this, j11);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        chronoField.Z(j11);
        int i11 = r.f35141a[chronoField.ordinal()];
        if (i11 == 1) {
            if (this.f35144a < 1) {
                j11 = 1 - j11;
            }
            return w((int) j11);
        }
        if (i11 == 2) {
            return w((int) j11);
        }
        if (i11 == 3) {
            return j(ChronoField.ERA) == j11 ? this : w(1 - this.f35144a);
        }
        throw new j$.time.temporal.o(d.a("Unsupported field: ", temporalField));
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public final s b(long j11, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (s) temporalUnit.w(this, j11);
        }
        int i11 = r.f35142b[((ChronoUnit) temporalUnit).ordinal()];
        if (i11 == 1) {
            return H(j11);
        }
        if (i11 == 2) {
            return H(Math.multiplyExact(j11, 10));
        }
        if (i11 == 3) {
            return H(Math.multiplyExact(j11, 100));
        }
        if (i11 == 4) {
            return H(Math.multiplyExact(j11, 1000));
        }
        if (i11 == 5) {
            ChronoField chronoField = ChronoField.ERA;
            return a(chronoField, Math.addExact(j(chronoField), j11));
        }
        throw new j$.time.temporal.o("Unsupported unit: " + temporalUnit);
    }

    public final s H(long j11) {
        if (j11 == 0) {
            return this;
        }
        ChronoField chronoField = ChronoField.YEAR;
        return w(chronoField.f35149b.a(chronoField, ((long) this.f35144a) + j11));
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal c(long j11, TemporalUnit temporalUnit) {
        return j11 == Long.MIN_VALUE ? b(Long.MAX_VALUE, temporalUnit).b(1L, temporalUnit) : b(-j11, temporalUnit);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object d(f fVar) {
        if (fVar == j$.time.temporal.n.f35177b) {
            return j$.time.chrono.p.f34989d;
        }
        if (fVar == j$.time.temporal.n.f35178c) {
            return ChronoUnit.YEARS;
        }
        return super.d(fVar);
    }

    @Override // j$.time.temporal.k
    public final Temporal f(Temporal temporal) {
        if (!Chronology.r(temporal).equals(j$.time.chrono.p.f34989d)) {
            throw new c("Adjustment only supported on ISO date-time");
        }
        return temporal.a(ChronoField.YEAR, this.f35144a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s) && this.f35144a == ((s) obj).f35144a;
    }

    public final int hashCode() {
        return this.f35144a;
    }

    public final String toString() {
        return Integer.toString(this.f35144a);
    }

    private Object writeReplace() {
        return new q((byte) 11, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
