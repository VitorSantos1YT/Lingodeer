package com.google.firebase.datastorage;

import n5.f;
import qy.b0;
import r5.b;
import r5.d;
import xy.e;
import xy.i;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@e(c = "com.google.firebase.datastorage.JavaDataStorage$putSync$1", f = "JavaDataStorage.kt", l = {145}, m = "invokeSuspend")
final class JavaDataStorage$putSync$1 extends i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f19613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ JavaDataStorage f19614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f19615c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Long f19616d;

    /* JADX INFO: renamed from: com.google.firebase.datastorage.JavaDataStorage$putSync$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    @e(c = "com.google.firebase.datastorage.JavaDataStorage$putSync$1$1", f = "JavaDataStorage.kt", l = {}, m = "invokeSuspend")
    final class AnonymousClass1 extends i implements fz.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f19617a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d f19618b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Long f19619c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(d dVar, Long l9, vy.d dVar2) {
            super(2, dVar2);
            this.f19618b = dVar;
            this.f19619c = l9;
        }

        @Override // xy.a
        public final vy.d create(Object obj, vy.d dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f19618b, this.f19619c, dVar);
            anonymousClass1.f19617a = obj;
            return anonymousClass1;
        }

        @Override // fz.e
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((b) obj, (vy.d) obj2);
            b0 b0Var = b0.f48488a;
            anonymousClass1.invokeSuspend(b0Var);
            return b0Var;
        }

        @Override // xy.a
        public final Object invokeSuspend(Object obj) {
            wy.a aVar = wy.a.COROUTINE_SUSPENDED;
            com.bumptech.glide.e.F(obj);
            ((b) this.f19617a).e(this.f19618b, this.f19619c);
            return b0.f48488a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JavaDataStorage$putSync$1(JavaDataStorage javaDataStorage, d dVar, Long l9, vy.d dVar2) {
        super(2, dVar2);
        this.f19614b = javaDataStorage;
        this.f19615c = dVar;
        this.f19616d = l9;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        return new JavaDataStorage$putSync$1(this.f19614b, this.f19615c, this.f19616d, dVar);
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((JavaDataStorage$putSync$1) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f19613a;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(obj);
            return obj;
        }
        com.bumptech.glide.e.F(obj);
        f fVar = this.f19614b.f19602c;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f19615c, this.f19616d, null);
        this.f19613a = 1;
        Object objA = fVar.a(new ca.d(anonymousClass1, (vy.d) null, 3), this);
        return objA == aVar ? aVar : objA;
    }
}
