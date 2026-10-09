package androidx.fragment.app;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import com.lingodeer.R;
import com.tbruyelle.rxpermissions3.BuildConfig;
import fr.p3;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k1 {
    public k0 A;
    public i.h D;
    public i.h E;
    public i.h F;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public ArrayList M;
    public ArrayList N;
    public ArrayList O;
    public o1 P;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f1710b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f1713e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public f.d0 f1715g;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y0 f1725r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y0 f1726s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y0 f1727t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final y0 f1728u;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public u0 f1731x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public s0 f1732y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public k0 f1733z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f1709a = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w1 f1711c = new w1();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f1712d = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final w0 f1714f = new w0(this);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a f1716h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f1717i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final a1 f1718j = new a1(this);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AtomicInteger f1719k = new AtomicInteger();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Map f1720l = Collections.synchronizedMap(new HashMap());
    public final Map m = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Map f1721n = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ArrayList f1722o = new ArrayList();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final q0 f1723p = new q0(this);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final CopyOnWriteArrayList f1724q = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final b1 f1729v = new b1(this);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f1730w = -1;
    public final c1 B = new c1(this);
    public final p3 C = new p3(1);
    public ArrayDeque G = new ArrayDeque();
    public final t Q = new t(this, 2);

    /* JADX WARN: Type inference failed for: r0v17, types: [androidx.fragment.app.y0] */
    /* JADX WARN: Type inference failed for: r0v18, types: [androidx.fragment.app.y0] */
    /* JADX WARN: Type inference failed for: r0v19, types: [androidx.fragment.app.y0] */
    /* JADX WARN: Type inference failed for: r0v20, types: [androidx.fragment.app.y0] */
    public k1() {
        final int i11 = 0;
        this.f1725r = new y4.a(this) { // from class: androidx.fragment.app.y0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k1 f1877b;

            {
                this.f1877b = this;
            }

            @Override // y4.a
            public final void accept(Object obj) {
                switch (i11) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        k1 k1Var = this.f1877b;
                        if (k1Var.N()) {
                            k1Var.i(false, configuration);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        k1 k1Var2 = this.f1877b;
                        if (k1Var2.N() && num.intValue() == 80) {
                            k1Var2.m(false);
                            break;
                        }
                        break;
                    case 2:
                        n4.i iVar = (n4.i) obj;
                        k1 k1Var3 = this.f1877b;
                        if (k1Var3.N()) {
                            k1Var3.n(iVar.f43199a, false);
                        }
                        break;
                    default:
                        n4.w wVar = (n4.w) obj;
                        k1 k1Var4 = this.f1877b;
                        if (k1Var4.N()) {
                            k1Var4.s(wVar.f43231a, false);
                        }
                        break;
                }
            }
        };
        final int i12 = 1;
        this.f1726s = new y4.a(this) { // from class: androidx.fragment.app.y0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k1 f1877b;

            {
                this.f1877b = this;
            }

            @Override // y4.a
            public final void accept(Object obj) {
                switch (i12) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        k1 k1Var = this.f1877b;
                        if (k1Var.N()) {
                            k1Var.i(false, configuration);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        k1 k1Var2 = this.f1877b;
                        if (k1Var2.N() && num.intValue() == 80) {
                            k1Var2.m(false);
                            break;
                        }
                        break;
                    case 2:
                        n4.i iVar = (n4.i) obj;
                        k1 k1Var3 = this.f1877b;
                        if (k1Var3.N()) {
                            k1Var3.n(iVar.f43199a, false);
                        }
                        break;
                    default:
                        n4.w wVar = (n4.w) obj;
                        k1 k1Var4 = this.f1877b;
                        if (k1Var4.N()) {
                            k1Var4.s(wVar.f43231a, false);
                        }
                        break;
                }
            }
        };
        final int i13 = 2;
        this.f1727t = new y4.a(this) { // from class: androidx.fragment.app.y0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k1 f1877b;

            {
                this.f1877b = this;
            }

            @Override // y4.a
            public final void accept(Object obj) {
                switch (i13) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        k1 k1Var = this.f1877b;
                        if (k1Var.N()) {
                            k1Var.i(false, configuration);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        k1 k1Var2 = this.f1877b;
                        if (k1Var2.N() && num.intValue() == 80) {
                            k1Var2.m(false);
                            break;
                        }
                        break;
                    case 2:
                        n4.i iVar = (n4.i) obj;
                        k1 k1Var3 = this.f1877b;
                        if (k1Var3.N()) {
                            k1Var3.n(iVar.f43199a, false);
                        }
                        break;
                    default:
                        n4.w wVar = (n4.w) obj;
                        k1 k1Var4 = this.f1877b;
                        if (k1Var4.N()) {
                            k1Var4.s(wVar.f43231a, false);
                        }
                        break;
                }
            }
        };
        final int i14 = 3;
        this.f1728u = new y4.a(this) { // from class: androidx.fragment.app.y0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k1 f1877b;

            {
                this.f1877b = this;
            }

            @Override // y4.a
            public final void accept(Object obj) {
                switch (i14) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        k1 k1Var = this.f1877b;
                        if (k1Var.N()) {
                            k1Var.i(false, configuration);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        k1 k1Var2 = this.f1877b;
                        if (k1Var2.N() && num.intValue() == 80) {
                            k1Var2.m(false);
                            break;
                        }
                        break;
                    case 2:
                        n4.i iVar = (n4.i) obj;
                        k1 k1Var3 = this.f1877b;
                        if (k1Var3.N()) {
                            k1Var3.n(iVar.f43199a, false);
                        }
                        break;
                    default:
                        n4.w wVar = (n4.w) obj;
                        k1 k1Var4 = this.f1877b;
                        if (k1Var4.N()) {
                            k1Var4.s(wVar.f43231a, false);
                        }
                        break;
                }
            }
        };
    }

    public static k1 E(View view) {
        p0 p0Var;
        k0 k0Var;
        View view2 = view;
        while (true) {
            p0Var = null;
            if (view2 == null) {
                k0Var = null;
                break;
            }
            Object tag = view2.getTag(R.id.fragment_container_view_tag);
            k0Var = tag instanceof k0 ? (k0) tag : null;
            if (k0Var != null) {
                break;
            }
            Object parent = view2.getParent();
            view2 = parent instanceof View ? (View) parent : null;
        }
        if (k0Var != null) {
            if (k0Var.isAdded()) {
                return k0Var.getChildFragmentManager();
            }
            throw new IllegalStateException("The Fragment " + k0Var + " that owns View " + view + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof p0) {
                p0Var = (p0) context;
                break;
            }
        }
        if (p0Var != null) {
            return p0Var.getSupportFragmentManager();
        }
        throw new IllegalStateException("View " + view + " is not within a subclass of FragmentActivity.");
    }

    public static HashSet G(a aVar) {
        HashSet hashSet = new HashSet();
        for (int i11 = 0; i11 < aVar.f1891a.size(); i11++) {
            k0 k0Var = ((y1) aVar.f1891a.get(i11)).f1879b;
            if (k0Var != null && aVar.f1897g) {
                hashSet.add(k0Var);
            }
        }
        return hashSet;
    }

    public static boolean L(int i11) {
        return Log.isLoggable("FragmentManager", i11);
    }

    public static boolean M(k0 k0Var) {
        if (k0Var.mHasMenu && k0Var.mMenuVisible) {
            return true;
        }
        ArrayList arrayListE = k0Var.mChildFragmentManager.f1711c.e();
        int size = arrayListE.size();
        boolean zM = false;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayListE.get(i11);
            i11++;
            k0 k0Var2 = (k0) obj;
            if (k0Var2 != null) {
                zM = M(k0Var2);
            }
            if (zM) {
                return true;
            }
        }
        return false;
    }

    public static boolean O(k0 k0Var) {
        if (k0Var == null) {
            return true;
        }
        k1 k1Var = k0Var.mFragmentManager;
        return k0Var.equals(k1Var.A) && O(k1Var.f1733z);
    }

    public final void A(a aVar, boolean z11) {
        if (z11 && (this.f1731x == null || this.K)) {
            return;
        }
        y(z11);
        a aVar2 = this.f1716h;
        if (aVar2 != null) {
            aVar2.f1610s = false;
            aVar2.g();
            if (L(3)) {
                Objects.toString(this.f1716h);
                Objects.toString(aVar);
            }
            this.f1716h.i(false, false);
            this.f1716h.a(this.M, this.N);
            ArrayList arrayList = this.f1716h.f1891a;
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                k0 k0Var = ((y1) obj).f1879b;
                if (k0Var != null) {
                    k0Var.mTransitioning = false;
                }
            }
            this.f1716h = null;
        }
        aVar.a(this.M, this.N);
        this.f1710b = true;
        try {
            Y(this.M, this.N);
            d();
            i0();
            boolean z12 = this.L;
            w1 w1Var = this.f1711c;
            if (z12) {
                this.L = false;
                ArrayList arrayListD = w1Var.d();
                int size2 = arrayListD.size();
                int i12 = 0;
                while (i12 < size2) {
                    Object obj2 = arrayListD.get(i12);
                    i12++;
                    u1 u1Var = (u1) obj2;
                    k0 k0Var2 = u1Var.f1846c;
                    if (k0Var2.mDeferStart) {
                        if (this.f1710b) {
                            this.L = true;
                        } else {
                            k0Var2.mDeferStart = false;
                            u1Var.i();
                        }
                    }
                }
            }
            w1Var.f1862b.values().removeAll(Collections.singleton(null));
        } catch (Throwable th2) {
            d();
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0223 A[PHI: r15
      0x0223: PHI (r15v14 int) = (r15v13 int), (r15v16 int) binds: [B:100:0x0210, B:104:0x021a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x0175  */
    /* JADX WARN: Code duplicated, block: B:66:0x017b  */
    public final void B(ArrayList arrayList, ArrayList arrayList2, int i11, int i12) {
        int i13;
        boolean z11;
        int i14;
        boolean z12;
        int i15;
        int i16;
        int i17 = i11;
        boolean z13 = ((a) arrayList.get(i17)).f1905p;
        ArrayList arrayList3 = this.O;
        if (arrayList3 == null) {
            this.O = new ArrayList();
        } else {
            arrayList3.clear();
        }
        ArrayList arrayList4 = this.O;
        w1 w1Var = this.f1711c;
        arrayList4.addAll(w1Var.f());
        k0 k0Var = this.A;
        int i18 = i17;
        boolean z14 = false;
        while (true) {
            int i19 = 1;
            if (i18 >= i12) {
                boolean z15 = z13;
                boolean z16 = z14;
                this.O.clear();
                if (!z15 && this.f1730w >= 1) {
                    for (int i21 = i17; i21 < i12; i21++) {
                        ArrayList arrayList5 = ((a) arrayList.get(i21)).f1891a;
                        int size = arrayList5.size();
                        int i22 = 0;
                        while (i22 < size) {
                            Object obj = arrayList5.get(i22);
                            i22++;
                            k0 k0Var2 = ((y1) obj).f1879b;
                            if (k0Var2 != null && k0Var2.mFragmentManager != null) {
                                w1Var.g(g(k0Var2));
                            }
                        }
                    }
                }
                int i23 = i17;
                while (i23 < i12) {
                    a aVar = (a) arrayList.get(i23);
                    if (((Boolean) arrayList2.get(i23)).booleanValue()) {
                        aVar.f(-1);
                        k1 k1Var = aVar.f1609r;
                        ArrayList arrayList6 = aVar.f1891a;
                        boolean z17 = true;
                        for (int size2 = arrayList6.size() - 1; size2 >= 0; size2--) {
                            y1 y1Var = (y1) arrayList6.get(size2);
                            k0 k0Var3 = y1Var.f1879b;
                            if (k0Var3 != null) {
                                k0Var3.mBeingSaved = false;
                                k0Var3.setPopDirection(z17);
                                int i24 = aVar.f1896f;
                                int i25 = 8194;
                                int i26 = 4097;
                                if (i24 != 4097) {
                                    if (i24 != 8194) {
                                        i25 = 4100;
                                        if (i24 != 8197) {
                                            i26 = 4099;
                                            if (i24 != 4099) {
                                                i25 = i24 != 4100 ? 0 : 8197;
                                            } else {
                                                i25 = i26;
                                            }
                                        }
                                    } else {
                                        i25 = i26;
                                    }
                                }
                                k0Var3.setNextTransition(i25);
                                k0Var3.setSharedElementNames(aVar.f1904o, aVar.f1903n);
                            }
                            switch (y1Var.f1878a) {
                                case 1:
                                    k0Var3.setAnimations(y1Var.f1881d, y1Var.f1882e, y1Var.f1883f, y1Var.f1884g);
                                    z17 = true;
                                    k1Var.d0(k0Var3, true);
                                    k1Var.X(k0Var3);
                                    break;
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + y1Var.f1878a);
                                case 3:
                                    k0Var3.setAnimations(y1Var.f1881d, y1Var.f1882e, y1Var.f1883f, y1Var.f1884g);
                                    k1Var.a(k0Var3);
                                    z17 = true;
                                    break;
                                case 4:
                                    k0Var3.setAnimations(y1Var.f1881d, y1Var.f1882e, y1Var.f1883f, y1Var.f1884g);
                                    k1Var.getClass();
                                    if (L(2)) {
                                        Objects.toString(k0Var3);
                                    }
                                    if (k0Var3.mHidden) {
                                        k0Var3.mHidden = false;
                                        k0Var3.mHiddenChanged = !k0Var3.mHiddenChanged;
                                    }
                                    z17 = true;
                                    break;
                                case 5:
                                    k0Var3.setAnimations(y1Var.f1881d, y1Var.f1882e, y1Var.f1883f, y1Var.f1884g);
                                    k1Var.d0(k0Var3, true);
                                    if (L(2)) {
                                        Objects.toString(k0Var3);
                                    }
                                    if (!k0Var3.mHidden) {
                                        k0Var3.mHidden = true;
                                        k0Var3.mHiddenChanged = !k0Var3.mHiddenChanged;
                                        k1Var.g0(k0Var3);
                                    }
                                    z17 = true;
                                    break;
                                case 6:
                                    k0Var3.setAnimations(y1Var.f1881d, y1Var.f1882e, y1Var.f1883f, y1Var.f1884g);
                                    k1Var.c(k0Var3);
                                    z17 = true;
                                    break;
                                case 7:
                                    k0Var3.setAnimations(y1Var.f1881d, y1Var.f1882e, y1Var.f1883f, y1Var.f1884g);
                                    k1Var.d0(k0Var3, true);
                                    k1Var.h(k0Var3);
                                    z17 = true;
                                    break;
                                case 8:
                                    k1Var.f0(null);
                                    z17 = true;
                                    break;
                                case 9:
                                    k1Var.f0(k0Var3);
                                    z17 = true;
                                    break;
                                case 10:
                                    y1Var.f1886i = k0Var3.mMaxState;
                                    k1Var.e0(k0Var3, y1Var.f1885h);
                                    z17 = true;
                                    break;
                            }
                        }
                    } else {
                        aVar.f(1);
                        k1 k1Var2 = aVar.f1609r;
                        ArrayList arrayList7 = aVar.f1891a;
                        int size3 = arrayList7.size();
                        int i27 = 0;
                        while (i27 < size3) {
                            y1 y1Var2 = (y1) arrayList7.get(i27);
                            k0 k0Var4 = y1Var2.f1879b;
                            if (k0Var4 != null) {
                                k0Var4.mBeingSaved = false;
                                k0Var4.setPopDirection(false);
                                k0Var4.setNextTransition(aVar.f1896f);
                                k0Var4.setSharedElementNames(aVar.f1903n, aVar.f1904o);
                            }
                            switch (y1Var2.f1878a) {
                                case 1:
                                    i13 = i23;
                                    k0Var4.setAnimations(y1Var2.f1881d, y1Var2.f1882e, y1Var2.f1883f, y1Var2.f1884g);
                                    k1Var2.d0(k0Var4, false);
                                    k1Var2.a(k0Var4);
                                    i27++;
                                    i23 = i13;
                                    break;
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + y1Var2.f1878a);
                                case 3:
                                    i13 = i23;
                                    k0Var4.setAnimations(y1Var2.f1881d, y1Var2.f1882e, y1Var2.f1883f, y1Var2.f1884g);
                                    k1Var2.X(k0Var4);
                                    i27++;
                                    i23 = i13;
                                    break;
                                case 4:
                                    i13 = i23;
                                    k0Var4.setAnimations(y1Var2.f1881d, y1Var2.f1882e, y1Var2.f1883f, y1Var2.f1884g);
                                    k1Var2.getClass();
                                    if (L(2)) {
                                        Objects.toString(k0Var4);
                                    }
                                    if (!k0Var4.mHidden) {
                                        k0Var4.mHidden = true;
                                        k0Var4.mHiddenChanged = !k0Var4.mHiddenChanged;
                                        k1Var2.g0(k0Var4);
                                    }
                                    i27++;
                                    i23 = i13;
                                    break;
                                case 5:
                                    i13 = i23;
                                    k0Var4.setAnimations(y1Var2.f1881d, y1Var2.f1882e, y1Var2.f1883f, y1Var2.f1884g);
                                    k1Var2.d0(k0Var4, false);
                                    if (L(2)) {
                                        Objects.toString(k0Var4);
                                    }
                                    if (k0Var4.mHidden) {
                                        k0Var4.mHidden = false;
                                        k0Var4.mHiddenChanged = !k0Var4.mHiddenChanged;
                                    }
                                    i27++;
                                    i23 = i13;
                                    break;
                                case 6:
                                    i13 = i23;
                                    k0Var4.setAnimations(y1Var2.f1881d, y1Var2.f1882e, y1Var2.f1883f, y1Var2.f1884g);
                                    k1Var2.h(k0Var4);
                                    i27++;
                                    i23 = i13;
                                    break;
                                case 7:
                                    i13 = i23;
                                    k0Var4.setAnimations(y1Var2.f1881d, y1Var2.f1882e, y1Var2.f1883f, y1Var2.f1884g);
                                    k1Var2.d0(k0Var4, false);
                                    k1Var2.c(k0Var4);
                                    i27++;
                                    i23 = i13;
                                    break;
                                case 8:
                                    k1Var2.f0(k0Var4);
                                    i13 = i23;
                                    i27++;
                                    i23 = i13;
                                    break;
                                case 9:
                                    k1Var2.f0(null);
                                    i13 = i23;
                                    i27++;
                                    i23 = i13;
                                    break;
                                case 10:
                                    y1Var2.f1885h = k0Var4.mMaxState;
                                    k1Var2.e0(k0Var4, y1Var2.f1886i);
                                    i13 = i23;
                                    i27++;
                                    i23 = i13;
                                    break;
                            }
                        }
                    }
                    i23++;
                }
                boolean zBooleanValue = ((Boolean) arrayList2.get(i12 - 1)).booleanValue();
                ArrayList arrayList8 = this.f1722o;
                if (z16 && !arrayList8.isEmpty()) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    int size4 = arrayList.size();
                    int i28 = 0;
                    while (i28 < size4) {
                        Object obj2 = arrayList.get(i28);
                        i28++;
                        linkedHashSet.addAll(G((a) obj2));
                    }
                    if (this.f1716h == null) {
                        int size5 = arrayList8.size();
                        int i29 = 0;
                        while (i29 < size5) {
                            Object obj3 = arrayList8.get(i29);
                            i29++;
                            if (obj3 != null) {
                                throw new ClassCastException();
                            }
                            Iterator it = linkedHashSet.iterator();
                            if (it.hasNext()) {
                                throw null;
                            }
                        }
                        int size6 = arrayList8.size();
                        int i30 = 0;
                        while (i30 < size6) {
                            Object obj4 = arrayList8.get(i30);
                            i30++;
                            if (obj4 != null) {
                                throw new ClassCastException();
                            }
                            Iterator it2 = linkedHashSet.iterator();
                            if (it2.hasNext()) {
                                throw null;
                            }
                        }
                    }
                }
                for (int i31 = i17; i31 < i12; i31++) {
                    a aVar2 = (a) arrayList.get(i31);
                    if (zBooleanValue) {
                        for (int size7 = aVar2.f1891a.size() - 1; size7 >= 0; size7--) {
                            k0 k0Var5 = ((y1) aVar2.f1891a.get(size7)).f1879b;
                            if (k0Var5 != null) {
                                g(k0Var5).i();
                            }
                        }
                    } else {
                        ArrayList arrayList9 = aVar2.f1891a;
                        int size8 = arrayList9.size();
                        int i32 = 0;
                        while (i32 < size8) {
                            Object obj5 = arrayList9.get(i32);
                            i32++;
                            k0 k0Var6 = ((y1) obj5).f1879b;
                            if (k0Var6 != null) {
                                g(k0Var6).i();
                            }
                        }
                    }
                }
                Q(this.f1730w, true);
                for (s sVar : f(arrayList, i17, i12)) {
                    sVar.f1830e = zBooleanValue;
                    sVar.l();
                    sVar.e();
                }
                while (i17 < i12) {
                    a aVar3 = (a) arrayList.get(i17);
                    if (((Boolean) arrayList2.get(i17)).booleanValue() && aVar3.f1611t >= 0) {
                        aVar3.f1611t = -1;
                    }
                    if (aVar3.f1906q != null) {
                        for (int i33 = 0; i33 < aVar3.f1906q.size(); i33++) {
                            ((Runnable) aVar3.f1906q.get(i33)).run();
                        }
                        aVar3.f1906q = null;
                    }
                    i17++;
                }
                if (z16 && arrayList8.size() > 0) {
                    throw hh.p0.e(0, arrayList8);
                }
                return;
            }
            a aVar4 = (a) arrayList.get(i18);
            if (((Boolean) arrayList2.get(i18)).booleanValue()) {
                z11 = z13;
                i14 = i18;
                z12 = z14;
                int i34 = 1;
                ArrayList arrayList10 = this.O;
                ArrayList arrayList11 = aVar4.f1891a;
                int size9 = arrayList11.size() - 1;
                while (size9 >= 0) {
                    y1 y1Var3 = (y1) arrayList11.get(size9);
                    int i35 = y1Var3.f1878a;
                    if (i35 == i34) {
                        arrayList10.remove(y1Var3.f1879b);
                    } else if (i35 != 3) {
                        switch (i35) {
                            case 6:
                                arrayList10.add(y1Var3.f1879b);
                                break;
                            case 7:
                                arrayList10.remove(y1Var3.f1879b);
                                break;
                            case 8:
                                k0Var = null;
                                break;
                            case 9:
                                k0Var = y1Var3.f1879b;
                                break;
                            case 10:
                                y1Var3.f1886i = y1Var3.f1885h;
                                break;
                        }
                    } else {
                        arrayList10.add(y1Var3.f1879b);
                    }
                    size9--;
                    i34 = 1;
                }
            } else {
                ArrayList arrayList12 = this.O;
                ArrayList arrayList13 = aVar4.f1891a;
                int i36 = 0;
                while (i36 < arrayList13.size()) {
                    y1 y1Var4 = (y1) arrayList13.get(i36);
                    boolean z18 = z13;
                    int i37 = y1Var4.f1878a;
                    if (i37 != i19) {
                        if (i37 != 2) {
                            if (i37 == 3 || i37 == 6) {
                                i18 = i18;
                                arrayList12.remove(y1Var4.f1879b);
                                k0 k0Var7 = y1Var4.f1879b;
                                if (k0Var7 == k0Var) {
                                    arrayList13.add(i36, new y1(k0Var7, 9));
                                    i36++;
                                    k0Var = null;
                                }
                                i15 = 1;
                            } else if (i37 == 7) {
                                i15 = 1;
                            } else if (i37 != 8) {
                                i18 = i18;
                            } else {
                                i18 = i18;
                                arrayList13.add(i36, new y1(9, k0Var, 0));
                                y1Var4.f1880c = true;
                                i36++;
                                k0Var = y1Var4.f1879b;
                            }
                            i15 = 1;
                        } else {
                            i18 = i18;
                            k0 k0Var8 = y1Var4.f1879b;
                            int i38 = k0Var8.mContainerId;
                            int size10 = arrayList12.size() - 1;
                            boolean z19 = false;
                            while (size10 >= 0) {
                                boolean z20 = z14;
                                k0 k0Var9 = (k0) arrayList12.get(size10);
                                int i39 = size10;
                                if (k0Var9.mContainerId != i38) {
                                    i38 = i38;
                                } else if (k0Var9 == k0Var8) {
                                    i38 = i38;
                                    z19 = true;
                                } else {
                                    if (k0Var9 == k0Var) {
                                        i16 = 0;
                                        arrayList13.add(i36, new y1(9, k0Var9, 0));
                                        i36++;
                                        k0Var = null;
                                    } else {
                                        i16 = 0;
                                    }
                                    y1 y1Var5 = new y1(3, k0Var9, i16);
                                    y1Var5.f1881d = y1Var4.f1881d;
                                    y1Var5.f1883f = y1Var4.f1883f;
                                    y1Var5.f1882e = y1Var4.f1882e;
                                    y1Var5.f1884g = y1Var4.f1884g;
                                    arrayList13.add(i36, y1Var5);
                                    arrayList12.remove(k0Var9);
                                    i36++;
                                    k0Var = k0Var;
                                }
                                size10 = i39 - 1;
                                i38 = i38;
                                z14 = z20;
                            }
                            z14 = z14;
                            i15 = 1;
                            if (z19) {
                                arrayList13.remove(i36);
                                i36--;
                            } else {
                                y1Var4.f1878a = 1;
                                y1Var4.f1880c = true;
                                arrayList12.add(k0Var8);
                            }
                        }
                        i36 += i15;
                        i19 = i15;
                        z13 = z18;
                        i18 = i18;
                        z14 = z14;
                    } else {
                        i15 = i19;
                    }
                    z14 = z14;
                    arrayList12.add(y1Var4.f1879b);
                    i36 += i15;
                    i19 = i15;
                    z13 = z18;
                    i18 = i18;
                    z14 = z14;
                }
                z11 = z13;
                i14 = i18;
                z12 = z14;
            }
            z14 = z12 || aVar4.f1897g;
            i18 = i14 + 1;
            z13 = z11;
        }
    }

    public final k0 C(int i11) {
        w1 w1Var = this.f1711c;
        ArrayList arrayList = w1Var.f1861a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            k0 k0Var = (k0) arrayList.get(size);
            if (k0Var != null && k0Var.mFragmentId == i11) {
                return k0Var;
            }
        }
        for (u1 u1Var : w1Var.f1862b.values()) {
            if (u1Var != null) {
                k0 k0Var2 = u1Var.f1846c;
                if (k0Var2.mFragmentId == i11) {
                    return k0Var2;
                }
            }
        }
        return null;
    }

    public final k0 D(String str) {
        w1 w1Var = this.f1711c;
        ArrayList arrayList = w1Var.f1861a;
        if (str != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                k0 k0Var = (k0) arrayList.get(size);
                if (k0Var != null && str.equals(k0Var.mTag)) {
                    return k0Var;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (u1 u1Var : w1Var.f1862b.values()) {
            if (u1Var != null) {
                k0 k0Var2 = u1Var.f1846c;
                if (str.equals(k0Var2.mTag)) {
                    return k0Var2;
                }
            }
        }
        return null;
    }

    public final void F() {
        for (s sVar : e()) {
            if (sVar.f1831f) {
                sVar.f1831f = false;
                sVar.e();
            }
        }
    }

    public final k0 H(String str, Bundle bundle) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        k0 k0VarB = this.f1711c.b(string);
        if (k0VarB != null) {
            return k0VarB;
        }
        h0(new IllegalStateException(defpackage.e.n("Fragment no longer exists for key ", str, ": unique id ", string)));
        throw null;
    }

    public final ViewGroup I(k0 k0Var) {
        ViewGroup viewGroup = k0Var.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (k0Var.mContainerId <= 0 || !this.f1732y.c()) {
            return null;
        }
        View viewB = this.f1732y.b(k0Var.mContainerId);
        if (viewB instanceof ViewGroup) {
            return (ViewGroup) viewB;
        }
        return null;
    }

    public final c1 J() {
        k0 k0Var = this.f1733z;
        return k0Var != null ? k0Var.mFragmentManager.J() : this.B;
    }

    public final p3 K() {
        k0 k0Var = this.f1733z;
        return k0Var != null ? k0Var.mFragmentManager.K() : this.C;
    }

    public final boolean N() {
        k0 k0Var = this.f1733z;
        if (k0Var == null) {
            return true;
        }
        return k0Var.isAdded() && this.f1733z.getParentFragmentManager().N();
    }

    public final boolean P() {
        return this.I || this.J;
    }

    public final void Q(int i11, boolean z11) {
        u0 u0Var;
        if (this.f1731x == null && i11 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z11 || i11 != this.f1730w) {
            this.f1730w = i11;
            w1 w1Var = this.f1711c;
            HashMap map = w1Var.f1862b;
            ArrayList arrayList = w1Var.f1861a;
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList.get(i12);
                i12++;
                u1 u1Var = (u1) map.get(((k0) obj).mWho);
                if (u1Var != null) {
                    u1Var.i();
                }
            }
            for (u1 u1Var2 : map.values()) {
                if (u1Var2 != null) {
                    u1Var2.i();
                    k0 k0Var = u1Var2.f1846c;
                    if (k0Var.mRemoving && !k0Var.isInBackStack()) {
                        if (k0Var.mBeingSaved && !w1Var.f1863c.containsKey(k0Var.mWho)) {
                            w1Var.i(k0Var.mWho, u1Var2.l());
                        }
                        w1Var.h(u1Var2);
                    }
                }
            }
            ArrayList arrayListD = w1Var.d();
            int size2 = arrayListD.size();
            int i13 = 0;
            while (i13 < size2) {
                Object obj2 = arrayListD.get(i13);
                i13++;
                u1 u1Var3 = (u1) obj2;
                k0 k0Var2 = u1Var3.f1846c;
                if (k0Var2.mDeferStart) {
                    if (this.f1710b) {
                        this.L = true;
                    } else {
                        k0Var2.mDeferStart = false;
                        u1Var3.i();
                    }
                }
            }
            if (this.H && (u0Var = this.f1731x) != null && this.f1730w == 7) {
                ((o0) u0Var).f1774e.invalidateMenu();
                this.H = false;
            }
        }
    }

    public final void R() {
        if (this.f1731x == null) {
            return;
        }
        this.I = false;
        this.J = false;
        this.P.f1781f = false;
        for (k0 k0Var : this.f1711c.f()) {
            if (k0Var != null) {
                k0Var.noteStateNotSaved();
            }
        }
    }

    public final void S(FragmentContainerView fragmentContainerView) {
        View view;
        ArrayList arrayListD = this.f1711c.d();
        int size = arrayListD.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayListD.get(i11);
            i11++;
            u1 u1Var = (u1) obj;
            k0 k0Var = u1Var.f1846c;
            if (k0Var.mContainerId == fragmentContainerView.getId() && (view = k0Var.mView) != null && view.getParent() == null) {
                k0Var.mContainer = fragmentContainerView;
                u1Var.a();
                u1Var.i();
            }
        }
    }

    public final boolean T() {
        return U(-1, 0);
    }

    public final boolean U(int i11, int i12) {
        z(false);
        y(true);
        k0 k0Var = this.A;
        if (k0Var != null && i11 < 0 && k0Var.getChildFragmentManager().T()) {
            return true;
        }
        boolean zV = V(this.M, this.N, i11, i12);
        if (zV) {
            this.f1710b = true;
            try {
                Y(this.M, this.N);
                d();
            } catch (Throwable th2) {
                d();
                throw th2;
            }
        }
        i0();
        boolean z11 = this.L;
        w1 w1Var = this.f1711c;
        if (z11) {
            this.L = false;
            ArrayList arrayListD = w1Var.d();
            int size = arrayListD.size();
            int i13 = 0;
            while (i13 < size) {
                Object obj = arrayListD.get(i13);
                i13++;
                u1 u1Var = (u1) obj;
                k0 k0Var2 = u1Var.f1846c;
                if (k0Var2.mDeferStart) {
                    if (this.f1710b) {
                        this.L = true;
                    } else {
                        k0Var2.mDeferStart = false;
                        u1Var.i();
                    }
                }
            }
        }
        w1Var.f1862b.values().removeAll(Collections.singleton(null));
        return zV;
    }

    public final boolean V(ArrayList arrayList, ArrayList arrayList2, int i11, int i12) {
        boolean z11 = (i12 & 1) != 0;
        int size = -1;
        if (!this.f1712d.isEmpty()) {
            if (i11 < 0) {
                size = z11 ? 0 : this.f1712d.size() - 1;
            } else {
                int size2 = this.f1712d.size() - 1;
                while (size2 >= 0) {
                    a aVar = (a) this.f1712d.get(size2);
                    if (i11 >= 0 && i11 == aVar.f1611t) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    size = size2;
                } else if (z11) {
                    size = size2;
                    while (size > 0) {
                        a aVar2 = (a) this.f1712d.get(size - 1);
                        if (i11 < 0 || i11 != aVar2.f1611t) {
                            break;
                        }
                        size--;
                    }
                } else if (size2 != this.f1712d.size() - 1) {
                    size = size2 + 1;
                }
            }
        }
        if (size < 0) {
            return false;
        }
        for (int size3 = this.f1712d.size() - 1; size3 >= size; size3--) {
            arrayList.add((a) this.f1712d.remove(size3));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void W(Bundle bundle, String str, k0 k0Var) {
        if (k0Var.mFragmentManager == this) {
            bundle.putString(str, k0Var.mWho);
        } else {
            h0(new IllegalStateException(defpackage.e.l("Fragment ", k0Var, " is not currently in the FragmentManager")));
            throw null;
        }
    }

    public final void X(k0 k0Var) {
        if (L(2)) {
            Objects.toString(k0Var);
        }
        boolean zIsInBackStack = k0Var.isInBackStack();
        if (k0Var.mDetached && zIsInBackStack) {
            return;
        }
        w1 w1Var = this.f1711c;
        synchronized (w1Var.f1861a) {
            w1Var.f1861a.remove(k0Var);
        }
        k0Var.mAdded = false;
        if (M(k0Var)) {
            this.H = true;
        }
        k0Var.mRemoving = true;
        g0(k0Var);
    }

    public final void Y(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i11 = 0;
        int i12 = 0;
        while (i11 < size) {
            if (!((a) arrayList.get(i11)).f1905p) {
                if (i12 != i11) {
                    B(arrayList, arrayList2, i12, i11);
                }
                i12 = i11 + 1;
                if (((Boolean) arrayList2.get(i11)).booleanValue()) {
                    while (i12 < size && ((Boolean) arrayList2.get(i12)).booleanValue() && !((a) arrayList.get(i12)).f1905p) {
                        i12++;
                    }
                }
                B(arrayList, arrayList2, i11, i12);
                i11 = i12 - 1;
            }
            i11++;
        }
        if (i12 != size) {
            B(arrayList, arrayList2, i12, size);
        }
    }

    public final void Z(Bundle bundle) {
        q0 q0Var;
        int i11;
        int i12;
        u1 u1Var;
        Bundle bundle2;
        Bundle bundle3;
        Bundle bundle4;
        for (String str : bundle.keySet()) {
            if (str.startsWith("result_") && (bundle4 = bundle.getBundle(str)) != null) {
                bundle4.setClassLoader(this.f1731x.f1841b.getClassLoader());
                this.m.put(str.substring(7), bundle4);
            }
        }
        HashMap map = new HashMap();
        for (String str2 : bundle.keySet()) {
            if (str2.startsWith("fragment_") && (bundle3 = bundle.getBundle(str2)) != null) {
                bundle3.setClassLoader(this.f1731x.f1841b.getClassLoader());
                map.put(str2.substring(9), bundle3);
            }
        }
        w1 w1Var = this.f1711c;
        HashMap map2 = w1Var.f1863c;
        HashMap map3 = w1Var.f1862b;
        map2.clear();
        map2.putAll(map);
        m1 m1Var = (m1) bundle.getParcelable("state");
        if (m1Var == null) {
            return;
        }
        map3.clear();
        ArrayList arrayList = m1Var.f1747a;
        int size = arrayList.size();
        int i13 = 0;
        while (true) {
            q0Var = this.f1723p;
            i11 = 2;
            if (i13 >= size) {
                break;
            }
            Object obj = arrayList.get(i13);
            i13++;
            Bundle bundleI = w1Var.i((String) obj, null);
            if (bundleI != null) {
                k0 k0Var = (k0) this.P.f1776a.get(((r1) bundleI.getParcelable("state")).f1819b);
                if (k0Var != null) {
                    if (L(2)) {
                        k0Var.toString();
                    }
                    u1Var = new u1(q0Var, w1Var, k0Var, bundleI);
                    bundle2 = bundleI;
                } else {
                    u1Var = new u1(this.f1723p, this.f1711c, this.f1731x.f1841b.getClassLoader(), J(), bundleI);
                    bundle2 = bundleI;
                }
                k0 k0Var2 = u1Var.f1846c;
                k0Var2.mSavedFragmentState = bundle2;
                k0Var2.mFragmentManager = this;
                if (L(2)) {
                    k0Var2.toString();
                }
                u1Var.j(this.f1731x.f1841b.getClassLoader());
                w1Var.g(u1Var);
                u1Var.f1848e = this.f1730w;
            }
        }
        o1 o1Var = this.P;
        o1Var.getClass();
        ArrayList arrayList2 = new ArrayList(o1Var.f1776a.values());
        int size2 = arrayList2.size();
        int i14 = 0;
        while (i14 < size2) {
            Object obj2 = arrayList2.get(i14);
            i14++;
            k0 k0Var3 = (k0) obj2;
            if (map3.get(k0Var3.mWho) == null) {
                if (L(2)) {
                    k0Var3.toString();
                    Objects.toString(m1Var.f1747a);
                }
                this.P.c(k0Var3);
                k0Var3.mFragmentManager = this;
                u1 u1Var2 = new u1(q0Var, w1Var, k0Var3);
                u1Var2.f1848e = 1;
                u1Var2.i();
                k0Var3.mRemoving = true;
                u1Var2.i();
            }
        }
        ArrayList arrayList3 = m1Var.f1748b;
        w1Var.f1861a.clear();
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            int i15 = 0;
            while (i15 < size3) {
                Object obj3 = arrayList3.get(i15);
                i15++;
                String str3 = (String) obj3;
                k0 k0VarB = w1Var.b(str3);
                if (k0VarB == null) {
                    throw new IllegalStateException(ep.a.g("No instantiated fragment for (", str3, ")"));
                }
                if (L(2)) {
                    k0VarB.toString();
                }
                w1Var.a(k0VarB);
            }
        }
        if (m1Var.f1749c != null) {
            this.f1712d = new ArrayList(m1Var.f1749c.length);
            int i16 = 0;
            while (true) {
                b[] bVarArr = m1Var.f1749c;
                if (i16 >= bVarArr.length) {
                    break;
                }
                b bVar = bVarArr[i16];
                ArrayList arrayList4 = bVar.f1617b;
                a aVar = new a(this);
                int[] iArr = bVar.f1616a;
                int i17 = 0;
                int i18 = 0;
                while (i17 < iArr.length) {
                    y1 y1Var = new y1();
                    int i19 = i17 + 1;
                    y1Var.f1878a = iArr[i17];
                    if (L(i11)) {
                        Objects.toString(aVar);
                        int i21 = iArr[i19];
                    }
                    int i22 = i11;
                    y1Var.f1885h = Lifecycle.State.values()[bVar.f1618c[i18]];
                    y1Var.f1886i = Lifecycle.State.values()[bVar.f1619d[i18]];
                    int i23 = i17 + 2;
                    y1Var.f1880c = iArr[i19] != 0;
                    int i24 = iArr[i23];
                    y1Var.f1881d = i24;
                    int i25 = iArr[i17 + 3];
                    y1Var.f1882e = i25;
                    int i26 = i17 + 5;
                    int i27 = iArr[i17 + 4];
                    y1Var.f1883f = i27;
                    i17 += 6;
                    int i28 = iArr[i26];
                    y1Var.f1884g = i28;
                    aVar.f1892b = i24;
                    aVar.f1893c = i25;
                    aVar.f1894d = i27;
                    aVar.f1895e = i28;
                    aVar.c(y1Var);
                    i18++;
                    i11 = i22;
                }
                int i29 = i11;
                aVar.f1896f = bVar.f1620e;
                aVar.f1899i = bVar.f1621f;
                aVar.f1897g = true;
                aVar.f1900j = bVar.H;
                aVar.f1901k = bVar.K;
                aVar.f1902l = bVar.L;
                aVar.m = bVar.M;
                aVar.f1903n = bVar.N;
                aVar.f1904o = bVar.O;
                aVar.f1905p = bVar.P;
                aVar.f1611t = bVar.f1622t;
                for (int i30 = 0; i30 < arrayList4.size(); i30++) {
                    String str4 = (String) arrayList4.get(i30);
                    if (str4 != null) {
                        ((y1) aVar.f1891a.get(i30)).f1879b = w1Var.b(str4);
                    }
                }
                aVar.f(1);
                if (L(i29)) {
                    aVar.toString();
                    PrintWriter printWriter = new PrintWriter(new j2());
                    aVar.k("  ", printWriter, false);
                    printWriter.close();
                }
                this.f1712d.add(aVar);
                i16++;
                i11 = i29;
            }
            i12 = 0;
        } else {
            i12 = 0;
            this.f1712d = new ArrayList();
        }
        this.f1719k.set(m1Var.f1750d);
        String str5 = m1Var.f1751e;
        if (str5 != null) {
            k0 k0VarB2 = w1Var.b(str5);
            this.A = k0VarB2;
            r(k0VarB2);
        }
        ArrayList arrayList5 = m1Var.f1752f;
        if (arrayList5 != null) {
            while (i12 < arrayList5.size()) {
                this.f1720l.put((String) arrayList5.get(i12), (c) m1Var.f1753t.get(i12));
                i12++;
            }
        }
        this.G = new ArrayDeque(m1Var.H);
    }

    public final u1 a(k0 k0Var) {
        String str = k0Var.mPreviousWho;
        if (str != null) {
            a6.b.c(k0Var, str);
        }
        if (L(2)) {
            k0Var.toString();
        }
        u1 u1VarG = g(k0Var);
        k0Var.mFragmentManager = this;
        w1 w1Var = this.f1711c;
        w1Var.g(u1VarG);
        if (!k0Var.mDetached) {
            w1Var.a(k0Var);
            k0Var.mRemoving = false;
            if (k0Var.mView == null) {
                k0Var.mHiddenChanged = false;
            }
            if (M(k0Var)) {
                this.H = true;
            }
        }
        return u1VarG;
    }

    public final Bundle a0() {
        int i11;
        ArrayList arrayList;
        b[] bVarArr;
        Bundle bundle = new Bundle();
        F();
        w();
        z(true);
        this.I = true;
        this.P.f1781f = true;
        w1 w1Var = this.f1711c;
        w1Var.getClass();
        HashMap map = w1Var.f1862b;
        ArrayList arrayList2 = new ArrayList(map.size());
        for (u1 u1Var : map.values()) {
            if (u1Var != null) {
                k0 k0Var = u1Var.f1846c;
                w1Var.i(k0Var.mWho, u1Var.l());
                arrayList2.add(k0Var.mWho);
                if (L(2)) {
                    k0Var.toString();
                    Objects.toString(k0Var.mSavedFragmentState);
                }
            }
        }
        HashMap map2 = this.f1711c.f1863c;
        if (!map2.isEmpty()) {
            w1 w1Var2 = this.f1711c;
            synchronized (w1Var2.f1861a) {
                try {
                    if (w1Var2.f1861a.isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(w1Var2.f1861a.size());
                        ArrayList arrayList3 = w1Var2.f1861a;
                        int size = arrayList3.size();
                        int i12 = 0;
                        while (i12 < size) {
                            Object obj = arrayList3.get(i12);
                            i12++;
                            k0 k0Var2 = (k0) obj;
                            arrayList.add(k0Var2.mWho);
                            if (L(2)) {
                                k0Var2.toString();
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            int size2 = this.f1712d.size();
            if (size2 > 0) {
                bVarArr = new b[size2];
                for (i11 = 0; i11 < size2; i11++) {
                    bVarArr[i11] = new b((a) this.f1712d.get(i11));
                    if (L(2)) {
                        Objects.toString(this.f1712d.get(i11));
                    }
                }
            } else {
                bVarArr = null;
            }
            m1 m1Var = new m1();
            m1Var.f1751e = null;
            ArrayList arrayList4 = new ArrayList();
            m1Var.f1752f = arrayList4;
            ArrayList arrayList5 = new ArrayList();
            m1Var.f1753t = arrayList5;
            m1Var.f1747a = arrayList2;
            m1Var.f1748b = arrayList;
            m1Var.f1749c = bVarArr;
            m1Var.f1750d = this.f1719k.get();
            k0 k0Var3 = this.A;
            if (k0Var3 != null) {
                m1Var.f1751e = k0Var3.mWho;
            }
            arrayList4.addAll(this.f1720l.keySet());
            arrayList5.addAll(this.f1720l.values());
            m1Var.H = new ArrayList(this.G);
            bundle.putParcelable("state", m1Var);
            for (String str : this.m.keySet()) {
                bundle.putBundle(ep.a.e("result_", str), (Bundle) this.m.get(str));
            }
            for (String str2 : map2.keySet()) {
                bundle.putBundle(ep.a.e("fragment_", str2), (Bundle) map2.get(str2));
            }
        }
        return bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(u0 u0Var, s0 s0Var, k0 k0Var) {
        LifecycleOwner lifecycleOwner;
        if (this.f1731x != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f1731x = u0Var;
        this.f1732y = s0Var;
        this.f1733z = k0Var;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f1724q;
        if (k0Var != null) {
            copyOnWriteArrayList.add(new d1(k0Var));
        } else if (u0Var instanceof p1) {
            copyOnWriteArrayList.add((p1) u0Var);
        }
        if (this.f1733z != null) {
            i0();
        }
        if (u0Var instanceof f.f0) {
            f.f0 f0Var = (f.f0) u0Var;
            f.d0 onBackPressedDispatcher = f0Var.getOnBackPressedDispatcher();
            this.f1715g = onBackPressedDispatcher;
            if (k0Var != null) {
                lifecycleOwner = f0Var;
                lifecycleOwner = k0Var;
            }
            lifecycleOwner = f0Var;
            onBackPressedDispatcher.a(lifecycleOwner, this.f1718j);
        }
        int i11 = 0;
        if (k0Var != null) {
            o1 o1Var = k0Var.mFragmentManager.P;
            HashMap map = o1Var.f1777b;
            o1 o1Var2 = (o1) map.get(k0Var.mWho);
            if (o1Var2 == null) {
                o1Var2 = new o1(o1Var.f1779d);
                map.put(k0Var.mWho, o1Var2);
            }
            this.P = o1Var2;
        } else if (u0Var instanceof ViewModelStoreOwner) {
            ViewModelStore viewModelStore = ((ViewModelStoreOwner) u0Var).getViewModelStore();
            n1 n1Var = o1.f1775t;
            this.P = (o1) new ViewModelProvider(viewModelStore, o1.f1775t).get(o1.class);
        } else {
            this.P = new o1(false);
        }
        this.P.f1781f = P();
        this.f1711c.f1864d = this.P;
        Object obj = this.f1731x;
        int i12 = 1;
        if ((obj instanceof da.g) && k0Var == null) {
            da.e savedStateRegistry = ((da.g) obj).getSavedStateRegistry();
            savedStateRegistry.c("android:support:fragments", new l0(this, i12));
            Bundle bundleA = savedStateRegistry.a("android:support:fragments");
            if (bundleA != null) {
                Z(bundleA);
            }
        }
        Object obj2 = this.f1731x;
        if (obj2 instanceof i.j) {
            i.i activityResultRegistry = ((i.j) obj2).getActivityResultRegistry();
            String strE = ep.a.e("FragmentManager:", k0Var != null ? ep.a.k(new StringBuilder(), k0Var.mWho, ":") : BuildConfig.VERSION_NAME);
            this.D = activityResultRegistry.d(defpackage.e.m(strE, "StartActivityForResult"), new e1(4), new z0(this, i12));
            int i13 = 2;
            this.E = activityResultRegistry.d(defpackage.e.m(strE, "StartIntentSenderForResult"), new e1(i11), new z0(this, i13));
            this.F = activityResultRegistry.d(defpackage.e.m(strE, "RequestPermissions"), new e1(i13), new z0(this, i11));
        }
        Object obj3 = this.f1731x;
        if (obj3 instanceof o4.e) {
            ((o4.e) obj3).addOnConfigurationChangedListener(this.f1725r);
        }
        Object obj4 = this.f1731x;
        if (obj4 instanceof o4.f) {
            ((o4.f) obj4).addOnTrimMemoryListener(this.f1726s);
        }
        Object obj5 = this.f1731x;
        if (obj5 instanceof n4.u) {
            ((n4.u) obj5).addOnMultiWindowModeChangedListener(this.f1727t);
        }
        Object obj6 = this.f1731x;
        if (obj6 instanceof n4.v) {
            ((n4.v) obj6).addOnPictureInPictureModeChangedListener(this.f1728u);
        }
        Object obj7 = this.f1731x;
        if ((obj7 instanceof z4.m) && k0Var == null) {
            ((z4.m) obj7).addMenuProvider(this.f1729v);
        }
    }

    public final j0 b0(k0 k0Var) {
        u1 u1Var = (u1) this.f1711c.f1862b.get(k0Var.mWho);
        if (u1Var != null) {
            k0 k0Var2 = u1Var.f1846c;
            if (k0Var2.equals(k0Var)) {
                if (k0Var2.mState > -1) {
                    return new j0(u1Var.l());
                }
                return null;
            }
        }
        h0(new IllegalStateException(defpackage.e.l("Fragment ", k0Var, " is not currently in the FragmentManager")));
        throw null;
    }

    public final void c(k0 k0Var) {
        if (L(2)) {
            Objects.toString(k0Var);
        }
        if (k0Var.mDetached) {
            k0Var.mDetached = false;
            if (k0Var.mAdded) {
                return;
            }
            this.f1711c.a(k0Var);
            if (L(2)) {
                k0Var.toString();
            }
            if (M(k0Var)) {
                this.H = true;
            }
        }
    }

    public final void c0() {
        synchronized (this.f1709a) {
            try {
                if (this.f1709a.size() == 1) {
                    this.f1731x.f1842c.removeCallbacks(this.Q);
                    this.f1731x.f1842c.post(this.Q);
                    i0();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d() {
        this.f1710b = false;
        this.N.clear();
        this.M.clear();
    }

    public final void d0(k0 k0Var, boolean z11) {
        ViewGroup viewGroupI = I(k0Var);
        if (viewGroupI == null || !(viewGroupI instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) viewGroupI).setDrawDisappearingViewsLast(!z11);
    }

    public final HashSet e() {
        s sVar;
        HashSet hashSet = new HashSet();
        ArrayList arrayListD = this.f1711c.d();
        int size = arrayListD.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayListD.get(i11);
            i11++;
            ViewGroup viewGroup = ((u1) obj).f1846c.mContainer;
            if (viewGroup != null) {
                p3 factory = K();
                kotlin.jvm.internal.m.f(factory, "factory");
                Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
                if (tag instanceof s) {
                    sVar = (s) tag;
                } else {
                    sVar = new s(viewGroup);
                    viewGroup.setTag(R.id.special_effects_controller_view_tag, sVar);
                }
                hashSet.add(sVar);
            }
        }
        return hashSet;
    }

    public final void e0(k0 k0Var, Lifecycle.State state) {
        if (k0Var.equals(this.f1711c.b(k0Var.mWho)) && (k0Var.mHost == null || k0Var.mFragmentManager == this)) {
            k0Var.mMaxState = state;
            return;
        }
        throw new IllegalArgumentException("Fragment " + k0Var + " is not an active fragment of FragmentManager " + this);
    }

    public final HashSet f(ArrayList arrayList, int i11, int i12) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i11 < i12) {
            ArrayList arrayList2 = ((a) arrayList.get(i11)).f1891a;
            int size = arrayList2.size();
            int i13 = 0;
            while (i13 < size) {
                Object obj = arrayList2.get(i13);
                i13++;
                k0 k0Var = ((y1) obj).f1879b;
                if (k0Var != null && (viewGroup = k0Var.mContainer) != null) {
                    hashSet.add(s.j(viewGroup, this));
                }
            }
            i11++;
        }
        return hashSet;
    }

    public final void f0(k0 k0Var) {
        if (k0Var != null) {
            if (!k0Var.equals(this.f1711c.b(k0Var.mWho)) || (k0Var.mHost != null && k0Var.mFragmentManager != this)) {
                throw new IllegalArgumentException("Fragment " + k0Var + " is not an active fragment of FragmentManager " + this);
            }
        }
        k0 k0Var2 = this.A;
        this.A = k0Var;
        r(k0Var2);
        r(this.A);
    }

    public final u1 g(k0 k0Var) {
        String str = k0Var.mWho;
        w1 w1Var = this.f1711c;
        u1 u1Var = (u1) w1Var.f1862b.get(str);
        if (u1Var != null) {
            return u1Var;
        }
        u1 u1Var2 = new u1(this.f1723p, w1Var, k0Var);
        u1Var2.j(this.f1731x.f1841b.getClassLoader());
        u1Var2.f1848e = this.f1730w;
        return u1Var2;
    }

    public final void g0(k0 k0Var) {
        ViewGroup viewGroupI = I(k0Var);
        if (viewGroupI != null) {
            if (k0Var.getPopExitAnim() + k0Var.getPopEnterAnim() + k0Var.getExitAnim() + k0Var.getEnterAnim() > 0) {
                if (viewGroupI.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    viewGroupI.setTag(R.id.visible_removing_fragment_view_tag, k0Var);
                }
                ((k0) viewGroupI.getTag(R.id.visible_removing_fragment_view_tag)).setPopDirection(k0Var.getPopDirection());
            }
        }
    }

    public final void h(k0 k0Var) {
        if (L(2)) {
            Objects.toString(k0Var);
        }
        if (k0Var.mDetached) {
            return;
        }
        k0Var.mDetached = true;
        if (k0Var.mAdded) {
            if (L(2)) {
                k0Var.toString();
            }
            w1 w1Var = this.f1711c;
            synchronized (w1Var.f1861a) {
                w1Var.f1861a.remove(k0Var);
            }
            k0Var.mAdded = false;
            if (M(k0Var)) {
                this.H = true;
            }
            g0(k0Var);
        }
    }

    public final void h0(IllegalStateException illegalStateException) {
        illegalStateException.getMessage();
        PrintWriter printWriter = new PrintWriter(new j2());
        u0 u0Var = this.f1731x;
        try {
            if (u0Var != null) {
                ((o0) u0Var).f1774e.dump("  ", null, printWriter, new String[0]);
            } else {
                v("  ", null, printWriter, new String[0]);
            }
            throw illegalStateException;
        } catch (Exception unused) {
            throw illegalStateException;
        }
    }

    public final void i(boolean z11, Configuration configuration) {
        if (z11 && (this.f1731x instanceof o4.e)) {
            h0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (k0 k0Var : this.f1711c.f()) {
            if (k0Var != null) {
                k0Var.performConfigurationChanged(configuration);
                if (z11) {
                    k0Var.mChildFragmentManager.i(true, configuration);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [fz.a, kotlin.jvm.internal.j] */
    /* JADX WARN: Type inference failed for: r1v8, types: [fz.a, kotlin.jvm.internal.j] */
    public final void i0() {
        synchronized (this.f1709a) {
            try {
                if (!this.f1709a.isEmpty()) {
                    a1 a1Var = this.f1718j;
                    a1Var.f26172a = true;
                    ?? r9 = a1Var.f26174c;
                    if (r9 != 0) {
                        r9.invoke();
                    }
                    if (L(3)) {
                        toString();
                    }
                    return;
                }
                boolean z11 = this.f1712d.size() + (this.f1716h != null ? 1 : 0) > 0 && O(this.f1733z);
                if (L(3)) {
                    toString();
                }
                a1 a1Var2 = this.f1718j;
                a1Var2.f26172a = z11;
                ?? r11 = a1Var2.f26174c;
                if (r11 != 0) {
                    r11.invoke();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean j(MenuItem menuItem) {
        if (this.f1730w < 1) {
            return false;
        }
        for (k0 k0Var : this.f1711c.f()) {
            if (k0Var != null && k0Var.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final boolean k(Menu menu, MenuInflater menuInflater) {
        if (this.f1730w < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z11 = false;
        for (k0 k0Var : this.f1711c.f()) {
            if (k0Var != null && k0Var.isMenuVisible() && k0Var.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(k0Var);
                z11 = true;
            }
        }
        if (this.f1713e != null) {
            for (int i11 = 0; i11 < this.f1713e.size(); i11++) {
                k0 k0Var2 = (k0) this.f1713e.get(i11);
                if (arrayList == null || !arrayList.contains(k0Var2)) {
                    k0Var2.onDestroyOptionsMenu();
                }
            }
        }
        this.f1713e = arrayList;
        return z11;
    }

    public final void l() {
        boolean zIsChangingConfigurations = true;
        this.K = true;
        z(true);
        w();
        u0 u0Var = this.f1731x;
        boolean z11 = u0Var instanceof ViewModelStoreOwner;
        w1 w1Var = this.f1711c;
        if (z11) {
            zIsChangingConfigurations = w1Var.f1864d.f1780e;
        } else {
            p0 p0Var = u0Var.f1841b;
            if (p0Var != null) {
                zIsChangingConfigurations = true ^ p0Var.isChangingConfigurations();
            }
        }
        if (zIsChangingConfigurations) {
            Iterator it = this.f1720l.values().iterator();
            while (it.hasNext()) {
                ArrayList arrayList = ((c) it.next()).f1628a;
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    w1Var.f1864d.b((String) obj, false);
                }
            }
        }
        u(-1);
        Object obj2 = this.f1731x;
        if (obj2 instanceof o4.f) {
            ((o4.f) obj2).removeOnTrimMemoryListener(this.f1726s);
        }
        Object obj3 = this.f1731x;
        if (obj3 instanceof o4.e) {
            ((o4.e) obj3).removeOnConfigurationChangedListener(this.f1725r);
        }
        Object obj4 = this.f1731x;
        if (obj4 instanceof n4.u) {
            ((n4.u) obj4).removeOnMultiWindowModeChangedListener(this.f1727t);
        }
        Object obj5 = this.f1731x;
        if (obj5 instanceof n4.v) {
            ((n4.v) obj5).removeOnPictureInPictureModeChangedListener(this.f1728u);
        }
        Object obj6 = this.f1731x;
        if ((obj6 instanceof z4.m) && this.f1733z == null) {
            ((z4.m) obj6).removeMenuProvider(this.f1729v);
        }
        this.f1731x = null;
        this.f1732y = null;
        this.f1733z = null;
        if (this.f1715g != null) {
            this.f1718j.e();
            this.f1715g = null;
        }
        i.h hVar = this.D;
        if (hVar != null) {
            hVar.b();
            this.E.b();
            this.F.b();
        }
    }

    public final void m(boolean z11) {
        if (z11 && (this.f1731x instanceof o4.f)) {
            h0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (k0 k0Var : this.f1711c.f()) {
            if (k0Var != null) {
                k0Var.performLowMemory();
                if (z11) {
                    k0Var.mChildFragmentManager.m(true);
                }
            }
        }
    }

    public final void n(boolean z11, boolean z12) {
        if (z12 && (this.f1731x instanceof n4.u)) {
            h0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (k0 k0Var : this.f1711c.f()) {
            if (k0Var != null) {
                k0Var.performMultiWindowModeChanged(z11);
                if (z12) {
                    k0Var.mChildFragmentManager.n(z11, true);
                }
            }
        }
    }

    public final void o() {
        ArrayList arrayListE = this.f1711c.e();
        int size = arrayListE.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayListE.get(i11);
            i11++;
            k0 k0Var = (k0) obj;
            if (k0Var != null) {
                k0Var.onHiddenChanged(k0Var.isHidden());
                k0Var.mChildFragmentManager.o();
            }
        }
    }

    public final boolean p(MenuItem menuItem) {
        if (this.f1730w < 1) {
            return false;
        }
        for (k0 k0Var : this.f1711c.f()) {
            if (k0Var != null && k0Var.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final void q(Menu menu) {
        if (this.f1730w < 1) {
            return;
        }
        for (k0 k0Var : this.f1711c.f()) {
            if (k0Var != null) {
                k0Var.performOptionsMenuClosed(menu);
            }
        }
    }

    public final void r(k0 k0Var) {
        if (k0Var != null) {
            if (k0Var.equals(this.f1711c.b(k0Var.mWho))) {
                k0Var.performPrimaryNavigationFragmentChanged();
            }
        }
    }

    public final void s(boolean z11, boolean z12) {
        if (z12 && (this.f1731x instanceof n4.v)) {
            h0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (k0 k0Var : this.f1711c.f()) {
            if (k0Var != null) {
                k0Var.performPictureInPictureModeChanged(z11);
                if (z12) {
                    k0Var.mChildFragmentManager.s(z11, true);
                }
            }
        }
    }

    public final boolean t(Menu menu) {
        boolean z11 = false;
        if (this.f1730w < 1) {
            return false;
        }
        for (k0 k0Var : this.f1711c.f()) {
            if (k0Var != null && k0Var.isMenuVisible() && k0Var.performPrepareOptionsMenu(menu)) {
                z11 = true;
            }
        }
        return z11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        k0 k0Var = this.f1733z;
        if (k0Var != null) {
            sb2.append(k0Var.getClass().getSimpleName());
            sb2.append("{");
            sb2.append(Integer.toHexString(System.identityHashCode(this.f1733z)));
            sb2.append("}");
        } else {
            u0 u0Var = this.f1731x;
            if (u0Var != null) {
                sb2.append(u0Var.getClass().getSimpleName());
                sb2.append("{");
                sb2.append(Integer.toHexString(System.identityHashCode(this.f1731x)));
                sb2.append("}");
            } else {
                sb2.append("null");
            }
        }
        sb2.append("}}");
        return sb2.toString();
    }

    public final void u(int i11) {
        try {
            this.f1710b = true;
            for (u1 u1Var : this.f1711c.f1862b.values()) {
                if (u1Var != null) {
                    u1Var.f1848e = i11;
                }
            }
            Q(i11, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((s) it.next()).i();
            }
            this.f1710b = false;
            z(true);
        } catch (Throwable th2) {
            this.f1710b = false;
            throw th2;
        }
    }

    public final void v(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        String strM = defpackage.e.m(str, "    ");
        w1 w1Var = this.f1711c;
        ArrayList arrayList = w1Var.f1861a;
        String strM2 = defpackage.e.m(str, "    ");
        HashMap map = w1Var.f1862b;
        if (!map.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (u1 u1Var : map.values()) {
                printWriter.print(str);
                if (u1Var != null) {
                    k0 k0Var = u1Var.f1846c;
                    printWriter.println(k0Var);
                    k0Var.dump(strM2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size2 = arrayList.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i11 = 0; i11 < size2; i11++) {
                k0 k0Var2 = (k0) arrayList.get(i11);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i11);
                printWriter.print(": ");
                printWriter.println(k0Var2.toString());
            }
        }
        ArrayList arrayList2 = this.f1713e;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i12 = 0; i12 < size; i12++) {
                k0 k0Var3 = (k0) this.f1713e.get(i12);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i12);
                printWriter.print(": ");
                printWriter.println(k0Var3.toString());
            }
        }
        int size3 = this.f1712d.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i13 = 0; i13 < size3; i13++) {
                a aVar = (a) this.f1712d.get(i13);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i13);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.k(strM, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f1719k.get());
        synchronized (this.f1709a) {
            try {
                int size4 = this.f1709a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i14 = 0; i14 < size4; i14++) {
                        Object obj = (h1) this.f1709a.get(i14);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i14);
                        printWriter.print(": ");
                        printWriter.println(obj);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f1731x);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f1732y);
        if (this.f1733z != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f1733z);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f1730w);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.I);
        printWriter.print(" mStopped=");
        printWriter.print(this.J);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.K);
        if (this.H) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.H);
        }
    }

    public final void w() {
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((s) it.next()).i();
        }
    }

    public final void x(h1 h1Var, boolean z11) {
        if (!z11) {
            if (this.f1731x == null) {
                if (!this.K) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            if (P()) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f1709a) {
            try {
                if (this.f1731x == null) {
                    if (!z11) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f1709a.add(h1Var);
                    c0();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void y(boolean z11) {
        if (this.f1710b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f1731x == null) {
            if (!this.K) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f1731x.f1842c.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z11 && P()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.M == null) {
            this.M = new ArrayList();
            this.N = new ArrayList();
        }
    }

    public final boolean z(boolean z11) {
        boolean zA;
        a aVar;
        y(z11);
        if (!this.f1717i && (aVar = this.f1716h) != null) {
            aVar.f1610s = false;
            aVar.g();
            if (L(3)) {
                Objects.toString(this.f1716h);
                Objects.toString(this.f1709a);
            }
            this.f1716h.i(false, false);
            this.f1709a.add(0, this.f1716h);
            ArrayList arrayList = this.f1716h.f1891a;
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                k0 k0Var = ((y1) obj).f1879b;
                if (k0Var != null) {
                    k0Var.mTransitioning = false;
                }
            }
            this.f1716h = null;
        }
        boolean z12 = false;
        while (true) {
            ArrayList arrayList2 = this.M;
            ArrayList arrayList3 = this.N;
            synchronized (this.f1709a) {
                if (this.f1709a.isEmpty()) {
                    zA = false;
                } else {
                    try {
                        int size2 = this.f1709a.size();
                        zA = false;
                        for (int i12 = 0; i12 < size2; i12++) {
                            zA |= ((h1) this.f1709a.get(i12)).a(arrayList2, arrayList3);
                        }
                        this.f1709a.clear();
                        this.f1731x.f1842c.removeCallbacks(this.Q);
                    } catch (Throwable th2) {
                        this.f1709a.clear();
                        this.f1731x.f1842c.removeCallbacks(this.Q);
                        throw th2;
                    }
                }
            }
            if (!zA) {
                break;
            }
            this.f1710b = true;
            try {
                Y(this.M, this.N);
                d();
                z12 = true;
            } catch (Throwable th3) {
                d();
                throw th3;
            }
        }
        i0();
        if (this.L) {
            this.L = false;
            ArrayList arrayListD = this.f1711c.d();
            int size3 = arrayListD.size();
            int i13 = 0;
            while (i13 < size3) {
                Object obj2 = arrayListD.get(i13);
                i13++;
                u1 u1Var = (u1) obj2;
                k0 k0Var2 = u1Var.f1846c;
                if (k0Var2.mDeferStart) {
                    if (this.f1710b) {
                        this.L = true;
                    } else {
                        k0Var2.mDeferStart = false;
                        u1Var.i();
                    }
                }
            }
        }
        this.f1711c.f1862b.values().removeAll(Collections.singleton(null));
        return z12;
    }
}
