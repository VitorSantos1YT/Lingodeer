package jt;

import com.lingodeer.data.model.CourseWord;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class p extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CourseWord f37096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a00.a f37097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f37098c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f37099d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u f37100e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f37101f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(u uVar, xy.c cVar) {
        super(cVar);
        this.f37100e = uVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f37099d = obj;
        this.f37101f |= Integer.MIN_VALUE;
        return this.f37100e.d(null, this);
    }
}
