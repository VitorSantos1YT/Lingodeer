package fr;

import com.lingodeer.data.model.UserInfo;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class h extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public UserInfo f27548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f27549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f27550c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i f27551d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f27552e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, xy.c cVar) {
        super(cVar);
        this.f27551d = iVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f27550c = obj;
        this.f27552e |= Integer.MIN_VALUE;
        return i.a(this.f27551d, null, this);
    }
}
