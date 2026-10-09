package rt;

import com.yalantis.ucrop.view.CropImageView;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class lf extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ps.h f50036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f50037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f50038c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mf f50039d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f50040e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lf(mf mfVar, long j11, vy.d dVar) {
        super(2, dVar);
        this.f50039d = mfVar;
        this.f50040e = j11;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        return new lf(this.f50039d, this.f50040e, dVar);
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((lf) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        Object next;
        ps.h hVar;
        Object obj2;
        float f5;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f50038c;
        qy.b0 b0Var = qy.b0.f48488a;
        long j11 = this.f50040e;
        mf mfVar = this.f50039d;
        try {
            if (i11 == 0) {
                com.bumptech.glide.e.F(obj);
                Iterator it = ((jf) mfVar.f50103d.getValue()).f49948a.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (((ps.b) next).f47122a != j11);
                ps.b bVar = (ps.b) next;
                if (bVar == null) {
                    return b0Var;
                }
                ps.h hVar2 = bVar.f47127f;
                float f11 = bVar.f47128g;
                mfVar.f50106t.add(new Long(j11));
                mfVar.c(j11, ps.c.f47130a, CropImageView.DEFAULT_ASPECT_RATIO);
                ot.l2 l2Var = mfVar.f50102c;
                List list = bVar.f47126e;
                this.f50036a = hVar2;
                this.f50037b = f11;
                this.f50038c = 1;
                Object objA = l2Var.a(j11, list, this);
                if (objA == aVar) {
                    return aVar;
                }
                hVar = hVar2;
                obj2 = objA;
                f5 = f11;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f5 = this.f50037b;
                hVar = this.f50036a;
                com.bumptech.glide.e.F(obj);
                obj2 = ((qy.o) obj).f48498a;
            }
            if (qy.o.a(obj2) == null) {
                mfVar.c(j11, ps.f.f47133a, CropImageView.DEFAULT_ASPECT_RATIO);
            } else {
                mfVar.c(j11, hVar, f5);
            }
            mfVar.f50106t.remove(new Long(j11));
            return b0Var;
        } catch (Throwable th2) {
            mfVar.f50106t.remove(new Long(j11));
            throw th2;
        }
    }
}
