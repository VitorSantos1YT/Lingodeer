package mw;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class n5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lw.j[] f42589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f42590b = new AtomicBoolean(false);

    static {
        new n5(new lw.j[0]);
    }

    public n5(lw.j[] jVarArr) {
        this.f42589a = jVarArr;
    }

    public final void a(long j11) {
        for (lw.j jVar : this.f42589a) {
            jVar.g(j11);
        }
    }
}
