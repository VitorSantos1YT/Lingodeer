package app.rive.runtime.kotlin.core;

import uz.g1;
import uz.i1;
import uz.p0;
import uz.r0;
import uz.x0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ViewModelProperty<T> extends NativeObject {
    public static final int $stable = 8;
    private final p0 _valueFlow;
    private final g1 valueFlow;

    public ViewModelProperty(long j11) {
        super(j11);
        i1 i1VarC = x0.c(nativeGetValue());
        this._valueFlow = i1VarC;
        this.valueFlow = new r0(i1VarC);
    }

    private final native boolean cppFlushChanges(long j11);

    public final native boolean cppHasChanged(long j11);

    public final native String cppName(long j11);

    public final String getName() {
        return cppName(getCppPointer());
    }

    public final T getValue() {
        return (T) ((i1) this._valueFlow).getValue();
    }

    public final g1 getValueFlow() {
        return this.valueFlow;
    }

    public final boolean isSubscribed$kotlin_release() {
        return ((Number) ((vz.a) this._valueFlow).i().getValue()).intValue() > 0;
    }

    public abstract T nativeGetValue();

    public abstract void nativeSetValue(T t6);

    public final void pollChanges$kotlin_release() {
        if (cppHasChanged(getCppPointer())) {
            ((i1) this._valueFlow).k(nativeGetValue());
            cppFlushChanges(getCppPointer());
        }
    }

    public final void setValue(T t6) {
        nativeSetValue(t6);
        ((i1) this._valueFlow).k(t6);
    }
}
