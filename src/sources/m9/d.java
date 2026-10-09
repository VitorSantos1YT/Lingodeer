package m9;

import android.os.Bundle;
import java.util.Arrays;
import kotlin.jvm.internal.m;
import qy.l;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f41064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bundle f41065c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bundle f41066d;

    public d(j9.e eVar, int i11) {
        this.f41063a = eVar.f36192f;
        this.f41064b = i11;
        c cVar = eVar.H;
        this.f41065c = cVar.a();
        Bundle bundleB = jh.h.b((l[]) Arrays.copyOf(new l[0], 0));
        this.f41066d = bundleB;
        cVar.f41058h.b(bundleB);
    }

    public d(Bundle state) {
        m.f(state, "state");
        this.f41063a = com.bumptech.glide.f.w("nav-entry-state:id", state);
        this.f41064b = com.bumptech.glide.f.t("nav-entry-state:destination-id", state);
        this.f41065c = com.bumptech.glide.f.v("nav-entry-state:args", state);
        this.f41066d = com.bumptech.glide.f.v("nav-entry-state:saved-state", state);
    }
}
