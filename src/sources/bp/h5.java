package bp;

import com.lingo.lingoskill.ui.base.SplashActivity;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class h5 implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SplashActivity f4624b;

    public /* synthetic */ h5(SplashActivity splashActivity, int i11) {
        this.f4623a = i11;
        this.f4624b = splashActivity;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f4623a) {
            case 0:
                return ef.e.q(this.f4624b).a(null, null, kotlin.jvm.internal.z.a(dr.f.class));
            case 1:
                return ef.e.q(this.f4624b).a(null, null, kotlin.jvm.internal.z.a(mr.e.class));
            default:
                return ef.e.q(this.f4624b).a(null, null, kotlin.jvm.internal.z.a(dr.p.class));
        }
    }
}
