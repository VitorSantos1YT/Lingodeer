package ot;

import com.lingodeer.data.model.TestModel;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class n1 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TestModel f45912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f45913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f45914c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o1 f45915d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f45916e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(o1 o1Var, xy.c cVar) {
        super(cVar);
        this.f45915d = o1Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f45914c = obj;
        this.f45916e |= Integer.MIN_VALUE;
        return o1.c(this.f45915d, null, false, this);
    }
}
