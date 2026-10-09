package f;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import bt.y2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 implements LifecycleEventObserver, b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lifecycle f26123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f26124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c0 f26125c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d0 f26126d;

    public b0(d0 d0Var, Lifecycle lifecycle, x onBackPressedCallback) {
        kotlin.jvm.internal.m.f(onBackPressedCallback, "onBackPressedCallback");
        this.f26126d = d0Var;
        this.f26123a = lifecycle;
        this.f26124b = onBackPressedCallback;
        lifecycle.addObserver(this);
    }

    @Override // f.b
    public final void cancel() {
        this.f26123a.removeObserver(this);
        this.f26124b.f26173b.remove(this);
        c0 c0Var = this.f26125c;
        if (c0Var != null) {
            c0Var.cancel();
        }
        this.f26125c = null;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
        kotlin.jvm.internal.m.f(source, "source");
        kotlin.jvm.internal.m.f(event, "event");
        if (event != Lifecycle.Event.ON_START) {
            if (event != Lifecycle.Event.ON_STOP) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    cancel();
                    return;
                }
                return;
            } else {
                c0 c0Var = this.f26125c;
                if (c0Var != null) {
                    c0Var.cancel();
                    return;
                }
                return;
            }
        }
        d0 d0Var = this.f26126d;
        d0Var.getClass();
        x onBackPressedCallback = this.f26124b;
        kotlin.jvm.internal.m.f(onBackPressedCallback, "onBackPressedCallback");
        d0Var.f26134b.addLast(onBackPressedCallback);
        c0 c0Var2 = new c0(d0Var, onBackPressedCallback);
        onBackPressedCallback.f26173b.add(c0Var2);
        d0Var.e();
        onBackPressedCallback.f26174c = new y2(0, d0Var, d0.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 7);
        this.f26125c = c0Var2;
    }
}
