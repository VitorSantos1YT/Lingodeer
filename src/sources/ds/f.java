package ds;

import com.lingodeer.data.model.LessonState;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class f extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f23610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f23611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LessonState f23612c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f23613d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g f23614e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f23615f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, xy.c cVar) {
        super(cVar);
        this.f23614e = gVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f23613d = obj;
        this.f23615f |= Integer.MIN_VALUE;
        return this.f23614e.g(0L, null, this);
    }
}
