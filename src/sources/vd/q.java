package vd;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final le.i f53937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f53938b;

    public q(le.i iVar, Executor executor) {
        this.f53937a = iVar;
        this.f53938b = executor;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q) {
            return this.f53937a.equals(((q) obj).f53937a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f53937a.hashCode();
    }
}
