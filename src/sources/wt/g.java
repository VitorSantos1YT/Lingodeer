package wt;

import rt.zc;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f55268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f55269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zc f55270c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(zc zcVar, vy.d dVar) {
        super(dVar);
        this.f55270c = zcVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f55268a = obj;
        this.f55269b |= Integer.MIN_VALUE;
        return this.f55270c.emit(null, this);
    }
}
