package vt;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class m extends xy.c {
    public int H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f54250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Set f54251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f54252c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f54253d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f54254e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f54255f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ r f54256t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(r rVar, xy.c cVar) {
        super(cVar);
        this.f54256t = rVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f54255f = obj;
        this.H |= Integer.MIN_VALUE;
        return this.f54256t.d(null, null, this);
    }
}
