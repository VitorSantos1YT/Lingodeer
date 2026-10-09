package app.rive.runtime.kotlin.core;

import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class RiveTextValueRun extends NativeObject {
    public static final int $stable = 0;

    public RiveTextValueRun(long j11) {
        super(j11);
    }

    private final native void cppSetText(long j11, String str);

    private final native String cppText(long j11);

    public final String getText() {
        return cppText(getCppPointer());
    }

    public final void setText(String name) {
        m.f(name, "name");
        cppSetText(getCppPointer(), name);
    }

    public String toString() {
        return "TextValueRun: " + getText() + '\n';
    }
}
