package vt;

import rt.zc;

/* JADX INFO: loaded from: classes4.dex */
public final class n extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f54257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f54258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zc f54259c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(zc zcVar, vy.d dVar) {
        super(dVar);
        this.f54259c = zcVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f54257a = obj;
        this.f54258b |= Integer.MIN_VALUE;
        return this.f54259c.emit(null, this);
    }
}
