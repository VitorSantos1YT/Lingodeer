package bp;

import com.lingo.lingoskill.ui.base.FindPasswordActivity;
import com.lingodeer.R;
import com.lingodeer.network.model.ApiResponse;
import com.lingodeer.network.model.BooleanResponse;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class q1 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FindPasswordActivity f4772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f4773c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(FindPasswordActivity findPasswordActivity, String str, vy.d dVar) {
        super(2, dVar);
        this.f4772b = findPasswordActivity;
        this.f4773c = str;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        return new q1(this.f4772b, this.f4773c, dVar);
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((q1) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        FindPasswordActivity findPasswordActivity = this.f4772b;
        l1.k1 k1Var = findPasswordActivity.H;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f4771a;
        try {
            if (i11 == 0) {
                com.bumptech.glide.e.F(obj);
                k1Var.setValue(Boolean.TRUE);
                yz.f fVar = rz.o0.f50940a;
                yz.e eVar = yz.e.f58387a;
                b1.c cVar = new b1.c(6, findPasswordActivity, this.f4773c, (vy.d) null);
                this.f4771a = 1;
                obj = rz.e0.M(eVar, cVar, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.e.F(obj);
            }
            ApiResponse apiResponse = (ApiResponse) obj;
            if (apiResponse instanceof ApiResponse.Error) {
                if (oz.q.v0(((ApiResponse.Error) apiResponse).getMessage(), "Can't find this email", false)) {
                    String string = findPasswordActivity.getString(R.string.unregistered_email);
                    kotlin.jvm.internal.m.e(string, "getString(...)");
                    FindPasswordActivity.p(findPasswordActivity, string);
                } else {
                    String string2 = findPasswordActivity.getString(R.string.error);
                    kotlin.jvm.internal.m.e(string2, "getString(...)");
                    FindPasswordActivity.p(findPasswordActivity, string2);
                }
                findPasswordActivity.m().c("jxz_signin_resetpwd", new androidx.lifecycle.j(22));
            } else {
                if (!(apiResponse instanceof ApiResponse.Success)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (((BooleanResponse) ((ApiResponse.Success) apiResponse).getData()).getSuccess()) {
                    String string3 = findPasswordActivity.getString(R.string.success);
                    kotlin.jvm.internal.m.e(string3, "getString(...)");
                    FindPasswordActivity.p(findPasswordActivity, string3);
                    findPasswordActivity.m().c("jxz_signin_resetpwd", new androidx.lifecycle.j(23));
                } else {
                    String string4 = findPasswordActivity.getString(R.string.unregistered_email);
                    kotlin.jvm.internal.m.e(string4, "getString(...)");
                    FindPasswordActivity.p(findPasswordActivity, string4);
                    findPasswordActivity.m().c("jxz_signin_resetpwd", new androidx.lifecycle.j(24));
                }
            }
        } catch (Exception e8) {
            e8.printStackTrace();
            String string5 = findPasswordActivity.getString(R.string.error);
            kotlin.jvm.internal.m.e(string5, "getString(...)");
            FindPasswordActivity.p(findPasswordActivity, string5);
        } finally {
            k1Var.setValue(Boolean.FALSE);
        }
        return qy.b0.f48488a;
    }
}
