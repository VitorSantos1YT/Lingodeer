package zs;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class d extends xy.c {
    public int H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f59355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f59356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f59357c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f59358d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f59359e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f59360f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ f f59361t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, xy.c cVar) {
        super(cVar);
        this.f59361t = fVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f59360f = obj;
        this.H |= Integer.MIN_VALUE;
        return f.a(this.f59361t, null, null, null, false, null, null, this);
    }
}
