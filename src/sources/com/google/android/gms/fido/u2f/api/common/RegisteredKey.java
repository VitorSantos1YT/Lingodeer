package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class RegisteredKey extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RegisteredKey> CREATOR = new zzj();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KeyHandle f9351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f9353c;

    public RegisteredKey(KeyHandle keyHandle, String str, String str2) {
        Preconditions.g(keyHandle);
        this.f9351a = keyHandle;
        this.f9353c = str;
        this.f9352b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisteredKey)) {
            return false;
        }
        RegisteredKey registeredKey = (RegisteredKey) obj;
        String str = registeredKey.f9352b;
        String str2 = registeredKey.f9353c;
        String str3 = this.f9353c;
        if (str3 == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str3.equals(str2)) {
            return false;
        }
        if (!this.f9351a.equals(registeredKey.f9351a)) {
            return false;
        }
        String str4 = this.f9352b;
        if (str4 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str4.equals(str)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f9353c;
        int iHashCode = this.f9351a.hashCode() + (((str == null ? 0 : str.hashCode()) + 31) * 31);
        String str2 = this.f9352b;
        return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        KeyHandle keyHandle = this.f9351a;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("keyHandle", Base64.encodeToString(keyHandle.f9334b, 11));
            ProtocolVersion protocolVersion = keyHandle.f9335c;
            if (protocolVersion != ProtocolVersion.UNKNOWN) {
                jSONObject.put("version", protocolVersion.toString());
            }
            List list = keyHandle.f9336d;
            if (list != null) {
                jSONObject.put("transports", list.toString());
            }
            String str = this.f9353c;
            if (str != null) {
                jSONObject.put("challenge", str);
            }
            String str2 = this.f9352b;
            if (str2 != null) {
                jSONObject.put("appId", str2);
            }
            return jSONObject.toString();
        } catch (JSONException e8) {
            throw new RuntimeException(e8);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.j(parcel, 2, this.f9351a, i11, false);
        SafeParcelWriter.k(parcel, 3, this.f9353c, false);
        SafeParcelWriter.k(parcel, 4, this.f9352b, false);
        SafeParcelWriter.r(parcel, iQ);
    }
}
