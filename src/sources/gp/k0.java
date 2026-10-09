package gp;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class k0 implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f29416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f29417c;

    public /* synthetic */ k0(String str, String str2, int i11) {
        this.f29415a = i11;
        this.f29416b = str;
        this.f29417c = str2;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f29415a) {
            case 0:
                Bundle bundle = new Bundle();
                bundle.putString("type", this.f29416b);
                bundle.putString("value", this.f29417c);
                return bundle;
            default:
                Bundle bundle2 = new Bundle();
                bundle2.putString("type", this.f29416b);
                bundle2.putString("mode", this.f29417c);
                return bundle2;
        }
    }
}
