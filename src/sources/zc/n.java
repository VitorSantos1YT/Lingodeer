package zc;

import android.graphics.PointF;
import ob.u;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends u {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ld.b f59127d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u f59128e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dd.c f59129f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(ld.b bVar, u uVar, dd.c cVar) {
        super(19);
        this.f59127d = bVar;
        this.f59128e = uVar;
        this.f59129f = cVar;
    }

    @Override // ob.u
    public final Object t(ld.b bVar) {
        float f5 = bVar.f39903a;
        float f11 = bVar.f39904b;
        String str = ((dd.c) bVar.f39905c).f23357a;
        String str2 = ((dd.c) bVar.f39906d).f23357a;
        float f12 = bVar.f39907e;
        float f13 = bVar.f39908f;
        float f14 = bVar.f39909g;
        ld.b bVar2 = this.f59127d;
        bVar2.f39903a = f5;
        bVar2.f39904b = f11;
        bVar2.f39905c = str;
        bVar2.f39906d = str2;
        bVar2.f39907e = f12;
        bVar2.f39908f = f13;
        bVar2.f39909g = f14;
        String str3 = (String) this.f59128e.t(bVar2);
        dd.c cVar = (dd.c) (bVar.f39908f == 1.0f ? bVar.f39906d : bVar.f39905c);
        String str4 = cVar.f23358b;
        float f15 = cVar.f23359c;
        dd.b bVar3 = cVar.f23360d;
        int i11 = cVar.f23361e;
        float f16 = cVar.f23362f;
        float f17 = cVar.f23363g;
        int i12 = cVar.f23364h;
        int i13 = cVar.f23365i;
        float f18 = cVar.f23366j;
        boolean z11 = cVar.f23367k;
        PointF pointF = cVar.f23368l;
        PointF pointF2 = cVar.m;
        dd.c cVar2 = this.f59129f;
        cVar2.f23357a = str3;
        cVar2.f23358b = str4;
        cVar2.f23359c = f15;
        cVar2.f23360d = bVar3;
        cVar2.f23361e = i11;
        cVar2.f23362f = f16;
        cVar2.f23363g = f17;
        cVar2.f23364h = i12;
        cVar2.f23365i = i13;
        cVar2.f23366j = f18;
        cVar2.f23367k = z11;
        cVar2.f23368l = pointF;
        cVar2.m = pointF2;
        return cVar2;
    }
}
