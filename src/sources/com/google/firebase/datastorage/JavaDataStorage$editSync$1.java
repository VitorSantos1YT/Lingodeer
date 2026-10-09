package com.google.firebase.datastorage;

import fz.c;
import kotlin.jvm.internal.m;
import n5.f;
import qy.b0;
import r5.b;
import vy.d;
import xy.e;
import xy.i;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@e(c = "com.google.firebase.datastorage.JavaDataStorage$editSync$1", f = "JavaDataStorage.kt", l = {220}, m = "invokeSuspend")
final class JavaDataStorage$editSync$1 extends i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f19603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ JavaDataStorage f19604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f19605c;

    /* JADX INFO: renamed from: com.google.firebase.datastorage.JavaDataStorage$editSync$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    @e(c = "com.google.firebase.datastorage.JavaDataStorage$editSync$1$1", f = "JavaDataStorage.kt", l = {}, m = "invokeSuspend")
    final class AnonymousClass1 extends i implements fz.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f19606a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c f19607b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(c cVar, d dVar) {
            super(2, dVar);
            this.f19607b = cVar;
        }

        @Override // xy.a
        public final d create(Object obj, d dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f19607b, dVar);
            anonymousClass1.f19606a = obj;
            return anonymousClass1;
        }

        @Override // fz.e
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((b) obj, (d) obj2);
            b0 b0Var = b0.f48488a;
            anonymousClass1.invokeSuspend(b0Var);
            return b0Var;
        }

        @Override // xy.a
        public final Object invokeSuspend(Object obj) {
            wy.a aVar = wy.a.COROUTINE_SUSPENDED;
            com.bumptech.glide.e.F(obj);
            this.f19607b.invoke((b) this.f19606a);
            return b0.f48488a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JavaDataStorage$editSync$1(JavaDataStorage javaDataStorage, c cVar, d dVar) {
        super(2, dVar);
        this.f19604b = javaDataStorage;
        this.f19605c = cVar;
    }

    @Override // xy.a
    public final d create(Object obj, d dVar) {
        return new JavaDataStorage$editSync$1(this.f19604b, this.f19605c, dVar);
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((JavaDataStorage$editSync$1) create((rz.b0) obj, (d) obj2)).invokeSuspend(b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        JavaDataStorage javaDataStorage = this.f19604b;
        ThreadLocal threadLocal = javaDataStorage.f19601b;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f19603a;
        try {
            if (i11 == 0) {
                com.bumptech.glide.e.F(obj);
                Object obj2 = threadLocal.get();
                Boolean bool = Boolean.TRUE;
                if (m.a(obj2, bool)) {
                    throw new IllegalStateException("Don't call JavaDataStorage.edit() from within an existing edit() callback.\nThis causes deadlocks, and is generally indicative of a code smell.\nInstead, either pass around the initial `MutablePreferences` instance, or don't do everything in a single callback. ");
                }
                threadLocal.set(bool);
                f fVar = javaDataStorage.f19602c;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f19605c, null);
                this.f19603a = 1;
                obj = fVar.a(new ca.d(anonymousClass1, (d) null, 3), this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.e.F(obj);
            }
            b bVar = (b) obj;
            threadLocal.set(Boolean.FALSE);
            return bVar;
        } catch (Throwable th2) {
            threadLocal.set(Boolean.FALSE);
            throw th2;
        }
    }
}
