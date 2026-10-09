package xu;

import com.google.api.Service;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class m implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f56475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f56476b;

    public /* synthetic */ m(int i11, l1.b1 b1Var) {
        this.f56475a = i11;
        this.f56476b = b1Var;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f56475a) {
            case 0:
                l1.b1 b1Var = this.f56476b;
                b1Var.setValue(f.a((f) b1Var.getValue(), false, false, false, true, false, false, 55));
                break;
            case 1:
                l1.b1 b1Var2 = this.f56476b;
                b1Var2.setValue(f.a((f) b1Var2.getValue(), false, false, true, false, false, false, 59));
                break;
            case 2:
                l1.b1 b1Var3 = this.f56476b;
                b1Var3.setValue(f.a((f) b1Var3.getValue(), false, false, false, false, false, true, 31));
                break;
            case 3:
                l1.b1 b1Var4 = this.f56476b;
                b1Var4.setValue(f.a((f) b1Var4.getValue(), false, false, false, false, false, false, 61));
                break;
            case 4:
                l1.b1 b1Var5 = this.f56476b;
                b1Var5.setValue(f.a((f) b1Var5.getValue(), false, false, false, false, false, false, 59));
                break;
            case 5:
                l1.b1 b1Var6 = this.f56476b;
                b1Var6.setValue(f.a((f) b1Var6.getValue(), false, false, false, false, false, false, 59));
                break;
            case 6:
                l1.b1 b1Var7 = this.f56476b;
                b1Var7.setValue(f.a((f) b1Var7.getValue(), false, false, false, false, false, false, 55));
                break;
            case 7:
                l1.b1 b1Var8 = this.f56476b;
                b1Var8.setValue(f.a((f) b1Var8.getValue(), false, false, false, false, false, false, 62));
                break;
            case 8:
                l1.b1 b1Var9 = this.f56476b;
                b1Var9.setValue(f.a((f) b1Var9.getValue(), false, false, false, false, false, false, 55));
                break;
            case 9:
                this.f56476b.setValue(Boolean.TRUE);
                break;
            case 10:
                this.f56476b.setValue(Boolean.FALSE);
                break;
            case 11:
                this.f56476b.setValue(Boolean.TRUE);
                break;
            case 12:
                this.f56476b.setValue(Boolean.FALSE);
                break;
            case 13:
                this.f56476b.setValue(Boolean.FALSE);
                break;
            case 14:
                this.f56476b.setValue(Boolean.FALSE);
                break;
            case 15:
                this.f56476b.setValue(Boolean.FALSE);
                break;
            case 16:
                this.f56476b.setValue(Boolean.FALSE);
                break;
            case 17:
                this.f56476b.setValue(Boolean.FALSE);
                break;
            case 18:
                this.f56476b.setValue(Boolean.TRUE);
                break;
            case 19:
                this.f56476b.setValue(Boolean.TRUE);
                break;
            case 20:
                this.f56476b.setValue(Boolean.TRUE);
                break;
            case 21:
                this.f56476b.setValue(Boolean.TRUE);
                break;
            case 22:
                this.f56476b.setValue(Boolean.TRUE);
                break;
            case 23:
                this.f56476b.setValue(Boolean.TRUE);
                break;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                this.f56476b.setValue(Boolean.TRUE);
                break;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                this.f56476b.setValue(Boolean.FALSE);
                break;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                this.f56476b.setValue(ys.u.Root);
                break;
            case 27:
                this.f56476b.setValue(ys.u.CurrentQuestionPreferences);
                break;
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                this.f56476b.setValue(ys.u.ScriptStyle);
                break;
            default:
                l1.b1 b1Var10 = this.f56476b;
                b1Var10.setValue(Boolean.valueOf(!((Boolean) b1Var10.getValue()).booleanValue()));
                break;
        }
        return qy.b0.f48488a;
    }
}
