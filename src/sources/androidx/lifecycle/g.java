package androidx.lifecycle;

import tz.t;
import uz.i1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements LifecycleEventObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2089b;

    public /* synthetic */ g(Object obj, int i11) {
        this.f2088a = i11;
        this.f2089b = obj;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        switch (this.f2088a) {
            case 0:
                LifecycleKt$eventFlow$1.invokeSuspend$lambda$0((t) this.f2089b, lifecycleOwner, event);
                break;
            default:
                Lifecycle._get_currentStateFlow_$lambda$0((i1) this.f2089b, lifecycleOwner, event);
                break;
        }
    }
}
