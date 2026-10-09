package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.Context;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.runtime.EncodedPayload;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.ProtoEncoderDoNotUse;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.backends.BackendRegistry;
import com.google.android.datatransport.runtime.backends.BackendRequest;
import com.google.android.datatransport.runtime.backends.BackendResponse;
import com.google.android.datatransport.runtime.backends.TransportBackend;
import com.google.android.datatransport.runtime.firebase.transport.ClientMetrics;
import com.google.android.datatransport.runtime.logging.Logging;
import com.google.android.datatransport.runtime.scheduling.persistence.ClientHealthMetricsStore;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.datatransport.runtime.time.Clock;
import com.google.firebase.encoders.proto.ProtobufEncoder;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class Uploader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f8132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BackendRegistry f8133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EventStore f8134c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WorkScheduler f8135d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Executor f8136e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final SynchronizationGuard f8137f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Clock f8138g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Clock f8139h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ClientHealthMetricsStore f8140i;

    public Uploader(Context context, BackendRegistry backendRegistry, EventStore eventStore, WorkScheduler workScheduler, Executor executor, SynchronizationGuard synchronizationGuard, Clock clock, Clock clock2, ClientHealthMetricsStore clientHealthMetricsStore) {
        this.f8132a = context;
        this.f8133b = backendRegistry;
        this.f8134c = eventStore;
        this.f8135d = workScheduler;
        this.f8136e = executor;
        this.f8137f = synchronizationGuard;
        this.f8138g = clock;
        this.f8139h = clock2;
        this.f8140i = clientHealthMetricsStore;
    }

    public final void a(final TransportContext transportContext, int i11) {
        BackendResponse backendResponseA;
        TransportBackend transportBackendA = this.f8133b.a(transportContext.b());
        final long jMax = 0;
        BackendResponse.e(0L);
        while (true) {
            final int i12 = 0;
            SynchronizationGuard.CriticalSection criticalSection = new SynchronizationGuard.CriticalSection(this) { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.c

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ Uploader f8166b;

                {
                    this.f8166b = this;
                }

                @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
                public final Object b() {
                    switch (i12) {
                        case 0:
                            return Boolean.valueOf(this.f8166b.f8134c.g1(transportContext));
                        default:
                            return this.f8166b.f8134c.E(transportContext);
                    }
                }
            };
            SynchronizationGuard synchronizationGuard = this.f8137f;
            if (!((Boolean) synchronizationGuard.b(criticalSection)).booleanValue()) {
                synchronizationGuard.b(new f(this, transportContext, jMax));
                return;
            }
            final int i13 = 1;
            final Iterable iterable = (Iterable) synchronizationGuard.b(new SynchronizationGuard.CriticalSection(this) { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.c

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ Uploader f8166b;

                {
                    this.f8166b = this;
                }

                @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
                public final Object b() {
                    switch (i13) {
                        case 0:
                            return Boolean.valueOf(this.f8166b.f8134c.g1(transportContext));
                        default:
                            return this.f8166b.f8134c.E(transportContext);
                    }
                }
            });
            if (!iterable.iterator().hasNext()) {
                return;
            }
            if (transportBackendA == null) {
                Logging.a("Uploader", "Unknown backend for %s, deleting event batch for it...", transportContext);
                backendResponseA = BackendResponse.a();
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((PersistedEvent) it.next()).a());
                }
                if (transportContext.c() != null) {
                    ClientHealthMetricsStore clientHealthMetricsStore = this.f8140i;
                    Objects.requireNonNull(clientHealthMetricsStore);
                    ClientMetrics clientMetrics = (ClientMetrics) synchronizationGuard.b(new app.rive.runtime.kotlin.core.a(clientHealthMetricsStore, 17));
                    EventInternal.Builder builderA = EventInternal.a();
                    builderA.f(this.f8138g.a());
                    builderA.l(this.f8139h.a());
                    builderA.k("GDT_CLIENT_METRICS");
                    Encoding encoding = new Encoding("proto");
                    clientMetrics.getClass();
                    ProtobufEncoder protobufEncoder = ProtoEncoderDoNotUse.f8021a;
                    protobufEncoder.getClass();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        protobufEncoder.a(clientMetrics, byteArrayOutputStream);
                    } catch (IOException unused) {
                    }
                    builderA.e(new EncodedPayload(encoding, byteArrayOutputStream.toByteArray()));
                    arrayList.add(transportBackendA.b(builderA.b()));
                }
                BackendRequest.Builder builderA2 = BackendRequest.a();
                builderA2.b(arrayList);
                builderA2.c(transportContext.c());
                backendResponseA = transportBackendA.a(builderA2.a());
            }
            if (backendResponseA.c() == BackendResponse.Status.TRANSIENT_ERROR) {
                synchronizationGuard.b(new SynchronizationGuard.CriticalSection() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.d
                    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
                    public final Object b() {
                        Uploader uploader = this.f8168a;
                        EventStore eventStore = uploader.f8134c;
                        eventStore.o1(iterable);
                        eventStore.J0(uploader.f8138g.a() + jMax, transportContext);
                        return null;
                    }
                });
                this.f8135d.b(transportContext, i11 + 1, true);
                return;
            }
            synchronizationGuard.b(new e(0, this, iterable));
            if (backendResponseA.c() == BackendResponse.Status.OK) {
                jMax = Math.max(jMax, backendResponseA.b());
                if (transportContext.c() != null) {
                    synchronizationGuard.b(new app.rive.runtime.kotlin.core.a(this, 19));
                }
            } else if (backendResponseA.c() == BackendResponse.Status.INVALID_PAYLOAD) {
                HashMap map = new HashMap();
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    String strL = ((PersistedEvent) it2.next()).a().l();
                    if (map.containsKey(strL)) {
                        map.put(strL, Integer.valueOf(((Integer) map.get(strL)).intValue() + 1));
                    } else {
                        map.put(strL, 1);
                    }
                }
                synchronizationGuard.b(new e(1, this, map));
            }
        }
    }
}
