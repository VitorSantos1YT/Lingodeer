package o20;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.google.api.Service;
import com.lingo.lingoskill.object.Word;
import com.lingodeer.R;
import hj.a5;
import hj.b2;
import hj.d2;
import hj.i2;
import hj.m1;
import hj.u5;
import hj.w1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import qp.d3;
import qp.f1;
import qp.f2;
import qp.p3;
import qp.v2;
import r.p1;
import retrofit2.HttpException;
import rt.t4;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class i implements h, tx.c, p1, vq.f, lp.i, th.c, jp.m0, r.k, ry.u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f44522b;

    public /* synthetic */ i(Object obj, int i11) {
        this.f44521a = i11;
        this.f44522b = obj;
    }

    @Override // ry.u
    public Iterator C() {
        return new nz.g((nz.i) this.f44522b);
    }

    @Override // jp.m0
    public void D(ConstraintLayout constraintLayout) {
        v2 v2Var = (v2) this.f44522b;
        TextView textView = (TextView) ((jp.p0) v2Var.f47881a).y().findViewById(R.id.txt_answer_txt);
        StringBuilder sb2 = new StringBuilder();
        ta.a aVar = v2Var.f47886f;
        kotlin.jvm.internal.m.c(aVar);
        int childCount = ((b2) aVar).f32377c.getChildCount();
        int i11 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            ta.a aVar2 = v2Var.f47886f;
            kotlin.jvm.internal.m.c(aVar2);
            sb2.append(((Word) hh.p0.g(((b2) aVar2).f32377c, i12, "null cannot be cast to non-null type com.lingo.lingoskill.object.Word")).getTranslations() + " ");
        }
        String string = sb2.toString();
        kotlin.jvm.internal.m.e(string, "toString(...)");
        String string2 = textView.getText().toString();
        ArrayList arrayList = new ArrayList();
        int length = string2.length();
        for (int i13 = 0; i13 < length; i13++) {
            String strValueOf = String.valueOf(string2.charAt(i13));
            if (i13 < string.length()) {
                String strValueOf2 = String.valueOf(string.charAt(i13));
                String strN = hh.p0.n("getDefault(...)", strValueOf, "toLowerCase(...)");
                Locale locale = Locale.getDefault();
                kotlin.jvm.internal.m.e(locale, "getDefault(...)");
                String lowerCase = strValueOf2.toLowerCase(locale);
                kotlin.jvm.internal.m.e(lowerCase, "toLowerCase(...)");
                if (!strN.equals(lowerCase)) {
                    arrayList.add(Integer.valueOf(i13));
                }
            } else {
                arrayList.add(Integer.valueOf(i13));
            }
        }
        TextView textView2 = (TextView) constraintLayout.findViewById(R.id.txt_answer_txt);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) string2);
        int size = arrayList.size();
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            kotlin.jvm.internal.m.e(obj, "next(...)");
            int iIntValue = ((Number) obj).intValue();
            try {
                Context context = v2Var.f47883c;
                kotlin.jvm.internal.m.f(context, "context");
                spannableStringBuilder.setSpan(new ForegroundColorSpan(context.getColor(R.color.colorAccent)), iIntValue, iIntValue + 1, 33);
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }
        textView2.setText(spannableStringBuilder);
    }

    @Override // th.c, th.b
    public void a() {
        ((f2) this.f44522b).v();
    }

    @Override // tx.c
    public void accept(Object obj) {
        switch (this.f44521a) {
            case 2:
                Long it = (Long) obj;
                kotlin.jvm.internal.m.f(it, "it");
                ((om.h) this.f44522b).f45611f.o();
                return;
            case 3:
                Boolean aBoolean = (Boolean) obj;
                oo.t tVar = (oo.t) this.f44522b;
                kotlin.jvm.internal.m.f(aBoolean, "aBoolean");
                if (aBoolean.booleanValue()) {
                    ta.a aVar = tVar.f36400f;
                    kotlin.jvm.internal.m.c(aVar);
                    ((a5) aVar).f32350b.setText(tVar.getString(R.string.update_recording));
                    return;
                } else {
                    ta.a aVar2 = tVar.f36400f;
                    kotlin.jvm.internal.m.c(aVar2);
                    ((a5) aVar2).f32350b.setText(tVar.getString(R.string.publish));
                    return;
                }
            case 4:
            case 5:
            case 6:
            case 9:
            case 10:
            case 13:
            case 14:
            case 18:
            case 19:
            default:
                Long it2 = (Long) obj;
                kotlin.jvm.internal.m.f(it2, "it");
                rq.i iVar = (rq.i) this.f44522b;
                ((jp.p0) iVar.f49357a).A().z(false);
                ((jp.p0) iVar.f49357a).X();
                return;
            case 7:
                Long it3 = (Long) obj;
                kotlin.jvm.internal.m.f(it3, "it");
                qh.e eVar = (qh.e) this.f44522b;
                ta.a aVar3 = eVar.f36400f;
                kotlin.jvm.internal.m.c(aVar3);
                TextView textView = ((u5) aVar3).f33420u;
                sh.b bVar = eVar.N;
                if (bVar == null) {
                    kotlin.jvm.internal.m.n("viewModel");
                    throw null;
                }
                textView.setText("+" + bVar.f51684f);
                ta.a aVar4 = eVar.f36400f;
                kotlin.jvm.internal.m.c(aVar4);
                ObjectAnimator.ofPropertyValuesHolder(((u5) aVar4).f33420u, PropertyValuesHolder.ofFloat("scaleX", 1.0f, 1.4f, 1.0f), PropertyValuesHolder.ofFloat("scaleY", 1.0f, 1.4f, 1.0f)).setDuration(300L).start();
                th.e eVar2 = eVar.O;
                if (eVar2 != null) {
                    eVar2.k(R.raw.game_choose_correct);
                    return;
                } else {
                    kotlin.jvm.internal.m.n("player");
                    throw null;
                }
            case 8:
                Long it4 = (Long) obj;
                kotlin.jvm.internal.m.f(it4, "it");
                ((qh.c0) this.f44522b).C(true);
                return;
            case 11:
                Long it5 = (Long) obj;
                kotlin.jvm.internal.m.f(it5, "it");
                ((jp.p0) ((f1) this.f44522b).f47881a).X();
                return;
            case 12:
                Long it6 = (Long) obj;
                kotlin.jvm.internal.m.f(it6, "it");
                ((View) this.f44522b).setEnabled(true);
                return;
            case 15:
                Long it7 = (Long) obj;
                kotlin.jvm.internal.m.f(it7, "it");
                d3 d3Var = (d3) this.f44522b;
                ta.a aVar5 = d3Var.f47886f;
                kotlin.jvm.internal.m.c(aVar5);
                ((d2) aVar5).f32486g.setVisibility(0);
                ta.a aVar6 = d3Var.f47886f;
                kotlin.jvm.internal.m.c(aVar6);
                ((d2) aVar6).f32487h.setVisibility(4);
                return;
            case 16:
                Long it8 = (Long) obj;
                kotlin.jvm.internal.m.f(it8, "it");
                p3 p3Var = (p3) this.f44522b;
                ta.a aVar7 = p3Var.f47886f;
                Context context = p3Var.f47883c;
                kotlin.jvm.internal.m.c(aVar7);
                if (((i2) aVar7).f32689c == null) {
                    return;
                }
                ta.a aVar8 = p3Var.f47886f;
                kotlin.jvm.internal.m.c(aVar8);
                ((i2) aVar8).f32689c.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, context.getApplicationContext().getDrawable(R.drawable.line_grey));
                ta.a aVar9 = p3Var.f47886f;
                kotlin.jvm.internal.m.c(aVar9);
                EditText editText = ((i2) aVar9).f32689c;
                kotlin.jvm.internal.m.f(context, "context");
                editText.setTextColor(context.getColor(R.color.primary_black));
                return;
            case 17:
                LottieAnimationView lottieAnimationView = (LottieAnimationView) this.f44522b;
                lottieAnimationView.i((String) obj);
                lottieAnimationView.setFailureListener(new pi.g(3));
                return;
            case 20:
                Long it9 = (Long) obj;
                kotlin.jvm.internal.m.f(it9, "it");
                ta.a aVar10 = ((rq.g) this.f44522b).f49363g;
                kotlin.jvm.internal.m.c(aVar10);
                ((w1) aVar10).f33501b.performClick();
                return;
        }
    }

    public uz.i b(List list) {
        gp.r rVar = new gp.r(new mi.b(list, this, (vy.d) null));
        yz.f fVar = rz.o0.f50940a;
        return uz.x0.w(rVar, yz.e.f58387a);
    }

    public void c(String str, Bundle bundle) {
        re.s sVar = re.s.f49201a;
        if (re.i0.c()) {
            ((se.m) this.f44522b).g(str, bundle);
        }
    }

    public void d(pd.h hVar, pd.l lVar, aw.t tVar) {
        hVar.markDelivered();
        hVar.addMarker("post-response");
        ((a) this.f44522b).execute(new com.android.billingclient.api.b0(hVar, lVar, tVar, 8));
    }

    @Override // lp.i
    public void e() {
        ((jp.p0) ((qp.f0) this.f44522b).f47881a).O(4);
    }

    @Override // vq.f
    public void f(View view, Point point) {
        boolean zR;
        kotlin.jvm.internal.m.f(view, "view");
        qp.s sVar = (qp.s) this.f44522b;
        sVar.w();
        Word word = (Word) view.getTag();
        ArrayList arrayList = sVar.f48168w;
        int size = arrayList.size();
        boolean z11 = false;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = arrayList.get(i11);
            kotlin.jvm.internal.m.d(obj, "null cannot be cast to non-null type android.widget.FrameLayout");
            FrameLayout frameLayout = (FrameLayout) obj;
            Word word2 = (Word) frameLayout.getTag();
            if (frameLayout.getTag(R.id.tag_rects) != null) {
                Object tag = frameLayout.getTag(R.id.tag_rects);
                kotlin.jvm.internal.m.d(tag, "null cannot be cast to non-null type kotlin.collections.List<android.graphics.Rect>");
                zR = qp.s.r(sVar, view, point, (List) tag, frameLayout);
            } else {
                zR = false;
            }
            if (zR) {
                z11 = true;
            } else {
                if (word != null && word2 != null && word.getWordId() == word2.getWordId()) {
                    int i12 = sVar.f48163r;
                    ta.a aVar = sVar.f47886f;
                    kotlin.jvm.internal.m.c(aVar);
                    if (i12 == ((m1) aVar).f32912d.indexOfChild(frameLayout)) {
                        frameLayout.setVisibility(8);
                    }
                }
                qp.s.t(sVar, frameLayout);
            }
            frameLayout.requestLayout();
        }
        if (!z11) {
            ta.a aVar2 = sVar.f47886f;
            kotlin.jvm.internal.m.c(aVar2);
            ((m1) aVar2).f32914f.setVisibility(4);
        }
        ta.a aVar3 = sVar.f47886f;
        kotlin.jvm.internal.m.c(aVar3);
        ((m1) aVar3).f32912d.requestLayout();
    }

    @Override // ry.u
    public Object g(Object obj) {
        return Long.valueOf(((t4) obj).f50422b);
    }

    @Override // vq.f
    public void h(View view) {
        qp.s sVar = (qp.s) this.f44522b;
        if (!sVar.f48165t) {
            view.setVisibility(0);
            view.findViewById(R.id.arrow_top).setVisibility(4);
            sVar.v();
        }
        ta.a aVar = sVar.f47886f;
        kotlin.jvm.internal.m.c(aVar);
        ((m1) aVar).f32914f.setVisibility(4);
        qp.s.s(sVar);
        sVar.y();
    }

    @Override // r.p1
    public void i(q.l lVar, MenuItem menuItem) {
        ((q.f) this.f44522b).f47263f.removeCallbacksAndMessages(lVar);
    }

    @Override // o20.h
    public void k(e eVar, t0 t0Var) {
        switch (this.f44521a) {
            case 0:
                j jVar = (j) this.f44522b;
                if (!t0Var.f44598a.R) {
                    jVar.completeExceptionally(new HttpException(t0Var));
                } else {
                    jVar.complete(t0Var.f44599b);
                }
                break;
            default:
                ((rz.m) this.f44522b).resumeWith(t0Var);
                break;
        }
    }

    @Override // lp.i
    public void l() {
        ((jp.p0) ((qp.f0) this.f44522b).f47881a).O(0);
    }

    @Override // r.p1
    public void o(q.l lVar, q.n nVar) {
        q.f fVar = (q.f) this.f44522b;
        Handler handler = fVar.f47263f;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = fVar.H;
        int size = arrayList.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                i11 = -1;
                break;
            } else if (lVar == ((q.e) arrayList.get(i11)).f47255b) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 == -1) {
            return;
        }
        int i12 = i11 + 1;
        handler.postAtTime(new mw.a(this, i12 < arrayList.size() ? (q.e) arrayList.get(i12) : null, nVar, lVar, 4), lVar, SystemClock.uptimeMillis() + 200);
    }

    @Override // vq.f
    public void r(View view) {
        qp.s sVar = (qp.s) this.f44522b;
        sVar.f48165t = false;
        view.setVisibility(8);
        ta.a aVar = sVar.f47886f;
        kotlin.jvm.internal.m.c(aVar);
        sVar.f48163r = ((m1) aVar).f32912d.indexOfChild(view);
        sVar.v();
    }

    @Override // vq.f
    public boolean w(View view, Point point) {
        int i11;
        kotlin.jvm.internal.m.f(view, "view");
        qp.s sVar = (qp.s) this.f44522b;
        ArrayList arrayList = sVar.f48168w;
        ArrayList arrayListW = sVar.w();
        int size = arrayListW.size();
        int i12 = 0;
        loop0: while (i12 < size) {
            List<Rect> list = (List) arrayListW.get(i12);
            int size2 = (i12 == arrayListW.size() - 1 || i12 >= arrayList.size()) ? arrayList.size() - 1 : i12;
            for (Rect rect : list) {
                int i13 = point.x;
                if (i13 >= rect.left && i13 < rect.right && (i11 = point.y) >= rect.top && i11 <= rect.bottom) {
                    sVar.f48165t = true;
                    ta.a aVar = sVar.f47886f;
                    kotlin.jvm.internal.m.c(aVar);
                    ((m1) aVar).f32914f.setVisibility(4);
                    qp.s.s(sVar);
                    Word word = (Word) view.getTag();
                    if (word == null) {
                        break loop0;
                    }
                    LayoutInflater layoutInflaterFrom = LayoutInflater.from(sVar.f47883c);
                    ta.a aVar2 = sVar.f47886f;
                    kotlin.jvm.internal.m.c(aVar2);
                    View viewInflate = layoutInflaterFrom.inflate(R.layout.item_sentence_drag_btm_to_top_item, (ViewGroup) ((m1) aVar2).f32911c, false);
                    kotlin.jvm.internal.m.d(viewInflate, "null cannot be cast to non-null type android.widget.FrameLayout");
                    FrameLayout frameLayout = (FrameLayout) viewInflate;
                    LinearLayout linearLayout = (LinearLayout) frameLayout.findViewById(R.id.ll_item);
                    frameLayout.findViewById(R.id.arrow_top).setVisibility(4);
                    frameLayout.setTag(word);
                    frameLayout.setTag(R.id.tag_view, view.getTag(R.id.tag_view));
                    kotlin.jvm.internal.m.c(linearLayout);
                    sVar.B(linearLayout, word);
                    ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                    kotlin.jvm.internal.m.d(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.setMarginStart(0);
                    marginLayoutParams.setMarginEnd(0);
                    sVar.x();
                    ef.e.B(frameLayout);
                    if (i12 == arrayListW.size() - 1) {
                        ta.a aVar3 = sVar.f47886f;
                        kotlin.jvm.internal.m.c(aVar3);
                        ((m1) aVar3).f32912d.addView(frameLayout);
                    } else {
                        ta.a aVar4 = sVar.f47886f;
                        kotlin.jvm.internal.m.c(aVar4);
                        ((m1) aVar4).f32912d.addView(frameLayout, size2);
                    }
                    qp.s.u(sVar, frameLayout);
                    ta.a aVar5 = sVar.f47886f;
                    kotlin.jvm.internal.m.c(aVar5);
                    ((m1) aVar5).f32912d.requestLayout();
                    sVar.v();
                    sVar.y();
                    return true;
                }
            }
            i12++;
        }
        return true;
    }

    @Override // o20.h
    public void y(e eVar, Throwable th2) {
        switch (this.f44521a) {
            case 0:
                ((j) this.f44522b).completeExceptionally(th2);
                break;
            default:
                ((rz.m) this.f44522b).resumeWith(com.bumptech.glide.e.l(th2));
                break;
        }
    }

    public i(Context context, int i11) {
        this.f44521a = i11;
        switch (i11) {
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                this.f44522b = new oi.a(context);
                break;
            default:
                this.f44522b = new se.m(context, (String) null);
                break;
        }
    }

    public i(Context context, String str) {
        this.f44521a = 23;
        this.f44522b = new se.m(context, str);
    }

    public i(Handler handler) {
        this.f44521a = 5;
        this.f44522b = new a(handler, 1);
    }

    public i(int i11) {
        this.f44521a = i11;
        switch (i11) {
            case 27:
                this.f44522b = new HashSet();
                break;
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
            default:
                SharedPreferences sharedPreferences = re.s.a().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0);
                kotlin.jvm.internal.m.e(sharedPreferences, "getApplicationContext()\n…ME, Context.MODE_PRIVATE)");
                this.f44522b = sharedPreferences;
                break;
            case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
                break;
        }
    }

    public i(vt.i0 courseRepository) {
        this.f44521a = 4;
        kotlin.jvm.internal.m.f(courseRepository, "courseRepository");
        this.f44522b = courseRepository;
    }
}
