package fr;

import com.lingodeer.data.env.Env;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class e2 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f27480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i3 f27481c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e2(int i11, i3 i3Var, vy.d dVar) {
        super(2, dVar);
        this.f27479a = i11;
        this.f27481c = i3Var;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f27479a) {
            case 0:
                return new e2(0, this.f27481c, dVar);
            default:
                return new e2(1, this.f27481c, dVar);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f27479a) {
            case 0:
                break;
        }
        return ((e2) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x007f  */
    @Override // xy.a
    public final Object invokeSuspend(Object obj) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException {
        Object objH;
        switch (this.f27479a) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f27480b;
                qy.b0 b0Var = qy.b0.f48488a;
                if (i11 == 0) {
                    com.bumptech.glide.e.F(obj);
                    this.f27480b = 1;
                    i3 i3Var = this.f27481c;
                    o0 o0Var = (o0) i3Var.f27600a;
                    Env env = o0Var.f27733a;
                    if (env.keyLanguage != -1) {
                        dv.u0 u0Var = i3Var.f27611l;
                        String strW = o0Var.w();
                        String str = env.GCMPushToken;
                        if (str == null) {
                            str = BuildConfig.VERSION_NAME;
                        }
                        objH = dv.u0.h(u0Var, strW, null, null, xt.d.k(env.keyLanguage), xt.d.f(env.locateLanguage), 0, str, this, 974);
                        if (objH != aVar) {
                            objH = b0Var;
                        }
                    } else {
                        objH = b0Var;
                    }
                    if (objH == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return b0Var;
            default:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f27480b;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj;
                }
                com.bumptech.glide.e.F(obj);
                this.f27480b = 1;
                Object objJ = a3.j(this.f27481c, "deleted", "course", this);
                return objJ == aVar2 ? aVar2 : objJ;
        }
    }
}
