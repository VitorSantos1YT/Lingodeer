package dv;

import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o20.v0 f24489a;

    static {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.f45111c.add(new m());
        TimeUnit timeUnit = TimeUnit.SECONDS;
        builder.a(30L, timeUnit);
        builder.b(30L, timeUnit);
        builder.c(30L, timeUnit);
        OkHttpClient okHttpClient = new OkHttpClient(builder);
        o20.u0 u0Var = new o20.u0();
        u0Var.a("https://azure.lingodeer.com/api/");
        u0Var.f44604a = okHttpClient;
        ArrayList arrayList = u0Var.f44606c;
        arrayList.add(hv.c.f33820a);
        arrayList.add(new q20.a(new Gson()));
        f24489a = u0Var.b();
    }
}
