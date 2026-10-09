package app.rive.runtime.kotlin.core;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewModelColorProperty extends ViewModelProperty<Integer> {
    public static final int $stable = 0;

    public ViewModelColorProperty(long j11) {
        super(j11);
    }

    private final native int cppGetValue(long j11);

    private final native void cppSetValue(long j11, int i11);

    @Override // app.rive.runtime.kotlin.core.ViewModelProperty
    public /* bridge */ /* synthetic */ void nativeSetValue(Integer num) {
        nativeSetValue(num.intValue());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // app.rive.runtime.kotlin.core.ViewModelProperty
    public Integer nativeGetValue() {
        return Integer.valueOf(cppGetValue(getCppPointer()));
    }

    public void nativeSetValue(int i11) {
        cppSetValue(getCppPointer(), i11);
    }
}
