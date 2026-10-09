package com.android.billingclient.api;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements ka.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f7461a;

    public b(String str) {
        this.f7461a = str;
    }

    @Override // ka.f
    public String a() {
        return this.f7461a;
    }

    public c7.a b() {
        if (this.f7461a == null) {
            throw new IllegalArgumentException("Product type must be set");
        }
        c7.a aVar = new c7.a();
        aVar.f6641a = this.f7461a;
        return aVar;
    }

    @Override // ka.f
    public void c(ka.e eVar) {
    }
}
