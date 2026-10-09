package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Base64;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.TransportRuntime;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.datatransport.runtime.util.PriorityMapping;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f8129a = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i11 = jobParameters.getExtras().getInt("priority");
        final int i12 = jobParameters.getExtras().getInt("attemptNumber");
        TransportRuntime.b(getApplicationContext());
        TransportContext.Builder builderA = TransportContext.a();
        builderA.b(string);
        builderA.d(PriorityMapping.b(i11));
        if (string2 != null) {
            builderA.c(Base64.decode(string2, 0));
        }
        final Uploader uploader = TransportRuntime.a().f8036d;
        final TransportContext transportContextA = builderA.a();
        final b2.c cVar = new b2.c(7, this, jobParameters);
        uploader.f8136e.execute(new Runnable() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.a
            @Override // java.lang.Runnable
            public final void run() {
                TransportContext transportContext = transportContextA;
                int i13 = i12;
                Runnable runnable = cVar;
                Uploader uploader2 = uploader;
                SynchronizationGuard synchronizationGuard = uploader2.f8137f;
                try {
                    EventStore eventStore = uploader2.f8134c;
                    Objects.requireNonNull(eventStore);
                    synchronizationGuard.b(new app.rive.runtime.kotlin.core.a(eventStore, 18));
                    NetworkInfo activeNetworkInfo = ((ConnectivityManager) uploader2.f8132a.getSystemService("connectivity")).getActiveNetworkInfo();
                    if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                        synchronizationGuard.b(new b(uploader2, transportContext, i13));
                    } else {
                        uploader2.a(transportContext, i13);
                    }
                } catch (SynchronizationException unused) {
                    uploader2.f8135d.a(transportContext, i13 + 1);
                } finally {
                    runnable.run();
                }
            }
        });
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
