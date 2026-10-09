package pr;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.Toast;
import com.lingodeer.R;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class o extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f47077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f47078c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Bitmap f47079d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(Context context, Bitmap bitmap, vy.d dVar, int i11) {
        super(2, dVar);
        this.f47076a = i11;
        this.f47078c = context;
        this.f47079d = bitmap;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f47076a) {
            case 0:
                return new o(this.f47078c, this.f47079d, dVar, 0);
            case 1:
                return new o(this.f47078c, this.f47079d, dVar, 1);
            case 2:
                return new o(this.f47078c, this.f47079d, dVar, 2);
            case 3:
                return new o(this.f47078c, this.f47079d, dVar, 3);
            default:
                return new o(this.f47078c, this.f47079d, dVar, 4);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f47076a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return ((o) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f47076a) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f47077b;
                Context context = this.f47078c;
                if (i11 == 0) {
                    com.bumptech.glide.e.F(obj);
                    String strValueOf = String.valueOf(System.currentTimeMillis());
                    this.f47077b = 1;
                    if (ks.b.h(context, this.f47079d, strValueOf, this) == aVar) {
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
            case 1:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f47077b;
                Context context2 = this.f47078c;
                if (i12 == 0) {
                    com.bumptech.glide.e.F(obj);
                    String strValueOf2 = String.valueOf(System.currentTimeMillis());
                    this.f47077b = 1;
                    if (ks.b.h(context2, this.f47079d, strValueOf2, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                Toast.makeText(context2, context2.getString(R.string.success), 0).show();
                return qy.b0.f48488a;
            case 2:
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                int i13 = this.f47077b;
                Context context3 = this.f47078c;
                if (i13 == 0) {
                    com.bumptech.glide.e.F(obj);
                    String strValueOf3 = String.valueOf(System.currentTimeMillis());
                    this.f47077b = 1;
                    if (ks.b.h(context3, this.f47079d, strValueOf3, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                Toast.makeText(context3, context3.getString(R.string.success), 0).show();
                return qy.b0.f48488a;
            case 3:
                wy.a aVar4 = wy.a.COROUTINE_SUSPENDED;
                int i14 = this.f47077b;
                Context context4 = this.f47078c;
                if (i14 == 0) {
                    com.bumptech.glide.e.F(obj);
                    String strValueOf4 = String.valueOf(System.currentTimeMillis());
                    this.f47077b = 1;
                    if (ks.b.h(context4, this.f47079d, strValueOf4, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                Toast.makeText(context4, context4.getString(R.string.success), 0).show();
                return qy.b0.f48488a;
            default:
                wy.a aVar5 = wy.a.COROUTINE_SUSPENDED;
                int i15 = this.f47077b;
                Context context5 = this.f47078c;
                if (i15 == 0) {
                    com.bumptech.glide.e.F(obj);
                    String strValueOf5 = String.valueOf(System.currentTimeMillis());
                    this.f47077b = 1;
                    if (ks.b.h(context5, this.f47079d, strValueOf5, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                Toast.makeText(context5, context5.getString(R.string.success), 0).show();
                return qy.b0.f48488a;
        }
    }
}
