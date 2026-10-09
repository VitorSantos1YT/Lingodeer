package qa;

import android.animation.Animator;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowId;
import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class y implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public v f47689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewGroup f47690b;

    /* JADX WARN: Code duplicated, block: B:100:0x0226  */
    /* JADX WARN: Code duplicated, block: B:104:0x023d  */
    /* JADX WARN: Code duplicated, block: B:136:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:138:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:142:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:144:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:146:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:148:0x0304  */
    /* JADX WARN: Code duplicated, block: B:14:0x004e  */
    /* JADX WARN: Code duplicated, block: B:151:0x0316  */
    /* JADX WARN: Code duplicated, block: B:153:0x031d  */
    /* JADX WARN: Code duplicated, block: B:155:0x0320  */
    /* JADX WARN: Code duplicated, block: B:157:0x0330 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:160:0x01e4 A[EDGE_INSN: B:160:0x01e4->B:87:0x01e4 BREAK  A[LOOP:1: B:18:0x0086->B:86:0x01db], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:16:0x0055 A[LOOP:0: B:15:0x0053->B:16:0x0055, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:193:0x0204 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x008c  */
    /* JADX WARN: Code duplicated, block: B:210:0x02d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:212:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0090 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0092  */
    /* JADX WARN: Code duplicated, block: B:25:0x0095  */
    /* JADX WARN: Code duplicated, block: B:28:0x009c  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:42:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:44:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:46:0x010b  */
    /* JADX WARN: Code duplicated, block: B:59:0x014e  */
    /* JADX WARN: Code duplicated, block: B:61:0x015d  */
    /* JADX WARN: Code duplicated, block: B:74:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:76:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:90:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:92:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:97:0x020c  */
    /* JADX WARN: Code duplicated, block: B:99:0x021a  */
    /* JADX WARN: Instruction removed from duplicated block: B:146:0x02f5, please report this as an issue */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ArrayList arrayList;
        int i11;
        dm.c cVar;
        dm.c cVar2;
        y.e eVar;
        y.e eVar2;
        int i12;
        int[] iArr;
        boolean z11;
        int i13;
        int i14;
        y.e eVarT;
        ArrayList arrayList2;
        int i15;
        int i16;
        s sVar;
        int i17;
        v vVar;
        Animator animator;
        q qVar;
        d0 d0Var;
        d0 d0Var2;
        int i18;
        boolean z12;
        int i19;
        View view;
        d0 d0Var3;
        y.e eVar3;
        int i21;
        int i22;
        View view2;
        View view3;
        SparseArray sparseArray;
        int size;
        int i23;
        View view4;
        View view5;
        y.r rVar;
        int iJ;
        int i24;
        View view6;
        boolean z13;
        int size2;
        int i25;
        v vVar2 = this.f47689a;
        ViewGroup viewGroup = this.f47690b;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        boolean z14 = true;
        if (!z.f47693c.remove(viewGroup)) {
            return true;
        }
        y.e eVarB = z.b();
        ArrayList arrayList3 = (ArrayList) eVarB.get(viewGroup);
        if (arrayList3 != null) {
            arrayList = arrayList3.size() > 0 ? new ArrayList(arrayList3) : null;
            arrayList3.add(vVar2);
            vVar2.a(new x(this, eVarB));
            i11 = 0;
            vVar2.j(viewGroup, false);
            if (arrayList != null) {
                size2 = arrayList.size();
                i25 = 0;
                while (i25 < size2) {
                    Object obj = arrayList.get(i25);
                    i25++;
                    ((v) obj).G(viewGroup);
                }
            }
            vVar2.O = new ArrayList();
            vVar2.P = new ArrayList();
            cVar = vVar2.K;
            cVar2 = vVar2.L;
            eVar = new y.e((y.e) cVar.f23490b);
            eVar2 = new y.e((y.e) cVar2.f23490b);
            i12 = 0;
            while (true) {
                iArr = vVar2.N;
                if (i12 < iArr.length) {
                    break;
                }
                i18 = iArr[i12];
                if (i18 != z14) {
                    z12 = z14;
                    for (i19 = eVar.f56767c - 1; i19 >= 0; i19--) {
                        view = (View) eVar.f(i19);
                        if (view == null && vVar2.z(view) && (d0Var3 = (d0) eVar2.remove(view)) != null && vVar2.z(d0Var3.f47605b)) {
                            vVar2.O.add((d0) eVar.h(i19));
                            vVar2.P.add(d0Var3);
                        }
                    }
                } else if (i18 != 2) {
                    z12 = z14;
                    eVar3 = (y.e) cVar.f23493e;
                    y.e eVar4 = (y.e) cVar2.f23493e;
                    i21 = eVar3.f56767c;
                    for (i22 = 0; i22 < i21; i22++) {
                        view2 = (View) eVar3.j(i22);
                        if (view2 == null && vVar2.z(view2) && (view3 = (View) eVar4.get((String) eVar3.f(i22))) != null && vVar2.z(view3)) {
                            d0 d0Var4 = (d0) eVar.get(view2);
                            d0 d0Var5 = (d0) eVar2.get(view3);
                            if (d0Var4 != null && d0Var5 != null) {
                                vVar2.O.add(d0Var4);
                                vVar2.P.add(d0Var5);
                                eVar.remove(view2);
                                eVar2.remove(view3);
                            }
                        }
                    }
                } else if (i18 != 3) {
                    if (i18 == 4) {
                        rVar = (y.r) cVar.f23492d;
                        y.r rVar2 = (y.r) cVar2.f23492d;
                        iJ = rVar.j();
                        i24 = i11;
                        while (i24 < iJ) {
                            view6 = (View) rVar.k(i24);
                            if (view6 == null && vVar2.z(view6)) {
                                z13 = z14;
                                View view7 = (View) rVar2.c(rVar.g(i24));
                                if (view7 != null && vVar2.z(view7)) {
                                    d0 d0Var6 = (d0) eVar.get(view6);
                                    d0 d0Var7 = (d0) eVar2.get(view7);
                                    if (d0Var6 != null && d0Var7 != null) {
                                        vVar2.O.add(d0Var6);
                                        vVar2.P.add(d0Var7);
                                        eVar.remove(view6);
                                        eVar2.remove(view7);
                                    }
                                }
                            } else {
                                z13 = z14;
                            }
                            i24++;
                            z14 = z13;
                        }
                    }
                    z12 = z14;
                } else {
                    z12 = z14;
                    sparseArray = (SparseArray) cVar.f23491c;
                    SparseArray sparseArray2 = (SparseArray) cVar2.f23491c;
                    size = sparseArray.size();
                    for (i23 = 0; i23 < size; i23++) {
                        view4 = (View) sparseArray.valueAt(i23);
                        if (view4 == null && vVar2.z(view4) && (view5 = (View) sparseArray2.get(sparseArray.keyAt(i23))) != null && vVar2.z(view5)) {
                            d0 d0Var8 = (d0) eVar.get(view4);
                            d0 d0Var9 = (d0) eVar2.get(view5);
                            if (d0Var8 != null && d0Var9 != null) {
                                vVar2.O.add(d0Var8);
                                vVar2.P.add(d0Var9);
                                eVar.remove(view4);
                                eVar2.remove(view5);
                            }
                        }
                    }
                }
                i12++;
                z14 = z12;
                i11 = 0;
            }
            z11 = z14;
            for (i13 = 0; i13 < eVar.f56767c; i13++) {
                d0Var2 = (d0) eVar.j(i13);
                if (vVar2.z(d0Var2.f47605b)) {
                    vVar2.O.add(d0Var2);
                    vVar2.P.add(null);
                }
            }
            for (i14 = 0; i14 < eVar2.f56767c; i14++) {
                d0Var = (d0) eVar2.j(i14);
                if (vVar2.z(d0Var.f47605b)) {
                    vVar2.P.add(d0Var);
                    vVar2.O.add(null);
                }
            }
            eVarT = v.t();
            int i26 = eVarT.f56767c;
            WindowId windowId = viewGroup.getWindowId();
            arrayList2 = new ArrayList();
            i15 = i26 - 1;
            while (i15 >= 0) {
                animator = (Animator) eVarT.f(i15);
                if (animator == null && (qVar = (q) eVarT.get(animator)) != null) {
                    v vVar3 = qVar.f47658e;
                    View view8 = qVar.f47654a;
                    if (view8 != null && windowId.equals(qVar.f47657d)) {
                        d0 d0Var10 = qVar.f47656c;
                        boolean z15 = z11;
                        d0 d0VarV = vVar2.v(view8, z15);
                        d0 d0VarR = vVar2.r(view8, z15);
                        if (d0VarV == null && d0VarR == null) {
                            d0VarR = (d0) ((y.e) vVar2.L.f23490b).get(view8);
                        }
                        if ((d0VarV != null || d0VarR != null) && vVar3.y(d0Var10, d0VarR)) {
                            v vVarS = vVar3.s();
                            ArrayList arrayList4 = vVar3.R;
                            if (vVarS.f47681c0 != null) {
                                animator.cancel();
                                arrayList4.remove(animator);
                                eVarT.h(i15);
                                if (arrayList4.size() == 0) {
                                    arrayList2.add(vVar3);
                                }
                            } else if (animator.isRunning() || animator.isStarted()) {
                                animator.cancel();
                            } else {
                                eVarT.h(i15);
                            }
                        }
                    }
                }
                i15--;
                z11 = true;
            }
            for (i16 = 0; i16 < arrayList2.size(); i16++) {
                vVar = (v) arrayList2.get(i16);
                vVar.B(vVar, u.f47671z, false);
                if (!vVar.V) {
                    vVar.V = true;
                    vVar.B(vVar, u.f47670y, false);
                }
            }
            vVar2.n(viewGroup, vVar2.K, vVar2.L, vVar2.O, vVar2.P);
            if (vVar2.f47681c0 == null) {
                vVar2.I();
                return true;
            }
            if (Build.VERSION.SDK_INT >= 34) {
                return true;
            }
            vVar2.D();
            s sVar2 = vVar2.f47681c0;
            b0 b0Var = sVar2.f47668h;
            long j11 = b0Var.f47679b0 == 0 ? 1L : 0L;
            b0Var.J(j11, sVar2.f47661a);
            sVar2.f47661a = j11;
            sVar = vVar2.f47681c0;
            sVar.f47662b = true;
            i17 = sVar.f47664d;
            if (i17 == 1) {
                sVar.f47664d = 0;
                sVar.g();
                return true;
            }
            if (i17 == 2) {
                return true;
            }
            sVar.f47664d = 0;
            sVar.f47667g = sVar.f47667g;
            sVar.h();
            sVar.f47665e.a(CropImageView.DEFAULT_ASPECT_RATIO);
            return true;
        }
        arrayList3 = new ArrayList();
        eVarB.put(viewGroup, arrayList3);
        arrayList3.add(vVar2);
        vVar2.a(new x(this, eVarB));
        i11 = 0;
        vVar2.j(viewGroup, false);
        if (arrayList != null) {
            size2 = arrayList.size();
            i25 = 0;
            while (i25 < size2) {
                Object obj2 = arrayList.get(i25);
                i25++;
                ((v) obj2).G(viewGroup);
            }
        }
        vVar2.O = new ArrayList();
        vVar2.P = new ArrayList();
        cVar = vVar2.K;
        cVar2 = vVar2.L;
        eVar = new y.e((y.e) cVar.f23490b);
        eVar2 = new y.e((y.e) cVar2.f23490b);
        i12 = 0;
        while (true) {
            iArr = vVar2.N;
            if (i12 < iArr.length) {
                break;
                break;
            }
            i18 = iArr[i12];
            if (i18 != z14) {
                z12 = z14;
                while (i19 >= 0) {
                    view = (View) eVar.f(i19);
                    if (view == null) {
                    }
                }
            } else if (i18 != 2) {
                z12 = z14;
                eVar3 = (y.e) cVar.f23493e;
                y.e eVar5 = (y.e) cVar2.f23493e;
                i21 = eVar3.f56767c;
                while (i22 < i21) {
                    view2 = (View) eVar3.j(i22);
                    if (view2 == null) {
                    }
                }
            } else if (i18 != 3) {
                if (i18 == 4) {
                    rVar = (y.r) cVar.f23492d;
                    y.r rVar3 = (y.r) cVar2.f23492d;
                    iJ = rVar.j();
                    i24 = i11;
                    while (i24 < iJ) {
                        view6 = (View) rVar.k(i24);
                        if (view6 == null) {
                            z13 = z14;
                        } else {
                            z13 = z14;
                        }
                        i24++;
                        z14 = z13;
                    }
                }
                z12 = z14;
            } else {
                z12 = z14;
                sparseArray = (SparseArray) cVar.f23491c;
                SparseArray sparseArray3 = (SparseArray) cVar2.f23491c;
                size = sparseArray.size();
                while (i23 < size) {
                    view4 = (View) sparseArray.valueAt(i23);
                    if (view4 == null) {
                    }
                }
            }
            i12++;
            z14 = z12;
            i11 = 0;
        }
        z11 = z14;
        while (i13 < eVar.f56767c) {
            d0Var2 = (d0) eVar.j(i13);
            if (vVar2.z(d0Var2.f47605b)) {
                vVar2.O.add(d0Var2);
                vVar2.P.add(null);
            }
        }
        while (i14 < eVar2.f56767c) {
            d0Var = (d0) eVar2.j(i14);
            if (vVar2.z(d0Var.f47605b)) {
                vVar2.P.add(d0Var);
                vVar2.O.add(null);
            }
        }
        eVarT = v.t();
        int i27 = eVarT.f56767c;
        WindowId windowId2 = viewGroup.getWindowId();
        arrayList2 = new ArrayList();
        i15 = i27 - 1;
        while (i15 >= 0) {
            animator = (Animator) eVarT.f(i15);
            if (animator == null) {
            }
            i15--;
            z11 = true;
        }
        while (i16 < arrayList2.size()) {
            vVar = (v) arrayList2.get(i16);
            vVar.B(vVar, u.f47671z, false);
            if (!vVar.V) {
                vVar.V = true;
                vVar.B(vVar, u.f47670y, false);
            }
        }
        vVar2.n(viewGroup, vVar2.K, vVar2.L, vVar2.O, vVar2.P);
        if (vVar2.f47681c0 == null) {
            vVar2.I();
            return true;
        }
        if (Build.VERSION.SDK_INT >= 34) {
            return true;
        }
        vVar2.D();
        s sVar3 = vVar2.f47681c0;
        b0 b0Var2 = sVar3.f47668h;
        if (b0Var2.f47679b0 == 0) {
        }
        b0Var2.J(j11, sVar3.f47661a);
        sVar3.f47661a = j11;
        sVar = vVar2.f47681c0;
        sVar.f47662b = true;
        i17 = sVar.f47664d;
        if (i17 == 1) {
            sVar.f47664d = 0;
            sVar.g();
            return true;
        }
        if (i17 == 2) {
            return true;
        }
        sVar.f47664d = 0;
        sVar.f47667g = sVar.f47667g;
        sVar.h();
        sVar.f47665e.a(CropImageView.DEFAULT_ASPECT_RATIO);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewGroup viewGroup = this.f47690b;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        z.f47693c.remove(viewGroup);
        ArrayList arrayList = (ArrayList) z.b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                ((v) obj).G(viewGroup);
            }
        }
        this.f47689a.k(true);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
