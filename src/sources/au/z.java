package au;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class z extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f0 f3097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Iterator f3098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3099c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f3100d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f0 f3101e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f3102f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(f0 f0Var, xy.c cVar) {
        super(cVar);
        this.f3101e = f0Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f3100d = obj;
        this.f3102f |= Integer.MIN_VALUE;
        return f0.a(this.f3101e, null, this);
    }
}
