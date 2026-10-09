package rt;

import com.lingodeer.data.model.SRSStatus;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class x2 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SRSStatus f50617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public qy.l f50618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f50619c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e3 f50620d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f50621e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(e3 e3Var, xy.c cVar) {
        super(cVar);
        this.f50620d = e3Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f50619c = obj;
        this.f50621e |= Integer.MIN_VALUE;
        return e3.I(this.f50620d, null, this);
    }
}
