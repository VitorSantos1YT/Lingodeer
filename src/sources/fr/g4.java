package fr;

/* JADX INFO: loaded from: classes3.dex */
public final class g4 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f27545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f27546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ bh.e0 f27547c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4(bh.e0 e0Var, vy.d dVar) {
        super(dVar);
        this.f27547c = e0Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f27545a = obj;
        this.f27546b |= Integer.MIN_VALUE;
        return this.f27547c.emit(null, this);
    }
}
