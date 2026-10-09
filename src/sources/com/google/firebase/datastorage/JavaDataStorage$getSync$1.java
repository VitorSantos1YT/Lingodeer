package com.google.firebase.datastorage;

import r5.b;
import r5.d;
import rz.b0;
import uz.x0;
import xy.e;
import xy.i;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@e(c = "com.google.firebase.datastorage.JavaDataStorage$getSync$1", f = "JavaDataStorage.kt", l = {104}, m = "invokeSuspend")
final class JavaDataStorage$getSync$1 extends i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f19610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ JavaDataStorage f19611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f19612c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JavaDataStorage$getSync$1(JavaDataStorage javaDataStorage, d dVar, vy.d dVar2) {
        super(2, dVar2);
        this.f19611b = javaDataStorage;
        this.f19612c = dVar;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        return new JavaDataStorage$getSync$1(this.f19611b, this.f19612c, dVar);
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((JavaDataStorage$getSync$1) create((b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        Object objC;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f19610a;
        if (i11 == 0) {
            com.bumptech.glide.e.F(obj);
            uz.i data = this.f19611b.f19602c.getData();
            this.f19610a = 1;
            obj = x0.v(data, this);
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
        if (bVar == null || (objC = bVar.c(this.f19612c)) == null) {
            return -1L;
        }
        return objC;
    }
}
