package da;

import android.os.Bundle;
import androidx.lifecycle.LegacySavedStateHandleController;
import androidx.lifecycle.SavedStateHandleSupport;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fa.a f23337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f23338b;

    public e(fa.a aVar) {
        this.f23337a = aVar;
    }

    public final Bundle a(String key) {
        m.f(key, "key");
        fa.a aVar = this.f23337a;
        if (!aVar.f27035g) {
            throw new IllegalStateException("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
        }
        Bundle bundle = aVar.f27034f;
        if (bundle == null) {
            return null;
        }
        Bundle bundleV = bundle.containsKey(key) ? com.bumptech.glide.f.v(key, bundle) : null;
        bundle.remove(key);
        if (bundle.isEmpty()) {
            aVar.f27034f = null;
        }
        return bundleV;
    }

    public final d b() {
        d dVar;
        fa.a aVar = this.f23337a;
        synchronized (aVar.f27031c) {
            Iterator it = aVar.f27032d.entrySet().iterator();
            do {
                dVar = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                d dVar2 = (d) entry.getValue();
                if (m.a(str, SavedStateHandleSupport.SAVED_STATE_KEY)) {
                    dVar = dVar2;
                }
            } while (dVar == null);
        }
        return dVar;
    }

    public final void c(String key, d provider) {
        m.f(key, "key");
        m.f(provider, "provider");
        fa.a aVar = this.f23337a;
        synchronized (aVar.f27031c) {
            if (aVar.f27032d.containsKey(key)) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            aVar.f27032d.put(key, provider);
        }
    }

    public final void d() {
        if (!this.f23337a.f27036h) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        a aVar = this.f23338b;
        if (aVar == null) {
            aVar = new a(this);
        }
        this.f23338b = aVar;
        try {
            LegacySavedStateHandleController.OnRecreation.class.getDeclaredConstructor(null);
            a aVar2 = this.f23338b;
            if (aVar2 != null) {
                ((LinkedHashSet) aVar2.f23335b).add(LegacySavedStateHandleController.OnRecreation.class.getName());
            }
        } catch (NoSuchMethodException e8) {
            throw new IllegalArgumentException("Class " + LegacySavedStateHandleController.OnRecreation.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e8);
        }
    }
}
