package j$.time.format;

import com.tbruyelle.rxpermissions3.BuildConfig;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;
import java.lang.ref.SoftReference;
import java.text.DateFormatSymbols;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class u extends t {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Map f35101i = new ConcurrentHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextStyle f35102e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f35103f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map f35104g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Map f35105h;

    public u(TextStyle textStyle, boolean z11) {
        super(j$.time.temporal.n.f35180e, "ZoneText(" + textStyle + ")");
        this.f35104g = new HashMap();
        this.f35105h = new HashMap();
        Objects.requireNonNull(textStyle, "textStyle");
        this.f35102e = textStyle;
        this.f35103f = z11;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0079  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // j$.time.format.t, j$.time.format.e
    public final boolean w(x xVar, StringBuilder sb2) {
        boolean zG;
        String[] strArr;
        ZoneId zoneId = (ZoneId) xVar.b(j$.time.temporal.n.f35176a);
        if (zoneId == null) {
            return false;
        }
        String strQ = zoneId.q();
        if (!(zoneId instanceof ZoneOffset)) {
            TemporalAccessor temporalAccessor = xVar.f35115a;
            String str = null;
            Map concurrentHashMap = null;
            if (this.f35103f) {
                zG = 2;
            } else if (temporalAccessor.h(ChronoField.INSTANT_SECONDS)) {
                zG = zoneId.B().g(Instant.B(temporalAccessor));
            } else {
                ChronoField chronoField = ChronoField.EPOCH_DAY;
                if (temporalAccessor.h(chronoField)) {
                    ChronoField chronoField2 = ChronoField.NANO_OF_DAY;
                    if (temporalAccessor.h(chronoField2)) {
                        LocalDateTime localDateTimeL = LocalDate.ofEpochDay(temporalAccessor.j(chronoField)).L(LocalTime.W(temporalAccessor.j(chronoField2)));
                        Object objE = zoneId.B().e(localDateTimeL);
                        if ((objE instanceof j$.time.zone.b ? (j$.time.zone.b) objE : null) == null) {
                            zG = zoneId.B().g(localDateTimeL.G(zoneId).toInstant());
                        } else {
                            zG = 2;
                        }
                    } else {
                        zG = 2;
                    }
                } else {
                    zG = 2;
                }
            }
            Locale locale = xVar.f35116b.f35012b;
            TextStyle textStyle = TextStyle.NARROW;
            TextStyle textStyle2 = this.f35102e;
            if (textStyle2 != textStyle) {
                ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) f35101i;
                SoftReference softReference = (SoftReference) concurrentHashMap2.get(strQ);
                if (softReference == null || (concurrentHashMap = (Map) softReference.get()) == null || (strArr = (String[]) concurrentHashMap.get(locale)) == null) {
                    TimeZone timeZone = TimeZone.getTimeZone(strQ);
                    String[] strArr2 = {strQ, timeZone.getDisplayName(false, 1, locale), timeZone.getDisplayName(false, 0, locale), timeZone.getDisplayName(true, 1, locale), timeZone.getDisplayName(true, 0, locale), strQ, strQ};
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    concurrentHashMap.put(locale, strArr2);
                    concurrentHashMap2.put(strQ, new SoftReference(concurrentHashMap));
                    strArr = strArr2;
                }
                if (zG == 0) {
                    str = strArr[textStyle2.f35032a + 1];
                } else if (zG == 1) {
                    str = strArr[textStyle2.f35032a + 3];
                } else {
                    str = strArr[textStyle2.f35032a + 5];
                }
            }
            if (str != null) {
                strQ = str;
            }
        }
        sb2.append(strQ);
        return true;
    }

    @Override // j$.time.format.t
    public final n a(v vVar) {
        n nVar;
        if (this.f35102e == TextStyle.NARROW) {
            return super.a(vVar);
        }
        Locale locale = vVar.f35106a.f35012b;
        boolean z11 = vVar.f35107b;
        Set set = j$.time.zone.i.f35236d;
        int size = set.size();
        Map map = z11 ? this.f35104g : this.f35105h;
        Map.Entry entry = (Map.Entry) map.get(locale);
        if (entry != null && ((Integer) entry.getKey()).intValue() == size && (nVar = (n) ((SoftReference) entry.getValue()).get()) != null) {
            return nVar;
        }
        n nVar2 = vVar.f35107b ? new n(BuildConfig.VERSION_NAME, null, null) : new m(BuildConfig.VERSION_NAME, null, null);
        for (String[] strArr : DateFormatSymbols.getInstance(locale).getZoneStrings()) {
            String str = strArr[0];
            if (set.contains(str)) {
                nVar2.a(str, str);
                HashMap map2 = (HashMap) e0.f35054d;
                String str2 = (String) map2.get(str);
                if (str2 == null) {
                    HashMap map3 = (HashMap) e0.f35057g;
                    if (map3.containsKey(str)) {
                        str = (String) map3.get(str);
                        str2 = (String) map2.get(str);
                    }
                }
                if (str2 != null) {
                    Map map4 = (Map) ((HashMap) e0.f35056f).get(str2);
                    str = (map4 == null || !map4.containsKey(locale.getCountry())) ? (String) ((HashMap) e0.f35055e).get(str2) : (String) map4.get(locale.getCountry());
                }
                HashMap map5 = (HashMap) e0.f35057g;
                if (map5.containsKey(str)) {
                    str = (String) map5.get(str);
                }
                for (int i11 = this.f35102e == TextStyle.FULL ? 1 : 2; i11 < strArr.length; i11 += 2) {
                    nVar2.a(strArr[i11], str);
                }
            }
        }
        map.put(locale, new AbstractMap.SimpleImmutableEntry(Integer.valueOf(size), new SoftReference(nVar2)));
        return nVar2;
    }
}
