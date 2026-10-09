package androidx.lifecycle;

import kotlin.jvm.internal.m;
import rz.o0;
import rz.y;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class PausingDispatcher extends y {
    public final DispatchQueue dispatchQueue = new DispatchQueue();

    @Override // rz.y
    public void dispatch(vy.i context, Runnable block) {
        m.f(context, "context");
        m.f(block, "block");
        this.dispatchQueue.dispatchAndEnqueue(context, block);
    }

    @Override // rz.y
    public boolean isDispatchNeeded(vy.i context) {
        m.f(context, "context");
        yz.f fVar = o0.f50940a;
        if (wz.m.f55536a.f51961d.isDispatchNeeded(context)) {
            return true;
        }
        return !this.dispatchQueue.canRun();
    }
}
