package bt;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.lingodeer.data.model.CourseWord;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class t4 implements PointerInputEventHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f6022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CourseWord f6023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l1.g1 f6024c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l1.g1 f6025d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f6026e;

    public t4(l1.b1 b1Var, CourseWord courseWord, l1.g1 g1Var, l1.g1 g1Var2, l1.b1 b1Var2) {
        this.f6022a = b1Var;
        this.f6023b = courseWord;
        this.f6024c = g1Var;
        this.f6025d = g1Var2;
        this.f6026e = b1Var2;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(s2.w wVar, vy.d dVar) {
        final l1.b1 b1Var = this.f6022a;
        CourseWord courseWord = this.f6023b;
        final l1.g1 g1Var = this.f6024c;
        final l1.g1 g1Var2 = this.f6025d;
        b1.a aVar = new b1.a(b1Var, courseWord, g1Var, g1Var2, this.f6026e, 2);
        final int i11 = 0;
        fz.a aVar2 = new fz.a() { // from class: bt.s4
            @Override // fz.a
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        g1Var.m(CropImageView.DEFAULT_ASPECT_RATIO);
                        g1Var2.m(CropImageView.DEFAULT_ASPECT_RATIO);
                        b1Var.setValue(null);
                        break;
                    default:
                        g1Var.m(CropImageView.DEFAULT_ASPECT_RATIO);
                        g1Var2.m(CropImageView.DEFAULT_ASPECT_RATIO);
                        b1Var.setValue(null);
                        break;
                }
                return qy.b0.f48488a;
            }
        };
        final int i12 = 1;
        fz.a aVar3 = new fz.a() { // from class: bt.s4
            @Override // fz.a
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        g1Var.m(CropImageView.DEFAULT_ASPECT_RATIO);
                        g1Var2.m(CropImageView.DEFAULT_ASPECT_RATIO);
                        b1Var.setValue(null);
                        break;
                    default:
                        g1Var.m(CropImageView.DEFAULT_ASPECT_RATIO);
                        g1Var2.m(CropImageView.DEFAULT_ASPECT_RATIO);
                        b1Var.setValue(null);
                        break;
                }
                return qy.b0.f48488a;
            }
        };
        at.i iVar = new at.i(b1Var, g1Var, g1Var2, 14);
        float f5 = f0.g0.f26277a;
        Object objC = f0.t2.c(wVar, new f0.a0(aVar, aVar2, aVar3, iVar, null), dVar);
        wy.a aVar4 = wy.a.COROUTINE_SUSPENDED;
        qy.b0 b0Var = qy.b0.f48488a;
        if (objC != aVar4) {
            objC = b0Var;
        }
        return objC == aVar4 ? objC : b0Var;
    }
}
