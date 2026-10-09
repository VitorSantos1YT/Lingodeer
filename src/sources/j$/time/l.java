package j$.time;

import com.tbruyelle.rxpermissions3.BuildConfig;
import j$.time.chrono.Chronology;
import j$.time.format.DateTimeFormatterBuilder;
import j$.time.format.c0;
import j$.time.temporal.ChronoField;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalField;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class l implements TemporalAccessor, j$.time.temporal.k, Comparable, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f35127c = 0;
    private static final long serialVersionUID = -939150713474957432L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f35128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f35129b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        l lVar = (l) obj;
        int i11 = this.f35128a - lVar.f35128a;
        return i11 == 0 ? this.f35129b - lVar.f35129b : i11;
    }

    static {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.e("--");
        dateTimeFormatterBuilder.m(ChronoField.MONTH_OF_YEAR, 2);
        dateTimeFormatterBuilder.d('-');
        dateTimeFormatterBuilder.m(ChronoField.DAY_OF_MONTH, 2);
        dateTimeFormatterBuilder.r(Locale.getDefault(), c0.SMART, null);
    }

    public l(int i11, int i12) {
        this.f35128a = i11;
        this.f35129b = i12;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean h(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return temporalField == ChronoField.MONTH_OF_YEAR || temporalField == ChronoField.DAY_OF_MONTH;
        }
        return temporalField != null && temporalField.w(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.p k(TemporalField temporalField) {
        int i11;
        if (temporalField == ChronoField.MONTH_OF_YEAR) {
            return temporalField.J();
        }
        if (temporalField != ChronoField.DAY_OF_MONTH) {
            return super.k(temporalField);
        }
        Month monthJ = Month.J(this.f35128a);
        monthJ.getClass();
        int i12 = j.f35125a[monthJ.ordinal()];
        if (i12 != 1) {
            i11 = (i12 == 2 || i12 == 3 || i12 == 4 || i12 == 5) ? 30 : 31;
        } else {
            i11 = 28;
        }
        return j$.time.temporal.p.g(1L, i11, Month.J(this.f35128a).H());
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
        int i12 = k.f35126a[((ChronoField) temporalField).ordinal()];
        if (i12 == 1) {
            i11 = this.f35129b;
        } else {
            if (i12 != 2) {
                throw new j$.time.temporal.o(d.a("Unsupported field: ", temporalField));
            }
            i11 = this.f35128a;
        }
        return i11;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object d(f fVar) {
        if (fVar == j$.time.temporal.n.f35177b) {
            return j$.time.chrono.p.f34989d;
        }
        return super.d(fVar);
    }

    @Override // j$.time.temporal.k
    public final Temporal f(Temporal temporal) {
        if (!Chronology.r(temporal).equals(j$.time.chrono.p.f34989d)) {
            throw new c("Adjustment only supported on ISO date-time");
        }
        Temporal temporalA = temporal.a(ChronoField.MONTH_OF_YEAR, this.f35128a);
        ChronoField chronoField = ChronoField.DAY_OF_MONTH;
        return temporalA.a(chronoField, Math.min(temporalA.k(chronoField).f35186d, this.f35129b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            if (this.f35128a == lVar.f35128a && this.f35129b == lVar.f35129b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f35128a << 6) + this.f35129b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(10);
        sb2.append("--");
        sb2.append(this.f35128a < 10 ? "0" : BuildConfig.VERSION_NAME);
        sb2.append(this.f35128a);
        sb2.append(this.f35129b < 10 ? "-0" : "-");
        sb2.append(this.f35129b);
        return sb2.toString();
    }

    private Object writeReplace() {
        return new q((byte) 13, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
