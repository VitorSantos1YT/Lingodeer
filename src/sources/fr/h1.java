package fr;

import com.lingodeer.data.env.Env;
import com.lingodeer.network.model.ApiResponse;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class h1 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f27557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f27558c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v1 f27559d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h1(v1 v1Var, vy.d dVar, int i11) {
        super(2, dVar);
        this.f27556a = i11;
        this.f27559d = v1Var;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f27556a) {
            case 0:
                h1 h1Var = new h1(this.f27559d, dVar, 0);
                h1Var.f27558c = obj;
                return h1Var;
            default:
                h1 h1Var2 = new h1(this.f27559d, dVar, 1);
                h1Var2.f27558c = obj;
                return h1Var2;
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f27556a) {
            case 0:
                return ((h1) create((String) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            default:
                return ((h1) create((uz.j) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
        }
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException {
        Object objB;
        int i11 = this.f27556a;
        Object obj2 = qy.b0.f48488a;
        v1 v1Var = this.f27559d;
        switch (i11) {
            case 0:
                vt.n0 n0Var = v1Var.f27910a;
                String str = (String) this.f27558c;
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f27557b;
                if (i12 == 0) {
                    com.bumptech.glide.e.F(obj);
                    this.f27558c = null;
                    this.f27557b = 1;
                    yz.f fVar = rz.o0.f50940a;
                    Object objM = rz.e0.M(yz.e.f58387a, new i0((o0) n0Var, str, null, 28), this);
                    if (objM == aVar) {
                        obj2 = objM;
                    }
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                String todayRank = ((o0) n0Var).f27733a.todayRank;
                kotlin.jvm.internal.m.e(todayRank, "todayRank");
                return todayRank;
            default:
                uz.j jVar = (uz.j) this.f27558c;
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i13 = this.f27557b;
                if (i13 == 0) {
                    com.bumptech.glide.e.F(obj);
                    dv.u0 u0Var = v1Var.f27913d;
                    vt.n0 n0Var2 = v1Var.f27910a;
                    String strW = ((o0) n0Var2).w();
                    String strQ = ((o0) n0Var2).q();
                    String str2 = ((o0) n0Var2).f27733a.userPicName;
                    if (str2 == null) {
                        str2 = BuildConfig.VERSION_NAME;
                    }
                    Env env = ((o0) n0Var2).f27733a;
                    String str3 = env.GCMPushToken;
                    if (str3 == null) {
                        str3 = "null";
                    }
                    String strF = xt.d.f(env.locateLanguage);
                    Env env2 = ((o0) n0Var2).f27733a;
                    boolean z11 = !env2.leaderBoardAnonymous;
                    int i14 = env2.emojiStatus;
                    this.f27558c = jVar;
                    this.f27557b = 1;
                    objB = u0Var.B(strW, strQ, str2, str3, strF, z11, i14, this);
                    if (objB != aVar2) {
                    }
                    return aVar2;
                }
                if (i13 != 1) {
                    if (i13 != 2 && i13 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj2;
                }
                com.bumptech.glide.e.F(obj);
                objB = obj;
                ApiResponse apiResponse = (ApiResponse) objB;
                if (apiResponse instanceof ApiResponse.Error) {
                    Boolean bool = Boolean.FALSE;
                    this.f27558c = null;
                    this.f27557b = 2;
                    if (jVar.emit(bool, this) != aVar2) {
                        return obj2;
                    }
                } else {
                    if (!(apiResponse instanceof ApiResponse.Success)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Boolean bool2 = Boolean.TRUE;
                    this.f27558c = null;
                    this.f27557b = 3;
                    if (jVar.emit(bool2, this) != aVar2) {
                        return obj2;
                    }
                }
                return aVar2;
        }
    }
}
