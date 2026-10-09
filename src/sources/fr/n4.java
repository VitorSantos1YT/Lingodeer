package fr;

import com.lingodeer.database.model.SubLearnProgressEntity;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class n4 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f27725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SubLearnProgressEntity f27726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f27727c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x4 f27728d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f27729e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n4(x4 x4Var, xy.c cVar) {
        super(cVar);
        this.f27728d = x4Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f27727c = obj;
        this.f27729e |= Integer.MIN_VALUE;
        return x4.g(this.f27728d, false, this);
    }
}
