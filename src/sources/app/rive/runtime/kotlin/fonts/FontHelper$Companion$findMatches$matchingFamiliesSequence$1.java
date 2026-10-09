package app.rive.runtime.kotlin.fonts;

import fz.c;
import java.util.Map;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import oz.x;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class FontHelper$Companion$findMatches$matchingFamiliesSequence$1 extends n implements c {
    final /* synthetic */ String $familyName;
    final /* synthetic */ String $lang;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FontHelper$Companion$findMatches$matchingFamiliesSequence$1(String str, String str2) {
        super(1);
        this.$familyName = str;
        this.$lang = str2;
    }

    @Override // fz.c
    public final Boolean invoke(Map.Entry<String, Fonts.Family> entry) {
        m.f(entry, "<name for destructuring parameter 0>");
        Fonts.Family value = entry.getValue();
        boolean z11 = true;
        if ((this.$familyName != null && !x.l0(value.getName(), this.$familyName, true)) || (this.$lang != null && !m.a(value.getLang(), this.$lang))) {
            z11 = false;
        }
        return Boolean.valueOf(z11);
    }
}
