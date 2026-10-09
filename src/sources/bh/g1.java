package bh;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class g1 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public rs.a f4215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Map f4216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map f4217c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f4218d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s1 f4219e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f4220f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(s1 s1Var, xy.c cVar) {
        super(cVar);
        this.f4219e = s1Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f4218d = obj;
        this.f4220f |= Integer.MIN_VALUE;
        return this.f4219e.d(null, this);
    }
}
