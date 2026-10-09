package com.google.android.gms.internal.play_billing;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.android.billingclient.api.ProxyBillingActivity;
import com.android.billingclient.api.x;
import com.android.billingclient.api.z;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzan extends zzaq implements zzao {
    public zzan() {
        super("com.android.vending.billing.IInAppBillingServiceCallback");
    }

    @Override // com.google.android.gms.internal.play_billing.zzaq
    public final boolean g(int i11, Parcel parcel, Parcel parcel2) {
        if (i11 != 1) {
            return false;
        }
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) zzar.a(parcel);
        zzar.b(parcel);
        z zVar = (z) this;
        x xVar = zVar.f7595b;
        if (xVar == null) {
            int i12 = zzc.f12272a;
        } else if (bundle == null) {
            xVar.send(0, null);
        } else {
            Activity activity = (Activity) zVar.f7594a.get();
            PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("KEY_LAUNCH_INTENT");
            if (activity == null || pendingIntent == null) {
                xVar.send(0, null);
                int i13 = zzc.f12272a;
            } else {
                try {
                    Intent intent = new Intent(activity, (Class<?>) ProxyBillingActivity.class);
                    intent.putExtra("in_app_message_result_receiver", xVar);
                    intent.putExtra("IN_APP_MESSAGE_INTENT", pendingIntent);
                    activity.startActivity(intent);
                } catch (CancellationException unused) {
                    xVar.send(0, null);
                    int i14 = zzc.f12272a;
                }
            }
        }
        parcel2.writeNoException();
        return true;
    }
}
