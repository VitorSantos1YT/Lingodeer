package n5;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class t extends xy.c {
    public final /* synthetic */ v H;
    public int K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f43380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f43381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Serializable f43382c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public kotlin.jvm.internal.y f43383d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f43384e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f43385f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f43386t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(v vVar, xy.c cVar) {
        super(cVar);
        this.H = vVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f43386t = obj;
        this.K |= Integer.MIN_VALUE;
        return v.f(this.H, false, this);
    }
}
