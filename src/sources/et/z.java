package et;

import com.yalantis.ucrop.view.CropImageView;
import java.util.List;
import qp.o2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class z extends xy.i implements fz.e {
    public final /* synthetic */ l0.w H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f25930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f25931c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f25932d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f25933e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ jt.v f25934f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ fz.c f25935t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(jt.v vVar, fz.c cVar, l0.w wVar, vy.d dVar) {
        super(2, dVar);
        this.f25934f = vVar;
        this.f25935t = cVar;
        this.H = wVar;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        return new z(this.f25934f, this.f25935t, this.H, dVar);
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((z) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00a4  */
    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int iIntValue;
        List list;
        float size;
        int i11;
        int i12;
        jt.v vVar = this.f25934f;
        x1.p pVar = vVar.f37218i;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i13 = this.f25933e;
        int i14 = 1;
        if (i13 == 0) {
            com.bumptech.glide.e.F(obj);
            iIntValue = ((Number) vVar.f37217h.getValue()).intValue();
            list = (List) vVar.f37216g.getValue();
            size = !list.isEmpty() ? (iIntValue + 1) / list.size() : CropImageView.DEFAULT_ASPECT_RATIO;
            this.f25935t.invoke(new Float(size));
            this.f25931c = list;
            this.f25929a = iIntValue;
            this.f25932d = size;
            this.f25933e = 1;
            if (rz.e0.m(400L, this) != aVar) {
            }
            return aVar;
        }
        if (i13 == 1) {
            size = this.f25932d;
            int i15 = this.f25929a;
            list = this.f25931c;
            com.bumptech.glide.e.F(obj);
            iIntValue = i15;
        } else {
            if (i13 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i12 = this.f25930b;
            i11 = this.f25929a;
            com.bumptech.glide.e.F(obj);
        }
        if (i12 != 0) {
            vVar.f37222n.setValue(new Integer(i11));
        }
        return qy.b0.f48488a;
        if (iIntValue >= 0 && iIntValue < list.size()) {
            o oVar = (o) list.get(iIntValue);
            if (pVar.size() <= iIntValue) {
                pVar.add(oVar);
            } else {
                i14 = 0;
            }
            this.f25931c = null;
            this.f25929a = iIntValue;
            this.f25932d = size;
            this.f25930b = i14;
            this.f25933e = 2;
            o2 o2Var = l0.w.f39201x;
            if (this.H.f(iIntValue, 0, this) != aVar) {
                i11 = iIntValue;
                i12 = i14;
                if (i12 != 0) {
                    vVar.f37222n.setValue(new Integer(i11));
                }
            }
            return aVar;
        }
        return qy.b0.f48488a;
    }
}
