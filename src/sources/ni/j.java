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
public final class j extends xy.i implements fz.e {
    public final /* synthetic */ String H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ApiResponse.Success f43814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f43815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f43816c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f43817d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f43818e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f43819f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f43820t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(m mVar, String str, String str2, String str3, String str4, String str5, vy.d dVar) {
        super(2, dVar);
        this.f43816c = mVar;
        this.f43817d = str;
        this.f43818e = str2;
        this.f43819f = str3;
        this.f43820t = str4;
        this.H = str5;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        return new j(this.f43816c, this.f43817d, this.f43818e, this.f43819f, this.f43820t, this.H, dVar);
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x00be  */
    /* JADX WARN: Code duplicated, block: B:22:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:25:0x00e5 A[PHI: r1 r10 r20
      0x00e5: PHI (r1v12 com.lingodeer.network.model.ApiResponse$Success) = (r1v11 com.lingodeer.network.model.ApiResponse$Success), (r1v13 com.lingodeer.network.model.ApiResponse$Success) binds: [B:23:0x00e2, B:9:0x0040] A[DONT_GENERATE, DONT_INLINE]
      0x00e5: PHI (r10v4 ni.f) = (r10v2 ni.f), (r10v7 ni.f) binds: [B:23:0x00e2, B:9:0x0040] A[DONT_GENERATE, DONT_INLINE]
      0x00e5: PHI (r20v3 vt.c) = (r10v0 vt.c), (r20v4 vt.c) binds: [B:23:0x00e2, B:9:0x0040] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:28:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:31:0x0113 A[PHI: r0 r1 r2 r10 r16 r20
      0x0113: PHI (r0v19 com.lingodeer.network.model.ApiResponse) = (r0v27 com.lingodeer.network.model.ApiResponse), (r0v28 com.lingodeer.network.model.ApiResponse) binds: [B:29:0x0110, B:7:0x002c] A[DONT_GENERATE, DONT_INLINE]
      0x0113: PHI (r1v14 com.lingodeer.network.model.ApiResponse$Success) = (r1v10 com.lingodeer.network.model.ApiResponse$Success), (r1v15 com.lingodeer.network.model.ApiResponse$Success) binds: [B:29:0x0110, B:7:0x002c] A[DONT_GENERATE, DONT_INLINE]
      0x0113: PHI (r2v5 java.lang.Object) = (r2v4 java.lang.Object), (r2v9 java.lang.Object) binds: [B:29:0x0110, B:7:0x002c] A[DONT_GENERATE, DONT_INLINE]
      0x0113: PHI (r10v8 ni.f) = (r10v2 ni.f), (r10v9 ni.f) binds: [B:29:0x0110, B:7:0x002c] A[DONT_GENERATE, DONT_INLINE]
      0x0113: PHI (r16v4 vt.h1) = (r11v0 vt.h1), (r16v5 vt.h1) binds: [B:29:0x0110, B:7:0x002c] A[DONT_GENERATE, DONT_INLINE]
      0x0113: PHI (r20v5 vt.c) = (r10v0 vt.c), (r20v6 vt.c) binds: [B:29:0x0110, B:7:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:33:0x0119  */
    /* JADX WARN: Code duplicated, block: B:36:0x0131 A[PHI: r1 r10 r20
      0x0131: PHI (r1v16 com.lingodeer.network.model.ApiResponse$Success) = (r1v14 com.lingodeer.network.model.ApiResponse$Success), (r1v17 com.lingodeer.network.model.ApiResponse$Success) binds: [B:34:0x012e, B:6:0x0023] A[DONT_GENERATE, DONT_INLINE]
      0x0131: PHI (r10v10 ni.f) = (r10v8 ni.f), (r10v13 ni.f) binds: [B:34:0x012e, B:6:0x0023] A[DONT_GENERATE, DONT_INLINE]
      0x0131: PHI (r20v7 vt.c) = (r20v5 vt.c), (r20v8 vt.c) binds: [B:34:0x012e, B:6:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:38:0x0145 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:39:0x0146  */
    /* JADX WARN: Code duplicated, block: B:40:0x014d  */
    /* JADX WARN: Code duplicated, block: B:41:0x0154 A[RETURN] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // xy.a
    public final Object invokeSuspend(Object obj) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException {
        f fVar;
        boolean z11;
        Object obj2;
        Object objD;
        ApiResponse apiResponse;
        int i11;
        ApiResponse.Success success;
        Object objM;
        BillingStatus billingStatus;
        ApiResponse.Success success2;
        ApiResponse apiResponse2;
        BillingStatus billingStatus2;
        m mVar = this.f43816c;
        vt.c cVar = mVar.f43832b;
        h1 h1Var = mVar.f43831a;
        i1 i1Var = mVar.Y;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = this.f43815b;
        qy.b0 b0Var = qy.b0.f48488a;
        e eVar = e.f43808a;
        f fVar2 = f.f43809a;
        switch (i12) {
            case 0:
                com.bumptech.glide.e.F(obj);
                i1Var.getClass();
                i1Var.l(null, d.f43807a);
                LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                String str = x.n().isUnloginUser() ? "unlogin_user" : x.n().uid;
                u0 u0Var = mVar.f43833c;
                kotlin.jvm.internal.m.c(str);
                this.f43815b = 1;
                fVar = fVar2;
                z11 = true;
                obj2 = "unlogin_user";
                objD = u0Var.d(str, "com.lingodeer", this.f43817d, this.f43818e, this.f43819f, this.f43820t, this.H, this);
                if (objD != aVar) {
                    apiResponse = (ApiResponse) objD;
                    LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                    x.n().hasSyncSubInfo = z11;
                    x.n().updateEntry("hasSyncSubInfo");
                    if (apiResponse instanceof ApiResponse.Success) {
                        i11 = 2;
                        if (kotlin.jvm.internal.m.a(x.n().accountType, obj2)) {
                            billingStatus = (BillingStatus) ((ApiResponse.Success) apiResponse).getData();
                            success2 = null;
                            this.f43814a = null;
                            this.f43815b = 2;
                            if (((x4) h1Var).s(billingStatus, this) != aVar) {
                                i1Var.getClass();
                                i1Var.l(success2, fVar);
                                this.f43814a = success2;
                                this.f43815b = 3;
                                ((vt.d) cVar).a(this);
                                if (b0Var != aVar) {
                                }
                            }
                        } else {
                            success = null;
                            this.f43814a = (ApiResponse.Success) apiResponse;
                            this.f43815b = 4;
                            yz.f fVar3 = o0.f50940a;
                            objM = e0.M(yz.e.f58387a, new b(mVar, false ? 1 : 0, i11), this);
                            if (objM != aVar) {
                                apiResponse2 = apiResponse;
                                if (((ApiResponse) objM) instanceof ApiResponse.Success) {
                                    billingStatus2 = (BillingStatus) ((ApiResponse.Success) apiResponse2).getData();
                                    this.f43814a = success;
                                    this.f43815b = 5;
                                    if (((x4) h1Var).s(billingStatus2, this) != aVar) {
                                        i1Var.getClass();
                                        i1Var.l(success, fVar);
                                        this.f43814a = success;
                                        this.f43815b = 6;
                                        ((vt.d) cVar).a(this);
                                        if (b0Var != aVar) {
                                        }
                                    }
                                } else {
                                    i1Var.getClass();
                                    i1Var.l(success, eVar);
                                }
                            }
                        }
                    } else {
                        i1Var.getClass();
                        i1Var.l(null, eVar);
                    }
                    return b0Var;
                }
                apiResponse2 = apiResponse;
                return aVar;
            case 1:
                com.bumptech.glide.e.F(obj);
                objD = obj;
                obj2 = "unlogin_user";
                fVar = fVar2;
                z11 = true;
                apiResponse = (ApiResponse) objD;
                LingoSkillApplication lingoSkillApplication3 = LingoSkillApplication.f21665b;
                x.n().hasSyncSubInfo = z11;
                x.n().updateEntry("hasSyncSubInfo");
                if (apiResponse instanceof ApiResponse.Success) {
                    i11 = 2;
                    if (kotlin.jvm.internal.m.a(x.n().accountType, obj2)) {
                        billingStatus = (BillingStatus) ((ApiResponse.Success) apiResponse).getData();
                        success2 = null;
                        this.f43814a = null;
                        this.f43815b = 2;
                        if (((x4) h1Var).s(billingStatus, this) != aVar) {
                            i1Var.getClass();
                            i1Var.l(success2, fVar);
                            this.f43814a = success2;
                            this.f43815b = 3;
                            ((vt.d) cVar).a(this);
                            if (b0Var != aVar) {
                            }
                        }
                    } else {
                        success = null;
                        this.f43814a = (ApiResponse.Success) apiResponse;
                        this.f43815b = 4;
                        yz.f fVar4 = o0.f50940a;
                        objM = e0.M(yz.e.f58387a, new b(mVar, false ? 1 : 0, i11), this);
                        if (objM != aVar) {
                            apiResponse2 = apiResponse;
                            if (((ApiResponse) objM) instanceof ApiResponse.Success) {
                                billingStatus2 = (BillingStatus) ((ApiResponse.Success) apiResponse2).getData();
                                this.f43814a = success;
                                this.f43815b = 5;
                                if (((x4) h1Var).s(billingStatus2, this) != aVar) {
                                    i1Var.getClass();
                                    i1Var.l(success, fVar);
                                    this.f43814a = success;
                                    this.f43815b = 6;
                                    ((vt.d) cVar).a(this);
                                    if (b0Var != aVar) {
                                    }
                                }
                            } else {
                                i1Var.getClass();
                                i1Var.l(success, eVar);
                            }
                        }
                    }
                    apiResponse2 = apiResponse;
                    return aVar;
                }
                i1Var.getClass();
                i1Var.l(null, eVar);
                return b0Var;
            case 2:
                com.bumptech.glide.e.F(obj);
                cVar = cVar;
                fVar = fVar2;
                success2 = null;
                i1Var.getClass();
                i1Var.l(success2, fVar);
                this.f43814a = success2;
                this.f43815b = 3;
                ((vt.d) cVar).a(this);
                if (b0Var != aVar) {
                    return b0Var;
                }
                apiResponse2 = apiResponse;
                return aVar;
            case 3:
            case 6:
                com.bumptech.glide.e.F(obj);
                return b0Var;
            case 4:
                ApiResponse.Success success3 = this.f43814a;
                com.bumptech.glide.e.F(obj);
                objM = obj;
                cVar = cVar;
                h1Var = h1Var;
                fVar = fVar2;
                success = null;
                apiResponse2 = success3;
                apiResponse2 = apiResponse;
                if (((ApiResponse) objM) instanceof ApiResponse.Success) {
                    billingStatus2 = (BillingStatus) ((ApiResponse.Success) apiResponse2).getData();
                    this.f43814a = success;
                    this.f43815b = 5;
                    if (((x4) h1Var).s(billingStatus2, this) != aVar) {
                        i1Var.getClass();
                        i1Var.l(success, fVar);
                        this.f43814a = success;
                        this.f43815b = 6;
                        ((vt.d) cVar).a(this);
                        if (b0Var != aVar) {
                        }
                    }
                    apiResponse2 = apiResponse;
                    return aVar;
                }
                i1Var.getClass();
                i1Var.l(success, eVar);
                return b0Var;
            case 5:
                com.bumptech.glide.e.F(obj);
                cVar = cVar;
                fVar = fVar2;
                success = null;
                i1Var.getClass();
                i1Var.l(success, fVar);
                this.f43814a = success;
                this.f43815b = 6;
                ((vt.d) cVar).a(this);
                if (b0Var != aVar) {
                    return b0Var;
                }
                apiResponse2 = apiResponse;
                return aVar;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
