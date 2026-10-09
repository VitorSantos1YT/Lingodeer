package com.google.firebase.messaging;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class RemoteMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RemoteMessage> CREATOR = new RemoteMessageCreator();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f20504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public y.e f20505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Notification f20506c;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class Builder {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface MessagePriority {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class Notification {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f20507a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f20508b;

        public Notification(NotificationParams notificationParams) {
            this.f20507a = notificationParams.h("gcm.n.title");
            notificationParams.f("gcm.n.title");
            Object[] objArrE = notificationParams.e("gcm.n.title");
            if (objArrE != null) {
                String[] strArr = new String[objArrE.length];
                for (int i11 = 0; i11 < objArrE.length; i11++) {
                    strArr[i11] = String.valueOf(objArrE[i11]);
                }
            }
            this.f20508b = notificationParams.h("gcm.n.body");
            notificationParams.f("gcm.n.body");
            Object[] objArrE2 = notificationParams.e("gcm.n.body");
            if (objArrE2 != null) {
                String[] strArr2 = new String[objArrE2.length];
                for (int i12 = 0; i12 < objArrE2.length; i12++) {
                    strArr2[i12] = String.valueOf(objArrE2[i12]);
                }
            }
            notificationParams.h("gcm.n.icon");
            if (TextUtils.isEmpty(notificationParams.h("gcm.n.sound2"))) {
                notificationParams.h("gcm.n.sound");
            }
            notificationParams.h("gcm.n.tag");
            notificationParams.h("gcm.n.color");
            notificationParams.h("gcm.n.click_action");
            notificationParams.h("gcm.n.android_channel_id");
            String strH = notificationParams.h("gcm.n.link_android");
            strH = TextUtils.isEmpty(strH) ? notificationParams.h("gcm.n.link") : strH;
            if (!TextUtils.isEmpty(strH)) {
                Uri.parse(strH);
            }
            notificationParams.h("gcm.n.image");
            notificationParams.h("gcm.n.ticker");
            notificationParams.b("gcm.n.notification_priority");
            notificationParams.b("gcm.n.visibility");
            notificationParams.b("gcm.n.notification_count");
            notificationParams.a("gcm.n.sticky");
            notificationParams.a("gcm.n.local_only");
            notificationParams.a("gcm.n.default_sound");
            notificationParams.a("gcm.n.default_vibrate_timings");
            notificationParams.a("gcm.n.default_light_settings");
            String strH2 = notificationParams.h("gcm.n.event_time");
            if (!TextUtils.isEmpty(strH2)) {
                try {
                    Long.parseLong(strH2);
                } catch (NumberFormatException unused) {
                    NotificationParams.l("gcm.n.event_time");
                }
            }
            notificationParams.d();
            notificationParams.i();
        }
    }

    public RemoteMessage(Bundle bundle) {
        this.f20504a = bundle;
    }

    public final HashMap D1() {
        if (this.f20505b == null) {
            y.e eVar = new y.e(0);
            Bundle bundle = this.f20504a;
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                        eVar.put(str, str2);
                    }
                }
            }
            this.f20505b = eVar;
        }
        return new HashMap(this.f20505b);
    }

    public final Notification E1() {
        if (this.f20506c == null) {
            Bundle bundle = this.f20504a;
            if (NotificationParams.j(bundle)) {
                this.f20506c = new Notification(new NotificationParams(bundle));
            }
        }
        return this.f20506c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.b(parcel, 2, this.f20504a);
        SafeParcelWriter.r(parcel, iQ);
    }
}
