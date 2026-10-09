package iv;

import com.google.api.Service;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import j0.n2;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34692a;

    public /* synthetic */ c(int i11) {
        this.f34692a = i11;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        j3.l lVar;
        Object objA;
        switch (this.f34692a) {
            case 0:
                l1.n nVar = (l1.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    z0.m(ub.a.e0(sVar, R.string.jp_syllable_overview_intro_s06_title), sVar, 0);
                    b1.k(R.string.jp_syllable_overview_intro_s06_p01, false, sVar, 0, 2);
                    b1.k(R.string.jp_syllable_overview_intro_s06_p02, false, sVar, 0, 2);
                    z0.h(kv.o0.f38800l, sVar, 0);
                } else {
                    sVar.W();
                }
                return qy.b0.f48488a;
            case 1:
                ((Integer) obj2).getClass();
                o.d((l1.n) obj, l1.t.M(1));
                return qy.b0.f48488a;
            case 2:
                ((Integer) obj2).getClass();
                z0.w((l1.n) obj, l1.t.M(1));
                return qy.b0.f48488a;
            case 3:
                ((Integer) obj2).getClass();
                z0.f((l1.n) obj, l1.t.M(1));
                return qy.b0.f48488a;
            case 4:
                ((Integer) obj2).getClass();
                b1.a((l1.n) obj, l1.t.M(1));
                return qy.b0.f48488a;
            case 5:
                ((Integer) obj2).getClass();
                b1.l((l1.n) obj, l1.t.M(1));
                return qy.b0.f48488a;
            case 6:
                v3.m mVar = (v3.m) obj2;
                float fIntValue = (((Integer) obj).intValue() + 0) / 2.0f;
                v3.m mVar2 = v3.m.Ltr;
                float f5 = CropImageView.DEFAULT_ASPECT_RATIO;
                if (mVar != mVar2) {
                    f5 = CropImageView.DEFAULT_ASPECT_RATIO * (-1);
                }
                return Integer.valueOf(Math.round((1 + f5) * fIntValue));
            case 7:
                return Integer.valueOf(Math.round((1 + CropImageView.DEFAULT_ASPECT_RATIO) * ((((Integer) obj).intValue() + 0) / 2.0f)));
            case 8:
                return Integer.valueOf(Math.round((1 + (((v3.m) obj2) != v3.m.Ltr ? (-1.0f) * (-1) : -1.0f)) * (((Integer) obj).intValue() / 2.0f)));
            case 9:
                return Integer.valueOf(((n2) obj).d((v3.c) obj2));
            case 10:
                j3.h hVar = (j3.h) obj2;
                return ns.o.b(hVar.f35700b, j3.o0.a(hVar.f35699a, j3.o0.f35729b, (w1.k) obj));
            case 11:
                return Integer.valueOf(((u3.l) obj2).f52754a);
            case 12:
                u3.p pVar = (u3.p) obj2;
                return ns.o.b(Float.valueOf(pVar.f52758a), Float.valueOf(pVar.f52759b));
            case 13:
                w1.k kVar = (w1.k) obj;
                u3.q qVar = (u3.q) obj2;
                v3.o oVar = new v3.o(qVar.f52761a);
                j3.m0 m0Var = j3.o0.f35750x;
                return ns.o.b(j3.o0.a(oVar, m0Var, kVar), j3.o0.a(new v3.o(qVar.f52762b), m0Var, kVar));
            case 14:
                return Integer.valueOf(((n3.s) obj2).f43179a);
            case 15:
                j3.v vVar = (j3.v) obj2;
                return ns.o.b(vVar.f35803a, j3.o0.a(vVar.f35804b, j3.o0.f35737j, (w1.k) obj));
            case 16:
                return Float.valueOf(((u3.a) obj2).f52733a);
            case 17:
                w1.k kVar2 = (w1.k) obj;
                List list = (List) obj2;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i11 = 0; i11 < size; i11++) {
                    arrayList.add(j3.o0.a((j3.f) list.get(i11), j3.o0.f35730c, kVar2));
                }
                return arrayList;
            case 18:
                j3.x0 x0Var = (j3.x0) obj2;
                return ns.o.b(Integer.valueOf((int) (x0Var.f35823a >> 32)), Integer.valueOf((int) (x0Var.f35823a & 4294967295L)));
            case 19:
                w1.k kVar3 = (w1.k) obj;
                g2.v0 v0Var = (g2.v0) obj2;
                return ns.o.b(j3.o0.a(new g2.x(v0Var.f28611a), j3.o0.f35744r, kVar3), j3.o0.a(new f2.b(v0Var.f28612b), j3.o0.f35752z, kVar3), Float.valueOf(v0Var.f28613c));
            case 20:
                return Integer.valueOf(((u3.k) obj2).f52750a);
            case 21:
                return Integer.valueOf(((u3.m) obj2).f52755a);
            case 22:
                return Integer.valueOf(((u3.d) obj2).f52737a);
            case 23:
                return Integer.valueOf(((n3.o) obj2).f43170a);
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                return Integer.valueOf(((n3.p) obj2).f43171a);
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                v3.o oVar2 = (v3.o) obj2;
                return oVar2 == null ? false : v3.o.a(oVar2.f53502a, v3.o.f53501c) ? Boolean.FALSE : ns.o.b(Float.valueOf(v3.o.c(oVar2.f53502a)), j3.o0.a(new v3.p(v3.o.b(oVar2.f53502a)), j3.o0.f35751y, (w1.k) obj));
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                j3.u uVar = (j3.u) obj2;
                return ns.o.b(uVar.f35794a, j3.o0.a(uVar.f35795b, j3.o0.f35737j, (w1.k) obj));
            case 27:
                long j11 = ((v3.p) obj2).f53503a;
                if (v3.p.a(j11, 8589934592L)) {
                    return 0;
                }
                if (v3.p.a(j11, 4294967296L)) {
                    return 1;
                }
                return Boolean.FALSE;
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                f2.b bVar = (f2.b) obj2;
                return bVar == null ? false : f2.b.c(bVar.f26570a, 9205357640488583168L) ? Boolean.FALSE : ns.o.b(Float.valueOf(Float.intBitsToFloat((int) (bVar.f26570a >> 32))), Float.valueOf(Float.intBitsToFloat((int) (bVar.f26570a & 4294967295L))));
            default:
                w1.k kVar4 = (w1.k) obj;
                j3.f fVar = (j3.f) obj2;
                Object obj3 = fVar.f35689a;
                if (obj3 instanceof j3.c0) {
                    lVar = j3.l.Paragraph;
                } else if (obj3 instanceof j3.p0) {
                    lVar = j3.l.Span;
                } else if (obj3 instanceof j3.b1) {
                    lVar = j3.l.VerbatimTts;
                } else if (obj3 instanceof j3.a1) {
                    lVar = j3.l.Url;
                } else if (obj3 instanceof j3.v) {
                    lVar = j3.l.Link;
                } else if (obj3 instanceof j3.u) {
                    lVar = j3.l.Clickable;
                } else {
                    if (!(obj3 instanceof j3.r0)) {
                        throw new UnsupportedOperationException();
                    }
                    lVar = j3.l.String;
                }
                switch (j3.n0.f35726a[lVar.ordinal()]) {
                    case 1:
                        kotlin.jvm.internal.m.d(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.ParagraphStyle");
                        objA = j3.o0.a((j3.c0) obj3, j3.o0.f35735h, kVar4);
                        break;
                    case 2:
                        kotlin.jvm.internal.m.d(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.SpanStyle");
                        objA = j3.o0.a((j3.p0) obj3, j3.o0.f35736i, kVar4);
                        break;
                    case 3:
                        kotlin.jvm.internal.m.d(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.VerbatimTtsAnnotation");
                        objA = j3.o0.a((j3.b1) obj3, j3.o0.f35731d, kVar4);
                        break;
                    case 4:
                        kotlin.jvm.internal.m.d(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.UrlAnnotation");
                        objA = j3.o0.a((j3.a1) obj3, j3.o0.f35732e, kVar4);
                        break;
                    case 5:
                        kotlin.jvm.internal.m.d(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url");
                        objA = j3.o0.a((j3.v) obj3, j3.o0.f35733f, kVar4);
                        break;
                    case 6:
                        kotlin.jvm.internal.m.d(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Clickable");
                        objA = j3.o0.a((j3.u) obj3, j3.o0.f35734g, kVar4);
                        break;
                    case 7:
                        kotlin.jvm.internal.m.d(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.StringAnnotation");
                        objA = ((j3.r0) obj3).f35774a;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                return ns.o.b(lVar, objA, Integer.valueOf(fVar.f35690b), Integer.valueOf(fVar.f35691c), fVar.f35692d);
        }
    }

    public /* synthetic */ c(int i11, int i12) {
        this.f34692a = i12;
    }
}
