package bh;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class k1 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public rs.a f4267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Map f4268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map f4269c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f4270d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s1 f4271e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f4272f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(s1 s1Var, xy.c cVar) {
        super(cVar);
        this.f4271e = s1Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f4270d = obj;
        this.f4272f |= Integer.MIN_VALUE;
        return this.f4271e.e(null, this);
    }
}
