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
public final class f0 extends c {
    private static final long serialVersionUID = -8722293800195731463L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient LocalDate f34966a;

    @Override // j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDateTime L(LocalTime localTime) {
        return new e(this, localTime);
    }

    public f0(LocalDate localDate) {
        Objects.requireNonNull(localDate, "isoDate");
        this.f34966a = localDate;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final Chronology g() {
        return d0.f34957d;
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    public final int hashCode() {
        d0.f34957d.getClass();
        return this.f34966a.hashCode() ^ 146118545;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final j O() {
        return W() >= 1 ? g0.BE : g0.BEFORE_BE;
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
        int i11 = e0.f34960a[chronoField.ordinal()];
        if (i11 == 1 || i11 == 2 || i11 == 3) {
            return this.f34966a.k(temporalField);
        }
        if (i11 != 4) {
            return d0.f34957d.z(chronoField);
        }
        j$.time.temporal.p pVar = ChronoField.YEAR.f35149b;
        return j$.time.temporal.p.f(1L, W() <= 0 ? (-(pVar.f35183a + 543)) + 1 : 543 + pVar.f35186d);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long j(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            int i11 = e0.f34960a[((ChronoField) temporalField).ordinal()];
            if (i11 == 4) {
                int iW = W();
                if (iW < 1) {
                    iW = 1 - iW;
                }
                return iW;
            }
            if (i11 == 5) {
                return ((((long) W()) * 12) + ((long) this.f34966a.getMonthValue())) - 1;
            }
            if (i11 == 6) {
                return W();
            }
            if (i11 != 7) {
                return this.f34966a.j(temporalField);
            }
            return W() < 1 ? 0 : 1;
        }
        return temporalField.Q(this);
    }

    public final int W() {
        return this.f34966a.getYear() + 543;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004d  */
    /* JADX WARN: Code duplicated, block: B:18:0x005f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0061 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x006e  */
    /* JADX WARN: Code duplicated, block: B:24:0x007f  */
    /* JADX WARN: Code duplicated, block: B:26:0x008c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0096  */
    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
    public final f0 a(TemporalField temporalField, long j11) {
        int iA;
        int i11;
        if (temporalField instanceof ChronoField) {
            ChronoField chronoField = (ChronoField) temporalField;
            if (j(chronoField) == j11) {
                return this;
            }
            int[] iArr = e0.f34960a;
            int i12 = iArr[chronoField.ordinal()];
            if (i12 == 4) {
                iA = d0.f34957d.z(chronoField).a(chronoField, j11);
                i11 = iArr[chronoField.ordinal()];
                if (i11 != 4) {
                    LocalDate localDate = this.f34966a;
                    if (W() < 1) {
                        iA = 1 - iA;
                    }
                    return Z(localDate.j0(iA - 543));
                }
                if (i11 != 6) {
                    return Z(this.f34966a.j0(iA - 543));
                }
                if (i11 == 7) {
                    return Z(this.f34966a.j0((-542) - W()));
                }
            } else {
                if (i12 == 5) {
                    d0.f34957d.z(chronoField).b(chronoField, j11);
                    return Z(this.f34966a.plusMonths(j11 - (((((long) W()) * 12) + ((long) this.f34966a.getMonthValue())) - 1)));
                }
                if (i12 == 6 || i12 == 7) {
                    iA = d0.f34957d.z(chronoField).a(chronoField, j11);
                    i11 = iArr[chronoField.ordinal()];
                    if (i11 != 4) {
                        LocalDate localDate2 = this.f34966a;
                        if (W() < 1) {
                            iA = 1 - iA;
                        }
                        return Z(localDate2.j0(iA - 543));
                    }
                    if (i11 != 6) {
                        return Z(this.f34966a.j0(iA - 543));
                    }
                    if (i11 == 7) {
                        return Z(this.f34966a.j0((-542) - W()));
                    }
                }
            }
            return Z(this.f34966a.a(temporalField, j11));
        }
        return (f0) super.a(temporalField, j11);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    /* JADX INFO: renamed from: e */
    public final Temporal i(LocalDate localDate) {
        return (f0) super.i(localDate);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDate i(j$.time.temporal.k kVar) {
        return (f0) super.i(kVar);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDate S(j$.time.temporal.m mVar) {
        return (f0) super.S(mVar);
    }

    @Override // j$.time.chrono.c
    public final ChronoLocalDate Q(long j11) {
        return Z(this.f34966a.g0(j11));
    }

    @Override // j$.time.chrono.c
    public final ChronoLocalDate J(long j11) {
        return Z(this.f34966a.plusMonths(j11));
    }

    @Override // j$.time.chrono.c
    public final ChronoLocalDate H(long j11) {
        return Z(this.f34966a.plusDays(j11));
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    public final ChronoLocalDate b(long j11, TemporalUnit temporalUnit) {
        return (f0) super.b(j11, temporalUnit);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    public final Temporal b(long j11, TemporalUnit temporalUnit) {
        return (f0) super.b(j11, temporalUnit);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    public final ChronoLocalDate c(long j11, TemporalUnit temporalUnit) {
        return (f0) super.c(j11, temporalUnit);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    public final Temporal c(long j11, TemporalUnit temporalUnit) {
        return (f0) super.c(j11, temporalUnit);
    }

    public final f0 Z(LocalDate localDate) {
        return localDate.equals(this.f34966a) ? this : new f0(localDate);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final long toEpochDay() {
        return this.f34966a.toEpochDay();
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f0) {
            return this.f34966a.equals(((f0) obj).f34966a);
        }
        return false;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new b0((byte) 8, this);
    }
}
