package uz;

import rt.zc;

/* JADX INFO: loaded from: classes4.dex */
public final class i0 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f53315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f53316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zc f53317c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(zc zcVar, vy.d dVar) {
        super(dVar);
        this.f53317c = zcVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f53315a = obj;
        this.f53316b |= Integer.MIN_VALUE;
        return this.f53317c.emit(null, this);
    }
}
