package ot;

/* JADX INFO: loaded from: classes4.dex */
public final class t extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f45992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f45993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ gp.g1 f45994c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(gp.g1 g1Var, vy.d dVar) {
        super(dVar);
        this.f45994c = g1Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f45992a = obj;
        this.f45993b |= Integer.MIN_VALUE;
        return this.f45994c.emit(null, this);
    }
}
