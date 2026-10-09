package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalAccessor;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class s extends a implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final s f34992d = new s();
    private static final long serialVersionUID = 459996390165777884L;

    @Override // j$.time.chrono.Chronology
    public final String q() {
        return "Japanese";
    }

    @Override // j$.time.chrono.Chronology
    public final String t() {
        return "japanese";
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate R(int i11, int i12, int i13) {
        return new u(LocalDate.of(i11, i12, i13));
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate v(int i11, int i12) {
        return new u(LocalDate.d0(i11, i12));
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate p(long j11) {
        return new u(LocalDate.ofEpochDay(j11));
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate M() {
        return new u(LocalDate.H(LocalDate.c0(j$.time.b.d())));
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate I(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof u) {
            return (u) temporalAccessor;
        }
        return new u(LocalDate.H(temporalAccessor));
    }

    @Override // j$.time.chrono.Chronology
    public final List A() {
        v[] vVarArr = v.f34999e;
        return j$.time.b.c((v[]) Arrays.copyOf(vVarArr, vVarArr.length));
    }

    @Override // j$.time.chrono.Chronology
    public final boolean X(long j11) {
        return p.f34989d.X(j11);
    }

    private s() {
    }

    @Override // j$.time.chrono.Chronology
    public final int E(j jVar, int i11) {
        if (!(jVar instanceof v)) {
            throw new ClassCastException("Era must be JapaneseEra");
        }
        v vVar = (v) jVar;
        int year = (vVar.f35001b.getYear() + i11) - 1;
        if (i11 != 1 && (year < -999999999 || year > 999999999 || year < vVar.f35001b.getYear() || jVar != v.p(LocalDate.of(year, 1, 1)))) {
            throw new j$.time.c("Invalid yearOfEra value");
        }
        return year;
    }

    @Override // j$.time.chrono.Chronology
    public final j C(int i11) {
        return v.r(i11);
    }

    @Override // j$.time.chrono.Chronology
    public final j$.time.temporal.p z(ChronoField chronoField) {
        switch (r.f34991a[chronoField.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                throw new j$.time.temporal.o("Unsupported field: " + chronoField);
            case 5:
                v[] vVarArr = v.f34999e;
                int year = vVarArr[vVarArr.length - 1].f35001b.getYear();
                int year2 = 1000000000 - vVarArr[vVarArr.length - 1].f35001b.getYear();
                int year3 = vVarArr[0].f35001b.getYear();
                int i11 = 1;
                while (true) {
                    v[] vVarArr2 = v.f34999e;
                    if (i11 >= vVarArr2.length) {
                        return j$.time.temporal.p.g(1L, year2, 999999999 - year);
                    }
                    v vVar = vVarArr2[i11];
                    year2 = Math.min(year2, (vVar.f35001b.getYear() - year3) + 1);
                    year3 = vVar.f35001b.getYear();
                    i11++;
                }
                break;
            case 6:
                v vVar2 = v.f34998d;
                long j11 = ChronoField.DAY_OF_YEAR.f35149b.f35185c;
                long jMin = j11;
                for (v vVar3 : v.f34999e) {
                    long jMin2 = Math.min(jMin, (vVar3.f35001b.V() - vVar3.f35001b.Q()) + 1);
                    jMin = vVar3.q() != null ? Math.min(jMin2, vVar3.q().f35001b.Q() - 1) : jMin2;
                }
                return j$.time.temporal.p.g(1L, jMin, ChronoField.DAY_OF_YEAR.f35149b.f35186d);
            case 7:
                return j$.time.temporal.p.f(u.f34994d.getYear(), 999999999L);
            case 8:
                long j12 = v.f34998d.f35000a;
                v[] vVarArr3 = v.f34999e;
                return j$.time.temporal.p.f(j12, vVarArr3[vVarArr3.length - 1].f35000a);
            default:
                return chronoField.f35149b;
        }
    }

    @Override // j$.time.chrono.a, j$.time.chrono.Chronology
    public final ChronoLocalDate T(Map map, j$.time.format.c0 c0Var) {
        return (u) super.T(map, c0Var);
    }

    @Override // j$.time.chrono.a
    public final ChronoLocalDate Z(Map map, j$.time.format.c0 c0Var) {
        u uVarZ;
        ChronoField chronoField = ChronoField.ERA;
        Long l9 = (Long) map.get(chronoField);
        v vVarR = l9 != null ? v.r(z(chronoField).a(chronoField, l9.longValue())) : null;
        ChronoField chronoField2 = ChronoField.YEAR_OF_ERA;
        Long l11 = (Long) map.get(chronoField2);
        int iA = l11 != null ? z(chronoField2).a(chronoField2, l11.longValue()) : 0;
        if (vVarR == null && l11 != null && !map.containsKey(ChronoField.YEAR) && c0Var != j$.time.format.c0.STRICT) {
            v[] vVarArr = v.f34999e;
            vVarR = ((v[]) Arrays.copyOf(vVarArr, vVarArr.length))[((v[]) Arrays.copyOf(vVarArr, vVarArr.length)).length - 1];
        }
        if (l11 != null && vVarR != null) {
            ChronoField chronoField3 = ChronoField.MONTH_OF_YEAR;
            if (map.containsKey(chronoField3)) {
                ChronoField chronoField4 = ChronoField.DAY_OF_MONTH;
                if (map.containsKey(chronoField4)) {
                    map.remove(chronoField);
                    map.remove(chronoField2);
                    if (c0Var == j$.time.format.c0.LENIENT) {
                        return new u(LocalDate.of((vVarR.f35001b.getYear() + iA) - 1, 1, 1)).W(Math.subtractExact(((Long) map.remove(chronoField3)).longValue(), 1L), ChronoUnit.MONTHS).W(Math.subtractExact(((Long) map.remove(chronoField4)).longValue(), 1L), ChronoUnit.DAYS);
                    }
                    int iA2 = z(chronoField3).a(chronoField3, ((Long) map.remove(chronoField3)).longValue());
                    int iA3 = z(chronoField4).a(chronoField4, ((Long) map.remove(chronoField4)).longValue());
                    if (c0Var != j$.time.format.c0.SMART) {
                        LocalDate localDate = u.f34994d;
                        LocalDate localDateOf = LocalDate.of((vVarR.f35001b.getYear() + iA) - 1, iA2, iA3);
                        if (localDateOf.Z(vVarR.f35001b) || vVarR != v.p(localDateOf)) {
                            throw new j$.time.c("year, month, and day not valid for Era");
                        }
                        return new u(vVarR, iA, localDateOf);
                    }
                    if (iA < 1) {
                        throw new j$.time.c("Invalid YearOfEra: " + iA);
                    }
                    int year = (vVarR.f35001b.getYear() + iA) - 1;
                    try {
                        uVarZ = new u(LocalDate.of(year, iA2, iA3));
                    } catch (j$.time.c unused) {
                        uVarZ = new u(LocalDate.of(year, iA2, 1)).Z(new j$.time.f(3));
                    }
                    if (uVarZ.f34996b == vVarR || uVarZ.get(ChronoField.YEAR_OF_ERA) <= 1 || iA <= 1) {
                        return uVarZ;
                    }
                    throw new j$.time.c("Invalid YearOfEra for Era: " + vVarR + " " + iA);
                }
            }
            ChronoField chronoField5 = ChronoField.DAY_OF_YEAR;
            if (map.containsKey(chronoField5)) {
                map.remove(chronoField);
                map.remove(chronoField2);
                if (c0Var == j$.time.format.c0.LENIENT) {
                    return new u(LocalDate.d0((vVarR.f35001b.getYear() + iA) - 1, 1)).W(Math.subtractExact(((Long) map.remove(chronoField5)).longValue(), 1L), ChronoUnit.DAYS);
                }
                int iA4 = z(chronoField5).a(chronoField5, ((Long) map.remove(chronoField5)).longValue());
                LocalDate localDate2 = u.f34994d;
                LocalDate localDateD0 = iA == 1 ? LocalDate.d0(vVarR.f35001b.getYear(), (vVarR.f35001b.Q() + iA4) - 1) : LocalDate.d0((vVarR.f35001b.getYear() + iA) - 1, iA4);
                if (localDateD0.Z(vVarR.f35001b) || vVarR != v.p(localDateD0)) {
                    throw new j$.time.c("Invalid parameters");
                }
                return new u(vVarR, iA, localDateD0);
            }
        }
        return null;
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoZonedDateTime U(Instant instant, ZoneId zoneId) {
        return i.H(this, instant, zoneId);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public Object writeReplace() {
        return new b0((byte) 1, this);
    }
}
