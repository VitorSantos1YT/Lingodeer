package b2;

import a0.b2;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.util.LongSparseArray;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.media3.ui.PlayerView;
import b1.p;
import b7.a0;
import b7.f0;
import b7.s;
import b7.u;
import com.adjust.sdk.ActivityHandler;
import com.adjust.sdk.AdjustConfig;
import com.adjust.sdk.AdjustThirdPartySharing;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.api.Service;
import com.google.firebase.appcheck.internal.DefaultAppCheckTokenResult;
import com.google.firebase.database.core.TokenProvider;
import com.google.firebase.internal.InternalTokenResult;
import com.lingo.lingoskill.widget.ResponsiveScrollView;
import f.d0;
import f.n;
import f7.d1;
import f7.w;
import f7.x;
import f7.y0;
import f7.z;
import h4.h0;
import j9.r;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import lf.q1;
import p7.b0;
import p7.s0;
import vq.m;
import x7.y;
import y6.m0;
import y6.o0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3855c;

    public /* synthetic */ c(int i11, Object obj, Object obj2) {
        this.f3853a = i11;
        this.f3854b = obj;
        this.f3855c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:142:0x0305  */
    /* JADX WARN: Code duplicated, block: B:157:0x032b  */
    /* JADX WARN: Code duplicated, block: B:158:0x032d  */
    /* JADX WARN: Code duplicated, block: B:159:0x032f  */
    /* JADX WARN: Code duplicated, block: B:161:0x0336  */
    /* JADX WARN: Code duplicated, block: B:162:0x0338  */
    /* JADX WARN: Code duplicated, block: B:164:0x033e  */
    /* JADX WARN: Code duplicated, block: B:165:0x0340  */
    /* JADX WARN: Code duplicated, block: B:166:0x0342  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Lifecycle lifecycle;
        long j11;
        boolean z11;
        Lifecycle.State currentState = null;
        int i11 = 8;
        int i12 = 2;
        int i13 = 1;
        switch (this.f3853a) {
            case 0:
                d.a((i) this.f3854b, (LongSparseArray) this.f3855c);
                return;
            case 1:
                b7.c cVar = (b7.c) this.f3854b;
                Object objApply = ((w) this.f3855c).apply(cVar.f3963f);
                cVar.f3963f = objApply;
                b7.b bVar = new b7.b(cVar, objApply, i13);
                a0 a0Var = (a0) cVar.f3960c;
                if (a0Var.f3950a.getLooper().getThread().isAlive()) {
                    a0Var.c(bVar);
                    return;
                }
                return;
            case 2:
                u uVar = (u) this.f3854b;
                Context context = (Context) this.f3855c;
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                context.registerReceiver(new lf.e(uVar, i13), intentFilter);
                return;
            case 3:
                lf.e eVar = (lf.e) this.f3854b;
                Context context2 = (Context) this.f3855c;
                u uVar2 = (u) eVar.f39996b;
                ConnectivityManager connectivityManager = (ConnectivityManager) context2.getSystemService("connectivity");
                if (connectivityManager == null) {
                    i11 = 0;
                } else {
                    try {
                        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                            i11 = 1;
                        } else {
                            int type = activeNetworkInfo.getType();
                            if (type == 0) {
                                switch (activeNetworkInfo.getSubtype()) {
                                    case 1:
                                    case 2:
                                        i11 = 3;
                                        break;
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                    case 9:
                                    case 10:
                                    case 11:
                                    case 12:
                                    case 14:
                                    case 15:
                                    case 17:
                                        i11 = 4;
                                        break;
                                    case 13:
                                        i11 = 5;
                                        break;
                                    case 16:
                                    case 19:
                                    default:
                                        i11 = 6;
                                        break;
                                    case 18:
                                        i11 = 2;
                                        break;
                                    case 20:
                                        if (Build.VERSION.SDK_INT >= 29) {
                                            i11 = 9;
                                        } else {
                                            i11 = 0;
                                        }
                                        break;
                                }
                            } else if (type == 1) {
                                i11 = 2;
                            } else if (type == 4 || type == 5) {
                                switch (activeNetworkInfo.getSubtype()) {
                                    case 1:
                                    case 2:
                                        i11 = 3;
                                        break;
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                    case 9:
                                    case 10:
                                    case 11:
                                    case 12:
                                    case 14:
                                    case 15:
                                    case 17:
                                        i11 = 4;
                                        break;
                                    case 13:
                                        i11 = 5;
                                        break;
                                    case 16:
                                    case 19:
                                    default:
                                        i11 = 6;
                                        break;
                                    case 18:
                                        i11 = 2;
                                        break;
                                    case 20:
                                        if (Build.VERSION.SDK_INT >= 29) {
                                            i11 = 9;
                                        } else {
                                            i11 = 0;
                                        }
                                        break;
                                }
                            } else if (type == 6) {
                                i11 = 5;
                            } else if (type == 9) {
                                i11 = 7;
                            }
                        }
                    } catch (SecurityException unused) {
                    }
                }
                if (Build.VERSION.SDK_INT < 31 || i11 != 5) {
                    uVar2.c(i11);
                    return;
                } else {
                    s.a(context2, uVar2);
                    return;
                }
            case 4:
                View view = (View) this.f3854b;
                fz.a aVar = (fz.a) this.f3855c;
                LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(view);
                if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
                    currentState = lifecycle.getCurrentState();
                }
                if (currentState == Lifecycle.State.DESTROYED) {
                    return;
                }
                try {
                    aVar.invoke();
                    return;
                } catch (Exception e8) {
                    e8.printStackTrace();
                    return;
                }
            case 5:
                ((ActivityHandler) this.f3854b).lambda$trackThirdPartySharing$37((AdjustThirdPartySharing) this.f3855c);
                return;
            case 6:
                ((ActivityHandler) this.f3854b).lambda$new$2((AdjustConfig) this.f3855c);
                return;
            case 7:
                JobInfoSchedulerService jobInfoSchedulerService = (JobInfoSchedulerService) this.f3854b;
                JobParameters jobParameters = (JobParameters) this.f3855c;
                int i14 = JobInfoSchedulerService.f8129a;
                jobInfoSchedulerService.jobFinished(jobParameters, false);
                return;
            case 8:
                ((TokenProvider.TokenChangeListener) this.f3854b).a(((DefaultAppCheckTokenResult) this.f3855c).f17804a);
                return;
            case 9:
                ((TokenProvider.TokenChangeListener) this.f3854b).a(((InternalTokenResult) this.f3855c).f20428a);
                return;
            case 10:
                n nVar = (n) this.f3854b;
                nVar.getLifecycle().addObserver(new androidx.lifecycle.compose.g(3, (d0) this.f3855c, nVar));
                return;
            case 11:
                f7.a0 a0Var2 = (f7.a0) this.f3854b;
                e9.w wVar = (e9.w) this.f3855c;
                int i15 = a0Var2.f26647l0 - wVar.f25422b;
                a0Var2.f26647l0 = i15;
                if (wVar.f25423c) {
                    a0Var2.f26648m0 = wVar.f25424d;
                    a0Var2.f26649n0 = true;
                }
                if (i15 == 0) {
                    o0 o0Var = ((y0) wVar.f25425e).f26953a;
                    if (!a0Var2.N0.f26953a.p() && o0Var.p()) {
                        a0Var2.O0 = -1;
                        a0Var2.P0 = 0L;
                    }
                    if (!o0Var.p()) {
                        List listAsList = Arrays.asList(((d1) o0Var).f26696h);
                        b7.a.j(listAsList.size() == a0Var2.S.size());
                        for (int i16 = 0; i16 < listAsList.size(); i16++) {
                            ((z) a0Var2.S.get(i16)).f26973b = (o0) listAsList.get(i16);
                        }
                    }
                    long j12 = -9223372036854775807L;
                    if (a0Var2.f26649n0) {
                        if (((y0) wVar.f25425e).f26954b.equals(a0Var2.N0.f26954b) && ((y0) wVar.f25425e).f26956d == a0Var2.N0.f26970s) {
                            i13 = 0;
                        }
                        if (i13 != 0) {
                            if (o0Var.p() || ((y0) wVar.f25425e).f26954b.b()) {
                                j12 = ((y0) wVar.f25425e).f26956d;
                            } else {
                                y0 y0Var = (y0) wVar.f25425e;
                                b0 b0Var = y0Var.f26954b;
                                long j13 = y0Var.f26956d;
                                Object obj = b0Var.f46328a;
                                m0 m0Var = a0Var2.R;
                                o0Var.g(obj, m0Var);
                                j12 = j13 + m0Var.f57232e;
                            }
                        }
                        j11 = j12;
                        z11 = i13;
                    } else {
                        j11 = -9223372036854775807L;
                        z11 = 0;
                    }
                    a0Var2.f26649n0 = false;
                    a0Var2.O0((y0) wVar.f25425e, 1, z11, a0Var2.f26648m0, j11, -1, false);
                    return;
                }
                return;
            case 12:
                ((g7.i) this.f3854b).f28830d.reportTrackChangeEvent((TrackChangeEvent) this.f3855c);
                return;
            case 13:
                ((g7.i) this.f3854b).f28830d.reportNetworkEvent((NetworkEvent) this.f3855c);
                return;
            case 14:
                ((g7.i) this.f3854b).f28830d.reportPlaybackErrorEvent((PlaybackErrorEvent) this.f3855c);
                return;
            case 15:
                ((g7.i) this.f3854b).f28830d.reportPlaybackMetrics((PlaybackMetrics) this.f3855c);
                return;
            case 16:
                ((g7.i) this.f3854b).f28830d.reportPlaybackStateEvent((PlaybackStateEvent) this.f3855c);
                return;
            case 17:
                gb.d dVar = (gb.d) this.f3854b;
                ob.j jVar = (ob.j) this.f3855c;
                synchronized (dVar.f28927k) {
                    try {
                        ArrayList arrayList = dVar.f28926j;
                        int size = arrayList.size();
                        int i17 = 0;
                        while (i17 < size) {
                            Object obj2 = arrayList.get(i17);
                            i17++;
                            ((gb.b) obj2).e(jVar, false);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return;
            case 18:
                h0 h0Var = (h0) this.f3854b;
                View[] viewArr = (View[]) this.f3855c;
                if (h0Var.f31687p != -1) {
                    for (View view2 : viewArr) {
                        view2.setTag(h0Var.f31687p, Long.valueOf(System.nanoTime()));
                    }
                }
                if (h0Var.f31688q != -1) {
                    for (View view3 : viewArr) {
                        view3.setTag(h0Var.f31688q, null);
                    }
                    return;
                }
                return;
            case 19:
                ob.l lVar = (ob.l) this.f3854b;
                synchronized (((f7.f) this.f3855c)) {
                }
                x xVar = (x) lVar.f44823c;
                String str = f0.f3975a;
                g7.f fVar = xVar.f26935a.V;
                fVar.N(fVar.J(fVar.f28807d.f28802e), 1013, new g7.c(8));
                return;
            case 20:
                b2 b2Var = (b2) this.f3854b;
                h7.j jVar2 = (h7.j) this.f3855c;
                ob.l lVar2 = ((h7.a0) b2Var.f27b).f31806h1;
                Handler handler = (Handler) lVar2.f44822b;
                if (handler != null) {
                    handler.post(new h7.i(lVar2, jVar2, i12));
                    return;
                }
                return;
            case 21:
                PlayerView.a((PlayerView) this.f3854b, (Bitmap) this.f3855c);
                return;
            case 22:
                ((p) ((hb.d) this.f3854b).f32174c).K((gb.i) this.f3855c, 3);
                return;
            case 23:
                ((ResponsiveScrollView) this.f3854b).setOnScrollChangedListener((m) this.f3855c);
                return;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                String str2 = (String) this.f3854b;
                String buttonText = (String) this.f3855c;
                kotlin.jvm.internal.m.f(buttonText, "$buttonText");
                HashSet hashSet = jf.f.f36329e;
                jf.a.j(str2, buttonText, new float[0]);
                return;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                pb.j jVar3 = (pb.j) this.f3854b;
                Runnable runnable = (Runnable) this.f3855c;
                jVar3.getClass();
                try {
                    runnable.run();
                    return;
                } finally {
                    jVar3.a();
                }
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                g1.k node = (g1.k) this.f3854b;
                q1 this$0 = (q1) this.f3855c;
                kotlin.jvm.internal.m.f(node, "$node");
                kotlin.jvm.internal.m.f(this$0, "this$0");
                try {
                    ((Runnable) node.f28529b).run();
                    return;
                } finally {
                    this$0.a(node);
                }
            case 27:
                List list = (List) this.f3854b;
                r rVar = (r) this.f3855c;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((lb.a) it.next()).a(rVar.f36249e);
                }
                return;
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                ((b7.g) this.f3854b).accept(this.f3855c);
                return;
            default:
                ((s0) this.f3854b).D((y) this.f3855c);
                return;
        }
    }
}
