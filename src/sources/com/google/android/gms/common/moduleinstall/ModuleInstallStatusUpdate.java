package com.google.android.gms.common.moduleinstall;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class ModuleInstallStatusUpdate extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ModuleInstallStatusUpdate> CREATOR = new zad();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f9056c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Long f9057d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f9058e;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    @Retention(RetentionPolicy.CLASS)
    public @interface InstallState {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class ProgressInfo {
    }

    public ModuleInstallStatusUpdate(int i11, int i12, Long l9, Long l11, int i13) {
        this.f9054a = i11;
        this.f9055b = i12;
        this.f9056c = l9;
        this.f9057d = l11;
        this.f9058e = i13;
        if (l9 != null && l11 != null && l11.longValue() != 0 && l11.longValue() == 0) {
            throw new IllegalArgumentException("Given Long is zero");
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.p(parcel, 1, 4);
        parcel.writeInt(this.f9054a);
        SafeParcelWriter.p(parcel, 2, 4);
        parcel.writeInt(this.f9055b);
        SafeParcelWriter.i(parcel, 3, this.f9056c);
        SafeParcelWriter.i(parcel, 4, this.f9057d);
        SafeParcelWriter.p(parcel, 5, 4);
        parcel.writeInt(this.f9058e);
        SafeParcelWriter.r(parcel, iQ);
    }
}
