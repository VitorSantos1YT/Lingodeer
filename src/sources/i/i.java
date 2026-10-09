package i;

import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import java.util.Objects;
import kotlin.jvm.internal.m;
import mt.b6;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f33879a = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f33880b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f33881c = new LinkedHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f33882d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient LinkedHashMap f33883e = new LinkedHashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f33884f = new LinkedHashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Bundle f33885g = new Bundle();

    public final boolean a(int i11, int i12, Intent intent) {
        String str = (String) this.f33879a.get(Integer.valueOf(i11));
        if (str == null) {
            return false;
        }
        e eVar = (e) this.f33883e.get(str);
        if ((eVar != null ? eVar.f33870a : null) != null) {
            ArrayList arrayList = this.f33882d;
            if (arrayList.contains(str)) {
                eVar.f33870a.f(eVar.f33871b.c(intent, i12));
                arrayList.remove(str);
                return true;
            }
        }
        this.f33884f.remove(str);
        this.f33885g.putParcelable(str, new a(intent, i12));
        return true;
    }

    public abstract void b(int i11, j.a aVar, Object obj);

    public final h c(final String key, LifecycleOwner lifecycleOwner, final j.a contract, final b callback) {
        m.f(key, "key");
        m.f(contract, "contract");
        m.f(callback, "callback");
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        if (lifecycle.getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
            throw new IllegalStateException(("LifecycleOwner " + lifecycleOwner + " is attempting to register while current state is " + lifecycle.getCurrentState() + ". LifecycleOwners must call register before they are STARTED.").toString());
        }
        e(key);
        LinkedHashMap linkedHashMap = this.f33881c;
        f fVar = (f) linkedHashMap.get(key);
        if (fVar == null) {
            fVar = new f(lifecycle);
        }
        LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: i.d
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                i iVar = this.f33866a;
                LinkedHashMap linkedHashMap2 = iVar.f33883e;
                m.f(lifecycleOwner2, "<anonymous parameter 0>");
                m.f(event, "event");
                Lifecycle.Event event2 = Lifecycle.Event.ON_START;
                String str = key;
                if (event2 != event) {
                    if (Lifecycle.Event.ON_STOP == event) {
                        linkedHashMap2.remove(str);
                        return;
                    } else {
                        if (Lifecycle.Event.ON_DESTROY == event) {
                            iVar.f(str);
                            return;
                        }
                        return;
                    }
                }
                Bundle bundle = iVar.f33885g;
                LinkedHashMap linkedHashMap3 = iVar.f33884f;
                j.a aVar = contract;
                b bVar = callback;
                linkedHashMap2.put(str, new e(aVar, bVar));
                if (linkedHashMap3.containsKey(str)) {
                    Object obj = linkedHashMap3.get(str);
                    linkedHashMap3.remove(str);
                    bVar.f(obj);
                }
                a aVar2 = (a) hz.b.G(bundle, str, a.class);
                if (aVar2 != null) {
                    bundle.remove(str);
                    bVar.f(aVar.c(aVar2.f33865b, aVar2.f33864a));
                }
            }
        };
        fVar.f33872a.addObserver(lifecycleEventObserver);
        fVar.f33873b.add(lifecycleEventObserver);
        linkedHashMap.put(key, fVar);
        return new h(this, key, contract, 0);
    }

    public final h d(String key, j.a aVar, b bVar) {
        m.f(key, "key");
        e(key);
        this.f33883e.put(key, new e(aVar, bVar));
        LinkedHashMap linkedHashMap = this.f33884f;
        if (linkedHashMap.containsKey(key)) {
            Object obj = linkedHashMap.get(key);
            linkedHashMap.remove(key);
            bVar.f(obj);
        }
        Bundle bundle = this.f33885g;
        a aVar2 = (a) hz.b.G(bundle, key, a.class);
        if (aVar2 != null) {
            bundle.remove(key);
            bVar.f(aVar.c(aVar2.f33865b, aVar2.f33864a));
        }
        return new h(this, key, aVar, 1);
    }

    public final void e(String str) {
        LinkedHashMap linkedHashMap = this.f33880b;
        if (((Integer) linkedHashMap.get(str)) != null) {
            return;
        }
        for (Number number : new nz.a(new cz.i(1, g.f33874a, new b6(19)))) {
            Integer numValueOf = Integer.valueOf(number.intValue());
            LinkedHashMap linkedHashMap2 = this.f33879a;
            if (!linkedHashMap2.containsKey(numValueOf)) {
                int iIntValue = number.intValue();
                linkedHashMap2.put(Integer.valueOf(iIntValue), str);
                linkedHashMap.put(str, Integer.valueOf(iIntValue));
                return;
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    public final void f(String key) {
        Integer num;
        m.f(key, "key");
        if (!this.f33882d.contains(key) && (num = (Integer) this.f33880b.remove(key)) != null) {
            this.f33879a.remove(num);
        }
        this.f33883e.remove(key);
        LinkedHashMap linkedHashMap = this.f33884f;
        if (linkedHashMap.containsKey(key)) {
            Objects.toString(linkedHashMap.get(key));
            linkedHashMap.remove(key);
        }
        Bundle bundle = this.f33885g;
        if (bundle.containsKey(key)) {
            Objects.toString((a) hz.b.G(bundle, key, a.class));
            bundle.remove(key);
        }
        LinkedHashMap linkedHashMap2 = this.f33881c;
        f fVar = (f) linkedHashMap2.get(key);
        if (fVar != null) {
            ArrayList arrayList = fVar.f33873b;
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                fVar.f33872a.removeObserver((LifecycleEventObserver) obj);
            }
            arrayList.clear();
            linkedHashMap2.remove(key);
        }
    }
}
