package av;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class f extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f3124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f3125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f3126c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i f3127d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f3128e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i iVar, xy.c cVar) {
        super(cVar);
        this.f3127d = iVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f3126c = obj;
        this.f3128e |= Integer.MIN_VALUE;
        return this.f3127d.e(null, null, null, null, this);
    }
}
