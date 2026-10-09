package bp;

import rt.je;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r1 implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f4790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f4791c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f4792d;

    public /* synthetic */ r1(l1.b1 b1Var, l1.b1 b1Var2, l1.b1 b1Var3, int i11) {
        this.f4789a = i11;
        this.f4790b = b1Var;
        this.f4791c = b1Var2;
        this.f4792d = b1Var3;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        switch (this.f4789a) {
            case 0:
                String it = (String) obj;
                kotlin.jvm.internal.m.f(it, "it");
                this.f4790b.setValue(it);
                Boolean bool = Boolean.FALSE;
                this.f4791c.setValue(bool);
                this.f4792d.setValue(bool);
                break;
            case 1:
                String it2 = (String) obj;
                kotlin.jvm.internal.m.f(it2, "it");
                this.f4790b.setValue(it2);
                Boolean bool2 = Boolean.FALSE;
                this.f4791c.setValue(bool2);
                this.f4792d.setValue(bool2);
                break;
            default:
                this.f4790b.setValue((je) obj);
                this.f4791c.setValue(null);
                this.f4792d.setValue(Boolean.FALSE);
                break;
        }
        return qy.b0.f48488a;
    }
}
