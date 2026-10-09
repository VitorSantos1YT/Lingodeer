package wu;

import rt.t6;

/* JADX INFO: loaded from: classes4.dex */
public final class j0 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f55405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f55406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t6 f55407c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public uz.j f55408d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f55409e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(t6 t6Var, vy.d dVar) {
        super(dVar);
        this.f55407c = t6Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f55405a = obj;
        this.f55406b |= Integer.MIN_VALUE;
        return this.f55407c.emit(null, this);
    }
}
