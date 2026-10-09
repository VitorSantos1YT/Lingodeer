package x0;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.ViewModelKt;
import com.lingodeer.R;
import com.lingodeer.data.model.uistate.DailyGoalUiState;
import d1.e1;
import hj.x1;
import java.util.List;
import java.util.concurrent.TimeUnit;
import jp.p0;
import kotlin.jvm.internal.y;
import l1.b1;
import l1.j0;
import qp.m4;
import qu.u;
import qy.b0;
import rt.dd;
import rt.yb;
import rt.zb;
import rz.e0;
import uz.i1;
import vf.eq.EHjhWcesDUIsIw;
import xu.s0;
import xu.v1;
import xu.z1;
import z2.h1;
import z2.i2;
import zu.a0;
import zu.l0;
import zu.m0;
import zu.s2;
import zu.u0;
import zu.w0;
import zu.y0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f55599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f55600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f55601c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f55602d;

    public /* synthetic */ j(Object obj, Object obj2, Object obj3, int i11) {
        this.f55599a = i11;
        this.f55600b = obj;
        this.f55601c = obj2;
        this.f55602d = obj3;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00a8  */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // fz.c
    public final Object invoke(Object obj) {
        View childAt;
        char c11;
        int i11 = this.f55599a;
        int i12 = 7;
        int i13 = 3;
        vy.d dVar = null;
        b0 b0Var = b0.f48488a;
        Object obj2 = this.f55602d;
        Object obj3 = this.f55601c;
        Object obj4 = this.f55600b;
        switch (i11) {
            case 0:
                Context context = (Context) obj3;
                v0.g gVar = (v0.g) obj2;
                e0.e eVar = (e0.e) obj;
                ?? r9 = ((v0.c) obj4).f53453a;
                int size = r9.size();
                int i14 = 0;
                while (i14 < size) {
                    v0.b bVar = (v0.b) r9.get(i14);
                    if (bVar instanceof v0.d) {
                        v0.d dVar2 = (v0.d) bVar;
                        e0.e.b(eVar, new tg.k(dVar2, 3), dVar2.f53455c == 0 ? null : new t1.d(new e1(dVar2, i12), true, -1930700965), new pv.c(21, dVar2, gVar), 6);
                    } else if (bVar instanceof v0.h) {
                        if (Build.VERSION.SDK_INT >= 28) {
                            r.d(eVar, context, (v0.h) bVar);
                        }
                    } else if (bVar instanceof v0.f) {
                        eVar.f24645a.add(e0.b.f24635a);
                    }
                    i14++;
                    i12 = 7;
                }
                return b0Var;
            case 1:
                s2 s2Var = (s2) obj4;
                fz.c cVar = (fz.c) obj3;
                y0 item = (y0) obj;
                kotlin.jvm.internal.m.f(item, "item");
                if (item.equals((y0) ((b1) obj2).getValue())) {
                    cVar.invoke(s0.f56512a);
                } else {
                    e0.B(ViewModelKt.getViewModelScope(s2Var), null, null, new nu.b(27, s2Var, item, dVar), 3);
                    i1 i1Var = s2Var.L;
                    i1Var.getClass();
                    i1Var.l(null, item);
                    y0 y0Var = (y0) i1Var.getValue();
                    if (kotlin.jvm.internal.m.a(y0Var, u0.f59565a)) {
                        s2Var.a(l0.f59488a);
                    } else if (kotlin.jvm.internal.m.a(y0Var, w0.f59570a)) {
                        s2Var.a(m0.f59490a);
                    }
                }
                return b0Var;
            case 2:
                i2 i2Var = (i2) obj3;
                b1 b1Var = (b1) obj2;
                String it = (String) obj;
                kotlin.jvm.internal.m.f(it, "it");
                ((fz.c) obj4).invoke(it);
                if (i2Var != null) {
                    ((h1) i2Var).a();
                }
                b1Var.setValue(Boolean.FALSE);
                return b0Var;
            case 3:
                int i15 = 0;
                a0 a0Var = (a0) obj4;
                l0.h LazyColumn = (l0.h) obj;
                kotlin.jvm.internal.m.f(LazyColumn, "$this$LazyColumn");
                l0.h.p(LazyColumn, null, new t1.d(new v1((DailyGoalUiState) obj3, (fz.c) obj2, a0Var, 1), true, 84513758), 3);
                if (!a0Var.f59378g.isEmpty() || !a0Var.f59377f.isEmpty()) {
                    l0.h.p(LazyColumn, null, xu.c.f56359l0, 3);
                    l0.h.p(LazyColumn, null, new t1.d(new z1(a0Var, i15), true, 1218635980), 3);
                    l0.h.p(LazyColumn, null, xu.c.f56360m0, 3);
                    l0.h.p(LazyColumn, null, new t1.d(new z1(a0Var, 1), true, -1274195446), 3);
                    List list = a0Var.f59378g;
                    LazyColumn.q(list.size(), null, new qu.m(17, list), new t1.d(new u(i13, list, a0Var), true, 2039820996));
                }
                return b0Var;
            case 4:
                j0 DisposableEffect = (j0) obj;
                kotlin.jvm.internal.m.f(DisposableEffect, "$this$DisposableEffect");
                return new a0.i((y) obj4, (av.n) obj3, (av.n) obj2, 5);
            case 5:
                dd ddVar = (dd) obj4;
                b1 b1Var2 = (b1) obj3;
                b1 b1Var3 = (b1) obj2;
                ht.o oVar = (ht.o) obj;
                kotlin.jvm.internal.m.f(oVar, EHjhWcesDUIsIw.WDoaRZJMzQUWVtq);
                int i16 = oVar.f33755c;
                int i17 = oVar.f33753a;
                if (i17 == -1) {
                    ddVar.t(yb.f50724a);
                } else if ((i17 == 1 && ry.l.D(new Integer[]{13, 31}, Integer.valueOf(i16))) || i17 == 2 || (i17 == 0 && ry.l.D(new Integer[]{5, 9, 10}, Integer.valueOf(i16)))) {
                    ddVar.t(zb.f50802a);
                } else {
                    b1Var2.setValue(Boolean.valueOf(i17 == 1 && i16 == 7));
                    b1Var3.setValue(Boolean.TRUE);
                }
                return b0Var;
            case 6:
                zi.g gVar2 = (zi.g) obj4;
                kotlin.jvm.internal.m.f((View) obj, "it");
                ((p0) gVar2.f59222a).I(com.bumptech.glide.f.r(gVar2.f59223b.f56089c, (String) obj3));
                ObjectAnimator.ofPropertyValuesHolder((TextView) obj2, PropertyValuesHolder.ofFloat("scaleX", 0.8f, 1.0f), PropertyValuesHolder.ofFloat("scaleY", 0.8f, 1.0f)).setDuration(300L).start();
                return b0Var;
            default:
                zi.i iVar = (zi.i) obj4;
                LinearLayout linearLayout = (LinearLayout) obj3;
                String str = (String) obj2;
                kotlin.jvm.internal.m.f((View) obj, "it");
                int[] iArr = new int[2];
                int[] iArr2 = new int[2];
                ta.a aVar = iVar.f59227f;
                kotlin.jvm.internal.m.c(aVar);
                int childCount = ((x1) aVar).f33564c.getChildCount();
                int i18 = 0;
                while (true) {
                    if (i18 < childCount) {
                        ta.a aVar2 = iVar.f59227f;
                        kotlin.jvm.internal.m.c(aVar2);
                        childAt = ((x1) aVar2).f33564c.getChildAt(i18);
                        if (childAt.getTag(R.id.tag_pinyin) == null) {
                            childAt.getLocationOnScreen(iArr);
                        } else {
                            i18++;
                        }
                    } else {
                        childAt = null;
                    }
                }
                if (childAt != null) {
                    c11 = 1;
                    linearLayout.getLocationOnScreen(iArr2);
                    if (childAt != null) {
                        childAt.setTag(R.id.bottom_view, linearLayout);
                        childAt.setTag(R.id.tag_pinyin, str);
                        int i19 = iArr[0] - iArr2[0];
                        int i21 = iArr[c11] - iArr2[c11];
                        z4.w0 w0VarB = z4.s0.b(linearLayout);
                        w0VarB.j(i19);
                        w0VarB.l(i21);
                        w0VarB.e(300L);
                        w0VarB.i();
                        th.j.a(qx.h.m(300L, TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new m4(linearLayout, childAt, iVar, 11), zi.a.f59219f), iVar.f59228g);
                    }
                } else if (iVar.f59249k != 2) {
                    ta.a aVar3 = iVar.f59227f;
                    kotlin.jvm.internal.m.c(aVar3);
                    int childCount2 = ((x1) aVar3).f33564c.getChildCount();
                    int i22 = 0;
                    while (true) {
                        if (i22 < childCount2) {
                            c11 = 1;
                            ta.a aVar4 = iVar.f59227f;
                            kotlin.jvm.internal.m.c(aVar4);
                            View childAt2 = ((x1) aVar4).f33564c.getChildAt(i22);
                            if (childAt2.getTag(R.id.bottom_view) != null) {
                                View view = (View) childAt2.getTag(R.id.bottom_view);
                                if (view != null) {
                                    iVar.p(view);
                                    childAt2.setTag(R.id.bottom_view, null);
                                    childAt2.setTag(R.id.tag_pinyin, null);
                                }
                                childAt2.getLocationOnScreen(iArr);
                                childAt = childAt2;
                            } else {
                                i22++;
                            }
                        } else {
                            c11 = 1;
                        }
                    }
                    linearLayout.getLocationOnScreen(iArr2);
                    if (childAt != null) {
                        childAt.setTag(R.id.bottom_view, linearLayout);
                        childAt.setTag(R.id.tag_pinyin, str);
                        int i110 = iArr[0] - iArr2[0];
                        int i23 = iArr[c11] - iArr2[c11];
                        z4.w0 w0VarB2 = z4.s0.b(linearLayout);
                        w0VarB2.j(i110);
                        w0VarB2.l(i23);
                        w0VarB2.e(300L);
                        w0VarB2.i();
                        th.j.a(qx.h.m(300L, TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new m4(linearLayout, childAt, iVar, 11), zi.a.f59219f), iVar.f59228g);
                    }
                }
                return b0Var;
        }
    }
}
