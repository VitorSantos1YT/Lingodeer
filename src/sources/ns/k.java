package ns;

import com.lingodeer.network.model.ApiResponse;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f43992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f43993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f43994c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f43995d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l f43996e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c f43997f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f43998t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(String str, String str2, l lVar, c cVar, String str3, vy.d dVar) {
        super(2, dVar);
        this.f43994c = str;
        this.f43995d = str2;
        this.f43996e = lVar;
        this.f43997f = cVar;
        this.f43998t = str3;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        k kVar = new k(this.f43994c, this.f43995d, this.f43996e, this.f43997f, this.f43998t, dVar);
        kVar.f43993b = obj;
        return kVar;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        Object objL;
        l lVar = this.f43996e;
        rz.b0 b0Var = (rz.b0) this.f43993b;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f43992a;
        try {
            if (i11 == 0) {
                com.bumptech.glide.e.F(obj);
                String str = this.f43994c;
                if (!oz.q.K0(str)) {
                    String str2 = this.f43995d;
                    if (!oz.q.K0(str2)) {
                        if (!((fr.o0) xt.b.c()).c()) {
                            return h.f43975c;
                        }
                        int i12 = l.f44000c;
                        StringBuilder sbS = defpackage.e.s("\nMode: ", this.f43997f.a(), "\nTarget Language: ", xt.d.n(((fr.o0) xt.b.c()).f27733a.keyLanguage), "\nMeaning: ");
                        com.google.android.material.datepicker.d.w(sbS, this.f43998t, "\nReference: ", str, "\nInput: ");
                        sbS.append(str2);
                        sbS.append("\n");
                        String strG0 = oz.r.g0(sbS.toString());
                        long jE = pz.a.e(l.f43999b);
                        j jVar = new j(0, lVar, strG0, null);
                        this.f43993b = b0Var;
                        this.f43992a = 1;
                        obj = rz.e0.O(jE, jVar, this);
                        if (obj == aVar) {
                            return aVar;
                        }
                    }
                }
                return h.f43975c;
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(obj);
            ApiResponse apiResponse = (ApiResponse) obj;
            if (apiResponse == null) {
                pz.a.k(l.f43999b);
                return h.f43975c;
            }
            if (apiResponse instanceof ApiResponse.Error) {
                ApiResponse.Error error = (ApiResponse.Error) apiResponse;
                error.getCode();
                error.getMessage();
                return h.f43975c;
            }
            if (!(apiResponse instanceof ApiResponse.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            String str3 = (String) ((ApiResponse.Success) apiResponse).getData();
            if (oz.q.K0(str3)) {
                return h.f43975c;
            }
            try {
                objL = o.p(str3);
            } catch (Throwable th2) {
                objL = com.bumptech.glide.e.l(th2);
            }
            return qy.o.a(objL) == null ? (h) objL : h.f43975c;
        } catch (CancellationException e8) {
            throw e8;
        } catch (Exception unused) {
            return h.f43975c;
        }
    }
}
