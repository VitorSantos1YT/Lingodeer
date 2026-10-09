package bp;

import com.lingo.lingoskill.ui.base.NewsFeedActivity;
import com.lingo.lingoskill.ui.base.NewsFeedDetailActivity;
import com.lingo.lingoskill.ui.base.NewsFeedWebActivity;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class q3 implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lc.d f4777b;

    public /* synthetic */ q3(lc.d dVar, int i11) {
        this.f4776a = i11;
        this.f4777b = dVar;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        int i11 = this.f4776a;
        qy.b0 b0Var = qy.b0.f48488a;
        lc.d dVar = this.f4777b;
        lc.d it = (lc.d) obj;
        switch (i11) {
            case 0:
                int i12 = NewsFeedActivity.R;
                kotlin.jvm.internal.m.f(it, "it");
                dVar.dismiss();
                break;
            case 1:
                int i13 = NewsFeedDetailActivity.P;
                kotlin.jvm.internal.m.f(it, "it");
                dVar.dismiss();
                break;
            case 2:
                int i14 = NewsFeedWebActivity.Q;
                kotlin.jvm.internal.m.f(it, "it");
                dVar.dismiss();
                break;
            case 3:
                dVar.dismiss();
                break;
            default:
                dVar.dismiss();
                break;
        }
        return b0Var;
    }
}
