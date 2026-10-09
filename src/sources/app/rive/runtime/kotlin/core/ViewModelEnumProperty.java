package app.rive.runtime.kotlin.core;

import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewModelEnumProperty extends ViewModelProperty<String> {
    public static final int $stable = 0;

    public ViewModelEnumProperty(long j11) {
        super(j11);
    }

    private final native String cppGetValue(long j11);

    private final native void cppSetValue(long j11, String str);

    @Override // app.rive.runtime.kotlin.core.ViewModelProperty
    public String nativeGetValue() {
        return cppGetValue(getCppPointer());
    }

    @Override // app.rive.runtime.kotlin.core.ViewModelProperty
    public void nativeSetValue(String value) {
        m.f(value, "value");
        cppSetValue(getCppPointer(), value);
    }
}
