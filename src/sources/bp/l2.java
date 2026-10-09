package bp;

import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class l2 implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fz.e f4686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f4687c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f4688d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f4689e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f4690f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f4691t;

    public /* synthetic */ l2(fz.e eVar, l1.b1 b1Var, l1.b1 b1Var2, l1.b1 b1Var3, l1.b1 b1Var4, l1.b1 b1Var5, int i11) {
        this.f4685a = i11;
        this.f4686b = eVar;
        this.f4687c = b1Var;
        this.f4688d = b1Var2;
        this.f4689e = b1Var3;
        this.f4690f = b1Var4;
        this.f4691t = b1Var5;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f4685a) {
            case 0:
                l1.b1 b1Var = this.f4687c;
                if (((String) b1Var.getValue()).length() == 0) {
                    this.f4688d.setValue(Boolean.TRUE);
                } else {
                    l1.b1 b1Var2 = this.f4689e;
                    if (((String) b1Var2.getValue()).length() == 0) {
                        this.f4690f.setValue(Boolean.TRUE);
                    } else {
                        String emailString = (String) b1Var2.getValue();
                        kotlin.jvm.internal.m.f(emailString, "emailString");
                        if (Pattern.compile("^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z0-9-]{2,63}$").matcher(emailString).matches()) {
                            this.f4686b.invoke((String) b1Var.getValue(), (String) b1Var2.getValue());
                        } else {
                            this.f4691t.setValue(Boolean.TRUE);
                        }
                    }
                }
                break;
            default:
                l1.b1 b1Var3 = this.f4687c;
                if (!kotlin.jvm.internal.m.a((String) b1Var3.getValue(), (String) this.f4688d.getValue())) {
                    this.f4689e.setValue(Boolean.TRUE);
                } else if (((String) b1Var3.getValue()).length() < 6) {
                    this.f4690f.setValue(Boolean.TRUE);
                } else {
                    this.f4686b.invoke((String) this.f4691t.getValue(), (String) b1Var3.getValue());
                }
                break;
        }
        return qy.b0.f48488a;
    }
}
