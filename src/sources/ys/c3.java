package ys;

import com.lingodeer.data.model.characterstroke.CharacterStroke;
import com.lingodeer.network.model.OCRCharacter;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c3 implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f57956a;

    public /* synthetic */ c3(int i11) {
        this.f57956a = i11;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        switch (this.f57956a) {
            case 0:
                i2.d LinearProgressIndicator = (i2.d) obj;
                kotlin.jvm.internal.m.f(LinearProgressIndicator, "$this$LinearProgressIndicator");
                return qy.b0.f48488a;
            case 1:
                oz.l it = (oz.l) obj;
                kotlin.jvm.internal.m.f(it, "it");
                return ep.a.D(j3.f58094g, "\n", it.c());
            case 2:
                oz.l it2 = (oz.l) obj;
                kotlin.jvm.internal.m.f(it2, "it");
                return nv.p.r(it2.c(), "\n<head>\n", j3.f58094g, "\n</head>");
            case 3:
                oz.l it3 = (oz.l) obj;
                kotlin.jvm.internal.m.f(it3, "it");
                return ep.a.D(j3.f58095h, "\n", it3.c());
            case 4:
                oz.l it4 = (oz.l) obj;
                kotlin.jvm.internal.m.f(it4, "it");
                return ep.a.D(j3.f58095h, "\n", it4.c());
            case 5:
                x10.a module = (x10.a) obj;
                kotlin.jvm.internal.m.f(module, "$this$module");
                os.b bVar = new os.b(28);
                u10.b bVar2 = u10.b.Factory;
                kotlin.jvm.internal.e eVarA = kotlin.jvm.internal.z.a(zu.i2.class);
                b20.b bVar3 = c20.b.f6511e;
                md.a.s(new u10.c(module, defpackage.e.w(new u10.a(bVar3, eVarA, bVar, bVar2), module)), null);
                md.a.s(new u10.c(module, defpackage.e.w(new u10.a(bVar3, kotlin.jvm.internal.z.a(zu.k0.class), new os.b(29), bVar2), module)), null);
                md.a.s(new u10.c(module, defpackage.e.w(new u10.a(bVar3, kotlin.jvm.internal.z.a(zu.q.class), new yu.a(0), bVar2), module)), null);
                md.a.s(new u10.c(module, defpackage.e.w(new u10.a(bVar3, kotlin.jvm.internal.z.a(zu.y.class), new yu.a(1), bVar2), module)), null);
                md.a.s(new u10.c(module, defpackage.e.w(new u10.a(bVar3, kotlin.jvm.internal.z.a(zu.i2.class), new yu.a(2), bVar2), module)), null);
                md.a.s(new u10.c(module, defpackage.e.w(new u10.a(bVar3, kotlin.jvm.internal.z.a(zu.s2.class), new yu.a(3), bVar2), module)), null);
                md.a.s(new u10.c(module, defpackage.e.w(new u10.a(bVar3, kotlin.jvm.internal.z.a(zu.i1.class), new yu.a(4), bVar2), module)), null);
                return qy.b0.f48488a;
            case 6:
                za.m it5 = (za.m) obj;
                kotlin.jvm.internal.m.f(it5, "it");
                return it5;
            case 7:
                kotlin.jvm.internal.m.f((lc.d) obj, "it");
                return qy.b0.f48488a;
            case 8:
                CharacterStroke it6 = (CharacterStroke) obj;
                kotlin.jvm.internal.m.f(it6, "it");
                return Boolean.valueOf(!oz.q.K0(it6.getCharacter()));
            case 9:
                CharacterStroke it7 = (CharacterStroke) obj;
                kotlin.jvm.internal.m.f(it7, "it");
                return Boolean.valueOf(!oz.q.K0(it7.getCharacter()));
            case 10:
                return ((OCRCharacter) obj).getChar();
            case 11:
                return Boolean.valueOf(!oz.q.K0((String) obj));
            default:
                h00.h Json = (h00.h) obj;
                kotlin.jvm.internal.m.f(Json, "$this$Json");
                Json.f29927a = true;
                Json.f29929c = true;
                Json.f29928b = true;
                return qy.b0.f48488a;
        }
    }
}
