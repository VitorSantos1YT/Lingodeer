package app.rive.runtime.kotlin.core;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class SMINumber extends SMIInput {
    public static final int $stable = 0;

    public SMINumber(long j11) {
        super(j11);
    }

    private final native void cppSetValue(long j11, float f5);

    private final native float cppValue(long j11);

    public final float getValue() {
        return cppValue(getCppPointer());
    }

    public final void setValue$kotlin_release(float f5) {
        cppSetValue(getCppPointer(), f5);
    }

    @Override // app.rive.runtime.kotlin.core.SMIInput
    public String toString() {
        return "SMINumber " + getName() + '\n';
    }
}
