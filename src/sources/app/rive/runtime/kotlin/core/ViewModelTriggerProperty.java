package app.rive.runtime.kotlin.core;

import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewModelTriggerProperty extends ViewModelProperty<TriggerUnit> {
    public static final int $stable = 0;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class TriggerUnit {
        public static final int $stable = 0;
    }

    public ViewModelTriggerProperty(long j11) {
        super(j11);
    }

    private final native void cppTrigger(long j11);

    @Override // app.rive.runtime.kotlin.core.ViewModelProperty
    public void nativeSetValue(TriggerUnit value) {
        m.f(value, "value");
    }

    public final void trigger() {
        cppTrigger(getCppPointer());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // app.rive.runtime.kotlin.core.ViewModelProperty
    public TriggerUnit nativeGetValue() {
        return new TriggerUnit();
    }
}
