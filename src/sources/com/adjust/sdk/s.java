package com.adjust.sdk;

import android.content.ComponentName;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import lf.i0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f7380b;

    public /* synthetic */ s(Context context, int i11) {
        this.f7379a = i11;
        this.f7380b = context;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00a5  */
    @Override // java.lang.Runnable
    public final void run() {
        v4.e eVar;
        Object systemService;
        Context context;
        Typeface typefaceA;
        switch (this.f7379a) {
            case 0:
                AdjustInstance.lambda$setSendingReferrersAsNotSent$2(this.f7380b);
                break;
            case 1:
                int i11 = Build.VERSION.SDK_INT;
                if (i11 >= 33) {
                    Context context2 = this.f7380b;
                    ComponentName componentName = new ComponentName(context2, "androidx.appcompat.app.AppLocalesMetadataHolderService");
                    if (context2.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                        if (i11 >= 33) {
                            y.f fVar = androidx.appcompat.app.a.f800t;
                            fVar.getClass();
                            y.a aVar = new y.a(fVar);
                            while (true) {
                                if (aVar.hasNext()) {
                                    androidx.appcompat.app.a aVar2 = (androidx.appcompat.app.a) ((WeakReference) aVar.next()).get();
                                    if (aVar2 != null && (context = ((androidx.appcompat.app.b) aVar2).M) != null) {
                                        systemService = context.getSystemService("locale");
                                    }
                                } else {
                                    systemService = null;
                                }
                            }
                            if (systemService != null) {
                                eVar = new v4.e(new v4.f(l.p.a(systemService)));
                            } else {
                                eVar = v4.e.f53511b;
                            }
                        } else {
                            eVar = androidx.appcompat.app.a.f796c;
                            if (eVar == null) {
                                eVar = v4.e.f53511b;
                            }
                        }
                        if (eVar.f53512a.f53513a.isEmpty()) {
                            String strE = n4.e.e(context2);
                            Object systemService2 = context2.getSystemService("locale");
                            if (systemService2 != null) {
                                l.p.b(systemService2, l.o.a(strE));
                            }
                        }
                        context2.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                    }
                }
                androidx.appcompat.app.a.f799f = true;
                break;
            case 2:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new s(this.f7380b, 3));
                break;
            case 3:
                u9.d.t(this.f7380b, new s.a(1), u9.d.f52861a, false);
                break;
            default:
                try {
                    typefaceA = q4.j.a(this.f7380b, com.lingodeer.R.font.biz_udpgothic);
                } catch (Exception unused) {
                    typefaceA = null;
                }
                um.c.f53023e.post(new i0(typefaceA, 16));
                break;
        }
    }
}
