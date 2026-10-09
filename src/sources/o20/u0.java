package o20;

import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import okhttp3.Call;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Call.Factory f44604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public HttpUrl f44605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f44606c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f44607d = new ArrayList();

    public final void a(String str) {
        Objects.requireNonNull(str, "baseUrl == null");
        HttpUrl.f45044j.getClass();
        HttpUrl httpUrlC = HttpUrl.Companion.c(str);
        ArrayList arrayList = httpUrlC.f45050f;
        if (BuildConfig.VERSION_NAME.equals(arrayList.get(arrayList.size() - 1))) {
            this.f44605b = httpUrlC;
        } else {
            throw new IllegalArgumentException("baseUrl must end in /: " + httpUrlC);
        }
    }

    public final v0 b() {
        if (this.f44605b == null) {
            throw new IllegalStateException("Base URL required.");
        }
        Call.Factory okHttpClient = this.f44604a;
        if (okHttpClient == null) {
            okHttpClient = new OkHttpClient();
        }
        Call.Factory factory = okHttpClient;
        a aVar = m0.f44533a;
        b bVar = m0.f44535c;
        ArrayList arrayList = new ArrayList(this.f44607d);
        List listA = bVar.a(aVar);
        arrayList.addAll(listA);
        List listB = bVar.b();
        int size = listB.size();
        ArrayList arrayList2 = this.f44606c;
        ArrayList arrayList3 = new ArrayList(arrayList2.size() + 1 + size);
        arrayList3.add(new c(0));
        arrayList3.addAll(arrayList2);
        arrayList3.addAll(listB);
        HttpUrl httpUrl = this.f44605b;
        List listUnmodifiableList = Collections.unmodifiableList(arrayList3);
        List listUnmodifiableList2 = Collections.unmodifiableList(arrayList);
        listA.size();
        return new v0(factory, httpUrl, listUnmodifiableList, listUnmodifiableList2, aVar);
    }
}
