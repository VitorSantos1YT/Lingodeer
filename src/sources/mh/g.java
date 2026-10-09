package mh;

import com.tbruyelle.rxpermissions3.BuildConfig;
import g00.d1;
import g00.e0;
import g00.f1;
import g00.r0;
import g00.t1;
import java.util.List;
import kotlin.jvm.internal.m;
import kotlinx.serialization.UnknownFieldException;
import ry.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f41133a;
    private static final e00.g descriptor;

    static {
        g gVar = new g();
        f41133a = gVar;
        f1 f1Var = new f1("com.lingo.fluent.ui.compose.model.PdLessonModel", gVar, 9);
        f1Var.k("id", true);
        f1Var.k("title", true);
        f1Var.k("translation", true);
        f1Var.k("imageUrl", true);
        f1Var.k("difficulty", true);
        f1Var.k("category", true);
        f1Var.k("status", true);
        f1Var.k("hasPurchased", true);
        f1Var.k("isBookmarked", true);
        descriptor = f1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // g00.e0
    public final c00.a[] childSerializers() {
        qy.h[] hVarArr = i.f41134j;
        t1 t1Var = t1.f28468a;
        g00.g gVar = g00.g.f28401a;
        return new c00.a[]{r0.f28455a, t1Var, t1Var, t1Var, hVarArr[4].getValue(), hVarArr[5].getValue(), hVarArr[6].getValue(), gVar, gVar};
    }

    @Override // c00.a
    public final Object deserialize(f00.c cVar) {
        e00.g gVar = descriptor;
        f00.a aVarD = cVar.d(gVar);
        qy.h[] hVarArr = i.f41134j;
        List list = null;
        long jD = 0;
        f fVar = null;
        String strK = null;
        String strK2 = null;
        String strK3 = null;
        b bVar = null;
        int i11 = 0;
        boolean zW = false;
        boolean zW2 = false;
        boolean z11 = true;
        while (z11) {
            int iN = aVarD.n(gVar);
            switch (iN) {
                case -1:
                    z11 = false;
                    break;
                case 0:
                    jD = aVarD.D(gVar, 0);
                    i11 |= 1;
                    break;
                case 1:
                    strK = aVarD.k(gVar, 1);
                    i11 |= 2;
                    break;
                case 2:
                    strK2 = aVarD.k(gVar, 2);
                    i11 |= 4;
                    break;
                case 3:
                    strK3 = aVarD.k(gVar, 3);
                    i11 |= 8;
                    break;
                case 4:
                    bVar = (b) aVarD.t(gVar, 4, (c00.a) hVarArr[4].getValue(), bVar);
                    i11 |= 16;
                    break;
                case 5:
                    list = (List) aVarD.t(gVar, 5, (c00.a) hVarArr[5].getValue(), list);
                    i11 |= 32;
                    break;
                case 6:
                    fVar = (f) aVarD.t(gVar, 6, (c00.a) hVarArr[6].getValue(), fVar);
                    i11 |= 64;
                    break;
                case 7:
                    zW = aVarD.w(gVar, 7);
                    i11 |= 128;
                    break;
                case 8:
                    zW2 = aVarD.w(gVar, 8);
                    i11 |= 256;
                    break;
                default:
                    throw new UnknownFieldException(iN);
            }
        }
        aVarD.c(gVar);
        return new i(i11, jD, strK, strK2, strK3, bVar, list, fVar, zW, zW2);
    }

    @Override // c00.a
    public final e00.g getDescriptor() {
        return descriptor;
    }

    @Override // c00.a
    public final void serialize(f00.d dVar, Object obj) {
        i value = (i) obj;
        m.f(value, "value");
        boolean z11 = value.f41143i;
        boolean z12 = value.f41142h;
        f fVar = value.f41141g;
        List list = value.f41140f;
        b bVar = value.f41139e;
        String str = value.f41138d;
        String str2 = value.f41137c;
        String str3 = value.f41136b;
        long j11 = value.f41135a;
        e00.g gVar = descriptor;
        f00.b bVarD = dVar.d(gVar);
        qy.h[] hVarArr = i.f41134j;
        if (bVarD.G(gVar) || j11 != 0) {
            bVarD.v(gVar, 0, j11);
        }
        if (bVarD.G(gVar) || !m.a(str3, BuildConfig.VERSION_NAME)) {
            bVarD.w(gVar, 1, str3);
        }
        if (bVarD.G(gVar) || !m.a(str2, BuildConfig.VERSION_NAME)) {
            bVarD.w(gVar, 2, str2);
        }
        if (bVarD.G(gVar) || !m.a(str, BuildConfig.VERSION_NAME)) {
            bVarD.w(gVar, 3, str);
        }
        if (bVarD.G(gVar) || bVar != b.BEGINNER_I) {
            bVarD.A(gVar, 4, (c00.a) hVarArr[4].getValue(), bVar);
        }
        if (bVarD.G(gVar) || !m.a(list, r.f50854a)) {
            bVarD.A(gVar, 5, (c00.a) hVarArr[5].getValue(), list);
        }
        if (bVarD.G(gVar) || fVar != f.NOT_STUDY) {
            bVarD.A(gVar, 6, (c00.a) hVarArr[6].getValue(), fVar);
        }
        if (bVarD.G(gVar) || z12) {
            bVarD.B(gVar, 7, z12);
        }
        if (bVarD.G(gVar) || z11) {
            bVarD.B(gVar, 8, z11);
        }
        bVarD.c(gVar);
    }

    @Override // g00.e0
    public final c00.a[] typeParametersSerializers() {
        return d1.f28375b;
    }
}
