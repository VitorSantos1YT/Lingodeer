package com.android.billingclient.api;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.play_billing.zzak;
import com.google.android.gms.internal.play_billing.zzal;
import com.google.android.gms.internal.play_billing.zzam;
import com.google.android.gms.internal.play_billing.zzbi;
import com.google.android.gms.internal.play_billing.zzbl;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzhv;
import com.google.android.gms.internal.play_billing.zzhx;
import com.google.android.gms.internal.play_billing.zzic;
import com.google.android.gms.internal.play_billing.zzie;
import com.google.android.gms.internal.play_billing.zzig;
import com.google.android.gms.internal.play_billing.zzij;
import com.google.android.gms.internal.play_billing.zzis;
import com.google.android.gms.internal.play_billing.zzjg;
import com.google.android.gms.internal.play_billing.zzji;
import com.google.android.gms.internal.play_billing.zzjm;
import com.google.android.gms.internal.play_billing.zzjo;
import com.google.android.gms.internal.play_billing.zzjs;
import com.google.android.gms.internal.play_billing.zzjt;
import com.google.android.gms.internal.play_billing.zzjv;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class y implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f7590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzbi f7591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zzbi f7592c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d f7593d;

    public y(d dVar, e eVar) {
        this.f7593d = dVar;
        zzbl zzblVar = dVar.C;
        this.f7591b = new zzbi(zzblVar);
        this.f7592c = new zzbi(zzblVar);
        this.f7590a = eVar;
    }

    public final Long a(boolean z11) {
        if (z11) {
            zzbi zzbiVar = this.f7591b;
            if (!zzbiVar.f12250b) {
                return null;
            }
            long jA = zzbiVar.f12249a.a();
            if (!zzbiVar.f12250b) {
                throw new IllegalStateException("This stopwatch is already stopped.");
            }
            zzbiVar.f12250b = false;
            long j11 = (jA - zzbiVar.f12252d) + zzbiVar.f12251c;
            zzbiVar.f12251c = j11;
            return Long.valueOf(TimeUnit.MILLISECONDS.convert(j11, TimeUnit.NANOSECONDS));
        }
        zzbi zzbiVar2 = this.f7592c;
        if (!zzbiVar2.f12250b) {
            return null;
        }
        long jA2 = zzbiVar2.f12249a.a();
        if (!zzbiVar2.f12250b) {
            throw new IllegalStateException("This stopwatch is already stopped.");
        }
        zzbiVar2.f12250b = false;
        long j12 = (jA2 - zzbiVar2.f12252d) + zzbiVar2.f12251c;
        zzbiVar2.f12251c = j12;
        return Long.valueOf(TimeUnit.MILLISECONDS.convert(j12, TimeUnit.NANOSECONDS));
    }

    public final void b(j jVar, zzie zzieVar, String str, boolean z11) {
        try {
            zzic zzicVarU = zzig.u();
            int i11 = jVar.f7519a;
            zzicVarU.h();
            zzig.t((zzig) zzicVarU.f12378b, i11);
            String str2 = jVar.f7521c;
            zzicVarU.h();
            zzig.q((zzig) zzicVarU.f12378b, str2);
            zzicVarU.i(zzieVar);
            if (str != null) {
                zzicVarU.h();
                zzig.p((zzig) zzicVarU.f12378b, str);
            }
            Long lA = a(z11);
            d dVar = this.f7593d;
            if (!z11) {
                zzjm zzjmVarR = zzjo.r();
                zzjmVarR.h();
                zzjo.p((zzjo) zzjmVarR.f12378b, (zzig) zzicVarU.f());
                if (lA != null) {
                    long jLongValue = lA.longValue();
                    zzjmVarR.h();
                    zzjo.q((zzjo) zzjmVarR.f12378b, jLongValue);
                }
                dVar.f7479h.A((zzjo) zzjmVarR.f());
                return;
            }
            zzjt zzjtVarT = zzjv.t();
            zzjtVarT.i(false);
            zzjtVarT.j();
            if (lA != null) {
                long jLongValue2 = lA.longValue();
                zzjtVarT.h();
                zzjv.r((zzjv) zzjtVarT.f12378b, jLongValue2);
            }
            zzhv zzhvVarW = zzhx.w();
            zzhvVarW.i(zzicVarU);
            zzhvVarW.k(6);
            zzhvVarW.j(zzjtVarT);
            dVar.j((zzhx) zzhvVarW.f());
        } catch (Throwable unused) {
            int i12 = zzc.f12272a;
        }
    }

    public final void c(j jVar) {
        d dVar = this.f7593d;
        synchronized (dVar.f7472a) {
            try {
                if (dVar.f7473b == 3) {
                    return;
                }
                try {
                    this.f7590a.b(jVar);
                } catch (Throwable unused) {
                    int i11 = zzc.f12272a;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        boolean z11;
        int i11 = zzc.f12272a;
        try {
            d dVar = this.f7593d;
            synchronized (dVar.f7472a) {
                z11 = true;
                if (dVar.f7473b != 1) {
                    z11 = false;
                }
            }
            if (z11) {
                ob.c cVar = dVar.f7479h;
                zzhv zzhvVarW = zzhx.w();
                zzhvVarW.k(6);
                zzic zzicVarU = zzig.u();
                zzicVarU.i(zzie.BINDING_DIED);
                zzhvVarW.i(zzicVarU);
                zzjt zzjtVarT = zzjv.t();
                zzjtVarT.i(false);
                zzjtVarT.j();
                zzhvVarW.j(zzjtVarT);
                cVar.w((zzhx) zzhvVarW.f());
            } else {
                ob.c cVar2 = dVar.f7479h;
                zzij zzijVarP = zzij.p();
                cVar2.getClass();
                try {
                    zzjg zzjgVarV = zzji.v();
                    zzjgVarV.i((zzis) cVar2.f44799b);
                    zzjgVarV.h();
                    zzji.r((zzji) zzjgVarV.f12378b, zzijVarP);
                    ((k0) cVar2.f44800c).s((zzji) zzjgVarV.f());
                } catch (Throwable unused) {
                    int i12 = zzc.f12272a;
                }
            }
        } catch (Throwable unused2) {
            int i13 = zzc.f12272a;
        }
        d dVar2 = this.f7593d;
        synchronized (dVar2.f7472a) {
            if (dVar2.f7473b != 3 && dVar2.f7473b != 0) {
                dVar2.m(0);
                dVar2.o();
                try {
                    this.f7590a.c();
                } catch (Throwable unused3) {
                    int i14 = zzc.f12272a;
                }
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        zzam zzakVar;
        zzc.h("BillingClient", "Billing service connected.");
        d dVar = this.f7593d;
        synchronized (dVar.f7472a) {
            try {
                if (dVar.f7473b == 3) {
                    return;
                }
                int i11 = zzal.f12237a;
                if (iBinder == null) {
                    zzakVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.android.vending.billing.IInAppBillingService");
                    zzakVar = iInterfaceQueryLocalInterface instanceof zzam ? (zzam) iInterfaceQueryLocalInterface : new zzak(iBinder, "com.android.vending.billing.IInAppBillingService");
                }
                dVar.f7480i = zzakVar;
                if (d.h(new ax.c(this, 1), 30000L, new aj.i(this, 1), dVar.t(), dVar.g()) == null) {
                    j jVarW = dVar.w();
                    dVar.l(jVarW, zzie.MISSING_RESULT_FROM_EXECUTE_ASYNC);
                    c(jVarW);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        boolean z11;
        int i11 = zzc.f12272a;
        try {
            d dVar = this.f7593d;
            synchronized (dVar.f7472a) {
                z11 = true;
                if (dVar.f7473b != 1) {
                    z11 = false;
                }
            }
            if (z11) {
                ob.c cVar = dVar.f7479h;
                zzhv zzhvVarW = zzhx.w();
                zzhvVarW.k(6);
                zzic zzicVarU = zzig.u();
                zzicVarU.i(zzie.SERVICE_DISCONNECTED);
                zzhvVarW.i(zzicVarU);
                zzjt zzjtVarT = zzjv.t();
                zzjtVarT.i(false);
                zzjtVarT.j();
                zzhvVarW.j(zzjtVarT);
                cVar.w((zzhx) zzhvVarW.f());
            } else {
                ob.c cVar2 = dVar.f7479h;
                zzjs zzjsVarP = zzjs.p();
                cVar2.getClass();
                if (zzjsVarP != null) {
                    try {
                        zzjg zzjgVarV = zzji.v();
                        zzjgVarV.i((zzis) cVar2.f44799b);
                        zzjgVarV.h();
                        zzji.u((zzji) zzjgVarV.f12378b, zzjsVarP);
                        ((k0) cVar2.f44800c).s((zzji) zzjgVarV.f());
                    } catch (Throwable unused) {
                        int i12 = zzc.f12272a;
                    }
                }
            }
        } catch (Throwable unused2) {
            int i13 = zzc.f12272a;
        }
        zzbi zzbiVar = this.f7592c;
        zzbiVar.f12251c = 0L;
        zzbiVar.f12250b = false;
        zzbiVar.a();
        d dVar2 = this.f7593d;
        synchronized (dVar2.f7472a) {
            try {
                if (dVar2.f7473b == 3) {
                    return;
                }
                dVar2.m(0);
                try {
                    this.f7590a.c();
                } catch (Throwable unused3) {
                    int i14 = zzc.f12272a;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
