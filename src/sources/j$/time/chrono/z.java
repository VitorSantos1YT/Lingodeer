package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.temporal.ChronoField;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalUnit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class z extends c {
    private static final long serialVersionUID = 1300372329181994526L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient LocalDate f35006a;

    @Override // j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDateTime L(LocalTime localTime) {
        return new e(this, localTime);
    }

    public z(LocalDate localDate) {
        Objects.requireNonNull(localDate, "isoDate");
        this.f35006a = localDate;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final Chronology g() {
        return x.f35004d;
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    public final int hashCode() {
        x.f35004d.getClass();
        return this.f35006a.hashCode() ^ (-1990173233);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final j O() {
        return W() >= 1 ? a0.ROC : a0.BEFORE_ROC;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.p k(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.B(this);
        }
        if (!h(temporalField)) {
            throw new j$.time.temporal.o(j$.time.d.a("Unsupported field: ", temporalField));
        }
        ChronoField chronoField = (ChronoField) temporalField;
        int i11 = y.f35005a[chronoField.ordinal()];
        if (i11 == 1 || i11 == 2 || i11 == 3) {
            return this.f35006a.k(temporalField);
        }
        if (i11 != 4) {
            return x.f35004d.z(chronoField);
        }
        j$.time.temporal.p pVar = ChronoField.YEAR.f35149b;
        return j$.time.temporal.p.f(1L, W() <= 0 ? (-pVar.f35183a) + 1912 : pVar.f35186d - 1911);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long j(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            int i11 = y.f35005a[((ChronoField) temporalField).ordinal()];
            if (i11 == 4) {
                int iW = W();
                if (iW < 1) {
                    iW = 1 - iW;
                }
                return iW;
            }
            if (i11 == 5) {
                return ((((long) W()) * 12) + ((long) this.f35006a.getMonthValue())) - 1;
            }
            if (i11 == 6) {
                return W();
            }
            if (i11 != 7) {
                return this.f35006a.j(temporalField);
            }
            return W() < 1 ? 0 : 1;
        }
        return temporalField.Q(this);
    }

    public final int W() {
        return this.f35006a.getYear() - 1911;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004d  */
    /* JADX WARN: Code duplicated, block: B:18:0x005f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0061 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x006e  */
    /* JADX WARN: Code duplicated, block: B:24:0x007f  */
    /* JADX WARN: Code duplicated, block: B:26:0x008c  */
    /* JADX WARN: Code duplicated, block: B:28:0x0095  */
    /* JADX WARN: Code duplicated, block: B:29:0x0098  */
    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
    public final z a(TemporalField temporalField, long j11) {
        int iA;
        int i11;
        int i12;
        if (temporalField instanceof ChronoField) {
            ChronoField chronoField = (ChronoField) temporalField;
            if (j(chronoField) == j11) {
                return this;
            }
            int[] iArr = y.f35005a;
            int i13 = iArr[chronoField.ordinal()];
            if (i13 == 4) {
                iA = x.f35004d.z(chronoField).a(chronoField, j11);
                i11 = iArr[chronoField.ordinal()];
                if (i11 != 4) {
                    LocalDate localDate = this.f35006a;
                    if (W() >= 1) {
                        i12 = iA + 1911;
                    } else {
                        i12 = 1912 - iA;
                    }
                    return Z(localDate.j0(i12));
                }
                if (i11 != 6) {
                    return Z(this.f35006a.j0(iA + 1911));
                }
                if (i11 == 7) {
                    return Z(this.f35006a.j0(1912 - W()));
                }
            } else {
                if (i13 == 5) {
                    x.f35004d.z(chronoField).b(chronoField, j11);
                    return Z(this.f35006a.plusMonths(j11 - (((((long) W()) * 12) + ((long) this.f35006a.getMonthValue())) - 1)));
                }
                if (i13 == 6 || i13 == 7) {
                    iA = x.f35004d.z(chronoField).a(chronoField, j11);
                    i11 = iArr[chronoField.ordinal()];
                    if (i11 != 4) {
                        LocalDate localDate2 = this.f35006a;
                        if (W() >= 1) {
                            i12 = iA + 1911;
                        } else {
                            i12 = 1912 - iA;
                        }
                        return Z(localDate2.j0(i12));
                    }
                    if (i11 != 6) {
                        return Z(this.f35006a.j0(iA + 1911));
                    }
                    if (i11 == 7) {
                        return Z(this.f35006a.j0(1912 - W()));
                    }
                }
            }
            return Z(this.f35006a.a(temporalField, j11));
        }
        return (z) super.a(temporalField, j11);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    /* JADX INFO: renamed from: e */
    public final Temporal i(LocalDate localDate) {
        return (z) super.i(localDate);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDate i(j$.time.temporal.k kVar) {
        return (z) super.i(kVar);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDate S(j$.time.temporal.m mVar) {
        return (z) super.S(mVar);
    }

    @Override // j$.time.chrono.c
    public final ChronoLocalDate Q(long j11) {
        return Z(this.f35006a.g0(j11));
    }

    @Override // j$.time.chrono.c
    public final ChronoLocalDate J(long j11) {
        return Z(this.f35006a.plusMonths(j11));
    }

    @Override // j$.time.chrono.c
    public final ChronoLocalDate H(long j11) {
        return Z(this.f35006a.plusDays(j11));
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    public final ChronoLocalDate b(long j11, TemporalUnit temporalUnit) {
        return (z) super.b(j11, temporalUnit);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    public final Temporal b(long j11, TemporalUnit temporalUnit) {
        return (z) super.b(j11, temporalUnit);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    public final ChronoLocalDate c(long j11, TemporalUnit temporalUnit) {
        return (z) super.c(j11, temporalUnit);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    public final Temporal c(long j11, TemporalUnit temporalUnit) {
        return (z) super.c(j11, temporalUnit);
    }

    public final z Z(LocalDate localDate) {
        return localDate.equals(this.f35006a) ? this : new z(localDate);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final long toEpochDay() {
        return this.f35006a.toEpochDay();
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof z) {
            return this.f35006a.equals(((z) obj).f35006a);
        }
        return false;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new b0((byte) 7, this);
    }
}
