package z4;

import android.text.TextUtils;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends sy.f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f58833e;

    public f0(int i11, Class cls, int i12, int i13, int i14) {
        this.f58833e = i14;
        this.f51940a = i11;
        this.f51943d = cls;
        this.f51942c = i12;
        this.f51941b = i13;
    }

    @Override // sy.f
    public final Object c(View view) {
        switch (this.f58833e) {
            case 0:
                return Boolean.valueOf(n0.c(view));
            case 1:
                return n0.a(view);
            case 2:
                return p0.b(view);
            default:
                return Boolean.valueOf(n0.b(view));
        }
    }

    @Override // sy.f
    public final void d(View view, Object obj) {
        switch (this.f58833e) {
            case 0:
                n0.f(view, ((Boolean) obj).booleanValue());
                break;
            case 1:
                n0.e(view, (CharSequence) obj);
                break;
            case 2:
                p0.d(view, (CharSequence) obj);
                break;
            default:
                n0.d(view, ((Boolean) obj).booleanValue());
                break;
        }
    }

    @Override // sy.f
    public final boolean g(Object obj, Object obj2) {
        boolean zEquals;
        switch (this.f58833e) {
            case 0:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                return !((bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue()));
            case 1:
                zEquals = TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
                break;
            case 2:
                zEquals = TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
                break;
            default:
                Boolean bool3 = (Boolean) obj;
                Boolean bool4 = (Boolean) obj2;
                return !((bool3 != null && bool3.booleanValue()) == (bool4 != null && bool4.booleanValue()));
        }
        return !zEquals;
    }
}
