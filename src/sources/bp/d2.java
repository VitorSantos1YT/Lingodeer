package bp;

import com.lingo.lingoskill.ui.base.LoginActivity;
import com.lingo.lingoskill.ui.base.SignUpActivity;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d2 implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f4533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f4534c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f4535d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f4536e;

    public /* synthetic */ d2(int i11, l1.b1 b1Var, l1.b1 b1Var2, l1.b1 b1Var3, l1.b1 b1Var4) {
        this.f4532a = i11;
        this.f4533b = b1Var;
        this.f4534c = b1Var2;
        this.f4535d = b1Var3;
        this.f4536e = b1Var4;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        int i11 = this.f4532a;
        qy.b0 b0Var = qy.b0.f48488a;
        l1.b1 b1Var = this.f4536e;
        l1.b1 b1Var2 = this.f4535d;
        l1.b1 b1Var3 = this.f4534c;
        l1.b1 b1Var4 = this.f4533b;
        String it = (String) obj;
        switch (i11) {
            case 0:
                int i12 = LoginActivity.Q;
                kotlin.jvm.internal.m.f(it, "it");
                b1Var4.setValue(it);
                b1Var3.setValue(Boolean.FALSE);
                b1Var.setValue(Boolean.valueOf(oz.q.i1((String) b1Var4.getValue()).toString().length() > 0 && ((String) b1Var2.getValue()).length() > 0));
                break;
            case 1:
                int i13 = LoginActivity.Q;
                kotlin.jvm.internal.m.f(it, "it");
                b1Var4.setValue(it);
                b1Var3.setValue(Boolean.FALSE);
                b1Var.setValue(Boolean.valueOf(oz.q.i1((String) b1Var2.getValue()).toString().length() > 0 && ((String) b1Var4.getValue()).length() > 0));
                break;
            case 2:
                int i14 = SignUpActivity.L;
                kotlin.jvm.internal.m.f(it, "it");
                b1Var4.setValue(it);
                b1Var3.setValue(Boolean.FALSE);
                b1Var.setValue(Boolean.valueOf(oz.q.i1((String) b1Var4.getValue()).toString().length() > 0 && ((String) b1Var2.getValue()).length() > 0));
                break;
            default:
                int i15 = SignUpActivity.L;
                kotlin.jvm.internal.m.f(it, "it");
                b1Var4.setValue(it);
                b1Var3.setValue(Boolean.FALSE);
                b1Var.setValue(Boolean.valueOf(oz.q.i1((String) b1Var2.getValue()).toString().length() > 0 && ((String) b1Var4.getValue()).length() > 0));
                break;
        }
        return b0Var;
    }
}
