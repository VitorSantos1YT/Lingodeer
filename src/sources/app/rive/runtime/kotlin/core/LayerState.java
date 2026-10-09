package app.rive.runtime.kotlin.core;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class LayerState extends NativeObject {
    public static final int $stable = 0;

    public LayerState(long j11) {
        super(j11);
    }

    private final native boolean cppIsAnimationState(long j11);

    private final native boolean cppIsAnyState(long j11);

    private final native boolean cppIsBlendState(long j11);

    private final native boolean cppIsBlendState1D(long j11);

    private final native boolean cppIsBlendStateDirect(long j11);

    private final native boolean cppIsEntryState(long j11);

    private final native boolean cppIsExitState(long j11);

    public final boolean isAnimationState() {
        return cppIsAnimationState(getCppPointer());
    }

    public final boolean isAnyState() {
        return cppIsAnyState(getCppPointer());
    }

    public final boolean isBlendState() {
        return cppIsBlendState(getCppPointer());
    }

    public final boolean isBlendState1D() {
        return cppIsBlendState1D(getCppPointer());
    }

    public final boolean isBlendStateDirect() {
        return cppIsBlendStateDirect(getCppPointer());
    }

    public final boolean isEntryState() {
        return cppIsEntryState(getCppPointer());
    }

    public final boolean isExitState() {
        return cppIsExitState(getCppPointer());
    }

    public String toString() {
        return "LayerState";
    }
}
