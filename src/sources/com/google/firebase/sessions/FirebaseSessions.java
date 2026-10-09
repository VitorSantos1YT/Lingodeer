package com.google.firebase.sessions;

import android.app.Application;
import android.content.Context;
import com.google.firebase.FirebaseApp;
import com.google.firebase.sessions.settings.SessionsSettings;
import kotlin.jvm.internal.m;
import rz.b0;
import rz.e0;
import vy.d;
import xy.e;
import xy.i;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class FirebaseSessions {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FirebaseApp f20886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SessionsSettings f20887b;

    /* JADX INFO: renamed from: com.google.firebase.sessions.FirebaseSessions$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    @e(c = "com.google.firebase.sessions.FirebaseSessions$1", f = "FirebaseSessions.kt", l = {51, 55}, m = "invokeSuspend")
    final class AnonymousClass1 extends i implements fz.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f20888a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ SessionsActivityLifecycleCallbacks f20890c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SessionsActivityLifecycleCallbacks sessionsActivityLifecycleCallbacks, d dVar) {
            super(2, dVar);
            this.f20890c = sessionsActivityLifecycleCallbacks;
        }

        @Override // xy.a
        public final d create(Object obj, d dVar) {
            return FirebaseSessions.this.new AnonymousClass1(this.f20890c, dVar);
        }

        @Override // fz.e
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((b0) obj, (d) obj2)).invokeSuspend(qy.b0.f48488a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x0062, code lost:
        
            if (r1.b(r7) == r2) goto L25;
         */
        @Override // xy.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                com.google.firebase.sessions.FirebaseSessions r0 = com.google.firebase.sessions.FirebaseSessions.this
                com.google.firebase.sessions.settings.SessionsSettings r1 = r0.f20887b
                wy.a r2 = wy.a.COROUTINE_SUSPENDED
                int r3 = r7.f20888a
                java.lang.String r4 = "FirebaseSessions"
                r5 = 2
                r6 = 1
                if (r3 == 0) goto L22
                if (r3 == r6) goto L1e
                if (r3 != r5) goto L16
                com.bumptech.glide.e.F(r8)
                goto L65
            L16:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1e:
                com.bumptech.glide.e.F(r8)
                goto L30
            L22:
                com.bumptech.glide.e.F(r8)
                com.google.firebase.sessions.api.FirebaseSessionsDependencies r8 = com.google.firebase.sessions.api.FirebaseSessionsDependencies.f21032a
                r7.f20888a = r6
                java.lang.Object r8 = r8.c(r7)
                if (r8 != r2) goto L30
                goto L64
            L30:
                java.util.Map r8 = (java.util.Map) r8
                java.util.Collection r8 = r8.values()
                java.lang.Iterable r8 = (java.lang.Iterable) r8
                boolean r3 = r8 instanceof java.util.Collection
                if (r3 == 0) goto L46
                r3 = r8
                java.util.Collection r3 = (java.util.Collection) r3
                boolean r3 = r3.isEmpty()
                if (r3 == 0) goto L46
                goto L98
            L46:
                java.util.Iterator r8 = r8.iterator()
            L4a:
                boolean r3 = r8.hasNext()
                if (r3 == 0) goto L98
                java.lang.Object r3 = r8.next()
                com.google.firebase.sessions.api.SessionSubscriber r3 = (com.google.firebase.sessions.api.SessionSubscriber) r3
                boolean r3 = r3.a()
                if (r3 == 0) goto L4a
                r7.f20888a = r5
                java.lang.Object r8 = r1.b(r7)
                if (r8 != r2) goto L65
            L64:
                return r2
            L65:
                com.google.firebase.sessions.settings.SettingsProvider r8 = r1.f21092a
                java.lang.Boolean r8 = r8.a()
                if (r8 == 0) goto L72
            L6d:
                boolean r6 = r8.booleanValue()
                goto L7b
            L72:
                com.google.firebase.sessions.settings.SettingsProvider r8 = r1.f21093b
                java.lang.Boolean r8 = r8.a()
                if (r8 == 0) goto L7b
                goto L6d
            L7b:
                if (r6 != 0) goto L87
                java.lang.String r8 = "Sessions SDK disabled. Not listening to lifecycle events."
                int r8 = android.util.Log.d(r4, r8)
                xy.f.a(r8)
                goto La1
            L87:
                com.google.firebase.FirebaseApp r8 = r0.f20886a
                com.google.firebase.remoteconfig.a r0 = new com.google.firebase.remoteconfig.a
                r1 = 1
                r0.<init>(r1)
                r8.b()
                java.util.concurrent.CopyOnWriteArrayList r8 = r8.f17723j
                r8.add(r0)
                goto La1
            L98:
                java.lang.String r8 = "No Sessions subscribers. Not listening to lifecycle events."
                int r8 = android.util.Log.d(r4, r8)
                xy.f.a(r8)
            La1:
                qy.b0 r8 = qy.b0.f48488a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.FirebaseSessions.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

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

    public FirebaseSessions(FirebaseApp firebaseApp, SessionsSettings settings, vy.i backgroundDispatcher, SessionsActivityLifecycleCallbacks sessionsActivityLifecycleCallbacks) {
        m.f(firebaseApp, "firebaseApp");
        m.f(settings, "settings");
        m.f(backgroundDispatcher, "backgroundDispatcher");
        m.f(sessionsActivityLifecycleCallbacks, "sessionsActivityLifecycleCallbacks");
        this.f20886a = firebaseApp;
        this.f20887b = settings;
        firebaseApp.b();
        Context applicationContext = firebaseApp.f17714a.getApplicationContext();
        if (!(applicationContext instanceof Application)) {
            applicationContext.getClass().toString();
        } else {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(sessionsActivityLifecycleCallbacks);
            e0.B(e0.c(backgroundDispatcher), null, null, new AnonymousClass1(sessionsActivityLifecycleCallbacks, null), 3);
        }
    }
}
