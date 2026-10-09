package app.rive.runtime.kotlin.core;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class SMIBoolean extends SMIInput {
    public static final int $stable = 0;

    public SMIBoolean(long j11) {
        super(j11);
    }

    private final native void cppSetValue(long j11, boolean z11);

    private final native boolean cppValue(long j11);

    public final boolean getValue() {
        return cppValue(getCppPointer());
    }

    public final void setValue$kotlin_release(boolean z11) {
        cppSetValue(getCppPointer(), z11);
    }

    @Override // app.rive.runtime.kotlin.core.SMIInput
    public String toString() {
        return "SMIBoolean " + getName() + '\n';
    }
}
