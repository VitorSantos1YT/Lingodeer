package tq;

import com.yalantis.ucrop.view.CropImageView;
import fz.e;
import java.io.File;
import rz.b0;
import rz.e0;
import rz.o0;
import uz.i1;
import xy.i;
import yz.f;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends i implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f52518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f52519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f52520c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f52521d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ File f52522e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i11, int i12, File file, d dVar, vy.d dVar2) {
        super(2, dVar2);
        this.f52518a = i12;
        this.f52520c = dVar;
        this.f52521d = i11;
        this.f52522e = file;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f52518a) {
            case 0:
                File file = this.f52522e;
                return new c(this.f52521d, 0, file, this.f52520c, dVar);
            default:
                File file2 = this.f52522e;
                return new c(this.f52521d, 1, file2, this.f52520c, dVar);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        b0 b0Var = (b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f52518a) {
            case 0:
                break;
        }
        return ((c) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f52518a;
        qy.b0 b0Var = qy.b0.f48488a;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f52519b;
                int i13 = this.f52521d;
                d dVar = this.f52520c;
                if (i12 == 0) {
                    com.bumptech.glide.e.F(obj);
                    f fVar = o0.f50940a;
                    yz.e eVar = yz.e.f58387a;
                    b bVar = new b(i13, 0, this.f52522e, dVar, null);
                    this.f52519b = 1;
                    if (e0.M(eVar, bVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                dVar.f52529t.add(new Integer(i13));
                i1 i1Var = dVar.f52525c;
                a aVarA = a.a((a) i1Var.getValue(), null, null, null, false, 1.0f, true, 15);
                i1Var.getClass();
                i1Var.l(null, aVarA);
                return b0Var;
            default:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i14 = this.f52519b;
                int i15 = this.f52521d;
                d dVar2 = this.f52520c;
                if (i14 == 0) {
                    com.bumptech.glide.e.F(obj);
                    f fVar2 = o0.f50940a;
                    yz.e eVar2 = yz.e.f58387a;
                    b bVar2 = new b(i15, 1, this.f52522e, dVar2, null);
                    this.f52519b = 1;
                    if (e0.M(eVar2, bVar2, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                dVar2.f52529t.add(new Integer(i15));
                i1 i1Var2 = dVar2.f52525c;
                a aVarA2 = a.a((a) i1Var2.getValue(), null, null, null, false, CropImageView.DEFAULT_ASPECT_RATIO, true, 47);
                i1Var2.getClass();
                i1Var2.l(null, aVarA2);
                return b0Var;
        }
    }
}
