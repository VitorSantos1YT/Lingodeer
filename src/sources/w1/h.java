package w1;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleRegistry;
import cr.n;
import java.util.Map;
import s0.u;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements e, da.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f54466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public LifecycleRegistry f54467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public da.f f54468c;

    public h(f fVar) {
        this.f54466a = fVar;
        Object objB = fVar.b("androidx.savedstate.SavedStateRegistry");
        Bundle bundle = objB instanceof Bundle ? (Bundle) objB : null;
        if (bundle != null && this.f54468c == null) {
            da.f fVar2 = new da.f(new fa.a(this, new n(this, 3)));
            this.f54468c = fVar2;
            fVar2.a(bundle);
        }
        fVar.e("androidx.savedstate.SavedStateRegistry", new u(this, 19));
    }

    @Override // w1.e
    public final Map a() {
        return this.f54466a.a();
    }

    @Override // w1.e
    public final Object b(String str) {
        return this.f54466a.b(str);
    }

    @Override // w1.e
    public final boolean canBeSaved(Object obj) {
        return this.f54466a.canBeSaved(obj);
    }

    @Override // w1.e
    public final d e(String str, fz.a aVar) {
        return this.f54466a.e(str, aVar);
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        LifecycleRegistry lifecycleRegistry = this.f54467b;
        if (lifecycleRegistry != null) {
            return lifecycleRegistry;
        }
        LifecycleRegistry lifecycleRegistryCreateUnsafe = LifecycleRegistry.Companion.createUnsafe(this);
        this.f54467b = lifecycleRegistryCreateUnsafe;
        return lifecycleRegistryCreateUnsafe;
    }

    @Override // da.g
    public final da.e getSavedStateRegistry() {
        da.f fVar = this.f54468c;
        if (fVar == null) {
            da.f fVar2 = new da.f(new fa.a(this, new n(this, 3)));
            this.f54468c = fVar2;
            fVar2.a(null);
            fVar = fVar2;
        }
        return fVar.f23340b;
    }
}
