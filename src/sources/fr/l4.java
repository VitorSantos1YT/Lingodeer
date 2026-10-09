package fr;

import com.lingodeer.data.model.UserInfo;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class l4 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f27683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public UserInfo f27684c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f27685d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x4 f27686e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f27687f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l4(x4 x4Var, xy.c cVar) {
        super(cVar);
        this.f27686e = x4Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f27685d = obj;
        this.f27687f |= Integer.MIN_VALUE;
        return this.f27686e.p(0, this);
    }
}
