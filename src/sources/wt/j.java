package wt;

import rt.zc;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f55289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f55290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zc f55291c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(zc zcVar, vy.d dVar) {
        super(dVar);
        this.f55291c = zcVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f55289a = obj;
        this.f55290b |= Integer.MIN_VALUE;
        return this.f55291c.emit(null, this);
    }
}
