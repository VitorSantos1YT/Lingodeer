package gi;

import com.yalantis.ucrop.view.CropImageView;
import java.io.File;
import rz.b0;
import rz.e0;
import rz.o0;
import uz.i1;
import xy.i;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f29253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f29254c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ File f29255d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i11, d dVar, File file, vy.d dVar2) {
        super(2, dVar2);
        this.f29252a = i11;
        this.f29254c = dVar;
        this.f29255d = file;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f29252a) {
            case 0:
                return new c(0, this.f29254c, this.f29255d, dVar);
            default:
                return new c(1, this.f29254c, this.f29255d, dVar);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        b0 b0Var = (b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f29252a) {
            case 0:
                break;
        }
        return ((c) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f29252a;
        qy.b0 b0Var = qy.b0.f48488a;
        File file = this.f29255d;
        d dVar = this.f29254c;
        vy.d dVar2 = null;
        int i12 = 1;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i13 = this.f29253b;
                if (i13 == 0) {
                    com.bumptech.glide.e.F(obj);
                    yz.f fVar = o0.f50940a;
                    yz.e eVar = yz.e.f58387a;
                    b bVar = new b(0, dVar, file, dVar2);
                    this.f29253b = 1;
                    if (e0.M(eVar, bVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                dVar.f29261f.add(new Integer(-1));
                i1 i1Var = dVar.f29258c;
                a aVarA = a.a((a) i1Var.getValue(), null, null, null, false, 1.0f, true, 15);
                i1Var.getClass();
                i1Var.l(null, aVarA);
                return b0Var;
            default:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i14 = this.f29253b;
                if (i14 == 0) {
                    com.bumptech.glide.e.F(obj);
                    yz.f fVar2 = o0.f50940a;
                    yz.e eVar2 = yz.e.f58387a;
                    b bVar2 = new b(i12, dVar, file, dVar2);
                    this.f29253b = 1;
                    if (e0.M(eVar2, bVar2, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                dVar.f29261f.add(new Integer(-1));
                i1 i1Var2 = dVar.f29258c;
                a aVarA2 = a.a((a) i1Var2.getValue(), null, null, null, false, CropImageView.DEFAULT_ASPECT_RATIO, true, 47);
                i1Var2.getClass();
                i1Var2.l(null, aVarA2);
                return b0Var;
        }
    }
}
