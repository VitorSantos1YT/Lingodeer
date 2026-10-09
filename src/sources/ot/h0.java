package ot;

import androidx.compose.ui.viewinterop.AndroidViewHolder;
import java.io.File;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class h0 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f45831a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f45832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f45833c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f45834d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f45835e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(i0 i0Var, boolean z11, long j11, int i11, vy.d dVar) {
        super(2, dVar);
        this.f45835e = i0Var;
        this.f45833c = z11;
        this.f45834d = j11;
        this.f45832b = i11;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f45831a) {
            case 0:
                return new h0((i0) this.f45835e, this.f45833c, this.f45834d, this.f45832b, dVar);
            default:
                return new h0(this.f45833c, (AndroidViewHolder) this.f45835e, this.f45834d, dVar);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f45831a) {
            case 0:
                break;
        }
        return ((h0) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        Object objA;
        Object objA2;
        int i11 = this.f45831a;
        boolean z11 = this.f45833c;
        Object obj2 = this.f45835e;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                xt.a aVarA = xt.b.a();
                vt.n0 n0Var = ((i0) obj2).f45851a;
                int iX = ((fr.o0) n0Var).x();
                ArrayList arrayList = new ArrayList();
                int i12 = this.f45832b;
                long j11 = this.f45834d;
                if (iX != -1) {
                    qy.q qVar = fv.b.f28186a;
                    arrayList.add(new fv.a(fv.g.j(j11, "m"), defpackage.e.m(aVarA.j(), fv.b.p(j11)), fv.b.p(j11)));
                    arrayList.add(new fv.a(fv.g.j(j11, "f"), defpackage.e.m(aVarA.i(), fv.b.o(j11)), fv.b.o(j11)));
                } else {
                    qy.q qVar2 = fv.b.f28186a;
                    arrayList.add(new fv.a(2L, fv.b.q(j11), fv.b.n(j11)));
                }
                qy.q qVar3 = fv.b.f28186a;
                arrayList.add(new fv.a(3L, fv.g.k(j11), fv.b.s(j11)));
                if (ry.l.D(new Integer[]{new Integer(0), new Integer(11), new Integer(7), new Integer(2), new Integer(13), new Integer(1), new Integer(51), new Integer(55), new Integer(12), new Integer(63), new Integer(65), new Integer(57), new Integer(61)}, new Integer(i12))) {
                    if (iX != -1) {
                        arrayList.add(new fv.a(fv.g.e(j11, "m"), defpackage.e.m(aVarA.d(), fv.b.h(j11)), fv.b.h(j11)));
                        arrayList.add(new fv.a(fv.g.e(j11, "f"), defpackage.e.m(aVarA.c(), fv.b.g(j11)), fv.b.g(j11)));
                    } else {
                        arrayList.add(new fv.a(1L, fv.b.i(j11), fv.b.f(j11)));
                    }
                }
                if (((fr.o0) n0Var).f27733a.enableNativeSpeakerVideos && xt.d.j(i12)) {
                    if (xt.d.w(i12)) {
                        arrayList.add(new fv.a(11L, fv.b.t(j11), fv.b.u(j11)));
                    }
                    if (xt.d.g(i12)) {
                        arrayList.add(new fv.a(12L, fv.b.r(j11), fv.b.u(j11)));
                    }
                }
                if (!z11) {
                    return arrayList;
                }
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                int i13 = 0;
                while (i13 < size) {
                    Object obj3 = arrayList.get(i13);
                    i13++;
                    if (!new File(((fv.a) obj3).f28184c).exists()) {
                        arrayList2.add(obj3);
                    }
                }
                return arrayList2;
            default:
                AndroidViewHolder androidViewHolder = (AndroidViewHolder) obj2;
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i14 = this.f45832b;
                if (i14 == 0) {
                    com.bumptech.glide.e.F(obj);
                    if (z11) {
                        r2.d dVar = androidViewHolder.f1216a;
                        this.f45832b = 2;
                        objA = dVar.a(this.f45834d, 0L, this);
                        if (objA == aVar2) {
                            return aVar2;
                        }
                        ((v3.q) objA).getClass();
                    } else {
                        r2.d dVar2 = androidViewHolder.f1216a;
                        this.f45832b = 1;
                        objA2 = dVar2.a(0L, this.f45834d, this);
                        if (objA2 == aVar2) {
                            return aVar2;
                        }
                        ((v3.q) objA2).getClass();
                    }
                } else if (i14 == 1) {
                    com.bumptech.glide.e.F(obj);
                    objA2 = obj;
                    ((v3.q) objA2).getClass();
                } else {
                    if (i14 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    objA = obj;
                    ((v3.q) objA).getClass();
                }
                return qy.b0.f48488a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(boolean z11, AndroidViewHolder androidViewHolder, long j11, vy.d dVar) {
        super(2, dVar);
        this.f45833c = z11;
        this.f45835e = androidViewHolder;
        this.f45834d = j11;
    }
}
