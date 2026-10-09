package app.rive.runtime.kotlin.core;

import kotlin.jvm.internal.m;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewModelImageProperty extends ViewModelProperty<b0> {
    public static final int $stable = 0;

    public ViewModelImageProperty(long j11) {
        super(j11);
    }

    private final native void cppSetValue(long j11, long j12);

    /* JADX INFO: renamed from: nativeGetValue, reason: avoid collision after fix types in other method */
    public void nativeGetValue2() {
    }

    @Override // app.rive.runtime.kotlin.core.ViewModelProperty
    public void nativeSetValue(b0 value) {
        m.f(value, "value");
    }

    public final void set(RiveRenderImage riveRenderImage) {
        cppSetValue(getCppPointer(), riveRenderImage != null ? riveRenderImage.getCppPointer() : 0L);
    }

    @Override // app.rive.runtime.kotlin.core.ViewModelProperty
    public /* bridge */ /* synthetic */ b0 nativeGetValue() {
        nativeGetValue2();
        return b0.f48488a;
    }
}
