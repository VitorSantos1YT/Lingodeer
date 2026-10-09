package uv;

import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class n extends cw.a {
    @Override // uv.s
    public final byte b(int i11) {
        if (!c()) {
            ew.a.r("request get the status for the task[%d] in the download service", Integer.valueOf(i11));
            return (byte) 0;
        }
        try {
            return this.f22592b.b(i11);
        } catch (RemoteException e8) {
            e8.printStackTrace();
            return (byte) 0;
        }
    }

    @Override // uv.s
    public final boolean e(int i11) {
        if (!c()) {
            ew.a.r("request pause the task[%d] in the download service", Integer.valueOf(i11));
            return false;
        }
        try {
            return this.f22592b.e(i11);
        } catch (RemoteException e8) {
            e8.printStackTrace();
            return false;
        }
    }

    @Override // uv.s
    public final boolean i() {
        if (!c()) {
            ew.a.r("request check the download service is idle", new Object[0]);
            return true;
        }
        try {
            this.f22592b.i();
            return true;
        } catch (RemoteException e8) {
            e8.printStackTrace();
            return true;
        }
    }

    @Override // uv.s
    public final void l() {
        if (!c()) {
            ew.a.r("request pause all tasks in the download service", new Object[0]);
            return;
        }
        try {
            this.f22592b.l();
        } catch (RemoteException e8) {
            e8.printStackTrace();
        }
    }

    @Override // uv.s
    public final void m() {
        if (!c()) {
            ew.a.r("request cancel the foreground status[%B] for the download service", Boolean.TRUE);
            return;
        }
        try {
            this.f22592b.x0(true);
        } catch (RemoteException e8) {
            e8.printStackTrace();
        } finally {
            this.f22594d = false;
        }
    }

    @Override // uv.s
    public final boolean n(String str, String str2, int i11, int i12, boolean z11, boolean z12) {
        if (!c()) {
            ew.a.r("request start the task([%s], [%s], [%B]) in the download service", str, str2, Boolean.FALSE);
            return false;
        }
        try {
            this.f22592b.H0(str, str2, false, i11, 10, i12, z11, null, z12);
            return true;
        } catch (RemoteException e8) {
            e8.printStackTrace();
            return false;
        }
    }
}
