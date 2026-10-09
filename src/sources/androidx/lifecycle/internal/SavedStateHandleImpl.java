package androidx.lifecycle.internal;

import android.os.Bundle;
import da.d;
import f.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import jh.h;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import qx.b;
import qy.l;
import ry.s;
import ry.x;
import uz.g1;
import uz.i1;
import uz.p0;
import uz.r0;
import uz.x0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class SavedStateHandleImpl {
    private final Map<String, p0> flows;
    private final Map<String, p0> mutableFlows;
    private final Map<String, d> providers;
    private final Map<String, Object> regular;
    private final d savedStateProvider;

    /* JADX WARN: Multi-variable type inference failed */
    public SavedStateHandleImpl() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle savedStateProvider$lambda$0(SavedStateHandleImpl savedStateHandleImpl) {
        l[] lVarArr;
        for (Map.Entry entry : x.h0(savedStateHandleImpl.mutableFlows).entrySet()) {
            savedStateHandleImpl.set((String) entry.getKey(), ((i1) ((p0) entry.getValue())).getValue());
        }
        for (Map.Entry entry2 : x.h0(savedStateHandleImpl.providers).entrySet()) {
            savedStateHandleImpl.set((String) entry2.getKey(), ((d) entry2.getValue()).saveState());
        }
        Map<String, Object> map = savedStateHandleImpl.regular;
        if (map.isEmpty()) {
            lVarArr = new l[0];
        } else {
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry<String, Object> entry3 : map.entrySet()) {
                arrayList.add(new l(entry3.getKey(), entry3.getValue()));
            }
            lVarArr = (l[]) arrayList.toArray(new l[0]);
        }
        return h.b((l[]) Arrays.copyOf(lVarArr, lVarArr.length));
    }

    public final void clearSavedStateProvider(String key) {
        m.f(key, "key");
        this.providers.remove(key);
    }

    public final boolean contains(String key) {
        m.f(key, "key");
        return this.regular.containsKey(key);
    }

    public final <T> T get(String key) {
        T t6;
        m.f(key, "key");
        try {
            p0 p0Var = this.mutableFlows.get(key);
            if (p0Var != null && (t6 = (T) ((i1) p0Var).getValue()) != null) {
                return t6;
            }
            return (T) this.regular.get(key);
        } catch (ClassCastException unused) {
            remove(key);
            return null;
        }
    }

    public final Map<String, p0> getMutableFlows() {
        return this.mutableFlows;
    }

    public final <T> p0 getMutableStateFlow(String key, T t6) {
        m.f(key, "key");
        Map<String, p0> map = this.mutableFlows;
        p0 p0VarC = map.get(key);
        if (p0VarC == null) {
            if (!this.regular.containsKey(key)) {
                this.regular.put(key, t6);
            }
            p0VarC = x0.c(this.regular.get(key));
            map.put(key, p0VarC);
        }
        return p0VarC;
    }

    public final Map<String, Object> getRegular() {
        return this.regular;
    }

    public final d getSavedStateProvider() {
        return this.savedStateProvider;
    }

    public final <T> g1 getStateFlow(String key, T t6) {
        m.f(key, "key");
        Map<String, p0> map = this.flows;
        p0 p0VarC = map.get(key);
        if (p0VarC == null) {
            if (!this.regular.containsKey(key)) {
                this.regular.put(key, t6);
            }
            p0VarC = x0.c(this.regular.get(key));
            map.put(key, p0VarC);
        }
        return new r0(p0VarC);
    }

    public final Set<String> keys() {
        return b.D(this.regular.keySet(), this.providers.keySet());
    }

    public final <T> T remove(String key) {
        m.f(key, "key");
        T t6 = (T) this.regular.remove(key);
        this.flows.remove(key);
        this.mutableFlows.remove(key);
        return t6;
    }

    public final d savedStateProvider() {
        return this.savedStateProvider;
    }

    public final <T> void set(String key, T t6) {
        m.f(key, "key");
        this.regular.put(key, t6);
        p0 p0Var = this.flows.get(key);
        if (p0Var != null) {
            ((i1) p0Var).k(t6);
        }
        p0 p0Var2 = this.mutableFlows.get(key);
        if (p0Var2 != null) {
            ((i1) p0Var2).k(t6);
        }
    }

    public final void setSavedStateProvider(String key, d provider) {
        m.f(key, "key");
        m.f(provider, "provider");
        this.providers.put(key, provider);
    }

    public SavedStateHandleImpl(Map<String, ? extends Object> initialState) {
        m.f(initialState, "initialState");
        this.regular = x.k0(initialState);
        this.providers = new LinkedHashMap();
        this.flows = new LinkedHashMap();
        this.mutableFlows = new LinkedHashMap();
        this.savedStateProvider = new e(this, 1);
    }

    public /* synthetic */ SavedStateHandleImpl(Map map, int i11, f fVar) {
        this((i11 & 1) != 0 ? s.f50855a : map);
    }
}
