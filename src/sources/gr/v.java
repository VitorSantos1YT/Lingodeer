package gr;

import com.lingo.splash.SplashIndexActivity;
import dv.u0;
import kotlin.jvm.internal.z;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class v implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SplashIndexActivity f29752b;

    public /* synthetic */ v(SplashIndexActivity splashIndexActivity, int i11) {
        this.f29751a = i11;
        this.f29752b = splashIndexActivity;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f29751a) {
            case 0:
                return ef.e.q(this.f29752b).a(null, null, z.a(u0.class));
            default:
                SplashIndexActivity splashIndexActivity = this.f29752b;
                return i20.b.a(z.a(hr.d.class), splashIndexActivity.getViewModelStore(), null, splashIndexActivity.getDefaultViewModelCreationExtras(), null, ef.e.q(splashIndexActivity), null);
        }
    }
}
