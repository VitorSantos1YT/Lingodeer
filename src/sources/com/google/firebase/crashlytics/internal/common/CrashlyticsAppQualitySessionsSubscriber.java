package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.persistence.FileStore;
import com.google.firebase.sessions.api.SessionSubscriber;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class CrashlyticsAppQualitySessionsSubscriber implements SessionSubscriber {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DataCollectionArbiter f18256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CrashlyticsAppQualitySessionsStore f18257b;

    public CrashlyticsAppQualitySessionsSubscriber(DataCollectionArbiter dataCollectionArbiter, FileStore fileStore) {
        this.f18256a = dataCollectionArbiter;
        this.f18257b = new CrashlyticsAppQualitySessionsStore(fileStore);
    }

    @Override // com.google.firebase.sessions.api.SessionSubscriber
    public final boolean a() {
        return this.f18256a.a();
    }

    @Override // com.google.firebase.sessions.api.SessionSubscriber
    public final SessionSubscriber.Name b() {
        return SessionSubscriber.Name.CRASHLYTICS;
    }

    @Override // com.google.firebase.sessions.api.SessionSubscriber
    public final void c(SessionSubscriber.SessionDetails sessionDetails) {
        Objects.toString(sessionDetails);
        CrashlyticsAppQualitySessionsStore crashlyticsAppQualitySessionsStore = this.f18257b;
        String str = sessionDetails.f21043a;
        synchronized (crashlyticsAppQualitySessionsStore) {
            if (!Objects.equals(crashlyticsAppQualitySessionsStore.f18255c, str)) {
                FileStore fileStore = crashlyticsAppQualitySessionsStore.f18253a;
                String str2 = crashlyticsAppQualitySessionsStore.f18254b;
                if (str2 != null && str != null) {
                    try {
                        fileStore.b(str2, "aqs.".concat(str)).createNewFile();
                    } catch (IOException unused) {
                    }
                }
                crashlyticsAppQualitySessionsStore.f18255c = str;
            }
        }
    }

    public final void d(String str) {
        CrashlyticsAppQualitySessionsStore crashlyticsAppQualitySessionsStore = this.f18257b;
        synchronized (crashlyticsAppQualitySessionsStore) {
            if (!Objects.equals(crashlyticsAppQualitySessionsStore.f18254b, str)) {
                FileStore fileStore = crashlyticsAppQualitySessionsStore.f18253a;
                String str2 = crashlyticsAppQualitySessionsStore.f18255c;
                if (str != null && str2 != null) {
                    try {
                        fileStore.b(str, "aqs.".concat(str2)).createNewFile();
                    } catch (IOException unused) {
                    }
                }
                crashlyticsAppQualitySessionsStore.f18254b = str;
            }
        }
    }
}
