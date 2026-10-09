package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.temporal.ChronoField;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalUnit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class n extends c {
    private static final long serialVersionUID = -5207853542612002020L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient l f34984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final transient int f34985b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient int f34986c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f34987d;

    @Override // j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDateTime L(LocalTime localTime) {
        return new e(this, localTime);
    }

    public n(l lVar, int i11, int i12, int i13) {
        lVar.d0(i11, i12, i13);
        this.f34984a = lVar;
        this.f34985b = i11;
        this.f34986c = i12;
        this.f34987d = i13;
    }

    public n(l lVar, long j11) {
        int i11 = (int) j11;
        lVar.a0();
        if (i11 < lVar.f34976f || i11 >= lVar.f34977g) {
            throw new j$.time.c("Hijrah date out of range");
        }
        int iBinarySearch = Arrays.binarySearch(lVar.f34975e, i11);
        iBinarySearch = iBinarySearch < 0 ? (-iBinarySearch) - 2 : iBinarySearch;
        int[] iArr = {lVar.c0(iBinarySearch), ((lVar.f34978h + iBinarySearch) % 12) + 1, (i11 - lVar.f34975e[iBinarySearch]) + 1};
        this.f34984a = lVar;
        this.f34985b = iArr[0];
        this.f34986c = iArr[1];
        this.f34987d = iArr[2];
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final Chronology g() {
        return this.f34984a;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final j O() {
        return o.AH;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final int V() {
        return this.f34984a.g0(this.f34985b, 12);
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
        int i11 = m.f34983a[chronoField.ordinal()];
        if (i11 == 1) {
            return j$.time.temporal.p.f(1L, this.f34984a.e0(this.f34985b, this.f34986c));
        }
        if (i11 != 2) {
            return i11 != 3 ? this.f34984a.z(chronoField) : j$.time.temporal.p.f(1L, 5L);
        }
        return j$.time.temporal.p.f(1L, V());
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long j(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.Q(this);
        }
        switch (m.f34983a[((ChronoField) temporalField).ordinal()]) {
            case 1:
                return this.f34987d;
            case 2:
                return W();
            case 3:
                return ((this.f34987d - 1) / 7) + 1;
            case 4:
                return ((int) Math.floorMod(toEpochDay() + 3, 7)) + 1;
            case 5:
                return ((this.f34987d - 1) % 7) + 1;
            case 6:
                return ((W() - 1) % 7) + 1;
            case 7:
                return toEpochDay();
            case 8:
                return ((W() - 1) / 7) + 1;
            case 9:
                return this.f34986c;
            case 10:
                return ((((long) this.f34985b) * 12) + ((long) this.f34986c)) - 1;
            case 11:
                return this.f34985b;
            case 12:
                return this.f34985b;
            case 13:
                return this.f34985b <= 1 ? 0 : 1;
            default:
                throw new j$.time.temporal.o(j$.time.d.a("Unsupported field: ", temporalField));
        }
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
    public final n a(TemporalField temporalField, long j11) {
        if (!(temporalField instanceof ChronoField)) {
            return (n) super.a(temporalField, j11);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        this.f34984a.z(chronoField).b(chronoField, j11);
        int i11 = (int) j11;
        switch (m.f34983a[chronoField.ordinal()]) {
            case 1:
                return b0(this.f34985b, this.f34986c, i11);
            case 2:
                return H(Math.min(i11, V()) - W());
            case 3:
                return H((j11 - j(ChronoField.ALIGNED_WEEK_OF_MONTH)) * 7);
            case 4:
                return H(j11 - ((long) (((int) Math.floorMod(toEpochDay() + 3, 7)) + 1)));
            case 5:
                return H(j11 - j(ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 6:
                return H(j11 - j(ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 7:
                return new n(this.f34984a, j11);
            case 8:
                return H((j11 - j(ChronoField.ALIGNED_WEEK_OF_YEAR)) * 7);
            case 9:
                return b0(this.f34985b, i11, this.f34987d);
            case 10:
                return J(j11 - (((((long) this.f34985b) * 12) + ((long) this.f34986c)) - 1));
            case 11:
                if (this.f34985b < 1) {
                    i11 = 1 - i11;
                }
                return b0(i11, this.f34986c, this.f34987d);
            case 12:
                return b0(i11, this.f34986c, this.f34987d);
            case 13:
                return b0(1 - this.f34985b, this.f34986c, this.f34987d);
            default:
                throw new j$.time.temporal.o(j$.time.d.a("Unsupported field: ", temporalField));
        }
    }

    public final n b0(int i11, int i12, int i13) {
        int iE0 = this.f34984a.e0(i11, i12);
        if (i13 > iE0) {
            i13 = iE0;
        }
        return new n(this.f34984a, i11, i12, i13);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    /* JADX INFO: renamed from: e */
    public final Temporal i(LocalDate localDate) {
        return (n) super.i(localDate);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDate i(j$.time.temporal.k kVar) {
        return (n) super.i(kVar);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDate S(j$.time.temporal.m mVar) {
        return (n) super.S(mVar);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final long toEpochDay() {
        return this.f34984a.d0(this.f34985b, this.f34986c, this.f34987d);
    }

    public final int W() {
        return this.f34984a.g0(this.f34985b, this.f34986c - 1) + this.f34987d;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final boolean y() {
        return this.f34984a.X(this.f34985b);
    }

    @Override // j$.time.chrono.c
    public final ChronoLocalDate Q(long j11) {
        return j11 == 0 ? this : b0(Math.addExact(this.f34985b, (int) j11), this.f34986c, this.f34987d);
    }

    @Override // j$.time.chrono.c
    /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
    public final n J(long j11) {
        if (j11 == 0) {
            return this;
        }
        long j12 = (((long) this.f34985b) * 12) + ((long) (this.f34986c - 1)) + j11;
        l lVar = this.f34984a;
        long jFloorDiv = Math.floorDiv(j12, 12L);
        if (jFloorDiv >= lVar.c0(0) && jFloorDiv <= lVar.c0(lVar.f34975e.length - 1) - 1) {
            return b0((int) jFloorDiv, ((int) Math.floorMod(j12, 12L)) + 1, this.f34987d);
        }
        throw new j$.time.c("Invalid Hijrah year: " + jFloorDiv);
    }

    @Override // j$.time.chrono.c
    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public final n H(long j11) {
        return new n(this.f34984a, toEpochDay() + j11);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    public final ChronoLocalDate b(long j11, TemporalUnit temporalUnit) {
        return (n) super.b(j11, temporalUnit);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    public final Temporal b(long j11, TemporalUnit temporalUnit) {
        return (n) super.b(j11, temporalUnit);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    public final ChronoLocalDate c(long j11, TemporalUnit temporalUnit) {
        return (n) super.c(j11, temporalUnit);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    public final Temporal c(long j11, TemporalUnit temporalUnit) {
        return (n) super.c(j11, temporalUnit);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            if (this.f34985b == nVar.f34985b && this.f34986c == nVar.f34986c && this.f34987d == nVar.f34987d && this.f34984a.equals(nVar.f34984a)) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    public final int hashCode() {
        int i11 = this.f34985b;
        int i12 = this.f34986c;
        int i13 = this.f34987d;
        this.f34984a.getClass();
        return (((i11 << 11) + (i12 << 6)) + i13) ^ ((i11 & (-2048)) ^ 2100100019);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new b0((byte) 6, this);
    }
}
