package dv;

import android.content.Context;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.lingodeer.network.model.ApiResponse;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import javax.crypto.SecretKey;
import okhttp3.OkHttpClient;
import okhttp3.Response;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vt.n0 f24438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f24439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qy.q f24440c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f24441d;

    public d(Context context, vt.n0 n0Var) {
        this.f24438a = n0Var;
        OkHttpClient okHttpClient = x0.f24531a;
        o20.u0 u0Var = new o20.u0();
        u0Var.a("https://lambda.lingodeer.com/ai/");
        OkHttpClient okHttpClient2 = x0.f24531a;
        Objects.requireNonNull(okHttpClient2, "client == null");
        u0Var.f44604a = okHttpClient2;
        ArrayList arrayList = u0Var.f44606c;
        arrayList.add(hv.c.f33820a);
        arrayList.add(new q20.a(new Gson()));
        this.f24439b = (a) u0Var.b().b(a.class);
        this.f24440c = com.bumptech.glide.d.v(new cr.n(this, 10));
        this.f24441d = "Android-".concat(ks.b.c(context));
    }

    public final Object a(h00.e eVar, String str, String str2, h00.z zVar, xy.i iVar) {
        JsonObject jsonObject = new JsonObject();
        String strW = ((fr.o0) this.f24438a).w();
        vy.d dVar = null;
        if (strW.length() <= 0) {
            strW = null;
        }
        if (strW == null) {
            strW = "PandaTest123456";
        }
        jsonObject.addProperty("uid", strW);
        jsonObject.addProperty("model", str);
        jsonObject.add("messages", JsonParser.parseString(eVar.toString()));
        jsonObject.addProperty("systemInstruction", str2);
        jsonObject.add("options", JsonParser.parseString(zVar.toString()));
        jsonObject.addProperty("uversion", this.f24441d);
        qy.l lVarY = nv.p.y(jsonObject, "toJson(...)", (hv.a) this.f24440c.getValue());
        qy.l lVar = (qy.l) lVarY.f48496b;
        return b((SecretKey) lVar.f48495a, (SecretKey) lVar.f48496b, new b(0, this, lVarY, dVar), iVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(SecretKey secretKey, SecretKey secretKey2, b bVar, xy.c cVar) {
        c cVar2;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i11 = cVar2.f24436e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                cVar2.f24436e = i11 - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(this, cVar);
            }
        } else {
            cVar2 = new c(this, cVar);
        }
        Object objInvoke = cVar2.f24434c;
        Object obj = wy.a.COROUTINE_SUSPENDED;
        int i12 = cVar2.f24436e;
        try {
            if (i12 == 0) {
                com.bumptech.glide.e.F(objInvoke);
                cVar2.f24432a = secretKey;
                cVar2.f24433b = secretKey2;
                cVar2.f24436e = 1;
                objInvoke = bVar.invoke(cVar2);
                if (objInvoke == obj) {
                    return obj;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                secretKey2 = cVar2.f24433b;
                secretKey = cVar2.f24432a;
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
            ((hv.a) this.f24440c.getValue()).getClass();
            return f.a(hv.a.b(str2, secretKey, secretKey2));
        } catch (CancellationException e8) {
            throw e8;
        } catch (Exception e10) {
            String message = e10.getMessage();
            if (message == null) {
                message = "Unknown error";
            }
            return new ApiResponse.Error(message, 0, null, 6, null);
        }
    }
}
