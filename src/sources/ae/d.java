package ae;

import android.content.Context;
import android.content.IntentFilter;
import android.net.Uri;
import android.view.MenuItem;
import com.google.common.base.Preconditions;
import java.io.File;
import kotlin.jvm.internal.m;
import y.t0;
import zd.q;
import zd.r;
import zd.w;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f670b;

    public d(Context context) {
        this.f669a = context;
    }

    public abstract void c(dm.c cVar);

    public void d() {
        lf.e eVar = (lf.e) this.f669a;
        if (eVar != null) {
            try {
                ((androidx.appcompat.app.b) this.f670b).M.unregisterReceiver(eVar);
            } catch (IllegalArgumentException unused) {
            }
            this.f669a = null;
        }
    }

    public abstract IntentFilter e();

    public abstract int[] f(int i11);

    public abstract int g();

    public abstract String h();

    public MenuItem i(MenuItem menuItem) {
        if (!(menuItem instanceof t4.a)) {
            return menuItem;
        }
        t4.a aVar = (t4.a) menuItem;
        if (((t0) this.f670b) == null) {
            this.f670b = new t0(0);
        }
        MenuItem menuItem2 = (MenuItem) ((t0) this.f670b).get(aVar);
        if (menuItem2 != null) {
            return menuItem2;
        }
        androidx.appcompat.view.menu.a aVar2 = new androidx.appcompat.view.menu.a((Context) this.f669a, aVar);
        ((t0) this.f670b).put(aVar, aVar2);
        return aVar2;
    }

    public int[] j(int i11, int i12) {
        if (i11 < 0 || i12 < 0 || i11 == i12) {
            return null;
        }
        int[] iArr = (int[]) this.f670b;
        iArr[0] = i11;
        iArr[1] = i12;
        return iArr;
    }

    public String k() {
        String str = (String) this.f669a;
        if (str != null) {
            return str;
        }
        m.n("text");
        throw null;
    }

    public abstract void l();

    public abstract int[] m(int i11);

    public void n() {
        d();
        IntentFilter intentFilterE = e();
        if (intentFilterE.countActions() == 0) {
            return;
        }
        if (((lf.e) this.f669a) == null) {
            this.f669a = new lf.e(this, 3);
        }
        ((androidx.appcompat.app.b) this.f670b).M.registerReceiver((lf.e) this.f669a, intentFilterE);
    }

    @Override // zd.r
    public q p(w wVar) {
        Context context = (Context) this.f669a;
        Class cls = (Class) this.f670b;
        return new g(context, wVar.b(File.class, cls), wVar.b(Uri.class, cls), cls);
    }

    public d() {
        this.f670b = new int[2];
    }

    public d(lw.d dVar, lw.c cVar) {
        Preconditions.k(dVar, "channel");
        this.f669a = dVar;
        Preconditions.k(cVar, "callOptions");
        this.f670b = cVar;
    }

    public d(Context context, Class cls) {
        this.f669a = context;
        this.f670b = cls;
    }

    public d(androidx.appcompat.app.b bVar) {
        this.f670b = bVar;
    }
}
