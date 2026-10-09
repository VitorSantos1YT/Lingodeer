package w00;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.EditText;
import com.android.billingclient.api.k0;
import java.io.InputStream;
import java.util.ArrayList;
import jp.p0;
import qh.z;
import zd.w;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class d implements ic.a, ja.b, zd.r, tx.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f54378a;

    public /* synthetic */ d(Object obj) {
        this.f54378a = obj;
    }

    @Override // ic.a
    public void a(Drawable drawable) {
        wb.i iVar = (wb.i) this.f54378a;
        iVar.k(new wb.e(drawable != null ? iVar.j(drawable) : null));
    }

    @Override // tx.c
    public void accept(Object obj) {
        Long it = (Long) obj;
        kotlin.jvm.internal.m.f(it, "it");
        zi.l lVar = (zi.l) this.f54378a;
        ((p0) lVar.f59222a).A().z(false);
        ((p0) lVar.f59222a).X();
    }

    public void b(int i11, boolean z11) {
        k0 k0Var = (k0) this.f54378a;
        if (z11) {
            k0Var.a(i11);
        } else {
            k0Var.getClass();
        }
    }

    @Override // ja.b
    public ja.a c(String fileName) {
        kotlin.jvm.internal.m.f(fileName, "fileName");
        return new z9.a(((ka.d) this.f54378a).n0());
    }

    public a10.f d() {
        c10.a aVar = (c10.a) this.f54378a;
        if (!(aVar instanceof q)) {
            return new a10.f(0);
        }
        ArrayList arrayList = ((q) aVar).f54446b.f54429b;
        a10.f fVar = new a10.f(0);
        fVar.f291a.addAll(arrayList);
        return fVar;
    }

    @Override // zd.r
    public zd.q p(w wVar) {
        return new zd.b((Resources) this.f54378a, wVar.b(Uri.class, InputStream.class));
    }

    public d(ka.d openHelper) {
        kotlin.jvm.internal.m.f(openHelper, "openHelper");
        this.f54378a = openHelper;
    }

    public d(EditText editText) {
        this.f54378a = new z(editText);
    }

    public d() {
        this.f54378a = new k0(9);
    }
}
