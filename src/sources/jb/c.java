package jb;

import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.background.systemjob.SystemJobService;
import fb.e;
import fb.f;
import fb.l;
import fb.w;
import kotlin.jvm.internal.m;
import ob.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ComponentName f36286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f36287b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f36288c;

    static {
        l.c("SystemJobInfoConverter");
    }

    public c(Context context, l lVar, boolean z11) {
        this.f36287b = lVar;
        this.f36286a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
        this.f36288c = z11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final JobInfo a(p pVar, int i11) {
        int i12;
        String str;
        f fVar = pVar.f44857j;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", pVar.f44848a);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", pVar.f44866t);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", pVar.d());
        JobInfo.Builder requiresCharging = new JobInfo.Builder(i11, this.f36286a).setRequiresCharging(fVar.f27067c);
        boolean z11 = fVar.f27068d;
        JobInfo.Builder builder = requiresCharging.setRequiresDeviceIdle(z11).setExtras(persistableBundle);
        NetworkRequest networkRequestA = fVar.a();
        int i13 = Build.VERSION.SDK_INT;
        if (i13 < 28 || networkRequestA == null) {
            w wVar = fVar.f27065a;
            if (i13 < 30 || wVar != w.TEMPORARILY_UNMETERED) {
                int i14 = b.f36285a[wVar.ordinal()];
                if (i14 != 1) {
                    i12 = 2;
                    if (i14 == 2) {
                        i12 = 1;
                    } else if (i14 != 3) {
                        i12 = 4;
                        if (i14 == 4) {
                            i12 = 3;
                        } else if (i14 != 5 || i13 < 26) {
                            l lVarB = l.b();
                            wVar.toString();
                            lVarB.getClass();
                            i12 = 1;
                        }
                    }
                } else {
                    i12 = 0;
                }
                builder.setRequiredNetworkType(i12);
            } else {
                builder.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
            }
        } else {
            m.f(builder, "builder");
            builder.setRequiredNetwork(networkRequestA);
        }
        if (!z11) {
            builder.setBackoffCriteria(pVar.m, pVar.f44859l == fb.a.LINEAR ? 0 : 1);
        }
        long jA = pVar.a();
        this.f36287b.getClass();
        long jMax = Math.max(jA - System.currentTimeMillis(), 0L);
        if (i13 <= 28 || jMax > 0) {
            builder.setMinimumLatency(jMax);
        } else if (!pVar.f44863q && this.f36288c) {
            builder.setImportantWhileForeground(true);
        }
        if (fVar.b()) {
            for (e eVar : fVar.f27073i) {
                builder.addTriggerContentUri(new JobInfo.TriggerContentUri(eVar.f27062a, eVar.f27063b ? 1 : 0));
            }
            builder.setTriggerContentUpdateDelay(fVar.f27071g);
            builder.setTriggerContentMaxDelay(fVar.f27072h);
        }
        builder.setPersisted(false);
        int i15 = Build.VERSION.SDK_INT;
        if (i15 >= 26) {
            builder.setRequiresBatteryNotLow(fVar.f27069e);
            builder.setRequiresStorageNotLow(fVar.f27070f);
        }
        Object[] objArr = pVar.f44858k > 0;
        boolean z12 = jMax > 0;
        if (i15 >= 31 && pVar.f44863q && objArr == false && !z12) {
            builder.setExpedited(true);
        }
        if (i15 >= 35 && (str = pVar.f44870x) != null) {
            builder.setTraceTag(str);
        }
        return builder.build();
    }
}
