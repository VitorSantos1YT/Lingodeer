package com.google.firebase.sessions;

import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Event;
import com.google.android.datatransport.TransportFactory;
import com.google.firebase.database.android.d;
import com.google.firebase.inject.Provider;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class EventGDTLogger implements EventGDTLoggerInterface {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f20883b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider f20884a;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        public /* synthetic */ Companion(int i11) {
            this();
        }

        private Companion() {
        }
    }

    static {
        new Companion(0);
    }

    public EventGDTLogger(Provider transportFactoryProvider) {
        m.f(transportFactoryProvider, "transportFactoryProvider");
        this.f20884a = transportFactoryProvider;
    }

    @Override // com.google.firebase.sessions.EventGDTLoggerInterface
    public final void a(SessionEvent sessionEvent) {
        ((TransportFactory) this.f20884a.get()).b("FIREBASE_APPQUALITY_SESSION", new Encoding("json"), new d(this, 7)).a(Event.g(sessionEvent));
    }
}
