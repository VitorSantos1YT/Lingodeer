package nr;

import com.lingo.lingoskill.object.LanguageItem;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class h extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LanguageItem f43947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f43948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LanguageItem f43949c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f43950d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f43951e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i f43952f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f43953t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, xy.c cVar) {
        super(cVar);
        this.f43952f = iVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f43951e = obj;
        this.f43953t |= Integer.MIN_VALUE;
        return i.c(this.f43952f, null, this);
    }
}
