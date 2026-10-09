package lb;

import fb.l;
import fb.w;
import j9.r;
import kb.g;
import kotlin.jvm.internal.m;
import ob.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f39874b;

    static {
        m.e(l.c("NetworkNotRoamingCtrlr"), "tagWithPrefix(\"NetworkNotRoamingCtrlr\")");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(r tracker) {
        super(tracker);
        m.f(tracker, "tracker");
        this.f39874b = 7;
    }

    @Override // lb.d
    public final boolean c(p workSpec) {
        m.f(workSpec, "workSpec");
        return workSpec.f44857j.f27065a == w.NOT_ROAMING;
    }

    @Override // lb.b
    public final int d() {
        return this.f39874b;
    }

    @Override // lb.b
    public final boolean e(Object obj) {
        g value = (g) obj;
        m.f(value, "value");
        return (value.f38037a && value.f38040d) ? false : true;
    }
}
