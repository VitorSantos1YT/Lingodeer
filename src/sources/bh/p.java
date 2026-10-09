package bh;

/* JADX INFO: loaded from: classes3.dex */
public final class p extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f4323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f4325c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar, vy.d dVar) {
        super(dVar);
        this.f4325c = qVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f4323a = obj;
        this.f4324b |= Integer.MIN_VALUE;
        return this.f4325c.emit(null, this);
    }
}
