package pr;

import com.google.api.Service;
import java.util.List;
import kotlin.KotlinNothingValueException;
import l1.b1;
import zp.sBa.anrPHlQ;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class z implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b1 f47117b;

    public /* synthetic */ z(int i11, b1 b1Var) {
        this.f47116a = i11;
        this.f47117b = b1Var;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f47116a) {
            case 0:
                this.f47117b.setValue(Boolean.TRUE);
                return qy.b0.f48488a;
            case 1:
                this.f47117b.setValue(Boolean.FALSE);
                return qy.b0.f48488a;
            case 2:
                this.f47117b.setValue(Boolean.TRUE);
                return qy.b0.f48488a;
            case 3:
                this.f47117b.setValue(Boolean.FALSE);
                return qy.b0.f48488a;
            case 4:
                this.f47117b.setValue(Boolean.FALSE);
                return qy.b0.f48488a;
            case 5:
                b1 b1Var = this.f47117b;
                if (b1Var != null) {
                    return (List) b1Var.getValue();
                }
                return null;
            case 6:
                Boolean bool = (Boolean) this.f47117b.getValue();
                bool.booleanValue();
                return bool;
            case 7:
                this.f47117b.setValue(Boolean.FALSE);
                return qy.b0.f48488a;
            case 8:
                this.f47117b.setValue(Boolean.FALSE);
                return qy.b0.f48488a;
            case 9:
                this.f47117b.setValue(Boolean.FALSE);
                return qy.b0.f48488a;
            case 10:
                this.f47117b.setValue(Boolean.FALSE);
                return qy.b0.f48488a;
            case 11:
                this.f47117b.setValue(new qy.l(null, new v3.j(0L)));
                return qy.b0.f48488a;
            case 12:
                this.f47117b.setValue(new qy.l(null, new v3.j(0L)));
                return qy.b0.f48488a;
            case 13:
                this.f47117b.setValue(Boolean.FALSE);
                return qy.b0.f48488a;
            case 14:
                b1 b1Var2 = this.f47117b;
                b1Var2.setValue(Boolean.valueOf(!((Boolean) b1Var2.getValue()).booleanValue()));
                return qy.b0.f48488a;
            case 15:
                b1 b1Var3 = this.f47117b;
                b1Var3.setValue(Boolean.valueOf(!((Boolean) b1Var3.getValue()).booleanValue()));
                return qy.b0.f48488a;
            case 16:
                this.f47117b.setValue(Boolean.FALSE);
                return qy.b0.f48488a;
            case 17:
                this.f47117b.setValue(Boolean.FALSE);
                return qy.b0.f48488a;
            case 18:
                b1 b1Var4 = this.f47117b;
                b1Var4.setValue(Boolean.valueOf(!((Boolean) b1Var4.getValue()).booleanValue()));
                return qy.b0.f48488a;
            case 19:
                b1 b1Var5 = this.f47117b;
                b1Var5.setValue(Boolean.valueOf(!((Boolean) b1Var5.getValue()).booleanValue()));
                return qy.b0.f48488a;
            case 20:
                w2.x xVar = (w2.x) this.f47117b.getValue();
                if (xVar != null) {
                    return xVar;
                }
                i0.a.d(anrPHlQ.MPtCOKH);
                throw new KotlinNothingValueException();
            case 21:
                w2.x xVar2 = (w2.x) this.f47117b.getValue();
                if (xVar2 != null) {
                    return xVar2;
                }
                i0.a.d("Required value was null.");
                throw new KotlinNothingValueException();
            case 22:
                b1 b1Var6 = this.f47117b;
                b1Var6.setValue(Boolean.valueOf(!((Boolean) b1Var6.getValue()).booleanValue()));
                return qy.b0.f48488a;
            case 23:
                this.f47117b.setValue(Boolean.FALSE);
                return qy.b0.f48488a;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                this.f47117b.setValue(Boolean.FALSE);
                return qy.b0.f48488a;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                b1 b1Var7 = this.f47117b;
                b1Var7.setValue(xu.f.a((xu.f) b1Var7.getValue(), false, false, false, false, false, false, 31));
                return qy.b0.f48488a;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                b1 b1Var8 = this.f47117b;
                b1Var8.setValue(xu.f.a((xu.f) b1Var8.getValue(), false, false, false, false, false, false, 31));
                return qy.b0.f48488a;
            case 27:
                b1 b1Var9 = this.f47117b;
                b1Var9.setValue(xu.f.a((xu.f) b1Var9.getValue(), true, false, false, false, false, false, 62));
                return qy.b0.f48488a;
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                b1 b1Var10 = this.f47117b;
                b1Var10.setValue(xu.f.a((xu.f) b1Var10.getValue(), false, true, false, false, false, false, 61));
                return qy.b0.f48488a;
            default:
                b1 b1Var11 = this.f47117b;
                b1Var11.setValue(xu.f.a((xu.f) b1Var11.getValue(), false, false, false, false, true, false, 47));
                return qy.b0.f48488a;
        }
    }
}
