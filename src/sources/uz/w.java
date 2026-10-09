package uz;

import rt.k9;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class w extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f53423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k9 f53424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f53425c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(k9 k9Var, vy.d dVar) {
        super(dVar);
        this.f53424b = k9Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f53423a = obj;
        this.f53425c |= Integer.MIN_VALUE;
        return this.f53424b.emit(null, this);
    }
}
