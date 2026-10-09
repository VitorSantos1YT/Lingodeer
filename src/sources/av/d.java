package av;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import b0.c2;
import b0.f1;
import bp.b5;
import com.chad.library.adapter.base.BaseViewHolder;
import com.google.api.Service;
import com.google.firebase.sessions.UuidGenerator;
import com.lingo.lingoskill.ar.ui.syllable.ARSyllableTableActivity;
import com.lingo.lingoskill.http.object.NewsFeed;
import com.lingo.lingoskill.ui.base.FindPasswordActivity;
import com.lingo.lingoskill.ui.base.LoginCheckLocateAgeActivity;
import com.lingo.lingoskill.ui.base.NewsFeedActivity;
import com.lingo.lingoskill.ui.base.RemindIndexActivity;
import com.lingo.lingoskill.widget.SlowPlaySwitchBtn;
import com.lingodeer.R;
import com.stkouyu.SkEgnManager;
import fr.j3;
import fr.o0;
import hj.h3;
import hj.x4;
import java.util.ArrayList;
import jt.x0;
import rt.uf;
import vt.n0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3115b;

    public /* synthetic */ d(Object obj, int i11) {
        this.f3114a = i11;
        this.f3115b = obj;
    }

    @Override // fz.a
    public final Object invoke() {
        int i11 = 25;
        int i12 = 18;
        int i13 = 0;
        switch (this.f3114a) {
            case 0:
                return (y) ((i) this.f3115b).f3149c.invoke();
            case 1:
                return SkEgnManager.getInstance(((y) this.f3115b).f3217b);
            case 2:
                return Float.valueOf(b0.e.n(((rz.b0) this.f3115b).getCoroutineContext()));
            case 3:
                f1 f1Var = (f1) this.f3115b;
                c2 c2Var = f1Var.f3530f;
                f1Var.f3531t = c2Var != null ? ((Number) c2Var.f3469l.getValue()).longValue() : 0L;
                return qy.b0.f48488a;
            case 4:
                Object systemService = ((View) ((b1.p) this.f3115b).f3800b).getContext().getSystemService("input_method");
                kotlin.jvm.internal.m.d(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                return (InputMethodManager) systemService;
            case 5:
                return new BaseInputConnection(((b1.w) this.f3115b).f3823a, false);
            case 6:
                FindPasswordActivity findPasswordActivity = (FindPasswordActivity) this.f3115b;
                int i14 = FindPasswordActivity.K;
                findPasswordActivity.finish();
                return qy.b0.f48488a;
            case 7:
                LoginCheckLocateAgeActivity loginCheckLocateAgeActivity = (LoginCheckLocateAgeActivity) this.f3115b;
                int i15 = LoginCheckLocateAgeActivity.L;
                loginCheckLocateAgeActivity.finish();
                return qy.b0.f48488a;
            case 8:
                NewsFeed newsFeed = (NewsFeed) this.f3115b;
                int i16 = NewsFeedActivity.R;
                Bundle bundle = new Bundle();
                bundle.putString("id", newsFeed.getFeedId());
                return bundle;
            case 9:
                RemindIndexActivity remindIndexActivity = (RemindIndexActivity) this.f3115b;
                int i17 = RemindIndexActivity.f22045t;
                remindIndexActivity.finish();
                return qy.b0.f48488a;
            case 10:
                b5 b5Var = (b5) this.f3115b;
                ta.a aVar = b5Var.f36400f;
                kotlin.jvm.internal.m.c(aVar);
                ((x4) aVar).f33585d.removeAllViews();
                while (true) {
                    int i18 = 4;
                    if (i13 >= 18) {
                        int[] iArr = new int[2];
                        ta.a aVar2 = b5Var.f36400f;
                        kotlin.jvm.internal.m.c(aVar2);
                        ((x4) aVar2).f33585d.getLocationOnScreen(iArr);
                        ta.a aVar3 = b5Var.f36400f;
                        kotlin.jvm.internal.m.c(aVar3);
                        FrameLayout frameLayout = ((x4) aVar3).f33585d;
                        frameLayout.postDelayed(new b2.c(i18, frameLayout, new at.f(5, b5Var, iArr)), 0L);
                        return qy.b0.f48488a;
                    }
                    ImageView imageView = new ImageView(b5Var.f36398d);
                    Integer[] numArr = {Integer.valueOf(R.drawable.pd_review_book), Integer.valueOf(R.drawable.pd_review_listen), Integer.valueOf(R.drawable.pd_review_write)};
                    jz.d dVar = jz.e.f37397a;
                    imageView.setImageResource(((Number) ry.l.d0(numArr)).intValue());
                    imageView.setVisibility(4);
                    ta.a aVar4 = b5Var.f36400f;
                    kotlin.jvm.internal.m.c(aVar4);
                    ((x4) aVar4).f33585d.addView(imageView);
                    ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                    Context contextRequireContext = b5Var.requireContext();
                    kotlin.jvm.internal.m.e(contextRequireContext, "requireContext(...)");
                    layoutParams.width = (int) j3.Z(20, contextRequireContext);
                    ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
                    Context contextRequireContext2 = b5Var.requireContext();
                    kotlin.jvm.internal.m.e(contextRequireContext2, "requireContext(...)");
                    layoutParams2.height = (int) j3.Z(20, contextRequireContext2);
                    imageView.setVisibility(4);
                    imageView.postDelayed(new b2.c(i18, imageView, new at.f(6, b5Var, imageView)), 0L);
                    i13++;
                }
                break;
            case 11:
                bq.o.a((bq.o) this.f3115b);
                return qy.b0.f48488a;
            case 12:
                ImageView imageView2 = (ImageView) ((b7.c) this.f3115b).f3960c;
                if (imageView2 != null) {
                    try {
                        Drawable background = imageView2.getBackground();
                        kotlin.jvm.internal.m.d(background, "null cannot be cast to non-null type android.graphics.drawable.AnimationDrawable");
                        ((AnimationDrawable) background).selectDrawable(0);
                    } catch (Exception e8) {
                        e8.printStackTrace();
                    }
                    break;
                }
                return qy.b0.f48488a;
            case 13:
                return l1.t.B(Boolean.valueOf(((o0) ((n0) this.f3115b)).f27733a.isCnHandWriteCharacterBlurred));
            case 14:
                bt.p pVar = (bt.p) this.f3115b;
                ys.d0 d0Var = (ys.d0) pVar.f3561b;
                if (d0Var != null) {
                    d0Var.g(pVar.f5819d);
                }
                return qy.b0.f48488a;
            case 15:
                jt.g gVar = (jt.g) this.f3115b;
                gVar.f(gVar.c().getValue() != null ? gVar.f36936e : gVar.f36935d, new ju.d(i11));
                return qy.b0.f48488a;
            case 16:
                return l1.t.B((qy.l) this.f3115b);
            case 17:
                bt.p pVar2 = (bt.p) this.f3115b;
                ys.d0 d0Var2 = (ys.d0) pVar2.f3561b;
                if (d0Var2 != null) {
                    d0Var2.g(pVar2.f5819d);
                }
                return qy.b0.f48488a;
            case 18:
                x0 x0Var = (x0) this.f3115b;
                x0Var.f(x0Var.c().getValue() != null ? x0Var.f37259e : x0Var.f37258d, new ju.d(i11));
                return qy.b0.f48488a;
            case 19:
                c00.c cVar = (c00.c) this.f3115b;
                e00.h hVarH = ns.o.h("kotlinx.serialization.Polymorphic", e00.c.f24671c, new e00.g[0], new a00.c(cVar, i12));
                mz.c context = cVar.f6403a;
                kotlin.jvm.internal.m.f(context, "context");
                return new e00.b(hVarH, context);
            case 20:
                return ((mz.k) ((ArrayList) this.f3115b).get(0)).d();
            case 21:
                c1.l lVar = (c1.l) this.f3115b;
                lVar.f6483g0 = null;
                y2.f.o(lVar);
                y2.f.n(lVar);
                y2.f.m(lVar);
                return Boolean.TRUE;
            case 22:
                c1.p pVar3 = (c1.p) this.f3115b;
                pVar3.f6498b0 = null;
                y2.f.o(pVar3);
                y2.f.n(pVar3);
                y2.f.m(pVar3);
                return Boolean.TRUE;
            case 23:
                uf ufVar = (uf) this.f3115b;
                Bundle bundle2 = new Bundle();
                b7.e0.v(ufVar.f50514a, bundle2, "U", "unit");
                return bundle2;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                ci.g gVar2 = (ci.g) this.f3115b;
                ta.a aVar5 = gVar2.f36400f;
                kotlin.jvm.internal.m.c(aVar5);
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) ((h3) aVar5).f32657c.getLayoutManager();
                if (linearLayoutManager != null) {
                    if (ij.l.f34436b == null) {
                        synchronized (ij.l.class) {
                            if (ij.l.f34436b == null) {
                                ij.l.f34436b = new ij.l();
                            }
                        }
                    }
                    ij.l lVar2 = ij.l.f34436b;
                    kotlin.jvm.internal.m.c(lVar2);
                    int pronun = lVar2.b(51).getPronun() + 1;
                    ta.a aVar6 = gVar2.f36400f;
                    kotlin.jvm.internal.m.c(aVar6);
                    float height = ((h3) aVar6).f32657c.getHeight() / 2;
                    Context contextRequireContext3 = gVar2.requireContext();
                    kotlin.jvm.internal.m.e(contextRequireContext3, "requireContext(...)");
                    linearLayoutManager.scrollToPositionWithOffset(pronun, (int) (height - j3.Z(80, contextRequireContext3)));
                    break;
                }
                return qy.b0.f48488a;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                bi.a aVar7 = (bi.a) this.f3115b;
                Bundle bundle3 = new Bundle();
                b7.e0.v(aVar7.f4450a, bundle3, "L", "lesson");
                return bundle3;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                ARSyllableTableActivity aRSyllableTableActivity = (ARSyllableTableActivity) this.f3115b;
                int i19 = ARSyllableTableActivity.H;
                aRSyllableTableActivity.finish();
                return qy.b0.f48488a;
            case 27:
                SlowPlaySwitchBtn slowPlaySwitchBtn = (SlowPlaySwitchBtn) this.f3115b;
                if (slowPlaySwitchBtn != null) {
                    slowPlaySwitchBtn.b();
                }
                return qy.b0.f48488a;
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                ((BaseViewHolder) this.f3115b).getView(R.id.iv_recorder).setBackgroundResource(R.drawable.bg_lesson_index_start_btn_enable);
                return qy.b0.f48488a;
            default:
                String string = ((UuidGenerator) this.f3115b).next().toString();
                kotlin.jvm.internal.m.e(string, "toString(...)");
                return string;
        }
    }
}
