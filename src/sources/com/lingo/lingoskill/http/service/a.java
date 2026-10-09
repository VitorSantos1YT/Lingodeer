package com.lingo.lingoskill.http.service;

import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import o20.k;
import o20.u0;
import o20.v0;
import okhttp3.OkHttpClient;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    public static v0 a(String str) {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.f45114f = true;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        builder.a(400L, timeUnit);
        builder.b(400L, timeUnit);
        builder.c(400L, timeUnit);
        OkHttpClient okHttpClient = new OkHttpClient(builder);
        u0 u0Var = new u0();
        u0Var.a(str);
        u0Var.f44604a = okHttpClient;
        ArrayList arrayList = u0Var.f44606c;
        arrayList.add(ql.d.f47812a);
        arrayList.add(new q20.a(new Gson()));
        u0Var.f44607d.add(new k(1));
        return u0Var.b();
    }
}
