package bp;

import android.content.Context;
import android.content.res.Resources;
import com.google.protobuf.DescriptorProtos;
import com.lingo.lingoskill.object.LanguageItem;
import com.lingodeer.R;
import com.lingodeer.database.model.LanguageHistoryEntity;
import com.stkouyu.util.httputil.Consts;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.UCrop;
import com.yalantis.ucrop.view.CropImageView;
import h1.ua;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class x0 implements fz.e {
    public final /* synthetic */ l1.b1 H;
    public final /* synthetic */ Context K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LanguageHistoryEntity f4885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LanguageItem f4886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f4887c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gp.m f4888d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fz.c f4889e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f4890f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Integer f4891t;

    public x0(Context context, LanguageItem languageItem, LanguageHistoryEntity languageHistoryEntity, fz.c cVar, gp.m mVar, Integer num, l1.b1 b1Var, boolean z11, boolean z12) {
        this.f4885a = languageHistoryEntity;
        this.f4886b = languageItem;
        this.f4887c = z11;
        this.f4888d = mVar;
        this.f4889e = cVar;
        this.f4890f = z12;
        this.f4891t = num;
        this.H = b1Var;
        this.K = context;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        String strM;
        l1.n nVar = (l1.n) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i11 = 1;
        l1.s sVar = (l1.s) nVar;
        if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
            w2.q0 q0VarD = j0.o.d(z1.c.f58463a, false);
            int iHashCode = Long.hashCode(sVar.T);
            l1.q1 q1VarL = sVar.l();
            z1.o oVar = z1.o.f58481a;
            z1.r rVarC = z1.a.c(sVar, oVar);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(y2.j.f56917f, q0VarD, sVar);
            l1.t.J(y2.j.f56916e, q1VarL, sVar);
            y2.h hVar = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC, sVar);
            n2.a aVar = (n2.a) sVar.j(z2.g1.f58551l);
            LanguageHistoryEntity languageHistoryEntity = this.f4885a;
            boolean zF = sVar.f(languageHistoryEntity.getId());
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (zF || objQ == gVar) {
                objQ = defpackage.e.v(0, sVar);
            }
            l1.a1 a1Var = (l1.a1) objQ;
            boolean zF2 = sVar.f(languageHistoryEntity.getId());
            Object objQ2 = sVar.Q();
            if (zF2 || objQ2 == gVar) {
                objQ2 = b0.e.a(CropImageView.DEFAULT_ASPECT_RATIO);
                sVar.o0(objQ2);
            }
            b0.d dVar = (b0.d) objQ2;
            v3.c cVar = (v3.c) sVar.j(z2.g1.f58547h);
            Integer numValueOf = Integer.valueOf(((l1.h1) a1Var).l());
            boolean zF3 = sVar.f(a1Var) | sVar.f(cVar) | sVar.h(dVar);
            Object objQ3 = sVar.Q();
            if (zF3 || objQ3 == gVar) {
                objQ3 = new u0(cVar, dVar, a1Var, (vy.d) null);
                sVar.o0(objQ3);
            }
            l1.t.g(numValueOf, cVar, (fz.e) objQ3, sVar);
            boolean zH = sVar.h(dVar);
            Object objQ4 = sVar.Q();
            if (zH || objQ4 == gVar) {
                objQ4 = new av.t(dVar, i11);
                sVar.o0(objQ4);
            }
            z1.r rVarQ = g2.f0.q(oVar, (fz.c) objQ4);
            l1.c3 c3Var = h1.v1.f31180a;
            long j11 = ((h1.s1) sVar.j(c3Var)).f31033p;
            gp.m mVar = this.f4888d;
            boolean zH2 = sVar.h(mVar) | sVar.h(languageHistoryEntity);
            fz.c cVar2 = this.f4889e;
            boolean zF4 = zH2 | sVar.f(cVar2);
            LanguageItem languageItem = this.f4886b;
            boolean zH3 = zF4 | sVar.h(languageItem);
            Object objQ5 = sVar.Q();
            if (zH3 || objQ5 == gVar) {
                objQ5 = new v0(mVar, languageHistoryEntity, cVar2, languageItem);
                sVar.o0(objQ5);
            }
            fz.a aVar2 = (fz.a) objQ5;
            boolean z11 = this.f4890f;
            boolean zG = sVar.g(z11) | sVar.f(a1Var) | sVar.h(aVar) | sVar.h(languageHistoryEntity);
            Object objQ6 = sVar.Q();
            if (zG || objQ6 == gVar) {
                objQ6 = new w0(z11, aVar, languageHistoryEntity, a1Var, this.H);
                sVar.o0(objQ6);
            }
            g1.g(rVarQ, languageItem, this.f4887c, false, j11, aVar2, (fz.a) objQ6, this.f4891t, sVar, 3072, 0);
            boolean zD = sVar.d(languageItem.getLocate());
            Object objQ7 = sVar.Q();
            if (zD || objQ7 == gVar) {
                int[] iArr = bq.r.f4959a;
                objQ7 = bq.m.w(this.K, bq.m.x(languageItem.getLocate()));
                sVar.o0(objQ7);
            }
            Resources resource = (Resources) objQ7;
            boolean zD2 = sVar.d(languageItem.getKeyLanguage());
            Object objQ8 = sVar.Q();
            if (zD2 || objQ8 == gVar) {
                int keyLanguage = 53;
                switch (languageItem.getKeyLanguage()) {
                    case 30:
                    case 33:
                    case 37:
                        keyLanguage = 1;
                        break;
                    case 31:
                    case 38:
                        keyLanguage = 2;
                        break;
                    case Consts.SP /* 32 */:
                    case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                    case 35:
                        keyLanguage = 0;
                        break;
                    case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                        break;
                    case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                        keyLanguage = 4;
                        break;
                    case DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                    case 47:
                    case 48:
                    case 49:
                    case 50:
                    case 51:
                    case 53:
                    case 54:
                    case 55:
                    case 57:
                    case 61:
                    case 63:
                    case 65:
                    case UCrop.REQUEST_CROP /* 69 */:
                    default:
                        keyLanguage = languageItem.getKeyLanguage();
                        break;
                    case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                        keyLanguage = 10;
                        break;
                    case 43:
                        keyLanguage = 6;
                        break;
                    case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                        keyLanguage = 3;
                        break;
                    case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                        keyLanguage = 20;
                        break;
                    case 46:
                        keyLanguage = 8;
                        break;
                    case 52:
                        keyLanguage = 51;
                        break;
                    case 56:
                        keyLanguage = 7;
                        break;
                    case 58:
                        keyLanguage = 47;
                        break;
                    case 59:
                        keyLanguage = 57;
                        break;
                    case 60:
                        keyLanguage = 21;
                        break;
                    case 62:
                        keyLanguage = 61;
                        break;
                    case 64:
                        keyLanguage = 63;
                        break;
                    case 66:
                        keyLanguage = 65;
                        break;
                    case 67:
                        keyLanguage = 18;
                        break;
                    case 68:
                        keyLanguage = 19;
                        break;
                    case 70:
                        keyLanguage = 69;
                        break;
                }
                objQ8 = Integer.valueOf(keyLanguage);
                sVar.o0(objQ8);
            }
            int iIntValue2 = ((Number) objQ8).intValue();
            int[] iArr2 = bq.r.f4959a;
            kotlin.jvm.internal.m.f(resource, "resource");
            if (iIntValue2 == 40) {
                strM = defpackage.e.m(resource.getString(R.string.italy), " 2");
            } else if (iIntValue2 == 57) {
                strM = resource.getString(R.string.thai);
                kotlin.jvm.internal.m.e(strM, "getString(...)");
            } else if (iIntValue2 == 61) {
                strM = resource.getString(R.string.hindi);
                kotlin.jvm.internal.m.e(strM, "getString(...)");
            } else if (iIntValue2 == 63) {
                strM = resource.getString(R.string.ukr);
                kotlin.jvm.internal.m.e(strM, "getString(...)");
            } else if (iIntValue2 == 65) {
                strM = resource.getString(R.string.grk);
                kotlin.jvm.internal.m.e(strM, "getString(...)");
            } else if (iIntValue2 != 69) {
                switch (iIntValue2) {
                    case 0:
                        strM = resource.getString(R.string.chinese);
                        kotlin.jvm.internal.m.e(strM, "getString(...)");
                        break;
                    case 1:
                        strM = resource.getString(R.string.japanese);
                        kotlin.jvm.internal.m.e(strM, "getString(...)");
                        break;
                    case 2:
                        strM = resource.getString(R.string.korean);
                        kotlin.jvm.internal.m.e(strM, "getString(...)");
                        break;
                    case 3:
                        strM = resource.getString(R.string.english);
                        kotlin.jvm.internal.m.e(strM, "getString(...)");
                        break;
                    case 4:
                        strM = resource.getString(R.string.spanish);
                        kotlin.jvm.internal.m.e(strM, "getString(...)");
                        break;
                    case 5:
                        strM = resource.getString(R.string.french_normal);
                        kotlin.jvm.internal.m.e(strM, "getString(...)");
                        break;
                    case 6:
                        strM = resource.getString(R.string.german);
                        kotlin.jvm.internal.m.e(strM, "getString(...)");
                        break;
                    case 7:
                        strM = resource.getString(R.string.vietnamese);
                        kotlin.jvm.internal.m.e(strM, "getString(...)");
                        break;
                    case 8:
                        strM = resource.getString(R.string.portuguese);
                        kotlin.jvm.internal.m.e(strM, "getString(...)");
                        break;
                    case 9:
                        strM = resource.getString(R.string.chinese);
                        kotlin.jvm.internal.m.e(strM, "getString(...)");
                        break;
                    case 10:
                        strM = resource.getString(R.string.russian);
                        kotlin.jvm.internal.m.e(strM, "getString(...)");
                        break;
                    case 11:
                        strM = defpackage.e.m(resource.getString(R.string.chinese), " 2");
                        break;
                    case 12:
                        strM = defpackage.e.m(resource.getString(R.string.japanese), " 2");
                        break;
                    case 13:
                        strM = defpackage.e.m(resource.getString(R.string.korean), " 2");
                        break;
                    case 14:
                        strM = defpackage.e.m(resource.getString(R.string.spanish), " 2");
                        break;
                    case 15:
                        strM = defpackage.e.m(resource.getString(R.string.french_normal), " 2");
                        break;
                    case 16:
                        strM = defpackage.e.m(resource.getString(R.string.german), " 2");
                        break;
                    case 17:
                        strM = defpackage.e.m(resource.getString(R.string.portuguese), " 2");
                        break;
                    case 18:
                        strM = resource.getString(R.string.indonesia);
                        kotlin.jvm.internal.m.e(strM, "getString(...)");
                        break;
                    case 19:
                        strM = resource.getString(R.string.polish);
                        kotlin.jvm.internal.m.e(strM, "getString(...)");
                        break;
                    case 20:
                        strM = resource.getString(R.string.italy);
                        kotlin.jvm.internal.m.e(strM, "getString(...)");
                        break;
                    case 21:
                        strM = resource.getString(R.string.turkish);
                        kotlin.jvm.internal.m.e(strM, "getString(...)");
                        break;
                    case 22:
                        strM = defpackage.e.m(resource.getString(R.string.russian), " 2");
                        break;
                    default:
                        switch (iIntValue2) {
                            case 47:
                                strM = resource.getString(R.string.spanish_us);
                                kotlin.jvm.internal.m.e(strM, "getString(...)");
                                break;
                            case 48:
                                strM = defpackage.e.m(resource.getString(R.string.spanish_us), " 2");
                                break;
                            case 49:
                                strM = resource.getString(R.string.english_es);
                                kotlin.jvm.internal.m.e(strM, "getString(...)");
                                break;
                            case 50:
                                strM = defpackage.e.m(resource.getString(R.string.english_es), " 2");
                                break;
                            case 51:
                                strM = resource.getString(R.string.arabic);
                                kotlin.jvm.internal.m.e(strM, "getString(...)");
                                break;
                            default:
                                switch (iIntValue2) {
                                    case 53:
                                        strM = resource.getString(R.string.french_accelerated);
                                        kotlin.jvm.internal.m.e(strM, "getString(...)");
                                        break;
                                    case 54:
                                        strM = defpackage.e.m(resource.getString(R.string.french_accelerated), " 2");
                                        break;
                                    case 55:
                                        strM = defpackage.e.m(resource.getString(R.string.arabic), " 2");
                                        break;
                                    default:
                                        strM = BuildConfig.VERSION_NAME;
                                        break;
                                }
                                break;
                        }
                        break;
                }
            } else {
                strM = resource.getString(R.string.malay);
                kotlin.jvm.internal.m.e(strM, "getString(...)");
            }
            ua.b(oz.q.S0(strM, " 2"), j0.c.B(d0.n.h(j0.r.f35391a.a(j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 22, 12, 3), z1.c.K), g2.x.c(((h1.s1) sVar.j(c3Var)).f31034q, 0.45f), r0.f.a()), 6, 2), ((h1.s1) sVar.j(c3Var)).f31019b, fr.j3.A(10), null, n3.s.K, null, 0L, null, 0L, 0, false, 0, 0, null, sVar, 199680, 0, 131024);
            sVar.p(true);
        } else {
            sVar.W();
        }
        return qy.b0.f48488a;
    }
}
