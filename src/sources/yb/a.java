package yb;

import android.view.View;
import android.widget.ImageView;
import av.n;
import bt.j1;
import hj.x1;
import hj.y1;
import jp.p0;
import kotlin.jvm.internal.m;
import l1.j0;
import qy.b0;
import qy.q;
import zi.i;
import zi.l;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f57564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f57565b;

    public /* synthetic */ a(Object obj, int i11) {
        this.f57564a = i11;
        this.f57565b = obj;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        int i11 = this.f57564a;
        b0 b0Var = b0.f48488a;
        Object obj2 = this.f57565b;
        switch (i11) {
            case 0:
                ((e) obj2).M = true;
                return b0Var;
            case 1:
                j0 DisposableEffect = (j0) obj;
                m.f(DisposableEffect, "$this$DisposableEffect");
                return new j1((n) obj2, 14);
            case 2:
                return new j1((z0.c) obj2, 16);
            case 3:
                i iVar = (i) obj2;
                View it = (View) obj;
                m.f(it, "it");
                mp.b bVar = iVar.f59222a;
                xi.b pinyinElem = iVar.f59223b;
                m.f(pinyinElem, "pinyinElem");
                q qVar = fv.f.f28191a;
                String str = pinyinElem.f56087a;
                m.c(str);
                String str2 = pinyinElem.f56088b;
                m.c(str2);
                String strM = defpackage.e.m(xt.b.a().b(), fv.f.a(pinyinElem.f56089c, str, str2));
                ta.a aVar = iVar.f59227f;
                m.c(aVar);
                ((p0) bVar).H((ImageView) ((x1) aVar).f33565d.f32408d, strM);
                return b0Var;
            case 4:
                l lVar = (l) obj2;
                View it2 = (View) obj;
                m.f(it2, "it");
                mp.b bVar2 = lVar.f59222a;
                xi.b pinyinElem2 = lVar.f59223b;
                m.f(pinyinElem2, "pinyinElem");
                q qVar2 = fv.f.f28191a;
                String str3 = pinyinElem2.f56087a;
                m.c(str3);
                String str4 = pinyinElem2.f56088b;
                m.c(str4);
                String strM2 = defpackage.e.m(xt.b.a().b(), fv.f.a(pinyinElem2.f56089c, str3, str4));
                ta.a aVar2 = lVar.f59227f;
                m.c(aVar2);
                ((p0) bVar2).H((ImageView) ((y1) aVar2).f33612b.f32408d, strM2);
                return b0Var;
            default:
                return Boolean.valueOf(((zr.b) obj2).f59293f.contains((String) obj));
        }
    }
}
