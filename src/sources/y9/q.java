package y9;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f57524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Serializable f57525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f57526c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f57527d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s f57528e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f57529f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(s sVar, xy.c cVar) {
        super(cVar);
        this.f57528e = sVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f57527d = obj;
        this.f57529f |= Integer.MIN_VALUE;
        return this.f57528e.g(null, null, this);
    }
}
