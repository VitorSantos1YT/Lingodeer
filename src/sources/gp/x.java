package gp;

/* JADX INFO: loaded from: classes3.dex */
public final class x extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f29536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f29537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ bh.q f29538c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public uz.j f29539d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f29540e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f29541f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(bh.q qVar, vy.d dVar) {
        super(dVar);
        this.f29538c = qVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f29536a = obj;
        this.f29537b |= Integer.MIN_VALUE;
        return this.f29538c.emit(null, this);
    }
}
