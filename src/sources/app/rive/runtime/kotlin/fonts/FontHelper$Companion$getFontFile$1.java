package app.rive.runtime.kotlin.fonts;

import fz.c;
import java.io.File;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import oz.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class FontHelper$Companion$getFontFile$1 extends n implements c {
    final /* synthetic */ Fonts.Font $font;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FontHelper$Companion$getFontFile$1(Fonts.Font font) {
        super(1);
        this.$font = font;
    }

    @Override // fz.c
    public final File invoke(String basePath) {
        m.f(basePath, "basePath");
        return new File(basePath, q.i1(this.$font.getName()).toString());
    }
}
