package com.google.firebase.sessions;

import com.google.firebase.FirebaseApp;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.sessions.api.FirebaseSessionsDependencies;
import com.google.firebase.sessions.api.SessionSubscriber;
import com.google.firebase.sessions.settings.SessionsSettings;
import java.util.Map;
import kotlin.jvm.internal.m;
import rz.b0;
import vy.d;
import xy.e;
import xy.i;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@e(c = "com.google.firebase.sessions.SessionFirelogPublisherImpl$mayLogSession$1", f = "SessionFirelogPublisher.kt", l = {70, 71, 77}, m = "invokeSuspend")
final class SessionFirelogPublisherImpl$mayLogSession$1 extends i implements fz.e {
    public final /* synthetic */ SessionFirelogPublisherImpl H;
    public final /* synthetic */ SessionDetails K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InstallationId f20952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SessionFirelogPublisherImpl f20953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SessionEvents f20954c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public FirebaseApp f20955d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public SessionDetails f20956e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public SessionsSettings f20957f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f20958t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionFirelogPublisherImpl$mayLogSession$1(SessionFirelogPublisherImpl sessionFirelogPublisherImpl, SessionDetails sessionDetails, d dVar) {
        super(2, dVar);
        this.H = sessionFirelogPublisherImpl;
        this.K = sessionDetails;
    }

    @Override // xy.a
    public final d create(Object obj, d dVar) {
        return new SessionFirelogPublisherImpl$mayLogSession$1(this.H, this.K, dVar);
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((SessionFirelogPublisherImpl$mayLogSession$1) create((b0) obj, (d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0080  */
    /* JADX WARN: Code duplicated, block: B:26:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:28:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:30:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:31:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:34:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:36:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:39:0x00f1  */
    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        Object objB;
        Object objA;
        InstallationId installationId;
        SessionEvents sessionEvents;
        FirebaseApp firebaseApp;
        SessionsSettings sessionsSettings;
        SessionDetails sessionDetails;
        Object objC;
        SessionsSettings sessionsSettings2;
        SessionFirelogPublisherImpl sessionFirelogPublisherImpl;
        InstallationId installationId2;
        SessionEvents sessionEvents2;
        FirebaseApp firebaseApp2;
        SessionDetails sessionDetails2;
        SessionSubscriber sessionSubscriber;
        DataCollectionState dataCollectionState;
        SessionSubscriber sessionSubscriber2;
        DataCollectionState dataCollectionState2;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f20958t;
        SessionFirelogPublisherImpl sessionFirelogPublisherImpl2 = this.H;
        if (i11 == 0) {
            com.bumptech.glide.e.F(obj);
            this.f20958t = 1;
            objB = SessionFirelogPublisherImpl.b(sessionFirelogPublisherImpl2, this);
            if (objB != aVar) {
            }
            return aVar;
        }
        if (i11 == 1) {
            com.bumptech.glide.e.F(obj);
            objB = obj;
        } else {
            if (i11 == 2) {
                com.bumptech.glide.e.F(obj);
                objA = obj;
                installationId = (InstallationId) objA;
                sessionEvents = SessionEvents.f20943a;
                firebaseApp = sessionFirelogPublisherImpl2.f20947a;
                sessionsSettings = sessionFirelogPublisherImpl2.f20949c;
                FirebaseSessionsDependencies firebaseSessionsDependencies = FirebaseSessionsDependencies.f21032a;
                this.f20952a = installationId;
                this.f20953b = sessionFirelogPublisherImpl2;
                this.f20954c = sessionEvents;
                this.f20955d = firebaseApp;
                sessionDetails = this.K;
                this.f20956e = sessionDetails;
                this.f20957f = sessionsSettings;
                this.f20958t = 3;
                objC = firebaseSessionsDependencies.c(this);
                if (objC != aVar) {
                    sessionsSettings2 = sessionsSettings;
                    sessionFirelogPublisherImpl = sessionFirelogPublisherImpl2;
                    installationId2 = installationId;
                    sessionEvents2 = sessionEvents;
                    firebaseApp2 = firebaseApp;
                    sessionDetails2 = sessionDetails;
                }
                return aVar;
            }
            if (i11 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sessionsSettings2 = this.f20957f;
            sessionDetails2 = this.f20956e;
            FirebaseApp firebaseApp3 = this.f20955d;
            SessionEvents sessionEvents3 = this.f20954c;
            SessionFirelogPublisherImpl sessionFirelogPublisherImpl3 = this.f20953b;
            InstallationId installationId3 = this.f20952a;
            com.bumptech.glide.e.F(obj);
            sessionFirelogPublisherImpl = sessionFirelogPublisherImpl3;
            installationId2 = installationId3;
            sessionEvents2 = sessionEvents3;
            firebaseApp2 = firebaseApp3;
            objC = obj;
        }
        Map subscribers = (Map) objC;
        String str = installationId2.f20906a;
        String firebaseAuthenticationToken = installationId2.f20907b;
        sessionEvents2.getClass();
        m.f(firebaseApp2, "firebaseApp");
        m.f(sessionDetails2, "sessionDetails");
        m.f(sessionsSettings2, "sessionsSettings");
        m.f(subscribers, "subscribers");
        m.f(firebaseAuthenticationToken, "firebaseAuthenticationToken");
        EventType eventType = EventType.SESSION_START;
        String str2 = sessionDetails2.f20935a;
        String str3 = sessionDetails2.f20936b;
        int i12 = sessionDetails2.f20937c;
        long j11 = sessionDetails2.f20938d;
        sessionSubscriber = (SessionSubscriber) subscribers.get(SessionSubscriber.Name.PERFORMANCE);
        if (sessionSubscriber == null) {
            dataCollectionState = DataCollectionState.COLLECTION_SDK_NOT_INSTALLED;
        } else if (sessionSubscriber.a()) {
            dataCollectionState = DataCollectionState.COLLECTION_ENABLED;
        } else {
            dataCollectionState = DataCollectionState.COLLECTION_DISABLED;
        }
        SessionsSettings sessionsSettings3 = sessionsSettings2;
        sessionSubscriber2 = (SessionSubscriber) subscribers.get(SessionSubscriber.Name.CRASHLYTICS);
        if (sessionSubscriber2 == null) {
            dataCollectionState2 = DataCollectionState.COLLECTION_SDK_NOT_INSTALLED;
        } else if (sessionSubscriber2.a()) {
            dataCollectionState2 = DataCollectionState.COLLECTION_ENABLED;
        } else {
            dataCollectionState2 = DataCollectionState.COLLECTION_DISABLED;
        }
        SessionEvent sessionEvent = new SessionEvent(eventType, new SessionInfo(str2, str3, i12, j11, new DataCollectionStatus(dataCollectionState, dataCollectionState2, sessionsSettings3.a()), str, firebaseAuthenticationToken), SessionEvents.a(firebaseApp2));
        int i13 = SessionFirelogPublisherImpl.f20946g;
        sessionFirelogPublisherImpl.getClass();
        try {
            sessionFirelogPublisherImpl.f20950d.a(sessionEvent);
        } catch (RuntimeException unused) {
        }
        return qy.b0.f48488a;
        if (((Boolean) objB).booleanValue()) {
            InstallationId.Companion companion = InstallationId.f20905c;
            FirebaseInstallationsApi firebaseInstallationsApi = sessionFirelogPublisherImpl2.f20948b;
            this.f20958t = 2;
            objA = companion.a(firebaseInstallationsApi, this);
            if (objA != aVar) {
                installationId = (InstallationId) objA;
                sessionEvents = SessionEvents.f20943a;
                firebaseApp = sessionFirelogPublisherImpl2.f20947a;
                sessionsSettings = sessionFirelogPublisherImpl2.f20949c;
                FirebaseSessionsDependencies firebaseSessionsDependencies2 = FirebaseSessionsDependencies.f21032a;
                this.f20952a = installationId;
                this.f20953b = sessionFirelogPublisherImpl2;
                this.f20954c = sessionEvents;
                this.f20955d = firebaseApp;
                sessionDetails = this.K;
                this.f20956e = sessionDetails;
                this.f20957f = sessionsSettings;
                this.f20958t = 3;
                objC = firebaseSessionsDependencies2.c(this);
                if (objC != aVar) {
                    sessionsSettings2 = sessionsSettings;
                    sessionFirelogPublisherImpl = sessionFirelogPublisherImpl2;
                    installationId2 = installationId;
                    sessionEvents2 = sessionEvents;
                    firebaseApp2 = firebaseApp;
                    sessionDetails2 = sessionDetails;
                    Map subscribers2 = (Map) objC;
                    String str4 = installationId2.f20906a;
                    String firebaseAuthenticationToken2 = installationId2.f20907b;
                    sessionEvents2.getClass();
                    m.f(firebaseApp2, "firebaseApp");
                    m.f(sessionDetails2, "sessionDetails");
                    m.f(sessionsSettings2, "sessionsSettings");
                    m.f(subscribers2, "subscribers");
                    m.f(firebaseAuthenticationToken2, "firebaseAuthenticationToken");
                    EventType eventType2 = EventType.SESSION_START;
                    String str5 = sessionDetails2.f20935a;
                    String str6 = sessionDetails2.f20936b;
                    int i14 = sessionDetails2.f20937c;
                    long j12 = sessionDetails2.f20938d;
                    sessionSubscriber = (SessionSubscriber) subscribers2.get(SessionSubscriber.Name.PERFORMANCE);
                    if (sessionSubscriber == null) {
                        dataCollectionState = DataCollectionState.COLLECTION_SDK_NOT_INSTALLED;
                    } else if (sessionSubscriber.a()) {
                        dataCollectionState = DataCollectionState.COLLECTION_ENABLED;
                    } else {
                        dataCollectionState = DataCollectionState.COLLECTION_DISABLED;
                    }
                    SessionsSettings sessionsSettings4 = sessionsSettings2;
                    sessionSubscriber2 = (SessionSubscriber) subscribers2.get(SessionSubscriber.Name.CRASHLYTICS);
                    if (sessionSubscriber2 == null) {
                        dataCollectionState2 = DataCollectionState.COLLECTION_SDK_NOT_INSTALLED;
                    } else if (sessionSubscriber2.a()) {
                        dataCollectionState2 = DataCollectionState.COLLECTION_ENABLED;
                    } else {
                        dataCollectionState2 = DataCollectionState.COLLECTION_DISABLED;
                    }
                    SessionEvent sessionEvent2 = new SessionEvent(eventType2, new SessionInfo(str5, str6, i14, j12, new DataCollectionStatus(dataCollectionState, dataCollectionState2, sessionsSettings4.a()), str4, firebaseAuthenticationToken2), SessionEvents.a(firebaseApp2));
                    int i15 = SessionFirelogPublisherImpl.f20946g;
                    sessionFirelogPublisherImpl.getClass();
                    sessionFirelogPublisherImpl.f20950d.a(sessionEvent2);
                }
            }
            return aVar;
        }
        return qy.b0.f48488a;
    }
}
