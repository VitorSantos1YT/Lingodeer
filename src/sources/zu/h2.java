package zu;

import rt.t6;

/* JADX INFO: loaded from: classes4.dex */
public final class h2 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f59434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f59435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t6 f59436c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public uz.j f59437d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f59438e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f59439f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(t6 t6Var, vy.d dVar) {
        super(dVar);
        this.f59436c = t6Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f59434a = obj;
        this.f59435b |= Integer.MIN_VALUE;
        return this.f59436c.emit(null, this);
    }
}
