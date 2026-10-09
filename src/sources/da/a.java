package da;

import android.os.Bundle;
import java.util.Arrays;
import java.util.LinkedHashSet;
import jh.h;
import qy.l;
import ry.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f23335b;

    public a(e eVar) {
        this.f23334a = 0;
        this.f23335b = new LinkedHashSet();
        eVar.c("androidx.savedstate.Restarter", this);
    }

    @Override // da.d
    public final Bundle saveState() {
        switch (this.f23334a) {
            case 0:
                Bundle bundleB = h.b((l[]) Arrays.copyOf(new l[0], 0));
                ef.e.y(bundleB, "classes_to_restore", m.a1((LinkedHashSet) this.f23335b));
                return bundleB;
            default:
                Bundle bundle = new Bundle();
                ((l.m) this.f23335b).getDelegate().getClass();
                return bundle;
        }
    }

    public a(l.m mVar) {
        this.f23334a = 1;
        this.f23335b = mVar;
    }
}
