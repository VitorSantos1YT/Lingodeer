package j$.time.temporal;

import j$.time.chrono.Chronology;
import j$.time.format.b0;
import j$.time.format.c0;
import java.util.Map;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'JULIAN_DAY' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes2.dex */
public final class i implements TemporalField {
    public static final i JULIAN_DAY;
    public static final i MODIFIED_JULIAN_DAY;
    public static final i RATA_DIE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ i[] f35169d;
    private static final long serialVersionUID = -7501623920830201812L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient String f35170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final transient p f35171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient long f35172c;

    @Override // j$.time.temporal.TemporalField
    public final boolean isDateBased() {
        return true;
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f35169d.clone();
    }

    static {
        ChronoUnit chronoUnit = ChronoUnit.DAYS;
        ChronoUnit chronoUnit2 = ChronoUnit.FOREVER;
        i iVar = new i("JULIAN_DAY", 0, "JulianDay", chronoUnit, chronoUnit2, 2440588L);
        JULIAN_DAY = iVar;
        i iVar2 = new i("MODIFIED_JULIAN_DAY", 1, "ModifiedJulianDay", chronoUnit, chronoUnit2, 40587L);
        MODIFIED_JULIAN_DAY = iVar2;
        i iVar3 = new i("RATA_DIE", 2, "RataDie", chronoUnit, chronoUnit2, 719163L);
        RATA_DIE = iVar3;
        f35169d = new i[]{iVar, iVar2, iVar3};
    }

    public i(String str, int i11, String str2, ChronoUnit chronoUnit, ChronoUnit chronoUnit2, long j11) {
        super(str, i11);
        this.f35170a = str2;
        this.f35171b = p.f((-365243219162L) + j11, 365241780471L + j11);
        this.f35172c = j11;
    }

    @Override // j$.time.temporal.TemporalField
    public final p J() {
        return this.f35171b;
    }

    @Override // j$.time.temporal.TemporalField
    public final Temporal W(Temporal temporal, long j11) {
        if (!this.f35171b.e(j11)) {
            throw new j$.time.c("Invalid value: " + this.f35170a + " " + j11);
        }
        return temporal.a(ChronoField.EPOCH_DAY, Math.subtractExact(j11, this.f35172c));
    }

    @Override // j$.time.temporal.TemporalField
    public final p B(TemporalAccessor temporalAccessor) {
        if (temporalAccessor.h(ChronoField.EPOCH_DAY)) {
            return this.f35171b;
        }
        throw new j$.time.c("Unsupported field: " + this);
    }

    @Override // j$.time.temporal.TemporalField
    public final boolean w(TemporalAccessor temporalAccessor) {
        return temporalAccessor.h(ChronoField.EPOCH_DAY);
    }

    @Override // j$.time.temporal.TemporalField
    public final long Q(TemporalAccessor temporalAccessor) {
        return temporalAccessor.j(ChronoField.EPOCH_DAY) + this.f35172c;
    }

    @Override // j$.time.temporal.TemporalField
    public final TemporalAccessor H(Map map, b0 b0Var, c0 c0Var) {
        long jLongValue = ((Long) map.remove(this)).longValue();
        Chronology chronologyR = Chronology.r(b0Var);
        c0 c0Var2 = c0.LENIENT;
        long j11 = this.f35172c;
        if (c0Var == c0Var2) {
            return chronologyR.p(Math.subtractExact(jLongValue, j11));
        }
        this.f35171b.b(this, jLongValue);
        return chronologyR.p(jLongValue - j11);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f35170a;
    }
}
