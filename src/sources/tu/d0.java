package tu;

import rt.t6;

/* JADX INFO: loaded from: classes4.dex */
public final class d0 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f52550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f52551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t6 f52552c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public uz.j f52553d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f52554e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f52555f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(t6 t6Var, vy.d dVar) {
        super(dVar);
        this.f52552c = t6Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f52550a = obj;
        this.f52551b |= Integer.MIN_VALUE;
        return this.f52552c.emit(null, this);
    }
}
