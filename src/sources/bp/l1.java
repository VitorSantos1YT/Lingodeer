package bp;

import android.os.Bundle;
import com.lingo.lingoskill.ui.base.ConfirmLevelActivity;
import com.lingodeer.data.env.Env;
import dl.ExOZ.xItStCyvVEZ;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class l1 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ConfirmLevelActivity f4683c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Env f4684d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l1(ConfirmLevelActivity confirmLevelActivity, Env env, vy.d dVar, int i11) {
        super(2, dVar);
        this.f4681a = i11;
        this.f4683c = confirmLevelActivity;
        this.f4684d = env;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f4681a) {
            case 0:
                return new l1(this.f4683c, this.f4684d, dVar, 0);
            default:
                return new l1(this.f4683c, this.f4684d, dVar, 1);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f4681a) {
            case 0:
                break;
        }
        return ((l1) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f4681a;
        qy.b0 b0Var = qy.b0.f48488a;
        final ConfirmLevelActivity confirmLevelActivity = this.f4683c;
        Env env = this.f4684d;
        final int i12 = 1;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i13 = this.f4682b;
                final int i14 = 0;
                if (i13 == 0) {
                    com.bumptech.glide.e.F(obj);
                    if (ConfirmLevelActivity.q(confirmLevelActivity).length() > 0) {
                        confirmLevelActivity.m().c("jxz_select_lan", new fz.a() { // from class: bp.j1
                            @Override // fz.a
                            public final Object invoke() {
                                switch (i14) {
                                    case 0:
                                        Bundle bundle = new Bundle();
                                        bundle.putString(xItStCyvVEZ.ClDLzzGxMbwUn, ConfirmLevelActivity.q(confirmLevelActivity));
                                        bundle.putString("audience", "beginner");
                                        return bundle;
                                    default:
                                        Bundle bundle2 = new Bundle();
                                        bundle2.putString("source", ConfirmLevelActivity.q(confirmLevelActivity));
                                        bundle2.putString("audience", "advance");
                                        return bundle2;
                                }
                            }
                        });
                    }
                    yz.f fVar = rz.o0.f50940a;
                    yz.e eVar = yz.e.f58387a;
                    k1 k1Var = new k1(env, null, 0);
                    this.f4682b = 1;
                    if (rz.e0.M(eVar, k1Var, this) != aVar) {
                    }
                    return aVar;
                }
                if (i13 != 1) {
                    if (i13 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                this.f4682b = 2;
                if (ConfirmLevelActivity.p(confirmLevelActivity, 0, env, this) != aVar) {
                    return b0Var;
                }
                return aVar;
            default:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i15 = this.f4682b;
                if (i15 == 0) {
                    com.bumptech.glide.e.F(obj);
                    if (ConfirmLevelActivity.q(confirmLevelActivity).length() > 0) {
                        confirmLevelActivity.m().c("jxz_select_lan", new fz.a() { // from class: bp.j1
                            @Override // fz.a
                            public final Object invoke() {
                                switch (i12) {
                                    case 0:
                                        Bundle bundle = new Bundle();
                                        bundle.putString(xItStCyvVEZ.ClDLzzGxMbwUn, ConfirmLevelActivity.q(confirmLevelActivity));
                                        bundle.putString("audience", "beginner");
                                        return bundle;
                                    default:
                                        Bundle bundle2 = new Bundle();
                                        bundle2.putString("source", ConfirmLevelActivity.q(confirmLevelActivity));
                                        bundle2.putString("audience", "advance");
                                        return bundle2;
                                }
                            }
                        });
                    }
                    yz.f fVar2 = rz.o0.f50940a;
                    yz.e eVar2 = yz.e.f58387a;
                    k1 k1Var2 = new k1(env, null, 1);
                    this.f4682b = 1;
                    if (rz.e0.M(eVar2, k1Var2, this) != aVar2) {
                    }
                    return aVar2;
                }
                if (i15 != 1) {
                    if (i15 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                this.f4682b = 2;
                if (ConfirmLevelActivity.p(confirmLevelActivity, 7, env, this) != aVar2) {
                    return b0Var;
                }
                return aVar2;
        }
    }
}
