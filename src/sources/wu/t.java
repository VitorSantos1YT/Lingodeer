package wu;

import rt.t6;

/* JADX INFO: loaded from: classes4.dex */
public final class t extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f55451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f55452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t6 f55453c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public uz.j f55454d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f55455e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(t6 t6Var, vy.d dVar) {
        super(dVar);
        this.f55453c = t6Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f55451a = obj;
        this.f55452b |= Integer.MIN_VALUE;
        return this.f55453c.emit(null, this);
    }
}
