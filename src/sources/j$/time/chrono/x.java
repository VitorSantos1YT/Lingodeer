package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class x extends a implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x f35004d = new x();
    private static final long serialVersionUID = 1039765215346859963L;

    @Override // j$.time.chrono.Chronology
    public final String q() {
        return "Minguo";
    }

    @Override // j$.time.chrono.Chronology
    public final j C(int i11) {
        if (i11 == 0) {
            return a0.BEFORE_ROC;
        }
        if (i11 == 1) {
            return a0.ROC;
        }
        throw new j$.time.c("Invalid era: " + i11);
    }

    @Override // j$.time.chrono.Chronology
    public final String t() {
        return "roc";
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate R(int i11, int i12, int i13) {
        return new z(LocalDate.of(i11 + 1911, i12, i13));
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate v(int i11, int i12) {
        return new z(LocalDate.d0(i11 + 1911, i12));
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate p(long j11) {
        return new z(LocalDate.ofEpochDay(j11));
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate M() {
        return new z(LocalDate.H(LocalDate.c0(j$.time.b.d())));
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate I(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof z) {
            return (z) temporalAccessor;
        }
        return new z(LocalDate.H(temporalAccessor));
    }

    @Override // j$.time.chrono.Chronology
    public final boolean X(long j11) {
        return p.f34989d.X(j11 + 1911);
    }

    @Override // j$.time.chrono.Chronology
    public final int E(j jVar, int i11) {
        if (jVar instanceof a0) {
            return jVar == a0.ROC ? i11 : 1 - i11;
        }
        throw new ClassCastException("Era must be MinguoEra");
    }

    @Override // j$.time.chrono.Chronology
    public final List A() {
        return j$.time.b.c(a0.values());
    }

    @Override // j$.time.chrono.Chronology
    public final j$.time.temporal.p z(ChronoField chronoField) {
        int i11 = w.f35003a[chronoField.ordinal()];
        if (i11 == 1) {
            j$.time.temporal.p pVar = ChronoField.PROLEPTIC_MONTH.f35149b;
            return j$.time.temporal.p.f(pVar.f35183a - 22932, pVar.f35186d - 22932);
        }
        if (i11 == 2) {
            j$.time.temporal.p pVar2 = ChronoField.YEAR.f35149b;
            return j$.time.temporal.p.g(1L, pVar2.f35186d - 1911, (-pVar2.f35183a) + 1912);
        }
        if (i11 != 3) {
            return chronoField.f35149b;
        }
        j$.time.temporal.p pVar3 = ChronoField.YEAR.f35149b;
        return j$.time.temporal.p.f(pVar3.f35183a - 1911, pVar3.f35186d - 1911);
    }

    @Override // j$.time.chrono.a, j$.time.chrono.Chronology
    public final ChronoLocalDate T(Map map, j$.time.format.c0 c0Var) {
        return (z) super.T(map, c0Var);
    }

    private x() {
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoZonedDateTime U(Instant instant, ZoneId zoneId) {
        return i.H(this, instant, zoneId);
    }

    public Object writeReplace() {
        return new b0((byte) 1, this);
    }
}
