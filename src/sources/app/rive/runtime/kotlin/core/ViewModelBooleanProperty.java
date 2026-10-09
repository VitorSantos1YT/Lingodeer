package app.rive.runtime.kotlin.core;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewModelBooleanProperty extends ViewModelProperty<Boolean> {
    public static final int $stable = 0;

    public ViewModelBooleanProperty(long j11) {
        super(j11);
    }

    private final native boolean cppGetValue(long j11);

    private final native void cppSetValue(long j11, boolean z11);

    @Override // app.rive.runtime.kotlin.core.ViewModelProperty
    public /* bridge */ /* synthetic */ void nativeSetValue(Boolean bool) {
        nativeSetValue(bool.booleanValue());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // app.rive.runtime.kotlin.core.ViewModelProperty
    public Boolean nativeGetValue() {
        return Boolean.valueOf(cppGetValue(getCppPointer()));
    }

    public void nativeSetValue(boolean z11) {
        cppSetValue(getCppPointer(), z11);
    }
}
