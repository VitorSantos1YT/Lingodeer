package cu;

import kotlin.jvm.internal.y;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class k extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public y f22526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a00.a f22527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f22528c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f22529d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t f22530e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f22531f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(t tVar, xy.c cVar) {
        super(cVar);
        this.f22530e = tVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f22529d = obj;
        this.f22531f |= Integer.MIN_VALUE;
        return t.a(this.f22530e, this);
    }
}
