package bp;

import com.lingo.lingoskill.ui.base.LoginActivity;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class f2 implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LoginActivity f4570b;

    public /* synthetic */ f2(LoginActivity loginActivity, int i11) {
        this.f4569a = i11;
        this.f4570b = loginActivity;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f4569a) {
            case 0:
                return ef.e.q(this.f4570b).a(null, null, kotlin.jvm.internal.z.a(dr.p.class));
            default:
                LoginActivity loginActivity = this.f4570b;
                return i20.b.a(kotlin.jvm.internal.z.a(wu.v.class), loginActivity.getViewModelStore(), null, loginActivity.getDefaultViewModelCreationExtras(), null, ef.e.q(loginActivity), null);
        }
    }
}
