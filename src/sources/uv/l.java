package uv;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.SparseArray;
import com.liulishuo.filedownloader.services.FileDownloadService$SharedMainProcessService;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class l implements s, cw.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f53221a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f53222b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public cw.d f53223c;

    @Override // uv.s
    public final byte b(int i11) {
        if (!c()) {
            ew.a.r("request get the status for the task[%d] in the download service", Integer.valueOf(i11));
            return (byte) 0;
        }
        bw.c cVarR = ((wv.a) this.f53223c.f22600b.f44891b).r(i11);
        if (cVarR == null) {
            return (byte) 0;
        }
        return cVarR.a();
    }

    @Override // uv.s
    public final boolean c() {
        return this.f53223c != null;
    }

    @Override // uv.s
    public final boolean e(int i11) {
        if (c()) {
            return this.f53223c.f22600b.z(i11);
        }
        ew.a.r("request pause the task[%d] in the download service", Integer.valueOf(i11));
        return false;
    }

    @Override // uv.s
    public final boolean i() {
        int size;
        if (!c()) {
            ew.a.r("request check the download service is idle", new Object[0]);
            return true;
        }
        ij.d dVar = (ij.d) this.f53223c.f22600b.f44892c;
        synchronized (dVar) {
            dVar.f();
            size = ((SparseArray) dVar.f34422c).size();
        }
        return size <= 0;
    }

    @Override // uv.s
    public final void l() {
        if (c()) {
            this.f53223c.l();
        } else {
            ew.a.r("request pause all tasks in the download service", new Object[0]);
        }
    }

    @Override // uv.s
    public final void m() {
        if (!c()) {
            ew.a.r("request cancel the foreground status[%B] for the download service", Boolean.TRUE);
        } else {
            this.f53223c.x0(true);
            this.f53221a = false;
        }
    }

    @Override // uv.s
    public final boolean n(String str, String str2, int i11, int i12, boolean z11, boolean z12) throws Throwable {
        if (c()) {
            this.f53223c.H0(str, str2, false, i11, 10, i12, z11, null, z12);
            return true;
        }
        ew.a.r("request start the task([%s], [%s], [%B]) in the download service", str, str2, Boolean.FALSE);
        return false;
    }

    @Override // uv.s
    public final void o(Context context) {
        context.stopService(new Intent(context, (Class<?>) FileDownloadService$SharedMainProcessService.class));
        this.f53223c = null;
    }

    @Override // uv.s
    public final void q(Context context) {
        Intent intent = new Intent(context, (Class<?>) FileDownloadService$SharedMainProcessService.class);
        boolean zJ = ew.f.j(context);
        this.f53221a = zJ;
        intent.putExtra("is_foreground", zJ);
        if (!this.f53221a) {
            context.startService(intent);
        } else if (Build.VERSION.SDK_INT >= 26) {
            context.startForegroundService(intent);
        }
    }

    @Override // uv.s
    public final boolean r() {
        return this.f53221a;
    }
}
