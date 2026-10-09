package fr;

/* JADX INFO: loaded from: classes3.dex */
public final class q extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f27783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f27784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ bh.e0 f27785c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(bh.e0 e0Var, vy.d dVar) {
        super(dVar);
        this.f27785c = e0Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f27783a = obj;
        this.f27784b |= Integer.MIN_VALUE;
        return this.f27785c.emit(null, this);
    }
}
