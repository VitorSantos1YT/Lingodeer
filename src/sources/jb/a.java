package jb;

import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;
import fb.l;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f36284a = 0;

    static {
        m.e(l.c("SystemJobScheduler"), "tagWithPrefix(\"SystemJobScheduler\")");
    }

    public static final JobScheduler a(Context context) {
        m.f(context, "<this>");
        Object systemService = context.getSystemService("jobscheduler");
        m.d(systemService, "null cannot be cast to non-null type android.app.job.JobScheduler");
        JobScheduler jobScheduler = (JobScheduler) systemService;
        return Build.VERSION.SDK_INT >= 34 ? a5.b.b(jobScheduler) : jobScheduler;
    }
}
