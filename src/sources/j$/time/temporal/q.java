package j$.time.temporal;

import j$.time.chrono.ChronoLocalDate;
import j$.time.chrono.Chronology;
import j$.time.format.b0;
import j$.time.format.c0;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class q implements TemporalField {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final p f35187f = p.f(1, 7);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final p f35188g = p.g(0, 4, 6);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final p f35189h = p.g(0, 52, 54);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final p f35190i = p.g(1, 52, 53);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeekFields f35192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TemporalUnit f35193c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TemporalUnit f35194d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p f35195e;

    @Override // j$.time.temporal.TemporalField
    public final boolean isDateBased() {
        return true;
    }

    public final ChronoLocalDate e(Chronology chronology, int i11, int i12, int i13) {
        ChronoLocalDate chronoLocalDateR = chronology.R(i11, 1, 1);
        int iH = h(1, b(chronoLocalDateR));
        return chronoLocalDateR.b(((Math.min(i12, a(iH, chronoLocalDateR.V() + this.f35192b.f35155b) - 1) - 1) * 7) + (i13 - 1) + (-iH), (TemporalUnit) ChronoUnit.DAYS);
    }

    public q(String str, WeekFields weekFields, TemporalUnit temporalUnit, TemporalUnit temporalUnit2, p pVar) {
        this.f35191a = str;
        this.f35192b = weekFields;
        this.f35193c = temporalUnit;
        this.f35194d = temporalUnit2;
        this.f35195e = pVar;
    }

    @Override // j$.time.temporal.TemporalField
    public final long Q(TemporalAccessor temporalAccessor) {
        int iC;
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        TemporalUnit temporalUnit = this.f35194d;
        if (temporalUnit == chronoUnit) {
            iC = b(temporalAccessor);
        } else if (temporalUnit != ChronoUnit.MONTHS) {
            if (temporalUnit != ChronoUnit.YEARS) {
                if (temporalUnit == WeekFields.f35153h) {
                    iC = d(temporalAccessor);
                } else if (temporalUnit == ChronoUnit.FOREVER) {
                    iC = c(temporalAccessor);
                } else {
                    throw new IllegalStateException("unreachable, rangeUnit: " + temporalUnit + ", this: " + this);
                }
            } else {
                int iB = b(temporalAccessor);
                int i11 = temporalAccessor.get(ChronoField.DAY_OF_YEAR);
                iC = a(h(i11, iB), i11);
            }
        } else {
            int iB2 = b(temporalAccessor);
            int i12 = temporalAccessor.get(ChronoField.DAY_OF_MONTH);
            iC = a(h(i12, iB2), i12);
        }
        return iC;
    }

    public final int b(TemporalAccessor temporalAccessor) {
        return Math.floorMod(temporalAccessor.get(ChronoField.DAY_OF_WEEK) - this.f35192b.getFirstDayOfWeek().getValue(), 7) + 1;
    }

    public final int c(TemporalAccessor temporalAccessor) {
        int iB = b(temporalAccessor);
        int i11 = temporalAccessor.get(ChronoField.YEAR);
        ChronoField chronoField = ChronoField.DAY_OF_YEAR;
        int i12 = temporalAccessor.get(chronoField);
        int iH = h(i12, iB);
        int iA = a(iH, i12);
        if (iA == 0) {
            return i11 - 1;
        }
        return iA >= a(iH, ((int) temporalAccessor.k(chronoField).f35186d) + this.f35192b.f35155b) ? i11 + 1 : i11;
    }

    public final int d(TemporalAccessor temporalAccessor) {
        int iA;
        int iB = b(temporalAccessor);
        ChronoField chronoField = ChronoField.DAY_OF_YEAR;
        int i11 = temporalAccessor.get(chronoField);
        int iH = h(i11, iB);
        int iA2 = a(iH, i11);
        if (iA2 == 0) {
            return d(Chronology.r(temporalAccessor).I(temporalAccessor).c(i11, (TemporalUnit) ChronoUnit.DAYS));
        }
        return (iA2 <= 50 || iA2 < (iA = a(iH, ((int) temporalAccessor.k(chronoField).f35186d) + this.f35192b.f35155b))) ? iA2 : (iA2 - iA) + 1;
    }

    public final int h(int i11, int i12) {
        int iFloorMod = Math.floorMod(i11 - i12, 7);
        return iFloorMod + 1 > this.f35192b.f35155b ? 7 - iFloorMod : -iFloorMod;
    }

    public static int a(int i11, int i12) {
        return ((i12 - 1) + (i11 + 7)) / 7;
    }

    @Override // j$.time.temporal.TemporalField
    public final Temporal W(Temporal temporal, long j11) {
        int iA = this.f35195e.a(this, j11);
        int i11 = temporal.get(this);
        if (iA == i11) {
            return temporal;
        }
        if (this.f35194d != ChronoUnit.FOREVER) {
            return temporal.b(iA - i11, this.f35193c);
        }
        WeekFields weekFields = this.f35192b;
        return e(Chronology.r(temporal), (int) j11, temporal.get(weekFields.f35158e), temporal.get(weekFields.f35156c));
    }

    @Override // j$.time.temporal.TemporalField
    public final TemporalAccessor H(Map map, b0 b0Var, c0 c0Var) {
        ChronoLocalDate chronoLocalDateB;
        ChronoLocalDate chronoLocalDateB2;
        ChronoLocalDate chronoLocalDateB3;
        long jLongValue = ((Long) map.get(this)).longValue();
        int intExact = Math.toIntExact(jLongValue);
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        p pVar = this.f35195e;
        WeekFields weekFields = this.f35192b;
        TemporalUnit temporalUnit = this.f35194d;
        if (temporalUnit == chronoUnit) {
            long jFloorMod = Math.floorMod((pVar.a(this, jLongValue) - 1) + (weekFields.getFirstDayOfWeek().getValue() - 1), 7) + 1;
            map.remove(this);
            map.put(ChronoField.DAY_OF_WEEK, Long.valueOf(jFloorMod));
            return null;
        }
        ChronoField chronoField = ChronoField.DAY_OF_WEEK;
        if (!map.containsKey(chronoField)) {
            return null;
        }
        int iFloorMod = Math.floorMod(chronoField.f35149b.a(chronoField, ((Long) map.get(chronoField)).longValue()) - weekFields.getFirstDayOfWeek().getValue(), 7) + 1;
        Chronology chronologyR = Chronology.r(b0Var);
        ChronoField chronoField2 = ChronoField.YEAR;
        if (!map.containsKey(chronoField2)) {
            if ((temporalUnit != WeekFields.f35153h && temporalUnit != ChronoUnit.FOREVER) || !map.containsKey(weekFields.f35159f) || !map.containsKey(weekFields.f35158e)) {
                return null;
            }
            q qVar = weekFields.f35159f;
            int iA = qVar.f35195e.a(weekFields.f35159f, ((Long) map.get(qVar)).longValue());
            if (c0Var == c0.LENIENT) {
                chronoLocalDateB = e(chronologyR, iA, 1, iFloorMod).b(Math.subtractExact(((Long) map.get(weekFields.f35158e)).longValue(), 1L), (TemporalUnit) chronoUnit);
            } else {
                q qVar2 = weekFields.f35158e;
                ChronoLocalDate chronoLocalDateE = e(chronologyR, iA, qVar2.f35195e.a(weekFields.f35158e, ((Long) map.get(qVar2)).longValue()), iFloorMod);
                if (c0Var == c0.STRICT && c(chronoLocalDateE) != iA) {
                    throw new j$.time.c("Strict mode rejected resolved date as it is in a different week-based-year");
                }
                chronoLocalDateB = chronoLocalDateE;
            }
            map.remove(this);
            map.remove(weekFields.f35159f);
            map.remove(weekFields.f35158e);
            map.remove(chronoField);
            return chronoLocalDateB;
        }
        int iA2 = chronoField2.f35149b.a(chronoField2, ((Long) map.get(chronoField2)).longValue());
        ChronoUnit chronoUnit2 = ChronoUnit.MONTHS;
        if (temporalUnit == chronoUnit2) {
            ChronoField chronoField3 = ChronoField.MONTH_OF_YEAR;
            if (map.containsKey(chronoField3)) {
                long jLongValue2 = ((Long) map.get(chronoField3)).longValue();
                long j11 = intExact;
                if (c0Var == c0.LENIENT) {
                    ChronoLocalDate chronoLocalDateB4 = chronologyR.R(iA2, 1, 1).b(Math.subtractExact(jLongValue2, 1L), (TemporalUnit) chronoUnit2);
                    int iB = b(chronoLocalDateB4);
                    int i11 = chronoLocalDateB4.get(ChronoField.DAY_OF_MONTH);
                    chronoLocalDateB3 = chronoLocalDateB4.b(Math.addExact(Math.multiplyExact(Math.subtractExact(j11, a(h(i11, iB), i11)), 7), iFloorMod - b(chronoLocalDateB4)), (TemporalUnit) ChronoUnit.DAYS);
                } else {
                    ChronoLocalDate chronoLocalDateR = chronologyR.R(iA2, chronoField3.f35149b.a(chronoField3, jLongValue2), 1);
                    long jA = pVar.a(this, j11);
                    int iB2 = b(chronoLocalDateR);
                    int i12 = chronoLocalDateR.get(ChronoField.DAY_OF_MONTH);
                    ChronoLocalDate chronoLocalDateB5 = chronoLocalDateR.b((((int) (jA - ((long) a(h(i12, iB2), i12)))) * 7) + (iFloorMod - b(chronoLocalDateR)), (TemporalUnit) ChronoUnit.DAYS);
                    if (c0Var == c0.STRICT && chronoLocalDateB5.j(chronoField3) != jLongValue2) {
                        throw new j$.time.c("Strict mode rejected resolved date as it is in a different month");
                    }
                    chronoLocalDateB3 = chronoLocalDateB5;
                }
                map.remove(this);
                map.remove(chronoField2);
                map.remove(chronoField3);
                map.remove(chronoField);
                return chronoLocalDateB3;
            }
        }
        if (temporalUnit != ChronoUnit.YEARS) {
            return null;
        }
        long j12 = intExact;
        ChronoLocalDate chronoLocalDateR2 = chronologyR.R(iA2, 1, 1);
        if (c0Var == c0.LENIENT) {
            int iB3 = b(chronoLocalDateR2);
            int i13 = chronoLocalDateR2.get(ChronoField.DAY_OF_YEAR);
            chronoLocalDateB2 = chronoLocalDateR2.b(Math.addExact(Math.multiplyExact(Math.subtractExact(j12, a(h(i13, iB3), i13)), 7), iFloorMod - b(chronoLocalDateR2)), (TemporalUnit) ChronoUnit.DAYS);
        } else {
            long jA2 = pVar.a(this, j12);
            int iB4 = b(chronoLocalDateR2);
            int i14 = chronoLocalDateR2.get(ChronoField.DAY_OF_YEAR);
            ChronoLocalDate chronoLocalDateB6 = chronoLocalDateR2.b((((int) (jA2 - ((long) a(h(i14, iB4), i14)))) * 7) + (iFloorMod - b(chronoLocalDateR2)), (TemporalUnit) ChronoUnit.DAYS);
            if (c0Var == c0.STRICT && chronoLocalDateB6.j(chronoField2) != iA2) {
                throw new j$.time.c("Strict mode rejected resolved date as it is in a different year");
            }
            chronoLocalDateB2 = chronoLocalDateB6;
        }
        map.remove(this);
        map.remove(chronoField2);
        map.remove(chronoField);
        return chronoLocalDateB2;
    }

    @Override // j$.time.temporal.TemporalField
    public final p J() {
        return this.f35195e;
    }

    @Override // j$.time.temporal.TemporalField
    public final boolean w(TemporalAccessor temporalAccessor) {
        if (!temporalAccessor.h(ChronoField.DAY_OF_WEEK)) {
            return false;
        }
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        TemporalUnit temporalUnit = this.f35194d;
        if (temporalUnit == chronoUnit) {
            return true;
        }
        if (temporalUnit == ChronoUnit.MONTHS) {
            return temporalAccessor.h(ChronoField.DAY_OF_MONTH);
        }
        if (temporalUnit == ChronoUnit.YEARS) {
            return temporalAccessor.h(ChronoField.DAY_OF_YEAR);
        }
        if (temporalUnit == WeekFields.f35153h) {
            return temporalAccessor.h(ChronoField.DAY_OF_YEAR);
        }
        if (temporalUnit == ChronoUnit.FOREVER) {
            return temporalAccessor.h(ChronoField.YEAR);
        }
        return false;
    }

    @Override // j$.time.temporal.TemporalField
    public final p B(TemporalAccessor temporalAccessor) {
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        TemporalUnit temporalUnit = this.f35194d;
        if (temporalUnit == chronoUnit) {
            return this.f35195e;
        }
        if (temporalUnit == ChronoUnit.MONTHS) {
            return f(temporalAccessor, ChronoField.DAY_OF_MONTH);
        }
        if (temporalUnit == ChronoUnit.YEARS) {
            return f(temporalAccessor, ChronoField.DAY_OF_YEAR);
        }
        if (temporalUnit == WeekFields.f35153h) {
            return g(temporalAccessor);
        }
        if (temporalUnit == ChronoUnit.FOREVER) {
            return ChronoField.YEAR.f35149b;
        }
        throw new IllegalStateException("unreachable, rangeUnit: " + temporalUnit + ", this: " + this);
    }

    public final p f(TemporalAccessor temporalAccessor, ChronoField chronoField) {
        int iH = h(temporalAccessor.get(chronoField), b(temporalAccessor));
        p pVarK = temporalAccessor.k(chronoField);
        return p.f(a(iH, (int) pVarK.f35183a), a(iH, (int) pVarK.f35186d));
    }

    public final p g(TemporalAccessor temporalAccessor) {
        ChronoField chronoField = ChronoField.DAY_OF_YEAR;
        if (!temporalAccessor.h(chronoField)) {
            return f35189h;
        }
        int iB = b(temporalAccessor);
        int i11 = temporalAccessor.get(chronoField);
        int iH = h(i11, iB);
        int iA = a(iH, i11);
        if (iA != 0) {
            int i12 = (int) temporalAccessor.k(chronoField).f35186d;
            int iA2 = a(iH, this.f35192b.f35155b + i12);
            if (iA >= iA2) {
                return g(Chronology.r(temporalAccessor).I(temporalAccessor).b((i12 - i11) + 8, (TemporalUnit) ChronoUnit.DAYS));
            }
            return p.f(1L, iA2 - 1);
        }
        return g(Chronology.r(temporalAccessor).I(temporalAccessor).c(i11 + 7, (TemporalUnit) ChronoUnit.DAYS));
    }

    public final String toString() {
        return this.f35191a + "[" + this.f35192b.toString() + "]";
    }
}
