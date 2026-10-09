package ef;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import lf.e0;
import lf.h0;
import pt.ImS.aYZzTH;
import re.i0;
import re.s;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f25497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f25498c;

    public /* synthetic */ b(long j11, String str, int i11) {
        this.f25496a = i11;
        this.f25497b = j11;
        this.f25498c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i11 = this.f25496a;
        long j11 = this.f25497b;
        switch (i11) {
            case 0:
                String str = this.f25498c;
                if (d.f25506g == null) {
                    d.f25506g = new b7.c(Long.valueOf(j11), null);
                }
                b7.c cVar = d.f25506g;
                if (cVar != null) {
                    cVar.f3960c = Long.valueOf(j11);
                }
                int i12 = 1;
                if (d.f25505f.get() <= 0) {
                    b bVar = new b(j11, str, i12);
                    synchronized (d.f25504e) {
                        ScheduledExecutorService scheduledExecutorService = d.f25501b;
                        e0 e0VarB = h0.b(s.b());
                        d.f25503d = scheduledExecutorService.schedule(bVar, e0VarB == null ? 60 : e0VarB.f40000d, TimeUnit.SECONDS);
                    }
                }
                long j12 = d.f25509j;
                long j13 = j12 > 0 ? (j11 - j12) / ((long) 1000) : 0L;
                o20.i iVar = k.f25521a;
                Context contextA = s.a();
                e0 e0VarK = h0.k(s.b(), false);
                if (e0VarK != null && e0VarK.f40003g && j13 > 0) {
                    se.m mVar = new se.m(contextA, (String) null);
                    Bundle bundle = new Bundle(1);
                    bundle.putCharSequence("fb_aa_time_spent_view_name", str);
                    double d5 = j13;
                    if (i0.c() && !qf.a.b(mVar)) {
                        try {
                            se.m.f(mVar, "fb_aa_time_spent_on_view", Double.valueOf(d5), bundle, false, d.b());
                        } catch (Throwable th2) {
                            qf.a.a(mVar, th2);
                        }
                    }
                    break;
                }
                b7.c cVar2 = d.f25506g;
                if (cVar2 != null) {
                    cVar2.j();
                    return;
                }
                return;
            default:
                String str2 = this.f25498c;
                if (d.f25506g == null) {
                    d.f25506g = new b7.c(Long.valueOf(j11), null);
                }
                if (d.f25505f.get() <= 0) {
                    n.d(str2, d.f25506g, d.f25508i);
                    SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(s.a()).edit();
                    editorEdit.remove("com.facebook.appevents.SessionInfo.sessionStartTime");
                    editorEdit.remove("com.facebook.appevents.SessionInfo.sessionEndTime");
                    editorEdit.remove(aYZzTH.JkIMHazDg);
                    editorEdit.remove("com.facebook.appevents.SessionInfo.sessionId");
                    editorEdit.apply();
                    SharedPreferences.Editor editorEdit2 = PreferenceManager.getDefaultSharedPreferences(s.a()).edit();
                    editorEdit2.remove("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage");
                    editorEdit2.remove("com.facebook.appevents.SourceApplicationInfo.openedByApplink");
                    editorEdit2.apply();
                    d.f25506g = null;
                }
                synchronized (d.f25504e) {
                    d.f25503d = null;
                }
                return;
        }
    }
}
