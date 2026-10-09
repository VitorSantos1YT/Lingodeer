package bp;

import com.lingo.lingoskill.ui.base.LoginActivity;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class y1 implements fz.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LoginActivity f4915a;

    public /* synthetic */ y1(LoginActivity loginActivity) {
        this.f4915a = loginActivity;
    }

    @Override // fz.h
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        String openId = (String) obj;
        String userName = (String) obj2;
        String type = (String) obj3;
        int i11 = LoginActivity.Q;
        kotlin.jvm.internal.m.f(openId, "openId");
        kotlin.jvm.internal.m.f(userName, "userName");
        kotlin.jvm.internal.m.f(type, "type");
        LoginActivity loginActivity = this.f4915a;
        loginActivity.r(true);
        loginActivity.q().c(new wu.y(openId, userName, type, (String) obj4, (String) obj5));
        return qy.b0.f48488a;
    }
}
