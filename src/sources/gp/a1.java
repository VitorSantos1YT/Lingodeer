package gp;

/* JADX INFO: loaded from: classes3.dex */
public final class a1 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f29334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f29335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ bh.e0 f29336c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public uz.j f29337d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f29338e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(bh.e0 e0Var, vy.d dVar) {
        super(dVar);
        this.f29336c = e0Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f29334a = obj;
        this.f29335b |= Integer.MIN_VALUE;
        return this.f29336c.emit(null, this);
    }
}
