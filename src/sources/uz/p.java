package uz;

/* JADX INFO: loaded from: classes4.dex */
public final class p extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f53377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f53378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f53379c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f53380d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public j f53381e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar, vy.d dVar) {
        super(dVar);
        this.f53379c = qVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f53377a = obj;
        this.f53378b |= Integer.MIN_VALUE;
        return this.f53379c.collect(null, this);
    }
}
