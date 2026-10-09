package com.google.accompanist.permissions;

import ad.a0;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.media3.exoplayer.ExoPlayer;
import av.f0;
import bq.r;
import com.google.api.Service;
import com.google.type.bACG.scNRoQgKSYX;
import com.lingo.fluent.ui.base.PdLearnActivity;
import com.lingo.fluent.ui.base.PdLearnIndexActivity;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.LanguageItem;
import com.lingo.lingoskill.object.PdLesson;
import com.lingo.lingoskill.object.PdSentence;
import com.lingo.me.MeSettingsActivity;
import com.lingo.switchlanguage.ui.SwitchLanguageActivity;
import com.lingodeer.data.model.INTENTS;
import com.lingodeer.data.model.LessonState;
import com.lingodeer.data.model.chinesetone.ChineseToneLesson;
import com.yalantis.ucrop.view.CropImageView;
import dt.h5;
import dt.p4;
import f0.g2;
import f0.h1;
import f0.i2;
import f0.p;
import f0.p0;
import f0.r0;
import f0.v2;
import f2.b;
import fz.c;
import g.j;
import g2.k;
import g2.l0;
import g2.t;
import gm.e;
import gq.c0;
import gq.d0;
import gq.v;
import gq.w;
import h0.h;
import h0.i;
import h1.p8;
import hh.u0;
import hj.j4;
import hj.l4;
import ht.o;
import i1.u;
import j0.m1;
import j0.o1;
import j0.o2;
import j0.q1;
import j0.x0;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.m;
import l1.b1;
import l1.g1;
import l1.i0;
import l1.j0;
import mv.n;
import ob.s;
import qy.b0;
import qy.q;
import rt.m9;
import rt.zb;
import rz.e0;
import v0.g;
import vy.d;
import w2.f1;
import w2.x;
import y2.k0;
import z4.s0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7796b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7797c;

    public /* synthetic */ a(int i11, Object obj, Object obj2) {
        this.f7795a = i11;
        this.f7796b = obj;
        this.f7797c = obj2;
    }

    public /* synthetic */ a(c cVar, Context context) {
        this.f7795a = 11;
        this.f7797c = cVar;
        this.f7796b = context;
    }

    @Override // fz.c
    public final Object invoke(Object obj) throws IllegalAccessException, InvocationTargetException {
        int i11 = 0;
        int i12 = 2;
        d dVar = null;
        int i13 = 3;
        switch (this.f7795a) {
            case 0:
                MutablePermissionState mutablePermissionState = (MutablePermissionState) this.f7796b;
                c cVar = (c) this.f7797c;
                Boolean bool = (Boolean) obj;
                bool.getClass();
                PermissionStatus permissionStatusB = mutablePermissionState.b();
                m.f(permissionStatusB, "<set-?>");
                mutablePermissionState.f7787c.setValue(permissionStatusB);
                cVar.invoke(bool);
                return b0.f48488a;
            case 1:
                final MutablePermissionState mutablePermissionState2 = (MutablePermissionState) this.f7796b;
                j jVar = (j) this.f7797c;
                j0 DisposableEffect = (j0) obj;
                m.f(DisposableEffect, "$this$DisposableEffect");
                mutablePermissionState2.f7788d = jVar;
                return new i0() { // from class: com.google.accompanist.permissions.MutablePermissionStateKt$rememberMutablePermissionState$lambda$7$lambda$6$$inlined$onDispose$1
                    @Override // l1.i0
                    public final void dispose() {
                        mutablePermissionState2.f7788d = null;
                    }
                };
            case 2:
                final Lifecycle lifecycle = (Lifecycle) this.f7796b;
                final LifecycleEventObserver lifecycleEventObserver = (LifecycleEventObserver) this.f7797c;
                j0 DisposableEffect2 = (j0) obj;
                m.f(DisposableEffect2, "$this$DisposableEffect");
                lifecycle.addObserver(lifecycleEventObserver);
                return new i0() { // from class: com.google.accompanist.permissions.PermissionsUtilKt$PermissionLifecycleCheckerEffect$lambda$4$lambda$3$$inlined$onDispose$1
                    @Override // l1.i0
                    public final void dispose() {
                        lifecycle.removeObserver(lifecycleEventObserver);
                    }
                };
            case 3:
                MeSettingsActivity meSettingsActivity = (MeSettingsActivity) this.f7796b;
                Context context = (Context) this.f7797c;
                LanguageItem languageItem = (LanguageItem) obj;
                int i14 = MeSettingsActivity.f22221t;
                m.f(languageItem, "languageItem");
                m.f(context, "context");
                Intent intent = new Intent(context, (Class<?>) SwitchLanguageActivity.class);
                intent.putExtra(INTENTS.EXTRA_OBJECT, languageItem);
                intent.putExtra(INTENTS.EXTRA_BOOLEAN, true);
                intent.putExtra(INTENTS.EXTRA_STRING, "learn_topbar_ldicon");
                meSettingsActivity.startActivity(intent);
                return b0.f48488a;
            case 4:
                MeSettingsActivity meSettingsActivity2 = (MeSettingsActivity) this.f7796b;
                b1 b1Var = (b1) this.f7797c;
                String reportInfo = (String) obj;
                int i15 = MeSettingsActivity.f22221t;
                m.f(reportInfo, "reportInfo");
                int[] iArr = r.f4959a;
                bq.m.a(meSettingsActivity2, reportInfo);
                b1Var.setValue(Boolean.TRUE);
                return b0.f48488a;
            case 5:
                k kVar = (k) this.f7796b;
                t tVar = (t) this.f7797c;
                k0 k0Var = (k0) obj;
                k0Var.a();
                i2.d.g(k0Var, kVar, tVar, CropImageView.DEFAULT_ASPECT_RATIO, null, 60);
                return b0.f48488a;
            case 6:
                l0 l0Var = (l0) this.f7796b;
                t tVar2 = (t) this.f7797c;
                k0 k0Var2 = (k0) obj;
                k0Var2.a();
                i2.d.g(k0Var2, l0Var.f28581f, tVar2, CropImageView.DEFAULT_ASPECT_RATIO, null, 60);
                return b0.f48488a;
            case 7:
                ((i) this.f7796b).b((h) this.f7797c);
                return b0.f48488a;
            case 8:
                fz.a aVar = (fz.a) this.f7796b;
                fz.a aVar2 = (fz.a) this.f7797c;
                g gVar = (g) obj;
                aVar.invoke();
                if (aVar2 != null ? ((Boolean) aVar2.invoke()).booleanValue() : true) {
                    gVar.close();
                }
                return b0.f48488a;
            case 9:
                LifecycleOwner lifecycleOwner = (LifecycleOwner) this.f7796b;
                ExoPlayer exoPlayer = (ExoPlayer) this.f7797c;
                j0 DisposableEffect3 = (j0) obj;
                m.f(DisposableEffect3, "$this$DisposableEffect");
                p4 p4Var = new p4(exoPlayer, i11);
                lifecycleOwner.getLifecycle().addObserver(p4Var);
                return new b0.l0(5, lifecycleOwner, p4Var);
            case 10:
                ExoPlayer exoPlayer2 = (ExoPlayer) this.f7796b;
                h5 h5Var = (h5) this.f7797c;
                j0 DisposableEffect4 = (j0) obj;
                m.f(DisposableEffect4, "$this$DisposableEffect");
                return new b0.l0(6, exoPlayer2, h5Var);
            case 11:
                c cVar2 = (c) this.f7797c;
                Context context2 = (Context) this.f7796b;
                ChineseToneLesson it = (ChineseToneLesson) obj;
                m.f(it, "it");
                if (it.getState() != LessonState.StateLocked) {
                    cVar2.invoke(it);
                } else {
                    Toast.makeText(context2, com.lingodeer.R.string.chinese_tone_lesson_locked_toast, 0).show();
                }
                return b0.f48488a;
            case 12:
                ((f0.a) this.f7796b).f26179a.k((f0.g) this.f7797c);
                return b0.f48488a;
            case 13:
                f0.j jVar2 = (f0.j) this.f7796b;
                r0 r0Var = (r0) this.f7797c;
                long jI = b.i(((p) obj).f26393a, r0Var.f26423g0 ? -1.0f : 1.0f);
                h1 h1Var = r0Var.f26419c0;
                a0 a0Var = p0.f26394a;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (h1Var == h1.Vertical ? jI & 4294967295L : jI >> 32));
                switch (jVar2.f26317a) {
                    case 0:
                        ((f0.k) jVar2.f26318b).f26330a.invoke(Float.valueOf(fIntBitsToFloat));
                        break;
                    case 1:
                        ((p8) jVar2.f26318b).b(fIntBitsToFloat);
                        break;
                    default:
                        s sVar = (s) jVar2.f26318b;
                        u uVar = (u) sVar.f44887n;
                        float fQ = sVar.q(fIntBitsToFloat);
                        s sVar2 = uVar.f34079a;
                        ((g1) sVar2.f44884j).m(fQ);
                        ((g1) sVar2.f44885k).m(CropImageView.DEFAULT_ASPECT_RATIO);
                        break;
                }
                return b0.f48488a;
            case 14:
                g2 g2Var = (g2) this.f7796b;
                i2 i2Var = (i2) this.f7797c;
                long j11 = ((p) obj).f26393a;
                g2Var.a(1, i2Var.f26308d == h1.Horizontal ? b.a(CropImageView.DEFAULT_ASPECT_RATIO, 1, j11) : b.a(CropImageView.DEFAULT_ASPECT_RATIO, 2, j11));
                return b0.f48488a;
            case 15:
                v2 v2Var = (v2) this.f7796b;
                c cVar3 = (c) this.f7797c;
                ((Long) obj).longValue();
                float f5 = v2Var.f26475e;
                v2Var.f26475e = CropImageView.DEFAULT_ASPECT_RATIO;
                cVar3.invoke(Float.valueOf(f5));
                return b0.f48488a;
            case 16:
                fn.g gVar2 = (fn.g) this.f7796b;
                TextView textView = (TextView) this.f7797c;
                m.f((View) obj, "it");
                a9.i iVar = gVar2.O;
                m.c(iVar);
                q qVar = fv.b.f28186a;
                if (wm.a.f55177e == null) {
                    synchronized (wm.a.class) {
                        if (wm.a.f55177e == null) {
                            LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                            m.c(lingoSkillApplication);
                            wm.a.f55177e = new wm.a(lingoSkillApplication);
                        }
                        break;
                    }
                }
                m.c(wm.a.f55177e);
                String strA = wm.a.a(textView.getText().toString());
                m.c(strA);
                iVar.v(fv.b.c(strA, null, null));
                return b0.f48488a;
            case 17:
                hu.b bVar = (hu.b) this.f7796b;
                b1 b1Var2 = (b1) this.f7797c;
                x it2 = (x) obj;
                m.f(it2, "it");
                if (bVar.f33777f) {
                    long jC = it2.c((((long) Float.floatToRawIntBits(CropImageView.DEFAULT_ASPECT_RATIO)) << 32) | (((long) Float.floatToRawIntBits(CropImageView.DEFAULT_ASPECT_RATIO)) & 4294967295L));
                    b1Var2.setValue(new v3.j((((long) ((((int) (it2.m() >> 32)) / 2) + ((int) Float.intBitsToFloat((int) (jC >> 32))))) << 32) | (4294967295L & ((long) ((int) Float.intBitsToFloat((int) (jC & 4294967295L)))))));
                }
                return b0.f48488a;
            case 18:
                gm.g gVar3 = (gm.g) this.f7796b;
                String str = (String) this.f7797c;
                m.f((View) obj, "it");
                jp.p0 p0Var = (jp.p0) gVar3.f47881a;
                p0Var.getClass();
                e0.B(LifecycleOwnerKt.getLifecycleScope(p0Var), null, null, new e(gVar3, str, dVar, i11), 3);
                return b0.f48488a;
            case 19:
                gq.u uVar2 = (gq.u) this.f7796b;
                w wVar = (w) this.f7797c;
                if (((Throwable) obj) != null) {
                    uVar2.d(wVar, new v(Long.valueOf(wVar.f29648a), wVar.f29649b, c0.FAILED, ry.r.f50854a));
                }
                gq.k kVar2 = uVar2.f29637e;
                synchronized (kVar2.f29597a) {
                    d0 d0Var = kVar2.f29599c;
                    if (d0Var != null && d0Var.f29580a == wVar) {
                        gq.e0 e0Var = d0Var.f29581b;
                        gq.e0 e0Var2 = gq.e0.STOPPED;
                        if (e0Var != e0Var2) {
                            kVar2.f29599c = d0.a(d0Var, e0Var2);
                        }
                        break;
                    }
                }
                rz.t tVar3 = wVar.f29651d;
                b0 b0Var = b0.f48488a;
                tVar3.J(b0Var);
                e0.B(uVar2.f29643k, null, null, new f0(27, uVar2, wVar, dVar), 3);
                return b0Var;
            case 20:
                kotlin.jvm.internal.u uVar3 = (kotlin.jvm.internal.u) this.f7796b;
                hh.j0 j0Var = (hh.j0) this.f7797c;
                m.f((View) obj, "it");
                if (!uVar3.f38357a) {
                    ta.a aVar3 = j0Var.f36400f;
                    m.c(aVar3);
                    int childCount = ((j4) aVar3).f32774k.getChildCount();
                    PdLesson pdLesson = j0Var.O;
                    if (pdLesson == null) {
                        m.n("pdLesson");
                        throw null;
                    }
                    if (childCount < pdLesson.getSentences().size()) {
                        PdLesson pdLesson2 = j0Var.O;
                        if (pdLesson2 == null) {
                            m.n("pdLesson");
                            throw null;
                        }
                        List<PdSentence> sentences = pdLesson2.getSentences();
                        ta.a aVar4 = j0Var.f36400f;
                        m.c(aVar4);
                        PdSentence pdSentence = sentences.get(((j4) aVar4).f32774k.getChildCount());
                        m.e(pdSentence, "get(...)");
                        j0Var.x(pdSentence);
                        j0Var.A();
                    }
                }
                th.j.a(qx.h.m(100L, TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new ob.c(13, j0Var, uVar3), vx.b.f54316e), j0Var.f36401t);
                return b0.f48488a;
            case 21:
                hh.j0 j0Var2 = (hh.j0) this.f7796b;
                String str2 = (String) this.f7797c;
                m.f((View) obj, "it");
                j0Var2.U.h(str2);
                return b0.f48488a;
            case 22:
                PdLearnIndexActivity pdLearnIndexActivity = (PdLearnIndexActivity) this.f7796b;
                b1 b1Var3 = (b1) this.f7797c;
                int iIntValue = ((Integer) obj).intValue();
                int i16 = PdLearnIndexActivity.L;
                PdLesson pdLesson3 = (PdLesson) b1Var3.getValue();
                m.c(pdLesson3);
                String str3 = scNRoQgKSYX.BkEME;
                i.c cVar4 = pdLearnIndexActivity.K;
                if (iIntValue == 0) {
                    pdLearnIndexActivity.m().c("jxz_fl_speak_start", new m9(26));
                    Intent intent2 = new Intent(pdLearnIndexActivity, (Class<?>) PdLearnActivity.class);
                    intent2.putExtra(INTENTS.EXTRA_OBJECT, pdLesson3);
                    intent2.putExtra(str3, 0L);
                    cVar4.a(intent2);
                } else if (iIntValue == 1) {
                    pdLearnIndexActivity.m().c("jxz_fl_listen_start", new m9(26));
                    Intent intent3 = new Intent(pdLearnIndexActivity, (Class<?>) PdLearnActivity.class);
                    intent3.putExtra(INTENTS.EXTRA_OBJECT, pdLesson3);
                    intent3.putExtra(str3, 1L);
                    cVar4.a(intent3);
                } else if (iIntValue == 3) {
                    pdLearnIndexActivity.m().c("jxz_fl_write_start", new m9(26));
                    Intent intent4 = new Intent(pdLearnIndexActivity, (Class<?>) PdLearnActivity.class);
                    intent4.putExtra(INTENTS.EXTRA_OBJECT, pdLesson3);
                    intent4.putExtra(str3, 3L);
                    cVar4.a(intent4);
                } else if (iIntValue == 4) {
                    pdLearnIndexActivity.m().c("jxz_fl_keypoint_click", new m9(26));
                    Intent intent5 = new Intent(pdLearnIndexActivity, (Class<?>) PdLearnActivity.class);
                    intent5.putExtra(INTENTS.EXTRA_OBJECT, pdLesson3);
                    intent5.putExtra(str3, 4L);
                    cVar4.a(intent5);
                }
                return b0.f48488a;
            case 23:
                u0 u0Var = (u0) this.f7796b;
                List list = (List) this.f7797c;
                m.f((View) obj, "it");
                ta.a aVar5 = u0Var.f36400f;
                m.c(aVar5);
                int currentItem = ((l4) aVar5).f32862g.getCurrentItem() + 1;
                if (currentItem < list.size()) {
                    ta.a aVar6 = u0Var.f36400f;
                    m.c(aVar6);
                    ((l4) aVar6).f32862g.setCurrentItem(currentItem, true);
                }
                return b0.f48488a;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                LifecycleOwner lifecycleOwner2 = (LifecycleOwner) this.f7796b;
                n nVar = (n) this.f7797c;
                j0 DisposableEffect5 = (j0) obj;
                m.f(DisposableEffect5, "$this$DisposableEffect");
                p4 p4Var2 = new p4(nVar, i13);
                lifecycleOwner2.getLifecycle().addObserver(p4Var2);
                return new a0.i(lifecycleOwner2, p4Var2, nVar, i12);
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                mv.k0 k0Var3 = (mv.k0) this.f7796b;
                b1 b1Var4 = (b1) this.f7797c;
                o courseTestParams = (o) obj;
                m.f(courseTestParams, "courseTestParams");
                if (courseTestParams.f33768q) {
                    b1Var4.setValue(Boolean.TRUE);
                } else {
                    k0Var3.t(zb.f50802a);
                }
                return b0.f48488a;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                m1 m1Var = (m1) this.f7796b;
                w2.g1 g1Var = (w2.g1) this.f7797c;
                f1 f1Var = (f1) obj;
                if (m1Var.S) {
                    f1.k(f1Var, g1Var, f1Var.n0(m1Var.Q), f1Var.n0(m1Var.R));
                } else {
                    f1Var.f(g1Var, f1Var.n0(m1Var.Q), f1Var.n0(m1Var.R), CropImageView.DEFAULT_ASPECT_RATIO);
                }
                return b0.f48488a;
            case 27:
                o1 o1Var = (o1) this.f7796b;
                w2.g1 g1Var2 = (w2.g1) this.f7797c;
                f1 f1Var2 = (f1) obj;
                long j12 = ((v3.j) o1Var.Q.invoke(f1Var2)).f53492a;
                if (o1Var.R) {
                    f1.l(f1Var2, g1Var2, (int) (j12 >> 32), (int) (j12 & 4294967295L), null, 12);
                } else {
                    f1.p(f1Var2, g1Var2, (int) (j12 >> 32), (int) (j12 & 4294967295L), null, 12);
                }
                return b0.f48488a;
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                q1 q1Var = (q1) this.f7796b;
                w2.g1 g1Var3 = (w2.g1) this.f7797c;
                f1 f1Var3 = (f1) obj;
                if (q1Var.U) {
                    f1.k(f1Var3, g1Var3, f1Var3.n0(q1Var.Q), f1Var3.n0(q1Var.R));
                } else {
                    f1Var3.f(g1Var3, f1Var3.n0(q1Var.Q), f1Var3.n0(q1Var.R), CropImageView.DEFAULT_ASPECT_RATIO);
                }
                return b0.f48488a;
            default:
                o2 o2Var = (o2) this.f7796b;
                View view = (View) this.f7797c;
                x0 x0Var = o2Var.f35373u;
                if (o2Var.f35372t == 0) {
                    WeakHashMap weakHashMap = s0.f58893a;
                    z4.j0.m(view, x0Var);
                    if (view.isAttachedToWindow()) {
                        view.requestApplyInsets();
                    }
                    view.addOnAttachStateChangeListener(x0Var);
                    s0.s(view, x0Var);
                }
                o2Var.f35372t++;
                return new b0.l0(9, o2Var, view);
        }
    }
}
