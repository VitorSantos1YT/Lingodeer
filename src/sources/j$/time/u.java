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
public final class u implements Temporal, j$.time.temporal.k, Comparable, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f35196c = 0;
    private static final long serialVersionUID = 4183400860270640070L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f35197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f35198b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        u uVar = (u) obj;
        int i11 = this.f35197a - uVar.f35197a;
        return i11 == 0 ? this.f35198b - uVar.f35198b : i11;
    }

    static {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.n(ChronoField.YEAR, 4, 10, d0.EXCEEDS_PAD);
        dateTimeFormatterBuilder.d('-');
        dateTimeFormatterBuilder.m(ChronoField.MONTH_OF_YEAR, 2);
        dateTimeFormatterBuilder.r(Locale.getDefault(), c0.SMART, null);
    }

    @Override // j$.time.temporal.Temporal
    public final long m(Temporal temporal, TemporalUnit temporalUnit) {
        u uVar;
        if (temporal instanceof u) {
            uVar = (u) temporal;
        } else {
            Objects.requireNonNull(temporal, "temporal");
            try {
                if (!j$.time.chrono.p.f34989d.equals(Chronology.r(temporal))) {
                    temporal = LocalDate.H(temporal);
                }
                ChronoField chronoField = ChronoField.YEAR;
                int i11 = temporal.get(chronoField);
                ChronoField chronoField2 = ChronoField.MONTH_OF_YEAR;
                int i12 = temporal.get(chronoField2);
                chronoField.Z(i11);
                chronoField2.Z(i12);
                uVar = new u(i11, i12);
            } catch (c e8) {
                throw new c("Unable to obtain YearMonth from TemporalAccessor: " + temporal + " of type " + temporal.getClass().getName(), e8);
            }
        }
        if (temporalUnit instanceof ChronoUnit) {
            long jW = uVar.w() - w();
            switch (t.f35146b[((ChronoUnit) temporalUnit).ordinal()]) {
                case 1:
                    return jW;
                case 2:
                    return jW / 12;
                case 3:
                    return jW / 120;
                case 4:
                    return jW / 1200;
                case 5:
                    return jW / 12000;
                case 6:
                    ChronoField chronoField3 = ChronoField.ERA;
                    return uVar.j(chronoField3) - j(chronoField3);
                default:
                    throw new j$.time.temporal.o("Unsupported unit: " + temporalUnit);
            }
        }
        return temporalUnit.between(this, uVar);
    }

    public u(int i11, int i12) {
        this.f35197a = i11;
        this.f35198b = i12;
    }

    public final u Q(int i11, int i12) {
        return (this.f35197a == i11 && this.f35198b == i12) ? this : new u(i11, i12);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean h(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return temporalField == ChronoField.YEAR || temporalField == ChronoField.MONTH_OF_YEAR || temporalField == ChronoField.PROLEPTIC_MONTH || temporalField == ChronoField.YEAR_OF_ERA || temporalField == ChronoField.ERA;
        }
        return temporalField != null && temporalField.w(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.p k(TemporalField temporalField) {
        if (temporalField == ChronoField.YEAR_OF_ERA) {
            return j$.time.temporal.p.f(1L, this.f35197a <= 0 ? 1000000000L : 999999999L);
        }
        return super.k(temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int get(TemporalField temporalField) {
        return k(temporalField).a(temporalField, j(temporalField));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long j(TemporalField temporalField) {
        int i11;
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.Q(this);
        }
        int i12 = t.f35145a[((ChronoField) temporalField).ordinal()];
        if (i12 == 1) {
            i11 = this.f35198b;
        } else {
            if (i12 == 2) {
                return w();
            }
            if (i12 == 3) {
                int i13 = this.f35197a;
                if (i13 < 1) {
                    i13 = 1 - i13;
                }
                return i13;
            }
            if (i12 != 4) {
                if (i12 == 5) {
                    return this.f35197a < 1 ? 0 : 1;
                }
                throw new j$.time.temporal.o(d.a("Unsupported field: ", temporalField));
            }
            i11 = this.f35197a;
        }
        return i11;
    }

    public final long w() {
        return ((((long) this.f35197a) * 12) + ((long) this.f35198b)) - 1;
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: e */
    public final Temporal i(LocalDate localDate) {
        return (u) localDate.f(this);
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public final u a(TemporalField temporalField, long j11) {
        if (!(temporalField instanceof ChronoField)) {
            return (u) temporalField.W(this, j11);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        chronoField.Z(j11);
        int i11 = t.f35145a[chronoField.ordinal()];
        if (i11 == 1) {
            int i12 = (int) j11;
            ChronoField.MONTH_OF_YEAR.Z(i12);
            return Q(this.f35197a, i12);
        }
        if (i11 == 2) {
            return H(j11 - w());
        }
        if (i11 == 3) {
            if (this.f35197a < 1) {
                j11 = 1 - j11;
            }
            int i13 = (int) j11;
            ChronoField.YEAR.Z(i13);
            return Q(i13, this.f35198b);
        }
        if (i11 == 4) {
            int i14 = (int) j11;
            ChronoField.YEAR.Z(i14);
            return Q(i14, this.f35198b);
        }
        if (i11 != 5) {
            throw new j$.time.temporal.o(d.a("Unsupported field: ", temporalField));
        }
        if (j(ChronoField.ERA) == j11) {
            return this;
        }
        int i15 = 1 - this.f35197a;
        ChronoField.YEAR.Z(i15);
        return Q(i15, this.f35198b);
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public final u b(long j11, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (u) temporalUnit.w(this, j11);
        }
        switch (t.f35146b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return H(j11);
            case 2:
                return J(j11);
            case 3:
                return J(Math.multiplyExact(j11, 10));
            case 4:
                return J(Math.multiplyExact(j11, 100));
            case 5:
                return J(Math.multiplyExact(j11, 1000));
            case 6:
                ChronoField chronoField = ChronoField.ERA;
                return a(chronoField, Math.addExact(j(chronoField), j11));
            default:
                throw new j$.time.temporal.o("Unsupported unit: " + temporalUnit);
        }
    }

    public final u J(long j11) {
        if (j11 == 0) {
            return this;
        }
        ChronoField chronoField = ChronoField.YEAR;
        return Q(chronoField.f35149b.a(chronoField, ((long) this.f35197a) + j11), this.f35198b);
    }

    public final u H(long j11) {
        if (j11 == 0) {
            return this;
        }
        long j12 = (((long) this.f35197a) * 12) + ((long) (this.f35198b - 1)) + j11;
        ChronoField chronoField = ChronoField.YEAR;
        long j13 = 12;
        return Q(chronoField.f35149b.a(chronoField, Math.floorDiv(j12, j13)), ((int) Math.floorMod(j12, j13)) + 1);
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
            return ChronoUnit.MONTHS;
        }
        return super.d(fVar);
    }

    @Override // j$.time.temporal.k
    public final Temporal f(Temporal temporal) {
        if (!Chronology.r(temporal).equals(j$.time.chrono.p.f34989d)) {
            throw new c("Adjustment only supported on ISO date-time");
        }
        return temporal.a(ChronoField.PROLEPTIC_MONTH, w());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u) {
            u uVar = (u) obj;
            if (this.f35197a == uVar.f35197a && this.f35198b == uVar.f35198b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f35197a ^ (this.f35198b << 27);
    }

    public final String toString() {
        int iAbs = Math.abs(this.f35197a);
        StringBuilder sb2 = new StringBuilder(9);
        if (iAbs < 1000) {
            int i11 = this.f35197a;
            if (i11 < 0) {
                sb2.append(i11 - 10000);
                sb2.deleteCharAt(1);
            } else {
                sb2.append(i11 + 10000);
                sb2.deleteCharAt(0);
            }
        } else {
            sb2.append(this.f35197a);
        }
        sb2.append(this.f35198b < 10 ? "-0" : "-");
        sb2.append(this.f35198b);
        return sb2.toString();
    }

    private Object writeReplace() {
        return new q((byte) 12, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
