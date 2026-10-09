package dv;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.lingodeer.network.model.ApiResponse;
import com.lingodeer.network.model.ServerJsonResponse;
import javax.crypto.SecretKey;
import okhttp3.Response;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vt.n0 f24480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qy.q f24481b = com.bumptech.glide.d.v(new cr.n(this, 11));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f24482c = (h) n.f24489a.b(h.class);

    public l(vt.n0 n0Var) {
        this.f24480a = n0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(SecretKey secretKey, SecretKey secretKey2, TypeToken typeToken, fz.c cVar, xy.c cVar2) {
        j jVar;
        Object success;
        if (cVar2 instanceof j) {
            jVar = (j) cVar2;
            int i11 = jVar.f24468f;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                jVar.f24468f = i11 - Integer.MIN_VALUE;
            } else {
                jVar = new j(this, cVar2);
            }
        } else {
            jVar = new j(this, cVar2);
        }
        Object objInvoke = jVar.f24466d;
        Object obj = wy.a.COROUTINE_SUSPENDED;
        int i12 = jVar.f24468f;
        try {
            if (i12 == 0) {
                com.bumptech.glide.e.F(objInvoke);
                jVar.f24463a = secretKey;
                jVar.f24464b = secretKey2;
                jVar.f24465c = typeToken;
                jVar.f24468f = 1;
                objInvoke = cVar.invoke(jVar);
                if (objInvoke == obj) {
                    return obj;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                typeToken = jVar.f24465c;
                secretKey2 = jVar.f24464b;
                secretKey = jVar.f24463a;
                com.bumptech.glide.e.F(objInvoke);
            }
            o20.t0 t0Var = (o20.t0) objInvoke;
            Response response = t0Var.f44598a;
            if (!response.R) {
                String str = response.f45160c;
                kotlin.jvm.internal.m.e(str, "message(...)");
                return new ApiResponse.Error(str, t0Var.f44598a.f45161d, null, 4, null);
            }
            String str2 = (String) t0Var.f44599b;
            if (str2 == null) {
                return new ApiResponse.Error("Empty response", 0, null, 6, null);
            }
            try {
                ((hv.a) this.f24481b.getValue()).getClass();
                ServerJsonResponse serverJsonResponse = (ServerJsonResponse) new Gson().fromJson(hv.a.b(str2, secretKey, secretKey2), typeToken.getType());
                if (serverJsonResponse == null || serverJsonResponse.getStatus() != -1) {
                    success = new ApiResponse.Success(serverJsonResponse.getResult());
                } else {
                    String error = serverJsonResponse.getError();
                    String json = new Gson().toJson(serverJsonResponse.getResult());
                    kotlin.jvm.internal.m.e(json, "toJson(...)");
                    success = new ApiResponse.Error(error, 0, json, 2, null);
                }
                return success;
            } catch (Exception e8) {
                e8.printStackTrace();
                return new ApiResponse.Error("JsonSyntaxException", 0, null, 6, null);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            String message = e10.getMessage();
            if (message == null) {
                message = "Unknown error";
            }
            return new ApiResponse.Error(message, 0, null, 6, null);
        }
    }
}
