package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.Month;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class p extends a implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p f34989d = new p();
    private static final long serialVersionUID = -1440403870442975015L;

    @Override // j$.time.chrono.Chronology
    public final j C(int i11) {
        if (i11 == 0) {
            return q.BCE;
        }
        if (i11 == 1) {
            return q.CE;
        }
        throw new j$.time.c("Invalid era: " + i11);
    }

    @Override // j$.time.chrono.Chronology
    public final String q() {
        return "ISO";
    }

    @Override // j$.time.chrono.Chronology
    public final String t() {
        return "iso8601";
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate R(int i11, int i12, int i13) {
        return LocalDate.of(i11, i12, i13);
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate v(int i11, int i12) {
        return LocalDate.d0(i11, i12);
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate p(long j11) {
        return LocalDate.ofEpochDay(j11);
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate I(TemporalAccessor temporalAccessor) {
        return LocalDate.H(temporalAccessor);
    }

    private p() {
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDateTime N(TemporalAccessor temporalAccessor) {
        return LocalDateTime.B(temporalAccessor);
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoZonedDateTime u(TemporalAccessor temporalAccessor) {
        return ZonedDateTime.B(temporalAccessor);
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoZonedDateTime U(Instant instant, ZoneId zoneId) {
        Objects.requireNonNull(instant, "instant");
        Objects.requireNonNull(zoneId, "zone");
        return ZonedDateTime.w(instant.getEpochSecond(), instant.f34914b, zoneId);
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate M() {
        return LocalDate.H(LocalDate.c0(j$.time.b.d()));
    }

    @Override // j$.time.chrono.Chronology
    public final boolean X(long j11) {
        if ((3 & j11) == 0) {
            return j11 % 100 != 0 || j11 % 400 == 0;
        }
        return false;
    }

    @Override // j$.time.chrono.Chronology
    public final int E(j jVar, int i11) {
        if (jVar instanceof q) {
            return jVar == q.CE ? i11 : 1 - i11;
        }
        throw new ClassCastException("Era must be IsoEra");
    }

    @Override // j$.time.chrono.Chronology
    public final List A() {
        return j$.time.b.c(q.values());
    }

    @Override // j$.time.chrono.a, j$.time.chrono.Chronology
    public final ChronoLocalDate T(Map map, j$.time.format.c0 c0Var) {
        return (LocalDate) super.T(map, c0Var);
    }

    @Override // j$.time.chrono.a
    public final void Q(Map map, j$.time.format.c0 c0Var) {
        ChronoField chronoField = ChronoField.PROLEPTIC_MONTH;
        Long l9 = (Long) map.remove(chronoField);
        if (l9 != null) {
            if (c0Var != j$.time.format.c0.LENIENT) {
                chronoField.Z(l9.longValue());
            }
            long j11 = 12;
            a.w(map, ChronoField.MONTH_OF_YEAR, ((int) Math.floorMod(l9.longValue(), j11)) + 1);
            a.w(map, ChronoField.YEAR, Math.floorDiv(l9.longValue(), j11));
        }
    }

    @Override // j$.time.chrono.a
    public final ChronoLocalDate Z(Map map, j$.time.format.c0 c0Var) {
        ChronoField chronoField = ChronoField.YEAR_OF_ERA;
        Long l9 = (Long) map.remove(chronoField);
        if (l9 != null) {
            if (c0Var != j$.time.format.c0.LENIENT) {
                chronoField.Z(l9.longValue());
            }
            Long l11 = (Long) map.remove(ChronoField.ERA);
            if (l11 != null) {
                if (l11.longValue() == 1) {
                    a.w(map, ChronoField.YEAR, l9.longValue());
                    return null;
                }
                if (l11.longValue() == 0) {
                    a.w(map, ChronoField.YEAR, Math.subtractExact(1L, l9.longValue()));
                    return null;
                }
                throw new j$.time.c("Invalid value for era: " + l11);
            }
            ChronoField chronoField2 = ChronoField.YEAR;
            Long l12 = (Long) map.get(chronoField2);
            if (c0Var != j$.time.format.c0.STRICT) {
                a.w(map, chronoField2, (l12 == null || l12.longValue() > 0) ? l9.longValue() : Math.subtractExact(1L, l9.longValue()));
                return null;
            }
            if (l12 != null) {
                long jLongValue = l12.longValue();
                long jLongValue2 = l9.longValue();
                if (jLongValue <= 0) {
                    jLongValue2 = Math.subtractExact(1L, jLongValue2);
                }
                a.w(map, chronoField2, jLongValue2);
                return null;
            }
            map.put(chronoField, l9);
            return null;
        }
        ChronoField chronoField3 = ChronoField.ERA;
        if (!map.containsKey(chronoField3)) {
            return null;
        }
        chronoField3.Z(((Long) map.get(chronoField3)).longValue());
        return null;
    }

    @Override // j$.time.chrono.a
    public final ChronoLocalDate W(Map map, j$.time.format.c0 c0Var) {
        ChronoField chronoField = ChronoField.YEAR;
        int iA = chronoField.f35149b.a(chronoField, ((Long) map.remove(chronoField)).longValue());
        boolean z11 = true;
        if (c0Var == j$.time.format.c0.LENIENT) {
            return LocalDate.of(iA, 1, 1).plusMonths(Math.subtractExact(((Long) map.remove(ChronoField.MONTH_OF_YEAR)).longValue(), 1L)).plusDays(Math.subtractExact(((Long) map.remove(ChronoField.DAY_OF_MONTH)).longValue(), 1L));
        }
        ChronoField chronoField2 = ChronoField.MONTH_OF_YEAR;
        int iA2 = chronoField2.f35149b.a(chronoField2, ((Long) map.remove(chronoField2)).longValue());
        ChronoField chronoField3 = ChronoField.DAY_OF_MONTH;
        int iA3 = chronoField3.f35149b.a(chronoField3, ((Long) map.remove(chronoField3)).longValue());
        if (c0Var == j$.time.format.c0.SMART) {
            if (iA2 == 4 || iA2 == 6 || iA2 == 9 || iA2 == 11) {
                iA3 = Math.min(iA3, 30);
            } else if (iA2 == 2) {
                Month month = Month.FEBRUARY;
                long j11 = iA;
                int i11 = j$.time.s.f35143b;
                if ((3 & j11) != 0 || (j11 % 100 == 0 && j11 % 400 != 0)) {
                    z11 = false;
                }
                iA3 = Math.min(iA3, month.B(z11));
            }
        }
        return LocalDate.of(iA, iA2, iA3);
    }

    @Override // j$.time.chrono.Chronology
    public final j$.time.temporal.p z(ChronoField chronoField) {
        return chronoField.f35149b;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public Object writeReplace() {
        return new b0((byte) 1, this);
    }
}
