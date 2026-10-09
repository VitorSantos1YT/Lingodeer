package b0;

import l1.b3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements b3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j2 f3613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l1.k1 f3614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public s f3615c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f3616d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f3617e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f3618f;

    public /* synthetic */ n(j2 j2Var, Object obj, s sVar, int i11) {
        this(j2Var, obj, (i11 & 4) != 0 ? null : sVar, Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    public final Object b() {
        return this.f3613a.f3576b.invoke(this.f3615c);
    }

    @Override // l1.b3
    public final Object getValue() {
        return this.f3614b.getValue();
    }

    public final String toString() {
        return "AnimationState(value=" + this.f3614b.getValue() + ", velocity=" + b() + ", isRunning=" + this.f3618f + ", lastFrameTimeNanos=" + this.f3616d + ", finishedTimeNanos=" + this.f3617e + ')';
    }

    public n(j2 j2Var, Object obj, s sVar, long j11, long j12, boolean z11) {
        s sVarK;
        this.f3613a = j2Var;
        this.f3614b = l1.t.B(obj);
        if (sVar != null) {
            sVarK = e.k(sVar);
        } else {
            sVarK = (s) j2Var.f3575a.invoke(obj);
            sVarK.d();
        }
        this.f3615c = sVarK;
        this.f3616d = j11;
        this.f3617e = j12;
        this.f3618f = z11;
    }
}
