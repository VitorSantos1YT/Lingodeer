package wt;

import rt.zc;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f55275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f55276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zc f55277c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(zc zcVar, vy.d dVar) {
        super(dVar);
        this.f55277c = zcVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f55275a = obj;
        this.f55276b |= Integer.MIN_VALUE;
        return this.f55277c.emit(null, this);
    }
}
