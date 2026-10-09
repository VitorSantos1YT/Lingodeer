package js;

import com.lingodeer.data.model.LessonState;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class m extends xy.c {
    public final /* synthetic */ r H;
    public int K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Long f36792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Long f36793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LessonState f36794c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f36795d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f36796e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f36797f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f36798t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(r rVar, xy.c cVar) {
        super(cVar);
        this.H = rVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f36798t = obj;
        this.K |= Integer.MIN_VALUE;
        return this.H.K(this);
    }
}
