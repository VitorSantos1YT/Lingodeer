package ni;

import cf.x;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.lingo.lingoskill.LingoSkillApplication;
import dv.u0;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import kotlin.KotlinNothingValueException;
import oz.q;
import rz.b0;
import uz.i1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f43804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f43805c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(m mVar, vy.d dVar, int i11) {
        super(2, dVar);
        this.f43803a = i11;
        this.f43805c = mVar;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f43803a) {
            case 0:
                return new b(this.f43805c, dVar, 0);
            case 1:
                return new b(this.f43805c, dVar, 1);
            default:
                return new b(this.f43805c, dVar, 2);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        b0 b0Var = (b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f43803a) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((b) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException {
        int i11 = this.f43803a;
        m mVar = this.f43805c;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f43804b;
                if (i12 == 0) {
                    com.bumptech.glide.e.F(obj);
                    i1 i1Var = mVar.f43835e;
                    b1.b bVar = new b1.b(mVar, 13);
                    this.f43804b = 1;
                    if (i1Var.collect(bVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                throw new KotlinNothingValueException();
            case 1:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i13 = this.f43804b;
                if (i13 == 0) {
                    com.bumptech.glide.e.F(obj);
                    String strF = FirebaseRemoteConfig.d().f("android_up_billing_model");
                    if (!LingoSkillApplication.f21666c.equals("default") && q.v0("release", "debug", false)) {
                        strF = LingoSkillApplication.f21666c;
                    }
                    ArrayList arrayListL = strF.equals("S_D_1") ? w4.c.l("club_android_35_discount_lifetime") : w4.c.l("club_android_34_discount_lifetime");
                    this.f43804b = 1;
                    obj = mVar.c("inapp", arrayListL, this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                List list = (List) obj;
                if (!list.isEmpty()) {
                    mVar.N.k(list.get(0));
                }
                return qy.b0.f48488a;
            default:
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                int i14 = this.f43804b;
                if (i14 != 0) {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj;
                }
                com.bumptech.glide.e.F(obj);
                u0 u0Var = mVar.f43833c;
                LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                String uid = x.n().uid;
                kotlin.jvm.internal.m.e(uid, "uid");
                this.f43804b = 1;
                Object objU = u0Var.u(uid, "android", this);
                return objU == aVar3 ? aVar3 : objU;
        }
    }
}
