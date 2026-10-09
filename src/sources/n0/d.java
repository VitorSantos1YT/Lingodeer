package n0;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements z1.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f42930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f42931b = new ArrayList();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(xy.c cVar) throws Throwable {
        c cVar2;
        kotlin.jvm.internal.y yVar;
        Throwable th2;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i11 = cVar2.f42928d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                cVar2.f42928d = i11 - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(this, cVar);
            }
        } else {
            cVar2 = new c(this, cVar);
        }
        Object obj = cVar2.f42926b;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = cVar2.f42928d;
        ArrayList arrayList = this.f42931b;
        if (i12 == 0) {
            com.bumptech.glide.e.F(obj);
            if (!this.f42930a) {
                kotlin.jvm.internal.y yVar2 = new kotlin.jvm.internal.y();
                try {
                    cVar2.f42925a = yVar2;
                    cVar2.f42928d = 1;
                    rz.m mVar = new rz.m(1, ue.f.x(cVar2));
                    mVar.s();
                    yVar2.f38361a = mVar;
                    arrayList.add(mVar);
                    if (mVar.r() == aVar) {
                        return aVar;
                    }
                    yVar = yVar2;
                    Object obj2 = yVar.f38361a;
                    kotlin.jvm.internal.c0.a(arrayList);
                    arrayList.remove(obj2);
                } catch (Throwable th3) {
                    yVar = yVar2;
                    th2 = th3;
                    Object obj3 = yVar.f38361a;
                    kotlin.jvm.internal.c0.a(arrayList);
                    arrayList.remove(obj3);
                    throw th2;
                }
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yVar = cVar2.f42925a;
            try {
                com.bumptech.glide.e.F(obj);
                Object obj4 = yVar.f38361a;
                kotlin.jvm.internal.c0.a(arrayList);
                arrayList.remove(obj4);
            } catch (Throwable th4) {
                th2 = th4;
                Object obj5 = yVar.f38361a;
                kotlin.jvm.internal.c0.a(arrayList);
                arrayList.remove(obj5);
                throw th2;
            }
        }
        return qy.b0.f48488a;
    }
}
