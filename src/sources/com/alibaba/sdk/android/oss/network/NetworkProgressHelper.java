package com.alibaba.sdk.android.oss.network;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import ry.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class NetworkProgressHelper {
    public static ProgressTouchableRequestBody addProgressRequestBody(InputStream inputStream, long j11, String str, ExecutionContext executionContext) {
        return new ProgressTouchableRequestBody(inputStream, j11, str, executionContext);
    }

    public static OkHttpClient addProgressResponseListener(OkHttpClient okHttpClient, final ExecutionContext executionContext) {
        okHttpClient.getClass();
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.f45109a = okHttpClient.f45084a;
        builder.f45110b = okHttpClient.D;
        m.d0(builder.f45111c, okHttpClient.f45085b);
        List list = okHttpClient.f45086c;
        ArrayList arrayList = builder.f45112d;
        m.d0(arrayList, list);
        builder.f45113e = okHttpClient.f45087d;
        builder.f45114f = okHttpClient.f45088e;
        builder.f45115g = okHttpClient.f45089f;
        builder.f45116h = okHttpClient.f45090g;
        builder.f45117i = okHttpClient.f45091h;
        builder.f45118j = okHttpClient.f45092i;
        builder.f45119k = okHttpClient.f45093j;
        builder.f45120l = okHttpClient.f45094k;
        builder.m = okHttpClient.f45095l;
        builder.f45121n = okHttpClient.m;
        builder.f45122o = okHttpClient.f45096n;
        builder.f45123p = okHttpClient.f45097o;
        builder.f45124q = okHttpClient.f45098p;
        builder.f45125r = okHttpClient.f45099q;
        builder.f45126s = okHttpClient.f45100r;
        builder.f45127t = okHttpClient.f45101s;
        builder.f45128u = okHttpClient.f45102t;
        builder.f45129v = okHttpClient.f45103u;
        builder.f45130w = okHttpClient.f45104v;
        builder.f45131x = okHttpClient.f45105w;
        builder.f45132y = okHttpClient.f45106x;
        builder.f45133z = okHttpClient.f45107y;
        builder.A = okHttpClient.f45108z;
        builder.B = okHttpClient.A;
        builder.C = okHttpClient.B;
        builder.D = okHttpClient.C;
        arrayList.add(new Interceptor() { // from class: com.alibaba.sdk.android.oss.network.NetworkProgressHelper.1
            @Override // okhttp3.Interceptor
            public Response intercept(Interceptor.Chain chain) {
                Response responseA = chain.a(chain.e());
                Response.Builder builderA = responseA.a();
                builderA.f45171g = new ProgressTouchableResponseBody(responseA.f45164t, executionContext);
                return builderA.a();
            }
        });
        return new OkHttpClient(builder);
    }
}
