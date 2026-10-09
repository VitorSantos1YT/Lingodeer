package bp;

import com.lingo.lingoskill.ui.base.LoginCheckParentInfoActivity;
import com.lingodeer.data.model.INTENTS;
import com.lingodeer.data.model.LawInfo;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class k2 implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LoginCheckParentInfoActivity f4670b;

    public /* synthetic */ k2(LoginCheckParentInfoActivity loginCheckParentInfoActivity, int i11) {
        this.f4669a = i11;
        this.f4670b = loginCheckParentInfoActivity;
    }

    @Override // fz.a
    public final Object invoke() {
        int i11 = this.f4669a;
        LoginCheckParentInfoActivity loginCheckParentInfoActivity = this.f4670b;
        switch (i11) {
            case 0:
                int i12 = LoginCheckParentInfoActivity.L;
                return (LawInfo) loginCheckParentInfoActivity.getIntent().getParcelableExtra(INTENTS.EXTRA_OBJECT);
            case 1:
                int i13 = LoginCheckParentInfoActivity.L;
                return Boolean.valueOf(loginCheckParentInfoActivity.getIntent().getBooleanExtra(INTENTS.EXTRA_BOOLEAN, false));
            default:
                int i14 = LoginCheckParentInfoActivity.L;
                loginCheckParentInfoActivity.finish();
                return qy.b0.f48488a;
        }
    }
}
