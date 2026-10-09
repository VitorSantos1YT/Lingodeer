package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.Strings;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class zzahd extends AbstractSafeParcelable implements zzael<zzahd> {
    public static final Parcelable.Creator<zzahd> CREATOR = new zzahg();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f9958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f9959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Long f9960c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f9961d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Long f9962e;

    public zzahd() {
        this.f9962e = Long.valueOf(System.currentTimeMillis());
    }

    public static zzahd D1(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            zzahd zzahdVar = new zzahd();
            zzahdVar.f9958a = jSONObject.optString("refresh_token", null);
            zzahdVar.f9959b = jSONObject.optString("access_token", null);
            zzahdVar.f9960c = Long.valueOf(jSONObject.optLong("expires_in"));
            zzahdVar.f9961d = jSONObject.optString("token_type", null);
            zzahdVar.f9962e = Long.valueOf(jSONObject.optLong("issued_at"));
            return zzahdVar;
        } catch (JSONException e8) {
            throw new zzzx(e8);
        }
    }

    public final String E1() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("refresh_token", this.f9958a);
            jSONObject.put("access_token", this.f9959b);
            jSONObject.put("expires_in", this.f9960c);
            jSONObject.put("token_type", this.f9961d);
            jSONObject.put("issued_at", this.f9962e);
            return jSONObject.toString();
        } catch (JSONException e8) {
            throw new zzzx(e8);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.k(parcel, 2, this.f9958a, false);
        SafeParcelWriter.k(parcel, 3, this.f9959b, false);
        Long l9 = this.f9960c;
        SafeParcelWriter.i(parcel, 4, Long.valueOf(l9 == null ? 0L : l9.longValue()));
        SafeParcelWriter.k(parcel, 5, this.f9961d, false);
        Long l11 = this.f9962e;
        l11.getClass();
        SafeParcelWriter.i(parcel, 6, l11);
        SafeParcelWriter.r(parcel, iQ);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzael
    public final zzael zza(String str) throws zzabz {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f9958a = Strings.a(jSONObject.optString("refresh_token"));
            this.f9959b = Strings.a(jSONObject.optString("access_token"));
            this.f9960c = Long.valueOf(jSONObject.optLong("expires_in", 0L));
            this.f9961d = Strings.a(jSONObject.optString("token_type"));
            this.f9962e = Long.valueOf(System.currentTimeMillis());
            return this;
        } catch (NullPointerException | JSONException e8) {
            throw zzaiv.a(e8, "zzahd", str);
        }
    }

    public final boolean zzg() {
        long jLongValue = (this.f9960c.longValue() * 1000) + this.f9962e.longValue();
        DefaultClock.f9117a.getClass();
        return System.currentTimeMillis() + 300000 < jLongValue;
    }

    public zzahd(String str, String str2, Long l9, String str3) {
        this(str, str2, l9, str3, Long.valueOf(System.currentTimeMillis()));
    }

    public zzahd(String str, String str2, Long l9, String str3, Long l11) {
        this.f9958a = str;
        this.f9959b = str2;
        this.f9960c = l9;
        this.f9961d = str3;
        this.f9962e = l11;
    }
}
