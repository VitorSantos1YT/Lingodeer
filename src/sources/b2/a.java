package b2;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.os.Trace;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.material.ripple.RippleHostView;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.ui.DefaultTimeBar;
import androidx.media3.ui.PlayerControlView;
import androidx.media3.ui.PlayerView;
import b0.h2;
import b7.f0;
import b7.t;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.android.material.motion.MaterialBackOrchestrator;
import com.google.api.Service;
import com.google.common.base.Ascii;
import com.google.firebase.appcheck.internal.DefaultFirebaseAppCheck;
import com.google.firebase.appcheck.internal.DefaultTokenRefresher;
import com.lingo.fluent.ui.base.adapter.PdLearnSpeakAdapter;
import f.o;
import f7.a0;
import f7.b1;
import f7.g0;
import hh.o0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import jp.a1;
import jp.h1;
import jp.y0;
import kotlin.jvm.internal.m;
import lf.z;
import qy.b0;
import rz.g1;
import t7.s;
import y.x;
import y6.j0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3852b;

    public /* synthetic */ a(g0 g0Var, b1 b1Var) {
        this.f3851a = 15;
        this.f3852b = b1Var;
    }

    /* JADX WARN: Code duplicated, block: B:154:0x0306 A[Catch: all -> 0x02ce, TryCatch #7 {, blocks: (B:127:0x02c3, B:129:0x02c7, B:136:0x02d3, B:140:0x02da, B:145:0x02e3, B:147:0x02e7, B:149:0x02ed, B:151:0x02f7, B:153:0x0301, B:155:0x0312, B:154:0x0306, B:156:0x0314, B:158:0x0327, B:160:0x032f), top: B:211:0x02c3 }] */
    /* JADX WARN: Code duplicated, block: B:184:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:187:0x03cd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:188:0x03cf A[Catch: all -> 0x03f9, LOOP:1: B:175:0x0375->B:188:0x03cf, LOOP_END, TryCatch #2 {all -> 0x03f9, blocks: (B:172:0x0366, B:175:0x0375, B:177:0x0385, B:179:0x038f, B:181:0x0398, B:183:0x03a7, B:185:0x03c5, B:188:0x03cf, B:189:0x03d3, B:191:0x03e5, B:197:0x03fc, B:198:0x03ff, B:190:0x03d8), top: B:205:0x0366, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:226:0x03d3 A[SYNTHETIC] */
    @Override // java.lang.Runnable
    public final void run() {
        String strD;
        TelephonyManager telephonyManager;
        boolean z11 = true;
        int i11 = 0;
        switch (this.f3851a) {
            case 0:
                i iVar = (i) this.f3852b;
                boolean zE = iVar.e();
                AndroidComposeView androidComposeView = iVar.f3865a;
                if (zE) {
                    Trace.beginSection("ContentCapture:changeChecker");
                    try {
                        androidComposeView.s(true);
                        x xVar = iVar.N;
                        int[] iArr = xVar.f56737b;
                        long[] jArr = xVar.f56736a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i12 = 0;
                            while (true) {
                                long j11 = jArr[i12];
                                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i13 = 8 - ((~(i12 - length)) >>> 31);
                                    for (int i14 = i11; i14 < i13; i14++) {
                                        if ((255 & j11) < 128) {
                                            int i15 = iArr[(i12 << 3) + i14];
                                            if (!iVar.d().a(i15)) {
                                                iVar.f3868d.add(new j(i15, iVar.M, k.VIEW_DISAPPEAR, null));
                                                iVar.H.i(b0.f48488a);
                                            }
                                        }
                                        j11 >>= 8;
                                    }
                                    if (i13 == 8) {
                                        if (i12 != length) {
                                            i12++;
                                            i11 = 0;
                                        }
                                    }
                                } else if (i12 != length) {
                                    i12++;
                                    i11 = 0;
                                }
                            }
                        }
                        Trace.beginSection("ContentCapture:sendAppearEvents");
                        try {
                            iVar.g(androidComposeView.getSemanticsOwner().a(), iVar.O);
                            Trace.endSection();
                            iVar.b(iVar.d());
                            iVar.k();
                            iVar.P = false;
                            return;
                        } finally {
                            Trace.endSection();
                        }
                    } catch (Throwable th2) {
                        Trace.endSection();
                        throw th2;
                    }
                }
                return;
            case 1:
                t tVar = (t) this.f3852b;
                t7.h hVar = (t7.h) tVar.f4022a.get();
                if (hVar != null) {
                    int iB = tVar.f4024c.b();
                    t7.i iVar2 = hVar.f52066a;
                    synchronized (iVar2) {
                        int i16 = iVar2.f52086n;
                        if (i16 == 0 || iVar2.f52078e) {
                            if (i16 != iB || iVar2.f52087o == null) {
                                iVar2.f52086n = iB;
                                if (iB != 1 && iB != 0 && iB != 8) {
                                    if (iVar2.f52087o == null) {
                                        Context context = iVar2.f52074a;
                                        String str = f0.f3975a;
                                        if (context == null || (telephonyManager = (TelephonyManager) context.getSystemService("phone")) == null) {
                                            strD = Ascii.d(Locale.getDefault().getCountry());
                                        } else {
                                            String networkCountryIso = telephonyManager.getNetworkCountryIso();
                                            if (TextUtils.isEmpty(networkCountryIso)) {
                                                strD = Ascii.d(Locale.getDefault().getCountry());
                                            } else {
                                                strD = Ascii.d(networkCountryIso);
                                            }
                                        }
                                        iVar2.f52087o = strD;
                                    }
                                    iVar2.f52085l = iVar2.a(iB);
                                    iVar2.f52077d.getClass();
                                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                                    iVar2.b(iVar2.f52082i, iVar2.f52080g > 0 ? (int) (jElapsedRealtime - iVar2.f52081h) : 0, iVar2.f52085l);
                                    iVar2.f52081h = jElapsedRealtime;
                                    iVar2.f52082i = 0L;
                                    iVar2.f52084k = 0L;
                                    iVar2.f52083j = 0L;
                                    s sVar = iVar2.f52079f;
                                    sVar.f52111a.clear();
                                    sVar.f52113c = -1;
                                    sVar.f52114d = 0;
                                    sVar.f52115e = 0;
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
                return;
            case 2:
                ((b7.c) this.f3852b).h();
                return;
            case 3:
                View view = ((androidx.core.view.insets.a) this.f3852b).f1415a;
                ViewParent parent = view.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(view);
                    return;
                }
                return;
            case 4:
                WorkInitializer workInitializer = (WorkInitializer) this.f3852b;
                workInitializer.f8153d.b(new app.rive.runtime.kotlin.core.a(workInitializer, 20));
                return;
            case 5:
                MaterialButton.a((MaterialButton) this.f3852b);
                return;
            case 6:
                ((CarouselLayoutManager) this.f3852b).G();
                return;
            case 7:
                ((MaterialBackOrchestrator) this.f3852b).a(true);
                return;
            case 8:
                DefaultTokenRefresher defaultTokenRefresher = (DefaultTokenRefresher) this.f3852b;
                DefaultFirebaseAppCheck defaultFirebaseAppCheck = defaultTokenRefresher.f17820a;
                defaultFirebaseAppCheck.m.a().onSuccessTask(defaultFirebaseAppCheck.f17812g, new app.rive.runtime.kotlin.core.a(defaultFirebaseAppCheck, 23)).addOnFailureListener(defaultTokenRefresher.f17821b, new app.rive.runtime.kotlin.core.a(defaultTokenRefresher, 24));
                return;
            case 9:
                j0 j0Var = (ExoPlayer) this.f3852b;
                try {
                    if (j0Var.u() == 4) {
                        ((h2) j0Var).l0(5, j0Var.getDuration());
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 10:
                f.k kVar = (f.k) this.f3852b;
                Runnable runnable = kVar.f26157b;
                if (runnable != null) {
                    runnable.run();
                    kVar.f26157b = null;
                    return;
                }
                return;
            case 11:
                o.a((o) this.f3852b);
                return;
            case 12:
                bq.f fVar = (bq.f) this.f3852b;
                ((Context) fVar.f4944b).unregisterReceiver((f7.a) fVar.f4945c);
                return;
            case 13:
                f7.a aVar = (f7.a) this.f3852b;
                if (aVar.f26631c.f4943a) {
                    aVar.f26629a.f26935a.N0(3, false);
                    return;
                }
                return;
            case 14:
                a0 a0Var = (a0) this.f3852b;
                b7.c cVar = a0Var.f26644i0;
                Context context2 = a0Var.f26640f;
                String str2 = f0.f3975a;
                Integer numValueOf = Integer.valueOf(z6.c.f(context2).generateAudioSessionId());
                cVar.f3963f = numValueOf;
                b7.b bVar = new b7.b(cVar, numValueOf, i11);
                b7.a0 a0Var2 = (b7.a0) cVar.f3960c;
                if (a0Var2.f3950a.getLooper().getThread().isAlive()) {
                    a0Var2.c(bVar);
                    return;
                }
                return;
            case 15:
                b1 b1Var = (b1) this.f3852b;
                try {
                    synchronized (b1Var) {
                    }
                    try {
                        b1Var.f26666a.f(b1Var.f26668c, b1Var.f26669d);
                        return;
                    } finally {
                        b1Var.a(true);
                    }
                } catch (ExoPlaybackException e8) {
                    b7.a.p("Unexpected error delivering message on external thread.", e8);
                    throw new RuntimeException(e8);
                }
            case 16:
                g1 g1Var = (g1) this.f3852b;
                if (g1Var != null) {
                    g1Var.cancel(null);
                    return;
                }
                return;
            case 17:
                RippleHostView.setRippleState$lambda$2((RippleHostView) this.f3852b);
                return;
            case 18:
                g7.f fVar2 = (g7.f) this.f3852b;
                fVar2.N(fVar2.I(), 1028, new g7.c(0));
                fVar2.f28809f.d();
                return;
            case 19:
                h7.x xVar2 = (h7.x) this.f3852b;
                if (xVar2.f31982j0 >= 300000) {
                    ((h7.a0) xVar2.f31993s.f27b).f31816r1 = true;
                    xVar2.f31982j0 = 0L;
                    return;
                }
                return;
            case 20:
                DefaultTimeBar defaultTimeBar = (DefaultTimeBar) this.f3852b;
                int i17 = DefaultTimeBar.f2163u0;
                defaultTimeBar.d(false);
                return;
            case 21:
                PlayerControlView playerControlView = (PlayerControlView) this.f3852b;
                float[] fArr = PlayerControlView.f2224i1;
                playerControlView.s();
                return;
            case 22:
                ((PlayerView) this.f3852b).invalidate();
                return;
            case 23:
                o0 o0Var = (o0) this.f3852b;
                PdLearnSpeakAdapter pdLearnSpeakAdapter = o0Var.O;
                if (pdLearnSpeakAdapter != null) {
                    pdLearnSpeakAdapter.e();
                }
                PdLearnSpeakAdapter pdLearnSpeakAdapter2 = o0Var.O;
                o0Var.S = pdLearnSpeakAdapter2 != null && pdLearnSpeakAdapter2.g();
                return;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                jf.e eVar = (jf.e) this.f3852b;
                if (qf.a.b(jf.e.class)) {
                    return;
                }
                try {
                    WeakReference weakReference = eVar.f36326a;
                    View viewS = ef.e.s((Activity) weakReference.get());
                    Activity activity = (Activity) weakReference.get();
                    if (viewS != null && activity != null) {
                        ArrayList arrayListA = jf.c.a(viewS);
                        int size = arrayListA.size();
                        while (i11 < size) {
                            Object obj = arrayListA.get(i11);
                            i11++;
                            View view2 = (View) obj;
                            if (!we.g.b(view2)) {
                                String strD2 = jf.c.d(view2);
                                if (strD2.length() > 0 && strD2.length() <= 300) {
                                    HashSet hashSet = jf.f.f36329e;
                                    String localClassName = activity.getLocalClassName();
                                    m.e(localClassName, "activity.localClassName");
                                    jf.a.b(view2, viewS, localClassName);
                                }
                            }
                        }
                        return;
                    }
                    return;
                } catch (Exception unused2) {
                    return;
                } catch (Throwable th3) {
                    qf.a.a(jf.e.class, th3);
                    return;
                }
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                y0 y0Var = (y0) this.f3852b;
                if (y0Var.getView() == null) {
                    return;
                }
                Object parent2 = y0Var.requireView().getParent();
                m.d(parent2, "null cannot be cast to non-null type android.view.View");
                ViewGroup.LayoutParams layoutParams = ((View) parent2).getLayoutParams();
                m.d(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
                l4.b bVar2 = ((l4.e) layoutParams).f39716a;
                m.d(bVar2, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetBehavior<@[FlexibleNullability] android.view.View?>");
                ((BottomSheetBehavior) bVar2).e(3);
                return;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                a1 a1Var = (a1) this.f3852b;
                if (a1Var.getView() == null) {
                    return;
                }
                Object parent3 = a1Var.requireView().getParent();
                m.d(parent3, "null cannot be cast to non-null type android.view.View");
                ViewGroup.LayoutParams layoutParams2 = ((View) parent3).getLayoutParams();
                m.d(layoutParams2, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
                l4.b bVar3 = ((l4.e) layoutParams2).f39716a;
                m.d(bVar3, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetBehavior<@[FlexibleNullability] android.view.View?>");
                ((BottomSheetBehavior) bVar3).e(3);
                return;
            case 27:
                h1 h1Var = (h1) this.f3852b;
                if (h1Var.getView() == null) {
                    return;
                }
                Object parent4 = h1Var.requireView().getParent();
                m.d(parent4, "null cannot be cast to non-null type android.view.View");
                ViewGroup.LayoutParams layoutParams3 = ((View) parent4).getLayoutParams();
                m.d(layoutParams3, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
                l4.b bVar4 = ((l4.e) layoutParams3).f39716a;
                m.d(bVar4, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetBehavior<@[FlexibleNullability] android.view.View?>");
                ((BottomSheetBehavior) bVar4).e(3);
                return;
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                lf.t.g((lf.t) this.f3852b);
                return;
            default:
                z zVar = (z) this.f3852b;
                zVar.f40137a.h(lf.a0.b(zVar.f40138b));
                return;
        }
    }

    public /* synthetic */ a(Object obj, int i11) {
        this.f3851a = i11;
        this.f3852b = obj;
    }
}
