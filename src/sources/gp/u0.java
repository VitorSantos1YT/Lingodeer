package gp;

/* JADX INFO: loaded from: classes3.dex */
public final class u0 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f29510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f29511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ bh.e0 f29512c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public uz.j f29513d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f29514e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(bh.e0 e0Var, vy.d dVar) {
        super(dVar);
        this.f29512c = e0Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f29510a = obj;
        this.f29511b |= Integer.MIN_VALUE;
        return this.f29512c.emit(null, this);
    }
}
