package yz;

import hh.p0;
import rz.e0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class k extends j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Runnable f58394c;

    public k(Runnable runnable, long j11, boolean z11) {
        super(j11, z11);
        this.f58394c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f58394c.run();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Task[");
        Runnable runnable = this.f58394c;
        sb2.append(runnable.getClass().getSimpleName());
        sb2.append('@');
        sb2.append(e0.r(runnable));
        sb2.append(", ");
        sb2.append(this.f58392a);
        sb2.append(", ");
        return p0.o(sb2, this.f58393b ? "Blocking" : "Non-blocking", ']');
    }
}
