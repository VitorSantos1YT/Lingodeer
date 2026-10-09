package wt;

import com.lingodeer.data.model.CoursePracticeType;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class n0 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f55328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f55329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CoursePracticeType f55330c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f55331d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o0 f55332e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f55333f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(o0 o0Var, xy.c cVar) {
        super(cVar);
        this.f55332e = o0Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f55331d = obj;
        this.f55333f |= Integer.MIN_VALUE;
        return this.f55332e.h(0L, null, null, this);
    }
}
