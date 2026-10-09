package wt;

import rt.zc;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f55242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f55243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zc f55244c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(zc zcVar, vy.d dVar) {
        super(dVar);
        this.f55244c = zcVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f55242a = obj;
        this.f55243b |= Integer.MIN_VALUE;
        return this.f55244c.emit(null, this);
    }
}
