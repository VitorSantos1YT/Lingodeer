package gn;

import com.yalantis.ucrop.view.CropImageView;
import java.io.File;
import rz.b0;
import rz.e0;
import rz.o0;
import uz.i1;
import xy.i;
import yz.f;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f29313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f29314c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f29315d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ File f29316e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i11, int i12, e eVar, File file, vy.d dVar) {
        super(2, dVar);
        this.f29312a = i12;
        this.f29314c = eVar;
        this.f29315d = i11;
        this.f29316e = file;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f29312a) {
            case 0:
                File file = this.f29316e;
                return new c(this.f29315d, 0, this.f29314c, file, dVar);
            default:
                File file2 = this.f29316e;
                return new c(this.f29315d, 1, this.f29314c, file2, dVar);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        b0 b0Var = (b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f29312a) {
            case 0:
                break;
        }
        return ((c) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f29312a;
        qy.b0 b0Var = qy.b0.f48488a;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f29313b;
                vy.d dVar = null;
                int i13 = this.f29315d;
                e eVar = this.f29314c;
                if (i12 == 0) {
                    com.bumptech.glide.e.F(obj);
                    f fVar = o0.f50940a;
                    yz.e eVar2 = yz.e.f58387a;
                    b bVar = new b(i13, 0, eVar, this.f29316e, dVar);
                    this.f29313b = 1;
                    if (e0.M(eVar2, bVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                eVar.H.add(new Integer(i13));
                i1 i1Var = eVar.f29324d;
                a aVarA = a.a((a) i1Var.getValue(), false, null, null, null, false, 1.0f, true, 15);
                i1Var.getClass();
                i1Var.l(null, aVarA);
                return b0Var;
            default:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i14 = this.f29313b;
                vy.d dVar2 = null;
                int i15 = this.f29315d;
                e eVar3 = this.f29314c;
                if (i14 == 0) {
                    com.bumptech.glide.e.F(obj);
                    f fVar2 = o0.f50940a;
                    yz.e eVar4 = yz.e.f58387a;
                    b bVar2 = new b(i15, 1, eVar3, this.f29316e, dVar2);
                    this.f29313b = 1;
                    if (e0.M(eVar4, bVar2, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                eVar3.H.add(new Integer(i15));
                i1 i1Var2 = eVar3.f29324d;
                a aVarA2 = a.a((a) i1Var2.getValue(), false, null, null, null, false, CropImageView.DEFAULT_ASPECT_RATIO, true, 47);
                i1Var2.getClass();
                i1Var2.l(null, aVarA2);
                return b0Var;
        }
    }
}
