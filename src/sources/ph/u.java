package ph;

/* JADX INFO: loaded from: classes3.dex */
public final class u extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f46918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f46919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v f46920c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(v vVar, vy.d dVar) {
        super(dVar);
        this.f46920c = vVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f46918a = obj;
        this.f46919b |= Integer.MIN_VALUE;
        return this.f46920c.emit(null, this);
    }
}
