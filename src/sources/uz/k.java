package uz;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f53326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f53327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ gp.r f53328c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public gp.r f53329d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public j f53330e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f53331f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f53332t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(gp.r rVar, vy.d dVar) {
        super(dVar);
        this.f53328c = rVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f53326a = obj;
        this.f53327b |= Integer.MIN_VALUE;
        return this.f53328c.collect(null, this);
    }
}
