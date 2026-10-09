package j$.time;

import j$.time.chrono.Chronology;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalField;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class Month implements TemporalAccessor, j$.time.temporal.k {
    public static final Month APRIL;
    public static final Month AUGUST;
    public static final Month DECEMBER;
    public static final Month FEBRUARY;
    public static final Month JANUARY;
    public static final Month JULY;
    public static final Month JUNE;
    public static final Month MARCH;
    public static final Month MAY;
    public static final Month NOVEMBER;
    public static final Month OCTOBER;
    public static final Month SEPTEMBER;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Month[] f34931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ Month[] f34932b;

    public static Month valueOf(String str) {
        return (Month) Enum.valueOf(Month.class, str);
    }

    public static Month[] values() {
        return (Month[]) f34932b.clone();
    }

    static {
        Month month = new Month("JANUARY", 0);
        JANUARY = month;
        Month month2 = new Month("FEBRUARY", 1);
        FEBRUARY = month2;
        Month month3 = new Month("MARCH", 2);
        MARCH = month3;
        Month month4 = new Month("APRIL", 3);
        APRIL = month4;
        Month month5 = new Month("MAY", 4);
        MAY = month5;
        Month month6 = new Month("JUNE", 5);
        JUNE = month6;
        Month month7 = new Month("JULY", 6);
        JULY = month7;
        Month month8 = new Month("AUGUST", 7);
        AUGUST = month8;
        Month month9 = new Month("SEPTEMBER", 8);
        SEPTEMBER = month9;
        Month month10 = new Month("OCTOBER", 9);
        OCTOBER = month10;
        Month month11 = new Month("NOVEMBER", 10);
        NOVEMBER = month11;
        Month month12 = new Month("DECEMBER", 11);
        DECEMBER = month12;
        f34932b = new Month[]{month, month2, month3, month4, month5, month6, month7, month8, month9, month10, month11, month12};
        f34931a = values();
    }

    public static Month J(int i11) {
        if (i11 < 1 || i11 > 12) {
            throw new c("Invalid value for MonthOfYear: " + i11);
        }
        return f34931a[i11 - 1];
    }

    public int getValue() {
        return ordinal() + 1;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean h(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return temporalField == ChronoField.MONTH_OF_YEAR;
        }
        return temporalField != null && temporalField.w(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.p k(TemporalField temporalField) {
        if (temporalField == ChronoField.MONTH_OF_YEAR) {
            return temporalField.J();
        }
        return super.k(temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int get(TemporalField temporalField) {
        if (temporalField == ChronoField.MONTH_OF_YEAR) {
            return getValue();
        }
        return super.get(temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long j(TemporalField temporalField) {
        if (temporalField == ChronoField.MONTH_OF_YEAR) {
            return getValue();
        }
        if (temporalField instanceof ChronoField) {
            throw new j$.time.temporal.o(d.a("Unsupported field: ", temporalField));
        }
        return temporalField.Q(this);
    }

    public final int B(boolean z11) {
        int i11 = j.f35125a[ordinal()];
        if (i11 != 1) {
            return (i11 == 2 || i11 == 3 || i11 == 4 || i11 == 5) ? 30 : 31;
        }
        return z11 ? 29 : 28;
    }

    public final int H() {
        int i11 = j.f35125a[ordinal()];
        if (i11 != 1) {
            return (i11 == 2 || i11 == 3 || i11 == 4 || i11 == 5) ? 30 : 31;
        }
        return 29;
    }

    public final int w(boolean z11) {
        switch (j.f35125a[ordinal()]) {
            case 1:
                return 32;
            case 2:
                return (z11 ? 1 : 0) + 91;
            case 3:
                return (z11 ? 1 : 0) + 152;
            case 4:
                return (z11 ? 1 : 0) + 244;
            case 5:
                return (z11 ? 1 : 0) + 305;
            case 6:
                return 1;
            case 7:
                return (z11 ? 1 : 0) + 60;
            case 8:
                return (z11 ? 1 : 0) + 121;
            case 9:
                return (z11 ? 1 : 0) + 182;
            case 10:
                return (z11 ? 1 : 0) + 213;
            case 11:
                return (z11 ? 1 : 0) + 274;
            default:
                return (z11 ? 1 : 0) + 335;
        }
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object d(f fVar) {
        if (fVar == j$.time.temporal.n.f35177b) {
            return j$.time.chrono.p.f34989d;
        }
        if (fVar == j$.time.temporal.n.f35178c) {
            return ChronoUnit.MONTHS;
        }
        return super.d(fVar);
    }

    @Override // j$.time.temporal.k
    public final Temporal f(Temporal temporal) {
        if (!Chronology.r(temporal).equals(j$.time.chrono.p.f34989d)) {
            throw new c("Adjustment only supported on ISO date-time");
        }
        return temporal.a(ChronoField.MONTH_OF_YEAR, getValue());
    }
}
