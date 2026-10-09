package lp;

import cf.x;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingodeer.data.model.BillingStatus;
import com.lingodeer.network.model.ApiResponse;
import dv.u0;
import fr.x4;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Objects;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import rz.b0;
import wt.o0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class o extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f40224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ oi.c f40225b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(oi.c cVar, vy.d dVar) {
        super(2, dVar);
        this.f40225b = cVar;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        return new o(this.f40225b, dVar);
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((o) create((b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException {
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f40224a;
        qy.b0 b0Var = qy.b0.f48488a;
        oi.c cVar = this.f40225b;
        if (i11 != 0) {
            if (i11 == 1) {
                com.bumptech.glide.e.F(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.e.F(obj);
            }
            return b0Var;
        }
        com.bumptech.glide.e.F(obj);
        u0 u0Var = (u0) cVar.f44928d;
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        String uid = x.n().uid;
        kotlin.jvm.internal.m.e(uid, "uid");
        this.f40224a = 1;
        obj = u0Var.u(uid, "android", this);
        if (obj != aVar) {
        }
        return aVar;
        ApiResponse apiResponse = (ApiResponse) obj;
        Objects.toString(apiResponse);
        if (apiResponse instanceof ApiResponse.Success) {
            o0 o0Var = (o0) cVar.f44927c;
            BillingStatus billingStatus = (BillingStatus) ((ApiResponse.Success) apiResponse).getData();
            this.f40224a = 2;
            Object objS = ((x4) o0Var.f55334a).s(billingStatus, this);
            if (objS != aVar) {
                objS = b0Var;
            }
            if (objS == aVar) {
                return aVar;
            }
        }
        return b0Var;
    }
}
