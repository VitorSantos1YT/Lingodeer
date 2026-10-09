package com.google.firebase.sessions;

import java.util.Map;
import qy.b0;
import vy.d;
import xy.e;
import xy.i;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@e(c = "com.google.firebase.sessions.SharedSessionRepositoryImpl$appForeground$1", f = "SharedSessionRepository.kt", l = {142, 193}, m = "invokeSuspend")
final class SharedSessionRepositoryImpl$appForeground$1 extends i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f21005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SharedSessionRepositoryImpl f21006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SessionData f21007c;

    /* JADX INFO: renamed from: com.google.firebase.sessions.SharedSessionRepositoryImpl$appForeground$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    @e(c = "com.google.firebase.sessions.SharedSessionRepositoryImpl$appForeground$1$1", f = "SharedSessionRepository.kt", l = {}, m = "invokeSuspend")
    final class AnonymousClass1 extends i implements fz.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f21008a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ SharedSessionRepositoryImpl f21009b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SharedSessionRepositoryImpl sharedSessionRepositoryImpl, d dVar) {
            super(2, dVar);
            this.f21009b = sharedSessionRepositoryImpl;
        }

        @Override // xy.a
        public final d create(Object obj, d dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f21009b, dVar);
            anonymousClass1.f21008a = obj;
            return anonymousClass1;
        }

        @Override // fz.e
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((SessionData) obj, (d) obj2)).invokeSuspend(b0.f48488a);
        }

        @Override // xy.a
        public final Object invokeSuspend(Object obj) {
            wy.a aVar = wy.a.COROUTINE_SUSPENDED;
            com.bumptech.glide.e.F(obj);
            SessionData sessionData = (SessionData) this.f21008a;
            SharedSessionRepositoryImpl sharedSessionRepositoryImpl = this.f21009b;
            ProcessDataManager processDataManager = sharedSessionRepositoryImpl.f20987g;
            boolean zE = sharedSessionRepositoryImpl.e(sessionData);
            Map mapF = sessionData.f20931c;
            boolean zD = true;
            boolean zB = mapF != null ? processDataManager.b(mapF) : true;
            if (mapF == null || (zD = processDataManager.d(mapF))) {
                processDataManager.c();
            }
            if (zB) {
                mapF = processDataManager.e();
            } else if (zD) {
                mapF = processDataManager.f(mapF);
            }
            SessionDetails sessionDetails = zB ? null : sessionData.f20929a;
            if (!zE && !zB) {
                return zD ? SessionData.a(sessionData, null, null, processDataManager.f(mapF), 3) : sessionData;
            }
            SessionDetails sessionDetailsA = sharedSessionRepositoryImpl.f20983c.a(sessionDetails);
            sharedSessionRepositoryImpl.f20984d.a(sessionDetailsA);
            processDataManager.a();
            return new SessionData(sessionDetailsA, null, mapF);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedSessionRepositoryImpl$appForeground$1(SharedSessionRepositoryImpl sharedSessionRepositoryImpl, SessionData sessionData, d dVar) {
        super(2, dVar);
        this.f21006b = sharedSessionRepositoryImpl;
        this.f21007c = sessionData;
    }

    @Override // xy.a
    public final d create(Object obj, d dVar) {
        return new SharedSessionRepositoryImpl$appForeground$1(this.f21006b, this.f21007c, dVar);
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((SharedSessionRepositoryImpl$appForeground$1) create((rz.b0) obj, (d) obj2)).invokeSuspend(b0.f48488a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        if (r7.a(r1, r6) == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005d, code lost:
    
        if (com.google.firebase.sessions.SharedSessionRepositoryImpl.d(r5, r7, r1, r6) == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005f, code lost:
    
        return r0;
     */
    @Override // xy.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            wy.a r0 = wy.a.COROUTINE_SUSPENDED
            int r1 = r6.f21005a
            r2 = 0
            r3 = 2
            r4 = 1
            com.google.firebase.sessions.SharedSessionRepositoryImpl r5 = r6.f21006b
            if (r1 == 0) goto L21
            if (r1 == r4) goto L1b
            if (r1 != r3) goto L13
            com.bumptech.glide.e.F(r7)
            goto L60
        L13:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1b:
            com.bumptech.glide.e.F(r7)     // Catch: java.lang.Exception -> L1f
            goto L60
        L1f:
            r7 = move-exception
            goto L34
        L21:
            com.bumptech.glide.e.F(r7)
            n5.f r7 = r5.f20986f     // Catch: java.lang.Exception -> L1f
            com.google.firebase.sessions.SharedSessionRepositoryImpl$appForeground$1$1 r1 = new com.google.firebase.sessions.SharedSessionRepositoryImpl$appForeground$1$1     // Catch: java.lang.Exception -> L1f
            r1.<init>(r5, r2)     // Catch: java.lang.Exception -> L1f
            r6.f21005a = r4     // Catch: java.lang.Exception -> L1f
            java.lang.Object r7 = r7.a(r1, r6)     // Catch: java.lang.Exception -> L1f
            if (r7 != r0) goto L60
            goto L5f
        L34:
            r7.getMessage()
            com.google.firebase.sessions.SessionData r7 = r6.f21007c
            boolean r1 = r5.e(r7)
            if (r1 == 0) goto L60
            com.google.firebase.sessions.SessionGenerator r1 = r5.f20983c
            com.google.firebase.sessions.SessionDetails r4 = r7.f20929a
            com.google.firebase.sessions.SessionDetails r1 = r1.a(r4)
            r4 = 4
            com.google.firebase.sessions.SessionData r7 = com.google.firebase.sessions.SessionData.a(r7, r1, r2, r2, r4)
            r5.f20989i = r7
            com.google.firebase.sessions.SessionFirelogPublisher r7 = r5.f20984d
            r7.a(r1)
            java.lang.String r7 = r1.f20935a
            com.google.firebase.sessions.SharedSessionRepositoryImpl$NotificationType r1 = com.google.firebase.sessions.SharedSessionRepositoryImpl.NotificationType.FALLBACK
            r6.f21005a = r3
            java.lang.Object r7 = com.google.firebase.sessions.SharedSessionRepositoryImpl.d(r5, r7, r1, r6)
            if (r7 != r0) goto L60
        L5f:
            return r0
        L60:
            qy.b0 r7 = qy.b0.f48488a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.SharedSessionRepositoryImpl$appForeground$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
