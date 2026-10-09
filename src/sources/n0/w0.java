package n0;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.lifecycle.ViewModelKt;
import androidx.recyclerview.widget.p2;
import com.google.api.Service;
import com.lingo.fluent.object.WordSpellOption;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.JPChar;
import com.lingo.lingoskill.object.PdWord;
import com.lingodeer.R;
import com.lingodeer.data.model.SyllableWriteLesson;
import com.yalantis.ucrop.view.CropImageView;
import fr.j3;
import fr.p3;
import hj.m1;
import hj.m2;
import hj.u5;
import hj.x5;
import hj.z1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import qp.b2;
import qp.k2;
import qp.l1;
import qp.n1;
import qp.s1;
import qp.s2;
import qp.y1;
import rt.zb;
import sz.xej.iFLeRCXvYCGdPW;
import uz.i1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w0 implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f43019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f43020c;

    public /* synthetic */ w0(int i11, Object obj, Object obj2) {
        this.f43018a = i11;
        this.f43019b = obj;
        this.f43020c = obj2;
    }

    private final Object a(Object obj) {
        y1 y1Var = (y1) this.f43019b;
        ImageView imageView = (ImageView) this.f43020c;
        View it = (View) obj;
        kotlin.jvm.internal.m.f(it, "it");
        mp.b bVar = y1Var.f47881a;
        String strB = y1Var.b();
        kotlin.jvm.internal.m.c(imageView);
        ((jp.p0) bVar).H(imageView, strB);
        return qy.b0.f48488a;
    }

    private final Object c(Object obj) {
        FrameLayout frameLayout = (FrameLayout) this.f43019b;
        b2 b2Var = (b2) this.f43020c;
        View it = (View) obj;
        kotlin.jvm.internal.m.f(it, "it");
        View view = (View) frameLayout.getTag(R.id.tag_view);
        if (view != null) {
            view.setVisibility(0);
        }
        ta.a aVar = b2Var.f47886f;
        kotlin.jvm.internal.m.c(aVar);
        ((m2) aVar).f32918c.removeView(frameLayout);
        ta.a aVar2 = b2Var.f47886f;
        kotlin.jvm.internal.m.c(aVar2);
        ((m2) aVar2).f32918c.requestLayout();
        b2Var.y();
        b2Var.v();
        return qy.b0.f48488a;
    }

    private final Object d(Object obj) {
        k2 k2Var = (k2) this.f43019b;
        ImageView imageView = (ImageView) this.f43020c;
        View it = (View) obj;
        kotlin.jvm.internal.m.f(it, "it");
        ((jp.p0) k2Var.f47881a).H(imageView, k2Var.b());
        return qy.b0.f48488a;
    }

    private final Object e(Object obj) {
        k2 k2Var = (k2) this.f43019b;
        kotlin.jvm.internal.u uVar = (kotlin.jvm.internal.u) this.f43020c;
        View it = (View) obj;
        kotlin.jvm.internal.m.f(it, "it");
        th.j.a(qx.h.m(150L, TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new qp.r(1, k2Var, uVar), vx.b.f54316e), k2Var.f47887g);
        return qy.b0.f48488a;
    }

    /* JADX WARN: Code duplicated, block: B:242:0x09ea  */
    /* JADX WARN: Code duplicated, block: B:245:0x09fb  */
    /* JADX WARN: Code duplicated, block: B:247:0x0a0a  */
    /* JADX WARN: Code duplicated, block: B:269:0x0a56  */
    /* JADX WARN: Code duplicated, block: B:272:0x0a67  */
    /* JADX WARN: Code duplicated, block: B:274:0x0a76  */
    /* JADX WARN: Code duplicated, block: B:297:0x0ac9  */
    /* JADX WARN: Code duplicated, block: B:300:0x0ada  */
    /* JADX WARN: Code duplicated, block: B:302:0x0ae9  */
    /* JADX WARN: Code duplicated, block: B:306:0x0af5  */
    /* JADX WARN: Code duplicated, block: B:308:0x0b00  */
    /* JADX WARN: Code duplicated, block: B:310:0x0b0a  */
    /* JADX WARN: Code duplicated, block: B:313:0x0b17  */
    /* JADX WARN: Code duplicated, block: B:316:0x0b21  */
    /* JADX WARN: Code duplicated, block: B:319:0x0b2b  */
    /* JADX WARN: Code duplicated, block: B:320:0x0b2d  */
    /* JADX WARN: Code duplicated, block: B:322:0x0b33  */
    /* JADX WARN: Code duplicated, block: B:325:0x0b3d  */
    /* JADX WARN: Code duplicated, block: B:330:0x0b48  */
    /* JADX WARN: Code duplicated, block: B:333:0x0b59  */
    /* JADX WARN: Code duplicated, block: B:335:0x0b68  */
    /* JADX WARN: Code duplicated, block: B:337:0x0b6e  */
    /* JADX WARN: Code duplicated, block: B:397:0x0c92  */
    /* JADX WARN: Code duplicated, block: B:398:0x0c95  */
    /* JADX WARN: Code duplicated, block: B:441:0x0a0d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:450:0x0a79 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:460:0x0aec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:461:0x0b43 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:467:0x0b3e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:470:0x0b6b A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // fz.c
    public final Object invoke(Object obj) {
        qy.l lVar;
        n3.f0 f0Var;
        Object e0Var;
        Object objInvoke;
        Object objInvoke2;
        ArrayList arrayList;
        int size;
        int i11;
        n3.s sVar;
        int size2;
        int i12;
        n3.s sVar2;
        n3.s sVar3;
        int size3;
        int i13;
        Object obj2;
        n3.s sVar4;
        int i14;
        int i15;
        Object obj3;
        int size4;
        int i16;
        Object obj4;
        int size5;
        int i17;
        Object obj5;
        Typeface typefaceH;
        String strM;
        PdWord word;
        PdWord word2;
        PdWord word3;
        PdWord word4;
        int i18 = 2;
        vy.d dVar = null;
        int i19 = 1;
        switch (this.f43018a) {
            case 0:
                return new x0((w1.e) this.f43019b, (Map) obj, (w1.b) this.f43020c);
            case 1:
                n3.j jVar = (n3.j) this.f43019b;
                n3.d0 d0Var = (n3.d0) this.f43020c;
                fz.c cVar = (fz.c) obj;
                n3.n nVar = jVar.f43161d;
                hq.a aVar = jVar.f43158a;
                kp.j jVar2 = jVar.f43163f;
                nVar.getClass();
                n3.i iVar = d0Var.f43144a;
                if (iVar instanceof n3.l) {
                    List list = ((n3.l) iVar).f43166f;
                    n3.s sVar5 = d0Var.f43145b;
                    int i21 = d0Var.f43146c;
                    ArrayList arrayList2 = new ArrayList(list.size());
                    int size6 = list.size();
                    for (int i22 = 0; i22 < size6; i22++) {
                        Object obj6 = list.get(i22);
                        n3.a0 a0Var = (n3.a0) obj6;
                        if (kotlin.jvm.internal.m.a(a0Var.f43127b, sVar5) && a0Var.f43128c == i21) {
                            arrayList2.add(obj6);
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        ArrayList arrayList3 = new ArrayList(list.size());
                        int size7 = list.size();
                        for (int i23 = 0; i23 < size7; i23++) {
                            Object obj7 = list.get(i23);
                            if (((n3.a0) obj7).f43128c == i21) {
                                arrayList3.add(obj7);
                            }
                        }
                        if (!arrayList3.isEmpty()) {
                            list = arrayList3;
                        }
                        int iCompareTo = sVar5.compareTo(n3.s.f43173b);
                        int i24 = sVar5.f43179a;
                        if (iCompareTo < 0) {
                            int size8 = list.size();
                            n3.s sVar6 = null;
                            n3.s sVar7 = null;
                            for (int i25 = 0; i25 < size8; i25++) {
                                n3.s sVar8 = ((n3.a0) list.get(i25)).f43127b;
                                int i26 = sVar8.f43179a;
                                if (kotlin.jvm.internal.m.h(i26, i24) < 0) {
                                    if (sVar6 == null || kotlin.jvm.internal.m.h(i26, sVar6.f43179a) > 0) {
                                        sVar6 = sVar8;
                                    }
                                } else if (kotlin.jvm.internal.m.h(i26, i24) <= 0) {
                                    sVar6 = sVar8;
                                    sVar7 = sVar6;
                                    if (sVar6 == null) {
                                        sVar6 = sVar7;
                                    }
                                    arrayList2 = new ArrayList(list.size());
                                    size5 = list.size();
                                    for (i17 = 0; i17 < size5; i17++) {
                                        obj5 = list.get(i17);
                                        if (kotlin.jvm.internal.m.a(((n3.a0) obj5).f43127b, sVar6)) {
                                            arrayList2.add(obj5);
                                        }
                                    }
                                } else if (sVar7 == null || kotlin.jvm.internal.m.h(i26, sVar7.f43179a) < 0) {
                                    sVar7 = sVar8;
                                }
                            }
                            if (sVar6 == null) {
                                sVar6 = sVar7;
                            }
                            arrayList2 = new ArrayList(list.size());
                            size5 = list.size();
                            while (i17 < size5) {
                                obj5 = list.get(i17);
                                if (kotlin.jvm.internal.m.a(((n3.a0) obj5).f43127b, sVar6)) {
                                    arrayList2.add(obj5);
                                }
                            }
                        } else {
                            n3.s sVar9 = n3.s.f43174c;
                            if (sVar5.compareTo(sVar9) > 0) {
                                int size9 = list.size();
                                n3.s sVar10 = null;
                                n3.s sVar11 = null;
                                for (int i27 = 0; i27 < size9; i27++) {
                                    n3.s sVar12 = ((n3.a0) list.get(i27)).f43127b;
                                    int i28 = sVar12.f43179a;
                                    if (kotlin.jvm.internal.m.h(i28, i24) < 0) {
                                        if (sVar10 == null || kotlin.jvm.internal.m.h(i28, sVar10.f43179a) > 0) {
                                            sVar10 = sVar12;
                                        }
                                    } else if (kotlin.jvm.internal.m.h(i28, i24) <= 0) {
                                        sVar10 = sVar12;
                                        sVar11 = sVar10;
                                        if (sVar11 != null) {
                                            sVar10 = sVar11;
                                        }
                                        arrayList2 = new ArrayList(list.size());
                                        size4 = list.size();
                                        for (i16 = 0; i16 < size4; i16++) {
                                            obj4 = list.get(i16);
                                            if (kotlin.jvm.internal.m.a(((n3.a0) obj4).f43127b, sVar10)) {
                                                arrayList2.add(obj4);
                                            }
                                        }
                                    } else if (sVar11 == null || kotlin.jvm.internal.m.h(i28, sVar11.f43179a) < 0) {
                                        sVar11 = sVar12;
                                    }
                                }
                                if (sVar11 != null) {
                                    sVar10 = sVar11;
                                }
                                arrayList2 = new ArrayList(list.size());
                                size4 = list.size();
                                while (i16 < size4) {
                                    obj4 = list.get(i16);
                                    if (kotlin.jvm.internal.m.a(((n3.a0) obj4).f43127b, sVar10)) {
                                        arrayList2.add(obj4);
                                    }
                                }
                            } else {
                                int size10 = list.size();
                                int i29 = 0;
                                n3.s sVar13 = null;
                                n3.s sVar14 = null;
                                while (i29 < size10) {
                                    n3.s sVar15 = ((n3.a0) list.get(i29)).f43127b;
                                    int i30 = size10;
                                    if (kotlin.jvm.internal.m.h(sVar15.f43179a, sVar9.f43179a) <= 0) {
                                        int i31 = sVar15.f43179a;
                                        if (kotlin.jvm.internal.m.h(i31, i24) < 0) {
                                            if (sVar13 == null || kotlin.jvm.internal.m.h(i31, sVar13.f43179a) > 0) {
                                                sVar13 = sVar15;
                                            }
                                        } else if (kotlin.jvm.internal.m.h(i31, i24) <= 0) {
                                            sVar13 = sVar15;
                                            sVar14 = sVar13;
                                            if (sVar14 != null) {
                                                sVar13 = sVar14;
                                            }
                                            arrayList = new ArrayList(list.size());
                                            size = list.size();
                                            for (i11 = 0; i11 < size; i11++) {
                                                obj3 = list.get(i11);
                                                if (kotlin.jvm.internal.m.a(((n3.a0) obj3).f43127b, sVar13)) {
                                                    arrayList.add(obj3);
                                                }
                                            }
                                            if (arrayList.isEmpty()) {
                                                sVar = n3.s.f43174c;
                                                size2 = list.size();
                                                i12 = 0;
                                                sVar2 = null;
                                                sVar3 = null;
                                                while (i12 < size2) {
                                                    sVar4 = ((n3.a0) list.get(i12)).f43127b;
                                                    if (sVar != null) {
                                                        i14 = size2;
                                                        if (kotlin.jvm.internal.m.h(sVar4.f43179a, sVar.f43179a) < 0) {
                                                            continue;
                                                        }
                                                        i12++;
                                                        size2 = i14;
                                                    } else {
                                                        i14 = size2;
                                                    }
                                                    i15 = sVar4.f43179a;
                                                    if (kotlin.jvm.internal.m.h(i15, i24) < 0) {
                                                        if (sVar2 != null || kotlin.jvm.internal.m.h(i15, sVar2.f43179a) > 0) {
                                                            sVar2 = sVar4;
                                                        }
                                                    } else if (kotlin.jvm.internal.m.h(i15, i24) > 0) {
                                                        sVar2 = sVar4;
                                                        sVar3 = sVar2;
                                                        if (sVar3 != null) {
                                                            sVar2 = sVar3;
                                                        }
                                                        arrayList2 = new ArrayList(list.size());
                                                        size3 = list.size();
                                                        for (i13 = 0; i13 < size3; i13++) {
                                                            obj2 = list.get(i13);
                                                            if (kotlin.jvm.internal.m.a(((n3.a0) obj2).f43127b, sVar2)) {
                                                                arrayList2.add(obj2);
                                                            }
                                                        }
                                                    } else if (sVar3 != null || kotlin.jvm.internal.m.h(i15, sVar3.f43179a) < 0) {
                                                        sVar3 = sVar4;
                                                    }
                                                    i12++;
                                                    size2 = i14;
                                                }
                                                if (sVar3 != null) {
                                                    sVar2 = sVar3;
                                                }
                                                arrayList2 = new ArrayList(list.size());
                                                size3 = list.size();
                                                while (i13 < size3) {
                                                    obj2 = list.get(i13);
                                                    if (kotlin.jvm.internal.m.a(((n3.a0) obj2).f43127b, sVar2)) {
                                                        arrayList2.add(obj2);
                                                    }
                                                }
                                            } else {
                                                arrayList2 = arrayList;
                                            }
                                        } else if (sVar14 == null || kotlin.jvm.internal.m.h(i31, sVar14.f43179a) < 0) {
                                            sVar14 = sVar15;
                                        }
                                    }
                                    i29++;
                                    size10 = i30;
                                }
                                if (sVar14 != null) {
                                    sVar13 = sVar14;
                                }
                                arrayList = new ArrayList(list.size());
                                size = list.size();
                                while (i11 < size) {
                                    obj3 = list.get(i11);
                                    if (kotlin.jvm.internal.m.a(((n3.a0) obj3).f43127b, sVar13)) {
                                        arrayList.add(obj3);
                                    }
                                }
                                if (arrayList.isEmpty()) {
                                    sVar = n3.s.f43174c;
                                    size2 = list.size();
                                    i12 = 0;
                                    sVar2 = null;
                                    sVar3 = null;
                                    while (i12 < size2) {
                                        sVar4 = ((n3.a0) list.get(i12)).f43127b;
                                        if (sVar != null) {
                                            i14 = size2;
                                            if (kotlin.jvm.internal.m.h(sVar4.f43179a, sVar.f43179a) < 0) {
                                                continue;
                                            }
                                            i12++;
                                            size2 = i14;
                                        } else {
                                            i14 = size2;
                                        }
                                        i15 = sVar4.f43179a;
                                        if (kotlin.jvm.internal.m.h(i15, i24) < 0) {
                                            if (sVar2 != null) {
                                                sVar2 = sVar4;
                                            } else {
                                                sVar2 = sVar4;
                                            }
                                        } else if (kotlin.jvm.internal.m.h(i15, i24) > 0) {
                                            sVar2 = sVar4;
                                            sVar3 = sVar2;
                                            if (sVar3 != null) {
                                                sVar2 = sVar3;
                                            }
                                            arrayList2 = new ArrayList(list.size());
                                            size3 = list.size();
                                            while (i13 < size3) {
                                                obj2 = list.get(i13);
                                                if (kotlin.jvm.internal.m.a(((n3.a0) obj2).f43127b, sVar2)) {
                                                    arrayList2.add(obj2);
                                                }
                                            }
                                        } else if (sVar3 != null) {
                                            sVar3 = sVar4;
                                        } else {
                                            sVar3 = sVar4;
                                        }
                                        i12++;
                                        size2 = i14;
                                    }
                                    if (sVar3 != null) {
                                        sVar2 = sVar3;
                                    }
                                    arrayList2 = new ArrayList(list.size());
                                    size3 = list.size();
                                    while (i13 < size3) {
                                        obj2 = list.get(i13);
                                        if (kotlin.jvm.internal.m.a(((n3.a0) obj2).f43127b, sVar2)) {
                                            arrayList2.add(obj2);
                                        }
                                    }
                                } else {
                                    arrayList2 = arrayList;
                                }
                            }
                        }
                    }
                    xq.c cVar2 = nVar.f43168a;
                    if (arrayList2.size() > 0) {
                        n3.a0 a0Var2 = (n3.a0) arrayList2.get(0);
                        a0Var2.getClass();
                        synchronized (((p3) cVar2.f56176d)) {
                            try {
                                aVar.getClass();
                                n3.e eVar = new n3.e(a0Var2);
                                n3.d dVar2 = (n3.d) ((p2) cVar2.f56174b).j(eVar);
                                if (dVar2 == null) {
                                    dVar2 = (n3.d) ((y.i0) cVar2.f56175c).g(eVar);
                                }
                                if (dVar2 != null) {
                                    objInvoke2 = dVar2.f43143a;
                                } else {
                                    try {
                                        Context context = aVar.f33689a;
                                        if (a0Var2 instanceof n3.a0) {
                                            Typeface typefaceA = q4.j.a(context, a0Var2.f43126a);
                                            kotlin.jvm.internal.m.c(typefaceA);
                                            objInvoke = Build.VERSION.SDK_INT >= 26 ? n3.c0.a(typefaceA, a0Var2.f43129d, context) : typefaceA;
                                        } else {
                                            objInvoke = null;
                                        }
                                    } catch (Exception unused) {
                                        objInvoke = jVar2.invoke(d0Var);
                                    }
                                    cVar2.getClass();
                                    aVar.getClass();
                                    n3.e eVar2 = new n3.e(a0Var2);
                                    synchronized (((p3) cVar2.f56176d)) {
                                        try {
                                            if (objInvoke == null) {
                                                ((y.i0) cVar2.f56175c).m(eVar2, new n3.d(null));
                                            } else {
                                                ((p2) cVar2.f56174b).q(eVar2, new n3.d(objInvoke));
                                            }
                                        } catch (Throwable th2) {
                                            throw th2;
                                        }
                                        break;
                                    }
                                    objInvoke2 = objInvoke;
                                }
                            } catch (Throwable th3) {
                                throw th3;
                            }
                            break;
                        }
                        if (objInvoke2 == null) {
                            objInvoke2 = jVar2.invoke(d0Var);
                        }
                        lVar = new qy.l(null, j3.U(d0Var.f43147d, objInvoke2, a0Var2, d0Var.f43145b, d0Var.f43146c));
                    } else {
                        lVar = new qy.l(null, jVar2.invoke(d0Var));
                    }
                    List list2 = (List) lVar.f48495a;
                    Object obj8 = lVar.f48496b;
                    if (list2 == null) {
                        e0Var = new n3.f0(obj8, true);
                        f0Var = null;
                    } else {
                        n3.c cVar3 = new n3.c(list2, obj8, d0Var, nVar.f43168a, cVar, aVar);
                        f0Var = null;
                        rz.e0.B(nVar.f43169b, null, rz.d0.UNDISPATCHED, new mv.f0(cVar3, null == true ? 1 : 0, 2), 1);
                        e0Var = new n3.e0(cVar3);
                    }
                } else {
                    f0Var = null;
                    e0Var = null;
                }
                if (e0Var != null) {
                    return e0Var;
                }
                n3.y yVar = (n3.y) jVar.f43162e.f40184b;
                n3.i iVar2 = d0Var.f43144a;
                int i32 = d0Var.f43146c;
                n3.s sVar16 = d0Var.f43145b;
                if (iVar2 == null || (iVar2 instanceof n3.f)) {
                    typefaceH = yVar.h(sVar16, i32);
                } else {
                    if (!(iVar2 instanceof n3.u)) {
                        if (iVar2 instanceof n3.v) {
                            typefaceH = (Typeface) ((n3.v) iVar2).f43183f.f40130b;
                        }
                        if (f0Var != null) {
                            return f0Var;
                        }
                        throw new IllegalStateException("Could not load font");
                    }
                    typefaceH = yVar.b((n3.u) iVar2, sVar16, i32);
                }
                f0Var = new n3.f0(typefaceH, true);
                if (f0Var != null) {
                    return f0Var;
                }
                throw new IllegalStateException("Could not load font");
            case 2:
                ob.l lVar2 = (ob.l) this.f43019b;
                n3.d0 d0Var2 = (n3.d0) this.f43020c;
                n3.g0 g0Var = (n3.g0) obj;
                synchronized (((p3) lVar2.f44822b)) {
                    try {
                        if (g0Var.c()) {
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                    break;
                }
                break;
            case 3:
                sv.j jVar3 = (sv.j) this.f43019b;
                j9.v vVar = (j9.v) this.f43020c;
                sv.e it = (sv.e) obj;
                kotlin.jvm.internal.m.f(it, "it");
                jVar3.a(new sv.f(it));
                j9.v.b(vVar, "syllable_test");
                break;
            case 4:
                qv.e eVar3 = (qv.e) this.f43019b;
                j9.v vVar2 = (j9.v) this.f43020c;
                SyllableWriteLesson it2 = (SyllableWriteLesson) obj;
                kotlin.jvm.internal.m.f(it2, "it");
                rz.e0.B(ViewModelKt.getViewModelScope(eVar3), null, null, new kr.w(28, it2, eVar3, dVar), 3);
                i1 i1Var = eVar3.f48431b;
                i1Var.getClass();
                i1Var.l(null, it2);
                j9.v.b(vVar2, "syllable_write_intro");
                break;
            case 5:
                fz.e eVar4 = (fz.e) this.f43019b;
                SyllableWriteLesson syllableWriteLesson = (SyllableWriteLesson) this.f43020c;
                List reviews = (List) obj;
                kotlin.jvm.internal.m.f(reviews, "reviews");
                eVar4.invoke(reviews, Integer.valueOf(syllableWriteLesson.getSortIndex()));
                break;
            case 6:
                sv.o oVar = (sv.o) this.f43019b;
                l1.b1 b1Var = (l1.b1) this.f43020c;
                ht.o courseTestParams = (ht.o) obj;
                kotlin.jvm.internal.m.f(courseTestParams, "courseTestParams");
                if (courseTestParams.f33768q) {
                    b1Var.setValue(Boolean.TRUE);
                } else {
                    oVar.t(zb.f50802a);
                }
                return qy.b0.f48488a;
            case 7:
                l1.b1 b1Var2 = (l1.b1) this.f43019b;
                w2.f1 f1Var = (w2.f1) obj;
                d1.l0 l0Var = new d1.l0(2, (ArrayList) this.f43020c);
                f1Var.f54492a = true;
                l0Var.invoke(f1Var);
                f1Var.f54492a = false;
                b1Var2.getValue();
                break;
            case 8:
                om.j jVar4 = (om.j) this.f43019b;
                JPChar jPChar = (JPChar) this.f43020c;
                kotlin.jvm.internal.m.f((View) obj, "it");
                jVar4.i(jPChar.getDisplayLuoMa());
                break;
            case 9:
                oo.h hVar = (oo.h) this.f43019b;
                SwitchCompat switchCompat = (SwitchCompat) this.f43020c;
                kotlin.jvm.internal.m.f((View) obj, "it");
                hVar.r().showStoryTrans = !hVar.r().showStoryTrans;
                hVar.r().updateEntry("showStoryTrans");
                switchCompat.setChecked(hVar.r().showStoryTrans);
                break;
            case 10:
                oo.d0 d0Var3 = (oo.d0) this.f43019b;
                SwitchCompat switchCompat2 = (SwitchCompat) this.f43020c;
                kotlin.jvm.internal.m.f((View) obj, "it");
                d0Var3.r().showStoryTrans = !d0Var3.r().showStoryTrans;
                d0Var3.r().updateEntry("showStoryTrans");
                switchCompat2.setChecked(d0Var3.r().showStoryTrans);
                break;
            case 11:
                oo.k0 k0Var = (oo.k0) this.f43019b;
                SwitchCompat switchCompat3 = (SwitchCompat) this.f43020c;
                kotlin.jvm.internal.m.f((View) obj, "it");
                k0Var.r().showStoryTrans = !k0Var.r().showStoryTrans;
                k0Var.r().updateEntry("showStoryTrans");
                switchCompat3.setChecked(k0Var.r().showStoryTrans);
                break;
            case 12:
                qh.e eVar5 = (qh.e) this.f43019b;
                AppCompatTextView appCompatTextView = (AppCompatTextView) this.f43020c;
                View view = (View) obj;
                kotlin.jvm.internal.m.f(view, "view");
                Object tag = view.getTag();
                kotlin.jvm.internal.m.d(tag, "null cannot be cast to non-null type com.lingo.lingoskill.object.PdWord");
                String favId = ((PdWord) tag).getFavId();
                sh.b bVar = eVar5.N;
                if (bVar == null) {
                    kotlin.jvm.internal.m.n("viewModel");
                    throw null;
                }
                eVar5.D(appCompatTextView, kotlin.jvm.internal.m.a(favId, bVar.a().getWord().getFavId()), false);
                break;
                break;
            case 13:
                qh.e eVar6 = (qh.e) this.f43019b;
                View view2 = (View) this.f43020c;
                kotlin.jvm.internal.m.f((View) obj, "it");
                ta.a aVar2 = eVar6.f36400f;
                kotlin.jvm.internal.m.c(aVar2);
                ((u5) aVar2).f33419t.removeView(view2);
                ta.a aVar3 = eVar6.f36400f;
                kotlin.jvm.internal.m.c(aVar3);
                com.bumptech.glide.e.m(((u5) aVar3).f33419t);
                eVar6.y();
                break;
            case 14:
                qh.k0 k0Var2 = (qh.k0) this.f43019b;
                View view3 = (View) this.f43020c;
                kotlin.jvm.internal.m.f((View) obj, "it");
                ta.a aVar4 = k0Var2.f36400f;
                kotlin.jvm.internal.m.c(aVar4);
                ((x5) aVar4).f33600k.removeView(view3);
                ta.a aVar5 = k0Var2.f36400f;
                kotlin.jvm.internal.m.c(aVar5);
                com.bumptech.glide.e.m(((x5) aVar5).f33600k);
                k0Var2.y();
                break;
            case 15:
                qh.k0 k0Var3 = (qh.k0) this.f43019b;
                WordSpellOption wordSpellOption = (WordSpellOption) this.f43020c;
                kotlin.jvm.internal.m.f((View) obj, "it");
                sh.d dVar3 = k0Var3.T;
                if (dVar3 == null) {
                    kotlin.jvm.internal.m.n("viewModel");
                    throw null;
                }
                dVar3.f51697e.set(true);
                k0Var3.E();
                th.e eVar7 = k0Var3.N;
                if (eVar7 == null) {
                    kotlin.jvm.internal.m.n("player");
                    throw null;
                }
                if (k0Var3.T == null) {
                    kotlin.jvm.internal.m.n("viewModel");
                    throw null;
                }
                PdWord word5 = wordSpellOption.getWord();
                kotlin.jvm.internal.m.f(word5, "word");
                if (word5.getWordStruct() == 1) {
                    String strF = xt.b.a().f();
                    Long wordId = word5.getWordId();
                    kotlin.jvm.internal.m.e(wordId, "getWordId(...)");
                    long jLongValue = wordId.longValue();
                    int[] iArr = bq.r.f4959a;
                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                    StringBuilder sbM = com.google.android.material.datepicker.d.m(jLongValue, "pod-", bq.m.g(cf.x.n().keyLanguage), "-w-yx-");
                    sbM.append(".mp3");
                    strM = defpackage.e.m(strF, sbM.toString());
                } else {
                    String strF2 = xt.b.a().f();
                    Long wordId2 = word5.getWordId();
                    kotlin.jvm.internal.m.e(wordId2, "getWordId(...)");
                    long jLongValue2 = wordId2.longValue();
                    int[] iArr2 = bq.r.f4959a;
                    LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                    StringBuilder sbM2 = com.google.android.material.datepicker.d.m(jLongValue2, "pod-", bq.m.g(cf.x.n().keyLanguage), "-w-");
                    sbM2.append(".mp3");
                    strM = defpackage.e.m(strF2, sbM2.toString());
                }
                eVar7.h(strM);
                PdWord word6 = wordSpellOption.getWord();
                List<PdWord> answerCharList = wordSpellOption.getAnswerCharList();
                n9.q qVar = k0Var3.f36401t;
                re.q qVar2 = vx.b.f54316e;
                sh.d dVar4 = k0Var3.T;
                if (dVar4 == null) {
                    kotlin.jvm.internal.m.n("viewModel");
                    throw dVar;
                }
                if (dVar4.N) {
                    ta.a aVar6 = k0Var3.f36400f;
                    kotlin.jvm.internal.m.c(aVar6);
                    ProgressBar progressBar = ((x5) aVar6).f33598i;
                    sh.d dVar5 = k0Var3.T;
                    if (dVar5 == null) {
                        kotlin.jvm.internal.m.n("viewModel");
                        throw 0;
                    }
                    progressBar.setProgress(dVar5.f51693a + 1);
                }
                int childCount = k0Var3.x().f32540e.getChildCount();
                for (int i33 = 0; i33 < childCount; i33++) {
                    k0Var3.x().f32540e.getChildAt(i33).setEnabled(false);
                    k0Var3.x().f32540e.getChildAt(i33).setAlpha(CropImageView.DEFAULT_ASPECT_RATIO);
                }
                FrameLayout frameLayout = k0Var3.x().f32538c;
                frameLayout.setEnabled(false);
                frameLayout.setAlpha(CropImageView.DEFAULT_ASPECT_RATIO);
                FrameLayout frameLayout2 = k0Var3.x().f32537b;
                frameLayout2.setEnabled(false);
                frameLayout2.setAlpha(CropImageView.DEFAULT_ASPECT_RATIO);
                StringBuilder sb2 = new StringBuilder();
                int childCount2 = k0Var3.x().f32539d.getChildCount();
                int i34 = 0;
                while (true) {
                    int i35 = R.id.tv_char;
                    if (i34 >= childCount2) {
                        StringBuilder sb3 = new StringBuilder();
                        Iterator<T> it3 = answerCharList.iterator();
                        while (it3.hasNext()) {
                            sb3.append(((PdWord) it3.next()).getWord());
                        }
                        ViewPropertyAnimator viewPropertyAnimatorAnimate = k0Var3.x().f32541f.animate();
                        ta.a aVar7 = k0Var3.f36400f;
                        kotlin.jvm.internal.m.c(aVar7);
                        viewPropertyAnimatorAnimate.translationYBy(((((x5) aVar7).f33600k.getHeight() / 2) - k0Var3.x().f32541f.getHeight()) - k0Var3.x().f32541f.getY()).setDuration(300L).start();
                        int size11 = answerCharList.size();
                        int i36 = 0;
                        while (i36 < size11) {
                            PdWord pdWord = answerCharList.get(i36);
                            View childAt = k0Var3.x().f32539d.getChildAt(i36);
                            TextView textView = (TextView) childAt.findViewById(i35);
                            List<PdWord> list3 = answerCharList;
                            PdWord pdWord2 = word6;
                            if (kotlin.jvm.internal.m.a(textView.getText().toString(), pdWord.getWord())) {
                                Context contextRequireContext = k0Var3.requireContext();
                                kotlin.jvm.internal.m.e(contextRequireContext, "requireContext(...)");
                                textView.setTextColor(contextRequireContext.getColor(R.color.primary_black));
                            } else {
                                Context contextRequireContext2 = k0Var3.requireContext();
                                kotlin.jvm.internal.m.e(contextRequireContext2, "requireContext(...)");
                                textView.setTextColor(contextRequireContext2.getColor(R.color.color_yellow));
                            }
                            textView.setText(pdWord.getWord());
                            textView.setTextSize(24.0f);
                            childAt.findViewById(R.id.iv_bottom_line).setVisibility(8);
                            childAt.getLayoutParams().width = -2;
                            i36++;
                            word6 = pdWord2;
                            answerCharList = list3;
                            i35 = R.id.tv_char;
                        }
                        PdWord pdWord3 = word6;
                        LingoSkillApplication lingoSkillApplication3 = LingoSkillApplication.f21665b;
                        if (cf.x.n().keyLanguage == 1) {
                            if (kotlin.jvm.internal.m.a(pdWord3.getZhuyin(), pdWord3.getWord())) {
                                k0Var3.x().f32544i.setVisibility(8);
                            } else {
                                k0Var3.x().f32544i.setVisibility(0);
                                k0Var3.x().f32544i.setText(pdWord3.getWord());
                            }
                        }
                        if (cf.x.n().keyLanguage == 0 && ((fr.o0) k0Var3.s()).t() == 0) {
                            k0Var3.x().f32544i.setVisibility(0);
                            k0Var3.x().f32544i.setText(pdWord3.getShowLuoma());
                        }
                        sb2.length();
                        sb3.length();
                        if (kotlin.jvm.internal.m.a(sb2.toString(), sb3.toString())) {
                            sh.d dVar6 = k0Var3.T;
                            if (dVar6 == null) {
                                kotlin.jvm.internal.m.n("viewModel");
                                throw dVar;
                            }
                            dVar6.K++;
                            dVar6.L++;
                            WordSpellOption wordSpellOption2 = (WordSpellOption) dVar6.a().getValue();
                            if (wordSpellOption2 != null && (word4 = wordSpellOption2.getWord()) != null) {
                                Long wordId3 = word4.getWordId();
                                kotlin.jvm.internal.m.e(wordId3, "getWordId(...)");
                                th.j.a(new ay.x(new gh.a(wordId3.longValue(), true)).k(ky.e.f38937b).g(px.b.a()).h(sh.a.f51676f, qVar2), dVar6.f51696d);
                            }
                            Iterator it4 = dVar6.f51698f.iterator();
                            kotlin.jvm.internal.m.e(it4, "iterator(...)");
                            while (it4.hasNext()) {
                                PdWord pdWord4 = (PdWord) it4.next();
                                String favId2 = pdWord4.getFavId();
                                WordSpellOption wordSpellOption3 = (WordSpellOption) dVar6.a().getValue();
                                if (kotlin.jvm.internal.m.a(favId2, (wordSpellOption3 == null || (word3 = wordSpellOption3.getWord()) == null) ? dVar : word3.getFavId())) {
                                    pdWord4.setFinishSortIndex(1L);
                                }
                            }
                            k0Var3.x().f32541f.setBackgroundResource(R.drawable.bg_game_word_spell_title_correct);
                            th.j.a(qx.h.m(500L, TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new qh.h0(k0Var3, 1), qVar2), qVar);
                        } else {
                            sh.d dVar7 = k0Var3.T;
                            if (dVar7 == null) {
                                kotlin.jvm.internal.m.n("viewModel");
                                throw dVar;
                            }
                            WordSpellOption wordSpellOption4 = (WordSpellOption) dVar7.a().getValue();
                            if (wordSpellOption4 != null && (word2 = wordSpellOption4.getWord()) != null) {
                                Long wordId4 = word2.getWordId();
                                kotlin.jvm.internal.m.e(wordId4, "getWordId(...)");
                                th.j.a(new ay.x(new gh.a(wordId4.longValue(), false)).k(ky.e.f38937b).g(px.b.a()).h(sh.a.f51677t, qVar2), dVar7.f51696d);
                            }
                            Iterator it5 = dVar7.f51698f.iterator();
                            kotlin.jvm.internal.m.e(it5, "iterator(...)");
                            while (it5.hasNext()) {
                                PdWord pdWord5 = (PdWord) it5.next();
                                String favId3 = pdWord5.getFavId();
                                WordSpellOption wordSpellOption5 = (WordSpellOption) dVar7.a().getValue();
                                if (kotlin.jvm.internal.m.a(favId3, (wordSpellOption5 == null || (word = wordSpellOption5.getWord()) == null) ? dVar : word.getFavId())) {
                                    pdWord5.setFinishSortIndex(0L);
                                }
                            }
                            ta.a aVar8 = k0Var3.f36400f;
                            kotlin.jvm.internal.m.c(aVar8);
                            ((x5) aVar8).f33591b.removeOneLife();
                            k0Var3.x().f32541f.setBackgroundResource(R.drawable.bg_game_word_spell_title_wrong);
                            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                            dy.j jVar5 = ky.e.f38937b;
                            th.j.a(qx.h.m(1200L, timeUnit, jVar5).g(px.b.a()).h(new qh.i0(k0Var3, 1), qVar2), qVar);
                            th.j.a(qx.h.m(1600L, timeUnit, jVar5).g(px.b.a()).h(new qh.j0(k0Var3, 1), qVar2), qVar);
                        }
                        return qy.b0.f48488a;
                    }
                    sb2.append(((TextView) k0Var3.x().f32539d.getChildAt(i34).findViewById(R.id.tv_char)).getText());
                    i34++;
                }
                break;
            case 16:
                qp.n nVar2 = (qp.n) this.f43019b;
                ImageView imageView = (ImageView) this.f43020c;
                kotlin.jvm.internal.m.f((View) obj, "it");
                mp.b bVar2 = nVar2.f47881a;
                String strB = nVar2.b();
                kotlin.jvm.internal.m.c(imageView);
                ((jp.p0) bVar2).H(imageView, strB);
                break;
            case 17:
                FrameLayout frameLayout3 = (FrameLayout) this.f43019b;
                qp.s sVar17 = (qp.s) this.f43020c;
                kotlin.jvm.internal.m.f((View) obj, "it");
                View view4 = (View) frameLayout3.getTag(R.id.tag_view);
                if (view4 != null) {
                    view4.setVisibility(0);
                }
                ta.a aVar9 = sVar17.f47886f;
                kotlin.jvm.internal.m.c(aVar9);
                ((m1) aVar9).f32912d.removeView(frameLayout3);
                ta.a aVar10 = sVar17.f47886f;
                kotlin.jvm.internal.m.c(aVar10);
                ((m1) aVar10).f32912d.requestLayout();
                sVar17.y();
                sVar17.v();
                break;
            case 18:
                qp.l0 l0Var2 = (qp.l0) this.f43019b;
                ImageView imageView2 = (ImageView) this.f43020c;
                kotlin.jvm.internal.m.f((View) obj, iFLeRCXvYCGdPW.tPWl);
                ((jp.p0) l0Var2.f47881a).H(imageView2, l0Var2.b());
                break;
            case 19:
                View view5 = (View) this.f43019b;
                qp.l0 l0Var3 = (qp.l0) this.f43020c;
                kotlin.jvm.internal.m.f((View) obj, "it");
                Object tag2 = view5.getTag(R.id.bottom_view);
                if (tag2 != null) {
                    View view6 = (View) tag2;
                    ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view6, "translationX", CropImageView.DEFAULT_ASPECT_RATIO);
                    ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view6, "translationY", CropImageView.DEFAULT_ASPECT_RATIO);
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2);
                    animatorSet.setDuration(200L);
                    animatorSet.addListener(new qa.p(i19, view6, l0Var3));
                    animatorSet.setInterpolator(new DecelerateInterpolator());
                    animatorSet.start();
                    ((jp.p0) l0Var3.f47881a).O(0);
                }
                view5.setTag(R.id.bottom_view, null);
                break;
            case 20:
                qp.l0 l0Var4 = (qp.l0) this.f43019b;
                ImageView imageView3 = (ImageView) this.f43020c;
                kotlin.jvm.internal.m.f((View) obj, "it");
                ((jp.p0) l0Var4.f47881a).H(imageView3, l0Var4.b());
                break;
            case 21:
                View view7 = (View) this.f43019b;
                qp.l0 l0Var5 = (qp.l0) this.f43020c;
                kotlin.jvm.internal.m.f((View) obj, "it");
                Object tag3 = view7.getTag(R.id.bottom_view);
                if (tag3 != null) {
                    View view8 = (View) tag3;
                    ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(view8, "translationX", CropImageView.DEFAULT_ASPECT_RATIO);
                    ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(view8, "translationY", CropImageView.DEFAULT_ASPECT_RATIO);
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    animatorSet2.play(objectAnimatorOfFloat3).with(objectAnimatorOfFloat4);
                    animatorSet2.setDuration(200L);
                    animatorSet2.addListener(new qa.p(i18, view8, l0Var5));
                    animatorSet2.setInterpolator(new DecelerateInterpolator());
                    animatorSet2.start();
                    ((jp.p0) l0Var5.f47881a).O(0);
                }
                view7.setTag(R.id.bottom_view, null);
                break;
            case 22:
                l1 l1Var = (l1) this.f43019b;
                String str = (String) this.f43020c;
                kotlin.jvm.internal.m.f((View) obj, "it");
                l1Var.z();
                mp.b bVar3 = l1Var.f47881a;
                th.e eVar8 = ((jp.p0) bVar3).V;
                if (eVar8 != null) {
                    eVar8.f52416c = new lf.x0(l1Var, 19);
                }
                qp.h hVar2 = l1Var.m;
                if (hVar2 == null) {
                    kotlin.jvm.internal.m.n("sentenceLayout");
                    throw null;
                }
                PopupWindow popupWindow = hVar2.f59275k;
                if (popupWindow != null && popupWindow.isShowing()) {
                    qp.h hVar3 = l1Var.m;
                    if (hVar3 == null) {
                        kotlin.jvm.internal.m.n("sentenceLayout");
                        throw null;
                    }
                    PopupWindow popupWindow2 = hVar3.f59275k;
                    if (popupWindow2 != null) {
                        popupWindow2.dismiss();
                    }
                }
                ta.a aVar11 = l1Var.f47886f;
                kotlin.jvm.internal.m.c(aVar11);
                if (((z1) aVar11).f33654k.f22150c) {
                    ta.a aVar12 = l1Var.f47886f;
                    kotlin.jvm.internal.m.c(aVar12);
                    android.support.v4.media.session.a.H(((ImageView) ((z1) aVar12).f33650g.f32408d).getBackground());
                    ta.a aVar13 = l1Var.f47886f;
                    kotlin.jvm.internal.m.c(aVar13);
                    ((jp.p0) bVar3).J(str, (ImageView) ((z1) aVar13).f33650g.f32408d, 0.8f);
                } else {
                    ta.a aVar14 = l1Var.f47886f;
                    kotlin.jvm.internal.m.c(aVar14);
                    ((jp.p0) bVar3).H((ImageView) ((z1) aVar14).f33650g.f32408d, str);
                }
                if (!com.google.android.material.datepicker.d.D(str)) {
                    l1Var.y();
                }
                return qy.b0.f48488a;
            case 23:
                n1 n1Var = (n1) this.f43019b;
                qp.h hVar4 = (qp.h) this.f43020c;
                View v11 = (View) obj;
                kotlin.jvm.internal.m.f(v11, "v");
                View view9 = (View) n1Var.f47818j;
                if (view9 != null) {
                    n1Var.r(view9);
                }
                n1Var.f48075p = hVar4;
                n1Var.f47818j = v11;
                n1Var.s(v11);
                ((jp.p0) n1Var.f47881a).O(4);
                break;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                s1 s1Var = (s1) this.f43019b;
                ImageView imageView4 = (ImageView) this.f43020c;
                kotlin.jvm.internal.m.f((View) obj, "it");
                ((jp.p0) s1Var.f47881a).H(imageView4, s1Var.b());
                break;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                return a(obj);
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                return c(obj);
            case 27:
                return d(obj);
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                return e(obj);
            default:
                s2 s2Var = (s2) this.f43019b;
                ImageView imageView5 = (ImageView) this.f43020c;
                kotlin.jvm.internal.m.f((View) obj, "it");
                ((jp.p0) s2Var.f47881a).H(imageView5, s2Var.b());
                break;
        }
        return qy.b0.f48488a;
    }
}
