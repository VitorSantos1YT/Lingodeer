package app.rive.runtime.kotlin;

import com.android.volley.VolleyError;
import com.facebook.FacebookException;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.ObjectConstructor;
import java.io.IOException;
import lf.u;
import ob.f;
import pd.j;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements j, ObjectConstructor, u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f2821b;

    public /* synthetic */ b(String str, int i11) {
        this.f2820a = i11;
        this.f2821b = str;
    }

    @Override // com.google.gson.internal.ObjectConstructor
    public Object construct() {
        switch (this.f2820a) {
            case 1:
                return ConstructorConstructor.lambda$newUnsafeAllocator$20(this.f2821b);
            case 2:
                return ConstructorConstructor.lambda$newDefaultConstructor$7(this.f2821b);
            case 3:
                return ConstructorConstructor.lambda$newDefaultConstructor$8(this.f2821b);
            case 4:
                return ConstructorConstructor.lambda$get$2(this.f2821b);
            case 5:
                return ConstructorConstructor.lambda$get$3(this.f2821b);
            default:
                return ConstructorConstructor.lambda$get$4(this.f2821b);
        }
    }

    @Override // pd.j
    public void g(VolleyError volleyError) throws IOException {
        RiveAnimationView.loadFromNetwork$lambda$5(this.f2821b, volleyError);
    }

    @Override // lf.u
    public void h(boolean z11) {
        String str = this.f2821b;
        int i11 = FacebookException.f7717a;
        if (z11) {
            try {
                rf.a aVar = new rf.a(str);
                if ((aVar.f49240b == null || aVar.f49241c == null) ? false : true) {
                    f.R(aVar.f49239a, aVar.toString());
                }
            } catch (Exception unused) {
            }
        }
    }
}
