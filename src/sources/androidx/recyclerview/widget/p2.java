package androidx.recyclerview.widget;

import android.view.View;
import com.google.firebase.iid.QyE.SemtNwfPgIhi;
import com.lingo.lingoskill.http.oss.MYmT.bjXGJ;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class p2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2586c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2587d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2588e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f2589f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f2590g;

    public p2(int i11) {
        this.f2584a = 1;
        this.f2585b = i11;
        if (i11 <= 0) {
            z.a.c("maxSize <= 0");
            throw null;
        }
        this.f2589f = new t7.d(10, (byte) 0);
        this.f2590g = new re.e0(16);
    }

    public void a(View view) {
        m2 m2Var = (m2) view.getLayoutParams();
        m2Var.f2539e = this;
        ArrayList arrayList = (ArrayList) this.f2589f;
        arrayList.add(view);
        this.f2586c = Integer.MIN_VALUE;
        if (arrayList.size() == 1) {
            this.f2585b = Integer.MIN_VALUE;
        }
        if (m2Var.f2546a.isRemoved() || m2Var.f2546a.isUpdated()) {
            this.f2587d = ((StaggeredGridLayoutManager) this.f2590g).f2393c.c(view) + this.f2587d;
        }
    }

    public void b() {
        n2 n2VarY;
        View view = (View) nv.p.f(1, (ArrayList) this.f2589f);
        m2 m2Var = (m2) view.getLayoutParams();
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.f2590g;
        this.f2586c = staggeredGridLayoutManager.f2393c.b(view);
        if (m2Var.f2540f && (n2VarY = staggeredGridLayoutManager.O.y(m2Var.f2546a.getLayoutPosition())) != null && n2VarY.f2551b == 1) {
            int i11 = this.f2586c;
            int i12 = this.f2588e;
            int[] iArr = n2VarY.f2552c;
            this.f2586c = (iArr == null ? 0 : iArr[i12]) + i11;
        }
    }

    public void c() {
        n2 n2VarY;
        View view = (View) ((ArrayList) this.f2589f).get(0);
        m2 m2Var = (m2) view.getLayoutParams();
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.f2590g;
        this.f2585b = staggeredGridLayoutManager.f2393c.e(view);
        if (m2Var.f2540f && (n2VarY = staggeredGridLayoutManager.O.y(m2Var.f2546a.getLayoutPosition())) != null && n2VarY.f2551b == -1) {
            int i11 = this.f2585b;
            int i12 = this.f2588e;
            int[] iArr = n2VarY.f2552c;
            this.f2585b = i11 - (iArr != null ? iArr[i12] : 0);
        }
    }

    public void d() {
        ((ArrayList) this.f2589f).clear();
        this.f2585b = Integer.MIN_VALUE;
        this.f2586c = Integer.MIN_VALUE;
        this.f2587d = 0;
    }

    public Object e(Object key) {
        kotlin.jvm.internal.m.f(key, "key");
        return null;
    }

    public void f(Object key, Object oldValue, Object obj) {
        kotlin.jvm.internal.m.f(key, "key");
        kotlin.jvm.internal.m.f(oldValue, "oldValue");
    }

    public int g() {
        ArrayList arrayList = (ArrayList) this.f2589f;
        return ((StaggeredGridLayoutManager) this.f2590g).H ? i(arrayList.size() - 1, -1, false, false, true) : i(0, arrayList.size(), false, false, true);
    }

    public int h() {
        ArrayList arrayList = (ArrayList) this.f2589f;
        return ((StaggeredGridLayoutManager) this.f2590g).H ? i(0, arrayList.size(), false, false, true) : i(arrayList.size() - 1, -1, false, false, true);
    }

    public int i(int i11, int i12, boolean z11, boolean z12, boolean z13) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.f2590g;
        int iK = staggeredGridLayoutManager.f2393c.k();
        int iG = staggeredGridLayoutManager.f2393c.g();
        int i13 = i12 > i11 ? 1 : -1;
        while (i11 != i12) {
            View view = (View) ((ArrayList) this.f2589f).get(i11);
            int iE = staggeredGridLayoutManager.f2393c.e(view);
            int iB = staggeredGridLayoutManager.f2393c.b(view);
            boolean z14 = false;
            boolean z15 = !z13 ? iE >= iG : iE > iG;
            if (!z13 ? iB > iK : iB >= iK) {
                z14 = true;
            }
            if (z15 && z14) {
                if (z11 && z12) {
                    if (iE >= iK && iB <= iG) {
                        return staggeredGridLayoutManager.getPosition(view);
                    }
                } else {
                    if (z12) {
                        return staggeredGridLayoutManager.getPosition(view);
                    }
                    if (iE < iK || iB > iG) {
                        return staggeredGridLayoutManager.getPosition(view);
                    }
                }
            }
            i11 += i13;
        }
        return -1;
    }

    public Object j(Object key) {
        Object objPut;
        kotlin.jvm.internal.m.f(key, "key");
        synchronized (((re.e0) this.f2590g)) {
            t7.d dVar = (t7.d) this.f2589f;
            dVar.getClass();
            Object obj = ((LinkedHashMap) dVar.f52059b).get(key);
            if (obj != null) {
                this.f2587d++;
                return obj;
            }
            this.f2588e++;
            Object objE = e(key);
            if (objE == null) {
                return null;
            }
            synchronized (((re.e0) this.f2590g)) {
                t7.d dVar2 = (t7.d) this.f2589f;
                dVar2.getClass();
                objPut = ((LinkedHashMap) dVar2.f52059b).put(key, objE);
                if (objPut != null) {
                    t7.d dVar3 = (t7.d) this.f2589f;
                    dVar3.getClass();
                    ((LinkedHashMap) dVar3.f52059b).put(key, objPut);
                } else {
                    this.f2586c += s(key, objE);
                }
            }
            if (objPut != null) {
                f(key, objE, objPut);
                return objPut;
            }
            u(this.f2585b);
            return objE;
        }
    }

    public int k(int i11) {
        int i12 = this.f2586c;
        if (i12 != Integer.MIN_VALUE) {
            return i12;
        }
        if (((ArrayList) this.f2589f).size() == 0) {
            return i11;
        }
        b();
        return this.f2586c;
    }

    public View l(int i11, int i12) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.f2590g;
        ArrayList arrayList = (ArrayList) this.f2589f;
        View view = null;
        if (i12 != -1) {
            int size = arrayList.size() - 1;
            while (size >= 0) {
                View view2 = (View) arrayList.get(size);
                if ((staggeredGridLayoutManager.H && staggeredGridLayoutManager.getPosition(view2) >= i11) || ((!staggeredGridLayoutManager.H && staggeredGridLayoutManager.getPosition(view2) <= i11) || !view2.hasFocusable())) {
                    break;
                }
                size--;
                view = view2;
            }
            return view;
        }
        int size2 = arrayList.size();
        int i13 = 0;
        while (i13 < size2) {
            View view3 = (View) arrayList.get(i13);
            if ((staggeredGridLayoutManager.H && staggeredGridLayoutManager.getPosition(view3) <= i11) || ((!staggeredGridLayoutManager.H && staggeredGridLayoutManager.getPosition(view3) >= i11) || !view3.hasFocusable())) {
                break;
            }
            i13++;
            view = view3;
        }
        return view;
    }

    public int m(int i11) {
        int i12 = this.f2585b;
        if (i12 != Integer.MIN_VALUE) {
            return i12;
        }
        if (((ArrayList) this.f2589f).size() == 0) {
            return i11;
        }
        c();
        return this.f2585b;
    }

    public void n() {
        ArrayList arrayList = (ArrayList) this.f2589f;
        int size = arrayList.size();
        View view = (View) arrayList.remove(size - 1);
        m2 m2Var = (m2) view.getLayoutParams();
        m2Var.f2539e = null;
        if (m2Var.f2546a.isRemoved() || m2Var.f2546a.isUpdated()) {
            this.f2587d -= ((StaggeredGridLayoutManager) this.f2590g).f2393c.c(view);
        }
        if (size == 1) {
            this.f2585b = Integer.MIN_VALUE;
        }
        this.f2586c = Integer.MIN_VALUE;
    }

    public void o() {
        ArrayList arrayList = (ArrayList) this.f2589f;
        View view = (View) arrayList.remove(0);
        m2 m2Var = (m2) view.getLayoutParams();
        m2Var.f2539e = null;
        if (arrayList.size() == 0) {
            this.f2586c = Integer.MIN_VALUE;
        }
        if (m2Var.f2546a.isRemoved() || m2Var.f2546a.isUpdated()) {
            this.f2587d -= ((StaggeredGridLayoutManager) this.f2590g).f2393c.c(view);
        }
        this.f2585b = Integer.MIN_VALUE;
    }

    public void p(View view) {
        m2 m2Var = (m2) view.getLayoutParams();
        m2Var.f2539e = this;
        ArrayList arrayList = (ArrayList) this.f2589f;
        arrayList.add(0, view);
        this.f2585b = Integer.MIN_VALUE;
        if (arrayList.size() == 1) {
            this.f2586c = Integer.MIN_VALUE;
        }
        if (m2Var.f2546a.isRemoved() || m2Var.f2546a.isUpdated()) {
            this.f2587d = ((StaggeredGridLayoutManager) this.f2590g).f2393c.c(view) + this.f2587d;
        }
    }

    public Object r(Object key) {
        Object objRemove;
        kotlin.jvm.internal.m.f(key, "key");
        synchronized (((re.e0) this.f2590g)) {
            t7.d dVar = (t7.d) this.f2589f;
            dVar.getClass();
            objRemove = ((LinkedHashMap) dVar.f52059b).remove(key);
            if (objRemove != null) {
                this.f2586c -= s(key, objRemove);
            }
        }
        if (objRemove != null) {
            f(key, objRemove, null);
        }
        return objRemove;
    }

    public int s(Object obj, Object obj2) {
        int iT = t(obj, obj2);
        if (iT >= 0) {
            return iT;
        }
        String message = "Negative size: " + obj + '=' + obj2;
        kotlin.jvm.internal.m.f(message, "message");
        throw new IllegalStateException(message);
    }

    public int t(Object key, Object value) {
        kotlin.jvm.internal.m.f(key, "key");
        kotlin.jvm.internal.m.f(value, "value");
        return 1;
    }

    public String toString() {
        String str;
        switch (this.f2584a) {
            case 1:
                synchronized (((re.e0) this.f2590g)) {
                    try {
                        int i11 = this.f2587d;
                        int i12 = this.f2588e + i11;
                        str = "LruCache[maxSize=" + this.f2585b + ",hits=" + this.f2587d + ",misses=" + this.f2588e + ",hitRate=" + (i12 != 0 ? (i11 * 100) / i12 : 0) + "%]";
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return str;
            default:
                return super.toString();
        }
    }

    public Object q(Object obj, Object value) {
        Object objPut;
        kotlin.jvm.internal.m.f(obj, bjXGJ.JJInoViOyI);
        kotlin.jvm.internal.m.f(value, "value");
        synchronized (((re.e0) this.f2590g)) {
            this.f2586c += s(obj, value);
            t7.d dVar = (t7.d) this.f2589f;
            dVar.getClass();
            objPut = ((LinkedHashMap) dVar.f52059b).put(obj, value);
            if (objPut != null) {
                this.f2586c -= s(obj, objPut);
            }
        }
        if (objPut != null) {
            f(obj, objPut, value);
        }
        u(this.f2585b);
        return objPut;
    }

    public void u(int i11) {
        Object key;
        Object value;
        while (true) {
            synchronized (((re.e0) this.f2590g)) {
                try {
                    if (this.f2586c < 0 || (((LinkedHashMap) ((t7.d) this.f2589f).f52059b).isEmpty() && this.f2586c != 0)) {
                        break;
                    }
                    if (this.f2586c > i11 && !((LinkedHashMap) ((t7.d) this.f2589f).f52059b).isEmpty()) {
                        Set setEntrySet = ((LinkedHashMap) ((t7.d) this.f2589f).f52059b).entrySet();
                        kotlin.jvm.internal.m.e(setEntrySet, SemtNwfPgIhi.IsEXyQxyZt);
                        Map.Entry entry = (Map.Entry) ry.m.r0(setEntrySet);
                        if (entry == null) {
                            return;
                        }
                        key = entry.getKey();
                        value = entry.getValue();
                        t7.d dVar = (t7.d) this.f2589f;
                        dVar.getClass();
                        kotlin.jvm.internal.m.f(key, "key");
                        ((LinkedHashMap) dVar.f52059b).remove(key);
                        this.f2586c -= s(key, value);
                    }
                    return;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            f(key, value, null);
        }
        throw new IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
    }

    public p2(StaggeredGridLayoutManager staggeredGridLayoutManager, int i11) {
        this.f2584a = 0;
        this.f2590g = staggeredGridLayoutManager;
        this.f2589f = new ArrayList();
        this.f2585b = Integer.MIN_VALUE;
        this.f2586c = Integer.MIN_VALUE;
        this.f2587d = 0;
        this.f2588e = i11;
    }
}
