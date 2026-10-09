package uz;

/* JADX INFO: loaded from: classes4.dex */
public final class v extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f53409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f53410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ bh.r f53411c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public bh.r f53412d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public j f53413e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Throwable f53414f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f53415t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(bh.r rVar, vy.d dVar) {
        super(dVar);
        this.f53411c = rVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f53409a = obj;
        this.f53410b |= Integer.MIN_VALUE;
        return this.f53411c.collect(null, this);
    }
}
