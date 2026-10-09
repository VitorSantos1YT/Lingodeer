package lw;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import mw.c5;
import mw.p2;
import mw.w2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f40380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m1 f40381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t1 f40382c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c5 f40383d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final w2 f40384e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final mw.n f40385f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p2 f40386g;

    public f1(Integer num, m1 m1Var, t1 t1Var, c5 c5Var, w2 w2Var, mw.n nVar, p2 p2Var) {
        this.f40380a = num.intValue();
        Preconditions.k(m1Var, "proxyDetector not set");
        this.f40381b = m1Var;
        this.f40382c = t1Var;
        this.f40383d = c5Var;
        this.f40384e = w2Var;
        this.f40385f = nVar;
        this.f40386g = p2Var;
    }

    public final String toString() {
        MoreObjects.ToStringHelper toStringHelperB = MoreObjects.b(this);
        toStringHelperB.a(this.f40380a, "defaultPort");
        toStringHelperB.c(this.f40381b, "proxyDetector");
        toStringHelperB.c(this.f40382c, "syncContext");
        toStringHelperB.c(this.f40383d, "serviceConfigParser");
        toStringHelperB.c(this.f40384e, "scheduledExecutorService");
        toStringHelperB.c(this.f40385f, "channelLogger");
        toStringHelperB.c(this.f40386g, "executor");
        toStringHelperB.c(null, "overrideAuthority");
        return toStringHelperB.toString();
    }
}
