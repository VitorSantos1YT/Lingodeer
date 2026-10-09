package fr;

/* JADX INFO: loaded from: classes3.dex */
public final class s0 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f27823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f27824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ bh.e0 f27825c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(bh.e0 e0Var, vy.d dVar) {
        super(dVar);
        this.f27825c = e0Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f27823a = obj;
        this.f27824b |= Integer.MIN_VALUE;
        return this.f27825c.emit(null, this);
    }
}
