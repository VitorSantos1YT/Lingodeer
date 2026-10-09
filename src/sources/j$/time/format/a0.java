package j$.time.format;

import com.tbruyelle.rxpermissions3.BuildConfig;
import j$.time.chrono.Chronology;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalField;
import java.text.DateFormatSymbols;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes2.dex */
public class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ConcurrentMap f35034a = new ConcurrentHashMap(16, 0.75f, 2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final y f35035b = new y();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a0 f35036c = new a0();

    public String c(TemporalField temporalField, long j11, TextStyle textStyle, Locale locale) {
        Object objA = a(temporalField, locale);
        if (objA instanceof z) {
            return ((z) objA).a(j11, textStyle);
        }
        return null;
    }

    public String b(Chronology chronology, TemporalField temporalField, long j11, TextStyle textStyle, Locale locale) {
        if (chronology == j$.time.chrono.p.f34989d || !(temporalField instanceof ChronoField)) {
            return c(temporalField, j11, textStyle, locale);
        }
        return null;
    }

    public Iterator e(TemporalField temporalField, TextStyle textStyle, Locale locale) {
        List list;
        Object objA = a(temporalField, locale);
        if (!(objA instanceof z) || (list = (List) ((HashMap) ((z) objA).f35119b).get(textStyle)) == null) {
            return null;
        }
        return list.iterator();
    }

    public Iterator d(Chronology chronology, TemporalField temporalField, TextStyle textStyle, Locale locale) {
        if (chronology == j$.time.chrono.p.f34989d || !(temporalField instanceof ChronoField)) {
            return e(temporalField, textStyle, locale);
        }
        return null;
    }

    public static Object a(TemporalField temporalField, Locale locale) {
        Object zVar;
        String strSubstring;
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry(temporalField, locale);
        Object obj = ((ConcurrentHashMap) f35034a).get(simpleImmutableEntry);
        if (obj != null) {
            return obj;
        }
        HashMap map = new HashMap();
        if (temporalField == ChronoField.ERA) {
            DateFormatSymbols dateFormatSymbols = DateFormatSymbols.getInstance(locale);
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            String[] eras = dateFormatSymbols.getEras();
            for (int i11 = 0; i11 < eras.length; i11++) {
                if (!eras[i11].isEmpty()) {
                    long j11 = i11;
                    map2.put(Long.valueOf(j11), eras[i11]);
                    Long lValueOf = Long.valueOf(j11);
                    String str = eras[i11];
                    map3.put(lValueOf, str.substring(0, Character.charCount(str.codePointAt(0))));
                }
            }
            if (!map2.isEmpty()) {
                map.put(TextStyle.FULL, map2);
                map.put(TextStyle.SHORT, map2);
                map.put(TextStyle.NARROW, map3);
            }
            zVar = new z(map);
        } else if (temporalField == ChronoField.MONTH_OF_YEAR) {
            int length = DateFormatSymbols.getInstance(locale).getMonths().length;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            for (long j12 = 1; j12 <= length; j12++) {
                String strB = j$.time.b.b(j12, "LLLL", locale);
                linkedHashMap.put(Long.valueOf(j12), strB);
                linkedHashMap2.put(Long.valueOf(j12), strB.substring(0, Character.charCount(strB.codePointAt(0))));
                linkedHashMap3.put(Long.valueOf(j12), j$.time.b.b(j12, "LLL", locale));
            }
            if (length > 0) {
                map.put(TextStyle.FULL_STANDALONE, linkedHashMap);
                map.put(TextStyle.NARROW_STANDALONE, linkedHashMap2);
                map.put(TextStyle.SHORT_STANDALONE, linkedHashMap3);
                map.put(TextStyle.FULL, linkedHashMap);
                map.put(TextStyle.NARROW, linkedHashMap2);
                map.put(TextStyle.SHORT, linkedHashMap3);
            }
            zVar = new z(map);
        } else if (temporalField == ChronoField.DAY_OF_WEEK) {
            int length2 = DateFormatSymbols.getInstance(locale).getWeekdays().length;
            LinkedHashMap linkedHashMap4 = new LinkedHashMap();
            LinkedHashMap linkedHashMap5 = new LinkedHashMap();
            LinkedHashMap linkedHashMap6 = new LinkedHashMap();
            boolean z11 = locale == Locale.SIMPLIFIED_CHINESE || locale == Locale.TRADITIONAL_CHINESE;
            for (long j13 = 1; j13 <= length2; j13++) {
                String strA = j$.time.b.a(j13, "cccc", locale);
                linkedHashMap4.put(Long.valueOf(j13), strA);
                Long lValueOf2 = Long.valueOf(j13);
                if (!z11) {
                    strSubstring = strA.substring(0, Character.charCount(strA.codePointAt(0)));
                } else {
                    strSubstring = new StringBuilder().appendCodePoint(strA.codePointBefore(strA.length())).toString();
                }
                linkedHashMap5.put(lValueOf2, strSubstring);
                linkedHashMap6.put(Long.valueOf(j13), j$.time.b.a(j13, "ccc", locale));
            }
            if (length2 > 0) {
                map.put(TextStyle.FULL_STANDALONE, linkedHashMap4);
                map.put(TextStyle.NARROW_STANDALONE, linkedHashMap5);
                map.put(TextStyle.SHORT_STANDALONE, linkedHashMap6);
                map.put(TextStyle.FULL, linkedHashMap4);
                map.put(TextStyle.NARROW, linkedHashMap5);
                map.put(TextStyle.SHORT, linkedHashMap6);
            }
            zVar = new z(map);
        } else if (temporalField == ChronoField.AMPM_OF_DAY) {
            DateFormatSymbols dateFormatSymbols2 = DateFormatSymbols.getInstance(locale);
            HashMap map4 = new HashMap();
            HashMap map5 = new HashMap();
            String[] amPmStrings = dateFormatSymbols2.getAmPmStrings();
            for (int i12 = 0; i12 < amPmStrings.length; i12++) {
                if (!amPmStrings[i12].isEmpty()) {
                    long j14 = i12;
                    map4.put(Long.valueOf(j14), amPmStrings[i12]);
                    Long lValueOf3 = Long.valueOf(j14);
                    String str2 = amPmStrings[i12];
                    map5.put(lValueOf3, str2.substring(0, Character.charCount(str2.codePointAt(0))));
                }
            }
            if (!map4.isEmpty()) {
                map.put(TextStyle.FULL, map4);
                map.put(TextStyle.SHORT, map4);
                map.put(TextStyle.NARROW, map5);
            }
            zVar = new z(map);
        } else {
            zVar = BuildConfig.VERSION_NAME;
        }
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) f35034a;
        concurrentHashMap.putIfAbsent(simpleImmutableEntry, zVar);
        return concurrentHashMap.get(simpleImmutableEntry);
    }
}
