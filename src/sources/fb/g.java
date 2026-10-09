package fb;

import rz.o0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends rz.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f27086a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final yz.f f27087b = o0.f50940a;

    @Override // rz.y
    public final void dispatch(vy.i context, Runnable block) {
        kotlin.jvm.internal.m.f(context, "context");
        kotlin.jvm.internal.m.f(block, "block");
        f27087b.dispatch(context, block);
    }

    @Override // rz.y
    public final boolean isDispatchNeeded(vy.i context) {
        kotlin.jvm.internal.m.f(context, "context");
        f27087b.getClass();
        return !false;
    }
}
