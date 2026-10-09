package fu;

import com.google.api.Service;
import com.tbruyelle.rxpermissions3.BuildConfig;
import l1.b1;
import mt.y3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class e implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fz.a f28086b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b1 f28087c;

    public /* synthetic */ e(int i11, fz.a aVar, b1 b1Var) {
        this.f28085a = i11;
        this.f28086b = aVar;
        this.f28087c = b1Var;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f28085a) {
            case 0:
                this.f28087c.setValue(Boolean.FALSE);
                this.f28086b.invoke();
                break;
            case 1:
                this.f28087c.setValue(Boolean.TRUE);
                this.f28086b.invoke();
                break;
            case 2:
                b1 b1Var = this.f28087c;
                if (!((Boolean) b1Var.getValue()).booleanValue()) {
                    b1Var.setValue(Boolean.TRUE);
                    this.f28086b.invoke();
                }
                return qy.b0.f48488a;
            case 3:
                this.f28086b.invoke();
                this.f28087c.setValue(Boolean.FALSE);
                break;
            case 4:
                this.f28087c.setValue(Boolean.FALSE);
                this.f28086b.invoke();
                break;
            case 5:
                this.f28087c.setValue(null);
                this.f28086b.invoke();
                break;
            case 6:
                this.f28087c.setValue(Boolean.FALSE);
                this.f28086b.invoke();
                break;
            case 7:
                this.f28087c.setValue(Boolean.FALSE);
                this.f28086b.invoke();
                break;
            case 8:
                this.f28087c.setValue(Boolean.FALSE);
                this.f28086b.invoke();
                break;
            case 9:
                this.f28087c.setValue(Boolean.FALSE);
                this.f28086b.invoke();
                break;
            case 10:
                this.f28087c.setValue(Boolean.FALSE);
                this.f28086b.invoke();
                break;
            case 11:
                this.f28087c.setValue(Boolean.FALSE);
                this.f28086b.invoke();
                break;
            case 12:
                this.f28086b.invoke();
                this.f28087c.setValue(Boolean.TRUE);
                break;
            case 13:
                this.f28087c.setValue(Boolean.FALSE);
                this.f28086b.invoke();
                break;
            case 14:
                this.f28087c.setValue(Boolean.FALSE);
                this.f28086b.invoke();
                break;
            case 15:
                this.f28087c.setValue(Boolean.FALSE);
                this.f28086b.invoke();
                break;
            case 16:
                this.f28087c.setValue(Boolean.FALSE);
                this.f28086b.invoke();
                break;
            case 17:
                this.f28087c.setValue(Boolean.FALSE);
                this.f28086b.invoke();
                break;
            case 18:
                y3.o(this.f28087c, false);
                this.f28086b.invoke();
                break;
            case 19:
                y3.o(this.f28087c, false);
                this.f28086b.invoke();
                break;
            case 20:
                y3.o(this.f28087c, false);
                this.f28086b.invoke();
                break;
            case 21:
                y3.o(this.f28087c, false);
                this.f28086b.invoke();
                break;
            case 22:
                this.f28087c.setValue(Boolean.FALSE);
                this.f28086b.invoke();
                break;
            case 23:
                this.f28086b.invoke();
                this.f28087c.setValue(Boolean.FALSE);
                break;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                this.f28087c.setValue(new o3.w(BuildConfig.VERSION_NAME, 0L, 6));
                this.f28086b.invoke();
                break;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                this.f28086b.invoke();
                b1 b1Var2 = this.f28087c;
                b1Var2.setValue(xu.f.a((xu.f) b1Var2.getValue(), false, false, false, false, false, false, 31));
                break;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                b1 b1Var3 = this.f28087c;
                b1Var3.setValue(xu.f.a((xu.f) b1Var3.getValue(), false, false, false, false, false, false, 61));
                this.f28086b.invoke();
                break;
            case 27:
                b1 b1Var4 = this.f28087c;
                b1Var4.setValue(xu.f.a((xu.f) b1Var4.getValue(), false, false, false, false, false, false, 61));
                this.f28086b.invoke();
                break;
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                this.f28086b.invoke();
                b1 b1Var5 = this.f28087c;
                b1Var5.setValue(xu.f.a((xu.f) b1Var5.getValue(), false, false, false, false, false, false, 59));
                break;
            default:
                b1 b1Var6 = this.f28087c;
                b1Var6.setValue(xu.f.a((xu.f) b1Var6.getValue(), false, false, false, false, false, false, 47));
                this.f28086b.invoke();
                break;
        }
        return qy.b0.f48488a;
    }
}
