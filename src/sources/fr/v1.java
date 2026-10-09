package fr;

import com.lingodeer.data.env.Env;
import com.lingodeer.data.model.UserInfo;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class v1 implements ru.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vt.n0 f27910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vt.h1 f27911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vt.c f27912c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final dv.u0 f27913d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final vt.a f27914e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final uz.i1 f27915f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final uz.i1 f27916g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p1 f27917h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final bh.r f27918i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final bh.r f27919j;

    public v1(vt.n0 n0Var, vt.h1 h1Var, vt.c cVar, dv.u0 u0Var, vt.a aVar) {
        this.f27910a = n0Var;
        this.f27911b = h1Var;
        this.f27912c = cVar;
        this.f27913d = u0Var;
        this.f27914e = aVar;
        ry.r rVar = ry.r.f50854a;
        uz.i1 i1VarC = uz.x0.c(rVar);
        this.f27915f = i1VarC;
        uz.i1 i1VarC2 = uz.x0.c(rVar);
        this.f27916g = i1VarC2;
        p1 p1Var = new p1(i1VarC, this, 0);
        this.f27917h = p1Var;
        p1 p1Var2 = new p1(i1VarC2, this, 1);
        this.f27918i = new bh.r(p1Var, this, 2);
        this.f27919j = new bh.r(p1Var2, this, 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object a(v1 v1Var, String str, xy.c cVar) {
        a1 a1Var;
        v1Var.getClass();
        if (cVar instanceof a1) {
            a1Var = (a1) cVar;
            int i11 = a1Var.f27389d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                a1Var.f27389d = i11 - Integer.MIN_VALUE;
            } else {
                a1Var = new a1(v1Var, cVar);
            }
        } else {
            a1Var = new a1(v1Var, cVar);
        }
        Object objU = a1Var.f27387b;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = a1Var.f27389d;
        if (i12 == 0) {
            com.bumptech.glide.e.F(objU);
            gp.r rVarN = ((x4) v1Var.f27911b).n();
            a1Var.f27386a = str;
            a1Var.f27389d = 1;
            objU = uz.x0.u(rVarN, a1Var);
            if (objU == aVar) {
                return aVar;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = a1Var.f27386a;
            com.bumptech.glide.e.F(objU);
        }
        return Boolean.valueOf(((UserInfo) objU).getAllFollowings().contains(str));
    }

    public final gp.r b(String userId) {
        kotlin.jvm.internal.m.f(userId, "userId");
        return new gp.r(new c1(this, userId, null));
    }

    public final gp.r c(String uid) {
        kotlin.jvm.internal.m.f(uid, "uid");
        return new gp.r(new g1(this, uid, null));
    }

    public final uz.i d() {
        n9.n1 n1Var = new n9.n1(new gp.r(new j1(this, null)), new k1(3, null));
        yz.f fVar = rz.o0.f50940a;
        return uz.x0.w(n1Var, yz.e.f58387a);
    }

    public final gp.r e(String userId) {
        kotlin.jvm.internal.m.f(userId, "userId");
        return new gp.r(new t1(this, userId, null));
    }

    public final Object f(xy.i iVar) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException {
        o0 o0Var = (o0) this.f27910a;
        String strW = o0Var.w();
        String strQ = o0Var.q();
        Env env = o0Var.f27733a;
        String str = env.userPicName;
        if (str == null) {
            str = BuildConfig.VERSION_NAME;
        }
        String str2 = str;
        String str3 = env.GCMPushToken;
        if (str3 == null) {
            str3 = "null";
        }
        Object objB = this.f27913d.B(strW, strQ, str2, str3, xt.d.f(env.locateLanguage), !env.leaderBoardAnonymous, env.emojiStatus, iVar);
        return objB == wy.a.COROUTINE_SUSPENDED ? objB : qy.b0.f48488a;
    }
}
