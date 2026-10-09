package lp;

import android.text.TextUtils;
import androidx.drawerlayout.widget.ktFt.FpIL;
import cf.x;
import com.android.billingclient.api.Purchase;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingodeer.data.env.Env;
import com.lingodeer.data.model.BillingStatus;
import com.lingodeer.network.model.ApiResponse;
import com.tbruyelle.rxpermissions3.BuildConfig;
import dv.u0;
import fr.x4;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Objects;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import okhttp3.internal.platform.ZjS.OYAvlbfUyD;
import rz.b0;
import wt.o0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class n extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f40221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Purchase f40222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ oi.c f40223c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Purchase purchase, oi.c cVar, vy.d dVar) {
        super(2, dVar);
        this.f40222b = purchase;
        this.f40223c = cVar;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        return new n(this.f40222b, this.f40223c, dVar);
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00f9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:39:0x00fa A[RETURN] */
    @Override // xy.a
    public final Object invokeSuspend(Object obj) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException {
        boolean z11;
        Purchase purchase;
        Object objE;
        oi.c cVar = this.f40223c;
        o0 o0Var = (o0) cVar.f44927c;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f40221a;
        qy.b0 b0Var = qy.b0.f48488a;
        String str = OYAvlbfUyD.uGKCJED;
        Purchase purchase2 = this.f40222b;
        if (i11 != 0) {
            if (i11 == 1) {
                com.bumptech.glide.e.F(obj);
                objE = obj;
                purchase = purchase2;
                z11 = true;
            } else {
                if (i11 != 2 && i11 != 3 && i11 != 4) {
                    throw new IllegalStateException(FpIL.GrXTxpJm);
                }
                com.bumptech.glide.e.F(obj);
            }
            return b0Var;
        }
        com.bumptech.glide.e.F(obj);
        String str2 = (String) purchase2.b().get(0);
        String strA = purchase2.a();
        kotlin.jvm.internal.m.e(strA, "getPurchaseToken(...)");
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        String str3 = x.n().isUnloginUser() ? str : x.n().uid;
        u0 u0Var = (u0) cVar.f44928d;
        kotlin.jvm.internal.m.c(str3);
        kotlin.jvm.internal.m.c(str2);
        this.f40221a = 1;
        z11 = true;
        purchase = purchase2;
        objE = u0Var.e(str3, "com.lingodeer", str2, strA, BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, this);
        if (objE != aVar) {
        }
        return aVar;
        ApiResponse apiResponse = (ApiResponse) objE;
        LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
        x.n().hasSyncSubInfo = z11;
        x.n().updateEntry("hasSyncSubInfo");
        Objects.toString(apiResponse);
        if (!(apiResponse instanceof ApiResponse.Success)) {
            Env envN = x.n();
            String strOptString = purchase.f7456c.optString("orderId");
            if (TextUtils.isEmpty(strOptString)) {
                strOptString = null;
            }
            envN.lastInvalidOrderId = strOptString;
            x.n().updateEntry("lastInvalidOrderId");
            this.f40221a = 4;
            if (o0Var.c(this) == aVar) {
                return aVar;
            }
            return b0Var;
        }
        if (!kotlin.jvm.internal.m.a(x.n().accountType, str)) {
            this.f40221a = 3;
            if (oi.c.b(cVar, this) == aVar) {
                return aVar;
            }
            return b0Var;
        }
        BillingStatus billingStatus = (BillingStatus) ((ApiResponse.Success) apiResponse).getData();
        this.f40221a = 2;
        Object objS = ((x4) o0Var.f55334a).s(billingStatus, this);
        if (objS != aVar) {
            objS = b0Var;
        }
        if (objS == aVar) {
            return aVar;
        }
        return b0Var;
    }
}
