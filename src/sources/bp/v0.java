package bp;

import com.lingo.lingoskill.object.LanguageItem;
import com.lingodeer.database.model.LanguageHistoryEntity;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class v0 implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gp.m f4850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LanguageHistoryEntity f4851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fz.c f4852c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ LanguageItem f4853d;

    public v0(gp.m mVar, LanguageHistoryEntity languageHistoryEntity, fz.c cVar, LanguageItem languageItem) {
        this.f4850a = mVar;
        this.f4851b = languageHistoryEntity;
        this.f4852c = cVar;
        this.f4853d = languageItem;
    }

    @Override // fz.a
    public final Object invoke() {
        this.f4850a.b(new gp.f(this.f4851b));
        this.f4852c.invoke(this.f4853d);
        return qy.b0.f48488a;
    }
}
