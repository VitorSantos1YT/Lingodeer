package vq;

import com.lingodeer.network.model.ApiResponse;
import dv.u0;
import hj.x3;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.y;
import qy.q;
import rz.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class l extends xy.i implements fz.e {
    public final /* synthetic */ String H;
    public final /* synthetic */ String K;
    public final /* synthetic */ q L;
    public final /* synthetic */ q M;
    public final /* synthetic */ int N;
    public final /* synthetic */ int O;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f54112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f54113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f54114c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f54115d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g1.k f54116e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f54117f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ y f54118t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(String str, String str2, String str3, g1.k kVar, String str4, y yVar, String str5, String str6, q qVar, q qVar2, int i11, int i12, vy.d dVar) {
        super(2, dVar);
        this.f54113b = str;
        this.f54114c = str2;
        this.f54115d = str3;
        this.f54116e = kVar;
        this.f54117f = str4;
        this.f54118t = yVar;
        this.H = str5;
        this.K = str6;
        this.L = qVar;
        this.M = qVar2;
        this.N = i11;
        this.O = i12;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        return new l(this.f54113b, this.f54114c, this.f54115d, this.f54116e, this.f54117f, this.f54118t, this.H, this.K, this.L, this.M, this.N, this.O, dVar);
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException {
        l lVar;
        x3 x3Var = (x3) this.f54116e.f28529b;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f54112a;
        if (i11 == 0) {
            com.bumptech.glide.e.F(obj);
            u0 u0Var = (u0) this.L.getValue();
            long j11 = Long.parseLong(this.f54113b);
            int i12 = Integer.parseInt(this.f54114c);
            int i13 = Integer.parseInt(this.f54115d);
            boolean zIsChecked = x3Var.f33578k.f32725c.isChecked();
            String string = x3Var.f33578k.f32728f.getText().toString();
            if (string.length() == 0) {
                string = "My Answer should be accepted.";
            }
            String str = ((Object) string) + this.f54118t.f38361a + "--(" + this.H + ")";
            this.f54112a = 1;
            lVar = this;
            obj = u0Var.D(j11, i12, i13, zIsChecked, this.f54117f, str, lVar);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(obj);
            lVar = this;
        }
        ApiResponse apiResponse = (ApiResponse) obj;
        boolean z11 = apiResponse instanceof ApiResponse.Error;
        int i14 = lVar.O;
        int i15 = lVar.N;
        q qVar = lVar.M;
        String str2 = lVar.K;
        if (z11) {
            if (str2.length() > 0) {
                ((ur.a) qVar.getValue()).c("jxz_main_click_in_lesson_bugrep", new k(str2, i15, i14, 1));
            }
        } else {
            if (!(apiResponse instanceof ApiResponse.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            if (str2.length() > 0) {
                ((ur.a) qVar.getValue()).c("jxz_main_click_in_lesson_bugrep", new k(str2, i15, i14, 2));
            }
        }
        return qy.b0.f48488a;
    }
}
