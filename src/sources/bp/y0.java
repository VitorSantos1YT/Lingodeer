package bp;

import android.content.Context;
import com.lingo.lingoskill.object.LanguageItem;
import com.lingodeer.database.model.LanguageHistoryEntity;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class y0 implements fz.f {
    public final /* synthetic */ l1.b1 H;
    public final /* synthetic */ Context K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LanguageItem f4908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LanguageHistoryEntity f4909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f4910c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gp.m f4911d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fz.c f4912e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f4913f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Integer f4914t;

    public y0(Context context, LanguageItem languageItem, LanguageHistoryEntity languageHistoryEntity, fz.c cVar, gp.m mVar, Integer num, l1.b1 b1Var, boolean z11, boolean z12) {
        this.f4908a = languageItem;
        this.f4909b = languageHistoryEntity;
        this.f4910c = z11;
        this.f4911d = mVar;
        this.f4912e = cVar;
        this.f4913f = z12;
        this.f4914t = num;
        this.H = b1Var;
        this.K = context;
    }

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        j0.b2 SwipeToDismissBox = (j0.b2) obj;
        l1.n nVar = (l1.n) obj2;
        int iIntValue = ((Number) obj3).intValue();
        kotlin.jvm.internal.m.f(SwipeToDismissBox, "$this$SwipeToDismissBox");
        l1.s sVar = (l1.s) nVar;
        if (sVar.T(iIntValue & 1, (iIntValue & 17) != 16)) {
            l1.t.a(z2.g1.f58552n.a(this.f4908a.getLocate() == 51 ? v3.m.Rtl : v3.m.Ltr), t1.e.d(1097816407, new x0(this.K, this.f4908a, this.f4909b, this.f4912e, this.f4911d, this.f4914t, this.H, this.f4910c, this.f4913f), sVar), sVar, 56);
        } else {
            sVar.W();
        }
        return qy.b0.f48488a;
    }
}
