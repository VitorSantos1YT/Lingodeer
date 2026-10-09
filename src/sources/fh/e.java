package fh;

import rz.e0;
import rz.o0;
import yz.f;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a00.e f27293a = new a00.e();

    public e(gh.e eVar) {
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public final Object a(String str, String str2, int i11, int i12, xy.c cVar) throws Throwable {
        a aVar;
        String str3;
        int i13;
        String str4;
        a00.a aVar2;
        int i14;
        int i15;
        a00.a aVar3;
        if (cVar instanceof a) {
            aVar = (a) cVar;
            int i16 = aVar.K;
            if ((i16 & Integer.MIN_VALUE) != 0) {
                aVar.K = i16 - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, cVar);
            }
        } else {
            aVar = new a(this, cVar);
        }
        a aVar4 = aVar;
        Object objM = aVar4.f27275t;
        wy.a aVar5 = wy.a.COROUTINE_SUSPENDED;
        int i17 = aVar4.K;
        try {
            if (i17 == 0) {
                com.bumptech.glide.e.F(objM);
                aVar4.f27269a = str;
                aVar4.f27270b = str2;
                a00.e eVar = this.f27293a;
                aVar4.f27271c = eVar;
                aVar4.f27272d = i11;
                aVar4.f27273e = i12;
                aVar4.f27274f = 0;
                aVar4.K = 1;
                if (eVar.b(aVar4) != aVar5) {
                    str3 = str2;
                    i13 = 0;
                    str4 = str;
                    aVar2 = eVar;
                    i14 = i11;
                    i15 = i12;
                }
                return aVar5;
            }
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar3 = aVar4.f27271c;
                try {
                    com.bumptech.glide.e.F(objM);
                    aVar3.a(null);
                    return objM;
                } catch (Throwable th2) {
                    th = th2;
                    aVar3.a(null);
                    throw th;
                }
            }
            int i18 = aVar4.f27274f;
            int i19 = aVar4.f27273e;
            i14 = aVar4.f27272d;
            a00.a aVar6 = aVar4.f27271c;
            String str5 = aVar4.f27270b;
            String str6 = aVar4.f27269a;
            com.bumptech.glide.e.F(objM);
            i13 = i18;
            str4 = str6;
            aVar2 = aVar6;
            i15 = i19;
            str3 = str5;
            f fVar = o0.f50940a;
            yz.e eVar2 = yz.e.f58387a;
            b bVar = new b(str4, str3, i14, i15, this, null);
            aVar4.f27269a = null;
            aVar4.f27270b = null;
            aVar4.f27271c = aVar2;
            aVar4.f27272d = i14;
            aVar4.f27273e = i15;
            aVar4.f27274f = i13;
            aVar4.K = 2;
            objM = e0.M(eVar2, bVar, aVar4);
            if (objM != aVar5) {
                aVar3 = aVar2;
                aVar3.a(null);
                return objM;
            }
            return aVar5;
        } catch (Throwable th3) {
            th = th3;
            aVar3 = aVar2;
            aVar3.a(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, xy.c cVar) {
        c cVar2;
        a00.a aVar;
        int i11;
        Throwable th2;
        a00.a aVar2;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i12 = cVar2.f27288f;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                cVar2.f27288f = i12 - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(this, cVar);
            }
        } else {
            cVar2 = new c(this, cVar);
        }
        Object obj = cVar2.f27286d;
        wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
        int i13 = cVar2.f27288f;
        try {
            if (i13 == 0) {
                com.bumptech.glide.e.F(obj);
                cVar2.f27283a = str;
                aVar = this.f27293a;
                cVar2.f27284b = aVar;
                i11 = 0;
                cVar2.f27285c = 0;
                cVar2.f27288f = 1;
                if (aVar.b(cVar2) != aVar3) {
                }
                return aVar3;
            }
            if (i13 != 1) {
                if (i13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar2 = cVar2.f27284b;
                try {
                    com.bumptech.glide.e.F(obj);
                    aVar2.a(null);
                    return obj;
                } catch (Throwable th3) {
                    th2 = th3;
                    aVar2.a(null);
                    throw th2;
                }
            }
            int i14 = cVar2.f27285c;
            a00.a aVar4 = cVar2.f27284b;
            String str2 = cVar2.f27283a;
            com.bumptech.glide.e.F(obj);
            aVar = aVar4;
            i11 = i14;
            str = str2;
            f fVar = o0.f50940a;
            yz.e eVar = yz.e.f58387a;
            d dVar = new d(this, str, null);
            cVar2.f27283a = null;
            cVar2.f27284b = aVar;
            cVar2.f27285c = i11;
            cVar2.f27288f = 2;
            Object objM = e0.M(eVar, dVar, cVar2);
            if (objM != aVar3) {
                a00.a aVar5 = aVar;
                obj = objM;
                aVar2 = aVar5;
                aVar2.a(null);
                return obj;
            }
            return aVar3;
        } catch (Throwable th4) {
            a00.a aVar6 = aVar;
            th2 = th4;
            aVar2 = aVar6;
            aVar2.a(null);
            throw th2;
        }
    }
}
