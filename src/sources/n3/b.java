package n3;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f43130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a0 f43131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f43132c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f43133d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f43134e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c f43135f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f43136t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, xy.c cVar2) {
        super(cVar2);
        this.f43135f = cVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f43134e = obj;
        this.f43136t |= Integer.MIN_VALUE;
        return this.f43135f.b(this);
    }
}
