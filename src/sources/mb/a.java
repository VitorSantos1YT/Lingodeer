package mb;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import fb.l;
import j9.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends r {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final lf.e f41105f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f41106g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, qb.a aVar, int i11) {
        super(context, aVar);
        this.f41106g = i11;
        this.f41105f = new lf.e(this, 4);
    }

    @Override // j9.r
    public final Object c() {
        int i11 = this.f41106g;
        Object obj = this.f36246b;
        boolean z11 = true;
        switch (i11) {
            case 0:
                Intent intentRegisterReceiver = ((Context) obj).registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (intentRegisterReceiver == null) {
                    l lVarB = l.b();
                    int i12 = b.f41107a;
                    lVarB.getClass();
                    return Boolean.FALSE;
                }
                int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
                if (intExtra != 2 && intExtra != 5) {
                    z11 = false;
                }
                return Boolean.valueOf(z11);
            case 1:
                Intent intentRegisterReceiver2 = ((Context) obj).registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (intentRegisterReceiver2 == null) {
                    l lVarB2 = l.b();
                    int i13 = c.f41108a;
                    lVarB2.getClass();
                    return Boolean.FALSE;
                }
                int intExtra2 = intentRegisterReceiver2.getIntExtra("status", -1);
                float intExtra3 = intentRegisterReceiver2.getIntExtra("level", -1) / intentRegisterReceiver2.getIntExtra("scale", -1);
                if (intExtra2 != 1 && intExtra3 <= 0.15f) {
                    z11 = false;
                }
                return Boolean.valueOf(z11);
            default:
                Intent intentRegisterReceiver3 = ((Context) obj).registerReceiver(null, g());
                if (intentRegisterReceiver3 != null && intentRegisterReceiver3.getAction() != null) {
                    String action = intentRegisterReceiver3.getAction();
                    if (action == null) {
                        z11 = false;
                    } else {
                        int iHashCode = action.hashCode();
                        if (iHashCode == -1181163412) {
                            action.equals("android.intent.action.DEVICE_STORAGE_LOW");
                        } else if (iHashCode != -730838620 || !action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                        }
                        z11 = false;
                    }
                }
                return Boolean.valueOf(z11);
        }
    }

    @Override // j9.r
    public final void e() {
        l lVarB = l.b();
        int i11 = d.f41109a;
        lVarB.getClass();
        ((Context) this.f36246b).registerReceiver(this.f41105f, g());
    }

    @Override // j9.r
    public final void f() {
        l lVarB = l.b();
        int i11 = d.f41109a;
        lVarB.getClass();
        ((Context) this.f36246b).unregisterReceiver(this.f41105f);
    }

    public final IntentFilter g() {
        switch (this.f41106g) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.CHARGING");
                intentFilter.addAction("android.os.action.DISCHARGING");
                return intentFilter;
            case 1:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.BATTERY_OKAY");
                intentFilter2.addAction("android.intent.action.BATTERY_LOW");
                return intentFilter2;
            default:
                IntentFilter intentFilter3 = new IntentFilter();
                intentFilter3.addAction("android.intent.action.DEVICE_STORAGE_OK");
                intentFilter3.addAction("android.intent.action.DEVICE_STORAGE_LOW");
                return intentFilter3;
        }
    }
}
