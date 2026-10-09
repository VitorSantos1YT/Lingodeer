package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class d0 extends a implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d0 f34957d = new d0();
    private static final long serialVersionUID = 2775954514031616474L;

    static {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        map.put("en", new String[]{"BB", "BE"});
        map.put("th", new String[]{"BB", "BE"});
        map2.put("en", new String[]{"B.B.", "B.E."});
        map2.put("th", new String[]{"พ.ศ.", "ปีก่อนคริสต์กาลที่"});
        map3.put("en", new String[]{"Before Buddhist", "Budhhist Era"});
        map3.put("th", new String[]{"พุทธศักราช", "ปีก่อนคริสต์กาลที่"});
    }

    @Override // j$.time.chrono.Chronology
    public final j C(int i11) {
        if (i11 == 0) {
            return g0.BEFORE_BE;
        }
        if (i11 == 1) {
            return g0.BE;
        }
        throw new j$.time.c("Invalid era: " + i11);
    }

    @Override // j$.time.chrono.Chronology
    public final String q() {
        return "ThaiBuddhist";
    }

    @Override // j$.time.chrono.Chronology
    public final String t() {
        return "buddhist";
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate R(int i11, int i12, int i13) {
        return new f0(LocalDate.of(i11 - 543, i12, i13));
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate v(int i11, int i12) {
        return new f0(LocalDate.d0(i11 - 543, i12));
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate p(long j11) {
        return new f0(LocalDate.ofEpochDay(j11));
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate M() {
        return new f0(LocalDate.H(LocalDate.c0(j$.time.b.d())));
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate I(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof f0) {
            return (f0) temporalAccessor;
        }
        return new f0(LocalDate.H(temporalAccessor));
    }

    @Override // j$.time.chrono.Chronology
    public final boolean X(long j11) {
        return p.f34989d.X(j11 - 543);
    }

    @Override // j$.time.chrono.Chronology
    public final int E(j jVar, int i11) {
        if (jVar instanceof g0) {
            return jVar == g0.BE ? i11 : 1 - i11;
        }
        throw new ClassCastException("Era must be BuddhistEra");
    }

    private d0() {
    }

    @Override // j$.time.chrono.Chronology
    public final List A() {
        return j$.time.b.c(g0.values());
    }

    @Override // j$.time.chrono.Chronology
    public final j$.time.temporal.p z(ChronoField chronoField) {
        int i11 = c0.f34955a[chronoField.ordinal()];
        if (i11 == 1) {
            j$.time.temporal.p pVar = ChronoField.PROLEPTIC_MONTH.f35149b;
            return j$.time.temporal.p.f(pVar.f35183a + 6516, pVar.f35186d + 6516);
        }
        if (i11 == 2) {
            j$.time.temporal.p pVar2 = ChronoField.YEAR.f35149b;
            return j$.time.temporal.p.g(1L, (-(pVar2.f35183a + 543)) + 1, pVar2.f35186d + 543);
        }
        if (i11 != 3) {
            return chronoField.f35149b;
        }
        j$.time.temporal.p pVar3 = ChronoField.YEAR.f35149b;
        return j$.time.temporal.p.f(pVar3.f35183a + 543, pVar3.f35186d + 543);
    }

    @Override // j$.time.chrono.a, j$.time.chrono.Chronology
    public final ChronoLocalDate T(Map map, j$.time.format.c0 c0Var) {
        return (f0) super.T(map, c0Var);
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
