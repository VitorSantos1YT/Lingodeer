package hs;

import com.lingodeer.data.model.chinesetone.ChineseToneWord;
import java.util.List;
import ry.r;
import rz.b0;
import vt.g0;
import xy.i;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f33705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f33706c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f33707d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(g gVar, long j11, vy.d dVar, int i11) {
        super(2, dVar);
        this.f33704a = i11;
        this.f33706c = gVar;
        this.f33707d = j11;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f33704a) {
            case 0:
                return new c(this.f33706c, this.f33707d, dVar, 0);
            case 1:
                return new c(this.f33706c, this.f33707d, dVar, 1);
            default:
                return new c(this.f33706c, this.f33707d, dVar, 2);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        b0 b0Var = (b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f33704a) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((c) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f33704a) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f33705b;
                r rVar = r.f50854a;
                try {
                    if (i11 == 0) {
                        com.bumptech.glide.e.F(obj);
                        g0 g0Var = this.f33706c.f33721a;
                        long j11 = this.f33707d;
                        this.f33705b = 1;
                        obj = ((ds.g) g0Var).e(rVar, new bh.b(j11, null, 9), this);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.bumptech.glide.e.F(obj);
                    }
                    return (List) obj;
                } catch (Exception unused) {
                    return rVar;
                }
            case 1:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f33705b;
                r rVar2 = r.f50854a;
                try {
                    if (i12 == 0) {
                        com.bumptech.glide.e.F(obj);
                        g0 g0Var2 = this.f33706c.f33721a;
                        long j12 = this.f33707d;
                        this.f33705b = 1;
                        obj = ((ds.g) g0Var2).e(rVar2, new bh.b(j12, null, 10), this);
                        if (obj == aVar2) {
                            return aVar2;
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.bumptech.glide.e.F(obj);
                    }
                    return (List) obj;
                } catch (Exception unused2) {
                    return rVar2;
                }
            default:
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                int i13 = this.f33705b;
                vy.d dVar = null;
                try {
                    if (i13 == 0) {
                        com.bumptech.glide.e.F(obj);
                        g0 g0Var3 = this.f33706c.f33721a;
                        long j13 = this.f33707d;
                        this.f33705b = 1;
                        obj = ((ds.g) g0Var3).e(null, new bh.b(j13, dVar, 13), this);
                        if (obj == aVar3) {
                            return aVar3;
                        }
                    } else {
                        if (i13 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.bumptech.glide.e.F(obj);
                    }
                    return (ChineseToneWord) obj;
                } catch (Exception unused3) {
                    return null;
                }
        }
    }
}
