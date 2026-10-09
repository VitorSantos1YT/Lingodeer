package mu;

import com.lingodeer.network.model.ApiResponse;
import com.lingodeer.network.model.GemAppendBySomeReasonResponse;
import dv.u0;
import fr.o0;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import kotlin.NoWhenBranchMatchedException;
import rz.b0;
import uz.i1;
import vt.n0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class t extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f42166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f42167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f42168c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(h hVar, x xVar, vy.d dVar) {
        super(2, dVar);
        this.f42167b = xVar;
        this.f42168c = hVar;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        return new t(this.f42168c, this.f42167b, dVar);
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((t) create((b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException {
        Object value;
        x xVar = this.f42167b;
        n0 n0Var = xVar.f42183b;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f42166a;
        qy.b0 b0Var = qy.b0.f48488a;
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
        u0 u0Var = xVar.f42185d;
        String strW = ((o0) n0Var).w();
        this.f42166a = 1;
        obj = u0Var.j(strW, this);
        if (obj != aVar) {
        }
        return aVar;
        ApiResponse apiResponse = (ApiResponse) obj;
        if (!(apiResponse instanceof ApiResponse.Error)) {
            if (!(apiResponse instanceof ApiResponse.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            i1 i1Var = xVar.O;
            do {
                value = i1Var.getValue();
                ((Number) value).intValue();
            } while (!i1Var.j(value, new Integer(((GemAppendBySomeReasonResponse) ((ApiResponse.Success) apiResponse).getData()).getReason_grant_gem_amount())));
            if (!((o0) n0Var).f27733a.isUnloginUser()) {
                vt.c cVar = xVar.f42184c;
                this.f42166a = 2;
                ((vt.d) cVar).n(this);
                if (b0Var == aVar) {
                    return aVar;
                }
            }
        }
        return b0Var;
    }
}
