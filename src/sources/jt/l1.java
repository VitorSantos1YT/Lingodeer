package jt;

import com.lingodeer.data.model.CourseWord;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class l1 extends xy.c {
    public int H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CourseWord f37031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a00.a f37032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p1.c f37033c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f37034d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f37035e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f37036f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ m1 f37037t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(m1 m1Var, xy.c cVar) {
        super(cVar);
        this.f37037t = m1Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f37036f = obj;
        this.H |= Integer.MIN_VALUE;
        return this.f37037t.c(null, this);
    }
}
