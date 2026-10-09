package gq;

import rz.g1;
import rz.z1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f29648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f29649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rz.t f29650c = rz.e0.b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final rz.t f29651d = rz.e0.b();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public z1 f29652e;

    public w(long j11, int i11) {
        this.f29648a = j11;
        this.f29649b = i11;
    }

    public final g1 a() {
        z1 z1Var = this.f29652e;
        if (z1Var != null) {
            return z1Var;
        }
        kotlin.jvm.internal.m.n("runnerJob");
        throw null;
    }
}
