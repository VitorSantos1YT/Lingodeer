package j$.time.format;

import com.lingodeer.data.model.AchievementLevelType;
import com.yalantis.ucrop.UCrop;
import j$.time.LocalDate;
import j$.time.chrono.Chronology;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalField;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class DateTimeFormatterBuilder {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final j$.time.f f35016h = new j$.time.f(2);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Map f35017i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public DateTimeFormatterBuilder f35018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DateTimeFormatterBuilder f35019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f35020c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f35021d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f35022e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public char f35023f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f35024g;

    static {
        HashMap map = new HashMap();
        f35017i = map;
        map.put('G', ChronoField.ERA);
        map.put('y', ChronoField.YEAR_OF_ERA);
        map.put('u', ChronoField.YEAR);
        j$.time.temporal.f fVar = j$.time.temporal.h.f35165a;
        map.put('Q', fVar);
        map.put('q', fVar);
        ChronoField chronoField = ChronoField.MONTH_OF_YEAR;
        map.put('M', chronoField);
        map.put('L', chronoField);
        map.put('D', ChronoField.DAY_OF_YEAR);
        map.put('d', ChronoField.DAY_OF_MONTH);
        map.put('F', ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH);
        ChronoField chronoField2 = ChronoField.DAY_OF_WEEK;
        map.put('E', chronoField2);
        map.put('c', chronoField2);
        map.put('e', chronoField2);
        map.put('a', ChronoField.AMPM_OF_DAY);
        map.put('H', ChronoField.HOUR_OF_DAY);
        map.put('k', ChronoField.CLOCK_HOUR_OF_DAY);
        map.put('K', ChronoField.HOUR_OF_AMPM);
        map.put('h', ChronoField.CLOCK_HOUR_OF_AMPM);
        map.put('m', ChronoField.MINUTE_OF_HOUR);
        map.put('s', ChronoField.SECOND_OF_MINUTE);
        ChronoField chronoField3 = ChronoField.NANO_OF_SECOND;
        map.put('S', chronoField3);
        map.put('A', ChronoField.MILLI_OF_DAY);
        map.put('n', chronoField3);
        map.put('N', ChronoField.NANO_OF_DAY);
        map.put('g', j$.time.temporal.j.f35173a);
    }

    public static String getLocalizedDateTimePattern(FormatStyle formatStyle, FormatStyle formatStyle2, Chronology chronology, Locale locale) {
        DateFormat dateTimeInstance;
        Objects.requireNonNull(locale, "locale");
        Objects.requireNonNull(chronology, "chrono");
        if (formatStyle == null && formatStyle2 == null) {
            throw new IllegalArgumentException("Either dateStyle or timeStyle must be non-null");
        }
        if (formatStyle2 == null) {
            dateTimeInstance = DateFormat.getDateInstance(formatStyle.ordinal(), locale);
        } else if (formatStyle == null) {
            dateTimeInstance = DateFormat.getTimeInstance(formatStyle2.ordinal(), locale);
        } else {
            dateTimeInstance = DateFormat.getDateTimeInstance(formatStyle.ordinal(), formatStyle2.ordinal(), locale);
        }
        if (dateTimeInstance instanceof SimpleDateFormat) {
            String pattern = ((SimpleDateFormat) dateTimeInstance).toPattern();
            if (pattern == null) {
                return null;
            }
            int i11 = 0;
            boolean z11 = pattern.indexOf(66) != -1;
            boolean z12 = pattern.indexOf(98) != -1;
            if (!z11 && !z12) {
                return pattern;
            }
            StringBuilder sb2 = new StringBuilder(pattern.length());
            char c11 = ' ';
            while (i11 < pattern.length()) {
                char cCharAt = pattern.charAt(i11);
                if (cCharAt != ' ') {
                    if (cCharAt != 'B' && cCharAt != 'b') {
                        sb2.append(cCharAt);
                    }
                } else if (i11 == 0 || (c11 != 'B' && c11 != 'b')) {
                    sb2.append(cCharAt);
                }
                i11++;
                c11 = cCharAt;
            }
            int length = sb2.length() - 1;
            if (length >= 0 && sb2.charAt(length) == ' ') {
                sb2.deleteCharAt(length);
            }
            return sb2.toString();
        }
        throw new UnsupportedOperationException("Can't determine pattern from " + dateTimeInstance);
    }

    public DateTimeFormatterBuilder() {
        this.f35018a = this;
        this.f35020c = new ArrayList();
        this.f35024g = -1;
        this.f35019b = null;
        this.f35021d = false;
    }

    public DateTimeFormatterBuilder(DateTimeFormatterBuilder dateTimeFormatterBuilder) {
        this.f35018a = this;
        this.f35020c = new ArrayList();
        this.f35024g = -1;
        this.f35019b = dateTimeFormatterBuilder;
        this.f35021d = true;
    }

    public final void l(TemporalField temporalField) {
        k(new j(temporalField, 1, 19, d0.NORMAL));
    }

    public final void m(TemporalField temporalField, int i11) {
        Objects.requireNonNull(temporalField, "field");
        if (i11 < 1 || i11 > 19) {
            throw new IllegalArgumentException("The width must be from 1 to 19 inclusive but was " + i11);
        }
        k(new j(temporalField, i11, i11, d0.NOT_NEGATIVE));
    }

    public final void n(TemporalField temporalField, int i11, int i12, d0 d0Var) {
        if (i11 == i12 && d0Var == d0.NOT_NEGATIVE) {
            m(temporalField, i12);
            return;
        }
        Objects.requireNonNull(temporalField, "field");
        Objects.requireNonNull(d0Var, "signStyle");
        if (i11 < 1 || i11 > 19) {
            throw new IllegalArgumentException("The minimum width must be from 1 to 19 inclusive but was " + i11);
        }
        if (i12 < 1 || i12 > 19) {
            throw new IllegalArgumentException("The maximum width must be from 1 to 19 inclusive but was " + i12);
        }
        if (i12 < i11) {
            throw new IllegalArgumentException("The maximum width must exceed or equal the minimum width but " + i12 + " < " + i11);
        }
        k(new j(temporalField, i11, i12, d0Var));
    }

    public final void k(j jVar) {
        j jVarD;
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.f35018a;
        int i11 = dateTimeFormatterBuilder.f35024g;
        if (i11 < 0) {
            dateTimeFormatterBuilder.f35024g = c(jVar);
            return;
        }
        j jVar2 = (j) ((ArrayList) dateTimeFormatterBuilder.f35020c).get(i11);
        int i12 = jVar.f35065b;
        int i13 = jVar.f35066c;
        if (i12 == i13 && jVar.f35067d == d0.NOT_NEGATIVE) {
            jVarD = jVar2.e(i13);
            c(jVar.d());
            this.f35018a.f35024g = i11;
        } else {
            jVarD = jVar2.d();
            this.f35018a.f35024g = c(jVar);
        }
        ((ArrayList) this.f35018a.f35020c).set(i11, jVarD);
    }

    public final void b(ChronoField chronoField, int i11, int i12, boolean z11) {
        if (i11 == i12 && !z11) {
            k(new f(chronoField, i11, i12, z11));
        } else {
            c(new f(chronoField, i11, i12, z11));
        }
    }

    public final void j(TemporalField temporalField, TextStyle textStyle) {
        Objects.requireNonNull(temporalField, "field");
        Objects.requireNonNull(textStyle, "textStyle");
        c(new r(temporalField, textStyle, a0.f35036c));
    }

    public final void i(ChronoField chronoField, Map map) {
        Objects.requireNonNull(chronoField, "field");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        TextStyle textStyle = TextStyle.FULL;
        c(new r(chronoField, textStyle, new a(new z(Collections.singletonMap(textStyle, linkedHashMap)))));
    }

    public final void g(String str, String str2) {
        c(new k(str, str2));
    }

    public final void f(TextStyle textStyle) {
        Objects.requireNonNull(textStyle, "style");
        if (textStyle != TextStyle.FULL && textStyle != TextStyle.SHORT) {
            throw new IllegalArgumentException("Style must be either full or short");
        }
        c(new h(textStyle, 0));
    }

    public final void d(char c11) {
        c(new c(c11));
    }

    public final void e(String str) {
        Objects.requireNonNull(str, "literal");
        if (str.isEmpty()) {
            return;
        }
        if (str.length() == 1) {
            c(new c(str.charAt(0)));
        } else {
            c(new h(str, 1));
        }
    }

    public final void a(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        c(dateTimeFormatter.c());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:108:0x01b6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:109:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:110:0x01bd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:111:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:148:0x0262  */
    /* JADX WARN: Code duplicated, block: B:249:0x0458  */
    /* JADX WARN: Code duplicated, block: B:251:0x0462  */
    /* JADX WARN: Code duplicated, block: B:252:0x0466  */
    /* JADX WARN: Code duplicated, block: B:284:0x01c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:297:0x0471 A[SYNTHETIC] */
    public final void h(String str) {
        String strSubstring;
        boolean z11;
        int i11;
        int i12;
        Objects.requireNonNull(str, "pattern");
        int i13 = 0;
        while (i13 < str.length()) {
            char cCharAt = str.charAt(i13);
            if ((cCharAt >= 'A' && cCharAt <= 'Z') || (cCharAt >= 'a' && cCharAt <= 'z')) {
                int i14 = i13 + 1;
                while (i14 < str.length() && str.charAt(i14) == cCharAt) {
                    i14++;
                }
                int i15 = i14 - i13;
                if (cCharAt == 'p') {
                    if (i14 >= str.length() || (((cCharAt = str.charAt(i14)) < 'A' || cCharAt > 'Z') && (cCharAt < 'a' || cCharAt > 'z'))) {
                        i11 = i14;
                        i12 = i15;
                        i15 = 0;
                    } else {
                        i11 = i14 + 1;
                        while (i11 < str.length() && str.charAt(i11) == cCharAt) {
                            i11++;
                        }
                        i12 = i11 - i14;
                    }
                    if (i15 == 0) {
                        throw new IllegalArgumentException("Pad letter 'p' must be followed by valid pad pattern: ".concat(str));
                    }
                    if (i15 < 1) {
                        throw new IllegalArgumentException("The pad width must be at least one but was " + i15);
                    }
                    DateTimeFormatterBuilder dateTimeFormatterBuilder = this.f35018a;
                    dateTimeFormatterBuilder.f35022e = i15;
                    dateTimeFormatterBuilder.f35023f = ' ';
                    dateTimeFormatterBuilder.f35024g = -1;
                    i15 = i12;
                    i14 = i11;
                }
                TemporalField temporalField = (TemporalField) ((HashMap) f35017i).get(Character.valueOf(cCharAt));
                if (temporalField != null) {
                    if (cCharAt == 'A') {
                        n(temporalField, i15, 19, d0.NOT_NEGATIVE);
                    } else {
                        if (cCharAt == 'Q') {
                            z11 = false;
                        } else if (cCharAt == 'S') {
                            b(ChronoField.NANO_OF_SECOND, i15, i15, false);
                        } else if (cCharAt == 'a') {
                            if (i15 != 1) {
                                throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                            }
                            j(temporalField, TextStyle.SHORT);
                        } else if (cCharAt == 'k') {
                            if (i15 == 1) {
                                l(temporalField);
                            } else {
                                if (i15 == 2) {
                                    throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                                }
                                m(temporalField, i15);
                            }
                        } else if (cCharAt == 'q') {
                            z11 = true;
                        } else if (cCharAt == 's') {
                            if (i15 == 1) {
                                l(temporalField);
                            } else {
                                if (i15 == 2) {
                                    throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                                }
                                m(temporalField, i15);
                            }
                        } else if (cCharAt == 'u' || cCharAt == 'y') {
                            if (i15 == 2) {
                                LocalDate localDate = p.f35088h;
                                Objects.requireNonNull(localDate, "baseDate");
                                k(new p(temporalField, 2, 2, localDate, 0));
                            } else if (i15 < 4) {
                                n(temporalField, i15, 19, d0.NORMAL);
                            } else {
                                n(temporalField, i15, 19, d0.EXCEEDS_PAD);
                            }
                        } else if (cCharAt == 'g') {
                            n(temporalField, i15, 19, d0.NORMAL);
                        } else if (cCharAt == 'h' || cCharAt == 'm') {
                            if (i15 == 1) {
                                l(temporalField);
                            } else {
                                if (i15 == 2) {
                                    throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                                }
                                m(temporalField, i15);
                            }
                        } else if (cCharAt != 'n') {
                            switch (cCharAt) {
                                case 'D':
                                    if (i15 == 1) {
                                        l(temporalField);
                                    } else {
                                        if (i15 != 2 && i15 != 3) {
                                            throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                                        }
                                        n(temporalField, i15, 3, d0.NOT_NEGATIVE);
                                    }
                                    break;
                                case UCrop.REQUEST_CROP /* 69 */:
                                    z11 = false;
                                    break;
                                case 'F':
                                    if (i15 != 1) {
                                        throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                                    }
                                    l(temporalField);
                                    break;
                                    break;
                                case 'G':
                                    if (i15 == 1 || i15 == 2 || i15 == 3) {
                                        j(temporalField, TextStyle.SHORT);
                                    } else if (i15 == 4) {
                                        j(temporalField, TextStyle.FULL);
                                    } else {
                                        if (i15 != 5) {
                                            throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                                        }
                                        j(temporalField, TextStyle.NARROW);
                                    }
                                    break;
                                default:
                                    switch (cCharAt) {
                                        case AchievementLevelType.DAY_STREAK_LV_6 /* 75 */:
                                            break;
                                        case 'L':
                                            z11 = true;
                                            break;
                                        case 'M':
                                            z11 = false;
                                            break;
                                        case 'N':
                                            n(temporalField, i15, 19, d0.NOT_NEGATIVE);
                                            break;
                                        default:
                                            switch (cCharAt) {
                                                case 'c':
                                                    if (i15 == 1) {
                                                        int i16 = i15;
                                                        k(new s(cCharAt, i16, i16, i16, 0));
                                                    } else {
                                                        if (i15 == 2) {
                                                            throw new IllegalArgumentException("Invalid pattern \"cc\"");
                                                        }
                                                        z11 = true;
                                                    }
                                                    break;
                                                case 'd':
                                                    break;
                                                case 'e':
                                                    z11 = false;
                                                    break;
                                                default:
                                                    if (i15 != 1) {
                                                        m(temporalField, i15);
                                                    } else {
                                                        l(temporalField);
                                                    }
                                                    break;
                                            }
                                            break;
                                    }
                                case 'H':
                                    if (i15 == 1) {
                                        l(temporalField);
                                    } else {
                                        if (i15 == 2) {
                                            throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                                        }
                                        m(temporalField, i15);
                                    }
                                    break;
                            }
                        } else {
                            n(temporalField, i15, 19, d0.NOT_NEGATIVE);
                        }
                        if (i15 == 1 || i15 == 2) {
                            if (cCharAt == 'e') {
                                int i17 = i15;
                                k(new s(cCharAt, i17, i17, i17, 0));
                            } else if (cCharAt == 'E') {
                                j(temporalField, TextStyle.SHORT);
                            } else if (i15 == 1) {
                                l(temporalField);
                            } else {
                                m(temporalField, 2);
                            }
                        } else if (i15 == 3) {
                            j(temporalField, z11 ? TextStyle.SHORT_STANDALONE : TextStyle.SHORT);
                        } else if (i15 == 4) {
                            j(temporalField, z11 ? TextStyle.FULL_STANDALONE : TextStyle.FULL);
                        } else {
                            if (i15 != 5) {
                                throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                            }
                            j(temporalField, z11 ? TextStyle.NARROW_STANDALONE : TextStyle.NARROW);
                        }
                    }
                } else if (cCharAt == 'z') {
                    if (i15 > 4) {
                        throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                    }
                    if (i15 == 4) {
                        c(new u(TextStyle.FULL, false));
                    } else {
                        c(new u(TextStyle.SHORT, false));
                    }
                } else if (cCharAt == 'V') {
                    if (i15 != 2) {
                        throw new IllegalArgumentException("Pattern letter count must be 2: " + cCharAt);
                    }
                    c(new t(j$.time.temporal.n.f35176a, "ZoneId()"));
                } else if (cCharAt != 'v') {
                    String str2 = "+0000";
                    if (cCharAt == 'Z') {
                        if (i15 < 4) {
                            g("+HHMM", "+0000");
                        } else if (i15 == 4) {
                            f(TextStyle.FULL);
                        } else {
                            if (i15 != 5) {
                                throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                            }
                            g("+HH:MM:ss", "Z");
                        }
                    } else if (cCharAt == 'O') {
                        if (i15 == 1) {
                            f(TextStyle.SHORT);
                        } else {
                            if (i15 != 4) {
                                throw new IllegalArgumentException("Pattern letter count must be 1 or 4: " + cCharAt);
                            }
                            f(TextStyle.FULL);
                        }
                    } else if (cCharAt == 'X') {
                        if (i15 > 5) {
                            throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                        }
                        g(k.f35069d[i15 + (i15 == 1 ? 0 : 1)], "Z");
                    } else if (cCharAt == 'x') {
                        if (i15 > 5) {
                            throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                        }
                        if (i15 == 1) {
                            str2 = "+00";
                        } else if (i15 % 2 != 0) {
                            str2 = "+00:00";
                        }
                        g(k.f35069d[i15 + (i15 == 1 ? 0 : 1)], str2);
                    } else if (cCharAt != 'W') {
                        int i18 = i15;
                        if (cCharAt == 'w') {
                            if (i18 > 2) {
                                throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                            }
                            k(new s(cCharAt, i18, i18, 2, 0));
                        } else {
                            if (cCharAt != 'Y') {
                                throw new IllegalArgumentException("Unknown pattern letter: " + cCharAt);
                            }
                            if (i18 == 2) {
                                k(new s(cCharAt, i18, i18, 2, 0));
                            } else {
                                k(new s(cCharAt, i18, i18, 19, 0));
                            }
                        }
                    } else {
                        if (i15 > 1) {
                            throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                        }
                        int i19 = i15;
                        k(new s(cCharAt, i19, i19, i19, 0));
                    }
                } else if (i15 == 1) {
                    c(new u(TextStyle.SHORT, true));
                } else {
                    if (i15 != 4) {
                        throw new IllegalArgumentException("Wrong number of  pattern letters: " + cCharAt);
                    }
                    c(new u(TextStyle.FULL, true));
                }
                i13 = i14 - 1;
            } else if (cCharAt == '\'') {
                int i21 = i13 + 1;
                int i22 = i21;
                while (i22 < str.length()) {
                    if (str.charAt(i22) == '\'') {
                        int i23 = i22 + 1;
                        if (i23 < str.length() && str.charAt(i23) == '\'') {
                            i22 = i23;
                        } else {
                            if (i22 < str.length()) {
                                throw new IllegalArgumentException("Pattern ends with an incomplete string literal: ".concat(str));
                            }
                            strSubstring = str.substring(i21, i22);
                            if (strSubstring.isEmpty()) {
                                d('\'');
                            } else {
                                e(strSubstring.replace("''", "'"));
                            }
                            i13 = i22;
                        }
                    }
                    i22++;
                }
                if (i22 < str.length()) {
                    throw new IllegalArgumentException("Pattern ends with an incomplete string literal: ".concat(str));
                }
                strSubstring = str.substring(i21, i22);
                if (strSubstring.isEmpty()) {
                    d('\'');
                } else {
                    e(strSubstring.replace("''", "'"));
                }
                i13 = i22;
            } else if (cCharAt == '[') {
                p();
            } else if (cCharAt == ']') {
                if (this.f35018a.f35019b == null) {
                    throw new IllegalArgumentException("Pattern invalid as it contains ] without previous [");
                }
                o();
            } else {
                if (cCharAt == '{' || cCharAt == '}' || cCharAt == '#') {
                    throw new IllegalArgumentException("Pattern includes reserved character: '" + cCharAt + "'");
                }
                d(cCharAt);
            }
            i13++;
        }
    }

    public final void p() {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.f35018a;
        dateTimeFormatterBuilder.f35024g = -1;
        this.f35018a = new DateTimeFormatterBuilder(dateTimeFormatterBuilder);
    }

    public final void o() {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.f35018a;
        if (dateTimeFormatterBuilder.f35019b == null) {
            throw new IllegalStateException("Cannot call optionalEnd() as there was no previous call to optionalStart()");
        }
        if (((ArrayList) dateTimeFormatterBuilder.f35020c).size() > 0) {
            DateTimeFormatterBuilder dateTimeFormatterBuilder2 = this.f35018a;
            d dVar = new d(dateTimeFormatterBuilder2.f35020c, dateTimeFormatterBuilder2.f35021d);
            this.f35018a = this.f35018a.f35019b;
            c(dVar);
            return;
        }
        this.f35018a = this.f35018a.f35019b;
    }

    public final int c(e eVar) {
        Objects.requireNonNull(eVar, "pp");
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.f35018a;
        int i11 = dateTimeFormatterBuilder.f35022e;
        if (i11 > 0) {
            l lVar = new l(eVar, i11, dateTimeFormatterBuilder.f35023f);
            dateTimeFormatterBuilder.f35022e = 0;
            dateTimeFormatterBuilder.f35023f = (char) 0;
            eVar = lVar;
        }
        ((ArrayList) dateTimeFormatterBuilder.f35020c).add(eVar);
        DateTimeFormatterBuilder dateTimeFormatterBuilder2 = this.f35018a;
        dateTimeFormatterBuilder2.f35024g = -1;
        return ((ArrayList) dateTimeFormatterBuilder2.f35020c).size() - 1;
    }

    public final DateTimeFormatter q(c0 c0Var, Chronology chronology) {
        return r(Locale.getDefault(), c0Var, chronology);
    }

    public final DateTimeFormatter r(Locale locale, c0 c0Var, Chronology chronology) {
        Objects.requireNonNull(locale, "locale");
        while (this.f35018a.f35019b != null) {
            o();
        }
        return new DateTimeFormatter(new d(this.f35020c, false), locale, DecimalStyle.f35025d, c0Var, chronology);
    }
}
