package app.rive.runtime.kotlin.core;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class AnimationState extends LayerState {
    public static final int $stable = 0;

    public AnimationState(long j11) {
        super(j11);
    }

    private final native String cppName(long j11);

    public final String getName() {
        return cppName(getCppPointer());
    }

    @Override // app.rive.runtime.kotlin.core.LayerState
    public String toString() {
        return getName();
    }
}
