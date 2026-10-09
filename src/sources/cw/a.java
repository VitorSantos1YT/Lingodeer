package cw;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.liulishuo.filedownloader.services.FileDownloadService$SeparateProcessService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import uv.m;
import uv.s;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a implements s, ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f22591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile zv.e f22592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Class f22593c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f22594d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f22595e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f22596f;

    public a() {
        new HashMap();
        this.f22595e = new ArrayList();
        this.f22596f = new ArrayList();
        this.f22593c = FileDownloadService$SeparateProcessService.class;
        m mVar = new m();
        mVar.attachInterface(mVar, "com.liulishuo.filedownloader.i.IFileDownloadIPCCallback");
        this.f22591a = mVar;
    }

    public final void a(boolean z11) {
        if (!z11 && this.f22592b != null) {
            try {
                this.f22592b.a0(this.f22591a);
            } catch (RemoteException e8) {
                e8.printStackTrace();
            }
        }
        this.f22592b = null;
        uv.e.f53205a.b(new w00.d(z11 ? yv.a.lost : yv.a.disconnected));
    }

    @Override // uv.s
    public final boolean c() {
        return this.f22592b != null;
    }

    @Override // uv.s
    public final void o(Context context) {
        ArrayList arrayList = this.f22595e;
        if (arrayList.contains(context)) {
            arrayList.remove(context);
            if (arrayList.isEmpty()) {
                a(false);
            }
            Intent intent = new Intent(context, (Class<?>) this.f22593c);
            context.unbindService(this);
            context.stopService(intent);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        zv.e eVar;
        int i11 = zv.d.f59584a;
        if (iBinder == null) {
            eVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
            if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof zv.e)) {
                zv.c cVar = new zv.c();
                cVar.f59583a = iBinder;
                eVar = cVar;
            } else {
                eVar = (zv.e) iInterfaceQueryLocalInterface;
            }
        }
        this.f22592b = eVar;
        try {
            this.f22592b.K(this.f22591a);
        } catch (RemoteException e8) {
            e8.printStackTrace();
        }
        List list = (List) this.f22596f.clone();
        this.f22596f.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        uv.e.f53205a.b(new w00.d(yv.a.connected));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        a(true);
    }

    @Override // uv.s
    public final void q(Context context) {
        if (ew.f.f(context)) {
            throw new IllegalStateException("Fatal-Exception: You can't bind the FileDownloadService in :filedownloader process.\n It's the invalid operation and is likely to cause unexpected problems.\n Maybe you want to use non-separate process mode for FileDownloader, More detail about non-separate mode, please move to wiki manually: https://github.com/Goooler/FileDownloader/wiki/filedownloader.properties");
        }
        Intent intent = new Intent(context, (Class<?>) this.f22593c);
        ArrayList arrayList = this.f22595e;
        if (!arrayList.contains(context)) {
            arrayList.add(context);
        }
        boolean zJ = ew.f.j(context);
        this.f22594d = zJ;
        intent.putExtra("is_foreground", zJ);
        context.bindService(intent, this, 1);
        if (!this.f22594d) {
            context.startService(intent);
        } else if (Build.VERSION.SDK_INT >= 26) {
            context.startForegroundService(intent);
        }
    }

    @Override // uv.s
    public final boolean r() {
        return this.f22594d;
    }
}
