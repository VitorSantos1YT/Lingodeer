package com.google.android.datatransport.runtime;

import android.content.Context;
import b2.a;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.TransportFactory;
import com.google.android.datatransport.runtime.scheduling.Scheduler;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer;
import com.google.android.datatransport.runtime.time.Clock;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class TransportRuntime implements TransportInternal {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile TransportRuntimeComponent f8032e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clock f8033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clock f8034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Scheduler f8035c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Uploader f8036d;

    public TransportRuntime(Clock clock, Clock clock2, Scheduler scheduler, Uploader uploader, WorkInitializer workInitializer) {
        this.f8033a = clock;
        this.f8034b = clock2;
        this.f8035c = scheduler;
        this.f8036d = uploader;
        workInitializer.f8150a.execute(new a(workInitializer, 4));
    }

    public static TransportRuntime a() {
        TransportRuntimeComponent transportRuntimeComponent = f8032e;
        if (transportRuntimeComponent != null) {
            return transportRuntimeComponent.b();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void b(Context context) {
        if (f8032e == null) {
            synchronized (TransportRuntime.class) {
                try {
                    if (f8032e == null) {
                        DaggerTransportRuntimeComponent.Builder builder = new DaggerTransportRuntimeComponent.Builder(0);
                        context.getClass();
                        builder.f8010a = context;
                        f8032e = builder.a();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final TransportFactory c(Destination destination) {
        Set setUnmodifiableSet = destination instanceof EncodedDestination ? Collections.unmodifiableSet(((EncodedDestination) destination).a()) : Collections.singleton(new Encoding("proto"));
        TransportContext.Builder builderA = TransportContext.a();
        destination.getClass();
        ((AutoValue_TransportContext.Builder) builderA).f8007a = "cct";
        ((AutoValue_TransportContext.Builder) builderA).f8008b = destination.getExtras();
        return new TransportFactoryImpl(setUnmodifiableSet, builderA.a(), this);
    }
}
