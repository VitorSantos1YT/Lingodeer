package m9;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.SavedStateViewModelFactory;
import cr.n;
import j9.j;
import j9.q;
import java.util.Arrays;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.z;
import qy.l;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j9.e f41051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f41052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bundle f41053c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Lifecycle.State f41054d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j f41055e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f41056f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Bundle f41057g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final da.f f41058h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f41059i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LifecycleRegistry f41060j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Lifecycle.State f41061k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final SavedStateViewModelFactory f41062l;
    public final qy.q m;

    public c(j9.e eVar) {
        this.f41051a = eVar;
        this.f41052b = eVar.f36188b;
        this.f41053c = eVar.f36189c;
        this.f41054d = eVar.f36190d;
        this.f41055e = eVar.f36191e;
        this.f41056f = eVar.f36192f;
        this.f41057g = eVar.f36193t;
        this.f41058h = new da.f(new fa.a(eVar, new n(eVar, 3)));
        qy.q qVarV = com.bumptech.glide.d.v(new ju.d(13));
        this.f41060j = new LifecycleRegistry(eVar);
        this.f41061k = Lifecycle.State.INITIALIZED;
        this.f41062l = (SavedStateViewModelFactory) qVarV.getValue();
        this.m = com.bumptech.glide.d.v(new ju.d(14));
    }

    public final Bundle a() {
        Bundle bundle = this.f41053c;
        if (bundle == null) {
            return null;
        }
        Bundle bundleB = jh.h.b((l[]) Arrays.copyOf(new l[0], 0));
        bundleB.putAll(bundle);
        return bundleB;
    }

    public final void b() {
        if (!this.f41059i) {
            da.f fVar = this.f41058h;
            fVar.f23339a.a();
            this.f41059i = true;
            if (this.f41055e != null) {
                SavedStateHandleSupport.enableSavedStateHandles(this.f41051a);
            }
            fVar.a(this.f41057g);
        }
        int iOrdinal = this.f41054d.ordinal();
        int iOrdinal2 = this.f41061k.ordinal();
        LifecycleRegistry lifecycleRegistry = this.f41060j;
        if (iOrdinal < iOrdinal2) {
            lifecycleRegistry.setCurrentState(this.f41054d);
        } else {
            lifecycleRegistry.setCurrentState(this.f41061k);
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(z.a(j9.e.class).g());
        sb2.append("(" + this.f41056f + ')');
        sb2.append(" destination=");
        sb2.append(this.f41052b);
        String string = sb2.toString();
        m.e(string, "toString(...)");
        return string;
    }
}
