package mt;

import com.google.api.Service;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class q implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f41778b;

    public /* synthetic */ q(int i11, l1.b1 b1Var) {
        this.f41777a = i11;
        this.f41778b = b1Var;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f41777a) {
            case 0:
                this.f41778b.setValue(Boolean.FALSE);
                break;
            case 1:
                this.f41778b.setValue(a.f41222a);
                break;
            case 2:
                this.f41778b.setValue(null);
                break;
            case 3:
                this.f41778b.setValue(Boolean.FALSE);
                break;
            case 4:
                this.f41778b.setValue(Boolean.FALSE);
                break;
            case 5:
                this.f41778b.setValue(Boolean.FALSE);
                break;
            case 6:
                this.f41778b.setValue(Boolean.FALSE);
                break;
            case 7:
                this.f41778b.setValue(Boolean.TRUE);
                break;
            case 8:
                this.f41778b.setValue(Boolean.TRUE);
                break;
            case 9:
                this.f41778b.setValue(15);
                break;
            case 10:
                this.f41778b.setValue(25);
                break;
            case 11:
                this.f41778b.setValue(35);
                break;
            case 12:
                this.f41778b.setValue(50);
                break;
            case 13:
                this.f41778b.setValue(Boolean.FALSE);
                break;
            case 14:
                this.f41778b.setValue(Boolean.FALSE);
                break;
            case 15:
                this.f41778b.setValue(Boolean.TRUE);
                break;
            case 16:
                this.f41778b.setValue(Boolean.FALSE);
                break;
            case 17:
                this.f41778b.setValue(Boolean.FALSE);
                break;
            case 18:
                this.f41778b.setValue(Boolean.FALSE);
                break;
            case 19:
                this.f41778b.setValue(Boolean.FALSE);
                break;
            case 20:
                this.f41778b.setValue(Boolean.FALSE);
                break;
            case 21:
                this.f41778b.setValue(Boolean.TRUE);
                break;
            case 22:
                this.f41778b.setValue(Boolean.TRUE);
                break;
            case 23:
                l1.b1 b1Var = this.f41778b;
                b1Var.setValue(Boolean.valueOf(!((Boolean) b1Var.getValue()).booleanValue()));
                break;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                this.f41778b.setValue(Boolean.FALSE);
                break;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                this.f41778b.setValue(Boolean.FALSE);
                break;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                this.f41778b.setValue(Boolean.TRUE);
                break;
            case 27:
                this.f41778b.setValue(Boolean.TRUE);
                break;
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                this.f41778b.setValue(Boolean.FALSE);
                break;
            default:
                this.f41778b.setValue(Boolean.FALSE);
                break;
        }
        return qy.b0.f48488a;
    }
}
