package rt;

import com.google.api.Service;
import com.lingodeer.data.model.Bookmark;
import com.lingodeer.data.model.uistate.WordSentenceCharacterType;
import java.io.File;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class v7 implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f50532a;

    public /* synthetic */ v7(int i11) {
        this.f50532a = i11;
    }

    /* JADX WARN: Code duplicated, block: B:63:0x0262  */
    @Override // fz.c
    public final Object invoke(Object obj) {
        int iOffsetByCodePoints;
        j3.v0 v0VarB;
        j3.p0 p0Var;
        int i11 = this.f50532a;
        char c11 = 1;
        qy.b0 b0Var = qy.b0.f48488a;
        int i12 = 0;
        switch (i11) {
            case 0:
                k6 it = (k6) obj;
                kotlin.jvm.internal.m.f(it, "it");
                WordSentenceCharacterType wordSentenceCharacterType = it.f49973d;
                if (wordSentenceCharacterType instanceof WordSentenceCharacterType.WordType) {
                    return (WordSentenceCharacterType.WordType) wordSentenceCharacterType;
                }
                return null;
            case 1:
                WordSentenceCharacterType.WordType it2 = (WordSentenceCharacterType.WordType) obj;
                kotlin.jvm.internal.m.f(it2, "it");
                return it2.getWord().getTranslation();
            case 2:
                String it3 = (String) obj;
                kotlin.jvm.internal.m.f(it3, "it");
                return it3;
            case 3:
                y8 it4 = (y8) obj;
                kotlin.jvm.internal.m.f(it4, "it");
                return ry.m.g0(it4.f50700j);
            case 4:
                k6 it5 = (k6) obj;
                kotlin.jvm.internal.m.f(it5, "it");
                return w8.c(it5.f49973d);
            case 5:
                return ((y8) obj).f50700j;
            case 6:
                return Boolean.valueOf(((k6) obj).f49970a);
            case 7:
                return ((k6) obj).f49972c;
            case 8:
                return Long.valueOf(((Number) ((Map.Entry) obj).getKey()).longValue());
            case 9:
                return Boolean.valueOf(((Bookmark) obj).isFav() == 1);
            case 10:
                Bookmark bookmark = (Bookmark) obj;
                Long lB = w8.b(bookmark.getId());
                if (lB != null) {
                    return new qy.l(Long.valueOf(lB.longValue()), bookmark.getFolderId());
                }
                return null;
            case 11:
                String path = (String) obj;
                kotlin.jvm.internal.m.f(path, "path");
                return Boolean.valueOf(new File(path).exists());
            case 12:
                String message = (String) obj;
                kotlin.jvm.internal.m.f(message, "message");
                return b0Var;
            case 13:
                String message2 = (String) obj;
                kotlin.jvm.internal.m.f(message2, "message");
                return b0Var;
            case 14:
                vy.g gVar = (vy.g) obj;
                if (gVar instanceof rz.y) {
                    return (rz.y) gVar;
                }
                return null;
            case 15:
                int i13 = s0.l.f51086a;
                return b0Var;
            case 16:
                return b0Var;
            case 17:
                d1.p0 p0Var2 = (d1.p0) obj;
                String str = p0Var2.f22963g.f35700b;
                long j11 = p0Var2.f22962f;
                int i14 = j3.x0.f35822c;
                int i15 = (int) (j11 & 4294967295L);
                if (i15 > 0) {
                    v5.j jVarV = s0.o0.v();
                    if (jVarV != null) {
                        int iB = jVarV.b(str, i15 - 1);
                        if (iB >= 0) {
                            iOffsetByCodePoints = iB;
                        } else if (i15 <= 0) {
                            iOffsetByCodePoints = -1;
                        } else {
                            iOffsetByCodePoints = Character.offsetByCodePoints(str, i15, -1);
                        }
                    } else if (i15 <= 0) {
                        iOffsetByCodePoints = -1;
                    } else {
                        iOffsetByCodePoints = Character.offsetByCodePoints(str, i15, -1);
                    }
                } else {
                    iOffsetByCodePoints = -1;
                }
                if (iOffsetByCodePoints == -1) {
                    return null;
                }
                return new o3.e(((int) (p0Var2.f22962f & 4294967295L)) - iOffsetByCodePoints, 0);
            case 18:
                d1.p0 p0Var3 = (d1.p0) obj;
                String str2 = p0Var3.f22963g.f35700b;
                long j12 = p0Var3.f22962f;
                int i16 = j3.x0.f35822c;
                int iR = s0.o0.r((int) (j12 & 4294967295L), str2);
                if (iR != -1) {
                    return new o3.e(0, iR - ((int) (p0Var3.f22962f & 4294967295L)));
                }
                return null;
            case 19:
                d1.p0 p0Var4 = (d1.p0) obj;
                Integer numE = p0Var4.e();
                if (numE == null) {
                    return null;
                }
                int iIntValue = numE.intValue();
                long j13 = p0Var4.f22962f;
                int i17 = j3.x0.f35822c;
                return new o3.e(((int) (j13 & 4294967295L)) - iIntValue, 0);
            case 20:
                d1.p0 p0Var5 = (d1.p0) obj;
                Integer numD = p0Var5.d();
                if (numD == null) {
                    return null;
                }
                int iIntValue2 = numD.intValue();
                long j14 = p0Var5.f22962f;
                int i18 = j3.x0.f35822c;
                return new o3.e(0, iIntValue2 - ((int) (j14 & 4294967295L)));
            case 21:
                d1.p0 p0Var6 = (d1.p0) obj;
                Integer numC = p0Var6.c();
                if (numC == null) {
                    return null;
                }
                int iIntValue3 = numC.intValue();
                long j15 = p0Var6.f22962f;
                int i19 = j3.x0.f35822c;
                return new o3.e(((int) (j15 & 4294967295L)) - iIntValue3, 0);
            case 22:
                d1.p0 p0Var7 = (d1.p0) obj;
                Integer numB = p0Var7.b();
                if (numB == null) {
                    return null;
                }
                int iIntValue4 = numB.intValue();
                long j16 = p0Var7.f22962f;
                int i21 = j3.x0.f35822c;
                return new o3.e(0, iIntValue4 - ((int) (j16 & 4294967295L)));
            case 23:
                List list = (List) obj;
                Object obj2 = list.get(1);
                kotlin.jvm.internal.m.d(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                f0.h1 h1Var = ((Boolean) obj2).booleanValue() ? f0.h1.Vertical : f0.h1.Horizontal;
                Object obj3 = list.get(0);
                kotlin.jvm.internal.m.d(obj3, "null cannot be cast to non-null type kotlin.Float");
                return new s0.m1(h1Var, ((Float) obj3).floatValue());
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                j3.f fVar = (j3.f) obj;
                Object obj4 = fVar.f35689a;
                if (!(obj4 instanceof j3.w) || (v0VarB = ((j3.w) obj4).b()) == null || (v0VarB.f35805a == null && v0VarB.f35806b == null && v0VarB.f35807c == null && v0VarB.f35808d == null)) {
                    return ns.o.b(fVar);
                }
                Object obj5 = fVar.f35689a;
                kotlin.jvm.internal.m.d(obj5, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation");
                j3.v0 v0VarB2 = ((j3.w) obj5).b();
                if (v0VarB2 == null || (p0Var = v0VarB2.f35805a) == null) {
                    p0Var = new j3.p0(0L, 0L, (n3.s) null, (n3.o) null, (n3.p) null, (n3.i) null, (String) null, 0L, (u3.a) null, (u3.p) null, (q3.b) null, 0L, (u3.l) null, (g2.v0) null, 65535);
                }
                return ns.o.b(fVar, new j3.f(p0Var, fVar.f35690b, fVar.f35691c));
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                ((g3.b0) obj).b(g3.x.A, b0Var);
                return b0Var;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                kotlin.jvm.internal.m.f((lc.d) obj, "it");
                return b0Var;
            case 27:
                return (String) obj;
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                kotlin.jvm.internal.m.f((lc.d) obj, "it");
                return b0Var;
            default:
                x10.a module = (x10.a) obj;
                kotlin.jvm.internal.m.f(module, "$this$module");
                st.a aVar = new st.a(i12);
                os.b bVar = new os.b(14);
                u10.b bVar2 = u10.b.Singleton;
                kotlin.jvm.internal.e eVarA = kotlin.jvm.internal.z.a(vt.d.class);
                b20.b bVar3 = c20.b.f6511e;
                md.a.s(new u10.c(module, defpackage.e.x(new u10.a(bVar3, eVarA, bVar, bVar2), module)), aVar);
                os.b bVar4 = new os.b(12);
                u10.b bVar5 = u10.b.Factory;
                md.a.s(new u10.c(module, defpackage.e.w(new u10.a(bVar3, kotlin.jvm.internal.z.a(wt.m.class), bVar4, bVar5), module)), null);
                md.a.s(new u10.c(module, defpackage.e.w(new u10.a(bVar3, kotlin.jvm.internal.z.a(wt.q.class), new os.b(13), bVar5), module)), null);
                md.a.s(new u10.c(module, defpackage.e.x(new u10.a(bVar3, kotlin.jvm.internal.z.a(wt.o0.class), new os.b(17), bVar2), module)), null);
                md.a.s(new u10.c(module, defpackage.e.x(new u10.a(bVar3, kotlin.jvm.internal.z.a(vt.z0.class), new os.b(15), bVar2), module)), new st.a(c11 == true ? 1 : 0));
                md.a.s(new u10.c(module, defpackage.e.x(new u10.a(bVar3, kotlin.jvm.internal.z.a(vt.s0.class), new os.b(16), bVar2), module)), new st.a(2));
                md.a.s(new u10.c(module, defpackage.e.x(new u10.a(bVar3, kotlin.jvm.internal.z.a(wt.b0.class), new os.b(18), bVar2), module)), null);
                return b0Var;
        }
    }
}
