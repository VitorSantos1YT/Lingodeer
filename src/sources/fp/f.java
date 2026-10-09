package fp;

import a0.b2;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.ViewModelKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.m1;
import bp.a5;
import bq.m;
import bq.r;
import com.chad.library.adapter.base.BaseViewHolder;
import com.google.api.Service;
import com.lingo.fluent.ui.base.PdFinishActivity;
import com.lingo.fluent.ui.base.adapter.PdLearnSpeakAdapter;
import com.lingo.lingoskill.hindiskill.ui.learn.HINDISyllableIntroductionActivity;
import com.lingo.lingoskill.speak.adapter.SpeakTryAdapter;
import com.lingodeer.R;
import com.lingodeer.data.model.CourseCharacter;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import e00.l;
import g00.a0;
import g00.z;
import gq.h;
import gq.i;
import h00.v;
import h1.yb;
import hh.f1;
import hh.o0;
import hh.p;
import hj.k4;
import hj.n4;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import jt.c0;
import jt.d1;
import jt.x0;
import k9.o;
import km.a2;
import km.u;
import kotlin.jvm.internal.y;
import kotlinx.serialization.json.internal.JsonException;
import kr.a1;
import kr.j1;
import kr.l1;
import kr.r0;
import kv.s0;
import kv.z0;
import l1.b1;
import l1.b3;
import l1.y1;
import qy.b0;
import ry.s;
import ry.x;
import rz.e0;
import th.j;
import uz.i1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f27377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f27378c;

    public /* synthetic */ f(int i11, Object obj, Object obj2) {
        this.f27376a = i11;
        this.f27377b = obj;
        this.f27378c = obj2;
    }

    @Override // fz.a
    public final Object invoke() {
        AnimatorSet.Builder builderWith;
        AnimatorSet.Builder builderWith2;
        AnimatorSet.Builder builderWith3;
        String[] strArrNames;
        int i11 = 2;
        vy.d dVar = null;
        switch (this.f27376a) {
            case 0:
                fz.e eVar = (fz.e) this.f27377b;
                yb ybVar = (yb) this.f27378c;
                eVar.invoke(Integer.valueOf(ybVar.h()), Integer.valueOf(ybVar.d()));
                break;
            case 1:
                y yVar = (y) this.f27377b;
                fz.c cVar = (fz.c) this.f27378c;
                String.valueOf(yVar.f38361a);
                Uri uri = (Uri) yVar.f38361a;
                if (uri != null) {
                    cVar.invoke(uri);
                }
                return b0.f48488a;
            case 2:
                y yVar2 = (y) this.f27378c;
                fz.e eVar2 = (fz.e) this.f27377b;
                Bitmap bitmap = (Bitmap) yVar2.f38361a;
                if (bitmap != null) {
                    eVar2.invoke(bitmap, String.valueOf(System.currentTimeMillis()));
                }
                return b0.f48488a;
            case 3:
                a0 a0Var = (a0) this.f27377b;
                String str = (String) this.f27378c;
                z zVar = a0Var.f28357b;
                if (zVar == null) {
                    Enum[] enumArr = a0Var.f28356a;
                    zVar = new z(str, enumArr.length);
                    for (Enum r9 : enumArr) {
                        zVar.k(r9.name(), false);
                    }
                }
                return zVar;
            case 4:
                ((i) this.f27377b).f29595a.unregisterNetworkCallback((h) this.f27378c);
                break;
            case 5:
                PdFinishActivity pdFinishActivity = (PdFinishActivity) this.f27377b;
                b3 b3Var = (b3) this.f27378c;
                int i12 = PdFinishActivity.H;
                pdFinishActivity.finish();
                if (!((Boolean) b3Var.getValue()).booleanValue()) {
                    int[] iArr = r.f4959a;
                    m.C(pdFinishActivity, "fluent_finish");
                }
                return b0.f48488a;
            case 6:
                o0 o0Var = (o0) this.f27377b;
                PdLearnSpeakAdapter pdLearnSpeakAdapter = (PdLearnSpeakAdapter) this.f27378c;
                ta.a aVar = o0Var.f36400f;
                kotlin.jvm.internal.m.c(aVar);
                m1 layoutManager = ((k4) aVar).f32821c.getLayoutManager();
                kotlin.jvm.internal.m.d(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                View childAt = ((LinearLayoutManager) layoutManager).getChildAt(pdLearnSpeakAdapter.getHeaderLayoutCount());
                if (childAt != null) {
                    childAt.postDelayed(new b2.c(4, childAt, new f(7, o0Var, childAt)), 0L);
                }
                return b0.f48488a;
            case 7:
                j.a(qx.h.m(800L, TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new a5((View) this.f27378c, 1), vx.b.f54316e), ((o0) this.f27377b).f36401t);
                break;
            case 8:
                f1 f1Var = (f1) this.f27377b;
                int[] iArr2 = (int[]) this.f27378c;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                dy.j jVar = ky.e.f38937b;
                f1Var.N = qx.h.d(800L, 800L, timeUnit, jVar).k(jVar).g(px.b.a()).h(new ob.e(13, f1Var, iArr2), p.f32277e);
                break;
            case 9:
                View view = (View) this.f27377b;
                f1 f1Var2 = (f1) this.f27378c;
                view.setVisibility(0);
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "translationX", CropImageView.DEFAULT_ASPECT_RATIO);
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, "translationY", CropImageView.DEFAULT_ASPECT_RATIO);
                ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(view, "scaleX", CropImageView.DEFAULT_ASPECT_RATIO, 1.6f, 0.5f);
                ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(view, "scaleY", CropImageView.DEFAULT_ASPECT_RATIO, 1.6f, 0.5f);
                ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(view, "alpha", CropImageView.DEFAULT_ASPECT_RATIO, 1.0f, CropImageView.DEFAULT_ASPECT_RATIO);
                AnimatorSet animatorSet = new AnimatorSet();
                AnimatorSet.Builder builderPlay = animatorSet.play(objectAnimatorOfFloat);
                if (builderPlay != null && (builderWith = builderPlay.with(objectAnimatorOfFloat2)) != null && (builderWith2 = builderWith.with(objectAnimatorOfFloat3)) != null && (builderWith3 = builderWith2.with(objectAnimatorOfFloat4)) != null) {
                    builderWith3.with(objectAnimatorOfFloat5);
                }
                animatorSet.setDuration(4600L);
                animatorSet.setInterpolator(new DecelerateInterpolator());
                j.a(qx.h.m(4600L, TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new b2(view, 18), vx.b.f54316e), f1Var2.f36401t);
                animatorSet.start();
                f1Var2.Q.add(animatorSet);
                break;
            case 10:
                ImageView imageView = (ImageView) this.f27377b;
                f1 f1Var3 = (f1) this.f27378c;
                ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                kotlin.jvm.internal.m.d(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                ta.a aVar2 = f1Var3.f36400f;
                kotlin.jvm.internal.m.c(aVar2);
                int width = (((n4) aVar2).f32989d.getWidth() - imageView.getWidth()) / 2;
                ta.a aVar3 = f1Var3.f36400f;
                kotlin.jvm.internal.m.c(aVar3);
                layoutParams2.setMargins(width, (((n4) aVar3).f32989d.getHeight() - imageView.getHeight()) / 2, 0, 0);
                imageView.setLayoutParams(layoutParams2);
                break;
            case 11:
                e00.g gVar = (e00.g) this.f27377b;
                h00.c cVar2 = (h00.c) this.f27378c;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                h00.j jVar2 = cVar2.f29916a;
                i00.j.n(gVar, cVar2);
                int iF = gVar.f();
                for (int i13 = 0; i13 < iF; i13++) {
                    List listH = gVar.h(i13);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : listH) {
                        if (obj instanceof v) {
                            arrayList.add(obj);
                        }
                    }
                    v vVar = (v) ry.m.Q0(arrayList);
                    if (vVar != null && (strArrNames = vVar.names()) != null) {
                        for (String str2 : strArrNames) {
                            String str3 = kotlin.jvm.internal.m.a(gVar.e(), l.f24699c) ? "enum value" : "property";
                            if (linkedHashMap.containsKey(str2)) {
                                String message = "The suggested name '" + str2 + "' for " + str3 + ' ' + gVar.g(i13) + " is already one of the names for " + str3 + ' ' + gVar.g(((Number) x.U(str2, linkedHashMap)).intValue()) + " in " + gVar;
                                kotlin.jvm.internal.m.f(message, "message");
                                throw new JsonException(message);
                            }
                            linkedHashMap.put(str2, Integer.valueOf(i13));
                        }
                    }
                }
                return linkedHashMap.isEmpty() ? s.f50855a : linkedHashMap;
            case 12:
                PdLearnSpeakAdapter pdLearnSpeakAdapter2 = (PdLearnSpeakAdapter) this.f27377b;
                ConstraintLayout constraintLayout = (ConstraintLayout) this.f27378c;
                NestedScrollView nestedScrollView = pdLearnSpeakAdapter2.f21643e;
                nestedScrollView.v(0 - nestedScrollView.getScrollX(), ((int) constraintLayout.getY()) - nestedScrollView.getScrollY(), false);
                break;
            case 13:
                BaseViewHolder baseViewHolder = (BaseViewHolder) this.f27377b;
                SpeakTryAdapter speakTryAdapter = (SpeakTryAdapter) this.f27378c;
                baseViewHolder.itemView.findViewById(R.id.fl_play_audio).performClick();
                speakTryAdapter.f22020g = false;
                break;
            case 14:
                ((fz.c) this.f27377b).invoke((CourseCharacter) this.f27378c);
                break;
            case 15:
                ((fz.c) this.f27377b).invoke((s0) this.f27378c);
                break;
            case 16:
                z0 z0Var = (z0) this.f27377b;
                fz.c cVar3 = (fz.c) this.f27378c;
                String str4 = z0Var.f38841d;
                if (str4 != null) {
                    cVar3.invoke(str4);
                }
                return b0.f48488a;
            case 17:
                kv.f fVar = (kv.f) this.f27377b;
                fz.c cVar4 = (fz.c) this.f27378c;
                String str5 = fVar.f38735b;
                if (str5 != null && cVar4 != null) {
                    cVar4.invoke(str5);
                }
                return b0.f48488a;
            case 18:
                j9.i iVar = (j9.i) this.f27377b;
                j9.e eVar3 = (j9.e) this.f27378c;
                synchronized (iVar.f36202a) {
                    try {
                        i1 i1Var = iVar.f36203b;
                        Iterable iterable = (Iterable) i1Var.getValue();
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj2 : iterable) {
                            if (kotlin.jvm.internal.m.a((j9.e) obj2, eVar3)) {
                                i1Var.getClass();
                                i1Var.l(null, arrayList2);
                            } else {
                                arrayList2.add(obj2);
                            }
                            break;
                        }
                        i1Var.getClass();
                        i1Var.l(null, arrayList2);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                break;
            case 19:
                ml.a aVar4 = (ml.a) this.f27377b;
                String str6 = (String) this.f27378c;
                int i14 = HINDISyllableIntroductionActivity.K;
                aVar4.a(oz.x.q0(oz.x.q0(str6, "[", BuildConfig.VERSION_NAME), "]", BuildConfig.VERSION_NAME));
                break;
            case 20:
                FrameLayout frameLayout = (FrameLayout) this.f27377b;
                jp.i iVar2 = (jp.i) this.f27378c;
                ViewGroup.LayoutParams layoutParams3 = frameLayout.getLayoutParams();
                ta.a aVar5 = iVar2.f47886f;
                kotlin.jvm.internal.m.c(aVar5);
                layoutParams3.height = (int) ((((hj.a) aVar5).f32324g.getHeight() * 3.0f) / 4.0f);
                frameLayout.setLayoutParams(frameLayout.getLayoutParams());
                break;
            case 21:
                kr.b0 b0Var = (kr.b0) this.f27377b;
                ((b1) this.f27378c).setValue(Boolean.FALSE);
                b0Var.a(kr.c.f38432a);
                break;
            case 22:
                r0 r0Var = (r0) this.f27377b;
                b1 b1Var = (b1) this.f27378c;
                if (r0Var.f38568e) {
                    b1Var.setValue(Boolean.valueOf(!((Boolean) b1Var.getValue()).booleanValue()));
                }
                return b0.f48488a;
            case 23:
                e0.B((rz.b0) this.f27377b, null, null, new c0((jt.v) this.f27378c, null), 3);
                break;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                e0.B((rz.b0) this.f27377b, null, null, new d1((x0) this.f27378c, null), 3);
                break;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                ((o) this.f27377b).e((j9.e) this.f27378c, false);
                break;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                u uVar = (u) this.f27377b;
                b3 b3Var2 = (b3) this.f27378c;
                uVar.requireActivity().finish();
                if (!((Boolean) b3Var2.getValue()).booleanValue()) {
                    int[] iArr3 = r.f4959a;
                    Context contextRequireContext = uVar.requireContext();
                    kotlin.jvm.internal.m.e(contextRequireContext, "requireContext(...)");
                    m.C(contextRequireContext, "syllable_lesson_finish");
                }
                return b0.f48488a;
            case 27:
                ((fz.c) this.f27377b).invoke(Long.valueOf(((a2) this.f27378c).f38158d));
                break;
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                l1 l1Var = (l1) this.f27377b;
                e0.B(ViewModelKt.getViewModelScope(l1Var), null, null, new j1(l1Var, (a1) this.f27378c, dVar, i11), 3);
                break;
            default:
                xq.c cVar5 = (xq.c) this.f27377b;
                y1 y1Var = (y1) this.f27378c;
                if (((t1.a) cVar5.f56174b).get() == 0) {
                    y1Var.invoke();
                }
                return b0.f48488a;
        }
        return b0.f48488a;
    }

    public /* synthetic */ f(j9.i iVar, j9.e eVar, boolean z11) {
        this.f27376a = 18;
        this.f27377b = iVar;
        this.f27378c = eVar;
    }

    public /* synthetic */ f(y yVar, fz.e eVar) {
        this.f27376a = 2;
        this.f27378c = yVar;
        this.f27377b = eVar;
    }
}
