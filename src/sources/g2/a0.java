package g2;

import android.graphics.ColorSpace;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a0 {
    public static final ColorSpace a(h2.c cVar) {
        if (kotlin.jvm.internal.m.a(cVar, h2.e.f31480v)) {
            return ColorSpace.get(ColorSpace.Named.BT2020_HLG);
        }
        if (kotlin.jvm.internal.m.a(cVar, h2.e.f31481w)) {
            return ColorSpace.get(ColorSpace.Named.BT2020_PQ);
        }
        return null;
    }
}
