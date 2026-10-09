package rz;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class h extends a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Thread f50909d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final y0 f50910e;

    public h(vy.i iVar, Thread thread, y0 y0Var) {
        super(iVar, true);
        this.f50909d = thread;
        this.f50910e = y0Var;
    }

    @Override // rz.q1
    public final void m(Object obj) {
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = this.f50909d;
        if (kotlin.jvm.internal.m.a(threadCurrentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
