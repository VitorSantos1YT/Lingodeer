package j$.time.format;

import com.tbruyelle.rxpermissions3.BuildConfig;
import j$.time.chrono.Chronology;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes2.dex */
public final class i implements e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ConcurrentMap f35061b = new ConcurrentHashMap(16, 0.75f, 2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FormatStyle f35062a;

    @Override // j$.time.format.e
    public final boolean w(x xVar, StringBuilder sb2) {
        a(xVar.f35116b.f35012b, Chronology.r(xVar.f35115a)).c().w(xVar, sb2);
        return true;
    }

    public i(FormatStyle formatStyle) {
        this.f35062a = formatStyle;
    }

    @Override // j$.time.format.e
    public final int B(v vVar, CharSequence charSequence, int i11) {
        return a(vVar.f35106a.f35012b, vVar.d()).c().B(vVar, charSequence, i11);
    }

    public final DateTimeFormatter a(Locale locale, Chronology chronology) {
        String strQ = chronology.q();
        String string = locale.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(strQ);
        sb2.append("|");
        sb2.append(string);
        sb2.append("|");
        FormatStyle formatStyle = this.f35062a;
        sb2.append(formatStyle);
        sb2.append((Object) null);
        String string2 = sb2.toString();
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) f35061b;
        DateTimeFormatter dateTimeFormatter = (DateTimeFormatter) concurrentHashMap.get(string2);
        if (dateTimeFormatter != null) {
            return dateTimeFormatter;
        }
        String localizedDateTimePattern = DateTimeFormatterBuilder.getLocalizedDateTimePattern(formatStyle, null, chronology, locale);
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.h(localizedDateTimePattern);
        DateTimeFormatter dateTimeFormatterR = dateTimeFormatterBuilder.r(locale, c0.SMART, null);
        DateTimeFormatter dateTimeFormatter2 = (DateTimeFormatter) concurrentHashMap.putIfAbsent(string2, dateTimeFormatterR);
        return dateTimeFormatter2 != null ? dateTimeFormatter2 : dateTimeFormatterR;
    }

    public final String toString() {
        return "Localized(" + this.f35062a + "," + ((Object) BuildConfig.VERSION_NAME) + ")";
    }
}
