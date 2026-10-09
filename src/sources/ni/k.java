package ni;

import cf.x;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingodeer.data.model.BillingStatus;
import com.lingodeer.network.model.ApiResponse;
import dv.u0;
import fr.x4;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import rz.b0;
import rz.e0;
import rz.o0;
import uz.i1;
import vt.h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class k extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f43821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f43822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f43823c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f43824d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f43825e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f43826f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(m mVar, String str, String str2, String str3, String str4, vy.d dVar) {
        super(2, dVar);
        this.f43822b = mVar;
        this.f43823c = str;
        this.f43824d = str2;
        this.f43825e = str3;
        this.f43826f = str4;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        return new k(this.f43822b, this.f43823c, this.f43824d, this.f43825e, this.f43826f, dVar);
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:22:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:25:0x00cd A[PHI: r19
      0x00cd: PHI (r19v3 vt.c) = (r9v0 vt.c), (r19v4 vt.c) binds: [B:23:0x00ca, B:9:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:28:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:31:0x00f5 A[PHI: r0 r6 r19
      0x00f5: PHI (r0v23 java.lang.Object) = (r0v16 java.lang.Object), (r0v29 java.lang.Object) binds: [B:29:0x00f2, B:7:0x002b] A[DONT_GENERATE, DONT_INLINE]
      0x00f5: PHI (r6v5 vy.d) = (r6v3 vy.d), (r6v6 vy.d) binds: [B:29:0x00f2, B:7:0x002b] A[DONT_GENERATE, DONT_INLINE]
      0x00f5: PHI (r19v5 vt.c) = (r9v0 vt.c), (r19v6 vt.c) binds: [B:29:0x00f2, B:7:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:33:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:36:0x010f A[PHI: r6 r19
      0x010f: PHI (r6v7 vy.d) = (r6v5 vy.d), (r6v8 vy.d) binds: [B:34:0x010c, B:6:0x0023] A[DONT_GENERATE, DONT_INLINE]
      0x010f: PHI (r19v7 vt.c) = (r19v5 vt.c), (r19v8 vt.c) binds: [B:34:0x010c, B:6:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:38:0x0121 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:39:0x0122  */
    /* JADX WARN: Code duplicated, block: B:40:0x0129  */
    /* JADX WARN: Code duplicated, block: B:41:0x0130 A[RETURN] */
    @Override // xy.a
    public final Object invokeSuspend(Object obj) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException {
        boolean z11;
        Object obj2;
        Object objF;
        ApiResponse apiResponse;
        int i11;
        vy.d dVar;
        Object objM;
        BillingStatus billingStatus;
        ApiResponse apiResponse2;
        BillingStatus billingStatus2;
        m mVar = this.f43822b;
        vt.c cVar = mVar.f43832b;
        h1 h1Var = mVar.f43831a;
        i1 i1Var = mVar.Y;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = this.f43821a;
        qy.b0 b0Var = qy.b0.f48488a;
        e eVar = e.f43808a;
        f fVar = f.f43809a;
        switch (i12) {
            case 0:
                com.bumptech.glide.e.F(obj);
                i1Var.getClass();
                i1Var.l(null, d.f43807a);
                LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                String str = x.n().isUnloginUser() ? "unlogin_user" : x.n().uid;
                u0 u0Var = mVar.f43833c;
                kotlin.jvm.internal.m.c(str);
                this.f43821a = 1;
                z11 = true;
                obj2 = "unlogin_user";
                objF = u0Var.f(str, "com.lingodeer", this.f43823c, this.f43824d, this.f43825e, this.f43826f, this);
                if (objF != aVar) {
                    apiResponse = (ApiResponse) objF;
                    LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                    x.n().hasSyncSubInfo = z11;
                    x.n().updateEntry("hasSyncSubInfo");
                    if (apiResponse instanceof ApiResponse.Success) {
                        i11 = 2;
                        if (kotlin.jvm.internal.m.a(x.n().accountType, obj2)) {
                            billingStatus = (BillingStatus) ((ApiResponse.Success) apiResponse).getData();
                            this.f43821a = 2;
                            if (((x4) h1Var).s(billingStatus, this) != aVar) {
                                i1Var.getClass();
                                i1Var.l(null, fVar);
                                this.f43821a = 3;
                                ((vt.d) cVar).a(this);
                                if (b0Var == aVar) {
                                }
                            }
                        } else {
                            dVar = null;
                            this.f43821a = 4;
                            yz.f fVar2 = o0.f50940a;
                            objM = e0.M(yz.e.f58387a, new b(mVar, dVar, i11), this);
                            if (objM != aVar) {
                                apiResponse2 = (ApiResponse) objM;
                                if (apiResponse2 instanceof ApiResponse.Success) {
                                    billingStatus2 = (BillingStatus) ((ApiResponse.Success) apiResponse2).getData();
                                    this.f43821a = 5;
                                    if (((x4) h1Var).s(billingStatus2, this) != aVar) {
                                        i1Var.getClass();
                                        i1Var.l(dVar, fVar);
                                        this.f43821a = 6;
                                        ((vt.d) cVar).a(this);
                                        if (b0Var == aVar) {
                                        }
                                    }
                                } else {
                                    i1Var.getClass();
                                    i1Var.l(dVar, eVar);
                                }
                            }
                        }
                    } else {
                        i1Var.getClass();
                        i1Var.l(null, eVar);
                    }
                    return b0Var;
                }
                return aVar;
            case 1:
                com.bumptech.glide.e.F(obj);
                objF = obj;
                obj2 = "unlogin_user";
                z11 = true;
                apiResponse = (ApiResponse) objF;
                LingoSkillApplication lingoSkillApplication3 = LingoSkillApplication.f21665b;
                x.n().hasSyncSubInfo = z11;
                x.n().updateEntry("hasSyncSubInfo");
                if (apiResponse instanceof ApiResponse.Success) {
                    i11 = 2;
                    if (kotlin.jvm.internal.m.a(x.n().accountType, obj2)) {
                        billingStatus = (BillingStatus) ((ApiResponse.Success) apiResponse).getData();
                        this.f43821a = 2;
                        if (((x4) h1Var).s(billingStatus, this) != aVar) {
                            i1Var.getClass();
                            i1Var.l(null, fVar);
                            this.f43821a = 3;
                            ((vt.d) cVar).a(this);
                            if (b0Var == aVar) {
                            }
                        }
                    } else {
                        dVar = null;
                        this.f43821a = 4;
                        yz.f fVar3 = o0.f50940a;
                        objM = e0.M(yz.e.f58387a, new b(mVar, dVar, i11), this);
                        if (objM != aVar) {
                            apiResponse2 = (ApiResponse) objM;
                            if (apiResponse2 instanceof ApiResponse.Success) {
                                billingStatus2 = (BillingStatus) ((ApiResponse.Success) apiResponse2).getData();
                                this.f43821a = 5;
                                if (((x4) h1Var).s(billingStatus2, this) != aVar) {
                                    i1Var.getClass();
                                    i1Var.l(dVar, fVar);
                                    this.f43821a = 6;
                                    ((vt.d) cVar).a(this);
                                    if (b0Var == aVar) {
                                    }
                                }
                            } else {
                                i1Var.getClass();
                                i1Var.l(dVar, eVar);
                            }
                        }
                    }
                    return aVar;
                }
                i1Var.getClass();
                i1Var.l(null, eVar);
                return b0Var;
            case 2:
                com.bumptech.glide.e.F(obj);
                cVar = cVar;
                i1Var.getClass();
                i1Var.l(null, fVar);
                this.f43821a = 3;
                ((vt.d) cVar).a(this);
                if (b0Var == aVar) {
                    return aVar;
                }
                return b0Var;
            case 3:
            case 6:
                com.bumptech.glide.e.F(obj);
                return b0Var;
            case 4:
                com.bumptech.glide.e.F(obj);
                objM = obj;
                dVar = null;
                cVar = cVar;
                apiResponse2 = (ApiResponse) objM;
                if (apiResponse2 instanceof ApiResponse.Success) {
                    billingStatus2 = (BillingStatus) ((ApiResponse.Success) apiResponse2).getData();
                    this.f43821a = 5;
                    if (((x4) h1Var).s(billingStatus2, this) != aVar) {
                        i1Var.getClass();
                        i1Var.l(dVar, fVar);
                        this.f43821a = 6;
                        ((vt.d) cVar).a(this);
                        if (b0Var == aVar) {
                        }
                    }
                    return aVar;
                }
                i1Var.getClass();
                i1Var.l(dVar, eVar);
                return b0Var;
            case 5:
                com.bumptech.glide.e.F(obj);
                dVar = null;
                cVar = cVar;
                i1Var.getClass();
                i1Var.l(dVar, fVar);
                this.f43821a = 6;
                ((vt.d) cVar).a(this);
                if (b0Var == aVar) {
                    return aVar;
                }
                return b0Var;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
