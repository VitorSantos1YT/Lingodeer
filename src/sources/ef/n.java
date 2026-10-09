package ef;

import android.content.Context;
import android.os.Bundle;
import com.google.firebase.annotations.jjzf.kHfjNGauVgdF;
import fr.p3;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import lf.y0;
import re.d0;
import re.g0;
import re.i0;
import re.s;
import se.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f25525a = new n();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long[] f25526b = {300000, 900000, 1800000, 3600000, 21600000, 43200000, 86400000, 172800000, 259200000, 604800000, 1209600000, 1814400000, 2419200000L, 5184000000L, 7776000000L, 10368000000L, 12960000000L, 15552000000L, 31536000000L};

    public static final void b(Context context, String str, String str2) {
        if (qf.a.b(n.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.m.f(context, "context");
            Bundle bundle = new Bundle();
            bundle.putString("fb_mobile_launch_source", "Unclassified");
            se.m mVar = new se.m(str, str2);
            s sVar = s.f49201a;
            if (i0.c()) {
                mVar.d("fb_mobile_activate_app", bundle);
            }
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = se.m.f51605c;
            if (g0.k() == se.l.EXPLICIT_ONLY || qf.a.b(mVar)) {
                return;
            }
            try {
                se.j.c(q.EXPLICIT);
            } catch (Throwable th2) {
                qf.a.a(mVar, th2);
            }
        } catch (Throwable th3) {
            qf.a.a(n.class, th3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0032 A[Catch: all -> 0x0048, TRY_LEAVE, TryCatch #1 {, blocks: (B:11:0x0016, B:15:0x0020, B:23:0x0032, B:29:0x0044, B:21:0x002d, B:26:0x0040, B:18:0x0029), top: B:40:0x0016, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x0040 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public i a() {
        i iVar;
        i iVar2 = null;
        if (qf.a.b(i.class)) {
            iVar = null;
        } else {
            try {
                iVar = i.f25515c;
            } catch (Throwable th2) {
                qf.a.a(i.class, th2);
                iVar = null;
            }
        }
        if (iVar != null) {
            return iVar;
        }
        synchronized (this) {
            if (!s.f49215p.get()) {
                return null;
            }
            if (qf.a.b(i.class)) {
                if (iVar2 == null) {
                    iVar2 = new i();
                    if (!qf.a.b(i.class)) {
                        try {
                            i.f25515c = iVar2;
                        } catch (Throwable th3) {
                            qf.a.a(i.class, th3);
                        }
                    }
                }
                return iVar2;
            }
            try {
                iVar2 = i.f25515c;
            } catch (Throwable th4) {
                qf.a.a(i.class, th4);
            }
            if (iVar2 == null) {
                iVar2 = new i();
                if (!qf.a.b(i.class)) {
                    i.f25515c = iVar2;
                }
            }
            return iVar2;
            throw th;
        }
    }

    public void c() {
        if (qf.a.b(this)) {
            return;
        }
        try {
            p3 p3Var = y0.f40132d;
            p3.r(d0.APP_EVENTS, "ef.n", "Clock skew detected");
        } catch (Throwable th2) {
            qf.a.a(this, th2);
        }
    }

    public static final void d(String str, b7.c cVar, String str2) {
        String string;
        Long l9;
        if (qf.a.b(n.class) || cVar == null) {
            return;
        }
        try {
            Long l11 = (Long) cVar.f3962e;
            if (l11 == null) {
                l11 = 0L;
            }
            long jLongValue = l11.longValue();
            n nVar = f25525a;
            if (jLongValue < 0) {
                nVar.c();
                jLongValue = 0;
            }
            Long l12 = (Long) cVar.f3959b;
            long jLongValue2 = (l12 == null || (l9 = (Long) cVar.f3960c) == null) ? 0L : l9.longValue() - l12.longValue();
            if (jLongValue2 < 0) {
                nVar.c();
                jLongValue2 = 0;
            }
            Bundle bundle = new Bundle();
            bundle.putInt("fb_mobile_app_interruptions", cVar.f3958a);
            Locale locale = Locale.ROOT;
            String str3 = kHfjNGauVgdF.qSSg;
            int i11 = 0;
            if (!qf.a.b(n.class)) {
                int i12 = 0;
                while (true) {
                    try {
                        long[] jArr = f25526b;
                        if (i12 >= 19 || jArr[i12] >= jLongValue) {
                            break;
                        } else {
                            i12++;
                        }
                    } catch (Throwable th2) {
                        qf.a.a(n.class, th2);
                    }
                }
                i11 = i12;
            }
            bundle.putString("fb_mobile_time_between_sessions", String.format(locale, str3, Arrays.copyOf(new Object[]{Integer.valueOf(i11)}, 1)));
            o oVar = (o) cVar.f3963f;
            if (oVar == null || (string = oVar.toString()) == null) {
                string = "Unclassified";
            }
            bundle.putString("fb_mobile_launch_source", string);
            Long l13 = (Long) cVar.f3960c;
            bundle.putLong("_logTime", (l13 != null ? l13.longValue() : 0L) / ((long) 1000));
            se.m mVar = new se.m(str, str2);
            double d5 = jLongValue2 / 1000;
            s sVar = s.f49201a;
            if (!i0.c() || qf.a.b(mVar)) {
                return;
            }
            try {
                se.m.f(mVar, "fb_mobile_deactivate_app", Double.valueOf(d5), bundle, false, d.b());
            } catch (Throwable th3) {
                qf.a.a(mVar, th3);
            }
        } catch (Throwable th4) {
            qf.a.a(n.class, th4);
        }
    }
}
