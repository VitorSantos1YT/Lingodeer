package rt;

import com.lingodeer.data.model.uistate.WordSentenceCharacterType;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class e extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WordSentenceCharacterType f49652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f49653b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f49654c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f49655d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j f49656e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f49657f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(j jVar, xy.c cVar) {
        super(cVar);
        this.f49656e = jVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f49655d = obj;
        this.f49657f |= Integer.MIN_VALUE;
        return j.a(this.f49656e, null, this);
    }
}
