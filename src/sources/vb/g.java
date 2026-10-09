package vb;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends xy.c {
    public int H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i f53820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public gc.a f53821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public gc.i f53822c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f53823d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Bitmap f53824e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f53825f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ i f53826t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, xy.c cVar) {
        super(cVar);
        this.f53826t = iVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f53825f = obj;
        this.H |= Integer.MIN_VALUE;
        return i.a(this.f53826t, null, 0, this);
    }
}
