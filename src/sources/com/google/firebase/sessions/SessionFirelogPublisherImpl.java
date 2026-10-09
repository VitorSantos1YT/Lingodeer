package com.google.firebase.sessions;

import com.google.firebase.FirebaseApp;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.sessions.settings.SessionsSettings;
import kotlin.jvm.internal.m;
import mf.sOm.txBUGYhC;
import rz.e0;
import vy.i;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class SessionFirelogPublisherImpl implements SessionFirelogPublisher {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final double f20945f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f20946g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FirebaseApp f20947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FirebaseInstallationsApi f20948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SessionsSettings f20949c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final EventGDTLoggerInterface f20950d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i f20951e;

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
        f20945f = Math.random();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0078, code lost:
    
        if (r0.b(r1) == r6) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(com.google.firebase.sessions.SessionFirelogPublisherImpl r5, xy.c r6) {
        /*
            com.google.firebase.sessions.settings.SessionsSettings r0 = r5.f20949c
            boolean r1 = r6 instanceof com.google.firebase.sessions.SessionFirelogPublisherImpl$shouldLogSession$1
            if (r1 == 0) goto L15
            r1 = r6
            com.google.firebase.sessions.SessionFirelogPublisherImpl$shouldLogSession$1 r1 = (com.google.firebase.sessions.SessionFirelogPublisherImpl$shouldLogSession$1) r1
            int r2 = r1.f20961c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f20961c = r2
            goto L1a
        L15:
            com.google.firebase.sessions.SessionFirelogPublisherImpl$shouldLogSession$1 r1 = new com.google.firebase.sessions.SessionFirelogPublisherImpl$shouldLogSession$1
            r1.<init>(r5, r6)
        L1a:
            java.lang.Object r5 = r1.f20959a
            wy.a r6 = wy.a.COROUTINE_SUSPENDED
            int r2 = r1.f20961c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            com.bumptech.glide.e.F(r5)
            goto L7b
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            com.bumptech.glide.e.F(r5)
            goto L46
        L38:
            com.bumptech.glide.e.F(r5)
            com.google.firebase.sessions.api.FirebaseSessionsDependencies r5 = com.google.firebase.sessions.api.FirebaseSessionsDependencies.f21032a
            r1.f20961c = r4
            java.lang.Object r5 = r5.c(r1)
            if (r5 != r6) goto L46
            goto L7a
        L46:
            java.util.Map r5 = (java.util.Map) r5
            java.util.Collection r5 = r5.values()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            boolean r2 = r5 instanceof java.util.Collection
            if (r2 == 0) goto L5c
            r2 = r5
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L5c
            goto La6
        L5c:
            java.util.Iterator r5 = r5.iterator()
        L60:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto La6
            java.lang.Object r2 = r5.next()
            com.google.firebase.sessions.api.SessionSubscriber r2 = (com.google.firebase.sessions.api.SessionSubscriber) r2
            boolean r2 = r2.a()
            if (r2 == 0) goto L60
            r1.f20961c = r3
            java.lang.Object r5 = r0.b(r1)
            if (r5 != r6) goto L7b
        L7a:
            return r6
        L7b:
            com.google.firebase.sessions.settings.SettingsProvider r5 = r0.f21092a
            java.lang.Boolean r5 = r5.a()
            if (r5 == 0) goto L88
        L83:
            boolean r4 = r5.booleanValue()
            goto L91
        L88:
            com.google.firebase.sessions.settings.SettingsProvider r5 = r0.f21093b
            java.lang.Boolean r5 = r5.a()
            if (r5 == 0) goto L91
            goto L83
        L91:
            if (r4 != 0) goto L96
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            return r5
        L96:
            double r5 = com.google.firebase.sessions.SessionFirelogPublisherImpl.f20945f
            double r0 = r0.a()
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 > 0) goto La3
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            return r5
        La3:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            return r5
        La6:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.SessionFirelogPublisherImpl.b(com.google.firebase.sessions.SessionFirelogPublisherImpl, xy.c):java.lang.Object");
    }

    @Override // com.google.firebase.sessions.SessionFirelogPublisher
    public final void a(SessionDetails sessionDetails) {
        e0.B(e0.c(this.f20951e), null, null, new SessionFirelogPublisherImpl$mayLogSession$1(this, sessionDetails, null), 3);
    }

    public SessionFirelogPublisherImpl(FirebaseApp firebaseApp, FirebaseInstallationsApi firebaseInstallations, SessionsSettings sessionSettings, EventGDTLoggerInterface eventGDTLoggerInterface, i backgroundDispatcher) {
        m.f(firebaseApp, "firebaseApp");
        m.f(firebaseInstallations, "firebaseInstallations");
        m.f(sessionSettings, "sessionSettings");
        m.f(eventGDTLoggerInterface, txBUGYhC.MqUjnCXy);
        m.f(backgroundDispatcher, "backgroundDispatcher");
        this.f20947a = firebaseApp;
        this.f20948b = firebaseInstallations;
        this.f20949c = sessionSettings;
        this.f20950d = eventGDTLoggerInterface;
        this.f20951e = backgroundDispatcher;
    }
}
