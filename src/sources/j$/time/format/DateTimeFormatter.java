package j$.time.format;

import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.chrono.ChronoLocalDate;
import j$.time.chrono.ChronoLocalDateTime;
import j$.time.chrono.ChronoZonedDateTime;
import j$.time.chrono.Chronology;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalField;
import java.io.IOException;
import java.text.ParsePosition;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class DateTimeFormatter {
    public static final DateTimeFormatter BASIC_ISO_DATE;
    public static final DateTimeFormatter ISO_LOCAL_DATE;
    public static final DateTimeFormatter RFC_1123_DATE_TIME;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final DateTimeFormatter f35010f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f35011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Locale f35012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DecimalStyle f35013c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c0 f35014d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Chronology f35015e;

    public static DateTimeFormatter ofPattern(String str) {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.h(str);
        return dateTimeFormatterBuilder.r(Locale.getDefault(), c0.SMART, null);
    }

    public static DateTimeFormatter ofPattern(String str, Locale locale) {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.h(str);
        return dateTimeFormatterBuilder.r(locale, c0.SMART, null);
    }

    public static DateTimeFormatter ofLocalizedDate(FormatStyle formatStyle) {
        Objects.requireNonNull(formatStyle, "dateStyle");
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.c(new i(formatStyle));
        return dateTimeFormatterBuilder.q(c0.SMART, j$.time.chrono.p.f34989d);
    }

    static {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        ChronoField chronoField = ChronoField.YEAR;
        d0 d0Var = d0.EXCEEDS_PAD;
        dateTimeFormatterBuilder.n(chronoField, 4, 10, d0Var);
        dateTimeFormatterBuilder.d('-');
        ChronoField chronoField2 = ChronoField.MONTH_OF_YEAR;
        dateTimeFormatterBuilder.m(chronoField2, 2);
        dateTimeFormatterBuilder.d('-');
        ChronoField chronoField3 = ChronoField.DAY_OF_MONTH;
        dateTimeFormatterBuilder.m(chronoField3, 2);
        c0 c0Var = c0.STRICT;
        j$.time.chrono.p pVar = j$.time.chrono.p.f34989d;
        DateTimeFormatter dateTimeFormatterQ = dateTimeFormatterBuilder.q(c0Var, pVar);
        ISO_LOCAL_DATE = dateTimeFormatterQ;
        DateTimeFormatterBuilder dateTimeFormatterBuilder2 = new DateTimeFormatterBuilder();
        q qVar = q.INSENSITIVE;
        dateTimeFormatterBuilder2.c(qVar);
        dateTimeFormatterBuilder2.a(dateTimeFormatterQ);
        k kVar = k.f35070e;
        dateTimeFormatterBuilder2.c(kVar);
        dateTimeFormatterBuilder2.q(c0Var, pVar);
        DateTimeFormatterBuilder dateTimeFormatterBuilder3 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder3.c(qVar);
        dateTimeFormatterBuilder3.a(dateTimeFormatterQ);
        dateTimeFormatterBuilder3.p();
        dateTimeFormatterBuilder3.c(kVar);
        dateTimeFormatterBuilder3.q(c0Var, pVar);
        DateTimeFormatterBuilder dateTimeFormatterBuilder4 = new DateTimeFormatterBuilder();
        ChronoField chronoField4 = ChronoField.HOUR_OF_DAY;
        dateTimeFormatterBuilder4.m(chronoField4, 2);
        dateTimeFormatterBuilder4.d(':');
        ChronoField chronoField5 = ChronoField.MINUTE_OF_HOUR;
        dateTimeFormatterBuilder4.m(chronoField5, 2);
        dateTimeFormatterBuilder4.p();
        dateTimeFormatterBuilder4.d(':');
        ChronoField chronoField6 = ChronoField.SECOND_OF_MINUTE;
        dateTimeFormatterBuilder4.m(chronoField6, 2);
        dateTimeFormatterBuilder4.p();
        dateTimeFormatterBuilder4.b(ChronoField.NANO_OF_SECOND, 0, 9, true);
        DateTimeFormatter dateTimeFormatterQ2 = dateTimeFormatterBuilder4.q(c0Var, null);
        DateTimeFormatterBuilder dateTimeFormatterBuilder5 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder5.c(qVar);
        dateTimeFormatterBuilder5.a(dateTimeFormatterQ2);
        dateTimeFormatterBuilder5.c(kVar);
        dateTimeFormatterBuilder5.q(c0Var, null);
        DateTimeFormatterBuilder dateTimeFormatterBuilder6 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder6.c(qVar);
        dateTimeFormatterBuilder6.a(dateTimeFormatterQ2);
        dateTimeFormatterBuilder6.p();
        dateTimeFormatterBuilder6.c(kVar);
        dateTimeFormatterBuilder6.q(c0Var, null);
        DateTimeFormatterBuilder dateTimeFormatterBuilder7 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder7.c(qVar);
        dateTimeFormatterBuilder7.a(dateTimeFormatterQ);
        dateTimeFormatterBuilder7.d('T');
        dateTimeFormatterBuilder7.a(dateTimeFormatterQ2);
        DateTimeFormatter dateTimeFormatterQ3 = dateTimeFormatterBuilder7.q(c0Var, pVar);
        DateTimeFormatterBuilder dateTimeFormatterBuilder8 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder8.c(qVar);
        dateTimeFormatterBuilder8.a(dateTimeFormatterQ3);
        q qVar2 = q.LENIENT;
        dateTimeFormatterBuilder8.c(qVar2);
        dateTimeFormatterBuilder8.c(kVar);
        q qVar3 = q.STRICT;
        dateTimeFormatterBuilder8.c(qVar3);
        DateTimeFormatter dateTimeFormatterQ4 = dateTimeFormatterBuilder8.q(c0Var, pVar);
        DateTimeFormatterBuilder dateTimeFormatterBuilder9 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder9.a(dateTimeFormatterQ4);
        dateTimeFormatterBuilder9.p();
        dateTimeFormatterBuilder9.d('[');
        q qVar4 = q.SENSITIVE;
        dateTimeFormatterBuilder9.c(qVar4);
        j$.time.f fVar = DateTimeFormatterBuilder.f35016h;
        dateTimeFormatterBuilder9.c(new t(fVar, "ZoneRegionId()"));
        dateTimeFormatterBuilder9.d(']');
        dateTimeFormatterBuilder9.q(c0Var, pVar);
        DateTimeFormatterBuilder dateTimeFormatterBuilder10 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder10.a(dateTimeFormatterQ3);
        dateTimeFormatterBuilder10.p();
        dateTimeFormatterBuilder10.c(kVar);
        dateTimeFormatterBuilder10.p();
        dateTimeFormatterBuilder10.d('[');
        dateTimeFormatterBuilder10.c(qVar4);
        dateTimeFormatterBuilder10.c(new t(fVar, "ZoneRegionId()"));
        dateTimeFormatterBuilder10.d(']');
        dateTimeFormatterBuilder10.q(c0Var, pVar);
        DateTimeFormatterBuilder dateTimeFormatterBuilder11 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder11.c(qVar);
        dateTimeFormatterBuilder11.n(chronoField, 4, 10, d0Var);
        dateTimeFormatterBuilder11.d('-');
        dateTimeFormatterBuilder11.m(ChronoField.DAY_OF_YEAR, 3);
        dateTimeFormatterBuilder11.p();
        dateTimeFormatterBuilder11.c(kVar);
        dateTimeFormatterBuilder11.q(c0Var, pVar);
        DateTimeFormatterBuilder dateTimeFormatterBuilder12 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder12.c(qVar);
        dateTimeFormatterBuilder12.n(j$.time.temporal.h.f35167c, 4, 10, d0Var);
        dateTimeFormatterBuilder12.e("-W");
        dateTimeFormatterBuilder12.m(j$.time.temporal.h.f35166b, 2);
        dateTimeFormatterBuilder12.d('-');
        ChronoField chronoField7 = ChronoField.DAY_OF_WEEK;
        dateTimeFormatterBuilder12.m(chronoField7, 1);
        dateTimeFormatterBuilder12.p();
        dateTimeFormatterBuilder12.c(kVar);
        dateTimeFormatterBuilder12.q(c0Var, pVar);
        DateTimeFormatterBuilder dateTimeFormatterBuilder13 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder13.c(qVar);
        dateTimeFormatterBuilder13.c(new g());
        f35010f = dateTimeFormatterBuilder13.q(c0Var, null);
        DateTimeFormatterBuilder dateTimeFormatterBuilder14 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder14.c(qVar);
        dateTimeFormatterBuilder14.m(chronoField, 4);
        dateTimeFormatterBuilder14.m(chronoField2, 2);
        dateTimeFormatterBuilder14.m(chronoField3, 2);
        dateTimeFormatterBuilder14.p();
        dateTimeFormatterBuilder14.c(qVar2);
        dateTimeFormatterBuilder14.g("+HHMMss", "Z");
        dateTimeFormatterBuilder14.c(qVar3);
        BASIC_ISO_DATE = dateTimeFormatterBuilder14.q(c0Var, pVar);
        HashMap map = new HashMap();
        map.put(1L, "Mon");
        map.put(2L, "Tue");
        map.put(3L, "Wed");
        map.put(4L, "Thu");
        map.put(5L, "Fri");
        map.put(6L, "Sat");
        map.put(7L, "Sun");
        HashMap map2 = new HashMap();
        map2.put(1L, "Jan");
        map2.put(2L, "Feb");
        map2.put(3L, "Mar");
        map2.put(4L, "Apr");
        map2.put(5L, "May");
        map2.put(6L, "Jun");
        map2.put(7L, "Jul");
        map2.put(8L, "Aug");
        map2.put(9L, "Sep");
        map2.put(10L, "Oct");
        map2.put(11L, "Nov");
        map2.put(12L, "Dec");
        DateTimeFormatterBuilder dateTimeFormatterBuilder15 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder15.c(qVar);
        dateTimeFormatterBuilder15.c(qVar2);
        dateTimeFormatterBuilder15.p();
        dateTimeFormatterBuilder15.i(chronoField7, map);
        dateTimeFormatterBuilder15.e(", ");
        dateTimeFormatterBuilder15.o();
        dateTimeFormatterBuilder15.n(chronoField3, 1, 2, d0.NOT_NEGATIVE);
        dateTimeFormatterBuilder15.d(' ');
        dateTimeFormatterBuilder15.i(chronoField2, map2);
        dateTimeFormatterBuilder15.d(' ');
        dateTimeFormatterBuilder15.m(chronoField, 4);
        dateTimeFormatterBuilder15.d(' ');
        dateTimeFormatterBuilder15.m(chronoField4, 2);
        dateTimeFormatterBuilder15.d(':');
        dateTimeFormatterBuilder15.m(chronoField5, 2);
        dateTimeFormatterBuilder15.p();
        dateTimeFormatterBuilder15.d(':');
        dateTimeFormatterBuilder15.m(chronoField6, 2);
        dateTimeFormatterBuilder15.o();
        dateTimeFormatterBuilder15.d(' ');
        dateTimeFormatterBuilder15.g("+HHMM", "GMT");
        RFC_1123_DATE_TIME = dateTimeFormatterBuilder15.q(c0.SMART, pVar);
    }

    public DateTimeFormatter(d dVar, Locale locale, DecimalStyle decimalStyle, c0 c0Var, Chronology chronology) {
        Objects.requireNonNull(dVar, "printerParser");
        this.f35011a = dVar;
        Objects.requireNonNull(locale, "locale");
        this.f35012b = locale;
        Objects.requireNonNull(decimalStyle, "decimalStyle");
        this.f35013c = decimalStyle;
        Objects.requireNonNull(c0Var, "resolverStyle");
        this.f35014d = c0Var;
        this.f35015e = chronology;
    }

    public DateTimeFormatter withLocale(Locale locale) {
        if (this.f35012b.equals(locale)) {
            return this;
        }
        return new DateTimeFormatter(this.f35011a, locale, this.f35013c, this.f35014d, this.f35015e);
    }

    public DateTimeFormatter withDecimalStyle(DecimalStyle decimalStyle) {
        if (this.f35013c.equals(decimalStyle)) {
            return this;
        }
        return new DateTimeFormatter(this.f35011a, this.f35012b, decimalStyle, this.f35014d, this.f35015e);
    }

    public String format(TemporalAccessor temporalAccessor) {
        StringBuilder sb2 = new StringBuilder(32);
        d dVar = this.f35011a;
        Objects.requireNonNull(temporalAccessor, "temporal");
        try {
            dVar.w(new x(temporalAccessor, this), sb2);
            return sb2.toString();
        } catch (IOException e8) {
            throw new j$.time.c(e8.getMessage(), e8);
        }
    }

    public final Object a(CharSequence charSequence, j$.time.f fVar) {
        String string;
        Objects.requireNonNull(charSequence, "text");
        try {
            return b(charSequence).d(fVar);
        } catch (DateTimeParseException e8) {
            throw e8;
        } catch (RuntimeException e10) {
            if (charSequence.length() > 64) {
                string = charSequence.subSequence(0, 64).toString() + "...";
            } else {
                string = charSequence.toString();
            }
            DateTimeParseException dateTimeParseException = new DateTimeParseException("Text '" + string + "' could not be parsed: " + e10.getMessage(), e10);
            charSequence.toString();
            throw dateTimeParseException;
        }
    }

    /* JADX WARN: Code duplicated, block: B:127:0x0326  */
    /* JADX WARN: Code duplicated, block: B:129:0x0332  */
    /* JADX WARN: Code duplicated, block: B:130:0x035f  */
    /* JADX WARN: Code duplicated, block: B:163:0x029f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:165:0x02a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:167:0x0289 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:168:0x0289 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x0269  */
    /* JADX WARN: Code duplicated, block: B:96:0x028f  */
    public final b0 b(CharSequence charSequence) {
        String string;
        long j11;
        long j12;
        TemporalField temporalField;
        ChronoField chronoField;
        Map map;
        ChronoField chronoField2;
        TemporalField temporalField2;
        int i11 = 0;
        ParsePosition parsePosition = new ParsePosition(0);
        Objects.requireNonNull(charSequence, "text");
        v vVar = new v(this);
        int iB = this.f35011a.B(vVar, charSequence, parsePosition.getIndex());
        ZoneId zoneId = null;
        if (iB < 0) {
            parsePosition.setErrorIndex(~iB);
            vVar = null;
        } else {
            parsePosition.setIndex(iB);
        }
        if (vVar != null && parsePosition.getErrorIndex() < 0 && parsePosition.getIndex() >= charSequence.length()) {
            b0 b0VarC = vVar.c();
            b0VarC.f35040c = vVar.d();
            ZoneId zoneId2 = b0VarC.f35039b;
            if (zoneId2 != null) {
                zoneId = zoneId2;
            } else {
                vVar.f35106a.getClass();
            }
            b0VarC.f35039b = zoneId;
            b0VarC.f35042e = this.f35014d;
            b0VarC.q();
            b0VarC.w(b0VarC.f35040c.T(b0VarC.f35038a, b0VarC.f35042e));
            b0VarC.u();
            if (((HashMap) b0VarC.f35038a).size() > 0) {
                loop0: while (i11 < 50) {
                    Iterator it = ((HashMap) b0VarC.f35038a).entrySet().iterator();
                    do {
                        if (!it.hasNext()) {
                            break loop0;
                        }
                        temporalField2 = (TemporalField) ((Map.Entry) it.next()).getKey();
                        TemporalAccessor temporalAccessorH = temporalField2.H(b0VarC.f35038a, b0VarC, b0VarC.f35042e);
                        if (temporalAccessorH != null) {
                            if (temporalAccessorH instanceof ChronoZonedDateTime) {
                                ChronoZonedDateTime chronoZonedDateTime = (ChronoZonedDateTime) temporalAccessorH;
                                ZoneId zoneId3 = b0VarC.f35039b;
                                if (zoneId3 == null) {
                                    b0VarC.f35039b = chronoZonedDateTime.K();
                                } else if (!zoneId3.equals(chronoZonedDateTime.K())) {
                                    throw new j$.time.c("ChronoZonedDateTime must use the effective parsed zone: " + b0VarC.f35039b);
                                }
                                temporalAccessorH = chronoZonedDateTime.x();
                            }
                            if (temporalAccessorH instanceof ChronoLocalDateTime) {
                                ChronoLocalDateTime chronoLocalDateTime = (ChronoLocalDateTime) temporalAccessorH;
                                b0VarC.v(chronoLocalDateTime.toLocalTime(), j$.time.p.f35135d);
                                b0VarC.w(chronoLocalDateTime.l());
                                break;
                            }
                            if (temporalAccessorH instanceof ChronoLocalDate) {
                                b0VarC.w((ChronoLocalDate) temporalAccessorH);
                                break;
                            }
                            if (temporalAccessorH instanceof LocalTime) {
                                b0VarC.v((LocalTime) temporalAccessorH, j$.time.p.f35135d);
                                break;
                            }
                            throw new j$.time.c("Method resolve() can only return ChronoZonedDateTime, ChronoLocalDateTime, ChronoLocalDate or LocalTime");
                        }
                    } while (((HashMap) b0VarC.f35038a).containsKey(temporalField2));
                    i11++;
                }
                if (i11 == 50) {
                    throw new j$.time.c("One of the parsed fields has an incorrectly implemented resolve method");
                }
                if (i11 > 0) {
                    b0VarC.q();
                    b0VarC.w(b0VarC.f35040c.T(b0VarC.f35038a, b0VarC.f35042e));
                    b0VarC.u();
                }
            }
            if (b0VarC.f35044g == null) {
                Map map2 = b0VarC.f35038a;
                ChronoField chronoField3 = ChronoField.MILLI_OF_SECOND;
                if (((HashMap) map2).containsKey(chronoField3)) {
                    long jLongValue = ((Long) ((HashMap) b0VarC.f35038a).remove(chronoField3)).longValue();
                    Map map3 = b0VarC.f35038a;
                    ChronoField chronoField4 = ChronoField.MICRO_OF_SECOND;
                    if (((HashMap) map3).containsKey(chronoField4)) {
                        long jLongValue2 = (((Long) ((HashMap) b0VarC.f35038a).get(chronoField4)).longValue() % 1000) + (jLongValue * 1000);
                        b0VarC.z(chronoField3, chronoField4, Long.valueOf(jLongValue2));
                        ((HashMap) b0VarC.f35038a).remove(chronoField4);
                        ((HashMap) b0VarC.f35038a).put(ChronoField.NANO_OF_SECOND, Long.valueOf(jLongValue2 * 1000));
                    } else {
                        ((HashMap) b0VarC.f35038a).put(ChronoField.NANO_OF_SECOND, Long.valueOf(jLongValue * 1000000));
                    }
                } else {
                    Map map4 = b0VarC.f35038a;
                    ChronoField chronoField5 = ChronoField.MICRO_OF_SECOND;
                    if (((HashMap) map4).containsKey(chronoField5)) {
                        ((HashMap) b0VarC.f35038a).put(ChronoField.NANO_OF_SECOND, Long.valueOf(((Long) ((HashMap) b0VarC.f35038a).remove(chronoField5)).longValue() * 1000));
                    }
                }
                Map map5 = b0VarC.f35038a;
                ChronoField chronoField6 = ChronoField.HOUR_OF_DAY;
                Long l9 = (Long) ((HashMap) map5).get(chronoField6);
                if (l9 != null) {
                    Map map6 = b0VarC.f35038a;
                    ChronoField chronoField7 = ChronoField.MINUTE_OF_HOUR;
                    Long l11 = (Long) ((HashMap) map6).get(chronoField7);
                    Map map7 = b0VarC.f35038a;
                    ChronoField chronoField8 = ChronoField.SECOND_OF_MINUTE;
                    Long l12 = (Long) ((HashMap) map7).get(chronoField8);
                    Map map8 = b0VarC.f35038a;
                    ChronoField chronoField9 = ChronoField.NANO_OF_SECOND;
                    Long l13 = (Long) ((HashMap) map8).get(chronoField9);
                    if ((l11 != null || (l12 == null && l13 == null)) && (l11 == null || l12 != null || l13 == null)) {
                        j11 = 1000000;
                        j12 = 1000;
                        b0VarC.t(l9.longValue(), l11 != null ? l11.longValue() : 0L, l12 != null ? l12.longValue() : 0L, l13 != null ? l13.longValue() : 0L);
                        ((HashMap) b0VarC.f35038a).remove(chronoField6);
                        ((HashMap) b0VarC.f35038a).remove(chronoField7);
                        ((HashMap) b0VarC.f35038a).remove(chronoField8);
                        ((HashMap) b0VarC.f35038a).remove(chronoField9);
                    } else {
                        j11 = 1000000;
                        j12 = 1000;
                    }
                } else {
                    j11 = 1000000;
                    j12 = 1000;
                }
                if (b0VarC.f35042e != c0.LENIENT && ((HashMap) b0VarC.f35038a).size() > 0) {
                    for (Map.Entry entry : ((HashMap) b0VarC.f35038a).entrySet()) {
                        temporalField = (TemporalField) entry.getKey();
                        if (temporalField instanceof ChronoField) {
                            chronoField = (ChronoField) temporalField;
                            if (chronoField.a0()) {
                                chronoField.Z(((Long) entry.getValue()).longValue());
                            }
                        }
                    }
                }
            } else {
                j11 = 1000000;
                j12 = 1000;
                if (b0VarC.f35042e != c0.LENIENT) {
                    while (r1.hasNext()) {
                        temporalField = (TemporalField) entry.getKey();
                        if (temporalField instanceof ChronoField) {
                            chronoField = (ChronoField) temporalField;
                            if (chronoField.a0()) {
                                chronoField.Z(((Long) entry.getValue()).longValue());
                            }
                        }
                    }
                }
            }
            ChronoLocalDate chronoLocalDate = b0VarC.f35043f;
            if (chronoLocalDate != null) {
                b0VarC.p(chronoLocalDate);
            }
            LocalTime localTime = b0VarC.f35044g;
            if (localTime != null) {
                b0VarC.p(localTime);
                if (b0VarC.f35043f != null && ((HashMap) b0VarC.f35038a).size() > 0) {
                    b0VarC.p(b0VarC.f35043f.L(b0VarC.f35044g));
                }
            }
            if (b0VarC.f35043f != null && b0VarC.f35044g != null) {
                j$.time.p pVar = b0VarC.f35045h;
                pVar.getClass();
                j$.time.p pVar2 = j$.time.p.f35135d;
                if (pVar != pVar2) {
                    b0VarC.f35043f = b0VarC.f35043f.S(b0VarC.f35045h);
                    b0VarC.f35045h = pVar2;
                }
            }
            if (b0VarC.f35044g == null) {
                if (((HashMap) b0VarC.f35038a).containsKey(ChronoField.INSTANT_SECONDS)) {
                    map = b0VarC.f35038a;
                    chronoField2 = ChronoField.NANO_OF_SECOND;
                    if (((HashMap) map).containsKey(chronoField2)) {
                        long jLongValue3 = ((Long) ((HashMap) b0VarC.f35038a).get(chronoField2)).longValue();
                        ((HashMap) b0VarC.f35038a).put(ChronoField.MICRO_OF_SECOND, Long.valueOf(jLongValue3 / j12));
                        ((HashMap) b0VarC.f35038a).put(ChronoField.MILLI_OF_SECOND, Long.valueOf(jLongValue3 / j11));
                    } else {
                        ((HashMap) b0VarC.f35038a).put(chronoField2, 0L);
                        ((HashMap) b0VarC.f35038a).put(ChronoField.MICRO_OF_SECOND, 0L);
                        ((HashMap) b0VarC.f35038a).put(ChronoField.MILLI_OF_SECOND, 0L);
                    }
                } else if (((HashMap) b0VarC.f35038a).containsKey(ChronoField.SECOND_OF_DAY)) {
                    map = b0VarC.f35038a;
                    chronoField2 = ChronoField.NANO_OF_SECOND;
                    if (((HashMap) map).containsKey(chronoField2)) {
                        long jLongValue4 = ((Long) ((HashMap) b0VarC.f35038a).get(chronoField2)).longValue();
                        ((HashMap) b0VarC.f35038a).put(ChronoField.MICRO_OF_SECOND, Long.valueOf(jLongValue4 / j12));
                        ((HashMap) b0VarC.f35038a).put(ChronoField.MILLI_OF_SECOND, Long.valueOf(jLongValue4 / j11));
                    } else {
                        ((HashMap) b0VarC.f35038a).put(chronoField2, 0L);
                        ((HashMap) b0VarC.f35038a).put(ChronoField.MICRO_OF_SECOND, 0L);
                        ((HashMap) b0VarC.f35038a).put(ChronoField.MILLI_OF_SECOND, 0L);
                    }
                } else if (((HashMap) b0VarC.f35038a).containsKey(ChronoField.SECOND_OF_MINUTE)) {
                    map = b0VarC.f35038a;
                    chronoField2 = ChronoField.NANO_OF_SECOND;
                    if (((HashMap) map).containsKey(chronoField2)) {
                        long jLongValue5 = ((Long) ((HashMap) b0VarC.f35038a).get(chronoField2)).longValue();
                        ((HashMap) b0VarC.f35038a).put(ChronoField.MICRO_OF_SECOND, Long.valueOf(jLongValue5 / j12));
                        ((HashMap) b0VarC.f35038a).put(ChronoField.MILLI_OF_SECOND, Long.valueOf(jLongValue5 / j11));
                    } else {
                        ((HashMap) b0VarC.f35038a).put(chronoField2, 0L);
                        ((HashMap) b0VarC.f35038a).put(ChronoField.MICRO_OF_SECOND, 0L);
                        ((HashMap) b0VarC.f35038a).put(ChronoField.MILLI_OF_SECOND, 0L);
                    }
                }
            }
            if (b0VarC.f35043f != null && b0VarC.f35044g != null) {
                Long l14 = (Long) ((HashMap) b0VarC.f35038a).get(ChronoField.OFFSET_SECONDS);
                if (l14 != null) {
                    ((HashMap) b0VarC.f35038a).put(ChronoField.INSTANT_SECONDS, Long.valueOf(b0VarC.f35043f.L(b0VarC.f35044g).G(ZoneOffset.c0(l14.intValue())).Y()));
                    return b0VarC;
                }
                if (b0VarC.f35039b != null) {
                    ((HashMap) b0VarC.f35038a).put(ChronoField.INSTANT_SECONDS, Long.valueOf(b0VarC.f35043f.L(b0VarC.f35044g).G(b0VarC.f35039b).Y()));
                }
            }
            return b0VarC;
        }
        if (charSequence.length() > 64) {
            string = charSequence.subSequence(0, 64).toString() + "...";
        } else {
            string = charSequence.toString();
        }
        if (parsePosition.getErrorIndex() >= 0) {
            String str = "Text '" + string + "' could not be parsed at index " + parsePosition.getErrorIndex();
            parsePosition.getErrorIndex();
            throw new DateTimeParseException(str, charSequence);
        }
        String str2 = "Text '" + string + "' could not be parsed, unparsed text found at index " + parsePosition.getIndex();
        parsePosition.getIndex();
        throw new DateTimeParseException(str2, charSequence);
    }

    public final String toString() {
        String string = this.f35011a.toString();
        return string.startsWith("[") ? string : string.substring(1, string.length() - 1);
    }

    public final d c() {
        d dVar = this.f35011a;
        return !dVar.f35049b ? dVar : new d(dVar.f35048a, false);
    }
}
