package wg;

import android.webkit.WebView;
import kotlin.KotlinNothingValueException;
import rz.b0;
import uz.w0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class k extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f55136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f55137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f55138c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ WebView f55139d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(q qVar, WebView webView, vy.d dVar, int i11) {
        super(2, dVar);
        this.f55136a = i11;
        this.f55138c = qVar;
        this.f55139d = webView;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f55136a) {
            case 0:
                return new k(this.f55138c, this.f55139d, dVar, 0);
            default:
                return new k(this.f55138c, this.f55139d, dVar, 1);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        b0 b0Var = (b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f55136a) {
            case 0:
                break;
        }
        return ((k) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f55136a) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f55137b;
                if (i11 == 0) {
                    com.bumptech.glide.e.F(obj);
                    this.f55137b = 1;
                    if (this.f55138c.a(this.f55139d, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                throw new KotlinNothingValueException();
            default:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f55137b;
                if (i12 == 0) {
                    com.bumptech.glide.e.F(obj);
                    w0 w0Var = this.f55138c.f55159a;
                    p pVar = new p();
                    this.f55137b = 1;
                    w0Var.getClass();
                    if (w0.l(w0Var, pVar, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                throw new KotlinNothingValueException();
        }
    }
}
