package rt;

import com.lingodeer.data.model.uistate.WordSentenceCharacterType;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class a6 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WordSentenceCharacterType f49440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f49441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f49442c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b6 f49443d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f49444e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a6(b6 b6Var, xy.c cVar) {
        super(cVar);
        this.f49443d = b6Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f49442c = obj;
        this.f49444e |= Integer.MIN_VALUE;
        return this.f49443d.a(null, this);
    }
}
