package ql;

import okhttp3.OkHttpClient;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements ew.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public OkHttpClient f47805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public OkHttpClient.Builder f47806b;

    @Override // ew.c
    public final vv.a g(String str) {
        if (this.f47805a == null) {
            synchronized (a.class) {
                try {
                    if (this.f47805a == null) {
                        OkHttpClient.Builder builder = this.f47806b;
                        this.f47805a = builder != null ? new OkHttpClient(builder) : new OkHttpClient();
                        this.f47806b = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return new b(str, this.f47805a);
    }
}
