package app.rive.runtime.kotlin.fonts;

import fz.c;
import java.util.Map;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class FontHelper$Companion$findMatches$matchingFamiliesSequence$2 extends n implements c {
    public static final FontHelper$Companion$findMatches$matchingFamiliesSequence$2 INSTANCE = new FontHelper$Companion$findMatches$matchingFamiliesSequence$2();

    public FontHelper$Companion$findMatches$matchingFamiliesSequence$2() {
        super(1);
    }

    @Override // fz.c
    public final Fonts.Family invoke(Map.Entry<String, Fonts.Family> it) {
        m.f(it, "it");
        return it.getValue();
    }
}
