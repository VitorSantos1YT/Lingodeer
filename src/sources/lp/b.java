package lp;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ay.k0;
import bq.z;
import com.google.api.Service;
import com.google.common.io.BaseEncoding;
import com.lingo.fluent.ui.game.adapter.WordListenGameFinishAdapter;
import com.lingo.lingoskill.object.Word;
import com.lingodeer.R;
import com.lingodeer.course.stroke_order_view_new.HwViewNew;
import com.yalantis.ucrop.view.CropImageView;
import f7.a0;
import hj.c2;
import hj.i1;
import hj.m1;
import hj.m2;
import hj.u1;
import hj.u5;
import hj.w1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.w;
import lw.c1;
import mw.f3;
import mw.y2;
import n0.w0;
import n9.q;
import n9.z1;
import o20.t0;
import ot.q2;
import qp.b0;
import qp.b2;
import qp.d1;
import qp.l1;
import qp.n4;
import qp.p3;
import qp.s;
import qp.s2;
import qp.z2;
import r.p0;
import retrofit2.HttpException;
import rt.t4;
import ry.u;
import rz.e0;
import z4.s0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class b implements tx.c, f3, o20.h, vq.f, zq.a, p0, u, ws.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f40184b;

    public /* synthetic */ b(Object obj, int i11) {
        this.f40183a = i11;
        this.f40184b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:32:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:36:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:38:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00e9 -> B:33:0x00eb). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.io.Serializable d(lp.b r18, com.lingodeer.data.model.CourseWord r19, long r20, long r22, xy.c r24) {
        /*
            Method dump skipped, instruction units count: 641
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lp.b.d(lp.b, com.lingodeer.data.model.CourseWord, long, long, xy.c):java.io.Serializable");
    }

    public static final void i(long j11, LinkedHashMap linkedHashMap, w wVar, ArrayList arrayList, int i11) {
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            long jLongValue = ((Number) obj).longValue();
            if (jLongValue != j11 && !linkedHashMap.containsKey(Long.valueOf(jLongValue))) {
                Long lValueOf = Long.valueOf(jLongValue);
                int i13 = wVar.f38359a;
                wVar.f38359a = i13 + 1;
                linkedHashMap.put(lValueOf, new q2(jLongValue, i11, i13));
            }
        }
    }

    @Override // ry.u
    public Iterator C() {
        return new nz.g((nz.i) this.f40184b);
    }

    @Override // tx.c
    public void accept(Object obj) {
        int i11 = 2;
        int i12 = 4;
        int i13 = 1;
        vy.d dVar = null;
        int i14 = 0;
        switch (this.f40183a) {
            case 2:
                List list = (List) obj;
                jo.a aVar = ((bm.a) this.f40184b).f4459a;
                kotlin.jvm.internal.m.c(list);
                oo.h hVar = (oo.h) aVar;
                hVar.getClass();
                e0.B(LifecycleOwnerKt.getLifecycleScope(hVar), null, null, new ns.j(5, hVar, list, dVar), 3);
                return;
            case 8:
                Long it = (Long) obj;
                kotlin.jvm.internal.m.f(it, "it");
                ((om.h) this.f40184b).f45611f.o();
                return;
            case 9:
                Boolean it2 = (Boolean) obj;
                kotlin.jvm.internal.m.f(it2, "it");
                ((oo.m) this.f40184b).x();
                return;
            case 13:
                ArrayList arrayList = (ArrayList) obj;
                pp.e eVar = (pp.e) this.f40184b;
                jp.p0 p0Var = eVar.f46976a;
                int size = arrayList.size();
                if (size <= 0) {
                    eVar.B();
                    p0Var.W(false);
                    return;
                }
                p0Var.W(true);
                fv.c cVar = eVar.M;
                if (cVar != null) {
                    cVar.c(arrayList, new fn.b(eVar, size, i11), false);
                    return;
                }
                return;
            case 14:
                Long it3 = (Long) obj;
                kotlin.jvm.internal.m.f(it3, "it");
                qh.e eVar2 = (qh.e) this.f40184b;
                ta.a aVar2 = eVar2.f36400f;
                kotlin.jvm.internal.m.c(aVar2);
                ConstraintLayout constraintLayout = ((u5) aVar2).f33419t;
                ta.a aVar3 = eVar2.f36400f;
                kotlin.jvm.internal.m.c(aVar3);
                constraintLayout.removeView(((u5) aVar3).f33404d);
                ta.a aVar4 = eVar2.f36400f;
                kotlin.jvm.internal.m.c(aVar4);
                ConstraintLayout constraintLayout2 = ((u5) aVar4).f33419t;
                ta.a aVar5 = eVar2.f36400f;
                kotlin.jvm.internal.m.c(aVar5);
                constraintLayout2.removeView(((u5) aVar5).f33405e);
                eVar2.t().c("jxz_fl_review_game_finish", new ns.d(18));
                bq.f fVar = new bq.f(eVar2.requireContext());
                py.a aVar6 = (py.a) fVar.f4946d;
                aVar6.f47209c = 15;
                aVar6.f47210d = 2;
                ta.a aVar7 = eVar2.f36400f;
                kotlin.jvm.internal.m.c(aVar7);
                fVar.l(((u5) aVar7).f33419t);
                LayoutInflater layoutInflaterFrom = LayoutInflater.from(eVar2.requireContext());
                ta.a aVar8 = eVar2.f36400f;
                kotlin.jvm.internal.m.c(aVar8);
                View viewInflate = layoutInflaterFrom.inflate(R.layout.include_word_listen_game_finish_list, (ViewGroup) ((u5) aVar8).f33419t, false);
                TextView textView = (TextView) viewInflate.findViewById(R.id.tv_xp);
                sh.b bVar = eVar2.N;
                if (bVar == null) {
                    kotlin.jvm.internal.m.n("viewModel");
                    throw null;
                }
                textView.setText("+" + eVar2.getString(R.string._s_xp, String.valueOf(bVar.f51683e)));
                ((TextView) viewInflate.findViewById(R.id.tv_finish_title)).setText(eVar2.getString(R.string.acquisition));
                TextView textView2 = (TextView) viewInflate.findViewById(R.id.tv_title);
                String string = eVar2.getString(R.string.correctly);
                sh.b bVar2 = eVar2.N;
                if (bVar2 == null) {
                    kotlin.jvm.internal.m.n("viewModel");
                    throw null;
                }
                textView2.setText(string + " " + bVar2.f51684f);
                ((LinearLayout) viewInflate.findViewById(R.id.ll_xp_level)).setVisibility(0);
                ((TextView) viewInflate.findViewById(R.id.tv_level)).setVisibility(8);
                ((Button) viewInflate.findViewById(R.id.btn_quit)).setBackgroundResource(R.drawable.bg_game_word_choose_finish_btn);
                ((Button) viewInflate.findViewById(R.id.btn_keep_going)).setBackgroundResource(R.drawable.bg_game_word_choose_finish_btn);
                View viewFindViewById = viewInflate.findViewById(R.id.btn_quit);
                kotlin.jvm.internal.m.e(viewFindViewById, "findViewById(...)");
                z.b(viewFindViewById, new w0(13, eVar2, viewInflate));
                View viewFindViewById2 = viewInflate.findViewById(R.id.btn_keep_going);
                kotlin.jvm.internal.m.e(viewFindViewById2, "findViewById(...)");
                z.b(viewFindViewById2, new qh.a(eVar2, i13));
                RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.recycler_view);
                eVar2.requireContext();
                recyclerView.setLayoutManager(new LinearLayoutManager(1));
                sh.b bVar3 = eVar2.N;
                if (bVar3 == null) {
                    kotlin.jvm.internal.m.n("viewModel");
                    throw null;
                }
                ArrayList arrayList2 = bVar3.f51680b;
                th.e eVar3 = eVar2.O;
                if (eVar3 == null) {
                    kotlin.jvm.internal.m.n("player");
                    throw null;
                }
                recyclerView.setAdapter(new WordListenGameFinishAdapter(arrayList2, eVar3));
                recyclerView.addItemDecoration(new qh.c(eVar2, i14));
                viewInflate.setVisibility(4);
                ta.a aVar9 = eVar2.f36400f;
                kotlin.jvm.internal.m.c(aVar9);
                viewInflate.setTranslationY(((u5) aVar9).f33419t.getHeight());
                ta.a aVar10 = eVar2.f36400f;
                kotlin.jvm.internal.m.c(aVar10);
                ((u5) aVar10).f33419t.addView(viewInflate);
                viewInflate.setVisibility(0);
                viewInflate.animate().translationY(CropImageView.DEFAULT_ASPECT_RATIO).setDuration(300L).start();
                return;
            case 16:
                Long it4 = (Long) obj;
                kotlin.jvm.internal.m.f(it4, "it");
                b0 b0Var = (b0) this.f40184b;
                ta.a aVar11 = b0Var.f47886f;
                Context context = b0Var.f47883c;
                kotlin.jvm.internal.m.c(aVar11);
                if (((i1) aVar11).f32681d == null) {
                    return;
                }
                ta.a aVar12 = b0Var.f47886f;
                kotlin.jvm.internal.m.c(aVar12);
                ((i1) aVar12).f32681d.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, context.getApplicationContext().getDrawable(R.drawable.line_grey));
                ta.a aVar13 = b0Var.f47886f;
                kotlin.jvm.internal.m.c(aVar13);
                EditText editText = ((i1) aVar13).f32681d;
                kotlin.jvm.internal.m.f(context, "context");
                editText.setTextColor(context.getColor(R.color.primary_black));
                return;
            case 17:
                Long it5 = (Long) obj;
                kotlin.jvm.internal.m.f(it5, "it");
                ((jp.p0) ((d1) this.f40184b).f47881a).X();
                return;
            case 18:
                Long it6 = (Long) obj;
                kotlin.jvm.internal.m.f(it6, "it");
                ((l1) this.f40184b).x();
                return;
            case 21:
                Long it7 = (Long) obj;
                kotlin.jvm.internal.m.f(it7, "it");
                z2 z2Var = (z2) this.f40184b;
                ta.a aVar14 = z2Var.f47886f;
                Context context2 = z2Var.f47883c;
                kotlin.jvm.internal.m.c(aVar14);
                if (((c2) aVar14).f32446d == null) {
                    return;
                }
                ta.a aVar15 = z2Var.f47886f;
                kotlin.jvm.internal.m.c(aVar15);
                ((c2) aVar15).f32446d.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, context2.getApplicationContext().getDrawable(R.drawable.line_grey));
                ta.a aVar16 = z2Var.f47886f;
                kotlin.jvm.internal.m.c(aVar16);
                EditText editText2 = ((c2) aVar16).f32446d;
                kotlin.jvm.internal.m.f(context2, "context");
                editText2.setTextColor(context2.getColor(R.color.primary_black));
                return;
            case 22:
                Long it8 = (Long) obj;
                kotlin.jvm.internal.m.f(it8, "it");
                p3 p3Var = (p3) this.f40184b;
                a0 a0Var = p3Var.f48115i;
                if (a0Var != null) {
                    a0Var.r(false);
                }
                a0 a0Var2 = p3Var.f48115i;
                if (a0Var2 != null) {
                    a0Var2.c(new y6.e0(0.5f, 1.0f));
                }
                a0 a0Var3 = p3Var.f48115i;
                if (a0Var3 != null) {
                    a0Var3.r(true);
                    return;
                }
                return;
            case 23:
                Long it9 = (Long) obj;
                kotlin.jvm.internal.m.f(it9, "it");
                n4 n4Var = (n4) this.f40184b;
                ArrayList arrayList3 = n4Var.m;
                if (arrayList3 == null) {
                    kotlin.jvm.internal.m.n("views");
                    throw null;
                }
                int size2 = arrayList3.size();
                for (int i15 = 0; i15 < size2; i15++) {
                    ArrayList arrayList4 = n4Var.m;
                    if (arrayList4 == null) {
                        kotlin.jvm.internal.m.n("views");
                        throw null;
                    }
                    View view = (View) arrayList4.get(i15);
                    kotlin.jvm.internal.m.d(view, "null cannot be cast to non-null type androidx.cardview.widget.CardView");
                    int defaultColor = ((CardView) view).getCardBackgroundColor().getDefaultColor();
                    Context context3 = n4Var.f47883c;
                    kotlin.jvm.internal.m.f(context3, "context");
                    if (defaultColor == context3.getColor(R.color.white)) {
                        view.setClickable(true);
                    } else {
                        view.setClickable(false);
                    }
                }
                return;
            default:
                Long it10 = (Long) obj;
                kotlin.jvm.internal.m.f(it10, "it");
                rq.g gVar = (rq.g) this.f40184b;
                ta.a aVar17 = gVar.f49363g;
                kotlin.jvm.internal.m.c(aVar17);
                ((w1) aVar17).f33505f.setAlpha(CropImageView.DEFAULT_ASPECT_RATIO);
                ta.a aVar18 = gVar.f49363g;
                kotlin.jvm.internal.m.c(aVar18);
                ((w1) aVar18).f33505f.setVisibility(0);
                ta.a aVar19 = gVar.f49363g;
                kotlin.jvm.internal.m.c(aVar19);
                ConstraintLayout constraintLayout3 = ((w1) aVar19).f33505f;
                constraintLayout3.postDelayed(new b2.c(i12, constraintLayout3, new rq.d(gVar, i12)), 0L);
                th.j.a(qx.h.m(1500L, TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new q(gVar, 24), rq.a.f49353e), gVar.f49364h);
                return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0176  */
    /* JADX WARN: Code duplicated, block: B:51:0x0186 A[LOOP:2: B:49:0x0180->B:51:0x0186, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:60:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:64:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:66:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:69:0x0201  */
    /* JADX WARN: Code duplicated, block: B:71:0x0207  */
    /* JADX WARN: Code duplicated, block: B:75:0x0228  */
    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX WARN: Code duplicated, block: B:80:0x025c  */
    /* JADX WARN: Code duplicated, block: B:84:0x026c A[LOOP:0: B:82:0x0266->B:84:0x026c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:86:0x0295  */
    /* JADX WARN: Code duplicated, block: B:92:0x0204 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x0255 -> B:78:0x0258). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public java.lang.Object e(long r24, long r26, long r28, xy.c r30) {
        /*
            Method dump skipped, instruction units count: 677
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lp.b.e(long, long, long, xy.c):java.lang.Object");
    }

    @Override // vq.f
    public void f(View view, Point point) {
        boolean zR;
        boolean zR2;
        switch (this.f40183a) {
            case 15:
                kotlin.jvm.internal.m.f(view, "view");
                s sVar = (s) this.f40184b;
                sVar.w();
                ArrayList arrayList = sVar.f48168w;
                int size = arrayList.size();
                boolean z11 = false;
                for (int i11 = 0; i11 < size; i11++) {
                    Object obj = arrayList.get(i11);
                    kotlin.jvm.internal.m.d(obj, "null cannot be cast to non-null type android.widget.FrameLayout");
                    FrameLayout frameLayout = (FrameLayout) obj;
                    if (frameLayout.getTag(R.id.tag_rects) != null) {
                        Object tag = frameLayout.getTag(R.id.tag_rects);
                        kotlin.jvm.internal.m.d(tag, "null cannot be cast to non-null type kotlin.collections.List<android.graphics.Rect>");
                        zR = s.r(sVar, view, point, (List) tag, frameLayout);
                    } else {
                        zR = false;
                    }
                    if (zR) {
                        z11 = true;
                    } else {
                        s.t(sVar, frameLayout);
                    }
                    frameLayout.requestLayout();
                }
                if (!z11) {
                    ta.a aVar = sVar.f47886f;
                    kotlin.jvm.internal.m.c(aVar);
                    ((m1) aVar).f32914f.setVisibility(4);
                }
                ta.a aVar2 = sVar.f47886f;
                kotlin.jvm.internal.m.c(aVar2);
                ((m1) aVar2).f32912d.requestLayout();
                break;
            default:
                kotlin.jvm.internal.m.f(view, "view");
                b2 b2Var = (b2) this.f40184b;
                b2Var.w();
                Word word = (Word) view.getTag();
                ArrayList arrayList2 = b2Var.f47856w;
                int size2 = arrayList2.size();
                boolean z12 = false;
                for (int i12 = 0; i12 < size2; i12++) {
                    Object obj2 = arrayList2.get(i12);
                    kotlin.jvm.internal.m.d(obj2, "null cannot be cast to non-null type android.widget.FrameLayout");
                    FrameLayout frameLayout2 = (FrameLayout) obj2;
                    Word word2 = (Word) frameLayout2.getTag();
                    if (frameLayout2.getTag(R.id.tag_rects) != null) {
                        Object tag2 = frameLayout2.getTag(R.id.tag_rects);
                        kotlin.jvm.internal.m.d(tag2, "null cannot be cast to non-null type kotlin.collections.List<android.graphics.Rect>");
                        zR2 = b2.r(b2Var, view, point, (List) tag2, frameLayout2);
                    } else {
                        zR2 = false;
                    }
                    if (zR2) {
                        z12 = true;
                    } else {
                        if (word != null && word2 != null && word.getWordId() == word2.getWordId()) {
                            int i13 = b2Var.f47851r;
                            ta.a aVar3 = b2Var.f47886f;
                            kotlin.jvm.internal.m.c(aVar3);
                            if (i13 == ((m2) aVar3).f32918c.indexOfChild(frameLayout2)) {
                                frameLayout2.setVisibility(8);
                            }
                        }
                        b2.t(b2Var, frameLayout2);
                    }
                    frameLayout2.requestLayout();
                }
                if (!z12) {
                    ta.a aVar4 = b2Var.f47886f;
                    kotlin.jvm.internal.m.c(aVar4);
                    ((m2) aVar4).f32919d.setVisibility(4);
                }
                ta.a aVar5 = b2Var.f47886f;
                kotlin.jvm.internal.m.c(aVar5);
                ((m2) aVar5).f32918c.requestLayout();
                break;
        }
    }

    @Override // ry.u
    public Object g(Object obj) {
        return Long.valueOf(((t4) obj).f50422b);
    }

    @Override // vq.f
    public void h(View view) {
        switch (this.f40183a) {
            case 15:
                s sVar = (s) this.f40184b;
                if (!sVar.f48165t) {
                    view.setVisibility(0);
                }
                s.s(sVar);
                sVar.y();
                break;
            default:
                b2 b2Var = (b2) this.f40184b;
                if (!b2Var.f47853t) {
                    view.setVisibility(0);
                    view.findViewById(R.id.arrow_top).setVisibility(4);
                    b2Var.v();
                }
                ta.a aVar = b2Var.f47886f;
                kotlin.jvm.internal.m.c(aVar);
                ((m2) aVar).f32919d.setVisibility(4);
                b2.s(b2Var);
                b2Var.y();
                break;
        }
    }

    public void j() {
        si.d dVar = (si.d) this.f40184b;
        ta.a aVar = dVar.f47886f;
        kotlin.jvm.internal.m.c(aVar);
        ws.b bVar = ((u1) aVar).f33381j.N;
        if (bVar != null) {
            bVar.f55200d = false;
            ValueAnimator valueAnimator = bVar.f55199c;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                bVar.f55199c.cancel();
            }
        }
        ta.a aVar2 = dVar.f47886f;
        kotlin.jvm.internal.m.c(aVar2);
        HwViewNew hwViewNew = ((u1) aVar2).f33381j;
        ws.j jVar = hwViewNew.O;
        if (jVar != null) {
            jVar.d();
        }
        ws.b bVar2 = hwViewNew.N;
        if (bVar2 != null) {
            bVar2.a(hwViewNew.K.size());
        }
        ((jp.p0) dVar.f47881a).O(5);
    }

    @Override // o20.h
    public void k(o20.e eVar, t0 t0Var) {
        rz.m mVar = (rz.m) this.f40184b;
        if (t0Var.f44598a.R) {
            mVar.resumeWith(t0Var.f44599b);
        } else {
            mVar.resumeWith(com.bumptech.glide.e.l(new HttpException(t0Var)));
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0052  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object l(dv.b bVar, xy.c cVar) {
        n9.c2 c2Var;
        b bVar2;
        if (cVar instanceof n9.c2) {
            c2Var = (n9.c2) cVar;
            int i11 = c2Var.f43525d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c2Var.f43525d = i11 - Integer.MIN_VALUE;
            } else {
                c2Var = new n9.c2(this, cVar);
            }
        } else {
            c2Var = new n9.c2(this, cVar);
        }
        Object obj = c2Var.f43523b;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = c2Var.f43525d;
        if (i12 == 0) {
            com.bumptech.glide.e.F(obj);
            try {
                kr.w wVar = new kr.w(22, this, bVar, null);
                c2Var.f43522a = this;
                c2Var.f43525d = 1;
                if (e0.l(wVar, c2Var) == aVar) {
                    return aVar;
                }
            } catch (z1 e8) {
                e = e8;
                bVar2 = this;
                if (e.f43745a != bVar2) {
                    throw e;
                }
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bVar2 = c2Var.f43522a;
            try {
                com.bumptech.glide.e.F(obj);
            } catch (z1 e10) {
                e = e10;
                if (e.f43745a != bVar2) {
                    throw e;
                }
            }
        }
        return qy.b0.f48488a;
    }

    public void m(boolean z11) {
        y2 y2Var = (y2) this.f40184b;
        y2Var.Z.r0(y2Var.E, z11);
    }

    public void n(c1 c1Var, byte[] bArr) {
        tw.b.c();
        try {
            String string = "/" + ((nw.m) this.f40184b).L.f40368b;
            if (bArr != null) {
                ((nw.m) this.f40184b).S = true;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                sb2.append("?");
                BaseEncoding baseEncoding = BaseEncoding.f17416a;
                baseEncoding.getClass();
                sb2.append(baseEncoding.c(bArr, bArr.length));
                string = sb2.toString();
            }
            synchronized (((nw.m) this.f40184b).P.f44229w) {
                nw.l.j(((nw.m) this.f40184b).P, c1Var, string);
            }
            tw.b.f52660a.getClass();
        } catch (Throwable th2) {
            try {
                tw.b.f52660a.getClass();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // vq.f
    public void r(View view) {
        switch (this.f40183a) {
            case 15:
                s sVar = (s) this.f40184b;
                sVar.f48165t = false;
                sVar.v();
                break;
            default:
                b2 b2Var = (b2) this.f40184b;
                b2Var.f47853t = false;
                view.setVisibility(8);
                ta.a aVar = b2Var.f47886f;
                kotlin.jvm.internal.m.c(aVar);
                b2Var.f47851r = ((m2) aVar).f32918c.indexOfChild(view);
                b2Var.v();
                break;
        }
    }

    public String toString() {
        switch (this.f40183a) {
            case 1:
                return (String) this.f40184b;
            default:
                return super.toString();
        }
    }

    @Override // vq.f
    public boolean w(View view, Point point) {
        int i11;
        int i12;
        switch (this.f40183a) {
            case 15:
                kotlin.jvm.internal.m.f(view, "view");
                s sVar = (s) this.f40184b;
                ArrayList arrayList = sVar.f48168w;
                ArrayList arrayListW = sVar.w();
                int size = arrayListW.size();
                int i13 = 0;
                while (i13 < size) {
                    List<Rect> list = (List) arrayListW.get(i13);
                    int size2 = (i13 == arrayListW.size() - 1 || i13 >= arrayList.size()) ? arrayList.size() - 1 : i13;
                    for (Rect rect : list) {
                        int i14 = point.x;
                        if (i14 >= rect.left && i14 < rect.right && (i11 = point.y) >= rect.top && i11 <= rect.bottom) {
                            sVar.f48165t = true;
                            ta.a aVar = sVar.f47886f;
                            kotlin.jvm.internal.m.c(aVar);
                            ((m1) aVar).f32914f.setVisibility(4);
                            s.s(sVar);
                            Word word = (Word) view.getTag();
                            LayoutInflater layoutInflaterFrom = LayoutInflater.from(sVar.f47883c);
                            ta.a aVar2 = sVar.f47886f;
                            kotlin.jvm.internal.m.c(aVar2);
                            View viewInflate = layoutInflaterFrom.inflate(R.layout.item_sentence_drag_btm_to_top_item, (ViewGroup) ((m1) aVar2).f32911c, false);
                            kotlin.jvm.internal.m.d(viewInflate, "null cannot be cast to non-null type android.widget.FrameLayout");
                            FrameLayout frameLayout = (FrameLayout) viewInflate;
                            LinearLayout linearLayout = (LinearLayout) frameLayout.findViewById(R.id.ll_item);
                            frameLayout.findViewById(R.id.arrow_top).setVisibility(4);
                            frameLayout.setTag(word);
                            frameLayout.setTag(R.id.tag_view, view);
                            if (word != null) {
                                kotlin.jvm.internal.m.c(linearLayout);
                                sVar.B(linearLayout, word);
                            }
                            sVar.x();
                            ef.e.B(frameLayout);
                            if (i13 == arrayListW.size() - 1) {
                                ta.a aVar3 = sVar.f47886f;
                                kotlin.jvm.internal.m.c(aVar3);
                                ((m1) aVar3).f32912d.addView(frameLayout);
                            } else {
                                ta.a aVar4 = sVar.f47886f;
                                kotlin.jvm.internal.m.c(aVar4);
                                ((m1) aVar4).f32912d.addView(frameLayout, size2);
                            }
                            s.u(sVar, frameLayout);
                            ta.a aVar5 = sVar.f47886f;
                            kotlin.jvm.internal.m.c(aVar5);
                            ((m1) aVar5).f32912d.requestLayout();
                            sVar.v();
                            sVar.y();
                            ta.a aVar6 = sVar.f47886f;
                            kotlin.jvm.internal.m.c(aVar6);
                            if (((m1) aVar6).f32913e.getVisibility() == 0) {
                                ta.a aVar7 = sVar.f47886f;
                                kotlin.jvm.internal.m.c(aVar7);
                                z4.w0 w0VarB = s0.b(((m1) aVar7).f32913e);
                                w0VarB.l(CropImageView.DEFAULT_ASPECT_RATIO);
                                w0VarB.e(400L);
                                w0VarB.i();
                                th.j.a(qx.h.m(400L, TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new o20.w(sVar, 8), qp.c.f47862d), sVar.f47887g);
                            }
                            break;
                        }
                    }
                    i13++;
                }
                break;
            default:
                kotlin.jvm.internal.m.f(view, "view");
                b2 b2Var = (b2) this.f40184b;
                ArrayList arrayList2 = b2Var.f47856w;
                ArrayList arrayListW2 = b2Var.w();
                int size3 = arrayListW2.size();
                int i15 = 0;
                while (i15 < size3) {
                    List<Rect> list2 = (List) arrayListW2.get(i15);
                    int size4 = (i15 == arrayListW2.size() - 1 || i15 >= arrayList2.size()) ? arrayList2.size() - 1 : i15;
                    for (Rect rect2 : list2) {
                        int i16 = point.x;
                        if (i16 >= rect2.left && i16 < rect2.right && (i12 = point.y) >= rect2.top && i12 <= rect2.bottom) {
                            b2Var.f47853t = true;
                            ta.a aVar8 = b2Var.f47886f;
                            kotlin.jvm.internal.m.c(aVar8);
                            ((m2) aVar8).f32919d.setVisibility(4);
                            b2.s(b2Var);
                            Word word2 = (Word) view.getTag();
                            if (word2 != null) {
                                LayoutInflater layoutInflaterFrom2 = LayoutInflater.from(b2Var.f47883c);
                                ta.a aVar9 = b2Var.f47886f;
                                kotlin.jvm.internal.m.c(aVar9);
                                View viewInflate2 = layoutInflaterFrom2.inflate(R.layout.item_sentence_drag_btm_to_top_item, (ViewGroup) ((m2) aVar9).f32917b, false);
                                kotlin.jvm.internal.m.d(viewInflate2, "null cannot be cast to non-null type android.widget.FrameLayout");
                                FrameLayout frameLayout2 = (FrameLayout) viewInflate2;
                                LinearLayout linearLayout2 = (LinearLayout) frameLayout2.findViewById(R.id.ll_item);
                                frameLayout2.findViewById(R.id.arrow_top).setVisibility(4);
                                frameLayout2.setTag(word2);
                                frameLayout2.setTag(R.id.tag_view, view.getTag(R.id.tag_view));
                                kotlin.jvm.internal.m.c(linearLayout2);
                                b2Var.B(linearLayout2, word2);
                                ViewGroup.LayoutParams layoutParams = frameLayout2.getLayoutParams();
                                kotlin.jvm.internal.m.d(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                                marginLayoutParams.setMarginStart(0);
                                marginLayoutParams.setMarginEnd(0);
                                b2Var.x();
                                ef.e.B(frameLayout2);
                                if (i15 == arrayListW2.size() - 1) {
                                    ta.a aVar10 = b2Var.f47886f;
                                    kotlin.jvm.internal.m.c(aVar10);
                                    ((m2) aVar10).f32918c.addView(frameLayout2);
                                } else {
                                    ta.a aVar11 = b2Var.f47886f;
                                    kotlin.jvm.internal.m.c(aVar11);
                                    ((m2) aVar11).f32918c.addView(frameLayout2, size4);
                                }
                                b2.u(b2Var, frameLayout2);
                                ta.a aVar12 = b2Var.f47886f;
                                kotlin.jvm.internal.m.c(aVar12);
                                ((m2) aVar12).f32918c.requestLayout();
                                b2Var.v();
                                b2Var.y();
                            }
                            break;
                        }
                    }
                    i15++;
                }
                break;
        }
        return true;
    }

    @Override // zq.a
    public void x(String str) {
        ((jp.p0) ((s2) this.f40184b).f47881a).I(str);
    }

    @Override // o20.h
    public void y(o20.e eVar, Throwable th2) {
        ((rz.m) this.f40184b).resumeWith(com.bumptech.glide.e.l(th2));
    }

    public b(int i11) {
        this.f40183a = i11;
        switch (i11) {
            case 4:
                this.f40184b = Build.VERSION.SDK_INT >= 28 ? new n3.z() : new k0(23);
                break;
        }
    }

    public b(boolean z11, int i11) {
        this.f40183a = i11;
        switch (i11) {
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                this.f40184b = new AtomicBoolean(z11);
                break;
            default:
                bq.f fVar = new bq.f();
                fVar.f4944b = this;
                fVar.f4943a = z11;
                fVar.f4945c = new a00.e();
                this.f40184b = fVar;
                break;
        }
    }

    @Override // r.p0
    public void a(int i11) {
    }

    @Override // r.p0
    public void b(int i11) {
    }

    @Override // r.p0
    public void c(int i11, float f5) {
    }
}
