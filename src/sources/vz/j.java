package vz;

import fr.u;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class j extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f54347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f54348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f54349c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(u uVar, vy.d dVar) {
        super(dVar);
        this.f54348b = uVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f54347a = obj;
        this.f54349c |= Integer.MIN_VALUE;
        return this.f54348b.emit(null, this);
    }
}
