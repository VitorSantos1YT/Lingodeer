package fr;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f27688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f27689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ bh.e0 f27690c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(bh.e0 e0Var, vy.d dVar) {
        super(dVar);
        this.f27690c = e0Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f27688a = obj;
        this.f27689b |= Integer.MIN_VALUE;
        return this.f27690c.emit(null, this);
    }
}
