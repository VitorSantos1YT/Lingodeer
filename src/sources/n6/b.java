package n6;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f43435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g f43436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f43437c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a00.e f43438d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f43439e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f f43440f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f43441t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(f fVar, xy.c cVar) {
        super(cVar);
        this.f43440f = fVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f43439e = obj;
        this.f43441t |= Integer.MIN_VALUE;
        return this.f43440f.a(null, null, null, this);
    }
}
