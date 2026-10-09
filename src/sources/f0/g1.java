package f0;

import android.content.res.AssetManager;
import android.os.Build;
import com.google.api.Service;
import com.yalantis.ucrop.view.CropImageView;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f26278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f26279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f26280c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Serializable f26281d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f26282e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f26283f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f26284g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f26285h;

    public g1(i2 i2Var, hd.b bVar, x1 x1Var, v3.c cVar) {
        this.f26279b = i2Var;
        this.f26280c = bVar;
        this.f26281d = x1Var;
        this.f26282e = cVar;
        this.f26283f = qx.p.b(Integer.MAX_VALUE, 6, null);
        this.f26285h = new ob.u(7);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    public static final Object a(g1 g1Var, i2 i2Var, b1 b1Var, float f5, float f11, xy.c cVar) {
        c1 c1Var;
        kotlin.jvm.internal.v vVar;
        float f12;
        i2 i2Var2;
        g1Var.getClass();
        if (cVar instanceof c1) {
            c1Var = (c1) cVar;
            int i11 = c1Var.f26223f;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c1Var.f26223f = i11 - Integer.MIN_VALUE;
            } else {
                c1Var = new c1(g1Var, cVar);
            }
        } else {
            c1Var = new c1(g1Var, cVar);
        }
        c1 c1Var2 = c1Var;
        Object obj = c1Var2.f26221d;
        Object obj2 = wy.a.COROUTINE_SUSPENDED;
        int i12 = c1Var2.f26223f;
        Object obj3 = qy.b0.f48488a;
        if (i12 == 0) {
            com.bumptech.glide.e.F(obj);
            kotlin.jvm.internal.y yVar = new kotlin.jvm.internal.y();
            yVar.f38361a = b1Var;
            g1Var.g(b1Var);
            b1 b1VarF = f((tz.h) g1Var.f26283f);
            if (b1VarF != null) {
                g1Var.g(b1VarF);
                yVar.f38361a = ((b1) yVar.f38361a).a(b1VarF);
            }
            kotlin.jvm.internal.v vVar2 = new kotlin.jvm.internal.v();
            float fG = i2Var.g(i2Var.e(((b1) yVar.f38361a).f26194a));
            vVar2.f38358a = fG;
            if (!a1.a(fG)) {
                kotlin.jvm.internal.y yVar2 = new kotlin.jvm.internal.y();
                yVar2.f38361a = b0.e.b(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 30);
                d1 d1Var = new d1(vVar2, yVar2, yVar, f5, g1Var, f11, i2Var, null);
                c1Var2.f26218a = i2Var;
                c1Var2.f26219b = vVar2;
                c1Var2.f26220c = f11;
                c1Var2.f26223f = 1;
                if (g1Var.h(i2Var, d1Var, c1Var2) != obj2) {
                    vVar = vVar2;
                    f12 = f11;
                    i2Var2 = i2Var;
                }
            }
        }
        if (i12 != 1) {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(obj);
            return obj3;
        }
        f12 = c1Var2.f26220c;
        vVar = c1Var2.f26219b;
        i2Var2 = c1Var2.f26218a;
        com.bumptech.glide.e.F(obj);
        ob.u uVar = (ob.u) g1Var.f26285h;
        long jB = gb.r.b(((t2.d) uVar.f44891b).b(Float.MAX_VALUE), ((t2.d) uVar.f44892c).b(Float.MAX_VALUE));
        if (jB == 0) {
            float fD = i2Var2.d(Math.signum(vVar.f38358a)) * Math.min(Math.abs(vVar.f38358a) / 100, f12) * 1000;
            if (fD == CropImageView.DEFAULT_ASPECT_RATIO) {
                jB = 0;
            } else {
                jB = i2Var2.f26308d == h1.Horizontal ? gb.r.b(fD, CropImageView.DEFAULT_ASPECT_RATIO) : gb.r.b(CropImageView.DEFAULT_ASPECT_RATIO, fD);
            }
        }
        x1 x1Var = (x1) g1Var.f26281d;
        c1Var2.f26218a = null;
        c1Var2.f26219b = null;
        c1Var2.f26223f = 2;
        b2 b2Var = (b2) x1Var.f38342a;
        rz.e0.B(b2Var.f26199d0.c(), null, null, new y1(b2Var, jB, null, 2), 3);
        return obj3 == obj2 ? obj2 : obj3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public static final Object b(g1 g1Var, kotlin.jvm.internal.y yVar, kotlin.jvm.internal.v vVar, i2 i2Var, kotlin.jvm.internal.y yVar2, long j11, xy.c cVar) {
        e1 e1Var;
        i2 i2Var2;
        kotlin.jvm.internal.y yVar3;
        kotlin.jvm.internal.y yVar4;
        kotlin.jvm.internal.v vVar2;
        boolean z11;
        if (cVar instanceof e1) {
            e1Var = (e1) cVar;
            int i11 = e1Var.f26253t;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                e1Var.f26253t = i11 - Integer.MIN_VALUE;
            } else {
                e1Var = new e1(cVar);
            }
        } else {
            e1Var = new e1(cVar);
        }
        Object objO = e1Var.f26252f;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = e1Var.f26253t;
        if (i12 == 0) {
            com.bumptech.glide.e.F(objO);
            if (j11 < 0) {
                return Boolean.FALSE;
            }
            b0.a1 a1Var = new b0.a1(g1Var, null, 26);
            e1Var.f26247a = g1Var;
            e1Var.f26248b = yVar;
            e1Var.f26249c = vVar;
            i2Var2 = i2Var;
            e1Var.f26250d = i2Var2;
            yVar3 = yVar2;
            e1Var.f26251e = yVar3;
            e1Var.f26253t = 1;
            objO = rz.e0.O(j11, a1Var, e1Var);
            if (objO == aVar) {
                return aVar;
            }
            yVar4 = yVar;
            vVar2 = vVar;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.jvm.internal.y yVar5 = e1Var.f26251e;
            i2 i2Var3 = e1Var.f26250d;
            vVar2 = e1Var.f26249c;
            yVar4 = e1Var.f26248b;
            g1 g1Var2 = e1Var.f26247a;
            com.bumptech.glide.e.F(objO);
            yVar3 = yVar5;
            i2Var2 = i2Var3;
            g1Var = g1Var2;
        }
        b1 b1Var = (b1) objO;
        if (b1Var != null) {
            boolean z12 = ((b1) yVar4.f38361a).f26196c;
            long j12 = b1Var.f26194a;
            yVar4.f38361a = new b1(j12, b1Var.f26195b, z12);
            vVar2.f38358a = i2Var2.g(i2Var2.e(j12));
            yVar3.f38361a = b0.e.b(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 30);
            g1Var.g(b1Var);
            z11 = !a1.a(vVar2.f38358a);
        } else {
            z11 = false;
        }
        return Boolean.valueOf(z11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static b1 f(tz.h hVar) {
        b1 b1Var = null;
        nz.m mVarB = v10.c.B(new v0((Object) new cr.n(hVar, 16), (vy.d) (0 == true ? 1 : 0), 1));
        while (mVarB.hasNext()) {
            b1 b1VarA = (b1) mVarB.next();
            if (b1Var != null) {
                b1VarA = b1Var.a(b1VarA);
            }
            b1Var = b1VarA;
        }
        return b1Var;
    }

    public float c(g2 g2Var, float f5) {
        i2 i2Var = (i2) this.f26279b;
        long jH = i2Var.h(i2Var.d(f5));
        i2 i2Var2 = g2Var.f26286a;
        return i2Var.g(i2Var.e(i2Var2.c(i2Var2.f26315k, jH, 1)));
    }

    public FileInputStream d(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e8) {
            String message = e8.getMessage();
            if (message == null) {
                return null;
            }
            message.contains("compressed");
            return null;
        }
    }

    public void e(int i11, Serializable serializable) {
        ((Executor) this.f26279b).execute(new b7.j(this, i11, 3, serializable));
    }

    public void g(b1 b1Var) {
        ob.u uVar = (ob.u) this.f26285h;
        long j11 = b1Var.f26195b;
        long j12 = b1Var.f26194a;
        ((t2.d) uVar.f44891b).a(j11, Float.intBitsToFloat((int) (j12 >> 32)));
        ((t2.d) uVar.f44892c).a(j11, Float.intBitsToFloat((int) (j12 & 4294967295L)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object h(i2 i2Var, d1 d1Var, xy.c cVar) {
        f1 f1Var;
        if (cVar instanceof f1) {
            f1Var = (f1) cVar;
            int i11 = f1Var.f26267c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                f1Var.f26267c = i11 - Integer.MIN_VALUE;
            } else {
                f1Var = new f1(this, cVar);
            }
        } else {
            f1Var = new f1(this, cVar);
        }
        Object obj = f1Var.f26265a;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = f1Var.f26267c;
        if (i12 == 0) {
            com.bumptech.glide.e.F(obj);
            this.f26278a = true;
            e6.q0 q0Var = new e6.q0(8, i2Var, d1Var, (vy.d) null);
            f1Var.f26267c = 1;
            rz.a2 a2Var = new rz.a2(f1Var.getContext(), f1Var, 0);
            if (ff.h.O(a2Var, true, a2Var, q0Var) == aVar) {
                return aVar;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(obj);
        }
        this.f26278a = false;
        return qy.b0.f48488a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.io.Serializable] */
    public g1(AssetManager assetManager, Executor executor, u9.c cVar, String str, File file) {
        ?? r9;
        this.f26278a = false;
        this.f26279b = executor;
        this.f26280c = cVar;
        this.f26283f = str;
        this.f26282e = file;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 31) {
            r9 = u9.d.f52864d;
        } else {
            switch (i11) {
                case Service.METRICS_FIELD_NUMBER /* 24 */:
                case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                    r9 = u9.d.f52868h;
                    break;
                case Service.BILLING_FIELD_NUMBER /* 26 */:
                    r9 = u9.d.f52867g;
                    break;
                case 27:
                    r9 = u9.d.f52866f;
                    break;
                case Service.MONITORING_FIELD_NUMBER /* 28 */:
                case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
                case 30:
                    r9 = u9.d.f52865e;
                    break;
                default:
                    r9 = 0;
                    break;
            }
        }
        this.f26281d = r9;
    }
}
