package fu;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.Toast;
import com.lingodeer.R;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class i extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f28108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f28109c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Bitmap f28110d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f28111e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(Context context, Bitmap bitmap, String str, vy.d dVar, int i11) {
        super(2, dVar);
        this.f28107a = i11;
        this.f28109c = context;
        this.f28110d = bitmap;
        this.f28111e = str;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f28107a) {
            case 0:
                return new i(this.f28109c, this.f28110d, this.f28111e, dVar, 0);
            default:
                return new i(this.f28109c, this.f28110d, this.f28111e, dVar, 1);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f28107a) {
            case 0:
                break;
        }
        return ((i) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f28107a) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f28108b;
                Context context = this.f28109c;
                if (i11 == 0) {
                    com.bumptech.glide.e.F(obj);
                    this.f28108b = 1;
                    if (ks.b.h(context, this.f28110d, this.f28111e, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                Toast.makeText(context, context.getString(R.string.success), 0).show();
                return qy.b0.f48488a;
            default:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f28108b;
                if (i12 == 0) {
                    com.bumptech.glide.e.F(obj);
                    this.f28108b = 1;
                    if (ks.b.h(this.f28109c, this.f28110d, this.f28111e, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return qy.b0.f48488a;
        }
    }
}
