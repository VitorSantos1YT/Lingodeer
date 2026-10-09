package e6;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class t extends kotlin.jvm.internal.n implements fz.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t f25048b = new t(0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25049a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(int i11, int i12) {
        super(i11);
        this.f25049a = i12;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f25049a) {
            case 0:
                return new Bundle();
            default:
                int i11 = t0.f25050a;
                return new z();
        }
    }
}
