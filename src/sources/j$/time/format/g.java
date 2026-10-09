package j$.time.format;

import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.LocalTime;
import j$.time.ZoneOffset;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class g implements e {
    @Override // j$.time.format.e
    public final boolean w(x xVar, StringBuilder sb2) {
        Long lA = xVar.a(ChronoField.INSTANT_SECONDS);
        TemporalAccessor temporalAccessor = xVar.f35115a;
        ChronoField chronoField = ChronoField.NANO_OF_SECOND;
        Long lValueOf = temporalAccessor.h(chronoField) ? Long.valueOf(temporalAccessor.j(chronoField)) : null;
        int i11 = 0;
        if (lA == null) {
            return false;
        }
        long jLongValue = lA.longValue();
        int iA = chronoField.f35149b.a(chronoField, lValueOf != null ? lValueOf.longValue() : 0L);
        if (jLongValue >= -62167219200L) {
            long j11 = jLongValue - 253402300800L;
            long jFloorDiv = Math.floorDiv(j11, 315569520000L) + 1;
            LocalDateTime localDateTimeQ = LocalDateTime.Q(Math.floorMod(j11, 315569520000L) - 62167219200L, 0, ZoneOffset.UTC);
            if (jFloorDiv > 0) {
                sb2.append('+');
                sb2.append(jFloorDiv);
            }
            sb2.append(localDateTimeQ);
            if (localDateTimeQ.f34923b.f34929c == 0) {
                sb2.append(":00");
            }
        } else {
            long j12 = jLongValue + 62167219200L;
            long j13 = j12 / 315569520000L;
            long j14 = j12 % 315569520000L;
            LocalDateTime localDateTimeQ2 = LocalDateTime.Q(j14 - 62167219200L, 0, ZoneOffset.UTC);
            int length = sb2.length();
            sb2.append(localDateTimeQ2);
            if (localDateTimeQ2.f34923b.f34929c == 0) {
                sb2.append(":00");
            }
            if (j13 < 0) {
                if (localDateTimeQ2.f34922a.getYear() == -10000) {
                    sb2.replace(length, length + 2, Long.toString(j13 - 1));
                } else if (j14 == 0) {
                    sb2.insert(length, j13);
                } else {
                    sb2.insert(length + 1, Math.abs(j13));
                }
            }
        }
        if (iA > 0) {
            sb2.append('.');
            int i12 = 100000000;
            while (true) {
                if (iA <= 0 && i11 % 3 == 0 && i11 >= -2) {
                    break;
                }
                int i13 = iA / i12;
                sb2.append((char) (i13 + 48));
                iA -= i13 * i12;
                i12 /= 10;
                i11++;
            }
        }
        sb2.append('Z');
        return true;
    }

    @Override // j$.time.format.e
    public final int B(v vVar, CharSequence charSequence, int i11) {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.a(DateTimeFormatter.ISO_LOCAL_DATE);
        dateTimeFormatterBuilder.d('T');
        ChronoField chronoField = ChronoField.HOUR_OF_DAY;
        dateTimeFormatterBuilder.m(chronoField, 2);
        dateTimeFormatterBuilder.d(':');
        ChronoField chronoField2 = ChronoField.MINUTE_OF_HOUR;
        dateTimeFormatterBuilder.m(chronoField2, 2);
        dateTimeFormatterBuilder.d(':');
        ChronoField chronoField3 = ChronoField.SECOND_OF_MINUTE;
        dateTimeFormatterBuilder.m(chronoField3, 2);
        ChronoField chronoField4 = ChronoField.NANO_OF_SECOND;
        int i12 = 1;
        dateTimeFormatterBuilder.b(chronoField4, 0, 9, true);
        dateTimeFormatterBuilder.d('Z');
        d dVarC = dateTimeFormatterBuilder.r(Locale.getDefault(), c0.SMART, null).c();
        v vVar2 = new v(vVar.f35106a);
        vVar2.f35107b = vVar.f35107b;
        vVar2.f35108c = vVar.f35108c;
        int iB = dVarC.B(vVar2, charSequence, i11);
        if (iB < 0) {
            return iB;
        }
        long jLongValue = vVar2.e(ChronoField.YEAR).longValue();
        int iIntValue = vVar2.e(ChronoField.MONTH_OF_YEAR).intValue();
        int iIntValue2 = vVar2.e(ChronoField.DAY_OF_MONTH).intValue();
        int iIntValue3 = vVar2.e(chronoField).intValue();
        int iIntValue4 = vVar2.e(chronoField2).intValue();
        Long lE = vVar2.e(chronoField3);
        Long lE2 = vVar2.e(chronoField4);
        int iIntValue5 = lE != null ? lE.intValue() : 0;
        int iIntValue6 = lE2 != null ? lE2.intValue() : 0;
        if (iIntValue3 == 24 && iIntValue4 == 0 && iIntValue5 == 0 && iIntValue6 == 0) {
            iIntValue3 = 0;
        } else if (iIntValue3 == 23 && iIntValue4 == 59 && iIntValue5 == 60) {
            vVar.c().f35041d = true;
            i12 = 0;
            iIntValue5 = 59;
        } else {
            i12 = 0;
        }
        int i13 = ((int) jLongValue) % 10000;
        try {
            LocalDateTime localDateTime = LocalDateTime.f34920c;
            LocalDate localDateOf = LocalDate.of(i13, iIntValue, iIntValue2);
            LocalTime localTimeQ = LocalTime.Q(iIntValue3, iIntValue4, iIntValue5, 0);
            return vVar.g(chronoField4, iIntValue6, i11, vVar.g(ChronoField.INSTANT_SECONDS, new LocalDateTime(localDateOf, localTimeQ).b0(localDateOf.plusDays(i12), localTimeQ).toEpochSecond(ZoneOffset.UTC) + Math.multiplyExact(jLongValue / 10000, 315569520000L), i11, iB));
        } catch (RuntimeException unused) {
            return ~i11;
        }
    }

    public final String toString() {
        return "Instant()";
    }
}
