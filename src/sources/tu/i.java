package tu;

import rt.t6;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f52576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f52577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t6 f52578c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public uz.j f52579d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f52580e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f52581f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f52582t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(t6 t6Var, vy.d dVar) {
        super(dVar);
        this.f52578c = t6Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f52576a = obj;
        this.f52577b |= Integer.MIN_VALUE;
        return this.f52578c.emit(null, this);
    }
}
