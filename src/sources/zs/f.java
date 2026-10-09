package zs;

import a9.i;
import android.graphics.Bitmap;
import android.util.Log;
import androidx.lifecycle.ViewModel;
import dv.u0;
import gv.h;
import kotlin.NoWhenBranchMatchedException;
import qy.b0;
import rz.e0;
import rz.o0;
import se.k;
import uz.i1;
import uz.r0;
import uz.x0;
import vt.n0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class f extends ViewModel implements s10.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gv.e f59365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n0 f59366b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u0 f59367c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i1 f59368d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final r0 f59369e;

    public f(gv.e eVar, n0 n0Var, u0 u0Var) {
        this.f59365a = eVar;
        this.f59366b = n0Var;
        this.f59367c = u0Var;
        i1 i1VarC = x0.c(new c(null, 1023));
        this.f59368d = i1VarC;
        this.f59369e = new r0(i1VarC);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:39:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:40:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:44:0x0110  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x012f, code lost:
    
        if (rz.e0.M(r1, r4, r15) == r6) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(zs.f r18, android.content.Context r19, zs.a r20, java.lang.String r21, boolean r22, java.lang.String r23, java.lang.String r24, xy.c r25) throws javax.crypto.BadPaddingException, javax.crypto.NoSuchPaddingException, javax.crypto.IllegalBlockSizeException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException {
        /*
            Method dump skipped, instruction units count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zs.f.a(zs.f, android.content.Context, zs.a, java.lang.String, boolean, java.lang.String, java.lang.String, xy.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, String str2, xy.c cVar) throws Exception {
        e eVar;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i11 = eVar.f59364c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                eVar.f59364c = i11 - Integer.MIN_VALUE;
            } else {
                eVar = new e(this, cVar);
            }
        } else {
            eVar = new e(this, cVar);
        }
        Object objM = eVar.f59362a;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = eVar.f59364c;
        if (i12 == 0) {
            com.bumptech.glide.e.F(objM);
            eVar.f59364c = 1;
            h hVar = (h) this.f59365a;
            hVar.getClass();
            yz.f fVar = o0.f50940a;
            objM = e0.M(yz.e.f58387a, new b0.f(hVar, "report/", str2, str, (vy.d) null, 26), eVar);
            if (objM == aVar) {
                return aVar;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(objM);
        }
        gv.d dVar = (gv.d) objM;
        if (dVar instanceof gv.c) {
            xy.f.a(Log.d("BugReportViewModel", "OSS上传成功: ".concat(((gv.c) dVar).f29867a)));
            return b0.f48488a;
        }
        if (dVar instanceof gv.b) {
            throw new Exception(((gv.b) dVar).f29865a);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // s10.a
    public final i e() {
        return k.o();
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        Bitmap bitmap = ((c) this.f59368d.getValue()).f59346b;
        if (bitmap != null) {
            bitmap.recycle();
        }
    }
}
