package fu;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class x implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f28173b;

    public /* synthetic */ x(int i11, int i12) {
        this.f28172a = i12;
        this.f28173b = i11;
    }

    @Override // fz.a
    public final Object invoke() {
        int i11 = this.f28172a;
        int i12 = this.f28173b;
        switch (i11) {
            case 0:
                Bundle bundle = new Bundle();
                bundle.putString("numbers", String.valueOf(i12));
                return bundle;
            case 1:
                return com.bumptech.glide.d.G(Integer.valueOf(i12));
            case 2:
                return com.bumptech.glide.d.G(Integer.valueOf(i12));
            case 3:
                return com.bumptech.glide.d.G(Integer.valueOf(i12));
            case 4:
                return new l0.w(i12, 0);
            case 5:
                return com.bumptech.glide.d.G(Integer.valueOf(i12));
            default:
                int[] iArr = bq.r.f4959a;
                return Integer.valueOf(bq.m.f(i12).length);
        }
    }
}
