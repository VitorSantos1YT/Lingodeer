package dv;

import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final OkHttpClient f24531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o20.v0 f24532b;

    static {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.f45111c.add(new w0());
        TimeUnit timeUnit = TimeUnit.SECONDS;
        builder.a(60L, timeUnit);
        builder.b(60L, timeUnit);
        builder.c(60L, timeUnit);
        OkHttpClient okHttpClient = new OkHttpClient(builder);
        f24531a = okHttpClient;
        o20.u0 u0Var = new o20.u0();
        u0Var.a("https://lambda.lingodeer.com/v3/");
        u0Var.f44604a = okHttpClient;
        ArrayList arrayList = u0Var.f44606c;
        arrayList.add(hv.c.f33820a);
        arrayList.add(new q20.a(new Gson()));
        f24532b = u0Var.b();
    }
}
