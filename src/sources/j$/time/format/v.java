package j$.time.format;

import j$.time.ZoneId;
import j$.time.chrono.Chronology;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalField;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DateTimeFormatter f35106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f35107b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f35108c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f35109d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f35110e;

    public v(DateTimeFormatter dateTimeFormatter) {
        ArrayList arrayList = new ArrayList();
        this.f35109d = arrayList;
        this.f35110e = null;
        this.f35106a = dateTimeFormatter;
        arrayList.add(new b0());
    }

    public final Chronology d() {
        Chronology chronology = c().f35040c;
        if (chronology != null) {
            return chronology;
        }
        Chronology chronology2 = this.f35106a.f35015e;
        return chronology2 == null ? j$.time.chrono.p.f34989d : chronology2;
    }

    public final boolean a(char c11, char c12) {
        if (this.f35107b) {
            return c11 == c12;
        }
        return b(c11, c12);
    }

    public final boolean h(CharSequence charSequence, int i11, CharSequence charSequence2, int i12, int i13) {
        if (i11 + i13 <= charSequence.length() && i12 + i13 <= charSequence2.length()) {
            if (this.f35107b) {
                for (int i14 = 0; i14 < i13; i14++) {
                    if (charSequence.charAt(i11 + i14) == charSequence2.charAt(i12 + i14)) {
                    }
                }
                return true;
            }
            for (int i15 = 0; i15 < i13; i15++) {
                char cCharAt = charSequence.charAt(i11 + i15);
                char cCharAt2 = charSequence2.charAt(i12 + i15);
                if (cCharAt == cCharAt2 || Character.toUpperCase(cCharAt) == Character.toUpperCase(cCharAt2) || Character.toLowerCase(cCharAt) == Character.toLowerCase(cCharAt2)) {
                }
            }
            return true;
        }
        return false;
    }

    public static boolean b(char c11, char c12) {
        return c11 == c12 || Character.toUpperCase(c11) == Character.toUpperCase(c12) || Character.toLowerCase(c11) == Character.toLowerCase(c12);
    }

    public final b0 c() {
        ArrayList arrayList = this.f35109d;
        return (b0) arrayList.get(arrayList.size() - 1);
    }

    public final Long e(ChronoField chronoField) {
        return (Long) ((HashMap) c().f35038a).get(chronoField);
    }

    public final int g(TemporalField temporalField, long j11, int i11, int i12) {
        Objects.requireNonNull(temporalField, "field");
        Long l9 = (Long) ((HashMap) c().f35038a).put(temporalField, Long.valueOf(j11));
        return (l9 == null || l9.longValue() == j11) ? i12 : ~i11;
    }

    public final void f(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        c().f35039b = zoneId;
    }

    public final String toString() {
        return c().toString();
    }
}
