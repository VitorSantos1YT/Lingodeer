package ph;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f46857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f46858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f46859c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, vy.d dVar) {
        super(dVar);
        this.f46859c = fVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f46857a = obj;
        this.f46858b |= Integer.MIN_VALUE;
        return this.f46859c.emit(null, this);
    }
}
