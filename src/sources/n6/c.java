package n6;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f43442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f43443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Serializable f43444c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a00.e f43445d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f43446e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f f43447f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f43448t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f fVar, xy.c cVar) {
        super(cVar);
        this.f43447f = fVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f43446e = obj;
        this.f43448t |= Integer.MIN_VALUE;
        return this.f43447f.b(null, null, null, this);
    }
}
