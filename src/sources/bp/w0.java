package bp;

import com.lingodeer.database.model.LanguageHistoryEntity;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class w0 implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4865a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f4866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4867c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f4868d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f4869e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f4870f;

    public w0(String str, ph.k kVar, kotlin.jvm.internal.y yVar, kotlin.jvm.internal.y yVar2, boolean z11) {
        this.f4867c = str;
        this.f4868d = kVar;
        this.f4869e = yVar;
        this.f4870f = yVar2;
        this.f4866b = z11;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f4865a) {
            case 0:
                l1.a1 a1Var = (l1.a1) this.f4869e;
                if (this.f4866b) {
                    l1.h1 h1Var = (l1.h1) a1Var;
                    h1Var.m(h1Var.l() + 1);
                    ((n2.a) this.f4867c).a(0);
                    ((l1.b1) this.f4870f).setValue((LanguageHistoryEntity) this.f4868d);
                }
                return qy.b0.f48488a;
            default:
                String difficulty = (String) this.f4867c;
                ph.k kVar = (ph.k) this.f4868d;
                fh.e repository = kVar.f46879b;
                String category = (String) ((kotlin.jvm.internal.y) this.f4869e).f38361a;
                String status = (String) ((kotlin.jvm.internal.y) this.f4870f).f38361a;
                kotlin.jvm.internal.m.f(repository, "repository");
                kotlin.jvm.internal.m.f(category, "category");
                kotlin.jvm.internal.m.f(difficulty, "difficulty");
                kotlin.jvm.internal.m.f(status, "status");
                gh.o oVar = new gh.o(repository, category, difficulty, status, this.f4866b);
                kVar.N.put(difficulty, new WeakReference(oVar));
                return oVar;
        }
    }

    public w0(boolean z11, n2.a aVar, LanguageHistoryEntity languageHistoryEntity, l1.a1 a1Var, l1.b1 b1Var) {
        this.f4866b = z11;
        this.f4867c = aVar;
        this.f4868d = languageHistoryEntity;
        this.f4869e = a1Var;
        this.f4870f = b1Var;
    }
}
