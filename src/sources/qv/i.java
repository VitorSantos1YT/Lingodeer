package qv;

import bh.q;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f48439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f48440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f48441c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(q qVar, vy.d dVar) {
        super(dVar);
        this.f48441c = qVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f48439a = obj;
        this.f48440b |= Integer.MIN_VALUE;
        return this.f48441c.emit(null, this);
    }
}
