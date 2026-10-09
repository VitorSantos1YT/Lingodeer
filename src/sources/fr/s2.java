package fr;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class s2 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f27832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f27833c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i3 f27834d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s2(int i11, i3 i3Var, vy.d dVar, int i12) {
        super(2, dVar);
        this.f27831a = i12;
        this.f27833c = i11;
        this.f27834d = i3Var;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f27831a) {
            case 0:
                return new s2(this.f27833c, this.f27834d, dVar, 0);
            case 1:
                return new s2(this.f27833c, this.f27834d, dVar, 1);
            case 2:
                return new s2(this.f27833c, this.f27834d, dVar, 2);
            case 3:
                return new s2(this.f27833c, this.f27834d, dVar, 3);
            case 4:
                return new s2(this.f27833c, this.f27834d, dVar, 4);
            default:
                return new s2(this.f27833c, this.f27834d, dVar, 5);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f27831a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
        return ((s2) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException {
        switch (this.f27831a) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f27832b;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj;
                }
                com.bumptech.glide.e.F(obj);
                String strK = xt.d.k(this.f27833c);
                this.f27832b = 1;
                Object objJ = a3.j(this.f27834d, strK, "course", this);
                return objJ == aVar ? aVar : objJ;
            case 1:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f27832b;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj;
                }
                com.bumptech.glide.e.F(obj);
                String strK2 = xt.d.k(this.f27833c);
                this.f27832b = 1;
                Object objJ2 = a3.j(this.f27834d, strK2, "travel", this);
                return objJ2 == aVar2 ? aVar2 : objJ2;
            case 2:
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                int i13 = this.f27832b;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj;
                }
                com.bumptech.glide.e.F(obj);
                String strK3 = xt.d.k(this.f27833c);
                this.f27832b = 1;
                Object objJ3 = a3.j(this.f27834d, strK3, "char_drill", this);
                return objJ3 == aVar3 ? aVar3 : objJ3;
            case 3:
                wy.a aVar4 = wy.a.COROUTINE_SUSPENDED;
                int i14 = this.f27832b;
                if (i14 != 0) {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj;
                }
                com.bumptech.glide.e.F(obj);
                String strK4 = xt.d.k(this.f27833c);
                this.f27832b = 1;
                Object objE = a3.e(this.f27834d, strK4, this);
                return objE == aVar4 ? aVar4 : objE;
            case 4:
                wy.a aVar5 = wy.a.COROUTINE_SUSPENDED;
                int i15 = this.f27832b;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj;
                }
                com.bumptech.glide.e.F(obj);
                String strK5 = xt.d.k(this.f27833c);
                this.f27832b = 1;
                Object objJ4 = a3.j(this.f27834d, strK5, "course", this);
                return objJ4 == aVar5 ? aVar5 : objJ4;
            default:
                wy.a aVar6 = wy.a.COROUTINE_SUSPENDED;
                int i16 = this.f27832b;
                if (i16 != 0) {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj;
                }
                com.bumptech.glide.e.F(obj);
                String strK6 = xt.d.k(this.f27833c);
                this.f27832b = 1;
                Object objE2 = a3.e(this.f27834d, strK6, this);
                return objE2 == aVar6 ? aVar6 : objE2;
        }
    }
}
