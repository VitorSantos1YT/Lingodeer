package m6;

import androidx.glance.session.SessionWorker;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f40912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SessionWorker f40913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f40914c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(SessionWorker sessionWorker, xy.c cVar) {
        super(cVar);
        this.f40913b = sessionWorker;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f40912a = obj;
        this.f40914c |= Integer.MIN_VALUE;
        return this.f40913b.c(this);
    }
}
