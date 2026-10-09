package f3;

import k3.o;
import k3.r;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f26611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f26612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f26613c;

    public g(int i11, c cVar) {
        this.f26611a = i11;
        this.f26613c = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    public float a(int i11, boolean z11, boolean z12, boolean z13) {
        boolean z14;
        r rVar = (r) this.f26613c;
        int i12 = 1;
        if (z11) {
            int iD = o.d(rVar.f37894f, i11, z11);
            int lineStart = rVar.f37894f.getLineStart(iD);
            int iF = rVar.f(iD);
            if (i11 == lineStart || i11 == iF) {
                z14 = true;
            } else {
                z14 = false;
            }
        } else {
            z14 = false;
        }
        int i13 = i11 * 4;
        if (!z13) {
            i12 = z14 ? 2 : 3;
        } else if (z14) {
            i12 = 0;
        }
        int i14 = i13 + i12;
        if (this.f26611a == i14) {
            return this.f26612b;
        }
        float fH = z13 ? rVar.h(i11, z11) : rVar.i(i11, z11);
        if (z12) {
            this.f26611a = i14;
            this.f26612b = fH;
        }
        return fH;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object b(float f5, xy.c cVar) {
        f fVar;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i11 = fVar.f26610c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                fVar.f26610c = i11 - Integer.MIN_VALUE;
            } else {
                fVar = new f(this, cVar);
            }
        } else {
            fVar = new f(this, cVar);
        }
        Object objInvoke = fVar.f26608a;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = fVar.f26610c;
        if (i12 == 0) {
            com.bumptech.glide.e.F(objInvoke);
            c cVar2 = (c) this.f26613c;
            Float f11 = new Float(f5);
            fVar.f26610c = 1;
            objInvoke = cVar2.invoke(f11, fVar);
            if (objInvoke == aVar) {
                return aVar;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(objInvoke);
        }
        this.f26612b += ((Number) objInvoke).floatValue();
        return b0.f48488a;
    }

    public g(r rVar) {
        this.f26613c = rVar;
        this.f26611a = -1;
    }
}
