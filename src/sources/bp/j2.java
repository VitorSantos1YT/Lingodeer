package bp;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j2 implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fz.c f4656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f4657c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f4658d;

    public /* synthetic */ j2(fz.c cVar, l1.b1 b1Var, l1.b1 b1Var2, int i11) {
        this.f4655a = i11;
        this.f4656b = cVar;
        this.f4657c = b1Var;
        this.f4658d = b1Var2;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f4655a) {
            case 0:
                l1.b1 b1Var = this.f4657c;
                if (((String) b1Var.getValue()).length() == 0) {
                    this.f4658d.setValue(Boolean.TRUE);
                } else {
                    this.f4656b.invoke((String) b1Var.getValue());
                }
                return qy.b0.f48488a;
            case 1:
                this.f4657c.setValue(Boolean.FALSE);
                this.f4656b.invoke((List) this.f4658d.getValue());
                break;
            case 2:
                this.f4657c.setValue(Boolean.FALSE);
                this.f4656b.invoke(Integer.valueOf(((Number) this.f4658d.getValue()).intValue()));
                break;
            default:
                this.f4657c.setValue(Boolean.FALSE);
                Boolean bool = (Boolean) this.f4658d.getValue();
                bool.getClass();
                this.f4656b.invoke(bool);
                break;
        }
        return qy.b0.f48488a;
    }
}
