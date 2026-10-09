package bh;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class o1 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public rs.a f4317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Set f4318b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Set f4319c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f4320d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s1 f4321e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f4322f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(s1 s1Var, xy.c cVar) {
        super(cVar);
        this.f4321e = s1Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f4320d = obj;
        this.f4322f |= Integer.MIN_VALUE;
        return this.f4321e.f(null, this);
    }
}
