package kt;

import l1.b1;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fz.a f38649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b1 f38650c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b1 f38651d;

    public /* synthetic */ d(int i11, fz.a aVar, b1 b1Var, b1 b1Var2) {
        this.f38648a = i11;
        this.f38649b = aVar;
        this.f38650c = b1Var;
        this.f38651d = b1Var2;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f38648a) {
            case 0:
                if (((Boolean) this.f38650c.getValue()).booleanValue()) {
                    this.f38651d.setValue(Boolean.TRUE);
                } else {
                    this.f38649b.invoke();
                }
                return b0.f48488a;
            case 1:
                if (((Boolean) this.f38650c.getValue()).booleanValue()) {
                    this.f38651d.setValue(Boolean.TRUE);
                } else {
                    this.f38649b.invoke();
                }
                return b0.f48488a;
            case 2:
                if (((Boolean) this.f38650c.getValue()).booleanValue()) {
                    this.f38651d.setValue(Boolean.TRUE);
                } else {
                    this.f38649b.invoke();
                }
                return b0.f48488a;
            case 3:
                Boolean bool = Boolean.FALSE;
                this.f38650c.setValue(bool);
                this.f38651d.setValue(bool);
                this.f38649b.invoke();
                return b0.f48488a;
            case 4:
                return new o0.k((fz.g) this.f38650c.getValue(), (fz.c) this.f38651d.getValue(), ((Number) this.f38649b.invoke()).intValue());
            case 5:
                if (((Boolean) this.f38650c.getValue()).booleanValue()) {
                    this.f38649b.invoke();
                } else {
                    this.f38651d.setValue(Boolean.TRUE);
                }
                return b0.f48488a;
            case 6:
                if (((Boolean) this.f38650c.getValue()).booleanValue()) {
                    this.f38649b.invoke();
                } else {
                    this.f38651d.setValue(Boolean.TRUE);
                }
                return b0.f48488a;
            case 7:
                if (((Boolean) this.f38650c.getValue()).booleanValue()) {
                    this.f38649b.invoke();
                } else {
                    this.f38651d.setValue(Boolean.TRUE);
                }
                return b0.f48488a;
            default:
                if (((Boolean) this.f38650c.getValue()).booleanValue()) {
                    this.f38649b.invoke();
                } else {
                    this.f38651d.setValue(Boolean.TRUE);
                }
                return b0.f48488a;
        }
    }

    public /* synthetic */ d(b1 b1Var, b1 b1Var2, fz.a aVar) {
        this.f38648a = 4;
        this.f38650c = b1Var;
        this.f38651d = b1Var2;
        this.f38649b = aVar;
    }
}
