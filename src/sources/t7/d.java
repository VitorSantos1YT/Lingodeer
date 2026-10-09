package t7;

import android.app.Activity;
import android.content.res.Resources;
import android.util.SparseArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bq.w;
import com.lingo.lingoskill.ui.review.AckCardActivity;
import d0.g0;
import gp.t;
import hj.x3;
import hj.y1;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Proxy;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import jp.p0;
import kotlin.KotlinNothingValueException;
import r.x2;
import uz.i1;
import uz.x0;
import zd.y;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements tx.c, w, qe.a, hc.h, ka.f, zd.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f52058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f52059b;

    public /* synthetic */ d(Object obj, int i11) {
        this.f52058a = i11;
        this.f52059b = obj;
    }

    @Override // ka.f
    public String a() {
        return ((z9.f) this.f52059b).f59048b;
    }

    @Override // tx.c
    public void accept(Object obj) {
        int i11 = this.f52058a;
        Object obj2 = this.f52059b;
        switch (i11) {
            case 1:
                List it = (List) obj;
                kotlin.jvm.internal.m.f(it, "it");
                AckCardActivity ackCardActivity = (AckCardActivity) obj2;
                ackCardActivity.Q = it;
                ((hj.f) ackCardActivity.j()).f32551g.setText(String.valueOf(ackCardActivity.Q.size()));
                ackCardActivity.w();
                break;
            case 2:
                kotlin.jvm.internal.m.f((Long) obj, "it");
                ta.a aVar = ((tp.r) obj2).f36400f;
                kotlin.jvm.internal.m.c(aVar);
                ((TextView) ((x3) aVar).f33575h.f32800i).setVisibility(8);
                break;
            default:
                kotlin.jvm.internal.m.f((Long) obj, "it");
                zi.l lVar = (zi.l) obj2;
                mp.b bVar = lVar.f59222a;
                xi.b bVar2 = lVar.f59223b;
                String strS = com.bumptech.glide.f.s(bVar2);
                ta.a aVar2 = lVar.f59227f;
                kotlin.jvm.internal.m.c(aVar2);
                ((p0) bVar).H((ImageView) ((y1) aVar2).f33612b.f32408d, strS);
                int[] iArr = bq.r.f4959a;
                th.j.a(qx.h.m(bq.m.B(com.bumptech.glide.f.s(bVar2)), TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new w00.d(lVar), zi.a.f59220t), lVar.f59228g);
                break;
        }
    }

    @Override // qe.a
    public Object b() {
        x2 x2Var = (x2) this.f52059b;
        return new vd.s((yd.d) x2Var.f48709a, (yd.d) x2Var.f48710b, (yd.d) x2Var.f48711c, (yd.d) x2Var.f48712d, (vd.o) x2Var.f48713e, (vd.o) x2Var.f48714f, (ob.m) x2Var.f48715t);
    }

    @Override // ka.f
    public void c(ka.e eVar) {
        z9.f fVar = (z9.f) this.f52059b;
        int length = fVar.f59042d.length;
        for (int i11 = 1; i11 < length; i11++) {
            int i12 = fVar.f59042d[i11];
            if (i12 == 1) {
                eVar.g(i11, fVar.f59043e[i11]);
            } else if (i12 == 2) {
                eVar.L(i11, fVar.f59044f[i11]);
            } else if (i12 == 3) {
                String str = fVar.f59045t[i11];
                kotlin.jvm.internal.m.c(str);
                eVar.l(i11, str);
            } else if (i12 == 4) {
                byte[] bArr = fVar.H[i11];
                kotlin.jvm.internal.m.c(bArr);
                eVar.t0(bArr, i11);
            } else if (i12 == 5) {
                eVar.s(i11);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public wy.a d(g0 g0Var, xy.c cVar) {
        w9.k kVar;
        if (cVar instanceof w9.k) {
            kVar = (w9.k) cVar;
            int i11 = kVar.f54823c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                kVar.f54823c = i11 - Integer.MIN_VALUE;
            } else {
                kVar = new w9.k(this, cVar);
            }
        } else {
            kVar = new w9.k(this, cVar);
        }
        Object obj = kVar.f54821a;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = kVar.f54823c;
        if (i12 == 0) {
            com.bumptech.glide.e.F(obj);
            i1 i1Var = (i1) this.f52059b;
            kVar.f54823c = 1;
            if (i1Var.collect(g0Var, kVar) == aVar) {
                return aVar;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(obj);
        }
        throw new KotlinNothingValueException();
    }

    public ya.d e(Object obj, kotlin.jvm.internal.e eVar, Activity activity, bb.b bVar) throws IllegalAccessException, InvocationTargetException {
        Object objNewProxyInstance = Proxy.newProxyInstance((ClassLoader) this.f52059b, new Class[]{h()}, new cf.m(eVar, bVar));
        kotlin.jvm.internal.m.e(objNewProxyInstance, "newProxyInstance(...)");
        obj.getClass().getMethod("addWindowLayoutInfoListener", Activity.class, h()).invoke(obj, activity, objNewProxyInstance);
        return new ya.d(obj.getClass().getMethod("removeWindowLayoutInfoListener", h()), obj, objNewProxyInstance);
    }

    @Override // hc.h
    public Object f(vb.g gVar) {
        return x0.u(new t(((wb.i) this.f52059b).f54915t, 18), gVar);
    }

    public void g(Set tableIds) {
        Object value;
        int[] iArr;
        kotlin.jvm.internal.m.f(tableIds, "tableIds");
        if (tableIds.isEmpty()) {
            return;
        }
        i1 i1Var = (i1) this.f52059b;
        do {
            value = i1Var.getValue();
            int[] iArr2 = (int[]) value;
            int length = iArr2.length;
            iArr = new int[length];
            for (int i11 = 0; i11 < length; i11++) {
                iArr[i11] = tableIds.contains(Integer.valueOf(i11)) ? iArr2[i11] + 1 : iArr2[i11];
            }
        } while (!i1Var.j(value, iArr));
    }

    public Class h() throws ClassNotFoundException {
        Class<?> clsLoadClass = ((ClassLoader) this.f52059b).loadClass("java.util.function.Consumer");
        kotlin.jvm.internal.m.e(clsLoadClass, "loadClass(...)");
        return clsLoadClass;
    }

    @Override // bq.w
    public void k(View view, boolean z11) {
        if (z11) {
            return;
        }
        bc.i iVar = ((um.f) this.f52059b).f53033c;
        kotlin.jvm.internal.m.c(iVar);
        iVar.g();
    }

    @Override // bq.w
    public void m(View view, boolean z11) {
        um.f fVar = (um.f) this.f52059b;
        bc.i iVar = fVar.f53033c;
        if (z11) {
            kotlin.jvm.internal.m.c(iVar);
            iVar.c();
            iVar.f4122b = true;
            b7.c cVar = fVar.f53034d;
            kotlin.jvm.internal.m.c(cVar);
            iVar.a((String) cVar.f3961d);
            iVar.a(fVar.f53039i);
            iVar.d();
        }
    }

    @Override // zd.r
    public zd.q p(zd.w wVar) {
        return new zd.b((Resources) this.f52059b, y.f59204b);
    }

    public d(ClassLoader loader) {
        this.f52058a = 9;
        kotlin.jvm.internal.m.f(loader, "loader");
        this.f52059b = loader;
    }

    public d(int i11, byte b3) {
        this.f52058a = i11;
        switch (i11) {
            case 4:
                this.f52059b = new SparseArray();
                break;
            case 10:
                this.f52059b = new LinkedHashMap(0, 0.75f, true);
                break;
            default:
                this.f52059b = new CopyOnWriteArrayList();
                break;
        }
    }

    public d(TextView textView) {
        this.f52058a = 8;
        this.f52059b = new x5.g(textView);
    }

    public d(int i11) {
        this.f52058a = 6;
        this.f52059b = x0.c(new int[i11]);
    }
}
