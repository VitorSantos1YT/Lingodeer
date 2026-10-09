package j$.time.temporal;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.lingodeer.data.model.AchievementLevelType;
import j$.time.DayOfWeek;
import j$.time.LocalDate;
import j$.time.chrono.Chronology;
import j$.time.format.b0;
import j$.time.format.c0;
import java.util.Map;

/* JADX WARN: Enum visitor error
java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.nodes.MethodNode.getBasicBlocks()" is null
	at jadx.core.dex.visitors.EnumVisitor.searchEnumSuperCtrInsn(EnumVisitor.java:495)
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:473)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes2.dex */
public abstract class f implements TemporalField {
    public static final f DAY_OF_QUARTER;
    public static final f QUARTER_OF_YEAR;
    public static final f WEEK_BASED_YEAR;
    public static final f WEEK_OF_WEEK_BASED_YEAR;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f35161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ f[] f35162b;

    @Override // j$.time.temporal.TemporalField
    public final boolean isDateBased() {
        return true;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f35162b.clone();
    }

    static {
        f fVar = new f() { // from class: j$.time.temporal.b
            @Override // j$.time.temporal.TemporalField
            public final p J() {
                return p.g(1L, 90L, 92L);
            }

            @Override // j$.time.temporal.TemporalField
            public final boolean w(TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.h(ChronoField.DAY_OF_YEAR) || !temporalAccessor.h(ChronoField.MONTH_OF_YEAR) || !temporalAccessor.h(ChronoField.YEAR)) {
                    return false;
                }
                f fVar2 = h.f35165a;
                return Chronology.r(temporalAccessor).equals(j$.time.chrono.p.f34989d);
            }

            @Override // j$.time.temporal.TemporalField
            public final p B(TemporalAccessor temporalAccessor) {
                if (!w(temporalAccessor)) {
                    throw new o("Unsupported field: DayOfQuarter");
                }
                long j11 = temporalAccessor.j(f.QUARTER_OF_YEAR);
                if (j11 == 1) {
                    return j$.time.chrono.p.f34989d.X(temporalAccessor.j(ChronoField.YEAR)) ? p.f(1L, 91L) : p.f(1L, 90L);
                }
                if (j11 == 2) {
                    return p.f(1L, 91L);
                }
                if (j11 == 3 || j11 == 4) {
                    return p.f(1L, 92L);
                }
                return J();
            }

            @Override // j$.time.temporal.TemporalField
            public final long Q(TemporalAccessor temporalAccessor) {
                if (!w(temporalAccessor)) {
                    throw new o("Unsupported field: DayOfQuarter");
                }
                return temporalAccessor.get(ChronoField.DAY_OF_YEAR) - f.f35161a[((temporalAccessor.get(ChronoField.MONTH_OF_YEAR) - 1) / 3) + (j$.time.chrono.p.f34989d.X(temporalAccessor.j(ChronoField.YEAR)) ? 4 : 0)];
            }

            @Override // j$.time.temporal.TemporalField
            public final Temporal W(Temporal temporal, long j11) {
                long jQ = Q(temporal);
                J().b(this, j11);
                ChronoField chronoField = ChronoField.DAY_OF_YEAR;
                return temporal.a(chronoField, (j11 - jQ) + temporal.j(chronoField));
            }

            @Override // j$.time.temporal.TemporalField
            public final TemporalAccessor H(Map map, b0 b0Var, c0 c0Var) {
                long jSubtractExact;
                LocalDate localDatePlusMonths;
                ChronoField chronoField = ChronoField.YEAR;
                Long l9 = (Long) map.get(chronoField);
                TemporalField temporalField = f.QUARTER_OF_YEAR;
                Long l11 = (Long) map.get(temporalField);
                if (l9 == null || l11 == null) {
                    return null;
                }
                int iA = chronoField.f35149b.a(chronoField, l9.longValue());
                long jLongValue = ((Long) map.get(f.DAY_OF_QUARTER)).longValue();
                f fVar2 = h.f35165a;
                if (!Chronology.r(b0Var).equals(j$.time.chrono.p.f34989d)) {
                    throw new j$.time.c("Resolve requires IsoChronology");
                }
                if (c0Var == c0.LENIENT) {
                    localDatePlusMonths = LocalDate.of(iA, 1, 1).plusMonths(Math.multiplyExact(Math.subtractExact(l11.longValue(), 1L), 3));
                    jSubtractExact = Math.subtractExact(jLongValue, 1L);
                } else {
                    LocalDate localDateOf = LocalDate.of(iA, ((temporalField.J().a(temporalField, l11.longValue()) - 1) * 3) + 1, 1);
                    if (jLongValue < 1 || jLongValue > 90) {
                        if (c0Var == c0.STRICT) {
                            B(localDateOf).b(this, jLongValue);
                        } else {
                            J().b(this, jLongValue);
                        }
                    }
                    jSubtractExact = jLongValue - 1;
                    localDatePlusMonths = localDateOf;
                }
                map.remove(this);
                map.remove(chronoField);
                map.remove(temporalField);
                return localDatePlusMonths.plusDays(jSubtractExact);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "DayOfQuarter";
            }
        };
        DAY_OF_QUARTER = fVar;
        f fVar2 = new f() { // from class: j$.time.temporal.c
            @Override // j$.time.temporal.TemporalField
            public final p J() {
                return p.f(1L, 4L);
            }

            @Override // j$.time.temporal.TemporalField
            public final boolean w(TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.h(ChronoField.MONTH_OF_YEAR)) {
                    return false;
                }
                f fVar3 = h.f35165a;
                return Chronology.r(temporalAccessor).equals(j$.time.chrono.p.f34989d);
            }

            @Override // j$.time.temporal.TemporalField
            public final long Q(TemporalAccessor temporalAccessor) {
                if (!w(temporalAccessor)) {
                    throw new o("Unsupported field: QuarterOfYear");
                }
                return (temporalAccessor.j(ChronoField.MONTH_OF_YEAR) + 2) / 3;
            }

            @Override // j$.time.temporal.TemporalField
            public final p B(TemporalAccessor temporalAccessor) {
                if (!w(temporalAccessor)) {
                    throw new o("Unsupported field: QuarterOfYear");
                }
                return J();
            }

            @Override // j$.time.temporal.TemporalField
            public final Temporal W(Temporal temporal, long j11) {
                long jQ = Q(temporal);
                J().b(this, j11);
                ChronoField chronoField = ChronoField.MONTH_OF_YEAR;
                return temporal.a(chronoField, ((j11 - jQ) * 3) + temporal.j(chronoField));
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "QuarterOfYear";
            }
        };
        QUARTER_OF_YEAR = fVar2;
        f fVar3 = new f() { // from class: j$.time.temporal.d
            @Override // j$.time.temporal.TemporalField
            public final p J() {
                return p.g(1L, 52L, 53L);
            }

            @Override // j$.time.temporal.TemporalField
            public final boolean w(TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.h(ChronoField.EPOCH_DAY)) {
                    return false;
                }
                f fVar4 = h.f35165a;
                return Chronology.r(temporalAccessor).equals(j$.time.chrono.p.f34989d);
            }

            @Override // j$.time.temporal.TemporalField
            public final p B(TemporalAccessor temporalAccessor) {
                if (w(temporalAccessor)) {
                    return f.c0(LocalDate.H(temporalAccessor));
                }
                throw new o("Unsupported field: WeekOfWeekBasedYear");
            }

            @Override // j$.time.temporal.TemporalField
            public final long Q(TemporalAccessor temporalAccessor) {
                if (!w(temporalAccessor)) {
                    throw new o("Unsupported field: WeekOfWeekBasedYear");
                }
                return f.Z(LocalDate.H(temporalAccessor));
            }

            @Override // j$.time.temporal.TemporalField
            public final Temporal W(Temporal temporal, long j11) {
                J().b(this, j11);
                return temporal.b(Math.subtractExact(j11, Q(temporal)), ChronoUnit.WEEKS);
            }

            @Override // j$.time.temporal.TemporalField
            public final TemporalAccessor H(Map map, b0 b0Var, c0 c0Var) {
                LocalDate localDateA;
                long j11;
                long j12;
                TemporalField temporalField = f.WEEK_BASED_YEAR;
                Long l9 = (Long) map.get(temporalField);
                ChronoField chronoField = ChronoField.DAY_OF_WEEK;
                Long l11 = (Long) map.get(chronoField);
                if (l9 == null || l11 == null) {
                    return null;
                }
                int iA = temporalField.J().a(temporalField, l9.longValue());
                long jLongValue = ((Long) map.get(f.WEEK_OF_WEEK_BASED_YEAR)).longValue();
                f fVar4 = h.f35165a;
                if (!Chronology.r(b0Var).equals(j$.time.chrono.p.f34989d)) {
                    throw new j$.time.c("Resolve requires IsoChronology");
                }
                LocalDate localDateOf = LocalDate.of(iA, 1, 4);
                if (c0Var == c0.LENIENT) {
                    long jLongValue2 = l11.longValue();
                    if (jLongValue2 > 7) {
                        long j13 = jLongValue2 - 1;
                        j11 = 1;
                        localDateOf = localDateOf.f0(j13 / 7);
                        j12 = j13 % 7;
                    } else {
                        j11 = 1;
                        if (jLongValue2 < 1) {
                            localDateOf = localDateOf.f0(Math.subtractExact(jLongValue2, 7L) / 7);
                            j12 = (jLongValue2 + 6) % 7;
                        }
                        localDateA = localDateOf.f0(Math.subtractExact(jLongValue, j11)).a(chronoField, jLongValue2);
                    }
                    jLongValue2 = j12 + j11;
                    localDateA = localDateOf.f0(Math.subtractExact(jLongValue, j11)).a(chronoField, jLongValue2);
                } else {
                    int iA2 = chronoField.f35149b.a(chronoField, l11.longValue());
                    if (jLongValue < 1 || jLongValue > 52) {
                        if (c0Var == c0.STRICT) {
                            f.c0(localDateOf).b(this, jLongValue);
                        } else {
                            J().b(this, jLongValue);
                        }
                    }
                    localDateA = localDateOf.f0(jLongValue - 1).a(chronoField, iA2);
                }
                map.remove(this);
                map.remove(temporalField);
                map.remove(chronoField);
                return localDateA;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekOfWeekBasedYear";
            }
        };
        WEEK_OF_WEEK_BASED_YEAR = fVar3;
        f fVar4 = new f() { // from class: j$.time.temporal.e
            @Override // j$.time.temporal.TemporalField
            public final p J() {
                return ChronoField.YEAR.f35149b;
            }

            @Override // j$.time.temporal.TemporalField
            public final boolean w(TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.h(ChronoField.EPOCH_DAY)) {
                    return false;
                }
                f fVar5 = h.f35165a;
                return Chronology.r(temporalAccessor).equals(j$.time.chrono.p.f34989d);
            }

            @Override // j$.time.temporal.TemporalField
            public final long Q(TemporalAccessor temporalAccessor) {
                if (w(temporalAccessor)) {
                    return f.a0(LocalDate.H(temporalAccessor));
                }
                throw new o("Unsupported field: WeekBasedYear");
            }

            @Override // j$.time.temporal.TemporalField
            public final p B(TemporalAccessor temporalAccessor) {
                if (!w(temporalAccessor)) {
                    throw new o("Unsupported field: WeekBasedYear");
                }
                return J();
            }

            @Override // j$.time.temporal.TemporalField
            public final Temporal W(Temporal temporal, long j11) {
                if (!w(temporal)) {
                    throw new o("Unsupported field: WeekBasedYear");
                }
                int iA = ChronoField.YEAR.f35149b.a(f.WEEK_BASED_YEAR, j11);
                LocalDate localDateH = LocalDate.H(temporal);
                ChronoField chronoField = ChronoField.DAY_OF_WEEK;
                int i11 = localDateH.get(chronoField);
                int iZ = f.Z(localDateH);
                if (iZ == 53 && f.b0(iA) == 52) {
                    iZ = 52;
                }
                LocalDate localDateOf = LocalDate.of(iA, 1, 4);
                return temporal.i(localDateOf.plusDays(((iZ - 1) * 7) + (i11 - localDateOf.get(chronoField))));
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekBasedYear";
            }
        };
        WEEK_BASED_YEAR = fVar4;
        f35162b = new f[]{fVar, fVar2, fVar3, fVar4};
        f35161a = new int[]{0, 90, 181, BaseQuickAdapter.HEADER_VIEW, 0, 91, 182, 274};
    }

    public static p c0(LocalDate localDate) {
        return p.f(1L, b0(a0(localDate)));
    }

    public static int b0(int i11) {
        LocalDate localDateOf = LocalDate.of(i11, 1, 1);
        if (localDateOf.getDayOfWeek() != DayOfWeek.THURSDAY) {
            return (localDateOf.getDayOfWeek() == DayOfWeek.WEDNESDAY && localDateOf.y()) ? 53 : 52;
        }
        return 53;
    }

    public static int Z(LocalDate localDate) {
        int iOrdinal = localDate.getDayOfWeek().ordinal();
        int iQ = localDate.Q() - 1;
        int i11 = (3 - iOrdinal) + iQ;
        int i12 = i11 - ((i11 / 7) * 7);
        int i13 = i12 - 3;
        if (i13 < -3) {
            i13 = i12 + 4;
        }
        if (iQ >= i13) {
            int i14 = ((iQ - i13) / 7) + 1;
            if (i14 != 53 || i13 == -3 || (i13 == -2 && localDate.y())) {
                return i14;
            }
            return 1;
        }
        if (localDate.Q() != 180) {
            localDate = LocalDate.d0(localDate.f34917a, AchievementLevelType.DAY_STREAK_LV_8);
        }
        return (int) c0(localDate.g0(-1L)).f35186d;
    }

    public static int a0(LocalDate localDate) {
        int year = localDate.getYear();
        int iQ = localDate.Q();
        if (iQ <= 3) {
            return iQ - localDate.getDayOfWeek().ordinal() < -2 ? year - 1 : year;
        }
        if (iQ >= 363) {
            return ((iQ - 363) - (localDate.y() ? 1 : 0)) - localDate.getDayOfWeek().ordinal() >= 0 ? year + 1 : year;
        }
        return year;
    }
}
