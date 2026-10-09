package fr;

/* JADX INFO: loaded from: classes3.dex */
public final class p extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f27767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f27768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ bh.e0 f27769c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(bh.e0 e0Var, vy.d dVar) {
        super(dVar);
        this.f27769c = e0Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f27767a = obj;
        this.f27768b |= Integer.MIN_VALUE;
        return this.f27769c.emit(null, this);
    }
}
