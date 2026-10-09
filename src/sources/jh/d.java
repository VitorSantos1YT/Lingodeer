package jh;

import java.util.ArrayList;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends xy.i implements fz.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ int f36344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ boolean f36345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ ArrayList f36346c;

    @Override // fz.h
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int iIntValue = ((Number) obj).intValue();
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        d dVar = new d(5, (vy.d) obj5);
        dVar.f36344a = iIntValue;
        dVar.f36345b = zBooleanValue;
        dVar.f36346c = (ArrayList) obj3;
        return dVar.invokeSuspend(b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f36344a;
        boolean z11 = this.f36345b;
        ArrayList arrayList = this.f36346c;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        com.bumptech.glide.e.F(obj);
        return new b(i11, arrayList, z11);
    }
}
