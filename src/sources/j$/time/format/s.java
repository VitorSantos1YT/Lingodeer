package j$.time.format;

import j$.time.temporal.TemporalField;
import j$.time.temporal.WeekFields;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class s extends j {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final char f35095g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f35096h;

    @Override // j$.time.format.j, j$.time.format.e
    public final int B(v vVar, CharSequence charSequence, int i11) {
        return f(vVar.f35106a.f35012b).B(vVar, charSequence, i11);
    }

    @Override // j$.time.format.j, j$.time.format.e
    public final boolean w(x xVar, StringBuilder sb2) {
        return f(xVar.f35116b.f35012b).w(xVar, sb2);
    }

    public s(char c11, int i11, int i12, int i13, int i14) {
        super(null, i12, i13, d0.NOT_NEGATIVE, i14);
        this.f35095g = c11;
        this.f35096h = i11;
    }

    @Override // j$.time.format.j
    public final j d() {
        if (this.f35068e == -1) {
            return this;
        }
        return new s(this.f35095g, this.f35096h, this.f35065b, this.f35066c, -1);
    }

    @Override // j$.time.format.j
    public final j e(int i11) {
        return new s(this.f35095g, this.f35096h, this.f35065b, this.f35066c, this.f35068e + i11);
    }

    public final j f(Locale locale) {
        TemporalField temporalFieldWeekOfWeekBasedYear;
        WeekFields weekFieldsOf = WeekFields.of(locale);
        char c11 = this.f35095g;
        if (c11 == 'W') {
            temporalFieldWeekOfWeekBasedYear = weekFieldsOf.f35157d;
        } else {
            if (c11 == 'Y') {
                TemporalField temporalFieldWeekBasedYear = weekFieldsOf.weekBasedYear();
                int i11 = this.f35096h;
                if (i11 == 2) {
                    return new p(temporalFieldWeekBasedYear, 2, 2, p.f35088h, this.f35068e);
                }
                return new j(temporalFieldWeekBasedYear, i11, 19, i11 < 4 ? d0.NORMAL : d0.EXCEEDS_PAD, this.f35068e);
            }
            if (c11 == 'c' || c11 == 'e') {
                temporalFieldWeekOfWeekBasedYear = weekFieldsOf.f35156c;
            } else {
                if (c11 != 'w') {
                    throw new IllegalStateException("unreachable");
                }
                temporalFieldWeekOfWeekBasedYear = weekFieldsOf.weekOfWeekBasedYear();
            }
        }
        return new j(temporalFieldWeekOfWeekBasedYear, this.f35065b, this.f35066c, d0.NOT_NEGATIVE, this.f35068e);
    }

    @Override // j$.time.format.j
    public final String toString() {
        StringBuilder sb2 = new StringBuilder(30);
        sb2.append("Localized(");
        int i11 = this.f35096h;
        char c11 = this.f35095g;
        if (c11 != 'Y') {
            if (c11 == 'W') {
                sb2.append("WeekOfMonth");
            } else if (c11 == 'c' || c11 == 'e') {
                sb2.append("DayOfWeek");
            } else if (c11 == 'w') {
                sb2.append("WeekOfWeekBasedYear");
            }
            sb2.append(",");
            sb2.append(i11);
        } else if (i11 == 1) {
            sb2.append("WeekBasedYear");
        } else if (i11 == 2) {
            sb2.append("ReducedValue(WeekBasedYear,2,2,2000-01-01)");
        } else {
            sb2.append("WeekBasedYear,");
            sb2.append(i11);
            sb2.append(",19,");
            sb2.append(i11 < 4 ? d0.NORMAL : d0.EXCEEDS_PAD);
        }
        sb2.append(")");
        return sb2.toString();
    }
}
