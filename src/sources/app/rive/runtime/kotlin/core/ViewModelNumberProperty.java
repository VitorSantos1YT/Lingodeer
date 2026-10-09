package app.rive.runtime.kotlin.core;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewModelNumberProperty extends ViewModelProperty<Float> {
    public static final int $stable = 0;

    public ViewModelNumberProperty(long j11) {
        super(j11);
    }

    private final native float cppGetValue(long j11);

    private final native void cppSetValue(long j11, float f5);

    @Override // app.rive.runtime.kotlin.core.ViewModelProperty
    public /* bridge */ /* synthetic */ void nativeSetValue(Float f5) {
        nativeSetValue(f5.floatValue());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // app.rive.runtime.kotlin.core.ViewModelProperty
    public Float nativeGetValue() {
        return Float.valueOf(cppGetValue(getCppPointer()));
    }

    public void nativeSetValue(float f5) {
        cppSetValue(getCppPointer(), f5);
    }
}
