package dt;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class c4 implements l1.i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f23709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f23710c;

    public /* synthetic */ c4(boolean z11, c1 c1Var, int i11) {
        this.f23708a = i11;
        this.f23709b = z11;
        this.f23710c = c1Var;
    }

    @Override // l1.i0
    public final void dispose() {
        c1 c1Var;
        fz.c cVar;
        c1 c1Var2;
        fz.c cVar2;
        switch (this.f23708a) {
            case 0:
                if (this.f23709b && (c1Var = (c1) this.f23710c) != null && (cVar = c1Var.f23697c) != null) {
                    cVar.invoke(Boolean.FALSE);
                    break;
                }
                break;
            case 1:
                if (this.f23709b && (c1Var2 = (c1) this.f23710c) != null && (cVar2 = c1Var2.f23697c) != null) {
                    cVar2.invoke(Boolean.FALSE);
                    break;
                }
                break;
            default:
                ((View) this.f23710c).setKeepScreenOn(this.f23709b);
                break;
        }
    }

    public c4(View view, boolean z11) {
        this.f23708a = 2;
        this.f23710c = view;
        this.f23709b = z11;
    }
}
