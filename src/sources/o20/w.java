package o20;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.profileinstaller.ProfileInstallReceiver;
import androidx.work.impl.WorkDatabase;
import com.google.android.flexbox.FlexboxLayout;
import com.google.api.Service;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.chineseskill.ui.pinyin.widget.WaveView;
import com.lingo.lingoskill.object.Ack;
import com.lingo.lingoskill.object.HwCharacter;
import com.lingo.lingoskill.object.Word;
import com.lingo.lingoskill.ui.review.AckCardActivity;
import com.lingo.lingoskill.widget.flingView.SwipeCardsView;
import com.lingodeer.R;
import com.lingodeer.data.model.INTENTS;
import com.yalantis.ucrop.view.CropImageView;
import dl.ExOZ.xItStCyvVEZ;
import hj.c2;
import hj.e3;
import hj.m1;
import hj.m2;
import hj.n6;
import hj.p2;
import hj.u5;
import hj.w1;
import hj.w5;
import hj.y4;
import hj.z1;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.KotlinNullPointerException;
import okhttp3.Request;
import qp.b2;
import qp.d1;
import qp.j1;
import qp.j4;
import qp.k2;
import qp.l1;
import qp.o2;
import qp.p3;
import qp.z2;
import r.q2;
import retrofit2.HttpException;
import rt.b4;
import uz.i1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class w implements h, yq.b, tx.c, vq.m, ki.a, vq.f, jp.m0, q.j, av.l, a5.s, tx.d, u9.c, qe.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f44617b;

    public /* synthetic */ w(Object obj, int i11) {
        this.f44616a = i11;
        this.f44617b = obj;
    }

    @Override // ki.a
    public void B() {
    }

    @Override // jp.m0
    public void D(ConstraintLayout constraintLayout) {
        j4 j4Var = (j4) this.f44617b;
        TextView textView = (TextView) ((jp.p0) j4Var.f47881a).y().findViewById(R.id.txt_answer_txt_2);
        SpannableString spannableString = new SpannableString(textView.getText().toString());
        int i11 = 0;
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        boolean z11 = (ry.l.D(new Integer[]{0, 11}, Integer.valueOf(cf.x.n().keyLanguage)) && cf.x.n().csDisplay == 0) || (ry.l.D(new Integer[]{2, 13}, Integer.valueOf(cf.x.n().keyLanguage)) && cf.x.n().koDisPlay == 0);
        if (z11) {
            int i12 = 0;
            for (Object obj : oz.q.W0(spannableString.subSequence(0, spannableString.length()).toString(), new String[]{" "}, 0, 6)) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    ns.o.V();
                    throw null;
                }
                String str = (String) obj;
                int i14 = 0;
                if (i12 > 0) {
                    int length = 0;
                    while (i14 < i12) {
                        length += ((String) oz.q.W0(spannableString.subSequence(0, spannableString.length()).toString(), new String[]{" "}, 0, 6).get(i14)).length() + 1;
                        i14++;
                    }
                    i14 = length;
                }
                j4.r(j4Var, i12, str, spannableString, i14, z11);
                i12 = i13;
            }
        } else {
            int i15 = 0;
            while (i11 < spannableString.length()) {
                char cCharAt = spannableString.charAt(i11);
                int i16 = i15 + 1;
                if (i15 >= 0) {
                    j4.r(j4Var, i15, String.valueOf(cCharAt), spannableString, i15, z11);
                }
                i11++;
                i15 = i16;
            }
        }
        textView.setText(spannableString);
    }

    @Override // av.l
    public void a() {
        i1 i1Var = ((b4) this.f44617b).U;
        ht.a aVar = ht.a.f33722e;
        i1Var.getClass();
        i1Var.l(null, aVar);
    }

    @Override // tx.d
    public Object apply(Object obj) {
        List list = (List) obj;
        kotlin.jvm.internal.m.c(list);
        AckCardActivity ackCardActivity = (AckCardActivity) this.f44617b;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (ackCardActivity.T.contains(Integer.valueOf((int) ((Ack) obj2).getUnitId()))) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    @Override // qe.a
    public Object b() {
        ij.d dVar = (ij.d) this.f44617b;
        return new vd.l((mw.g0) dVar.f34422c, (ob.m) dVar.f34423d);
    }

    @Override // q.j
    public boolean c(q.l lVar, MenuItem menuItem) {
        boolean zOnMenuItemSelected;
        r.k kVar = ((ActionMenuView) this.f44617b).f883f0;
        if (kVar != null) {
            Toolbar toolbar = (Toolbar) ((i) kVar).f44522b;
            if (toolbar.f1045l0.a(menuItem)) {
                zOnMenuItemSelected = true;
            } else {
                q2 q2Var = toolbar.f1047n0;
                zOnMenuItemSelected = q2Var != null ? ((l.h0) ((hd.b) q2Var).f32184b).f38984b.onMenuItemSelected(0, menuItem) : false;
            }
            if (zOnMenuItemSelected) {
                return true;
            }
        }
        return false;
    }

    public uz.i d(List list) {
        gp.r rVar = new gp.r(new js.l(list, this, (vy.d) null));
        yz.f fVar = rz.o0.f50940a;
        return uz.x0.w(rVar, yz.e.f58387a);
    }

    @Override // u9.c
    public void e(int i11, Object obj) {
        if (i11 == 6 || i11 == 7 || i11 == 8) {
        }
        ((ProfileInstallReceiver) this.f44617b).setResultCode(i11);
    }

    @Override // vq.f
    public void f(View view, Point point) {
        boolean zR;
        kotlin.jvm.internal.m.f(view, "view");
        b2 b2Var = (b2) this.f44617b;
        b2Var.w();
        ArrayList arrayList = b2Var.f47856w;
        int size = arrayList.size();
        boolean z11 = false;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = arrayList.get(i11);
            kotlin.jvm.internal.m.d(obj, "null cannot be cast to non-null type android.widget.FrameLayout");
            FrameLayout frameLayout = (FrameLayout) obj;
            if (frameLayout.getTag(R.id.tag_rects) != null) {
                Object tag = frameLayout.getTag(R.id.tag_rects);
                kotlin.jvm.internal.m.d(tag, "null cannot be cast to non-null type kotlin.collections.List<android.graphics.Rect>");
                zR = b2.r(b2Var, view, point, (List) tag, frameLayout);
            } else {
                zR = false;
            }
            if (zR) {
                z11 = true;
            } else {
                b2.t(b2Var, frameLayout);
            }
            frameLayout.requestLayout();
        }
        if (!z11) {
            ta.a aVar = b2Var.f47886f;
            kotlin.jvm.internal.m.c(aVar);
            ((m2) aVar).f32919d.setVisibility(4);
        }
        ta.a aVar2 = b2Var.f47886f;
        kotlin.jvm.internal.m.c(aVar2);
        ((m2) aVar2).f32918c.requestLayout();
    }

    public ie.o g(o2 o2Var, AndroidComposeView androidComposeView) {
        long jF;
        long j11;
        boolean z11;
        y.r rVar = (y.r) this.f44617b;
        List list = (List) o2Var.f48095b;
        y.r rVar2 = new y.r(list.size());
        int size = list.size();
        int i11 = 0;
        while (i11 < size) {
            s2.v vVar = (s2.v) list.get(i11);
            long j12 = vVar.f51360a;
            s2.u uVar = (s2.u) rVar.c(j12);
            if (uVar == null) {
                j11 = vVar.f51361b;
                jF = vVar.f51363d;
                z11 = false;
            } else {
                long j13 = uVar.f51357a;
                boolean z12 = uVar.f51359c;
                jF = androidComposeView.F(uVar.f51358b);
                j11 = j13;
                z11 = z12;
            }
            long j14 = vVar.f51360a;
            List list2 = list;
            int i12 = size;
            rVar2.h(j14, new s2.t(j14, vVar.f51361b, vVar.f51363d, vVar.f51364e, vVar.f51365f, j11, jF, z11, vVar.f51366g, vVar.f51368i, vVar.f51369j, vVar.f51370k));
            boolean z13 = vVar.f51364e;
            if (z13) {
                rVar.h(j12, new s2.u(vVar.f51361b, vVar.f51362c, z13));
            } else {
                rVar.i(j12);
            }
            i11++;
            list = list2;
            size = i12;
        }
        return new ie.o(rVar2, o2Var);
    }

    @Override // vq.f
    public void h(View view) {
        b2 b2Var = (b2) this.f44617b;
        if (!b2Var.f47853t) {
            view.setVisibility(0);
        }
        b2.s(b2Var);
        b2Var.y();
    }

    @Override // q.j
    public void i(q.l lVar) {
        q.j jVar = ((ActionMenuView) this.f44617b).f878a0;
        if (jVar != null) {
            jVar.i(lVar);
        }
    }

    @Override // yq.b
    public void j(View view) {
        ((om.e) this.f44617b).h();
    }

    @Override // o20.h
    public void k(e eVar, t0 t0Var) {
        rz.m mVar = (rz.m) this.f44617b;
        if (!t0Var.f44598a.R) {
            mVar.resumeWith(com.bumptech.glide.e.l(new HttpException(t0Var)));
            return;
        }
        Object obj = t0Var.f44599b;
        if (obj != null) {
            mVar.resumeWith(obj);
            return;
        }
        Request requestE = eVar.e();
        requestE.getClass();
        kotlin.jvm.internal.e eVarA = kotlin.jvm.internal.z.a(u.class);
        Object objCast = qx.b.p(eVarA).cast(requestE.f45138e.get(eVarA));
        kotlin.jvm.internal.m.c(objCast);
        u uVar = (u) objCast;
        mVar.resumeWith(com.bumptech.glide.e.l(new KotlinNullPointerException("Response from " + uVar.f44600a.getName() + '.' + uVar.f44602c.getName() + " was null but response body type was declared as non-null")));
    }

    @Override // yq.b
    public void l(yq.c type) {
        kotlin.jvm.internal.m.f(type, "type");
        om.e eVar = (om.e) this.f44617b;
        ta.a aVar = eVar.f45600c;
        kotlin.jvm.internal.m.c(aVar);
        SwipeCardsView swipeCardsView = ((n6) aVar).f32998b;
        swipeCardsView.postDelayed(new b2.c(4, swipeCardsView, new om.c(eVar, 1)), 300L);
    }

    @Override // ki.a
    public void m() {
        l1 l1Var = (l1) this.f44617b;
        bq.f fVar = l1Var.f48035q;
        if (fVar != null && fVar.f4943a) {
            fVar.t();
            return;
        }
        l1Var.x();
        bq.f fVar2 = l1Var.f48035q;
        if (fVar2 != null) {
            fVar2.f4944b = new j1(l1Var, 2);
        }
        if (fVar2 != null) {
            fVar2.r(l1Var.f48037s);
        }
        ta.a aVar = l1Var.f47886f;
        kotlin.jvm.internal.m.c(aVar);
        ((z1) aVar).f33656n.setDuration(2500L);
        ta.a aVar2 = l1Var.f47886f;
        kotlin.jvm.internal.m.c(aVar2);
        ((z1) aVar2).f33656n.setInitialRadius(ff.h.l(24.0f));
        ta.a aVar3 = l1Var.f47886f;
        kotlin.jvm.internal.m.c(aVar3);
        ((z1) aVar3).f33656n.setStyle(Paint.Style.FILL);
        ta.a aVar4 = l1Var.f47886f;
        kotlin.jvm.internal.m.c(aVar4);
        ((z1) aVar4).f33656n.setSpeed(500);
        ta.a aVar5 = l1Var.f47886f;
        kotlin.jvm.internal.m.c(aVar5);
        WaveView waveView = ((z1) aVar5).f33656n;
        Context context = l1Var.f47883c;
        kotlin.jvm.internal.m.f(context, "context");
        waveView.setColor(context.getColor(R.color.color_FED068));
        ta.a aVar6 = l1Var.f47886f;
        kotlin.jvm.internal.m.c(aVar6);
        ((z1) aVar6).f33656n.setMaxRadius(ff.h.l(40.0f));
        ta.a aVar7 = l1Var.f47886f;
        kotlin.jvm.internal.m.c(aVar7);
        ((z1) aVar7).f33656n.setInterpolator(new AccelerateDecelerateInterpolator());
        ta.a aVar8 = l1Var.f47886f;
        kotlin.jvm.internal.m.c(aVar8);
        ((z1) aVar8).f33656n.a();
        ta.a aVar9 = l1Var.f47886f;
        kotlin.jvm.internal.m.c(aVar9);
        ((z1) aVar9).f33646c.setBackgroundResource(R.drawable.point_accent);
    }

    @Override // a5.s
    public boolean perform(View view, a5.k kVar) {
        DrawerLayout drawerLayout = (DrawerLayout) this.f44617b;
        if (!DrawerLayout.j(view) || drawerLayout.f(view) == 2) {
            return false;
        }
        drawerLayout.b(view, true);
        return true;
    }

    @Override // vq.f
    public void r(View view) {
        b2 b2Var = (b2) this.f44617b;
        b2Var.f47853t = false;
        b2Var.v();
    }

    @Override // vq.f
    public boolean w(View view, Point point) {
        int i11;
        kotlin.jvm.internal.m.f(view, "view");
        b2 b2Var = (b2) this.f44617b;
        ArrayList arrayList = b2Var.f47856w;
        ArrayList arrayListW = b2Var.w();
        int size = arrayListW.size();
        int i12 = 0;
        while (i12 < size) {
            List<Rect> list = (List) arrayListW.get(i12);
            int size2 = (i12 == arrayListW.size() - 1 || i12 >= arrayList.size()) ? arrayList.size() - 1 : i12;
            for (Rect rect : list) {
                int i13 = point.x;
                if (i13 >= rect.left && i13 < rect.right && (i11 = point.y) >= rect.top && i11 <= rect.bottom) {
                    b2Var.f47853t = true;
                    ta.a aVar = b2Var.f47886f;
                    kotlin.jvm.internal.m.c(aVar);
                    ((m2) aVar).f32919d.setVisibility(4);
                    b2.s(b2Var);
                    Word word = (Word) view.getTag();
                    LayoutInflater layoutInflaterFrom = LayoutInflater.from(b2Var.f47883c);
                    ta.a aVar2 = b2Var.f47886f;
                    kotlin.jvm.internal.m.c(aVar2);
                    View viewInflate = layoutInflaterFrom.inflate(R.layout.item_sentence_drag_btm_to_top_item, (ViewGroup) ((m2) aVar2).f32917b, false);
                    kotlin.jvm.internal.m.d(viewInflate, "null cannot be cast to non-null type android.widget.FrameLayout");
                    FrameLayout frameLayout = (FrameLayout) viewInflate;
                    LinearLayout linearLayout = (LinearLayout) frameLayout.findViewById(R.id.ll_item);
                    frameLayout.findViewById(R.id.arrow_top).setVisibility(4);
                    frameLayout.setTag(word);
                    frameLayout.setTag(R.id.tag_view, view);
                    if (word != null) {
                        kotlin.jvm.internal.m.c(linearLayout);
                        b2Var.B(linearLayout, word);
                    }
                    b2Var.x();
                    ef.e.B(frameLayout);
                    if (i12 == arrayListW.size() - 1) {
                        ta.a aVar3 = b2Var.f47886f;
                        kotlin.jvm.internal.m.c(aVar3);
                        ((m2) aVar3).f32918c.addView(frameLayout);
                    } else {
                        ta.a aVar4 = b2Var.f47886f;
                        kotlin.jvm.internal.m.c(aVar4);
                        ((m2) aVar4).f32918c.addView(frameLayout, size2);
                    }
                    b2.u(b2Var, frameLayout);
                    ta.a aVar5 = b2Var.f47886f;
                    kotlin.jvm.internal.m.c(aVar5);
                    ((m2) aVar5).f32918c.requestLayout();
                    b2Var.v();
                    b2Var.y();
                    return true;
                }
            }
            i12++;
        }
        return true;
    }

    @Override // o20.h
    public void y(e eVar, Throwable th2) {
        ((rz.m) this.f44617b).resumeWith(com.bumptech.glide.e.l(th2));
    }

    public w(int i11) {
        this.f44616a = i11;
        switch (i11) {
            case 22:
                this.f44617b = new y.r((Object) null);
                break;
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                uv.r rVar = new uv.r();
                LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
                rVar.f53231b = linkedBlockingQueue;
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(3, 3, 15L, TimeUnit.SECONDS, linkedBlockingQueue, new ew.b("LauncherTask"));
                threadPoolExecutor.allowCoreThreadTimeOut(true);
                rVar.f53230a = threadPoolExecutor;
                this.f44617b = rVar;
                break;
        }
    }

    @Override // tx.c
    public void accept(Object obj) {
        LinearLayout linearLayout;
        switch (this.f44616a) {
            case 2:
                Boolean it = (Boolean) obj;
                kotlin.jvm.internal.m.f(it, "it");
                oo.h hVar = (oo.h) this.f44617b;
                ta.a aVar = hVar.f36400f;
                kotlin.jvm.internal.m.c(aVar);
                e3 e3Var = ((y4) aVar).f33627g;
                if (e3Var != null && (linearLayout = (LinearLayout) e3Var.f32525d) != null) {
                    linearLayout.setVisibility(8);
                }
                bm.a aVar2 = (bm.a) hVar.N;
                kotlin.jvm.internal.m.c(aVar2);
                aVar2.a(hVar.T);
                return;
            case 6:
                Long aLong = (Long) obj;
                kotlin.jvm.internal.m.f(aLong, "aLong");
                qh.e eVar = (qh.e) this.f44617b;
                sh.b bVar = eVar.N;
                if (bVar == null) {
                    kotlin.jvm.internal.m.n("viewModel");
                    throw null;
                }
                bVar.f51681c = (int) ((((long) bVar.f51682d) - aLong.longValue()) - 1);
                sh.b bVar2 = eVar.N;
                if (bVar2 == null) {
                    kotlin.jvm.internal.m.n("viewModel");
                    throw null;
                }
                int i11 = bVar2.f51681c;
                int i12 = i11 / 60;
                int i13 = i11 % 60;
                if (i13 < 10) {
                    ta.a aVar3 = eVar.f36400f;
                    kotlin.jvm.internal.m.c(aVar3);
                    ((u5) aVar3).C.setText(i12 + ":0" + i13);
                } else {
                    ta.a aVar4 = eVar.f36400f;
                    kotlin.jvm.internal.m.c(aVar4);
                    ((u5) aVar4).C.setText(i12 + ":" + i13);
                }
                sh.b bVar3 = eVar.N;
                if (bVar3 == null) {
                    kotlin.jvm.internal.m.n("viewModel");
                    throw null;
                }
                if (bVar3.f51681c <= 5) {
                    ta.a aVar5 = eVar.f36400f;
                    kotlin.jvm.internal.m.c(aVar5);
                    ((u5) aVar5).f33422w.setVisibility(0);
                    ta.a aVar6 = eVar.f36400f;
                    kotlin.jvm.internal.m.c(aVar6);
                    TextView textView = ((u5) aVar6).f33422w;
                    sh.b bVar4 = eVar.N;
                    if (bVar4 == null) {
                        kotlin.jvm.internal.m.n("viewModel");
                        throw null;
                    }
                    textView.setText(String.valueOf(bVar4.f51681c));
                } else {
                    ta.a aVar7 = eVar.f36400f;
                    kotlin.jvm.internal.m.c(aVar7);
                    ((u5) aVar7).f33422w.setVisibility(8);
                }
                sh.b bVar5 = eVar.N;
                if (bVar5 == null) {
                    kotlin.jvm.internal.m.n("viewModel");
                    throw null;
                }
                if (bVar5.f51681c != 0 || bVar5.K.get()) {
                    return;
                }
                eVar.B();
                return;
            case 7:
                Boolean it2 = (Boolean) obj;
                kotlin.jvm.internal.m.f(it2, "it");
                final qh.c0 c0Var = (qh.c0) this.f44617b;
                ta.a aVar8 = c0Var.f36400f;
                kotlin.jvm.internal.m.c(aVar8);
                bq.z.b(((w5) aVar8).f33530g, new qh.w(c0Var, 1));
                ta.a aVar9 = c0Var.f36400f;
                kotlin.jvm.internal.m.c(aVar9);
                ((w5) aVar9).f33532i.setVisibility(8);
                ArrayList arrayList = c0Var.O;
                ta.a aVar10 = c0Var.f36400f;
                kotlin.jvm.internal.m.c(aVar10);
                arrayList.add(((w5) aVar10).f33544v);
                ta.a aVar11 = c0Var.f36400f;
                kotlin.jvm.internal.m.c(aVar11);
                arrayList.add(((w5) aVar11).f33545w);
                ta.a aVar12 = c0Var.f36400f;
                kotlin.jvm.internal.m.c(aVar12);
                arrayList.add(((w5) aVar12).f33546x);
                ta.a aVar13 = c0Var.f36400f;
                kotlin.jvm.internal.m.c(aVar13);
                arrayList.add(((w5) aVar13).f33547y);
                ta.a aVar14 = c0Var.f36400f;
                kotlin.jvm.internal.m.c(aVar14);
                arrayList.add(((w5) aVar14).f33548z);
                ArrayList arrayList2 = c0Var.T;
                ta.a aVar15 = c0Var.f36400f;
                kotlin.jvm.internal.m.c(aVar15);
                arrayList2.add(((w5) aVar15).m.f32503c);
                ta.a aVar16 = c0Var.f36400f;
                kotlin.jvm.internal.m.c(aVar16);
                arrayList2.add(((w5) aVar16).f33536n.f32503c);
                ta.a aVar17 = c0Var.f36400f;
                kotlin.jvm.internal.m.c(aVar17);
                arrayList2.add(((w5) aVar17).f33537o.f32503c);
                ta.a aVar18 = c0Var.f36400f;
                kotlin.jvm.internal.m.c(aVar18);
                RelativeLayout relativeLayout = ((w5) aVar18).f33541s.f32472c;
                final int i14 = 0;
                relativeLayout.postDelayed(new b2.c(4, relativeLayout, new fz.a() { // from class: qh.x
                    @Override // fz.a
                    public final Object invoke() {
                        int i15 = i14;
                        qy.b0 b0Var = qy.b0.f48488a;
                        c0 c0Var2 = c0Var;
                        switch (i15) {
                            case 0:
                                ta.a aVar19 = c0Var2.f36400f;
                                kotlin.jvm.internal.m.c(aVar19);
                                Drawable background = ((w5) aVar19).f33529f.getBackground();
                                kotlin.jvm.internal.m.e(background, "getBackground(...)");
                                if (background instanceof AnimationDrawable) {
                                    ((AnimationDrawable) background).start();
                                }
                                ta.a aVar20 = c0Var2.f36400f;
                                kotlin.jvm.internal.m.c(aVar20);
                                Drawable background2 = ((w5) aVar20).f33531h.getBackground();
                                kotlin.jvm.internal.m.e(background2, "getBackground(...)");
                                if (background2 instanceof AnimationDrawable) {
                                    ((AnimationDrawable) background2).start();
                                }
                                ta.a aVar21 = c0Var2.f36400f;
                                kotlin.jvm.internal.m.c(aVar21);
                                ObjectAnimator duration = ObjectAnimator.ofFloat(((w5) aVar21).f33533j, "alpha", 1.0f, 0.3f, 1.0f).setDuration(1400L);
                                kotlin.jvm.internal.m.e(duration, "setDuration(...)");
                                duration.setRepeatCount(-1);
                                duration.setRepeatMode(1);
                                duration.start();
                                ta.a aVar22 = c0Var2.f36400f;
                                kotlin.jvm.internal.m.c(aVar22);
                                ObjectAnimator duration2 = ObjectAnimator.ofFloat(((w5) aVar22).f33534k, "alpha", 1.0f, 0.4f, 1.0f).setDuration(1200L);
                                kotlin.jvm.internal.m.e(duration2, "setDuration(...)");
                                duration2.setRepeatCount(-1);
                                duration2.setRepeatMode(1);
                                duration2.start();
                                ta.a aVar23 = c0Var2.f36400f;
                                kotlin.jvm.internal.m.c(aVar23);
                                int childCount = ((w5) aVar23).f33541s.f32472c.getChildCount();
                                for (int i16 = 0; i16 < childCount; i16++) {
                                    ta.a aVar24 = c0Var2.f36400f;
                                    kotlin.jvm.internal.m.c(aVar24);
                                    View childAt = ((w5) aVar24).f33541s.f32472c.getChildAt(i16);
                                    ta.a aVar25 = c0Var2.f36400f;
                                    kotlin.jvm.internal.m.c(aVar25);
                                    float height = ((w5) aVar25).f33541s.f32472c.getHeight() - childAt.getY();
                                    float f5 = -height;
                                    ObjectAnimator duration3 = ObjectAnimator.ofPropertyValuesHolder(childAt, PropertyValuesHolder.ofFloat("translationX", f5, CropImageView.DEFAULT_ASPECT_RATIO, height), PropertyValuesHolder.ofFloat("translationY", f5, CropImageView.DEFAULT_ASPECT_RATIO, height), PropertyValuesHolder.ofFloat("scaleX", 1.0f, CropImageView.DEFAULT_ASPECT_RATIO), PropertyValuesHolder.ofFloat("scaleY", 1.0f, CropImageView.DEFAULT_ASPECT_RATIO)).setDuration(((long) th.j.n(16, 32)) * 100);
                                    duration3.setRepeatCount(-1);
                                    duration3.setRepeatMode(1);
                                    duration3.setInterpolator(new DecelerateInterpolator());
                                    duration3.start();
                                }
                                break;
                            default:
                                c0Var2.D();
                                break;
                        }
                        return b0Var;
                    }
                }), 0L);
                ta.a aVar19 = c0Var.f36400f;
                kotlin.jvm.internal.m.c(aVar19);
                final int i15 = 1;
                bq.z.a(((w5) aVar19).f33541s.f32472c, 0L, new fz.a() { // from class: qh.x
                    @Override // fz.a
                    public final Object invoke() {
                        int i16 = i15;
                        qy.b0 b0Var = qy.b0.f48488a;
                        c0 c0Var2 = c0Var;
                        switch (i16) {
                            case 0:
                                ta.a aVar110 = c0Var2.f36400f;
                                kotlin.jvm.internal.m.c(aVar110);
                                Drawable background = ((w5) aVar110).f33529f.getBackground();
                                kotlin.jvm.internal.m.e(background, "getBackground(...)");
                                if (background instanceof AnimationDrawable) {
                                    ((AnimationDrawable) background).start();
                                }
                                ta.a aVar20 = c0Var2.f36400f;
                                kotlin.jvm.internal.m.c(aVar20);
                                Drawable background2 = ((w5) aVar20).f33531h.getBackground();
                                kotlin.jvm.internal.m.e(background2, "getBackground(...)");
                                if (background2 instanceof AnimationDrawable) {
                                    ((AnimationDrawable) background2).start();
                                }
                                ta.a aVar21 = c0Var2.f36400f;
                                kotlin.jvm.internal.m.c(aVar21);
                                ObjectAnimator duration = ObjectAnimator.ofFloat(((w5) aVar21).f33533j, "alpha", 1.0f, 0.3f, 1.0f).setDuration(1400L);
                                kotlin.jvm.internal.m.e(duration, "setDuration(...)");
                                duration.setRepeatCount(-1);
                                duration.setRepeatMode(1);
                                duration.start();
                                ta.a aVar22 = c0Var2.f36400f;
                                kotlin.jvm.internal.m.c(aVar22);
                                ObjectAnimator duration2 = ObjectAnimator.ofFloat(((w5) aVar22).f33534k, "alpha", 1.0f, 0.4f, 1.0f).setDuration(1200L);
                                kotlin.jvm.internal.m.e(duration2, "setDuration(...)");
                                duration2.setRepeatCount(-1);
                                duration2.setRepeatMode(1);
                                duration2.start();
                                ta.a aVar23 = c0Var2.f36400f;
                                kotlin.jvm.internal.m.c(aVar23);
                                int childCount = ((w5) aVar23).f33541s.f32472c.getChildCount();
                                for (int i17 = 0; i17 < childCount; i17++) {
                                    ta.a aVar24 = c0Var2.f36400f;
                                    kotlin.jvm.internal.m.c(aVar24);
                                    View childAt = ((w5) aVar24).f33541s.f32472c.getChildAt(i17);
                                    ta.a aVar25 = c0Var2.f36400f;
                                    kotlin.jvm.internal.m.c(aVar25);
                                    float height = ((w5) aVar25).f33541s.f32472c.getHeight() - childAt.getY();
                                    float f5 = -height;
                                    ObjectAnimator duration3 = ObjectAnimator.ofPropertyValuesHolder(childAt, PropertyValuesHolder.ofFloat("translationX", f5, CropImageView.DEFAULT_ASPECT_RATIO, height), PropertyValuesHolder.ofFloat("translationY", f5, CropImageView.DEFAULT_ASPECT_RATIO, height), PropertyValuesHolder.ofFloat("scaleX", 1.0f, CropImageView.DEFAULT_ASPECT_RATIO), PropertyValuesHolder.ofFloat("scaleY", 1.0f, CropImageView.DEFAULT_ASPECT_RATIO)).setDuration(((long) th.j.n(16, 32)) * 100);
                                    duration3.setRepeatCount(-1);
                                    duration3.setRepeatMode(1);
                                    duration3.setInterpolator(new DecelerateInterpolator());
                                    duration3.start();
                                }
                                break;
                            default:
                                c0Var2.D();
                                break;
                        }
                        return b0Var;
                    }
                });
                sh.c cVar = c0Var.S;
                if (cVar == null) {
                    kotlin.jvm.internal.m.n("viewModel");
                    throw null;
                }
                if (!cVar.O) {
                    ta.a aVar20 = c0Var.f36400f;
                    kotlin.jvm.internal.m.c(aVar20);
                    ((w5) aVar20).f33527d.setVisibility(8);
                    ta.a aVar21 = c0Var.f36400f;
                    kotlin.jvm.internal.m.c(aVar21);
                    ((w5) aVar21).f33538p.setVisibility(8);
                    return;
                }
                ta.a aVar22 = c0Var.f36400f;
                kotlin.jvm.internal.m.c(aVar22);
                ((w5) aVar22).f33527d.init(4);
                ta.a aVar23 = c0Var.f36400f;
                kotlin.jvm.internal.m.c(aVar23);
                ((w5) aVar23).f33538p.setVisibility(0);
                ta.a aVar24 = c0Var.f36400f;
                kotlin.jvm.internal.m.c(aVar24);
                ProgressBar progressBar = ((w5) aVar24).f33538p;
                sh.c cVar2 = c0Var.S;
                if (cVar2 == null) {
                    kotlin.jvm.internal.m.n("viewModel");
                    throw null;
                }
                progressBar.setMax(cVar2.c().size());
                ta.a aVar25 = c0Var.f36400f;
                kotlin.jvm.internal.m.c(aVar25);
                ((w5) aVar25).f33538p.setProgress(0);
                return;
            case 8:
                Long it3 = (Long) obj;
                kotlin.jvm.internal.m.f(it3, "it");
                ta.a aVar26 = ((qp.s) this.f44617b).f47886f;
                kotlin.jvm.internal.m.c(aVar26);
                ((m1) aVar26).f32913e.setVisibility(4);
                return;
            case 9:
                Long it4 = (Long) obj;
                kotlin.jvm.internal.m.f(it4, "it");
                qp.b0 b0Var = (qp.b0) this.f44617b;
                ta.a aVar27 = b0Var.f47886f;
                kotlin.jvm.internal.m.c(aVar27);
                FlexboxLayout flexboxLayout = ((hj.i1) aVar27).f32682e;
                flexboxLayout.postDelayed(new b2.c(4, flexboxLayout, new qp.z(b0Var, 1)), 0L);
                return;
            case 10:
                Long it5 = (Long) obj;
                kotlin.jvm.internal.m.f(it5, "it");
                ((jp.p0) ((d1) this.f44617b).f47881a).X();
                return;
            case 13:
                Long it6 = (Long) obj;
                kotlin.jvm.internal.m.f(it6, "it");
                ta.a aVar28 = ((k2) this.f44617b).f47886f;
                kotlin.jvm.internal.m.c(aVar28);
                ((p2) aVar28).f33085e.performClick();
                return;
            case 14:
                Long it7 = (Long) obj;
                kotlin.jvm.internal.m.f(it7, "it");
                z2 z2Var = (z2) this.f44617b;
                ta.a aVar29 = z2Var.f47886f;
                kotlin.jvm.internal.m.c(aVar29);
                ((c2) aVar29).f32454l.setVisibility(0);
                ta.a aVar30 = z2Var.f47886f;
                kotlin.jvm.internal.m.c(aVar30);
                ((c2) aVar30).m.setVisibility(4);
                return;
            case 15:
                Long it8 = (Long) obj;
                kotlin.jvm.internal.m.f(it8, "it");
                p3 p3Var = (p3) this.f44617b;
                f7.a0 a0Var = p3Var.f48115i;
                if (a0Var != null) {
                    a0Var.c(new y6.e0(1.0f, 1.0f));
                }
                f7.a0 a0Var2 = p3Var.f48115i;
                if (a0Var2 != null) {
                    a0Var2.r(true);
                    return;
                }
                return;
            case 20:
                Long it9 = (Long) obj;
                kotlin.jvm.internal.m.f(it9, "it");
                rq.g gVar = (rq.g) this.f44617b;
                gVar.q();
                ta.a aVar31 = gVar.f49363g;
                kotlin.jvm.internal.m.c(aVar31);
                ((w1) aVar31).f33502c.setAlpha(CropImageView.DEFAULT_ASPECT_RATIO);
                ta.a aVar32 = gVar.f49363g;
                kotlin.jvm.internal.m.c(aVar32);
                ((w1) aVar32).f33502c.setVisibility(0);
                ta.a aVar33 = gVar.f49363g;
                kotlin.jvm.internal.m.c(aVar33);
                ((w1) aVar33).f33501b.setAlpha(CropImageView.DEFAULT_ASPECT_RATIO);
                ta.a aVar34 = gVar.f49363g;
                kotlin.jvm.internal.m.c(aVar34);
                ((w1) aVar34).f33501b.setVisibility(0);
                ta.a aVar35 = gVar.f49363g;
                kotlin.jvm.internal.m.c(aVar35);
                FrameLayout frameLayout = ((w1) aVar35).f33501b;
                frameLayout.postDelayed(new b2.c(4, frameLayout, new rq.d(gVar, 7)), 0L);
                ta.a aVar36 = gVar.f49363g;
                kotlin.jvm.internal.m.c(aVar36);
                FrameLayout frameLayout2 = ((w1) aVar36).f33502c;
                frameLayout2.postDelayed(new b2.c(4, frameLayout2, new rq.d(gVar, 8)), 0L);
                return;
            case 23:
                Long it10 = (Long) obj;
                kotlin.jvm.internal.m.f(it10, "it");
                si.d dVar = (si.d) this.f44617b;
                HwCharacter hwCharacter = dVar.f51707i;
                if (hwCharacter == null) {
                    kotlin.jvm.internal.m.n("mCurChar");
                    throw null;
                }
                long charId = hwCharacter.getCharId();
                Bundle bundle = new Bundle();
                bundle.putLong(xItStCyvVEZ.hcrZDQusl, charId);
                bundle.putBoolean(INTENTS.EXTRA_BOOLEAN, true);
                pi.h hVar2 = new pi.h();
                hVar2.setArguments(bundle);
                jp.p0 p0Var = (jp.p0) dVar.f47881a;
                p0Var.getClass();
                hVar2.u(p0Var.getChildFragmentManager(), "CharacterAnimationFragment");
                return;
            default:
                Long it11 = (Long) obj;
                kotlin.jvm.internal.m.f(it11, "it");
                tp.i iVar = (tp.i) this.f44617b;
                iVar.v();
                i iVar2 = iVar.X;
                if (iVar2 != null) {
                    ((hj.f) ((AckCardActivity) iVar2.f44522b).j()).f32555k.setCurrentItem(iVar.T);
                    return;
                }
                return;
        }
    }

    public w(WorkDatabase workDatabase) {
        this.f44616a = 5;
        kotlin.jvm.internal.m.f(workDatabase, "workDatabase");
        this.f44617b = workDatabase;
    }

    public w(vt.i0 courseRepository) {
        this.f44616a = 4;
        kotlin.jvm.internal.m.f(courseRepository, "courseRepository");
        this.f44617b = courseRepository;
    }

    public w(UUID uuid, int i11, byte[] bArr, UUID[] uuidArr) {
        this.f44616a = 19;
        this.f44617b = uuid;
    }
}
