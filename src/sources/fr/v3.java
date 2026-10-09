package fr;

import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.lingodeer.network.model.ApiResponse;
import com.lingodeer.network.model.BooleanResponse;
import com.lingodeer.network.model.ServerJsonResponse;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class v3 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x4 f27922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f27923c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f27924d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v3(x4 x4Var, String str, String str2, vy.d dVar) {
        super(2, dVar);
        this.f27922b = x4Var;
        this.f27923c = str;
        this.f27924d = str2;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        return new v3(this.f27922b, this.f27923c, this.f27924d, dVar);
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((v3) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException {
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f27921a;
        boolean success = false;
        if (i11 == 0) {
            com.bumptech.glide.e.F(obj);
            x4 x4Var = this.f27922b;
            dv.u0 u0Var = x4Var.f27971d;
            String strG = ((o0) x4Var.f27970c).g();
            this.f27921a = 1;
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("email", strG);
            jsonObject.addProperty("oldpwd", this.f27923c);
            jsonObject.addProperty("newpwd", this.f27924d);
            qy.l lVarY = nv.p.y(jsonObject, "toJson(...)", b7.e0.i(u0Var, jsonObject, u0Var.f24526e));
            qy.l lVar = (qy.l) lVarY.f48496b;
            obj = u0Var.v((SecretKey) lVar.f48495a, (SecretKey) lVar.f48496b, new TypeToken<ServerJsonResponse<BooleanResponse>>() { // from class: com.lingodeer.network.NetworkClient$userEmailPasswordChange$2
            }, new BooleanResponse(false, 1, null), new dv.p0(u0Var, (JsonObject) lVarY.f48495a, null, 10), this);
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
        if (!(apiResponse instanceof ApiResponse.Error)) {
            if (!(apiResponse instanceof ApiResponse.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            success = ((BooleanResponse) ((ApiResponse.Success) apiResponse).getData()).getSuccess();
        }
        return Boolean.valueOf(success);
    }
}
