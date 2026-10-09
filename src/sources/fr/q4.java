package fr;

/* JADX INFO: loaded from: classes3.dex */
public final class q4 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f27800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f27801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ bh.e0 f27802c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q4(bh.e0 e0Var, vy.d dVar) {
        super(dVar);
        this.f27802c = e0Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f27800a = obj;
        this.f27801b |= Integer.MIN_VALUE;
        return this.f27802c.emit(null, this);
    }
}
