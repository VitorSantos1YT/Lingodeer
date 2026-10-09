package com.google.firebase.datastorage;

import r5.b;
import ry.s;
import rz.b0;
import uz.x0;
import vy.d;
import xy.e;
import xy.i;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@e(c = "com.google.firebase.datastorage.JavaDataStorage$getAllSync$1", f = "JavaDataStorage.kt", l = {170}, m = "invokeSuspend")
final class JavaDataStorage$getAllSync$1 extends i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f19608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ JavaDataStorage f19609b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JavaDataStorage$getAllSync$1(JavaDataStorage javaDataStorage, d dVar) {
        super(2, dVar);
        this.f19609b = javaDataStorage;
    }

    @Override // xy.a
    public final d create(Object obj, d dVar) {
        return new JavaDataStorage$getAllSync$1(this.f19609b, dVar);
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((JavaDataStorage$getAllSync$1) create((b0) obj, (d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f19608a;
        if (i11 == 0) {
            com.bumptech.glide.e.F(obj);
            uz.i data = this.f19609b.f19602c.getData();
            this.f19608a = 1;
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
        return bVar != null ? bVar.a() : s.f50855a;
    }
}
