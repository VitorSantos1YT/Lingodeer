package j$.time.chrono;

import j$.time.DayOfWeek;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalUnit;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a implements Chronology {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap f34948a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ConcurrentHashMap f34949b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Locale f34950c = new Locale("ja", "JP", "JP");

    public static Chronology H(Chronology chronology, String str) {
        String strT;
        Chronology chronology2 = (Chronology) f34948a.putIfAbsent(str, chronology);
        if (chronology2 == null && (strT = chronology.t()) != null) {
            f34949b.putIfAbsent(strT, chronology);
        }
        return chronology2;
    }

    public static boolean B() {
        if (f34948a.get("ISO") != null) {
            return false;
        }
        l lVar = l.m;
        lVar.getClass();
        H(lVar, "Hijrah-umalqura");
        s sVar = s.f34992d;
        sVar.getClass();
        H(sVar, "Japanese");
        x xVar = x.f35004d;
        xVar.getClass();
        H(xVar, "Minguo");
        d0 d0Var = d0.f34957d;
        d0Var.getClass();
        H(d0Var, "ThaiBuddhist");
        try {
            for (a aVar : Arrays.asList(new a[0])) {
                if (!aVar.q().equals("ISO")) {
                    H(aVar, aVar.q());
                }
            }
            p pVar = p.f34989d;
            pVar.getClass();
            H(pVar, "ISO");
            return true;
        } catch (Throwable th2) {
            throw new ServiceConfigurationError(th2.getMessage(), th2);
        }
    }

    public static Chronology ofLocale(Locale locale) {
        Objects.requireNonNull(locale, "locale");
        String unicodeLocaleType = locale.getUnicodeLocaleType("ca");
        if (unicodeLocaleType == null) {
            unicodeLocaleType = locale.equals(f34950c) ? "japanese" : null;
        }
        if (unicodeLocaleType == null || "iso".equals(unicodeLocaleType) || "iso8601".equals(unicodeLocaleType)) {
            return p.f34989d;
        }
        do {
            Chronology chronology = (Chronology) f34949b.get(unicodeLocaleType);
            if (chronology != null) {
                return chronology;
            }
        } while (B());
        for (Chronology chronology2 : ServiceLoader.load(Chronology.class)) {
            if (unicodeLocaleType.equals(chronology2.t())) {
                return chronology2;
            }
        }
        throw new j$.time.c("Unknown calendar system: ".concat(unicodeLocaleType));
    }

    @Override // j$.time.chrono.Chronology
    public ChronoLocalDate T(Map map, j$.time.format.c0 c0Var) {
        ChronoField chronoField = ChronoField.EPOCH_DAY;
        if (map.containsKey(chronoField)) {
            return p(((Long) map.remove(chronoField)).longValue());
        }
        Q(map, c0Var);
        ChronoLocalDate chronoLocalDateZ = Z(map, c0Var);
        if (chronoLocalDateZ != null) {
            return chronoLocalDateZ;
        }
        ChronoField chronoField2 = ChronoField.YEAR;
        if (!map.containsKey(chronoField2)) {
            return null;
        }
        ChronoField chronoField3 = ChronoField.MONTH_OF_YEAR;
        if (map.containsKey(chronoField3)) {
            if (map.containsKey(ChronoField.DAY_OF_MONTH)) {
                return W(map, c0Var);
            }
            ChronoField chronoField4 = ChronoField.ALIGNED_WEEK_OF_MONTH;
            if (map.containsKey(chronoField4)) {
                ChronoField chronoField5 = ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH;
                if (map.containsKey(chronoField5)) {
                    int iA = z(chronoField2).a(chronoField2, ((Long) map.remove(chronoField2)).longValue());
                    if (c0Var == j$.time.format.c0.LENIENT) {
                        long jSubtractExact = Math.subtractExact(((Long) map.remove(chronoField3)).longValue(), 1L);
                        return R(iA, 1, 1).b(jSubtractExact, (TemporalUnit) ChronoUnit.MONTHS).b(Math.subtractExact(((Long) map.remove(chronoField4)).longValue(), 1L), (TemporalUnit) ChronoUnit.WEEKS).b(Math.subtractExact(((Long) map.remove(chronoField5)).longValue(), 1L), (TemporalUnit) ChronoUnit.DAYS);
                    }
                    int iA2 = z(chronoField3).a(chronoField3, ((Long) map.remove(chronoField3)).longValue());
                    ChronoLocalDate chronoLocalDateB = R(iA, iA2, 1).b((z(chronoField5).a(chronoField5, ((Long) map.remove(chronoField5)).longValue()) - 1) + ((z(chronoField4).a(chronoField4, ((Long) map.remove(chronoField4)).longValue()) - 1) * 7), (TemporalUnit) ChronoUnit.DAYS);
                    if (c0Var != j$.time.format.c0.STRICT || chronoLocalDateB.get(chronoField3) == iA2) {
                        return chronoLocalDateB;
                    }
                    throw new j$.time.c("Strict mode rejected resolved date as it is in a different month");
                }
                ChronoField chronoField6 = ChronoField.DAY_OF_WEEK;
                if (map.containsKey(chronoField6)) {
                    int iA3 = z(chronoField2).a(chronoField2, ((Long) map.remove(chronoField2)).longValue());
                    if (c0Var == j$.time.format.c0.LENIENT) {
                        return J(R(iA3, 1, 1), Math.subtractExact(((Long) map.remove(chronoField3)).longValue(), 1L), Math.subtractExact(((Long) map.remove(chronoField4)).longValue(), 1L), Math.subtractExact(((Long) map.remove(chronoField6)).longValue(), 1L));
                    }
                    int iA4 = z(chronoField3).a(chronoField3, ((Long) map.remove(chronoField3)).longValue());
                    ChronoLocalDate chronoLocalDateI = R(iA3, iA4, 1).b((z(chronoField4).a(chronoField4, ((Long) map.remove(chronoField4)).longValue()) - 1) * 7, (TemporalUnit) ChronoUnit.DAYS).i(new j$.time.temporal.l(DayOfWeek.w(z(chronoField6).a(chronoField6, ((Long) map.remove(chronoField6)).longValue())).getValue(), 0));
                    if (c0Var != j$.time.format.c0.STRICT || chronoLocalDateI.get(chronoField3) == iA4) {
                        return chronoLocalDateI;
                    }
                    throw new j$.time.c("Strict mode rejected resolved date as it is in a different month");
                }
            }
        }
        ChronoField chronoField7 = ChronoField.DAY_OF_YEAR;
        if (map.containsKey(chronoField7)) {
            int iA5 = z(chronoField2).a(chronoField2, ((Long) map.remove(chronoField2)).longValue());
            if (c0Var != j$.time.format.c0.LENIENT) {
                return v(iA5, z(chronoField7).a(chronoField7, ((Long) map.remove(chronoField7)).longValue()));
            }
            return v(iA5, 1).b(Math.subtractExact(((Long) map.remove(chronoField7)).longValue(), 1L), (TemporalUnit) ChronoUnit.DAYS);
        }
        ChronoField chronoField8 = ChronoField.ALIGNED_WEEK_OF_YEAR;
        if (!map.containsKey(chronoField8)) {
            return null;
        }
        ChronoField chronoField9 = ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR;
        if (map.containsKey(chronoField9)) {
            int iA6 = z(chronoField2).a(chronoField2, ((Long) map.remove(chronoField2)).longValue());
            if (c0Var == j$.time.format.c0.LENIENT) {
                return v(iA6, 1).b(Math.subtractExact(((Long) map.remove(chronoField8)).longValue(), 1L), (TemporalUnit) ChronoUnit.WEEKS).b(Math.subtractExact(((Long) map.remove(chronoField9)).longValue(), 1L), (TemporalUnit) ChronoUnit.DAYS);
            }
            ChronoLocalDate chronoLocalDateB2 = v(iA6, 1).b((z(chronoField9).a(chronoField9, ((Long) map.remove(chronoField9)).longValue()) - 1) + ((z(chronoField8).a(chronoField8, ((Long) map.remove(chronoField8)).longValue()) - 1) * 7), (TemporalUnit) ChronoUnit.DAYS);
            if (c0Var != j$.time.format.c0.STRICT || chronoLocalDateB2.get(chronoField2) == iA6) {
                return chronoLocalDateB2;
            }
            throw new j$.time.c("Strict mode rejected resolved date as it is in a different year");
        }
        ChronoField chronoField10 = ChronoField.DAY_OF_WEEK;
        if (!map.containsKey(chronoField10)) {
            return null;
        }
        int iA7 = z(chronoField2).a(chronoField2, ((Long) map.remove(chronoField2)).longValue());
        if (c0Var == j$.time.format.c0.LENIENT) {
            return J(v(iA7, 1), 0L, Math.subtractExact(((Long) map.remove(chronoField8)).longValue(), 1L), Math.subtractExact(((Long) map.remove(chronoField10)).longValue(), 1L));
        }
        ChronoLocalDate chronoLocalDateI2 = v(iA7, 1).b((z(chronoField8).a(chronoField8, ((Long) map.remove(chronoField8)).longValue()) - 1) * 7, (TemporalUnit) ChronoUnit.DAYS).i(new j$.time.temporal.l(DayOfWeek.w(z(chronoField10).a(chronoField10, ((Long) map.remove(chronoField10)).longValue())).getValue(), 0));
        if (c0Var != j$.time.format.c0.STRICT || chronoLocalDateI2.get(chronoField2) == iA7) {
            return chronoLocalDateI2;
        }
        throw new j$.time.c("Strict mode rejected resolved date as it is in a different year");
    }

    public void Q(Map map, j$.time.format.c0 c0Var) {
        ChronoField chronoField = ChronoField.PROLEPTIC_MONTH;
        Long l9 = (Long) map.remove(chronoField);
        if (l9 != null) {
            if (c0Var != j$.time.format.c0.LENIENT) {
                chronoField.Z(l9.longValue());
            }
            ChronoLocalDate chronoLocalDateA = M().a((TemporalField) ChronoField.DAY_OF_MONTH, 1L).a((TemporalField) chronoField, l9.longValue());
            ChronoField chronoField2 = ChronoField.MONTH_OF_YEAR;
            w(map, chronoField2, chronoLocalDateA.get(chronoField2));
            ChronoField chronoField3 = ChronoField.YEAR;
            w(map, chronoField3, chronoLocalDateA.get(chronoField3));
        }
    }

    public ChronoLocalDate Z(Map map, j$.time.format.c0 c0Var) {
        int intExact;
        ChronoField chronoField = ChronoField.YEAR_OF_ERA;
        Long l9 = (Long) map.remove(chronoField);
        if (l9 != null) {
            ChronoField chronoField2 = ChronoField.ERA;
            Long l11 = (Long) map.remove(chronoField2);
            if (c0Var != j$.time.format.c0.LENIENT) {
                intExact = z(chronoField).a(chronoField, l9.longValue());
            } else {
                intExact = Math.toIntExact(l9.longValue());
            }
            if (l11 != null) {
                w(map, ChronoField.YEAR, E(C(z(chronoField2).a(chronoField2, l11.longValue())), intExact));
                return null;
            }
            ChronoField chronoField3 = ChronoField.YEAR;
            if (map.containsKey(chronoField3)) {
                w(map, chronoField3, E(v(z(chronoField3).a(chronoField3, ((Long) map.get(chronoField3)).longValue()), 1).O(), intExact));
                return null;
            }
            if (c0Var == j$.time.format.c0.STRICT) {
                map.put(chronoField, l9);
                return null;
            }
            List listA = A();
            if (listA.isEmpty()) {
                w(map, chronoField3, intExact);
                return null;
            }
            w(map, chronoField3, E((j) listA.get(listA.size() - 1), intExact));
            return null;
        }
        ChronoField chronoField4 = ChronoField.ERA;
        if (!map.containsKey(chronoField4)) {
            return null;
        }
        z(chronoField4).b(chronoField4, ((Long) map.get(chronoField4)).longValue());
        return null;
    }

    public ChronoLocalDate W(Map map, j$.time.format.c0 c0Var) {
        ChronoField chronoField = ChronoField.YEAR;
        int iA = z(chronoField).a(chronoField, ((Long) map.remove(chronoField)).longValue());
        if (c0Var == j$.time.format.c0.LENIENT) {
            long jSubtractExact = Math.subtractExact(((Long) map.remove(ChronoField.MONTH_OF_YEAR)).longValue(), 1L);
            return R(iA, 1, 1).b(jSubtractExact, (TemporalUnit) ChronoUnit.MONTHS).b(Math.subtractExact(((Long) map.remove(ChronoField.DAY_OF_MONTH)).longValue(), 1L), (TemporalUnit) ChronoUnit.DAYS);
        }
        ChronoField chronoField2 = ChronoField.MONTH_OF_YEAR;
        int iA2 = z(chronoField2).a(chronoField2, ((Long) map.remove(chronoField2)).longValue());
        ChronoField chronoField3 = ChronoField.DAY_OF_MONTH;
        int iA3 = z(chronoField3).a(chronoField3, ((Long) map.remove(chronoField3)).longValue());
        if (c0Var != j$.time.format.c0.SMART) {
            return R(iA, iA2, iA3);
        }
        try {
            return R(iA, iA2, iA3);
        } catch (j$.time.c unused) {
            return R(iA, iA2, 1).i(new j$.time.f(3));
        }
    }

    public static ChronoLocalDate J(ChronoLocalDate chronoLocalDate, long j11, long j12, long j13) {
        long j14;
        ChronoLocalDate chronoLocalDateB = chronoLocalDate.b(j11, (TemporalUnit) ChronoUnit.MONTHS);
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        ChronoLocalDate chronoLocalDateB2 = chronoLocalDateB.b(j12, (TemporalUnit) chronoUnit);
        if (j13 > 7) {
            long j15 = j13 - 1;
            chronoLocalDateB2 = chronoLocalDateB2.b(j15 / 7, (TemporalUnit) chronoUnit);
            j14 = j15 % 7;
        } else {
            if (j13 < 1) {
                chronoLocalDateB2 = chronoLocalDateB2.b(Math.subtractExact(j13, 7L) / 7, (TemporalUnit) chronoUnit);
                j14 = (j13 + 6) % 7;
            }
            return chronoLocalDateB2.i(new j$.time.temporal.l(DayOfWeek.w((int) j13).getValue(), 0));
        }
        j13 = j14 + 1;
        return chronoLocalDateB2.i(new j$.time.temporal.l(DayOfWeek.w((int) j13).getValue(), 0));
    }

    public static void w(Map map, ChronoField chronoField, long j11) {
        Long l9 = (Long) map.get(chronoField);
        if (l9 != null && l9.longValue() != j11) {
            throw new j$.time.c("Conflict found: " + chronoField + " " + l9 + " differs from " + chronoField + " " + j11);
        }
        map.put(chronoField, Long.valueOf(j11));
    }

    @Override // j$.time.chrono.Chronology, java.lang.Comparable
    /* JADX INFO: renamed from: D */
    public final int compareTo(Chronology chronology) {
        return q().compareTo(chronology.q());
    }

    @Override // j$.time.chrono.Chronology
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && compareTo((a) obj) == 0;
    }

    @Override // j$.time.chrono.Chronology
    public final int hashCode() {
        return getClass().hashCode() ^ q().hashCode();
    }

    @Override // j$.time.chrono.Chronology
    public final String toString() {
        return q();
    }
}
