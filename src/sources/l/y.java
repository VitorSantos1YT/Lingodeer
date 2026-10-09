package l;

import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import java.util.Calendar;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class y extends ae.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f39071c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.b f39072d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f39073e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(androidx.appcompat.app.b bVar, ob.m mVar) {
        super(bVar);
        this.f39072d = bVar;
        this.f39073e = mVar;
    }

    @Override // ae.d
    public final IntentFilter e() {
        switch (this.f39071c) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            default:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.TIME_SET");
                intentFilter2.addAction("android.intent.action.TIMEZONE_CHANGED");
                intentFilter2.addAction("android.intent.action.TIME_TICK");
                return intentFilter2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003c  */
    @Override // ae.d
    public final int g() {
        Location lastKnownLocation;
        boolean z11;
        long j11;
        switch (this.f39071c) {
            case 0:
                return u.a((PowerManager) this.f39073e) ? 2 : 1;
            default:
                ob.m mVar = (ob.m) this.f39073e;
                j0 j0Var = (j0) mVar.f44828d;
                LocationManager locationManager = (LocationManager) mVar.f44827c;
                if (j0Var.f39023b > System.currentTimeMillis()) {
                    z11 = j0Var.f39022a;
                } else {
                    Context context = (Context) mVar.f44826b;
                    Location lastKnownLocation2 = null;
                    if (o4.g.a(context, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                        try {
                            if (locationManager.isProviderEnabled("network")) {
                                lastKnownLocation = locationManager.getLastKnownLocation("network");
                            } else {
                                lastKnownLocation = null;
                            }
                            break;
                        } catch (Exception unused) {
                        }
                    } else {
                        lastKnownLocation = null;
                    }
                    if (o4.g.a(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                        try {
                            if (locationManager.isProviderEnabled("gps")) {
                                lastKnownLocation2 = locationManager.getLastKnownLocation("gps");
                            }
                            break;
                        } catch (Exception unused2) {
                        }
                    }
                    if (lastKnownLocation2 == null || lastKnownLocation == null ? lastKnownLocation2 != null : lastKnownLocation2.getTime() > lastKnownLocation.getTime()) {
                        lastKnownLocation = lastKnownLocation2;
                    }
                    z11 = false;
                    if (lastKnownLocation != null) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        if (i0.f39016d == null) {
                            i0.f39016d = new i0();
                        }
                        i0 i0Var = i0.f39016d;
                        i0Var.a(lastKnownLocation.getLatitude(), lastKnownLocation.getLongitude(), jCurrentTimeMillis - 86400000);
                        i0Var.a(lastKnownLocation.getLatitude(), lastKnownLocation.getLongitude(), jCurrentTimeMillis);
                        z11 = i0Var.f39019c == 1;
                        long j12 = i0Var.f39018b;
                        long j13 = i0Var.f39017a;
                        i0Var.a(lastKnownLocation.getLatitude(), lastKnownLocation.getLongitude(), jCurrentTimeMillis + 86400000);
                        long j14 = i0Var.f39018b;
                        if (j12 == -1 || j13 == -1) {
                            j11 = jCurrentTimeMillis + 43200000;
                        } else {
                            if (jCurrentTimeMillis > j13) {
                                j12 = j14;
                            } else if (jCurrentTimeMillis > j12) {
                                j12 = j13;
                            }
                            j11 = j12 + 60000;
                        }
                        j0Var.f39022a = z11;
                        j0Var.f39023b = j11;
                    } else {
                        int i11 = Calendar.getInstance().get(11);
                        if (i11 < 6 || i11 >= 22) {
                            z11 = true;
                        }
                    }
                }
                return z11 ? 2 : 1;
        }
    }

    @Override // ae.d
    public final void l() {
        switch (this.f39071c) {
            case 0:
                this.f39072d.o(true, true);
                break;
            default:
                this.f39072d.o(true, true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(androidx.appcompat.app.b bVar, Context context) {
        super(bVar);
        this.f39072d = bVar;
        this.f39073e = (PowerManager) context.getApplicationContext().getSystemService("power");
    }
}
