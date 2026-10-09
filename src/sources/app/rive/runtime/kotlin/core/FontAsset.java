package app.rive.runtime.kotlin.core;

import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class FontAsset extends FileAsset {
    public static final int $stable = 0;

    public FontAsset(long j11, int i11) {
        super(j11, i11, null);
    }

    private final native long cppGetFont(long j11);

    private final native void cppSetFont(long j11, long j12);

    public final RiveFont getFont() {
        return new RiveFont(cppGetFont(getCppPointer()));
    }

    public final void setFont(RiveFont value) {
        m.f(value, "value");
        cppSetFont(getCppPointer(), value.getCppPointer());
    }
}
