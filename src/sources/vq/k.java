package vq;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class k implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f54109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f54110c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f54111d;

    public /* synthetic */ k(String str, int i11, int i12, int i13) {
        this.f54108a = i13;
        this.f54109b = i11;
        this.f54110c = i12;
        this.f54111d = str;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f54108a) {
            case 0:
                Bundle bundle = new Bundle();
                bundle.putString("unit", "U" + this.f54109b);
                bundle.putString("lesson", "L" + this.f54110c);
                bundle.putString("status", "cancel");
                bundle.putString("mode", this.f54111d);
                return bundle;
            case 1:
                Bundle bundle2 = new Bundle();
                bundle2.putString("unit", "U" + this.f54109b);
                bundle2.putString("lesson", "L" + this.f54110c);
                bundle2.putString("status", "fail");
                bundle2.putString("mode", this.f54111d);
                return bundle2;
            default:
                Bundle bundle3 = new Bundle();
                bundle3.putString("unit", "U" + this.f54109b);
                bundle3.putString("lesson", "L" + this.f54110c);
                bundle3.putString("status", "success");
                bundle3.putString("mode", this.f54111d);
                return bundle3;
        }
    }
}
