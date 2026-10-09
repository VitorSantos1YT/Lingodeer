package lp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.b1;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bq.z;
import cf.x;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.flexbox.FlexboxLayout;
import com.google.api.Service;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.ValueEventListener;
import com.lingo.fluent.ui.game.adapter.WordListenGameFinishAdapter;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.chineseskill.ui.pinyin.widget.WaveView;
import com.lingo.lingoskill.object.Word;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import hj.j6;
import hj.u5;
import hj.w1;
import hj.x5;
import hj.z1;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.TimeUnit;
import jp.m0;
import jp.p0;
import kotlin.NoWhenBranchMatchedException;
import n0.w0;
import n5.f0;
import n5.q0;
import n5.x0;
import n5.y0;
import o20.b0;
import okhttp3.ResponseBody;
import oz.q;
import qh.c0;
import qp.f2;
import qp.h3;
import qp.j1;
import qp.l1;
import qp.s1;
import qp.s3;
import qp.t4;
import qp.v2;
import qp.w;
import re.g0;
import rt.b5;
import rt.e5;
import rt.r5;
import ry.u;
import rz.e0;
import tf.k0;
import tz.s;
import tz.t;
import uz.i1;
import vt.i0;
import vt.n0;
import z4.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class j implements vq.f, ValueEventListener, o20.g, o20.m, tx.c, th.c, zq.a, i, m0, q.j, r7.d, ki.a, u, tx.d, k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f40203b;

    public /* synthetic */ j(Object obj, int i11) {
        this.f40202a = i11;
        this.f40203b = obj;
    }

    @Override // ry.u
    public Iterator C() {
        return new nz.g((nz.i) this.f40203b);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:28:0x00e0  */
    @Override // jp.m0
    public void D(ConstraintLayout constraintLayout) {
        boolean z11;
        int iI0;
        int i11;
        t4 t4Var = (t4) this.f40203b;
        TextView textView = (TextView) ((p0) t4Var.f47881a).y().findViewById(R.id.txt_answer_txt_2);
        SpannableString spannableString = new SpannableString(textView.getText().toString());
        int i12 = 0;
        boolean zA = kotlin.jvm.internal.m.a(q.W0(t4Var.c(), new String[]{";"}, 0, 6).get(2), "10");
        boolean z12 = true;
        if (zA) {
            LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
            if ((ry.l.D(new Integer[]{0, 11}, Integer.valueOf(x.n().keyLanguage)) && x.n().csDisplay == 0) || ((ry.l.D(new Integer[]{2, 13}, Integer.valueOf(x.n().keyLanguage)) && x.n().koDisPlay == 0) || (ry.l.D(new Integer[]{1, 12}, Integer.valueOf(x.n().keyLanguage)) && (x.n().jsDisPlay == 2 || x.n().jsDisPlay == 4)))) {
                z11 = true;
            } else {
                z11 = false;
            }
        } else {
            z11 = false;
        }
        if (zA && q.v0(spannableString, " / ", false)) {
            LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
            if ((x.n().keyLanguage == 12 || x.n().keyLanguage == 1) && t4Var.f47884d.jsDisPlay != 5) {
                iI0 = q.I0(spannableString, " / ", 0, false, 6) + 3;
            } else {
                iI0 = 0;
            }
        } else {
            iI0 = 0;
        }
        if (z11) {
            int i13 = 0;
            for (Object obj : q.W0(spannableString.subSequence(iI0, spannableString.length()).toString(), new String[]{" "}, 0, 6)) {
                int i14 = i13 + 1;
                if (i13 < 0) {
                    ns.o.V();
                    throw null;
                }
                String str = (String) obj;
                if (i13 > 0) {
                    int i15 = 0;
                    int length = iI0;
                    while (i15 < i13) {
                        length += ((String) q.W0(spannableString.subSequence(iI0, spannableString.length()).toString(), new String[]{" "}, 0, 6).get(i15)).length() + 1;
                        i15++;
                        z12 = z12;
                    }
                    i11 = length;
                } else {
                    i11 = iI0;
                }
                boolean z13 = z12;
                t4.r(t4Var, i13, str, spannableString, i11, z11);
                z12 = z13;
                i13 = i14;
            }
        } else {
            int i16 = 0;
            while (i12 < spannableString.length()) {
                char cCharAt = spannableString.charAt(i12);
                int i17 = i16 + 1;
                if (i16 >= iI0) {
                    t4.r(t4Var, i16 - iI0, String.valueOf(cCharAt), spannableString, i16, z11);
                }
                i12++;
                i16 = i17;
            }
        }
        textView.setText(spannableString);
    }

    @Override // com.google.firebase.database.ValueEventListener
    public void E(DataSnapshot dataSnapshot) {
        ((s) ((t) this.f40203b)).i(dataSnapshot);
    }

    @Override // th.c, th.b
    public void a() {
        switch (this.f40202a) {
            case 13:
                ((w) this.f40203b).v();
                break;
            default:
                ((qp.p0) this.f40203b).v();
                break;
        }
    }

    @Override // tx.c
    public void accept(Object obj) {
        int i11 = this.f40202a;
        int i12 = 1;
        Object obj2 = this.f40203b;
        switch (i11) {
            case 5:
                Long it = (Long) obj;
                kotlin.jvm.internal.m.f(it, "it");
                om.j jVar = (om.j) obj2;
                ArrayList arrayList = jVar.N;
                int size = arrayList.size();
                for (int i13 = 0; i13 < size; i13++) {
                    View view = (View) arrayList.get(i13);
                    kotlin.jvm.internal.m.d(view, "null cannot be cast to non-null type androidx.cardview.widget.CardView");
                    int defaultColor = ((CardView) view).getCardBackgroundColor().getDefaultColor();
                    Context context = jVar.H;
                    if (context == null) {
                        kotlin.jvm.internal.m.n("mContext");
                        throw null;
                    }
                    view.setClickable(defaultColor == context.getColor(R.color.white));
                }
                return;
            case 6:
                String str = (String) obj;
                oo.t tVar = (oo.t) obj2;
                String strB = tVar.B();
                kotlin.jvm.internal.m.c(str);
                e0.B(LifecycleOwnerKt.getLifecycleScope(tVar), null, null, new kr.w(strB, str, tVar, (vy.d) null, 25), 3);
                return;
            case 7:
            case 9:
            default:
                Long it2 = (Long) obj;
                kotlin.jvm.internal.m.f(it2, "it");
                qh.k0 k0Var = (qh.k0) obj2;
                k0Var.t().c("jxz_fl_review_game_finish", new ns.d(23));
                bq.f fVar = new bq.f(k0Var.getContext());
                py.a aVar = (py.a) fVar.f4946d;
                aVar.f47209c = 15;
                int i14 = 2;
                aVar.f47210d = 2;
                ta.a aVar2 = k0Var.f36400f;
                kotlin.jvm.internal.m.c(aVar2);
                fVar.l(((x5) aVar2).f33600k);
                LayoutInflater layoutInflaterFrom = LayoutInflater.from(k0Var.requireContext());
                ta.a aVar3 = k0Var.f36400f;
                kotlin.jvm.internal.m.c(aVar3);
                View viewInflate = layoutInflaterFrom.inflate(R.layout.include_word_listen_game_finish_list, (ViewGroup) ((x5) aVar3).f33600k, false);
                ((TextView) viewInflate.findViewById(R.id.tv_finish_title)).setText(k0Var.getString(R.string.spelling));
                TextView textView = (TextView) viewInflate.findViewById(R.id.tv_xp);
                sh.d dVar = k0Var.T;
                if (dVar == null) {
                    kotlin.jvm.internal.m.n("viewModel");
                    throw null;
                }
                textView.setText("+" + k0Var.getString(R.string._s_xp, String.valueOf(dVar.K)));
                TextView textView2 = (TextView) viewInflate.findViewById(R.id.tv_title);
                String string = k0Var.getString(R.string.correctly);
                sh.d dVar2 = k0Var.T;
                if (dVar2 == null) {
                    kotlin.jvm.internal.m.n("viewModel");
                    throw null;
                }
                textView2.setText(string + " " + dVar2.L);
                ((LinearLayout) viewInflate.findViewById(R.id.ll_xp_level)).setVisibility(0);
                ((TextView) viewInflate.findViewById(R.id.tv_level)).setVisibility(8);
                ((Button) viewInflate.findViewById(R.id.btn_quit)).setBackgroundResource(R.drawable.bg_game_word_spell_finish_btn);
                ((Button) viewInflate.findViewById(R.id.btn_keep_going)).setBackgroundResource(R.drawable.bg_game_word_spell_finish_btn);
                View viewFindViewById = viewInflate.findViewById(R.id.btn_quit);
                kotlin.jvm.internal.m.e(viewFindViewById, "findViewById(...)");
                z.b(viewFindViewById, new w0(14, k0Var, viewInflate));
                View viewFindViewById2 = viewInflate.findViewById(R.id.btn_keep_going);
                kotlin.jvm.internal.m.e(viewFindViewById2, "findViewById(...)");
                z.b(viewFindViewById2, new qh.e0(k0Var, i12));
                RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.recycler_view);
                k0Var.requireContext();
                recyclerView.setLayoutManager(new LinearLayoutManager(1));
                sh.d dVar3 = k0Var.T;
                if (dVar3 == null) {
                    kotlin.jvm.internal.m.n("viewModel");
                    throw null;
                }
                ArrayList arrayList2 = dVar3.f51698f;
                th.e eVar = k0Var.N;
                if (eVar == null) {
                    kotlin.jvm.internal.m.n("player");
                    throw null;
                }
                recyclerView.setAdapter(new WordListenGameFinishAdapter(arrayList2, eVar));
                recyclerView.addItemDecoration(new qh.c(k0Var, i14));
                viewInflate.setVisibility(4);
                ta.a aVar4 = k0Var.f36400f;
                kotlin.jvm.internal.m.c(aVar4);
                viewInflate.setTranslationY(((x5) aVar4).f33600k.getHeight());
                ta.a aVar5 = k0Var.f36400f;
                kotlin.jvm.internal.m.c(aVar5);
                ((x5) aVar5).f33600k.addView(viewInflate);
                viewInflate.setVisibility(0);
                viewInflate.animate().translationY(CropImageView.DEFAULT_ASPECT_RATIO).setDuration(300L).start();
                return;
            case 8:
                pi.h hVar = (pi.h) obj2;
                j6 j6Var = hVar.W;
                kotlin.jvm.internal.m.c(j6Var);
                ((LottieAnimationView) j6Var.f32797f).setFailureListener(new pi.g(0));
                j6 j6Var2 = hVar.W;
                kotlin.jvm.internal.m.c(j6Var2);
                ((LottieAnimationView) j6Var2.f32797f).i((String) obj);
                j6 j6Var3 = hVar.W;
                kotlin.jvm.internal.m.c(j6Var3);
                ((LottieAnimationView) j6Var3.f32797f).h();
                j6 j6Var4 = hVar.W;
                kotlin.jvm.internal.m.c(j6Var4);
                ((LottieAnimationView) j6Var4.f32797f).c(new fw.d(hVar, i12));
                return;
            case 10:
                Long it3 = (Long) obj;
                kotlin.jvm.internal.m.f(it3, "it");
                qh.e eVar2 = (qh.e) obj2;
                ta.a aVar6 = eVar2.f36400f;
                kotlin.jvm.internal.m.c(aVar6);
                ((u5) aVar6).f33411k.setImageResource(R.drawable.ic_game_word_choose_move_box_empty);
                ta.a aVar7 = eVar2.f36400f;
                kotlin.jvm.internal.m.c(aVar7);
                ((u5) aVar7).f33413n.setImageResource(R.drawable.ic_game_word_choose_right_deer_to_house);
                ta.a aVar8 = eVar2.f36400f;
                kotlin.jvm.internal.m.c(aVar8);
                ViewPropertyAnimator viewPropertyAnimatorAnimate = ((u5) aVar8).f33413n.animate();
                ta.a aVar9 = eVar2.f36400f;
                kotlin.jvm.internal.m.c(aVar9);
                float width = ((u5) aVar9).f33419t.getWidth();
                ta.a aVar10 = eVar2.f36400f;
                kotlin.jvm.internal.m.c(aVar10);
                viewPropertyAnimatorAnimate.translationXBy(width - ((u5) aVar10).f33413n.getX()).setDuration(300L).start();
                th.j.a(qx.h.m(300L, TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new o20.i(eVar2, 7), vx.b.f54316e), eVar2.f36401t);
                return;
            case 11:
                Long it4 = (Long) obj;
                kotlin.jvm.internal.m.f(it4, "it");
                c0 c0Var = (c0) obj2;
                sh.c cVar = c0Var.S;
                if (cVar == null) {
                    kotlin.jvm.internal.m.n("viewModel");
                    throw null;
                }
                if (cVar.f51691f) {
                    cVar.f51692t = true;
                    return;
                } else if (cVar.O || cVar.f51690e != c0Var.R) {
                    c0Var.D();
                    return;
                } else {
                    c0Var.C(true);
                    return;
                }
        }
    }

    @Override // tx.d
    public Object apply(Object obj) {
        List it = (List) obj;
        kotlin.jvm.internal.m.f(it, "it");
        sh.b bVar = (sh.b) this.f40203b;
        bVar.getClass();
        bVar.M = it;
        return Boolean.TRUE;
    }

    public x0 b() {
        return (x0) ((i1) this.f40203b).getValue();
    }

    @Override // q.j
    public boolean c(q.l lVar, MenuItem menuItem) {
        return false;
    }

    @Override // com.google.firebase.database.ValueEventListener
    public void d(DatabaseError error) {
        kotlin.jvm.internal.m.f(error, "error");
        error.c().printStackTrace();
        e0.i((t) this.f40203b, null);
    }

    @Override // lp.i
    public void e() {
        switch (this.f40202a) {
            case 18:
                ((p0) ((v2) this.f40203b).f47881a).O(4);
                break;
            case 19:
                ((p0) ((h3) this.f40203b).f47881a).O(4);
                break;
            default:
                ((p0) ((s3) this.f40203b).f47881a).O(4);
                break;
        }
    }

    @Override // vq.f
    public void f(View view, Point point) {
        boolean zC;
        kotlin.jvm.internal.m.f(view, "view");
        k kVar = (k) this.f40203b;
        List list = (List) kVar.b().f57089b;
        boolean z11 = false;
        if (list != null) {
            Iterator it = ns.o.y(list).iterator();
            boolean z12 = false;
            while (((lz.f) it).f40537c) {
                View view2 = list != null ? (View) list.get(((ry.w) it).nextInt()) : null;
                kotlin.jvm.internal.m.d(view2, "null cannot be cast to non-null type android.widget.FrameLayout");
                FrameLayout frameLayout = (FrameLayout) view2;
                if (frameLayout.getTag(R.id.tag_rects) != null) {
                    Object tag = frameLayout.getTag(R.id.tag_rects);
                    kotlin.jvm.internal.m.d(tag, "null cannot be cast to non-null type kotlin.collections.List<android.graphics.Rect>");
                    zC = kVar.c(view, point, (List) tag, frameLayout);
                } else {
                    zC = false;
                }
                if (zC) {
                    z12 = true;
                } else {
                    k.h(frameLayout);
                }
                frameLayout.requestLayout();
            }
            z11 = z12;
        }
        if (!z11) {
            kVar.f40212i.setVisibility(4);
        }
        kVar.f40213j.requestLayout();
    }

    @Override // ry.u
    public Object g(Object obj) {
        return (String) obj;
    }

    @Override // vq.f
    public void h(View view) {
        k kVar = (k) this.f40203b;
        if (!kVar.f40211h) {
            view.setVisibility(0);
        }
        kVar.f40212i.setVisibility(4);
        k.a(kVar, kVar.f40213j);
        kVar.i();
    }

    @Override // q.j
    public void i(q.l lVar) {
        Toolbar toolbar = (Toolbar) this.f40203b;
        androidx.appcompat.widget.c cVar = toolbar.f1028a.V;
        if (cVar == null || !cVar.h()) {
            Iterator it = toolbar.f1045l0.f58877b.iterator();
            while (it.hasNext()) {
                ((b1) ((p) it.next())).f1625a.t(lVar);
            }
        }
        hd.d dVar = toolbar.f1054t0;
        if (dVar != null) {
            dVar.i(lVar);
        }
    }

    @Override // o20.m
    public Object j(Object obj) {
        return Optional.ofNullable(((o20.m) this.f40203b).j((ResponseBody) obj));
    }

    @Override // o20.g
    public Type k() {
        return (Type) this.f40203b;
    }

    @Override // lp.i
    public void l() {
        switch (this.f40202a) {
            case 18:
                ((p0) ((v2) this.f40203b).f47881a).O(0);
                break;
            case 19:
                ((p0) ((h3) this.f40203b).f47881a).O(0);
                break;
            default:
                ((p0) ((s3) this.f40203b).f47881a).O(0);
                break;
        }
    }

    @Override // ki.a
    public void m() {
        rq.g gVar = (rq.g) this.f40203b;
        bq.f fVar = gVar.m;
        if (fVar != null && fVar.f4943a) {
            fVar.t();
            return;
        }
        gVar.q();
        bq.f fVar2 = gVar.m;
        if (fVar2 != null) {
            fVar2.f4944b = new rq.d(gVar, 6);
        }
        if (fVar2 != null) {
            fVar2.r(gVar.f49379o);
        }
        ta.a aVar = gVar.f49363g;
        kotlin.jvm.internal.m.c(aVar);
        ((w1) aVar).m.setVisibility(0);
        ta.a aVar2 = gVar.f49363g;
        kotlin.jvm.internal.m.c(aVar2);
        ((w1) aVar2).m.setDuration(2500L);
        ta.a aVar3 = gVar.f49363g;
        kotlin.jvm.internal.m.c(aVar3);
        ((w1) aVar3).m.setInitialRadius(ff.h.l(24.0f));
        ta.a aVar4 = gVar.f49363g;
        kotlin.jvm.internal.m.c(aVar4);
        ((w1) aVar4).m.setStyle(Paint.Style.FILL);
        ta.a aVar5 = gVar.f49363g;
        kotlin.jvm.internal.m.c(aVar5);
        ((w1) aVar5).m.setSpeed(500);
        ta.a aVar6 = gVar.f49363g;
        kotlin.jvm.internal.m.c(aVar6);
        WaveView waveView = ((w1) aVar6).m;
        Context context = gVar.f49359c;
        kotlin.jvm.internal.m.f(context, "context");
        waveView.setColor(context.getColor(R.color.color_FED068));
        ta.a aVar7 = gVar.f49363g;
        kotlin.jvm.internal.m.c(aVar7);
        ((w1) aVar7).m.setMaxRadius(ff.h.l(40.0f));
        ta.a aVar8 = gVar.f49363g;
        kotlin.jvm.internal.m.c(aVar8);
        ((w1) aVar8).m.setInterpolator(new AccelerateDecelerateInterpolator());
        ta.a aVar9 = gVar.f49363g;
        kotlin.jvm.internal.m.c(aVar9);
        ((w1) aVar9).m.a();
        ta.a aVar10 = gVar.f49363g;
        kotlin.jvm.internal.m.c(aVar10);
        ((w1) aVar10).f33502c.setBackgroundResource(R.drawable.point_accent);
    }

    @Override // tf.k0
    public Activity n() {
        return (Activity) this.f40203b;
    }

    @Override // o20.g
    public Object o(b0 b0Var) {
        o20.j jVar = new o20.j(b0Var);
        b0Var.H0(new o20.i(jVar, 0));
        return jVar;
    }

    public void p() {
        r5 r5Var = (r5) this.f40203b;
        Object value = r5Var.M.getValue();
        b5 b5Var = value instanceof b5 ? (b5) value : null;
        if (b5Var == null) {
            return;
        }
        int i11 = e5.f49680a[b5Var.f49515h.ordinal()];
        if (i11 == 1 || i11 == 2) {
            return;
        }
        if (i11 == 3) {
            r5Var.o();
            return;
        }
        if (i11 != 4 && i11 != 5) {
            throw new NoWhenBranchMatchedException();
        }
        if (b5Var.f49513f.isEmpty()) {
            r5Var.m();
            return;
        }
        int i12 = b5Var.f49514g;
        if (i12 < 0) {
            i12 = 0;
        }
        r5Var.p(i12);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0029  */
    public void q(x0 newState) {
        Object value;
        x0 x0Var;
        kotlin.jvm.internal.m.f(newState, "newState");
        i1 i1Var = (i1) this.f40203b;
        do {
            value = i1Var.getValue();
            x0Var = (x0) value;
            if (x0Var instanceof q0 ? true : kotlin.jvm.internal.m.a(x0Var, y0.f43428b)) {
                x0Var = newState;
            } else if (x0Var instanceof n5.c) {
                if (newState.f43426a > x0Var.f43426a) {
                    x0Var = newState;
                }
            } else if (!(x0Var instanceof f0)) {
                throw new NoWhenBranchMatchedException();
            }
        } while (!i1Var.j(value, x0Var));
    }

    @Override // vq.f
    public void r(View view) {
        ((k) this.f40203b).f40211h = false;
    }

    @Override // tf.k0
    public void startActivityForResult(Intent intent, int i11) {
        ((Activity) this.f40203b).startActivityForResult(intent, i11);
    }

    @Override // vq.f
    public boolean w(View view, Point point) {
        int i11;
        kotlin.jvm.internal.m.f(view, "view");
        k kVar = (k) this.f40203b;
        y4.b bVarB = kVar.b();
        List list = (List) bVarB.f57088a;
        List list2 = (List) bVarB.f57089b;
        if (list != null) {
            Iterator it = ns.o.y(list).iterator();
            while (((lz.f) it).f40537c) {
                int iNextInt = ((ry.w) it).nextInt();
                List<Rect> list3 = (List) list.get(iNextInt);
                int size = (list2 == null || (iNextInt != list.size() - 1 && iNextInt < list2.size())) ? iNextInt : list2.size() - 1;
                for (Rect rect : list3) {
                    int i12 = point.x;
                    if (i12 >= rect.left && i12 < rect.right && (i11 = point.y) >= rect.top && i11 <= rect.bottom) {
                        kVar.f40211h = true;
                        FlexboxLayout flexboxLayout = kVar.f40213j;
                        kVar.f40212i.setVisibility(4);
                        k.a(kVar, flexboxLayout);
                        Object tag = view.getTag();
                        kotlin.jvm.internal.m.d(tag, "null cannot be cast to non-null type com.lingo.lingoskill.object.Word");
                        view.setEnabled(false);
                        View viewF = kVar.f(view, (Word) tag);
                        if (iNextInt == list.size() - 1) {
                            flexboxLayout.addView(viewF);
                        } else {
                            flexboxLayout.addView(viewF, size);
                        }
                        flexboxLayout.requestLayout();
                        kVar.i();
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // zq.a
    public void x(String str) {
        switch (this.f40202a) {
            case 15:
                l1 l1Var = (l1) this.f40203b;
                l1Var.z();
                Object obj = l1Var.f47881a;
                th.e eVar = ((p0) obj).V;
                if (eVar != null) {
                    eVar.f52416c = new lf.x0(l1Var, 19);
                }
                qp.h hVar = l1Var.m;
                if (hVar == null) {
                    kotlin.jvm.internal.m.n("sentenceLayout");
                    throw null;
                }
                l1Var.f48031l = hVar.f59276l;
                ta.a aVar = l1Var.f47886f;
                kotlin.jvm.internal.m.c(aVar);
                ((p0) obj).H((ImageView) ((z1) aVar).f33650g.f32408d, str);
                if (!l1Var.f48034p) {
                    ((p0) obj).O(5);
                    l1Var.f48034p = true;
                }
                if (((p0) obj).f36534j0.length() > 0) {
                    ((ji.e) obj).t().c("jxz_main_click_in_lesson_wordtips", new j1(l1Var, 1));
                    return;
                }
                return;
            case 16:
                ((p0) ((s1) this.f40203b).f47881a).I(str);
                return;
            default:
                f2 f2Var = (f2) this.f40203b;
                if (f2Var.f47924l != null) {
                    ((p0) f2Var.f47881a).I(str);
                    return;
                } else {
                    kotlin.jvm.internal.m.n("sentenceLayout");
                    throw null;
                }
        }
    }

    public j(int i11) {
        this.f40202a = i11;
        switch (i11) {
            case 23:
                this.f40203b = new g0(3);
                break;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                SharedPreferences sharedPreferences = re.s.a().getSharedPreferences("com.facebook.AuthenticationTokenManager.SharedPreferences", 0);
                kotlin.jvm.internal.m.e(sharedPreferences, "getApplicationContext()\n…ME, Context.MODE_PRIVATE)");
                this.f40203b = sharedPreferences;
                break;
            default:
                this.f40203b = uz.x0.c(y0.f43428b);
                break;
        }
    }

    public j(i0 courseRepository, n0 envRepository) {
        this.f40202a = 7;
        kotlin.jvm.internal.m.f(courseRepository, "courseRepository");
        kotlin.jvm.internal.m.f(envRepository, "envRepository");
        this.f40203b = envRepository;
    }

    @Override // ki.a
    public void B() {
    }
}
