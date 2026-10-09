package bh;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class e1 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f4199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s1 f4200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4201c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(s1 s1Var, xy.c cVar) {
        super(cVar);
        this.f4200b = s1Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f4199a = obj;
        this.f4201c |= Integer.MIN_VALUE;
        return s1.b(this.f4200b, null, this);
    }
}
