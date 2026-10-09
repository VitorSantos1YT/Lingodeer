package ys;

import kotlin.KotlinNothingValueException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d1 implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f57972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f57973b;

    public /* synthetic */ d1(int i11, l1.b1 b1Var) {
        this.f57972a = i11;
        this.f57973b = b1Var;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f57972a) {
            case 0:
                l1.b1 b1Var = this.f57973b;
                b1Var.setValue(Boolean.valueOf(!((Boolean) b1Var.getValue()).booleanValue()));
                break;
            case 1:
                l1.b1 b1Var2 = this.f57973b;
                b1Var2.setValue(Boolean.valueOf(!((Boolean) b1Var2.getValue()).booleanValue()));
                break;
            case 2:
                this.f57973b.setValue(Boolean.FALSE);
                break;
            case 3:
                this.f57973b.setValue(Boolean.FALSE);
                break;
            case 4:
                this.f57973b.setValue(Boolean.FALSE);
                break;
            case 5:
                this.f57973b.setValue(Boolean.FALSE);
                break;
            case 6:
                this.f57973b.setValue(Boolean.TRUE);
                break;
            case 7:
                this.f57973b.setValue(Boolean.TRUE);
                break;
            case 8:
                this.f57973b.setValue(Boolean.TRUE);
                break;
            case 9:
                this.f57973b.setValue(Boolean.TRUE);
                break;
            case 10:
                this.f57973b.setValue(Boolean.FALSE);
                break;
            case 11:
                this.f57973b.setValue(Boolean.FALSE);
                break;
            case 12:
                this.f57973b.setValue(Boolean.FALSE);
                break;
            case 13:
                this.f57973b.setValue(Boolean.TRUE);
                break;
            case 14:
                this.f57973b.setValue(Boolean.FALSE);
                break;
            case 15:
                this.f57973b.setValue(Boolean.TRUE);
                break;
            case 16:
                this.f57973b.setValue(Boolean.TRUE);
                break;
            case 17:
                this.f57973b.setValue(Boolean.TRUE);
                break;
            case 18:
                this.f57973b.setValue(Boolean.FALSE);
                break;
            case 19:
                this.f57973b.setValue(Boolean.FALSE);
                break;
            default:
                w2.x xVar = (w2.x) this.f57973b.getValue();
                if (xVar != null) {
                    return xVar;
                }
                i0.a.d("Required value was null.");
                throw new KotlinNothingValueException();
        }
        return qy.b0.f48488a;
    }
}
