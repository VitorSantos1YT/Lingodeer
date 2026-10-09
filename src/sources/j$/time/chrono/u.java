package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalUnit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class u extends c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final LocalDate f34994d = LocalDate.of(1873, 1, 1);
    private static final long serialVersionUID = -305327627230580483L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient LocalDate f34995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final transient v f34996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient int f34997c;

    @Override // j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDateTime L(LocalTime localTime) {
        return new e(this, localTime);
    }

    public u(LocalDate localDate) {
        if (localDate.Z(f34994d)) {
            throw new j$.time.c("JapaneseDate before Meiji 6 is not supported");
        }
        v vVarP = v.p(localDate);
        this.f34996b = vVarP;
        this.f34997c = (localDate.getYear() - vVarP.f35001b.getYear()) + 1;
        this.f34995a = localDate;
    }

    public u(v vVar, int i11, LocalDate localDate) {
        if (localDate.Z(f34994d)) {
            throw new j$.time.c("JapaneseDate before Meiji 6 is not supported");
        }
        this.f34996b = vVar;
        this.f34997c = i11;
        this.f34995a = localDate;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final Chronology g() {
        return s.f34992d;
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    public final int hashCode() {
        s.f34992d.getClass();
        return this.f34995a.hashCode() ^ (-688086063);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final j O() {
        return this.f34996b;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final int V() {
        int iV;
        v vVarQ = this.f34996b.q();
        if (vVarQ != null && vVarQ.f35001b.getYear() == this.f34995a.getYear()) {
            iV = vVarQ.f35001b.Q() - 1;
        } else {
            iV = this.f34995a.V();
        }
        return this.f34997c == 1 ? iV - (this.f34996b.f35001b.Q() - 1) : iV;
    }

    @Override // j$.time.chrono.ChronoLocalDate, j$.time.temporal.TemporalAccessor
    public final boolean h(TemporalField temporalField) {
        if (temporalField == ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH || temporalField == ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR || temporalField == ChronoField.ALIGNED_WEEK_OF_MONTH || temporalField == ChronoField.ALIGNED_WEEK_OF_YEAR) {
            return false;
        }
        if (temporalField instanceof ChronoField) {
            return ((ChronoField) temporalField).isDateBased();
        }
        return temporalField != null && temporalField.w(this);
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
        int i11 = t.f34993a[chronoField.ordinal()];
        if (i11 == 1) {
            return j$.time.temporal.p.f(1L, this.f34995a.lengthOfMonth());
        }
        if (i11 == 2) {
            return j$.time.temporal.p.f(1L, V());
        }
        if (i11 != 3) {
            return s.f34992d.z(chronoField);
        }
        int year = this.f34996b.f35001b.getYear();
        v vVarQ = this.f34996b.q();
        return vVarQ != null ? j$.time.temporal.p.f(1L, (vVarQ.f35001b.getYear() - year) + 1) : j$.time.temporal.p.f(1L, 999999999 - year);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long j(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.Q(this);
        }
        switch (t.f34993a[((ChronoField) temporalField).ordinal()]) {
            case 2:
                return this.f34997c == 1 ? (this.f34995a.Q() - this.f34996b.f35001b.Q()) + 1 : this.f34995a.Q();
            case 3:
                return this.f34997c;
            case 4:
            case 5:
            case 6:
            case 7:
                throw new j$.time.temporal.o(j$.time.d.a("Unsupported field: ", temporalField));
            case 8:
                return this.f34996b.f35000a;
            default:
                return this.f34995a.j(temporalField);
        }
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
    public final u a(TemporalField temporalField, long j11) {
        if (temporalField instanceof ChronoField) {
            ChronoField chronoField = (ChronoField) temporalField;
            if (j(chronoField) == j11) {
                return this;
            }
            int[] iArr = t.f34993a;
            int i11 = iArr[chronoField.ordinal()];
            if (i11 == 3 || i11 == 8 || i11 == 9) {
                s sVar = s.f34992d;
                int iA = sVar.z(chronoField).a(chronoField, j11);
                int i12 = iArr[chronoField.ordinal()];
                if (i12 == 3) {
                    return a0(this.f34995a.j0(sVar.E(this.f34996b, iA)));
                }
                if (i12 == 8) {
                    return a0(this.f34995a.j0(sVar.E(v.r(iA), this.f34997c)));
                }
                if (i12 == 9) {
                    return a0(this.f34995a.j0(iA));
                }
            }
            return a0(this.f34995a.a(temporalField, j11));
        }
        return (u) super.a(temporalField, j11);
    }

    public final u Z(j$.time.f fVar) {
        return (u) super.i(fVar);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    /* JADX INFO: renamed from: e */
    public final Temporal i(LocalDate localDate) {
        return (u) super.i(localDate);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDate i(j$.time.temporal.k kVar) {
        return (u) super.i(kVar);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDate S(j$.time.temporal.m mVar) {
        return (u) super.S(mVar);
    }

    @Override // j$.time.chrono.c
    public final ChronoLocalDate Q(long j11) {
        return a0(this.f34995a.g0(j11));
    }

    @Override // j$.time.chrono.c
    public final ChronoLocalDate J(long j11) {
        return a0(this.f34995a.plusMonths(j11));
    }

    @Override // j$.time.chrono.c
    public final ChronoLocalDate H(long j11) {
        return a0(this.f34995a.plusDays(j11));
    }

    public final u W(long j11, ChronoUnit chronoUnit) {
        return (u) super.b(j11, (TemporalUnit) chronoUnit);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    public final ChronoLocalDate b(long j11, TemporalUnit temporalUnit) {
        return (u) super.b(j11, temporalUnit);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    public final Temporal b(long j11, TemporalUnit temporalUnit) {
        return (u) super.b(j11, temporalUnit);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    public final ChronoLocalDate c(long j11, TemporalUnit temporalUnit) {
        return (u) super.c(j11, temporalUnit);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    public final Temporal c(long j11, TemporalUnit temporalUnit) {
        return (u) super.c(j11, temporalUnit);
    }

    public final u a0(LocalDate localDate) {
        return localDate.equals(this.f34995a) ? this : new u(localDate);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final long toEpochDay() {
        return this.f34995a.toEpochDay();
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u) {
            return this.f34995a.equals(((u) obj).f34995a);
        }
        return false;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new b0((byte) 4, this);
    }
}
