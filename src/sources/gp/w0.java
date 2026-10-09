package gp;

/* JADX INFO: loaded from: classes3.dex */
public final class w0 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f29531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f29532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ bh.e0 f29533c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public uz.j f29534d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f29535e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(bh.e0 e0Var, vy.d dVar) {
        super(dVar);
        this.f29533c = e0Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f29531a = obj;
        this.f29532b |= Integer.MIN_VALUE;
        return this.f29533c.emit(null, this);
    }
}
