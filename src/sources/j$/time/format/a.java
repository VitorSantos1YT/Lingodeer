package j$.time.format;

import j$.time.chrono.Chronology;
import j$.time.temporal.TemporalField;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends a0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z f35033d;

    public a(z zVar) {
        this.f35033d = zVar;
    }

    @Override // j$.time.format.a0
    public final String b(Chronology chronology, TemporalField temporalField, long j11, TextStyle textStyle, Locale locale) {
        return this.f35033d.a(j11, textStyle);
    }

    @Override // j$.time.format.a0
    public final String c(TemporalField temporalField, long j11, TextStyle textStyle, Locale locale) {
        return this.f35033d.a(j11, textStyle);
    }

    @Override // j$.time.format.a0
    public final Iterator d(Chronology chronology, TemporalField temporalField, TextStyle textStyle, Locale locale) {
        List list = (List) ((HashMap) this.f35033d.f35119b).get(textStyle);
        if (list != null) {
            return list.iterator();
        }
        return null;
    }

    @Override // j$.time.format.a0
    public final Iterator e(TemporalField temporalField, TextStyle textStyle, Locale locale) {
        List list = (List) ((HashMap) this.f35033d.f35119b).get(textStyle);
        if (list != null) {
            return list.iterator();
        }
        return null;
    }
}
