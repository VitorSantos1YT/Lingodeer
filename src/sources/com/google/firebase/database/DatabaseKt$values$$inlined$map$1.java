package com.google.firebase.database;

import kotlin.jvm.internal.m;
import qy.b0;
import uz.i;
import uz.j;
import vy.d;
import wy.a;
import xy.c;
import xy.e;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class DatabaseKt$values$$inlined$map$1 implements i {

    /* JADX INFO: renamed from: com.google.firebase.database.DatabaseKt$values$$inlined$map$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f18963a;

        @Override // xy.a
        public final Object invokeSuspend(Object obj) {
            this.f18963a = obj;
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.database.DatabaseKt$values$$inlined$map$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public final class AnonymousClass2<T> implements j {

        /* JADX INFO: renamed from: com.google.firebase.database.DatabaseKt$values$$inlined$map$1$2$1, reason: invalid class name */
        @e(c = "com.google.firebase.database.DatabaseKt$values$$inlined$map$1$2", f = "Database.kt", l = {50}, m = "emit")
        public final class AnonymousClass1 extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f18964a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f18965b;

            public AnonymousClass1(d dVar) {
                super(dVar);
            }

            @Override // xy.a
            public final Object invokeSuspend(Object obj) {
                this.f18964a = obj;
                this.f18965b |= Integer.MIN_VALUE;
                AnonymousClass2.this.emit(null, this);
                return b0.f48488a;
            }
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // uz.j
        public final Object emit(Object obj, d dVar) {
            AnonymousClass1 anonymousClass1;
            if (dVar instanceof AnonymousClass1) {
                anonymousClass1 = (AnonymousClass1) dVar;
                int i11 = anonymousClass1.f18965b;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    anonymousClass1.f18965b = i11 - Integer.MIN_VALUE;
                } else {
                    anonymousClass1 = new AnonymousClass1(dVar);
                }
            } else {
                anonymousClass1 = new AnonymousClass1(dVar);
            }
            Object obj2 = anonymousClass1.f18964a;
            a aVar = a.COROUTINE_SUSPENDED;
            int i12 = anonymousClass1.f18965b;
            if (i12 != 0) {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.e.F(obj2);
                return b0.f48488a;
            }
            com.bumptech.glide.e.F(obj2);
            m.m();
            throw null;
        }
    }

    @Override // uz.i
    public final Object collect(j jVar, d dVar) {
        m.m();
        throw null;
    }
}
