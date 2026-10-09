package x5;

import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends c.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f55796a;

    public g(TextView textView) {
        this.f55796a = new f(textView);
    }

    @Override // c.a
    public final void E(boolean z11) {
        if (v5.j.d()) {
            this.f55796a.E(z11);
        }
    }

    @Override // c.a
    public final void F(boolean z11) {
        boolean zD = v5.j.d();
        f fVar = this.f55796a;
        if (zD) {
            fVar.F(z11);
        } else {
            fVar.f55795c = z11;
        }
    }

    @Override // c.a
    public final TransformationMethod J(TransformationMethod transformationMethod) {
        return !v5.j.d() ? transformationMethod : this.f55796a.J(transformationMethod);
    }

    @Override // c.a
    public final InputFilter[] p(InputFilter[] inputFilterArr) {
        return !v5.j.d() ? inputFilterArr : this.f55796a.p(inputFilterArr);
    }

    @Override // c.a
    public final boolean z() {
        return this.f55796a.f55795c;
    }
}
