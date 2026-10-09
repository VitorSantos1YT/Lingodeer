package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import hh.p0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class ChannelIdValue extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ChannelIdValue> CREATOR = new zzb();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChannelIdValueType f9328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f9330c;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public enum ChannelIdValueType implements Parcelable {
        ABSENT(0),
        STRING(1),
        OBJECT(2);

        public static final Parcelable.Creator<ChannelIdValueType> CREATOR = new zza();
        private final int zzb;

        ChannelIdValueType(int i11) {
            this.zzb = i11;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i11) {
            parcel.writeInt(this.zzb);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class UnsupportedChannelIdValueTypeException extends Exception {
    }

    static {
        new ChannelIdValue();
        new ChannelIdValue("unavailable");
        new ChannelIdValue("unused");
    }

    private ChannelIdValue() {
        this.f9328a = ChannelIdValueType.ABSENT;
        this.f9330c = null;
        this.f9329b = null;
    }

    public static ChannelIdValueType D1(int i11) throws UnsupportedChannelIdValueTypeException {
        for (ChannelIdValueType channelIdValueType : ChannelIdValueType.values()) {
            if (i11 == channelIdValueType.zzb) {
                return channelIdValueType;
            }
        }
        throw new UnsupportedChannelIdValueTypeException(p0.h(i11, "ChannelIdValueType ", " not supported"));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChannelIdValue)) {
            return false;
        }
        ChannelIdValue channelIdValue = (ChannelIdValue) obj;
        ChannelIdValueType channelIdValueType = channelIdValue.f9328a;
        ChannelIdValueType channelIdValueType2 = this.f9328a;
        if (!channelIdValueType2.equals(channelIdValueType)) {
            return false;
        }
        int iOrdinal = channelIdValueType2.ordinal();
        if (iOrdinal == 0) {
            return true;
        }
        if (iOrdinal == 1) {
            return this.f9329b.equals(channelIdValue.f9329b);
        }
        if (iOrdinal != 2) {
            return false;
        }
        return this.f9330c.equals(channelIdValue.f9330c);
    }

    public final int hashCode() {
        int i11;
        int iHashCode;
        ChannelIdValueType channelIdValueType = this.f9328a;
        int iHashCode2 = channelIdValueType.hashCode() + 31;
        int iOrdinal = channelIdValueType.ordinal();
        if (iOrdinal == 1) {
            i11 = iHashCode2 * 31;
            iHashCode = this.f9329b.hashCode();
        } else {
            if (iOrdinal != 2) {
                return iHashCode2;
            }
            i11 = iHashCode2 * 31;
            iHashCode = this.f9330c.hashCode();
        }
        return iHashCode + i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        int i12 = this.f9328a.zzb;
        SafeParcelWriter.p(parcel, 2, 4);
        parcel.writeInt(i12);
        SafeParcelWriter.k(parcel, 3, this.f9329b, false);
        SafeParcelWriter.k(parcel, 4, this.f9330c, false);
        SafeParcelWriter.r(parcel, iQ);
    }

    public ChannelIdValue(int i11, String str, String str2) {
        try {
            this.f9328a = D1(i11);
            this.f9329b = str;
            this.f9330c = str2;
        } catch (UnsupportedChannelIdValueTypeException e8) {
            throw new IllegalArgumentException(e8);
        }
    }

    public ChannelIdValue(String str) {
        this.f9329b = str;
        this.f9328a = ChannelIdValueType.STRING;
        this.f9330c = null;
    }
}
