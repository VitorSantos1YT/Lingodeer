package hu;

/* JADX INFO: loaded from: classes4.dex */
public final class n extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f33808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f33809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ bh.q f33810c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(bh.q qVar, vy.d dVar) {
        super(dVar);
        this.f33810c = qVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f33808a = obj;
        this.f33809b |= Integer.MIN_VALUE;
        return this.f33810c.emit(null, this);
    }
}
