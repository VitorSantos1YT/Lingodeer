package qa;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.ListView;
import android.widget.TextView;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import z4.s0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class v implements Cloneable {

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final Animator[] f47672e0 = new Animator[0];

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final int[] f47673f0 = {2, 1, 3, 4};

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final o f47674g0 = new o();

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final ThreadLocal f47675h0 = new ThreadLocal();
    public ArrayList O;
    public ArrayList P;
    public t[] Q;
    public o00.a Z;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public long f47679b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public s f47681c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public long f47683d0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47676a = getClass().getName();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f47678b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f47680c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TimeInterpolator f47682d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f47684e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f47685f = new ArrayList();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ArrayList f47686t = null;
    public ArrayList H = null;
    public dm.c K = new dm.c(14);
    public dm.c L = new dm.c(14);
    public b0 M = null;
    public final int[] N = f47673f0;
    public final ArrayList R = new ArrayList();
    public Animator[] S = f47672e0;
    public int T = 0;
    public boolean U = false;
    public boolean V = false;
    public v W = null;
    public ArrayList X = null;
    public ArrayList Y = new ArrayList();

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public ns.o f47677a0 = f47674g0;

    public static boolean A(d0 d0Var, d0 d0Var2, String str) {
        Object obj = d0Var.f47604a.get(str);
        Object obj2 = d0Var2.f47604a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public static void d(dm.c cVar, View view, d0 d0Var) {
        y.e eVar = (y.e) cVar.f23490b;
        y.e eVar2 = (y.e) cVar.f23493e;
        SparseArray sparseArray = (SparseArray) cVar.f23491c;
        y.r rVar = (y.r) cVar.f23492d;
        eVar.put(view, d0Var);
        int id2 = view.getId();
        if (id2 >= 0) {
            if (sparseArray.indexOfKey(id2) >= 0) {
                sparseArray.put(id2, null);
            } else {
                sparseArray.put(id2, view);
            }
        }
        WeakHashMap weakHashMap = s0.f58893a;
        String strF = z4.j0.f(view);
        if (strF != null) {
            if (eVar2.containsKey(strF)) {
                eVar2.put(strF, null);
            } else {
                eVar2.put(strF, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (rVar.d(itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    rVar.h(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) rVar.c(itemIdAtPosition);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    rVar.h(itemIdAtPosition, null);
                }
            }
        }
    }

    public static y.e t() {
        ThreadLocal threadLocal = f47675h0;
        y.e eVar = (y.e) threadLocal.get();
        if (eVar != null) {
            return eVar;
        }
        y.e eVar2 = new y.e(0);
        threadLocal.set(eVar2);
        return eVar2;
    }

    public final void B(v vVar, u uVar, boolean z11) {
        v vVar2 = this.W;
        if (vVar2 != null) {
            vVar2.B(vVar, uVar, z11);
        }
        ArrayList arrayList = this.X;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.X.size();
        t[] tVarArr = this.Q;
        if (tVarArr == null) {
            tVarArr = new t[size];
        }
        this.Q = null;
        t[] tVarArr2 = (t[]) this.X.toArray(tVarArr);
        for (int i11 = 0; i11 < size; i11++) {
            uVar.b(tVarArr2[i11], vVar, z11);
            tVarArr2[i11] = null;
        }
        this.Q = tVarArr2;
    }

    public void C(View view) {
        if (this.V) {
            return;
        }
        ArrayList arrayList = this.R;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.S);
        this.S = f47672e0;
        for (int i11 = size - 1; i11 >= 0; i11--) {
            Animator animator = animatorArr[i11];
            animatorArr[i11] = null;
            animator.pause();
        }
        this.S = animatorArr;
        B(this, u.A, false);
        this.U = true;
    }

    public void D() {
        y.e eVarT = t();
        this.f47679b0 = 0L;
        for (int i11 = 0; i11 < this.Y.size(); i11++) {
            Animator animator = (Animator) this.Y.get(i11);
            q qVar = (q) eVarT.get(animator);
            if (animator != null && qVar != null) {
                Animator animator2 = qVar.f47659f;
                long j11 = this.f47680c;
                if (j11 >= 0) {
                    animator2.setDuration(j11);
                }
                long j12 = this.f47678b;
                if (j12 >= 0) {
                    animator2.setStartDelay(animator2.getStartDelay() + j12);
                }
                TimeInterpolator timeInterpolator = this.f47682d;
                if (timeInterpolator != null) {
                    animator2.setInterpolator(timeInterpolator);
                }
                this.R.add(animator);
                this.f47679b0 = Math.max(this.f47679b0, animator.getTotalDuration());
            }
        }
        this.Y.clear();
    }

    public v E(t tVar) {
        v vVar;
        ArrayList arrayList = this.X;
        if (arrayList != null) {
            if (!arrayList.remove(tVar) && (vVar = this.W) != null) {
                vVar.E(tVar);
            }
            if (this.X.size() == 0) {
                this.X = null;
            }
        }
        return this;
    }

    public void F(View view) {
        this.f47685f.remove(view);
    }

    public void G(View view) {
        if (this.U) {
            if (!this.V) {
                ArrayList arrayList = this.R;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.S);
                this.S = f47672e0;
                for (int i11 = size - 1; i11 >= 0; i11--) {
                    Animator animator = animatorArr[i11];
                    animatorArr[i11] = null;
                    animator.resume();
                }
                this.S = animatorArr;
                B(this, u.B, false);
            }
            this.U = false;
        }
    }

    public void I() {
        Q();
        y.e eVarT = t();
        ArrayList arrayList = this.Y;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            Animator animator = (Animator) obj;
            if (eVarT.containsKey(animator)) {
                Q();
                if (animator != null) {
                    animator.addListener(new p(this, eVarT));
                    long j11 = this.f47680c;
                    if (j11 >= 0) {
                        animator.setDuration(j11);
                    }
                    long j12 = this.f47678b;
                    if (j12 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j12);
                    }
                    TimeInterpolator timeInterpolator = this.f47682d;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new gi.g(this, 2));
                    animator.start();
                }
            }
        }
        this.Y.clear();
        o();
    }

    public void J(long j11, long j12) {
        long j13 = this.f47679b0;
        int i11 = 0;
        boolean z11 = j11 < j12;
        if ((j12 < 0 && j11 >= 0) || (j12 > j13 && j11 <= j13)) {
            this.V = false;
            B(this, u.f47669x, z11);
        }
        ArrayList arrayList = this.R;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.S);
        this.S = f47672e0;
        while (i11 < size) {
            Animator animator = animatorArr[i11];
            animatorArr[i11] = null;
            z6.c.t(animator, Math.min(Math.max(0L, j11), animator.getTotalDuration()));
            i11++;
            j13 = j13;
        }
        long j14 = j13;
        this.S = animatorArr;
        if ((j11 <= j14 || j12 > j14) && (j11 >= 0 || j12 < 0)) {
            return;
        }
        if (j11 > j14) {
            this.V = true;
        }
        B(this, u.f47670y, z11);
    }

    public void K(long j11) {
        this.f47680c = j11;
    }

    public void L(o00.a aVar) {
        this.Z = aVar;
    }

    public void M(TimeInterpolator timeInterpolator) {
        this.f47682d = timeInterpolator;
    }

    public void N(ns.o oVar) {
        if (oVar == null) {
            this.f47677a0 = f47674g0;
        } else {
            this.f47677a0 = oVar;
        }
    }

    public void P(long j11) {
        this.f47678b = j11;
    }

    public final void Q() {
        if (this.T == 0) {
            B(this, u.f47669x, false);
            this.V = false;
        }
        this.T++;
    }

    public String R(String str) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(getClass().getSimpleName());
        sb2.append("@");
        sb2.append(Integer.toHexString(hashCode()));
        sb2.append(": ");
        if (this.f47680c != -1) {
            sb2.append("dur(");
            sb2.append(this.f47680c);
            sb2.append(") ");
        }
        if (this.f47678b != -1) {
            sb2.append("dly(");
            sb2.append(this.f47678b);
            sb2.append(") ");
        }
        if (this.f47682d != null) {
            sb2.append("interp(");
            sb2.append(this.f47682d);
            sb2.append(") ");
        }
        ArrayList arrayList = this.f47684e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f47685f;
        if (size > 0 || arrayList2.size() > 0) {
            sb2.append("tgts(");
            if (arrayList.size() > 0) {
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    if (i11 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(arrayList.get(i11));
                }
            }
            if (arrayList2.size() > 0) {
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    if (i12 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(arrayList2.get(i12));
                }
            }
            sb2.append(")");
        }
        return sb2.toString();
    }

    public void a(t tVar) {
        if (this.X == null) {
            this.X = new ArrayList();
        }
        this.X.add(tVar);
    }

    public void c(View view) {
        this.f47685f.add(view);
    }

    public void cancel() {
        ArrayList arrayList = this.R;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.S);
        this.S = f47672e0;
        for (int i11 = size - 1; i11 >= 0; i11--) {
            Animator animator = animatorArr[i11];
            animatorArr[i11] = null;
            animator.cancel();
        }
        this.S = animatorArr;
        B(this, u.f47671z, false);
    }

    public abstract void f(d0 d0Var);

    public final void g(View view, boolean z11) {
        if (view == null) {
            return;
        }
        view.getId();
        ArrayList arrayList = this.f47686t;
        if (arrayList == null || !arrayList.contains(view)) {
            ArrayList arrayList2 = this.H;
            if (arrayList2 != null) {
                int size = arrayList2.size();
                for (int i11 = 0; i11 < size; i11++) {
                    if (((Class) this.H.get(i11)).isInstance(view)) {
                        return;
                    }
                }
            }
            if (view.getParent() instanceof ViewGroup) {
                d0 d0Var = new d0(view);
                if (z11) {
                    i(d0Var);
                } else {
                    f(d0Var);
                }
                d0Var.f47606c.add(this);
                h(d0Var);
                if (z11) {
                    d(this.K, view, d0Var);
                } else {
                    d(this.L, view, d0Var);
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i12 = 0; i12 < viewGroup.getChildCount(); i12++) {
                    g(viewGroup.getChildAt(i12), z11);
                }
            }
        }
    }

    public abstract void i(d0 d0Var);

    public final void j(ViewGroup viewGroup, boolean z11) {
        k(z11);
        ArrayList arrayList = this.f47684e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f47685f;
        if (size <= 0 && arrayList2.size() <= 0) {
            g(viewGroup, z11);
            return;
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            View viewFindViewById = viewGroup.findViewById(((Integer) arrayList.get(i11)).intValue());
            if (viewFindViewById != null) {
                d0 d0Var = new d0(viewFindViewById);
                if (z11) {
                    i(d0Var);
                } else {
                    f(d0Var);
                }
                d0Var.f47606c.add(this);
                h(d0Var);
                if (z11) {
                    d(this.K, viewFindViewById, d0Var);
                } else {
                    d(this.L, viewFindViewById, d0Var);
                }
            }
        }
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            View view = (View) arrayList2.get(i12);
            d0 d0Var2 = new d0(view);
            if (z11) {
                i(d0Var2);
            } else {
                f(d0Var2);
            }
            d0Var2.f47606c.add(this);
            h(d0Var2);
            if (z11) {
                d(this.K, view, d0Var2);
            } else {
                d(this.L, view, d0Var2);
            }
        }
    }

    public final void k(boolean z11) {
        if (z11) {
            ((y.e) this.K.f23490b).clear();
            ((SparseArray) this.K.f23491c).clear();
            ((y.r) this.K.f23492d).a();
        } else {
            ((y.e) this.L.f23490b).clear();
            ((SparseArray) this.L.f23491c).clear();
            ((y.r) this.L.f23492d).a();
        }
    }

    @Override // 
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public v clone() {
        try {
            v vVar = (v) super.clone();
            vVar.Y = new ArrayList();
            vVar.K = new dm.c(14);
            vVar.L = new dm.c(14);
            vVar.O = null;
            vVar.P = null;
            vVar.f47681c0 = null;
            vVar.W = this;
            vVar.X = null;
            return vVar;
        } catch (CloneNotSupportedException e8) {
            throw new RuntimeException(e8);
        }
    }

    public Animator m(ViewGroup viewGroup, d0 d0Var, d0 d0Var2) {
        return null;
    }

    public void n(ViewGroup viewGroup, dm.c cVar, dm.c cVar2, ArrayList arrayList, ArrayList arrayList2) {
        int i11;
        boolean z11;
        View view;
        d0 d0Var;
        Animator animator;
        Object obj;
        Animator animator2;
        d0 d0Var2;
        y.e eVarT = t();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        boolean z12 = s().f47681c0 != null;
        int i12 = 0;
        while (i12 < size) {
            d0 d0Var3 = (d0) arrayList.get(i12);
            d0 d0Var4 = (d0) arrayList2.get(i12);
            if (d0Var3 != null && !d0Var3.f47606c.contains(this)) {
                d0Var3 = null;
            }
            if (d0Var4 != null && !d0Var4.f47606c.contains(this)) {
                d0Var4 = null;
            }
            if ((d0Var3 != null || d0Var4 != null) && (d0Var3 == null || d0Var4 == null || y(d0Var3, d0Var4))) {
                Animator animatorM = m(viewGroup, d0Var3, d0Var4);
                if (animatorM != null) {
                    String str = this.f47676a;
                    if (d0Var4 != null) {
                        view = d0Var4.f47605b;
                        String[] strArrU = u();
                        if (strArrU != null && strArrU.length > 0) {
                            d0Var2 = new d0(view);
                            d0 d0Var5 = (d0) ((y.e) cVar2.f23490b).get(view);
                            i11 = size;
                            z11 = z12;
                            if (d0Var5 != null) {
                                for (String str2 : strArrU) {
                                    d0Var2.f47604a.put(str2, d0Var5.f47604a.get(str2));
                                }
                            }
                            int i13 = eVarT.f56767c;
                            int i14 = 0;
                            while (true) {
                                if (i14 >= i13) {
                                    animator2 = animatorM;
                                    break;
                                }
                                q qVar = (q) eVarT.get((Animator) eVarT.f(i14));
                                if (qVar.f47656c != null && qVar.f47654a == view && qVar.f47655b.equals(str) && qVar.f47656c.equals(d0Var2)) {
                                    animator2 = null;
                                    break;
                                }
                                i14++;
                            }
                        } else {
                            i11 = size;
                            z11 = z12;
                            animator2 = animatorM;
                            d0Var2 = null;
                        }
                        animator = animator2;
                        d0Var = d0Var2;
                    } else {
                        i11 = size;
                        z11 = z12;
                        view = d0Var3.f47605b;
                        d0Var = null;
                    }
                    if (animator != null) {
                        animator = animatorM;
                        WindowId windowId = viewGroup.getWindowId();
                        q qVar2 = new q();
                        qVar2.f47654a = view;
                        qVar2.f47655b = str;
                        qVar2.f47656c = d0Var;
                        qVar2.f47657d = windowId;
                        qVar2.f47658e = this;
                        qVar2.f47659f = animator;
                        if (z11) {
                            obj = animator;
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.play(animator);
                            obj = animatorSet;
                        }
                        obj = animator;
                        eVarT.put(obj, qVar2);
                        this.Y.add(obj);
                    } else {
                        animator = animatorM;
                    }
                }
                i12++;
                size = i11;
                z12 = z11;
            }
            i11 = size;
            z11 = z12;
            i12++;
            size = i11;
            z12 = z11;
        }
        if (sparseIntArray.size() != 0) {
            for (int i15 = 0; i15 < sparseIntArray.size(); i15++) {
                q qVar3 = (q) eVarT.get((Animator) this.Y.get(sparseIntArray.keyAt(i15)));
                qVar3.f47659f.setStartDelay(qVar3.f47659f.getStartDelay() + (((long) sparseIntArray.valueAt(i15)) - Long.MAX_VALUE));
            }
        }
    }

    public final void o() {
        int i11 = this.T - 1;
        this.T = i11;
        if (i11 == 0) {
            B(this, u.f47670y, false);
            for (int i12 = 0; i12 < ((y.r) this.K.f23492d).j(); i12++) {
                View view = (View) ((y.r) this.K.f23492d).k(i12);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i13 = 0; i13 < ((y.r) this.L.f23492d).j(); i13++) {
                View view2 = (View) ((y.r) this.L.f23492d).k(i13);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.V = true;
        }
    }

    public v p(View view) {
        ArrayList arrayList = this.f47686t;
        if (view != null) {
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            if (!arrayList.contains(view)) {
                arrayList.add(view);
            }
        }
        this.f47686t = arrayList;
        return this;
    }

    public void q() {
        ArrayList arrayList = this.H;
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        if (!arrayList.contains(TextView.class)) {
            arrayList.add(TextView.class);
        }
        this.H = arrayList;
    }

    public final d0 r(View view, boolean z11) {
        b0 b0Var = this.M;
        if (b0Var != null) {
            return b0Var.r(view, z11);
        }
        ArrayList arrayList = z11 ? this.O : this.P;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                i11 = -1;
                break;
            }
            d0 d0Var = (d0) arrayList.get(i11);
            if (d0Var == null) {
                return null;
            }
            if (d0Var.f47605b == view) {
                break;
            }
            i11++;
        }
        if (i11 >= 0) {
            return (d0) (z11 ? this.P : this.O).get(i11);
        }
        return null;
    }

    public final v s() {
        b0 b0Var = this.M;
        return b0Var != null ? b0Var.s() : this;
    }

    public final String toString() {
        return R(BuildConfig.VERSION_NAME);
    }

    public String[] u() {
        return null;
    }

    public final d0 v(View view, boolean z11) {
        b0 b0Var = this.M;
        if (b0Var != null) {
            return b0Var.v(view, z11);
        }
        return (d0) ((y.e) (z11 ? this.K : this.L).f23490b).get(view);
    }

    public boolean w() {
        return !this.R.isEmpty();
    }

    public boolean x() {
        return this instanceof f;
    }

    public boolean y(d0 d0Var, d0 d0Var2) {
        if (d0Var != null && d0Var2 != null) {
            String[] strArrU = u();
            if (strArrU != null) {
                for (String str : strArrU) {
                    if (A(d0Var, d0Var2, str)) {
                        return true;
                    }
                }
            } else {
                Iterator it = d0Var.f47604a.keySet().iterator();
                while (it.hasNext()) {
                    if (A(d0Var, d0Var2, (String) it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean z(View view) {
        int id2 = view.getId();
        ArrayList arrayList = this.f47686t;
        if (arrayList != null && arrayList.contains(view)) {
            return false;
        }
        ArrayList arrayList2 = this.H;
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i11 = 0; i11 < size; i11++) {
                if (((Class) this.H.get(i11)).isInstance(view)) {
                    return false;
                }
            }
        }
        ArrayList arrayList3 = this.f47684e;
        int size2 = arrayList3.size();
        ArrayList arrayList4 = this.f47685f;
        return (size2 == 0 && arrayList4.size() == 0) || arrayList3.contains(Integer.valueOf(id2)) || arrayList4.contains(view);
    }

    public void O() {
    }

    public void h(d0 d0Var) {
    }
}
