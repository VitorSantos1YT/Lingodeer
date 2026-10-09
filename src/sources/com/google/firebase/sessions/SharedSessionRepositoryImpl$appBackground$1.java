package com.google.firebase.sessions;

import kotlin.jvm.internal.m;
import n5.f;
import qy.b0;
import vy.d;
import xy.e;
import xy.i;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@e(c = "com.google.firebase.sessions.SharedSessionRepositoryImpl$appBackground$1", f = "SharedSessionRepository.kt", l = {118}, m = "invokeSuspend")
final class SharedSessionRepositoryImpl$appBackground$1 extends i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f21001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SharedSessionRepositoryImpl f21002b;

    /* JADX INFO: renamed from: com.google.firebase.sessions.SharedSessionRepositoryImpl$appBackground$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    @e(c = "com.google.firebase.sessions.SharedSessionRepositoryImpl$appBackground$1$1", f = "SharedSessionRepository.kt", l = {}, m = "invokeSuspend")
    final class AnonymousClass1 extends i implements fz.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f21003a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ SharedSessionRepositoryImpl f21004b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SharedSessionRepositoryImpl sharedSessionRepositoryImpl, d dVar) {
            super(2, dVar);
            this.f21004b = sharedSessionRepositoryImpl;
        }

        @Override // xy.a
        public final d create(Object obj, d dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f21004b, dVar);
            anonymousClass1.f21003a = obj;
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
            return SessionData.a((SessionData) this.f21003a, null, this.f21004b.f20985e.a(), null, 5);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedSessionRepositoryImpl$appBackground$1(SharedSessionRepositoryImpl sharedSessionRepositoryImpl, d dVar) {
        super(2, dVar);
        this.f21002b = sharedSessionRepositoryImpl;
    }

    @Override // xy.a
    public final d create(Object obj, d dVar) {
        return new SharedSessionRepositoryImpl$appBackground$1(this.f21002b, dVar);
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((SharedSessionRepositoryImpl$appBackground$1) create((rz.b0) obj, (d) obj2)).invokeSuspend(b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f21001a;
        SharedSessionRepositoryImpl sharedSessionRepositoryImpl = this.f21002b;
        try {
            if (i11 == 0) {
                com.bumptech.glide.e.F(obj);
                f fVar = sharedSessionRepositoryImpl.f20986f;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(sharedSessionRepositoryImpl, null);
                this.f21001a = 1;
                if (fVar.a(anonymousClass1, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.e.F(obj);
            }
        } catch (Exception e8) {
            e8.getMessage();
            SessionData sessionData = sharedSessionRepositoryImpl.f20989i;
            if (sessionData == null) {
                m.n("localSessionData");
                throw null;
            }
            sharedSessionRepositoryImpl.f20989i = SessionData.a(sessionData, null, sharedSessionRepositoryImpl.f20985e.a(), null, 5);
        }
        return b0.f48488a;
    }
}
