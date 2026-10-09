package m6;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e6.l f40884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f40885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public fz.c f40886c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public tz.c f40887d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f40888e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e6.l f40889f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f40890t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(e6.l lVar, xy.c cVar) {
        super(cVar);
        this.f40889f = lVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f40888e = obj;
        this.f40890t |= Integer.MIN_VALUE;
        return this.f40889f.d(null, null, this);
    }
}
