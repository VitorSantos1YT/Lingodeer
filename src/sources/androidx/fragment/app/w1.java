package androidx.fragment.app;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f1861a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f1862b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f1863c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public o1 f1864d;

    public final void a(k0 k0Var) {
        if (this.f1861a.contains(k0Var)) {
            throw new IllegalStateException("Fragment already added: " + k0Var);
        }
        synchronized (this.f1861a) {
            this.f1861a.add(k0Var);
        }
        k0Var.mAdded = true;
    }

    public final k0 b(String str) {
        u1 u1Var = (u1) this.f1862b.get(str);
        if (u1Var != null) {
            return u1Var.f1846c;
        }
        return null;
    }

    public final k0 c(String str) {
        k0 k0VarFindFragmentByWho;
        for (u1 u1Var : this.f1862b.values()) {
            if (u1Var != null && (k0VarFindFragmentByWho = u1Var.f1846c.findFragmentByWho(str)) != null) {
                return k0VarFindFragmentByWho;
            }
        }
        return null;
    }

    public final ArrayList d() {
        ArrayList arrayList = new ArrayList();
        for (u1 u1Var : this.f1862b.values()) {
            if (u1Var != null) {
                arrayList.add(u1Var);
            }
        }
        return arrayList;
    }

    public final ArrayList e() {
        ArrayList arrayList = new ArrayList();
        for (u1 u1Var : this.f1862b.values()) {
            if (u1Var != null) {
                arrayList.add(u1Var.f1846c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public final List f() {
        ArrayList arrayList;
        if (this.f1861a.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (this.f1861a) {
            arrayList = new ArrayList(this.f1861a);
        }
        return arrayList;
    }

    public final void g(u1 u1Var) {
        k0 k0Var = u1Var.f1846c;
        String str = k0Var.mWho;
        HashMap map = this.f1862b;
        if (map.get(str) != null) {
            return;
        }
        map.put(k0Var.mWho, u1Var);
        if (k0Var.mRetainInstanceChangedWhileDetached) {
            if (k0Var.mRetainInstance) {
                this.f1864d.a(k0Var);
            } else {
                this.f1864d.c(k0Var);
            }
            k0Var.mRetainInstanceChangedWhileDetached = false;
        }
        if (k1.L(2)) {
            k0Var.toString();
        }
    }

    public final void h(u1 u1Var) {
        k0 k0Var = u1Var.f1846c;
        if (k0Var.mRetainInstance) {
            this.f1864d.c(k0Var);
        }
        String str = k0Var.mWho;
        HashMap map = this.f1862b;
        if (map.get(str) == u1Var && ((u1) map.put(k0Var.mWho, null)) != null && k1.L(2)) {
            k0Var.toString();
        }
    }

    public final Bundle i(String str, Bundle bundle) {
        HashMap map = this.f1863c;
        return bundle != null ? (Bundle) map.put(str, bundle) : (Bundle) map.remove(str);
    }
}
