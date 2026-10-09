package qp;

import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class w0 implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f48242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextView f48243b;

    public /* synthetic */ w0(TextView textView, int i11) {
        this.f48242a = i11;
        this.f48243b = textView;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f48242a) {
            case 0:
                v10.c.F(this.f48243b, 62, 2);
                break;
            case 1:
                v10.c.F(this.f48243b, 62, 2);
                break;
            case 2:
                v10.c.F(this.f48243b, 32, 2);
                break;
            case 3:
                try {
                    v10.c.F(this.f48243b, 14, 2);
                    break;
                } catch (Exception e8) {
                    e8.printStackTrace();
                }
                return qy.b0.f48488a;
            default:
                try {
                    v10.c.F(this.f48243b, 20, 2);
                    break;
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
                return qy.b0.f48488a;
        }
        return qy.b0.f48488a;
    }
}
