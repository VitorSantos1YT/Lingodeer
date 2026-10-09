package com.google.android.datatransport.runtime;

import android.content.Context;
import com.google.android.datatransport.runtime.backends.CreationContextFactory_Factory;
import com.google.android.datatransport.runtime.backends.MetadataBackendRegistry_Factory;
import com.google.android.datatransport.runtime.dagger.internal.DoubleCheck;
import com.google.android.datatransport.runtime.dagger.internal.InstanceFactory;
import com.google.android.datatransport.runtime.scheduling.DefaultScheduler_Factory;
import com.google.android.datatransport.runtime.scheduling.SchedulingConfigModule_ConfigFactory;
import com.google.android.datatransport.runtime.scheduling.SchedulingModule_WorkSchedulerFactory;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader_Factory;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer_Factory;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_DbNameFactory;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_PackageNameFactory;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_SchemaVersionFactory;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_StoreConfigFactory;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore_Factory;
import com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager_Factory;
import com.google.android.datatransport.runtime.time.TimeModule_EventClockFactory;
import com.google.android.datatransport.runtime.time.TimeModule_UptimeClockFactory;
import oy.a;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class DaggerTransportRuntimeComponent {

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Builder implements TransportRuntimeComponent.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Context f8010a;

        private Builder() {
        }

        public final TransportRuntimeComponentImpl a() {
            Context context = this.f8010a;
            if (context == null) {
                throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
            }
            TransportRuntimeComponentImpl transportRuntimeComponentImpl = new TransportRuntimeComponentImpl();
            transportRuntimeComponentImpl.f8011a = DoubleCheck.a(ExecutionModule_ExecutorFactory.InstanceHolder.f8020a);
            InstanceFactory instanceFactory = new InstanceFactory(context);
            transportRuntimeComponentImpl.f8012b = instanceFactory;
            transportRuntimeComponentImpl.f8013c = DoubleCheck.a(new MetadataBackendRegistry_Factory(transportRuntimeComponentImpl.f8012b, new CreationContextFactory_Factory(instanceFactory, TimeModule_EventClockFactory.a(), TimeModule_UptimeClockFactory.a())));
            transportRuntimeComponentImpl.f8014d = new SchemaManager_Factory(transportRuntimeComponentImpl.f8012b, EventStoreModule_DbNameFactory.a(), EventStoreModule_SchemaVersionFactory.a());
            transportRuntimeComponentImpl.f8015e = DoubleCheck.a(new EventStoreModule_PackageNameFactory(transportRuntimeComponentImpl.f8012b));
            transportRuntimeComponentImpl.f8016f = DoubleCheck.a(new SQLiteEventStore_Factory(TimeModule_EventClockFactory.a(), TimeModule_UptimeClockFactory.a(), EventStoreModule_StoreConfigFactory.a(), transportRuntimeComponentImpl.f8014d, transportRuntimeComponentImpl.f8015e));
            SchedulingModule_WorkSchedulerFactory schedulingModule_WorkSchedulerFactory = new SchedulingModule_WorkSchedulerFactory(transportRuntimeComponentImpl.f8012b, transportRuntimeComponentImpl.f8016f, new SchedulingConfigModule_ConfigFactory(TimeModule_EventClockFactory.a()), TimeModule_UptimeClockFactory.a());
            transportRuntimeComponentImpl.f8017t = schedulingModule_WorkSchedulerFactory;
            a aVar = transportRuntimeComponentImpl.f8011a;
            a aVar2 = transportRuntimeComponentImpl.f8013c;
            a aVar3 = transportRuntimeComponentImpl.f8016f;
            transportRuntimeComponentImpl.H = new DefaultScheduler_Factory(aVar, aVar2, schedulingModule_WorkSchedulerFactory, aVar3, aVar3);
            InstanceFactory instanceFactory2 = transportRuntimeComponentImpl.f8012b;
            TimeModule_EventClockFactory timeModule_EventClockFactoryA = TimeModule_EventClockFactory.a();
            TimeModule_UptimeClockFactory timeModule_UptimeClockFactoryA = TimeModule_UptimeClockFactory.a();
            a aVar4 = transportRuntimeComponentImpl.f8016f;
            transportRuntimeComponentImpl.K = new Uploader_Factory(instanceFactory2, aVar2, aVar3, schedulingModule_WorkSchedulerFactory, aVar, aVar3, timeModule_EventClockFactoryA, timeModule_UptimeClockFactoryA, aVar4);
            transportRuntimeComponentImpl.L = new WorkInitializer_Factory(transportRuntimeComponentImpl.f8011a, aVar4, transportRuntimeComponentImpl.f8017t, aVar4);
            transportRuntimeComponentImpl.M = DoubleCheck.a(new TransportRuntime_Factory(TimeModule_EventClockFactory.a(), TimeModule_UptimeClockFactory.a(), transportRuntimeComponentImpl.H, transportRuntimeComponentImpl.K, transportRuntimeComponentImpl.L));
            return transportRuntimeComponentImpl;
        }

        public /* synthetic */ Builder(int i11) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class TransportRuntimeComponentImpl extends TransportRuntimeComponent {
        public DefaultScheduler_Factory H;
        public Uploader_Factory K;
        public WorkInitializer_Factory L;
        public a M;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public a f8011a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public InstanceFactory f8012b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public a f8013c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public SchemaManager_Factory f8014d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public a f8015e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public a f8016f;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public SchedulingModule_WorkSchedulerFactory f8017t;

        @Override // com.google.android.datatransport.runtime.TransportRuntimeComponent
        public final EventStore a() {
            return (EventStore) this.f8016f.get();
        }

        @Override // com.google.android.datatransport.runtime.TransportRuntimeComponent
        public final TransportRuntime b() {
            return (TransportRuntime) this.M.get();
        }
    }

    private DaggerTransportRuntimeComponent() {
    }
}
